/**
 */
package simpleScenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleScenario.SimpleScenarioPackage
 * @generated
 */
public interface SimpleScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleScenarioFactory eINSTANCE = simpleScenario.impl.SimpleScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Scenario</em>'.
	 * @generated
	 */
	SimpleScenario createSimpleScenario();

	/**
	 * Returns a new object of class '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane</em>'.
	 * @generated
	 */
	Lane createLane();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Vision Blocked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Blocked</em>'.
	 * @generated
	 */
	VisionBlocked createVisionBlocked();

	/**
	 * Returns a new object of class '<em>Seperation Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seperation Distance</em>'.
	 * @generated
	 */
	SeperationDistance createSeperationDistance();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleScenarioPackage getSimpleScenarioPackage();

} //SimpleScenarioFactory
