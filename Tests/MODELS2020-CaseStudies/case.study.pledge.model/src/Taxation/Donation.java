/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Donation#getBeneficiary1 <em>Beneficiary1</em>}</li>
 *   <li>{@link Taxation.Donation#isIs_beneficiary_eligible <em>Is beneficiary eligible</em>}</li>
 *   <li>{@link Taxation.Donation#isIs_donation_reported <em>Is donation reported</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getDonation()
 * @model
 * @generated
 */
public interface Donation extends Special_Expense_DS {
	/**
	 * Returns the value of the '<em><b>Beneficiary1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beneficiary1</em>' attribute.
	 * @see #setBeneficiary1(String)
	 * @see Taxation.TaxationPackage#getDonation_Beneficiary1()
	 * @model required="true"
	 * @generated
	 */
	String getBeneficiary1();

	/**
	 * Sets the value of the '{@link Taxation.Donation#getBeneficiary1 <em>Beneficiary1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary1</em>' attribute.
	 * @see #getBeneficiary1()
	 * @generated
	 */
	void setBeneficiary1(String value);

	/**
	 * Returns the value of the '<em><b>Is beneficiary eligible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is beneficiary eligible</em>' attribute.
	 * @see #setIs_beneficiary_eligible(boolean)
	 * @see Taxation.TaxationPackage#getDonation_Is_beneficiary_eligible()
	 * @model default="false" required="true" derived="true"
	 * @generated
	 */
	boolean isIs_beneficiary_eligible();

	/**
	 * Sets the value of the '{@link Taxation.Donation#isIs_beneficiary_eligible <em>Is beneficiary eligible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is beneficiary eligible</em>' attribute.
	 * @see #isIs_beneficiary_eligible()
	 * @generated
	 */
	void setIs_beneficiary_eligible(boolean value);

	/**
	 * Returns the value of the '<em><b>Is donation reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is donation reported</em>' attribute.
	 * @see #setIs_donation_reported(boolean)
	 * @see Taxation.TaxationPackage#getDonation_Is_donation_reported()
	 * @model required="true"
	 * @generated
	 */
	boolean isIs_donation_reported();

	/**
	 * Sets the value of the '{@link Taxation.Donation#isIs_donation_reported <em>Is donation reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is donation reported</em>' attribute.
	 * @see #isIs_donation_reported()
	 * @generated
	 */
	void setIs_donation_reported(boolean value);

} // Donation
