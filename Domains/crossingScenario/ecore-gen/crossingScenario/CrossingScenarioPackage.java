/**
 */
package crossingScenario;

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
 * @see crossingScenario.CrossingScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface CrossingScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crossingScenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/crossingScenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crossingScenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CrossingScenarioPackage eINSTANCE = crossingScenario.impl.CrossingScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link crossingScenario.impl.CrossingScenarioImpl <em>Crossing Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.CrossingScenarioImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getCrossingScenario()
	 * @generated
	 */
	int CROSSING_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO__XSIZE = 0;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO__YSIZE = 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO__ACTORS = 2;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO__LANES = 3;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO__MAX_TIME = 4;

	/**
	 * The feature id for the '<em><b>Horizontal head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO__HORIZONTAL_HEAD = 5;

	/**
	 * The feature id for the '<em><b>Vertical head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO__VERTICAL_HEAD = 6;

	/**
	 * The number of structural features of the '<em>Crossing Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Crossing Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSING_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.LaneImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Reference Coord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__REFERENCE_COORD = 1;

	/**
	 * The feature id for the '<em><b>Prev Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PREV_LANE = 2;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ACTORS = 3;

	/**
	 * The feature id for the '<em><b>Num Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NUM_WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.ActorImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__XPOS = 0;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__YPOS = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>XSpeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__XSPEED = 4;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RELATIONS = 5;

	/**
	 * The feature id for the '<em><b>Placed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PLACED_ON = 6;

	/**
	 * The feature id for the '<em><b>YSpeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__YSPEED = 7;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.RelationImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.SpatialRelationImpl <em>Spatial Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.SpatialRelationImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getSpatialRelation()
	 * @generated
	 */
	int SPATIAL_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_RELATION__TARGET = RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Spatial Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spatial Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.TemporalRelationImpl <em>Temporal Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.TemporalRelationImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getTemporalRelation()
	 * @generated
	 */
	int TEMPORAL_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATION__TARGET = RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Temporal Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temporal Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.VisionBlockedImpl <em>Vision Blocked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.VisionBlockedImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getVisionBlocked()
	 * @generated
	 */
	int VISION_BLOCKED = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_BLOCKED__TARGET = SPATIAL_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Blocked By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_BLOCKED__BLOCKED_BY = SPATIAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vision Blocked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_BLOCKED_FEATURE_COUNT = SPATIAL_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vision Blocked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_BLOCKED_OPERATION_COUNT = SPATIAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.SeparationDistanceImpl <em>Separation Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.SeparationDistanceImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getSeparationDistance()
	 * @generated
	 */
	int SEPARATION_DISTANCE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_DISTANCE__TARGET = SPATIAL_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_DISTANCE__DISTANCE = SPATIAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Separation Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_DISTANCE_FEATURE_COUNT = SPATIAL_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Separation Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_DISTANCE_OPERATION_COUNT = SPATIAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.CollisionExistsImpl <em>Collision Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.CollisionExistsImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getCollisionExists()
	 * @generated
	 */
	int COLLISION_EXISTS = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EXISTS__TARGET = TEMPORAL_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Collision Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EXISTS__COLLISION_TIME = TEMPORAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collision Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EXISTS_FEATURE_COUNT = TEMPORAL_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collision Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_EXISTS_OPERATION_COUNT = TEMPORAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.CollisionDoesNotExistImpl <em>Collision Does Not Exist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.CollisionDoesNotExistImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getCollisionDoesNotExist()
	 * @generated
	 */
	int COLLISION_DOES_NOT_EXIST = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_DOES_NOT_EXIST__TARGET = TEMPORAL_RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Collision Does Not Exist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_DOES_NOT_EXIST_FEATURE_COUNT = TEMPORAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collision Does Not Exist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_DOES_NOT_EXIST_OPERATION_COUNT = TEMPORAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.PedestrianImpl <em>Pedestrian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.PedestrianImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getPedestrian()
	 * @generated
	 */
	int PEDESTRIAN = 10;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__XPOS = ACTOR__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__YPOS = ACTOR__YPOS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__LENGTH = ACTOR__LENGTH;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__WIDTH = ACTOR__WIDTH;

	/**
	 * The feature id for the '<em><b>XSpeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__XSPEED = ACTOR__XSPEED;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__RELATIONS = ACTOR__RELATIONS;

	/**
	 * The feature id for the '<em><b>Placed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__PLACED_ON = ACTOR__PLACED_ON;

	/**
	 * The feature id for the '<em><b>YSpeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__YSPEED = ACTOR__YSPEED;

	/**
	 * The number of structural features of the '<em>Pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.VehicleImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 11;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__XPOS = ACTOR__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__YPOS = ACTOR__YPOS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__LENGTH = ACTOR__LENGTH;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__WIDTH = ACTOR__WIDTH;

	/**
	 * The feature id for the '<em><b>XSpeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__XSPEED = ACTOR__XSPEED;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__RELATIONS = ACTOR__RELATIONS;

	/**
	 * The feature id for the '<em><b>Placed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__PLACED_ON = ACTOR__PLACED_ON;

	/**
	 * The feature id for the '<em><b>YSpeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__YSPEED = ACTOR__YSPEED;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.Lane_HorizontalImpl <em>Lane Horizontal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.Lane_HorizontalImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getLane_Horizontal()
	 * @generated
	 */
	int LANE_HORIZONTAL = 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_HORIZONTAL__WIDTH = LANE__WIDTH;

	/**
	 * The feature id for the '<em><b>Reference Coord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_HORIZONTAL__REFERENCE_COORD = LANE__REFERENCE_COORD;

	/**
	 * The feature id for the '<em><b>Prev Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_HORIZONTAL__PREV_LANE = LANE__PREV_LANE;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_HORIZONTAL__ACTORS = LANE__ACTORS;

	/**
	 * The feature id for the '<em><b>Num Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_HORIZONTAL__NUM_WIDTH = LANE__NUM_WIDTH;

	/**
	 * The number of structural features of the '<em>Lane Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_HORIZONTAL_FEATURE_COUNT = LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lane Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_HORIZONTAL_OPERATION_COUNT = LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.impl.Lane_VerticalImpl <em>Lane Vertical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.impl.Lane_VerticalImpl
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getLane_Vertical()
	 * @generated
	 */
	int LANE_VERTICAL = 13;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_VERTICAL__WIDTH = LANE__WIDTH;

	/**
	 * The feature id for the '<em><b>Reference Coord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_VERTICAL__REFERENCE_COORD = LANE__REFERENCE_COORD;

	/**
	 * The feature id for the '<em><b>Prev Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_VERTICAL__PREV_LANE = LANE__PREV_LANE;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_VERTICAL__ACTORS = LANE__ACTORS;

	/**
	 * The feature id for the '<em><b>Num Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_VERTICAL__NUM_WIDTH = LANE__NUM_WIDTH;

	/**
	 * The number of structural features of the '<em>Lane Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_VERTICAL_FEATURE_COUNT = LANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lane Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_VERTICAL_OPERATION_COUNT = LANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crossingScenario.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.Size
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 14;

	/**
	 * The meta object id for the '{@link crossingScenario.Distance <em>Distance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crossingScenario.Distance
	 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 15;


	/**
	 * Returns the meta object for class '{@link crossingScenario.CrossingScenario <em>Crossing Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crossing Scenario</em>'.
	 * @see crossingScenario.CrossingScenario
	 * @generated
	 */
	EClass getCrossingScenario();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.CrossingScenario#getXSize <em>XSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSize</em>'.
	 * @see crossingScenario.CrossingScenario#getXSize()
	 * @see #getCrossingScenario()
	 * @generated
	 */
	EAttribute getCrossingScenario_XSize();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.CrossingScenario#getYSize <em>YSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YSize</em>'.
	 * @see crossingScenario.CrossingScenario#getYSize()
	 * @see #getCrossingScenario()
	 * @generated
	 */
	EAttribute getCrossingScenario_YSize();

	/**
	 * Returns the meta object for the containment reference list '{@link crossingScenario.CrossingScenario#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see crossingScenario.CrossingScenario#getActors()
	 * @see #getCrossingScenario()
	 * @generated
	 */
	EReference getCrossingScenario_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link crossingScenario.CrossingScenario#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see crossingScenario.CrossingScenario#getLanes()
	 * @see #getCrossingScenario()
	 * @generated
	 */
	EReference getCrossingScenario_Lanes();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.CrossingScenario#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time</em>'.
	 * @see crossingScenario.CrossingScenario#getMaxTime()
	 * @see #getCrossingScenario()
	 * @generated
	 */
	EAttribute getCrossingScenario_MaxTime();

	/**
	 * Returns the meta object for the reference '{@link crossingScenario.CrossingScenario#getHorizontal_head <em>Horizontal head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Horizontal head</em>'.
	 * @see crossingScenario.CrossingScenario#getHorizontal_head()
	 * @see #getCrossingScenario()
	 * @generated
	 */
	EReference getCrossingScenario_Horizontal_head();

	/**
	 * Returns the meta object for the reference '{@link crossingScenario.CrossingScenario#getVertical_head <em>Vertical head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vertical head</em>'.
	 * @see crossingScenario.CrossingScenario#getVertical_head()
	 * @see #getCrossingScenario()
	 * @generated
	 */
	EReference getCrossingScenario_Vertical_head();

	/**
	 * Returns the meta object for class '{@link crossingScenario.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see crossingScenario.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Lane#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see crossingScenario.Lane#getWidth()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Width();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Lane#getReferenceCoord <em>Reference Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Coord</em>'.
	 * @see crossingScenario.Lane#getReferenceCoord()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_ReferenceCoord();

	/**
	 * Returns the meta object for the reference '{@link crossingScenario.Lane#getPrevLane <em>Prev Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev Lane</em>'.
	 * @see crossingScenario.Lane#getPrevLane()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_PrevLane();

	/**
	 * Returns the meta object for the reference list '{@link crossingScenario.Lane#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see crossingScenario.Lane#getActors()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Actors();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Lane#getNumWidth <em>Num Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Width</em>'.
	 * @see crossingScenario.Lane#getNumWidth()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_NumWidth();

	/**
	 * Returns the meta object for class '{@link crossingScenario.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see crossingScenario.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Actor#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see crossingScenario.Actor#getXPos()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_XPos();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Actor#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see crossingScenario.Actor#getYPos()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_YPos();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Actor#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see crossingScenario.Actor#getLength()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Length();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Actor#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see crossingScenario.Actor#getWidth()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Width();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Actor#getXSpeed <em>XSpeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSpeed</em>'.
	 * @see crossingScenario.Actor#getXSpeed()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_XSpeed();

	/**
	 * Returns the meta object for the containment reference list '{@link crossingScenario.Actor#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see crossingScenario.Actor#getRelations()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Relations();

	/**
	 * Returns the meta object for the reference '{@link crossingScenario.Actor#getPlacedOn <em>Placed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placed On</em>'.
	 * @see crossingScenario.Actor#getPlacedOn()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_PlacedOn();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.Actor#getYSpeed <em>YSpeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YSpeed</em>'.
	 * @see crossingScenario.Actor#getYSpeed()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_YSpeed();

	/**
	 * Returns the meta object for class '{@link crossingScenario.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see crossingScenario.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link crossingScenario.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see crossingScenario.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link crossingScenario.SpatialRelation <em>Spatial Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Relation</em>'.
	 * @see crossingScenario.SpatialRelation
	 * @generated
	 */
	EClass getSpatialRelation();

	/**
	 * Returns the meta object for class '{@link crossingScenario.TemporalRelation <em>Temporal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Relation</em>'.
	 * @see crossingScenario.TemporalRelation
	 * @generated
	 */
	EClass getTemporalRelation();

	/**
	 * Returns the meta object for class '{@link crossingScenario.VisionBlocked <em>Vision Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vision Blocked</em>'.
	 * @see crossingScenario.VisionBlocked
	 * @generated
	 */
	EClass getVisionBlocked();

	/**
	 * Returns the meta object for the reference '{@link crossingScenario.VisionBlocked#getBlockedBy <em>Blocked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blocked By</em>'.
	 * @see crossingScenario.VisionBlocked#getBlockedBy()
	 * @see #getVisionBlocked()
	 * @generated
	 */
	EReference getVisionBlocked_BlockedBy();

	/**
	 * Returns the meta object for class '{@link crossingScenario.SeparationDistance <em>Separation Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separation Distance</em>'.
	 * @see crossingScenario.SeparationDistance
	 * @generated
	 */
	EClass getSeparationDistance();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.SeparationDistance#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see crossingScenario.SeparationDistance#getDistance()
	 * @see #getSeparationDistance()
	 * @generated
	 */
	EAttribute getSeparationDistance_Distance();

	/**
	 * Returns the meta object for class '{@link crossingScenario.CollisionExists <em>Collision Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision Exists</em>'.
	 * @see crossingScenario.CollisionExists
	 * @generated
	 */
	EClass getCollisionExists();

	/**
	 * Returns the meta object for the attribute '{@link crossingScenario.CollisionExists#getCollisionTime <em>Collision Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collision Time</em>'.
	 * @see crossingScenario.CollisionExists#getCollisionTime()
	 * @see #getCollisionExists()
	 * @generated
	 */
	EAttribute getCollisionExists_CollisionTime();

	/**
	 * Returns the meta object for class '{@link crossingScenario.CollisionDoesNotExist <em>Collision Does Not Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision Does Not Exist</em>'.
	 * @see crossingScenario.CollisionDoesNotExist
	 * @generated
	 */
	EClass getCollisionDoesNotExist();

	/**
	 * Returns the meta object for class '{@link crossingScenario.Pedestrian <em>Pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian</em>'.
	 * @see crossingScenario.Pedestrian
	 * @generated
	 */
	EClass getPedestrian();

	/**
	 * Returns the meta object for class '{@link crossingScenario.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see crossingScenario.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for class '{@link crossingScenario.Lane_Horizontal <em>Lane Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane Horizontal</em>'.
	 * @see crossingScenario.Lane_Horizontal
	 * @generated
	 */
	EClass getLane_Horizontal();

	/**
	 * Returns the meta object for class '{@link crossingScenario.Lane_Vertical <em>Lane Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane Vertical</em>'.
	 * @see crossingScenario.Lane_Vertical
	 * @generated
	 */
	EClass getLane_Vertical();

	/**
	 * Returns the meta object for enum '{@link crossingScenario.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see crossingScenario.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link crossingScenario.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance</em>'.
	 * @see crossingScenario.Distance
	 * @generated
	 */
	EEnum getDistance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CrossingScenarioFactory getCrossingScenarioFactory();

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
		 * The meta object literal for the '{@link crossingScenario.impl.CrossingScenarioImpl <em>Crossing Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.CrossingScenarioImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getCrossingScenario()
		 * @generated
		 */
		EClass CROSSING_SCENARIO = eINSTANCE.getCrossingScenario();

		/**
		 * The meta object literal for the '<em><b>XSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSING_SCENARIO__XSIZE = eINSTANCE.getCrossingScenario_XSize();

		/**
		 * The meta object literal for the '<em><b>YSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSING_SCENARIO__YSIZE = eINSTANCE.getCrossingScenario_YSize();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSING_SCENARIO__ACTORS = eINSTANCE.getCrossingScenario_Actors();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSING_SCENARIO__LANES = eINSTANCE.getCrossingScenario_Lanes();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSING_SCENARIO__MAX_TIME = eINSTANCE.getCrossingScenario_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Horizontal head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSING_SCENARIO__HORIZONTAL_HEAD = eINSTANCE.getCrossingScenario_Horizontal_head();

		/**
		 * The meta object literal for the '<em><b>Vertical head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSING_SCENARIO__VERTICAL_HEAD = eINSTANCE.getCrossingScenario_Vertical_head();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.LaneImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__WIDTH = eINSTANCE.getLane_Width();

		/**
		 * The meta object literal for the '<em><b>Reference Coord</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__REFERENCE_COORD = eINSTANCE.getLane_ReferenceCoord();

		/**
		 * The meta object literal for the '<em><b>Prev Lane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__PREV_LANE = eINSTANCE.getLane_PrevLane();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__ACTORS = eINSTANCE.getLane_Actors();

		/**
		 * The meta object literal for the '<em><b>Num Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__NUM_WIDTH = eINSTANCE.getLane_NumWidth();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.ActorImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>XPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__XPOS = eINSTANCE.getActor_XPos();

		/**
		 * The meta object literal for the '<em><b>YPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__YPOS = eINSTANCE.getActor_YPos();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__LENGTH = eINSTANCE.getActor_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__WIDTH = eINSTANCE.getActor_Width();

		/**
		 * The meta object literal for the '<em><b>XSpeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__XSPEED = eINSTANCE.getActor_XSpeed();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__RELATIONS = eINSTANCE.getActor_Relations();

		/**
		 * The meta object literal for the '<em><b>Placed On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PLACED_ON = eINSTANCE.getActor_PlacedOn();

		/**
		 * The meta object literal for the '<em><b>YSpeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__YSPEED = eINSTANCE.getActor_YSpeed();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.RelationImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.SpatialRelationImpl <em>Spatial Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.SpatialRelationImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getSpatialRelation()
		 * @generated
		 */
		EClass SPATIAL_RELATION = eINSTANCE.getSpatialRelation();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.TemporalRelationImpl <em>Temporal Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.TemporalRelationImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getTemporalRelation()
		 * @generated
		 */
		EClass TEMPORAL_RELATION = eINSTANCE.getTemporalRelation();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.VisionBlockedImpl <em>Vision Blocked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.VisionBlockedImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getVisionBlocked()
		 * @generated
		 */
		EClass VISION_BLOCKED = eINSTANCE.getVisionBlocked();

		/**
		 * The meta object literal for the '<em><b>Blocked By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISION_BLOCKED__BLOCKED_BY = eINSTANCE.getVisionBlocked_BlockedBy();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.SeparationDistanceImpl <em>Separation Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.SeparationDistanceImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getSeparationDistance()
		 * @generated
		 */
		EClass SEPARATION_DISTANCE = eINSTANCE.getSeparationDistance();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPARATION_DISTANCE__DISTANCE = eINSTANCE.getSeparationDistance_Distance();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.CollisionExistsImpl <em>Collision Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.CollisionExistsImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getCollisionExists()
		 * @generated
		 */
		EClass COLLISION_EXISTS = eINSTANCE.getCollisionExists();

		/**
		 * The meta object literal for the '<em><b>Collision Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLISION_EXISTS__COLLISION_TIME = eINSTANCE.getCollisionExists_CollisionTime();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.CollisionDoesNotExistImpl <em>Collision Does Not Exist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.CollisionDoesNotExistImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getCollisionDoesNotExist()
		 * @generated
		 */
		EClass COLLISION_DOES_NOT_EXIST = eINSTANCE.getCollisionDoesNotExist();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.PedestrianImpl <em>Pedestrian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.PedestrianImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getPedestrian()
		 * @generated
		 */
		EClass PEDESTRIAN = eINSTANCE.getPedestrian();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.VehicleImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.Lane_HorizontalImpl <em>Lane Horizontal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.Lane_HorizontalImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getLane_Horizontal()
		 * @generated
		 */
		EClass LANE_HORIZONTAL = eINSTANCE.getLane_Horizontal();

		/**
		 * The meta object literal for the '{@link crossingScenario.impl.Lane_VerticalImpl <em>Lane Vertical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.impl.Lane_VerticalImpl
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getLane_Vertical()
		 * @generated
		 */
		EClass LANE_VERTICAL = eINSTANCE.getLane_Vertical();

		/**
		 * The meta object literal for the '{@link crossingScenario.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.Size
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link crossingScenario.Distance <em>Distance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crossingScenario.Distance
		 * @see crossingScenario.impl.CrossingScenarioPackageImpl#getDistance()
		 * @generated
		 */
		EEnum DISTANCE = eINSTANCE.getDistance();

	}

} //CrossingScenarioPackage