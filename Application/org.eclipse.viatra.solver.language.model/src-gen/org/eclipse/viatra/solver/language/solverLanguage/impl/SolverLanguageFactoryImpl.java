/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.viatra.solver.language.solverLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverLanguageFactoryImpl extends EFactoryImpl implements SolverLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolverLanguageFactory init() {
		try {
			SolverLanguageFactory theSolverLanguageFactory = (SolverLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(SolverLanguagePackage.eNS_URI);
			if (theSolverLanguageFactory != null) {
				return theSolverLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SolverLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SolverLanguagePackage.PATH_COMPONENT:
			return createPathComponent();
		case SolverLanguagePackage.CALL:
			return createCall();
		case SolverLanguagePackage.REFERENCE:
			return createReference();
		case SolverLanguagePackage.ARGUMENT_LIST:
			return createArgumentList();
		case SolverLanguagePackage.EXPRESSION_ARGUMENT:
			return createExpressionArgument();
		case SolverLanguagePackage.STAR_ARGUMENT:
			return createStarArgument();
		case SolverLanguagePackage.VARIABLE:
			return createVariable();
		case SolverLanguagePackage.UNARY_EXPRESSION:
			return createUnaryExpression();
		case SolverLanguagePackage.BINARY_EXPRESSION:
			return createBinaryExpression();
		case SolverLanguagePackage.DISJUNCTION:
			return createDisjunction();
		case SolverLanguagePackage.CONJUNCTION:
			return createConjunction();
		case SolverLanguagePackage.CONDITIONAL_EXPRESSION:
			return createConditionalExpression();
		case SolverLanguagePackage.SWITCH:
			return createSwitch();
		case SolverLanguagePackage.CASE:
			return createCase();
		case SolverLanguagePackage.LET_EXPRESSION:
			return createLetExpression();
		case SolverLanguagePackage.LET_BINDING:
			return createLetBinding();
		case SolverLanguagePackage.INT_LITERAL:
			return createIntLiteral();
		case SolverLanguagePackage.REAL_LITERAL:
			return createRealLiteral();
		case SolverLanguagePackage.STRING_LITERAL:
			return createStringLiteral();
		case SolverLanguagePackage.LOGIC_LITERAL:
			return createLogicLiteral();
		case SolverLanguagePackage.EMPTY_LITERAL:
			return createEmptyLiteral();
		case SolverLanguagePackage.CAST_EXPRESSION:
			return createCastExpression();
		case SolverLanguagePackage.COUNT:
			return createCount();
		case SolverLanguagePackage.AGGREGATION:
			return createAggregation();
		case SolverLanguagePackage.FORALL:
			return createForall();
		case SolverLanguagePackage.TYPE_REFERENCE:
			return createTypeReference();
		case SolverLanguagePackage.INFINITY_LITERAL:
			return createInfinityLiteral();
		case SolverLanguagePackage.INTERVAL:
			return createInterval();
		case SolverLanguagePackage.BASE_RELATION:
			return createBaseRelation();
		case SolverLanguagePackage.PREDICATE:
			return createPredicate();
		case SolverLanguagePackage.DATATYPE:
			return createDatatype();
		case SolverLanguagePackage.METRIC:
			return createMetric();
		case SolverLanguagePackage.OPERATOR:
			return createOperator();
		case SolverLanguagePackage.NODE:
			return createNode();
		case SolverLanguagePackage.PREDICATE_DEFINITION:
			return createPredicateDefinition();
		case SolverLanguagePackage.FUNCTION_DEFINITION:
			return createFunctionDefinition();
		case SolverLanguagePackage.EXTERN_PREDICATE_DECLARATION:
			return createExternPredicateDeclaration();
		case SolverLanguagePackage.EXTERN_FUNCTION_DECLARATION:
			return createExternFunctionDeclaration();
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION:
			return createExternAggregationOperatorDeclaration();
		case SolverLanguagePackage.EXTERN_DATATYPE_DECLARATION:
			return createExternDatatypeDeclaration();
		case SolverLanguagePackage.CLASS_DECLARATION:
			return createClassDeclaration();
		case SolverLanguagePackage.ENUM_DECLARATION:
			return createEnumDeclaration();
		case SolverLanguagePackage.ENUM_LITERAL:
			return createEnumLiteral();
		case SolverLanguagePackage.FIELD:
			return createField();
		case SolverLanguagePackage.DEFAULT_ASSERTION:
			return createDefaultAssertion();
		case SolverLanguagePackage.ASSERTION:
			return createAssertion();
		case SolverLanguagePackage.UNBOUNDED_MULTIPLICITY:
			return createUnboundedMultiplicity();
		case SolverLanguagePackage.EXACT_MULTIPLICITY:
			return createExactMultiplicity();
		case SolverLanguagePackage.BOUNDED_MULTIPLICITY:
			return createBoundedMultiplicity();
		case SolverLanguagePackage.AGGREGATION_OPERATOR:
			return createAggregationOperator();
		case SolverLanguagePackage.PROBLEM:
			return createProblem();
		case SolverLanguagePackage.TYPED_STAR_ARGUMENT:
			return createTypedStarArgument();
		case SolverLanguagePackage.TYPED_VARIABLE_ARGUMENT:
			return createTypedVariableArgument();
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION:
			return createUnnamedErrorPredicateDefintion();
		case SolverLanguagePackage.OBJECTIVE_DECLARATION:
			return createObjectiveDeclaration();
		case SolverLanguagePackage.SCOPE_DECLARATION:
			return createScopeDeclaration();
		case SolverLanguagePackage.EXACT_SCOPE:
			return createExactScope();
		case SolverLanguagePackage.BOUNDED_SCOPE:
			return createBoundedScope();
		case SolverLanguagePackage.LOWER_BOUNDED_SCOPE:
			return createLowerBoundedScope();
		case SolverLanguagePackage.NAMESPACE_IMPORT:
			return createNamespaceImport();
		case SolverLanguagePackage.IMPORT:
			return createImport();
		case SolverLanguagePackage.URI_IMPORT:
			return createUriImport();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SolverLanguagePackage.UNARY_OPERATOR:
			return createUnaryOperatorFromString(eDataType, initialValue);
		case SolverLanguagePackage.BINARY_OPERATOR:
			return createBinaryOperatorFromString(eDataType, initialValue);
		case SolverLanguagePackage.LOGIC_VALUE:
			return createLogicValueFromString(eDataType, initialValue);
		case SolverLanguagePackage.OBJECTIVE_KIND:
			return createObjectiveKindFromString(eDataType, initialValue);
		case SolverLanguagePackage.ATTRIBUTE_KIND:
			return createAttributeKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SolverLanguagePackage.UNARY_OPERATOR:
			return convertUnaryOperatorToString(eDataType, instanceValue);
		case SolverLanguagePackage.BINARY_OPERATOR:
			return convertBinaryOperatorToString(eDataType, instanceValue);
		case SolverLanguagePackage.LOGIC_VALUE:
			return convertLogicValueToString(eDataType, instanceValue);
		case SolverLanguagePackage.OBJECTIVE_KIND:
			return convertObjectiveKindToString(eDataType, instanceValue);
		case SolverLanguagePackage.ATTRIBUTE_KIND:
			return convertAttributeKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathComponent createPathComponent() {
		PathComponentImpl pathComponent = new PathComponentImpl();
		return pathComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentList createArgumentList() {
		ArgumentListImpl argumentList = new ArgumentListImpl();
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionArgument createExpressionArgument() {
		ExpressionArgumentImpl expressionArgument = new ExpressionArgumentImpl();
		return expressionArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StarArgument createStarArgument() {
		StarArgumentImpl starArgument = new StarArgumentImpl();
		return starArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjunction createConjunction() {
		ConjunctionImpl conjunction = new ConjunctionImpl();
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExpression createLetExpression() {
		LetExpressionImpl letExpression = new LetExpressionImpl();
		return letExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetBinding createLetBinding() {
		LetBindingImpl letBinding = new LetBindingImpl();
		return letBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntLiteral createIntLiteral() {
		IntLiteralImpl intLiteral = new IntLiteralImpl();
		return intLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealLiteral createRealLiteral() {
		RealLiteralImpl realLiteral = new RealLiteralImpl();
		return realLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicLiteral createLogicLiteral() {
		LogicLiteralImpl logicLiteral = new LogicLiteralImpl();
		return logicLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyLiteral createEmptyLiteral() {
		EmptyLiteralImpl emptyLiteral = new EmptyLiteralImpl();
		return emptyLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forall createForall() {
		ForallImpl forall = new ForallImpl();
		return forall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfinityLiteral createInfinityLiteral() {
		InfinityLiteralImpl infinityLiteral = new InfinityLiteralImpl();
		return infinityLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseRelation createBaseRelation() {
		BaseRelationImpl baseRelation = new BaseRelationImpl();
		return baseRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateDefinition createPredicateDefinition() {
		PredicateDefinitionImpl predicateDefinition = new PredicateDefinitionImpl();
		return predicateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition createFunctionDefinition() {
		FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternPredicateDeclaration createExternPredicateDeclaration() {
		ExternPredicateDeclarationImpl externPredicateDeclaration = new ExternPredicateDeclarationImpl();
		return externPredicateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternFunctionDeclaration createExternFunctionDeclaration() {
		ExternFunctionDeclarationImpl externFunctionDeclaration = new ExternFunctionDeclarationImpl();
		return externFunctionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternAggregationOperatorDeclaration createExternAggregationOperatorDeclaration() {
		ExternAggregationOperatorDeclarationImpl externAggregationOperatorDeclaration = new ExternAggregationOperatorDeclarationImpl();
		return externAggregationOperatorDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternDatatypeDeclaration createExternDatatypeDeclaration() {
		ExternDatatypeDeclarationImpl externDatatypeDeclaration = new ExternDatatypeDeclarationImpl();
		return externDatatypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration createClassDeclaration() {
		ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
		return classDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDeclaration createEnumDeclaration() {
		EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
		return enumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAssertion createDefaultAssertion() {
		DefaultAssertionImpl defaultAssertion = new DefaultAssertionImpl();
		return defaultAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnboundedMultiplicity createUnboundedMultiplicity() {
		UnboundedMultiplicityImpl unboundedMultiplicity = new UnboundedMultiplicityImpl();
		return unboundedMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactMultiplicity createExactMultiplicity() {
		ExactMultiplicityImpl exactMultiplicity = new ExactMultiplicityImpl();
		return exactMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedMultiplicity createBoundedMultiplicity() {
		BoundedMultiplicityImpl boundedMultiplicity = new BoundedMultiplicityImpl();
		return boundedMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationOperator createAggregationOperator() {
		AggregationOperatorImpl aggregationOperator = new AggregationOperatorImpl();
		return aggregationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem createProblem() {
		ProblemImpl problem = new ProblemImpl();
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedStarArgument createTypedStarArgument() {
		TypedStarArgumentImpl typedStarArgument = new TypedStarArgumentImpl();
		return typedStarArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariableArgument createTypedVariableArgument() {
		TypedVariableArgumentImpl typedVariableArgument = new TypedVariableArgumentImpl();
		return typedVariableArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnnamedErrorPredicateDefintion createUnnamedErrorPredicateDefintion() {
		UnnamedErrorPredicateDefintionImpl unnamedErrorPredicateDefintion = new UnnamedErrorPredicateDefintionImpl();
		return unnamedErrorPredicateDefintion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveDeclaration createObjectiveDeclaration() {
		ObjectiveDeclarationImpl objectiveDeclaration = new ObjectiveDeclarationImpl();
		return objectiveDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDeclaration createScopeDeclaration() {
		ScopeDeclarationImpl scopeDeclaration = new ScopeDeclarationImpl();
		return scopeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactScope createExactScope() {
		ExactScopeImpl exactScope = new ExactScopeImpl();
		return exactScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedScope createBoundedScope() {
		BoundedScopeImpl boundedScope = new BoundedScopeImpl();
		return boundedScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBoundedScope createLowerBoundedScope() {
		LowerBoundedScopeImpl lowerBoundedScope = new LowerBoundedScopeImpl();
		return lowerBoundedScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceImport createNamespaceImport() {
		NamespaceImportImpl namespaceImport = new NamespaceImportImpl();
		return namespaceImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriImport createUriImport() {
		UriImportImpl uriImport = new UriImportImpl();
		return uriImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicValue createLogicValueFromString(EDataType eDataType, String initialValue) {
		LogicValue result = LogicValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveKind createObjectiveKindFromString(EDataType eDataType, String initialValue) {
		ObjectiveKind result = ObjectiveKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectiveKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeKind createAttributeKindFromString(EDataType eDataType, String initialValue) {
		AttributeKind result = AttributeKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLanguagePackage getSolverLanguagePackage() {
		return (SolverLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SolverLanguagePackage getPackage() {
		return SolverLanguagePackage.eINSTANCE;
	}

} //SolverLanguageFactoryImpl
