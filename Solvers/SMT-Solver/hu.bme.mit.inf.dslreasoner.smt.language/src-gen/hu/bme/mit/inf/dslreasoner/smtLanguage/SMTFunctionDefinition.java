/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getRange <em>Range</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTFunctionDefinition()
 * @model
 * @generated
 */
public interface SMTFunctionDefinition extends SMTSymbolicDeclaration
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTFunctionDefinition_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<SMTSortedVariable> getParameters();

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(SMTTypeReference)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTFunctionDefinition_Range()
   * @model containment="true"
   * @generated
   */
  SMTTypeReference getRange();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(SMTTypeReference value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(SMTTerm)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTFunctionDefinition_Value()
   * @model containment="true"
   * @generated
   */
  SMTTerm getValue();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SMTTerm value);

} // SMTFunctionDefinition
