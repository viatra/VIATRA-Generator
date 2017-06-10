/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Complex Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexTypeReferenceImpl#getReferred <em>Referred</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTComplexTypeReferenceImpl extends SMTTypeReferenceImpl implements SMTComplexTypeReference
{
  /**
   * The cached value of the '{@link #getReferred() <em>Referred</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferred()
   * @generated
   * @ordered
   */
  protected SMTType referred;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTComplexTypeReferenceImpl()
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
    return SmtLanguagePackage.Literals.SMT_COMPLEX_TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTType getReferred()
  {
    if (referred != null && referred.eIsProxy())
    {
      InternalEObject oldReferred = (InternalEObject)referred;
      referred = (SMTType)eResolveProxy(oldReferred);
      if (referred != oldReferred)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE__REFERRED, oldReferred, referred));
      }
    }
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTType basicGetReferred()
  {
    return referred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferred(SMTType newReferred)
  {
    SMTType oldReferred = referred;
    referred = newReferred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE__REFERRED, oldReferred, referred));
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
      case SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE__REFERRED:
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
      case SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE__REFERRED:
        setReferred((SMTType)newValue);
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
      case SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE__REFERRED:
        setReferred((SMTType)null);
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
      case SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE__REFERRED:
        return referred != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTComplexTypeReferenceImpl
