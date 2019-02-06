/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.InputImpl#getIntputEvent <em>Intput Event</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.InputImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.InputImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The cached value of the '{@link #getIntputEvent() <em>Intput Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntputEvent()
	 * @generated
	 * @ordered
	 */
	protected IntputEvent intputEvent;

	/**
	 * The cached value of the '{@link #getIncomingConnections() <em>Incoming Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> incomingConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CftPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntputEvent getIntputEvent() {
		if (intputEvent != null && intputEvent.eIsProxy()) {
			InternalEObject oldIntputEvent = (InternalEObject)intputEvent;
			intputEvent = (IntputEvent)eResolveProxy(oldIntputEvent);
			if (intputEvent != oldIntputEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CftPackage.INPUT__INTPUT_EVENT, oldIntputEvent, intputEvent));
			}
		}
		return intputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntputEvent basicGetIntputEvent() {
		return intputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntputEvent(IntputEvent newIntputEvent) {
		IntputEvent oldIntputEvent = intputEvent;
		intputEvent = newIntputEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.INPUT__INTPUT_EVENT, oldIntputEvent, intputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (eContainerFeatureID() != CftPackage.INPUT__COMPONENT) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, CftPackage.INPUT__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != CftPackage.INPUT__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, CftPackage.COMPONENT__INPUTS, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.INPUT__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncomingConnections() {
		if (incomingConnections == null) {
			incomingConnections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, CftPackage.INPUT__INCOMING_CONNECTIONS, CftPackage.CONNECTION__INPUT);
		}
		return incomingConnections;
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
			case CftPackage.INPUT__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
			case CftPackage.INPUT__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
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
			case CftPackage.INPUT__COMPONENT:
				return basicSetComponent(null, msgs);
			case CftPackage.INPUT__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
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
			case CftPackage.INPUT__COMPONENT:
				return eInternalContainer().eInverseRemove(this, CftPackage.COMPONENT__INPUTS, Component.class, msgs);
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
			case CftPackage.INPUT__INTPUT_EVENT:
				if (resolve) return getIntputEvent();
				return basicGetIntputEvent();
			case CftPackage.INPUT__COMPONENT:
				return getComponent();
			case CftPackage.INPUT__INCOMING_CONNECTIONS:
				return getIncomingConnections();
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
			case CftPackage.INPUT__INTPUT_EVENT:
				setIntputEvent((IntputEvent)newValue);
				return;
			case CftPackage.INPUT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case CftPackage.INPUT__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection>)newValue);
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
			case CftPackage.INPUT__INTPUT_EVENT:
				setIntputEvent((IntputEvent)null);
				return;
			case CftPackage.INPUT__COMPONENT:
				setComponent((Component)null);
				return;
			case CftPackage.INPUT__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
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
			case CftPackage.INPUT__INTPUT_EVENT:
				return intputEvent != null;
			case CftPackage.INPUT__COMPONENT:
				return getComponent() != null;
			case CftPackage.INPUT__INCOMING_CONNECTIONS:
				return incomingConnections != null && !incomingConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
