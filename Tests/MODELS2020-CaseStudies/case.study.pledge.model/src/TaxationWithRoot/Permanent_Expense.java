/**
 */
package TaxationWithRoot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permanent Expense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Permanent_Expense#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getPermanent_Expense()
 * @model
 * @generated
 */
public interface Permanent_Expense extends Special_Expense_DS {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Category_of_Permanent_Expense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see TaxationWithRoot.Category_of_Permanent_Expense
	 * @see #setCategory(Category_of_Permanent_Expense)
	 * @see TaxationWithRoot.TaxationPackage#getPermanent_Expense_Category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Permanent_Expense getCategory();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Permanent_Expense#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see TaxationWithRoot.Category_of_Permanent_Expense
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category_of_Permanent_Expense value);

} // Permanent_Expense
