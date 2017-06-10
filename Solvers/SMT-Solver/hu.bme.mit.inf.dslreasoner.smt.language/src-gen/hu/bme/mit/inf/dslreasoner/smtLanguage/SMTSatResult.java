/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Sat Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isSat <em>Sat</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnsat <em>Unsat</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTSatResult()
 * @model
 * @generated
 */
public interface SMTSatResult extends SMTResult
{
  /**
   * Returns the value of the '<em><b>Sat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sat</em>' attribute.
   * @see #setSat(boolean)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTSatResult_Sat()
   * @model
   * @generated
   */
  boolean isSat();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isSat <em>Sat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sat</em>' attribute.
   * @see #isSat()
   * @generated
   */
  void setSat(boolean value);

  /**
   * Returns the value of the '<em><b>Unsat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsat</em>' attribute.
   * @see #setUnsat(boolean)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTSatResult_Unsat()
   * @model
   * @generated
   */
  boolean isUnsat();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnsat <em>Unsat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsat</em>' attribute.
   * @see #isUnsat()
   * @generated
   */
  void setUnsat(boolean value);

  /**
   * Returns the value of the '<em><b>Unknown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unknown</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unknown</em>' attribute.
   * @see #setUnknown(boolean)
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTSatResult_Unknown()
   * @model
   * @generated
   */
  boolean isUnknown();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnknown <em>Unknown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unknown</em>' attribute.
   * @see #isUnknown()
   * @generated
   */
  void setUnknown(boolean value);

} // SMTSatResult
