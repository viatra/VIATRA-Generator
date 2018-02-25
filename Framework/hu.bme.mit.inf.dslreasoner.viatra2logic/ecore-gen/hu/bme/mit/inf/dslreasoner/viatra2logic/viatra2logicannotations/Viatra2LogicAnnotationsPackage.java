/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

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
 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface Viatra2LogicAnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viatra2logicannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/logic/model/language/viatra2logicannotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viatra2logicannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Viatra2LogicAnnotationsPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl <em>Transfomed Viatra Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsPackageImpl#getTransfomedViatraQuery()
	 * @generated
	 */
	int TRANSFOMED_VIATRA_QUERY = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFOMED_VIATRA_QUERY__TARGET = LogicproblemPackage.RELATION_ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Pattern Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME = LogicproblemPackage.RELATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern PQuery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY = LogicproblemPackage.RELATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transfomed Viatra Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFOMED_VIATRA_QUERY_FEATURE_COUNT = LogicproblemPackage.RELATION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transfomed Viatra Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFOMED_VIATRA_QUERY_OPERATION_COUNT = LogicproblemPackage.RELATION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransformedViatraWellformednessConstraintImpl <em>Transformed Viatra Wellformedness Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransformedViatraWellformednessConstraintImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsPackageImpl#getTransformedViatraWellformednessConstraint()
	 * @generated
	 */
	int TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT__TARGET = LogicproblemPackage.ASSERTION_ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT__QUERY = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformed Viatra Wellformedness Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT_FEATURE_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transformed Viatra Wellformedness Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT_OPERATION_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.DefinedByDerivedFeatureImpl <em>Defined By Derived Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.DefinedByDerivedFeatureImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsPackageImpl#getDefinedByDerivedFeature()
	 * @generated
	 */
	int DEFINED_BY_DERIVED_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY_DERIVED_FEATURE__TARGET = LogicproblemPackage.RELATION_ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY_DERIVED_FEATURE__QUERY = LogicproblemPackage.RELATION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defined By Derived Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY_DERIVED_FEATURE_FEATURE_COUNT = LogicproblemPackage.RELATION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Defined By Derived Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_BY_DERIVED_FEATURE_OPERATION_COUNT = LogicproblemPackage.RELATION_ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery <em>Transfomed Viatra Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfomed Viatra Query</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
	 * @generated
	 */
	EClass getTransfomedViatraQuery();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternFullyQualifiedName <em>Pattern Fully Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Fully Qualified Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternFullyQualifiedName()
	 * @see #getTransfomedViatraQuery()
	 * @generated
	 */
	EAttribute getTransfomedViatraQuery_PatternFullyQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternPQuery <em>Pattern PQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern PQuery</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternPQuery()
	 * @see #getTransfomedViatraQuery()
	 * @generated
	 */
	EAttribute getTransfomedViatraQuery_PatternPQuery();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint <em>Transformed Viatra Wellformedness Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformed Viatra Wellformedness Constraint</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint
	 * @generated
	 */
	EClass getTransformedViatraWellformednessConstraint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint#getQuery()
	 * @see #getTransformedViatraWellformednessConstraint()
	 * @generated
	 */
	EReference getTransformedViatraWellformednessConstraint_Query();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.DefinedByDerivedFeature <em>Defined By Derived Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined By Derived Feature</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.DefinedByDerivedFeature
	 * @generated
	 */
	EClass getDefinedByDerivedFeature();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.DefinedByDerivedFeature#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.DefinedByDerivedFeature#getQuery()
	 * @see #getDefinedByDerivedFeature()
	 * @generated
	 */
	EReference getDefinedByDerivedFeature_Query();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Viatra2LogicAnnotationsFactory getViatra2LogicAnnotationsFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl <em>Transfomed Viatra Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsPackageImpl#getTransfomedViatraQuery()
		 * @generated
		 */
		EClass TRANSFOMED_VIATRA_QUERY = eINSTANCE.getTransfomedViatraQuery();

		/**
		 * The meta object literal for the '<em><b>Pattern Fully Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME = eINSTANCE.getTransfomedViatraQuery_PatternFullyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Pattern PQuery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY = eINSTANCE.getTransfomedViatraQuery_PatternPQuery();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransformedViatraWellformednessConstraintImpl <em>Transformed Viatra Wellformedness Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransformedViatraWellformednessConstraintImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsPackageImpl#getTransformedViatraWellformednessConstraint()
		 * @generated
		 */
		EClass TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT = eINSTANCE.getTransformedViatraWellformednessConstraint();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT__QUERY = eINSTANCE.getTransformedViatraWellformednessConstraint_Query();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.DefinedByDerivedFeatureImpl <em>Defined By Derived Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.DefinedByDerivedFeatureImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsPackageImpl#getDefinedByDerivedFeature()
		 * @generated
		 */
		EClass DEFINED_BY_DERIVED_FEATURE = eINSTANCE.getDefinedByDerivedFeature();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_BY_DERIVED_FEATURE__QUERY = eINSTANCE.getDefinedByDerivedFeature_Query();

	}

} //Viatra2LogicAnnotationsPackage
