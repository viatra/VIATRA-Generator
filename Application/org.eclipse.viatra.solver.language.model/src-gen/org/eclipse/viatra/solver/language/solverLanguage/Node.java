/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Node#isNamed <em>Named</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Symbol {
	/**
	 * Returns the value of the '<em><b>Named</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named</em>' attribute.
	 * @see #setNamed(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getNode_Named()
	 * @model
	 * @generated
	 */
	boolean isNamed();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Node#isNamed <em>Named</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named</em>' attribute.
	 * @see #isNamed()
	 * @generated
	 */
	void setNamed(boolean value);

} // Node
