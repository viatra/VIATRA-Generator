/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.util;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.*;

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
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
 * @generated
 */
public class PartialinterpretationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartialinterpretationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialinterpretationSwitch() {
		if (modelPackage == null) {
			modelPackage = PartialinterpretationPackage.eINSTANCE;
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION: {
				PartialInterpretation partialInterpretation = (PartialInterpretation)theEObject;
				T result = casePartialInterpretation(partialInterpretation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION: {
				PartialConstantInterpretation partialConstantInterpretation = (PartialConstantInterpretation)theEObject;
				T result = casePartialConstantInterpretation(partialConstantInterpretation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION: {
				PartialRelationInterpretation partialRelationInterpretation = (PartialRelationInterpretation)theEObject;
				T result = casePartialRelationInterpretation(partialRelationInterpretation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.PARTIAL_FUNCTION_INTERPRETATION: {
				PartialFunctionInterpretation partialFunctionInterpretation = (PartialFunctionInterpretation)theEObject;
				T result = casePartialFunctionInterpretation(partialFunctionInterpretation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION: {
				PartialTypeInterpratation partialTypeInterpratation = (PartialTypeInterpratation)theEObject;
				T result = casePartialTypeInterpratation(partialTypeInterpratation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.RELATION_LINK: {
				RelationLink relationLink = (RelationLink)theEObject;
				T result = caseRelationLink(relationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK: {
				UnaryElementRelationLink unaryElementRelationLink = (UnaryElementRelationLink)theEObject;
				T result = caseUnaryElementRelationLink(unaryElementRelationLink);
				if (result == null) result = caseRelationLink(unaryElementRelationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK: {
				BinaryElementRelationLink binaryElementRelationLink = (BinaryElementRelationLink)theEObject;
				T result = caseBinaryElementRelationLink(binaryElementRelationLink);
				if (result == null) result = caseRelationLink(binaryElementRelationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.NARY_RELATION_LINK: {
				NaryRelationLink naryRelationLink = (NaryRelationLink)theEObject;
				T result = caseNaryRelationLink(naryRelationLink);
				if (result == null) result = caseRelationLink(naryRelationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT: {
				NaryRelationLinkElement naryRelationLinkElement = (NaryRelationLinkElement)theEObject;
				T result = caseNaryRelationLinkElement(naryRelationLinkElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.PRIMITIVE_ELEMENT: {
				PrimitiveElement primitiveElement = (PrimitiveElement)theEObject;
				T result = casePrimitiveElement(primitiveElement);
				if (result == null) result = caseDefinedElement(primitiveElement);
				if (result == null) result = caseSymbolicDeclaration(primitiveElement);
				if (result == null) result = caseTermDescription(primitiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.BOOLEAN_ELEMENT: {
				BooleanElement booleanElement = (BooleanElement)theEObject;
				T result = caseBooleanElement(booleanElement);
				if (result == null) result = casePrimitiveElement(booleanElement);
				if (result == null) result = caseDefinedElement(booleanElement);
				if (result == null) result = caseSymbolicDeclaration(booleanElement);
				if (result == null) result = caseTermDescription(booleanElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.INTEGER_ELEMENT: {
				IntegerElement integerElement = (IntegerElement)theEObject;
				T result = caseIntegerElement(integerElement);
				if (result == null) result = casePrimitiveElement(integerElement);
				if (result == null) result = caseDefinedElement(integerElement);
				if (result == null) result = caseSymbolicDeclaration(integerElement);
				if (result == null) result = caseTermDescription(integerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.REAL_ELEMENT: {
				RealElement realElement = (RealElement)theEObject;
				T result = caseRealElement(realElement);
				if (result == null) result = casePrimitiveElement(realElement);
				if (result == null) result = caseDefinedElement(realElement);
				if (result == null) result = caseSymbolicDeclaration(realElement);
				if (result == null) result = caseTermDescription(realElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartialinterpretationPackage.STRING_ELEMENT: {
				StringElement stringElement = (StringElement)theEObject;
				T result = caseStringElement(stringElement);
				if (result == null) result = casePrimitiveElement(stringElement);
				if (result == null) result = caseDefinedElement(stringElement);
				if (result == null) result = caseSymbolicDeclaration(stringElement);
				if (result == null) result = caseTermDescription(stringElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Interpretation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialInterpretation(PartialInterpretation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Constant Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Constant Interpretation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialConstantInterpretation(PartialConstantInterpretation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Relation Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Relation Interpretation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialRelationInterpretation(PartialRelationInterpretation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Function Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Function Interpretation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialFunctionInterpretation(PartialFunctionInterpretation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Type Interpratation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Type Interpratation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialTypeInterpratation(PartialTypeInterpratation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationLink(RelationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Element Relation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Element Relation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryElementRelationLink(UnaryElementRelationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Element Relation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Element Relation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryElementRelationLink(BinaryElementRelationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Relation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Relation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryRelationLink(NaryRelationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Relation Link Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Relation Link Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryRelationLinkElement(NaryRelationLinkElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveElement(PrimitiveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanElement(BooleanElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerElement(IntegerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealElement(RealElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringElement(StringElement object) {
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

} //PartialinterpretationSwitch
