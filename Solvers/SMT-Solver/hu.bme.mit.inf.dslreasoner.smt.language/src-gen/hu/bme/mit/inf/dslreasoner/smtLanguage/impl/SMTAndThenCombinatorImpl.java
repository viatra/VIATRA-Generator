/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT And Then Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndThenCombinatorImpl#getTactics <em>Tactics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTAndThenCombinatorImpl extends SMTReasoningCombinatorImpl implements SMTAndThenCombinator
{
  /**
   * The cached value of the '{@link #getTactics() <em>Tactics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTactics()
   * @generated
   * @ordered
   */
  protected EList<SMTReasoningTactic> tactics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTAndThenCombinatorImpl()
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
    return SmtLanguagePackage.Literals.SMT_AND_THEN_COMBINATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTReasoningTactic> getTactics()
  {
    if (tactics == null)
    {
      tactics = new EObjectContainmentEList<SMTReasoningTactic>(SMTReasoningTactic.class, this, SmtLanguagePackage.SMT_AND_THEN_COMBINATOR__TACTICS);
    }
    return tactics;
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
      case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR__TACTICS:
        return ((InternalEList<?>)getTactics()).basicRemove(otherEnd, msgs);
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
      case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR__TACTICS:
        return getTactics();
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
      case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR__TACTICS:
        getTactics().clear();
        getTactics().addAll((Collection<? extends SMTReasoningTactic>)newValue);
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
      case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR__TACTICS:
        getTactics().clear();
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
      case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR__TACTICS:
        return tactics != null && !tactics.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SMTAndThenCombinatorImpl
