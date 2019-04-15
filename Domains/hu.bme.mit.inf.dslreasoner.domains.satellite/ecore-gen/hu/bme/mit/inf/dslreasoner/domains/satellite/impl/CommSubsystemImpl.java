/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.impl;

import hu.bme.mit.inf.dslreasoner.domains.satellite.AntennaGain;
import hu.bme.mit.inf.dslreasoner.domains.satellite.CommSubsystem;
import hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage;
import hu.bme.mit.inf.dslreasoner.domains.satellite.TransceiverBand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.CommSubsystemImpl#getBand <em>Band</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.CommSubsystemImpl#getGain <em>Gain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommSubsystemImpl extends MinimalEObjectImpl.Container implements CommSubsystem {
	/**
	 * The default value of the '{@link #getBand() <em>Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBand()
	 * @generated
	 * @ordered
	 */
	protected static final TransceiverBand BAND_EDEFAULT = TransceiverBand.UHF;

	/**
	 * The cached value of the '{@link #getBand() <em>Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBand()
	 * @generated
	 * @ordered
	 */
	protected TransceiverBand band = BAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected static final AntennaGain GAIN_EDEFAULT = AntennaGain.LOW;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected AntennaGain gain = GAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SatellitePackage.Literals.COMM_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransceiverBand getBand() {
		return band;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBand(TransceiverBand newBand) {
		TransceiverBand oldBand = band;
		band = newBand == null ? BAND_EDEFAULT : newBand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.COMM_SUBSYSTEM__BAND, oldBand,
					band));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntennaGain getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGain(AntennaGain newGain) {
		AntennaGain oldGain = gain;
		gain = newGain == null ? GAIN_EDEFAULT : newGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.COMM_SUBSYSTEM__GAIN, oldGain,
					gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SatellitePackage.COMM_SUBSYSTEM__BAND:
			return getBand();
		case SatellitePackage.COMM_SUBSYSTEM__GAIN:
			return getGain();
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
		case SatellitePackage.COMM_SUBSYSTEM__BAND:
			setBand((TransceiverBand) newValue);
			return;
		case SatellitePackage.COMM_SUBSYSTEM__GAIN:
			setGain((AntennaGain) newValue);
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
		case SatellitePackage.COMM_SUBSYSTEM__BAND:
			setBand(BAND_EDEFAULT);
			return;
		case SatellitePackage.COMM_SUBSYSTEM__GAIN:
			setGain(GAIN_EDEFAULT);
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
		case SatellitePackage.COMM_SUBSYSTEM__BAND:
			return band != BAND_EDEFAULT;
		case SatellitePackage.COMM_SUBSYSTEM__GAIN:
			return gain != GAIN_EDEFAULT;
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
		result.append(" (band: ");
		result.append(band);
		result.append(", gain: ");
		result.append(gain);
		result.append(')');
		return result.toString();
	}

} //CommSubsystemImpl
