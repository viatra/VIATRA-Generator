/**
 */
package hu.bme.mit.inf.smartgrid.impl;

import hu.bme.mit.inf.smartgrid.Entity;
import hu.bme.mit.inf.smartgrid.SmartgridPackage;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.smartgrid.impl.EntityImpl#getCommunicationParent <em>Communication Parent</em>}</li>
 *   <li>{@link hu.bme.mit.inf.smartgrid.impl.EntityImpl#getCommunicationChild <em>Communication Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getCommunicationChild() <em>Communication Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> communicationChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartgridPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getCommunicationParent() {
		if (eContainerFeatureID() != SmartgridPackage.ENTITY__COMMUNICATION_PARENT)
			return null;
		return (Entity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationParent(Entity newCommunicationParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCommunicationParent,
				SmartgridPackage.ENTITY__COMMUNICATION_PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationParent(Entity newCommunicationParent) {
		if (newCommunicationParent != eInternalContainer()
				|| (eContainerFeatureID() != SmartgridPackage.ENTITY__COMMUNICATION_PARENT
						&& newCommunicationParent != null)) {
			if (EcoreUtil.isAncestor(this, newCommunicationParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCommunicationParent != null)
				msgs = ((InternalEObject) newCommunicationParent).eInverseAdd(this,
						SmartgridPackage.ENTITY__COMMUNICATION_CHILD, Entity.class, msgs);
			msgs = basicSetCommunicationParent(newCommunicationParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartgridPackage.ENTITY__COMMUNICATION_PARENT,
					newCommunicationParent, newCommunicationParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getCommunicationChild() {
		if (communicationChild == null) {
			communicationChild = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this,
					SmartgridPackage.ENTITY__COMMUNICATION_CHILD, SmartgridPackage.ENTITY__COMMUNICATION_PARENT);
		}
		return communicationChild;
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
		case SmartgridPackage.ENTITY__COMMUNICATION_PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCommunicationParent((Entity) otherEnd, msgs);
		case SmartgridPackage.ENTITY__COMMUNICATION_CHILD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommunicationChild()).basicAdd(otherEnd,
					msgs);
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
		case SmartgridPackage.ENTITY__COMMUNICATION_PARENT:
			return basicSetCommunicationParent(null, msgs);
		case SmartgridPackage.ENTITY__COMMUNICATION_CHILD:
			return ((InternalEList<?>) getCommunicationChild()).basicRemove(otherEnd, msgs);
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
		case SmartgridPackage.ENTITY__COMMUNICATION_PARENT:
			return eInternalContainer().eInverseRemove(this, SmartgridPackage.ENTITY__COMMUNICATION_CHILD, Entity.class,
					msgs);
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
		case SmartgridPackage.ENTITY__COMMUNICATION_PARENT:
			return getCommunicationParent();
		case SmartgridPackage.ENTITY__COMMUNICATION_CHILD:
			return getCommunicationChild();
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
		case SmartgridPackage.ENTITY__COMMUNICATION_PARENT:
			setCommunicationParent((Entity) newValue);
			return;
		case SmartgridPackage.ENTITY__COMMUNICATION_CHILD:
			getCommunicationChild().clear();
			getCommunicationChild().addAll((Collection<? extends Entity>) newValue);
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
		case SmartgridPackage.ENTITY__COMMUNICATION_PARENT:
			setCommunicationParent((Entity) null);
			return;
		case SmartgridPackage.ENTITY__COMMUNICATION_CHILD:
			getCommunicationChild().clear();
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
		case SmartgridPackage.ENTITY__COMMUNICATION_PARENT:
			return getCommunicationParent() != null;
		case SmartgridPackage.ENTITY__COMMUNICATION_CHILD:
			return communicationChild != null && !communicationChild.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
