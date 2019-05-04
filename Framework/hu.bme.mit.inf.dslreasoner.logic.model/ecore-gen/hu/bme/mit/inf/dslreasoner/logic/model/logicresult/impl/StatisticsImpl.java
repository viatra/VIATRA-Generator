/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;

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
 * An implementation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl#getTransformationTime <em>Transformation Time</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl#getSolverTime <em>Solver Time</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl#getSolverMemory <em>Solver Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticsImpl extends MinimalEObjectImpl.Container implements Statistics {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<StatisticEntry> entries;

	/**
	 * The default value of the '{@link #getTransformationTime() <em>Transformation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSFORMATION_TIME_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getTransformationTime() <em>Transformation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationTime()
	 * @generated
	 * @ordered
	 */
	protected int transformationTime = TRANSFORMATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverTime() <em>Solver Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLVER_TIME_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSolverTime() <em>Solver Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverTime()
	 * @generated
	 * @ordered
	 */
	protected int solverTime = SOLVER_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverMemory() <em>Solver Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLVER_MEMORY_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSolverMemory() <em>Solver Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverMemory()
	 * @generated
	 * @ordered
	 */
	protected int solverMemory = SOLVER_MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicresultPackage.Literals.STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatisticEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<StatisticEntry>(StatisticEntry.class, this, LogicresultPackage.STATISTICS__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTransformationTime() {
		return transformationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformationTime(int newTransformationTime) {
		int oldTransformationTime = transformationTime;
		transformationTime = newTransformationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.STATISTICS__TRANSFORMATION_TIME, oldTransformationTime, transformationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSolverTime() {
		return solverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolverTime(int newSolverTime) {
		int oldSolverTime = solverTime;
		solverTime = newSolverTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.STATISTICS__SOLVER_TIME, oldSolverTime, solverTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSolverMemory() {
		return solverMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolverMemory(int newSolverMemory) {
		int oldSolverMemory = solverMemory;
		solverMemory = newSolverMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.STATISTICS__SOLVER_MEMORY, oldSolverMemory, solverMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicresultPackage.STATISTICS__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case LogicresultPackage.STATISTICS__ENTRIES:
				return getEntries();
			case LogicresultPackage.STATISTICS__TRANSFORMATION_TIME:
				return getTransformationTime();
			case LogicresultPackage.STATISTICS__SOLVER_TIME:
				return getSolverTime();
			case LogicresultPackage.STATISTICS__SOLVER_MEMORY:
				return getSolverMemory();
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
			case LogicresultPackage.STATISTICS__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends StatisticEntry>)newValue);
				return;
			case LogicresultPackage.STATISTICS__TRANSFORMATION_TIME:
				setTransformationTime((Integer)newValue);
				return;
			case LogicresultPackage.STATISTICS__SOLVER_TIME:
				setSolverTime((Integer)newValue);
				return;
			case LogicresultPackage.STATISTICS__SOLVER_MEMORY:
				setSolverMemory((Integer)newValue);
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
			case LogicresultPackage.STATISTICS__ENTRIES:
				getEntries().clear();
				return;
			case LogicresultPackage.STATISTICS__TRANSFORMATION_TIME:
				setTransformationTime(TRANSFORMATION_TIME_EDEFAULT);
				return;
			case LogicresultPackage.STATISTICS__SOLVER_TIME:
				setSolverTime(SOLVER_TIME_EDEFAULT);
				return;
			case LogicresultPackage.STATISTICS__SOLVER_MEMORY:
				setSolverMemory(SOLVER_MEMORY_EDEFAULT);
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
			case LogicresultPackage.STATISTICS__ENTRIES:
				return entries != null && !entries.isEmpty();
			case LogicresultPackage.STATISTICS__TRANSFORMATION_TIME:
				return transformationTime != TRANSFORMATION_TIME_EDEFAULT;
			case LogicresultPackage.STATISTICS__SOLVER_TIME:
				return solverTime != SOLVER_TIME_EDEFAULT;
			case LogicresultPackage.STATISTICS__SOLVER_MEMORY:
				return solverMemory != SOLVER_MEMORY_EDEFAULT;
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
		result.append(" (transformationTime: ");
		result.append(transformationTime);
		result.append(", solverTime: ");
		result.append(solverTime);
		result.append(", solverMemory: ");
		result.append(solverMemory);
		result.append(')');
		return result.toString();
	}

} //StatisticsImpl
