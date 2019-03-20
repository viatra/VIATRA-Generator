/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Model Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelSpecification#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getPartialModelSpecification()
 * @model
 * @generated
 */
public interface PartialModelSpecification extends PartialModel
{
  /**
   * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getPartialModelSpecification_Entry()
   * @model containment="true"
   * @generated
   */
  EList<PartialModelEntry> getEntry();

} // PartialModelSpecification
