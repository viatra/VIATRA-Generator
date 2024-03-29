/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport#getImportedPackage <em>Imported Package</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getEPackageImport()
 * @model
 * @generated
 */
public interface EPackageImport extends Import
{
  /**
   * Returns the value of the '<em><b>Imported Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Package</em>' reference.
   * @see #setImportedPackage(EPackage)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getEPackageImport_ImportedPackage()
   * @model
   * @generated
   */
  EPackage getImportedPackage();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport#getImportedPackage <em>Imported Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Package</em>' reference.
   * @see #getImportedPackage()
   * @generated
   */
  void setImportedPackage(EPackage value);

} // EPackageImport
