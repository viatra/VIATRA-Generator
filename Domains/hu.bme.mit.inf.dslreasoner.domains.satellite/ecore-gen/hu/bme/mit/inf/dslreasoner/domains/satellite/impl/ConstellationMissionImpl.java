/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.impl;

import hu.bme.mit.inf.dslreasoner.domains.satellite.ConstellationMission;
import hu.bme.mit.inf.dslreasoner.domains.satellite.GroundStationNetwork;
import hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage;
import hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.ConstellationMissionImpl#getGroundStationNetwork <em>Ground Station Network</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.ConstellationMissionImpl#getSpacecraft <em>Spacecraft</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConstellationMissionImpl extends MinimalEObjectImpl.Container implements ConstellationMission {
	/**
	 * The cached value of the '{@link #getGroundStationNetwork() <em>Ground Station Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStationNetwork()
	 * @generated
	 * @ordered
	 */
	protected GroundStationNetwork groundStationNetwork;

	/**
	 * The cached value of the '{@link #getSpacecraft() <em>Spacecraft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacecraft()
	 * @generated
	 * @ordered
	 */
	protected EList<Spacecraft> spacecraft;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationMissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SatellitePackage.Literals.CONSTELLATION_MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundStationNetwork getGroundStationNetwork() {
		return groundStationNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundStationNetwork(GroundStationNetwork newGroundStationNetwork,
			NotificationChain msgs) {
		GroundStationNetwork oldGroundStationNetwork = groundStationNetwork;
		groundStationNetwork = newGroundStationNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK, oldGroundStationNetwork,
					newGroundStationNetwork);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroundStationNetwork(GroundStationNetwork newGroundStationNetwork) {
		if (newGroundStationNetwork != groundStationNetwork) {
			NotificationChain msgs = null;
			if (groundStationNetwork != null)
				msgs = ((InternalEObject) groundStationNetwork).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK, null,
						msgs);
			if (newGroundStationNetwork != null)
				msgs = ((InternalEObject) newGroundStationNetwork).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK, null,
						msgs);
			msgs = basicSetGroundStationNetwork(newGroundStationNetwork, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK, newGroundStationNetwork,
					newGroundStationNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Spacecraft> getSpacecraft() {
		if (spacecraft == null) {
			spacecraft = new EObjectContainmentEList<Spacecraft>(Spacecraft.class, this,
					SatellitePackage.CONSTELLATION_MISSION__SPACECRAFT);
		}
		return spacecraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK:
			return basicSetGroundStationNetwork(null, msgs);
		case SatellitePackage.CONSTELLATION_MISSION__SPACECRAFT:
			return ((InternalEList<?>) getSpacecraft()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK:
			return getGroundStationNetwork();
		case SatellitePackage.CONSTELLATION_MISSION__SPACECRAFT:
			return getSpacecraft();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK:
			setGroundStationNetwork((GroundStationNetwork) newValue);
			return;
		case SatellitePackage.CONSTELLATION_MISSION__SPACECRAFT:
			getSpacecraft().clear();
			getSpacecraft().addAll((Collection<? extends Spacecraft>) newValue);
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
		case SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK:
			setGroundStationNetwork((GroundStationNetwork) null);
			return;
		case SatellitePackage.CONSTELLATION_MISSION__SPACECRAFT:
			getSpacecraft().clear();
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
		case SatellitePackage.CONSTELLATION_MISSION__GROUND_STATION_NETWORK:
			return groundStationNetwork != null;
		case SatellitePackage.CONSTELLATION_MISSION__SPACECRAFT:
			return spacecraft != null && !spacecraft.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationMissionImpl
