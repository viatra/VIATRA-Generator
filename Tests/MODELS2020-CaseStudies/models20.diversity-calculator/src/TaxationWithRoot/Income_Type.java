/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Income Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Income_Type#getId8 <em>Id8</em>}</li>
 *   <li>{@link TaxationWithRoot.Income_Type#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Type()
 * @model abstract="true"
 * @generated
 */
public interface Income_Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id8</em>' attribute.
	 * @see #setId8(String)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Type_Id8()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId8();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income_Type#getId8 <em>Id8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id8</em>' attribute.
	 * @see #getId8()
	 * @generated
	 */
	void setId8(String value);

	/**
	 * Returns the value of the '<em><b>Income</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Income#getIncome_type <em>Income type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' container reference.
	 * @see #setIncome(Income)
	 * @see TaxationWithRoot.TaxationWithRootPackage#getIncome_Type_Income()
	 * @see TaxationWithRoot.Income#getIncome_type
	 * @model opposite="income_type" required="true" transient="false"
	 * @generated
	 */
	Income getIncome();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Income_Type#getIncome <em>Income</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income</em>' container reference.
	 * @see #getIncome()
	 * @generated
	 */
	void setIncome(Income value);

} // Income_Type
