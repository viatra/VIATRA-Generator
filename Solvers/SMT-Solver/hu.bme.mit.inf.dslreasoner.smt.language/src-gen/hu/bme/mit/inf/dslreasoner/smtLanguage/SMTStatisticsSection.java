/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMT Statistics Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTStatisticsSection()
 * @model
 * @generated
 */
public interface SMTStatisticsSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#getSMTStatisticsSection_Values()
   * @model containment="true"
   * @generated
   */
  EList<SMTStatisticValue> getValues();

} // SMTStatisticsSection
