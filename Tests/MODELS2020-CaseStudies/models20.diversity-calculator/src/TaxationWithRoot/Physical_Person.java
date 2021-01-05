/**
 */
package TaxationWithRoot;

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
 *   <li>{@link TaxationWithRoot.Physical_Person#getSSNo <em>SS No</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#getBirth_year <em>Birth year</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#getDisability_percentage <em>Disability percentage</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#getDisability_type <em>Disability type</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#getBirth_month <em>Birth month</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#getBirth_day <em>Birth day</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#getExpenses <em>Expenses</em>}</li>
 *   <li>{@link TaxationWithRoot.Physical_Person#isIs_widower <em>Is widower</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person()
 * @model
 * @generated
 */
public interface Physical_Person extends EObject {
	/**
	 * Returns the value of the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SS No</em>' attribute.
	 * @see #setSSNo(String)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_SSNo()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getSSNo();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Physical_Person#getSSNo <em>SS No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SS No</em>' attribute.
	 * @see #getSSNo()
	 * @generated
	 */
	void setSSNo(String value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link TaxationWithRoot.Address}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Address#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Addresses()
	 * @see TaxationWithRoot.Address#getTaxPayer
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
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Birth_year()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getBirth_year();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Physical_Person#getBirth_year <em>Birth year</em>}' attribute.
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
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Disability_percentage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	double getDisability_percentage();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Physical_Person#getDisability_percentage <em>Disability percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disability percentage</em>' attribute.
	 * @see #getDisability_percentage()
	 * @generated
	 */
	void setDisability_percentage(double value);

	/**
	 * Returns the value of the '<em><b>Disability type</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Disability_Types}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disability type</em>' attribute.
	 * @see TaxationWithRoot.Disability_Types
	 * @see #setDisability_type(Disability_Types)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Disability_type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Disability_Types getDisability_type();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Physical_Person#getDisability_type <em>Disability type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disability type</em>' attribute.
	 * @see TaxationWithRoot.Disability_Types
	 * @see #getDisability_type()
	 * @generated
	 */
	void setDisability_type(Disability_Types value);

	/**
	 * Returns the value of the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth month</em>' attribute.
	 * @see #setBirth_month(int)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Birth_month()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getBirth_month();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Physical_Person#getBirth_month <em>Birth month</em>}' attribute.
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
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Birth_day()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getBirth_day();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Physical_Person#getBirth_day <em>Birth day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth day</em>' attribute.
	 * @see #getBirth_day()
	 * @generated
	 */
	void setBirth_day(int value);

	/**
	 * Returns the value of the '<em><b>Expenses</b></em>' reference list.
	 * The list contents are of type {@link TaxationWithRoot.Expense}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Expense#getBeneficiary <em>Beneficiary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expenses</em>' reference list.
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Expenses()
	 * @see TaxationWithRoot.Expense#getBeneficiary
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
	 * @see TaxationWithRoot.TaxationWithRootPackage#getPhysical_Person_Is_widower()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIs_widower();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Physical_Person#isIs_widower <em>Is widower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is widower</em>' attribute.
	 * @see #isIs_widower()
	 * @generated
	 */
	void setIs_widower(boolean value);

} // Physical_Person
