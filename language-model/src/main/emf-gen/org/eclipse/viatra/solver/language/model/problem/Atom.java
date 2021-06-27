/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Atom#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Atom#isTransitiveClosure <em>Transitive Closure</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Atom#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends Literal {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAtom_Relation()
	 * @model
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.Atom#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.model.problem.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAtom_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Transitive Closure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive Closure</em>' attribute.
	 * @see #setTransitiveClosure(boolean)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAtom_TransitiveClosure()
	 * @model
	 * @generated
	 */
	boolean isTransitiveClosure();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.Atom#isTransitiveClosure <em>Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive Closure</em>' attribute.
	 * @see #isTransitiveClosure()
	 * @generated
	 */
	void setTransitiveClosure(boolean value);

} // Atom
