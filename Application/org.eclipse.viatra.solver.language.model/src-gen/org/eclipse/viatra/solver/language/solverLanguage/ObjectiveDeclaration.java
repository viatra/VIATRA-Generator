/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getObjective <em>Objective</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getObjectiveDeclaration()
 * @model
 * @generated
 */
public interface ObjectiveDeclaration extends Statement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind
	 * @see #setKind(ObjectiveKind)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getObjectiveDeclaration_Kind()
	 * @model
	 * @generated
	 */
	ObjectiveKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ObjectiveKind value);

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference.
	 * @see #setObjective(Expression)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getObjectiveDeclaration_Objective()
	 * @model containment="true"
	 * @generated
	 */
	Expression getObjective();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration#getObjective <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' containment reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(Expression value);

} // ObjectiveDeclaration
