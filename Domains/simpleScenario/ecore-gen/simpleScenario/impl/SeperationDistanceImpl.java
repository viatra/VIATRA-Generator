/**
 */
package simpleScenario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleScenario.SeperationDistance;
import simpleScenario.SimpleScenarioPackage;
import simpleScenario.Size;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seperation Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.impl.SeperationDistanceImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeperationDistanceImpl extends SpatialRelationImpl implements SeperationDistance {
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Size DISTANCE_EDEFAULT = Size.SMALL;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Size distance = DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeperationDistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleScenarioPackage.Literals.SEPERATION_DISTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(Size newDistance) {
		Size oldDistance = distance;
		distance = newDistance == null ? DISTANCE_EDEFAULT : newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.SEPERATION_DISTANCE__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleScenarioPackage.SEPERATION_DISTANCE__DISTANCE:
				return getDistance();
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
			case SimpleScenarioPackage.SEPERATION_DISTANCE__DISTANCE:
				setDistance((Size)newValue);
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
			case SimpleScenarioPackage.SEPERATION_DISTANCE__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
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
			case SimpleScenarioPackage.SEPERATION_DISTANCE__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
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
		result.append(" (distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //SeperationDistanceImpl
