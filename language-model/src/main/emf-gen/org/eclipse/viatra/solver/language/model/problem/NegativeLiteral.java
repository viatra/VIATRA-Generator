/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.NegativeLiteral#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getNegativeLiteral()
 * @model
 * @generated
 */
public interface NegativeLiteral extends ExistentialQuantifier, Literal {
	/**
	 * Returns the value of the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom</em>' containment reference.
	 * @see #setAtom(Atom)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getNegativeLiteral_Atom()
	 * @model containment="true"
	 * @generated
	 */
	Atom getAtom();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.NegativeLiteral#getAtom <em>Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom</em>' containment reference.
	 * @see #getAtom()
	 * @generated
	 */
	void setAtom(Atom value);

} // NegativeLiteral
