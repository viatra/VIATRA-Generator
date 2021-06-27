/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Assertion Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getConstantAssertionArgument()
 * @model
 * @generated
 */
public interface ConstantAssertionArgument extends AssertionArgument {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(Constant)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getConstantAssertionArgument_Constant()
	 * @model containment="true"
	 * @generated
	 */
	Constant getConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(Constant value);

} // ConstantAssertionArgument
