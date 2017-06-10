/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Complex Sat Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTComplexSatCommand()
 * @model
 * @generated
 */
public interface SMTComplexSatCommand extends SMTSatCommand
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(SMTReasoningTactic)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTComplexSatCommand_Method()
   * @model containment="true"
   * @generated
   */
  SMTReasoningTactic getMethod();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(SMTReasoningTactic value);

} // SMTComplexSatCommand
