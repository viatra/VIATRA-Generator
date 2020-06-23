/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Expression#getExistsVariables <em>Exists Variables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends Statement {
	/**
	 * Returns the value of the '<em><b>Exists Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists Variables</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getExpression_ExistsVariables()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Variable> getExistsVariables();

} // Expression
