/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Expense#getDeclared_amount <em>Declared amount</em>}</li>
 *   <li>{@link TaxationWithRoot.Expense#getExpense_purpose <em>Expense purpose</em>}</li>
 *   <li>{@link TaxationWithRoot.Expense#getDependent <em>Dependent</em>}</li>
 *   <li>{@link TaxationWithRoot.Expense#getFrom_agent <em>From agent</em>}</li>
 *   <li>{@link TaxationWithRoot.Expense#getIncome <em>Income</em>}</li>
 *   <li>{@link TaxationWithRoot.Expense#getId4 <em>Id4</em>}</li>
 *   <li>{@link TaxationWithRoot.Expense#getBeneficiary <em>Beneficiary</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense()
 * @model
 * @generated
 */
public interface Expense extends EObject {
	/**
	 * Returns the value of the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared amount</em>' attribute.
	 * @see #setDeclared_amount(double)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_Declared_amount()
	 * @model required="true"
	 * @generated
	 */
	double getDeclared_amount();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Expense#getDeclared_amount <em>Declared amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared amount</em>' attribute.
	 * @see #getDeclared_amount()
	 * @generated
	 */
	void setDeclared_amount(double value);

	/**
	 * Returns the value of the '<em><b>Expense purpose</b></em>' attribute.
	 * The default value is <code>"OTHER"</code>.
	 * The literals are from the enumeration {@link TaxationWithRoot.Expense_Purpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expense purpose</em>' attribute.
	 * @see TaxationWithRoot.Expense_Purpose
	 * @see #setExpense_purpose(Expense_Purpose)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_Expense_purpose()
	 * @model default="OTHER" required="true"
	 * @generated
	 */
	Expense_Purpose getExpense_purpose();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Expense#getExpense_purpose <em>Expense purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expense purpose</em>' attribute.
	 * @see TaxationWithRoot.Expense_Purpose
	 * @see #getExpense_purpose()
	 * @generated
	 */
	void setExpense_purpose(Expense_Purpose value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Dependent#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' reference.
	 * @see #setDependent(Dependent)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_Dependent()
	 * @see TaxationWithRoot.Dependent#getExpense
	 * @model opposite="expense"
	 * @generated
	 */
	Dependent getDependent();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Expense#getDependent <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(Dependent value);

	/**
	 * Returns the value of the '<em><b>From agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.FromAgent#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From agent</em>' reference.
	 * @see #setFrom_agent(FromAgent)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_From_agent()
	 * @see TaxationWithRoot.FromAgent#getExpense
	 * @model opposite="expense" ordered="false"
	 * @generated
	 */
	FromAgent getFrom_agent();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Expense#getFrom_agent <em>From agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From agent</em>' reference.
	 * @see #getFrom_agent()
	 * @generated
	 */
	void setFrom_agent(FromAgent value);

	/**
	 * Returns the value of the '<em><b>Income</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Income#getExpenses <em>Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' container reference.
	 * @see #setIncome(Income)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_Income()
	 * @see TaxationWithRoot.Income#getExpenses
	 * @model opposite="expenses" required="true" transient="false"
	 * @generated
	 */
	Income getIncome();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Expense#getIncome <em>Income</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income</em>' container reference.
	 * @see #getIncome()
	 * @generated
	 */
	void setIncome(Income value);

	/**
	 * Returns the value of the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id4</em>' attribute.
	 * @see #setId4(String)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_Id4()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId4();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Expense#getId4 <em>Id4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id4</em>' attribute.
	 * @see #getId4()
	 * @generated
	 */
	void setId4(String value);

	/**
	 * Returns the value of the '<em><b>Beneficiary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Physical_Person#getExpenses <em>Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beneficiary</em>' reference.
	 * @see #setBeneficiary(Physical_Person)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_Beneficiary()
	 * @see TaxationWithRoot.Physical_Person#getExpenses
	 * @model opposite="expenses" ordered="false"
	 * @generated
	 */
	Physical_Person getBeneficiary();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Expense#getBeneficiary <em>Beneficiary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary</em>' reference.
	 * @see #getBeneficiary()
	 * @generated
	 */
	void setBeneficiary(Physical_Person value);

} // Expense
