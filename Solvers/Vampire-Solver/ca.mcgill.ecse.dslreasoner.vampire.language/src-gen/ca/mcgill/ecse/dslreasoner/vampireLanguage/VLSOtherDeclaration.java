/**
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.vampireLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VLS Other Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSOtherDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSOtherDeclaration()
 * @model
 * @generated
 */
public interface VLSOtherDeclaration extends VLSDeclaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(VLSTerm)
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSOtherDeclaration_Name()
   * @model containment="true"
   * @generated
   */
  VLSTerm getName();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSOtherDeclaration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(VLSTerm value);

} // VLSOtherDeclaration
