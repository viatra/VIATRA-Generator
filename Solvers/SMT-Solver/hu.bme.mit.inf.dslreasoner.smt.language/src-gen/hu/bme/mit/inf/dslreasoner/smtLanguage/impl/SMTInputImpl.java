/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTGetModelCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl#getTypeDeclarations <em>Type Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl#getFunctionDeclarations <em>Function Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl#getSatCommand <em>Sat Command</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl#getGetModelCommand <em>Get Model Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTInputImpl extends MinimalEObjectImpl.Container implements SMTInput
{
  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<SMTOption> options;

  /**
   * The cached value of the '{@link #getTypeDeclarations() <em>Type Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDeclarations()
   * @generated
   * @ordered
   */
  protected EList<SMTType> typeDeclarations;

  /**
   * The cached value of the '{@link #getFunctionDeclarations() <em>Function Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionDeclarations()
   * @generated
   * @ordered
   */
  protected EList<SMTFunctionDeclaration> functionDeclarations;

  /**
   * The cached value of the '{@link #getFunctionDefinition() <em>Function Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionDefinition()
   * @generated
   * @ordered
   */
  protected EList<SMTFunctionDefinition> functionDefinition;

  /**
   * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertions()
   * @generated
   * @ordered
   */
  protected EList<SMTAssertion> assertions;

  /**
   * The cached value of the '{@link #getSatCommand() <em>Sat Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatCommand()
   * @generated
   * @ordered
   */
  protected SMTSatCommand satCommand;

  /**
   * The cached value of the '{@link #getGetModelCommand() <em>Get Model Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetModelCommand()
   * @generated
   * @ordered
   */
  protected SMTGetModelCommand getModelCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTInputImpl()
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
    return SmtLanguagePackage.Literals.SMT_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTOption> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<SMTOption>(SMTOption.class, this, SmtLanguagePackage.SMT_INPUT__OPTIONS);
    }
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTType> getTypeDeclarations()
  {
    if (typeDeclarations == null)
    {
      typeDeclarations = new EObjectContainmentEList<SMTType>(SMTType.class, this, SmtLanguagePackage.SMT_INPUT__TYPE_DECLARATIONS);
    }
    return typeDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTFunctionDeclaration> getFunctionDeclarations()
  {
    if (functionDeclarations == null)
    {
      functionDeclarations = new EObjectContainmentEList<SMTFunctionDeclaration>(SMTFunctionDeclaration.class, this, SmtLanguagePackage.SMT_INPUT__FUNCTION_DECLARATIONS);
    }
    return functionDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTFunctionDefinition> getFunctionDefinition()
  {
    if (functionDefinition == null)
    {
      functionDefinition = new EObjectContainmentEList<SMTFunctionDefinition>(SMTFunctionDefinition.class, this, SmtLanguagePackage.SMT_INPUT__FUNCTION_DEFINITION);
    }
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTAssertion> getAssertions()
  {
    if (assertions == null)
    {
      assertions = new EObjectContainmentEList<SMTAssertion>(SMTAssertion.class, this, SmtLanguagePackage.SMT_INPUT__ASSERTIONS);
    }
    return assertions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSatCommand getSatCommand()
  {
    return satCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSatCommand(SMTSatCommand newSatCommand, NotificationChain msgs)
  {
    SMTSatCommand oldSatCommand = satCommand;
    satCommand = newSatCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_INPUT__SAT_COMMAND, oldSatCommand, newSatCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSatCommand(SMTSatCommand newSatCommand)
  {
    if (newSatCommand != satCommand)
    {
      NotificationChain msgs = null;
      if (satCommand != null)
        msgs = ((InternalEObject)satCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_INPUT__SAT_COMMAND, null, msgs);
      if (newSatCommand != null)
        msgs = ((InternalEObject)newSatCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_INPUT__SAT_COMMAND, null, msgs);
      msgs = basicSetSatCommand(newSatCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_INPUT__SAT_COMMAND, newSatCommand, newSatCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTGetModelCommand getGetModelCommand()
  {
    return getModelCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetModelCommand(SMTGetModelCommand newGetModelCommand, NotificationChain msgs)
  {
    SMTGetModelCommand oldGetModelCommand = getModelCommand;
    getModelCommand = newGetModelCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND, oldGetModelCommand, newGetModelCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetModelCommand(SMTGetModelCommand newGetModelCommand)
  {
    if (newGetModelCommand != getModelCommand)
    {
      NotificationChain msgs = null;
      if (getModelCommand != null)
        msgs = ((InternalEObject)getModelCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND, null, msgs);
      if (newGetModelCommand != null)
        msgs = ((InternalEObject)newGetModelCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND, null, msgs);
      msgs = basicSetGetModelCommand(newGetModelCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND, newGetModelCommand, newGetModelCommand));
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
      case SmtLanguagePackage.SMT_INPUT__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_INPUT__TYPE_DECLARATIONS:
        return ((InternalEList<?>)getTypeDeclarations()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DECLARATIONS:
        return ((InternalEList<?>)getFunctionDeclarations()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DEFINITION:
        return ((InternalEList<?>)getFunctionDefinition()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_INPUT__ASSERTIONS:
        return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_INPUT__SAT_COMMAND:
        return basicSetSatCommand(null, msgs);
      case SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND:
        return basicSetGetModelCommand(null, msgs);
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
      case SmtLanguagePackage.SMT_INPUT__OPTIONS:
        return getOptions();
      case SmtLanguagePackage.SMT_INPUT__TYPE_DECLARATIONS:
        return getTypeDeclarations();
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DECLARATIONS:
        return getFunctionDeclarations();
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DEFINITION:
        return getFunctionDefinition();
      case SmtLanguagePackage.SMT_INPUT__ASSERTIONS:
        return getAssertions();
      case SmtLanguagePackage.SMT_INPUT__SAT_COMMAND:
        return getSatCommand();
      case SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND:
        return getGetModelCommand();
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
      case SmtLanguagePackage.SMT_INPUT__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends SMTOption>)newValue);
        return;
      case SmtLanguagePackage.SMT_INPUT__TYPE_DECLARATIONS:
        getTypeDeclarations().clear();
        getTypeDeclarations().addAll((Collection<? extends SMTType>)newValue);
        return;
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DECLARATIONS:
        getFunctionDeclarations().clear();
        getFunctionDeclarations().addAll((Collection<? extends SMTFunctionDeclaration>)newValue);
        return;
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DEFINITION:
        getFunctionDefinition().clear();
        getFunctionDefinition().addAll((Collection<? extends SMTFunctionDefinition>)newValue);
        return;
      case SmtLanguagePackage.SMT_INPUT__ASSERTIONS:
        getAssertions().clear();
        getAssertions().addAll((Collection<? extends SMTAssertion>)newValue);
        return;
      case SmtLanguagePackage.SMT_INPUT__SAT_COMMAND:
        setSatCommand((SMTSatCommand)newValue);
        return;
      case SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND:
        setGetModelCommand((SMTGetModelCommand)newValue);
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
      case SmtLanguagePackage.SMT_INPUT__OPTIONS:
        getOptions().clear();
        return;
      case SmtLanguagePackage.SMT_INPUT__TYPE_DECLARATIONS:
        getTypeDeclarations().clear();
        return;
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DECLARATIONS:
        getFunctionDeclarations().clear();
        return;
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DEFINITION:
        getFunctionDefinition().clear();
        return;
      case SmtLanguagePackage.SMT_INPUT__ASSERTIONS:
        getAssertions().clear();
        return;
      case SmtLanguagePackage.SMT_INPUT__SAT_COMMAND:
        setSatCommand((SMTSatCommand)null);
        return;
      case SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND:
        setGetModelCommand((SMTGetModelCommand)null);
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
      case SmtLanguagePackage.SMT_INPUT__OPTIONS:
        return options != null && !options.isEmpty();
      case SmtLanguagePackage.SMT_INPUT__TYPE_DECLARATIONS:
        return typeDeclarations != null && !typeDeclarations.isEmpty();
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DECLARATIONS:
        return functionDeclarations != null && !functionDeclarations.isEmpty();
      case SmtLanguagePackage.SMT_INPUT__FUNCTION_DEFINITION:
        return functionDefinition != null && !functionDefinition.isEmpty();
      case SmtLanguagePackage.SMT_INPUT__ASSERTIONS:
        return assertions != null && !assertions.isEmpty();
      case SmtLanguagePackage.SMT_INPUT__SAT_COMMAND:
        return satCommand != null;
      case SmtLanguagePackage.SMT_INPUT__GET_MODEL_COMMAND:
        return getModelCommand != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTInputImpl
