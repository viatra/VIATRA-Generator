/**
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RuntimeEntry#getMillisecLimit <em>Millisec Limit</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getRuntimeEntry()
 * @model
 * @generated
 */
public interface RuntimeEntry extends ConfigEntry
{
  /**
   * Returns the value of the '<em><b>Millisec Limit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Millisec Limit</em>' attribute.
   * @see #setMillisecLimit(int)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getRuntimeEntry_MillisecLimit()
   * @model
   * @generated
   */
  int getMillisecLimit();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RuntimeEntry#getMillisecLimit <em>Millisec Limit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Millisec Limit</em>' attribute.
   * @see #getMillisecLimit()
   * @generated
   */
  void setMillisecLimit(int value);

} // RuntimeEntry
