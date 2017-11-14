/**
 */
package logic2vampire.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel;

import java.util.Collection;

import logic2vampire.Logic2Vampire;
import logic2vampire.Logic2VampireTrace;
import logic2vampire.Logic2vampirePackage;

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
 * An implementation of the model object '<em><b>Logic2 Vampire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logic2vampire.impl.Logic2VampireImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link logic2vampire.impl.Logic2VampireImpl#getVampire <em>Vampire</em>}</li>
 *   <li>{@link logic2vampire.impl.Logic2VampireImpl#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Logic2VampireImpl extends MinimalEObjectImpl.Container implements Logic2Vampire {
	/**
	 * The cached value of the '{@link #getLogic() <em>Logic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogic()
	 * @generated
	 * @ordered
	 */
	protected LogicProblem logic;

	/**
	 * The cached value of the '{@link #getVampire() <em>Vampire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVampire()
	 * @generated
	 * @ordered
	 */
	protected VampireModel vampire;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Logic2VampireTrace> traces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Logic2VampireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Logic2vampirePackage.Literals.LOGIC2_VAMPIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProblem getLogic() {
		if (logic != null && logic.eIsProxy()) {
			InternalEObject oldLogic = (InternalEObject)logic;
			logic = (LogicProblem)eResolveProxy(oldLogic);
			if (logic != oldLogic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Logic2vampirePackage.LOGIC2_VAMPIRE__LOGIC, oldLogic, logic));
			}
		}
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProblem basicGetLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogic(LogicProblem newLogic) {
		LogicProblem oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Logic2vampirePackage.LOGIC2_VAMPIRE__LOGIC, oldLogic, logic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VampireModel getVampire() {
		if (vampire != null && vampire.eIsProxy()) {
			InternalEObject oldVampire = (InternalEObject)vampire;
			vampire = (VampireModel)eResolveProxy(oldVampire);
			if (vampire != oldVampire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Logic2vampirePackage.LOGIC2_VAMPIRE__VAMPIRE, oldVampire, vampire));
			}
		}
		return vampire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VampireModel basicGetVampire() {
		return vampire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVampire(VampireModel newVampire) {
		VampireModel oldVampire = vampire;
		vampire = newVampire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Logic2vampirePackage.LOGIC2_VAMPIRE__VAMPIRE, oldVampire, vampire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Logic2VampireTrace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<Logic2VampireTrace>(Logic2VampireTrace.class, this, Logic2vampirePackage.LOGIC2_VAMPIRE__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Logic2vampirePackage.LOGIC2_VAMPIRE__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE__LOGIC:
				if (resolve) return getLogic();
				return basicGetLogic();
			case Logic2vampirePackage.LOGIC2_VAMPIRE__VAMPIRE:
				if (resolve) return getVampire();
				return basicGetVampire();
			case Logic2vampirePackage.LOGIC2_VAMPIRE__TRACES:
				return getTraces();
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE__LOGIC:
				setLogic((LogicProblem)newValue);
				return;
			case Logic2vampirePackage.LOGIC2_VAMPIRE__VAMPIRE:
				setVampire((VampireModel)newValue);
				return;
			case Logic2vampirePackage.LOGIC2_VAMPIRE__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Logic2VampireTrace>)newValue);
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE__LOGIC:
				setLogic((LogicProblem)null);
				return;
			case Logic2vampirePackage.LOGIC2_VAMPIRE__VAMPIRE:
				setVampire((VampireModel)null);
				return;
			case Logic2vampirePackage.LOGIC2_VAMPIRE__TRACES:
				getTraces().clear();
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE__LOGIC:
				return logic != null;
			case Logic2vampirePackage.LOGIC2_VAMPIRE__VAMPIRE:
				return vampire != null;
			case Logic2vampirePackage.LOGIC2_VAMPIRE__TRACES:
				return traces != null && !traces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Logic2VampireImpl
