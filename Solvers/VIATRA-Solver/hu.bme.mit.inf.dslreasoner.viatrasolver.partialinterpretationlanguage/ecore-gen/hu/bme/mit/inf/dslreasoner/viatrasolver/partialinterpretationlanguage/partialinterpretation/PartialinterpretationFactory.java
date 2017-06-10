/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
 * @generated
 */
public interface PartialinterpretationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartialinterpretationFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Partial Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Interpretation</em>'.
	 * @generated
	 */
	PartialInterpretation createPartialInterpretation();

	/**
	 * Returns a new object of class '<em>Partial Constant Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Constant Interpretation</em>'.
	 * @generated
	 */
	PartialConstantInterpretation createPartialConstantInterpretation();

	/**
	 * Returns a new object of class '<em>Partial Relation Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Relation Interpretation</em>'.
	 * @generated
	 */
	PartialRelationInterpretation createPartialRelationInterpretation();

	/**
	 * Returns a new object of class '<em>Partial Function Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Function Interpretation</em>'.
	 * @generated
	 */
	PartialFunctionInterpretation createPartialFunctionInterpretation();

	/**
	 * Returns a new object of class '<em>Partial Type Interpratation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Type Interpratation</em>'.
	 * @generated
	 */
	PartialTypeInterpratation createPartialTypeInterpratation();

	/**
	 * Returns a new object of class '<em>Unary Element Relation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Element Relation Link</em>'.
	 * @generated
	 */
	UnaryElementRelationLink createUnaryElementRelationLink();

	/**
	 * Returns a new object of class '<em>Binary Element Relation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Element Relation Link</em>'.
	 * @generated
	 */
	BinaryElementRelationLink createBinaryElementRelationLink();

	/**
	 * Returns a new object of class '<em>Nary Relation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nary Relation Link</em>'.
	 * @generated
	 */
	NaryRelationLink createNaryRelationLink();

	/**
	 * Returns a new object of class '<em>Nary Relation Link Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nary Relation Link Element</em>'.
	 * @generated
	 */
	NaryRelationLinkElement createNaryRelationLinkElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PartialinterpretationPackage getPartialinterpretationPackage();

} //PartialinterpretationFactory
