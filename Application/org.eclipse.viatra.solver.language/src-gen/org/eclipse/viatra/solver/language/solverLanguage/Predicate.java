/**
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Predicate#isIsError <em>Is Error</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Predicate#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Predicate#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Predicate#getBodies <em>Bodies</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends Statement
{
  /**
   * Returns the value of the '<em><b>Is Error</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Error</em>' attribute.
   * @see #setIsError(boolean)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPredicate_IsError()
   * @model
   * @generated
   */
  boolean isIsError();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Predicate#isIsError <em>Is Error</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Error</em>' attribute.
   * @see #isIsError()
   * @generated
   */
  void setIsError(boolean value);

  /**
   * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' containment reference.
   * @see #setSymbol(ModelSymbol)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPredicate_Symbol()
   * @model containment="true"
   * @generated
   */
  ModelSymbol getSymbol();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Predicate#getSymbol <em>Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' containment reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(ModelSymbol value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPredicate_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.PatternBody}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bodies</em>' containment reference list.
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getPredicate_Bodies()
   * @model containment="true"
   * @generated
   */
  EList<PatternBody> getBodies();

} // Predicate
