/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getOp <em>Op</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator
	 * @see #setOp(BinaryOperator)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getBinaryExpression_Op()
	 * @model
	 * @generated
	 */
	BinaryOperator getOp();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.BinaryOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(BinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getBinaryExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getBinaryExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.BinaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // BinaryExpression
