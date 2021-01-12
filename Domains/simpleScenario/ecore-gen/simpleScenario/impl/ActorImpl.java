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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleScenario.Actor;
import simpleScenario.Lane;
import simpleScenario.Relation;
import simpleScenario.SimpleScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.impl.ActorImpl#getXPos <em>XPos</em>}</li>
 *   <li>{@link simpleScenario.impl.ActorImpl#getYPos <em>YPos</em>}</li>
 *   <li>{@link simpleScenario.impl.ActorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link simpleScenario.impl.ActorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link simpleScenario.impl.ActorImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link simpleScenario.impl.ActorImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link simpleScenario.impl.ActorImpl#getPlacedOn <em>Placed On</em>}</li>
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
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

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
		return SimpleScenarioPackage.Literals.ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.ACTOR__XPOS, oldXPos, xPos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.ACTOR__YPOS, oldYPos, yPos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.ACTOR__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.ACTOR__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.ACTOR__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, SimpleScenarioPackage.ACTOR__RELATIONS);
		}
		return relations;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleScenarioPackage.ACTOR__PLACED_ON, oldPlacedOn, placedOn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.ACTOR__PLACED_ON, oldPlacedOn, newPlacedOn);
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
				msgs = ((InternalEObject)placedOn).eInverseRemove(this, SimpleScenarioPackage.LANE__ACTORS, Lane.class, msgs);
			if (newPlacedOn != null)
				msgs = ((InternalEObject)newPlacedOn).eInverseAdd(this, SimpleScenarioPackage.LANE__ACTORS, Lane.class, msgs);
			msgs = basicSetPlacedOn(newPlacedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleScenarioPackage.ACTOR__PLACED_ON, newPlacedOn, newPlacedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleScenarioPackage.ACTOR__PLACED_ON:
				if (placedOn != null)
					msgs = ((InternalEObject)placedOn).eInverseRemove(this, SimpleScenarioPackage.LANE__ACTORS, Lane.class, msgs);
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
			case SimpleScenarioPackage.ACTOR__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case SimpleScenarioPackage.ACTOR__PLACED_ON:
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
			case SimpleScenarioPackage.ACTOR__XPOS:
				return getXPos();
			case SimpleScenarioPackage.ACTOR__YPOS:
				return getYPos();
			case SimpleScenarioPackage.ACTOR__LENGTH:
				return getLength();
			case SimpleScenarioPackage.ACTOR__WIDTH:
				return getWidth();
			case SimpleScenarioPackage.ACTOR__SPEED:
				return getSpeed();
			case SimpleScenarioPackage.ACTOR__RELATIONS:
				return getRelations();
			case SimpleScenarioPackage.ACTOR__PLACED_ON:
				if (resolve) return getPlacedOn();
				return basicGetPlacedOn();
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
			case SimpleScenarioPackage.ACTOR__XPOS:
				setXPos((Double)newValue);
				return;
			case SimpleScenarioPackage.ACTOR__YPOS:
				setYPos((Double)newValue);
				return;
			case SimpleScenarioPackage.ACTOR__LENGTH:
				setLength((Double)newValue);
				return;
			case SimpleScenarioPackage.ACTOR__WIDTH:
				setWidth((Double)newValue);
				return;
			case SimpleScenarioPackage.ACTOR__SPEED:
				setSpeed((Double)newValue);
				return;
			case SimpleScenarioPackage.ACTOR__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case SimpleScenarioPackage.ACTOR__PLACED_ON:
				setPlacedOn((Lane)newValue);
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
			case SimpleScenarioPackage.ACTOR__XPOS:
				setXPos(XPOS_EDEFAULT);
				return;
			case SimpleScenarioPackage.ACTOR__YPOS:
				setYPos(YPOS_EDEFAULT);
				return;
			case SimpleScenarioPackage.ACTOR__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case SimpleScenarioPackage.ACTOR__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case SimpleScenarioPackage.ACTOR__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case SimpleScenarioPackage.ACTOR__RELATIONS:
				getRelations().clear();
				return;
			case SimpleScenarioPackage.ACTOR__PLACED_ON:
				setPlacedOn((Lane)null);
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
			case SimpleScenarioPackage.ACTOR__XPOS:
				return xPos != XPOS_EDEFAULT;
			case SimpleScenarioPackage.ACTOR__YPOS:
				return yPos != YPOS_EDEFAULT;
			case SimpleScenarioPackage.ACTOR__LENGTH:
				return length != LENGTH_EDEFAULT;
			case SimpleScenarioPackage.ACTOR__WIDTH:
				return width != WIDTH_EDEFAULT;
			case SimpleScenarioPackage.ACTOR__SPEED:
				return speed != SPEED_EDEFAULT;
			case SimpleScenarioPackage.ACTOR__RELATIONS:
				return relations != null && !relations.isEmpty();
			case SimpleScenarioPackage.ACTOR__PLACED_ON:
				return placedOn != null;
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
		result.append(", speed: ");
		result.append(speed);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
