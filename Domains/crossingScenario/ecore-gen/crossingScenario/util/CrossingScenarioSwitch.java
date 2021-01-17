/**
 */
package crossingScenario.util;

import crossingScenario.*;

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
 * @see crossingScenario.CrossingScenarioPackage
 * @generated
 */
public class CrossingScenarioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CrossingScenarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossingScenarioSwitch() {
		if (modelPackage == null) {
			modelPackage = CrossingScenarioPackage.eINSTANCE;
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
			case CrossingScenarioPackage.CROSSING_SCENARIO: {
				CrossingScenario crossingScenario = (CrossingScenario)theEObject;
				T result = caseCrossingScenario(crossingScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.LANE: {
				Lane lane = (Lane)theEObject;
				T result = caseLane(lane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.SPATIAL_RELATION: {
				SpatialRelation spatialRelation = (SpatialRelation)theEObject;
				T result = caseSpatialRelation(spatialRelation);
				if (result == null) result = caseRelation(spatialRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.TEMPORAL_RELATION: {
				TemporalRelation temporalRelation = (TemporalRelation)theEObject;
				T result = caseTemporalRelation(temporalRelation);
				if (result == null) result = caseRelation(temporalRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.VISION_BLOCKED: {
				VisionBlocked visionBlocked = (VisionBlocked)theEObject;
				T result = caseVisionBlocked(visionBlocked);
				if (result == null) result = caseSpatialRelation(visionBlocked);
				if (result == null) result = caseRelation(visionBlocked);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.SEPARATION_DISTANCE: {
				SeparationDistance separationDistance = (SeparationDistance)theEObject;
				T result = caseSeparationDistance(separationDistance);
				if (result == null) result = caseSpatialRelation(separationDistance);
				if (result == null) result = caseRelation(separationDistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.COLLISION_EXISTS: {
				CollisionExists collisionExists = (CollisionExists)theEObject;
				T result = caseCollisionExists(collisionExists);
				if (result == null) result = caseTemporalRelation(collisionExists);
				if (result == null) result = caseRelation(collisionExists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.COLLISION_DOES_NOT_EXIST: {
				CollisionDoesNotExist collisionDoesNotExist = (CollisionDoesNotExist)theEObject;
				T result = caseCollisionDoesNotExist(collisionDoesNotExist);
				if (result == null) result = caseTemporalRelation(collisionDoesNotExist);
				if (result == null) result = caseRelation(collisionDoesNotExist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.PEDESTRIAN: {
				Pedestrian pedestrian = (Pedestrian)theEObject;
				T result = casePedestrian(pedestrian);
				if (result == null) result = caseActor(pedestrian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.VEHICLE: {
				Vehicle vehicle = (Vehicle)theEObject;
				T result = caseVehicle(vehicle);
				if (result == null) result = caseActor(vehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.LANE_HORIZONTAL: {
				Lane_Horizontal lane_Horizontal = (Lane_Horizontal)theEObject;
				T result = caseLane_Horizontal(lane_Horizontal);
				if (result == null) result = caseLane(lane_Horizontal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CrossingScenarioPackage.LANE_VERTICAL: {
				Lane_Vertical lane_Vertical = (Lane_Vertical)theEObject;
				T result = caseLane_Vertical(lane_Vertical);
				if (result == null) result = caseLane(lane_Vertical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crossing Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crossing Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossingScenario(CrossingScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialRelation(SpatialRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalRelation(TemporalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Blocked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Blocked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionBlocked(VisionBlocked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Separation Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Separation Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeparationDistance(SeparationDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collision Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collision Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollisionExists(CollisionExists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collision Does Not Exist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collision Does Not Exist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollisionDoesNotExist(CollisionDoesNotExist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pedestrian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pedestrian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePedestrian(Pedestrian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicle(Vehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane Horizontal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane Horizontal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane_Horizontal(Lane_Horizontal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane Vertical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane Vertical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane_Vertical(Lane_Vertical object) {
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

} //CrossingScenarioSwitch
