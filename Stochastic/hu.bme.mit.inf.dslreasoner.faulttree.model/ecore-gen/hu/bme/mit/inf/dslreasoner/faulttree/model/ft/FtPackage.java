/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft;

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
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory
 * @model kind="package"
 * @generated
 */
public interface FtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ft";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/faulttree/model/ft";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ft";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FaultTreeImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getFaultTree()
	 * @generated
	 */
	int FAULT_TREE = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Top Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__TOP_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.EventImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.BasicEventImpl <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.BasicEventImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DISTRIBUTION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.GateImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__INPUT_EVENTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.DistributionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 4;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ConstantDistributionImpl <em>Constant Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ConstantDistributionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getConstantDistribution()
	 * @generated
	 */
	int CONSTANT_DISTRIBUTION = 5;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DISTRIBUTION__P = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DISTRIBUTION_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DISTRIBUTION_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ExponentialDistributionImpl <em>Exponential Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ExponentialDistributionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getExponentialDistribution()
	 * @generated
	 */
	int EXPONENTIAL_DISTRIBUTION = 6;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_DISTRIBUTION__LAMBDA = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_DISTRIBUTION_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exponential Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_DISTRIBUTION_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.AndGateImpl <em>And Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.AndGateImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getAndGate()
	 * @generated
	 */
	int AND_GATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The number of structural features of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.OrGateImpl <em>Or Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.OrGateImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getOrGate()
	 * @generated
	 */
	int OR_GATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The number of structural features of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.KOfMGateImpl <em>KOf MGate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.KOfMGateImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getKOfMGate()
	 * @generated
	 */
	int KOF_MGATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE__INPUT_EVENTS = GATE__INPUT_EVENTS;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE__K = GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE__M = GATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>KOf MGate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>KOf MGate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_OPERATION_COUNT = GATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Tree</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree
	 * @generated
	 */
	EClass getFaultTree();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree#getEvents()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Events();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree#getTopEvent <em>Top Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top Event</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree#getTopEvent()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_TopEvent();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent#getDistribution()
	 * @see #getBasicEvent()
	 * @generated
	 */
	EReference getBasicEvent_Distribution();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Events</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate#getInputEvents()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_InputEvents();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution <em>Constant Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Distribution</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution
	 * @generated
	 */
	EClass getConstantDistribution();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution#getP()
	 * @see #getConstantDistribution()
	 * @generated
	 */
	EAttribute getConstantDistribution_P();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution <em>Exponential Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Distribution</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution
	 * @generated
	 */
	EClass getExponentialDistribution();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lambda</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution#getLambda()
	 * @see #getExponentialDistribution()
	 * @generated
	 */
	EAttribute getExponentialDistribution_Lambda();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate <em>And Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Gate</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate
	 * @generated
	 */
	EClass getAndGate();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate <em>Or Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Gate</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate
	 * @generated
	 */
	EClass getOrGate();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate <em>KOf MGate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KOf MGate</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate
	 * @generated
	 */
	EClass getKOfMGate();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate#getK()
	 * @see #getKOfMGate()
	 * @generated
	 */
	EAttribute getKOfMGate_K();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate#getM()
	 * @see #getKOfMGate()
	 * @generated
	 */
	EAttribute getKOfMGate_M();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FtFactory getFtFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FaultTreeImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getFaultTree()
		 * @generated
		 */
		EClass FAULT_TREE = eINSTANCE.getFaultTree();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__EVENTS = eINSTANCE.getFaultTree_Events();

		/**
		 * The meta object literal for the '<em><b>Top Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__TOP_EVENT = eINSTANCE.getFaultTree_TopEvent();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.EventImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.BasicEventImpl <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.BasicEventImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_EVENT__DISTRIBUTION = eINSTANCE.getBasicEvent_Distribution();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.GateImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Input Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__INPUT_EVENTS = eINSTANCE.getGate_InputEvents();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.DistributionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ConstantDistributionImpl <em>Constant Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ConstantDistributionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getConstantDistribution()
		 * @generated
		 */
		EClass CONSTANT_DISTRIBUTION = eINSTANCE.getConstantDistribution();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_DISTRIBUTION__P = eINSTANCE.getConstantDistribution_P();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ExponentialDistributionImpl <em>Exponential Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.ExponentialDistributionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getExponentialDistribution()
		 * @generated
		 */
		EClass EXPONENTIAL_DISTRIBUTION = eINSTANCE.getExponentialDistribution();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_DISTRIBUTION__LAMBDA = eINSTANCE.getExponentialDistribution_Lambda();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.AndGateImpl <em>And Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.AndGateImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getAndGate()
		 * @generated
		 */
		EClass AND_GATE = eINSTANCE.getAndGate();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.OrGateImpl <em>Or Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.OrGateImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getOrGate()
		 * @generated
		 */
		EClass OR_GATE = eINSTANCE.getOrGate();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.KOfMGateImpl <em>KOf MGate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.KOfMGateImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtPackageImpl#getKOfMGate()
		 * @generated
		 */
		EClass KOF_MGATE = eINSTANCE.getKOfMGate();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOF_MGATE__K = eINSTANCE.getKOfMGate_K();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOF_MGATE__M = eINSTANCE.getKOfMGate_M();

	}

} //FtPackage
