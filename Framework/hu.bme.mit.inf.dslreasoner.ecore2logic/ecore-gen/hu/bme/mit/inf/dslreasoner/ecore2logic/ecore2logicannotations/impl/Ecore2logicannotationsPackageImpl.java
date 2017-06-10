/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsFactory;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.MultiplicityAssertion;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

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
public class Ecore2logicannotationsPackageImpl extends EPackageImpl implements Ecore2logicannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseRelationAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerMultiplicityAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperMultiplicityAssertionEClass = null;

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
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ecore2logicannotationsPackageImpl() {
		super(eNS_URI, Ecore2logicannotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Ecore2logicannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ecore2logicannotationsPackage init() {
		if (isInited) return (Ecore2logicannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(Ecore2logicannotationsPackage.eNS_URI);

		// Obtain or create and register package
		Ecore2logicannotationsPackageImpl theEcore2logicannotationsPackage = (Ecore2logicannotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ecore2logicannotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ecore2logicannotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogiclanguagePackage.eINSTANCE.eClass();
		LogicproblemPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcore2logicannotationsPackage.createPackageContents();

		// Initialize created meta-data
		theEcore2logicannotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcore2logicannotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ecore2logicannotationsPackage.eNS_URI, theEcore2logicannotationsPackage);
		return theEcore2logicannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityAssertion() {
		return multiplicityAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityAssertion_Relation() {
		return (EReference)multiplicityAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseRelationAssertion() {
		return inverseRelationAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseRelationAssertion_InverseA() {
		return (EReference)inverseRelationAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverseRelationAssertion_InverseB() {
		return (EReference)inverseRelationAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerMultiplicityAssertion() {
		return lowerMultiplicityAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLowerMultiplicityAssertion_Lower() {
		return (EAttribute)lowerMultiplicityAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpperMultiplicityAssertion() {
		return upperMultiplicityAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpperMultiplicityAssertion_Upper() {
		return (EAttribute)upperMultiplicityAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecore2logicannotationsFactory getEcore2logicannotationsFactory() {
		return (Ecore2logicannotationsFactory)getEFactoryInstance();
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
		multiplicityAssertionEClass = createEClass(MULTIPLICITY_ASSERTION);
		createEReference(multiplicityAssertionEClass, MULTIPLICITY_ASSERTION__RELATION);

		inverseRelationAssertionEClass = createEClass(INVERSE_RELATION_ASSERTION);
		createEReference(inverseRelationAssertionEClass, INVERSE_RELATION_ASSERTION__INVERSE_A);
		createEReference(inverseRelationAssertionEClass, INVERSE_RELATION_ASSERTION__INVERSE_B);

		lowerMultiplicityAssertionEClass = createEClass(LOWER_MULTIPLICITY_ASSERTION);
		createEAttribute(lowerMultiplicityAssertionEClass, LOWER_MULTIPLICITY_ASSERTION__LOWER);

		upperMultiplicityAssertionEClass = createEClass(UPPER_MULTIPLICITY_ASSERTION);
		createEAttribute(upperMultiplicityAssertionEClass, UPPER_MULTIPLICITY_ASSERTION__UPPER);
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
		LogiclanguagePackage theLogiclanguagePackage = (LogiclanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multiplicityAssertionEClass.getESuperTypes().add(theLogicproblemPackage.getAssertionAnnotation());
		inverseRelationAssertionEClass.getESuperTypes().add(theLogicproblemPackage.getAssertionAnnotation());
		lowerMultiplicityAssertionEClass.getESuperTypes().add(this.getMultiplicityAssertion());
		upperMultiplicityAssertionEClass.getESuperTypes().add(this.getMultiplicityAssertion());

		// Initialize classes, features, and operations; add parameters
		initEClass(multiplicityAssertionEClass, MultiplicityAssertion.class, "MultiplicityAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityAssertion_Relation(), theLogiclanguagePackage.getRelation(), null, "relation", null, 1, 1, MultiplicityAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inverseRelationAssertionEClass, InverseRelationAssertion.class, "InverseRelationAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverseRelationAssertion_InverseA(), theLogiclanguagePackage.getRelation(), null, "inverseA", null, 1, 1, InverseRelationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverseRelationAssertion_InverseB(), theLogiclanguagePackage.getRelation(), null, "inverseB", null, 1, 1, InverseRelationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowerMultiplicityAssertionEClass, LowerMultiplicityAssertion.class, "LowerMultiplicityAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLowerMultiplicityAssertion_Lower(), ecorePackage.getEInt(), "lower", null, 1, 1, LowerMultiplicityAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upperMultiplicityAssertionEClass, UpperMultiplicityAssertion.class, "UpperMultiplicityAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpperMultiplicityAssertion_Upper(), ecorePackage.getEInt(), "upper", null, 1, 1, UpperMultiplicityAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Ecore2logicannotationsPackageImpl
