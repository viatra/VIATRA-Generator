/**
 */
package satellite.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import satellite.CommSubsystem;
import satellite.SatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link satellite.impl.CommSubsystemImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link satellite.impl.CommSubsystemImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommSubsystemImpl extends MinimalEObjectImpl.Container implements CommSubsystem {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CommSubsystem target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<CommSubsystem> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SatellitePackage.Literals.COMM_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommSubsystem getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (CommSubsystem) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SatellitePackage.COMM_SUBSYSTEM__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommSubsystem basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(CommSubsystem newTarget, NotificationChain msgs) {
		CommSubsystem oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SatellitePackage.COMM_SUBSYSTEM__TARGET, oldTarget, newTarget);
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
	public void setTarget(CommSubsystem newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, SatellitePackage.COMM_SUBSYSTEM__SOURCE,
						CommSubsystem.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, SatellitePackage.COMM_SUBSYSTEM__SOURCE,
						CommSubsystem.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.COMM_SUBSYSTEM__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommSubsystem> getSource() {
		if (source == null) {
			source = new EObjectWithInverseResolvingEList<CommSubsystem>(CommSubsystem.class, this,
					SatellitePackage.COMM_SUBSYSTEM__SOURCE, SatellitePackage.COMM_SUBSYSTEM__TARGET);
		}
		return source;
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
		case SatellitePackage.COMM_SUBSYSTEM__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, SatellitePackage.COMM_SUBSYSTEM__SOURCE,
						CommSubsystem.class, msgs);
			return basicSetTarget((CommSubsystem) otherEnd, msgs);
		case SatellitePackage.COMM_SUBSYSTEM__SOURCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSource()).basicAdd(otherEnd, msgs);
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
		case SatellitePackage.COMM_SUBSYSTEM__TARGET:
			return basicSetTarget(null, msgs);
		case SatellitePackage.COMM_SUBSYSTEM__SOURCE:
			return ((InternalEList<?>) getSource()).basicRemove(otherEnd, msgs);
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
		case SatellitePackage.COMM_SUBSYSTEM__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case SatellitePackage.COMM_SUBSYSTEM__SOURCE:
			return getSource();
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
		case SatellitePackage.COMM_SUBSYSTEM__TARGET:
			setTarget((CommSubsystem) newValue);
			return;
		case SatellitePackage.COMM_SUBSYSTEM__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends CommSubsystem>) newValue);
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
		case SatellitePackage.COMM_SUBSYSTEM__TARGET:
			setTarget((CommSubsystem) null);
			return;
		case SatellitePackage.COMM_SUBSYSTEM__SOURCE:
			getSource().clear();
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
		case SatellitePackage.COMM_SUBSYSTEM__TARGET:
			return target != null;
		case SatellitePackage.COMM_SUBSYSTEM__SOURCE:
			return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommSubsystemImpl
