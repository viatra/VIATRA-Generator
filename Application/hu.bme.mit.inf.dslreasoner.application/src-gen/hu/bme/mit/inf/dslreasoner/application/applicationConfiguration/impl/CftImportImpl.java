/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl;

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.CftImport;

import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cft Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.CftImportImpl#getImportedCft <em>Imported Cft</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CftImportImpl extends ImportImpl implements CftImport
{
  /**
   * The cached value of the '{@link #getImportedCft() <em>Imported Cft</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedCft()
   * @generated
   * @ordered
   */
  protected CftModel importedCft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CftImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplicationConfigurationPackage.Literals.CFT_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CftModel getImportedCft()
  {
    if (importedCft != null && importedCft.eIsProxy())
    {
      InternalEObject oldImportedCft = (InternalEObject)importedCft;
      importedCft = (CftModel)eResolveProxy(oldImportedCft);
      if (importedCft != oldImportedCft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationConfigurationPackage.CFT_IMPORT__IMPORTED_CFT, oldImportedCft, importedCft));
      }
    }
    return importedCft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CftModel basicGetImportedCft()
  {
    return importedCft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImportedCft(CftModel newImportedCft)
  {
    CftModel oldImportedCft = importedCft;
    importedCft = newImportedCft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplicationConfigurationPackage.CFT_IMPORT__IMPORTED_CFT, oldImportedCft, importedCft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.CFT_IMPORT__IMPORTED_CFT:
        if (resolve) return getImportedCft();
        return basicGetImportedCft();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.CFT_IMPORT__IMPORTED_CFT:
        setImportedCft((CftModel)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.CFT_IMPORT__IMPORTED_CFT:
        setImportedCft((CftModel)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplicationConfigurationPackage.CFT_IMPORT__IMPORTED_CFT:
        return importedCft != null;
    }
    return super.eIsSet(featureID);
  }

} //CftImportImpl
