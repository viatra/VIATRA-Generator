/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getArgumentType <em>Argument Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAggregationOperator()
 * @model
 * @generated
 */
public interface AggregationOperator extends Symbol {
	/**
	 * Returns the value of the '<em><b>Argument Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Type</em>' reference.
	 * @see #setArgumentType(Datatype)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAggregationOperator_ArgumentType()
	 * @model
	 * @generated
	 */
	Datatype getArgumentType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getArgumentType <em>Argument Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Type</em>' reference.
	 * @see #getArgumentType()
	 * @generated
	 */
	void setArgumentType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' reference.
	 * @see #setResultType(Datatype)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAggregationOperator_ResultType()
	 * @model
	 * @generated
	 */
	Datatype getResultType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator#getResultType <em>Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' reference.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(Datatype value);

} // AggregationOperator
