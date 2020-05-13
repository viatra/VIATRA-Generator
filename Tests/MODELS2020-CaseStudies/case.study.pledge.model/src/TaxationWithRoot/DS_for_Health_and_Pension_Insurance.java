/**
 */
package TaxationWithRoot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS for Health and Pension Insurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.DS_for_Health_and_Pension_Insurance#getInsurance_category <em>Insurance category</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getDS_for_Health_and_Pension_Insurance()
 * @model
 * @generated
 */
public interface DS_for_Health_and_Pension_Insurance extends DS {
	/**
	 * Returns the value of the '<em><b>Insurance category</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Category_of_Health_and_Pension_Insurances}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance category</em>' attribute.
	 * @see TaxationWithRoot.Category_of_Health_and_Pension_Insurances
	 * @see #setInsurance_category(Category_of_Health_and_Pension_Insurances)
	 * @see TaxationWithRoot.TaxationPackage#getDS_for_Health_and_Pension_Insurance_Insurance_category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Health_and_Pension_Insurances getInsurance_category();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.DS_for_Health_and_Pension_Insurance#getInsurance_category <em>Insurance category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance category</em>' attribute.
	 * @see TaxationWithRoot.Category_of_Health_and_Pension_Insurances
	 * @see #getInsurance_category()
	 * @generated
	 */
	void setInsurance_category(Category_of_Health_and_Pension_Insurances value);

} // DS_for_Health_and_Pension_Insurance
