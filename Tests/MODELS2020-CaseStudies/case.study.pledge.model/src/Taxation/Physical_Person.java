/**
 */
package Taxation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Physical_Person#isIs_assisting_spouse <em>Is assisting spouse</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getSSNo <em>SS No</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getBirth_year <em>Birth year</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getDisability_percentage <em>Disability percentage</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getDisability_type <em>Disability type</em>}</li>
 *   <li>{@link Taxation.Physical_Person#isIs_affiliated_personnaly_to_social_security <em>Is affiliated personnaly to social security</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getBirth_month <em>Birth month</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getBirth_day <em>Birth day</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getExpenses <em>Expenses</em>}</li>
 *   <li>{@link Taxation.Physical_Person#isIs_widower <em>Is widower</em>}</li>
 *   <li>{@link Taxation.Physical_Person#getOwns_Address <em>Owns Address</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getPhysical_Person()
 * @model
 * @generated
 */
public interface Physical_Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Is assisting spouse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is assisting spouse</em>' attribute.
	 * @see #setIs_assisting_spouse(boolean)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Is_assisting_spouse()
	 * @model required="true" derived="true"
	 * @generated
	 */
	boolean isIs_assisting_spouse();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#isIs_assisting_spouse <em>Is assisting spouse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is assisting spouse</em>' attribute.
	 * @see #isIs_assisting_spouse()
	 * @generated
	 */
	void setIs_assisting_spouse(boolean value);

	/**
	 * Returns the value of the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SS No</em>' attribute.
	 * @see #setSSNo(String)
	 * @see Taxation.TaxationPackage#getPhysical_Person_SSNo()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getSSNo();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#getSSNo <em>SS No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS No</em>' attribute.
	 * @see #getSSNo()
	 * @generated
	 */
	void setSSNo(String value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link Taxation.Address}.
	 * It is bidirectional and its opposite is '{@link Taxation.Address#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see Taxation.TaxationPackage#getPhysical_Person_Addresses()
	 * @see Taxation.Address#getTaxPayer
	 * @model opposite="taxPayer" ordered="false"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Birth year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth year</em>' attribute.
	 * @see #setBirth_year(int)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Birth_year()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getBirth_year();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#getBirth_year <em>Birth year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth year</em>' attribute.
	 * @see #getBirth_year()
	 * @generated
	 */
	void setBirth_year(int value);

	/**
	 * Returns the value of the '<em><b>Disability percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disability percentage</em>' attribute.
	 * @see #setDisability_percentage(double)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Disability_percentage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	double getDisability_percentage();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#getDisability_percentage <em>Disability percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disability percentage</em>' attribute.
	 * @see #getDisability_percentage()
	 * @generated
	 */
	void setDisability_percentage(double value);

	/**
	 * Returns the value of the '<em><b>Disability type</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Disability_Types}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disability type</em>' attribute.
	 * @see Taxation.Disability_Types
	 * @see #setDisability_type(Disability_Types)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Disability_type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Disability_Types getDisability_type();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#getDisability_type <em>Disability type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disability type</em>' attribute.
	 * @see Taxation.Disability_Types
	 * @see #getDisability_type()
	 * @generated
	 */
	void setDisability_type(Disability_Types value);

	/**
	 * Returns the value of the '<em><b>Is affiliated personnaly to social security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is affiliated personnaly to social security</em>' attribute.
	 * @see #setIs_affiliated_personnaly_to_social_security(boolean)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Is_affiliated_personnaly_to_social_security()
	 * @model required="true" derived="true"
	 * @generated
	 */
	boolean isIs_affiliated_personnaly_to_social_security();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#isIs_affiliated_personnaly_to_social_security <em>Is affiliated personnaly to social security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is affiliated personnaly to social security</em>' attribute.
	 * @see #isIs_affiliated_personnaly_to_social_security()
	 * @generated
	 */
	void setIs_affiliated_personnaly_to_social_security(boolean value);

	/**
	 * Returns the value of the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth month</em>' attribute.
	 * @see #setBirth_month(int)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Birth_month()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getBirth_month();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#getBirth_month <em>Birth month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth month</em>' attribute.
	 * @see #getBirth_month()
	 * @generated
	 */
	void setBirth_month(int value);

	/**
	 * Returns the value of the '<em><b>Birth day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth day</em>' attribute.
	 * @see #setBirth_day(int)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Birth_day()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getBirth_day();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#getBirth_day <em>Birth day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth day</em>' attribute.
	 * @see #getBirth_day()
	 * @generated
	 */
	void setBirth_day(int value);

	/**
	 * Returns the value of the '<em><b>Expenses</b></em>' reference list.
	 * The list contents are of type {@link Taxation.Expense}.
	 * It is bidirectional and its opposite is '{@link Taxation.Expense#getBeneficiary <em>Beneficiary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expenses</em>' reference list.
	 * @see Taxation.TaxationPackage#getPhysical_Person_Expenses()
	 * @see Taxation.Expense#getBeneficiary
	 * @model opposite="beneficiary" ordered="false"
	 * @generated
	 */
	EList<Expense> getExpenses();

	/**
	 * Returns the value of the '<em><b>Is widower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is widower</em>' attribute.
	 * @see #setIs_widower(boolean)
	 * @see Taxation.TaxationPackage#getPhysical_Person_Is_widower()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIs_widower();

	/**
	 * Sets the value of the '{@link Taxation.Physical_Person#isIs_widower <em>Is widower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is widower</em>' attribute.
	 * @see #isIs_widower()
	 * @generated
	 */
	void setIs_widower(boolean value);

	/**
	 * Returns the value of the '<em><b>Owns Address</b></em>' containment reference list.
	 * The list contents are of type {@link Taxation.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Address</em>' containment reference list.
	 * @see Taxation.TaxationPackage#getPhysical_Person_Owns_Address()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getOwns_Address();

} // Physical_Person
