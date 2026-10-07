/**
 */
package webtest.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webtest.model.VariableStatement#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see webtest.model.ModelPackage#getVariableStatement()
 * @model
 * @generated
 */
public interface VariableStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see webtest.model.ModelPackage#getVariableStatement_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link webtest.model.VariableStatement#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VariableStatement
