/**
 */
package satellite.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import satellite.CommSubsystem;
import satellite.CommunicatingElement;
import satellite.ConstellationMission;
import satellite.CubeSat;
import satellite.CubeSat3U;
import satellite.CubeSat6U;
import satellite.GroundStationNetwork;
import satellite.InterferometryMission;
import satellite.InterferometryPayload;
import satellite.KaCommSubsystem;
import satellite.Payload;
import satellite.SatelliteFactory;
import satellite.SatellitePackage;
import satellite.SmallSat;
import satellite.Spacecraft;
import satellite.UHFCommSubsystem;
import satellite.XCommSubsystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SatellitePackageImpl extends EPackageImpl implements SatellitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constellationMissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interferometryMissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicatingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundStationNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commSubsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interferometryPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeSat3UEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeSat6UEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallSatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeSatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uhfCommSubsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xCommSubsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kaCommSubsystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see satellite.SatellitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SatellitePackageImpl() {
		super(eNS_URI, SatelliteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SatellitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SatellitePackage init() {
		if (isInited) return (SatellitePackage)EPackage.Registry.INSTANCE.getEPackage(SatellitePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSatellitePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SatellitePackageImpl theSatellitePackage = registeredSatellitePackage instanceof SatellitePackageImpl ? (SatellitePackageImpl)registeredSatellitePackage : new SatellitePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSatellitePackage.createPackageContents();

		// Initialize created meta-data
		theSatellitePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSatellitePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SatellitePackage.eNS_URI, theSatellitePackage);
		return theSatellitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstellationMission() {
		return constellationMissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstellationMission_GroundStationNetwork() {
		return (EReference)constellationMissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstellationMission_Spacecraft() {
		return (EReference)constellationMissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterferometryMission() {
		return interferometryMissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterferometryMission_ObservationTime() {
		return (EAttribute)interferometryMissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicatingElement() {
		return communicatingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicatingElement_CommSubsystem() {
		return (EReference)communicatingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroundStationNetwork() {
		return groundStationNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacecraft() {
		return spacecraftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpacecraft_Payload() {
		return (EReference)spacecraftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommSubsystem() {
		return commSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommSubsystem_Target() {
		return (EReference)commSubsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommSubsystem_Frequency() {
		return (EAttribute)commSubsystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommSubsystem_PathLength() {
		return (EAttribute)commSubsystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayload() {
		return payloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterferometryPayload() {
		return interferometryPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCubeSat3U() {
		return cubeSat3UEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCubeSat6U() {
		return cubeSat6UEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmallSat() {
		return smallSatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCubeSat() {
		return cubeSatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUHFCommSubsystem() {
		return uhfCommSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXCommSubsystem() {
		return xCommSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKaCommSubsystem() {
		return kaCommSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SatelliteFactory getSatelliteFactory() {
		return (SatelliteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		constellationMissionEClass = createEClass(CONSTELLATION_MISSION);
		createEReference(constellationMissionEClass, CONSTELLATION_MISSION__GROUND_STATION_NETWORK);
		createEReference(constellationMissionEClass, CONSTELLATION_MISSION__SPACECRAFT);

		interferometryMissionEClass = createEClass(INTERFEROMETRY_MISSION);
		createEAttribute(interferometryMissionEClass, INTERFEROMETRY_MISSION__OBSERVATION_TIME);

		communicatingElementEClass = createEClass(COMMUNICATING_ELEMENT);
		createEReference(communicatingElementEClass, COMMUNICATING_ELEMENT__COMM_SUBSYSTEM);

		groundStationNetworkEClass = createEClass(GROUND_STATION_NETWORK);

		spacecraftEClass = createEClass(SPACECRAFT);
		createEReference(spacecraftEClass, SPACECRAFT__PAYLOAD);

		commSubsystemEClass = createEClass(COMM_SUBSYSTEM);
		createEReference(commSubsystemEClass, COMM_SUBSYSTEM__TARGET);
		createEAttribute(commSubsystemEClass, COMM_SUBSYSTEM__FREQUENCY);
		createEAttribute(commSubsystemEClass, COMM_SUBSYSTEM__PATH_LENGTH);

		payloadEClass = createEClass(PAYLOAD);

		interferometryPayloadEClass = createEClass(INTERFEROMETRY_PAYLOAD);

		cubeSat3UEClass = createEClass(CUBE_SAT3_U);

		cubeSat6UEClass = createEClass(CUBE_SAT6_U);

		smallSatEClass = createEClass(SMALL_SAT);

		cubeSatEClass = createEClass(CUBE_SAT);

		uhfCommSubsystemEClass = createEClass(UHF_COMM_SUBSYSTEM);

		xCommSubsystemEClass = createEClass(XCOMM_SUBSYSTEM);

		kaCommSubsystemEClass = createEClass(KA_COMM_SUBSYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interferometryMissionEClass.getESuperTypes().add(this.getConstellationMission());
		groundStationNetworkEClass.getESuperTypes().add(this.getCommunicatingElement());
		spacecraftEClass.getESuperTypes().add(this.getCommunicatingElement());
		interferometryPayloadEClass.getESuperTypes().add(this.getPayload());
		cubeSat3UEClass.getESuperTypes().add(this.getCubeSat());
		cubeSat6UEClass.getESuperTypes().add(this.getCubeSat());
		smallSatEClass.getESuperTypes().add(this.getSpacecraft());
		cubeSatEClass.getESuperTypes().add(this.getSpacecraft());
		uhfCommSubsystemEClass.getESuperTypes().add(this.getCommSubsystem());
		xCommSubsystemEClass.getESuperTypes().add(this.getCommSubsystem());
		kaCommSubsystemEClass.getESuperTypes().add(this.getCommSubsystem());

		// Initialize classes, features, and operations; add parameters
		initEClass(constellationMissionEClass, ConstellationMission.class, "ConstellationMission", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstellationMission_GroundStationNetwork(), this.getGroundStationNetwork(), null, "groundStationNetwork", null, 1, 1, ConstellationMission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstellationMission_Spacecraft(), this.getSpacecraft(), null, "spacecraft", null, 2, -1, ConstellationMission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interferometryMissionEClass, InterferometryMission.class, "InterferometryMission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterferometryMission_ObservationTime(), ecorePackage.getEInt(), "observationTime", null, 1, 1, InterferometryMission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicatingElementEClass, CommunicatingElement.class, "CommunicatingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicatingElement_CommSubsystem(), this.getCommSubsystem(), null, "commSubsystem", null, 1, 2, CommunicatingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundStationNetworkEClass, GroundStationNetwork.class, "GroundStationNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spacecraftEClass, Spacecraft.class, "Spacecraft", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraft_Payload(), this.getPayload(), null, "payload", null, 0, 1, Spacecraft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commSubsystemEClass, CommSubsystem.class, "CommSubsystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommSubsystem_Target(), this.getCommSubsystem(), null, "target", null, 0, 1, CommSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommSubsystem_Frequency(), ecorePackage.getEInt(), "frequency", null, 1, 1, CommSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommSubsystem_PathLength(), ecorePackage.getEInt(), "pathLength", null, 1, 1, CommSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(payloadEClass, Payload.class, "Payload", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interferometryPayloadEClass, InterferometryPayload.class, "InterferometryPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cubeSat3UEClass, CubeSat3U.class, "CubeSat3U", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cubeSat6UEClass, CubeSat6U.class, "CubeSat6U", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallSatEClass, SmallSat.class, "SmallSat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cubeSatEClass, CubeSat.class, "CubeSat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uhfCommSubsystemEClass, UHFCommSubsystem.class, "UHFCommSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xCommSubsystemEClass, XCommSubsystem.class, "XCommSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kaCommSubsystemEClass, KaCommSubsystem.class, "KaCommSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SatellitePackageImpl
