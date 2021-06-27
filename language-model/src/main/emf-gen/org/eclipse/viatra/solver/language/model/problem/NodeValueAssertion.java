/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Value Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getNodeValueAssertion()
 * @model
 * @generated
 */
public interface NodeValueAssertion extends Statement {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getNodeValueAssertion_Node()
	 * @model
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Constant)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getNodeValueAssertion_Value()
	 * @model containment="true"
	 * @generated
	 */
	Constant getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Constant value);

} // NodeValueAssertion
