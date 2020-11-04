/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Attribute#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Attribute#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAttribute()
 * @model abstract="true"
 * @generated
 */
public interface Attribute extends Statement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAttribute_Target()
	 * @model
	 * @generated
	 */
	Symbol getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Attribute#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Symbol value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.solver.language.solverLanguage.AttributeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AttributeKind
	 * @see #setKind(AttributeKind)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getAttribute_Kind()
	 * @model
	 * @generated
	 */
	AttributeKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Attribute#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.AttributeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AttributeKind value);

} // Attribute
