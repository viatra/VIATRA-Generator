/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.FunctionDefinition#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends FunctorDefiniton {
	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' reference.
	 * @see #setResultType(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getFunctionDefinition_ResultType()
	 * @model
	 * @generated
	 */
	Symbol getResultType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.FunctionDefinition#getResultType <em>Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' reference.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(Symbol value);

} // FunctionDefinition
