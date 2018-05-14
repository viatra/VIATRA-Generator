/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsPackage
 * @generated
 */
public interface Partial2logicannotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Partial2logicannotationsFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.Partial2logicannotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Partial Model Relation2 Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Model Relation2 Assertion</em>'.
	 * @generated
	 */
	PartialModelRelation2Assertion createPartialModelRelation2Assertion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Partial2logicannotationsPackage getPartial2logicannotationsPackage();

} //Partial2logicannotationsFactory
