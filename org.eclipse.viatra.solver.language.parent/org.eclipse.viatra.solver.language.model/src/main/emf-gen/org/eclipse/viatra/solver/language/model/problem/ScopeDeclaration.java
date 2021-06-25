/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ScopeDeclaration#getTypeScopes <em>Type Scopes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getScopeDeclaration()
 * @model
 * @generated
 */
public interface ScopeDeclaration extends Statement {
	/**
	 * Returns the value of the '<em><b>Type Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.model.problem.TypeScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Scopes</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getScopeDeclaration_TypeScopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeScope> getTypeScopes();

} // ScopeDeclaration
