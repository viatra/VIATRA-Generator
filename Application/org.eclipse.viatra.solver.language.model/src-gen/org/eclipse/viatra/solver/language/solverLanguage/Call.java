/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Expression {
	/**
	 * Returns the value of the '<em><b>Functor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functor</em>' containment reference.
	 * @see #setFunctor(Reference)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall_Functor()
	 * @model containment="true"
	 * @generated
	 */
	Reference getFunctor();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getFunctor <em>Functor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functor</em>' containment reference.
	 * @see #getFunctor()
	 * @generated
	 */
	void setFunctor(Reference value);

	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference.
	 * @see #setArgumentList(ArgumentList)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getCall_ArgumentList()
	 * @model containment="true"
	 * @generated
	 */
	ArgumentList getArgumentList();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Call#getArgumentList <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument List</em>' containment reference.
	 * @see #getArgumentList()
	 * @generated
	 */
	void setArgumentList(ArgumentList value);

} // Call
