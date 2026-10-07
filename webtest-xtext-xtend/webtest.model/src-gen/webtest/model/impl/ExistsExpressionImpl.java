/**
 */
package webtest.model.impl;

import org.eclipse.emf.ecore.EClass;

import webtest.model.ExistsExpression;
import webtest.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exists Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExistsExpressionImpl extends UnaryExpressionImpl implements ExistsExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistsExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXISTS_EXPRESSION;
	}

} //ExistsExpressionImpl
