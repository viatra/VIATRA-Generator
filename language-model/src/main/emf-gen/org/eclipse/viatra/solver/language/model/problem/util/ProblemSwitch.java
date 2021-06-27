/**
 */
package org.eclipse.viatra.solver.language.model.problem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.viatra.solver.language.model.problem.*;

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
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage
 * @generated
 */
public class ProblemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProblemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSwitch() {
		if (modelPackage == null) {
			modelPackage = ProblemPackage.eINSTANCE;
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
		case ProblemPackage.PROBLEM: {
			Problem problem = (Problem) theEObject;
			T result = caseProblem(problem);
			if (result == null)
				result = caseNamedElement(problem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = caseNamedElement(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.CLASS_DECLARATION: {
			ClassDeclaration classDeclaration = (ClassDeclaration) theEObject;
			T result = caseClassDeclaration(classDeclaration);
			if (result == null)
				result = caseRelation(classDeclaration);
			if (result == null)
				result = caseStatement(classDeclaration);
			if (result == null)
				result = caseNamedElement(classDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.REFERENCE_DECLARATION: {
			ReferenceDeclaration referenceDeclaration = (ReferenceDeclaration) theEObject;
			T result = caseReferenceDeclaration(referenceDeclaration);
			if (result == null)
				result = caseRelation(referenceDeclaration);
			if (result == null)
				result = caseNamedElement(referenceDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.PREDICATE_DEFINITION: {
			PredicateDefinition predicateDefinition = (PredicateDefinition) theEObject;
			T result = casePredicateDefinition(predicateDefinition);
			if (result == null)
				result = caseRelation(predicateDefinition);
			if (result == null)
				result = caseStatement(predicateDefinition);
			if (result == null)
				result = caseNamedElement(predicateDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseVariable(parameter);
			if (result == null)
				result = caseVariableOrNode(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseVariableOrNode(variable);
			if (result == null)
				result = caseNamedElement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.CONJUNCTION: {
			Conjunction conjunction = (Conjunction) theEObject;
			T result = caseConjunction(conjunction);
			if (result == null)
				result = caseExistentialQuantifier(conjunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.ATOM: {
			Atom atom = (Atom) theEObject;
			T result = caseAtom(atom);
			if (result == null)
				result = caseLiteral(atom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.IMPLICIT_VARIABLE: {
			ImplicitVariable implicitVariable = (ImplicitVariable) theEObject;
			T result = caseImplicitVariable(implicitVariable);
			if (result == null)
				result = caseVariable(implicitVariable);
			if (result == null)
				result = caseVariableOrNode(implicitVariable);
			if (result == null)
				result = caseNamedElement(implicitVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.NEGATIVE_LITERAL: {
			NegativeLiteral negativeLiteral = (NegativeLiteral) theEObject;
			T result = caseNegativeLiteral(negativeLiteral);
			if (result == null)
				result = caseExistentialQuantifier(negativeLiteral);
			if (result == null)
				result = caseLiteral(negativeLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.EXISTENTIAL_QUANTIFIER: {
			ExistentialQuantifier existentialQuantifier = (ExistentialQuantifier) theEObject;
			T result = caseExistentialQuantifier(existentialQuantifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.ASSERTION: {
			Assertion assertion = (Assertion) theEObject;
			T result = caseAssertion(assertion);
			if (result == null)
				result = caseStatement(assertion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseVariableOrNode(node);
			if (result == null)
				result = caseNamedElement(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.SCOPE_DECLARATION: {
			ScopeDeclaration scopeDeclaration = (ScopeDeclaration) theEObject;
			T result = caseScopeDeclaration(scopeDeclaration);
			if (result == null)
				result = caseStatement(scopeDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.TYPE_SCOPE: {
			TypeScope typeScope = (TypeScope) theEObject;
			T result = caseTypeScope(typeScope);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.MULTIPLICITY: {
			Multiplicity multiplicity = (Multiplicity) theEObject;
			T result = caseMultiplicity(multiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.RANGE_MULTIPLICITY: {
			RangeMultiplicity rangeMultiplicity = (RangeMultiplicity) theEObject;
			T result = caseRangeMultiplicity(rangeMultiplicity);
			if (result == null)
				result = caseMultiplicity(rangeMultiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.EXACT_MULTIPLICITY: {
			ExactMultiplicity exactMultiplicity = (ExactMultiplicity) theEObject;
			T result = caseExactMultiplicity(exactMultiplicity);
			if (result == null)
				result = caseMultiplicity(exactMultiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.UNBOUNDED_MULTIPLICITY: {
			UnboundedMultiplicity unboundedMultiplicity = (UnboundedMultiplicity) theEObject;
			T result = caseUnboundedMultiplicity(unboundedMultiplicity);
			if (result == null)
				result = caseMultiplicity(unboundedMultiplicity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.ARGUMENT: {
			Argument argument = (Argument) theEObject;
			T result = caseArgument(argument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.ENUM_DECLARATION: {
			EnumDeclaration enumDeclaration = (EnumDeclaration) theEObject;
			T result = caseEnumDeclaration(enumDeclaration);
			if (result == null)
				result = caseRelation(enumDeclaration);
			if (result == null)
				result = caseStatement(enumDeclaration);
			if (result == null)
				result = caseNamedElement(enumDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProblemPackage.VARIABLE_OR_NODE: {
			VariableOrNode variableOrNode = (VariableOrNode) theEObject;
			T result = caseVariableOrNode(variableOrNode);
			if (result == null)
				result = caseNamedElement(variableOrNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Reference Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceDeclaration(ReferenceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitVariable(ImplicitVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeLiteral(NegativeLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existential Quantifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existential Quantifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistentialQuantifier(ExistentialQuantifier object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeScope(TypeScope object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Range Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeMultiplicity(RangeMultiplicity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Variable Or Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Or Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableOrNode(VariableOrNode object) {
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

} //ProblemSwitch
