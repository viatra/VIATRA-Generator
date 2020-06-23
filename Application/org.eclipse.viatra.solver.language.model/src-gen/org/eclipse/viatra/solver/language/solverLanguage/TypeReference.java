/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.TypeReference#isForceObjectType <em>Force Object Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.TypeReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Force Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Object Type</em>' attribute.
	 * @see #setForceObjectType(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getTypeReference_ForceObjectType()
	 * @model
	 * @generated
	 */
	boolean isForceObjectType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.TypeReference#isForceObjectType <em>Force Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Object Type</em>' attribute.
	 * @see #isForceObjectType()
	 * @generated
	 */
	void setForceObjectType(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getTypeReference_Type()
	 * @model
	 * @generated
	 */
	Symbol getType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.TypeReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Symbol value);

} // TypeReference
