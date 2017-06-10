/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Quantified Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getQuantifiedVariables <em>Quantified Variables</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTQuantifiedExpression()
 * @model
 * @generated
 */
public interface SMTQuantifiedExpression extends SMTTerm
{
  /**
   * Returns the value of the '<em><b>Quantified Variables</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Variables</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTQuantifiedExpression_QuantifiedVariables()
   * @model containment="true"
   * @generated
   */
  EList<SMTSortedVariable> getQuantifiedVariables();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(SMTTerm)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTQuantifiedExpression_Expression()
   * @model containment="true"
   * @generated
   */
  SMTTerm getExpression();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(SMTTerm value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(SMTTerm)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTQuantifiedExpression_Pattern()
   * @model containment="true"
   * @generated
   */
  SMTTerm getPattern();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(SMTTerm value);

} // SMTQuantifiedExpression
