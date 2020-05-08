/**
 * generated by Xtext 2.21.0
 */
package org.eclipse.viatra.solver.language.solverLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Reference#getReferred <em>Referred</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Expression
{
  /**
   * Returns the value of the '<em><b>Referred</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred</em>' reference.
   * @see #setReferred(NamedElement)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getReference_Referred()
   * @model
   * @generated
   */
  NamedElement getReferred();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Reference#getReferred <em>Referred</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred</em>' reference.
   * @see #getReferred()
   * @generated
   */
  void setReferred(NamedElement value);

} // Reference
