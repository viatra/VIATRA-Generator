/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage
 * @generated
 */
public interface CpsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpsFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cyber Physical System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cyber Physical System</em>'.
	 * @generated
	 */
	CyberPhysicalSystem createCyberPhysicalSystem();

	/**
	 * Returns a new object of class '<em>Application Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Type</em>'.
	 * @generated
	 */
	ApplicationType createApplicationType();

	/**
	 * Returns a new object of class '<em>Host Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Type</em>'.
	 * @generated
	 */
	HostType createHostType();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Application Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Instance</em>'.
	 * @generated
	 */
	ApplicationInstance createApplicationInstance();

	/**
	 * Returns a new object of class '<em>Resource Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirement</em>'.
	 * @generated
	 */
	ResourceRequirement createResourceRequirement();

	/**
	 * Returns a new object of class '<em>Host Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Instance</em>'.
	 * @generated
	 */
	HostInstance createHostInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CpsPackage getCpsPackage();

} //CpsFactory
