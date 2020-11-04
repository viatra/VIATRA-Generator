/**
 */
package modes3.impl;

import java.util.Collection;

import modes3.Modes3Package;
import modes3.Segment;
import modes3.Train;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modes3.impl.SegmentImpl#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link modes3.impl.SegmentImpl#getOccupiedBy <em>Occupied By</em>}</li>
 *   <li>{@link modes3.impl.SegmentImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentImpl extends MinimalEObjectImpl.Container implements Segment {
	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> connectedTo;

	/**
	 * The cached value of the '{@link #getOccupiedBy() <em>Occupied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupiedBy()
	 * @generated
	 * @ordered
	 */
	protected Train occupiedBy;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modes3Package.Literals.SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectResolvingEList<Segment>(Segment.class, this, Modes3Package.SEGMENT__CONNECTED_TO);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train getOccupiedBy() {
		if (occupiedBy != null && occupiedBy.eIsProxy()) {
			InternalEObject oldOccupiedBy = (InternalEObject)occupiedBy;
			occupiedBy = (Train)eResolveProxy(oldOccupiedBy);
			if (occupiedBy != oldOccupiedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Modes3Package.SEGMENT__OCCUPIED_BY, oldOccupiedBy, occupiedBy));
			}
		}
		return occupiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train basicGetOccupiedBy() {
		return occupiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccupiedBy(Train newOccupiedBy, NotificationChain msgs) {
		Train oldOccupiedBy = occupiedBy;
		occupiedBy = newOccupiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Modes3Package.SEGMENT__OCCUPIED_BY, oldOccupiedBy, newOccupiedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupiedBy(Train newOccupiedBy) {
		if (newOccupiedBy != occupiedBy) {
			NotificationChain msgs = null;
			if (occupiedBy != null)
				msgs = ((InternalEObject)occupiedBy).eInverseRemove(this, Modes3Package.TRAIN__LOCATION, Train.class, msgs);
			if (newOccupiedBy != null)
				msgs = ((InternalEObject)newOccupiedBy).eInverseAdd(this, Modes3Package.TRAIN__LOCATION, Train.class, msgs);
			msgs = basicSetOccupiedBy(newOccupiedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modes3Package.SEGMENT__OCCUPIED_BY, newOccupiedBy, newOccupiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modes3Package.SEGMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Modes3Package.SEGMENT__OCCUPIED_BY:
				if (occupiedBy != null)
					msgs = ((InternalEObject)occupiedBy).eInverseRemove(this, Modes3Package.TRAIN__LOCATION, Train.class, msgs);
				return basicSetOccupiedBy((Train)otherEnd, msgs);
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
			case Modes3Package.SEGMENT__OCCUPIED_BY:
				return basicSetOccupiedBy(null, msgs);
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
			case Modes3Package.SEGMENT__CONNECTED_TO:
				return getConnectedTo();
			case Modes3Package.SEGMENT__OCCUPIED_BY:
				if (resolve) return getOccupiedBy();
				return basicGetOccupiedBy();
			case Modes3Package.SEGMENT__ID:
				return getId();
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
			case Modes3Package.SEGMENT__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends Segment>)newValue);
				return;
			case Modes3Package.SEGMENT__OCCUPIED_BY:
				setOccupiedBy((Train)newValue);
				return;
			case Modes3Package.SEGMENT__ID:
				setId((Integer)newValue);
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
			case Modes3Package.SEGMENT__CONNECTED_TO:
				getConnectedTo().clear();
				return;
			case Modes3Package.SEGMENT__OCCUPIED_BY:
				setOccupiedBy((Train)null);
				return;
			case Modes3Package.SEGMENT__ID:
				setId(ID_EDEFAULT);
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
			case Modes3Package.SEGMENT__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
			case Modes3Package.SEGMENT__OCCUPIED_BY:
				return occupiedBy != null;
			case Modes3Package.SEGMENT__ID:
				return id != ID_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SegmentImpl
