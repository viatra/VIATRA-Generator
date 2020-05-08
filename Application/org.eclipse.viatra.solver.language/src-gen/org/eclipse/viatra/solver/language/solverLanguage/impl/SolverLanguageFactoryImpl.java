/**
 * generated by Xtext 2.21.0
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
public class SolverLanguageFactoryImpl extends EFactoryImpl implements SolverLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SolverLanguageFactory init()
  {
    try
    {
      SolverLanguageFactory theSolverLanguageFactory = (SolverLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(SolverLanguagePackage.eNS_URI);
      if (theSolverLanguageFactory != null)
      {
        return theSolverLanguageFactory;
      }
    }
    catch (Exception exception)
    {
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
  public SolverLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SolverLanguagePackage.PROBLEM: return createProblem();
      case SolverLanguagePackage.STATEMENT: return createStatement();
      case SolverLanguagePackage.PREDICATE_DEFINITION: return createPredicateDefinition();
      case SolverLanguagePackage.UNNAMED_ERROR_PREDIATE_DEFINITION: return createUnnamedErrorPrediateDefinition();
      case SolverLanguagePackage.DEFAULT_DEFINITION: return createDefaultDefinition();
      case SolverLanguagePackage.EXTERN_PREDICATE_DEFINITION: return createExternPredicateDefinition();
      case SolverLanguagePackage.METRIC_DEFINITION: return createMetricDefinition();
      case SolverLanguagePackage.EXTERN_METRIC_DEFINITION: return createExternMetricDefinition();
      case SolverLanguagePackage.EXPRESSION: return createExpression();
      case SolverLanguagePackage.IF_ELSE: return createIfElse();
      case SolverLanguagePackage.CASE: return createCase();
      case SolverLanguagePackage.COUNT: return createCount();
      case SolverLanguagePackage.AGGREGATION: return createAggregation();
      case SolverLanguagePackage.CALL: return createCall();
      case SolverLanguagePackage.ARGUMENT_LIST: return createArgumentList();
      case SolverLanguagePackage.ARGUMENT: return createArgument();
      case SolverLanguagePackage.EXPRESSION_ARGUMENT: return createExpressionArgument();
      case SolverLanguagePackage.STAR_ARGUMENT: return createStarArgument();
      case SolverLanguagePackage.TYPED_ARGUMENT: return createTypedArgument();
      case SolverLanguagePackage.TYPED_STAR_ARGUMENT: return createTypedStarArgument();
      case SolverLanguagePackage.REFERENCE: return createReference();
      case SolverLanguagePackage.INTERVAL: return createInterval();
      case SolverLanguagePackage.LITERAL: return createLiteral();
      case SolverLanguagePackage.LOGIC_LITERAL: return createLogicLiteral();
      case SolverLanguagePackage.NUMERIC_LITERAL: return createNumericLiteral();
      case SolverLanguagePackage.INFINITY_LITERAL: return createInfinityLiteral();
      case SolverLanguagePackage.EMPTY_INTERVAL_LITERAL: return createEmptyIntervalLiteral();
      case SolverLanguagePackage.STRING_LITERAL: return createStringLiteral();
      case SolverLanguagePackage.CLASS_DEFINITION: return createClassDefinition();
      case SolverLanguagePackage.MEMBER_DEFINITION: return createMemberDefinition();
      case SolverLanguagePackage.MULTIPLICITY: return createMultiplicity();
      case SolverLanguagePackage.MANY_MULTIPLICITY: return createManyMultiplicity();
      case SolverLanguagePackage.EXACT_MULTIPLICITY: return createExactMultiplicity();
      case SolverLanguagePackage.BOUNDED_MULTIPLICITY: return createBoundedMultiplicity();
      case SolverLanguagePackage.SCOPE_DEFINITION: return createScopeDefinition();
      case SolverLanguagePackage.EXACT_SCOPE_DEFINITION: return createExactScopeDefinition();
      case SolverLanguagePackage.BOUNDED_SCOPE_DEFINITION: return createBoundedScopeDefinition();
      case SolverLanguagePackage.LOWER_BOUNDED_SCOPE_DEFINITION: return createLowerBoundedScopeDefinition();
      case SolverLanguagePackage.OBJECTIVE_DEFINITION: return createObjectiveDefinition();
      case SolverLanguagePackage.NAMED_ELEMENT: return createNamedElement();
      case SolverLanguagePackage.ASSERTION: return createAssertion();
      case SolverLanguagePackage.DISJUNCTION: return createDisjunction();
      case SolverLanguagePackage.SWITCH: return createSwitch();
      case SolverLanguagePackage.CONJUNCTION: return createConjunction();
      case SolverLanguagePackage.COMPARISON: return createComparison();
      case SolverLanguagePackage.BINARY_EXPRESSION: return createBinaryExpression();
      case SolverLanguagePackage.UNARY_EXPRESSION: return createUnaryExpression();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SolverLanguagePackage.METRIC_TYPE:
        return createMetricTypeFromString(eDataType, initialValue);
      case SolverLanguagePackage.BINARY_OPERATOR:
        return createBinaryOperatorFromString(eDataType, initialValue);
      case SolverLanguagePackage.UNARY_OP:
        return createUnaryOpFromString(eDataType, initialValue);
      case SolverLanguagePackage.AGGREGATION_OP:
        return createAggregationOpFromString(eDataType, initialValue);
      case SolverLanguagePackage.LOGIC_VALUE:
        return createLogicValueFromString(eDataType, initialValue);
      case SolverLanguagePackage.OBJECTIVE_KIND:
        return createObjectiveKindFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SolverLanguagePackage.METRIC_TYPE:
        return convertMetricTypeToString(eDataType, instanceValue);
      case SolverLanguagePackage.BINARY_OPERATOR:
        return convertBinaryOperatorToString(eDataType, instanceValue);
      case SolverLanguagePackage.UNARY_OP:
        return convertUnaryOpToString(eDataType, instanceValue);
      case SolverLanguagePackage.AGGREGATION_OP:
        return convertAggregationOpToString(eDataType, instanceValue);
      case SolverLanguagePackage.LOGIC_VALUE:
        return convertLogicValueToString(eDataType, instanceValue);
      case SolverLanguagePackage.OBJECTIVE_KIND:
        return convertObjectiveKindToString(eDataType, instanceValue);
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
  public Problem createProblem()
  {
    ProblemImpl problem = new ProblemImpl();
    return problem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PredicateDefinition createPredicateDefinition()
  {
    PredicateDefinitionImpl predicateDefinition = new PredicateDefinitionImpl();
    return predicateDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnnamedErrorPrediateDefinition createUnnamedErrorPrediateDefinition()
  {
    UnnamedErrorPrediateDefinitionImpl unnamedErrorPrediateDefinition = new UnnamedErrorPrediateDefinitionImpl();
    return unnamedErrorPrediateDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefaultDefinition createDefaultDefinition()
  {
    DefaultDefinitionImpl defaultDefinition = new DefaultDefinitionImpl();
    return defaultDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternPredicateDefinition createExternPredicateDefinition()
  {
    ExternPredicateDefinitionImpl externPredicateDefinition = new ExternPredicateDefinitionImpl();
    return externPredicateDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MetricDefinition createMetricDefinition()
  {
    MetricDefinitionImpl metricDefinition = new MetricDefinitionImpl();
    return metricDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternMetricDefinition createExternMetricDefinition()
  {
    ExternMetricDefinitionImpl externMetricDefinition = new ExternMetricDefinitionImpl();
    return externMetricDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfElse createIfElse()
  {
    IfElseImpl ifElse = new IfElseImpl();
    return ifElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Count createCount()
  {
    CountImpl count = new CountImpl();
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Aggregation createAggregation()
  {
    AggregationImpl aggregation = new AggregationImpl();
    return aggregation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArgumentList createArgumentList()
  {
    ArgumentListImpl argumentList = new ArgumentListImpl();
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionArgument createExpressionArgument()
  {
    ExpressionArgumentImpl expressionArgument = new ExpressionArgumentImpl();
    return expressionArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StarArgument createStarArgument()
  {
    StarArgumentImpl starArgument = new StarArgumentImpl();
    return starArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypedArgument createTypedArgument()
  {
    TypedArgumentImpl typedArgument = new TypedArgumentImpl();
    return typedArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypedStarArgument createTypedStarArgument()
  {
    TypedStarArgumentImpl typedStarArgument = new TypedStarArgumentImpl();
    return typedStarArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Interval createInterval()
  {
    IntervalImpl interval = new IntervalImpl();
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicLiteral createLogicLiteral()
  {
    LogicLiteralImpl logicLiteral = new LogicLiteralImpl();
    return logicLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfinityLiteral createInfinityLiteral()
  {
    InfinityLiteralImpl infinityLiteral = new InfinityLiteralImpl();
    return infinityLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EmptyIntervalLiteral createEmptyIntervalLiteral()
  {
    EmptyIntervalLiteralImpl emptyIntervalLiteral = new EmptyIntervalLiteralImpl();
    return emptyIntervalLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassDefinition createClassDefinition()
  {
    ClassDefinitionImpl classDefinition = new ClassDefinitionImpl();
    return classDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemberDefinition createMemberDefinition()
  {
    MemberDefinitionImpl memberDefinition = new MemberDefinitionImpl();
    return memberDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ManyMultiplicity createManyMultiplicity()
  {
    ManyMultiplicityImpl manyMultiplicity = new ManyMultiplicityImpl();
    return manyMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExactMultiplicity createExactMultiplicity()
  {
    ExactMultiplicityImpl exactMultiplicity = new ExactMultiplicityImpl();
    return exactMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoundedMultiplicity createBoundedMultiplicity()
  {
    BoundedMultiplicityImpl boundedMultiplicity = new BoundedMultiplicityImpl();
    return boundedMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScopeDefinition createScopeDefinition()
  {
    ScopeDefinitionImpl scopeDefinition = new ScopeDefinitionImpl();
    return scopeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExactScopeDefinition createExactScopeDefinition()
  {
    ExactScopeDefinitionImpl exactScopeDefinition = new ExactScopeDefinitionImpl();
    return exactScopeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoundedScopeDefinition createBoundedScopeDefinition()
  {
    BoundedScopeDefinitionImpl boundedScopeDefinition = new BoundedScopeDefinitionImpl();
    return boundedScopeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LowerBoundedScopeDefinition createLowerBoundedScopeDefinition()
  {
    LowerBoundedScopeDefinitionImpl lowerBoundedScopeDefinition = new LowerBoundedScopeDefinitionImpl();
    return lowerBoundedScopeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectiveDefinition createObjectiveDefinition()
  {
    ObjectiveDefinitionImpl objectiveDefinition = new ObjectiveDefinitionImpl();
    return objectiveDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement createNamedElement()
  {
    NamedElementImpl namedElement = new NamedElementImpl();
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Disjunction createDisjunction()
  {
    DisjunctionImpl disjunction = new DisjunctionImpl();
    return disjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricType createMetricTypeFromString(EDataType eDataType, String initialValue)
  {
    MetricType result = MetricType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMetricTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryOperator result = BinaryOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOp createUnaryOpFromString(EDataType eDataType, String initialValue)
  {
    UnaryOp result = UnaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregationOp createAggregationOpFromString(EDataType eDataType, String initialValue)
  {
    AggregationOp result = AggregationOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAggregationOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicValue createLogicValueFromString(EDataType eDataType, String initialValue)
  {
    LogicValue result = LogicValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectiveKind createObjectiveKindFromString(EDataType eDataType, String initialValue)
  {
    ObjectiveKind result = ObjectiveKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertObjectiveKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SolverLanguagePackage getSolverLanguagePackage()
  {
    return (SolverLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SolverLanguagePackage getPackage()
  {
    return SolverLanguagePackage.eINSTANCE;
  }

} //SolverLanguageFactoryImpl
