/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Inline Constant Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInlineConstantDefinition()
 * @model
 * @generated
 */
public interface SMTInlineConstantDefinition extends SMTSymbolicDeclaration
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(SMTTerm)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInlineConstantDefinition_Definition()
   * @model containment="true"
   * @generated
   */
  SMTTerm getDefinition();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(SMTTerm value);

} // SMTInlineConstantDefinition
