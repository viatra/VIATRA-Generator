/**
 */
package Taxation;

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
 *   <li>{@link Taxation.Income_Type#isSubjectToWithholdingTax <em>Subject To Withholding Tax</em>}</li>
 *   <li>{@link Taxation.Income_Type#getId8 <em>Id8</em>}</li>
 *   <li>{@link Taxation.Income_Type#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getIncome_Type()
 * @model abstract="true"
 * @generated
 */
public interface Income_Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject To Withholding Tax</em>' attribute.
	 * @see #setSubjectToWithholdingTax(boolean)
	 * @see Taxation.TaxationPackage#getIncome_Type_SubjectToWithholdingTax()
	 * @model required="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tself.income.tax_card-&gt;notEmpty()\n\t\t\t\t'"
	 * @generated
	 */
	boolean isSubjectToWithholdingTax();

	/**
	 * Sets the value of the '{@link Taxation.Income_Type#isSubjectToWithholdingTax <em>Subject To Withholding Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject To Withholding Tax</em>' attribute.
	 * @see #isSubjectToWithholdingTax()
	 * @generated
	 */
	void setSubjectToWithholdingTax(boolean value);

	/**
	 * Returns the value of the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id8</em>' attribute.
	 * @see #setId8(String)
	 * @see Taxation.TaxationPackage#getIncome_Type_Id8()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId8();

	/**
	 * Sets the value of the '{@link Taxation.Income_Type#getId8 <em>Id8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id8</em>' attribute.
	 * @see #getId8()
	 * @generated
	 */
	void setId8(String value);

	/**
	 * Returns the value of the '<em><b>Income</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Taxation.Income#getIncome_type <em>Income type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' container reference.
	 * @see #setIncome(Income)
	 * @see Taxation.TaxationPackage#getIncome_Type_Income()
	 * @see Taxation.Income#getIncome_type
	 * @model opposite="income_type" required="true" transient="false"
	 * @generated
	 */
	Income getIncome();

	/**
	 * Sets the value of the '{@link Taxation.Income_Type#getIncome <em>Income</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income</em>' container reference.
	 * @see #getIncome()
	 * @generated
	 */
	void setIncome(Income value);

} // Income_Type
