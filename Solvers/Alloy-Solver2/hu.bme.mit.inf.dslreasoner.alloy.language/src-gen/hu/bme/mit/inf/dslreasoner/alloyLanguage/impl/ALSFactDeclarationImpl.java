/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALS Fact Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFactDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFactDeclarationImpl#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSFactDeclarationImpl extends MinimalEObjectImpl.Container implements ALSFactDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected ALSTerm term;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSFactDeclarationImpl()
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
    return AlloyLanguagePackage.Literals.ALS_FACT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_FACT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTerm getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(ALSTerm newTerm, NotificationChain msgs)
  {
    ALSTerm oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(ALSTerm newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM, newTerm, newTerm));
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
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM:
        return basicSetTerm(null, msgs);
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
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__NAME:
        return getName();
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM:
        return getTerm();
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
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM:
        setTerm((ALSTerm)newValue);
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
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM:
        setTerm((ALSTerm)null);
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
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlloyLanguagePackage.ALS_FACT_DECLARATION__TERM:
        return term != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ALSFactDeclarationImpl
