/**
 */
package Taxation;

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
 *   <li>{@link Taxation.Dependent#getDependent_type <em>Dependent type</em>}</li>
 *   <li>{@link Taxation.Dependent#getResponsible_person <em>Responsible person</em>}</li>
 *   <li>{@link Taxation.Dependent#isContinued_studies <em>Continued studies</em>}</li>
 *   <li>{@link Taxation.Dependent#getAllowances <em>Allowances</em>}</li>
 *   <li>{@link Taxation.Dependent#getHousehold <em>Household</em>}</li>
 *   <li>{@link Taxation.Dependent#getFrom_agent <em>From agent</em>}</li>
 *   <li>{@link Taxation.Dependent#getExpense <em>Expense</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getDependent()
 * @model
 * @generated
 */
public interface Dependent extends Physical_Person {
	/**
	 * Returns the value of the '<em><b>Dependent type</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Dependent_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent type</em>' attribute.
	 * @see Taxation.Dependent_Type
	 * @see #setDependent_type(Dependent_Type)
	 * @see Taxation.TaxationPackage#getDependent_Dependent_type()
	 * @model required="true"
	 * @generated
	 */
	Dependent_Type getDependent_type();

	/**
	 * Sets the value of the '{@link Taxation.Dependent#getDependent_type <em>Dependent type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent type</em>' attribute.
	 * @see Taxation.Dependent_Type
	 * @see #getDependent_type()
	 * @generated
	 */
	void setDependent_type(Dependent_Type value);

	/**
	 * Returns the value of the '<em><b>Responsible person</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Taxation.Tax_Payer#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible person</em>' container reference.
	 * @see #setResponsible_person(Tax_Payer)
	 * @see Taxation.TaxationPackage#getDependent_Responsible_person()
	 * @see Taxation.Tax_Payer#getDependents
	 * @model opposite="dependents" transient="false"
	 * @generated
	 */
	Tax_Payer getResponsible_person();

	/**
	 * Sets the value of the '{@link Taxation.Dependent#getResponsible_person <em>Responsible person</em>}' container reference.
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
	 * @see Taxation.TaxationPackage#getDependent_Continued_studies()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isContinued_studies();

	/**
	 * Sets the value of the '{@link Taxation.Dependent#isContinued_studies <em>Continued studies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continued studies</em>' attribute.
	 * @see #isContinued_studies()
	 * @generated
	 */
	void setContinued_studies(boolean value);

	/**
	 * Returns the value of the '<em><b>Allowances</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link Taxation.External_Allowance#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowances</em>' containment reference.
	 * @see #setAllowances(External_Allowance)
	 * @see Taxation.TaxationPackage#getDependent_Allowances()
	 * @see Taxation.External_Allowance#getPerson
	 * @model opposite="person" containment="true" ordered="false"
	 * @generated
	 */
	External_Allowance getAllowances();

	/**
	 * Sets the value of the '{@link Taxation.Dependent#getAllowances <em>Allowances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowances</em>' containment reference.
	 * @see #getAllowances()
	 * @generated
	 */
	void setAllowances(External_Allowance value);

	/**
	 * Returns the value of the '<em><b>Household</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Taxation.Household#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Household</em>' container reference.
	 * @see #setHousehold(Household)
	 * @see Taxation.TaxationPackage#getDependent_Household()
	 * @see Taxation.Household#getChildren
	 * @model opposite="children" transient="false" ordered="false"
	 * @generated
	 */
	Household getHousehold();

	/**
	 * Sets the value of the '{@link Taxation.Dependent#getHousehold <em>Household</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Household</em>' container reference.
	 * @see #getHousehold()
	 * @generated
	 */
	void setHousehold(Household value);

	/**
	 * Returns the value of the '<em><b>From agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Taxation.FromAgent#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From agent</em>' reference.
	 * @see #setFrom_agent(FromAgent)
	 * @see Taxation.TaxationPackage#getDependent_From_agent()
	 * @see Taxation.FromAgent#getDependent
	 * @model opposite="dependent" ordered="false"
	 * @generated
	 */
	FromAgent getFrom_agent();

	/**
	 * Sets the value of the '{@link Taxation.Dependent#getFrom_agent <em>From agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From agent</em>' reference.
	 * @see #getFrom_agent()
	 * @generated
	 */
	void setFrom_agent(FromAgent value);

	/**
	 * Returns the value of the '<em><b>Expense</b></em>' reference list.
	 * The list contents are of type {@link Taxation.Expense}.
	 * It is bidirectional and its opposite is '{@link Taxation.Expense#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expense</em>' reference list.
	 * @see Taxation.TaxationPackage#getDependent_Expense()
	 * @see Taxation.Expense#getDependent
	 * @model opposite="dependent" ordered="false"
	 * @generated
	 */
	EList<Expense> getExpense();

} // Dependent
