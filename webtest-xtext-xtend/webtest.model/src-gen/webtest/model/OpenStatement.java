/**
 */
package webtest.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webtest.model.OpenStatement#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see webtest.model.ModelPackage#getOpenStatement()
 * @model
 * @generated
 */
public interface OpenStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Expression)
	 * @see webtest.model.ModelPackage#getOpenStatement_Url()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getUrl();

	/**
	 * Sets the value of the '{@link webtest.model.OpenStatement#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Expression value);

} // OpenStatement
