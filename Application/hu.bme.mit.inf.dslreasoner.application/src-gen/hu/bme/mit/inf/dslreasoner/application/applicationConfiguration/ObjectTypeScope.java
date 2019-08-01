/**
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectTypeScope#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getObjectTypeScope()
 * @model
 * @generated
 */
public interface ObjectTypeScope extends TypeScope
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ObjectReference)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getObjectTypeScope_Type()
   * @model containment="true"
   * @generated
   */
  ObjectReference getType();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectTypeScope#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ObjectReference value);

} // ObjectTypeScope
