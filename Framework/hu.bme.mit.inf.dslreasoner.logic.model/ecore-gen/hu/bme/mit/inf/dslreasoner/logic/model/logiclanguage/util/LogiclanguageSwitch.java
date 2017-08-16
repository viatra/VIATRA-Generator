/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.util;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
 * @generated
 */
public class LogiclanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogiclanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogiclanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = LogiclanguagePackage.eINSTANCE;
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
			case LogiclanguagePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseTypeDescriptor(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.DEFINED_ELEMENT: {
				DefinedElement definedElement = (DefinedElement)theEObject;
				T result = caseDefinedElement(definedElement);
				if (result == null) result = caseSymbolicDeclaration(definedElement);
				if (result == null) result = caseTermDescription(definedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseType(typeDefinition);
				if (result == null) result = caseTypeDescriptor(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseTypeDescriptor(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.COMPLEX_TYPE_REFERENCE: {
				ComplexTypeReference complexTypeReference = (ComplexTypeReference)theEObject;
				T result = caseComplexTypeReference(complexTypeReference);
				if (result == null) result = caseTypeReference(complexTypeReference);
				if (result == null) result = caseTypeDescriptor(complexTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.PRIMITIVE_TYPE_REFERENCE: {
				PrimitiveTypeReference primitiveTypeReference = (PrimitiveTypeReference)theEObject;
				T result = casePrimitiveTypeReference(primitiveTypeReference);
				if (result == null) result = caseTypeReference(primitiveTypeReference);
				if (result == null) result = caseTypeDescriptor(primitiveTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.INT_TYPE_REFERENCE: {
				IntTypeReference intTypeReference = (IntTypeReference)theEObject;
				T result = caseIntTypeReference(intTypeReference);
				if (result == null) result = casePrimitiveTypeReference(intTypeReference);
				if (result == null) result = caseTypeReference(intTypeReference);
				if (result == null) result = caseTypeDescriptor(intTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.BOOL_TYPE_REFERENCE: {
				BoolTypeReference boolTypeReference = (BoolTypeReference)theEObject;
				T result = caseBoolTypeReference(boolTypeReference);
				if (result == null) result = casePrimitiveTypeReference(boolTypeReference);
				if (result == null) result = caseTypeReference(boolTypeReference);
				if (result == null) result = caseTypeDescriptor(boolTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.REAL_TYPE_REFERENCE: {
				RealTypeReference realTypeReference = (RealTypeReference)theEObject;
				T result = caseRealTypeReference(realTypeReference);
				if (result == null) result = casePrimitiveTypeReference(realTypeReference);
				if (result == null) result = caseTypeReference(realTypeReference);
				if (result == null) result = caseTypeDescriptor(realTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseSymbolicDeclaration(function);
				if (result == null) result = caseTermDescription(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseTermDescription(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.SYMBOLIC_DECLARATION: {
				SymbolicDeclaration symbolicDeclaration = (SymbolicDeclaration)theEObject;
				T result = caseSymbolicDeclaration(symbolicDeclaration);
				if (result == null) result = caseTermDescription(symbolicDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.SYMBOLIC_VALUE: {
				SymbolicValue symbolicValue = (SymbolicValue)theEObject;
				T result = caseSymbolicValue(symbolicValue);
				if (result == null) result = caseTerm(symbolicValue);
				if (result == null) result = caseTermDescription(symbolicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.ATOMIC_TERM: {
				AtomicTerm atomicTerm = (AtomicTerm)theEObject;
				T result = caseAtomicTerm(atomicTerm);
				if (result == null) result = caseTerm(atomicTerm);
				if (result == null) result = caseTermDescription(atomicTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.INT_LITERAL: {
				IntLiteral intLiteral = (IntLiteral)theEObject;
				T result = caseIntLiteral(intLiteral);
				if (result == null) result = caseAtomicTerm(intLiteral);
				if (result == null) result = caseTerm(intLiteral);
				if (result == null) result = caseTermDescription(intLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.BOOL_LITERAL: {
				BoolLiteral boolLiteral = (BoolLiteral)theEObject;
				T result = caseBoolLiteral(boolLiteral);
				if (result == null) result = caseAtomicTerm(boolLiteral);
				if (result == null) result = caseTerm(boolLiteral);
				if (result == null) result = caseTermDescription(boolLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.REAL_LITERAL: {
				RealLiteral realLiteral = (RealLiteral)theEObject;
				T result = caseRealLiteral(realLiteral);
				if (result == null) result = caseAtomicTerm(realLiteral);
				if (result == null) result = caseTerm(realLiteral);
				if (result == null) result = caseTermDescription(realLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseSymbolicDeclaration(variable);
				if (result == null) result = caseTermDescription(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.QUANTIFIED_EXPRESSION: {
				QuantifiedExpression quantifiedExpression = (QuantifiedExpression)theEObject;
				T result = caseQuantifiedExpression(quantifiedExpression);
				if (result == null) result = caseTerm(quantifiedExpression);
				if (result == null) result = caseTermDescription(quantifiedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.EXISTS: {
				Exists exists = (Exists)theEObject;
				T result = caseExists(exists);
				if (result == null) result = caseQuantifiedExpression(exists);
				if (result == null) result = caseTerm(exists);
				if (result == null) result = caseTermDescription(exists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.FORALL: {
				Forall forall = (Forall)theEObject;
				T result = caseForall(forall);
				if (result == null) result = caseQuantifiedExpression(forall);
				if (result == null) result = caseTerm(forall);
				if (result == null) result = caseTermDescription(forall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.BOOL_OPERATION: {
				BoolOperation boolOperation = (BoolOperation)theEObject;
				T result = caseBoolOperation(boolOperation);
				if (result == null) result = caseTerm(boolOperation);
				if (result == null) result = caseTermDescription(boolOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBoolOperation(and);
				if (result == null) result = caseTerm(and);
				if (result == null) result = caseTermDescription(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBoolOperation(or);
				if (result == null) result = caseTerm(or);
				if (result == null) result = caseTermDescription(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.IMPL: {
				Impl impl = (Impl)theEObject;
				T result = caseImpl(impl);
				if (result == null) result = caseBoolOperation(impl);
				if (result == null) result = caseTerm(impl);
				if (result == null) result = caseTermDescription(impl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseBoolOperation(not);
				if (result == null) result = caseTerm(not);
				if (result == null) result = caseTermDescription(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.IFF: {
				Iff iff = (Iff)theEObject;
				T result = caseIff(iff);
				if (result == null) result = caseBoolOperation(iff);
				if (result == null) result = caseTerm(iff);
				if (result == null) result = caseTermDescription(iff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.PRIMITIVE_RELATION: {
				PrimitiveRelation primitiveRelation = (PrimitiveRelation)theEObject;
				T result = casePrimitiveRelation(primitiveRelation);
				if (result == null) result = caseTerm(primitiveRelation);
				if (result == null) result = caseTermDescription(primitiveRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.EQUALS: {
				Equals equals = (Equals)theEObject;
				T result = caseEquals(equals);
				if (result == null) result = casePrimitiveRelation(equals);
				if (result == null) result = caseTerm(equals);
				if (result == null) result = caseTermDescription(equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.DISTINCT: {
				Distinct distinct = (Distinct)theEObject;
				T result = caseDistinct(distinct);
				if (result == null) result = casePrimitiveRelation(distinct);
				if (result == null) result = caseTerm(distinct);
				if (result == null) result = caseTermDescription(distinct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = casePrimitiveRelation(lessThan);
				if (result == null) result = caseTerm(lessThan);
				if (result == null) result = caseTermDescription(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.MORE_THAN: {
				MoreThan moreThan = (MoreThan)theEObject;
				T result = caseMoreThan(moreThan);
				if (result == null) result = casePrimitiveRelation(moreThan);
				if (result == null) result = caseTerm(moreThan);
				if (result == null) result = caseTermDescription(moreThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.LESS_OR_EQUAL_THAN: {
				LessOrEqualThan lessOrEqualThan = (LessOrEqualThan)theEObject;
				T result = caseLessOrEqualThan(lessOrEqualThan);
				if (result == null) result = casePrimitiveRelation(lessOrEqualThan);
				if (result == null) result = caseTerm(lessOrEqualThan);
				if (result == null) result = caseTermDescription(lessOrEqualThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.MORE_OR_EQUAL_THAN: {
				MoreOrEqualThan moreOrEqualThan = (MoreOrEqualThan)theEObject;
				T result = caseMoreOrEqualThan(moreOrEqualThan);
				if (result == null) result = casePrimitiveRelation(moreOrEqualThan);
				if (result == null) result = caseTerm(moreOrEqualThan);
				if (result == null) result = caseTermDescription(moreOrEqualThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.INT_OPERATION: {
				IntOperation intOperation = (IntOperation)theEObject;
				T result = caseIntOperation(intOperation);
				if (result == null) result = caseTerm(intOperation);
				if (result == null) result = caseTermDescription(intOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T result = casePlus(plus);
				if (result == null) result = caseIntOperation(plus);
				if (result == null) result = caseTerm(plus);
				if (result == null) result = caseTermDescription(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.MINUS: {
				Minus minus = (Minus)theEObject;
				T result = caseMinus(minus);
				if (result == null) result = caseIntOperation(minus);
				if (result == null) result = caseTerm(minus);
				if (result == null) result = caseTermDescription(minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T result = caseMultiply(multiply);
				if (result == null) result = caseIntOperation(multiply);
				if (result == null) result = caseTerm(multiply);
				if (result == null) result = caseTermDescription(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.DIVISON: {
				Divison divison = (Divison)theEObject;
				T result = caseDivison(divison);
				if (result == null) result = caseIntOperation(divison);
				if (result == null) result = caseTerm(divison);
				if (result == null) result = caseTermDescription(divison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.MOD: {
				Mod mod = (Mod)theEObject;
				T result = caseMod(mod);
				if (result == null) result = caseIntOperation(mod);
				if (result == null) result = caseTerm(mod);
				if (result == null) result = caseTermDescription(mod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.TYPE_DESCRIPTOR: {
				TypeDescriptor typeDescriptor = (TypeDescriptor)theEObject;
				T result = caseTypeDescriptor(typeDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.TERM_DESCRIPTION: {
				TermDescription termDescription = (TermDescription)theEObject;
				T result = caseTermDescription(termDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseSymbolicDeclaration(relation);
				if (result == null) result = caseTermDescription(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseSymbolicDeclaration(constant);
				if (result == null) result = caseTermDescription(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.CONSTANT_DEFINITION: {
				ConstantDefinition constantDefinition = (ConstantDefinition)theEObject;
				T result = caseConstantDefinition(constantDefinition);
				if (result == null) result = caseConstant(constantDefinition);
				if (result == null) result = caseSymbolicDeclaration(constantDefinition);
				if (result == null) result = caseTermDescription(constantDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.RELATION_DEFINITION: {
				RelationDefinition relationDefinition = (RelationDefinition)theEObject;
				T result = caseRelationDefinition(relationDefinition);
				if (result == null) result = caseRelation(relationDefinition);
				if (result == null) result = caseSymbolicDeclaration(relationDefinition);
				if (result == null) result = caseTermDescription(relationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.FUNCTION_DEFINITION: {
				FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
				T result = caseFunctionDefinition(functionDefinition);
				if (result == null) result = caseFunction(functionDefinition);
				if (result == null) result = caseSymbolicDeclaration(functionDefinition);
				if (result == null) result = caseTermDescription(functionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.IF_THEN_ELSE: {
				IfThenElse ifThenElse = (IfThenElse)theEObject;
				T result = caseIfThenElse(ifThenElse);
				if (result == null) result = caseTerm(ifThenElse);
				if (result == null) result = caseTermDescription(ifThenElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.CONSTANT_DECLARATION: {
				ConstantDeclaration constantDeclaration = (ConstantDeclaration)theEObject;
				T result = caseConstantDeclaration(constantDeclaration);
				if (result == null) result = caseConstant(constantDeclaration);
				if (result == null) result = caseSymbolicDeclaration(constantDeclaration);
				if (result == null) result = caseTermDescription(constantDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.RELATION_DECLARATION: {
				RelationDeclaration relationDeclaration = (RelationDeclaration)theEObject;
				T result = caseRelationDeclaration(relationDeclaration);
				if (result == null) result = caseRelation(relationDeclaration);
				if (result == null) result = caseSymbolicDeclaration(relationDeclaration);
				if (result == null) result = caseTermDescription(relationDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseFunction(functionDeclaration);
				if (result == null) result = caseSymbolicDeclaration(functionDeclaration);
				if (result == null) result = caseTermDescription(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.TYPE_DECLARATION: {
				TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
				T result = caseTypeDeclaration(typeDeclaration);
				if (result == null) result = caseType(typeDeclaration);
				if (result == null) result = caseTypeDescriptor(typeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.UNKNOWN_BECAUSE_UNINTERPRETED: {
				UnknownBecauseUninterpreted unknownBecauseUninterpreted = (UnknownBecauseUninterpreted)theEObject;
				T result = caseUnknownBecauseUninterpreted(unknownBecauseUninterpreted);
				if (result == null) result = caseTerm(unknownBecauseUninterpreted);
				if (result == null) result = caseTermDescription(unknownBecauseUninterpreted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.INSTANCE_OF: {
				InstanceOf instanceOf = (InstanceOf)theEObject;
				T result = caseInstanceOf(instanceOf);
				if (result == null) result = caseTerm(instanceOf);
				if (result == null) result = caseTermDescription(instanceOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.STRING_TYPE_REFERENCE: {
				StringTypeReference stringTypeReference = (StringTypeReference)theEObject;
				T result = caseStringTypeReference(stringTypeReference);
				if (result == null) result = casePrimitiveTypeReference(stringTypeReference);
				if (result == null) result = caseTypeReference(stringTypeReference);
				if (result == null) result = caseTypeDescriptor(stringTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseAtomicTerm(stringLiteral);
				if (result == null) result = caseTerm(stringLiteral);
				if (result == null) result = caseTermDescription(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogiclanguagePackage.TRANSITIVE_CLOSURE: {
				TransitiveClosure transitiveClosure = (TransitiveClosure)theEObject;
				T result = caseTransitiveClosure(transitiveClosure);
				if (result == null) result = caseTerm(transitiveClosure);
				if (result == null) result = caseTermDescription(transitiveClosure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedElement(DefinedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexTypeReference(ComplexTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeReference(PrimitiveTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntTypeReference(IntTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolTypeReference(BoolTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTypeReference(RealTypeReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicDeclaration(SymbolicDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicValue(SymbolicValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicTerm(AtomicTerm object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolLiteral(BoolLiteral object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedExpression(QuantifiedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExists(Exists object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bool Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolOperation(BoolOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpl(Impl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIff(Iff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveRelation(PrimitiveRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distinct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistinct(Distinct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>More Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>More Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoreThan(MoreThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqualThan(LessOrEqualThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>More Or Equal Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>More Or Equal Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoreOrEqualThan(MoreOrEqualThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntOperation(IntOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivison(Divison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMod(Mod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDescriptor(TypeDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermDescription(TermDescription object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantDefinition(ConstantDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationDefinition(RelationDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfThenElse(IfThenElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantDeclaration(ConstantDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationDeclaration(RelationDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Because Uninterpreted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Because Uninterpreted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownBecauseUninterpreted(UnknownBecauseUninterpreted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceOf(InstanceOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringTypeReference(StringTypeReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Transitive Closure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transitive Closure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitiveClosure(TransitiveClosure object) {
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

} //LogiclanguageSwitch
