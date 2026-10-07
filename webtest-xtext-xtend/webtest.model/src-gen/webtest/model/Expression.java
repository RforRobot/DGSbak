/**
 */
package webtest.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webtest.model.Expression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see webtest.model.ModelPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link webtest.model.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see webtest.model.Type
	 * @see #setType(Type)
	 * @see webtest.model.ModelPackage#getExpression_Type()
	 * @model unique="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link webtest.model.Expression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see webtest.model.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Expression
