/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Symbolic Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue#getSymbolicReference <em>Symbolic Reference</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue#getParameterSubstitutions <em>Parameter Substitutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTSymbolicValue()
 * @model
 * @generated
 */
public interface SMTSymbolicValue extends SMTTerm
{
  /**
   * Returns the value of the '<em><b>Symbolic Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolic Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolic Reference</em>' reference.
   * @see #setSymbolicReference(SMTSymbolicDeclaration)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTSymbolicValue_SymbolicReference()
   * @model
   * @generated
   */
  SMTSymbolicDeclaration getSymbolicReference();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue#getSymbolicReference <em>Symbolic Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolic Reference</em>' reference.
   * @see #getSymbolicReference()
   * @generated
   */
  void setSymbolicReference(SMTSymbolicDeclaration value);

  /**
   * Returns the value of the '<em><b>Parameter Substitutions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Substitutions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Substitutions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTSymbolicValue_ParameterSubstitutions()
   * @model containment="true"
   * @generated
   */
  EList<SMTTerm> getParameterSubstitutions();

} // SMTSymbolicValue
