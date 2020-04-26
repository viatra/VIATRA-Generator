/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permanent Expense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Permanent_Expense#getCategory <em>Category</em>}</li>
 *   <li>{@link Taxation.Permanent_Expense#isIs_eligible_for_deduction <em>Is eligible for deduction</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getPermanent_Expense()
 * @model
 * @generated
 */
public interface Permanent_Expense extends Special_Expense_DS {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Category_of_Permanent_Expense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Permanent_Expense
	 * @see #setCategory(Category_of_Permanent_Expense)
	 * @see Taxation.TaxationPackage#getPermanent_Expense_Category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Permanent_Expense getCategory();

	/**
	 * Sets the value of the '{@link Taxation.Permanent_Expense#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Permanent_Expense
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category_of_Permanent_Expense value);

	/**
	 * Returns the value of the '<em><b>Is eligible for deduction</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is eligible for deduction</em>' attribute.
	 * @see #setIs_eligible_for_deduction(boolean)
	 * @see Taxation.TaxationPackage#getPermanent_Expense_Is_eligible_for_deduction()
	 * @model default="false" required="true" derived="true"
	 * @generated
	 */
	boolean isIs_eligible_for_deduction();

	/**
	 * Sets the value of the '{@link Taxation.Permanent_Expense#isIs_eligible_for_deduction <em>Is eligible for deduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is eligible for deduction</em>' attribute.
	 * @see #isIs_eligible_for_deduction()
	 * @generated
	 */
	void setIs_eligible_for_deduction(boolean value);

} // Permanent_Expense
