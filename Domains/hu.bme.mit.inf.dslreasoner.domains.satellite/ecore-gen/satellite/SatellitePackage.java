/**
 */
package satellite;

import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Interferometry Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFEROMETRY_MISSION_FEATURE_COUNT = CONSTELLATION_MISSION_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Communicating Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ELEMENT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT__PAYLOAD = COMMUNICATING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spacecraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_FEATURE_COUNT = COMMUNICATING_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_SUBSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link satellite.impl.PayloadImpl <em>Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.PayloadImpl
	 * @see satellite.impl.SatellitePackageImpl#getPayload()
	 * @generated
	 */
	int PAYLOAD = 6;

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
	int INTERFEROMETRY_PAYLOAD = 7;

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
	int CUBE_SAT = 11;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT__COMM_SUBSYSTEM = SPACECRAFT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT__PAYLOAD = SPACECRAFT__PAYLOAD;

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
	int CUBE_SAT3_U = 8;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U__COMM_SUBSYSTEM = CUBE_SAT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT3_U__PAYLOAD = CUBE_SAT__PAYLOAD;

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
	int CUBE_SAT6_U = 9;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U__COMM_SUBSYSTEM = CUBE_SAT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_SAT6_U__PAYLOAD = CUBE_SAT__PAYLOAD;

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
	int SMALL_SAT = 10;

	/**
	 * The feature id for the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT__COMM_SUBSYSTEM = SPACECRAFT__COMM_SUBSYSTEM;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_SAT__PAYLOAD = SPACECRAFT__PAYLOAD;

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
	 * The meta object id for the '{@link satellite.impl.UHFCommSubsystemImpl <em>UHF Comm Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.UHFCommSubsystemImpl
	 * @see satellite.impl.SatellitePackageImpl#getUHFCommSubsystem()
	 * @generated
	 */
	int UHF_COMM_SUBSYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHF_COMM_SUBSYSTEM__TARGET = COMM_SUBSYSTEM__TARGET;

	/**
	 * The number of structural features of the '<em>UHF Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHF_COMM_SUBSYSTEM_FEATURE_COUNT = COMM_SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UHF Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UHF_COMM_SUBSYSTEM_OPERATION_COUNT = COMM_SUBSYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.XCommSubsystemImpl <em>XComm Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.XCommSubsystemImpl
	 * @see satellite.impl.SatellitePackageImpl#getXCommSubsystem()
	 * @generated
	 */
	int XCOMM_SUBSYSTEM = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMM_SUBSYSTEM__TARGET = COMM_SUBSYSTEM__TARGET;

	/**
	 * The number of structural features of the '<em>XComm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMM_SUBSYSTEM_FEATURE_COUNT = COMM_SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XComm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMM_SUBSYSTEM_OPERATION_COUNT = COMM_SUBSYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link satellite.impl.KaCommSubsystemImpl <em>Ka Comm Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see satellite.impl.KaCommSubsystemImpl
	 * @see satellite.impl.SatellitePackageImpl#getKaCommSubsystem()
	 * @generated
	 */
	int KA_COMM_SUBSYSTEM = 14;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KA_COMM_SUBSYSTEM__TARGET = COMM_SUBSYSTEM__TARGET;

	/**
	 * The number of structural features of the '<em>Ka Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KA_COMM_SUBSYSTEM_FEATURE_COUNT = COMM_SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ka Comm Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KA_COMM_SUBSYSTEM_OPERATION_COUNT = COMM_SUBSYSTEM_OPERATION_COUNT + 0;

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
	 * Returns the meta object for class '{@link satellite.CommSubsystem <em>Comm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Subsystem</em>'.
	 * @see satellite.CommSubsystem
	 * @generated
	 */
	EClass getCommSubsystem();

	/**
	 * Returns the meta object for the reference '{@link satellite.CommSubsystem#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see satellite.CommSubsystem#getTarget()
	 * @see #getCommSubsystem()
	 * @generated
	 */
	EReference getCommSubsystem_Target();

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
	 * Returns the meta object for class '{@link satellite.UHFCommSubsystem <em>UHF Comm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UHF Comm Subsystem</em>'.
	 * @see satellite.UHFCommSubsystem
	 * @generated
	 */
	EClass getUHFCommSubsystem();

	/**
	 * Returns the meta object for class '{@link satellite.XCommSubsystem <em>XComm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XComm Subsystem</em>'.
	 * @see satellite.XCommSubsystem
	 * @generated
	 */
	EClass getXCommSubsystem();

	/**
	 * Returns the meta object for class '{@link satellite.KaCommSubsystem <em>Ka Comm Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ka Comm Subsystem</em>'.
	 * @see satellite.KaCommSubsystem
	 * @generated
	 */
	EClass getKaCommSubsystem();

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
		 * The meta object literal for the '{@link satellite.impl.CommSubsystemImpl <em>Comm Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.CommSubsystemImpl
		 * @see satellite.impl.SatellitePackageImpl#getCommSubsystem()
		 * @generated
		 */
		EClass COMM_SUBSYSTEM = eINSTANCE.getCommSubsystem();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_SUBSYSTEM__TARGET = eINSTANCE.getCommSubsystem_Target();

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
		 * The meta object literal for the '{@link satellite.impl.UHFCommSubsystemImpl <em>UHF Comm Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.UHFCommSubsystemImpl
		 * @see satellite.impl.SatellitePackageImpl#getUHFCommSubsystem()
		 * @generated
		 */
		EClass UHF_COMM_SUBSYSTEM = eINSTANCE.getUHFCommSubsystem();

		/**
		 * The meta object literal for the '{@link satellite.impl.XCommSubsystemImpl <em>XComm Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.XCommSubsystemImpl
		 * @see satellite.impl.SatellitePackageImpl#getXCommSubsystem()
		 * @generated
		 */
		EClass XCOMM_SUBSYSTEM = eINSTANCE.getXCommSubsystem();

		/**
		 * The meta object literal for the '{@link satellite.impl.KaCommSubsystemImpl <em>Ka Comm Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see satellite.impl.KaCommSubsystemImpl
		 * @see satellite.impl.SatellitePackageImpl#getKaCommSubsystem()
		 * @generated
		 */
		EClass KA_COMM_SUBSYSTEM = eINSTANCE.getKaCommSubsystem();

	}

} //SatellitePackage
