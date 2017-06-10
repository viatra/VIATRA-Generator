/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Or Else Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator#getTactics <em>Tactics</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTOrElseCombinator()
 * @model
 * @generated
 */
public interface SMTOrElseCombinator extends SMTReasoningCombinator
{
  /**
   * Returns the value of the '<em><b>Tactics</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tactics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tactics</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTOrElseCombinator_Tactics()
   * @model containment="true"
   * @generated
   */
  EList<SMTReasoningTactic> getTactics();

} // SMTOrElseCombinator
