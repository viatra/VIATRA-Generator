/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate;

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
public class FtPackageImpl extends EPackageImpl implements FtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kOfMGateEClass = null;

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
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FtPackageImpl() {
		super(eNS_URI, FtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FtPackage init() {
		if (isInited) return (FtPackage)EPackage.Registry.INSTANCE.getEPackage(FtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FtPackageImpl theFtPackage = registeredFtPackage instanceof FtPackageImpl ? (FtPackageImpl)registeredFtPackage : new FtPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFtPackage.createPackageContents();

		// Initialize created meta-data
		theFtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FtPackage.eNS_URI, theFtPackage);
		return theFtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFaultTree() {
		return faultTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFaultTree_Events() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFaultTree_TopEvent() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicEvent() {
		return basicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicEvent_Distribution() {
		return (EReference)basicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGate_InputEvents() {
		return (EReference)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstantDistribution() {
		return constantDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstantDistribution_P() {
		return (EAttribute)constantDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExponentialDistribution() {
		return exponentialDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExponentialDistribution_Lambda() {
		return (EAttribute)exponentialDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAndGate() {
		return andGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrGate() {
		return orGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKOfMGate() {
		return kOfMGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKOfMGate_K() {
		return (EAttribute)kOfMGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKOfMGate_M() {
		return (EAttribute)kOfMGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FtFactory getFtFactory() {
		return (FtFactory)getEFactoryInstance();
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
		faultTreeEClass = createEClass(FAULT_TREE);
		createEReference(faultTreeEClass, FAULT_TREE__EVENTS);
		createEReference(faultTreeEClass, FAULT_TREE__TOP_EVENT);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		basicEventEClass = createEClass(BASIC_EVENT);
		createEReference(basicEventEClass, BASIC_EVENT__DISTRIBUTION);

		gateEClass = createEClass(GATE);
		createEReference(gateEClass, GATE__INPUT_EVENTS);

		distributionEClass = createEClass(DISTRIBUTION);

		constantDistributionEClass = createEClass(CONSTANT_DISTRIBUTION);
		createEAttribute(constantDistributionEClass, CONSTANT_DISTRIBUTION__P);

		exponentialDistributionEClass = createEClass(EXPONENTIAL_DISTRIBUTION);
		createEAttribute(exponentialDistributionEClass, EXPONENTIAL_DISTRIBUTION__LAMBDA);

		andGateEClass = createEClass(AND_GATE);

		orGateEClass = createEClass(OR_GATE);

		kOfMGateEClass = createEClass(KOF_MGATE);
		createEAttribute(kOfMGateEClass, KOF_MGATE__K);
		createEAttribute(kOfMGateEClass, KOF_MGATE__M);
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
		basicEventEClass.getESuperTypes().add(this.getEvent());
		gateEClass.getESuperTypes().add(this.getEvent());
		constantDistributionEClass.getESuperTypes().add(this.getDistribution());
		exponentialDistributionEClass.getESuperTypes().add(this.getDistribution());
		andGateEClass.getESuperTypes().add(this.getGate());
		orGateEClass.getESuperTypes().add(this.getGate());
		kOfMGateEClass.getESuperTypes().add(this.getGate());

		// Initialize classes, features, and operations; add parameters
		initEClass(faultTreeEClass, FaultTree.class, "FaultTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaultTree_Events(), this.getEvent(), null, "events", null, 0, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_TopEvent(), this.getEvent(), null, "topEvent", null, 1, 1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEventEClass, BasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicEvent_Distribution(), this.getDistribution(), null, "distribution", null, 1, 1, BasicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGate_InputEvents(), this.getEvent(), null, "inputEvents", null, 0, -1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionEClass, Distribution.class, "Distribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantDistributionEClass, ConstantDistribution.class, "ConstantDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantDistribution_P(), ecorePackage.getEDouble(), "p", null, 0, 1, ConstantDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialDistributionEClass, ExponentialDistribution.class, "ExponentialDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponentialDistribution_Lambda(), ecorePackage.getEDouble(), "lambda", null, 0, 1, ExponentialDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andGateEClass, AndGate.class, "AndGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orGateEClass, OrGate.class, "OrGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kOfMGateEClass, KOfMGate.class, "KOfMGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKOfMGate_K(), ecorePackage.getEInt(), "k", null, 0, 1, KOfMGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKOfMGate_M(), ecorePackage.getEInt(), "m", null, 0, 1, KOfMGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FtPackageImpl
