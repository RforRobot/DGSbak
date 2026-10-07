package webtest.dsl.validation;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.EValidatorRegistrar;

import webtest.model.CallStatement;
import webtest.model.ForEachStatement;
import webtest.model.Main;
import webtest.model.ModelPackage;
import webtest.model.NamedElement;
import webtest.model.Operation;
import webtest.model.Page;
import webtest.model.TestCase;
import webtest.model.TestCaseInstance;
import webtest.model.Variable;
import webtest.model.VariableStatement;

class NameValidator extends AbstractWebTestDslValidator {
	// This empty override is necessary to prevent reporting duplicate validation
	// messages
	@Override
	public void register(EValidatorRegistrar registrar) {
	}

	@Check(CheckType.NORMAL)
	public void checkDuplicateDeclarations(Main main) {
		try {
			var pageNames = new HashSet<String>();
			var testCaseNames = new HashSet<String>();
			var operationNames = new HashSet<String>();

			for (NamedElement ne : main.getDeclarations()) {
				if (ne.getName() == null)
					continue;

				if (ne instanceof Page) {
					if (!pageNames.add(ne.getName())) {
						error("Page '" + ne.getName() + "' is already defined.", ne,
								ModelPackage.Literals.NAMED_ELEMENT__NAME);
					}
				} else if (ne instanceof TestCase) {
					if (!testCaseNames.add(ne.getName())) {
						error("Test case '" + ne.getName() + "' is already defined.", ne,
								ModelPackage.Literals.NAMED_ELEMENT__NAME);
					}
				} else if (ne instanceof Operation) {
					if (!operationNames.add(ne.getName())) {
						error("Operation '" + ne.getName() + "' is already defined.", ne,
								ModelPackage.Literals.NAMED_ELEMENT__NAME);
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Check(CheckType.NORMAL)
	public void checkDuplicateOperationsInPage(Page page) {
		try {
			var operationNames = new HashSet<String>();

			for (Operation op : page.getOperations()) {
				if (op.getName() != null && !operationNames.add(op.getName())) {
					error("Operation '" + op.getName() + "' is already defined.", op,
							ModelPackage.Literals.NAMED_ELEMENT__NAME);
				}
			}

			var variableNames = new HashSet<String>();

			for (Variable var : page.getVariables()) {
				if (var.getName() != null && !variableNames.add(var.getName())) {
					error("Variable '" + var.getName() + "' is already defined.", var,
							ModelPackage.Literals.NAMED_ELEMENT__NAME);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Check(CheckType.NORMAL)
	public void checkDuplicateNamesInOperation(Operation op) {
		try {
			// params
			var paramNames = new HashSet<String>();

			for (var param : op.getParameters()) {
				if (param.getName() != null && !paramNames.add(param.getName())) {
					error("Parameter '" + param.getName() + "' is already defined.", param,
							ModelPackage.Literals.NAMED_ELEMENT__NAME);
				}
			}

			// vars (benne a param nevekkel, mert az is ütközés)
			var varNames = new HashSet<String>(paramNames);

			if (op.getBody() != null) {
				for (var statement : op.getBody().getStatements()) {
					if (statement instanceof VariableStatement varStmt) {
						var variable = varStmt.getVariable();
						if (variable != null && variable.getName() != null && !varNames.add(variable.getName())) {
							error("Variable '" + variable.getName() + "' is already defined.", variable,
									ModelPackage.Literals.NAMED_ELEMENT__NAME);
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Check(CheckType.NORMAL)
	public void checkOperationCallArguments(CallStatement call) {
		var op = call.getOperation();

		if (op != null && !op.eIsProxy()) {
            int paramCount = op.getParameters().size();
            int argCount = call.getArguments().size();
            if (paramCount != argCount) {
                error("Operation '" + op.getName() + "' has " + paramCount
                        + " parameters but " + argCount + " arguments were specified.",
                        call, ModelPackage.Literals.CALL_STATEMENT__OPERATION);
            }
        }
	}
	
	
	
	// TOCHECK local var stuff
	@Check(CheckType.NORMAL)
    public void checkDuplicateVariableStatement(VariableStatement varStmt) {
        Variable variable = varStmt.getVariable();
        if (variable == null || variable.getName() == null) {
            return;
        }

        String varName = variable.getName();

        // 1. Collides with an outer/enclosing scope declaration
        for (EObject curr = varStmt.eContainer(); curr != null; curr = curr.eContainer()) {
            // Check hiding operation parameters
            if (curr instanceof Operation op) {
                for (var param : op.getParameters()) {
                    if (varName.equals(param.getName())) {
                        error("Variable '" + varName + "' is already defined.",
                                variable, ModelPackage.Literals.NAMED_ELEMENT__NAME);
                        return;
                    }
                }
                break;
            }

            // Check hiding test case parameters
            if (curr instanceof TestCase tc) {
                for (var param : tc.getParameters()) {
                    if (varName.equals(param.getName())) {
                        error("Variable '" + varName + "' is already defined.",
                                variable, ModelPackage.Literals.NAMED_ELEMENT__NAME);
                        return;
                    }
                }
                break;
            }

            // Check hiding enclosing foreach iterator variable
            if (curr instanceof ForEachStatement fe) {
                if (fe.getItem() != null && varName.equals(fe.getItem().getName())) {
                    error("Variable '" + varName + "' is already defined.",
                            variable, ModelPackage.Literals.NAMED_ELEMENT__NAME);
                    return;
                }
            }

            // Check previous local variables in an enclosing BlockStatement
            if (curr instanceof webtest.model.BlockStatement block) {
                for (var s : block.getStatements()) {
                    if (s == varStmt) {
                        break;
                    }
                    if (s instanceof VariableStatement prevVarStmt) {
                        Variable prevVar = prevVarStmt.getVariable();
                        if (prevVar != null && varName.equals(prevVar.getName())) {
                            error("Variable '" + varName + "' is already defined.",
                                    variable, ModelPackage.Literals.NAMED_ELEMENT__NAME);
                            return;
                        }
                    }
                }
            }
        }
    }
	
	
	
	
	
	
	//TestParams
	@Check(CheckType.NORMAL)
    public void checkTestCaseParameters(TestCase testCase) {
		var names = new HashSet<String>();
        for (var param : testCase.getParameters()) {
            if (param.getName() != null && !names.add(param.getName())) {
                error("Parameter '" + param.getName() + "' is already defined.",
                        param, ModelPackage.Literals.NAMED_ELEMENT__NAME);
            }
        }
    }
	
	@Check(CheckType.NORMAL)
    public void checkTestCaseInstanceArguments(TestCaseInstance instance) {
        if (instance.eContainer() instanceof TestCase testCase) {
            int paramCount = testCase.getParameters().size();
            int argCount = instance.getArguments().size();
            if (paramCount != argCount) {
                error("Test case '" + testCase.getName() + "' has " + paramCount
                        + " parameters but " + argCount + " arguments were specified.",
                        instance, ModelPackage.Literals.TEST_CASE_INSTANCE__ARGUMENTS);
            }
        }
    }
	
	// ForEach // TODO
	@Check(CheckType.NORMAL)
	public void checkDuplicateNamesInForEach(ForEachStatement forE) {
		try {

			var varNames = new HashSet<String>();
			var iterator = forE.getItem().getName();
			varNames.add(iterator);

			if (forE.getBody() != null) {
				for (var statement : forE.getBody().getStatements()) {
					if (statement instanceof VariableStatement varStmt) {
						var variable = varStmt.getVariable();
						if (variable != null && variable.getName() != null && !varNames.add(variable.getName())) {
							error("Variable '" + variable.getName() + "' is already defined.", variable,
									ModelPackage.Literals.NAMED_ELEMENT__NAME);
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}