/**
 */
package crossingScenario.impl;

import crossingScenario.Actor;
import crossingScenario.CollisionDoesNotExist;
import crossingScenario.CollisionExists;
import crossingScenario.CrossingScenario;
import crossingScenario.CrossingScenarioFactory;
import crossingScenario.CrossingScenarioPackage;
import crossingScenario.Distance;
import crossingScenario.Lane;
import crossingScenario.Orientation;
import crossingScenario.Pedestrian;
import crossingScenario.Relation;
import crossingScenario.SeparationDistance;
import crossingScenario.Size;
import crossingScenario.SpatialRelation;
import crossingScenario.TemporalRelation;
import crossingScenario.Vehicle;
import crossingScenario.VisionBlocked;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossingScenarioPackageImpl extends EPackageImpl implements CrossingScenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossingScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionBlockedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separationDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collisionExistsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collisionDoesNotExistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedestrianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distanceEEnum = null;

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
	 * @see crossingScenario.CrossingScenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CrossingScenarioPackageImpl() {
		super(eNS_URI, CrossingScenarioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CrossingScenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CrossingScenarioPackage init() {
		if (isInited) return (CrossingScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(CrossingScenarioPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCrossingScenarioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CrossingScenarioPackageImpl theCrossingScenarioPackage = registeredCrossingScenarioPackage instanceof CrossingScenarioPackageImpl ? (CrossingScenarioPackageImpl)registeredCrossingScenarioPackage : new CrossingScenarioPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCrossingScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theCrossingScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCrossingScenarioPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CrossingScenarioPackage.eNS_URI, theCrossingScenarioPackage);
		return theCrossingScenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossingScenario() {
		return crossingScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossingScenario_XSize() {
		return (EAttribute)crossingScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossingScenario_YSize() {
		return (EAttribute)crossingScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossingScenario_Actors() {
		return (EReference)crossingScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossingScenario_Lanes() {
		return (EReference)crossingScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossingScenario_MaxTime() {
		return (EAttribute)crossingScenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_Orientation() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_Width() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_ReferenceCoord() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_PrevLane() {
		return (EReference)laneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_Actors() {
		return (EReference)laneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_NumWidth() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_XPos() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_YPos() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Length() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Width() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_XSpeed() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Relations() {
		return (EReference)actorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_PlacedOn() {
		return (EReference)actorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_YSpeed() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_Target() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialRelation() {
		return spatialRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalRelation() {
		return temporalRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisionBlocked() {
		return visionBlockedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVisionBlocked_BlockedBy() {
		return (EReference)visionBlockedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeparationDistance() {
		return separationDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeparationDistance_Distance() {
		return (EAttribute)separationDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollisionExists() {
		return collisionExistsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollisionExists_CollisionTime() {
		return (EAttribute)collisionExistsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollisionDoesNotExist() {
		return collisionDoesNotExistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPedestrian() {
		return pedestrianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDistance() {
		return distanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossingScenarioFactory getCrossingScenarioFactory() {
		return (CrossingScenarioFactory)getEFactoryInstance();
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
		crossingScenarioEClass = createEClass(CROSSING_SCENARIO);
		createEAttribute(crossingScenarioEClass, CROSSING_SCENARIO__XSIZE);
		createEAttribute(crossingScenarioEClass, CROSSING_SCENARIO__YSIZE);
		createEReference(crossingScenarioEClass, CROSSING_SCENARIO__ACTORS);
		createEReference(crossingScenarioEClass, CROSSING_SCENARIO__LANES);
		createEAttribute(crossingScenarioEClass, CROSSING_SCENARIO__MAX_TIME);

		laneEClass = createEClass(LANE);
		createEAttribute(laneEClass, LANE__ORIENTATION);
		createEAttribute(laneEClass, LANE__WIDTH);
		createEAttribute(laneEClass, LANE__REFERENCE_COORD);
		createEReference(laneEClass, LANE__PREV_LANE);
		createEReference(laneEClass, LANE__ACTORS);
		createEAttribute(laneEClass, LANE__NUM_WIDTH);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__XPOS);
		createEAttribute(actorEClass, ACTOR__YPOS);
		createEAttribute(actorEClass, ACTOR__LENGTH);
		createEAttribute(actorEClass, ACTOR__WIDTH);
		createEAttribute(actorEClass, ACTOR__XSPEED);
		createEReference(actorEClass, ACTOR__RELATIONS);
		createEReference(actorEClass, ACTOR__PLACED_ON);
		createEAttribute(actorEClass, ACTOR__YSPEED);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__TARGET);

		spatialRelationEClass = createEClass(SPATIAL_RELATION);

		temporalRelationEClass = createEClass(TEMPORAL_RELATION);

		visionBlockedEClass = createEClass(VISION_BLOCKED);
		createEReference(visionBlockedEClass, VISION_BLOCKED__BLOCKED_BY);

		separationDistanceEClass = createEClass(SEPARATION_DISTANCE);
		createEAttribute(separationDistanceEClass, SEPARATION_DISTANCE__DISTANCE);

		collisionExistsEClass = createEClass(COLLISION_EXISTS);
		createEAttribute(collisionExistsEClass, COLLISION_EXISTS__COLLISION_TIME);

		collisionDoesNotExistEClass = createEClass(COLLISION_DOES_NOT_EXIST);

		pedestrianEClass = createEClass(PEDESTRIAN);

		vehicleEClass = createEClass(VEHICLE);

		// Create enums
		orientationEEnum = createEEnum(ORIENTATION);
		sizeEEnum = createEEnum(SIZE);
		distanceEEnum = createEEnum(DISTANCE);
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
		spatialRelationEClass.getESuperTypes().add(this.getRelation());
		temporalRelationEClass.getESuperTypes().add(this.getRelation());
		visionBlockedEClass.getESuperTypes().add(this.getSpatialRelation());
		separationDistanceEClass.getESuperTypes().add(this.getSpatialRelation());
		collisionExistsEClass.getESuperTypes().add(this.getTemporalRelation());
		collisionDoesNotExistEClass.getESuperTypes().add(this.getTemporalRelation());
		pedestrianEClass.getESuperTypes().add(this.getActor());
		vehicleEClass.getESuperTypes().add(this.getActor());

		// Initialize classes, features, and operations; add parameters
		initEClass(crossingScenarioEClass, CrossingScenario.class, "CrossingScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrossingScenario_XSize(), ecorePackage.getEDouble(), "xSize", null, 0, 1, CrossingScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossingScenario_YSize(), ecorePackage.getEDouble(), "ySize", null, 0, 1, CrossingScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossingScenario_Actors(), this.getActor(), null, "actors", null, 0, -1, CrossingScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossingScenario_Lanes(), this.getLane(), null, "lanes", null, 0, -1, CrossingScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossingScenario_MaxTime(), ecorePackage.getEDouble(), "maxTime", null, 0, 1, CrossingScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLane_Orientation(), this.getOrientation(), "orientation", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_Width(), this.getSize(), "width", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_ReferenceCoord(), ecorePackage.getEDouble(), "referenceCoord", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_PrevLane(), this.getLane(), null, "prevLane", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Actors(), this.getActor(), this.getActor_PlacedOn(), "actors", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_NumWidth(), ecorePackage.getEDouble(), "numWidth", "0.0", 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_XPos(), ecorePackage.getEDouble(), "xPos", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_YPos(), ecorePackage.getEDouble(), "yPos", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Length(), ecorePackage.getEDouble(), "length", "0.0", 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_XSpeed(), ecorePackage.getEDouble(), "xSpeed", "0.0", 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Relations(), this.getRelation(), null, "relations", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_PlacedOn(), this.getLane(), this.getLane_Actors(), "placedOn", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_YSpeed(), ecorePackage.getEDouble(), "ySpeed", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Target(), this.getActor(), null, "target", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialRelationEClass, SpatialRelation.class, "SpatialRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalRelationEClass, TemporalRelation.class, "TemporalRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visionBlockedEClass, VisionBlocked.class, "VisionBlocked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisionBlocked_BlockedBy(), this.getActor(), null, "blockedBy", null, 1, 1, VisionBlocked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(separationDistanceEClass, SeparationDistance.class, "SeparationDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeparationDistance_Distance(), this.getDistance(), "distance", null, 1, 1, SeparationDistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionExistsEClass, CollisionExists.class, "CollisionExists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollisionExists_CollisionTime(), ecorePackage.getEDouble(), "collisionTime", null, 1, 1, CollisionExists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionDoesNotExistEClass, CollisionDoesNotExist.class, "CollisionDoesNotExist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pedestrianEClass, Pedestrian.class, "Pedestrian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);

		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.SSMALL);
		addEEnumLiteral(sizeEEnum, Size.SMED);
		addEEnumLiteral(sizeEEnum, Size.SLARGE);

		initEEnum(distanceEEnum, Distance.class, "Distance");
		addEEnumLiteral(distanceEEnum, Distance.DNEAR);
		addEEnumLiteral(distanceEEnum, Distance.DMED);
		addEEnumLiteral(distanceEEnum, Distance.DFAR);

		// Create resource
		createResource(eNS_URI);
	}

} //CrossingScenarioPackageImpl
