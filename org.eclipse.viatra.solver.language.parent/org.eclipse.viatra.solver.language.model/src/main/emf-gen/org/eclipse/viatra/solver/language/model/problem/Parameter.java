/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Parameter#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Variable {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(ClassDeclaration)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getParameter_ParameterType()
	 * @model
	 * @generated
	 */
	ClassDeclaration getParameterType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.Parameter#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ClassDeclaration value);

} // Parameter
