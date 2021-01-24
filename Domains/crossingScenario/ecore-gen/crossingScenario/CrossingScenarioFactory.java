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
	 * Returns a new object of class '<em>Vision Blocked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Blocked</em>'.
	 * @generated
	 */
	VisionBlocked createVisionBlocked();

	/**
	 * Returns a new object of class '<em>Collision Exists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision Exists</em>'.
	 * @generated
	 */
	CollisionExists createCollisionExists();

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
	 * Returns a new object of class '<em>Lane Horizontal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane Horizontal</em>'.
	 * @generated
	 */
	Lane_Horizontal createLane_Horizontal();

	/**
	 * Returns a new object of class '<em>Lane Vertical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane Vertical</em>'.
	 * @generated
	 */
	Lane_Vertical createLane_Vertical();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CrossingScenarioPackage getCrossingScenarioPackage();

} //CrossingScenarioFactory
