/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue;
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
 * An implementation of the model object '<em><b>SMT Symbolic Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicValueImpl#getSymbolicReference <em>Symbolic Reference</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicValueImpl#getParameterSubstitutions <em>Parameter Substitutions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTSymbolicValueImpl extends SMTTermImpl implements SMTSymbolicValue
{
  /**
   * The cached value of the '{@link #getSymbolicReference() <em>Symbolic Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolicReference()
   * @generated
   * @ordered
   */
  protected SMTSymbolicDeclaration symbolicReference;

  /**
   * The cached value of the '{@link #getParameterSubstitutions() <em>Parameter Substitutions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterSubstitutions()
   * @generated
   * @ordered
   */
  protected EList<SMTTerm> parameterSubstitutions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTSymbolicValueImpl()
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
    return SmtLanguagePackage.Literals.SMT_SYMBOLIC_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSymbolicDeclaration getSymbolicReference()
  {
    if (symbolicReference != null && symbolicReference.eIsProxy())
    {
      InternalEObject oldSymbolicReference = (InternalEObject)symbolicReference;
      symbolicReference = (SMTSymbolicDeclaration)eResolveProxy(oldSymbolicReference);
      if (symbolicReference != oldSymbolicReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmtLanguagePackage.SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE, oldSymbolicReference, symbolicReference));
      }
    }
    return symbolicReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSymbolicDeclaration basicGetSymbolicReference()
  {
    return symbolicReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolicReference(SMTSymbolicDeclaration newSymbolicReference)
  {
    SMTSymbolicDeclaration oldSymbolicReference = symbolicReference;
    symbolicReference = newSymbolicReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE, oldSymbolicReference, symbolicReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTTerm> getParameterSubstitutions()
  {
    if (parameterSubstitutions == null)
    {
      parameterSubstitutions = new EObjectContainmentEList<SMTTerm>(SMTTerm.class, this, SmtLanguagePackage.SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS);
    }
    return parameterSubstitutions;
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
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
        return ((InternalEList<?>)getParameterSubstitutions()).basicRemove(otherEnd, msgs);
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
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
        if (resolve) return getSymbolicReference();
        return basicGetSymbolicReference();
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
        return getParameterSubstitutions();
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
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
        setSymbolicReference((SMTSymbolicDeclaration)newValue);
        return;
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
        getParameterSubstitutions().clear();
        getParameterSubstitutions().addAll((Collection<? extends SMTTerm>)newValue);
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
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
        setSymbolicReference((SMTSymbolicDeclaration)null);
        return;
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
        getParameterSubstitutions().clear();
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
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
        return symbolicReference != null;
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
        return parameterSubstitutions != null && !parameterSubstitutions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SMTSymbolicValueImpl
