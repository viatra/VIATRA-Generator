/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getOptions <em>Options</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getTypeDeclarations <em>Type Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getFunctionDeclarations <em>Function Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getSatCommand <em>Sat Command</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getGetModelCommand <em>Get Model Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput()
 * @model
 * @generated
 */
public interface SMTInput extends EObject
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput_Options()
   * @model containment="true"
   * @generated
   */
  EList<SMTOption> getOptions();

  /**
   * Returns the value of the '<em><b>Type Declarations</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Declarations</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput_TypeDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<SMTType> getTypeDeclarations();

  /**
   * Returns the value of the '<em><b>Function Declarations</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Declarations</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput_FunctionDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<SMTFunctionDeclaration> getFunctionDeclarations();

  /**
   * Returns the value of the '<em><b>Function Definition</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Definition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Definition</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput_FunctionDefinition()
   * @model containment="true"
   * @generated
   */
  EList<SMTFunctionDefinition> getFunctionDefinition();

  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput_Assertions()
   * @model containment="true"
   * @generated
   */
  EList<SMTAssertion> getAssertions();

  /**
   * Returns the value of the '<em><b>Sat Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sat Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sat Command</em>' containment reference.
   * @see #setSatCommand(SMTSatCommand)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput_SatCommand()
   * @model containment="true"
   * @generated
   */
  SMTSatCommand getSatCommand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getSatCommand <em>Sat Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sat Command</em>' containment reference.
   * @see #getSatCommand()
   * @generated
   */
  void setSatCommand(SMTSatCommand value);

  /**
   * Returns the value of the '<em><b>Get Model Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Model Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Model Command</em>' containment reference.
   * @see #setGetModelCommand(SMTGetModelCommand)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTInput_GetModelCommand()
   * @model containment="true"
   * @generated
   */
  SMTGetModelCommand getGetModelCommand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getGetModelCommand <em>Get Model Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Model Command</em>' containment reference.
   * @see #getGetModelCommand()
   * @generated
   */
  void setGetModelCommand(SMTGetModelCommand value);

} // SMTInput
