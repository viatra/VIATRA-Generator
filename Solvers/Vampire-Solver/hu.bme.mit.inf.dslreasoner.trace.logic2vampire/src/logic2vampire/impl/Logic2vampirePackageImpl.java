/**
 */
package logic2vampire.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguagePackage;

import logic2vampire.Logic2Vampire;
import logic2vampire.Logic2VampireTrace;
import logic2vampire.Logic2vampireFactory;
import logic2vampire.Logic2vampirePackage;

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
public class Logic2vampirePackageImpl extends EPackageImpl implements Logic2vampirePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logic2VampireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logic2VampireTraceEClass = null;

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
	 * @see logic2vampire.Logic2vampirePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Logic2vampirePackageImpl() {
		super(eNS_URI, Logic2vampireFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Logic2vampirePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Logic2vampirePackage init() {
		if (isInited) return (Logic2vampirePackage)EPackage.Registry.INSTANCE.getEPackage(Logic2vampirePackage.eNS_URI);

		// Obtain or create and register package
		Logic2vampirePackageImpl theLogic2vampirePackage = (Logic2vampirePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Logic2vampirePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Logic2vampirePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogiclanguagePackage.eINSTANCE.eClass();
		LogicproblemPackage.eINSTANCE.eClass();
		VampireLanguagePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLogic2vampirePackage.createPackageContents();

		// Initialize created meta-data
		theLogic2vampirePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogic2vampirePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Logic2vampirePackage.eNS_URI, theLogic2vampirePackage);
		return theLogic2vampirePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogic2Vampire() {
		return logic2VampireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogic2Vampire_Logic() {
		return (EReference)logic2VampireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogic2Vampire_Vampire() {
		return (EReference)logic2VampireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogic2Vampire_Traces() {
		return (EReference)logic2VampireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogic2VampireTrace() {
		return logic2VampireTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogic2VampireTrace_TermDescription() {
		return (EReference)logic2VampireTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogic2VampireTrace_VlsFormula() {
		return (EReference)logic2VampireTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logic2vampireFactory getLogic2vampireFactory() {
		return (Logic2vampireFactory)getEFactoryInstance();
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
		logic2VampireEClass = createEClass(LOGIC2_VAMPIRE);
		createEReference(logic2VampireEClass, LOGIC2_VAMPIRE__LOGIC);
		createEReference(logic2VampireEClass, LOGIC2_VAMPIRE__VAMPIRE);
		createEReference(logic2VampireEClass, LOGIC2_VAMPIRE__TRACES);

		logic2VampireTraceEClass = createEClass(LOGIC2_VAMPIRE_TRACE);
		createEReference(logic2VampireTraceEClass, LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION);
		createEReference(logic2VampireTraceEClass, LOGIC2_VAMPIRE_TRACE__VLS_FORMULA);
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
		LogicproblemPackage theLogicproblemPackage = (LogicproblemPackage)EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI);
		VampireLanguagePackage theVampireLanguagePackage = (VampireLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(VampireLanguagePackage.eNS_URI);
		LogiclanguagePackage theLogiclanguagePackage = (LogiclanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(logic2VampireEClass, Logic2Vampire.class, "Logic2Vampire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogic2Vampire_Logic(), theLogicproblemPackage.getLogicProblem(), null, "logic", null, 0, 1, Logic2Vampire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogic2Vampire_Vampire(), theVampireLanguagePackage.getVampireModel(), null, "vampire", null, 0, 1, Logic2Vampire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogic2Vampire_Traces(), this.getLogic2VampireTrace(), null, "traces", null, 0, -1, Logic2Vampire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logic2VampireTraceEClass, Logic2VampireTrace.class, "Logic2VampireTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogic2VampireTrace_TermDescription(), theLogiclanguagePackage.getTermDescription(), null, "termDescription", null, 0, -1, Logic2VampireTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogic2VampireTrace_VlsFormula(), theVampireLanguagePackage.getVLSFofFormula(), null, "vlsFormula", null, 0, -1, Logic2VampireTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Logic2vampirePackageImpl
