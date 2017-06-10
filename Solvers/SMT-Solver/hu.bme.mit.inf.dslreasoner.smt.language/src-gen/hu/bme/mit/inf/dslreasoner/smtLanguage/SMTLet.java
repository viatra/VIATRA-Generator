/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Let</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet#getInlineConstantDefinitions <em>Inline Constant Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTLet()
 * @model
 * @generated
 */
public interface SMTLet extends SMTTerm
{
  /**
   * Returns the value of the '<em><b>Inline Constant Definitions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inline Constant Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inline Constant Definitions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTLet_InlineConstantDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<SMTInlineConstantDefinition> getInlineConstantDefinitions();

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(SMTTerm)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTLet_Term()
   * @model containment="true"
   * @generated
   */
  SMTTerm getTerm();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(SMTTerm value);

} // SMTLet
