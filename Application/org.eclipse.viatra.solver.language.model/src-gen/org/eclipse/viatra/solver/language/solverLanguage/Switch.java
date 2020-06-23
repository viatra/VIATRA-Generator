/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Switch#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends Expression {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getSwitch_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Case> getCases();

} // Switch
