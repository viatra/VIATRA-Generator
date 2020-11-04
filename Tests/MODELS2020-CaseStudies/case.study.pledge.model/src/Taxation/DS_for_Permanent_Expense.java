/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS for Permanent Expense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.DS_for_Permanent_Expense#getPermanent_expense_category <em>Permanent expense category</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getDS_for_Permanent_Expense()
 * @model
 * @generated
 */
public interface DS_for_Permanent_Expense extends DS {
	/**
	 * Returns the value of the '<em><b>Permanent expense category</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Category_of_Permanent_Expense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permanent expense category</em>' attribute.
	 * @see Taxation.Category_of_Permanent_Expense
	 * @see #setPermanent_expense_category(Category_of_Permanent_Expense)
	 * @see Taxation.TaxationPackage#getDS_for_Permanent_Expense_Permanent_expense_category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Permanent_Expense getPermanent_expense_category();

	/**
	 * Sets the value of the '{@link Taxation.DS_for_Permanent_Expense#getPermanent_expense_category <em>Permanent expense category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permanent expense category</em>' attribute.
	 * @see Taxation.Category_of_Permanent_Expense
	 * @see #getPermanent_expense_category()
	 * @generated
	 */
	void setPermanent_expense_category(Category_of_Permanent_Expense value);

} // DS_for_Permanent_Expense
