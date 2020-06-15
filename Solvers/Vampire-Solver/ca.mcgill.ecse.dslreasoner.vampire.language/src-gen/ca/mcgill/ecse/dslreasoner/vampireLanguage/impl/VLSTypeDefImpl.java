/**
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.vampireLanguage.impl;

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTypeDef;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VLS Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSTypeDefImpl#getTypeSig <em>Type Sig</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSTypeDefImpl#getMapsTo <em>Maps To</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSTypeDefImpl#getInitType <em>Init Type</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSTypeDefImpl#getNextType <em>Next Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VLSTypeDefImpl extends MinimalEObjectImpl.Container implements VLSTypeDef
{
  /**
   * The cached value of the '{@link #getTypeSig() <em>Type Sig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSig()
   * @generated
   * @ordered
   */
  protected VLSTypeDef typeSig;

  /**
   * The cached value of the '{@link #getMapsTo() <em>Maps To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapsTo()
   * @generated
   * @ordered
   */
  protected VLSTerm mapsTo;

  /**
   * The cached value of the '{@link #getInitType() <em>Init Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitType()
   * @generated
   * @ordered
   */
  protected VLSTerm initType;

  /**
   * The cached value of the '{@link #getNextType() <em>Next Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextType()
   * @generated
   * @ordered
   */
  protected VLSTerm nextType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VLSTypeDefImpl()
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
    return VampireLanguagePackage.Literals.VLS_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VLSTypeDef getTypeSig()
  {
    return typeSig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSig(VLSTypeDef newTypeSig, NotificationChain msgs)
  {
    VLSTypeDef oldTypeSig = typeSig;
    typeSig = newTypeSig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG, oldTypeSig, newTypeSig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSig(VLSTypeDef newTypeSig)
  {
    if (newTypeSig != typeSig)
    {
      NotificationChain msgs = null;
      if (typeSig != null)
        msgs = ((InternalEObject)typeSig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG, null, msgs);
      if (newTypeSig != null)
        msgs = ((InternalEObject)newTypeSig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG, null, msgs);
      msgs = basicSetTypeSig(newTypeSig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG, newTypeSig, newTypeSig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VLSTerm getMapsTo()
  {
    return mapsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapsTo(VLSTerm newMapsTo, NotificationChain msgs)
  {
    VLSTerm oldMapsTo = mapsTo;
    mapsTo = newMapsTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO, oldMapsTo, newMapsTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapsTo(VLSTerm newMapsTo)
  {
    if (newMapsTo != mapsTo)
    {
      NotificationChain msgs = null;
      if (mapsTo != null)
        msgs = ((InternalEObject)mapsTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO, null, msgs);
      if (newMapsTo != null)
        msgs = ((InternalEObject)newMapsTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO, null, msgs);
      msgs = basicSetMapsTo(newMapsTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO, newMapsTo, newMapsTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VLSTerm getInitType()
  {
    return initType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitType(VLSTerm newInitType, NotificationChain msgs)
  {
    VLSTerm oldInitType = initType;
    initType = newInitType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE, oldInitType, newInitType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitType(VLSTerm newInitType)
  {
    if (newInitType != initType)
    {
      NotificationChain msgs = null;
      if (initType != null)
        msgs = ((InternalEObject)initType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE, null, msgs);
      if (newInitType != null)
        msgs = ((InternalEObject)newInitType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE, null, msgs);
      msgs = basicSetInitType(newInitType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE, newInitType, newInitType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VLSTerm getNextType()
  {
    return nextType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextType(VLSTerm newNextType, NotificationChain msgs)
  {
    VLSTerm oldNextType = nextType;
    nextType = newNextType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE, oldNextType, newNextType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextType(VLSTerm newNextType)
  {
    if (newNextType != nextType)
    {
      NotificationChain msgs = null;
      if (nextType != null)
        msgs = ((InternalEObject)nextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE, null, msgs);
      if (newNextType != null)
        msgs = ((InternalEObject)newNextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE, null, msgs);
      msgs = basicSetNextType(newNextType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE, newNextType, newNextType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG:
        return basicSetTypeSig(null, msgs);
      case VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO:
        return basicSetMapsTo(null, msgs);
      case VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE:
        return basicSetInitType(null, msgs);
      case VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE:
        return basicSetNextType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG:
        return getTypeSig();
      case VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO:
        return getMapsTo();
      case VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE:
        return getInitType();
      case VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE:
        return getNextType();
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
      case VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG:
        setTypeSig((VLSTypeDef)newValue);
        return;
      case VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO:
        setMapsTo((VLSTerm)newValue);
        return;
      case VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE:
        setInitType((VLSTerm)newValue);
        return;
      case VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE:
        setNextType((VLSTerm)newValue);
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
      case VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG:
        setTypeSig((VLSTypeDef)null);
        return;
      case VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO:
        setMapsTo((VLSTerm)null);
        return;
      case VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE:
        setInitType((VLSTerm)null);
        return;
      case VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE:
        setNextType((VLSTerm)null);
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
      case VampireLanguagePackage.VLS_TYPE_DEF__TYPE_SIG:
        return typeSig != null;
      case VampireLanguagePackage.VLS_TYPE_DEF__MAPS_TO:
        return mapsTo != null;
      case VampireLanguagePackage.VLS_TYPE_DEF__INIT_TYPE:
        return initType != null;
      case VampireLanguagePackage.VLS_TYPE_DEF__NEXT_TYPE:
        return nextType != null;
    }
    return super.eIsSet(featureID);
  }

} //VLSTypeDefImpl
