/**
 */
package simpleScenario.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleScenario.Distance;
import simpleScenario.SeperationDistance;
import simpleScenario.SimpleScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seperation Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.impl.SeperationDistanceImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link simpleScenario.impl.SeperationDistanceImpl#getNumDistance <em>Num Distance</em>}</li>
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
	protected static final Distance DISTANCE_EDEFAULT = Distance.NEAR;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Distance distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumDistance() <em>Num Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double NUM_DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNumDistance() <em>Num Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumDistance()
	 * @generated
	 * @ordered
	 */
	protected double numDistance = NUM_DISTANCE_EDEFAULT;

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
	public Distance getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(Distance newDistance) {
		Distance oldDistance = distance;
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
	public double getNumDistance() {
		return numDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumDistance(double newNumDistance) {
		double oldNumDistance = numDistance;
		numDistance = newNumDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.SEPERATION_DISTANCE__NUM_DISTANCE, oldNumDistance, numDistance));
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
			case SimpleScenarioPackage.SEPERATION_DISTANCE__NUM_DISTANCE:
				return getNumDistance();
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
				setDistance((Distance)newValue);
				return;
			case SimpleScenarioPackage.SEPERATION_DISTANCE__NUM_DISTANCE:
				setNumDistance((Double)newValue);
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
			case SimpleScenarioPackage.SEPERATION_DISTANCE__NUM_DISTANCE:
				setNumDistance(NUM_DISTANCE_EDEFAULT);
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
			case SimpleScenarioPackage.SEPERATION_DISTANCE__NUM_DISTANCE:
				return numDistance != NUM_DISTANCE_EDEFAULT;
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
		result.append(", numDistance: ");
		result.append(numDistance);
		result.append(')');
		return result.toString();
	}

} //SeperationDistanceImpl
