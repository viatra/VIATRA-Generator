/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.FO#getRate_type_for_FO <em>Rate type for FO</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getFO()
 * @model
 * @generated
 */
public interface FO extends Professional_Expenses_Deduction {
	/**
	 * Returns the value of the '<em><b>Rate type for FO</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Type_of_Rate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate type for FO</em>' attribute.
	 * @see Taxation.Type_of_Rate
	 * @see #setRate_type_for_FO(Type_of_Rate)
	 * @see Taxation.TaxationPackage#getFO_Rate_type_for_FO()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Type_of_Rate getRate_type_for_FO();

	/**
	 * Sets the value of the '{@link Taxation.FO#getRate_type_for_FO <em>Rate type for FO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate type for FO</em>' attribute.
	 * @see Taxation.Type_of_Rate
	 * @see #getRate_type_for_FO()
	 * @generated
	 */
	void setRate_type_for_FO(Type_of_Rate value);

} // FO
