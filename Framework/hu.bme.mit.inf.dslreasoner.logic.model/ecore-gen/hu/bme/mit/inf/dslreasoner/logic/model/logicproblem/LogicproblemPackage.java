/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem;

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
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemFactory
 * @model kind="package"
 * @generated
 */
public interface LogicproblemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logicproblem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/logic/model/problem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "language";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicproblemPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl <em>Logic Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getLogicProblem()
	 * @generated
	 */
	int LOGIC_PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__FUNCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__ASSERTIONS = 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__RELATIONS = 3;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__CONSTANTS = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Containment Hierarchies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM__ANNOTATIONS = 7;

	/**
	 * The number of structural features of the '<em>Logic Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Logic Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl <em>Containment Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getContainmentHierarchy()
	 * @generated
	 */
	int CONTAINMENT_HIERARCHY = 1;

	/**
	 * The feature id for the '<em><b>Types Ordered In Hierarchy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY = 0;

	/**
	 * The feature id for the '<em><b>Containment Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Containment Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Root Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_HIERARCHY__ROOT_CONSTANT = 3;

	/**
	 * The number of structural features of the '<em>Containment Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_HIERARCHY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Containment Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_HIERARCHY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AnnotationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 6;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl <em>Relation Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getRelationAnnotation()
	 * @generated
	 */
	int RELATION_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ANNOTATION__TARGET = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ConstantAnnotationImpl <em>Constant Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ConstantAnnotationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getConstantAnnotation()
	 * @generated
	 */
	int CONSTANT_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION__TARGET = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.FunctionAnnotationImpl <em>Function Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.FunctionAnnotationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getFunctionAnnotation()
	 * @generated
	 */
	int FUNCTION_ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ANNOTATION__TARGET = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AssertionAnnotationImpl <em>Assertion Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AssertionAnnotationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getAssertionAnnotation()
	 * @generated
	 */
	int ASSERTION_ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_ANNOTATION__TARGET = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_ANNOTATION_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assertion Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_ANNOTATION_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem <em>Logic Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Problem</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
	 * @generated
	 */
	EClass getLogicProblem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getTypes()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getFunctions()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getAssertions()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_Assertions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getRelations()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getConstants()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_Constants();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getElements()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getContainmentHierarchies <em>Containment Hierarchies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment Hierarchies</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getContainmentHierarchies()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_ContainmentHierarchies();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem#getAnnotations()
	 * @see #getLogicProblem()
	 * @generated
	 */
	EReference getLogicProblem_Annotations();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy <em>Containment Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Hierarchy</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
	 * @generated
	 */
	EClass getContainmentHierarchy();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getTypesOrderedInHierarchy <em>Types Ordered In Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types Ordered In Hierarchy</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getTypesOrderedInHierarchy()
	 * @see #getContainmentHierarchy()
	 * @generated
	 */
	EReference getContainmentHierarchy_TypesOrderedInHierarchy();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getContainmentFunctions <em>Containment Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containment Functions</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getContainmentFunctions()
	 * @see #getContainmentHierarchy()
	 * @generated
	 */
	EReference getContainmentHierarchy_ContainmentFunctions();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getContainmentRelations <em>Containment Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containment Relations</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getContainmentRelations()
	 * @see #getContainmentHierarchy()
	 * @generated
	 */
	EReference getContainmentHierarchy_ContainmentRelations();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getRootConstant <em>Root Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Constant</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getRootConstant()
	 * @see #getContainmentHierarchy()
	 * @generated
	 */
	EReference getContainmentHierarchy_RootConstant();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.RelationAnnotation <em>Relation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Annotation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.RelationAnnotation
	 * @generated
	 */
	EClass getRelationAnnotation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.RelationAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.RelationAnnotation#getTarget()
	 * @see #getRelationAnnotation()
	 * @generated
	 */
	EReference getRelationAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ConstantAnnotation <em>Constant Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Annotation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ConstantAnnotation
	 * @generated
	 */
	EClass getConstantAnnotation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ConstantAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ConstantAnnotation#getTarget()
	 * @see #getConstantAnnotation()
	 * @generated
	 */
	EReference getConstantAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.FunctionAnnotation <em>Function Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Annotation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.FunctionAnnotation
	 * @generated
	 */
	EClass getFunctionAnnotation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.FunctionAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.FunctionAnnotation#getTarget()
	 * @see #getFunctionAnnotation()
	 * @generated
	 */
	EReference getFunctionAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation <em>Assertion Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Annotation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation
	 * @generated
	 */
	EClass getAssertionAnnotation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation#getTarget()
	 * @see #getAssertionAnnotation()
	 * @generated
	 */
	EReference getAssertionAnnotation_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicproblemFactory getLogicproblemFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl <em>Logic Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getLogicProblem()
		 * @generated
		 */
		EClass LOGIC_PROBLEM = eINSTANCE.getLogicProblem();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__TYPES = eINSTANCE.getLogicProblem_Types();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__FUNCTIONS = eINSTANCE.getLogicProblem_Functions();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__ASSERTIONS = eINSTANCE.getLogicProblem_Assertions();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__RELATIONS = eINSTANCE.getLogicProblem_Relations();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__CONSTANTS = eINSTANCE.getLogicProblem_Constants();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__ELEMENTS = eINSTANCE.getLogicProblem_Elements();

		/**
		 * The meta object literal for the '<em><b>Containment Hierarchies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES = eINSTANCE.getLogicProblem_ContainmentHierarchies();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_PROBLEM__ANNOTATIONS = eINSTANCE.getLogicProblem_Annotations();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl <em>Containment Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getContainmentHierarchy()
		 * @generated
		 */
		EClass CONTAINMENT_HIERARCHY = eINSTANCE.getContainmentHierarchy();

		/**
		 * The meta object literal for the '<em><b>Types Ordered In Hierarchy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY = eINSTANCE.getContainmentHierarchy_TypesOrderedInHierarchy();

		/**
		 * The meta object literal for the '<em><b>Containment Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS = eINSTANCE.getContainmentHierarchy_ContainmentFunctions();

		/**
		 * The meta object literal for the '<em><b>Containment Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS = eINSTANCE.getContainmentHierarchy_ContainmentRelations();

		/**
		 * The meta object literal for the '<em><b>Root Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_HIERARCHY__ROOT_CONSTANT = eINSTANCE.getContainmentHierarchy_RootConstant();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl <em>Relation Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getRelationAnnotation()
		 * @generated
		 */
		EClass RELATION_ANNOTATION = eINSTANCE.getRelationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ANNOTATION__TARGET = eINSTANCE.getRelationAnnotation_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ConstantAnnotationImpl <em>Constant Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ConstantAnnotationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getConstantAnnotation()
		 * @generated
		 */
		EClass CONSTANT_ANNOTATION = eINSTANCE.getConstantAnnotation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_ANNOTATION__TARGET = eINSTANCE.getConstantAnnotation_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.FunctionAnnotationImpl <em>Function Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.FunctionAnnotationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getFunctionAnnotation()
		 * @generated
		 */
		EClass FUNCTION_ANNOTATION = eINSTANCE.getFunctionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ANNOTATION__TARGET = eINSTANCE.getFunctionAnnotation_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AssertionAnnotationImpl <em>Assertion Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AssertionAnnotationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getAssertionAnnotation()
		 * @generated
		 */
		EClass ASSERTION_ANNOTATION = eINSTANCE.getAssertionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_ANNOTATION__TARGET = eINSTANCE.getAssertionAnnotation_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AnnotationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

	}

} //LogicproblemPackage
