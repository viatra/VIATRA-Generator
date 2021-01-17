/**
 */
package crossingScenario.util;

import crossingScenario.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see crossingScenario.CrossingScenarioPackage
 * @generated
 */
public class CrossingScenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CrossingScenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossingScenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CrossingScenarioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossingScenarioSwitch<Adapter> modelSwitch =
		new CrossingScenarioSwitch<Adapter>() {
			@Override
			public Adapter caseCrossingScenario(CrossingScenario object) {
				return createCrossingScenarioAdapter();
			}
			@Override
			public Adapter caseLane(Lane object) {
				return createLaneAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseSpatialRelation(SpatialRelation object) {
				return createSpatialRelationAdapter();
			}
			@Override
			public Adapter caseTemporalRelation(TemporalRelation object) {
				return createTemporalRelationAdapter();
			}
			@Override
			public Adapter caseVisionBlocked(VisionBlocked object) {
				return createVisionBlockedAdapter();
			}
			@Override
			public Adapter caseSeparationDistance(SeparationDistance object) {
				return createSeparationDistanceAdapter();
			}
			@Override
			public Adapter caseCollisionExists(CollisionExists object) {
				return createCollisionExistsAdapter();
			}
			@Override
			public Adapter caseCollisionDoesNotExist(CollisionDoesNotExist object) {
				return createCollisionDoesNotExistAdapter();
			}
			@Override
			public Adapter casePedestrian(Pedestrian object) {
				return createPedestrianAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseLane_Horizontal(Lane_Horizontal object) {
				return createLane_HorizontalAdapter();
			}
			@Override
			public Adapter caseLane_Vertical(Lane_Vertical object) {
				return createLane_VerticalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.CrossingScenario <em>Crossing Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.CrossingScenario
	 * @generated
	 */
	public Adapter createCrossingScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.SpatialRelation <em>Spatial Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.SpatialRelation
	 * @generated
	 */
	public Adapter createSpatialRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.TemporalRelation <em>Temporal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.TemporalRelation
	 * @generated
	 */
	public Adapter createTemporalRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.VisionBlocked <em>Vision Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.VisionBlocked
	 * @generated
	 */
	public Adapter createVisionBlockedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.SeparationDistance <em>Separation Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.SeparationDistance
	 * @generated
	 */
	public Adapter createSeparationDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.CollisionExists <em>Collision Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.CollisionExists
	 * @generated
	 */
	public Adapter createCollisionExistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.CollisionDoesNotExist <em>Collision Does Not Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.CollisionDoesNotExist
	 * @generated
	 */
	public Adapter createCollisionDoesNotExistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.Pedestrian <em>Pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.Pedestrian
	 * @generated
	 */
	public Adapter createPedestrianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.Lane_Horizontal <em>Lane Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.Lane_Horizontal
	 * @generated
	 */
	public Adapter createLane_HorizontalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crossingScenario.Lane_Vertical <em>Lane Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crossingScenario.Lane_Vertical
	 * @generated
	 */
	public Adapter createLane_VerticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CrossingScenarioAdapterFactory
