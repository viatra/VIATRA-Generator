/**
 */
package TaxationWithRoot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Address#getCountry <em>Country</em>}</li>
 *   <li>{@link TaxationWithRoot.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link TaxationWithRoot.Address#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link TaxationWithRoot.Address#getCity <em>City</em>}</li>
 *   <li>{@link TaxationWithRoot.Address#getId2 <em>Id2</em>}</li>
 *   <li>{@link TaxationWithRoot.Address#getTaxPayer <em>Tax Payer</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends Root {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * The default value is <code>"ZZ"</code>.
	 * The literals are from the enumeration {@link TaxationWithRoot.Country}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see TaxationWithRoot.Country
	 * @see #setCountry(Country)
	 * @see TaxationWithRoot.TaxationPackage#getAddress_Country()
	 * @model default="ZZ" required="true"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Address#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see TaxationWithRoot.Country
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see TaxationWithRoot.TaxationPackage#getAddress_Street()
	 * @model required="true"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Address#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Code</em>' attribute.
	 * @see #setZipCode(String)
	 * @see TaxationWithRoot.TaxationPackage#getAddress_ZipCode()
	 * @model required="true"
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Address#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see TaxationWithRoot.TaxationPackage#getAddress_City()
	 * @model required="true"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Id2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id2</em>' attribute.
	 * @see #setId2(String)
	 * @see TaxationWithRoot.TaxationPackage#getAddress_Id2()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId2();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Address#getId2 <em>Id2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id2</em>' attribute.
	 * @see #getId2()
	 * @generated
	 */
	void setId2(String value);

	/**
	 * Returns the value of the '<em><b>Tax Payer</b></em>' reference list.
	 * The list contents are of type {@link TaxationWithRoot.Physical_Person}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Physical_Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payer</em>' reference list.
	 * @see TaxationWithRoot.TaxationPackage#getAddress_TaxPayer()
	 * @see TaxationWithRoot.Physical_Person#getAddresses
	 * @model opposite="addresses" ordered="false"
	 * @generated
	 */
	EList<Physical_Person> getTaxPayer();

} // Address
