/**
 */
package webtest.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webtest.model.ElementStatement#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see webtest.model.ModelPackage#getElementStatement()
 * @model abstract="true"
 * @generated
 */
public interface ElementStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Expression)
	 * @see webtest.model.ModelPackage#getElementStatement_Element()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElement();

	/**
	 * Sets the value of the '{@link webtest.model.ElementStatement#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Expression value);

} // ElementStatement
