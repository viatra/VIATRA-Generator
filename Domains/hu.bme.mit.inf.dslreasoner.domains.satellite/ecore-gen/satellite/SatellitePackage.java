/**
 */
package satellite;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see satellite.SatelliteFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.viatra.query.querybasedfeature'"
 * @generated
 */
public interface SatellitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "satellite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/satellite";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "satellite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SatellitePackage eINSTANCE = satellite.impl.SatellitePackageImpl.init();

	/**
	 * The meta object id for the '{@link satellite.impl.ConstellationMissionImpl <em>Constellation Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.ConstellationMissionImpl
	 * @see satellite.impl.SatellitePackageImpl#getConstellationMission()
	 * @generated
	 */
	int CONSTELLATION_MISSION = 0;

	/**
	 * The feature id for the '<em><b>Ground Station Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_MISSION__GROUND_STATION_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Spacecraft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_MISSION__SPACECRAFT = 1;

	/**
	 * The number of structural features of the '<em>Constellation Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_MISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constellation Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTELLATION_MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link satellite.impl.InterferometryMissionImpl <em>Interferometry Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.InterferometryMissionImpl
	 * @see satellite.impl.SatellitePackageImpl#getInterferometryMission()
	 * @generated
	 */
	int INTERFEROMETRY_MISSION = 1;

	/**
	 * The feature id for the '<em><b>Ground Station Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_MISSION__GROUND_STATION_NETWORK = CONSTELLATION_MISSION__GROUND_STATION_NETWORK;

	/**
	 * The feature id for the '<em><b>Spacecraft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_MISSION__SPACECRAFT = CONSTELLATION_MISSION__SPACECRAFT;

	/**
	 * The feature id for the '<em><b>Observation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_MISSION__OBSERVATION_TIME = CONSTELLATION_MISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interferometry Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_MISSION_FEATURE_COUNT = CONSTELLATION_MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interferometry Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_MISSION_OPERATION_COUNT = CONSTELLATION_MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.CommunicatingElementImpl <em>Communicating Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.CommunicatingElementImpl
	 * @see satellite.impl.SatellitePackageImpl#getCommunicatingElement()
	 * @generated
	 */
	int COMMUNICATING_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ELEMENT__COMM_SUBSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ELEMENT__COMMUNICATION_LINK = 1;

	/**
	 * The number of structural features of the '<em>Communicating Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Communicating Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link satellite.impl.GroundStationNetworkImpl <em>Ground Station Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.GroundStationNetworkImpl
	 * @see satellite.impl.SatellitePackageImpl#getGroundStationNetwork()
	 * @generated
	 */
	int GROUND_STATION_NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_NETWORK__COMM_SUBSYSTEM = COMMUNICATING_ELEMENT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_NETWORK__COMMUNICATION_LINK = COMMUNICATING_ELEMENT__COMMUNICATION_LINK;

	/**
	 * The number of structural features of the '<em>Ground Station Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_NETWORK_FEATURE_COUNT = COMMUNICATING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ground Station Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_NETWORK_OPERATION_COUNT = COMMUNICATING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.SpacecraftImpl <em>Spacecraft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.SpacecraftImpl
	 * @see satellite.impl.SatellitePackageImpl#getSpacecraft()
	 * @generated
	 */
	int SPACECRAFT = 4;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__COMM_SUBSYSTEM = COMMUNICATING_ELEMENT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__COMMUNICATION_LINK = COMMUNICATING_ELEMENT__COMMUNICATION_LINK;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__PAYLOAD = COMMUNICATING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__KIND = COMMUNICATING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spacecraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_FEATURE_COUNT = COMMUNICATING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Spacecraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_OPERATION_COUNT = COMMUNICATING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.CommSubsystemImpl <em>Comm Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.CommSubsystemImpl
	 * @see satellite.impl.SatellitePackageImpl#getCommSubsystem()
	 * @generated
	 */
	int COMM_SUBSYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Band</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM__BAND = 0;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM__GAIN = 1;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM__COMMUNICATION_LINK = 2;

	/**
	 * The number of structural features of the '<em>Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link satellite.impl.DirectedCommunicationLinkImpl <em>Directed Communication Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.DirectedCommunicationLinkImpl
	 * @see satellite.impl.SatellitePackageImpl#getDirectedCommunicationLink()
	 * @generated
	 */
	int DIRECTED_COMMUNICATION_LINK = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_COMMUNICATION_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_COMMUNICATION_LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Directed Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_COMMUNICATION_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Directed Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_COMMUNICATION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link satellite.impl.PayloadImpl <em>Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.PayloadImpl
	 * @see satellite.impl.SatellitePackageImpl#getPayload()
	 * @generated
	 */
	int PAYLOAD = 7;

	/**
	 * The number of structural features of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link satellite.impl.InterferometryPayloadImpl <em>Interferometry Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.InterferometryPayloadImpl
	 * @see satellite.impl.SatellitePackageImpl#getInterferometryPayload()
	 * @generated
	 */
	int INTERFEROMETRY_PAYLOAD = 8;

	/**
	 * The number of structural features of the '<em>Interferometry Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_PAYLOAD_FEATURE_COUNT = PAYLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interferometry Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_PAYLOAD_OPERATION_COUNT = PAYLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.CubeSatImpl <em>Cube Sat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.CubeSatImpl
	 * @see satellite.impl.SatellitePackageImpl#getCubeSat()
	 * @generated
	 */
	int CUBE_SAT = 12;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT__COMM_SUBSYSTEM = SPACECRAFT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT__COMMUNICATION_LINK = SPACECRAFT__COMMUNICATION_LINK;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT__PAYLOAD = SPACECRAFT__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT__KIND = SPACECRAFT__KIND;

	/**
	 * The number of structural features of the '<em>Cube Sat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT_FEATURE_COUNT = SPACECRAFT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cube Sat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT_OPERATION_COUNT = SPACECRAFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.CubeSat3UImpl <em>Cube Sat3 U</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.CubeSat3UImpl
	 * @see satellite.impl.SatellitePackageImpl#getCubeSat3U()
	 * @generated
	 */
	int CUBE_SAT3_U = 9;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U__COMM_SUBSYSTEM = CUBE_SAT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U__COMMUNICATION_LINK = CUBE_SAT__COMMUNICATION_LINK;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U__PAYLOAD = CUBE_SAT__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U__KIND = CUBE_SAT__KIND;

	/**
	 * The number of structural features of the '<em>Cube Sat3 U</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U_FEATURE_COUNT = CUBE_SAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cube Sat3 U</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U_OPERATION_COUNT = CUBE_SAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.CubeSat6UImpl <em>Cube Sat6 U</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.CubeSat6UImpl
	 * @see satellite.impl.SatellitePackageImpl#getCubeSat6U()
	 * @generated
	 */
	int CUBE_SAT6_U = 10;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U__COMM_SUBSYSTEM = CUBE_SAT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U__COMMUNICATION_LINK = CUBE_SAT__COMMUNICATION_LINK;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U__PAYLOAD = CUBE_SAT__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U__KIND = CUBE_SAT__KIND;

	/**
	 * The number of structural features of the '<em>Cube Sat6 U</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U_FEATURE_COUNT = CUBE_SAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cube Sat6 U</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U_OPERATION_COUNT = CUBE_SAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.SmallSatImpl <em>Small Sat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.SmallSatImpl
	 * @see satellite.impl.SatellitePackageImpl#getSmallSat()
	 * @generated
	 */
	int SMALL_SAT = 11;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT__COMM_SUBSYSTEM = SPACECRAFT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Communication Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT__COMMUNICATION_LINK = SPACECRAFT__COMMUNICATION_LINK;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT__PAYLOAD = SPACECRAFT__PAYLOAD;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT__KIND = SPACECRAFT__KIND;

	/**
	 * The number of structural features of the '<em>Small Sat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT_FEATURE_COUNT = SPACECRAFT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Small Sat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT_OPERATION_COUNT = SPACECRAFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.TransceiverBand <em>Transceiver Band</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.TransceiverBand
	 * @see satellite.impl.SatellitePackageImpl#getTransceiverBand()
	 * @generated
	 */
	int TRANSCEIVER_BAND = 13;

	/**
	 * The meta object id for the '{@link satellite.AntennaGain <em>Antenna Gain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.AntennaGain
	 * @see satellite.impl.SatellitePackageImpl#getAntennaGain()
	 * @generated
	 */
	int ANTENNA_GAIN = 14;

	/**
	 * The meta object id for the '{@link satellite.SpacecraftKind <em>Spacecraft Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.SpacecraftKind
	 * @see satellite.impl.SatellitePackageImpl#getSpacecraftKind()
	 * @generated
	 */
	int SPACECRAFT_KIND = 15;

	/**
	 * Returns the meta object for class '{@link satellite.ConstellationMission <em>Constellation Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constellation Mission</em>'.
	 * @see satellite.ConstellationMission
	 * @generated
	 */
	EClass getConstellationMission();

	/**
	 * Returns the meta object for the containment reference '{@link satellite.ConstellationMission#getGroundStationNetwork <em>Ground Station Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Station Network</em>'.
	 * @see satellite.ConstellationMission#getGroundStationNetwork()
	 * @see #getConstellationMission()
	 * @generated
	 */
	EReference getConstellationMission_GroundStationNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link satellite.ConstellationMission#getSpacecraft <em>Spacecraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spacecraft</em>'.
	 * @see satellite.ConstellationMission#getSpacecraft()
	 * @see #getConstellationMission()
	 * @generated
	 */
	EReference getConstellationMission_Spacecraft();

	/**
	 * Returns the meta object for class '{@link satellite.InterferometryMission <em>Interferometry Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interferometry Mission</em>'.
	 * @see satellite.InterferometryMission
	 * @generated
	 */
	EClass getInterferometryMission();

	/**
	 * Returns the meta object for the attribute '{@link satellite.InterferometryMission#getObservationTime <em>Observation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observation Time</em>'.
	 * @see satellite.InterferometryMission#getObservationTime()
	 * @see #getInterferometryMission()
	 * @generated
	 */
	EAttribute getInterferometryMission_ObservationTime();

	/**
	 * Returns the meta object for class '{@link satellite.CommunicatingElement <em>Communicating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicating Element</em>'.
	 * @see satellite.CommunicatingElement
	 * @generated
	 */
	EClass getCommunicatingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link satellite.CommunicatingElement#getCommSubsystem <em>Comm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm Subsystem</em>'.
	 * @see satellite.CommunicatingElement#getCommSubsystem()
	 * @see #getCommunicatingElement()
	 * @generated
	 */
	EReference getCommunicatingElement_CommSubsystem();

	/**
	 * Returns the meta object for the reference '{@link satellite.CommunicatingElement#getCommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Link</em>'.
	 * @see satellite.CommunicatingElement#getCommunicationLink()
	 * @see #getCommunicatingElement()
	 * @generated
	 */
	EReference getCommunicatingElement_CommunicationLink();

	/**
	 * Returns the meta object for class '{@link satellite.GroundStationNetwork <em>Ground Station Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Station Network</em>'.
	 * @see satellite.GroundStationNetwork
	 * @generated
	 */
	EClass getGroundStationNetwork();

	/**
	 * Returns the meta object for class '{@link satellite.Spacecraft <em>Spacecraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft</em>'.
	 * @see satellite.Spacecraft
	 * @generated
	 */
	EClass getSpacecraft();

	/**
	 * Returns the meta object for the containment reference '{@link satellite.Spacecraft#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload</em>'.
	 * @see satellite.Spacecraft#getPayload()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EReference getSpacecraft_Payload();

	/**
	 * Returns the meta object for the attribute '{@link satellite.Spacecraft#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see satellite.Spacecraft#getKind()
	 * @see #getSpacecraft()
	 * @generated
	 */
	EAttribute getSpacecraft_Kind();

	/**
	 * Returns the meta object for class '{@link satellite.CommSubsystem <em>Comm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Subsystem</em>'.
	 * @see satellite.CommSubsystem
	 * @generated
	 */
	EClass getCommSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link satellite.CommSubsystem#getBand <em>Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Band</em>'.
	 * @see satellite.CommSubsystem#getBand()
	 * @see #getCommSubsystem()
	 * @generated
	 */
	EAttribute getCommSubsystem_Band();

	/**
	 * Returns the meta object for the attribute '{@link satellite.CommSubsystem#getGain <em>Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gain</em>'.
	 * @see satellite.CommSubsystem#getGain()
	 * @see #getCommSubsystem()
	 * @generated
	 */
	EAttribute getCommSubsystem_Gain();

	/**
	 * Returns the meta object for the containment reference '{@link satellite.CommSubsystem#getCommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Link</em>'.
	 * @see satellite.CommSubsystem#getCommunicationLink()
	 * @see #getCommSubsystem()
	 * @generated
	 */
	EReference getCommSubsystem_CommunicationLink();

	/**
	 * Returns the meta object for class '{@link satellite.DirectedCommunicationLink <em>Directed Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Communication Link</em>'.
	 * @see satellite.DirectedCommunicationLink
	 * @generated
	 */
	EClass getDirectedCommunicationLink();

	/**
	 * Returns the meta object for the reference '{@link satellite.DirectedCommunicationLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see satellite.DirectedCommunicationLink#getSource()
	 * @see #getDirectedCommunicationLink()
	 * @generated
	 */
	EReference getDirectedCommunicationLink_Source();

	/**
	 * Returns the meta object for the reference '{@link satellite.DirectedCommunicationLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see satellite.DirectedCommunicationLink#getTarget()
	 * @see #getDirectedCommunicationLink()
	 * @generated
	 */
	EReference getDirectedCommunicationLink_Target();

	/**
	 * Returns the meta object for class '{@link satellite.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload</em>'.
	 * @see satellite.Payload
	 * @generated
	 */
	EClass getPayload();

	/**
	 * Returns the meta object for class '{@link satellite.InterferometryPayload <em>Interferometry Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interferometry Payload</em>'.
	 * @see satellite.InterferometryPayload
	 * @generated
	 */
	EClass getInterferometryPayload();

	/**
	 * Returns the meta object for class '{@link satellite.CubeSat3U <em>Cube Sat3 U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Sat3 U</em>'.
	 * @see satellite.CubeSat3U
	 * @generated
	 */
	EClass getCubeSat3U();

	/**
	 * Returns the meta object for class '{@link satellite.CubeSat6U <em>Cube Sat6 U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Sat6 U</em>'.
	 * @see satellite.CubeSat6U
	 * @generated
	 */
	EClass getCubeSat6U();

	/**
	 * Returns the meta object for class '{@link satellite.SmallSat <em>Small Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Sat</em>'.
	 * @see satellite.SmallSat
	 * @generated
	 */
	EClass getSmallSat();

	/**
	 * Returns the meta object for class '{@link satellite.CubeSat <em>Cube Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Sat</em>'.
	 * @see satellite.CubeSat
	 * @generated
	 */
	EClass getCubeSat();

	/**
	 * Returns the meta object for enum '{@link satellite.TransceiverBand <em>Transceiver Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transceiver Band</em>'.
	 * @see satellite.TransceiverBand
	 * @generated
	 */
	EEnum getTransceiverBand();

	/**
	 * Returns the meta object for enum '{@link satellite.AntennaGain <em>Antenna Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Antenna Gain</em>'.
	 * @see satellite.AntennaGain
	 * @generated
	 */
	EEnum getAntennaGain();

	/**
	 * Returns the meta object for enum '{@link satellite.SpacecraftKind <em>Spacecraft Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spacecraft Kind</em>'.
	 * @see satellite.SpacecraftKind
	 * @generated
	 */
	EEnum getSpacecraftKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SatelliteFactory getSatelliteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link satellite.impl.ConstellationMissionImpl <em>Constellation Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.ConstellationMissionImpl
		 * @see satellite.impl.SatellitePackageImpl#getConstellationMission()
		 * @generated
		 */
		EClass CONSTELLATION_MISSION = eINSTANCE.getConstellationMission();

		/**
		 * The meta object literal for the '<em><b>Ground Station Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_MISSION__GROUND_STATION_NETWORK = eINSTANCE
				.getConstellationMission_GroundStationNetwork();

		/**
		 * The meta object literal for the '<em><b>Spacecraft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTELLATION_MISSION__SPACECRAFT = eINSTANCE.getConstellationMission_Spacecraft();

		/**
		 * The meta object literal for the '{@link satellite.impl.InterferometryMissionImpl <em>Interferometry Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.InterferometryMissionImpl
		 * @see satellite.impl.SatellitePackageImpl#getInterferometryMission()
		 * @generated
		 */
		EClass INTERFEROMETRY_MISSION = eINSTANCE.getInterferometryMission();

		/**
		 * The meta object literal for the '<em><b>Observation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFEROMETRY_MISSION__OBSERVATION_TIME = eINSTANCE.getInterferometryMission_ObservationTime();

		/**
		 * The meta object literal for the '{@link satellite.impl.CommunicatingElementImpl <em>Communicating Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.CommunicatingElementImpl
		 * @see satellite.impl.SatellitePackageImpl#getCommunicatingElement()
		 * @generated
		 */
		EClass COMMUNICATING_ELEMENT = eINSTANCE.getCommunicatingElement();

		/**
		 * The meta object literal for the '<em><b>Comm Subsystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATING_ELEMENT__COMM_SUBSYSTEM = eINSTANCE.getCommunicatingElement_CommSubsystem();

		/**
		 * The meta object literal for the '<em><b>Communication Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATING_ELEMENT__COMMUNICATION_LINK = eINSTANCE.getCommunicatingElement_CommunicationLink();

		/**
		 * The meta object literal for the '{@link satellite.impl.GroundStationNetworkImpl <em>Ground Station Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.GroundStationNetworkImpl
		 * @see satellite.impl.SatellitePackageImpl#getGroundStationNetwork()
		 * @generated
		 */
		EClass GROUND_STATION_NETWORK = eINSTANCE.getGroundStationNetwork();

		/**
		 * The meta object literal for the '{@link satellite.impl.SpacecraftImpl <em>Spacecraft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.SpacecraftImpl
		 * @see satellite.impl.SatellitePackageImpl#getSpacecraft()
		 * @generated
		 */
		EClass SPACECRAFT = eINSTANCE.getSpacecraft();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT__PAYLOAD = eINSTANCE.getSpacecraft_Payload();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT__KIND = eINSTANCE.getSpacecraft_Kind();

		/**
		 * The meta object literal for the '{@link satellite.impl.CommSubsystemImpl <em>Comm Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.CommSubsystemImpl
		 * @see satellite.impl.SatellitePackageImpl#getCommSubsystem()
		 * @generated
		 */
		EClass COMM_SUBSYSTEM = eINSTANCE.getCommSubsystem();

		/**
		 * The meta object literal for the '<em><b>Band</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_SUBSYSTEM__BAND = eINSTANCE.getCommSubsystem_Band();

		/**
		 * The meta object literal for the '<em><b>Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_SUBSYSTEM__GAIN = eINSTANCE.getCommSubsystem_Gain();

		/**
		 * The meta object literal for the '<em><b>Communication Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_SUBSYSTEM__COMMUNICATION_LINK = eINSTANCE.getCommSubsystem_CommunicationLink();

		/**
		 * The meta object literal for the '{@link satellite.impl.DirectedCommunicationLinkImpl <em>Directed Communication Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.DirectedCommunicationLinkImpl
		 * @see satellite.impl.SatellitePackageImpl#getDirectedCommunicationLink()
		 * @generated
		 */
		EClass DIRECTED_COMMUNICATION_LINK = eINSTANCE.getDirectedCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_COMMUNICATION_LINK__SOURCE = eINSTANCE.getDirectedCommunicationLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_COMMUNICATION_LINK__TARGET = eINSTANCE.getDirectedCommunicationLink_Target();

		/**
		 * The meta object literal for the '{@link satellite.impl.PayloadImpl <em>Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.PayloadImpl
		 * @see satellite.impl.SatellitePackageImpl#getPayload()
		 * @generated
		 */
		EClass PAYLOAD = eINSTANCE.getPayload();

		/**
		 * The meta object literal for the '{@link satellite.impl.InterferometryPayloadImpl <em>Interferometry Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.InterferometryPayloadImpl
		 * @see satellite.impl.SatellitePackageImpl#getInterferometryPayload()
		 * @generated
		 */
		EClass INTERFEROMETRY_PAYLOAD = eINSTANCE.getInterferometryPayload();

		/**
		 * The meta object literal for the '{@link satellite.impl.CubeSat3UImpl <em>Cube Sat3 U</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.CubeSat3UImpl
		 * @see satellite.impl.SatellitePackageImpl#getCubeSat3U()
		 * @generated
		 */
		EClass CUBE_SAT3_U = eINSTANCE.getCubeSat3U();

		/**
		 * The meta object literal for the '{@link satellite.impl.CubeSat6UImpl <em>Cube Sat6 U</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.CubeSat6UImpl
		 * @see satellite.impl.SatellitePackageImpl#getCubeSat6U()
		 * @generated
		 */
		EClass CUBE_SAT6_U = eINSTANCE.getCubeSat6U();

		/**
		 * The meta object literal for the '{@link satellite.impl.SmallSatImpl <em>Small Sat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.SmallSatImpl
		 * @see satellite.impl.SatellitePackageImpl#getSmallSat()
		 * @generated
		 */
		EClass SMALL_SAT = eINSTANCE.getSmallSat();

		/**
		 * The meta object literal for the '{@link satellite.impl.CubeSatImpl <em>Cube Sat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.CubeSatImpl
		 * @see satellite.impl.SatellitePackageImpl#getCubeSat()
		 * @generated
		 */
		EClass CUBE_SAT = eINSTANCE.getCubeSat();

		/**
		 * The meta object literal for the '{@link satellite.TransceiverBand <em>Transceiver Band</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.TransceiverBand
		 * @see satellite.impl.SatellitePackageImpl#getTransceiverBand()
		 * @generated
		 */
		EEnum TRANSCEIVER_BAND = eINSTANCE.getTransceiverBand();

		/**
		 * The meta object literal for the '{@link satellite.AntennaGain <em>Antenna Gain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.AntennaGain
		 * @see satellite.impl.SatellitePackageImpl#getAntennaGain()
		 * @generated
		 */
		EEnum ANTENNA_GAIN = eINSTANCE.getAntennaGain();

		/**
		 * The meta object literal for the '{@link satellite.SpacecraftKind <em>Spacecraft Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.SpacecraftKind
		 * @see satellite.impl.SatellitePackageImpl#getSpacecraftKind()
		 * @generated
		 */
		EEnum SPACECRAFT_KIND = eINSTANCE.getSpacecraftKind();

	}

} //SatellitePackage
