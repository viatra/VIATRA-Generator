/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.impl;

import hu.bme.mit.inf.dslreasoner.domains.satellite.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
		case SatellitePackage.COMM_SUBSYSTEM:
			return createCommSubsystem();
		case SatellitePackage.DIRECTED_COMMUNICATION_LINK:
			return createDirectedCommunicationLink();
		case SatellitePackage.INTERFEROMETRY_PAYLOAD:
			return createInterferometryPayload();
		case SatellitePackage.CUBE_SAT3_U:
			return createCubeSat3U();
		case SatellitePackage.CUBE_SAT6_U:
			return createCubeSat6U();
		case SatellitePackage.SMALL_SAT:
			return createSmallSat();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SatellitePackage.TRANSCEIVER_BAND:
			return createTransceiverBandFromString(eDataType, initialValue);
		case SatellitePackage.ANTENNA_GAIN:
			return createAntennaGainFromString(eDataType, initialValue);
		case SatellitePackage.SPACECRAFT_KIND:
			return createSpacecraftKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SatellitePackage.TRANSCEIVER_BAND:
			return convertTransceiverBandToString(eDataType, instanceValue);
		case SatellitePackage.ANTENNA_GAIN:
			return convertAntennaGainToString(eDataType, instanceValue);
		case SatellitePackage.SPACECRAFT_KIND:
			return convertSpacecraftKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public CommSubsystem createCommSubsystem() {
		CommSubsystemImpl commSubsystem = new CommSubsystemImpl();
		return commSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedCommunicationLink createDirectedCommunicationLink() {
		DirectedCommunicationLinkImpl directedCommunicationLink = new DirectedCommunicationLinkImpl();
		return directedCommunicationLink;
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
	public TransceiverBand createTransceiverBandFromString(EDataType eDataType, String initialValue) {
		TransceiverBand result = TransceiverBand.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransceiverBandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntennaGain createAntennaGainFromString(EDataType eDataType, String initialValue) {
		AntennaGain result = AntennaGain.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAntennaGainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftKind createSpacecraftKindFromString(EDataType eDataType, String initialValue) {
		SpacecraftKind result = SpacecraftKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacecraftKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
