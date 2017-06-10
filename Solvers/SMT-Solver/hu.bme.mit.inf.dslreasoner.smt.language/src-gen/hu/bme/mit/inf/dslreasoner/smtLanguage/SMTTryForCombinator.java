/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Try For Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTactic <em>Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTTryForCombinator()
 * @model
 * @generated
 */
public interface SMTTryForCombinator extends SMTReasoningCombinator
{
  /**
   * Returns the value of the '<em><b>Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tactic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tactic</em>' containment reference.
   * @see #setTactic(SMTReasoningTactic)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTTryForCombinator_Tactic()
   * @model containment="true"
   * @generated
   */
  SMTReasoningTactic getTactic();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTactic <em>Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tactic</em>' containment reference.
   * @see #getTactic()
   * @generated
   */
  void setTactic(SMTReasoningTactic value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTTryForCombinator_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

} // SMTTryForCombinator
