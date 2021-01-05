/**
 */
package TaxationWithRoot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Dependent#getDependent_type <em>Dependent type</em>}</li>
 *   <li>{@link TaxationWithRoot.Dependent#getResponsible_person <em>Responsible person</em>}</li>
 *   <li>{@link TaxationWithRoot.Dependent#isContinued_studies <em>Continued studies</em>}</li>
 *   <li>{@link TaxationWithRoot.Dependent#getAllowances <em>Allowances</em>}</li>
 *   <li>{@link TaxationWithRoot.Dependent#getHousehold <em>Household</em>}</li>
 *   <li>{@link TaxationWithRoot.Dependent#getFrom_agent <em>From agent</em>}</li>
 *   <li>{@link TaxationWithRoot.Dependent#getExpense <em>Expense</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent()
 * @model
 * @generated
 */
public interface Dependent extends Physical_Person {
	/**
	 * Returns the value of the '<em><b>Dependent type</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Dependent_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent type</em>' attribute.
	 * @see TaxationWithRoot.Dependent_Type
	 * @see #setDependent_type(Dependent_Type)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent_Dependent_type()
	 * @model required="true"
	 * @generated
	 */
	Dependent_Type getDependent_type();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Dependent#getDependent_type <em>Dependent type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent type</em>' attribute.
	 * @see TaxationWithRoot.Dependent_Type
	 * @see #getDependent_type()
	 * @generated
	 */
	void setDependent_type(Dependent_Type value);

	/**
	 * Returns the value of the '<em><b>Responsible person</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Payer#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible person</em>' container reference.
	 * @see #setResponsible_person(Tax_Payer)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent_Responsible_person()
	 * @see TaxationWithRoot.Tax_Payer#getDependents
	 * @model opposite="dependents" transient="false"
	 * @generated
	 */
	Tax_Payer getResponsible_person();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Dependent#getResponsible_person <em>Responsible person</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible person</em>' container reference.
	 * @see #getResponsible_person()
	 * @generated
	 */
	void setResponsible_person(Tax_Payer value);

	/**
	 * Returns the value of the '<em><b>Continued studies</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continued studies</em>' attribute.
	 * @see #setContinued_studies(boolean)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent_Continued_studies()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isContinued_studies();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Dependent#isContinued_studies <em>Continued studies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continued studies</em>' attribute.
	 * @see #isContinued_studies()
	 * @generated
	 */
	void setContinued_studies(boolean value);

	/**
	 * Returns the value of the '<em><b>Allowances</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.External_Allowance#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowances</em>' containment reference.
	 * @see #setAllowances(External_Allowance)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent_Allowances()
	 * @see TaxationWithRoot.External_Allowance#getPerson
	 * @model opposite="person" containment="true" ordered="false"
	 * @generated
	 */
	External_Allowance getAllowances();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Dependent#getAllowances <em>Allowances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowances</em>' containment reference.
	 * @see #getAllowances()
	 * @generated
	 */
	void setAllowances(External_Allowance value);

	/**
	 * Returns the value of the '<em><b>Household</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Household#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Household</em>' container reference.
	 * @see #setHousehold(Household)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent_Household()
	 * @see TaxationWithRoot.Household#getChildren
	 * @model opposite="children" transient="false" ordered="false"
	 * @generated
	 */
	Household getHousehold();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Dependent#getHousehold <em>Household</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Household</em>' container reference.
	 * @see #getHousehold()
	 * @generated
	 */
	void setHousehold(Household value);

	/**
	 * Returns the value of the '<em><b>From agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.FromAgent#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From agent</em>' reference.
	 * @see #setFrom_agent(FromAgent)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent_From_agent()
	 * @see TaxationWithRoot.FromAgent#getDependent
	 * @model opposite="dependent" ordered="false"
	 * @generated
	 */
	FromAgent getFrom_agent();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Dependent#getFrom_agent <em>From agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From agent</em>' reference.
	 * @see #getFrom_agent()
	 * @generated
	 */
	void setFrom_agent(FromAgent value);

	/**
	 * Returns the value of the '<em><b>Expense</b></em>' reference list.
	 * The list contents are of type {@link TaxationWithRoot.Expense}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Expense#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expense</em>' reference list.
	 * @see TaxationWithRoot.TaxationWithRootPackage#getDependent_Expense()
	 * @see TaxationWithRoot.Expense#getDependent
	 * @model opposite="dependent" ordered="false"
	 * @generated
	 */
	EList<Expense> getExpense();

} // Dependent
