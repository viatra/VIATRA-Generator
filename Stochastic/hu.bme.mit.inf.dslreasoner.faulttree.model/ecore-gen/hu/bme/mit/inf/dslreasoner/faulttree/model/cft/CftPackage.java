/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

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
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory
 * @model kind="package"
 * @generated
 */
public interface CftPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cft";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/faulttree/model/cft";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cft";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CftPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getComponentDefinition()
	 * @generated
	 */
	int COMPONENT_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__INPUT_EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__EVENT_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Output Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__OUTPUT_EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDeclarationImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getEventDeclaration()
	 * @generated
	 */
	int EVENT_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getEventDefinition()
	 * @generated
	 */
	int EVENT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__NAME = EVENT_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_OPERATION_COUNT = EVENT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.GateDefinitionImpl <em>Gate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.GateDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getGateDefinition()
	 * @generated
	 */
	int GATE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DEFINITION__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DEFINITION__INPUT_EVENTS = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DEFINITION_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.BasicEventDefinitionImpl <em>Basic Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.BasicEventDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getBasicEventDefinition()
	 * @generated
	 */
	int BASIC_EVENT_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_DEFINITION__NAME = EVENT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_DEFINITION__DISTRIBUTION = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_DEFINITION_OPERATION_COUNT = EVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.IntputEventImpl <em>Intput Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.IntputEventImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getIntputEvent()
	 * @generated
	 */
	int INTPUT_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTPUT_EVENT__NAME = EVENT_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTPUT_EVENT__MULTIPLE = EVENT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intput Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTPUT_EVENT_FEATURE_COUNT = EVENT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intput Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTPUT_EVENT_OPERATION_COUNT = EVENT_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.AndGateDefinitionImpl <em>And Gate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.AndGateDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getAndGateDefinition()
	 * @generated
	 */
	int AND_GATE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_DEFINITION__NAME = GATE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_DEFINITION__INPUT_EVENTS = GATE_DEFINITION__INPUT_EVENTS;

	/**
	 * The number of structural features of the '<em>And Gate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_DEFINITION_FEATURE_COUNT = GATE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Gate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_DEFINITION_OPERATION_COUNT = GATE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OrGateDefinitionImpl <em>Or Gate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OrGateDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getOrGateDefinition()
	 * @generated
	 */
	int OR_GATE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_DEFINITION__NAME = GATE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_DEFINITION__INPUT_EVENTS = GATE_DEFINITION__INPUT_EVENTS;

	/**
	 * The number of structural features of the '<em>Or Gate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_DEFINITION_FEATURE_COUNT = GATE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Gate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_DEFINITION_OPERATION_COUNT = GATE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.KOfMGateDefinitionImpl <em>KOf MGate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.KOfMGateDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getKOfMGateDefinition()
	 * @generated
	 */
	int KOF_MGATE_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_DEFINITION__NAME = GATE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_DEFINITION__INPUT_EVENTS = GATE_DEFINITION__INPUT_EVENTS;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_DEFINITION__K = GATE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_DEFINITION__M = GATE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>KOf MGate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_DEFINITION_FEATURE_COUNT = GATE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>KOf MGate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOF_MGATE_DEFINITION_OPERATION_COUNT = GATE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentFaultTreeImpl <em>Component Fault Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentFaultTreeImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getComponentFaultTree()
	 * @generated
	 */
	int COMPONENT_FAULT_TREE = 9;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FAULT_TREE__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Top Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FAULT_TREE__TOP_EVENT = 1;

	/**
	 * The number of structural features of the '<em>Component Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FAULT_TREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FAULT_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_DEFINITION = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.InputImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The feature id for the '<em><b>Intput Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INTPUT_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INCOMING_CONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OutputImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Event Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__EVENT_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTGOING_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ConnectionImpl
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition
	 * @generated
	 */
	EClass getComponentDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Events</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getInputEvents()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_InputEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getEventDefinitions <em>Event Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definitions</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getEventDefinitions()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_EventDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getOutputEvents <em>Output Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Events</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getOutputEvents()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EReference getComponentDefinition_OutputEvents();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getName()
	 * @see #getComponentDefinition()
	 * @generated
	 */
	EAttribute getComponentDefinition_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDefinition
	 * @generated
	 */
	EClass getEventDefinition();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.GateDefinition <em>Gate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.GateDefinition
	 * @generated
	 */
	EClass getGateDefinition();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.GateDefinition#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Events</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.GateDefinition#getInputEvents()
	 * @see #getGateDefinition()
	 * @generated
	 */
	EReference getGateDefinition_InputEvents();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition <em>Basic Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition
	 * @generated
	 */
	EClass getBasicEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition#getDistribution()
	 * @see #getBasicEventDefinition()
	 * @generated
	 */
	EReference getBasicEventDefinition_Distribution();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent <em>Intput Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intput Event</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent
	 * @generated
	 */
	EClass getIntputEvent();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent#isMultiple()
	 * @see #getIntputEvent()
	 * @generated
	 */
	EAttribute getIntputEvent_Multiple();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration <em>Event Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Declaration</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration
	 * @generated
	 */
	EClass getEventDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration#getName()
	 * @see #getEventDeclaration()
	 * @generated
	 */
	EAttribute getEventDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.AndGateDefinition <em>And Gate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Gate Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.AndGateDefinition
	 * @generated
	 */
	EClass getAndGateDefinition();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.OrGateDefinition <em>Or Gate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Gate Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.OrGateDefinition
	 * @generated
	 */
	EClass getOrGateDefinition();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition <em>KOf MGate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KOf MGate Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition
	 * @generated
	 */
	EClass getKOfMGateDefinition();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition#getK()
	 * @see #getKOfMGateDefinition()
	 * @generated
	 */
	EAttribute getKOfMGateDefinition_K();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition#getM()
	 * @see #getKOfMGateDefinition()
	 * @generated
	 */
	EAttribute getKOfMGateDefinition_M();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree <em>Component Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Fault Tree</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree
	 * @generated
	 */
	EClass getComponentFaultTree();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree#getComponents()
	 * @see #getComponentFaultTree()
	 * @generated
	 */
	EReference getComponentFaultTree_Components();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree#getTopEvent <em>Top Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top Event</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree#getTopEvent()
	 * @see #getComponentFaultTree()
	 * @generated
	 */
	EReference getComponentFaultTree_TopEvent();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getInputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getOutputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Outputs();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getComponentDefinition()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentDefinition();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getIntputEvent <em>Intput Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intput Event</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getIntputEvent()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_IntputEvent();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getComponent()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Connections</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getIncomingConnections()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_IncomingConnections();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getEventDeclaration <em>Event Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Declaration</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getEventDeclaration()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_EventDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Connections</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getOutgoingConnections()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_OutgoingConnections();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getComponent()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Component();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Input</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getInput()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Input();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getOutput()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Output();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CftFactory getCftFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getComponentDefinition()
		 * @generated
		 */
		EClass COMPONENT_DEFINITION = eINSTANCE.getComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Input Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__INPUT_EVENTS = eINSTANCE.getComponentDefinition_InputEvents();

		/**
		 * The meta object literal for the '<em><b>Event Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__EVENT_DEFINITIONS = eINSTANCE.getComponentDefinition_EventDefinitions();

		/**
		 * The meta object literal for the '<em><b>Output Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEFINITION__OUTPUT_EVENTS = eINSTANCE.getComponentDefinition_OutputEvents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION__NAME = eINSTANCE.getComponentDefinition_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getEventDefinition()
		 * @generated
		 */
		EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.GateDefinitionImpl <em>Gate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.GateDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getGateDefinition()
		 * @generated
		 */
		EClass GATE_DEFINITION = eINSTANCE.getGateDefinition();

		/**
		 * The meta object literal for the '<em><b>Input Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE_DEFINITION__INPUT_EVENTS = eINSTANCE.getGateDefinition_InputEvents();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.BasicEventDefinitionImpl <em>Basic Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.BasicEventDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getBasicEventDefinition()
		 * @generated
		 */
		EClass BASIC_EVENT_DEFINITION = eINSTANCE.getBasicEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_EVENT_DEFINITION__DISTRIBUTION = eINSTANCE.getBasicEventDefinition_Distribution();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.IntputEventImpl <em>Intput Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.IntputEventImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getIntputEvent()
		 * @generated
		 */
		EClass INTPUT_EVENT = eINSTANCE.getIntputEvent();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTPUT_EVENT__MULTIPLE = eINSTANCE.getIntputEvent_Multiple();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDeclarationImpl <em>Event Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.EventDeclarationImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getEventDeclaration()
		 * @generated
		 */
		EClass EVENT_DECLARATION = eINSTANCE.getEventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_DECLARATION__NAME = eINSTANCE.getEventDeclaration_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.AndGateDefinitionImpl <em>And Gate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.AndGateDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getAndGateDefinition()
		 * @generated
		 */
		EClass AND_GATE_DEFINITION = eINSTANCE.getAndGateDefinition();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OrGateDefinitionImpl <em>Or Gate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OrGateDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getOrGateDefinition()
		 * @generated
		 */
		EClass OR_GATE_DEFINITION = eINSTANCE.getOrGateDefinition();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.KOfMGateDefinitionImpl <em>KOf MGate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.KOfMGateDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getKOfMGateDefinition()
		 * @generated
		 */
		EClass KOF_MGATE_DEFINITION = eINSTANCE.getKOfMGateDefinition();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOF_MGATE_DEFINITION__K = eINSTANCE.getKOfMGateDefinition_K();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOF_MGATE_DEFINITION__M = eINSTANCE.getKOfMGateDefinition_M();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentFaultTreeImpl <em>Component Fault Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentFaultTreeImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getComponentFaultTree()
		 * @generated
		 */
		EClass COMPONENT_FAULT_TREE = eINSTANCE.getComponentFaultTree();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FAULT_TREE__COMPONENTS = eINSTANCE.getComponentFaultTree_Components();

		/**
		 * The meta object literal for the '<em><b>Top Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FAULT_TREE__TOP_EVENT = eINSTANCE.getComponentFaultTree_TopEvent();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INPUTS = eINSTANCE.getComponent_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTPUTS = eINSTANCE.getComponent_Outputs();

		/**
		 * The meta object literal for the '<em><b>Component Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_DEFINITION = eINSTANCE.getComponent_ComponentDefinition();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.InputImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Intput Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INTPUT_EVENT = eINSTANCE.getInput_IntputEvent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__COMPONENT = eINSTANCE.getInput_Component();

		/**
		 * The meta object literal for the '<em><b>Incoming Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INCOMING_CONNECTIONS = eINSTANCE.getInput_IncomingConnections();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OutputImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Event Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__EVENT_DECLARATION = eINSTANCE.getOutput_EventDeclaration();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OUTGOING_CONNECTIONS = eINSTANCE.getOutput_OutgoingConnections();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__COMPONENT = eINSTANCE.getOutput_Component();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ConnectionImpl
		 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__INPUT = eINSTANCE.getConnection_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__OUTPUT = eINSTANCE.getConnection_Output();

	}

} //CftPackage
