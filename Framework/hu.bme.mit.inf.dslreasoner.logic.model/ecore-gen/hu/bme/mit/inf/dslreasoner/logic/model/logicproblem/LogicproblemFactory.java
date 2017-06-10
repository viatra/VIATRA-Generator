/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
 * @generated
 */
public interface LogicproblemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicproblemFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logic Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Problem</em>'.
	 * @generated
	 */
	LogicProblem createLogicProblem();

	/**
	 * Returns a new object of class '<em>Containment Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Hierarchy</em>'.
	 * @generated
	 */
	ContainmentHierarchy createContainmentHierarchy();

	/**
	 * Returns a new object of class '<em>Relation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Annotation</em>'.
	 * @generated
	 */
	RelationAnnotation createRelationAnnotation();

	/**
	 * Returns a new object of class '<em>Constant Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Annotation</em>'.
	 * @generated
	 */
	ConstantAnnotation createConstantAnnotation();

	/**
	 * Returns a new object of class '<em>Function Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Annotation</em>'.
	 * @generated
	 */
	FunctionAnnotation createFunctionAnnotation();

	/**
	 * Returns a new object of class '<em>Assertion Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Annotation</em>'.
	 * @generated
	 */
	AssertionAnnotation createAssertionAnnotation();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogicproblemPackage getLogicproblemPackage();

} //LogicproblemFactory
