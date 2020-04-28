/**
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.BasicInterpretation;
import org.eclipse.viatra.solver.language.solverLanguage.DefaultInterpretation;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DefaultInterpretationImpl#getInterpretation <em>Interpretation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultInterpretationImpl extends InterpretationImpl implements DefaultInterpretation
{
  /**
   * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterpretation()
   * @generated
   * @ordered
   */
  protected BasicInterpretation interpretation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultInterpretationImpl()
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
    return SolverLanguagePackage.Literals.DEFAULT_INTERPRETATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicInterpretation getInterpretation()
  {
    return interpretation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterpretation(BasicInterpretation newInterpretation, NotificationChain msgs)
  {
    BasicInterpretation oldInterpretation = interpretation;
    interpretation = newInterpretation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION, oldInterpretation, newInterpretation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInterpretation(BasicInterpretation newInterpretation)
  {
    if (newInterpretation != interpretation)
    {
      NotificationChain msgs = null;
      if (interpretation != null)
        msgs = ((InternalEObject)interpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION, null, msgs);
      if (newInterpretation != null)
        msgs = ((InternalEObject)newInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION, null, msgs);
      msgs = basicSetInterpretation(newInterpretation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION, newInterpretation, newInterpretation));
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
      case SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION:
        return basicSetInterpretation(null, msgs);
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
      case SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION:
        return getInterpretation();
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
      case SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION:
        setInterpretation((BasicInterpretation)newValue);
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
      case SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION:
        setInterpretation((BasicInterpretation)null);
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
      case SolverLanguagePackage.DEFAULT_INTERPRETATION__INTERPRETATION:
        return interpretation != null;
    }
    return super.eIsSet(featureID);
  }

} //DefaultInterpretationImpl