/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.impl;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl#getAvailableMemory <em>Available Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl#getAvailableHdd <em>Available Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl#getTotalMemory <em>Total Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl#getTotalHdd <em>Total Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostInstanceImpl extends MinimalEObjectImpl.Container implements HostInstance {
	/**
	 * The cached setting delegate for the '{@link #getAvailableMemory() <em>Available Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableMemory()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate AVAILABLE_MEMORY__ESETTING_DELEGATE = ((EStructuralFeature.Internal) CpsPackage.Literals.HOST_INSTANCE__AVAILABLE_MEMORY)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAvailableHdd() <em>Available Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableHdd()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate AVAILABLE_HDD__ESETTING_DELEGATE = ((EStructuralFeature.Internal) CpsPackage.Literals.HOST_INSTANCE__AVAILABLE_HDD)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTotalMemory() <em>Total Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMemory()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TOTAL_MEMORY__ESETTING_DELEGATE = ((EStructuralFeature.Internal) CpsPackage.Literals.HOST_INSTANCE__TOTAL_MEMORY)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTotalHdd() <em>Total Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHdd()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TOTAL_HDD__ESETTING_DELEGATE = ((EStructuralFeature.Internal) CpsPackage.Literals.HOST_INSTANCE__TOTAL_HDD)
			.getSettingDelegate();

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInstance> applications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.HOST_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostType getType() {
		if (eContainerFeatureID() != CpsPackage.HOST_INSTANCE__TYPE)
			return null;
		return (HostType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(HostType newType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newType, CpsPackage.HOST_INSTANCE__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(HostType newType) {
		if (newType != eInternalContainer()
				|| (eContainerFeatureID() != CpsPackage.HOST_INSTANCE__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, CpsPackage.HOST_TYPE__INSTANCES, HostType.class,
						msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailableMemory() {
		return (Integer) AVAILABLE_MEMORY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailableHdd() {
		return (Integer) AVAILABLE_HDD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalMemory() {
		return (Integer) TOTAL_MEMORY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalHdd() {
		return (Integer) TOTAL_HDD__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplicationInstance> getApplications() {
		if (applications == null) {
			applications = new EObjectWithInverseResolvingEList<ApplicationInstance>(ApplicationInstance.class, this,
					CpsPackage.HOST_INSTANCE__APPLICATIONS, CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsPackage.HOST_INSTANCE__TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetType((HostType) otherEnd, msgs);
		case CpsPackage.HOST_INSTANCE__APPLICATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getApplications()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsPackage.HOST_INSTANCE__TYPE:
			return basicSetType(null, msgs);
		case CpsPackage.HOST_INSTANCE__APPLICATIONS:
			return ((InternalEList<?>) getApplications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CpsPackage.HOST_INSTANCE__TYPE:
			return eInternalContainer().eInverseRemove(this, CpsPackage.HOST_TYPE__INSTANCES, HostType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsPackage.HOST_INSTANCE__TYPE:
			return getType();
		case CpsPackage.HOST_INSTANCE__AVAILABLE_MEMORY:
			return getAvailableMemory();
		case CpsPackage.HOST_INSTANCE__AVAILABLE_HDD:
			return getAvailableHdd();
		case CpsPackage.HOST_INSTANCE__TOTAL_MEMORY:
			return getTotalMemory();
		case CpsPackage.HOST_INSTANCE__TOTAL_HDD:
			return getTotalHdd();
		case CpsPackage.HOST_INSTANCE__APPLICATIONS:
			return getApplications();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpsPackage.HOST_INSTANCE__TYPE:
			setType((HostType) newValue);
			return;
		case CpsPackage.HOST_INSTANCE__APPLICATIONS:
			getApplications().clear();
			getApplications().addAll((Collection<? extends ApplicationInstance>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case CpsPackage.HOST_INSTANCE__TYPE:
			setType((HostType) null);
			return;
		case CpsPackage.HOST_INSTANCE__APPLICATIONS:
			getApplications().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CpsPackage.HOST_INSTANCE__TYPE:
			return getType() != null;
		case CpsPackage.HOST_INSTANCE__AVAILABLE_MEMORY:
			return AVAILABLE_MEMORY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case CpsPackage.HOST_INSTANCE__AVAILABLE_HDD:
			return AVAILABLE_HDD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case CpsPackage.HOST_INSTANCE__TOTAL_MEMORY:
			return TOTAL_MEMORY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case CpsPackage.HOST_INSTANCE__TOTAL_HDD:
			return TOTAL_HDD__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case CpsPackage.HOST_INSTANCE__APPLICATIONS:
			return applications != null && !applications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HostInstanceImpl
