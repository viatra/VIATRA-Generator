/**
 */
package crossingScenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see crossingScenario.CrossingScenarioPackage
 * @generated
 */
public interface CrossingScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CrossingScenarioFactory eINSTANCE = crossingScenario.impl.CrossingScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Crossing Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crossing Scenario</em>'.
	 * @generated
	 */
	CrossingScenario createCrossingScenario();

	/**
	 * Returns a new object of class '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane</em>'.
	 * @generated
	 */
	Lane createLane();

	/**
	 * Returns a new object of class '<em>Vision Blocked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Blocked</em>'.
	 * @generated
	 */
	VisionBlocked createVisionBlocked();

	/**
	 * Returns a new object of class '<em>Separation Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Separation Distance</em>'.
	 * @generated
	 */
	SeparationDistance createSeparationDistance();

	/**
	 * Returns a new object of class '<em>Collision Exists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision Exists</em>'.
	 * @generated
	 */
	CollisionExists createCollisionExists();

	/**
	 * Returns a new object of class '<em>Collision Does Not Exist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision Does Not Exist</em>'.
	 * @generated
	 */
	CollisionDoesNotExist createCollisionDoesNotExist();

	/**
	 * Returns a new object of class '<em>Pedestrian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedestrian</em>'.
	 * @generated
	 */
	Pedestrian createPedestrian();

	/**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
	Vehicle createVehicle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CrossingScenarioPackage getCrossingScenarioPackage();

} //CrossingScenarioFactory
