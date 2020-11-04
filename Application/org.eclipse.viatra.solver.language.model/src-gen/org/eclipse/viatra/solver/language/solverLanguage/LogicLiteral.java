/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.LogicLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getLogicLiteral()
 * @model
 * @generated
 */
public interface LogicLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.solver.language.solverLanguage.LogicValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LogicValue
	 * @see #setValue(LogicValue)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getLogicLiteral_Value()
	 * @model
	 * @generated
	 */
	LogicValue getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.LogicLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.LogicValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LogicValue value);

} // LogicLiteral
