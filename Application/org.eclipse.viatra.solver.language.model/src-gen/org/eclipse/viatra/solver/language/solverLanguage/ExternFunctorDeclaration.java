/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern Functor Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getExternFunctorDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface ExternFunctorDeclaration extends ExternDeclaration {
	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference.
	 * @see #setArgumentList(ArgumentList)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getExternFunctorDeclaration_ArgumentList()
	 * @model containment="true"
	 * @generated
	 */
	ArgumentList getArgumentList();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration#getArgumentList <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument List</em>' containment reference.
	 * @see #getArgumentList()
	 * @generated
	 */
	void setArgumentList(ArgumentList value);

} // ExternFunctorDeclaration
