/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getSatResult <em>Sat Result</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getGetModelResult <em>Get Model Result</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTOutput()
 * @model
 * @generated
 */
public interface SMTOutput extends EObject
{
  /**
   * Returns the value of the '<em><b>Sat Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sat Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sat Result</em>' containment reference.
   * @see #setSatResult(SMTResult)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTOutput_SatResult()
   * @model containment="true"
   * @generated
   */
  SMTResult getSatResult();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getSatResult <em>Sat Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sat Result</em>' containment reference.
   * @see #getSatResult()
   * @generated
   */
  void setSatResult(SMTResult value);

  /**
   * Returns the value of the '<em><b>Get Model Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Model Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Model Result</em>' containment reference.
   * @see #setGetModelResult(SMTResult)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTOutput_GetModelResult()
   * @model containment="true"
   * @generated
   */
  SMTResult getGetModelResult();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getGetModelResult <em>Get Model Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Model Result</em>' containment reference.
   * @see #getGetModelResult()
   * @generated
   */
  void setGetModelResult(SMTResult value);

  /**
   * Returns the value of the '<em><b>Statistics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statistics</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statistics</em>' containment reference.
   * @see #setStatistics(SMTStatisticsSection)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTOutput_Statistics()
   * @model containment="true"
   * @generated
   */
  SMTStatisticsSection getStatistics();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getStatistics <em>Statistics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statistics</em>' containment reference.
   * @see #getStatistics()
   * @generated
   */
  void setStatistics(SMTStatisticsSection value);

} // SMTOutput
