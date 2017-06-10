/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDocumentImpl#getInput <em>Input</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDocumentImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTDocumentImpl extends MinimalEObjectImpl.Container implements SMTDocument
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected SMTInput input;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected SMTOutput output;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTDocumentImpl()
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
    return SmtLanguagePackage.Literals.SMT_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTInput getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(SMTInput newInput, NotificationChain msgs)
  {
    SMTInput oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_DOCUMENT__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(SMTInput newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_DOCUMENT__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_DOCUMENT__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_DOCUMENT__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTOutput getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(SMTOutput newOutput, NotificationChain msgs)
  {
    SMTOutput oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_DOCUMENT__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(SMTOutput newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_DOCUMENT__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_DOCUMENT__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_DOCUMENT__OUTPUT, newOutput, newOutput));
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
      case SmtLanguagePackage.SMT_DOCUMENT__INPUT:
        return basicSetInput(null, msgs);
      case SmtLanguagePackage.SMT_DOCUMENT__OUTPUT:
        return basicSetOutput(null, msgs);
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
      case SmtLanguagePackage.SMT_DOCUMENT__INPUT:
        return getInput();
      case SmtLanguagePackage.SMT_DOCUMENT__OUTPUT:
        return getOutput();
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
      case SmtLanguagePackage.SMT_DOCUMENT__INPUT:
        setInput((SMTInput)newValue);
        return;
      case SmtLanguagePackage.SMT_DOCUMENT__OUTPUT:
        setOutput((SMTOutput)newValue);
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
      case SmtLanguagePackage.SMT_DOCUMENT__INPUT:
        setInput((SMTInput)null);
        return;
      case SmtLanguagePackage.SMT_DOCUMENT__OUTPUT:
        setOutput((SMTOutput)null);
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
      case SmtLanguagePackage.SMT_DOCUMENT__INPUT:
        return input != null;
      case SmtLanguagePackage.SMT_DOCUMENT__OUTPUT:
        return output != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTDocumentImpl
