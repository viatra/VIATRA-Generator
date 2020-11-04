/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.impl;

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl#getDefaultMemory <em>Default Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl#getDefaultHdd <em>Default Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostTypeImpl extends MinimalEObjectImpl.Container implements HostType {
	/**
	 * The default value of the '{@link #getDefaultMemory() <em>Default Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultMemory() <em>Default Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMemory()
	 * @generated
	 * @ordered
	 */
	protected int defaultMemory = DEFAULT_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected int defaultHdd = DEFAULT_HDD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HostInstance> instances;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.HOST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefaultMemory() {
		return defaultMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMemory(int newDefaultMemory) {
		int oldDefaultMemory = defaultMemory;
		defaultMemory = newDefaultMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__DEFAULT_MEMORY,
					oldDefaultMemory, defaultMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefaultHdd() {
		return defaultHdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultHdd(int newDefaultHdd) {
		int oldDefaultHdd = defaultHdd;
		defaultHdd = newDefaultHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__DEFAULT_HDD, oldDefaultHdd,
					defaultHdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HostInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentWithInverseEList<HostInstance>(HostInstance.class, this,
					CpsPackage.HOST_TYPE__INSTANCES, CpsPackage.HOST_INSTANCE__TYPE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsPackage.HOST_TYPE__COST, oldCost, cost));
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
		case CpsPackage.HOST_TYPE__INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInstances()).basicAdd(otherEnd, msgs);
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
		case CpsPackage.HOST_TYPE__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
			return getDefaultMemory();
		case CpsPackage.HOST_TYPE__DEFAULT_HDD:
			return getDefaultHdd();
		case CpsPackage.HOST_TYPE__INSTANCES:
			return getInstances();
		case CpsPackage.HOST_TYPE__COST:
			return getCost();
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
		case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
			setDefaultMemory((Integer) newValue);
			return;
		case CpsPackage.HOST_TYPE__DEFAULT_HDD:
			setDefaultHdd((Integer) newValue);
			return;
		case CpsPackage.HOST_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends HostInstance>) newValue);
			return;
		case CpsPackage.HOST_TYPE__COST:
			setCost((Integer) newValue);
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
		case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
			setDefaultMemory(DEFAULT_MEMORY_EDEFAULT);
			return;
		case CpsPackage.HOST_TYPE__DEFAULT_HDD:
			setDefaultHdd(DEFAULT_HDD_EDEFAULT);
			return;
		case CpsPackage.HOST_TYPE__INSTANCES:
			getInstances().clear();
			return;
		case CpsPackage.HOST_TYPE__COST:
			setCost(COST_EDEFAULT);
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
		case CpsPackage.HOST_TYPE__DEFAULT_MEMORY:
			return defaultMemory != DEFAULT_MEMORY_EDEFAULT;
		case CpsPackage.HOST_TYPE__DEFAULT_HDD:
			return defaultHdd != DEFAULT_HDD_EDEFAULT;
		case CpsPackage.HOST_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
		case CpsPackage.HOST_TYPE__COST:
			return cost != COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (defaultMemory: ");
		result.append(defaultMemory);
		result.append(", defaultHdd: ");
		result.append(defaultHdd);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //HostTypeImpl
