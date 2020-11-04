/**
 */
package Taxation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Income Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Income_Detail#getAmount <em>Amount</em>}</li>
 *   <li>{@link Taxation.Income_Detail#isIs_worked <em>Is worked</em>}</li>
 *   <li>{@link Taxation.Income_Detail#getDistance <em>Distance</em>}</li>
 *   <li>{@link Taxation.Income_Detail#getWorked_days <em>Worked days</em>}</li>
 *   <li>{@link Taxation.Income_Detail#isIs_contributing_CNS <em>Is contributing CNS</em>}</li>
 *   <li>{@link Taxation.Income_Detail#getId5 <em>Id5</em>}</li>
 *   <li>{@link Taxation.Income_Detail#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getIncome_Detail()
 * @model
 * @generated
 */
public interface Income_Detail extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see Taxation.TaxationPackage#getIncome_Detail_Amount()
	 * @model required="true"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link Taxation.Income_Detail#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Is worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is worked</em>' attribute.
	 * @see #setIs_worked(boolean)
	 * @see Taxation.TaxationPackage#getIncome_Detail_Is_worked()
	 * @model required="true"
	 * @generated
	 */
	boolean isIs_worked();

	/**
	 * Sets the value of the '{@link Taxation.Income_Detail#isIs_worked <em>Is worked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is worked</em>' attribute.
	 * @see #isIs_worked()
	 * @generated
	 */
	void setIs_worked(boolean value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see Taxation.TaxationPackage#getIncome_Detail_Distance()
	 * @model required="true"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link Taxation.Income_Detail#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Worked days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worked days</em>' attribute.
	 * @see #setWorked_days(int)
	 * @see Taxation.TaxationPackage#getIncome_Detail_Worked_days()
	 * @model required="true"
	 * @generated
	 */
	int getWorked_days();

	/**
	 * Sets the value of the '{@link Taxation.Income_Detail#getWorked_days <em>Worked days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worked days</em>' attribute.
	 * @see #getWorked_days()
	 * @generated
	 */
	void setWorked_days(int value);

	/**
	 * Returns the value of the '<em><b>Is contributing CNS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is contributing CNS</em>' attribute.
	 * @see #setIs_contributing_CNS(boolean)
	 * @see Taxation.TaxationPackage#getIncome_Detail_Is_contributing_CNS()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIs_contributing_CNS();

	/**
	 * Sets the value of the '{@link Taxation.Income_Detail#isIs_contributing_CNS <em>Is contributing CNS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is contributing CNS</em>' attribute.
	 * @see #isIs_contributing_CNS()
	 * @generated
	 */
	void setIs_contributing_CNS(boolean value);

	/**
	 * Returns the value of the '<em><b>Id5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id5</em>' attribute.
	 * @see #setId5(String)
	 * @see Taxation.TaxationPackage#getIncome_Detail_Id5()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId5();

	/**
	 * Sets the value of the '{@link Taxation.Income_Detail#getId5 <em>Id5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id5</em>' attribute.
	 * @see #getId5()
	 * @generated
	 */
	void setId5(String value);

	/**
	 * Returns the value of the '<em><b>Income</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Taxation.Income#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' container reference.
	 * @see #setIncome(Income)
	 * @see Taxation.TaxationPackage#getIncome_Detail_Income()
	 * @see Taxation.Income#getDetails
	 * @model opposite="details" required="true" transient="false"
	 * @generated
	 */
	Income getIncome();

	/**
	 * Sets the value of the '{@link Taxation.Income_Detail#getIncome <em>Income</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income</em>' container reference.
	 * @see #getIncome()
	 * @generated
	 */
	void setIncome(Income value);

} // Income_Detail
