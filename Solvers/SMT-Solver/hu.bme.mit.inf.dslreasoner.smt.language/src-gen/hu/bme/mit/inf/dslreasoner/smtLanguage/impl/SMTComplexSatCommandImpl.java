/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Complex Sat Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexSatCommandImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTComplexSatCommandImpl extends SMTSatCommandImpl implements SMTComplexSatCommand
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected SMTReasoningTactic method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTComplexSatCommandImpl()
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
    return SmtLanguagePackage.Literals.SMT_COMPLEX_SAT_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(SMTReasoningTactic newMethod, NotificationChain msgs)
  {
    SMTReasoningTactic oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(SMTReasoningTactic newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD, newMethod, newMethod));
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
      case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD:
        return basicSetMethod(null, msgs);
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
      case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD:
        return getMethod();
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
      case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD:
        setMethod((SMTReasoningTactic)newValue);
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
      case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD:
        setMethod((SMTReasoningTactic)null);
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
      case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND__METHOD:
        return method != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTComplexSatCommandImpl
