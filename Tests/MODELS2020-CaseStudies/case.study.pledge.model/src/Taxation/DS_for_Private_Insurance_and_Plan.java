/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS for Private Insurance and Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.DS_for_Private_Insurance_and_Plan#getPrivate_insurance_and_plan_category <em>Private insurance and plan category</em>}</li>
 *   <li>{@link Taxation.DS_for_Private_Insurance_and_Plan#getIncrease_for_life_insurance <em>Increase for life insurance</em>}</li>
 *   <li>{@link Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_private_insurance <em>Maximum deductible amount for private insurance</em>}</li>
 *   <li>{@link Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_old_age_pension_plan <em>Maximum deductible amount for old age pension plan</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getDS_for_Private_Insurance_and_Plan()
 * @model
 * @generated
 */
public interface DS_for_Private_Insurance_and_Plan extends DS {
	/**
	 * Returns the value of the '<em><b>Private insurance and plan category</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Category_of_Private_Insurance_and_Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private insurance and plan category</em>' attribute.
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @see #setPrivate_insurance_and_plan_category(Category_of_Private_Insurance_and_Plan)
	 * @see Taxation.TaxationPackage#getDS_for_Private_Insurance_and_Plan_Private_insurance_and_plan_category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Private_Insurance_and_Plan getPrivate_insurance_and_plan_category();

	/**
	 * Sets the value of the '{@link Taxation.DS_for_Private_Insurance_and_Plan#getPrivate_insurance_and_plan_category <em>Private insurance and plan category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private insurance and plan category</em>' attribute.
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @see #getPrivate_insurance_and_plan_category()
	 * @generated
	 */
	void setPrivate_insurance_and_plan_category(Category_of_Private_Insurance_and_Plan value);

	/**
	 * Returns the value of the '<em><b>Increase for life insurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increase for life insurance</em>' attribute.
	 * @see #setIncrease_for_life_insurance(double)
	 * @see Taxation.TaxationPackage#getDS_for_Private_Insurance_and_Plan_Increase_for_life_insurance()
	 * @model required="true" derived="true"
	 * @generated
	 */
	double getIncrease_for_life_insurance();

	/**
	 * Sets the value of the '{@link Taxation.DS_for_Private_Insurance_and_Plan#getIncrease_for_life_insurance <em>Increase for life insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increase for life insurance</em>' attribute.
	 * @see #getIncrease_for_life_insurance()
	 * @generated
	 */
	void setIncrease_for_life_insurance(double value);

	/**
	 * Returns the value of the '<em><b>Maximum deductible amount for private insurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum deductible amount for private insurance</em>' attribute.
	 * @see #setMaximum_deductible_amount_for_private_insurance(double)
	 * @see Taxation.TaxationPackage#getDS_for_Private_Insurance_and_Plan_Maximum_deductible_amount_for_private_insurance()
	 * @model required="true" derived="true"
	 * @generated
	 */
	double getMaximum_deductible_amount_for_private_insurance();

	/**
	 * Sets the value of the '{@link Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_private_insurance <em>Maximum deductible amount for private insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum deductible amount for private insurance</em>' attribute.
	 * @see #getMaximum_deductible_amount_for_private_insurance()
	 * @generated
	 */
	void setMaximum_deductible_amount_for_private_insurance(double value);

	/**
	 * Returns the value of the '<em><b>Maximum deductible amount for old age pension plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum deductible amount for old age pension plan</em>' attribute.
	 * @see #setMaximum_deductible_amount_for_old_age_pension_plan(double)
	 * @see Taxation.TaxationPackage#getDS_for_Private_Insurance_and_Plan_Maximum_deductible_amount_for_old_age_pension_plan()
	 * @model required="true" derived="true"
	 * @generated
	 */
	double getMaximum_deductible_amount_for_old_age_pension_plan();

	/**
	 * Sets the value of the '{@link Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_old_age_pension_plan <em>Maximum deductible amount for old age pension plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum deductible amount for old age pension plan</em>' attribute.
	 * @see #getMaximum_deductible_amount_for_old_age_pension_plan()
	 * @generated
	 */
	void setMaximum_deductible_amount_for_old_age_pension_plan(double value);

} // DS_for_Private_Insurance_and_Plan
