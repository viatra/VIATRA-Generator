/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.util;

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.*;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation;

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
 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
 * @generated
 */
public class Ecore2logicannotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ecore2logicannotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecore2logicannotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = Ecore2logicannotationsPackage.eINSTANCE;
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
			case Ecore2logicannotationsPackage.MULTIPLICITY_ASSERTION: {
				MultiplicityAssertion multiplicityAssertion = (MultiplicityAssertion)theEObject;
				T result = caseMultiplicityAssertion(multiplicityAssertion);
				if (result == null) result = caseAssertionAnnotation(multiplicityAssertion);
				if (result == null) result = caseAnnotation(multiplicityAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION: {
				InverseRelationAssertion inverseRelationAssertion = (InverseRelationAssertion)theEObject;
				T result = caseInverseRelationAssertion(inverseRelationAssertion);
				if (result == null) result = caseAssertionAnnotation(inverseRelationAssertion);
				if (result == null) result = caseAnnotation(inverseRelationAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecore2logicannotationsPackage.LOWER_MULTIPLICITY_ASSERTION: {
				LowerMultiplicityAssertion lowerMultiplicityAssertion = (LowerMultiplicityAssertion)theEObject;
				T result = caseLowerMultiplicityAssertion(lowerMultiplicityAssertion);
				if (result == null) result = caseMultiplicityAssertion(lowerMultiplicityAssertion);
				if (result == null) result = caseAssertionAnnotation(lowerMultiplicityAssertion);
				if (result == null) result = caseAnnotation(lowerMultiplicityAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecore2logicannotationsPackage.UPPER_MULTIPLICITY_ASSERTION: {
				UpperMultiplicityAssertion upperMultiplicityAssertion = (UpperMultiplicityAssertion)theEObject;
				T result = caseUpperMultiplicityAssertion(upperMultiplicityAssertion);
				if (result == null) result = caseMultiplicityAssertion(upperMultiplicityAssertion);
				if (result == null) result = caseAssertionAnnotation(upperMultiplicityAssertion);
				if (result == null) result = caseAnnotation(upperMultiplicityAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityAssertion(MultiplicityAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Relation Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Relation Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseRelationAssertion(InverseRelationAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Multiplicity Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Multiplicity Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerMultiplicityAssertion(LowerMultiplicityAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Multiplicity Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Multiplicity Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperMultiplicityAssertion(UpperMultiplicityAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionAnnotation(AssertionAnnotation object) {
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

} //Ecore2logicannotationsSwitch
