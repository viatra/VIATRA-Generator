/**
 */
package Taxation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Insurance and Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Private_Insurance_and_Plan#getCategory <em>Category</em>}</li>
 *   <li>{@link Taxation.Private_Insurance_and_Plan#getDuration_of_contract <em>Duration of contract</em>}</li>
 *   <li>{@link Taxation.Private_Insurance_and_Plan#isIs_private_insurance_and_plan_eligible_for_deduction <em>Is private insurance and plan eligible for deduction</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getPrivate_Insurance_and_Plan()
 * @model
 * @generated
 */
public interface Private_Insurance_and_Plan extends Special_Expense_DS {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Category_of_Private_Insurance_and_Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @see #setCategory(Category_of_Private_Insurance_and_Plan)
	 * @see Taxation.TaxationPackage#getPrivate_Insurance_and_Plan_Category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Private_Insurance_and_Plan getCategory();

	/**
	 * Sets the value of the '{@link Taxation.Private_Insurance_and_Plan#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category_of_Private_Insurance_and_Plan value);

	/**
	 * Returns the value of the '<em><b>Duration of contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration of contract</em>' attribute.
	 * @see #setDuration_of_contract(int)
	 * @see Taxation.TaxationPackage#getPrivate_Insurance_and_Plan_Duration_of_contract()
	 * @model required="true"
	 * @generated
	 */
	int getDuration_of_contract();

	/**
	 * Sets the value of the '{@link Taxation.Private_Insurance_and_Plan#getDuration_of_contract <em>Duration of contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration of contract</em>' attribute.
	 * @see #getDuration_of_contract()
	 * @generated
	 */
	void setDuration_of_contract(int value);

	/**
	 * Returns the value of the '<em><b>Is private insurance and plan eligible for deduction</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is private insurance and plan eligible for deduction</em>' attribute.
	 * @see #setIs_private_insurance_and_plan_eligible_for_deduction(boolean)
	 * @see Taxation.TaxationPackage#getPrivate_Insurance_and_Plan_Is_private_insurance_and_plan_eligible_for_deduction()
	 * @model default="false" required="true" derived="true"
	 * @generated
	 */
	boolean isIs_private_insurance_and_plan_eligible_for_deduction();

	/**
	 * Sets the value of the '{@link Taxation.Private_Insurance_and_Plan#isIs_private_insurance_and_plan_eligible_for_deduction <em>Is private insurance and plan eligible for deduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is private insurance and plan eligible for deduction</em>' attribute.
	 * @see #isIs_private_insurance_and_plan_eligible_for_deduction()
	 * @generated
	 */
	void setIs_private_insurance_and_plan_eligible_for_deduction(boolean value);

} // Private_Insurance_and_Plan
