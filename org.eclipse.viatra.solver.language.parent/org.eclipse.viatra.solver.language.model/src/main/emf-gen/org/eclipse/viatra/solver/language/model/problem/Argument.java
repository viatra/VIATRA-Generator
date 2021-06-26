/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Argument#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Argument#getSingletonVariable <em>Singleton Variable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getArgument_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.Argument#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Singleton Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Variable</em>' containment reference.
	 * @see #setSingletonVariable(ImplicitVariable)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getArgument_SingletonVariable()
	 * @model containment="true"
	 * @generated
	 */
	ImplicitVariable getSingletonVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.Argument#getSingletonVariable <em>Singleton Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Variable</em>' containment reference.
	 * @see #getSingletonVariable()
	 * @generated
	 */
	void setSingletonVariable(ImplicitVariable value);

} // Argument
