/**
 */
package webtest.model.impl;

import org.eclipse.emf.ecore.EClass;

import webtest.model.ModelPackage;
import webtest.model.NotExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NotExpressionImpl extends UnaryExpressionImpl implements NotExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NOT_EXPRESSION;
	}

} //NotExpressionImpl
