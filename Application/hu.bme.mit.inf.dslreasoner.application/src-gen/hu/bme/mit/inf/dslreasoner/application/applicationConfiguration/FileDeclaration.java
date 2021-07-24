/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileDeclaration#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getFileDeclaration()
 * @model
 * @generated
 */
public interface FileDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification</em>' containment reference.
   * @see #setSpecification(FileSpecification)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getFileDeclaration_Specification()
   * @model containment="true"
   * @generated
   */
  FileSpecification getSpecification();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileDeclaration#getSpecification <em>Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification</em>' containment reference.
   * @see #getSpecification()
   * @generated
   */
  void setSpecification(FileSpecification value);

} // FileDeclaration