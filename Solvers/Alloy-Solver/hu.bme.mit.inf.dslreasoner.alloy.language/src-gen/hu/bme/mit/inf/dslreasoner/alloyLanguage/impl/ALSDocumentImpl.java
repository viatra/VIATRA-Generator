/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

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
 * An implementation of the model object '<em><b>ALS Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl#getEnumDeclarations <em>Enum Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl#getSignatureBodies <em>Signature Bodies</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl#getFunctionDefinitions <em>Function Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl#getRelationDefinitions <em>Relation Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl#getFactDeclarations <em>Fact Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl#getRunCommand <em>Run Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSDocumentImpl extends MinimalEObjectImpl.Container implements ALSDocument
{
  /**
   * The cached value of the '{@link #getEnumDeclarations() <em>Enum Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumDeclarations()
   * @generated
   * @ordered
   */
  protected EList<ALSEnumDeclaration> enumDeclarations;

  /**
   * The cached value of the '{@link #getSignatureBodies() <em>Signature Bodies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignatureBodies()
   * @generated
   * @ordered
   */
  protected EList<ALSSignatureBody> signatureBodies;

  /**
   * The cached value of the '{@link #getFunctionDefinitions() <em>Function Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionDefinitions()
   * @generated
   * @ordered
   */
  protected EList<ALSFunctionDefinition> functionDefinitions;

  /**
   * The cached value of the '{@link #getRelationDefinitions() <em>Relation Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationDefinitions()
   * @generated
   * @ordered
   */
  protected EList<ALSRelationDefinition> relationDefinitions;

  /**
   * The cached value of the '{@link #getFactDeclarations() <em>Fact Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactDeclarations()
   * @generated
   * @ordered
   */
  protected EList<ALSFactDeclaration> factDeclarations;

  /**
   * The cached value of the '{@link #getRunCommand() <em>Run Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunCommand()
   * @generated
   * @ordered
   */
  protected ALSRunCommand runCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSDocumentImpl()
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
    return AlloyLanguagePackage.Literals.ALS_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSEnumDeclaration> getEnumDeclarations()
  {
    if (enumDeclarations == null)
    {
      enumDeclarations = new EObjectContainmentEList<ALSEnumDeclaration>(ALSEnumDeclaration.class, this, AlloyLanguagePackage.ALS_DOCUMENT__ENUM_DECLARATIONS);
    }
    return enumDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSSignatureBody> getSignatureBodies()
  {
    if (signatureBodies == null)
    {
      signatureBodies = new EObjectContainmentEList<ALSSignatureBody>(ALSSignatureBody.class, this, AlloyLanguagePackage.ALS_DOCUMENT__SIGNATURE_BODIES);
    }
    return signatureBodies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSFunctionDefinition> getFunctionDefinitions()
  {
    if (functionDefinitions == null)
    {
      functionDefinitions = new EObjectContainmentEList<ALSFunctionDefinition>(ALSFunctionDefinition.class, this, AlloyLanguagePackage.ALS_DOCUMENT__FUNCTION_DEFINITIONS);
    }
    return functionDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSRelationDefinition> getRelationDefinitions()
  {
    if (relationDefinitions == null)
    {
      relationDefinitions = new EObjectContainmentEList<ALSRelationDefinition>(ALSRelationDefinition.class, this, AlloyLanguagePackage.ALS_DOCUMENT__RELATION_DEFINITIONS);
    }
    return relationDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSFactDeclaration> getFactDeclarations()
  {
    if (factDeclarations == null)
    {
      factDeclarations = new EObjectContainmentEList<ALSFactDeclaration>(ALSFactDeclaration.class, this, AlloyLanguagePackage.ALS_DOCUMENT__FACT_DECLARATIONS);
    }
    return factDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRunCommand getRunCommand()
  {
    return runCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRunCommand(ALSRunCommand newRunCommand, NotificationChain msgs)
  {
    ALSRunCommand oldRunCommand = runCommand;
    runCommand = newRunCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND, oldRunCommand, newRunCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunCommand(ALSRunCommand newRunCommand)
  {
    if (newRunCommand != runCommand)
    {
      NotificationChain msgs = null;
      if (runCommand != null)
        msgs = ((InternalEObject)runCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND, null, msgs);
      if (newRunCommand != null)
        msgs = ((InternalEObject)newRunCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND, null, msgs);
      msgs = basicSetRunCommand(newRunCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND, newRunCommand, newRunCommand));
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
      case AlloyLanguagePackage.ALS_DOCUMENT__ENUM_DECLARATIONS:
        return ((InternalEList<?>)getEnumDeclarations()).basicRemove(otherEnd, msgs);
      case AlloyLanguagePackage.ALS_DOCUMENT__SIGNATURE_BODIES:
        return ((InternalEList<?>)getSignatureBodies()).basicRemove(otherEnd, msgs);
      case AlloyLanguagePackage.ALS_DOCUMENT__FUNCTION_DEFINITIONS:
        return ((InternalEList<?>)getFunctionDefinitions()).basicRemove(otherEnd, msgs);
      case AlloyLanguagePackage.ALS_DOCUMENT__RELATION_DEFINITIONS:
        return ((InternalEList<?>)getRelationDefinitions()).basicRemove(otherEnd, msgs);
      case AlloyLanguagePackage.ALS_DOCUMENT__FACT_DECLARATIONS:
        return ((InternalEList<?>)getFactDeclarations()).basicRemove(otherEnd, msgs);
      case AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND:
        return basicSetRunCommand(null, msgs);
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
      case AlloyLanguagePackage.ALS_DOCUMENT__ENUM_DECLARATIONS:
        return getEnumDeclarations();
      case AlloyLanguagePackage.ALS_DOCUMENT__SIGNATURE_BODIES:
        return getSignatureBodies();
      case AlloyLanguagePackage.ALS_DOCUMENT__FUNCTION_DEFINITIONS:
        return getFunctionDefinitions();
      case AlloyLanguagePackage.ALS_DOCUMENT__RELATION_DEFINITIONS:
        return getRelationDefinitions();
      case AlloyLanguagePackage.ALS_DOCUMENT__FACT_DECLARATIONS:
        return getFactDeclarations();
      case AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND:
        return getRunCommand();
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
      case AlloyLanguagePackage.ALS_DOCUMENT__ENUM_DECLARATIONS:
        getEnumDeclarations().clear();
        getEnumDeclarations().addAll((Collection<? extends ALSEnumDeclaration>)newValue);
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__SIGNATURE_BODIES:
        getSignatureBodies().clear();
        getSignatureBodies().addAll((Collection<? extends ALSSignatureBody>)newValue);
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__FUNCTION_DEFINITIONS:
        getFunctionDefinitions().clear();
        getFunctionDefinitions().addAll((Collection<? extends ALSFunctionDefinition>)newValue);
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__RELATION_DEFINITIONS:
        getRelationDefinitions().clear();
        getRelationDefinitions().addAll((Collection<? extends ALSRelationDefinition>)newValue);
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__FACT_DECLARATIONS:
        getFactDeclarations().clear();
        getFactDeclarations().addAll((Collection<? extends ALSFactDeclaration>)newValue);
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND:
        setRunCommand((ALSRunCommand)newValue);
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
      case AlloyLanguagePackage.ALS_DOCUMENT__ENUM_DECLARATIONS:
        getEnumDeclarations().clear();
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__SIGNATURE_BODIES:
        getSignatureBodies().clear();
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__FUNCTION_DEFINITIONS:
        getFunctionDefinitions().clear();
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__RELATION_DEFINITIONS:
        getRelationDefinitions().clear();
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__FACT_DECLARATIONS:
        getFactDeclarations().clear();
        return;
      case AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND:
        setRunCommand((ALSRunCommand)null);
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
      case AlloyLanguagePackage.ALS_DOCUMENT__ENUM_DECLARATIONS:
        return enumDeclarations != null && !enumDeclarations.isEmpty();
      case AlloyLanguagePackage.ALS_DOCUMENT__SIGNATURE_BODIES:
        return signatureBodies != null && !signatureBodies.isEmpty();
      case AlloyLanguagePackage.ALS_DOCUMENT__FUNCTION_DEFINITIONS:
        return functionDefinitions != null && !functionDefinitions.isEmpty();
      case AlloyLanguagePackage.ALS_DOCUMENT__RELATION_DEFINITIONS:
        return relationDefinitions != null && !relationDefinitions.isEmpty();
      case AlloyLanguagePackage.ALS_DOCUMENT__FACT_DECLARATIONS:
        return factDeclarations != null && !factDeclarations.isEmpty();
      case AlloyLanguagePackage.ALS_DOCUMENT__RUN_COMMAND:
        return runCommand != null;
    }
    return super.eIsSet(featureID);
  }

} //ALSDocumentImpl
