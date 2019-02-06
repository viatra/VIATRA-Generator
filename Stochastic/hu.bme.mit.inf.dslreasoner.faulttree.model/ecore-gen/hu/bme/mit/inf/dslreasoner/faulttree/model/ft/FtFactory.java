/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage
 * @generated
 */
public interface FtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fault Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Tree</em>'.
	 * @generated
	 */
	FaultTree createFaultTree();

	/**
	 * Returns a new object of class '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Event</em>'.
	 * @generated
	 */
	BasicEvent createBasicEvent();

	/**
	 * Returns a new object of class '<em>Constant Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Distribution</em>'.
	 * @generated
	 */
	ConstantDistribution createConstantDistribution();

	/**
	 * Returns a new object of class '<em>Exponential Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Distribution</em>'.
	 * @generated
	 */
	ExponentialDistribution createExponentialDistribution();

	/**
	 * Returns a new object of class '<em>And Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Gate</em>'.
	 * @generated
	 */
	AndGate createAndGate();

	/**
	 * Returns a new object of class '<em>Or Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Gate</em>'.
	 * @generated
	 */
	OrGate createOrGate();

	/**
	 * Returns a new object of class '<em>KOf MGate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KOf MGate</em>'.
	 * @generated
	 */
	KOfMGate createKOfMGate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FtPackage getFtPackage();

} //FtFactory
