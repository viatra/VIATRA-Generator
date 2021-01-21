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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.impl.ActorImpl#getXPos <em>XPos</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getYPos <em>YPos</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getXSpeed <em>XSpeed</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getPlacedOn <em>Placed On</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getYSpeed <em>YSpeed</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getDist_near <em>Dist near</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getDist_med <em>Dist med</em>}</li>
 *   <li>{@link crossingScenario.impl.ActorImpl#getDist_far <em>Dist far</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActorImpl extends MinimalEObjectImpl.Container implements Actor {
	/**
	 * The default value of the '{@link #getXPos() <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPos()
	 * @generated
	 * @ordered
	 */
	protected static final double XPOS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXPos() <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPos()
	 * @generated
	 * @ordered
	 */
	protected double xPos = XPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPos() <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPos()
	 * @generated
	 * @ordered
	 */
	protected static final double YPOS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYPos() <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPos()
	 * @generated
	 * @ordered
	 */
	protected double yPos = YPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getXSpeed() <em>XSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double XSPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXSpeed() <em>XSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSpeed()
	 * @generated
	 * @ordered
	 */
	protected double xSpeed = XSPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlacedOn() <em>Placed On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacedOn()
	 * @generated
	 * @ordered
	 */
	protected Lane placedOn;

	/**
	 * The default value of the '{@link #getYSpeed() <em>YSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double YSPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYSpeed() <em>YSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSpeed()
	 * @generated
	 * @ordered
	 */
	protected double ySpeed = YSPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrossingScenarioPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXPos() {
		return xPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXPos(double newXPos) {
		double oldXPos = xPos;
		xPos = newXPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__XPOS, oldXPos, xPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYPos() {
		return yPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYPos(double newYPos) {
		double oldYPos = yPos;
		yPos = newYPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__YPOS, oldYPos, yPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXSpeed() {
		return xSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXSpeed(double newXSpeed) {
		double oldXSpeed = xSpeed;
		xSpeed = newXSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__XSPEED, oldXSpeed, xSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane getPlacedOn() {
		if (placedOn != null && placedOn.eIsProxy()) {
			InternalEObject oldPlacedOn = (InternalEObject)placedOn;
			placedOn = (Lane)eResolveProxy(oldPlacedOn);
			if (placedOn != oldPlacedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CrossingScenarioPackage.ACTOR__PLACED_ON, oldPlacedOn, placedOn));
			}
		}
		return placedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane basicGetPlacedOn() {
		return placedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacedOn(Lane newPlacedOn, NotificationChain msgs) {
		Lane oldPlacedOn = placedOn;
		placedOn = newPlacedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__PLACED_ON, oldPlacedOn, newPlacedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacedOn(Lane newPlacedOn) {
		if (newPlacedOn != placedOn) {
			NotificationChain msgs = null;
			if (placedOn != null)
				msgs = ((InternalEObject)placedOn).eInverseRemove(this, CrossingScenarioPackage.LANE__ACTORS, Lane.class, msgs);
			if (newPlacedOn != null)
				msgs = ((InternalEObject)newPlacedOn).eInverseAdd(this, CrossingScenarioPackage.LANE__ACTORS, Lane.class, msgs);
			msgs = basicSetPlacedOn(newPlacedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__PLACED_ON, newPlacedOn, newPlacedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYSpeed() {
		return ySpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYSpeed(double newYSpeed) {
		double oldYSpeed = ySpeed;
		ySpeed = newYSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrossingScenarioPackage.ACTOR__YSPEED, oldYSpeed, ySpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getDist_near() {
		// TODO: implement this method to return the 'Dist near' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getDist_med() {
		// TODO: implement this method to return the 'Dist med' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getDist_far() {
		// TODO: implement this method to return the 'Dist far' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CrossingScenarioPackage.ACTOR__PLACED_ON:
				if (placedOn != null)
					msgs = ((InternalEObject)placedOn).eInverseRemove(this, CrossingScenarioPackage.LANE__ACTORS, Lane.class, msgs);
				return basicSetPlacedOn((Lane)otherEnd, msgs);
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
			case CrossingScenarioPackage.ACTOR__PLACED_ON:
				return basicSetPlacedOn(null, msgs);
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
			case CrossingScenarioPackage.ACTOR__XPOS:
				return getXPos();
			case CrossingScenarioPackage.ACTOR__YPOS:
				return getYPos();
			case CrossingScenarioPackage.ACTOR__LENGTH:
				return getLength();
			case CrossingScenarioPackage.ACTOR__WIDTH:
				return getWidth();
			case CrossingScenarioPackage.ACTOR__XSPEED:
				return getXSpeed();
			case CrossingScenarioPackage.ACTOR__PLACED_ON:
				if (resolve) return getPlacedOn();
				return basicGetPlacedOn();
			case CrossingScenarioPackage.ACTOR__YSPEED:
				return getYSpeed();
			case CrossingScenarioPackage.ACTOR__DIST_NEAR:
				return getDist_near();
			case CrossingScenarioPackage.ACTOR__DIST_MED:
				return getDist_med();
			case CrossingScenarioPackage.ACTOR__DIST_FAR:
				return getDist_far();
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
			case CrossingScenarioPackage.ACTOR__XPOS:
				setXPos((Double)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__YPOS:
				setYPos((Double)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__LENGTH:
				setLength((Double)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__WIDTH:
				setWidth((Double)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__XSPEED:
				setXSpeed((Double)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__PLACED_ON:
				setPlacedOn((Lane)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__YSPEED:
				setYSpeed((Double)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__DIST_NEAR:
				getDist_near().clear();
				getDist_near().addAll((Collection<? extends Actor>)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__DIST_MED:
				getDist_med().clear();
				getDist_med().addAll((Collection<? extends Actor>)newValue);
				return;
			case CrossingScenarioPackage.ACTOR__DIST_FAR:
				getDist_far().clear();
				getDist_far().addAll((Collection<? extends Actor>)newValue);
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
			case CrossingScenarioPackage.ACTOR__XPOS:
				setXPos(XPOS_EDEFAULT);
				return;
			case CrossingScenarioPackage.ACTOR__YPOS:
				setYPos(YPOS_EDEFAULT);
				return;
			case CrossingScenarioPackage.ACTOR__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case CrossingScenarioPackage.ACTOR__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CrossingScenarioPackage.ACTOR__XSPEED:
				setXSpeed(XSPEED_EDEFAULT);
				return;
			case CrossingScenarioPackage.ACTOR__PLACED_ON:
				setPlacedOn((Lane)null);
				return;
			case CrossingScenarioPackage.ACTOR__YSPEED:
				setYSpeed(YSPEED_EDEFAULT);
				return;
			case CrossingScenarioPackage.ACTOR__DIST_NEAR:
				getDist_near().clear();
				return;
			case CrossingScenarioPackage.ACTOR__DIST_MED:
				getDist_med().clear();
				return;
			case CrossingScenarioPackage.ACTOR__DIST_FAR:
				getDist_far().clear();
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
			case CrossingScenarioPackage.ACTOR__XPOS:
				return xPos != XPOS_EDEFAULT;
			case CrossingScenarioPackage.ACTOR__YPOS:
				return yPos != YPOS_EDEFAULT;
			case CrossingScenarioPackage.ACTOR__LENGTH:
				return length != LENGTH_EDEFAULT;
			case CrossingScenarioPackage.ACTOR__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CrossingScenarioPackage.ACTOR__XSPEED:
				return xSpeed != XSPEED_EDEFAULT;
			case CrossingScenarioPackage.ACTOR__PLACED_ON:
				return placedOn != null;
			case CrossingScenarioPackage.ACTOR__YSPEED:
				return ySpeed != YSPEED_EDEFAULT;
			case CrossingScenarioPackage.ACTOR__DIST_NEAR:
				return !getDist_near().isEmpty();
			case CrossingScenarioPackage.ACTOR__DIST_MED:
				return !getDist_med().isEmpty();
			case CrossingScenarioPackage.ACTOR__DIST_FAR:
				return !getDist_far().isEmpty();
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
		result.append(" (xPos: ");
		result.append(xPos);
		result.append(", yPos: ");
		result.append(yPos);
		result.append(", length: ");
		result.append(length);
		result.append(", width: ");
		result.append(width);
		result.append(", xSpeed: ");
		result.append(xSpeed);
		result.append(", ySpeed: ");
		result.append(ySpeed);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
