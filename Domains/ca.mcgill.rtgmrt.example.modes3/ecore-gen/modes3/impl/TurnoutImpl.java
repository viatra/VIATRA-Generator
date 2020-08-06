/**
 */
package modes3.impl;

import modes3.Modes3Package;
import modes3.Segment;
import modes3.Turnout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modes3.impl.TurnoutImpl#getStraight <em>Straight</em>}</li>
 *   <li>{@link modes3.impl.TurnoutImpl#getDivergent <em>Divergent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnoutImpl extends SegmentImpl implements Turnout {
	/**
	 * The cached value of the '{@link #getStraight() <em>Straight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStraight()
	 * @generated
	 * @ordered
	 */
	protected Segment straight;

	/**
	 * The cached value of the '{@link #getDivergent() <em>Divergent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivergent()
	 * @generated
	 * @ordered
	 */
	protected Segment divergent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modes3Package.Literals.TURNOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment getStraight() {
		if (straight != null && straight.eIsProxy()) {
			InternalEObject oldStraight = (InternalEObject)straight;
			straight = (Segment)eResolveProxy(oldStraight);
			if (straight != oldStraight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Modes3Package.TURNOUT__STRAIGHT, oldStraight, straight));
			}
		}
		return straight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment basicGetStraight() {
		return straight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStraight(Segment newStraight) {
		Segment oldStraight = straight;
		straight = newStraight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modes3Package.TURNOUT__STRAIGHT, oldStraight, straight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment getDivergent() {
		if (divergent != null && divergent.eIsProxy()) {
			InternalEObject oldDivergent = (InternalEObject)divergent;
			divergent = (Segment)eResolveProxy(oldDivergent);
			if (divergent != oldDivergent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Modes3Package.TURNOUT__DIVERGENT, oldDivergent, divergent));
			}
		}
		return divergent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment basicGetDivergent() {
		return divergent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivergent(Segment newDivergent) {
		Segment oldDivergent = divergent;
		divergent = newDivergent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modes3Package.TURNOUT__DIVERGENT, oldDivergent, divergent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Modes3Package.TURNOUT__STRAIGHT:
				if (resolve) return getStraight();
				return basicGetStraight();
			case Modes3Package.TURNOUT__DIVERGENT:
				if (resolve) return getDivergent();
				return basicGetDivergent();
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
			case Modes3Package.TURNOUT__STRAIGHT:
				setStraight((Segment)newValue);
				return;
			case Modes3Package.TURNOUT__DIVERGENT:
				setDivergent((Segment)newValue);
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
			case Modes3Package.TURNOUT__STRAIGHT:
				setStraight((Segment)null);
				return;
			case Modes3Package.TURNOUT__DIVERGENT:
				setDivergent((Segment)null);
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
			case Modes3Package.TURNOUT__STRAIGHT:
				return straight != null;
			case Modes3Package.TURNOUT__DIVERGENT:
				return divergent != null;
		}
		return super.eIsSet(featureID);
	}

} //TurnoutImpl
