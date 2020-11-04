/**
 */
package Taxation.impl;

import Taxation.Category_of_Health_and_Pension_Insurances;
import Taxation.DS_for_Health_and_Pension_Insurance;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS for Health and Pension Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.DS_for_Health_and_Pension_InsuranceImpl#getInsurance_category <em>Insurance category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DS_for_Health_and_Pension_InsuranceImpl extends DSImpl implements DS_for_Health_and_Pension_Insurance {
	/**
	 * The default value of the '{@link #getInsurance_category() <em>Insurance category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance_category()
	 * @generated
	 * @ordered
	 */
	protected static final Category_of_Health_and_Pension_Insurances INSURANCE_CATEGORY_EDEFAULT = Category_of_Health_and_Pension_Insurances.MANDATORY_HEALTH_AND_PENSION_INSURANCE;

	/**
	 * The cached value of the '{@link #getInsurance_category() <em>Insurance category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance_category()
	 * @generated
	 * @ordered
	 */
	protected Category_of_Health_and_Pension_Insurances insurance_category = INSURANCE_CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DS_for_Health_and_Pension_InsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.DS_FOR_HEALTH_AND_PENSION_INSURANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category_of_Health_and_Pension_Insurances getInsurance_category() {
		return insurance_category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsurance_category(Category_of_Health_and_Pension_Insurances newInsurance_category) {
		Category_of_Health_and_Pension_Insurances oldInsurance_category = insurance_category;
		insurance_category = newInsurance_category == null ? INSURANCE_CATEGORY_EDEFAULT : newInsurance_category;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS_FOR_HEALTH_AND_PENSION_INSURANCE__INSURANCE_CATEGORY, oldInsurance_category, insurance_category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.DS_FOR_HEALTH_AND_PENSION_INSURANCE__INSURANCE_CATEGORY:
				return getInsurance_category();
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
			case TaxationPackage.DS_FOR_HEALTH_AND_PENSION_INSURANCE__INSURANCE_CATEGORY:
				setInsurance_category((Category_of_Health_and_Pension_Insurances)newValue);
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
			case TaxationPackage.DS_FOR_HEALTH_AND_PENSION_INSURANCE__INSURANCE_CATEGORY:
				setInsurance_category(INSURANCE_CATEGORY_EDEFAULT);
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
			case TaxationPackage.DS_FOR_HEALTH_AND_PENSION_INSURANCE__INSURANCE_CATEGORY:
				return insurance_category != INSURANCE_CATEGORY_EDEFAULT;
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
		result.append(" (insurance_category: ");
		result.append(insurance_category);
		result.append(')');
		return result.toString();
	}

} //DS_for_Health_and_Pension_InsuranceImpl
