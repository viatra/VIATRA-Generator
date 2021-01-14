/**
 */
package crossingScenario.impl;

import crossingScenario.CollisionExists;
import crossingScenario.CrossingScenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collision Exists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.impl.CollisionExistsImpl#getCollisionTime <em>Collision Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollisionExistsImpl extends TemporalRelationImpl implements CollisionExists {
	/**
	 * The default value of the '{@link #getCollisionTime() <em>Collision Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionTime()
	 * @generated
	 * @ordered
	 */
	protected static final double COLLISION_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCollisionTime() <em>Collision Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionTime()
	 * @generated
	 * @ordered
	 */
	protected double collisionTime = COLLISION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollisionExistsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrossingScenarioPackage.Literals.COLLISION_EXISTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCollisionTime() {
		return collisionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollisionTime(double newCollisionTime) {
		double oldCollisionTime = collisionTime;
		collisionTime = newCollisionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.COLLISION_EXISTS__COLLISION_TIME, oldCollisionTime, collisionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CrossingScenarioPackage.COLLISION_EXISTS__COLLISION_TIME:
				return getCollisionTime();
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
			case CrossingScenarioPackage.COLLISION_EXISTS__COLLISION_TIME:
				setCollisionTime((Double)newValue);
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
			case CrossingScenarioPackage.COLLISION_EXISTS__COLLISION_TIME:
				setCollisionTime(COLLISION_TIME_EDEFAULT);
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
			case CrossingScenarioPackage.COLLISION_EXISTS__COLLISION_TIME:
				return collisionTime != COLLISION_TIME_EDEFAULT;
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
		result.append(" (collisionTime: ");
		result.append(collisionTime);
		result.append(')');
		return result.toString();
	}

} //CollisionExistsImpl
