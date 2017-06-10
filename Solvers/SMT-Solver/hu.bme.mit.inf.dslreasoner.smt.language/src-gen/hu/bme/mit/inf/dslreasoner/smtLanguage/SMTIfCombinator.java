/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT If Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getProbe <em>Probe</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getIfTactic <em>If Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getElseTactic <em>Else Tactic</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTIfCombinator()
 * @model
 * @generated
 */
public interface SMTIfCombinator extends SMTReasoningCombinator
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
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTIfCombinator_Probe()
   * @model containment="true"
   * @generated
   */
  ReasoningProbe getProbe();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getProbe <em>Probe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probe</em>' containment reference.
   * @see #getProbe()
   * @generated
   */
  void setProbe(ReasoningProbe value);

  /**
   * Returns the value of the '<em><b>If Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Tactic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Tactic</em>' containment reference.
   * @see #setIfTactic(SMTReasoningTactic)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTIfCombinator_IfTactic()
   * @model containment="true"
   * @generated
   */
  SMTReasoningTactic getIfTactic();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getIfTactic <em>If Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Tactic</em>' containment reference.
   * @see #getIfTactic()
   * @generated
   */
  void setIfTactic(SMTReasoningTactic value);

  /**
   * Returns the value of the '<em><b>Else Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Tactic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Tactic</em>' containment reference.
   * @see #setElseTactic(SMTReasoningTactic)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTIfCombinator_ElseTactic()
   * @model containment="true"
   * @generated
   */
  SMTReasoningTactic getElseTactic();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getElseTactic <em>Else Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Tactic</em>' containment reference.
   * @see #getElseTactic()
   * @generated
   */
  void setElseTactic(SMTReasoningTactic value);

} // SMTIfCombinator
