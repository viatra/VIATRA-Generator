/**
 */
package simpleScenario.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleScenario.Actor;
import simpleScenario.ActorType;
import simpleScenario.CollisionDoesNotExist;
import simpleScenario.CollisionExists;
import simpleScenario.Lane;
import simpleScenario.Orientation;
import simpleScenario.Relation;
import simpleScenario.SeperationDistance;
import simpleScenario.SimpleScenario;
import simpleScenario.SimpleScenarioFactory;
import simpleScenario.SimpleScenarioPackage;
import simpleScenario.Size;
import simpleScenario.SpatialRelation;
import simpleScenario.TemporalRelation;
import simpleScenario.VisionBlocked;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleScenarioPackageImpl extends EPackageImpl implements SimpleScenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleScenarioEClass = null;

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
	private EClass seperationDistanceEClass = null;

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
	private EEnum actorTypeEEnum = null;

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
	 * @see simpleScenario.SimpleScenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleScenarioPackageImpl() {
		super(eNS_URI, SimpleScenarioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimpleScenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleScenarioPackage init() {
		if (isInited) return (SimpleScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleScenarioPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimpleScenarioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimpleScenarioPackageImpl theSimpleScenarioPackage = registeredSimpleScenarioPackage instanceof SimpleScenarioPackageImpl ? (SimpleScenarioPackageImpl)registeredSimpleScenarioPackage : new SimpleScenarioPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSimpleScenarioPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleScenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleScenarioPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleScenarioPackage.eNS_URI, theSimpleScenarioPackage);
		return theSimpleScenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleScenario() {
		return simpleScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleScenario_XSize() {
		return (EAttribute)simpleScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleScenario_YSize() {
		return (EAttribute)simpleScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleScenario_Actors() {
		return (EReference)simpleScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleScenario_Lanes() {
		return (EReference)simpleScenarioEClass.getEStructuralFeatures().get(3);
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
	public EReference getLane_Adjacent() {
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
	public EAttribute getLane_WidthNum() {
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
	public EAttribute getActor_Type() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_XPos() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_YPos() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Length() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Width() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Speed() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Relations() {
		return (EReference)actorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_PlacedOn() {
		return (EReference)actorEClass.getEStructuralFeatures().get(7);
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
	public EClass getSeperationDistance() {
		return seperationDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeperationDistance_Distance() {
		return (EAttribute)seperationDistanceEClass.getEStructuralFeatures().get(0);
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
	public EEnum getActorType() {
		return actorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleScenarioFactory getSimpleScenarioFactory() {
		return (SimpleScenarioFactory)getEFactoryInstance();
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
		simpleScenarioEClass = createEClass(SIMPLE_SCENARIO);
		createEAttribute(simpleScenarioEClass, SIMPLE_SCENARIO__XSIZE);
		createEAttribute(simpleScenarioEClass, SIMPLE_SCENARIO__YSIZE);
		createEReference(simpleScenarioEClass, SIMPLE_SCENARIO__ACTORS);
		createEReference(simpleScenarioEClass, SIMPLE_SCENARIO__LANES);

		laneEClass = createEClass(LANE);
		createEAttribute(laneEClass, LANE__ORIENTATION);
		createEAttribute(laneEClass, LANE__WIDTH);
		createEAttribute(laneEClass, LANE__REFERENCE_COORD);
		createEReference(laneEClass, LANE__ADJACENT);
		createEReference(laneEClass, LANE__ACTORS);
		createEAttribute(laneEClass, LANE__WIDTH_NUM);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__TYPE);
		createEAttribute(actorEClass, ACTOR__XPOS);
		createEAttribute(actorEClass, ACTOR__YPOS);
		createEAttribute(actorEClass, ACTOR__LENGTH);
		createEAttribute(actorEClass, ACTOR__WIDTH);
		createEAttribute(actorEClass, ACTOR__SPEED);
		createEReference(actorEClass, ACTOR__RELATIONS);
		createEReference(actorEClass, ACTOR__PLACED_ON);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__TARGET);

		spatialRelationEClass = createEClass(SPATIAL_RELATION);

		temporalRelationEClass = createEClass(TEMPORAL_RELATION);

		visionBlockedEClass = createEClass(VISION_BLOCKED);
		createEReference(visionBlockedEClass, VISION_BLOCKED__BLOCKED_BY);

		seperationDistanceEClass = createEClass(SEPERATION_DISTANCE);
		createEAttribute(seperationDistanceEClass, SEPERATION_DISTANCE__DISTANCE);

		collisionExistsEClass = createEClass(COLLISION_EXISTS);
		createEAttribute(collisionExistsEClass, COLLISION_EXISTS__COLLISION_TIME);

		collisionDoesNotExistEClass = createEClass(COLLISION_DOES_NOT_EXIST);

		// Create enums
		orientationEEnum = createEEnum(ORIENTATION);
		sizeEEnum = createEEnum(SIZE);
		actorTypeEEnum = createEEnum(ACTOR_TYPE);
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
		seperationDistanceEClass.getESuperTypes().add(this.getSpatialRelation());
		collisionExistsEClass.getESuperTypes().add(this.getTemporalRelation());
		collisionDoesNotExistEClass.getESuperTypes().add(this.getTemporalRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(simpleScenarioEClass, SimpleScenario.class, "SimpleScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleScenario_XSize(), ecorePackage.getEDouble(), "xSize", null, 0, 1, SimpleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleScenario_YSize(), ecorePackage.getEDouble(), "ySize", null, 0, 1, SimpleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleScenario_Actors(), this.getActor(), null, "actors", null, 0, -1, SimpleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleScenario_Lanes(), this.getLane(), null, "lanes", null, 0, -1, SimpleScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLane_Orientation(), this.getOrientation(), "orientation", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_Width(), this.getSize(), "width", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_ReferenceCoord(), ecorePackage.getEDouble(), "referenceCoord", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Adjacent(), this.getLane(), null, "adjacent", null, 0, 2, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Actors(), this.getActor(), this.getActor_PlacedOn(), "actors", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_WidthNum(), ecorePackage.getEDouble(), "widthNum", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Type(), this.getActorType(), "type", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_XPos(), ecorePackage.getEDouble(), "xPos", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_YPos(), ecorePackage.getEDouble(), "yPos", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Length(), ecorePackage.getEDouble(), "length", "0.0", 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Speed(), ecorePackage.getEDouble(), "speed", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Relations(), this.getRelation(), null, "relations", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_PlacedOn(), this.getLane(), this.getLane_Actors(), "placedOn", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Target(), this.getActor(), null, "target", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialRelationEClass, SpatialRelation.class, "SpatialRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalRelationEClass, TemporalRelation.class, "TemporalRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visionBlockedEClass, VisionBlocked.class, "VisionBlocked", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisionBlocked_BlockedBy(), this.getActor(), null, "blockedBy", null, 0, 1, VisionBlocked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seperationDistanceEClass, SeperationDistance.class, "SeperationDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeperationDistance_Distance(), this.getSize(), "distance", null, 1, 1, SeperationDistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionExistsEClass, CollisionExists.class, "CollisionExists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollisionExists_CollisionTime(), ecorePackage.getEDouble(), "collisionTime", null, 1, 1, CollisionExists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collisionDoesNotExistEClass, CollisionDoesNotExist.class, "CollisionDoesNotExist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);

		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.SMALL);
		addEEnumLiteral(sizeEEnum, Size.MEDIUM);
		addEEnumLiteral(sizeEEnum, Size.LARGE);

		initEEnum(actorTypeEEnum, ActorType.class, "ActorType");
		addEEnumLiteral(actorTypeEEnum, ActorType.PEDESTRIAN);
		addEEnumLiteral(actorTypeEEnum, ActorType.VEHICLE);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleScenarioPackageImpl
