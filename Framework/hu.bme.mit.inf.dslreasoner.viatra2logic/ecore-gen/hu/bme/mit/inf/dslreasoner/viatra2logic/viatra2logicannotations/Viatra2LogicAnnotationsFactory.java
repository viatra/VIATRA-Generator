/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
 * @generated
 */
public interface Viatra2LogicAnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Viatra2LogicAnnotationsFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.Viatra2LogicAnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transfomed Viatra Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfomed Viatra Query</em>'.
	 * @generated
	 */
	TransfomedViatraQuery createTransfomedViatraQuery();

	/**
	 * Returns a new object of class '<em>Transformed Viatra Wellformedness Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformed Viatra Wellformedness Constraint</em>'.
	 * @generated
	 */
	TransformedViatraWellformednessConstraint createTransformedViatraWellformednessConstraint();

	/**
	 * Returns a new object of class '<em>Defined By Derived Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defined By Derived Feature</em>'.
	 * @generated
	 */
	DefinedByDerivedFeature createDefinedByDerivedFeature();

	/**
	 * Returns a new object of class '<em>Variable Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Mapping</em>'.
	 * @generated
	 */
	VariableMapping createVariableMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Viatra2LogicAnnotationsPackage getViatra2LogicAnnotationsPackage();

} //Viatra2LogicAnnotationsFactory
