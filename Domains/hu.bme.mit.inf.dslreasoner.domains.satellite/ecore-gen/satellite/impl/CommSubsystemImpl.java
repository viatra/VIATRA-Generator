/**
 */
package satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link satellite.impl.CommSubsystemImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link satellite.impl.CommSubsystemImpl#getPathLength <em>Path Length</em>}</li>
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
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathLength() <em>Path Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLength()
	 * @generated
	 * @ordered
	 */
	protected static final int PATH_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPathLength() <em>Path Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLength()
	 * @generated
	 * @ordered
	 */
	protected int pathLength = PATH_LENGTH_EDEFAULT;

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
	@Override
	public void setTarget(CommSubsystem newTarget) {
		CommSubsystem oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.COMM_SUBSYSTEM__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.COMM_SUBSYSTEM__FREQUENCY,
					oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPathLength() {
		return pathLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathLength(int newPathLength) {
		int oldPathLength = pathLength;
		pathLength = newPathLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SatellitePackage.COMM_SUBSYSTEM__PATH_LENGTH,
					oldPathLength, pathLength));
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
		case SatellitePackage.COMM_SUBSYSTEM__FREQUENCY:
			return getFrequency();
		case SatellitePackage.COMM_SUBSYSTEM__PATH_LENGTH:
			return getPathLength();
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
		case SatellitePackage.COMM_SUBSYSTEM__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case SatellitePackage.COMM_SUBSYSTEM__PATH_LENGTH:
			setPathLength((Integer) newValue);
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
		case SatellitePackage.COMM_SUBSYSTEM__FREQUENCY:
			setFrequency(FREQUENCY_EDEFAULT);
			return;
		case SatellitePackage.COMM_SUBSYSTEM__PATH_LENGTH:
			setPathLength(PATH_LENGTH_EDEFAULT);
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
		case SatellitePackage.COMM_SUBSYSTEM__FREQUENCY:
			return frequency != FREQUENCY_EDEFAULT;
		case SatellitePackage.COMM_SUBSYSTEM__PATH_LENGTH:
			return pathLength != PATH_LENGTH_EDEFAULT;
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", pathLength: ");
		result.append(pathLength);
		result.append(')');
		return result.toString();
	}

} //CommSubsystemImpl
