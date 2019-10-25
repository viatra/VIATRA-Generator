/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Direct Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftMultiplicit <em>Left Multiplicit</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightMultiplicit <em>Right Multiplicit</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDirectProduct()
 * @model
 * @generated
 */
public interface ALSDirectProduct extends ALSTerm
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
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDirectProduct_LeftOperand()
   * @model containment="true"
   * @generated
   */
  ALSTerm getLeftOperand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftOperand <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operand</em>' containment reference.
   * @see #getLeftOperand()
   * @generated
   */
  void setLeftOperand(ALSTerm value);

  /**
   * Returns the value of the '<em><b>Left Multiplicit</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Multiplicit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Multiplicit</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @see #setLeftMultiplicit(ALSMultiplicity)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDirectProduct_LeftMultiplicit()
   * @model
   * @generated
   */
  ALSMultiplicity getLeftMultiplicit();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftMultiplicit <em>Left Multiplicit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Multiplicit</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @see #getLeftMultiplicit()
   * @generated
   */
  void setLeftMultiplicit(ALSMultiplicity value);

  /**
   * Returns the value of the '<em><b>Right Multiplicit</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Multiplicit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Multiplicit</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @see #setRightMultiplicit(ALSMultiplicity)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDirectProduct_RightMultiplicit()
   * @model
   * @generated
   */
  ALSMultiplicity getRightMultiplicit();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightMultiplicit <em>Right Multiplicit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Multiplicit</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @see #getRightMultiplicit()
   * @generated
   */
  void setRightMultiplicit(ALSMultiplicity value);

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
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDirectProduct_RightOperand()
   * @model containment="true"
   * @generated
   */
  ALSTerm getRightOperand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightOperand <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Operand</em>' containment reference.
   * @see #getRightOperand()
   * @generated
   */
  void setRightOperand(ALSTerm value);

} // ALSDirectProduct
