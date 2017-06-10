/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Fail If Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator#getProbe <em>Probe</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTFailIfCombinator()
 * @model
 * @generated
 */
public interface SMTFailIfCombinator extends SMTReasoningCombinator
{
  /**
   * Returns the value of the '<em><b>Probe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probe</em>' containment reference.
   * @see #setProbe(ReasoningProbe)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTFailIfCombinator_Probe()
   * @model containment="true"
   * @generated
   */
  ReasoningProbe getProbe();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator#getProbe <em>Probe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probe</em>' containment reference.
   * @see #getProbe()
   * @generated
   */
  void setProbe(ReasoningProbe value);

} // SMTFailIfCombinator
