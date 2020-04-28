/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extraordinary Expense CE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Extraordinary_Expense_CE#getThresholded_deduction_percentage <em>Thresholded deduction percentage</em>}</li>
 *   <li>{@link Taxation.Extraordinary_Expense_CE#getCe_type <em>Ce type</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getExtraordinary_Expense_CE()
 * @model
 * @generated
 */
public interface Extraordinary_Expense_CE extends Expense {
	/**
	 * Returns the value of the '<em><b>Thresholded deduction percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thresholded deduction percentage</em>' attribute.
	 * @see #setThresholded_deduction_percentage(double)
	 * @see Taxation.TaxationPackage#getExtraordinary_Expense_CE_Thresholded_deduction_percentage()
	 * @model required="true"
	 * @generated
	 */
	double getThresholded_deduction_percentage();

	/**
	 * Sets the value of the '{@link Taxation.Extraordinary_Expense_CE#getThresholded_deduction_percentage <em>Thresholded deduction percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thresholded deduction percentage</em>' attribute.
	 * @see #getThresholded_deduction_percentage()
	 * @generated
	 */
	void setThresholded_deduction_percentage(double value);

	/**
	 * Returns the value of the '<em><b>Ce type</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.CE_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ce type</em>' attribute.
	 * @see Taxation.CE_Type
	 * @see #setCe_type(CE_Type)
	 * @see Taxation.TaxationPackage#getExtraordinary_Expense_CE_Ce_type()
	 * @model required="true"
	 * @generated
	 */
	CE_Type getCe_type();

	/**
	 * Sets the value of the '{@link Taxation.Extraordinary_Expense_CE#getCe_type <em>Ce type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ce type</em>' attribute.
	 * @see Taxation.CE_Type
	 * @see #getCe_type()
	 * @generated
	 */
	void setCe_type(CE_Type value);

} // Extraordinary_Expense_CE
