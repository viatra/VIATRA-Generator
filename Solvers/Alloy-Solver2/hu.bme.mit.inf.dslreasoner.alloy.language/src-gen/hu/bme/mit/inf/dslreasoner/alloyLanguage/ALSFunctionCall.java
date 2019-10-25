/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALS Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredDefinition <em>Referred Definition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredNumericOperator <em>Referred Numeric Operator</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFunctionCall()
 * @model
 * @generated
 */
public interface ALSFunctionCall extends ALSTerm
{
  /**
   * Returns the value of the '<em><b>Referred Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Definition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred Definition</em>' reference.
   * @see #setReferredDefinition(ALSDefinition)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFunctionCall_ReferredDefinition()
   * @model
   * @generated
   */
  ALSDefinition getReferredDefinition();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredDefinition <em>Referred Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred Definition</em>' reference.
   * @see #getReferredDefinition()
   * @generated
   */
  void setReferredDefinition(ALSDefinition value);

  /**
   * Returns the value of the '<em><b>Referred Numeric Operator</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Numeric Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred Numeric Operator</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator
   * @see #setReferredNumericOperator(ALSNumericOperator)
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFunctionCall_ReferredNumericOperator()
   * @model
   * @generated
   */
  ALSNumericOperator getReferredNumericOperator();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredNumericOperator <em>Referred Numeric Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred Numeric Operator</em>' attribute.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator
   * @see #getReferredNumericOperator()
   * @generated
   */
  void setReferredNumericOperator(ALSNumericOperator value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#getALSFunctionCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<ALSTerm> getParams();

} // ALSFunctionCall
