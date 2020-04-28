/**
 */
package Taxation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Income Tax Credit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Income_Tax_Credit#getGrantedBy <em>Granted By</em>}</li>
 *   <li>{@link Taxation.Income_Tax_Credit#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link Taxation.Income_Tax_Credit#getTax_year <em>Tax year</em>}</li>
 *   <li>{@link Taxation.Income_Tax_Credit#getYearly <em>Yearly</em>}</li>
 *   <li>{@link Taxation.Income_Tax_Credit#getMonthly <em>Monthly</em>}</li>
 *   <li>{@link Taxation.Income_Tax_Credit#getDaily <em>Daily</em>}</li>
 *   <li>{@link Taxation.Income_Tax_Credit#getId7 <em>Id7</em>}</li>
 *   <li>{@link Taxation.Income_Tax_Credit#getTaxation_Frame <em>Taxation Frame</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getIncome_Tax_Credit()
 * @model
 * @generated
 */
public interface Income_Tax_Credit extends EObject {
	/**
	 * Returns the value of the '<em><b>Granted By</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Grantor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granted By</em>' attribute.
	 * @see Taxation.Grantor
	 * @see #setGrantedBy(Grantor)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_GrantedBy()
	 * @model required="true"
	 * @generated
	 */
	Grantor getGrantedBy();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getGrantedBy <em>Granted By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granted By</em>' attribute.
	 * @see Taxation.Grantor
	 * @see #getGrantedBy()
	 * @generated
	 */
	void setGrantedBy(Grantor value);

	/**
	 * Returns the value of the '<em><b>Tax Payer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payer</em>' reference.
	 * @see #setTaxPayer(Tax_Payer)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_TaxPayer()
	 * @model
	 * @generated
	 */
	Tax_Payer getTaxPayer();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getTaxPayer <em>Tax Payer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payer</em>' reference.
	 * @see #getTaxPayer()
	 * @generated
	 */
	void setTaxPayer(Tax_Payer value);

	/**
	 * Returns the value of the '<em><b>Tax year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax year</em>' attribute.
	 * @see #setTax_year(int)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_Tax_year()
	 * @model required="true"
	 * @generated
	 */
	int getTax_year();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getTax_year <em>Tax year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax year</em>' attribute.
	 * @see #getTax_year()
	 * @generated
	 */
	void setTax_year(int value);

	/**
	 * Returns the value of the '<em><b>Yearly</b></em>' attribute.
	 * The default value is <code>"300.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yearly</em>' attribute.
	 * @see #setYearly(double)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_Yearly()
	 * @model default="300.0" required="true"
	 * @generated
	 */
	double getYearly();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getYearly <em>Yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yearly</em>' attribute.
	 * @see #getYearly()
	 * @generated
	 */
	void setYearly(double value);

	/**
	 * Returns the value of the '<em><b>Monthly</b></em>' attribute.
	 * The default value is <code>"25.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monthly</em>' attribute.
	 * @see #setMonthly(double)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_Monthly()
	 * @model default="25.0" required="true"
	 * @generated
	 */
	double getMonthly();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getMonthly <em>Monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monthly</em>' attribute.
	 * @see #getMonthly()
	 * @generated
	 */
	void setMonthly(double value);

	/**
	 * Returns the value of the '<em><b>Daily</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily</em>' attribute.
	 * @see #setDaily(double)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_Daily()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getDaily();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getDaily <em>Daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily</em>' attribute.
	 * @see #getDaily()
	 * @generated
	 */
	void setDaily(double value);

	/**
	 * Returns the value of the '<em><b>Id7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id7</em>' attribute.
	 * @see #setId7(String)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_Id7()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId7();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getId7 <em>Id7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id7</em>' attribute.
	 * @see #getId7()
	 * @generated
	 */
	void setId7(String value);

	/**
	 * Returns the value of the '<em><b>Taxation Frame</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Taxation.Tax_Card#getIncome_Tax_Credit <em>Income Tax Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxation Frame</em>' reference.
	 * @see #setTaxation_Frame(Tax_Card)
	 * @see Taxation.TaxationPackage#getIncome_Tax_Credit_Taxation_Frame()
	 * @see Taxation.Tax_Card#getIncome_Tax_Credit
	 * @model opposite="income_Tax_Credit"
	 * @generated
	 */
	Tax_Card getTaxation_Frame();

	/**
	 * Sets the value of the '{@link Taxation.Income_Tax_Credit#getTaxation_Frame <em>Taxation Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxation Frame</em>' reference.
	 * @see #getTaxation_Frame()
	 * @generated
	 */
	void setTaxation_Frame(Tax_Card value);

} // Income_Tax_Credit
