/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pensions and Annuities Income</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Pensions_and_Annuities_Income#isOccasional_payement <em>Occasional payement</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getPensions_and_Annuities_Income()
 * @model
 * @generated
 */
public interface Pensions_and_Annuities_Income extends Income_Type {
	/**
	 * Returns the value of the '<em><b>Occasional payement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occasional payement</em>' attribute.
	 * @see #setOccasional_payement(boolean)
	 * @see Taxation.TaxationPackage#getPensions_and_Annuities_Income_Occasional_payement()
	 * @model default="false"
	 * @generated
	 */
	boolean isOccasional_payement();

	/**
	 * Sets the value of the '{@link Taxation.Pensions_and_Annuities_Income#isOccasional_payement <em>Occasional payement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occasional payement</em>' attribute.
	 * @see #isOccasional_payement()
	 * @generated
	 */
	void setOccasional_payement(boolean value);

} // Pensions_and_Annuities_Income
