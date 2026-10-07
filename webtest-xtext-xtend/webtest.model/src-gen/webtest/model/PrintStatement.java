/**
 */
package webtest.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webtest.model.PrintStatement#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see webtest.model.ModelPackage#getPrintStatement()
 * @model
 * @generated
 */
public interface PrintStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link webtest.model.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see webtest.model.ModelPackage#getPrintStatement_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getValues();

} // PrintStatement
