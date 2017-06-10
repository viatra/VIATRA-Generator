/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator;
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
 * An implementation of the model object '<em><b>SMT Using Param Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUsingParamCombinatorImpl#getTactic <em>Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUsingParamCombinatorImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTUsingParamCombinatorImpl extends SMTReasoningCombinatorImpl implements SMTUsingParamCombinator
{
  /**
   * The cached value of the '{@link #getTactic() <em>Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTactic()
   * @generated
   * @ordered
   */
  protected SMTReasoningTactic tactic;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ReasoningTacticParameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTUsingParamCombinatorImpl()
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
    return SmtLanguagePackage.Literals.SMT_USING_PARAM_COMBINATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic getTactic()
  {
    return tactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTactic(SMTReasoningTactic newTactic, NotificationChain msgs)
  {
    SMTReasoningTactic oldTactic = tactic;
    tactic = newTactic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC, oldTactic, newTactic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTactic(SMTReasoningTactic newTactic)
  {
    if (newTactic != tactic)
    {
      NotificationChain msgs = null;
      if (tactic != null)
        msgs = ((InternalEObject)tactic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC, null, msgs);
      if (newTactic != null)
        msgs = ((InternalEObject)newTactic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC, null, msgs);
      msgs = basicSetTactic(newTactic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC, newTactic, newTactic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReasoningTacticParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ReasoningTacticParameter>(ReasoningTacticParameter.class, this, SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__PARAMETERS);
    }
    return parameters;
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
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC:
        return basicSetTactic(null, msgs);
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC:
        return getTactic();
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__PARAMETERS:
        return getParameters();
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
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC:
        setTactic((SMTReasoningTactic)newValue);
        return;
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ReasoningTacticParameter>)newValue);
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
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC:
        setTactic((SMTReasoningTactic)null);
        return;
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__PARAMETERS:
        getParameters().clear();
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
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__TACTIC:
        return tactic != null;
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SMTUsingParamCombinatorImpl
