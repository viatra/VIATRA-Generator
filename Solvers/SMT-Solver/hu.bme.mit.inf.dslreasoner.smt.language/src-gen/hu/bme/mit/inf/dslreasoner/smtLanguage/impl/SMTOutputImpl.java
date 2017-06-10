/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOutputImpl#getSatResult <em>Sat Result</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOutputImpl#getGetModelResult <em>Get Model Result</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOutputImpl#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTOutputImpl extends MinimalEObjectImpl.Container implements SMTOutput
{
  /**
   * The cached value of the '{@link #getSatResult() <em>Sat Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatResult()
   * @generated
   * @ordered
   */
  protected SMTResult satResult;

  /**
   * The cached value of the '{@link #getGetModelResult() <em>Get Model Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetModelResult()
   * @generated
   * @ordered
   */
  protected SMTResult getModelResult;

  /**
   * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatistics()
   * @generated
   * @ordered
   */
  protected SMTStatisticsSection statistics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTOutputImpl()
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
    return SmtLanguagePackage.Literals.SMT_OUTPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTResult getSatResult()
  {
    return satResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSatResult(SMTResult newSatResult, NotificationChain msgs)
  {
    SMTResult oldSatResult = satResult;
    satResult = newSatResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT, oldSatResult, newSatResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSatResult(SMTResult newSatResult)
  {
    if (newSatResult != satResult)
    {
      NotificationChain msgs = null;
      if (satResult != null)
        msgs = ((InternalEObject)satResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT, null, msgs);
      if (newSatResult != null)
        msgs = ((InternalEObject)newSatResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT, null, msgs);
      msgs = basicSetSatResult(newSatResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT, newSatResult, newSatResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTResult getGetModelResult()
  {
    return getModelResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetModelResult(SMTResult newGetModelResult, NotificationChain msgs)
  {
    SMTResult oldGetModelResult = getModelResult;
    getModelResult = newGetModelResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT, oldGetModelResult, newGetModelResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetModelResult(SMTResult newGetModelResult)
  {
    if (newGetModelResult != getModelResult)
    {
      NotificationChain msgs = null;
      if (getModelResult != null)
        msgs = ((InternalEObject)getModelResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT, null, msgs);
      if (newGetModelResult != null)
        msgs = ((InternalEObject)newGetModelResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT, null, msgs);
      msgs = basicSetGetModelResult(newGetModelResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT, newGetModelResult, newGetModelResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTStatisticsSection getStatistics()
  {
    return statistics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatistics(SMTStatisticsSection newStatistics, NotificationChain msgs)
  {
    SMTStatisticsSection oldStatistics = statistics;
    statistics = newStatistics;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_OUTPUT__STATISTICS, oldStatistics, newStatistics);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatistics(SMTStatisticsSection newStatistics)
  {
    if (newStatistics != statistics)
    {
      NotificationChain msgs = null;
      if (statistics != null)
        msgs = ((InternalEObject)statistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_OUTPUT__STATISTICS, null, msgs);
      if (newStatistics != null)
        msgs = ((InternalEObject)newStatistics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_OUTPUT__STATISTICS, null, msgs);
      msgs = basicSetStatistics(newStatistics, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_OUTPUT__STATISTICS, newStatistics, newStatistics));
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
      case SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT:
        return basicSetSatResult(null, msgs);
      case SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT:
        return basicSetGetModelResult(null, msgs);
      case SmtLanguagePackage.SMT_OUTPUT__STATISTICS:
        return basicSetStatistics(null, msgs);
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
      case SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT:
        return getSatResult();
      case SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT:
        return getGetModelResult();
      case SmtLanguagePackage.SMT_OUTPUT__STATISTICS:
        return getStatistics();
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
      case SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT:
        setSatResult((SMTResult)newValue);
        return;
      case SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT:
        setGetModelResult((SMTResult)newValue);
        return;
      case SmtLanguagePackage.SMT_OUTPUT__STATISTICS:
        setStatistics((SMTStatisticsSection)newValue);
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
      case SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT:
        setSatResult((SMTResult)null);
        return;
      case SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT:
        setGetModelResult((SMTResult)null);
        return;
      case SmtLanguagePackage.SMT_OUTPUT__STATISTICS:
        setStatistics((SMTStatisticsSection)null);
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
      case SmtLanguagePackage.SMT_OUTPUT__SAT_RESULT:
        return satResult != null;
      case SmtLanguagePackage.SMT_OUTPUT__GET_MODEL_RESULT:
        return getModelResult != null;
      case SmtLanguagePackage.SMT_OUTPUT__STATISTICS:
        return statistics != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTOutputImpl
