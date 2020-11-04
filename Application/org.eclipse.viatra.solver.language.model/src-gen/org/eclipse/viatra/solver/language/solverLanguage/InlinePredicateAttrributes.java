/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Predicate Attrributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isFunctional <em>Functional</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getInlinePredicateAttrributes()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InlinePredicateAttrributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getInlinePredicateAttrributes_Error()
	 * @model
	 * @generated
	 */
	boolean isError();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #isError()
	 * @generated
	 */
	void setError(boolean value);

	/**
	 * Returns the value of the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional</em>' attribute.
	 * @see #setFunctional(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getInlinePredicateAttrributes_Functional()
	 * @model
	 * @generated
	 */
	boolean isFunctional();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes#isFunctional <em>Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional</em>' attribute.
	 * @see #isFunctional()
	 * @generated
	 */
	void setFunctional(boolean value);

} // InlinePredicateAttrributes
