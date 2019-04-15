/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.impl;

import hu.bme.mit.inf.dslreasoner.domains.satellite.CommSubsystem;
import hu.bme.mit.inf.dslreasoner.domains.satellite.CommunicatingElement;
import hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage;

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
 * An implementation of the model object '<em><b>Communicating Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.CommunicatingElementImpl#getCommSubsystem <em>Comm Subsystem</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.CommunicatingElementImpl#getCommunicationLink <em>Communication Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommunicatingElementImpl extends MinimalEObjectImpl.Container implements CommunicatingElement {
	/**
	 * The cached value of the '{@link #getCommSubsystem() <em>Comm Subsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommSubsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<CommSubsystem> commSubsystem;

	/**
	 * The cached value of the '{@link #getCommunicationLink() <em>Communication Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLink()
	 * @generated
	 * @ordered
	 */
	protected DirectedCommunicationLink communicationLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicatingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SatellitePackage.Literals.COMMUNICATING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommSubsystem> getCommSubsystem() {
		if (commSubsystem == null) {
			commSubsystem = new EObjectContainmentEList<CommSubsystem>(CommSubsystem.class, this,
					SatellitePackage.COMMUNICATING_ELEMENT__COMM_SUBSYSTEM);
		}
		return commSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedCommunicationLink getCommunicationLink() {
		return communicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationLink(DirectedCommunicationLink newCommunicationLink,
			NotificationChain msgs) {
		DirectedCommunicationLink oldCommunicationLink = communicationLink;
		communicationLink = newCommunicationLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK, oldCommunicationLink,
					newCommunicationLink);
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
	public void setCommunicationLink(DirectedCommunicationLink newCommunicationLink) {
		if (newCommunicationLink != communicationLink) {
			NotificationChain msgs = null;
			if (communicationLink != null)
				msgs = ((InternalEObject) communicationLink).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK, null,
						msgs);
			if (newCommunicationLink != null)
				msgs = ((InternalEObject) newCommunicationLink).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK, null,
						msgs);
			msgs = basicSetCommunicationLink(newCommunicationLink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK, newCommunicationLink,
					newCommunicationLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SatellitePackage.COMMUNICATING_ELEMENT__COMM_SUBSYSTEM:
			return ((InternalEList<?>) getCommSubsystem()).basicRemove(otherEnd, msgs);
		case SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK:
			return basicSetCommunicationLink(null, msgs);
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
		case SatellitePackage.COMMUNICATING_ELEMENT__COMM_SUBSYSTEM:
			return getCommSubsystem();
		case SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK:
			return getCommunicationLink();
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
		case SatellitePackage.COMMUNICATING_ELEMENT__COMM_SUBSYSTEM:
			getCommSubsystem().clear();
			getCommSubsystem().addAll((Collection<? extends CommSubsystem>) newValue);
			return;
		case SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK:
			setCommunicationLink((DirectedCommunicationLink) newValue);
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
		case SatellitePackage.COMMUNICATING_ELEMENT__COMM_SUBSYSTEM:
			getCommSubsystem().clear();
			return;
		case SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK:
			setCommunicationLink((DirectedCommunicationLink) null);
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
		case SatellitePackage.COMMUNICATING_ELEMENT__COMM_SUBSYSTEM:
			return commSubsystem != null && !commSubsystem.isEmpty();
		case SatellitePackage.COMMUNICATING_ELEMENT__COMMUNICATION_LINK:
			return communicationLink != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicatingElementImpl
