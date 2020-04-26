/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss Carryforward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Loss_Carryforward#isRegular_accountability <em>Regular accountability</em>}</li>
 *   <li>{@link Taxation.Loss_Carryforward#isCompensation_by_other_means <em>Compensation by other means</em>}</li>
 *   <li>{@link Taxation.Loss_Carryforward#isTax_payer_has_inherited_business_ownership <em>Tax payer has inherited business ownership</em>}</li>
 *   <li>{@link Taxation.Loss_Carryforward#isTax_payer_has_been_partner_in_business <em>Tax payer has been partner in business</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getLoss_Carryforward()
 * @model
 * @generated
 */
public interface Loss_Carryforward extends Special_Expense_DS {
	/**
	 * Returns the value of the '<em><b>Regular accountability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular accountability</em>' attribute.
	 * @see #setRegular_accountability(boolean)
	 * @see Taxation.TaxationPackage#getLoss_Carryforward_Regular_accountability()
	 * @model required="true" derived="true"
	 * @generated
	 */
	boolean isRegular_accountability();

	/**
	 * Sets the value of the '{@link Taxation.Loss_Carryforward#isRegular_accountability <em>Regular accountability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular accountability</em>' attribute.
	 * @see #isRegular_accountability()
	 * @generated
	 */
	void setRegular_accountability(boolean value);

	/**
	 * Returns the value of the '<em><b>Compensation by other means</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation by other means</em>' attribute.
	 * @see #setCompensation_by_other_means(boolean)
	 * @see Taxation.TaxationPackage#getLoss_Carryforward_Compensation_by_other_means()
	 * @model required="true" derived="true"
	 * @generated
	 */
	boolean isCompensation_by_other_means();

	/**
	 * Sets the value of the '{@link Taxation.Loss_Carryforward#isCompensation_by_other_means <em>Compensation by other means</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation by other means</em>' attribute.
	 * @see #isCompensation_by_other_means()
	 * @generated
	 */
	void setCompensation_by_other_means(boolean value);

	/**
	 * Returns the value of the '<em><b>Tax payer has inherited business ownership</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax payer has inherited business ownership</em>' attribute.
	 * @see #setTax_payer_has_inherited_business_ownership(boolean)
	 * @see Taxation.TaxationPackage#getLoss_Carryforward_Tax_payer_has_inherited_business_ownership()
	 * @model default="false" required="true" derived="true"
	 * @generated
	 */
	boolean isTax_payer_has_inherited_business_ownership();

	/**
	 * Sets the value of the '{@link Taxation.Loss_Carryforward#isTax_payer_has_inherited_business_ownership <em>Tax payer has inherited business ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax payer has inherited business ownership</em>' attribute.
	 * @see #isTax_payer_has_inherited_business_ownership()
	 * @generated
	 */
	void setTax_payer_has_inherited_business_ownership(boolean value);

	/**
	 * Returns the value of the '<em><b>Tax payer has been partner in business</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax payer has been partner in business</em>' attribute.
	 * @see #setTax_payer_has_been_partner_in_business(boolean)
	 * @see Taxation.TaxationPackage#getLoss_Carryforward_Tax_payer_has_been_partner_in_business()
	 * @model default="true" required="true" derived="true"
	 * @generated
	 */
	boolean isTax_payer_has_been_partner_in_business();

	/**
	 * Sets the value of the '{@link Taxation.Loss_Carryforward#isTax_payer_has_been_partner_in_business <em>Tax payer has been partner in business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax payer has been partner in business</em>' attribute.
	 * @see #isTax_payer_has_been_partner_in_business()
	 * @generated
	 */
	void setTax_payer_has_been_partner_in_business(boolean value);

} // Loss_Carryforward
