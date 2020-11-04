/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

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
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface SolverLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solverLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/viatra/solver/language/SolverLanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "solverLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverLanguagePackage eINSTANCE = org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl <em>Path Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getPathComponent()
	 * @generated
	 */
	int PATH_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_COMPONENT__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_COMPONENT__INVERSE = 1;

	/**
	 * The feature id for the '<em><b>Transitive Closure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_COMPONENT__TRANSITIVE_CLOSURE = 2;

	/**
	 * The feature id for the '<em><b>Reflexive Transitive Closure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE = 3;

	/**
	 * The number of structural features of the '<em>Path Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Path Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SymbolImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 44;

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
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXISTS_VARIABLES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CallImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCall()
	 * @generated
	 */
	int CALL = 2;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__FUNCTOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ARGUMENT_LIST = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ReferenceImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__COMPONENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 5;

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
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentListImpl <em>Argument List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentListImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getArgumentList()
	 * @generated
	 */
	int ARGUMENT_LIST = 6;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST__ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Argument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Argument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionArgumentImpl <em>Expression Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionArgumentImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExpressionArgument()
	 * @generated
	 */
	int EXPRESSION_ARGUMENT = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ARGUMENT__EXPRESSION = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StarArgumentImpl <em>Star Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.StarArgumentImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getStarArgument()
	 * @generated
	 */
	int STAR_ARGUMENT = 8;

	/**
	 * The number of structural features of the '<em>Star Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Star Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypedArgumentImpl <em>Typed Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypedArgumentImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypedArgument()
	 * @generated
	 */
	int TYPED_ARGUMENT = 9;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARGUMENT__TYPE_REFERENCE = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.MultiaryExpessionImpl <em>Multiary Expession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.MultiaryExpessionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getMultiaryExpession()
	 * @generated
	 */
	int MULTIARY_EXPESSION = 10;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIARY_EXPESSION__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIARY_EXPESSION__CHILDREN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiary Expession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIARY_EXPESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiary Expession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIARY_EXPESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.VariableImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_REFERENCE = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UnaryExpressionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BinaryExpressionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.DisjunctionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__EXISTS_VARIABLES = MULTIARY_EXPESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__CHILDREN = MULTIARY_EXPESSION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = MULTIARY_EXPESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_OPERATION_COUNT = MULTIARY_EXPESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ConjunctionImpl <em>Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ConjunctionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getConjunction()
	 * @generated
	 */
	int CONJUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__EXISTS_VARIABLES = MULTIARY_EXPESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__CHILDREN = MULTIARY_EXPESSION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = MULTIARY_EXPESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_OPERATION_COUNT = MULTIARY_EXPESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ConditionalExpressionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__THEN = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SwitchImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 17;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CASES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CaseImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCase()
	 * @generated
	 */
	int CASE = 18;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__BODY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LetExpressionImpl <em>Let Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LetExpressionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLetExpression()
	 * @generated
	 */
	int LET_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__BINDINGS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Let Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LetBindingImpl <em>Let Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LetBindingImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLetBinding()
	 * @generated
	 */
	int LET_BINDING = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_BINDING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_BINDING__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_BINDING__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_BINDING__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Let Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_BINDING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Let Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 21;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.IntLiteralImpl <em>Int Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.IntLiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getIntLiteral()
	 * @generated
	 */
	int INT_LITERAL = 22;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL__EXISTS_VARIABLES = LITERAL__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.RealLiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 23;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__EXISTS_VARIABLES = LITERAL__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.StringLiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 24;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__EXISTS_VARIABLES = LITERAL__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LogicLiteralImpl <em>Logic Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LogicLiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLogicLiteral()
	 * @generated
	 */
	int LOGIC_LITERAL = 25;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_LITERAL__EXISTS_VARIABLES = LITERAL__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logic Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logic Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.EmptyLiteralImpl <em>Empty Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.EmptyLiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getEmptyLiteral()
	 * @generated
	 */
	int EMPTY_LITERAL = 26;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LITERAL__EXISTS_VARIABLES = LITERAL__EXISTS_VARIABLES;

	/**
	 * The number of structural features of the '<em>Empty Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CastExpressionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__TARGET_TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AggregateExpressionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAggregateExpression()
	 * @generated
	 */
	int AGGREGATE_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Forall Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__FORALL_VARIABLES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CountImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 29;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EXISTS_VARIABLES = AGGREGATE_EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Forall Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__FORALL_VARIABLES = AGGREGATE_EXPRESSION__FORALL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__CONDITION = AGGREGATE_EXPRESSION__CONDITION;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 30;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__EXISTS_VARIABLES = AGGREGATE_EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Forall Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__FORALL_VARIABLES = AGGREGATE_EXPRESSION__FORALL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__CONDITION = AGGREGATE_EXPRESSION__CONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__VALUE = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__OP = AGGREGATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ForallImpl <em>Forall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ForallImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getForall()
	 * @generated
	 */
	int FORALL = 31;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL__EXISTS_VARIABLES = AGGREGATE_EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Forall Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL__FORALL_VARIABLES = AGGREGATE_EXPRESSION__FORALL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL__CONDITION = AGGREGATE_EXPRESSION__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL__BODY = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypeReferenceImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 32;

	/**
	 * The feature id for the '<em><b>Force Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__FORCE_OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.InfinityLiteralImpl <em>Infinity Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.InfinityLiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getInfinityLiteral()
	 * @generated
	 */
	int INFINITY_LITERAL = 33;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_LITERAL__EXISTS_VARIABLES = LITERAL__EXISTS_VARIABLES;

	/**
	 * The number of structural features of the '<em>Infinity Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infinity Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITY_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.IntervalImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 34;

	/**
	 * The feature id for the '<em><b>Exists Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__EXISTS_VARIABLES = EXPRESSION__EXISTS_VARIABLES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LOWER_BOUND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__UPPER_BOUND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorImpl <em>Functor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunctor()
	 * @generated
	 */
	int FUNCTOR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__PARAMETERS = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.RelationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = FUNCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PARAMETERS = FUNCTOR__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = FUNCTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = FUNCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BaseRelationImpl <em>Base Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BaseRelationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBaseRelation()
	 * @generated
	 */
	int BASE_RELATION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RELATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RELATION__PARAMETERS = RELATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Base Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__PARAMETERS = RELATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.DatatypeImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__PARAMETERS = RELATION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = FUNCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = FUNCTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RESULT_TYPE = FUNCTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = FUNCTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = FUNCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.MetricImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__RESULT_TYPE = FUNCTION__RESULT_TYPE;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.OperatorImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__RESULT_TYPE = FUNCTION__RESULT_TYPE;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.NodeImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAMED = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AbstractAssertionImpl <em>Abstract Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AbstractAssertionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAbstractAssertion()
	 * @generated
	 */
	int ABSTRACT_ASSERTION = 45;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSERTION__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSERTION__RANGE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSERTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ASSERTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorDefinitonImpl <em>Functor Definiton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorDefinitonImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunctorDefiniton()
	 * @generated
	 */
	int FUNCTOR_DEFINITON = 46;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_DEFINITON__HEAD = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_DEFINITON__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Functor Definiton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_DEFINITON_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Functor Definiton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_DEFINITON_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateDefinitionImpl <em>Predicate Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateDefinitionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getPredicateDefinition()
	 * @generated
	 */
	int PREDICATE_DEFINITION = 47;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__HEAD = FUNCTOR_DEFINITON__HEAD;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__BODY = FUNCTOR_DEFINITON__BODY;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__ERROR = FUNCTOR_DEFINITON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION__FUNCTIONAL = FUNCTOR_DEFINITON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_FEATURE_COUNT = FUNCTOR_DEFINITON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_DEFINITION_OPERATION_COUNT = FUNCTOR_DEFINITON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionDefinitionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 48;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__HEAD = FUNCTOR_DEFINITON__HEAD;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__BODY = FUNCTOR_DEFINITON__BODY;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__RESULT_TYPE = FUNCTOR_DEFINITON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = FUNCTOR_DEFINITON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_OPERATION_COUNT = FUNCTOR_DEFINITON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AttributeImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 49;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__KIND = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDeclarationImpl <em>Extern Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternDeclaration()
	 * @generated
	 */
	int EXTERN_DECLARATION = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extern Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extern Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctorDeclarationImpl <em>Extern Functor Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctorDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternFunctorDeclaration()
	 * @generated
	 */
	int EXTERN_FUNCTOR_DECLARATION = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTOR_DECLARATION__NAME = EXTERN_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST = EXTERN_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extern Functor Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTOR_DECLARATION_FEATURE_COUNT = EXTERN_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extern Functor Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTOR_DECLARATION_OPERATION_COUNT = EXTERN_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternPredicateDeclarationImpl <em>Extern Predicate Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternPredicateDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternPredicateDeclaration()
	 * @generated
	 */
	int EXTERN_PREDICATE_DECLARATION = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_PREDICATE_DECLARATION__NAME = EXTERN_FUNCTOR_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_PREDICATE_DECLARATION__ARGUMENT_LIST = EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_PREDICATE_DECLARATION__ERROR = EXTERN_FUNCTOR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_PREDICATE_DECLARATION__FUNCTIONAL = EXTERN_FUNCTOR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extern Predicate Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_PREDICATE_DECLARATION_FEATURE_COUNT = EXTERN_FUNCTOR_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extern Predicate Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_PREDICATE_DECLARATION_OPERATION_COUNT = EXTERN_FUNCTOR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctionDeclarationImpl <em>Extern Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctionDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternFunctionDeclaration()
	 * @generated
	 */
	int EXTERN_FUNCTION_DECLARATION = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTION_DECLARATION__NAME = EXTERN_FUNCTOR_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTION_DECLARATION__ARGUMENT_LIST = EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTION_DECLARATION__RESULT_TYPE = EXTERN_FUNCTOR_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extern Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTION_DECLARATION_FEATURE_COUNT = EXTERN_FUNCTOR_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extern Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_FUNCTION_DECLARATION_OPERATION_COUNT = EXTERN_FUNCTOR_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregationOperatorDeclarationImpl <em>Extern Aggregation Operator Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregationOperatorDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternAggregationOperatorDeclaration()
	 * @generated
	 */
	int EXTERN_AGGREGATION_OPERATOR_DECLARATION = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_AGGREGATION_OPERATOR_DECLARATION__NAME = EXTERN_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Argument Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE = EXTERN_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE = EXTERN_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extern Aggregation Operator Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_AGGREGATION_OPERATOR_DECLARATION_FEATURE_COUNT = EXTERN_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extern Aggregation Operator Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_AGGREGATION_OPERATOR_DECLARATION_OPERATION_COUNT = EXTERN_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDatatypeDeclarationImpl <em>Extern Datatype Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDatatypeDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternDatatypeDeclaration()
	 * @generated
	 */
	int EXTERN_DATATYPE_DECLARATION = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_DATATYPE_DECLARATION__NAME = EXTERN_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Extern Datatype Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_DATATYPE_DECLARATION_FEATURE_COUNT = EXTERN_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extern Datatype Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERN_DATATYPE_DECLARATION_OPERATION_COUNT = EXTERN_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ClassDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getClassDeclaration()
	 * @generated
	 */
	int CLASS_DECLARATION = 56;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__FIELDS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ABSTRACT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPERTYPES = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ROOT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.EnumDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getEnumDeclaration()
	 * @generated
	 */
	int ENUM_DECLARATION = 57;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__LITERALS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.EnumLiteralImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FieldImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 59;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTAINMENT = 0;

	/**
	 * The feature id for the '<em><b>Cross Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CROSS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OPPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MULTIPLICITY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.MultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 60;

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
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DefaultAssertionImpl <em>Default Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.DefaultAssertionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getDefaultAssertion()
	 * @generated
	 */
	int DEFAULT_ASSERTION = 61;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ASSERTION__EXPRESSION = ABSTRACT_ASSERTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ASSERTION__RANGE = ABSTRACT_ASSERTION__RANGE;

	/**
	 * The number of structural features of the '<em>Default Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ASSERTION_FEATURE_COUNT = ABSTRACT_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ASSERTION_OPERATION_COUNT = ABSTRACT_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AssertionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 62;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EXPRESSION = ABSTRACT_ASSERTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__RANGE = ABSTRACT_ASSERTION__RANGE;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = ABSTRACT_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = ABSTRACT_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnboundedMultiplicityImpl <em>Unbounded Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UnboundedMultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnboundedMultiplicity()
	 * @generated
	 */
	int UNBOUNDED_MULTIPLICITY = 63;

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
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExactMultiplicityImpl <em>Exact Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExactMultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExactMultiplicity()
	 * @generated
	 */
	int EXACT_MULTIPLICITY = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_MULTIPLICITY__VALUE = MULTIPLICITY_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedMultiplicityImpl <em>Bounded Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedMultiplicityImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBoundedMultiplicity()
	 * @generated
	 */
	int BOUNDED_MULTIPLICITY = 65;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_MULTIPLICITY__LOWER_BOUND = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_MULTIPLICITY__UPPER_BOUND = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_MULTIPLICITY_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_MULTIPLICITY_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes <em>Inline Predicate Attrributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getInlinePredicateAttrributes()
	 * @generated
	 */
	int INLINE_PREDICATE_ATTRRIBUTES = 66;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_PREDICATE_ATTRRIBUTES__ERROR = 0;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_PREDICATE_ATTRRIBUTES__FUNCTIONAL = 1;

	/**
	 * The number of structural features of the '<em>Inline Predicate Attrributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_PREDICATE_ATTRRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inline Predicate Attrributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_PREDICATE_ATTRRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationOperatorImpl <em>Aggregation Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationOperatorImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAggregationOperator()
	 * @generated
	 */
	int AGGREGATION_OPERATOR = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Argument Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR__ARGUMENT_TYPE = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR__RESULT_TYPE = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregation Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATOR_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ProblemImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__STATEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__SYMBOLS = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__IMPORTS = 3;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypedStarArgumentImpl <em>Typed Star Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypedStarArgumentImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypedStarArgument()
	 * @generated
	 */
	int TYPED_STAR_ARGUMENT = 69;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_STAR_ARGUMENT__TYPE_REFERENCE = TYPED_ARGUMENT__TYPE_REFERENCE;

	/**
	 * The number of structural features of the '<em>Typed Star Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_STAR_ARGUMENT_FEATURE_COUNT = TYPED_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Typed Star Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_STAR_ARGUMENT_OPERATION_COUNT = TYPED_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypedVariableArgumentImpl <em>Typed Variable Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypedVariableArgumentImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypedVariableArgument()
	 * @generated
	 */
	int TYPED_VARIABLE_ARGUMENT = 70;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VARIABLE_ARGUMENT__TYPE_REFERENCE = TYPED_ARGUMENT__TYPE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VARIABLE_ARGUMENT__NAME = TYPED_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Variable Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VARIABLE_ARGUMENT_FEATURE_COUNT = TYPED_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Variable Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VARIABLE_ARGUMENT_OPERATION_COUNT = TYPED_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnnamedErrorPredicateDefintionImpl <em>Unnamed Error Predicate Defintion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UnnamedErrorPredicateDefintionImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnnamedErrorPredicateDefintion()
	 * @generated
	 */
	int UNNAMED_ERROR_PREDICATE_DEFINTION = 71;

	/**
	 * The feature id for the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_ERROR_PREDICATE_DEFINTION__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unnamed Error Predicate Defintion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_ERROR_PREDICATE_DEFINTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unnamed Error Predicate Defintion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_ERROR_PREDICATE_DEFINTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ObjectiveDeclarationImpl <em>Objective Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ObjectiveDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getObjectiveDeclaration()
	 * @generated
	 */
	int OBJECTIVE_DECLARATION = 72;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_DECLARATION__KIND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_DECLARATION__OBJECTIVE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Objective Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Objective Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ScopeDeclarationImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getScopeDeclaration()
	 * @generated
	 */
	int SCOPE_DECLARATION = 73;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_DECLARATION__TYPE = STATEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExactScopeImpl <em>Exact Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExactScopeImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExactScope()
	 * @generated
	 */
	int EXACT_SCOPE = 74;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_SCOPE__TYPE = SCOPE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_SCOPE__SIZE = SCOPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exact Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_SCOPE_FEATURE_COUNT = SCOPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exact Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_SCOPE_OPERATION_COUNT = SCOPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedScopeImpl <em>Bounded Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedScopeImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBoundedScope()
	 * @generated
	 */
	int BOUNDED_SCOPE = 75;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_SCOPE__TYPE = SCOPE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_SCOPE__LOWER_BOUND = SCOPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_SCOPE__UPPER_BOUND = SCOPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_SCOPE_FEATURE_COUNT = SCOPE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_SCOPE_OPERATION_COUNT = SCOPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LowerBoundedScopeImpl <em>Lower Bounded Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LowerBoundedScopeImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLowerBoundedScope()
	 * @generated
	 */
	int LOWER_BOUNDED_SCOPE = 76;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDED_SCOPE__TYPE = SCOPE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDED_SCOPE__LOWER_BOUND = SCOPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lower Bounded Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDED_SCOPE_FEATURE_COUNT = SCOPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lower Bounded Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDED_SCOPE_OPERATION_COUNT = SCOPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ImportImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 78;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.NamespaceImportImpl <em>Namespace Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.NamespaceImportImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getNamespaceImport()
	 * @generated
	 */
	int NAMESPACE_IMPORT = 77;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__ALIAS = IMPORT__ALIAS;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__IMPORTED_NAMESPACE = IMPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Namespace Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Namespace Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UriImportImpl <em>Uri Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UriImportImpl
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUriImport()
	 * @generated
	 */
	int URI_IMPORT = 79;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_IMPORT__ALIAS = IMPORT__ALIAS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_IMPORT__URI = IMPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uri Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.LogicValue <em>Logic Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LogicValue
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLogicValue()
	 * @generated
	 */
	int LOGIC_VALUE = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind <em>Objective Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getObjectiveKind()
	 * @generated
	 */
	int OBJECTIVE_KIND = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.viatra.solver.language.solverLanguage.AttributeKind <em>Attribute Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AttributeKind
	 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAttributeKind()
	 * @generated
	 */
	int ATTRIBUTE_KIND = 84;

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent <em>Path Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Component</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.PathComponent
	 * @generated
	 */
	EClass getPathComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.PathComponent#getSymbol()
	 * @see #getPathComponent()
	 * @generated
	 */
	EReference getPathComponent_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isInverse()
	 * @see #getPathComponent()
	 * @generated
	 */
	EAttribute getPathComponent_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isTransitiveClosure <em>Transitive Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive Closure</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isTransitiveClosure()
	 * @see #getPathComponent()
	 * @generated
	 */
	EAttribute getPathComponent_TransitiveClosure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isReflexiveTransitiveClosure <em>Reflexive Transitive Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reflexive Transitive Closure</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isReflexiveTransitiveClosure()
	 * @see #getPathComponent()
	 * @generated
	 */
	EAttribute getPathComponent_ReflexiveTransitiveClosure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Symbol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Symbol#getName()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getFunctor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functor</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Call#getFunctor()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Functor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument List</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Call#getArgumentList()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_ArgumentList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.Reference#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Reference#getComponents()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Components();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.Expression#getExistsVariables <em>Exists Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exists Variables</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Expression#getExistsVariables()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ExistsVariables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument List</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ArgumentList
	 * @generated
	 */
	EClass getArgumentList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.ArgumentList#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ArgumentList#getArguments()
	 * @see #getArgumentList()
	 * @generated
	 */
	EReference getArgumentList_Arguments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExpressionArgument <em>Expression Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExpressionArgument
	 * @generated
	 */
	EClass getExpressionArgument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ExpressionArgument#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExpressionArgument#getExpression()
	 * @see #getExpressionArgument()
	 * @generated
	 */
	EReference getExpressionArgument_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.StarArgument <em>Star Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.StarArgument
	 * @generated
	 */
	EClass getStarArgument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.TypedArgument <em>Typed Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypedArgument
	 * @generated
	 */
	EClass getTypedArgument();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.TypedArgument#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Reference</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypedArgument#getTypeReference()
	 * @see #getTypedArgument()
	 * @generated
	 */
	EReference getTypedArgument_TypeReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.MultiaryExpession <em>Multiary Expession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiary Expession</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.MultiaryExpession
	 * @generated
	 */
	EClass getMultiaryExpession();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.MultiaryExpession#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.MultiaryExpession#getChildren()
	 * @see #getMultiaryExpession()
	 * @generated
	 */
	EReference getMultiaryExpession_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Variable#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Reference</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Variable#getTypeReference()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_TypeReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getBody()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getOp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Op();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getOp()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Conjunction
	 * @generated
	 */
	EClass getConjunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression#getCondition()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression#getThen()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Then();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression#getElse()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Else();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.Switch#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Switch#getCases()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Case#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Case#getCondition()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Case#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Case#getBody()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.LetExpression <em>Let Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetExpression
	 * @generated
	 */
	EClass getLetExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.LetExpression#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetExpression#getBindings()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_Bindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.LetExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetExpression#getBody()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.LetBinding <em>Let Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Binding</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetBinding
	 * @generated
	 */
	EClass getLetBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getValue()
	 * @see #getLetBinding()
	 * @generated
	 */
	EReference getLetBinding_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getVariable()
	 * @see #getLetBinding()
	 * @generated
	 */
	EReference getLetBinding_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getName()
	 * @see #getLetBinding()
	 * @generated
	 */
	EAttribute getLetBinding_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LetBinding#getType()
	 * @see #getLetBinding()
	 * @generated
	 */
	EReference getLetBinding_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.IntLiteral <em>Int Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.IntLiteral
	 * @generated
	 */
	EClass getIntLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.IntLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.IntLiteral#getValue()
	 * @see #getIntLiteral()
	 * @generated
	 */
	EAttribute getIntLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.RealLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.RealLiteral#getValue()
	 * @see #getRealLiteral()
	 * @generated
	 */
	EAttribute getRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.LogicLiteral <em>Logic Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LogicLiteral
	 * @generated
	 */
	EClass getLogicLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.LogicLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LogicLiteral#getValue()
	 * @see #getLogicLiteral()
	 * @generated
	 */
	EAttribute getLogicLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.EmptyLiteral <em>Empty Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.EmptyLiteral
	 * @generated
	 */
	EClass getEmptyLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.CastExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.CastExpression#getBody()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Body();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.CastExpression#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.CastExpression#getTargetType()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_TargetType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression
	 * @generated
	 */
	EClass getAggregateExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression#getForallVariables <em>Forall Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forall Variables</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression#getForallVariables()
	 * @see #getAggregateExpression()
	 * @generated
	 */
	EReference getAggregateExpression_ForallVariables();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression#getCondition()
	 * @see #getAggregateExpression()
	 * @generated
	 */
	EReference getAggregateExpression_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Aggregation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Aggregation#getValue()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Aggregation#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Aggregation#getOp()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Op();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Forall <em>Forall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forall</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Forall
	 * @generated
	 */
	EClass getForall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Forall#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Forall#getBody()
	 * @see #getForall()
	 * @generated
	 */
	EReference getForall_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.TypeReference#isForceObjectType <em>Force Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Object Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypeReference#isForceObjectType()
	 * @see #getTypeReference()
	 * @generated
	 */
	EAttribute getTypeReference_ForceObjectType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.TypeReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypeReference#getType()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.InfinityLiteral <em>Infinity Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinity Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.InfinityLiteral
	 * @generated
	 */
	EClass getInfinityLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Interval#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Interval#getLowerBound()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Interval#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Interval#getUpperBound()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Functor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functor</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Functor
	 * @generated
	 */
	EClass getFunctor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.Functor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Functor#getParameters()
	 * @see #getFunctor()
	 * @generated
	 */
	EReference getFunctor_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.BaseRelation <em>Base Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Relation</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BaseRelation
	 * @generated
	 */
	EClass getBaseRelation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Function#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Function#getResultType()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ResultType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Node#isNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Named</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Node#isNamed()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Named();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion <em>Abstract Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Assertion</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion
	 * @generated
	 */
	EClass getAbstractAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getExpression()
	 * @see #getAbstractAssertion()
	 * @generated
	 */
	EReference getAbstractAssertion_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getRange()
	 * @see #getAbstractAssertion()
	 * @generated
	 */
	EReference getAbstractAssertion_Range();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.FunctorDefiniton <em>Functor Definiton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functor Definiton</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.FunctorDefiniton
	 * @generated
	 */
	EClass getFunctorDefiniton();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.FunctorDefiniton#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.FunctorDefiniton#getHead()
	 * @see #getFunctorDefiniton()
	 * @generated
	 */
	EReference getFunctorDefiniton_Head();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.FunctorDefiniton#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.FunctorDefiniton#getBody()
	 * @see #getFunctorDefiniton()
	 * @generated
	 */
	EReference getFunctorDefiniton_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.PredicateDefinition <em>Predicate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Definition</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.PredicateDefinition
	 * @generated
	 */
	EClass getPredicateDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.FunctionDefinition#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.FunctionDefinition#getResultType()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_ResultType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Attribute#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Attribute#getTarget()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Attribute#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Attribute#getKind()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternDeclaration <em>Extern Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternDeclaration
	 * @generated
	 */
	EClass getExternDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternDeclaration#getName()
	 * @see #getExternDeclaration()
	 * @generated
	 */
	EAttribute getExternDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration <em>Extern Functor Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Functor Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration
	 * @generated
	 */
	EClass getExternFunctorDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument List</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration#getArgumentList()
	 * @see #getExternFunctorDeclaration()
	 * @generated
	 */
	EReference getExternFunctorDeclaration_ArgumentList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternPredicateDeclaration <em>Extern Predicate Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Predicate Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternPredicateDeclaration
	 * @generated
	 */
	EClass getExternPredicateDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternFunctionDeclaration <em>Extern Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Function Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternFunctionDeclaration
	 * @generated
	 */
	EClass getExternFunctionDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternFunctionDeclaration#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternFunctionDeclaration#getResultType()
	 * @see #getExternFunctionDeclaration()
	 * @generated
	 */
	EReference getExternFunctionDeclaration_ResultType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration <em>Extern Aggregation Operator Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Aggregation Operator Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration
	 * @generated
	 */
	EClass getExternAggregationOperatorDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getArgumentType()
	 * @see #getExternAggregationOperatorDeclaration()
	 * @generated
	 */
	EReference getExternAggregationOperatorDeclaration_ArgumentType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getResultType()
	 * @see #getExternAggregationOperatorDeclaration()
	 * @generated
	 */
	EReference getExternAggregationOperatorDeclaration_ResultType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternDatatypeDeclaration <em>Extern Datatype Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extern Datatype Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExternDatatypeDeclaration
	 * @generated
	 */
	EClass getExternDatatypeDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration <em>Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration
	 * @generated
	 */
	EClass getClassDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#getFields()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_Fields();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#getName()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EAttribute getClassDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#isAbstract()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EAttribute getClassDeclaration_Abstract();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#getSupertypes <em>Supertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertypes</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#getSupertypes()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_Supertypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration#isRoot()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EAttribute getClassDeclaration_Root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.EnumDeclaration <em>Enum Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.EnumDeclaration
	 * @generated
	 */
	EClass getEnumDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.EnumDeclaration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.EnumDeclaration#getLiterals()
	 * @see #getEnumDeclaration()
	 * @generated
	 */
	EReference getEnumDeclaration_Literals();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.EnumDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.EnumDeclaration#getName()
	 * @see #getEnumDeclaration()
	 * @generated
	 */
	EAttribute getEnumDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.EnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.EnumLiteral#getName()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Field#isContainment()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Containment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#isCrossReference <em>Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cross Reference</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Field#isCrossReference()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_CrossReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Field#getOpposite()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Opposite();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Field#getMultiplicity()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Multiplicity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.DefaultAssertion <em>Default Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Assertion</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.DefaultAssertion
	 * @generated
	 */
	EClass getDefaultAssertion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.UnboundedMultiplicity <em>Unbounded Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unbounded Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnboundedMultiplicity
	 * @generated
	 */
	EClass getUnboundedMultiplicity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExactMultiplicity <em>Exact Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExactMultiplicity
	 * @generated
	 */
	EClass getExactMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.ExactMultiplicity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExactMultiplicity#getValue()
	 * @see #getExactMultiplicity()
	 * @generated
	 */
	EAttribute getExactMultiplicity_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.BoundedMultiplicity <em>Bounded Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Multiplicity</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BoundedMultiplicity
	 * @generated
	 */
	EClass getBoundedMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.BoundedMultiplicity#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BoundedMultiplicity#getLowerBound()
	 * @see #getBoundedMultiplicity()
	 * @generated
	 */
	EAttribute getBoundedMultiplicity_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.BoundedMultiplicity#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BoundedMultiplicity#getUpperBound()
	 * @see #getBoundedMultiplicity()
	 * @generated
	 */
	EAttribute getBoundedMultiplicity_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes <em>Inline Predicate Attrributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Predicate Attrributes</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes
	 * @generated
	 */
	EClass getInlinePredicateAttrributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isError()
	 * @see #getInlinePredicateAttrributes()
	 * @generated
	 */
	EAttribute getInlinePredicateAttrributes_Error();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isFunctional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isFunctional()
	 * @see #getInlinePredicateAttrributes()
	 * @generated
	 */
	EAttribute getInlinePredicateAttrributes_Functional();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator <em>Aggregation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Operator</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator
	 * @generated
	 */
	EClass getAggregationOperator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getArgumentType()
	 * @see #getAggregationOperator()
	 * @generated
	 */
	EReference getAggregationOperator_ArgumentType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getResultType()
	 * @see #getAggregationOperator()
	 * @generated
	 */
	EReference getAggregationOperator_ResultType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Problem#getName()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Problem#getStatements()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbols</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Problem#getSymbols()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Symbols();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Problem#getImports()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.TypedStarArgument <em>Typed Star Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Star Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypedStarArgument
	 * @generated
	 */
	EClass getTypedStarArgument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.TypedVariableArgument <em>Typed Variable Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Variable Argument</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypedVariableArgument
	 * @generated
	 */
	EClass getTypedVariableArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.TypedVariableArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.TypedVariableArgument#getName()
	 * @see #getTypedVariableArgument()
	 * @generated
	 */
	EAttribute getTypedVariableArgument_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion <em>Unnamed Error Predicate Defintion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unnamed Error Predicate Defintion</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion
	 * @generated
	 */
	EClass getUnnamedErrorPredicateDefintion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getArgumentList <em>Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument List</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getArgumentList()
	 * @see #getUnnamedErrorPredicateDefintion()
	 * @generated
	 */
	EReference getUnnamedErrorPredicateDefintion_ArgumentList();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getBody()
	 * @see #getUnnamedErrorPredicateDefintion()
	 * @generated
	 */
	EReference getUnnamedErrorPredicateDefintion_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration <em>Objective Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration
	 * @generated
	 */
	EClass getObjectiveDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getKind()
	 * @see #getObjectiveDeclaration()
	 * @generated
	 */
	EAttribute getObjectiveDeclaration_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objective</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getObjective()
	 * @see #getObjectiveDeclaration()
	 * @generated
	 */
	EReference getObjectiveDeclaration_Objective();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ScopeDeclaration <em>Scope Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Declaration</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ScopeDeclaration
	 * @generated
	 */
	EClass getScopeDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.viatra.solver.language.solverLanguage.ScopeDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ScopeDeclaration#getType()
	 * @see #getScopeDeclaration()
	 * @generated
	 */
	EReference getScopeDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.ExactScope <em>Exact Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Scope</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExactScope
	 * @generated
	 */
	EClass getExactScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.ExactScope#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ExactScope#getSize()
	 * @see #getExactScope()
	 * @generated
	 */
	EAttribute getExactScope_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.BoundedScope <em>Bounded Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Scope</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BoundedScope
	 * @generated
	 */
	EClass getBoundedScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.BoundedScope#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BoundedScope#getLowerBound()
	 * @see #getBoundedScope()
	 * @generated
	 */
	EAttribute getBoundedScope_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.BoundedScope#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BoundedScope#getUpperBound()
	 * @see #getBoundedScope()
	 * @generated
	 */
	EAttribute getBoundedScope_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.LowerBoundedScope <em>Lower Bounded Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Bounded Scope</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LowerBoundedScope
	 * @generated
	 */
	EClass getLowerBoundedScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.LowerBoundedScope#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LowerBoundedScope#getLowerBound()
	 * @see #getLowerBoundedScope()
	 * @generated
	 */
	EAttribute getLowerBoundedScope_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.NamespaceImport <em>Namespace Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Import</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.NamespaceImport
	 * @generated
	 */
	EClass getNamespaceImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.NamespaceImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.NamespaceImport#getImportedNamespace()
	 * @see #getNamespaceImport()
	 * @generated
	 */
	EAttribute getNamespaceImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.Import#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.Import#getAlias()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Alias();

	/**
	 * Returns the meta object for class '{@link org.eclipse.viatra.solver.language.solverLanguage.UriImport <em>Uri Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Import</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UriImport
	 * @generated
	 */
	EClass getUriImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.viatra.solver.language.solverLanguage.UriImport#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UriImport#getUri()
	 * @see #getUriImport()
	 * @generated
	 */
	EAttribute getUriImport_Uri();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.solver.language.solverLanguage.LogicValue <em>Logic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Value</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LogicValue
	 * @generated
	 */
	EEnum getLogicValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind <em>Objective Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Objective Kind</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind
	 * @generated
	 */
	EEnum getObjectiveKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.viatra.solver.language.solverLanguage.AttributeKind <em>Attribute Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Kind</em>'.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AttributeKind
	 * @generated
	 */
	EEnum getAttributeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolverLanguageFactory getSolverLanguageFactory();

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
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl <em>Path Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getPathComponent()
		 * @generated
		 */
		EClass PATH_COMPONENT = eINSTANCE.getPathComponent();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_COMPONENT__SYMBOL = eINSTANCE.getPathComponent_Symbol();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_COMPONENT__INVERSE = eINSTANCE.getPathComponent_Inverse();

		/**
		 * The meta object literal for the '<em><b>Transitive Closure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_COMPONENT__TRANSITIVE_CLOSURE = eINSTANCE.getPathComponent_TransitiveClosure();

		/**
		 * The meta object literal for the '<em><b>Reflexive Transitive Closure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE = eINSTANCE
				.getPathComponent_ReflexiveTransitiveClosure();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SymbolImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CallImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Functor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__FUNCTOR = eINSTANCE.getCall_Functor();

		/**
		 * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__ARGUMENT_LIST = eINSTANCE.getCall_ArgumentList();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ReferenceImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__COMPONENTS = eINSTANCE.getReference_Components();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Exists Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXISTS_VARIABLES = eINSTANCE.getExpression_ExistsVariables();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentListImpl <em>Argument List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ArgumentListImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getArgumentList()
		 * @generated
		 */
		EClass ARGUMENT_LIST = eINSTANCE.getArgumentList();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_LIST__ARGUMENTS = eINSTANCE.getArgumentList_Arguments();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionArgumentImpl <em>Expression Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionArgumentImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExpressionArgument()
		 * @generated
		 */
		EClass EXPRESSION_ARGUMENT = eINSTANCE.getExpressionArgument();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ARGUMENT__EXPRESSION = eINSTANCE.getExpressionArgument_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StarArgumentImpl <em>Star Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.StarArgumentImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getStarArgument()
		 * @generated
		 */
		EClass STAR_ARGUMENT = eINSTANCE.getStarArgument();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypedArgumentImpl <em>Typed Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypedArgumentImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypedArgument()
		 * @generated
		 */
		EClass TYPED_ARGUMENT = eINSTANCE.getTypedArgument();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ARGUMENT__TYPE_REFERENCE = eINSTANCE.getTypedArgument_TypeReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.MultiaryExpessionImpl <em>Multiary Expession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.MultiaryExpessionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getMultiaryExpession()
		 * @generated
		 */
		EClass MULTIARY_EXPESSION = eINSTANCE.getMultiaryExpession();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIARY_EXPESSION__CHILDREN = eINSTANCE.getMultiaryExpession_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.VariableImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE_REFERENCE = eINSTANCE.getVariable_TypeReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UnaryExpressionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__BODY = eINSTANCE.getUnaryExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BinaryExpressionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OP = eINSTANCE.getBinaryExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.DisjunctionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ConjunctionImpl <em>Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ConjunctionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getConjunction()
		 * @generated
		 */
		EClass CONJUNCTION = eINSTANCE.getConjunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ConditionalExpressionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__CONDITION = eINSTANCE.getConditionalExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__THEN = eINSTANCE.getConditionalExpression_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__ELSE = eINSTANCE.getConditionalExpression_Else();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SwitchImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__CASES = eINSTANCE.getSwitch_Cases();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CaseImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONDITION = eINSTANCE.getCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__BODY = eINSTANCE.getCase_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LetExpressionImpl <em>Let Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LetExpressionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLetExpression()
		 * @generated
		 */
		EClass LET_EXPRESSION = eINSTANCE.getLetExpression();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__BINDINGS = eINSTANCE.getLetExpression_Bindings();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__BODY = eINSTANCE.getLetExpression_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LetBindingImpl <em>Let Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LetBindingImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLetBinding()
		 * @generated
		 */
		EClass LET_BINDING = eINSTANCE.getLetBinding();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_BINDING__VALUE = eINSTANCE.getLetBinding_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_BINDING__VARIABLE = eINSTANCE.getLetBinding_Variable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LET_BINDING__NAME = eINSTANCE.getLetBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_BINDING__TYPE = eINSTANCE.getLetBinding_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.IntLiteralImpl <em>Int Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.IntLiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getIntLiteral()
		 * @generated
		 */
		EClass INT_LITERAL = eINSTANCE.getIntLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.RealLiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.StringLiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LogicLiteralImpl <em>Logic Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LogicLiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLogicLiteral()
		 * @generated
		 */
		EClass LOGIC_LITERAL = eINSTANCE.getLogicLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_LITERAL__VALUE = eINSTANCE.getLogicLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.EmptyLiteralImpl <em>Empty Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.EmptyLiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getEmptyLiteral()
		 * @generated
		 */
		EClass EMPTY_LITERAL = eINSTANCE.getEmptyLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CastExpressionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCastExpression()
		 * @generated
		 */
		EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__BODY = eINSTANCE.getCastExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__TARGET_TYPE = eINSTANCE.getCastExpression_TargetType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AggregateExpressionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAggregateExpression()
		 * @generated
		 */
		EClass AGGREGATE_EXPRESSION = eINSTANCE.getAggregateExpression();

		/**
		 * The meta object literal for the '<em><b>Forall Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_EXPRESSION__FORALL_VARIABLES = eINSTANCE.getAggregateExpression_ForallVariables();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_EXPRESSION__CONDITION = eINSTANCE.getAggregateExpression_Condition();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.CountImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__VALUE = eINSTANCE.getAggregation_Value();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__OP = eINSTANCE.getAggregation_Op();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ForallImpl <em>Forall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ForallImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getForall()
		 * @generated
		 */
		EClass FORALL = eINSTANCE.getForall();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORALL__BODY = eINSTANCE.getForall_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypeReferenceImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Force Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_REFERENCE__FORCE_OBJECT_TYPE = eINSTANCE.getTypeReference_ForceObjectType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__TYPE = eINSTANCE.getTypeReference_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.InfinityLiteralImpl <em>Infinity Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.InfinityLiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getInfinityLiteral()
		 * @generated
		 */
		EClass INFINITY_LITERAL = eINSTANCE.getInfinityLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.IntervalImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__LOWER_BOUND = eINSTANCE.getInterval_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__UPPER_BOUND = eINSTANCE.getInterval_UpperBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorImpl <em>Functor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunctor()
		 * @generated
		 */
		EClass FUNCTOR = eINSTANCE.getFunctor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTOR__PARAMETERS = eINSTANCE.getFunctor_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.RelationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BaseRelationImpl <em>Base Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BaseRelationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBaseRelation()
		 * @generated
		 */
		EClass BASE_RELATION = eINSTANCE.getBaseRelation();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.DatatypeImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RESULT_TYPE = eINSTANCE.getFunction_ResultType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.MetricImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.OperatorImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.NodeImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Named</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAMED = eINSTANCE.getNode_Named();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AbstractAssertionImpl <em>Abstract Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AbstractAssertionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAbstractAssertion()
		 * @generated
		 */
		EClass ABSTRACT_ASSERTION = eINSTANCE.getAbstractAssertion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ASSERTION__EXPRESSION = eINSTANCE.getAbstractAssertion_Expression();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ASSERTION__RANGE = eINSTANCE.getAbstractAssertion_Range();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorDefinitonImpl <em>Functor Definiton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctorDefinitonImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunctorDefiniton()
		 * @generated
		 */
		EClass FUNCTOR_DEFINITON = eINSTANCE.getFunctorDefiniton();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTOR_DEFINITON__HEAD = eINSTANCE.getFunctorDefiniton_Head();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTOR_DEFINITON__BODY = eINSTANCE.getFunctorDefiniton_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateDefinitionImpl <em>Predicate Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateDefinitionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getPredicateDefinition()
		 * @generated
		 */
		EClass PREDICATE_DEFINITION = eINSTANCE.getPredicateDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FunctionDefinitionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__RESULT_TYPE = eINSTANCE.getFunctionDefinition_ResultType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AttributeImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TARGET = eINSTANCE.getAttribute_Target();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__KIND = eINSTANCE.getAttribute_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDeclarationImpl <em>Extern Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternDeclaration()
		 * @generated
		 */
		EClass EXTERN_DECLARATION = eINSTANCE.getExternDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERN_DECLARATION__NAME = eINSTANCE.getExternDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctorDeclarationImpl <em>Extern Functor Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctorDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternFunctorDeclaration()
		 * @generated
		 */
		EClass EXTERN_FUNCTOR_DECLARATION = eINSTANCE.getExternFunctorDeclaration();

		/**
		 * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST = eINSTANCE.getExternFunctorDeclaration_ArgumentList();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternPredicateDeclarationImpl <em>Extern Predicate Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternPredicateDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternPredicateDeclaration()
		 * @generated
		 */
		EClass EXTERN_PREDICATE_DECLARATION = eINSTANCE.getExternPredicateDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctionDeclarationImpl <em>Extern Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctionDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternFunctionDeclaration()
		 * @generated
		 */
		EClass EXTERN_FUNCTION_DECLARATION = eINSTANCE.getExternFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERN_FUNCTION_DECLARATION__RESULT_TYPE = eINSTANCE.getExternFunctionDeclaration_ResultType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregationOperatorDeclarationImpl <em>Extern Aggregation Operator Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregationOperatorDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternAggregationOperatorDeclaration()
		 * @generated
		 */
		EClass EXTERN_AGGREGATION_OPERATOR_DECLARATION = eINSTANCE.getExternAggregationOperatorDeclaration();

		/**
		 * The meta object literal for the '<em><b>Argument Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE = eINSTANCE
				.getExternAggregationOperatorDeclaration_ArgumentType();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE = eINSTANCE
				.getExternAggregationOperatorDeclaration_ResultType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDatatypeDeclarationImpl <em>Extern Datatype Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExternDatatypeDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExternDatatypeDeclaration()
		 * @generated
		 */
		EClass EXTERN_DATATYPE_DECLARATION = eINSTANCE.getExternDatatypeDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ClassDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getClassDeclaration()
		 * @generated
		 */
		EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__FIELDS = eINSTANCE.getClassDeclaration_Fields();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DECLARATION__NAME = eINSTANCE.getClassDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DECLARATION__ABSTRACT = eINSTANCE.getClassDeclaration_Abstract();

		/**
		 * The meta object literal for the '<em><b>Supertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__SUPERTYPES = eINSTANCE.getClassDeclaration_Supertypes();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DECLARATION__ROOT = eINSTANCE.getClassDeclaration_Root();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.EnumDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getEnumDeclaration()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_DECLARATION__NAME = eINSTANCE.getEnumDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.EnumLiteralImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__NAME = eINSTANCE.getEnumLiteral_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.FieldImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__CONTAINMENT = eINSTANCE.getField_Containment();

		/**
		 * The meta object literal for the '<em><b>Cross Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__CROSS_REFERENCE = eINSTANCE.getField_CrossReference();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__OPPOSITE = eINSTANCE.getField_Opposite();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__MULTIPLICITY = eINSTANCE.getField_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.MultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DefaultAssertionImpl <em>Default Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.DefaultAssertionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getDefaultAssertion()
		 * @generated
		 */
		EClass DEFAULT_ASSERTION = eINSTANCE.getDefaultAssertion();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AssertionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnboundedMultiplicityImpl <em>Unbounded Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UnboundedMultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnboundedMultiplicity()
		 * @generated
		 */
		EClass UNBOUNDED_MULTIPLICITY = eINSTANCE.getUnboundedMultiplicity();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExactMultiplicityImpl <em>Exact Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExactMultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExactMultiplicity()
		 * @generated
		 */
		EClass EXACT_MULTIPLICITY = eINSTANCE.getExactMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXACT_MULTIPLICITY__VALUE = eINSTANCE.getExactMultiplicity_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedMultiplicityImpl <em>Bounded Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedMultiplicityImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBoundedMultiplicity()
		 * @generated
		 */
		EClass BOUNDED_MULTIPLICITY = eINSTANCE.getBoundedMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_MULTIPLICITY__LOWER_BOUND = eINSTANCE.getBoundedMultiplicity_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_MULTIPLICITY__UPPER_BOUND = eINSTANCE.getBoundedMultiplicity_UpperBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes <em>Inline Predicate Attrributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getInlinePredicateAttrributes()
		 * @generated
		 */
		EClass INLINE_PREDICATE_ATTRRIBUTES = eINSTANCE.getInlinePredicateAttrributes();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_PREDICATE_ATTRRIBUTES__ERROR = eINSTANCE.getInlinePredicateAttrributes_Error();

		/**
		 * The meta object literal for the '<em><b>Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_PREDICATE_ATTRRIBUTES__FUNCTIONAL = eINSTANCE.getInlinePredicateAttrributes_Functional();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationOperatorImpl <em>Aggregation Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationOperatorImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAggregationOperator()
		 * @generated
		 */
		EClass AGGREGATION_OPERATOR = eINSTANCE.getAggregationOperator();

		/**
		 * The meta object literal for the '<em><b>Argument Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_OPERATOR__ARGUMENT_TYPE = eINSTANCE.getAggregationOperator_ArgumentType();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_OPERATOR__RESULT_TYPE = eINSTANCE.getAggregationOperator_ResultType();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ProblemImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__NAME = eINSTANCE.getProblem_Name();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__STATEMENTS = eINSTANCE.getProblem_Statements();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__SYMBOLS = eINSTANCE.getProblem_Symbols();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__IMPORTS = eINSTANCE.getProblem_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypedStarArgumentImpl <em>Typed Star Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypedStarArgumentImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypedStarArgument()
		 * @generated
		 */
		EClass TYPED_STAR_ARGUMENT = eINSTANCE.getTypedStarArgument();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypedVariableArgumentImpl <em>Typed Variable Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.TypedVariableArgumentImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getTypedVariableArgument()
		 * @generated
		 */
		EClass TYPED_VARIABLE_ARGUMENT = eINSTANCE.getTypedVariableArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VARIABLE_ARGUMENT__NAME = eINSTANCE.getTypedVariableArgument_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnnamedErrorPredicateDefintionImpl <em>Unnamed Error Predicate Defintion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UnnamedErrorPredicateDefintionImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnnamedErrorPredicateDefintion()
		 * @generated
		 */
		EClass UNNAMED_ERROR_PREDICATE_DEFINTION = eINSTANCE.getUnnamedErrorPredicateDefintion();

		/**
		 * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST = eINSTANCE
				.getUnnamedErrorPredicateDefintion_ArgumentList();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNNAMED_ERROR_PREDICATE_DEFINTION__BODY = eINSTANCE.getUnnamedErrorPredicateDefintion_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ObjectiveDeclarationImpl <em>Objective Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ObjectiveDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getObjectiveDeclaration()
		 * @generated
		 */
		EClass OBJECTIVE_DECLARATION = eINSTANCE.getObjectiveDeclaration();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_DECLARATION__KIND = eINSTANCE.getObjectiveDeclaration_Kind();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_DECLARATION__OBJECTIVE = eINSTANCE.getObjectiveDeclaration_Objective();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ScopeDeclarationImpl <em>Scope Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ScopeDeclarationImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getScopeDeclaration()
		 * @generated
		 */
		EClass SCOPE_DECLARATION = eINSTANCE.getScopeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_DECLARATION__TYPE = eINSTANCE.getScopeDeclaration_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExactScopeImpl <em>Exact Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ExactScopeImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getExactScope()
		 * @generated
		 */
		EClass EXACT_SCOPE = eINSTANCE.getExactScope();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXACT_SCOPE__SIZE = eINSTANCE.getExactScope_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedScopeImpl <em>Bounded Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.BoundedScopeImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBoundedScope()
		 * @generated
		 */
		EClass BOUNDED_SCOPE = eINSTANCE.getBoundedScope();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_SCOPE__LOWER_BOUND = eINSTANCE.getBoundedScope_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_SCOPE__UPPER_BOUND = eINSTANCE.getBoundedScope_UpperBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.LowerBoundedScopeImpl <em>Lower Bounded Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.LowerBoundedScopeImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLowerBoundedScope()
		 * @generated
		 */
		EClass LOWER_BOUNDED_SCOPE = eINSTANCE.getLowerBoundedScope();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOWER_BOUNDED_SCOPE__LOWER_BOUND = eINSTANCE.getLowerBoundedScope_LowerBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.NamespaceImportImpl <em>Namespace Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.NamespaceImportImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getNamespaceImport()
		 * @generated
		 */
		EClass NAMESPACE_IMPORT = eINSTANCE.getNamespaceImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getNamespaceImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.ImportImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ALIAS = eINSTANCE.getImport_Alias();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UriImportImpl <em>Uri Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.UriImportImpl
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUriImport()
		 * @generated
		 */
		EClass URI_IMPORT = eINSTANCE.getUriImport();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_IMPORT__URI = eINSTANCE.getUriImport_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.LogicValue <em>Logic Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.LogicValue
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getLogicValue()
		 * @generated
		 */
		EEnum LOGIC_VALUE = eINSTANCE.getLogicValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind <em>Objective Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getObjectiveKind()
		 * @generated
		 */
		EEnum OBJECTIVE_KIND = eINSTANCE.getObjectiveKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.viatra.solver.language.solverLanguage.AttributeKind <em>Attribute Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.viatra.solver.language.solverLanguage.AttributeKind
		 * @see org.eclipse.viatra.solver.language.solverLanguage.impl.SolverLanguagePackageImpl#getAttributeKind()
		 * @generated
		 */
		EEnum ATTRIBUTE_KIND = eINSTANCE.getAttributeKind();

	}

} //SolverLanguagePackage
