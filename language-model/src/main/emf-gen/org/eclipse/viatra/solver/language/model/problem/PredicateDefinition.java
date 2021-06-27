/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#isError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#getBodies <em>Bodies</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getPredicateDefinition()
 * @model
 * @generated
 */
public interface PredicateDefinition extends Relation, Statement {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(boolean)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getPredicateDefinition_Error()
	 * @model
	 * @generated
	 */
	boolean isError();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.PredicateDefinition#isError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #isError()
	 * @generated
	 */
	void setError(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.model.problem.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getPredicateDefinition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.model.problem.Conjunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodies</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getPredicateDefinition_Bodies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conjunction> getBodies();

} // PredicateDefinition
