/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Model Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getNewFunctionDeclarations <em>New Function Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getNewFunctionDefinitions <em>New Function Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTModelResult()
 * @model
 * @generated
 */
public interface SMTModelResult extends SMTResult
{
  /**
   * Returns the value of the '<em><b>New Function Declarations</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Function Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Function Declarations</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTModelResult_NewFunctionDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<SMTFunctionDeclaration> getNewFunctionDeclarations();

  /**
   * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definitions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTModelResult_TypeDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<SMTCardinalityConstraint> getTypeDefinitions();

  /**
   * Returns the value of the '<em><b>New Function Definitions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Function Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Function Definitions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTModelResult_NewFunctionDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<SMTFunctionDefinition> getNewFunctionDefinitions();

} // SMTModelResult
