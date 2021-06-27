/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends Statement {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAssertion_Relation()
	 * @model
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.model.problem.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAssertion_Arguments()
	 * @model
	 * @generated
	 */
	EList<Node> getArguments();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.solver.language.model.problem.LogicValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.model.problem.LogicValue
	 * @see #setValue(LogicValue)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getAssertion_Value()
	 * @model
	 * @generated
	 */
	LogicValue getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.Assertion#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.model.problem.LogicValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LogicValue value);

} // Assertion
