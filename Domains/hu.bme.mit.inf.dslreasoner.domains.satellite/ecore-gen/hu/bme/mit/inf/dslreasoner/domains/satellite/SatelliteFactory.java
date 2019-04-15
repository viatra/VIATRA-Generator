/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage
 * @generated
 */
public interface SatelliteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SatelliteFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.domains.satellite.impl.SatelliteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interferometry Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interferometry Mission</em>'.
	 * @generated
	 */
	InterferometryMission createInterferometryMission();

	/**
	 * Returns a new object of class '<em>Ground Station Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Station Network</em>'.
	 * @generated
	 */
	GroundStationNetwork createGroundStationNetwork();

	/**
	 * Returns a new object of class '<em>Cube Sat3 U</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cube Sat3 U</em>'.
	 * @generated
	 */
	CubeSat3U createCubeSat3U();

	/**
	 * Returns a new object of class '<em>Cube Sat6 U</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cube Sat6 U</em>'.
	 * @generated
	 */
	CubeSat6U createCubeSat6U();

	/**
	 * Returns a new object of class '<em>Small Sat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small Sat</em>'.
	 * @generated
	 */
	SmallSat createSmallSat();

	/**
	 * Returns a new object of class '<em>Comm Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Subsystem</em>'.
	 * @generated
	 */
	CommSubsystem createCommSubsystem();

	/**
	 * Returns a new object of class '<em>Directed Communication Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directed Communication Link</em>'.
	 * @generated
	 */
	DirectedCommunicationLink createDirectedCommunicationLink();

	/**
	 * Returns a new object of class '<em>Interferometry Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interferometry Payload</em>'.
	 * @generated
	 */
	InterferometryPayload createInterferometryPayload();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SatellitePackage getSatellitePackage();

} //SatelliteFactory
