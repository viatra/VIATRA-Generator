/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

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
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface Partial2logicannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "partial2logicannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/logic/model/language/partial2logicannotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "partial2logicannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Partial2logicannotationsPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.Partial2logicannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.PartialModelRelation2AssertionImpl <em>Partial Model Relation2 Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.PartialModelRelation2AssertionImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.Partial2logicannotationsPackageImpl#getPartialModelRelation2Assertion()
	 * @generated
	 */
	int PARTIAL_MODEL_RELATION2_ASSERTION = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL_RELATION2_ASSERTION__TARGET = LogicproblemPackage.ASSERTION_ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL_RELATION2_ASSERTION__LINKS = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partial Model Relation2 Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL_RELATION2_ASSERTION_FEATURE_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Partial Model Relation2 Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_MODEL_RELATION2_ASSERTION_OPERATION_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion <em>Partial Model Relation2 Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Model Relation2 Assertion</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion
	 * @generated
	 */
	EClass getPartialModelRelation2Assertion();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion#getLinks()
	 * @see #getPartialModelRelation2Assertion()
	 * @generated
	 */
	EReference getPartialModelRelation2Assertion_Links();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion#getTargetRelation <em>Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Relation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion#getTargetRelation()
	 * @see #getPartialModelRelation2Assertion()
	 * @generated
	 */
	EReference getPartialModelRelation2Assertion_TargetRelation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Partial2logicannotationsFactory getPartial2logicannotationsFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.PartialModelRelation2AssertionImpl <em>Partial Model Relation2 Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.PartialModelRelation2AssertionImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.Partial2logicannotationsPackageImpl#getPartialModelRelation2Assertion()
		 * @generated
		 */
		EClass PARTIAL_MODEL_RELATION2_ASSERTION = eINSTANCE.getPartialModelRelation2Assertion();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_MODEL_RELATION2_ASSERTION__LINKS = eINSTANCE.getPartialModelRelation2Assertion_Links();

		/**
		 * The meta object literal for the '<em><b>Target Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION = eINSTANCE.getPartialModelRelation2Assertion_TargetRelation();

	}

} //Partial2logicannotationsPackage
