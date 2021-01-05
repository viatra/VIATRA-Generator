/**
 */
package TaxationWithRoot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rentals and Leases Income</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Rentals_and_Leases_Income#isIs_periodic <em>Is periodic</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getRentals_and_Leases_Income()
 * @model
 * @generated
 */
public interface Rentals_and_Leases_Income extends Income_Type {
	/**
	 * Returns the value of the '<em><b>Is periodic</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is periodic</em>' attribute.
	 * @see #setIs_periodic(boolean)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getRentals_and_Leases_Income_Is_periodic()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIs_periodic();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Rentals_and_Leases_Income#isIs_periodic <em>Is periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is periodic</em>' attribute.
	 * @see #isIs_periodic()
	 * @generated
	 */
	void setIs_periodic(boolean value);

} // Rentals_and_Leases_Income
