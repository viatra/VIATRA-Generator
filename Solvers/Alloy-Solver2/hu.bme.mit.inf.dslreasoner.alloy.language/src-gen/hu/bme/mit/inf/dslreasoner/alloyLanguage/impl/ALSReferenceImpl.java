/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALS Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReferenceImpl#getReferred <em>Referred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSReferenceImpl extends ALSTermImpl implements ALSReference
{
  /**
   * The cached value of the '{@link #getReferred() <em>Referred</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferred()
   * @generated
   * @ordered
   */
  protected ALSRelationDeclaration referred;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSReferenceImpl()
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
    return AlloyLanguagePackage.Literals.ALS_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRelationDeclaration getReferred()
  {
    if (referred != null && referred.eIsProxy())
    {
      InternalEObject oldReferred = (InternalEObject)referred;
      referred = (ALSRelationDeclaration)eResolveProxy(oldReferred);
      if (referred != oldReferred)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlloyLanguagePackage.ALS_REFERENCE__REFERRED, oldReferred, referred));
      }
    }
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRelationDeclaration basicGetReferred()
  {
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferred(ALSRelationDeclaration newReferred)
  {
    ALSRelationDeclaration oldReferred = referred;
    referred = newReferred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_REFERENCE__REFERRED, oldReferred, referred));
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
      case AlloyLanguagePackage.ALS_REFERENCE__REFERRED:
        if (resolve) return getReferred();
        return basicGetReferred();
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
      case AlloyLanguagePackage.ALS_REFERENCE__REFERRED:
        setReferred((ALSRelationDeclaration)newValue);
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
      case AlloyLanguagePackage.ALS_REFERENCE__REFERRED:
        setReferred((ALSRelationDeclaration)null);
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
      case AlloyLanguagePackage.ALS_REFERENCE__REFERRED:
        return referred != null;
    }
    return super.eIsSet(featureID);
  }

} //ALSReferenceImpl
