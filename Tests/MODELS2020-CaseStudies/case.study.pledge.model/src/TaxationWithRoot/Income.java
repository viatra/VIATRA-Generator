/**
 */
package TaxationWithRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Income</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Income#getIncome_amount <em>Income amount</em>}</li>
 *   <li>{@link TaxationWithRoot.Income#getIncome_type <em>Income type</em>}</li>
 *   <li>{@link TaxationWithRoot.Income#getTax_card <em>Tax card</em>}</li>
 *   <li>{@link TaxationWithRoot.Income#getTax_liability <em>Tax liability</em>}</li>
 *   <li>{@link TaxationWithRoot.Income#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link TaxationWithRoot.Income#getDetails <em>Details</em>}</li>
 *   <li>{@link TaxationWithRoot.Income#getNum <em>Num</em>}</li>
 *   <li>{@link TaxationWithRoot.Income#getExpenses <em>Expenses</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getIncome()
 * @model abstract="true"
 * @generated
 */
public interface Income extends EObject {
	/**
	 * Returns the value of the '<em><b>Income amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income amount</em>' attribute.
	 * @see #setIncome_amount(double)
	 * @see TaxationWithRoot.TaxationPackage#getIncome_Income_amount()
	 * @model unique="false" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='let non_null_amounts:OrderedSet(Income_Detail)=self.details-&gt;select(det:Income_Detail|det.amount&gt;0)-&gt;asOrderedSet() in\nnon_null_amounts-&gt;collect(amount)-&gt;min()'"
	 * @generated
	 */
	double getIncome_amount();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income#getIncome_amount <em>Income amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income amount</em>' attribute.
	 * @see #getIncome_amount()
	 * @generated
	 */
	void setIncome_amount(double value);

	/**
	 * Returns the value of the '<em><b>Income type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Income_Type#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income type</em>' containment reference.
	 * @see #setIncome_type(Income_Type)
	 * @see TaxationWithRoot.TaxationPackage#getIncome_Income_type()
	 * @see TaxationWithRoot.Income_Type#getIncome
	 * @model opposite="income" containment="true" required="true"
	 * @generated
	 */
	Income_Type getIncome_type();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income#getIncome_type <em>Income type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income type</em>' containment reference.
	 * @see #getIncome_type()
	 * @generated
	 */
	void setIncome_type(Income_Type value);

	/**
	 * Returns the value of the '<em><b>Tax card</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Card#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax card</em>' containment reference.
	 * @see #setTax_card(Tax_Card)
	 * @see TaxationWithRoot.TaxationPackage#getIncome_Tax_card()
	 * @see TaxationWithRoot.Tax_Card#getIncome
	 * @model opposite="income" containment="true"
	 * @generated
	 */
	Tax_Card getTax_card();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income#getTax_card <em>Tax card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax card</em>' containment reference.
	 * @see #getTax_card()
	 * @generated
	 */
	void setTax_card(Tax_Card value);

	/**
	 * Returns the value of the '<em><b>Tax liability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax liability</em>' attribute.
	 * @see #setTax_liability(double)
	 * @see TaxationWithRoot.TaxationPackage#getIncome_Tax_liability()
	 * @model required="true"
	 * @generated
	 */
	double getTax_liability();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income#getTax_liability <em>Tax liability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax liability</em>' attribute.
	 * @see #getTax_liability()
	 * @generated
	 */
	void setTax_liability(double value);

	/**
	 * Returns the value of the '<em><b>Tax Payer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Payer#getIncomes <em>Incomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payer</em>' container reference.
	 * @see #setTaxPayer(Tax_Payer)
	 * @see TaxationWithRoot.TaxationPackage#getIncome_TaxPayer()
	 * @see TaxationWithRoot.Tax_Payer#getIncomes
	 * @model opposite="incomes" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Tax_Payer getTaxPayer();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income#getTaxPayer <em>Tax Payer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payer</em>' container reference.
	 * @see #getTaxPayer()
	 * @generated
	 */
	void setTaxPayer(Tax_Payer value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference list.
	 * The list contents are of type {@link TaxationWithRoot.Income_Detail}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Income_Detail#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' containment reference list.
	 * @see TaxationWithRoot.TaxationPackage#getIncome_Details()
	 * @see TaxationWithRoot.Income_Detail#getIncome
	 * @model opposite="income" containment="true" lower="12" upper="12"
	 * @generated
	 */
	EList<Income_Detail> getDetails();

	/**
	 * Returns the value of the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' attribute.
	 * @see #setNum(int)
	 * @see TaxationWithRoot.TaxationPackage#getIncome_Num()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	int getNum();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income#getNum <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' attribute.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(int value);

	/**
	 * Returns the value of the '<em><b>Expenses</b></em>' containment reference list.
	 * The list contents are of type {@link TaxationWithRoot.Expense}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Expense#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expenses</em>' containment reference list.
	 * @see TaxationWithRoot.TaxationPackage#getIncome_Expenses()
	 * @see TaxationWithRoot.Expense#getIncome
	 * @model opposite="income" containment="true" ordered="false"
	 * @generated
	 */
	EList<Expense> getExpenses();

} // Income
