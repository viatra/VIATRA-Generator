/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern Aggregation Operator Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getArgumentType <em>Argument Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getExternAggregationOperatorDeclaration()
 * @model
 * @generated
 */
public interface ExternAggregationOperatorDeclaration extends ExternDeclaration {
	/**
	 * Returns the value of the '<em><b>Argument Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Type</em>' reference.
	 * @see #setArgumentType(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getExternAggregationOperatorDeclaration_ArgumentType()
	 * @model
	 * @generated
	 */
	Symbol getArgumentType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getArgumentType <em>Argument Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Type</em>' reference.
	 * @see #getArgumentType()
	 * @generated
	 */
	void setArgumentType(Symbol value);

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' reference.
	 * @see #setResultType(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getExternAggregationOperatorDeclaration_ResultType()
	 * @model
	 * @generated
	 */
	Symbol getResultType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration#getResultType <em>Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' reference.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(Symbol value);

} // ExternAggregationOperatorDeclaration
