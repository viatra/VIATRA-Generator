/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.viatra.solver.language.solverLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage
 * @generated
 */
public class SolverLanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SolverLanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverLanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = SolverLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SolverLanguagePackage.PATH_COMPONENT: {
			PathComponent pathComponent = (PathComponent) theEObject;
			T result = casePathComponent(pathComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.SYMBOL: {
			Symbol symbol = (Symbol) theEObject;
			T result = caseSymbol(symbol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.CALL: {
			Call call = (Call) theEObject;
			T result = caseCall(call);
			if (result == null)
				result = caseExpression(call);
			if (result == null)
				result = caseStatement(call);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.REFERENCE: {
			Reference reference = (Reference) theEObject;
			T result = caseReference(reference);
			if (result == null)
				result = caseExpression(reference);
			if (result == null)
				result = caseStatement(reference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseStatement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.ARGUMENT: {
			Argument argument = (Argument) theEObject;
			T result = caseArgument(argument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.ARGUMENT_LIST: {
			ArgumentList argumentList = (ArgumentList) theEObject;
			T result = caseArgumentList(argumentList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXPRESSION_ARGUMENT: {
			ExpressionArgument expressionArgument = (ExpressionArgument) theEObject;
			T result = caseExpressionArgument(expressionArgument);
			if (result == null)
				result = caseArgument(expressionArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.STAR_ARGUMENT: {
			StarArgument starArgument = (StarArgument) theEObject;
			T result = caseStarArgument(starArgument);
			if (result == null)
				result = caseArgument(starArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.TYPED_ARGUMENT: {
			TypedArgument typedArgument = (TypedArgument) theEObject;
			T result = caseTypedArgument(typedArgument);
			if (result == null)
				result = caseArgument(typedArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.MULTIARY_EXPESSION: {
			MultiaryExpession multiaryExpession = (MultiaryExpession) theEObject;
			T result = caseMultiaryExpession(multiaryExpession);
			if (result == null)
				result = caseExpression(multiaryExpession);
			if (result == null)
				result = caseStatement(multiaryExpession);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseSymbol(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.UNARY_EXPRESSION: {
			UnaryExpression unaryExpression = (UnaryExpression) theEObject;
			T result = caseUnaryExpression(unaryExpression);
			if (result == null)
				result = caseExpression(unaryExpression);
			if (result == null)
				result = caseStatement(unaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.BINARY_EXPRESSION: {
			BinaryExpression binaryExpression = (BinaryExpression) theEObject;
			T result = caseBinaryExpression(binaryExpression);
			if (result == null)
				result = caseExpression(binaryExpression);
			if (result == null)
				result = caseStatement(binaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.DISJUNCTION: {
			Disjunction disjunction = (Disjunction) theEObject;
			T result = caseDisjunction(disjunction);
			if (result == null)
				result = caseMultiaryExpession(disjunction);
			if (result == null)
				result = caseExpression(disjunction);
			if (result == null)
				result = caseStatement(disjunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.CONJUNCTION: {
			Conjunction conjunction = (Conjunction) theEObject;
			T result = caseConjunction(conjunction);
			if (result == null)
				result = caseMultiaryExpession(conjunction);
			if (result == null)
				result = caseExpression(conjunction);
			if (result == null)
				result = caseStatement(conjunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.CONDITIONAL_EXPRESSION: {
			ConditionalExpression conditionalExpression = (ConditionalExpression) theEObject;
			T result = caseConditionalExpression(conditionalExpression);
			if (result == null)
				result = caseExpression(conditionalExpression);
			if (result == null)
				result = caseStatement(conditionalExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.SWITCH: {
			org.eclipse.viatra.solver.language.solverLanguage.Switch switch_ = (org.eclipse.viatra.solver.language.solverLanguage.Switch) theEObject;
			T result = caseSwitch(switch_);
			if (result == null)
				result = caseExpression(switch_);
			if (result == null)
				result = caseStatement(switch_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.CASE: {
			Case case_ = (Case) theEObject;
			T result = caseCase(case_);
			if (result == null)
				result = caseExpression(case_);
			if (result == null)
				result = caseStatement(case_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.LET_EXPRESSION: {
			LetExpression letExpression = (LetExpression) theEObject;
			T result = caseLetExpression(letExpression);
			if (result == null)
				result = caseExpression(letExpression);
			if (result == null)
				result = caseStatement(letExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.LET_BINDING: {
			LetBinding letBinding = (LetBinding) theEObject;
			T result = caseLetBinding(letBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseExpression(literal);
			if (result == null)
				result = caseStatement(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.INT_LITERAL: {
			IntLiteral intLiteral = (IntLiteral) theEObject;
			T result = caseIntLiteral(intLiteral);
			if (result == null)
				result = caseLiteral(intLiteral);
			if (result == null)
				result = caseExpression(intLiteral);
			if (result == null)
				result = caseStatement(intLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.REAL_LITERAL: {
			RealLiteral realLiteral = (RealLiteral) theEObject;
			T result = caseRealLiteral(realLiteral);
			if (result == null)
				result = caseLiteral(realLiteral);
			if (result == null)
				result = caseExpression(realLiteral);
			if (result == null)
				result = caseStatement(realLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.STRING_LITERAL: {
			StringLiteral stringLiteral = (StringLiteral) theEObject;
			T result = caseStringLiteral(stringLiteral);
			if (result == null)
				result = caseLiteral(stringLiteral);
			if (result == null)
				result = caseExpression(stringLiteral);
			if (result == null)
				result = caseStatement(stringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.LOGIC_LITERAL: {
			LogicLiteral logicLiteral = (LogicLiteral) theEObject;
			T result = caseLogicLiteral(logicLiteral);
			if (result == null)
				result = caseLiteral(logicLiteral);
			if (result == null)
				result = caseExpression(logicLiteral);
			if (result == null)
				result = caseStatement(logicLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EMPTY_LITERAL: {
			EmptyLiteral emptyLiteral = (EmptyLiteral) theEObject;
			T result = caseEmptyLiteral(emptyLiteral);
			if (result == null)
				result = caseLiteral(emptyLiteral);
			if (result == null)
				result = caseExpression(emptyLiteral);
			if (result == null)
				result = caseStatement(emptyLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.CAST_EXPRESSION: {
			CastExpression castExpression = (CastExpression) theEObject;
			T result = caseCastExpression(castExpression);
			if (result == null)
				result = caseExpression(castExpression);
			if (result == null)
				result = caseStatement(castExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.AGGREGATE_EXPRESSION: {
			AggregateExpression aggregateExpression = (AggregateExpression) theEObject;
			T result = caseAggregateExpression(aggregateExpression);
			if (result == null)
				result = caseExpression(aggregateExpression);
			if (result == null)
				result = caseStatement(aggregateExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.COUNT: {
			Count count = (Count) theEObject;
			T result = caseCount(count);
			if (result == null)
				result = caseAggregateExpression(count);
			if (result == null)
				result = caseExpression(count);
			if (result == null)
				result = caseStatement(count);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.AGGREGATION: {
			Aggregation aggregation = (Aggregation) theEObject;
			T result = caseAggregation(aggregation);
			if (result == null)
				result = caseAggregateExpression(aggregation);
			if (result == null)
				result = caseExpression(aggregation);
			if (result == null)
				result = caseStatement(aggregation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.FORALL: {
			Forall forall = (Forall) theEObject;
			T result = caseForall(forall);
			if (result == null)
				result = caseAggregateExpression(forall);
			if (result == null)
				result = caseExpression(forall);
			if (result == null)
				result = caseStatement(forall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.TYPE_REFERENCE: {
			TypeReference typeReference = (TypeReference) theEObject;
			T result = caseTypeReference(typeReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.INFINITY_LITERAL: {
			InfinityLiteral infinityLiteral = (InfinityLiteral) theEObject;
			T result = caseInfinityLiteral(infinityLiteral);
			if (result == null)
				result = caseLiteral(infinityLiteral);
			if (result == null)
				result = caseExpression(infinityLiteral);
			if (result == null)
				result = caseStatement(infinityLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.INTERVAL: {
			Interval interval = (Interval) theEObject;
			T result = caseInterval(interval);
			if (result == null)
				result = caseExpression(interval);
			if (result == null)
				result = caseStatement(interval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.FUNCTOR: {
			Functor functor = (Functor) theEObject;
			T result = caseFunctor(functor);
			if (result == null)
				result = caseSymbol(functor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = caseFunctor(relation);
			if (result == null)
				result = caseSymbol(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.BASE_RELATION: {
			BaseRelation baseRelation = (BaseRelation) theEObject;
			T result = caseBaseRelation(baseRelation);
			if (result == null)
				result = caseRelation(baseRelation);
			if (result == null)
				result = caseFunctor(baseRelation);
			if (result == null)
				result = caseSymbol(baseRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.PREDICATE: {
			Predicate predicate = (Predicate) theEObject;
			T result = casePredicate(predicate);
			if (result == null)
				result = caseRelation(predicate);
			if (result == null)
				result = caseFunctor(predicate);
			if (result == null)
				result = caseSymbol(predicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.DATATYPE: {
			Datatype datatype = (Datatype) theEObject;
			T result = caseDatatype(datatype);
			if (result == null)
				result = caseRelation(datatype);
			if (result == null)
				result = caseFunctor(datatype);
			if (result == null)
				result = caseSymbol(datatype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = caseFunctor(function);
			if (result == null)
				result = caseSymbol(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.METRIC: {
			Metric metric = (Metric) theEObject;
			T result = caseMetric(metric);
			if (result == null)
				result = caseFunction(metric);
			if (result == null)
				result = caseFunctor(metric);
			if (result == null)
				result = caseSymbol(metric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.OPERATOR: {
			Operator operator = (Operator) theEObject;
			T result = caseOperator(operator);
			if (result == null)
				result = caseFunction(operator);
			if (result == null)
				result = caseFunctor(operator);
			if (result == null)
				result = caseSymbol(operator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseSymbol(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.ABSTRACT_ASSERTION: {
			AbstractAssertion abstractAssertion = (AbstractAssertion) theEObject;
			T result = caseAbstractAssertion(abstractAssertion);
			if (result == null)
				result = caseStatement(abstractAssertion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.FUNCTOR_DEFINITON: {
			FunctorDefiniton functorDefiniton = (FunctorDefiniton) theEObject;
			T result = caseFunctorDefiniton(functorDefiniton);
			if (result == null)
				result = caseStatement(functorDefiniton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.PREDICATE_DEFINITION: {
			PredicateDefinition predicateDefinition = (PredicateDefinition) theEObject;
			T result = casePredicateDefinition(predicateDefinition);
			if (result == null)
				result = caseFunctorDefiniton(predicateDefinition);
			if (result == null)
				result = caseInlinePredicateAttrributes(predicateDefinition);
			if (result == null)
				result = caseStatement(predicateDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.FUNCTION_DEFINITION: {
			FunctionDefinition functionDefinition = (FunctionDefinition) theEObject;
			T result = caseFunctionDefinition(functionDefinition);
			if (result == null)
				result = caseFunctorDefiniton(functionDefinition);
			if (result == null)
				result = caseStatement(functionDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = caseStatement(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXTERN_DECLARATION: {
			ExternDeclaration externDeclaration = (ExternDeclaration) theEObject;
			T result = caseExternDeclaration(externDeclaration);
			if (result == null)
				result = caseStatement(externDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION: {
			ExternFunctorDeclaration externFunctorDeclaration = (ExternFunctorDeclaration) theEObject;
			T result = caseExternFunctorDeclaration(externFunctorDeclaration);
			if (result == null)
				result = caseExternDeclaration(externFunctorDeclaration);
			if (result == null)
				result = caseStatement(externFunctorDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXTERN_PREDICATE_DECLARATION: {
			ExternPredicateDeclaration externPredicateDeclaration = (ExternPredicateDeclaration) theEObject;
			T result = caseExternPredicateDeclaration(externPredicateDeclaration);
			if (result == null)
				result = caseExternFunctorDeclaration(externPredicateDeclaration);
			if (result == null)
				result = caseInlinePredicateAttrributes(externPredicateDeclaration);
			if (result == null)
				result = caseExternDeclaration(externPredicateDeclaration);
			if (result == null)
				result = caseStatement(externPredicateDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXTERN_FUNCTION_DECLARATION: {
			ExternFunctionDeclaration externFunctionDeclaration = (ExternFunctionDeclaration) theEObject;
			T result = caseExternFunctionDeclaration(externFunctionDeclaration);
			if (result == null)
				result = caseExternFunctorDeclaration(externFunctionDeclaration);
			if (result == null)
				result = caseExternDeclaration(externFunctionDeclaration);
			if (result == null)
				result = caseStatement(externFunctionDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION: {
			ExternAggregationOperatorDeclaration externAggregationOperatorDeclaration = (ExternAggregationOperatorDeclaration) theEObject;
			T result = caseExternAggregationOperatorDeclaration(externAggregationOperatorDeclaration);
			if (result == null)
				result = caseExternDeclaration(externAggregationOperatorDeclaration);
			if (result == null)
				result = caseStatement(externAggregationOperatorDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXTERN_DATATYPE_DECLARATION: {
			ExternDatatypeDeclaration externDatatypeDeclaration = (ExternDatatypeDeclaration) theEObject;
			T result = caseExternDatatypeDeclaration(externDatatypeDeclaration);
			if (result == null)
				result = caseExternDeclaration(externDatatypeDeclaration);
			if (result == null)
				result = caseStatement(externDatatypeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.CLASS_DECLARATION: {
			ClassDeclaration classDeclaration = (ClassDeclaration) theEObject;
			T result = caseClassDeclaration(classDeclaration);
			if (result == null)
				result = caseStatement(classDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.ENUM_DECLARATION: {
			EnumDeclaration enumDeclaration = (EnumDeclaration) theEObject;
			T result = caseEnumDeclaration(enumDeclaration);
			if (result == null)
				result = caseStatement(enumDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.ENUM_LITERAL: {
			EnumLiteral enumLiteral = (EnumLiteral) theEObject;
			T result = caseEnumLiteral(enumLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.FIELD: {
			Field field = (Field) theEObject;
			T result = caseField(field);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.MULTIPLICITY: {
			Multiplicity multiplicity = (Multiplicity) theEObject;
			T result = caseMultiplicity(multiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.DEFAULT_ASSERTION: {
			DefaultAssertion defaultAssertion = (DefaultAssertion) theEObject;
			T result = caseDefaultAssertion(defaultAssertion);
			if (result == null)
				result = caseAbstractAssertion(defaultAssertion);
			if (result == null)
				result = caseStatement(defaultAssertion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.ASSERTION: {
			Assertion assertion = (Assertion) theEObject;
			T result = caseAssertion(assertion);
			if (result == null)
				result = caseAbstractAssertion(assertion);
			if (result == null)
				result = caseStatement(assertion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.UNBOUNDED_MULTIPLICITY: {
			UnboundedMultiplicity unboundedMultiplicity = (UnboundedMultiplicity) theEObject;
			T result = caseUnboundedMultiplicity(unboundedMultiplicity);
			if (result == null)
				result = caseMultiplicity(unboundedMultiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXACT_MULTIPLICITY: {
			ExactMultiplicity exactMultiplicity = (ExactMultiplicity) theEObject;
			T result = caseExactMultiplicity(exactMultiplicity);
			if (result == null)
				result = caseMultiplicity(exactMultiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.BOUNDED_MULTIPLICITY: {
			BoundedMultiplicity boundedMultiplicity = (BoundedMultiplicity) theEObject;
			T result = caseBoundedMultiplicity(boundedMultiplicity);
			if (result == null)
				result = caseMultiplicity(boundedMultiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.INLINE_PREDICATE_ATTRRIBUTES: {
			InlinePredicateAttrributes inlinePredicateAttrributes = (InlinePredicateAttrributes) theEObject;
			T result = caseInlinePredicateAttrributes(inlinePredicateAttrributes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.AGGREGATION_OPERATOR: {
			AggregationOperator aggregationOperator = (AggregationOperator) theEObject;
			T result = caseAggregationOperator(aggregationOperator);
			if (result == null)
				result = caseSymbol(aggregationOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.PROBLEM: {
			Problem problem = (Problem) theEObject;
			T result = caseProblem(problem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.TYPED_STAR_ARGUMENT: {
			TypedStarArgument typedStarArgument = (TypedStarArgument) theEObject;
			T result = caseTypedStarArgument(typedStarArgument);
			if (result == null)
				result = caseTypedArgument(typedStarArgument);
			if (result == null)
				result = caseArgument(typedStarArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.TYPED_VARIABLE_ARGUMENT: {
			TypedVariableArgument typedVariableArgument = (TypedVariableArgument) theEObject;
			T result = caseTypedVariableArgument(typedVariableArgument);
			if (result == null)
				result = caseTypedArgument(typedVariableArgument);
			if (result == null)
				result = caseArgument(typedVariableArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION: {
			UnnamedErrorPredicateDefintion unnamedErrorPredicateDefintion = (UnnamedErrorPredicateDefintion) theEObject;
			T result = caseUnnamedErrorPredicateDefintion(unnamedErrorPredicateDefintion);
			if (result == null)
				result = caseStatement(unnamedErrorPredicateDefintion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.OBJECTIVE_DECLARATION: {
			ObjectiveDeclaration objectiveDeclaration = (ObjectiveDeclaration) theEObject;
			T result = caseObjectiveDeclaration(objectiveDeclaration);
			if (result == null)
				result = caseStatement(objectiveDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.SCOPE_DECLARATION: {
			ScopeDeclaration scopeDeclaration = (ScopeDeclaration) theEObject;
			T result = caseScopeDeclaration(scopeDeclaration);
			if (result == null)
				result = caseStatement(scopeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.EXACT_SCOPE: {
			ExactScope exactScope = (ExactScope) theEObject;
			T result = caseExactScope(exactScope);
			if (result == null)
				result = caseScopeDeclaration(exactScope);
			if (result == null)
				result = caseStatement(exactScope);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.BOUNDED_SCOPE: {
			BoundedScope boundedScope = (BoundedScope) theEObject;
			T result = caseBoundedScope(boundedScope);
			if (result == null)
				result = caseScopeDeclaration(boundedScope);
			if (result == null)
				result = caseStatement(boundedScope);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.LOWER_BOUNDED_SCOPE: {
			LowerBoundedScope lowerBoundedScope = (LowerBoundedScope) theEObject;
			T result = caseLowerBoundedScope(lowerBoundedScope);
			if (result == null)
				result = caseScopeDeclaration(lowerBoundedScope);
			if (result == null)
				result = caseStatement(lowerBoundedScope);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.NAMESPACE_IMPORT: {
			NamespaceImport namespaceImport = (NamespaceImport) theEObject;
			T result = caseNamespaceImport(namespaceImport);
			if (result == null)
				result = caseImport(namespaceImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.IMPORT: {
			Import import_ = (Import) theEObject;
			T result = caseImport(import_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SolverLanguagePackage.URI_IMPORT: {
			UriImport uriImport = (UriImport) theEObject;
			T result = caseUriImport(uriImport);
			if (result == null)
				result = caseImport(uriImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathComponent(PathComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentList(ArgumentList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionArgument(ExpressionArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Star Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Star Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStarArgument(StarArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedArgument(TypedArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiary Expession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiary Expession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiaryExpession(MultiaryExpession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjunction(Disjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjunction(Conjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(org.eclipse.viatra.solver.language.solverLanguage.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetExpression(LetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetBinding(LetBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntLiteral(IntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealLiteral(RealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicLiteral(LogicLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyLiteral(EmptyLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression(CastExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExpression(AggregateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForall(Forall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infinity Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infinity Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfinityLiteral(InfinityLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctor(Functor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseRelation(BaseRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAssertion(AbstractAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functor Definiton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functor Definiton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctorDefiniton(FunctorDefiniton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateDefinition(PredicateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDefinition(FunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extern Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extern Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternDeclaration(ExternDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extern Functor Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extern Functor Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternFunctorDeclaration(ExternFunctorDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extern Predicate Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extern Predicate Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternPredicateDeclaration(ExternPredicateDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extern Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extern Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternFunctionDeclaration(ExternFunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extern Aggregation Operator Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extern Aggregation Operator Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternAggregationOperatorDeclaration(ExternAggregationOperatorDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extern Datatype Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extern Datatype Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternDatatypeDeclaration(ExternDatatypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclaration(ClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDeclaration(EnumDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicity(Multiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultAssertion(DefaultAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unbounded Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unbounded Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnboundedMultiplicity(UnboundedMultiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exact Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exact Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactMultiplicity(ExactMultiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedMultiplicity(BoundedMultiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Predicate Attrributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Predicate Attrributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlinePredicateAttrributes(InlinePredicateAttrributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationOperator(AggregationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblem(Problem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Star Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Star Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedStarArgument(TypedStarArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Variable Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Variable Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedVariableArgument(TypedVariableArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unnamed Error Predicate Defintion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unnamed Error Predicate Defintion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnnamedErrorPredicateDefintion(UnnamedErrorPredicateDefintion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveDeclaration(ObjectiveDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeDeclaration(ScopeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exact Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exact Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactScope(ExactScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedScope(BoundedScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Bounded Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Bounded Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerBoundedScope(LowerBoundedScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceImport(NamespaceImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriImport(UriImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SolverLanguageSwitch
