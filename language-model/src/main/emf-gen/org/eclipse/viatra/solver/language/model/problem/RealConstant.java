/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.RealConstant#getRealValue <em>Real Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getRealConstant()
 * @model
 * @generated
 */
public interface RealConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Real Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Value</em>' attribute.
	 * @see #setRealValue(double)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getRealConstant_RealValue()
	 * @model default="0.0"
	 * @generated
	 */
	double getRealValue();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.RealConstant#getRealValue <em>Real Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Value</em>' attribute.
	 * @see #getRealValue()
	 * @generated
	 */
	void setRealValue(double value);

} // RealConstant
