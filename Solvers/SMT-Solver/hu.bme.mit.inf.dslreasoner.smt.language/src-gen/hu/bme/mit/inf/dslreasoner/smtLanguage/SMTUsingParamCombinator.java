/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Using Param Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator#getTactic <em>Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTUsingParamCombinator()
 * @model
 * @generated
 */
public interface SMTUsingParamCombinator extends SMTReasoningCombinator
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
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTUsingParamCombinator_Tactic()
   * @model containment="true"
   * @generated
   */
  SMTReasoningTactic getTactic();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator#getTactic <em>Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tactic</em>' containment reference.
   * @see #getTactic()
   * @generated
   */
  void setTactic(SMTReasoningTactic value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTUsingParamCombinator_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ReasoningTacticParameter> getParameters();

} // SMTUsingParamCombinator
