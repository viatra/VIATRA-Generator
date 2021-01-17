/**
 */
package crossingScenario.impl;

import crossingScenario.Actor;
import crossingScenario.CrossingScenario;
import crossingScenario.CrossingScenarioPackage;
import crossingScenario.Lane;

import crossingScenario.Lane_Horizontal;
import crossingScenario.Lane_Vertical;
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
 * An implementation of the model object '<em><b>Crossing Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.impl.CrossingScenarioImpl#getXSize <em>XSize</em>}</li>
 *   <li>{@link crossingScenario.impl.CrossingScenarioImpl#getYSize <em>YSize</em>}</li>
 *   <li>{@link crossingScenario.impl.CrossingScenarioImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link crossingScenario.impl.CrossingScenarioImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link crossingScenario.impl.CrossingScenarioImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link crossingScenario.impl.CrossingScenarioImpl#getHorizontal_head <em>Horizontal head</em>}</li>
 *   <li>{@link crossingScenario.impl.CrossingScenarioImpl#getVertical_head <em>Vertical head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossingScenarioImpl extends MinimalEObjectImpl.Container implements CrossingScenario {
	/**
	 * The default value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected static final double XSIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected double xSize = XSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected static final double YSIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected double ySize = YSIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanes;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected double maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHorizontal_head() <em>Horizontal head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontal_head()
	 * @generated
	 * @ordered
	 */
	protected Lane_Horizontal horizontal_head;

	/**
	 * The cached value of the '{@link #getVertical_head() <em>Vertical head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertical_head()
	 * @generated
	 * @ordered
	 */
	protected Lane_Vertical vertical_head;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossingScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrossingScenarioPackage.Literals.CROSSING_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXSize() {
		return xSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXSize(double newXSize) {
		double oldXSize = xSize;
		xSize = newXSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.CROSSING_SCENARIO__XSIZE, oldXSize, xSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYSize() {
		return ySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYSize(double newYSize) {
		double oldYSize = ySize;
		ySize = newYSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.CROSSING_SCENARIO__YSIZE, oldYSize, ySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, CrossingScenarioPackage.CROSSING_SCENARIO__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lane> getLanes() {
		if (lanes == null) {
			lanes = new EObjectContainmentEList<Lane>(Lane.class, this, CrossingScenarioPackage.CROSSING_SCENARIO__LANES);
		}
		return lanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTime(double newMaxTime) {
		double oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.CROSSING_SCENARIO__MAX_TIME, oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane_Horizontal getHorizontal_head() {
		if (horizontal_head != null && horizontal_head.eIsProxy()) {
			InternalEObject oldHorizontal_head = (InternalEObject)horizontal_head;
			horizontal_head = (Lane_Horizontal)eResolveProxy(oldHorizontal_head);
			if (horizontal_head != oldHorizontal_head) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrossingScenarioPackage.CROSSING_SCENARIO__HORIZONTAL_HEAD, oldHorizontal_head, horizontal_head));
			}
		}
		return horizontal_head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane_Horizontal basicGetHorizontal_head() {
		return horizontal_head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontal_head(Lane_Horizontal newHorizontal_head) {
		Lane_Horizontal oldHorizontal_head = horizontal_head;
		horizontal_head = newHorizontal_head;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.CROSSING_SCENARIO__HORIZONTAL_HEAD, oldHorizontal_head, horizontal_head));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane_Vertical getVertical_head() {
		if (vertical_head != null && vertical_head.eIsProxy()) {
			InternalEObject oldVertical_head = (InternalEObject)vertical_head;
			vertical_head = (Lane_Vertical)eResolveProxy(oldVertical_head);
			if (vertical_head != oldVertical_head) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrossingScenarioPackage.CROSSING_SCENARIO__VERTICAL_HEAD, oldVertical_head, vertical_head));
			}
		}
		return vertical_head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane_Vertical basicGetVertical_head() {
		return vertical_head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVertical_head(Lane_Vertical newVertical_head) {
		Lane_Vertical oldVertical_head = vertical_head;
		vertical_head = newVertical_head;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.CROSSING_SCENARIO__VERTICAL_HEAD, oldVertical_head, vertical_head));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrossingScenarioPackage.CROSSING_SCENARIO__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case CrossingScenarioPackage.CROSSING_SCENARIO__LANES:
				return ((InternalEList<?>)getLanes()).basicRemove(otherEnd, msgs);
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
			case CrossingScenarioPackage.CROSSING_SCENARIO__XSIZE:
				return getXSize();
			case CrossingScenarioPackage.CROSSING_SCENARIO__YSIZE:
				return getYSize();
			case CrossingScenarioPackage.CROSSING_SCENARIO__ACTORS:
				return getActors();
			case CrossingScenarioPackage.CROSSING_SCENARIO__LANES:
				return getLanes();
			case CrossingScenarioPackage.CROSSING_SCENARIO__MAX_TIME:
				return getMaxTime();
			case CrossingScenarioPackage.CROSSING_SCENARIO__HORIZONTAL_HEAD:
				if (resolve) return getHorizontal_head();
				return basicGetHorizontal_head();
			case CrossingScenarioPackage.CROSSING_SCENARIO__VERTICAL_HEAD:
				if (resolve) return getVertical_head();
				return basicGetVertical_head();
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
			case CrossingScenarioPackage.CROSSING_SCENARIO__XSIZE:
				setXSize((Double)newValue);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__YSIZE:
				setYSize((Double)newValue);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__LANES:
				getLanes().clear();
				getLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__MAX_TIME:
				setMaxTime((Double)newValue);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__HORIZONTAL_HEAD:
				setHorizontal_head((Lane_Horizontal)newValue);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__VERTICAL_HEAD:
				setVertical_head((Lane_Vertical)newValue);
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
			case CrossingScenarioPackage.CROSSING_SCENARIO__XSIZE:
				setXSize(XSIZE_EDEFAULT);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__YSIZE:
				setYSize(YSIZE_EDEFAULT);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__ACTORS:
				getActors().clear();
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__LANES:
				getLanes().clear();
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__MAX_TIME:
				setMaxTime(MAX_TIME_EDEFAULT);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__HORIZONTAL_HEAD:
				setHorizontal_head((Lane_Horizontal)null);
				return;
			case CrossingScenarioPackage.CROSSING_SCENARIO__VERTICAL_HEAD:
				setVertical_head((Lane_Vertical)null);
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
			case CrossingScenarioPackage.CROSSING_SCENARIO__XSIZE:
				return xSize != XSIZE_EDEFAULT;
			case CrossingScenarioPackage.CROSSING_SCENARIO__YSIZE:
				return ySize != YSIZE_EDEFAULT;
			case CrossingScenarioPackage.CROSSING_SCENARIO__ACTORS:
				return actors != null && !actors.isEmpty();
			case CrossingScenarioPackage.CROSSING_SCENARIO__LANES:
				return lanes != null && !lanes.isEmpty();
			case CrossingScenarioPackage.CROSSING_SCENARIO__MAX_TIME:
				return maxTime != MAX_TIME_EDEFAULT;
			case CrossingScenarioPackage.CROSSING_SCENARIO__HORIZONTAL_HEAD:
				return horizontal_head != null;
			case CrossingScenarioPackage.CROSSING_SCENARIO__VERTICAL_HEAD:
				return vertical_head != null;
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
		result.append(" (xSize: ");
		result.append(xSize);
		result.append(", ySize: ");
		result.append(ySize);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(')');
		return result.toString();
	}

} //CrossingScenarioImpl
