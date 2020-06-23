/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getUnaryExpression_Body()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator
	 * @see #setOp(UnaryOperator)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getUnaryExpression_Op()
	 * @model
	 * @generated
	 */
	UnaryOperator getOp();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.UnaryExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.UnaryOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(UnaryOperator value);

} // UnaryExpression
