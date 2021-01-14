/**
 */
package simpleScenario.impl;

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

import simpleScenario.Actor;
import simpleScenario.Lane;
import simpleScenario.Orientation;
import simpleScenario.SimpleScenarioPackage;
import simpleScenario.Size;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.impl.LaneImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link simpleScenario.impl.LaneImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link simpleScenario.impl.LaneImpl#getReferenceCoord <em>Reference Coord</em>}</li>
 *   <li>{@link simpleScenario.impl.LaneImpl#getPrevLane <em>Prev Lane</em>}</li>
 *   <li>{@link simpleScenario.impl.LaneImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link simpleScenario.impl.LaneImpl#getNumWidth <em>Num Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends MinimalEObjectImpl.Container implements Lane {
	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.VERTICAL;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Size WIDTH_EDEFAULT = Size.SMALL;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Size width = WIDTH_EDEFAULT;

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
	 * The cached value of the '{@link #getPrevLane() <em>Prev Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevLane()
	 * @generated
	 * @ordered
	 */
	protected Lane prevLane;

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
	 * The default value of the '{@link #getNumWidth() <em>Num Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double NUM_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNumWidth() <em>Num Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumWidth()
	 * @generated
	 * @ordered
	 */
	protected double numWidth = NUM_WIDTH_EDEFAULT;

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
		return SimpleScenarioPackage.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.LANE__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Size newWidth) {
		Size oldWidth = width;
		width = newWidth == null ? WIDTH_EDEFAULT : newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.LANE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.LANE__REFERENCE_COORD, oldReferenceCoord, referenceCoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane getPrevLane() {
		if (prevLane != null && prevLane.eIsProxy()) {
			InternalEObject oldPrevLane = (InternalEObject)prevLane;
			prevLane = (Lane)eResolveProxy(oldPrevLane);
			if (prevLane != oldPrevLane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleScenarioPackage.LANE__PREV_LANE, oldPrevLane, prevLane));
			}
		}
		return prevLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane basicGetPrevLane() {
		return prevLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevLane(Lane newPrevLane) {
		Lane oldPrevLane = prevLane;
		prevLane = newPrevLane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.LANE__PREV_LANE, oldPrevLane, prevLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectWithInverseResolvingEList<Actor>(Actor.class, this, SimpleScenarioPackage.LANE__ACTORS, SimpleScenarioPackage.ACTOR__PLACED_ON);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNumWidth() {
		return numWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumWidth(double newNumWidth) {
		double oldNumWidth = numWidth;
		numWidth = newNumWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.LANE__NUM_WIDTH, oldNumWidth, numWidth));
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
			case SimpleScenarioPackage.LANE__ACTORS:
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
			case SimpleScenarioPackage.LANE__ACTORS:
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
			case SimpleScenarioPackage.LANE__ORIENTATION:
				return getOrientation();
			case SimpleScenarioPackage.LANE__WIDTH:
				return getWidth();
			case SimpleScenarioPackage.LANE__REFERENCE_COORD:
				return getReferenceCoord();
			case SimpleScenarioPackage.LANE__PREV_LANE:
				if (resolve) return getPrevLane();
				return basicGetPrevLane();
			case SimpleScenarioPackage.LANE__ACTORS:
				return getActors();
			case SimpleScenarioPackage.LANE__NUM_WIDTH:
				return getNumWidth();
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
			case SimpleScenarioPackage.LANE__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case SimpleScenarioPackage.LANE__WIDTH:
				setWidth((Size)newValue);
				return;
			case SimpleScenarioPackage.LANE__REFERENCE_COORD:
				setReferenceCoord((Double)newValue);
				return;
			case SimpleScenarioPackage.LANE__PREV_LANE:
				setPrevLane((Lane)newValue);
				return;
			case SimpleScenarioPackage.LANE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case SimpleScenarioPackage.LANE__NUM_WIDTH:
				setNumWidth((Double)newValue);
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
			case SimpleScenarioPackage.LANE__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case SimpleScenarioPackage.LANE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case SimpleScenarioPackage.LANE__REFERENCE_COORD:
				setReferenceCoord(REFERENCE_COORD_EDEFAULT);
				return;
			case SimpleScenarioPackage.LANE__PREV_LANE:
				setPrevLane((Lane)null);
				return;
			case SimpleScenarioPackage.LANE__ACTORS:
				getActors().clear();
				return;
			case SimpleScenarioPackage.LANE__NUM_WIDTH:
				setNumWidth(NUM_WIDTH_EDEFAULT);
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
			case SimpleScenarioPackage.LANE__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case SimpleScenarioPackage.LANE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case SimpleScenarioPackage.LANE__REFERENCE_COORD:
				return referenceCoord != REFERENCE_COORD_EDEFAULT;
			case SimpleScenarioPackage.LANE__PREV_LANE:
				return prevLane != null;
			case SimpleScenarioPackage.LANE__ACTORS:
				return actors != null && !actors.isEmpty();
			case SimpleScenarioPackage.LANE__NUM_WIDTH:
				return numWidth != NUM_WIDTH_EDEFAULT;
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(", width: ");
		result.append(width);
		result.append(", referenceCoord: ");
		result.append(referenceCoord);
		result.append(", numWidth: ");
		result.append(numWidth);
		result.append(')');
		return result.toString();
	}

} //LaneImpl
