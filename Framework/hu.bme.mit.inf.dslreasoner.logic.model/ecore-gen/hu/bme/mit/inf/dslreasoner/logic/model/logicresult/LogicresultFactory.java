/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage
 * @generated
 */
public interface LogicresultFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicresultFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Result</em>'.
	 * @generated
	 */
	ModelResult createModelResult();

	/**
	 * Returns a new object of class '<em>Inconsistency Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inconsistency Result</em>'.
	 * @generated
	 */
	InconsistencyResult createInconsistencyResult();

	/**
	 * Returns a new object of class '<em>Insuficient Resources Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insuficient Resources Result</em>'.
	 * @generated
	 */
	InsuficientResourcesResult createInsuficientResourcesResult();

	/**
	 * Returns a new object of class '<em>Error Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Result</em>'.
	 * @generated
	 */
	ErrorResult createErrorResult();

	/**
	 * Returns a new object of class '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistics</em>'.
	 * @generated
	 */
	Statistics createStatistics();

	/**
	 * Returns a new object of class '<em>Undecidable Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undecidable Result</em>'.
	 * @generated
	 */
	UndecidableResult createUndecidableResult();

	/**
	 * Returns a new object of class '<em>Int Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Statistic Entry</em>'.
	 * @generated
	 */
	IntStatisticEntry createIntStatisticEntry();

	/**
	 * Returns a new object of class '<em>Real Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Statistic Entry</em>'.
	 * @generated
	 */
	RealStatisticEntry createRealStatisticEntry();

	/**
	 * Returns a new object of class '<em>String Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Statistic Entry</em>'.
	 * @generated
	 */
	StringStatisticEntry createStringStatisticEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogicresultPackage getLogicresultPackage();

} //LogicresultFactory
