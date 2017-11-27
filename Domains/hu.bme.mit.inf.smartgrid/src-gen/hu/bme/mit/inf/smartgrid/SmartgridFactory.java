/**
 */
package hu.bme.mit.inf.smartgrid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.smartgrid.SmartgridPackage
 * @generated
 */
public interface SmartgridFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartgridFactory eINSTANCE = hu.bme.mit.inf.smartgrid.impl.SmartgridFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concentrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concentrator</em>'.
	 * @generated
	 */
	Concentrator createConcentrator();

	/**
	 * Returns a new object of class '<em>Smart Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Meter</em>'.
	 * @generated
	 */
	SmartMeter createSmartMeter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SmartgridPackage getSmartgridPackage();

} //SmartgridFactory
