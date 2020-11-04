/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.impl;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType;
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationInstanceImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationInstanceImpl#getAllocatedTo <em>Allocated To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationInstanceImpl extends MinimalEObjectImpl.Container implements ApplicationInstance {
	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirement;

	/**
	 * The cached value of the '{@link #getAllocatedTo() <em>Allocated To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedTo()
	 * @generated
	 * @ordered
	 */
	protected HostInstance allocatedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.APPLICATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject) requirement;
			requirement = (Requirement) eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CpsPackage.APPLICATION_INSTANCE__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(Requirement newRequirement, NotificationChain msgs) {
		Requirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpsPackage.APPLICATION_INSTANCE__REQUIREMENT, oldRequirement, newRequirement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirement(Requirement newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject) requirement).eInverseRemove(this, CpsPackage.REQUIREMENT__INSTANCES,
						Requirement.class, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject) newRequirement).eInverseAdd(this, CpsPackage.REQUIREMENT__INSTANCES,
						Requirement.class, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__REQUIREMENT,
					newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationType getType() {
		if (eContainerFeatureID() != CpsPackage.APPLICATION_INSTANCE__TYPE)
			return null;
		return (ApplicationType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ApplicationType newType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newType, CpsPackage.APPLICATION_INSTANCE__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ApplicationType newType) {
		if (newType != eInternalContainer()
				|| (eContainerFeatureID() != CpsPackage.APPLICATION_INSTANCE__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, CpsPackage.APPLICATION_TYPE__INSTANCES,
						ApplicationType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__TYPE, newType,
					newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostInstance getAllocatedTo() {
		if (allocatedTo != null && allocatedTo.eIsProxy()) {
			InternalEObject oldAllocatedTo = (InternalEObject) allocatedTo;
			allocatedTo = (HostInstance) eResolveProxy(oldAllocatedTo);
			if (allocatedTo != oldAllocatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO, oldAllocatedTo, allocatedTo));
			}
		}
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostInstance basicGetAllocatedTo() {
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedTo(HostInstance newAllocatedTo, NotificationChain msgs) {
		HostInstance oldAllocatedTo = allocatedTo;
		allocatedTo = newAllocatedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO, oldAllocatedTo, newAllocatedTo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocatedTo(HostInstance newAllocatedTo) {
		if (newAllocatedTo != allocatedTo) {
			NotificationChain msgs = null;
			if (allocatedTo != null)
				msgs = ((InternalEObject) allocatedTo).eInverseRemove(this, CpsPackage.HOST_INSTANCE__APPLICATIONS,
						HostInstance.class, msgs);
			if (newAllocatedTo != null)
				msgs = ((InternalEObject) newAllocatedTo).eInverseAdd(this, CpsPackage.HOST_INSTANCE__APPLICATIONS,
						HostInstance.class, msgs);
			msgs = basicSetAllocatedTo(newAllocatedTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO,
					newAllocatedTo, newAllocatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsPackage.APPLICATION_INSTANCE__REQUIREMENT:
			if (requirement != null)
				msgs = ((InternalEObject) requirement).eInverseRemove(this, CpsPackage.REQUIREMENT__INSTANCES,
						Requirement.class, msgs);
			return basicSetRequirement((Requirement) otherEnd, msgs);
		case CpsPackage.APPLICATION_INSTANCE__TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetType((ApplicationType) otherEnd, msgs);
		case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
			if (allocatedTo != null)
				msgs = ((InternalEObject) allocatedTo).eInverseRemove(this, CpsPackage.HOST_INSTANCE__APPLICATIONS,
						HostInstance.class, msgs);
			return basicSetAllocatedTo((HostInstance) otherEnd, msgs);
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
		case CpsPackage.APPLICATION_INSTANCE__REQUIREMENT:
			return basicSetRequirement(null, msgs);
		case CpsPackage.APPLICATION_INSTANCE__TYPE:
			return basicSetType(null, msgs);
		case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
			return basicSetAllocatedTo(null, msgs);
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
		case CpsPackage.APPLICATION_INSTANCE__TYPE:
			return eInternalContainer().eInverseRemove(this, CpsPackage.APPLICATION_TYPE__INSTANCES,
					ApplicationType.class, msgs);
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
		case CpsPackage.APPLICATION_INSTANCE__REQUIREMENT:
			if (resolve)
				return getRequirement();
			return basicGetRequirement();
		case CpsPackage.APPLICATION_INSTANCE__TYPE:
			return getType();
		case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
			if (resolve)
				return getAllocatedTo();
			return basicGetAllocatedTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpsPackage.APPLICATION_INSTANCE__REQUIREMENT:
			setRequirement((Requirement) newValue);
			return;
		case CpsPackage.APPLICATION_INSTANCE__TYPE:
			setType((ApplicationType) newValue);
			return;
		case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
			setAllocatedTo((HostInstance) newValue);
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
		case CpsPackage.APPLICATION_INSTANCE__REQUIREMENT:
			setRequirement((Requirement) null);
			return;
		case CpsPackage.APPLICATION_INSTANCE__TYPE:
			setType((ApplicationType) null);
			return;
		case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
			setAllocatedTo((HostInstance) null);
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
		case CpsPackage.APPLICATION_INSTANCE__REQUIREMENT:
			return requirement != null;
		case CpsPackage.APPLICATION_INSTANCE__TYPE:
			return getType() != null;
		case CpsPackage.APPLICATION_INSTANCE__ALLOCATED_TO:
			return allocatedTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationInstanceImpl
