/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTAssertion()
 * @model
 * @generated
 */
public interface SMTAssertion extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(SMTTerm)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTAssertion_Value()
   * @model containment="true"
   * @generated
   */
  SMTTerm getValue();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SMTTerm value);

} // SMTAssertion
