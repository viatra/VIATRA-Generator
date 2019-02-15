/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent;

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
 * An implementation of the model object '<em><b>Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FaultTreeImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.FaultTreeImpl#getTopEvent <em>Top Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultTreeImpl extends ReliabilityModelImpl implements FaultTree {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<RandomEvent> events;

	/**
	 * The cached value of the '{@link #getTopEvent() <em>Top Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopEvent()
	 * @generated
	 * @ordered
	 */
	protected RandomEvent topEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.FAULT_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RandomEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<RandomEvent>(RandomEvent.class, this, FtPackage.FAULT_TREE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomEvent getTopEvent() {
		if (topEvent != null && topEvent.eIsProxy()) {
			InternalEObject oldTopEvent = (InternalEObject)topEvent;
			topEvent = (RandomEvent)eResolveProxy(oldTopEvent);
			if (topEvent != oldTopEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtPackage.FAULT_TREE__TOP_EVENT, oldTopEvent, topEvent));
			}
		}
		return topEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomEvent basicGetTopEvent() {
		return topEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopEvent(RandomEvent newTopEvent) {
		RandomEvent oldTopEvent = topEvent;
		topEvent = newTopEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.FAULT_TREE__TOP_EVENT, oldTopEvent, topEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtPackage.FAULT_TREE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case FtPackage.FAULT_TREE__EVENTS:
				return getEvents();
			case FtPackage.FAULT_TREE__TOP_EVENT:
				if (resolve) return getTopEvent();
				return basicGetTopEvent();
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
			case FtPackage.FAULT_TREE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends RandomEvent>)newValue);
				return;
			case FtPackage.FAULT_TREE__TOP_EVENT:
				setTopEvent((RandomEvent)newValue);
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
			case FtPackage.FAULT_TREE__EVENTS:
				getEvents().clear();
				return;
			case FtPackage.FAULT_TREE__TOP_EVENT:
				setTopEvent((RandomEvent)null);
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
			case FtPackage.FAULT_TREE__EVENTS:
				return events != null && !events.isEmpty();
			case FtPackage.FAULT_TREE__TOP_EVENT:
				return topEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //FaultTreeImpl
