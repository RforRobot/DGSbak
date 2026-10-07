/**
 */
package webtest.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webtest.model.ForEachStatement#getBody <em>Body</em>}</li>
 *   <li>{@link webtest.model.ForEachStatement#getItems <em>Items</em>}</li>
 *   <li>{@link webtest.model.ForEachStatement#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see webtest.model.ModelPackage#getForEachStatement()
 * @model
 * @generated
 */
public interface ForEachStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BlockStatement)
	 * @see webtest.model.ModelPackage#getForEachStatement_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BlockStatement getBody();

	/**
	 * Sets the value of the '{@link webtest.model.ForEachStatement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BlockStatement value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Expression)
	 * @see webtest.model.ModelPackage#getForEachStatement_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getItems();

	/**
	 * Sets the value of the '{@link webtest.model.ForEachStatement#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Expression value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Variable)
	 * @see webtest.model.ModelPackage#getForEachStatement_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getItem();

	/**
	 * Sets the value of the '{@link webtest.model.ForEachStatement#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Variable value);

} // ForEachStatement
