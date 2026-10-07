/**
 */
package webtest.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webtest.model.WaitStatement#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link webtest.model.WaitStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see webtest.model.ModelPackage#getWaitStatement()
 * @model
 * @generated
 */
public interface WaitStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see webtest.model.ModelPackage#getWaitStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link webtest.model.WaitStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' containment reference.
	 * @see #setSeconds(Expression)
	 * @see webtest.model.ModelPackage#getWaitStatement_Seconds()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSeconds();

	/**
	 * Sets the value of the '{@link webtest.model.WaitStatement#getSeconds <em>Seconds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' containment reference.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(Expression value);

} // WaitStatement
