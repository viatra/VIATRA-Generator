/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getEnumDeclarations <em>Enum Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getSignatureBodies <em>Signature Bodies</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getFunctionDefinitions <em>Function Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getRelationDefinitions <em>Relation Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getFactDeclarations <em>Fact Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getRunCommand <em>Run Command</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDocument()
 * @model
 * @generated
 */
public interface ALSDocument extends EObject
{
  /**
   * Returns the value of the '<em><b>Enum Declarations</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Declarations</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDocument_EnumDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<ALSEnumDeclaration> getEnumDeclarations();

  /**
   * Returns the value of the '<em><b>Signature Bodies</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature Bodies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature Bodies</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDocument_SignatureBodies()
   * @model containment="true"
   * @generated
   */
  EList<ALSSignatureBody> getSignatureBodies();

  /**
   * Returns the value of the '<em><b>Function Definitions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Definitions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDocument_FunctionDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<ALSFunctionDefinition> getFunctionDefinitions();

  /**
   * Returns the value of the '<em><b>Relation Definitions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation Definitions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDocument_RelationDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<ALSRelationDefinition> getRelationDefinitions();

  /**
   * Returns the value of the '<em><b>Fact Declarations</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact Declarations</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDocument_FactDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<ALSFactDeclaration> getFactDeclarations();

  /**
   * Returns the value of the '<em><b>Run Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Command</em>' containment reference.
   * @see #setRunCommand(ALSRunCommand)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSDocument_RunCommand()
   * @model containment="true"
   * @generated
   */
  ALSRunCommand getRunCommand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getRunCommand <em>Run Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Command</em>' containment reference.
   * @see #getRunCommand()
   * @generated
   */
  void setRunCommand(ALSRunCommand value);

} // ALSDocument
