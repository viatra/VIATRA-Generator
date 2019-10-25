/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Run Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand#getTypeScopes <em>Type Scopes</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSRunCommand()
 * @model
 * @generated
 */
public interface ALSRunCommand extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Scopes</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Scopes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Scopes</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSRunCommand_TypeScopes()
   * @model containment="true"
   * @generated
   */
  EList<ALSTypeScope> getTypeScopes();

} // ALSRunCommand
