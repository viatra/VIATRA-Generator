/**
 */
package modes3;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see modes3.Modes3Factory
 * @model kind="package"
 * @generated
 */
public interface Modes3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modes3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ece.mcgill.ca/wcet/modes3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modes3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Modes3Package eINSTANCE = modes3.impl.Modes3PackageImpl.init();

	/**
	 * The meta object id for the '{@link modes3.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modes3.impl.SegmentImpl
	 * @see modes3.impl.Modes3PackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__CONNECTED_TO = 0;

	/**
	 * The feature id for the '<em><b>Occupied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__OCCUPIED_BY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modes3.impl.Modes3ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modes3.impl.Modes3ModelRootImpl
	 * @see modes3.impl.Modes3PackageImpl#getModes3ModelRoot()
	 * @generated
	 */
	int MODES3_MODEL_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES3_MODEL_ROOT__ID = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES3_MODEL_ROOT__TRAINS = 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES3_MODEL_ROOT__SEGMENTS = 2;

	/**
	 * The feature id for the '<em><b>Turnouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES3_MODEL_ROOT__TURNOUTS = 3;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES3_MODEL_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES3_MODEL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modes3.impl.TurnoutImpl <em>Turnout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modes3.impl.TurnoutImpl
	 * @see modes3.impl.Modes3PackageImpl#getTurnout()
	 * @generated
	 */
	int TURNOUT = 2;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__CONNECTED_TO = SEGMENT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Occupied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__OCCUPIED_BY = SEGMENT__OCCUPIED_BY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__ID = SEGMENT__ID;

	/**
	 * The feature id for the '<em><b>Straight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__STRAIGHT = SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Divergent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__DIVERGENT = SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_FEATURE_COUNT = SEGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_OPERATION_COUNT = SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modes3.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modes3.impl.TrainImpl
	 * @see modes3.impl.Modes3PackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ID = 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__SPEED = 2;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link modes3.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see modes3.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the reference list '{@link modes3.Segment#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see modes3.Segment#getConnectedTo()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_ConnectedTo();

	/**
	 * Returns the meta object for the reference '{@link modes3.Segment#getOccupiedBy <em>Occupied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occupied By</em>'.
	 * @see modes3.Segment#getOccupiedBy()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_OccupiedBy();

	/**
	 * Returns the meta object for the attribute '{@link modes3.Segment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see modes3.Segment#getId()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Id();

	/**
	 * Returns the meta object for class '{@link modes3.Modes3ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see modes3.Modes3ModelRoot
	 * @generated
	 */
	EClass getModes3ModelRoot();

	/**
	 * Returns the meta object for the attribute '{@link modes3.Modes3ModelRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see modes3.Modes3ModelRoot#getId()
	 * @see #getModes3ModelRoot()
	 * @generated
	 */
	EAttribute getModes3ModelRoot_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link modes3.Modes3ModelRoot#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trains</em>'.
	 * @see modes3.Modes3ModelRoot#getTrains()
	 * @see #getModes3ModelRoot()
	 * @generated
	 */
	EReference getModes3ModelRoot_Trains();

	/**
	 * Returns the meta object for the containment reference list '{@link modes3.Modes3ModelRoot#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see modes3.Modes3ModelRoot#getSegments()
	 * @see #getModes3ModelRoot()
	 * @generated
	 */
	EReference getModes3ModelRoot_Segments();

	/**
	 * Returns the meta object for the containment reference list '{@link modes3.Modes3ModelRoot#getTurnouts <em>Turnouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Turnouts</em>'.
	 * @see modes3.Modes3ModelRoot#getTurnouts()
	 * @see #getModes3ModelRoot()
	 * @generated
	 */
	EReference getModes3ModelRoot_Turnouts();

	/**
	 * Returns the meta object for class '{@link modes3.Turnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout</em>'.
	 * @see modes3.Turnout
	 * @generated
	 */
	EClass getTurnout();

	/**
	 * Returns the meta object for the reference '{@link modes3.Turnout#getStraight <em>Straight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Straight</em>'.
	 * @see modes3.Turnout#getStraight()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_Straight();

	/**
	 * Returns the meta object for the reference '{@link modes3.Turnout#getDivergent <em>Divergent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Divergent</em>'.
	 * @see modes3.Turnout#getDivergent()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_Divergent();

	/**
	 * Returns the meta object for class '{@link modes3.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see modes3.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the reference '{@link modes3.Train#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see modes3.Train#getLocation()
	 * @see #getTrain()
	 * @generated
	 */
	EReference getTrain_Location();

	/**
	 * Returns the meta object for the attribute '{@link modes3.Train#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see modes3.Train#getId()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Id();

	/**
	 * Returns the meta object for the attribute '{@link modes3.Train#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see modes3.Train#getSpeed()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Speed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Modes3Factory getModes3Factory();

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
		 * The meta object literal for the '{@link modes3.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modes3.impl.SegmentImpl
		 * @see modes3.impl.Modes3PackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__CONNECTED_TO = eINSTANCE.getSegment_ConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Occupied By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__OCCUPIED_BY = eINSTANCE.getSegment_OccupiedBy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__ID = eINSTANCE.getSegment_Id();

		/**
		 * The meta object literal for the '{@link modes3.impl.Modes3ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modes3.impl.Modes3ModelRootImpl
		 * @see modes3.impl.Modes3PackageImpl#getModes3ModelRoot()
		 * @generated
		 */
		EClass MODES3_MODEL_ROOT = eINSTANCE.getModes3ModelRoot();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODES3_MODEL_ROOT__ID = eINSTANCE.getModes3ModelRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODES3_MODEL_ROOT__TRAINS = eINSTANCE.getModes3ModelRoot_Trains();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODES3_MODEL_ROOT__SEGMENTS = eINSTANCE.getModes3ModelRoot_Segments();

		/**
		 * The meta object literal for the '<em><b>Turnouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODES3_MODEL_ROOT__TURNOUTS = eINSTANCE.getModes3ModelRoot_Turnouts();

		/**
		 * The meta object literal for the '{@link modes3.impl.TurnoutImpl <em>Turnout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modes3.impl.TurnoutImpl
		 * @see modes3.impl.Modes3PackageImpl#getTurnout()
		 * @generated
		 */
		EClass TURNOUT = eINSTANCE.getTurnout();

		/**
		 * The meta object literal for the '<em><b>Straight</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__STRAIGHT = eINSTANCE.getTurnout_Straight();

		/**
		 * The meta object literal for the '<em><b>Divergent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__DIVERGENT = eINSTANCE.getTurnout_Divergent();

		/**
		 * The meta object literal for the '{@link modes3.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modes3.impl.TrainImpl
		 * @see modes3.impl.Modes3PackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN__LOCATION = eINSTANCE.getTrain_Location();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__ID = eINSTANCE.getTrain_Id();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__SPEED = eINSTANCE.getTrain_Speed();

	}

} //Modes3Package
