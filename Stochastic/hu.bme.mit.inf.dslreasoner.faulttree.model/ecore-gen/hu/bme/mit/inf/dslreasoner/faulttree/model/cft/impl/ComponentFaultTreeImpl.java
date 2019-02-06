/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;

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
 * An implementation of the model object '<em><b>Component Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentFaultTreeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentFaultTreeImpl#getTopEvent <em>Top Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentFaultTreeImpl extends MinimalEObjectImpl.Container implements ComponentFaultTree {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getTopEvent() <em>Top Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopEvent()
	 * @generated
	 * @ordered
	 */
	protected Output topEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFaultTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CftPackage.Literals.COMPONENT_FAULT_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, CftPackage.COMPONENT_FAULT_TREE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getTopEvent() {
		if (topEvent != null && topEvent.eIsProxy()) {
			InternalEObject oldTopEvent = (InternalEObject)topEvent;
			topEvent = (Output)eResolveProxy(oldTopEvent);
			if (topEvent != oldTopEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CftPackage.COMPONENT_FAULT_TREE__TOP_EVENT, oldTopEvent, topEvent));
			}
		}
		return topEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetTopEvent() {
		return topEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopEvent(Output newTopEvent) {
		Output oldTopEvent = topEvent;
		topEvent = newTopEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.COMPONENT_FAULT_TREE__TOP_EVENT, oldTopEvent, topEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CftPackage.COMPONENT_FAULT_TREE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case CftPackage.COMPONENT_FAULT_TREE__COMPONENTS:
				return getComponents();
			case CftPackage.COMPONENT_FAULT_TREE__TOP_EVENT:
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
			case CftPackage.COMPONENT_FAULT_TREE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case CftPackage.COMPONENT_FAULT_TREE__TOP_EVENT:
				setTopEvent((Output)newValue);
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
			case CftPackage.COMPONENT_FAULT_TREE__COMPONENTS:
				getComponents().clear();
				return;
			case CftPackage.COMPONENT_FAULT_TREE__TOP_EVENT:
				setTopEvent((Output)null);
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
			case CftPackage.COMPONENT_FAULT_TREE__COMPONENTS:
				return components != null && !components.isEmpty();
			case CftPackage.COMPONENT_FAULT_TREE__TOP_EVENT:
				return topEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentFaultTreeImpl
