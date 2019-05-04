/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ConstantAnnotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.FunctionAnnotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.RelationAnnotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl;

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
public class LogicproblemPackageImpl extends EPackageImpl implements LogicproblemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

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
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicproblemPackageImpl() {
		super(eNS_URI, LogicproblemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogicproblemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicproblemPackage init() {
		if (isInited) return (LogicproblemPackage)EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogicproblemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogicproblemPackageImpl theLogicproblemPackage = registeredLogicproblemPackage instanceof LogicproblemPackageImpl ? (LogicproblemPackageImpl)registeredLogicproblemPackage : new LogicproblemPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI);
		LogiclanguagePackageImpl theLogiclanguagePackage = (LogiclanguagePackageImpl)(registeredPackage instanceof LogiclanguagePackageImpl ? registeredPackage : LogiclanguagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicresultPackage.eNS_URI);
		LogicresultPackageImpl theLogicresultPackage = (LogicresultPackageImpl)(registeredPackage instanceof LogicresultPackageImpl ? registeredPackage : LogicresultPackage.eINSTANCE);

		// Create package meta-data objects
		theLogicproblemPackage.createPackageContents();
		theLogiclanguagePackage.createPackageContents();
		theLogicresultPackage.createPackageContents();

		// Initialize created meta-data
		theLogicproblemPackage.initializePackageContents();
		theLogiclanguagePackage.initializePackageContents();
		theLogicresultPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogicproblemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogicproblemPackage.eNS_URI, theLogicproblemPackage);
		return theLogicproblemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicProblem() {
		return logicProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_Types() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_Functions() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_Assertions() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_Relations() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_Constants() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_Elements() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_ContainmentHierarchies() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicProblem_Annotations() {
		return (EReference)logicProblemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainmentHierarchy() {
		return containmentHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainmentHierarchy_TypesOrderedInHierarchy() {
		return (EReference)containmentHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainmentHierarchy_ContainmentFunctions() {
		return (EReference)containmentHierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainmentHierarchy_ContainmentRelations() {
		return (EReference)containmentHierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainmentHierarchy_RootConstant() {
		return (EReference)containmentHierarchyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationAnnotation() {
		return relationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationAnnotation_Target() {
		return (EReference)relationAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstantAnnotation() {
		return constantAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstantAnnotation_Target() {
		return (EReference)constantAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionAnnotation() {
		return functionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionAnnotation_Target() {
		return (EReference)functionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertionAnnotation() {
		return assertionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertionAnnotation_Target() {
		return (EReference)assertionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicproblemFactory getLogicproblemFactory() {
		return (LogicproblemFactory)getEFactoryInstance();
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
		logicProblemEClass = createEClass(LOGIC_PROBLEM);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__TYPES);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__FUNCTIONS);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__ASSERTIONS);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__RELATIONS);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__CONSTANTS);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__ELEMENTS);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES);
		createEReference(logicProblemEClass, LOGIC_PROBLEM__ANNOTATIONS);

		containmentHierarchyEClass = createEClass(CONTAINMENT_HIERARCHY);
		createEReference(containmentHierarchyEClass, CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY);
		createEReference(containmentHierarchyEClass, CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS);
		createEReference(containmentHierarchyEClass, CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS);
		createEReference(containmentHierarchyEClass, CONTAINMENT_HIERARCHY__ROOT_CONSTANT);

		relationAnnotationEClass = createEClass(RELATION_ANNOTATION);
		createEReference(relationAnnotationEClass, RELATION_ANNOTATION__TARGET);

		constantAnnotationEClass = createEClass(CONSTANT_ANNOTATION);
		createEReference(constantAnnotationEClass, CONSTANT_ANNOTATION__TARGET);

		functionAnnotationEClass = createEClass(FUNCTION_ANNOTATION);
		createEReference(functionAnnotationEClass, FUNCTION_ANNOTATION__TARGET);

		assertionAnnotationEClass = createEClass(ASSERTION_ANNOTATION);
		createEReference(assertionAnnotationEClass, ASSERTION_ANNOTATION__TARGET);

		annotationEClass = createEClass(ANNOTATION);
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
		LogiclanguagePackage theLogiclanguagePackage = (LogiclanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationAnnotationEClass.getESuperTypes().add(this.getAnnotation());
		constantAnnotationEClass.getESuperTypes().add(this.getAnnotation());
		functionAnnotationEClass.getESuperTypes().add(this.getAnnotation());
		assertionAnnotationEClass.getESuperTypes().add(this.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(logicProblemEClass, LogicProblem.class, "LogicProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicProblem_Types(), theLogiclanguagePackage.getType(), null, "types", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicProblem_Functions(), theLogiclanguagePackage.getFunction(), null, "functions", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicProblem_Assertions(), theLogiclanguagePackage.getAssertion(), null, "assertions", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicProblem_Relations(), theLogiclanguagePackage.getRelation(), null, "relations", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicProblem_Constants(), theLogiclanguagePackage.getConstant(), null, "constants", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicProblem_Elements(), theLogiclanguagePackage.getDefinedElement(), null, "elements", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicProblem_ContainmentHierarchies(), this.getContainmentHierarchy(), null, "containmentHierarchies", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicProblem_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, LogicProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentHierarchyEClass, ContainmentHierarchy.class, "ContainmentHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainmentHierarchy_TypesOrderedInHierarchy(), theLogiclanguagePackage.getType(), null, "typesOrderedInHierarchy", null, 0, -1, ContainmentHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentHierarchy_ContainmentFunctions(), theLogiclanguagePackage.getFunction(), null, "containmentFunctions", null, 0, -1, ContainmentHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentHierarchy_ContainmentRelations(), theLogiclanguagePackage.getRelation(), null, "containmentRelations", null, 0, -1, ContainmentHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentHierarchy_RootConstant(), theLogiclanguagePackage.getConstant(), null, "rootConstant", null, 0, 1, ContainmentHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationAnnotationEClass, RelationAnnotation.class, "RelationAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationAnnotation_Target(), theLogiclanguagePackage.getRelation(), theLogiclanguagePackage.getRelation_Annotations(), "target", null, 1, 1, RelationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantAnnotationEClass, ConstantAnnotation.class, "ConstantAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantAnnotation_Target(), theLogiclanguagePackage.getConstant(), theLogiclanguagePackage.getConstant_Annotations(), "target", null, 1, 1, ConstantAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionAnnotationEClass, FunctionAnnotation.class, "FunctionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionAnnotation_Target(), theLogiclanguagePackage.getFunction(), theLogiclanguagePackage.getFunction_Annotations(), "target", null, 1, 1, FunctionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionAnnotationEClass, AssertionAnnotation.class, "AssertionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertionAnnotation_Target(), theLogiclanguagePackage.getAssertion(), theLogiclanguagePackage.getAssertion_Annotations(), "target", null, 1, 1, AssertionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LogicproblemPackageImpl
