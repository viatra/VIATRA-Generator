/**
 */
package Taxation.impl;

import Taxation.Category_of_Health_and_Pension_Insurances;
import Taxation.Health_and_Pension_Insurance;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health and Pension Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Health_and_Pension_InsuranceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link Taxation.impl.Health_and_Pension_InsuranceImpl#isIs_related_to_additional_salary <em>Is related to additional salary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Health_and_Pension_InsuranceImpl extends Special_Expense_DSImpl implements Health_and_Pension_Insurance {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category_of_Health_and_Pension_Insurances CATEGORY_EDEFAULT = Category_of_Health_and_Pension_Insurances.MANDATORY_HEALTH_AND_PENSION_INSURANCE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category_of_Health_and_Pension_Insurances category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_related_to_additional_salary() <em>Is related to additional salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_related_to_additional_salary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELATED_TO_ADDITIONAL_SALARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_related_to_additional_salary() <em>Is related to additional salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_related_to_additional_salary()
	 * @generated
	 * @ordered
	 */
	protected boolean is_related_to_additional_salary = IS_RELATED_TO_ADDITIONAL_SALARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Health_and_Pension_InsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.HEALTH_AND_PENSION_INSURANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category_of_Health_and_Pension_Insurances getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Category_of_Health_and_Pension_Insurances newCategory) {
		Category_of_Health_and_Pension_Insurances oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.HEALTH_AND_PENSION_INSURANCE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_related_to_additional_salary() {
		return is_related_to_additional_salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_related_to_additional_salary(boolean newIs_related_to_additional_salary) {
		boolean oldIs_related_to_additional_salary = is_related_to_additional_salary;
		is_related_to_additional_salary = newIs_related_to_additional_salary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY, oldIs_related_to_additional_salary, is_related_to_additional_salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__CATEGORY:
				return getCategory();
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY:
				return isIs_related_to_additional_salary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__CATEGORY:
				setCategory((Category_of_Health_and_Pension_Insurances)newValue);
				return;
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY:
				setIs_related_to_additional_salary((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY:
				setIs_related_to_additional_salary(IS_RELATED_TO_ADDITIONAL_SALARY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY:
				return is_related_to_additional_salary != IS_RELATED_TO_ADDITIONAL_SALARY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (category: ");
		result.append(category);
		result.append(", is_related_to_additional_salary: ");
		result.append(is_related_to_additional_salary);
		result.append(')');
		return result.toString();
	}

} //Health_and_Pension_InsuranceImpl
