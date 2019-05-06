/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.util;

import hu.bme.mit.inf.dslreasoner.domains.satellite.*;

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
 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage
 * @generated
 */
public class SatelliteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SatellitePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteSwitch() {
		if (modelPackage == null) {
			modelPackage = SatellitePackage.eINSTANCE;
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
		case SatellitePackage.CONSTELLATION_MISSION: {
			ConstellationMission constellationMission = (ConstellationMission) theEObject;
			T result = caseConstellationMission(constellationMission);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.INTERFEROMETRY_MISSION: {
			InterferometryMission interferometryMission = (InterferometryMission) theEObject;
			T result = caseInterferometryMission(interferometryMission);
			if (result == null)
				result = caseConstellationMission(interferometryMission);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.COMMUNICATING_ELEMENT: {
			CommunicatingElement communicatingElement = (CommunicatingElement) theEObject;
			T result = caseCommunicatingElement(communicatingElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.GROUND_STATION_NETWORK: {
			GroundStationNetwork groundStationNetwork = (GroundStationNetwork) theEObject;
			T result = caseGroundStationNetwork(groundStationNetwork);
			if (result == null)
				result = caseCommunicatingElement(groundStationNetwork);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.SPACECRAFT: {
			Spacecraft spacecraft = (Spacecraft) theEObject;
			T result = caseSpacecraft(spacecraft);
			if (result == null)
				result = caseCommunicatingElement(spacecraft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.COMM_SUBSYSTEM: {
			CommSubsystem commSubsystem = (CommSubsystem) theEObject;
			T result = caseCommSubsystem(commSubsystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.DIRECTED_COMMUNICATION_LINK: {
			DirectedCommunicationLink directedCommunicationLink = (DirectedCommunicationLink) theEObject;
			T result = caseDirectedCommunicationLink(directedCommunicationLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.PAYLOAD: {
			Payload payload = (Payload) theEObject;
			T result = casePayload(payload);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.INTERFEROMETRY_PAYLOAD: {
			InterferometryPayload interferometryPayload = (InterferometryPayload) theEObject;
			T result = caseInterferometryPayload(interferometryPayload);
			if (result == null)
				result = casePayload(interferometryPayload);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.CUBE_SAT3_U: {
			CubeSat3U cubeSat3U = (CubeSat3U) theEObject;
			T result = caseCubeSat3U(cubeSat3U);
			if (result == null)
				result = caseCubeSat(cubeSat3U);
			if (result == null)
				result = caseSpacecraft(cubeSat3U);
			if (result == null)
				result = caseCommunicatingElement(cubeSat3U);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.CUBE_SAT6_U: {
			CubeSat6U cubeSat6U = (CubeSat6U) theEObject;
			T result = caseCubeSat6U(cubeSat6U);
			if (result == null)
				result = caseCubeSat(cubeSat6U);
			if (result == null)
				result = caseSpacecraft(cubeSat6U);
			if (result == null)
				result = caseCommunicatingElement(cubeSat6U);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.SMALL_SAT: {
			SmallSat smallSat = (SmallSat) theEObject;
			T result = caseSmallSat(smallSat);
			if (result == null)
				result = caseSpacecraft(smallSat);
			if (result == null)
				result = caseCommunicatingElement(smallSat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SatellitePackage.CUBE_SAT: {
			CubeSat cubeSat = (CubeSat) theEObject;
			T result = caseCubeSat(cubeSat);
			if (result == null)
				result = caseSpacecraft(cubeSat);
			if (result == null)
				result = caseCommunicatingElement(cubeSat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constellation Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constellation Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstellationMission(ConstellationMission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interferometry Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interferometry Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterferometryMission(InterferometryMission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicating Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicating Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicatingElement(CommunicatingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Station Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Station Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundStationNetwork(GroundStationNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacecraft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacecraft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacecraft(Spacecraft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comm Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comm Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommSubsystem(CommSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Communication Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Communication Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedCommunicationLink(DirectedCommunicationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayload(Payload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interferometry Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interferometry Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterferometryPayload(InterferometryPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Sat3 U</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Sat3 U</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeSat3U(CubeSat3U object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Sat6 U</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Sat6 U</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeSat6U(CubeSat6U object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Sat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Sat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallSat(SmallSat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cube Sat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cube Sat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubeSat(CubeSat object) {
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

} //SatelliteSwitch
