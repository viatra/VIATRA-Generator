/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Fact Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFactDeclaration()
 * @model
 * @generated
 */
public interface ALSFactDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFactDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(ALSTerm)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFactDeclaration_Term()
   * @model containment="true"
   * @generated
   */
  ALSTerm getTerm();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(ALSTerm value);

} // ALSFactDeclaration
