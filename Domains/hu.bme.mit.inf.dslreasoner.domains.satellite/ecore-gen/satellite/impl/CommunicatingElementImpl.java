/**
 */
package satellite.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import satellite.CommSubsystem;
import satellite.CommunicatingElement;
import satellite.DirectedCommunicationLink;
import satellite.SatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communicating Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link satellite.impl.CommunicatingElementImpl#getCommSubsystem <em>Comm Subsystem</em>}</li>
 *   <li>{@link satellite.impl.CommunicatingElementImpl#getCommunicationLink <em>Communication Link</em>}</li>
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
		DirectedCommunicationLink communicationLink = basicGetCommunicationLink();
		return communicationLink != null && communicationLink.eIsProxy()
				? (DirectedCommunicationLink) eResolveProxy((InternalEObject) communicationLink)
				: communicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedCommunicationLink basicGetCommunicationLink() {
		// TODO: implement this method to return the 'Communication Link' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			if (resolve)
				return getCommunicationLink();
			return basicGetCommunicationLink();
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
			return basicGetCommunicationLink() != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicatingElementImpl
