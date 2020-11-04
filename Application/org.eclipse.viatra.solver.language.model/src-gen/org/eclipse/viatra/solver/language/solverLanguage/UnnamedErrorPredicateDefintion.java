/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnamed Error Predicate Defintion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getUnnamedErrorPredicateDefintion()
 * @model
 * @generated
 */
public interface UnnamedErrorPredicateDefintion extends Statement {
	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference.
	 * @see #setArgumentList(ArgumentList)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getUnnamedErrorPredicateDefintion_ArgumentList()
	 * @model containment="true"
	 * @generated
	 */
	ArgumentList getArgumentList();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getArgumentList <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument List</em>' containment reference.
	 * @see #getArgumentList()
	 * @generated
	 */
	void setArgumentList(ArgumentList value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getUnnamedErrorPredicateDefintion_Body()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

} // UnnamedErrorPredicateDefintion
