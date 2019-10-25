/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFunctionDefinition()
 * @model
 * @generated
 */
public interface ALSFunctionDefinition extends ALSDefinition
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ALSTerm)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFunctionDefinition_Type()
   * @model containment="true"
   * @generated
   */
  ALSTerm getType();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ALSTerm value);

} // ALSFunctionDefinition
