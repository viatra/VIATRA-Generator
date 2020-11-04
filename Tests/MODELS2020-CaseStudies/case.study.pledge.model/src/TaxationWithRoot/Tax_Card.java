/**
 */
package TaxationWithRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Tax_Card#getCard_identifier <em>Card identifier</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getTax_office <em>Tax office</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getPercentage_of_witholding <em>Percentage of witholding</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getTax_payers_name_surname <em>Tax payers name surname</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getTax_payers_partner_name_surname <em>Tax payers partner name surname</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getTax_payers_address <em>Tax payers address</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getJobs_Employer_SSNo <em>Jobs Employer SS No</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getJobs_employers_name <em>Jobs employers name</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getJobs_activity_type <em>Jobs activity type</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getJobs_place_of_work <em>Jobs place of work</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_FD_daily <em>Deduction FD daily</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_FD_monthly <em>Deduction FD monthly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_AC_daily <em>Deduction AC daily</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_AC_monthly <em>Deduction AC monthly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_AC_yearly <em>Deduction AC yearly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_CE_daily <em>Deduction CE daily</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_CE_monthly <em>Deduction CE monthly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_CE_yearly <em>Deduction CE yearly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_DS_daily <em>Deduction DS daily</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_DS_monthly <em>Deduction DS monthly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_FO_daily <em>Deduction FO daily</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_FO_monthly <em>Deduction FO monthly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_FO_yearly <em>Deduction FO yearly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getCredit_CIS_daily <em>Credit CIS daily</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getCredit_CIS_monthly <em>Credit CIS monthly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getCredit_CIM_daily <em>Credit CIM daily</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#isValidity <em>Validity</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getIncome_Tax_Credit <em>Income Tax Credit</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getPrevious <em>Previous</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getCurrent_tax_card <em>Current tax card</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getCredit_CIM_yearly <em>Credit CIM yearly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_DS_Alimony_yearly <em>Deduction DS Alimony yearly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getDeduction_DS_Debt_yearly <em>Deduction DS Debt yearly</em>}</li>
 *   <li>{@link TaxationWithRoot.Tax_Card#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getTax_Card()
 * @model
 * @generated
 */
public interface Tax_Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Card identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card identifier</em>' attribute.
	 * @see #setCard_identifier(String)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Card_identifier()
	 * @model id="true"
	 * @generated
	 */
	String getCard_identifier();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getCard_identifier <em>Card identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card identifier</em>' attribute.
	 * @see #getCard_identifier()
	 * @generated
	 */
	void setCard_identifier(String value);

	/**
	 * Returns the value of the '<em><b>Tax office</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Tax_Office}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax office</em>' attribute.
	 * @see TaxationWithRoot.Tax_Office
	 * @see #setTax_office(Tax_Office)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Tax_office()
	 * @model required="true"
	 * @generated
	 */
	Tax_Office getTax_office();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getTax_office <em>Tax office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax office</em>' attribute.
	 * @see TaxationWithRoot.Tax_Office
	 * @see #getTax_office()
	 * @generated
	 */
	void setTax_office(Tax_Office value);

	/**
	 * Returns the value of the '<em><b>Percentage of witholding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage of witholding</em>' attribute.
	 * @see #setPercentage_of_witholding(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Percentage_of_witholding()
	 * @model required="true"
	 * @generated
	 */
	double getPercentage_of_witholding();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getPercentage_of_witholding <em>Percentage of witholding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage of witholding</em>' attribute.
	 * @see #getPercentage_of_witholding()
	 * @generated
	 */
	void setPercentage_of_witholding(double value);

	/**
	 * Returns the value of the '<em><b>Tax payers name surname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax payers name surname</em>' attribute list.
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Tax_payers_name_surname()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getTax_payers_name_surname();

	/**
	 * Returns the value of the '<em><b>Tax payers partner name surname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax payers partner name surname</em>' attribute list.
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Tax_payers_partner_name_surname()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getTax_payers_partner_name_surname();

	/**
	 * Returns the value of the '<em><b>Tax payers address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax payers address</em>' reference.
	 * @see #setTax_payers_address(Address)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Tax_payers_address()
	 * @model
	 * @generated
	 */
	Address getTax_payers_address();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getTax_payers_address <em>Tax payers address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax payers address</em>' reference.
	 * @see #getTax_payers_address()
	 * @generated
	 */
	void setTax_payers_address(Address value);

	/**
	 * Returns the value of the '<em><b>Jobs Employer SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs Employer SS No</em>' attribute.
	 * @see #setJobs_Employer_SSNo(String)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Jobs_Employer_SSNo()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getJobs_Employer_SSNo();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getJobs_Employer_SSNo <em>Jobs Employer SS No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobs Employer SS No</em>' attribute.
	 * @see #getJobs_Employer_SSNo()
	 * @generated
	 */
	void setJobs_Employer_SSNo(String value);

	/**
	 * Returns the value of the '<em><b>Jobs employers name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs employers name</em>' attribute.
	 * @see #setJobs_employers_name(String)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Jobs_employers_name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getJobs_employers_name();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getJobs_employers_name <em>Jobs employers name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobs employers name</em>' attribute.
	 * @see #getJobs_employers_name()
	 * @generated
	 */
	void setJobs_employers_name(String value);

	/**
	 * Returns the value of the '<em><b>Jobs activity type</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Job_Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs activity type</em>' attribute.
	 * @see TaxationWithRoot.Job_Activity
	 * @see #setJobs_activity_type(Job_Activity)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Jobs_activity_type()
	 * @model required="true"
	 * @generated
	 */
	Job_Activity getJobs_activity_type();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getJobs_activity_type <em>Jobs activity type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobs activity type</em>' attribute.
	 * @see TaxationWithRoot.Job_Activity
	 * @see #getJobs_activity_type()
	 * @generated
	 */
	void setJobs_activity_type(Job_Activity value);

	/**
	 * Returns the value of the '<em><b>Jobs place of work</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Town}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs place of work</em>' attribute.
	 * @see TaxationWithRoot.Town
	 * @see #setJobs_place_of_work(Town)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Jobs_place_of_work()
	 * @model required="true"
	 * @generated
	 */
	Town getJobs_place_of_work();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getJobs_place_of_work <em>Jobs place of work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobs place of work</em>' attribute.
	 * @see TaxationWithRoot.Town
	 * @see #getJobs_place_of_work()
	 * @generated
	 */
	void setJobs_place_of_work(Town value);

	/**
	 * Returns the value of the '<em><b>Deduction FD daily</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction FD daily</em>' attribute.
	 * @see #setDeduction_FD_daily(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_FD_daily()
	 * @model default="0.0" unique="false" required="true" ordered="false"
	 * @generated
	 */
	double getDeduction_FD_daily();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_FD_daily <em>Deduction FD daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction FD daily</em>' attribute.
	 * @see #getDeduction_FD_daily()
	 * @generated
	 */
	void setDeduction_FD_daily(double value);

	/**
	 * Returns the value of the '<em><b>Deduction FD monthly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction FD monthly</em>' attribute.
	 * @see #setDeduction_FD_monthly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_FD_monthly()
	 * @model default="0.0" unique="false" required="true" ordered="false"
	 * @generated
	 */
	double getDeduction_FD_monthly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_FD_monthly <em>Deduction FD monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction FD monthly</em>' attribute.
	 * @see #getDeduction_FD_monthly()
	 * @generated
	 */
	void setDeduction_FD_monthly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction AC daily</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction AC daily</em>' attribute.
	 * @see #setDeduction_AC_daily(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_AC_daily()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_AC_daily();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_AC_daily <em>Deduction AC daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction AC daily</em>' attribute.
	 * @see #getDeduction_AC_daily()
	 * @generated
	 */
	void setDeduction_AC_daily(double value);

	/**
	 * Returns the value of the '<em><b>Deduction AC monthly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction AC monthly</em>' attribute.
	 * @see #setDeduction_AC_monthly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_AC_monthly()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_AC_monthly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_AC_monthly <em>Deduction AC monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction AC monthly</em>' attribute.
	 * @see #getDeduction_AC_monthly()
	 * @generated
	 */
	void setDeduction_AC_monthly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction AC yearly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction AC yearly</em>' attribute.
	 * @see #setDeduction_AC_yearly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_AC_yearly()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_AC_yearly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_AC_yearly <em>Deduction AC yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction AC yearly</em>' attribute.
	 * @see #getDeduction_AC_yearly()
	 * @generated
	 */
	void setDeduction_AC_yearly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction CE daily</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction CE daily</em>' attribute.
	 * @see #setDeduction_CE_daily(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_CE_daily()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_CE_daily();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_CE_daily <em>Deduction CE daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction CE daily</em>' attribute.
	 * @see #getDeduction_CE_daily()
	 * @generated
	 */
	void setDeduction_CE_daily(double value);

	/**
	 * Returns the value of the '<em><b>Deduction CE monthly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction CE monthly</em>' attribute.
	 * @see #setDeduction_CE_monthly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_CE_monthly()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_CE_monthly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_CE_monthly <em>Deduction CE monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction CE monthly</em>' attribute.
	 * @see #getDeduction_CE_monthly()
	 * @generated
	 */
	void setDeduction_CE_monthly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction CE yearly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction CE yearly</em>' attribute.
	 * @see #setDeduction_CE_yearly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_CE_yearly()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_CE_yearly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_CE_yearly <em>Deduction CE yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction CE yearly</em>' attribute.
	 * @see #getDeduction_CE_yearly()
	 * @generated
	 */
	void setDeduction_CE_yearly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction DS daily</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction DS daily</em>' attribute.
	 * @see #setDeduction_DS_daily(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_DS_daily()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_DS_daily();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_daily <em>Deduction DS daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction DS daily</em>' attribute.
	 * @see #getDeduction_DS_daily()
	 * @generated
	 */
	void setDeduction_DS_daily(double value);

	/**
	 * Returns the value of the '<em><b>Deduction DS monthly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction DS monthly</em>' attribute.
	 * @see #setDeduction_DS_monthly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_DS_monthly()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getDeduction_DS_monthly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_monthly <em>Deduction DS monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction DS monthly</em>' attribute.
	 * @see #getDeduction_DS_monthly()
	 * @generated
	 */
	void setDeduction_DS_monthly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction FO daily</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction FO daily</em>' attribute.
	 * @see #setDeduction_FO_daily(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_FO_daily()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_FO_daily();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_FO_daily <em>Deduction FO daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction FO daily</em>' attribute.
	 * @see #getDeduction_FO_daily()
	 * @generated
	 */
	void setDeduction_FO_daily(double value);

	/**
	 * Returns the value of the '<em><b>Deduction FO monthly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction FO monthly</em>' attribute.
	 * @see #setDeduction_FO_monthly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_FO_monthly()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_FO_monthly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_FO_monthly <em>Deduction FO monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction FO monthly</em>' attribute.
	 * @see #getDeduction_FO_monthly()
	 * @generated
	 */
	void setDeduction_FO_monthly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction FO yearly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction FO yearly</em>' attribute.
	 * @see #setDeduction_FO_yearly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_FO_yearly()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getDeduction_FO_yearly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_FO_yearly <em>Deduction FO yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction FO yearly</em>' attribute.
	 * @see #getDeduction_FO_yearly()
	 * @generated
	 */
	void setDeduction_FO_yearly(double value);

	/**
	 * Returns the value of the '<em><b>Credit CIS daily</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit CIS daily</em>' attribute.
	 * @see #setCredit_CIS_daily(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Credit_CIS_daily()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getCredit_CIS_daily();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getCredit_CIS_daily <em>Credit CIS daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit CIS daily</em>' attribute.
	 * @see #getCredit_CIS_daily()
	 * @generated
	 */
	void setCredit_CIS_daily(double value);

	/**
	 * Returns the value of the '<em><b>Credit CIS monthly</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit CIS monthly</em>' attribute.
	 * @see #setCredit_CIS_monthly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Credit_CIS_monthly()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getCredit_CIS_monthly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getCredit_CIS_monthly <em>Credit CIS monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit CIS monthly</em>' attribute.
	 * @see #getCredit_CIS_monthly()
	 * @generated
	 */
	void setCredit_CIS_monthly(double value);

	/**
	 * Returns the value of the '<em><b>Credit CIM daily</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit CIM daily</em>' attribute.
	 * @see #setCredit_CIM_daily(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Credit_CIM_daily()
	 * @model default="0.0" unique="false" required="true"
	 * @generated
	 */
	double getCredit_CIM_daily();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getCredit_CIM_daily <em>Credit CIM daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit CIM daily</em>' attribute.
	 * @see #getCredit_CIM_daily()
	 * @generated
	 */
	void setCredit_CIM_daily(double value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(boolean)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Validity()
	 * @model required="true"
	 * @generated
	 */
	boolean isValidity();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#isValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #isValidity()
	 * @generated
	 */
	void setValidity(boolean value);

	/**
	 * Returns the value of the '<em><b>Income Tax Credit</b></em>' reference list.
	 * The list contents are of type {@link TaxationWithRoot.Income_Tax_Credit}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Income_Tax_Credit#getTaxation_Frame <em>Taxation Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income Tax Credit</em>' reference list.
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Income_Tax_Credit()
	 * @see TaxationWithRoot.Income_Tax_Credit#getTaxation_Frame
	 * @model opposite="taxation_Frame" ordered="false"
	 * @generated
	 */
	EList<Income_Tax_Credit> getIncome_Tax_Credit();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Card#getCurrent_tax_card <em>Current tax card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Tax_Card)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Previous()
	 * @see TaxationWithRoot.Tax_Card#getCurrent_tax_card
	 * @model opposite="current_tax_card"
	 * @generated
	 */
	Tax_Card getPrevious();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Tax_Card value);

	/**
	 * Returns the value of the '<em><b>Current tax card</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Card#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current tax card</em>' reference.
	 * @see #setCurrent_tax_card(Tax_Card)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Current_tax_card()
	 * @see TaxationWithRoot.Tax_Card#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Tax_Card getCurrent_tax_card();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getCurrent_tax_card <em>Current tax card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current tax card</em>' reference.
	 * @see #getCurrent_tax_card()
	 * @generated
	 */
	void setCurrent_tax_card(Tax_Card value);

	/**
	 * Returns the value of the '<em><b>Credit CIM yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit CIM yearly</em>' attribute.
	 * @see #setCredit_CIM_yearly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Credit_CIM_yearly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getCredit_CIM_yearly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getCredit_CIM_yearly <em>Credit CIM yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit CIM yearly</em>' attribute.
	 * @see #getCredit_CIM_yearly()
	 * @generated
	 */
	void setCredit_CIM_yearly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction DS Alimony yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction DS Alimony yearly</em>' attribute.
	 * @see #setDeduction_DS_Alimony_yearly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_DS_Alimony_yearly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getDeduction_DS_Alimony_yearly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_Alimony_yearly <em>Deduction DS Alimony yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction DS Alimony yearly</em>' attribute.
	 * @see #getDeduction_DS_Alimony_yearly()
	 * @generated
	 */
	void setDeduction_DS_Alimony_yearly(double value);

	/**
	 * Returns the value of the '<em><b>Deduction DS Debt yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction DS Debt yearly</em>' attribute.
	 * @see #setDeduction_DS_Debt_yearly(double)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Deduction_DS_Debt_yearly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getDeduction_DS_Debt_yearly();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_Debt_yearly <em>Deduction DS Debt yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction DS Debt yearly</em>' attribute.
	 * @see #getDeduction_DS_Debt_yearly()
	 * @generated
	 */
	void setDeduction_DS_Debt_yearly(double value);

	/**
	 * Returns the value of the '<em><b>Income</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Income#getTax_card <em>Tax card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' container reference.
	 * @see #setIncome(Income)
	 * @see TaxationWithRoot.TaxationPackage#getTax_Card_Income()
	 * @see TaxationWithRoot.Income#getTax_card
	 * @model opposite="tax_card" required="true" transient="false"
	 * @generated
	 */
	Income getIncome();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Tax_Card#getIncome <em>Income</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income</em>' container reference.
	 * @see #getIncome()
	 * @generated
	 */
	void setIncome(Income value);

} // Tax_Card
