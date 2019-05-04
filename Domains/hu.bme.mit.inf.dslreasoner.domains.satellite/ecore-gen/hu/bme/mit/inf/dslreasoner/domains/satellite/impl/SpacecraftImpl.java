/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.impl;

import hu.bme.mit.inf.dslreasoner.domains.satellite.Payload;
import hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage;
import hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft;

import hu.bme.mit.inf.dslreasoner.domains.satellite.SpacecraftKind;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.SpacecraftImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.impl.SpacecraftImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpacecraftImpl extends CommunicatingElementImpl implements Spacecraft {
	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected Payload payload;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SpacecraftKind KIND_EDEFAULT = SpacecraftKind.CUBE_SAT3_U;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SpacecraftKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SatellitePackage.Literals.SPACECRAFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payload getPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayload(Payload newPayload, NotificationChain msgs) {
		Payload oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SatellitePackage.SPACECRAFT__PAYLOAD, oldPayload, newPayload);
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
	public void setPayload(Payload newPayload) {
		if (newPayload != payload) {
			NotificationChain msgs = null;
			if (payload != null)
				msgs = ((InternalEObject) payload).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SatellitePackage.SPACECRAFT__PAYLOAD, null, msgs);
			if (newPayload != null)
				msgs = ((InternalEObject) newPayload).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SatellitePackage.SPACECRAFT__PAYLOAD, null, msgs);
			msgs = basicSetPayload(newPayload, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.SPACECRAFT__PAYLOAD, newPayload,
					newPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpacecraftKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(SpacecraftKind newKind) {
		SpacecraftKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.SPACECRAFT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SatellitePackage.SPACECRAFT__PAYLOAD:
			return basicSetPayload(null, msgs);
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
		case SatellitePackage.SPACECRAFT__PAYLOAD:
			return getPayload();
		case SatellitePackage.SPACECRAFT__KIND:
			return getKind();
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
		case SatellitePackage.SPACECRAFT__PAYLOAD:
			setPayload((Payload) newValue);
			return;
		case SatellitePackage.SPACECRAFT__KIND:
			setKind((SpacecraftKind) newValue);
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
		case SatellitePackage.SPACECRAFT__PAYLOAD:
			setPayload((Payload) null);
			return;
		case SatellitePackage.SPACECRAFT__KIND:
			setKind(KIND_EDEFAULT);
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
		case SatellitePackage.SPACECRAFT__PAYLOAD:
			return payload != null;
		case SatellitePackage.SPACECRAFT__KIND:
			return kind != KIND_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //SpacecraftImpl
