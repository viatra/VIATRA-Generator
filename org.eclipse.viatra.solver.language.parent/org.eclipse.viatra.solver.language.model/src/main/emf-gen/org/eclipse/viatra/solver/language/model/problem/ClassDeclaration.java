/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getReferenceDeclarations <em>Reference Declarations</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getNewNode <em>New Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getClassDeclaration()
 * @model
 * @generated
 */
public interface ClassDeclaration extends Relation, Statement {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getClassDeclaration_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getClassDeclaration_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<ClassDeclaration> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Reference Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Declarations</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getClassDeclaration_ReferenceDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceDeclaration> getReferenceDeclarations();

	/**
	 * Returns the value of the '<em><b>New Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Node</em>' containment reference.
	 * @see #setNewNode(Node)
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#getClassDeclaration_NewNode()
	 * @model containment="true"
	 * @generated
	 */
	Node getNewNode();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.model.problem.ClassDeclaration#getNewNode <em>New Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Node</em>' containment reference.
	 * @see #getNewNode()
	 * @generated
	 */
	void setNewNode(Node value);

} // ClassDeclaration
