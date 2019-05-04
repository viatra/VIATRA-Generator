/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LogicResultImpl extends MinimalEObjectImpl.Container implements LogicResult {
	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected LogicProblem problem;

	/**
	 * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistics()
	 * @generated
	 * @ordered
	 */
	protected Statistics statistics;

	/**
	 * The default value of the '{@link #getTrace() <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected Object trace = TRACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicresultPackage.Literals.LOGIC_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicProblem getProblem() {
		if (problem != null && problem.eIsProxy()) {
			InternalEObject oldProblem = (InternalEObject)problem;
			problem = (LogicProblem)eResolveProxy(oldProblem);
			if (problem != oldProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicresultPackage.LOGIC_RESULT__PROBLEM, oldProblem, problem));
			}
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProblem basicGetProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProblem(LogicProblem newProblem) {
		LogicProblem oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.LOGIC_RESULT__PROBLEM, oldProblem, problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statistics getStatistics() {
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistics(Statistics newStatistics, NotificationChain msgs) {
		Statistics oldStatistics = statistics;
		statistics = newStatistics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicresultPackage.LOGIC_RESULT__STATISTICS, oldStatistics, newStatistics);
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
	public void setStatistics(Statistics newStatistics) {
		if (newStatistics != statistics) {
			NotificationChain msgs = null;
			if (statistics != null)
				msgs = ((InternalEObject)statistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicresultPackage.LOGIC_RESULT__STATISTICS, null, msgs);
			if (newStatistics != null)
				msgs = ((InternalEObject)newStatistics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicresultPackage.LOGIC_RESULT__STATISTICS, null, msgs);
			msgs = basicSetStatistics(newStatistics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.LOGIC_RESULT__STATISTICS, newStatistics, newStatistics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrace(Object newTrace) {
		Object oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.LOGIC_RESULT__TRACE, oldTrace, trace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getRepresentation() {
		if (representation == null) {
			representation = new EDataTypeUniqueEList<Object>(Object.class, this, LogicresultPackage.LOGIC_RESULT__REPRESENTATION);
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicresultPackage.LOGIC_RESULT__STATISTICS:
				return basicSetStatistics(null, msgs);
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
			case LogicresultPackage.LOGIC_RESULT__PROBLEM:
				if (resolve) return getProblem();
				return basicGetProblem();
			case LogicresultPackage.LOGIC_RESULT__STATISTICS:
				return getStatistics();
			case LogicresultPackage.LOGIC_RESULT__TRACE:
				return getTrace();
			case LogicresultPackage.LOGIC_RESULT__REPRESENTATION:
				return getRepresentation();
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
			case LogicresultPackage.LOGIC_RESULT__PROBLEM:
				setProblem((LogicProblem)newValue);
				return;
			case LogicresultPackage.LOGIC_RESULT__STATISTICS:
				setStatistics((Statistics)newValue);
				return;
			case LogicresultPackage.LOGIC_RESULT__TRACE:
				setTrace(newValue);
				return;
			case LogicresultPackage.LOGIC_RESULT__REPRESENTATION:
				getRepresentation().clear();
				getRepresentation().addAll((Collection<? extends Object>)newValue);
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
			case LogicresultPackage.LOGIC_RESULT__PROBLEM:
				setProblem((LogicProblem)null);
				return;
			case LogicresultPackage.LOGIC_RESULT__STATISTICS:
				setStatistics((Statistics)null);
				return;
			case LogicresultPackage.LOGIC_RESULT__TRACE:
				setTrace(TRACE_EDEFAULT);
				return;
			case LogicresultPackage.LOGIC_RESULT__REPRESENTATION:
				getRepresentation().clear();
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
			case LogicresultPackage.LOGIC_RESULT__PROBLEM:
				return problem != null;
			case LogicresultPackage.LOGIC_RESULT__STATISTICS:
				return statistics != null;
			case LogicresultPackage.LOGIC_RESULT__TRACE:
				return TRACE_EDEFAULT == null ? trace != null : !TRACE_EDEFAULT.equals(trace);
			case LogicresultPackage.LOGIC_RESULT__REPRESENTATION:
				return representation != null && !representation.isEmpty();
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
		result.append(" (trace: ");
		result.append(trace);
		result.append(", representation: ");
		result.append(representation);
		result.append(')');
		return result.toString();
	}

} //LogicResultImpl
