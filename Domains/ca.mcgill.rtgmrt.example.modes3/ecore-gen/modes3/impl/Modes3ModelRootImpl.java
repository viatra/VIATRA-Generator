/**
 */
package modes3.impl;

import java.util.Collection;

import modes3.Modes3ModelRoot;
import modes3.Modes3Package;
import modes3.SimpleSegment;
import modes3.Train;
import modes3.Turnout;

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
 * An implementation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modes3.impl.Modes3ModelRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link modes3.impl.Modes3ModelRootImpl#getTrains <em>Trains</em>}</li>
 *   <li>{@link modes3.impl.Modes3ModelRootImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link modes3.impl.Modes3ModelRootImpl#getTurnouts <em>Turnouts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Modes3ModelRootImpl extends MinimalEObjectImpl.Container implements Modes3ModelRoot {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrains() <em>Trains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrains()
	 * @generated
	 * @ordered
	 */
	protected EList<Train> trains;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleSegment> segments;

	/**
	 * The cached value of the '{@link #getTurnouts() <em>Turnouts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnouts()
	 * @generated
	 * @ordered
	 */
	protected EList<Turnout> turnouts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Modes3ModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modes3Package.Literals.MODES3_MODEL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modes3Package.MODES3_MODEL_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Train> getTrains() {
		if (trains == null) {
			trains = new EObjectContainmentEList<Train>(Train.class, this, Modes3Package.MODES3_MODEL_ROOT__TRAINS);
		}
		return trains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleSegment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<SimpleSegment>(SimpleSegment.class, this, Modes3Package.MODES3_MODEL_ROOT__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Turnout> getTurnouts() {
		if (turnouts == null) {
			turnouts = new EObjectContainmentEList<Turnout>(Turnout.class, this, Modes3Package.MODES3_MODEL_ROOT__TURNOUTS);
		}
		return turnouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Modes3Package.MODES3_MODEL_ROOT__TRAINS:
				return ((InternalEList<?>)getTrains()).basicRemove(otherEnd, msgs);
			case Modes3Package.MODES3_MODEL_ROOT__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case Modes3Package.MODES3_MODEL_ROOT__TURNOUTS:
				return ((InternalEList<?>)getTurnouts()).basicRemove(otherEnd, msgs);
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
			case Modes3Package.MODES3_MODEL_ROOT__ID:
				return getId();
			case Modes3Package.MODES3_MODEL_ROOT__TRAINS:
				return getTrains();
			case Modes3Package.MODES3_MODEL_ROOT__SEGMENTS:
				return getSegments();
			case Modes3Package.MODES3_MODEL_ROOT__TURNOUTS:
				return getTurnouts();
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
			case Modes3Package.MODES3_MODEL_ROOT__ID:
				setId((Integer)newValue);
				return;
			case Modes3Package.MODES3_MODEL_ROOT__TRAINS:
				getTrains().clear();
				getTrains().addAll((Collection<? extends Train>)newValue);
				return;
			case Modes3Package.MODES3_MODEL_ROOT__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends SimpleSegment>)newValue);
				return;
			case Modes3Package.MODES3_MODEL_ROOT__TURNOUTS:
				getTurnouts().clear();
				getTurnouts().addAll((Collection<? extends Turnout>)newValue);
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
			case Modes3Package.MODES3_MODEL_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case Modes3Package.MODES3_MODEL_ROOT__TRAINS:
				getTrains().clear();
				return;
			case Modes3Package.MODES3_MODEL_ROOT__SEGMENTS:
				getSegments().clear();
				return;
			case Modes3Package.MODES3_MODEL_ROOT__TURNOUTS:
				getTurnouts().clear();
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
			case Modes3Package.MODES3_MODEL_ROOT__ID:
				return id != ID_EDEFAULT;
			case Modes3Package.MODES3_MODEL_ROOT__TRAINS:
				return trains != null && !trains.isEmpty();
			case Modes3Package.MODES3_MODEL_ROOT__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case Modes3Package.MODES3_MODEL_ROOT__TURNOUTS:
				return turnouts != null && !turnouts.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //Modes3ModelRootImpl
