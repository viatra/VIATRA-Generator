/**
 */
package TaxationWithRoot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Donation#getBeneficiary1 <em>Beneficiary1</em>}</li>
 *   <li>{@link TaxationWithRoot.Donation#isIs_donation_reported <em>Is donation reported</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getDonation()
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
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDonation_Beneficiary1()
	 * @model required="true"
	 * @generated
	 */
	String getBeneficiary1();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Donation#getBeneficiary1 <em>Beneficiary1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary1</em>' attribute.
	 * @see #getBeneficiary1()
	 * @generated
	 */
	void setBeneficiary1(String value);

	/**
	 * Returns the value of the '<em><b>Is donation reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is donation reported</em>' attribute.
	 * @see #setIs_donation_reported(boolean)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDonation_Is_donation_reported()
	 * @model required="true"
	 * @generated
	 */
	boolean isIs_donation_reported();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Donation#isIs_donation_reported <em>Is donation reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is donation reported</em>' attribute.
	 * @see #isIs_donation_reported()
	 * @generated
	 */
	void setIs_donation_reported(boolean value);

} // Donation
