/**
 */
package satellite.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import satellite.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SatelliteFactoryImpl extends EFactoryImpl implements SatelliteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SatelliteFactory init() {
		try {
			SatelliteFactory theSatelliteFactory = (SatelliteFactory) EPackage.Registry.INSTANCE
					.getEFactory(SatellitePackage.eNS_URI);
			if (theSatelliteFactory != null) {
				return theSatelliteFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SatelliteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SatellitePackage.INTERFEROMETRY_MISSION:
			return createInterferometryMission();
		case SatellitePackage.GROUND_STATION_NETWORK:
			return createGroundStationNetwork();
		case SatellitePackage.INTERFEROMETRY_PAYLOAD:
			return createInterferometryPayload();
		case SatellitePackage.CUBE_SAT3_U:
			return createCubeSat3U();
		case SatellitePackage.CUBE_SAT6_U:
			return createCubeSat6U();
		case SatellitePackage.SMALL_SAT:
			return createSmallSat();
		case SatellitePackage.UHF_COMM_SUBSYSTEM:
			return createUHFCommSubsystem();
		case SatellitePackage.XCOMM_SUBSYSTEM:
			return createXCommSubsystem();
		case SatellitePackage.KA_COMM_SUBSYSTEM:
			return createKaCommSubsystem();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterferometryMission createInterferometryMission() {
		InterferometryMissionImpl interferometryMission = new InterferometryMissionImpl();
		return interferometryMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundStationNetwork createGroundStationNetwork() {
		GroundStationNetworkImpl groundStationNetwork = new GroundStationNetworkImpl();
		return groundStationNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterferometryPayload createInterferometryPayload() {
		InterferometryPayloadImpl interferometryPayload = new InterferometryPayloadImpl();
		return interferometryPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CubeSat3U createCubeSat3U() {
		CubeSat3UImpl cubeSat3U = new CubeSat3UImpl();
		return cubeSat3U;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CubeSat6U createCubeSat6U() {
		CubeSat6UImpl cubeSat6U = new CubeSat6UImpl();
		return cubeSat6U;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmallSat createSmallSat() {
		SmallSatImpl smallSat = new SmallSatImpl();
		return smallSat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UHFCommSubsystem createUHFCommSubsystem() {
		UHFCommSubsystemImpl uhfCommSubsystem = new UHFCommSubsystemImpl();
		return uhfCommSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XCommSubsystem createXCommSubsystem() {
		XCommSubsystemImpl xCommSubsystem = new XCommSubsystemImpl();
		return xCommSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KaCommSubsystem createKaCommSubsystem() {
		KaCommSubsystemImpl kaCommSubsystem = new KaCommSubsystemImpl();
		return kaCommSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SatellitePackage getSatellitePackage() {
		return (SatellitePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SatellitePackage getPackage() {
		return SatellitePackage.eINSTANCE;
	}

} //SatelliteFactoryImpl
