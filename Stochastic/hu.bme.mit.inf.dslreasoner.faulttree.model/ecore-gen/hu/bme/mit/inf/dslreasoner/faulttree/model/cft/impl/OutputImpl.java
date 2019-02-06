/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OutputImpl#getEventDeclaration <em>Event Declaration</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OutputImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.OutputImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends MinimalEObjectImpl.Container implements Output {
	/**
	 * The cached value of the '{@link #getEventDeclaration() <em>Event Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EventDeclaration eventDeclaration;

	/**
	 * The cached value of the '{@link #getOutgoingConnections() <em>Outgoing Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> outgoingConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CftPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDeclaration getEventDeclaration() {
		if (eventDeclaration != null && eventDeclaration.eIsProxy()) {
			InternalEObject oldEventDeclaration = (InternalEObject)eventDeclaration;
			eventDeclaration = (EventDeclaration)eResolveProxy(oldEventDeclaration);
			if (eventDeclaration != oldEventDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CftPackage.OUTPUT__EVENT_DECLARATION, oldEventDeclaration, eventDeclaration));
			}
		}
		return eventDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDeclaration basicGetEventDeclaration() {
		return eventDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventDeclaration(EventDeclaration newEventDeclaration) {
		EventDeclaration oldEventDeclaration = eventDeclaration;
		eventDeclaration = newEventDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.OUTPUT__EVENT_DECLARATION, oldEventDeclaration, eventDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOutgoingConnections() {
		if (outgoingConnections == null) {
			outgoingConnections = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, CftPackage.OUTPUT__OUTGOING_CONNECTIONS, CftPackage.CONNECTION__OUTPUT);
		}
		return outgoingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (eContainerFeatureID() != CftPackage.OUTPUT__COMPONENT) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, CftPackage.OUTPUT__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != CftPackage.OUTPUT__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, CftPackage.COMPONENT__OUTPUTS, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.OUTPUT__COMPONENT, newComponent, newComponent));
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
			case CftPackage.OUTPUT__OUTGOING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnections()).basicAdd(otherEnd, msgs);
			case CftPackage.OUTPUT__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
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
			case CftPackage.OUTPUT__OUTGOING_CONNECTIONS:
				return ((InternalEList<?>)getOutgoingConnections()).basicRemove(otherEnd, msgs);
			case CftPackage.OUTPUT__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case CftPackage.OUTPUT__COMPONENT:
				return eInternalContainer().eInverseRemove(this, CftPackage.COMPONENT__OUTPUTS, Component.class, msgs);
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
			case CftPackage.OUTPUT__EVENT_DECLARATION:
				if (resolve) return getEventDeclaration();
				return basicGetEventDeclaration();
			case CftPackage.OUTPUT__OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case CftPackage.OUTPUT__COMPONENT:
				return getComponent();
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
			case CftPackage.OUTPUT__EVENT_DECLARATION:
				setEventDeclaration((EventDeclaration)newValue);
				return;
			case CftPackage.OUTPUT__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				getOutgoingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case CftPackage.OUTPUT__COMPONENT:
				setComponent((Component)newValue);
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
			case CftPackage.OUTPUT__EVENT_DECLARATION:
				setEventDeclaration((EventDeclaration)null);
				return;
			case CftPackage.OUTPUT__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				return;
			case CftPackage.OUTPUT__COMPONENT:
				setComponent((Component)null);
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
			case CftPackage.OUTPUT__EVENT_DECLARATION:
				return eventDeclaration != null;
			case CftPackage.OUTPUT__OUTGOING_CONNECTIONS:
				return outgoingConnections != null && !outgoingConnections.isEmpty();
			case CftPackage.OUTPUT__COMPONENT:
				return getComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputImpl
