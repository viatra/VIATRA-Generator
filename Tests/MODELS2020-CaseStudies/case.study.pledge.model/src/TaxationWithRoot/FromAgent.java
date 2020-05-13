/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.FromAgent#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link TaxationWithRoot.FromAgent#isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care <em>Is dependent eligible for CE Not In Houshold Children Care</em>}</li>
 *   <li>{@link TaxationWithRoot.FromAgent#getExpense <em>Expense</em>}</li>
 *   <li>{@link TaxationWithRoot.FromAgent#isIs_eligible_debt <em>Is eligible debt</em>}</li>
 *   <li>{@link TaxationWithRoot.FromAgent#getDependent <em>Dependent</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getFromAgent()
 * @model
 * @generated
 */
public interface FromAgent extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Payer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Payer#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payer</em>' container reference.
	 * @see #setTaxPayer(Tax_Payer)
	 * @see TaxationWithRoot.TaxationPackage#getFromAgent_TaxPayer()
	 * @see TaxationWithRoot.Tax_Payer#getFrom_agent
	 * @model opposite="from_agent" required="true" transient="false"
	 * @generated
	 */
	Tax_Payer getTaxPayer();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FromAgent#getTaxPayer <em>Tax Payer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payer</em>' container reference.
	 * @see #getTaxPayer()
	 * @generated
	 */
	void setTaxPayer(Tax_Payer value);

	/**
	 * Returns the value of the '<em><b>Is dependent eligible for CE Not In Houshold Children Care</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is dependent eligible for CE Not In Houshold Children Care</em>' attribute.
	 * @see #setIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care(boolean)
	 * @see TaxationWithRoot.TaxationPackage#getFromAgent_Is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FromAgent#isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care <em>Is dependent eligible for CE Not In Houshold Children Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is dependent eligible for CE Not In Houshold Children Care</em>' attribute.
	 * @see #isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care()
	 * @generated
	 */
	void setIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care(boolean value);

	/**
	 * Returns the value of the '<em><b>Expense</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Expense#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expense</em>' reference.
	 * @see #setExpense(Expense)
	 * @see TaxationWithRoot.TaxationPackage#getFromAgent_Expense()
	 * @see TaxationWithRoot.Expense#getFrom_agent
	 * @model opposite="from_agent" ordered="false"
	 * @generated
	 */
	Expense getExpense();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FromAgent#getExpense <em>Expense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expense</em>' reference.
	 * @see #getExpense()
	 * @generated
	 */
	void setExpense(Expense value);

	/**
	 * Returns the value of the '<em><b>Is eligible debt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is eligible debt</em>' attribute.
	 * @see #setIs_eligible_debt(boolean)
	 * @see TaxationWithRoot.TaxationPackage#getFromAgent_Is_eligible_debt()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIs_eligible_debt();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FromAgent#isIs_eligible_debt <em>Is eligible debt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is eligible debt</em>' attribute.
	 * @see #isIs_eligible_debt()
	 * @generated
	 */
	void setIs_eligible_debt(boolean value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Dependent#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' reference.
	 * @see #setDependent(Dependent)
	 * @see TaxationWithRoot.TaxationPackage#getFromAgent_Dependent()
	 * @see TaxationWithRoot.Dependent#getFrom_agent
	 * @model opposite="from_agent" ordered="false"
	 * @generated
	 */
	Dependent getDependent();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FromAgent#getDependent <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(Dependent value);

} // FromAgent
