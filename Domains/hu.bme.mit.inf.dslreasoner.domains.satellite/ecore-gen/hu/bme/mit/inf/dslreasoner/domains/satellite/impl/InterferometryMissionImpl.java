/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.impl;

import hu.bme.mit.inf.dslreasoner.domains.satellite.InterferometryMission;
import hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interferometry Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.InterferometryMissionImpl#getObservationTime <em>Observation Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterferometryMissionImpl extends ConstellationMissionImpl implements InterferometryMission {
	/**
	 * The default value of the '{@link #getObservationTime() <em>Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationTime()
	 * @generated
	 * @ordered
	 */
	protected static final float OBSERVATION_TIME_EDEFAULT = 2.0F;

	/**
	 * The cached value of the '{@link #getObservationTime() <em>Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservationTime()
	 * @generated
	 * @ordered
	 */
	protected float observationTime = OBSERVATION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterferometryMissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SatellitePackage.Literals.INTERFEROMETRY_MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getObservationTime() {
		return observationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservationTime(float newObservationTime) {
		float oldObservationTime = observationTime;
		observationTime = newObservationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SatellitePackage.INTERFEROMETRY_MISSION__OBSERVATION_TIME, oldObservationTime, observationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SatellitePackage.INTERFEROMETRY_MISSION__OBSERVATION_TIME:
			return getObservationTime();
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
		case SatellitePackage.INTERFEROMETRY_MISSION__OBSERVATION_TIME:
			setObservationTime((Float) newValue);
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
		case SatellitePackage.INTERFEROMETRY_MISSION__OBSERVATION_TIME:
			setObservationTime(OBSERVATION_TIME_EDEFAULT);
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
		case SatellitePackage.INTERFEROMETRY_MISSION__OBSERVATION_TIME:
			return observationTime != OBSERVATION_TIME_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (observationTime: ");
		result.append(observationTime);
		result.append(')');
		return result.toString();
	}

} //InterferometryMissionImpl
