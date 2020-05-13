/**
 */
package TaxationWithRoot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS for Private Insurance and Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.DS_for_Private_Insurance_and_Plan#getPrivate_insurance_and_plan_category <em>Private insurance and plan category</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getDS_for_Private_Insurance_and_Plan()
 * @model
 * @generated
 */
public interface DS_for_Private_Insurance_and_Plan extends DS {
	/**
	 * Returns the value of the '<em><b>Private insurance and plan category</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Category_of_Private_Insurance_and_Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private insurance and plan category</em>' attribute.
	 * @see TaxationWithRoot.Category_of_Private_Insurance_and_Plan
	 * @see #setPrivate_insurance_and_plan_category(Category_of_Private_Insurance_and_Plan)
	 * @see TaxationWithRoot.TaxationPackage#getDS_for_Private_Insurance_and_Plan_Private_insurance_and_plan_category()
	 * @model required="true"
	 * @generated
	 */
	Category_of_Private_Insurance_and_Plan getPrivate_insurance_and_plan_category();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.DS_for_Private_Insurance_and_Plan#getPrivate_insurance_and_plan_category <em>Private insurance and plan category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private insurance and plan category</em>' attribute.
	 * @see TaxationWithRoot.Category_of_Private_Insurance_and_Plan
	 * @see #getPrivate_insurance_and_plan_category()
	 * @generated
	 */
	void setPrivate_insurance_and_plan_category(Category_of_Private_Insurance_and_Plan value);

} // DS_for_Private_Insurance_and_Plan
