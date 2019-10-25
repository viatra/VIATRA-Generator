/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Iff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSIff()
 * @model
 * @generated
 */
public interface ALSIff extends ALSTerm
{
  /**
   * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Operand</em>' containment reference.
   * @see #setLeftOperand(ALSTerm)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSIff_LeftOperand()
   * @model containment="true"
   * @generated
   */
  ALSTerm getLeftOperand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getLeftOperand <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operand</em>' containment reference.
   * @see #getLeftOperand()
   * @generated
   */
  void setLeftOperand(ALSTerm value);

  /**
   * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Operand</em>' containment reference.
   * @see #setRightOperand(ALSTerm)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSIff_RightOperand()
   * @model containment="true"
   * @generated
   */
  ALSTerm getRightOperand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getRightOperand <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Operand</em>' containment reference.
   * @see #getRightOperand()
   * @generated
   */
  void setRightOperand(ALSTerm value);

} // ALSIff
