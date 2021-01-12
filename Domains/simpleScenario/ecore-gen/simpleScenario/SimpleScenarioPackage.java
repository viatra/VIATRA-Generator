/**
 */
package simpleScenario;

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
 * @see simpleScenario.SimpleScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleScenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleScenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/simpleScenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleScenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleScenarioPackage eINSTANCE = simpleScenario.impl.SimpleScenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleScenario.impl.SimpleScenarioImpl <em>Simple Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.SimpleScenarioImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSimpleScenario()
	 * @generated
	 */
	int SIMPLE_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCENARIO__XSIZE = 0;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCENARIO__YSIZE = 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCENARIO__ACTORS = 2;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCENARIO__LANES = 3;

	/**
	 * The number of structural features of the '<em>Simple Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Simple Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleScenario.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.LaneImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ORIENTATION = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Reference Coord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__REFERENCE_COORD = 2;

	/**
	 * The feature id for the '<em><b>Adjacent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ADJACENT = 3;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ACTORS = 4;

	/**
	 * The feature id for the '<em><b>Width Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__WIDTH_NUM = 5;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleScenario.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.ActorImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__XPOS = 1;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__YPOS = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SPEED = 5;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RELATIONS = 6;

	/**
	 * The feature id for the '<em><b>Placed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PLACED_ON = 7;

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
	 * The meta object id for the '{@link simpleScenario.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.RelationImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getRelation()
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
	 * The meta object id for the '{@link simpleScenario.impl.SpatialRelationImpl <em>Spatial Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.SpatialRelationImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSpatialRelation()
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
	 * The meta object id for the '{@link simpleScenario.impl.TemporalRelationImpl <em>Temporal Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.TemporalRelationImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getTemporalRelation()
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
	 * The meta object id for the '{@link simpleScenario.impl.VisionBlockedImpl <em>Vision Blocked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.VisionBlockedImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getVisionBlocked()
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
	 * The meta object id for the '{@link simpleScenario.impl.SeperationDistanceImpl <em>Seperation Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.SeperationDistanceImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSeperationDistance()
	 * @generated
	 */
	int SEPERATION_DISTANCE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPERATION_DISTANCE__TARGET = SPATIAL_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPERATION_DISTANCE__DISTANCE = SPATIAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seperation Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPERATION_DISTANCE_FEATURE_COUNT = SPATIAL_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Seperation Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPERATION_DISTANCE_OPERATION_COUNT = SPATIAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleScenario.impl.CollisionExistsImpl <em>Collision Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.CollisionExistsImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getCollisionExists()
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
	 * The meta object id for the '{@link simpleScenario.impl.CollisionDoesNotExistImpl <em>Collision Does Not Exist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.impl.CollisionDoesNotExistImpl
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getCollisionDoesNotExist()
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
	 * The meta object id for the '{@link simpleScenario.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.Orientation
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 10;

	/**
	 * The meta object id for the '{@link simpleScenario.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.Size
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 11;

	/**
	 * The meta object id for the '{@link simpleScenario.ActorType <em>Actor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleScenario.ActorType
	 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getActorType()
	 * @generated
	 */
	int ACTOR_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link simpleScenario.SimpleScenario <em>Simple Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Scenario</em>'.
	 * @see simpleScenario.SimpleScenario
	 * @generated
	 */
	EClass getSimpleScenario();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.SimpleScenario#getXSize <em>XSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSize</em>'.
	 * @see simpleScenario.SimpleScenario#getXSize()
	 * @see #getSimpleScenario()
	 * @generated
	 */
	EAttribute getSimpleScenario_XSize();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.SimpleScenario#getYSize <em>YSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YSize</em>'.
	 * @see simpleScenario.SimpleScenario#getYSize()
	 * @see #getSimpleScenario()
	 * @generated
	 */
	EAttribute getSimpleScenario_YSize();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleScenario.SimpleScenario#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see simpleScenario.SimpleScenario#getActors()
	 * @see #getSimpleScenario()
	 * @generated
	 */
	EReference getSimpleScenario_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleScenario.SimpleScenario#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see simpleScenario.SimpleScenario#getLanes()
	 * @see #getSimpleScenario()
	 * @generated
	 */
	EReference getSimpleScenario_Lanes();

	/**
	 * Returns the meta object for class '{@link simpleScenario.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see simpleScenario.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Lane#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see simpleScenario.Lane#getOrientation()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Lane#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see simpleScenario.Lane#getWidth()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Width();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Lane#getReferenceCoord <em>Reference Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Coord</em>'.
	 * @see simpleScenario.Lane#getReferenceCoord()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_ReferenceCoord();

	/**
	 * Returns the meta object for the reference list '{@link simpleScenario.Lane#getAdjacent <em>Adjacent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adjacent</em>'.
	 * @see simpleScenario.Lane#getAdjacent()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Adjacent();

	/**
	 * Returns the meta object for the reference list '{@link simpleScenario.Lane#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see simpleScenario.Lane#getActors()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Actors();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Lane#getWidthNum <em>Width Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Num</em>'.
	 * @see simpleScenario.Lane#getWidthNum()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_WidthNum();

	/**
	 * Returns the meta object for class '{@link simpleScenario.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see simpleScenario.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Actor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see simpleScenario.Actor#getType()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Type();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Actor#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see simpleScenario.Actor#getXPos()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_XPos();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Actor#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see simpleScenario.Actor#getYPos()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_YPos();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Actor#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see simpleScenario.Actor#getLength()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Length();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Actor#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see simpleScenario.Actor#getWidth()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Width();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.Actor#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see simpleScenario.Actor#getSpeed()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Speed();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleScenario.Actor#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see simpleScenario.Actor#getRelations()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Relations();

	/**
	 * Returns the meta object for the reference '{@link simpleScenario.Actor#getPlacedOn <em>Placed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placed On</em>'.
	 * @see simpleScenario.Actor#getPlacedOn()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_PlacedOn();

	/**
	 * Returns the meta object for class '{@link simpleScenario.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see simpleScenario.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link simpleScenario.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see simpleScenario.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link simpleScenario.SpatialRelation <em>Spatial Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Relation</em>'.
	 * @see simpleScenario.SpatialRelation
	 * @generated
	 */
	EClass getSpatialRelation();

	/**
	 * Returns the meta object for class '{@link simpleScenario.TemporalRelation <em>Temporal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Relation</em>'.
	 * @see simpleScenario.TemporalRelation
	 * @generated
	 */
	EClass getTemporalRelation();

	/**
	 * Returns the meta object for class '{@link simpleScenario.VisionBlocked <em>Vision Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vision Blocked</em>'.
	 * @see simpleScenario.VisionBlocked
	 * @generated
	 */
	EClass getVisionBlocked();

	/**
	 * Returns the meta object for the reference '{@link simpleScenario.VisionBlocked#getBlockedBy <em>Blocked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blocked By</em>'.
	 * @see simpleScenario.VisionBlocked#getBlockedBy()
	 * @see #getVisionBlocked()
	 * @generated
	 */
	EReference getVisionBlocked_BlockedBy();

	/**
	 * Returns the meta object for class '{@link simpleScenario.SeperationDistance <em>Seperation Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seperation Distance</em>'.
	 * @see simpleScenario.SeperationDistance
	 * @generated
	 */
	EClass getSeperationDistance();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.SeperationDistance#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see simpleScenario.SeperationDistance#getDistance()
	 * @see #getSeperationDistance()
	 * @generated
	 */
	EAttribute getSeperationDistance_Distance();

	/**
	 * Returns the meta object for class '{@link simpleScenario.CollisionExists <em>Collision Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision Exists</em>'.
	 * @see simpleScenario.CollisionExists
	 * @generated
	 */
	EClass getCollisionExists();

	/**
	 * Returns the meta object for the attribute '{@link simpleScenario.CollisionExists#getCollisionTime <em>Collision Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collision Time</em>'.
	 * @see simpleScenario.CollisionExists#getCollisionTime()
	 * @see #getCollisionExists()
	 * @generated
	 */
	EAttribute getCollisionExists_CollisionTime();

	/**
	 * Returns the meta object for class '{@link simpleScenario.CollisionDoesNotExist <em>Collision Does Not Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision Does Not Exist</em>'.
	 * @see simpleScenario.CollisionDoesNotExist
	 * @generated
	 */
	EClass getCollisionDoesNotExist();

	/**
	 * Returns the meta object for enum '{@link simpleScenario.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see simpleScenario.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link simpleScenario.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see simpleScenario.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link simpleScenario.ActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Type</em>'.
	 * @see simpleScenario.ActorType
	 * @generated
	 */
	EEnum getActorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleScenarioFactory getSimpleScenarioFactory();

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
		 * The meta object literal for the '{@link simpleScenario.impl.SimpleScenarioImpl <em>Simple Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.SimpleScenarioImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSimpleScenario()
		 * @generated
		 */
		EClass SIMPLE_SCENARIO = eINSTANCE.getSimpleScenario();

		/**
		 * The meta object literal for the '<em><b>XSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SCENARIO__XSIZE = eINSTANCE.getSimpleScenario_XSize();

		/**
		 * The meta object literal for the '<em><b>YSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SCENARIO__YSIZE = eINSTANCE.getSimpleScenario_YSize();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SCENARIO__ACTORS = eINSTANCE.getSimpleScenario_Actors();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_SCENARIO__LANES = eINSTANCE.getSimpleScenario_Lanes();

		/**
		 * The meta object literal for the '{@link simpleScenario.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.LaneImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__ORIENTATION = eINSTANCE.getLane_Orientation();

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
		 * The meta object literal for the '<em><b>Adjacent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__ADJACENT = eINSTANCE.getLane_Adjacent();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__ACTORS = eINSTANCE.getLane_Actors();

		/**
		 * The meta object literal for the '<em><b>Width Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__WIDTH_NUM = eINSTANCE.getLane_WidthNum();

		/**
		 * The meta object literal for the '{@link simpleScenario.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.ActorImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

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
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__SPEED = eINSTANCE.getActor_Speed();

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
		 * The meta object literal for the '{@link simpleScenario.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.RelationImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getRelation()
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
		 * The meta object literal for the '{@link simpleScenario.impl.SpatialRelationImpl <em>Spatial Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.SpatialRelationImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSpatialRelation()
		 * @generated
		 */
		EClass SPATIAL_RELATION = eINSTANCE.getSpatialRelation();

		/**
		 * The meta object literal for the '{@link simpleScenario.impl.TemporalRelationImpl <em>Temporal Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.TemporalRelationImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getTemporalRelation()
		 * @generated
		 */
		EClass TEMPORAL_RELATION = eINSTANCE.getTemporalRelation();

		/**
		 * The meta object literal for the '{@link simpleScenario.impl.VisionBlockedImpl <em>Vision Blocked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.VisionBlockedImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getVisionBlocked()
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
		 * The meta object literal for the '{@link simpleScenario.impl.SeperationDistanceImpl <em>Seperation Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.SeperationDistanceImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSeperationDistance()
		 * @generated
		 */
		EClass SEPERATION_DISTANCE = eINSTANCE.getSeperationDistance();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPERATION_DISTANCE__DISTANCE = eINSTANCE.getSeperationDistance_Distance();

		/**
		 * The meta object literal for the '{@link simpleScenario.impl.CollisionExistsImpl <em>Collision Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.CollisionExistsImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getCollisionExists()
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
		 * The meta object literal for the '{@link simpleScenario.impl.CollisionDoesNotExistImpl <em>Collision Does Not Exist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.impl.CollisionDoesNotExistImpl
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getCollisionDoesNotExist()
		 * @generated
		 */
		EClass COLLISION_DOES_NOT_EXIST = eINSTANCE.getCollisionDoesNotExist();

		/**
		 * The meta object literal for the '{@link simpleScenario.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.Orientation
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link simpleScenario.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.Size
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link simpleScenario.ActorType <em>Actor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleScenario.ActorType
		 * @see simpleScenario.impl.SimpleScenarioPackageImpl#getActorType()
		 * @generated
		 */
		EEnum ACTOR_TYPE = eINSTANCE.getActorType();

	}

} //SimpleScenarioPackage
