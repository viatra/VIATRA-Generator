/**
 */
package crossingScenario.impl;

import crossingScenario.Actor;
import crossingScenario.CrossingScenarioPackage;
import crossingScenario.Lane;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.impl.LaneImpl#getReferenceCoord <em>Reference Coord</em>}</li>
 *   <li>{@link crossingScenario.impl.LaneImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LaneImpl extends MinimalEObjectImpl.Container implements Lane {
	/**
	 * The default value of the '{@link #getReferenceCoord() <em>Reference Coord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCoord()
	 * @generated
	 * @ordered
	 */
	protected static final double REFERENCE_COORD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReferenceCoord() <em>Reference Coord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCoord()
	 * @generated
	 * @ordered
	 */
	protected double referenceCoord = REFERENCE_COORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrossingScenarioPackage.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getReferenceCoord() {
		return referenceCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceCoord(double newReferenceCoord) {
		double oldReferenceCoord = referenceCoord;
		referenceCoord = newReferenceCoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.LANE__REFERENCE_COORD, oldReferenceCoord, referenceCoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectWithInverseResolvingEList<Actor>(Actor.class, this, CrossingScenarioPackage.LANE__ACTORS, CrossingScenarioPackage.ACTOR__PLACED_ON);
		}
		return actors;
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
			case CrossingScenarioPackage.LANE__ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActors()).basicAdd(otherEnd, msgs);
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
			case CrossingScenarioPackage.LANE__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case CrossingScenarioPackage.LANE__REFERENCE_COORD:
				return getReferenceCoord();
			case CrossingScenarioPackage.LANE__ACTORS:
				return getActors();
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
			case CrossingScenarioPackage.LANE__REFERENCE_COORD:
				setReferenceCoord((Double)newValue);
				return;
			case CrossingScenarioPackage.LANE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
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
			case CrossingScenarioPackage.LANE__REFERENCE_COORD:
				setReferenceCoord(REFERENCE_COORD_EDEFAULT);
				return;
			case CrossingScenarioPackage.LANE__ACTORS:
				getActors().clear();
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
			case CrossingScenarioPackage.LANE__REFERENCE_COORD:
				return referenceCoord != REFERENCE_COORD_EDEFAULT;
			case CrossingScenarioPackage.LANE__ACTORS:
				return actors != null && !actors.isEmpty();
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
		result.append(" (referenceCoord: ");
		result.append(referenceCoord);
		result.append(')');
		return result.toString();
	}

} //LaneImpl
