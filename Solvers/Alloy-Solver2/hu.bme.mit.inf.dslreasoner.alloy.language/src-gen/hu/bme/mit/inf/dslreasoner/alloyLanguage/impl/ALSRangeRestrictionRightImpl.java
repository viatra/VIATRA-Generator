/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALS Range Restriction Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionRightImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionRightImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSRangeRestrictionRightImpl extends ALSTermImpl implements ALSRangeRestrictionRight
{
  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected ALSTerm relation;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected ALSTerm filter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSRangeRestrictionRightImpl()
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
    return AlloyLanguagePackage.Literals.ALS_RANGE_RESTRICTION_RIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTerm getRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelation(ALSTerm newRelation, NotificationChain msgs)
  {
    ALSTerm oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION, oldRelation, newRelation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(ALSTerm newRelation)
  {
    if (newRelation != relation)
    {
      NotificationChain msgs = null;
      if (relation != null)
        msgs = ((InternalEObject)relation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION, null, msgs);
      if (newRelation != null)
        msgs = ((InternalEObject)newRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION, null, msgs);
      msgs = basicSetRelation(newRelation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION, newRelation, newRelation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTerm getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(ALSTerm newFilter, NotificationChain msgs)
  {
    ALSTerm oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(ALSTerm newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER, newFilter, newFilter));
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
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION:
        return basicSetRelation(null, msgs);
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER:
        return basicSetFilter(null, msgs);
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
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION:
        return getRelation();
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER:
        return getFilter();
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
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION:
        setRelation((ALSTerm)newValue);
        return;
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER:
        setFilter((ALSTerm)newValue);
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
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION:
        setRelation((ALSTerm)null);
        return;
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER:
        setFilter((ALSTerm)null);
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
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__RELATION:
        return relation != null;
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT__FILTER:
        return filter != null;
    }
    return super.eIsSet(featureID);
  }

} //ALSRangeRestrictionRightImpl
