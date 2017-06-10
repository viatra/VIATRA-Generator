/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.util;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.*;

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
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage
 * @generated
 */
public class LogicresultSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicresultPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicresultSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicresultPackage.eINSTANCE;
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
			case LogicresultPackage.LOGIC_RESULT: {
				LogicResult logicResult = (LogicResult)theEObject;
				T result = caseLogicResult(logicResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.MODEL_RESULT: {
				ModelResult modelResult = (ModelResult)theEObject;
				T result = caseModelResult(modelResult);
				if (result == null) result = caseLogicResult(modelResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.INCONSISTENCY_RESULT: {
				InconsistencyResult inconsistencyResult = (InconsistencyResult)theEObject;
				T result = caseInconsistencyResult(inconsistencyResult);
				if (result == null) result = caseLogicResult(inconsistencyResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.UNKNOWN_RESULT: {
				UnknownResult unknownResult = (UnknownResult)theEObject;
				T result = caseUnknownResult(unknownResult);
				if (result == null) result = caseLogicResult(unknownResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.INSUFICIENT_RESOURCES_RESULT: {
				InsuficientResourcesResult insuficientResourcesResult = (InsuficientResourcesResult)theEObject;
				T result = caseInsuficientResourcesResult(insuficientResourcesResult);
				if (result == null) result = caseUnknownResult(insuficientResourcesResult);
				if (result == null) result = caseLogicResult(insuficientResourcesResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.ERROR_RESULT: {
				ErrorResult errorResult = (ErrorResult)theEObject;
				T result = caseErrorResult(errorResult);
				if (result == null) result = caseUnknownResult(errorResult);
				if (result == null) result = caseLogicResult(errorResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.STATISTICS: {
				Statistics statistics = (Statistics)theEObject;
				T result = caseStatistics(statistics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.STATISTIC_ENTRY: {
				StatisticEntry statisticEntry = (StatisticEntry)theEObject;
				T result = caseStatisticEntry(statisticEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.UNDECIDABLE_RESULT: {
				UndecidableResult undecidableResult = (UndecidableResult)theEObject;
				T result = caseUndecidableResult(undecidableResult);
				if (result == null) result = caseUnknownResult(undecidableResult);
				if (result == null) result = caseLogicResult(undecidableResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.INT_STATISTIC_ENTRY: {
				IntStatisticEntry intStatisticEntry = (IntStatisticEntry)theEObject;
				T result = caseIntStatisticEntry(intStatisticEntry);
				if (result == null) result = caseStatisticEntry(intStatisticEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.REAL_STATISTIC_ENTRY: {
				RealStatisticEntry realStatisticEntry = (RealStatisticEntry)theEObject;
				T result = caseRealStatisticEntry(realStatisticEntry);
				if (result == null) result = caseStatisticEntry(realStatisticEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicresultPackage.STRING_STATISTIC_ENTRY: {
				StringStatisticEntry stringStatisticEntry = (StringStatisticEntry)theEObject;
				T result = caseStringStatisticEntry(stringStatisticEntry);
				if (result == null) result = caseStatisticEntry(stringStatisticEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicResult(LogicResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelResult(ModelResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inconsistency Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inconsistency Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInconsistencyResult(InconsistencyResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownResult(UnknownResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insuficient Resources Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insuficient Resources Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuficientResourcesResult(InsuficientResourcesResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorResult(ErrorResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatistics(Statistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistic Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticEntry(StatisticEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undecidable Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undecidable Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndecidableResult(UndecidableResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Statistic Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntStatisticEntry(IntStatisticEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Statistic Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealStatisticEntry(RealStatisticEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Statistic Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringStatisticEntry(StringStatisticEntry object) {
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

} //LogicresultSwitch
