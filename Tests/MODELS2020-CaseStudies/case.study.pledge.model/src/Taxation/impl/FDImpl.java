/**
 */
package Taxation.impl;

import Taxation.FD;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.FDImpl#getDistance_declared_in_january <em>Distance declared in january</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FDImpl extends Professional_Expenses_DeductionImpl implements FD {
	/**
	 * The default value of the '{@link #getDistance_declared_in_january() <em>Distance declared in january</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance_declared_in_january()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_DECLARED_IN_JANUARY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance_declared_in_january() <em>Distance declared in january</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance_declared_in_january()
	 * @generated
	 * @ordered
	 */
	protected double distance_declared_in_january = DISTANCE_DECLARED_IN_JANUARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.FD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDistance_declared_in_january() {
		return distance_declared_in_january;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance_declared_in_january(double newDistance_declared_in_january) {
		double oldDistance_declared_in_january = distance_declared_in_january;
		distance_declared_in_january = newDistance_declared_in_january;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.FD__DISTANCE_DECLARED_IN_JANUARY, oldDistance_declared_in_january, distance_declared_in_january));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.FD__DISTANCE_DECLARED_IN_JANUARY:
				return getDistance_declared_in_january();
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
			case TaxationPackage.FD__DISTANCE_DECLARED_IN_JANUARY:
				setDistance_declared_in_january((Double)newValue);
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
			case TaxationPackage.FD__DISTANCE_DECLARED_IN_JANUARY:
				setDistance_declared_in_january(DISTANCE_DECLARED_IN_JANUARY_EDEFAULT);
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
			case TaxationPackage.FD__DISTANCE_DECLARED_IN_JANUARY:
				return distance_declared_in_january != DISTANCE_DECLARED_IN_JANUARY_EDEFAULT;
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
		result.append(" (distance_declared_in_january: ");
		result.append(distance_declared_in_january);
		result.append(')');
		return result.toString();
	}

} //FDImpl
