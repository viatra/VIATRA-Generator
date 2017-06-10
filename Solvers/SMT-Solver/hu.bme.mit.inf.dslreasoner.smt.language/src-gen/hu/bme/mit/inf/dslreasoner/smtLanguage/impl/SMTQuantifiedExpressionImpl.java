/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable;
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
 * An implementation of the model object '<em><b>SMT Quantified Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTQuantifiedExpressionImpl#getQuantifiedVariables <em>Quantified Variables</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTQuantifiedExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTQuantifiedExpressionImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTQuantifiedExpressionImpl extends SMTTermImpl implements SMTQuantifiedExpression
{
  /**
   * The cached value of the '{@link #getQuantifiedVariables() <em>Quantified Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedVariables()
   * @generated
   * @ordered
   */
  protected EList<SMTSortedVariable> quantifiedVariables;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected SMTTerm expression;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected SMTTerm pattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTQuantifiedExpressionImpl()
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
    return SmtLanguagePackage.Literals.SMT_QUANTIFIED_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTSortedVariable> getQuantifiedVariables()
  {
    if (quantifiedVariables == null)
    {
      quantifiedVariables = new EObjectContainmentEList<SMTSortedVariable>(SMTSortedVariable.class, this, SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES);
    }
    return quantifiedVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTTerm getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(SMTTerm newExpression, NotificationChain msgs)
  {
    SMTTerm oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(SMTTerm newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTTerm getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(SMTTerm newPattern, NotificationChain msgs)
  {
    SMTTerm oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN, oldPattern, newPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(SMTTerm newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN, newPattern, newPattern));
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
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES:
        return ((InternalEList<?>)getQuantifiedVariables()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN:
        return basicSetPattern(null, msgs);
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
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES:
        return getQuantifiedVariables();
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION:
        return getExpression();
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN:
        return getPattern();
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
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES:
        getQuantifiedVariables().clear();
        getQuantifiedVariables().addAll((Collection<? extends SMTSortedVariable>)newValue);
        return;
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION:
        setExpression((SMTTerm)newValue);
        return;
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN:
        setPattern((SMTTerm)newValue);
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
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES:
        getQuantifiedVariables().clear();
        return;
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION:
        setExpression((SMTTerm)null);
        return;
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN:
        setPattern((SMTTerm)null);
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
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES:
        return quantifiedVariables != null && !quantifiedVariables.isEmpty();
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__EXPRESSION:
        return expression != null;
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION__PATTERN:
        return pattern != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTQuantifiedExpressionImpl
