/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion;
import org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression;
import org.eclipse.viatra.solver.language.solverLanguage.Aggregation;
import org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator;
import org.eclipse.viatra.solver.language.solverLanguage.Argument;
import org.eclipse.viatra.solver.language.solverLanguage.ArgumentList;
import org.eclipse.viatra.solver.language.solverLanguage.Assertion;
import org.eclipse.viatra.solver.language.solverLanguage.Attribute;
import org.eclipse.viatra.solver.language.solverLanguage.AttributeKind;
import org.eclipse.viatra.solver.language.solverLanguage.BaseRelation;
import org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression;
import org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator;
import org.eclipse.viatra.solver.language.solverLanguage.BoundedMultiplicity;
import org.eclipse.viatra.solver.language.solverLanguage.BoundedScope;
import org.eclipse.viatra.solver.language.solverLanguage.Call;
import org.eclipse.viatra.solver.language.solverLanguage.Case;
import org.eclipse.viatra.solver.language.solverLanguage.CastExpression;
import org.eclipse.viatra.solver.language.solverLanguage.ClassDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ConditionalExpression;
import org.eclipse.viatra.solver.language.solverLanguage.Conjunction;
import org.eclipse.viatra.solver.language.solverLanguage.Count;
import org.eclipse.viatra.solver.language.solverLanguage.Datatype;
import org.eclipse.viatra.solver.language.solverLanguage.DefaultAssertion;
import org.eclipse.viatra.solver.language.solverLanguage.Disjunction;
import org.eclipse.viatra.solver.language.solverLanguage.EmptyLiteral;
import org.eclipse.viatra.solver.language.solverLanguage.EnumDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.EnumLiteral;
import org.eclipse.viatra.solver.language.solverLanguage.ExactMultiplicity;
import org.eclipse.viatra.solver.language.solverLanguage.ExactScope;
import org.eclipse.viatra.solver.language.solverLanguage.Expression;
import org.eclipse.viatra.solver.language.solverLanguage.ExpressionArgument;
import org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ExternDatatypeDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ExternDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ExternFunctionDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ExternPredicateDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.Field;
import org.eclipse.viatra.solver.language.solverLanguage.Forall;
import org.eclipse.viatra.solver.language.solverLanguage.Function;
import org.eclipse.viatra.solver.language.solverLanguage.FunctionDefinition;
import org.eclipse.viatra.solver.language.solverLanguage.Functor;
import org.eclipse.viatra.solver.language.solverLanguage.FunctorDefiniton;
import org.eclipse.viatra.solver.language.solverLanguage.Import;
import org.eclipse.viatra.solver.language.solverLanguage.InfinityLiteral;
import org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes;
import org.eclipse.viatra.solver.language.solverLanguage.IntLiteral;
import org.eclipse.viatra.solver.language.solverLanguage.Interval;
import org.eclipse.viatra.solver.language.solverLanguage.LetBinding;
import org.eclipse.viatra.solver.language.solverLanguage.LetExpression;
import org.eclipse.viatra.solver.language.solverLanguage.Literal;
import org.eclipse.viatra.solver.language.solverLanguage.LogicLiteral;
import org.eclipse.viatra.solver.language.solverLanguage.LogicValue;
import org.eclipse.viatra.solver.language.solverLanguage.LowerBoundedScope;
import org.eclipse.viatra.solver.language.solverLanguage.Metric;
import org.eclipse.viatra.solver.language.solverLanguage.MultiaryExpession;
import org.eclipse.viatra.solver.language.solverLanguage.Multiplicity;
import org.eclipse.viatra.solver.language.solverLanguage.NamespaceImport;
import org.eclipse.viatra.solver.language.solverLanguage.Node;
import org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind;
import org.eclipse.viatra.solver.language.solverLanguage.Operator;
import org.eclipse.viatra.solver.language.solverLanguage.PathComponent;
import org.eclipse.viatra.solver.language.solverLanguage.Predicate;
import org.eclipse.viatra.solver.language.solverLanguage.PredicateDefinition;
import org.eclipse.viatra.solver.language.solverLanguage.Problem;
import org.eclipse.viatra.solver.language.solverLanguage.RealLiteral;
import org.eclipse.viatra.solver.language.solverLanguage.Reference;
import org.eclipse.viatra.solver.language.solverLanguage.Relation;
import org.eclipse.viatra.solver.language.solverLanguage.ScopeDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguageFactory;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.StarArgument;
import org.eclipse.viatra.solver.language.solverLanguage.Statement;
import org.eclipse.viatra.solver.language.solverLanguage.StringLiteral;
import org.eclipse.viatra.solver.language.solverLanguage.Switch;
import org.eclipse.viatra.solver.language.solverLanguage.Symbol;
import org.eclipse.viatra.solver.language.solverLanguage.TypeReference;
import org.eclipse.viatra.solver.language.solverLanguage.TypedArgument;
import org.eclipse.viatra.solver.language.solverLanguage.TypedStarArgument;
import org.eclipse.viatra.solver.language.solverLanguage.TypedVariableArgument;
import org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression;
import org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator;
import org.eclipse.viatra.solver.language.solverLanguage.UnboundedMultiplicity;
import org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion;
import org.eclipse.viatra.solver.language.solverLanguage.UriImport;
import org.eclipse.viatra.solver.language.solverLanguage.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverLanguagePackageImpl extends EPackageImpl implements SolverLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass starArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiaryExpessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infinityLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functorDefinitonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externFunctorDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externPredicateDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externFunctionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externAggregationOperatorDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externDatatypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unboundedMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlinePredicateAttrributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedStarArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedVariableArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unnamedErrorPredicateDefintionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerBoundedScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectiveKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeKindEEnum = null;

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
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverLanguagePackageImpl() {
		super(eNS_URI, SolverLanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolverLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverLanguagePackage init() {
		if (isInited)
			return (SolverLanguagePackage) EPackage.Registry.INSTANCE.getEPackage(SolverLanguagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSolverLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SolverLanguagePackageImpl theSolverLanguagePackage = registeredSolverLanguagePackage instanceof SolverLanguagePackageImpl
				? (SolverLanguagePackageImpl) registeredSolverLanguagePackage
				: new SolverLanguagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSolverLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theSolverLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverLanguagePackage.eNS_URI, theSolverLanguagePackage);
		return theSolverLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathComponent() {
		return pathComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathComponent_Symbol() {
		return (EReference) pathComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathComponent_Inverse() {
		return (EAttribute) pathComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathComponent_TransitiveClosure() {
		return (EAttribute) pathComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathComponent_ReflexiveTransitiveClosure() {
		return (EAttribute) pathComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbol() {
		return symbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbol_Name() {
		return (EAttribute) symbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Functor() {
		return (EReference) callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_ArgumentList() {
		return (EReference) callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Components() {
		return (EReference) referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_ExistsVariables() {
		return (EReference) expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentList() {
		return argumentListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentList_Arguments() {
		return (EReference) argumentListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionArgument() {
		return expressionArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionArgument_Expression() {
		return (EReference) expressionArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStarArgument() {
		return starArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedArgument() {
		return typedArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedArgument_TypeReference() {
		return (EReference) typedArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiaryExpession() {
		return multiaryExpessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiaryExpession_Children() {
		return (EReference) multiaryExpessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_TypeReference() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Body() {
		return (EReference) unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Op() {
		return (EAttribute) unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Op() {
		return (EAttribute) binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjunction() {
		return disjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunction() {
		return conjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Condition() {
		return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Then() {
		return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Else() {
		return (EReference) conditionalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Cases() {
		return (EReference) switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Condition() {
		return (EReference) caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Body() {
		return (EReference) caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetExpression() {
		return letExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExpression_Bindings() {
		return (EReference) letExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExpression_Body() {
		return (EReference) letExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetBinding() {
		return letBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetBinding_Value() {
		return (EReference) letBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetBinding_Variable() {
		return (EReference) letBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLetBinding_Name() {
		return (EAttribute) letBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetBinding_Type() {
		return (EReference) letBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntLiteral() {
		return intLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntLiteral_Value() {
		return (EAttribute) intLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealLiteral() {
		return realLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealLiteral_Value() {
		return (EAttribute) realLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute) stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicLiteral() {
		return logicLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicLiteral_Value() {
		return (EAttribute) logicLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyLiteral() {
		return emptyLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastExpression() {
		return castExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_Body() {
		return (EReference) castExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_TargetType() {
		return (EReference) castExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExpression() {
		return aggregateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateExpression_ForallVariables() {
		return (EReference) aggregateExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateExpression_Condition() {
		return (EReference) aggregateExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregation_Value() {
		return (EReference) aggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregation_Op() {
		return (EReference) aggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForall() {
		return forallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForall_Body() {
		return (EReference) forallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeReference_ForceObjectType() {
		return (EAttribute) typeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeReference_Type() {
		return (EReference) typeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfinityLiteral() {
		return infinityLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_LowerBound() {
		return (EReference) intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_UpperBound() {
		return (EReference) intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctor() {
		return functorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctor_Parameters() {
		return (EReference) functorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseRelation() {
		return baseRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_ResultType() {
		return (EReference) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Named() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAssertion() {
		return abstractAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAssertion_Expression() {
		return (EReference) abstractAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAssertion_Range() {
		return (EReference) abstractAssertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctorDefiniton() {
		return functorDefinitonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctorDefiniton_Head() {
		return (EReference) functorDefinitonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctorDefiniton_Body() {
		return (EReference) functorDefinitonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateDefinition() {
		return predicateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDefinition() {
		return functionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_ResultType() {
		return (EReference) functionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Target() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Kind() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternDeclaration() {
		return externDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternDeclaration_Name() {
		return (EAttribute) externDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternFunctorDeclaration() {
		return externFunctorDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternFunctorDeclaration_ArgumentList() {
		return (EReference) externFunctorDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternPredicateDeclaration() {
		return externPredicateDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternFunctionDeclaration() {
		return externFunctionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternFunctionDeclaration_ResultType() {
		return (EReference) externFunctionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternAggregationOperatorDeclaration() {
		return externAggregationOperatorDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternAggregationOperatorDeclaration_ArgumentType() {
		return (EReference) externAggregationOperatorDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternAggregationOperatorDeclaration_ResultType() {
		return (EReference) externAggregationOperatorDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternDatatypeDeclaration() {
		return externDatatypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDeclaration() {
		return classDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_Fields() {
		return (EReference) classDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDeclaration_Name() {
		return (EAttribute) classDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDeclaration_Abstract() {
		return (EAttribute) classDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_Supertypes() {
		return (EReference) classDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDeclaration_Root() {
		return (EAttribute) classDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDeclaration() {
		return enumDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDeclaration_Literals() {
		return (EReference) enumDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumDeclaration_Name() {
		return (EAttribute) enumDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Name() {
		return (EAttribute) enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Containment() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_CrossReference() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Opposite() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Multiplicity() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicity() {
		return multiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultAssertion() {
		return defaultAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnboundedMultiplicity() {
		return unboundedMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExactMultiplicity() {
		return exactMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExactMultiplicity_Value() {
		return (EAttribute) exactMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedMultiplicity() {
		return boundedMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedMultiplicity_LowerBound() {
		return (EAttribute) boundedMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedMultiplicity_UpperBound() {
		return (EAttribute) boundedMultiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlinePredicateAttrributes() {
		return inlinePredicateAttrributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlinePredicateAttrributes_Error() {
		return (EAttribute) inlinePredicateAttrributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlinePredicateAttrributes_Functional() {
		return (EAttribute) inlinePredicateAttrributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationOperator() {
		return aggregationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationOperator_ArgumentType() {
		return (EReference) aggregationOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationOperator_ResultType() {
		return (EReference) aggregationOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblem() {
		return problemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblem_Name() {
		return (EAttribute) problemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Statements() {
		return (EReference) problemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Symbols() {
		return (EReference) problemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Imports() {
		return (EReference) problemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedStarArgument() {
		return typedStarArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedVariableArgument() {
		return typedVariableArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedVariableArgument_Name() {
		return (EAttribute) typedVariableArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnnamedErrorPredicateDefintion() {
		return unnamedErrorPredicateDefintionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnnamedErrorPredicateDefintion_ArgumentList() {
		return (EReference) unnamedErrorPredicateDefintionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnnamedErrorPredicateDefintion_Body() {
		return (EReference) unnamedErrorPredicateDefintionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveDeclaration() {
		return objectiveDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveDeclaration_Kind() {
		return (EAttribute) objectiveDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectiveDeclaration_Objective() {
		return (EReference) objectiveDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeDeclaration() {
		return scopeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeDeclaration_Type() {
		return (EReference) scopeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExactScope() {
		return exactScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExactScope_Size() {
		return (EAttribute) exactScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedScope() {
		return boundedScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedScope_LowerBound() {
		return (EAttribute) boundedScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedScope_UpperBound() {
		return (EAttribute) boundedScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerBoundedScope() {
		return lowerBoundedScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLowerBoundedScope_LowerBound() {
		return (EAttribute) lowerBoundedScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceImport() {
		return namespaceImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceImport_ImportedNamespace() {
		return (EAttribute) namespaceImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Alias() {
		return (EAttribute) importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUriImport() {
		return uriImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUriImport_Uri() {
		return (EAttribute) uriImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicValue() {
		return logicValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectiveKind() {
		return objectiveKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeKind() {
		return attributeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLanguageFactory getSolverLanguageFactory() {
		return (SolverLanguageFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		pathComponentEClass = createEClass(PATH_COMPONENT);
		createEReference(pathComponentEClass, PATH_COMPONENT__SYMBOL);
		createEAttribute(pathComponentEClass, PATH_COMPONENT__INVERSE);
		createEAttribute(pathComponentEClass, PATH_COMPONENT__TRANSITIVE_CLOSURE);
		createEAttribute(pathComponentEClass, PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE);

		symbolEClass = createEClass(SYMBOL);
		createEAttribute(symbolEClass, SYMBOL__NAME);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__FUNCTOR);
		createEReference(callEClass, CALL__ARGUMENT_LIST);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__COMPONENTS);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__EXISTS_VARIABLES);

		argumentEClass = createEClass(ARGUMENT);

		argumentListEClass = createEClass(ARGUMENT_LIST);
		createEReference(argumentListEClass, ARGUMENT_LIST__ARGUMENTS);

		expressionArgumentEClass = createEClass(EXPRESSION_ARGUMENT);
		createEReference(expressionArgumentEClass, EXPRESSION_ARGUMENT__EXPRESSION);

		starArgumentEClass = createEClass(STAR_ARGUMENT);

		typedArgumentEClass = createEClass(TYPED_ARGUMENT);
		createEReference(typedArgumentEClass, TYPED_ARGUMENT__TYPE_REFERENCE);

		multiaryExpessionEClass = createEClass(MULTIARY_EXPESSION);
		createEReference(multiaryExpessionEClass, MULTIARY_EXPESSION__CHILDREN);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE_REFERENCE);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__BODY);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OP);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OP);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

		disjunctionEClass = createEClass(DISJUNCTION);

		conjunctionEClass = createEClass(CONJUNCTION);

		conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__CONDITION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__THEN);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__ELSE);

		switchEClass = createEClass(SWITCH);
		createEReference(switchEClass, SWITCH__CASES);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__CONDITION);
		createEReference(caseEClass, CASE__BODY);

		letExpressionEClass = createEClass(LET_EXPRESSION);
		createEReference(letExpressionEClass, LET_EXPRESSION__BINDINGS);
		createEReference(letExpressionEClass, LET_EXPRESSION__BODY);

		letBindingEClass = createEClass(LET_BINDING);
		createEReference(letBindingEClass, LET_BINDING__VALUE);
		createEReference(letBindingEClass, LET_BINDING__VARIABLE);
		createEAttribute(letBindingEClass, LET_BINDING__NAME);
		createEReference(letBindingEClass, LET_BINDING__TYPE);

		literalEClass = createEClass(LITERAL);

		intLiteralEClass = createEClass(INT_LITERAL);
		createEAttribute(intLiteralEClass, INT_LITERAL__VALUE);

		realLiteralEClass = createEClass(REAL_LITERAL);
		createEAttribute(realLiteralEClass, REAL_LITERAL__VALUE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		logicLiteralEClass = createEClass(LOGIC_LITERAL);
		createEAttribute(logicLiteralEClass, LOGIC_LITERAL__VALUE);

		emptyLiteralEClass = createEClass(EMPTY_LITERAL);

		castExpressionEClass = createEClass(CAST_EXPRESSION);
		createEReference(castExpressionEClass, CAST_EXPRESSION__BODY);
		createEReference(castExpressionEClass, CAST_EXPRESSION__TARGET_TYPE);

		aggregateExpressionEClass = createEClass(AGGREGATE_EXPRESSION);
		createEReference(aggregateExpressionEClass, AGGREGATE_EXPRESSION__FORALL_VARIABLES);
		createEReference(aggregateExpressionEClass, AGGREGATE_EXPRESSION__CONDITION);

		countEClass = createEClass(COUNT);

		aggregationEClass = createEClass(AGGREGATION);
		createEReference(aggregationEClass, AGGREGATION__VALUE);
		createEReference(aggregationEClass, AGGREGATION__OP);

		forallEClass = createEClass(FORALL);
		createEReference(forallEClass, FORALL__BODY);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);
		createEAttribute(typeReferenceEClass, TYPE_REFERENCE__FORCE_OBJECT_TYPE);
		createEReference(typeReferenceEClass, TYPE_REFERENCE__TYPE);

		infinityLiteralEClass = createEClass(INFINITY_LITERAL);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__LOWER_BOUND);
		createEReference(intervalEClass, INTERVAL__UPPER_BOUND);

		functorEClass = createEClass(FUNCTOR);
		createEReference(functorEClass, FUNCTOR__PARAMETERS);

		relationEClass = createEClass(RELATION);

		baseRelationEClass = createEClass(BASE_RELATION);

		predicateEClass = createEClass(PREDICATE);

		datatypeEClass = createEClass(DATATYPE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RESULT_TYPE);

		metricEClass = createEClass(METRIC);

		operatorEClass = createEClass(OPERATOR);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAMED);

		statementEClass = createEClass(STATEMENT);

		abstractAssertionEClass = createEClass(ABSTRACT_ASSERTION);
		createEReference(abstractAssertionEClass, ABSTRACT_ASSERTION__EXPRESSION);
		createEReference(abstractAssertionEClass, ABSTRACT_ASSERTION__RANGE);

		functorDefinitonEClass = createEClass(FUNCTOR_DEFINITON);
		createEReference(functorDefinitonEClass, FUNCTOR_DEFINITON__HEAD);
		createEReference(functorDefinitonEClass, FUNCTOR_DEFINITON__BODY);

		predicateDefinitionEClass = createEClass(PREDICATE_DEFINITION);

		functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__RESULT_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TARGET);
		createEAttribute(attributeEClass, ATTRIBUTE__KIND);

		externDeclarationEClass = createEClass(EXTERN_DECLARATION);
		createEAttribute(externDeclarationEClass, EXTERN_DECLARATION__NAME);

		externFunctorDeclarationEClass = createEClass(EXTERN_FUNCTOR_DECLARATION);
		createEReference(externFunctorDeclarationEClass, EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST);

		externPredicateDeclarationEClass = createEClass(EXTERN_PREDICATE_DECLARATION);

		externFunctionDeclarationEClass = createEClass(EXTERN_FUNCTION_DECLARATION);
		createEReference(externFunctionDeclarationEClass, EXTERN_FUNCTION_DECLARATION__RESULT_TYPE);

		externAggregationOperatorDeclarationEClass = createEClass(EXTERN_AGGREGATION_OPERATOR_DECLARATION);
		createEReference(externAggregationOperatorDeclarationEClass,
				EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE);
		createEReference(externAggregationOperatorDeclarationEClass,
				EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE);

		externDatatypeDeclarationEClass = createEClass(EXTERN_DATATYPE_DECLARATION);

		classDeclarationEClass = createEClass(CLASS_DECLARATION);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__FIELDS);
		createEAttribute(classDeclarationEClass, CLASS_DECLARATION__NAME);
		createEAttribute(classDeclarationEClass, CLASS_DECLARATION__ABSTRACT);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__SUPERTYPES);
		createEAttribute(classDeclarationEClass, CLASS_DECLARATION__ROOT);

		enumDeclarationEClass = createEClass(ENUM_DECLARATION);
		createEReference(enumDeclarationEClass, ENUM_DECLARATION__LITERALS);
		createEAttribute(enumDeclarationEClass, ENUM_DECLARATION__NAME);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__NAME);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__CONTAINMENT);
		createEAttribute(fieldEClass, FIELD__CROSS_REFERENCE);
		createEReference(fieldEClass, FIELD__OPPOSITE);
		createEReference(fieldEClass, FIELD__MULTIPLICITY);
		createEReference(fieldEClass, FIELD__TYPE);
		createEAttribute(fieldEClass, FIELD__NAME);

		multiplicityEClass = createEClass(MULTIPLICITY);

		defaultAssertionEClass = createEClass(DEFAULT_ASSERTION);

		assertionEClass = createEClass(ASSERTION);

		unboundedMultiplicityEClass = createEClass(UNBOUNDED_MULTIPLICITY);

		exactMultiplicityEClass = createEClass(EXACT_MULTIPLICITY);
		createEAttribute(exactMultiplicityEClass, EXACT_MULTIPLICITY__VALUE);

		boundedMultiplicityEClass = createEClass(BOUNDED_MULTIPLICITY);
		createEAttribute(boundedMultiplicityEClass, BOUNDED_MULTIPLICITY__LOWER_BOUND);
		createEAttribute(boundedMultiplicityEClass, BOUNDED_MULTIPLICITY__UPPER_BOUND);

		inlinePredicateAttrributesEClass = createEClass(INLINE_PREDICATE_ATTRRIBUTES);
		createEAttribute(inlinePredicateAttrributesEClass, INLINE_PREDICATE_ATTRRIBUTES__ERROR);
		createEAttribute(inlinePredicateAttrributesEClass, INLINE_PREDICATE_ATTRRIBUTES__FUNCTIONAL);

		aggregationOperatorEClass = createEClass(AGGREGATION_OPERATOR);
		createEReference(aggregationOperatorEClass, AGGREGATION_OPERATOR__ARGUMENT_TYPE);
		createEReference(aggregationOperatorEClass, AGGREGATION_OPERATOR__RESULT_TYPE);

		problemEClass = createEClass(PROBLEM);
		createEAttribute(problemEClass, PROBLEM__NAME);
		createEReference(problemEClass, PROBLEM__STATEMENTS);
		createEReference(problemEClass, PROBLEM__SYMBOLS);
		createEReference(problemEClass, PROBLEM__IMPORTS);

		typedStarArgumentEClass = createEClass(TYPED_STAR_ARGUMENT);

		typedVariableArgumentEClass = createEClass(TYPED_VARIABLE_ARGUMENT);
		createEAttribute(typedVariableArgumentEClass, TYPED_VARIABLE_ARGUMENT__NAME);

		unnamedErrorPredicateDefintionEClass = createEClass(UNNAMED_ERROR_PREDICATE_DEFINTION);
		createEReference(unnamedErrorPredicateDefintionEClass, UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST);
		createEReference(unnamedErrorPredicateDefintionEClass, UNNAMED_ERROR_PREDICATE_DEFINTION__BODY);

		objectiveDeclarationEClass = createEClass(OBJECTIVE_DECLARATION);
		createEAttribute(objectiveDeclarationEClass, OBJECTIVE_DECLARATION__KIND);
		createEReference(objectiveDeclarationEClass, OBJECTIVE_DECLARATION__OBJECTIVE);

		scopeDeclarationEClass = createEClass(SCOPE_DECLARATION);
		createEReference(scopeDeclarationEClass, SCOPE_DECLARATION__TYPE);

		exactScopeEClass = createEClass(EXACT_SCOPE);
		createEAttribute(exactScopeEClass, EXACT_SCOPE__SIZE);

		boundedScopeEClass = createEClass(BOUNDED_SCOPE);
		createEAttribute(boundedScopeEClass, BOUNDED_SCOPE__LOWER_BOUND);
		createEAttribute(boundedScopeEClass, BOUNDED_SCOPE__UPPER_BOUND);

		lowerBoundedScopeEClass = createEClass(LOWER_BOUNDED_SCOPE);
		createEAttribute(lowerBoundedScopeEClass, LOWER_BOUNDED_SCOPE__LOWER_BOUND);

		namespaceImportEClass = createEClass(NAMESPACE_IMPORT);
		createEAttribute(namespaceImportEClass, NAMESPACE_IMPORT__IMPORTED_NAMESPACE);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__ALIAS);

		uriImportEClass = createEClass(URI_IMPORT);
		createEAttribute(uriImportEClass, URI_IMPORT__URI);

		// Create enums
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
		logicValueEEnum = createEEnum(LOGIC_VALUE);
		objectiveKindEEnum = createEEnum(OBJECTIVE_KIND);
		attributeKindEEnum = createEEnum(ATTRIBUTE_KIND);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callEClass.getESuperTypes().add(this.getExpression());
		referenceEClass.getESuperTypes().add(this.getExpression());
		expressionEClass.getESuperTypes().add(this.getStatement());
		expressionArgumentEClass.getESuperTypes().add(this.getArgument());
		starArgumentEClass.getESuperTypes().add(this.getArgument());
		typedArgumentEClass.getESuperTypes().add(this.getArgument());
		multiaryExpessionEClass.getESuperTypes().add(this.getExpression());
		variableEClass.getESuperTypes().add(this.getSymbol());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		disjunctionEClass.getESuperTypes().add(this.getMultiaryExpession());
		conjunctionEClass.getESuperTypes().add(this.getMultiaryExpession());
		conditionalExpressionEClass.getESuperTypes().add(this.getExpression());
		switchEClass.getESuperTypes().add(this.getExpression());
		caseEClass.getESuperTypes().add(this.getExpression());
		letExpressionEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getExpression());
		intLiteralEClass.getESuperTypes().add(this.getLiteral());
		realLiteralEClass.getESuperTypes().add(this.getLiteral());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		logicLiteralEClass.getESuperTypes().add(this.getLiteral());
		emptyLiteralEClass.getESuperTypes().add(this.getLiteral());
		castExpressionEClass.getESuperTypes().add(this.getExpression());
		aggregateExpressionEClass.getESuperTypes().add(this.getExpression());
		countEClass.getESuperTypes().add(this.getAggregateExpression());
		aggregationEClass.getESuperTypes().add(this.getAggregateExpression());
		forallEClass.getESuperTypes().add(this.getAggregateExpression());
		infinityLiteralEClass.getESuperTypes().add(this.getLiteral());
		intervalEClass.getESuperTypes().add(this.getExpression());
		functorEClass.getESuperTypes().add(this.getSymbol());
		relationEClass.getESuperTypes().add(this.getFunctor());
		baseRelationEClass.getESuperTypes().add(this.getRelation());
		predicateEClass.getESuperTypes().add(this.getRelation());
		datatypeEClass.getESuperTypes().add(this.getRelation());
		functionEClass.getESuperTypes().add(this.getFunctor());
		metricEClass.getESuperTypes().add(this.getFunction());
		operatorEClass.getESuperTypes().add(this.getFunction());
		nodeEClass.getESuperTypes().add(this.getSymbol());
		abstractAssertionEClass.getESuperTypes().add(this.getStatement());
		functorDefinitonEClass.getESuperTypes().add(this.getStatement());
		predicateDefinitionEClass.getESuperTypes().add(this.getFunctorDefiniton());
		predicateDefinitionEClass.getESuperTypes().add(this.getInlinePredicateAttrributes());
		functionDefinitionEClass.getESuperTypes().add(this.getFunctorDefiniton());
		attributeEClass.getESuperTypes().add(this.getStatement());
		externDeclarationEClass.getESuperTypes().add(this.getStatement());
		externFunctorDeclarationEClass.getESuperTypes().add(this.getExternDeclaration());
		externPredicateDeclarationEClass.getESuperTypes().add(this.getExternFunctorDeclaration());
		externPredicateDeclarationEClass.getESuperTypes().add(this.getInlinePredicateAttrributes());
		externFunctionDeclarationEClass.getESuperTypes().add(this.getExternFunctorDeclaration());
		externAggregationOperatorDeclarationEClass.getESuperTypes().add(this.getExternDeclaration());
		externDatatypeDeclarationEClass.getESuperTypes().add(this.getExternDeclaration());
		classDeclarationEClass.getESuperTypes().add(this.getStatement());
		enumDeclarationEClass.getESuperTypes().add(this.getStatement());
		defaultAssertionEClass.getESuperTypes().add(this.getAbstractAssertion());
		assertionEClass.getESuperTypes().add(this.getAbstractAssertion());
		unboundedMultiplicityEClass.getESuperTypes().add(this.getMultiplicity());
		exactMultiplicityEClass.getESuperTypes().add(this.getMultiplicity());
		boundedMultiplicityEClass.getESuperTypes().add(this.getMultiplicity());
		aggregationOperatorEClass.getESuperTypes().add(this.getSymbol());
		typedStarArgumentEClass.getESuperTypes().add(this.getTypedArgument());
		typedVariableArgumentEClass.getESuperTypes().add(this.getTypedArgument());
		unnamedErrorPredicateDefintionEClass.getESuperTypes().add(this.getStatement());
		objectiveDeclarationEClass.getESuperTypes().add(this.getStatement());
		scopeDeclarationEClass.getESuperTypes().add(this.getStatement());
		exactScopeEClass.getESuperTypes().add(this.getScopeDeclaration());
		boundedScopeEClass.getESuperTypes().add(this.getScopeDeclaration());
		lowerBoundedScopeEClass.getESuperTypes().add(this.getScopeDeclaration());
		namespaceImportEClass.getESuperTypes().add(this.getImport());
		uriImportEClass.getESuperTypes().add(this.getImport());

		// Initialize classes, features, and operations; add parameters
		initEClass(pathComponentEClass, PathComponent.class, "PathComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathComponent_Symbol(), this.getSymbol(), null, "symbol", null, 0, 1, PathComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathComponent_Inverse(), ecorePackage.getEBoolean(), "inverse", null, 0, 1,
				PathComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathComponent_TransitiveClosure(), ecorePackage.getEBoolean(), "transitiveClosure", null, 0,
				1, PathComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathComponent_ReflexiveTransitiveClosure(), ecorePackage.getEBoolean(),
				"reflexiveTransitiveClosure", null, 0, 1, PathComponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolEClass, Symbol.class, "Symbol", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Symbol.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Functor(), this.getReference(), null, "functor", null, 0, 1, Call.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCall_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, Call.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Components(), this.getPathComponent(), null, "components", null, 0, -1,
				Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_ExistsVariables(), this.getVariable(), null, "existsVariables", null, 0, -1,
				Expression.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentListEClass, ArgumentList.class, "ArgumentList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentList_Arguments(), this.getArgument(), null, "arguments", null, 0, -1,
				ArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionArgumentEClass, ExpressionArgument.class, "ExpressionArgument", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionArgument_Expression(), this.getExpression(), null, "expression", null, 0, 1,
				ExpressionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(starArgumentEClass, StarArgument.class, "StarArgument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedArgumentEClass, TypedArgument.class, "TypedArgument", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedArgument_TypeReference(), this.getTypeReference(), null, "typeReference", null, 0, 1,
				TypedArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiaryExpessionEClass, MultiaryExpession.class, "MultiaryExpession", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiaryExpession_Children(), this.getExpression(), null, "children", null, 0, -1,
				MultiaryExpession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_TypeReference(), this.getTypeReference(), null, "typeReference", null, 0, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Body(), this.getExpression(), null, "body", null, 0, 1, UnaryExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryExpression_Op(), this.getUnaryOperator(), "op", null, 0, 1, UnaryExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExpression_Op(), this.getBinaryOperator(), "op", null, 0, 1, BinaryExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 0, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalExpression_Condition(), this.getExpression(), null, "condition", null, 0, 1,
				ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_Then(), this.getExpression(), null, "then", null, 0, 1,
				ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_Else(), this.getExpression(), null, "else", null, 0, 1,
				ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitch_Cases(), this.getCase(), null, "cases", null, 0, -1, Switch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Condition(), this.getExpression(), null, "condition", null, 0, 1, Case.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_Body(), this.getExpression(), null, "body", null, 0, 1, Case.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(letExpressionEClass, LetExpression.class, "LetExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetExpression_Bindings(), this.getLetBinding(), null, "bindings", null, 0, -1,
				LetExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetExpression_Body(), this.getExpression(), null, "body", null, 0, 1, LetExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letBindingEClass, LetBinding.class, "LetBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetBinding_Value(), this.getExpression(), null, "value", null, 0, 1, LetBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetBinding_Variable(), this.getVariable(), null, "variable", null, 0, 1, LetBinding.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLetBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, LetBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetBinding_Type(), this.getSymbol(), null, "type", null, 0, 1, LetBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realLiteralEClass, RealLiteral.class, "RealLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealLiteral_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, RealLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicLiteralEClass, LogicLiteral.class, "LogicLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicLiteral_Value(), this.getLogicValue(), "value", null, 0, 1, LogicLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyLiteralEClass, EmptyLiteral.class, "EmptyLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCastExpression_Body(), this.getExpression(), null, "body", null, 0, 1, CastExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCastExpression_TargetType(), this.getSymbol(), null, "targetType", null, 0, 1,
				CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateExpressionEClass, AggregateExpression.class, "AggregateExpression", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregateExpression_ForallVariables(), this.getVariable(), null, "forallVariables", null, 0,
				-1, AggregateExpression.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregateExpression_Condition(), this.getExpression(), null, "condition", null, 0, 1,
				AggregateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregation_Value(), this.getExpression(), null, "value", null, 0, 1, Aggregation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregation_Op(), this.getSymbol(), null, "op", null, 0, 1, Aggregation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(forallEClass, Forall.class, "Forall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForall_Body(), this.getExpression(), null, "body", null, 0, 1, Forall.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeReference_ForceObjectType(), ecorePackage.getEBoolean(), "forceObjectType", null, 0, 1,
				TypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTypeReference_Type(), this.getSymbol(), null, "type", null, 0, 1, TypeReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infinityLiteralEClass, InfinityLiteral.class, "InfinityLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_LowerBound(), this.getExpression(), null, "lowerBound", null, 0, 1, Interval.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_UpperBound(), this.getExpression(), null, "upperBound", null, 0, 1, Interval.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functorEClass, Functor.class, "Functor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctor_Parameters(), this.getVariable(), null, "parameters", null, 0, -1, Functor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseRelationEClass, BaseRelation.class, "BaseRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_ResultType(), this.getDatatype(), null, "resultType", null, 0, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Named(), ecorePackage.getEBoolean(), "named", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractAssertionEClass, AbstractAssertion.class, "AbstractAssertion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAssertion_Expression(), this.getExpression(), null, "expression", null, 0, 1,
				AbstractAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAssertion_Range(), this.getExpression(), null, "range", null, 0, 1,
				AbstractAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functorDefinitonEClass, FunctorDefiniton.class, "FunctorDefiniton", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctorDefiniton_Head(), this.getExpression(), null, "head", null, 0, 1,
				FunctorDefiniton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctorDefiniton_Body(), this.getExpression(), null, "body", null, 0, 1,
				FunctorDefiniton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateDefinitionEClass, PredicateDefinition.class, "PredicateDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionDefinition_ResultType(), this.getSymbol(), null, "resultType", null, 0, 1,
				FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Target(), this.getSymbol(), null, "target", null, 0, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Kind(), this.getAttributeKind(), "kind", null, 0, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externDeclarationEClass, ExternDeclaration.class, "ExternDeclaration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ExternDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(externFunctorDeclarationEClass, ExternFunctorDeclaration.class, "ExternFunctorDeclaration",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternFunctorDeclaration_ArgumentList(), this.getArgumentList(), null, "argumentList", null,
				0, 1, ExternFunctorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externPredicateDeclarationEClass, ExternPredicateDeclaration.class, "ExternPredicateDeclaration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externFunctionDeclarationEClass, ExternFunctionDeclaration.class, "ExternFunctionDeclaration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternFunctionDeclaration_ResultType(), this.getSymbol(), null, "resultType", null, 0, 1,
				ExternFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externAggregationOperatorDeclarationEClass, ExternAggregationOperatorDeclaration.class,
				"ExternAggregationOperatorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternAggregationOperatorDeclaration_ArgumentType(), this.getSymbol(), null, "argumentType",
				null, 0, 1, ExternAggregationOperatorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternAggregationOperatorDeclaration_ResultType(), this.getSymbol(), null, "resultType", null,
				0, 1, ExternAggregationOperatorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externDatatypeDeclarationEClass, ExternDatatypeDeclaration.class, "ExternDatatypeDeclaration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDeclaration_Fields(), this.getField(), null, "fields", null, 0, -1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDeclaration_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getClassDeclaration_Supertypes(), this.getSymbol(), null, "supertypes", null, 0, -1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDeclaration_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enumDeclarationEClass, EnumDeclaration.class, "EnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumDeclaration_Literals(), this.getEnumLiteral(), null, "literals", null, 0, -1,
				EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Containment(), ecorePackage.getEBoolean(), "containment", null, 0, 1, Field.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_CrossReference(), ecorePackage.getEBoolean(), "crossReference", null, 0, 1, Field.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Opposite(), this.getSymbol(), null, "opposite", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getField_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, Field.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getSymbol(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultAssertionEClass, DefaultAssertion.class, "DefaultAssertion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(unboundedMultiplicityEClass, UnboundedMultiplicity.class, "UnboundedMultiplicity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exactMultiplicityEClass, ExactMultiplicity.class, "ExactMultiplicity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExactMultiplicity_Value(), ecorePackage.getEInt(), "value", null, 0, 1,
				ExactMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(boundedMultiplicityEClass, BoundedMultiplicity.class, "BoundedMultiplicity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedMultiplicity_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1,
				BoundedMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedMultiplicity_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1,
				BoundedMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlinePredicateAttrributesEClass, InlinePredicateAttrributes.class, "InlinePredicateAttrributes",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInlinePredicateAttrributes_Error(), ecorePackage.getEBoolean(), "error", null, 0, 1,
				InlinePredicateAttrributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlinePredicateAttrributes_Functional(), ecorePackage.getEBoolean(), "functional", null, 0, 1,
				InlinePredicateAttrributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationOperatorEClass, AggregationOperator.class, "AggregationOperator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregationOperator_ArgumentType(), this.getDatatype(), null, "argumentType", null, 0, 1,
				AggregationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregationOperator_ResultType(), this.getDatatype(), null, "resultType", null, 0, 1,
				AggregationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemEClass, Problem.class, "Problem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProblem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Problem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblem_Statements(), this.getStatement(), null, "statements", null, 0, -1, Problem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblem_Symbols(), this.getSymbol(), null, "symbols", null, 0, -1, Problem.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProblem_Imports(), this.getImport(), null, "imports", null, 0, -1, Problem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedStarArgumentEClass, TypedStarArgument.class, "TypedStarArgument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedVariableArgumentEClass, TypedVariableArgument.class, "TypedVariableArgument", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedVariableArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				TypedVariableArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unnamedErrorPredicateDefintionEClass, UnnamedErrorPredicateDefintion.class,
				"UnnamedErrorPredicateDefintion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnnamedErrorPredicateDefintion_ArgumentList(), this.getArgumentList(), null, "argumentList",
				null, 0, 1, UnnamedErrorPredicateDefintion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnnamedErrorPredicateDefintion_Body(), this.getExpression(), null, "body", null, 0, 1,
				UnnamedErrorPredicateDefintion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveDeclarationEClass, ObjectiveDeclaration.class, "ObjectiveDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveDeclaration_Kind(), this.getObjectiveKind(), "kind", null, 0, 1,
				ObjectiveDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectiveDeclaration_Objective(), this.getExpression(), null, "objective", null, 0, 1,
				ObjectiveDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeDeclarationEClass, ScopeDeclaration.class, "ScopeDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeDeclaration_Type(), this.getSymbol(), null, "type", null, 0, 1, ScopeDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exactScopeEClass, ExactScope.class, "ExactScope", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExactScope_Size(), ecorePackage.getEInt(), "size", null, 0, 1, ExactScope.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedScopeEClass, BoundedScope.class, "BoundedScope", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedScope_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1,
				BoundedScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedScope_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1,
				BoundedScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(lowerBoundedScopeEClass, LowerBoundedScope.class, "LowerBoundedScope", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLowerBoundedScope_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1,
				LowerBoundedScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(namespaceImportEClass, NamespaceImport.class, "NamespaceImport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0,
				1, NamespaceImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Import.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriImportEClass, UriImport.class, "UriImport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUriImport_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, UriImport.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NOT);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.PLUS);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.MINUS);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.MAYBE);

		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.PLUS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MINUS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MULTIPLY);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.DIVIDE);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.POW);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.IN);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.EQUALS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.NOT_EQUALS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.LESS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.LESS_EQUALS);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.GREATER);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.GREATER_EQUALS);

		initEEnum(logicValueEEnum, LogicValue.class, "LogicValue");
		addEEnumLiteral(logicValueEEnum, LogicValue.UNKNOWN);
		addEEnumLiteral(logicValueEEnum, LogicValue.FALSE);
		addEEnumLiteral(logicValueEEnum, LogicValue.TRUE);
		addEEnumLiteral(logicValueEEnum, LogicValue.ERROR);

		initEEnum(objectiveKindEEnum, ObjectiveKind.class, "ObjectiveKind");
		addEEnumLiteral(objectiveKindEEnum, ObjectiveKind.MINIMIZATION);
		addEEnumLiteral(objectiveKindEEnum, ObjectiveKind.MAXIMIZATION);

		initEEnum(attributeKindEEnum, AttributeKind.class, "AttributeKind");
		addEEnumLiteral(attributeKindEEnum, AttributeKind.FUNCTIONAL);
		addEEnumLiteral(attributeKindEEnum, AttributeKind.ERROR);
		addEEnumLiteral(attributeKindEEnum, AttributeKind.ROOT);
		addEEnumLiteral(attributeKindEEnum, AttributeKind.CONTAINMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverLanguagePackageImpl
