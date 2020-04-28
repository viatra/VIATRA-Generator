/**
 */
package Taxation.impl;

import Taxation.FO;
import Taxation.TaxationPackage;
import Taxation.Type_of_Rate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.FOImpl#getRate_type_for_FO <em>Rate type for FO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FOImpl extends Professional_Expenses_DeductionImpl implements FO {
	/**
	 * The default value of the '{@link #getRate_type_for_FO() <em>Rate type for FO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate_type_for_FO()
	 * @generated
	 * @ordered
	 */
	protected static final Type_of_Rate RATE_TYPE_FOR_FO_EDEFAULT = Type_of_Rate.REGULAR;

	/**
	 * The cached value of the '{@link #getRate_type_for_FO() <em>Rate type for FO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate_type_for_FO()
	 * @generated
	 * @ordered
	 */
	protected Type_of_Rate rate_type_for_FO = RATE_TYPE_FOR_FO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.FO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type_of_Rate getRate_type_for_FO() {
		return rate_type_for_FO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRate_type_for_FO(Type_of_Rate newRate_type_for_FO) {
		Type_of_Rate oldRate_type_for_FO = rate_type_for_FO;
		rate_type_for_FO = newRate_type_for_FO == null ? RATE_TYPE_FOR_FO_EDEFAULT : newRate_type_for_FO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.FO__RATE_TYPE_FOR_FO, oldRate_type_for_FO, rate_type_for_FO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.FO__RATE_TYPE_FOR_FO:
				return getRate_type_for_FO();
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
			case TaxationPackage.FO__RATE_TYPE_FOR_FO:
				setRate_type_for_FO((Type_of_Rate)newValue);
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
			case TaxationPackage.FO__RATE_TYPE_FOR_FO:
				setRate_type_for_FO(RATE_TYPE_FOR_FO_EDEFAULT);
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
			case TaxationPackage.FO__RATE_TYPE_FOR_FO:
				return rate_type_for_FO != RATE_TYPE_FOR_FO_EDEFAULT;
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
		result.append(" (rate_type_for_FO: ");
		result.append(rate_type_for_FO);
		result.append(')');
		return result.toString();
	}

} //FOImpl
