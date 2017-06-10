/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
 * @generated
 */
public interface Ecore2logicannotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ecore2logicannotationsFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multiplicity Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Assertion</em>'.
	 * @generated
	 */
	MultiplicityAssertion createMultiplicityAssertion();

	/**
	 * Returns a new object of class '<em>Inverse Relation Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverse Relation Assertion</em>'.
	 * @generated
	 */
	InverseRelationAssertion createInverseRelationAssertion();

	/**
	 * Returns a new object of class '<em>Lower Multiplicity Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Multiplicity Assertion</em>'.
	 * @generated
	 */
	LowerMultiplicityAssertion createLowerMultiplicityAssertion();

	/**
	 * Returns a new object of class '<em>Upper Multiplicity Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upper Multiplicity Assertion</em>'.
	 * @generated
	 */
	UpperMultiplicityAssertion createUpperMultiplicityAssertion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ecore2logicannotationsPackage getEcore2logicannotationsPackage();

} //Ecore2logicannotationsFactory
