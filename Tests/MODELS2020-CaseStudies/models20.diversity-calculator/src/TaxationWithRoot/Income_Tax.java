/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Income Tax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Income_Tax#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link TaxationWithRoot.Income_Tax#getTax_amount <em>Tax amount</em>}</li>
 *   <li>{@link TaxationWithRoot.Income_Tax#getTax_year <em>Tax year</em>}</li>
 *   <li>{@link TaxationWithRoot.Income_Tax#getId6 <em>Id6</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Tax()
 * @model
 * @generated
 */
public interface Income_Tax extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Payer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payer</em>' reference.
	 * @see #setTaxPayer(Tax_Payer)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Tax_TaxPayer()
	 * @model required="true"
	 * @generated
	 */
	Tax_Payer getTaxPayer();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income_Tax#getTaxPayer <em>Tax Payer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payer</em>' reference.
	 * @see #getTaxPayer()
	 * @generated
	 */
	void setTaxPayer(Tax_Payer value);

	/**
	 * Returns the value of the '<em><b>Tax amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax amount</em>' attribute.
	 * @see #setTax_amount(double)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Tax_Tax_amount()
	 * @model required="true"
	 * @generated
	 */
	double getTax_amount();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income_Tax#getTax_amount <em>Tax amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax amount</em>' attribute.
	 * @see #getTax_amount()
	 * @generated
	 */
	void setTax_amount(double value);

	/**
	 * Returns the value of the '<em><b>Tax year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax year</em>' attribute.
	 * @see #setTax_year(int)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Tax_Tax_year()
	 * @model required="true"
	 * @generated
	 */
	int getTax_year();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income_Tax#getTax_year <em>Tax year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax year</em>' attribute.
	 * @see #getTax_year()
	 * @generated
	 */
	void setTax_year(int value);

	/**
	 * Returns the value of the '<em><b>Id6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id6</em>' attribute.
	 * @see #setId6(String)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Tax_Id6()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId6();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income_Tax#getId6 <em>Id6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id6</em>' attribute.
	 * @see #getId6()
	 * @generated
	 */
	void setId6(String value);

} // Income_Tax
