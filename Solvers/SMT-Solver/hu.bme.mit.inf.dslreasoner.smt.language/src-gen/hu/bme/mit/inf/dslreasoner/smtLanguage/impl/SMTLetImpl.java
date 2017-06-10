/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Let</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLetImpl#getInlineConstantDefinitions <em>Inline Constant Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLetImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTLetImpl extends SMTTermImpl implements SMTLet
{
  /**
   * The cached value of the '{@link #getInlineConstantDefinitions() <em>Inline Constant Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInlineConstantDefinitions()
   * @generated
   * @ordered
   */
  protected EList<SMTInlineConstantDefinition> inlineConstantDefinitions;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected SMTTerm term;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTLetImpl()
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
    return SmtLanguagePackage.Literals.SMT_LET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTInlineConstantDefinition> getInlineConstantDefinitions()
  {
    if (inlineConstantDefinitions == null)
    {
      inlineConstantDefinitions = new EObjectContainmentEList<SMTInlineConstantDefinition>(SMTInlineConstantDefinition.class, this, SmtLanguagePackage.SMT_LET__INLINE_CONSTANT_DEFINITIONS);
    }
    return inlineConstantDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTTerm getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(SMTTerm newTerm, NotificationChain msgs)
  {
    SMTTerm oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_LET__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(SMTTerm newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_LET__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_LET__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_LET__TERM, newTerm, newTerm));
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
      case SmtLanguagePackage.SMT_LET__INLINE_CONSTANT_DEFINITIONS:
        return ((InternalEList<?>)getInlineConstantDefinitions()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_LET__TERM:
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
      case SmtLanguagePackage.SMT_LET__INLINE_CONSTANT_DEFINITIONS:
        return getInlineConstantDefinitions();
      case SmtLanguagePackage.SMT_LET__TERM:
        return getTerm();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmtLanguagePackage.SMT_LET__INLINE_CONSTANT_DEFINITIONS:
        getInlineConstantDefinitions().clear();
        getInlineConstantDefinitions().addAll((Collection<? extends SMTInlineConstantDefinition>)newValue);
        return;
      case SmtLanguagePackage.SMT_LET__TERM:
        setTerm((SMTTerm)newValue);
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
      case SmtLanguagePackage.SMT_LET__INLINE_CONSTANT_DEFINITIONS:
        getInlineConstantDefinitions().clear();
        return;
      case SmtLanguagePackage.SMT_LET__TERM:
        setTerm((SMTTerm)null);
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
      case SmtLanguagePackage.SMT_LET__INLINE_CONSTANT_DEFINITIONS:
        return inlineConstantDefinitions != null && !inlineConstantDefinitions.isEmpty();
      case SmtLanguagePackage.SMT_LET__TERM:
        return term != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTLetImpl
