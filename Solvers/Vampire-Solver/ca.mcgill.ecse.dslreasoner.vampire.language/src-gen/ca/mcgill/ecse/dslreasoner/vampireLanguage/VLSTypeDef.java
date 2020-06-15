/**
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.vampireLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VLS Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getTypeSig <em>Type Sig</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getMapsTo <em>Maps To</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getInitType <em>Init Type</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getNextType <em>Next Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSTypeDef()
 * @model
 * @generated
 */
public interface VLSTypeDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Sig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Sig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Sig</em>' containment reference.
   * @see #setTypeSig(VLSTypeDef)
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSTypeDef_TypeSig()
   * @model containment="true"
   * @generated
   */
  VLSTypeDef getTypeSig();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getTypeSig <em>Type Sig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Sig</em>' containment reference.
   * @see #getTypeSig()
   * @generated
   */
  void setTypeSig(VLSTypeDef value);

  /**
   * Returns the value of the '<em><b>Maps To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maps To</em>' containment reference.
   * @see #setMapsTo(VLSTerm)
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSTypeDef_MapsTo()
   * @model containment="true"
   * @generated
   */
  VLSTerm getMapsTo();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getMapsTo <em>Maps To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maps To</em>' containment reference.
   * @see #getMapsTo()
   * @generated
   */
  void setMapsTo(VLSTerm value);

  /**
   * Returns the value of the '<em><b>Init Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Type</em>' containment reference.
   * @see #setInitType(VLSTerm)
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSTypeDef_InitType()
   * @model containment="true"
   * @generated
   */
  VLSTerm getInitType();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getInitType <em>Init Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Type</em>' containment reference.
   * @see #getInitType()
   * @generated
   */
  void setInitType(VLSTerm value);

  /**
   * Returns the value of the '<em><b>Next Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Type</em>' containment reference.
   * @see #setNextType(VLSTerm)
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSTypeDef_NextType()
   * @model containment="true"
   * @generated
   */
  VLSTerm getNextType();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef#getNextType <em>Next Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Type</em>' containment reference.
   * @see #getNextType()
   * @generated
   */
  void setNextType(VLSTerm value);

} // VLSTypeDef
