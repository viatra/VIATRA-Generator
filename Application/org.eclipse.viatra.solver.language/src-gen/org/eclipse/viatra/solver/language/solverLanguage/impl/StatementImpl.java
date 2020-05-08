/**
 * generated by Xtext 2.21.0
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.solver.language.solverLanguage.MemberDefinition;
import org.eclipse.viatra.solver.language.solverLanguage.NamedElement;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl#getSuperclasses <em>Superclasses</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.StatementImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getSuperclasses() <em>Superclasses</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperclasses()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> superclasses;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<MemberDefinition> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return SolverLanguagePackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.STATEMENT__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedElement> getSuperclasses()
  {
    if (superclasses == null)
    {
      superclasses = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, SolverLanguagePackage.STATEMENT__SUPERCLASSES);
    }
    return superclasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MemberDefinition> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<MemberDefinition>(MemberDefinition.class, this, SolverLanguagePackage.STATEMENT__MEMBERS);
    }
    return members;
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
      case SolverLanguagePackage.STATEMENT__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case SolverLanguagePackage.STATEMENT__ABSTRACT:
        return isAbstract();
      case SolverLanguagePackage.STATEMENT__NAME:
        return getName();
      case SolverLanguagePackage.STATEMENT__SUPERCLASSES:
        return getSuperclasses();
      case SolverLanguagePackage.STATEMENT__MEMBERS:
        return getMembers();
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
      case SolverLanguagePackage.STATEMENT__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case SolverLanguagePackage.STATEMENT__NAME:
        setName((String)newValue);
        return;
      case SolverLanguagePackage.STATEMENT__SUPERCLASSES:
        getSuperclasses().clear();
        getSuperclasses().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case SolverLanguagePackage.STATEMENT__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends MemberDefinition>)newValue);
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
      case SolverLanguagePackage.STATEMENT__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case SolverLanguagePackage.STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SolverLanguagePackage.STATEMENT__SUPERCLASSES:
        getSuperclasses().clear();
        return;
      case SolverLanguagePackage.STATEMENT__MEMBERS:
        getMembers().clear();
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
      case SolverLanguagePackage.STATEMENT__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case SolverLanguagePackage.STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SolverLanguagePackage.STATEMENT__SUPERCLASSES:
        return superclasses != null && !superclasses.isEmpty();
      case SolverLanguagePackage.STATEMENT__MEMBERS:
        return members != null && !members.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
