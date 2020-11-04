/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Insurance and Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Private_Insurance_and_Plan#getCategory <em>Category</em>}</li>
 *   <li>{@link Taxation.Private_Insurance_and_Plan#getDuration_of_contract <em>Duration of contract</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getPrivate_Insurance_and_Plan()
 * @model
 * @generated
 */
public interface Private_Insurance_and_Plan extends Special_Expense_DS {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link Taxation.Category_of_Private_Insurance_and_Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @see #setCategory(Category_of_Private_Insurance_and_Plan)
	 * @see Taxation.TaxationPackage#getPrivate_Insurance_and_Plan_Category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Private_Insurance_and_Plan getCategory();

	/**
	 * Sets the value of the '{@link Taxation.Private_Insurance_and_Plan#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category_of_Private_Insurance_and_Plan value);

	/**
	 * Returns the value of the '<em><b>Duration of contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration of contract</em>' attribute.
	 * @see #setDuration_of_contract(int)
	 * @see Taxation.TaxationPackage#getPrivate_Insurance_and_Plan_Duration_of_contract()
	 * @model required="true"
	 * @generated
	 */
	int getDuration_of_contract();

	/**
	 * Sets the value of the '{@link Taxation.Private_Insurance_and_Plan#getDuration_of_contract <em>Duration of contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration of contract</em>' attribute.
	 * @see #getDuration_of_contract()
	 * @generated
	 */
	void setDuration_of_contract(int value);

} // Private_Insurance_and_Plan
