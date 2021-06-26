/**
 */
package org.eclipse.viatra.solver.language.model.problem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getReferenceDeclaration()
 * @model
 * @generated
 */
public interface ReferenceDeclaration extends Relation {
	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' reference.
	 * @see #setReferenceType(Relation)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getReferenceDeclaration_ReferenceType()
	 * @model
	 * @generated
	 */
	Relation getReferenceType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getReferenceType <em>Reference Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' reference.
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(Relation value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(ReferenceDeclaration)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getReferenceDeclaration_Opposite()
	 * @model
	 * @generated
	 */
	ReferenceDeclaration getOpposite();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(ReferenceDeclaration value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getReferenceDeclaration_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getReferenceDeclaration_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

} // ReferenceDeclaration
