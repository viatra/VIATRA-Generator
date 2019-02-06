/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.AndGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.GateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.OrGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CftPackageImpl extends EPackageImpl implements CftPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andGateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kOfMGateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentFaultTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

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
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CftPackageImpl() {
		super(eNS_URI, CftFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CftPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CftPackage init() {
		if (isInited) return (CftPackage)EPackage.Registry.INSTANCE.getEPackage(CftPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCftPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CftPackageImpl theCftPackage = registeredCftPackage instanceof CftPackageImpl ? (CftPackageImpl)registeredCftPackage : new CftPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		FtPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCftPackage.createPackageContents();

		// Initialize created meta-data
		theCftPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCftPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CftPackage.eNS_URI, theCftPackage);
		return theCftPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentDefinition() {
		return componentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_InputEvents() {
		return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_EventDefinitions() {
		return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_OutputEvents() {
		return (EReference)componentDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDefinition_Name() {
		return (EAttribute)componentDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventDefinition() {
		return eventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateDefinition() {
		return gateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGateDefinition_InputEvents() {
		return (EReference)gateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicEventDefinition() {
		return basicEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicEventDefinition_Distribution() {
		return (EReference)basicEventDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntputEvent() {
		return intputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntputEvent_Multiple() {
		return (EAttribute)intputEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventDeclaration() {
		return eventDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventDeclaration_Name() {
		return (EAttribute)eventDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndGateDefinition() {
		return andGateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrGateDefinition() {
		return orGateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKOfMGateDefinition() {
		return kOfMGateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKOfMGateDefinition_K() {
		return (EAttribute)kOfMGateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKOfMGateDefinition_M() {
		return (EAttribute)kOfMGateDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentFaultTree() {
		return componentFaultTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentFaultTree_Components() {
		return (EReference)componentFaultTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentFaultTree_TopEvent() {
		return (EReference)componentFaultTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Inputs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Outputs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ComponentDefinition() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_IntputEvent() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Component() {
		return (EReference)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_IncomingConnections() {
		return (EReference)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_EventDeclaration() {
		return (EReference)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_OutgoingConnections() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Component() {
		return (EReference)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Input() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Output() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CftFactory getCftFactory() {
		return (CftFactory)getEFactoryInstance();
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
		componentDefinitionEClass = createEClass(COMPONENT_DEFINITION);
		createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__INPUT_EVENTS);
		createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__EVENT_DEFINITIONS);
		createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__OUTPUT_EVENTS);
		createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__NAME);

		eventDefinitionEClass = createEClass(EVENT_DEFINITION);

		gateDefinitionEClass = createEClass(GATE_DEFINITION);
		createEReference(gateDefinitionEClass, GATE_DEFINITION__INPUT_EVENTS);

		basicEventDefinitionEClass = createEClass(BASIC_EVENT_DEFINITION);
		createEReference(basicEventDefinitionEClass, BASIC_EVENT_DEFINITION__DISTRIBUTION);

		intputEventEClass = createEClass(INTPUT_EVENT);
		createEAttribute(intputEventEClass, INTPUT_EVENT__MULTIPLE);

		eventDeclarationEClass = createEClass(EVENT_DECLARATION);
		createEAttribute(eventDeclarationEClass, EVENT_DECLARATION__NAME);

		andGateDefinitionEClass = createEClass(AND_GATE_DEFINITION);

		orGateDefinitionEClass = createEClass(OR_GATE_DEFINITION);

		kOfMGateDefinitionEClass = createEClass(KOF_MGATE_DEFINITION);
		createEAttribute(kOfMGateDefinitionEClass, KOF_MGATE_DEFINITION__K);
		createEAttribute(kOfMGateDefinitionEClass, KOF_MGATE_DEFINITION__M);

		componentFaultTreeEClass = createEClass(COMPONENT_FAULT_TREE);
		createEReference(componentFaultTreeEClass, COMPONENT_FAULT_TREE__COMPONENTS);
		createEReference(componentFaultTreeEClass, COMPONENT_FAULT_TREE__TOP_EVENT);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__INPUTS);
		createEReference(componentEClass, COMPONENT__OUTPUTS);
		createEReference(componentEClass, COMPONENT__COMPONENT_DEFINITION);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INTPUT_EVENT);
		createEReference(inputEClass, INPUT__COMPONENT);
		createEReference(inputEClass, INPUT__INCOMING_CONNECTIONS);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__EVENT_DECLARATION);
		createEReference(outputEClass, OUTPUT__OUTGOING_CONNECTIONS);
		createEReference(outputEClass, OUTPUT__COMPONENT);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__INPUT);
		createEReference(connectionEClass, CONNECTION__OUTPUT);
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

		// Obtain other dependent packages
		FtPackage theFtPackage = (FtPackage)EPackage.Registry.INSTANCE.getEPackage(FtPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventDefinitionEClass.getESuperTypes().add(this.getEventDeclaration());
		gateDefinitionEClass.getESuperTypes().add(this.getEventDefinition());
		basicEventDefinitionEClass.getESuperTypes().add(this.getEventDefinition());
		intputEventEClass.getESuperTypes().add(this.getEventDeclaration());
		andGateDefinitionEClass.getESuperTypes().add(this.getGateDefinition());
		orGateDefinitionEClass.getESuperTypes().add(this.getGateDefinition());
		kOfMGateDefinitionEClass.getESuperTypes().add(this.getGateDefinition());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentDefinitionEClass, ComponentDefinition.class, "ComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDefinition_InputEvents(), this.getIntputEvent(), null, "inputEvents", null, 0, -1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDefinition_EventDefinitions(), this.getEventDefinition(), null, "eventDefinitions", null, 0, -1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDefinition_OutputEvents(), this.getEventDeclaration(), null, "outputEvents", null, 0, -1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDefinitionEClass, EventDefinition.class, "EventDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gateDefinitionEClass, GateDefinition.class, "GateDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGateDefinition_InputEvents(), this.getEventDeclaration(), null, "inputEvents", null, 0, -1, GateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEventDefinitionEClass, BasicEventDefinition.class, "BasicEventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicEventDefinition_Distribution(), theFtPackage.getDistribution(), null, "distribution", null, 1, 1, BasicEventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intputEventEClass, IntputEvent.class, "IntputEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntputEvent_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, IntputEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDeclarationEClass, EventDeclaration.class, "EventDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andGateDefinitionEClass, AndGateDefinition.class, "AndGateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orGateDefinitionEClass, OrGateDefinition.class, "OrGateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kOfMGateDefinitionEClass, KOfMGateDefinition.class, "KOfMGateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKOfMGateDefinition_K(), ecorePackage.getEInt(), "k", null, 0, 1, KOfMGateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKOfMGateDefinition_M(), ecorePackage.getEInt(), "m", null, 0, 1, KOfMGateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentFaultTreeEClass, ComponentFaultTree.class, "ComponentFaultTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentFaultTree_Components(), this.getComponent(), null, "components", null, 0, -1, ComponentFaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentFaultTree_TopEvent(), this.getOutput(), null, "topEvent", null, 1, 1, ComponentFaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Inputs(), this.getInput(), this.getInput_Component(), "inputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Outputs(), this.getOutput(), this.getOutput_Component(), "outputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ComponentDefinition(), this.getComponentDefinition(), null, "componentDefinition", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_IntputEvent(), this.getIntputEvent(), null, "intputEvent", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Component(), this.getComponent(), this.getComponent_Inputs(), "component", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_IncomingConnections(), this.getConnection(), this.getConnection_Input(), "incomingConnections", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_EventDeclaration(), this.getEventDeclaration(), null, "eventDeclaration", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_OutgoingConnections(), this.getConnection(), this.getConnection_Output(), "outgoingConnections", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Component(), this.getComponent(), this.getComponent_Outputs(), "component", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Input(), this.getInput(), this.getInput_IncomingConnections(), "input", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Output(), this.getOutput(), this.getOutput_OutgoingConnections(), "output", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CftPackageImpl
