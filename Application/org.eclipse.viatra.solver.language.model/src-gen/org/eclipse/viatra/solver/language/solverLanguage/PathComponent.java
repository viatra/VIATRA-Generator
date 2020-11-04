/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isInverse <em>Inverse</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isTransitiveClosure <em>Transitive Closure</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isReflexiveTransitiveClosure <em>Reflexive Transitive Closure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPathComponent()
 * @model
 * @generated
 */
public interface PathComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPathComponent_Symbol()
	 * @model
	 * @generated
	 */
	Symbol getSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Symbol value);

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' attribute.
	 * @see #setInverse(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPathComponent_Inverse()
	 * @model
	 * @generated
	 */
	boolean isInverse();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isInverse <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' attribute.
	 * @see #isInverse()
	 * @generated
	 */
	void setInverse(boolean value);

	/**
	 * Returns the value of the '<em><b>Transitive Closure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive Closure</em>' attribute.
	 * @see #setTransitiveClosure(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPathComponent_TransitiveClosure()
	 * @model
	 * @generated
	 */
	boolean isTransitiveClosure();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isTransitiveClosure <em>Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive Closure</em>' attribute.
	 * @see #isTransitiveClosure()
	 * @generated
	 */
	void setTransitiveClosure(boolean value);

	/**
	 * Returns the value of the '<em><b>Reflexive Transitive Closure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflexive Transitive Closure</em>' attribute.
	 * @see #setReflexiveTransitiveClosure(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPathComponent_ReflexiveTransitiveClosure()
	 * @model
	 * @generated
	 */
	boolean isReflexiveTransitiveClosure();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.PathComponent#isReflexiveTransitiveClosure <em>Reflexive Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflexive Transitive Closure</em>' attribute.
	 * @see #isReflexiveTransitiveClosure()
	 * @generated
	 */
	void setReflexiveTransitiveClosure(boolean value);

} // PathComponent
