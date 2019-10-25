/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Reflective Transitive Closure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSReflectiveTransitiveClosure()
 * @model
 * @generated
 */
public interface ALSReflectiveTransitiveClosure extends ALSTerm
{
  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(ALSTerm)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSReflectiveTransitiveClosure_Operand()
   * @model containment="true"
   * @generated
   */
  ALSTerm getOperand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(ALSTerm value);

} // ALSReflectiveTransitiveClosure
