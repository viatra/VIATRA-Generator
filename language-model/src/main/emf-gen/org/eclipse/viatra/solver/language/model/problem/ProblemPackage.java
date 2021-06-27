/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemFactory
 * @model kind="package"
 * @generated
 */
public interface ProblemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "problem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/viatra/solver/language/model/Problem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "problem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProblemPackage eINSTANCE = org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.NamedElementImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.RelationImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ClassDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getClassDeclaration()
	 * @generated
	 */
	int CLASS_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ABSTRACT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPER_TYPES = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__REFERENCE_DECLARATIONS = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__NEW_NODE = RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl <em>Reference Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getReferenceDeclaration()
	 * @generated
	 */
	int REFERENCE_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DECLARATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DECLARATION__REFERENCE_TYPE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DECLARATION__OPPOSITE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DECLARATION__CONTAINMENT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DECLARATION__MULTIPLICITY = RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reference Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DECLARATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reference Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DECLARATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.PredicateDefinitionImpl <em>Predicate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.PredicateDefinitionImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getPredicateDefinition()
	 * @generated
	 */
	int PREDICATE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__ERROR = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__PARAMETERS = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__BODIES = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Predicate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Predicate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeImpl <em>Variable Or Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getVariableOrNode()
	 * @generated
	 */
	int VARIABLE_OR_NODE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Variable Or Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Or Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.VariableImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = VARIABLE_OR_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VARIABLE_OR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = VARIABLE_OR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ParameterImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier <em>Existential Quantifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getExistentialQuantifier()
	 * @generated
	 */
	int EXISTENTIAL_QUANTIFIER = 13;

	/**
	 * The feature id for the '<em><b>Implicit Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFIER__IMPLICIT_VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Existential Quantifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Existential Quantifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENTIAL_QUANTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConjunctionImpl <em>Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConjunctionImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConjunction()
	 * @generated
	 */
	int CONJUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Implicit Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__IMPLICIT_VARIABLES = EXISTENTIAL_QUANTIFIER__IMPLICIT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LITERALS = EXISTENTIAL_QUANTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = EXISTENTIAL_QUANTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_OPERATION_COUNT = EXISTENTIAL_QUANTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.LiteralImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 9;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.AtomImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 10;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__RELATION = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitive Closure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__TRANSITIVE_CLOSURE = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ARGUMENTS = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ImplicitVariableImpl <em>Implicit Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ImplicitVariableImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getImplicitVariable()
	 * @generated
	 */
	int IMPLICIT_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Implicit Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implicit Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NegativeLiteralImpl <em>Negative Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.NegativeLiteralImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNegativeLiteral()
	 * @generated
	 */
	int NEGATIVE_LITERAL = 12;

	/**
	 * The feature id for the '<em><b>Implicit Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_LITERAL__IMPLICIT_VARIABLES = EXISTENTIAL_QUANTIFIER__IMPLICIT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_LITERAL__ATOM = EXISTENTIAL_QUANTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negative Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_LITERAL_FEATURE_COUNT = EXISTENTIAL_QUANTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negative Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_LITERAL_OPERATION_COUNT = EXISTENTIAL_QUANTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.Statement
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 17;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.AssertionImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 14;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__RELATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.NodeImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = VARIABLE_OR_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = VARIABLE_OR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = VARIABLE_OR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ScopeDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getScopeDeclaration()
	 * @generated
	 */
	int SCOPE_DECLARATION = 16;

	/**
	 * The feature id for the '<em><b>Type Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DECLARATION__TYPE_SCOPES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scope Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scope Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.TypeScopeImpl <em>Type Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.TypeScopeImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getTypeScope()
	 * @generated
	 */
	int TYPE_SCOPE = 18;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCOPE__TARGET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCOPE__INCREMENT = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCOPE__MULTIPLICITY = 2;

	/**
	 * The number of structural features of the '<em>Type Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCOPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.MultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 19;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.RangeMultiplicityImpl <em>Range Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.RangeMultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getRangeMultiplicity()
	 * @generated
	 */
	int RANGE_MULTIPLICITY = 20;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_MULTIPLICITY__LOWER_BOUND = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_MULTIPLICITY__UPPER_BOUND = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_MULTIPLICITY_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_MULTIPLICITY_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ExactMultiplicityImpl <em>Exact Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ExactMultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getExactMultiplicity()
	 * @generated
	 */
	int EXACT_MULTIPLICITY = 21;

	/**
	 * The feature id for the '<em><b>Exact Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MULTIPLICITY__EXACT_VALUE = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exact Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MULTIPLICITY_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exact Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MULTIPLICITY_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.UnboundedMultiplicityImpl <em>Unbounded Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.UnboundedMultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getUnboundedMultiplicity()
	 * @generated
	 */
	int UNBOUNDED_MULTIPLICITY = 22;

	/**
	 * The number of structural features of the '<em>Unbounded Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_MULTIPLICITY_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unbounded Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_MULTIPLICITY_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ArgumentImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 31;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeArgumentImpl <em>Variable Or Node Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeArgumentImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getVariableOrNodeArgument()
	 * @generated
	 */
	int VARIABLE_OR_NODE_ARGUMENT = 23;

	/**
	 * The feature id for the '<em><b>Variable Or Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Singleton Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_NODE_ARGUMENT__SINGLETON_VARIABLE = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Or Node Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_NODE_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Or Node Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_NODE_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.EnumDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getEnumDeclaration()
	 * @generated
	 */
	int ENUM_DECLARATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__LITERALS = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConstantImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 26;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.IntConstantImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 27;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__INT_VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.RealConstantImpl <em>Real Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.RealConstantImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getRealConstant()
	 * @generated
	 */
	int REAL_CONSTANT = 28;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT__REAL_VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.StringConstantImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__STRING_VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConstantArgumentImpl <em>Constant Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConstantArgumentImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConstantArgument()
	 * @generated
	 */
	int CONSTANT_ARGUMENT = 30;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ARGUMENT__CONSTANT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.AssertionArgumentImpl <em>Assertion Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.AssertionArgumentImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getAssertionArgument()
	 * @generated
	 */
	int ASSERTION_ARGUMENT = 33;

	/**
	 * The number of structural features of the '<em>Assertion Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_ARGUMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assertion Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NodeAssertionArgumentImpl <em>Node Assertion Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.NodeAssertionArgumentImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNodeAssertionArgument()
	 * @generated
	 */
	int NODE_ASSERTION_ARGUMENT = 32;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ASSERTION_ARGUMENT__NODE = ASSERTION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Assertion Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ASSERTION_ARGUMENT_FEATURE_COUNT = ASSERTION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Assertion Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ASSERTION_ARGUMENT_OPERATION_COUNT = ASSERTION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConstantAssertionArgumentImpl <em>Constant Assertion Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConstantAssertionArgumentImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConstantAssertionArgument()
	 * @generated
	 */
	int CONSTANT_ASSERTION_ARGUMENT = 34;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ASSERTION_ARGUMENT__CONSTANT = ASSERTION_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Assertion Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ASSERTION_ARGUMENT_FEATURE_COUNT = ASSERTION_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Assertion Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ASSERTION_ARGUMENT_OPERATION_COUNT = ASSERTION_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NodeValueAssertionImpl <em>Node Value Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.NodeValueAssertionImpl
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNodeValueAssertion()
	 * @generated
	 */
	int NODE_VALUE_ASSERTION = 35;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_VALUE_ASSERTION__NODE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_VALUE_ASSERTION__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Value Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_VALUE_ASSERTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node Value Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_VALUE_ASSERTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.model.problem.LogicValue <em>Logic Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.model.problem.LogicValue
	 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getLogicValue()
	 * @generated
	 */
	int LOGIC_VALUE = 36;

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.Problem#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Problem#getNodes()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.Problem#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Problem#getStatements()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration <em>Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ClassDeclaration
	 * @generated
	 */
	EClass getClassDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#isAbstract()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EAttribute getClassDeclaration_Abstract();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getSuperTypes()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getReferenceDeclarations <em>Reference Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Declarations</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getReferenceDeclarations()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_ReferenceDeclarations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getNewNode <em>New Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Node</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getNewNode()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_NewNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration <em>Reference Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration
	 * @generated
	 */
	EClass getReferenceDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Type</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getReferenceType()
	 * @see #getReferenceDeclaration()
	 * @generated
	 */
	EReference getReferenceDeclaration_ReferenceType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getOpposite()
	 * @see #getReferenceDeclaration()
	 * @generated
	 */
	EReference getReferenceDeclaration_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#isContainment()
	 * @see #getReferenceDeclaration()
	 * @generated
	 */
	EAttribute getReferenceDeclaration_Containment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getMultiplicity()
	 * @see #getReferenceDeclaration()
	 * @generated
	 */
	EReference getReferenceDeclaration_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition <em>Predicate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Definition</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.PredicateDefinition
	 * @generated
	 */
	EClass getPredicateDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#isError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#isError()
	 * @see #getPredicateDefinition()
	 * @generated
	 */
	EAttribute getPredicateDefinition_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#getParameters()
	 * @see #getPredicateDefinition()
	 * @generated
	 */
	EReference getPredicateDefinition_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodies</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#getBodies()
	 * @see #getPredicateDefinition()
	 * @generated
	 */
	EReference getPredicateDefinition_Bodies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.Parameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Parameter#getParameterType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Conjunction
	 * @generated
	 */
	EClass getConjunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.Conjunction#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Conjunction#getLiterals()
	 * @see #getConjunction()
	 * @generated
	 */
	EReference getConjunction_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.Atom#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Atom#getRelation()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.Atom#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Atom#getArguments()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.Atom#isTransitiveClosure <em>Transitive Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive Closure</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Atom#isTransitiveClosure()
	 * @see #getAtom()
	 * @generated
	 */
	EAttribute getAtom_TransitiveClosure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ImplicitVariable <em>Implicit Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Variable</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ImplicitVariable
	 * @generated
	 */
	EClass getImplicitVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.NegativeLiteral <em>Negative Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NegativeLiteral
	 * @generated
	 */
	EClass getNegativeLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.NegativeLiteral#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atom</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NegativeLiteral#getAtom()
	 * @see #getNegativeLiteral()
	 * @generated
	 */
	EReference getNegativeLiteral_Atom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier <em>Existential Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existential Quantifier</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier
	 * @generated
	 */
	EClass getExistentialQuantifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier#getImplicitVariables <em>Implicit Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implicit Variables</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier#getImplicitVariables()
	 * @see #getExistentialQuantifier()
	 * @generated
	 */
	EReference getExistentialQuantifier_ImplicitVariables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Assertion#getRelation()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Assertion#getArguments()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Assertion#getValue()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ScopeDeclaration <em>Scope Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ScopeDeclaration
	 * @generated
	 */
	EClass getScopeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.ScopeDeclaration#getTypeScopes <em>Type Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Scopes</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ScopeDeclaration#getTypeScopes()
	 * @see #getScopeDeclaration()
	 * @generated
	 */
	EReference getScopeDeclaration_TypeScopes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.TypeScope <em>Type Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Scope</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.TypeScope
	 * @generated
	 */
	EClass getTypeScope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.TypeScope#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.TypeScope#getTargetType()
	 * @see #getTypeScope()
	 * @generated
	 */
	EReference getTypeScope_TargetType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.TypeScope#isIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.TypeScope#isIncrement()
	 * @see #getTypeScope()
	 * @generated
	 */
	EAttribute getTypeScope_Increment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.TypeScope#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.TypeScope#getMultiplicity()
	 * @see #getTypeScope()
	 * @generated
	 */
	EReference getTypeScope_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity <em>Range Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity
	 * @generated
	 */
	EClass getRangeMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity#getLowerBound()
	 * @see #getRangeMultiplicity()
	 * @generated
	 */
	EAttribute getRangeMultiplicity_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity#getUpperBound()
	 * @see #getRangeMultiplicity()
	 * @generated
	 */
	EAttribute getRangeMultiplicity_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ExactMultiplicity <em>Exact Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ExactMultiplicity
	 * @generated
	 */
	EClass getExactMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.ExactMultiplicity#getExactValue <em>Exact Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact Value</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ExactMultiplicity#getExactValue()
	 * @see #getExactMultiplicity()
	 * @generated
	 */
	EAttribute getExactMultiplicity_ExactValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.UnboundedMultiplicity <em>Unbounded Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unbounded Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.UnboundedMultiplicity
	 * @generated
	 */
	EClass getUnboundedMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument <em>Variable Or Node Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Or Node Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument
	 * @generated
	 */
	EClass getVariableOrNodeArgument();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getVariableOrNode <em>Variable Or Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Or Node</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getVariableOrNode()
	 * @see #getVariableOrNodeArgument()
	 * @generated
	 */
	EReference getVariableOrNodeArgument_VariableOrNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getSingletonVariable <em>Singleton Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Singleton Variable</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getSingletonVariable()
	 * @see #getVariableOrNodeArgument()
	 * @generated
	 */
	EReference getVariableOrNodeArgument_SingletonVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.NodeAssertionArgument <em>Node Assertion Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Assertion Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NodeAssertionArgument
	 * @generated
	 */
	EClass getNodeAssertionArgument();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.NodeAssertionArgument#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NodeAssertionArgument#getNode()
	 * @see #getNodeAssertionArgument()
	 * @generated
	 */
	EReference getNodeAssertionArgument_Node();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.AssertionArgument <em>Assertion Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.AssertionArgument
	 * @generated
	 */
	EClass getAssertionArgument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument <em>Constant Assertion Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Assertion Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument
	 * @generated
	 */
	EClass getConstantAssertionArgument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument#getConstant()
	 * @see #getConstantAssertionArgument()
	 * @generated
	 */
	EReference getConstantAssertionArgument_Constant();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion <em>Node Value Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Value Assertion</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion
	 * @generated
	 */
	EClass getNodeValueAssertion();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getNode()
	 * @see #getNodeValueAssertion()
	 * @generated
	 */
	EReference getNodeValueAssertion_Node();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getValue()
	 * @see #getNodeValueAssertion()
	 * @generated
	 */
	EReference getNodeValueAssertion_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.EnumDeclaration <em>Enum Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.EnumDeclaration
	 * @generated
	 */
	EClass getEnumDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.model.problem.EnumDeclaration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.EnumDeclaration#getLiterals()
	 * @see #getEnumDeclaration()
	 * @generated
	 */
	EReference getEnumDeclaration_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNode <em>Variable Or Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Or Node</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.VariableOrNode
	 * @generated
	 */
	EClass getVariableOrNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.IntConstant#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.IntConstant#getIntValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_IntValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.RealConstant <em>Real Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Constant</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.RealConstant
	 * @generated
	 */
	EClass getRealConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.RealConstant#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Value</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.RealConstant#getRealValue()
	 * @see #getRealConstant()
	 * @generated
	 */
	EAttribute getRealConstant_RealValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.model.problem.StringConstant#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.StringConstant#getStringValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_StringValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.model.problem.ConstantArgument <em>Constant Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ConstantArgument
	 * @generated
	 */
	EClass getConstantArgument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.model.problem.ConstantArgument#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.ConstantArgument#getConstant()
	 * @see #getConstantArgument()
	 * @generated
	 */
	EReference getConstantArgument_Constant();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.solver.language.model.problem.LogicValue <em>Logic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Value</em>'.
	 * @see org.eclipse.viatra.solver.language.model.problem.LogicValue
	 * @generated
	 */
	EEnum getLogicValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProblemFactory getProblemFactory();

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
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__NODES = eINSTANCE.getProblem_Nodes();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__STATEMENTS = eINSTANCE.getProblem_Statements();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.RelationImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ClassDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getClassDeclaration()
		 * @generated
		 */
		EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DECLARATION__ABSTRACT = eINSTANCE.getClassDeclaration_Abstract();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__SUPER_TYPES = eINSTANCE.getClassDeclaration_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Reference Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__REFERENCE_DECLARATIONS = eINSTANCE.getClassDeclaration_ReferenceDeclarations();

		/**
		 * The meta object literal for the '<em><b>New Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__NEW_NODE = eINSTANCE.getClassDeclaration_NewNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl <em>Reference Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getReferenceDeclaration()
		 * @generated
		 */
		EClass REFERENCE_DECLARATION = eINSTANCE.getReferenceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DECLARATION__REFERENCE_TYPE = eINSTANCE.getReferenceDeclaration_ReferenceType();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DECLARATION__OPPOSITE = eINSTANCE.getReferenceDeclaration_Opposite();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_DECLARATION__CONTAINMENT = eINSTANCE.getReferenceDeclaration_Containment();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DECLARATION__MULTIPLICITY = eINSTANCE.getReferenceDeclaration_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.NamedElementImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.PredicateDefinitionImpl <em>Predicate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.PredicateDefinitionImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getPredicateDefinition()
		 * @generated
		 */
		EClass PREDICATE_DEFINITION = eINSTANCE.getPredicateDefinition();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_DEFINITION__ERROR = eINSTANCE.getPredicateDefinition_Error();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_DEFINITION__PARAMETERS = eINSTANCE.getPredicateDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Bodies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_DEFINITION__BODIES = eINSTANCE.getPredicateDefinition_Bodies();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ParameterImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_TYPE = eINSTANCE.getParameter_ParameterType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.VariableImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConjunctionImpl <em>Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConjunctionImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConjunction()
		 * @generated
		 */
		EClass CONJUNCTION = eINSTANCE.getConjunction();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNCTION__LITERALS = eINSTANCE.getConjunction_Literals();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.LiteralImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.AtomImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__RELATION = eINSTANCE.getAtom_Relation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__ARGUMENTS = eINSTANCE.getAtom_Arguments();

		/**
		 * The meta object literal for the '<em><b>Transitive Closure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__TRANSITIVE_CLOSURE = eINSTANCE.getAtom_TransitiveClosure();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ImplicitVariableImpl <em>Implicit Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ImplicitVariableImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getImplicitVariable()
		 * @generated
		 */
		EClass IMPLICIT_VARIABLE = eINSTANCE.getImplicitVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NegativeLiteralImpl <em>Negative Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.NegativeLiteralImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNegativeLiteral()
		 * @generated
		 */
		EClass NEGATIVE_LITERAL = eINSTANCE.getNegativeLiteral();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATIVE_LITERAL__ATOM = eINSTANCE.getNegativeLiteral_Atom();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier <em>Existential Quantifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getExistentialQuantifier()
		 * @generated
		 */
		EClass EXISTENTIAL_QUANTIFIER = eINSTANCE.getExistentialQuantifier();

		/**
		 * The meta object literal for the '<em><b>Implicit Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTENTIAL_QUANTIFIER__IMPLICIT_VARIABLES = eINSTANCE.getExistentialQuantifier_ImplicitVariables();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.AssertionImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__RELATION = eINSTANCE.getAssertion_Relation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__ARGUMENTS = eINSTANCE.getAssertion_Arguments();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__VALUE = eINSTANCE.getAssertion_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.NodeImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ScopeDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getScopeDeclaration()
		 * @generated
		 */
		EClass SCOPE_DECLARATION = eINSTANCE.getScopeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_DECLARATION__TYPE_SCOPES = eINSTANCE.getScopeDeclaration_TypeScopes();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.Statement
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.TypeScopeImpl <em>Type Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.TypeScopeImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getTypeScope()
		 * @generated
		 */
		EClass TYPE_SCOPE = eINSTANCE.getTypeScope();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SCOPE__TARGET_TYPE = eINSTANCE.getTypeScope_TargetType();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SCOPE__INCREMENT = eINSTANCE.getTypeScope_Increment();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SCOPE__MULTIPLICITY = eINSTANCE.getTypeScope_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.MultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.RangeMultiplicityImpl <em>Range Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.RangeMultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getRangeMultiplicity()
		 * @generated
		 */
		EClass RANGE_MULTIPLICITY = eINSTANCE.getRangeMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_MULTIPLICITY__LOWER_BOUND = eINSTANCE.getRangeMultiplicity_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_MULTIPLICITY__UPPER_BOUND = eINSTANCE.getRangeMultiplicity_UpperBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ExactMultiplicityImpl <em>Exact Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ExactMultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getExactMultiplicity()
		 * @generated
		 */
		EClass EXACT_MULTIPLICITY = eINSTANCE.getExactMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Exact Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXACT_MULTIPLICITY__EXACT_VALUE = eINSTANCE.getExactMultiplicity_ExactValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.UnboundedMultiplicityImpl <em>Unbounded Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.UnboundedMultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getUnboundedMultiplicity()
		 * @generated
		 */
		EClass UNBOUNDED_MULTIPLICITY = eINSTANCE.getUnboundedMultiplicity();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeArgumentImpl <em>Variable Or Node Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeArgumentImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getVariableOrNodeArgument()
		 * @generated
		 */
		EClass VARIABLE_OR_NODE_ARGUMENT = eINSTANCE.getVariableOrNodeArgument();

		/**
		 * The meta object literal for the '<em><b>Variable Or Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE = eINSTANCE.getVariableOrNodeArgument_VariableOrNode();

		/**
		 * The meta object literal for the '<em><b>Singleton Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_OR_NODE_ARGUMENT__SINGLETON_VARIABLE = eINSTANCE
				.getVariableOrNodeArgument_SingletonVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ArgumentImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NodeAssertionArgumentImpl <em>Node Assertion Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.NodeAssertionArgumentImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNodeAssertionArgument()
		 * @generated
		 */
		EClass NODE_ASSERTION_ARGUMENT = eINSTANCE.getNodeAssertionArgument();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ASSERTION_ARGUMENT__NODE = eINSTANCE.getNodeAssertionArgument_Node();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.AssertionArgumentImpl <em>Assertion Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.AssertionArgumentImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getAssertionArgument()
		 * @generated
		 */
		EClass ASSERTION_ARGUMENT = eINSTANCE.getAssertionArgument();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConstantAssertionArgumentImpl <em>Constant Assertion Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConstantAssertionArgumentImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConstantAssertionArgument()
		 * @generated
		 */
		EClass CONSTANT_ASSERTION_ARGUMENT = eINSTANCE.getConstantAssertionArgument();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_ASSERTION_ARGUMENT__CONSTANT = eINSTANCE.getConstantAssertionArgument_Constant();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.NodeValueAssertionImpl <em>Node Value Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.NodeValueAssertionImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getNodeValueAssertion()
		 * @generated
		 */
		EClass NODE_VALUE_ASSERTION = eINSTANCE.getNodeValueAssertion();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_VALUE_ASSERTION__NODE = eINSTANCE.getNodeValueAssertion_Node();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_VALUE_ASSERTION__VALUE = eINSTANCE.getNodeValueAssertion_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.EnumDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getEnumDeclaration()
		 * @generated
		 */
		EClass ENUM_DECLARATION = eINSTANCE.getEnumDeclaration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_DECLARATION__LITERALS = eINSTANCE.getEnumDeclaration_Literals();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeImpl <em>Variable Or Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.VariableOrNodeImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getVariableOrNode()
		 * @generated
		 */
		EClass VARIABLE_OR_NODE = eINSTANCE.getVariableOrNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConstantImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.IntConstantImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__INT_VALUE = eINSTANCE.getIntConstant_IntValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.RealConstantImpl <em>Real Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.RealConstantImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getRealConstant()
		 * @generated
		 */
		EClass REAL_CONSTANT = eINSTANCE.getRealConstant();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_CONSTANT__REAL_VALUE = eINSTANCE.getRealConstant_RealValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.StringConstantImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__STRING_VALUE = eINSTANCE.getStringConstant_StringValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.impl.ConstantArgumentImpl <em>Constant Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ConstantArgumentImpl
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getConstantArgument()
		 * @generated
		 */
		EClass CONSTANT_ARGUMENT = eINSTANCE.getConstantArgument();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_ARGUMENT__CONSTANT = eINSTANCE.getConstantArgument_Constant();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.model.problem.LogicValue <em>Logic Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.model.problem.LogicValue
		 * @see org.eclipse.viatra.solver.language.model.problem.impl.ProblemPackageImpl#getLogicValue()
		 * @generated
		 */
		EEnum LOGIC_VALUE = eINSTANCE.getLogicValue();

	}

} //ProblemPackage
