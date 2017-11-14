/**
 */
package logic2vampire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logic2vampire.Logic2vampirePackage
 * @generated
 */
public interface Logic2vampireFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Logic2vampireFactory eINSTANCE = logic2vampire.impl.Logic2vampireFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logic2 Vampire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic2 Vampire</em>'.
	 * @generated
	 */
	Logic2Vampire createLogic2Vampire();

	/**
	 * Returns a new object of class '<em>Logic2 Vampire Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic2 Vampire Trace</em>'.
	 * @generated
	 */
	Logic2VampireTrace createLogic2VampireTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Logic2vampirePackage getLogic2vampirePackage();

} //Logic2vampireFactory
