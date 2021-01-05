/**
 */
package TaxationWithRoot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Resident Tax Payer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Non_Resident_Tax_Payer#isIs_assimilated_to_resident <em>Is assimilated to resident</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getNon_Resident_Tax_Payer()
 * @model
 * @generated
 */
public interface Non_Resident_Tax_Payer extends Tax_Payer {
	/**
	 * Returns the value of the '<em><b>Is assimilated to resident</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is assimilated to resident</em>' attribute.
	 * @see #setIs_assimilated_to_resident(boolean)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getNon_Resident_Tax_Payer_Is_assimilated_to_resident()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIs_assimilated_to_resident();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Non_Resident_Tax_Payer#isIs_assimilated_to_resident <em>Is assimilated to resident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is assimilated to resident</em>' attribute.
	 * @see #isIs_assimilated_to_resident()
	 * @generated
	 */
	void setIs_assimilated_to_resident(boolean value);

} // Non_Resident_Tax_Payer
