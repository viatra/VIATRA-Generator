/**
 */
package simpleScenario.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simpleScenario.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simpleScenario.SimpleScenarioPackage
 * @generated
 */
public class SimpleScenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleScenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleScenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimpleScenarioPackage.eINSTANCE;
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
	protected SimpleScenarioSwitch<Adapter> modelSwitch =
		new SimpleScenarioSwitch<Adapter>() {
			@Override
			public Adapter caseSimpleScenario(SimpleScenario object) {
				return createSimpleScenarioAdapter();
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
			public Adapter caseSeperationDistance(SeperationDistance object) {
				return createSeperationDistanceAdapter();
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
	 * Creates a new adapter for an object of class '{@link simpleScenario.SimpleScenario <em>Simple Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.SimpleScenario
	 * @generated
	 */
	public Adapter createSimpleScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.SpatialRelation <em>Spatial Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.SpatialRelation
	 * @generated
	 */
	public Adapter createSpatialRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.TemporalRelation <em>Temporal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.TemporalRelation
	 * @generated
	 */
	public Adapter createTemporalRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.VisionBlocked <em>Vision Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.VisionBlocked
	 * @generated
	 */
	public Adapter createVisionBlockedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.SeperationDistance <em>Seperation Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.SeperationDistance
	 * @generated
	 */
	public Adapter createSeperationDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.CollisionExists <em>Collision Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.CollisionExists
	 * @generated
	 */
	public Adapter createCollisionExistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.CollisionDoesNotExist <em>Collision Does Not Exist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.CollisionDoesNotExist
	 * @generated
	 */
	public Adapter createCollisionDoesNotExistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.Pedestrian <em>Pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.Pedestrian
	 * @generated
	 */
	public Adapter createPedestrianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleScenario.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleScenario.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
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

} //SimpleScenarioAdapterFactory
