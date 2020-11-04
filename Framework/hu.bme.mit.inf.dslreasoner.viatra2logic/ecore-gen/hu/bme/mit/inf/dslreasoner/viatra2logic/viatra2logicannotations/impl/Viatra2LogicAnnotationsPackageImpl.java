/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.DefinedByDerivedFeature;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsFactory;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;

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
public class Viatra2LogicAnnotationsPackageImpl extends EPackageImpl implements Viatra2LogicAnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfomedViatraQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformedViatraWellformednessConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedByDerivedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableMappingEClass = null;

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
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Viatra2LogicAnnotationsPackageImpl() {
		super(eNS_URI, Viatra2LogicAnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Viatra2LogicAnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Viatra2LogicAnnotationsPackage init() {
		if (isInited) return (Viatra2LogicAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(Viatra2LogicAnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViatra2LogicAnnotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Viatra2LogicAnnotationsPackageImpl theViatra2LogicAnnotationsPackage = registeredViatra2LogicAnnotationsPackage instanceof Viatra2LogicAnnotationsPackageImpl ? (Viatra2LogicAnnotationsPackageImpl)registeredViatra2LogicAnnotationsPackage : new Viatra2LogicAnnotationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		LogiclanguagePackage.eINSTANCE.eClass();
		LogicproblemPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViatra2LogicAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theViatra2LogicAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViatra2LogicAnnotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Viatra2LogicAnnotationsPackage.eNS_URI, theViatra2LogicAnnotationsPackage);
		return theViatra2LogicAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransfomedViatraQuery() {
		return transfomedViatraQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransfomedViatraQuery_PatternFullyQualifiedName() {
		return (EAttribute)transfomedViatraQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransfomedViatraQuery_PatternPQuery() {
		return (EAttribute)transfomedViatraQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransfomedViatraQuery_VariableTrace() {
		return (EReference)transfomedViatraQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransfomedViatraQuery_OptimizedDisjunction() {
		return (EAttribute)transfomedViatraQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransformedViatraWellformednessConstraint() {
		return transformedViatraWellformednessConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransformedViatraWellformednessConstraint_Query() {
		return (EReference)transformedViatraWellformednessConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinedByDerivedFeature() {
		return definedByDerivedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinedByDerivedFeature_Query() {
		return (EReference)definedByDerivedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableMapping() {
		return variableMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableMapping_SourcePVariable() {
		return (EAttribute)variableMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableMapping_TargetLogicVariable() {
		return (EReference)variableMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Viatra2LogicAnnotationsFactory getViatra2LogicAnnotationsFactory() {
		return (Viatra2LogicAnnotationsFactory)getEFactoryInstance();
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
		transfomedViatraQueryEClass = createEClass(TRANSFOMED_VIATRA_QUERY);
		createEAttribute(transfomedViatraQueryEClass, TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME);
		createEAttribute(transfomedViatraQueryEClass, TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY);
		createEReference(transfomedViatraQueryEClass, TRANSFOMED_VIATRA_QUERY__VARIABLE_TRACE);
		createEAttribute(transfomedViatraQueryEClass, TRANSFOMED_VIATRA_QUERY__OPTIMIZED_DISJUNCTION);

		transformedViatraWellformednessConstraintEClass = createEClass(TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT);
		createEReference(transformedViatraWellformednessConstraintEClass, TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT__QUERY);

		definedByDerivedFeatureEClass = createEClass(DEFINED_BY_DERIVED_FEATURE);
		createEReference(definedByDerivedFeatureEClass, DEFINED_BY_DERIVED_FEATURE__QUERY);

		variableMappingEClass = createEClass(VARIABLE_MAPPING);
		createEAttribute(variableMappingEClass, VARIABLE_MAPPING__SOURCE_PVARIABLE);
		createEReference(variableMappingEClass, VARIABLE_MAPPING__TARGET_LOGIC_VARIABLE);
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
		transfomedViatraQueryEClass.getESuperTypes().add(theLogicproblemPackage.getRelationAnnotation());
		transformedViatraWellformednessConstraintEClass.getESuperTypes().add(theLogicproblemPackage.getAssertionAnnotation());
		definedByDerivedFeatureEClass.getESuperTypes().add(theLogicproblemPackage.getRelationAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(transfomedViatraQueryEClass, TransfomedViatraQuery.class, "TransfomedViatraQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransfomedViatraQuery_PatternFullyQualifiedName(), ecorePackage.getEString(), "patternFullyQualifiedName", null, 1, 1, TransfomedViatraQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransfomedViatraQuery_PatternPQuery(), ecorePackage.getEJavaObject(), "patternPQuery", null, 1, 1, TransfomedViatraQuery.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransfomedViatraQuery_VariableTrace(), this.getVariableMapping(), null, "variableTrace", null, 0, -1, TransfomedViatraQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransfomedViatraQuery_OptimizedDisjunction(), ecorePackage.getEJavaObject(), "optimizedDisjunction", null, 1, 1, TransfomedViatraQuery.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformedViatraWellformednessConstraintEClass, TransformedViatraWellformednessConstraint.class, "TransformedViatraWellformednessConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformedViatraWellformednessConstraint_Query(), this.getTransfomedViatraQuery(), null, "query", null, 1, 1, TransformedViatraWellformednessConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definedByDerivedFeatureEClass, DefinedByDerivedFeature.class, "DefinedByDerivedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinedByDerivedFeature_Query(), this.getTransfomedViatraQuery(), null, "query", null, 1, 1, DefinedByDerivedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableMappingEClass, VariableMapping.class, "VariableMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableMapping_SourcePVariable(), ecorePackage.getEJavaObject(), "sourcePVariable", null, 1, 1, VariableMapping.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableMapping_TargetLogicVariable(), theLogiclanguagePackage.getVariable(), null, "targetLogicVariable", null, 1, 1, VariableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Viatra2LogicAnnotationsPackageImpl
