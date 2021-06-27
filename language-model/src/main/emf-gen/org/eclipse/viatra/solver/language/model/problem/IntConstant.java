/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.IntConstant#getIntValue <em>Int Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getIntConstant()
 * @model
 * @generated
 */
public interface IntConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #setIntValue(int)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getIntConstant_IntValue()
	 * @model default="0"
	 * @generated
	 */
	int getIntValue();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.IntConstant#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(int value);

} // IntConstant
