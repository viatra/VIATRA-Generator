/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CftFactoryImpl extends EFactoryImpl implements CftFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CftFactory init() {
		try {
			CftFactory theCftFactory = (CftFactory)EPackage.Registry.INSTANCE.getEFactory(CftPackage.eNS_URI);
			if (theCftFactory != null) {
				return theCftFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CftFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CftFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CftPackage.COMPONENT_DEFINITION: return createComponentDefinition();
			case CftPackage.BASIC_EVENT_DEFINITION: return createBasicEventDefinition();
			case CftPackage.INPUT_EVENT: return createInputEvent();
			case CftPackage.AND_GATE_DEFINITION: return createAndGateDefinition();
			case CftPackage.OR_GATE_DEFINITION: return createOrGateDefinition();
			case CftPackage.KOF_MGATE_DEFINITION: return createKOfMGateDefinition();
			case CftPackage.COMPONENT_FAULT_TREE: return createComponentFaultTree();
			case CftPackage.COMPONENT: return createComponent();
			case CftPackage.INPUT: return createInput();
			case CftPackage.OUTPUT: return createOutput();
			case CftPackage.CONNECTION: return createConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinition createComponentDefinition() {
		ComponentDefinitionImpl componentDefinition = new ComponentDefinitionImpl();
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicEventDefinition createBasicEventDefinition() {
		BasicEventDefinitionImpl basicEventDefinition = new BasicEventDefinitionImpl();
		return basicEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputEvent createInputEvent() {
		InputEventImpl inputEvent = new InputEventImpl();
		return inputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndGateDefinition createAndGateDefinition() {
		AndGateDefinitionImpl andGateDefinition = new AndGateDefinitionImpl();
		return andGateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrGateDefinition createOrGateDefinition() {
		OrGateDefinitionImpl orGateDefinition = new OrGateDefinitionImpl();
		return orGateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KOfMGateDefinition createKOfMGateDefinition() {
		KOfMGateDefinitionImpl kOfMGateDefinition = new KOfMGateDefinitionImpl();
		return kOfMGateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFaultTree createComponentFaultTree() {
		ComponentFaultTreeImpl componentFaultTree = new ComponentFaultTreeImpl();
		return componentFaultTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CftPackage getCftPackage() {
		return (CftPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CftPackage getPackage() {
		return CftPackage.eINSTANCE;
	}

} //CftFactoryImpl
