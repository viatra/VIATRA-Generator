/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression#getForallVariables <em>Forall Variables</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAggregateExpression()
 * @model abstract="true"
 * @generated
 */
public interface AggregateExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Forall Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forall Variables</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAggregateExpression_ForallVariables()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Variable> getForallVariables();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAggregateExpression_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // AggregateExpression
