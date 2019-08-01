/**
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exact Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ExactNumber#getExactNumber <em>Exact Number</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ExactNumber#isExactUnlimited <em>Exact Unlimited</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getExactNumber()
 * @model
 * @generated
 */
public interface ExactNumber extends NumberSpecification
{
  /**
   * Returns the value of the '<em><b>Exact Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exact Number</em>' attribute.
   * @see #setExactNumber(int)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getExactNumber_ExactNumber()
   * @model
   * @generated
   */
  int getExactNumber();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ExactNumber#getExactNumber <em>Exact Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exact Number</em>' attribute.
   * @see #getExactNumber()
   * @generated
   */
  void setExactNumber(int value);

  /**
   * Returns the value of the '<em><b>Exact Unlimited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exact Unlimited</em>' attribute.
   * @see #setExactUnlimited(boolean)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getExactNumber_ExactUnlimited()
   * @model
   * @generated
   */
  boolean isExactUnlimited();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ExactNumber#isExactUnlimited <em>Exact Unlimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exact Unlimited</em>' attribute.
   * @see #isExactUnlimited()
   * @generated
   */
  void setExactUnlimited(boolean value);

} // ExactNumber
