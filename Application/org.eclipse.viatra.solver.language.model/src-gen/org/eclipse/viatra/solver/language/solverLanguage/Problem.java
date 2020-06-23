/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getProblem()
 * @model
 * @generated
 */
public interface Problem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getProblem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Problem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getProblem_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.Symbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getProblem_Symbols()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Symbol> getSymbols();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getProblem_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // Problem
