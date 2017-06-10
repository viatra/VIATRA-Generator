/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALS Signature Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl#getSuperset <em>Superset</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSSignatureBodyImpl extends MinimalEObjectImpl.Container implements ALSSignatureBody
{
  /**
   * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected static final ALSMultiplicity MULTIPLICITY_EDEFAULT = ALSMultiplicity.ALL;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected ALSMultiplicity multiplicity = MULTIPLICITY_EDEFAULT;

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
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<ALSSignatureDeclaration> declarations;

  /**
   * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupertype()
   * @generated
   * @ordered
   */
  protected ALSSignatureDeclaration supertype;

  /**
   * The cached value of the '{@link #getSuperset() <em>Superset</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperset()
   * @generated
   * @ordered
   */
  protected EList<ALSSignatureDeclaration> superset;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<ALSFieldDeclaration> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSSignatureBodyImpl()
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
    return AlloyLanguagePackage.Literals.ALS_SIGNATURE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMultiplicity getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(ALSMultiplicity newMultiplicity)
  {
    ALSMultiplicity oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_SIGNATURE_BODY__MULTIPLICITY, oldMultiplicity, multiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_SIGNATURE_BODY__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSSignatureDeclaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<ALSSignatureDeclaration>(ALSSignatureDeclaration.class, this, AlloyLanguagePackage.ALS_SIGNATURE_BODY__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSSignatureDeclaration getSupertype()
  {
    if (supertype != null && supertype.eIsProxy())
    {
      InternalEObject oldSupertype = (InternalEObject)supertype;
      supertype = (ALSSignatureDeclaration)eResolveProxy(oldSupertype);
      if (supertype != oldSupertype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERTYPE, oldSupertype, supertype));
      }
    }
    return supertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSSignatureDeclaration basicGetSupertype()
  {
    return supertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupertype(ALSSignatureDeclaration newSupertype)
  {
    ALSSignatureDeclaration oldSupertype = supertype;
    supertype = newSupertype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERTYPE, oldSupertype, supertype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSSignatureDeclaration> getSuperset()
  {
    if (superset == null)
    {
      superset = new EObjectResolvingEList<ALSSignatureDeclaration>(ALSSignatureDeclaration.class, this, AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERSET);
    }
    return superset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSFieldDeclaration> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<ALSFieldDeclaration>(ALSFieldDeclaration.class, this, AlloyLanguagePackage.ALS_SIGNATURE_BODY__FIELDS);
    }
    return fields;
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
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__MULTIPLICITY:
        return getMultiplicity();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__ABSTRACT:
        return isAbstract();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__DECLARATIONS:
        return getDeclarations();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERTYPE:
        if (resolve) return getSupertype();
        return basicGetSupertype();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERSET:
        return getSuperset();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__FIELDS:
        return getFields();
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
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__MULTIPLICITY:
        setMultiplicity((ALSMultiplicity)newValue);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends ALSSignatureDeclaration>)newValue);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERTYPE:
        setSupertype((ALSSignatureDeclaration)newValue);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERSET:
        getSuperset().clear();
        getSuperset().addAll((Collection<? extends ALSSignatureDeclaration>)newValue);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends ALSFieldDeclaration>)newValue);
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
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__MULTIPLICITY:
        setMultiplicity(MULTIPLICITY_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__DECLARATIONS:
        getDeclarations().clear();
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERTYPE:
        setSupertype((ALSSignatureDeclaration)null);
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERSET:
        getSuperset().clear();
        return;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__FIELDS:
        getFields().clear();
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
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__MULTIPLICITY:
        return multiplicity != MULTIPLICITY_EDEFAULT;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERTYPE:
        return supertype != null;
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__SUPERSET:
        return superset != null && !superset.isEmpty();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY__FIELDS:
        return fields != null && !fields.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (multiplicity: ");
    result.append(multiplicity);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(')');
    return result.toString();
  }

} //ALSSignatureBodyImpl
