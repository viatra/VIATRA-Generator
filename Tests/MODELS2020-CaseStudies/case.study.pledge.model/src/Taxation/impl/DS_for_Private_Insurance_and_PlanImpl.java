/**
 */
package Taxation.impl;

import Taxation.Category_of_Private_Insurance_and_Plan;
import Taxation.DS_for_Private_Insurance_and_Plan;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS for Private Insurance and Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.DS_for_Private_Insurance_and_PlanImpl#getPrivate_insurance_and_plan_category <em>Private insurance and plan category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DS_for_Private_Insurance_and_PlanImpl extends DSImpl implements DS_for_Private_Insurance_and_Plan {
	/**
	 * The default value of the '{@link #getPrivate_insurance_and_plan_category() <em>Private insurance and plan category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_insurance_and_plan_category()
	 * @generated
	 * @ordered
	 */
	protected static final Category_of_Private_Insurance_and_Plan PRIVATE_INSURANCE_AND_PLAN_CATEGORY_EDEFAULT = Category_of_Private_Insurance_and_Plan.PRIVATE_INSURANCE;

	/**
	 * The cached value of the '{@link #getPrivate_insurance_and_plan_category() <em>Private insurance and plan category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_insurance_and_plan_category()
	 * @generated
	 * @ordered
	 */
	protected Category_of_Private_Insurance_and_Plan private_insurance_and_plan_category = PRIVATE_INSURANCE_AND_PLAN_CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DS_for_Private_Insurance_and_PlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.DS_FOR_PRIVATE_INSURANCE_AND_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category_of_Private_Insurance_and_Plan getPrivate_insurance_and_plan_category() {
		return private_insurance_and_plan_category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivate_insurance_and_plan_category(Category_of_Private_Insurance_and_Plan newPrivate_insurance_and_plan_category) {
		Category_of_Private_Insurance_and_Plan oldPrivate_insurance_and_plan_category = private_insurance_and_plan_category;
		private_insurance_and_plan_category = newPrivate_insurance_and_plan_category == null ? PRIVATE_INSURANCE_AND_PLAN_CATEGORY_EDEFAULT : newPrivate_insurance_and_plan_category;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__PRIVATE_INSURANCE_AND_PLAN_CATEGORY, oldPrivate_insurance_and_plan_category, private_insurance_and_plan_category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__PRIVATE_INSURANCE_AND_PLAN_CATEGORY:
				return getPrivate_insurance_and_plan_category();
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
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__PRIVATE_INSURANCE_AND_PLAN_CATEGORY:
				setPrivate_insurance_and_plan_category((Category_of_Private_Insurance_and_Plan)newValue);
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
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__PRIVATE_INSURANCE_AND_PLAN_CATEGORY:
				setPrivate_insurance_and_plan_category(PRIVATE_INSURANCE_AND_PLAN_CATEGORY_EDEFAULT);
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
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__PRIVATE_INSURANCE_AND_PLAN_CATEGORY:
				return private_insurance_and_plan_category != PRIVATE_INSURANCE_AND_PLAN_CATEGORY_EDEFAULT;
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
		result.append(" (private_insurance_and_plan_category: ");
		result.append(private_insurance_and_plan_category);
		result.append(')');
		return result.toString();
	}

} //DS_for_Private_Insurance_and_PlanImpl
