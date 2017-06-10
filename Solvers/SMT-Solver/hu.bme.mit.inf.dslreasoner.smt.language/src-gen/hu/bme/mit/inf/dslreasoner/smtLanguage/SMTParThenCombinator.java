/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Par Then Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getPreProcessingTactic <em>Pre Processing Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getParalellyPostpricessingTactic <em>Paralelly Postpricessing Tactic</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTParThenCombinator()
 * @model
 * @generated
 */
public interface SMTParThenCombinator extends SMTReasoningCombinator
{
  /**
   * Returns the value of the '<em><b>Pre Processing Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Processing Tactic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Processing Tactic</em>' containment reference.
   * @see #setPreProcessingTactic(SMTReasoningTactic)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTParThenCombinator_PreProcessingTactic()
   * @model containment="true"
   * @generated
   */
  SMTReasoningTactic getPreProcessingTactic();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getPreProcessingTactic <em>Pre Processing Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Processing Tactic</em>' containment reference.
   * @see #getPreProcessingTactic()
   * @generated
   */
  void setPreProcessingTactic(SMTReasoningTactic value);

  /**
   * Returns the value of the '<em><b>Paralelly Postpricessing Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paralelly Postpricessing Tactic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paralelly Postpricessing Tactic</em>' containment reference.
   * @see #setParalellyPostpricessingTactic(SMTReasoningTactic)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTParThenCombinator_ParalellyPostpricessingTactic()
   * @model containment="true"
   * @generated
   */
  SMTReasoningTactic getParalellyPostpricessingTactic();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getParalellyPostpricessingTactic <em>Paralelly Postpricessing Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paralelly Postpricessing Tactic</em>' containment reference.
   * @see #getParalellyPostpricessingTactic()
   * @generated
   */
  void setParalellyPostpricessingTactic(SMTReasoningTactic value);

} // SMTParThenCombinator
