/**
 */
package crossingScenario.impl;

import crossingScenario.Actor;
import crossingScenario.CrossingScenarioPackage;
import crossingScenario.VisionBlocked;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Blocked</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.impl.VisionBlockedImpl#getBlockedBy <em>Blocked By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionBlockedImpl extends RelationImpl implements VisionBlocked {
	/**
	 * The cached value of the '{@link #getBlockedBy() <em>Blocked By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockedBy()
	 * @generated
	 * @ordered
	 */
	protected Actor blockedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionBlockedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrossingScenarioPackage.Literals.VISION_BLOCKED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor getBlockedBy() {
		if (blockedBy != null && blockedBy.eIsProxy()) {
			InternalEObject oldBlockedBy = (InternalEObject)blockedBy;
			blockedBy = (Actor)eResolveProxy(oldBlockedBy);
			if (blockedBy != oldBlockedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrossingScenarioPackage.VISION_BLOCKED__BLOCKED_BY, oldBlockedBy, blockedBy));
			}
		}
		return blockedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetBlockedBy() {
		return blockedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockedBy(Actor newBlockedBy) {
		Actor oldBlockedBy = blockedBy;
		blockedBy = newBlockedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.VISION_BLOCKED__BLOCKED_BY, oldBlockedBy, blockedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrossingScenarioPackage.VISION_BLOCKED__BLOCKED_BY:
				if (resolve) return getBlockedBy();
				return basicGetBlockedBy();
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
			case CrossingScenarioPackage.VISION_BLOCKED__BLOCKED_BY:
				setBlockedBy((Actor)newValue);
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
			case CrossingScenarioPackage.VISION_BLOCKED__BLOCKED_BY:
				setBlockedBy((Actor)null);
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
			case CrossingScenarioPackage.VISION_BLOCKED__BLOCKED_BY:
				return blockedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //VisionBlockedImpl
