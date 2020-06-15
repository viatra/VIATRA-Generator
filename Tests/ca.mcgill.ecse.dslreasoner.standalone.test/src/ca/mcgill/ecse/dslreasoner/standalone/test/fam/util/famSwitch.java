/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalArchitectureModel;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalOutput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage;

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
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage
 * @generated
 */
public class famSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static famPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public famSwitch() {
		if (modelPackage == null) {
			modelPackage = famPackage.eINSTANCE;
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
			case famPackage.FUNCTIONAL_ELEMENT: {
				FunctionalElement functionalElement = (FunctionalElement)theEObject;
				T result = caseFunctionalElement(functionalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.FUNCTIONAL_ARCHITECTURE_MODEL: {
				FunctionalArchitectureModel functionalArchitectureModel = (FunctionalArchitectureModel)theEObject;
				T result = caseFunctionalArchitectureModel(functionalArchitectureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseFunctionalElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.FAM_TERMINATOR: {
				FAMTerminator famTerminator = (FAMTerminator)theEObject;
				T result = caseFAMTerminator(famTerminator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.INFORMATION_LINK: {
				InformationLink informationLink = (InformationLink)theEObject;
				T result = caseInformationLink(informationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.FUNCTIONAL_INTERFACE: {
				FunctionalInterface functionalInterface = (FunctionalInterface)theEObject;
				T result = caseFunctionalInterface(functionalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.FUNCTIONAL_INPUT: {
				FunctionalInput functionalInput = (FunctionalInput)theEObject;
				T result = caseFunctionalInput(functionalInput);
				if (result == null) result = caseFunctionalData(functionalInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.FUNCTIONAL_OUTPUT: {
				FunctionalOutput functionalOutput = (FunctionalOutput)theEObject;
				T result = caseFunctionalOutput(functionalOutput);
				if (result == null) result = caseFunctionalData(functionalOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case famPackage.FUNCTIONAL_DATA: {
				FunctionalData functionalData = (FunctionalData)theEObject;
				T result = caseFunctionalData(functionalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalElement(FunctionalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Architecture Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalArchitectureModel(FunctionalArchitectureModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>FAM Terminator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FAM Terminator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFAMTerminator(FAMTerminator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationLink(InformationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalInterface(FunctionalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalInput(FunctionalInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalOutput(FunctionalOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalData(FunctionalData object) {
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

} //famSwitch
