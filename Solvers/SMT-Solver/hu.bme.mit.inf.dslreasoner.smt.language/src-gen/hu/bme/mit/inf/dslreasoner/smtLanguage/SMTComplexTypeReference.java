/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Complex Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference#getReferred <em>Referred</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTComplexTypeReference()
 * @model
 * @generated
 */
public interface SMTComplexTypeReference extends SMTTypeReference
{
  /**
   * Returns the value of the '<em><b>Referred</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred</em>' reference.
   * @see #setReferred(SMTType)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTComplexTypeReference_Referred()
   * @model
   * @generated
   */
  SMTType getReferred();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference#getReferred <em>Referred</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred</em>' reference.
   * @see #getReferred()
   * @generated
   */
  void setReferred(SMTType value);

} // SMTComplexTypeReference
