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
 *   <li>{@link Taxation.impl.DS_for_Private_Insurance_and_PlanImpl#getIncrease_for_life_insurance <em>Increase for life insurance</em>}</li>
 *   <li>{@link Taxation.impl.DS_for_Private_Insurance_and_PlanImpl#getMaximum_deductible_amount_for_private_insurance <em>Maximum deductible amount for private insurance</em>}</li>
 *   <li>{@link Taxation.impl.DS_for_Private_Insurance_and_PlanImpl#getMaximum_deductible_amount_for_old_age_pension_plan <em>Maximum deductible amount for old age pension plan</em>}</li>
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
	 * The default value of the '{@link #getIncrease_for_life_insurance() <em>Increase for life insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrease_for_life_insurance()
	 * @generated
	 * @ordered
	 */
	protected static final double INCREASE_FOR_LIFE_INSURANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncrease_for_life_insurance() <em>Increase for life insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrease_for_life_insurance()
	 * @generated
	 * @ordered
	 */
	protected double increase_for_life_insurance = INCREASE_FOR_LIFE_INSURANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_deductible_amount_for_private_insurance() <em>Maximum deductible amount for private insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_deductible_amount_for_private_insurance()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum_deductible_amount_for_private_insurance() <em>Maximum deductible amount for private insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_deductible_amount_for_private_insurance()
	 * @generated
	 * @ordered
	 */
	protected double maximum_deductible_amount_for_private_insurance = MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_deductible_amount_for_old_age_pension_plan() <em>Maximum deductible amount for old age pension plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_deductible_amount_for_old_age_pension_plan()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum_deductible_amount_for_old_age_pension_plan() <em>Maximum deductible amount for old age pension plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_deductible_amount_for_old_age_pension_plan()
	 * @generated
	 * @ordered
	 */
	protected double maximum_deductible_amount_for_old_age_pension_plan = MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN_EDEFAULT;

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
	public double getIncrease_for_life_insurance() {
		return increase_for_life_insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrease_for_life_insurance(double newIncrease_for_life_insurance) {
		double oldIncrease_for_life_insurance = increase_for_life_insurance;
		increase_for_life_insurance = newIncrease_for_life_insurance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__INCREASE_FOR_LIFE_INSURANCE, oldIncrease_for_life_insurance, increase_for_life_insurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximum_deductible_amount_for_private_insurance() {
		return maximum_deductible_amount_for_private_insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum_deductible_amount_for_private_insurance(double newMaximum_deductible_amount_for_private_insurance) {
		double oldMaximum_deductible_amount_for_private_insurance = maximum_deductible_amount_for_private_insurance;
		maximum_deductible_amount_for_private_insurance = newMaximum_deductible_amount_for_private_insurance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE, oldMaximum_deductible_amount_for_private_insurance, maximum_deductible_amount_for_private_insurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximum_deductible_amount_for_old_age_pension_plan() {
		return maximum_deductible_amount_for_old_age_pension_plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum_deductible_amount_for_old_age_pension_plan(double newMaximum_deductible_amount_for_old_age_pension_plan) {
		double oldMaximum_deductible_amount_for_old_age_pension_plan = maximum_deductible_amount_for_old_age_pension_plan;
		maximum_deductible_amount_for_old_age_pension_plan = newMaximum_deductible_amount_for_old_age_pension_plan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN, oldMaximum_deductible_amount_for_old_age_pension_plan, maximum_deductible_amount_for_old_age_pension_plan));
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
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__INCREASE_FOR_LIFE_INSURANCE:
				return getIncrease_for_life_insurance();
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE:
				return getMaximum_deductible_amount_for_private_insurance();
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN:
				return getMaximum_deductible_amount_for_old_age_pension_plan();
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
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__INCREASE_FOR_LIFE_INSURANCE:
				setIncrease_for_life_insurance((Double)newValue);
				return;
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE:
				setMaximum_deductible_amount_for_private_insurance((Double)newValue);
				return;
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN:
				setMaximum_deductible_amount_for_old_age_pension_plan((Double)newValue);
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
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__INCREASE_FOR_LIFE_INSURANCE:
				setIncrease_for_life_insurance(INCREASE_FOR_LIFE_INSURANCE_EDEFAULT);
				return;
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE:
				setMaximum_deductible_amount_for_private_insurance(MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE_EDEFAULT);
				return;
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN:
				setMaximum_deductible_amount_for_old_age_pension_plan(MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN_EDEFAULT);
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
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__INCREASE_FOR_LIFE_INSURANCE:
				return increase_for_life_insurance != INCREASE_FOR_LIFE_INSURANCE_EDEFAULT;
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE:
				return maximum_deductible_amount_for_private_insurance != MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE_EDEFAULT;
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN:
				return maximum_deductible_amount_for_old_age_pension_plan != MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN_EDEFAULT;
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
		result.append(", increase_for_life_insurance: ");
		result.append(increase_for_life_insurance);
		result.append(", maximum_deductible_amount_for_private_insurance: ");
		result.append(maximum_deductible_amount_for_private_insurance);
		result.append(", maximum_deductible_amount_for_old_age_pension_plan: ");
		result.append(maximum_deductible_amount_for_old_age_pension_plan);
		result.append(')');
		return result.toString();
	}

} //DS_for_Private_Insurance_and_PlanImpl
