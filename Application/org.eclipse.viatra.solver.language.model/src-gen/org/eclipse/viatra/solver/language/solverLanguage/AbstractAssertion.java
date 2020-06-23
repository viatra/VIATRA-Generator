/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAbstractAssertion()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAssertion extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAbstractAssertion_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAbstractAssertion_Range()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRange();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.AbstractAssertion#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Expression value);

} // AbstractAssertion
