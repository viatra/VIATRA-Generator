/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Signature Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getSuperset <em>Superset</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSSignatureBody()
 * @model
 * @generated
 */
public interface ALSSignatureBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @see #setMultiplicity(ALSMultiplicity)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSSignatureBody_Multiplicity()
   * @model
   * @generated
   */
  ALSMultiplicity getMultiplicity();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(ALSMultiplicity value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSSignatureBody_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSSignatureBody_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<ALSSignatureDeclaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Supertype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supertype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supertype</em>' reference.
   * @see #setSupertype(ALSSignatureDeclaration)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSSignatureBody_Supertype()
   * @model
   * @generated
   */
  ALSSignatureDeclaration getSupertype();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getSupertype <em>Supertype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supertype</em>' reference.
   * @see #getSupertype()
   * @generated
   */
  void setSupertype(ALSSignatureDeclaration value);

  /**
   * Returns the value of the '<em><b>Superset</b></em>' reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superset</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superset</em>' reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSSignatureBody_Superset()
   * @model
   * @generated
   */
  EList<ALSSignatureDeclaration> getSuperset();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSSignatureBody_Fields()
   * @model containment="true"
   * @generated
   */
  EList<ALSFieldDeclaration> getFields();

} // ALSSignatureBody
