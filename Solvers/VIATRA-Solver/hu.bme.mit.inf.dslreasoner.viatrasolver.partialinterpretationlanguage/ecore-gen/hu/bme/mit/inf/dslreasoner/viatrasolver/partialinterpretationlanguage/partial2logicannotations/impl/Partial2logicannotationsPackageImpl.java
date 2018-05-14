/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsFactory;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

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
public class Partial2logicannotationsPackageImpl extends EPackageImpl implements Partial2logicannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialModelRelation2AssertionEClass = null;

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
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Partial2logicannotationsPackageImpl() {
		super(eNS_URI, Partial2logicannotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Partial2logicannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Partial2logicannotationsPackage init() {
		if (isInited) return (Partial2logicannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(Partial2logicannotationsPackage.eNS_URI);

		// Obtain or create and register package
		Partial2logicannotationsPackageImpl thePartial2logicannotationsPackage = (Partial2logicannotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Partial2logicannotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Partial2logicannotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogiclanguagePackage.eINSTANCE.eClass();
		LogicproblemPackage.eINSTANCE.eClass();
		PartialinterpretationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePartial2logicannotationsPackage.createPackageContents();

		// Initialize created meta-data
		thePartial2logicannotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePartial2logicannotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Partial2logicannotationsPackage.eNS_URI, thePartial2logicannotationsPackage);
		return thePartial2logicannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialModelRelation2Assertion() {
		return partialModelRelation2AssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialModelRelation2Assertion_Links() {
		return (EReference)partialModelRelation2AssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialModelRelation2Assertion_TargetRelation() {
		return (EReference)partialModelRelation2AssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partial2logicannotationsFactory getPartial2logicannotationsFactory() {
		return (Partial2logicannotationsFactory)getEFactoryInstance();
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
		partialModelRelation2AssertionEClass = createEClass(PARTIAL_MODEL_RELATION2_ASSERTION);
		createEReference(partialModelRelation2AssertionEClass, PARTIAL_MODEL_RELATION2_ASSERTION__LINKS);
		createEReference(partialModelRelation2AssertionEClass, PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION);
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
		PartialinterpretationPackage thePartialinterpretationPackage = (PartialinterpretationPackage)EPackage.Registry.INSTANCE.getEPackage(PartialinterpretationPackage.eNS_URI);
		LogiclanguagePackage theLogiclanguagePackage = (LogiclanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		partialModelRelation2AssertionEClass.getESuperTypes().add(theLogicproblemPackage.getAssertionAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(partialModelRelation2AssertionEClass, PartialModelRelation2Assertion.class, "PartialModelRelation2Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialModelRelation2Assertion_Links(), thePartialinterpretationPackage.getRelationLink(), null, "links", null, 0, -1, PartialModelRelation2Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialModelRelation2Assertion_TargetRelation(), theLogiclanguagePackage.getRelationDeclaration(), null, "targetRelation", null, 1, 1, PartialModelRelation2Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Partial2logicannotationsPackageImpl
