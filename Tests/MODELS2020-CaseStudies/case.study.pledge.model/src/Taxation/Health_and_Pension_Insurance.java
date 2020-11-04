/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health and Pension Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Health_and_Pension_Insurance#getCategory <em>Category</em>}</li>
 *   <li>{@link Taxation.Health_and_Pension_Insurance#isIs_related_to_additional_salary <em>Is related to additional salary</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getHealth_and_Pension_Insurance()
 * @model
 * @generated
 */
public interface Health_and_Pension_Insurance extends Special_Expense_DS {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Category_of_Health_and_Pension_Insurances}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Health_and_Pension_Insurances
	 * @see #setCategory(Category_of_Health_and_Pension_Insurances)
	 * @see Taxation.TaxationPackage#getHealth_and_Pension_Insurance_Category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Health_and_Pension_Insurances getCategory();

	/**
	 * Sets the value of the '{@link Taxation.Health_and_Pension_Insurance#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Health_and_Pension_Insurances
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category_of_Health_and_Pension_Insurances value);

	/**
	 * Returns the value of the '<em><b>Is related to additional salary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is related to additional salary</em>' attribute.
	 * @see #setIs_related_to_additional_salary(boolean)
	 * @see Taxation.TaxationPackage#getHealth_and_Pension_Insurance_Is_related_to_additional_salary()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIs_related_to_additional_salary();

	/**
	 * Sets the value of the '{@link Taxation.Health_and_Pension_Insurance#isIs_related_to_additional_salary <em>Is related to additional salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is related to additional salary</em>' attribute.
	 * @see #isIs_related_to_additional_salary()
	 * @generated
	 */
	void setIs_related_to_additional_salary(boolean value);

} // Health_and_Pension_Insurance
