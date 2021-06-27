/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Or Node Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getVariableOrNode <em>Variable Or Node</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getSingletonVariable <em>Singleton Variable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getVariableOrNodeArgument()
 * @model
 * @generated
 */
public interface VariableOrNodeArgument extends Argument {
	/**
	 * Returns the value of the '<em><b>Variable Or Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Or Node</em>' reference.
	 * @see #setVariableOrNode(VariableOrNode)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getVariableOrNodeArgument_VariableOrNode()
	 * @model
	 * @generated
	 */
	VariableOrNode getVariableOrNode();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getVariableOrNode <em>Variable Or Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Or Node</em>' reference.
	 * @see #getVariableOrNode()
	 * @generated
	 */
	void setVariableOrNode(VariableOrNode value);

	/**
	 * Returns the value of the '<em><b>Singleton Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Variable</em>' containment reference.
	 * @see #setSingletonVariable(ImplicitVariable)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getVariableOrNodeArgument_SingletonVariable()
	 * @model containment="true"
	 * @generated
	 */
	ImplicitVariable getSingletonVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument#getSingletonVariable <em>Singleton Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Variable</em>' containment reference.
	 * @see #getSingletonVariable()
	 * @generated
	 */
	void setSingletonVariable(ImplicitVariable value);

} // VariableOrNodeArgument
