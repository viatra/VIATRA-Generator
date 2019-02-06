/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage
 * @generated
 */
public interface CftFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CftFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.CftFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Definition</em>'.
	 * @generated
	 */
	ComponentDefinition createComponentDefinition();

	/**
	 * Returns a new object of class '<em>Basic Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Event Definition</em>'.
	 * @generated
	 */
	BasicEventDefinition createBasicEventDefinition();

	/**
	 * Returns a new object of class '<em>Intput Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intput Event</em>'.
	 * @generated
	 */
	IntputEvent createIntputEvent();

	/**
	 * Returns a new object of class '<em>And Gate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Gate Definition</em>'.
	 * @generated
	 */
	AndGateDefinition createAndGateDefinition();

	/**
	 * Returns a new object of class '<em>Or Gate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Gate Definition</em>'.
	 * @generated
	 */
	OrGateDefinition createOrGateDefinition();

	/**
	 * Returns a new object of class '<em>KOf MGate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KOf MGate Definition</em>'.
	 * @generated
	 */
	KOfMGateDefinition createKOfMGateDefinition();

	/**
	 * Returns a new object of class '<em>Component Fault Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Fault Tree</em>'.
	 * @generated
	 */
	ComponentFaultTree createComponentFaultTree();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CftPackage getCftPackage();

} //CftFactory
