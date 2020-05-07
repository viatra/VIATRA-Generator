/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl;

import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfomed Viatra Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl#getPatternFullyQualifiedName <em>Pattern Fully Qualified Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl#getPatternPQuery <em>Pattern PQuery</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl#getVariableTrace <em>Variable Trace</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.TransfomedViatraQueryImpl#getOptimizedDisjunction <em>Optimized Disjunction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransfomedViatraQueryImpl extends RelationAnnotationImpl implements TransfomedViatraQuery {
	/**
	 * The default value of the '{@link #getPatternFullyQualifiedName() <em>Pattern Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_FULLY_QUALIFIED_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPatternFullyQualifiedName() <em>Pattern Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String patternFullyQualifiedName = PATTERN_FULLY_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternPQuery() <em>Pattern PQuery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPQuery()
	 * @generated
	 * @ordered
	 */
	protected static final Object PATTERN_PQUERY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPatternPQuery() <em>Pattern PQuery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternPQuery()
	 * @generated
	 * @ordered
	 */
	protected Object patternPQuery = PATTERN_PQUERY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getVariableTrace() <em>Variable Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableMapping> variableTrace;
	/**
	 * The default value of the '{@link #getOptimizedDisjunction() <em>Optimized Disjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizedDisjunction()
	 * @generated
	 * @ordered
	 */
	protected static final Object OPTIMIZED_DISJUNCTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOptimizedDisjunction() <em>Optimized Disjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizedDisjunction()
	 * @generated
	 * @ordered
	 */
	protected Object optimizedDisjunction = OPTIMIZED_DISJUNCTION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransfomedViatraQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Viatra2LogicAnnotationsPackage.Literals.TRANSFOMED_VIATRA_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatternFullyQualifiedName() {
		return patternFullyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternFullyQualifiedName(String newPatternFullyQualifiedName) {
		String oldPatternFullyQualifiedName = patternFullyQualifiedName;
		patternFullyQualifiedName = newPatternFullyQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME, oldPatternFullyQualifiedName, patternFullyQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPatternPQuery() {
		return patternPQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternPQuery(Object newPatternPQuery) {
		Object oldPatternPQuery = patternPQuery;
		patternPQuery = newPatternPQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY, oldPatternPQuery, patternPQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableMapping> getVariableTrace() {
		if (variableTrace == null) {
			variableTrace = new EObjectContainmentEList<VariableMapping>(VariableMapping.class, this, Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__VARIABLE_TRACE);
		}
		return variableTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getOptimizedDisjunction() {
		return optimizedDisjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptimizedDisjunction(Object newOptimizedDisjunction) {
		Object oldOptimizedDisjunction = optimizedDisjunction;
		optimizedDisjunction = newOptimizedDisjunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__OPTIMIZED_DISJUNCTION, oldOptimizedDisjunction, optimizedDisjunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__VARIABLE_TRACE:
				return ((InternalEList<?>)getVariableTrace()).basicRemove(otherEnd, msgs);
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
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME:
				return getPatternFullyQualifiedName();
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY:
				return getPatternPQuery();
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__VARIABLE_TRACE:
				return getVariableTrace();
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__OPTIMIZED_DISJUNCTION:
				return getOptimizedDisjunction();
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
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME:
				setPatternFullyQualifiedName((String)newValue);
				return;
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY:
				setPatternPQuery(newValue);
				return;
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__VARIABLE_TRACE:
				getVariableTrace().clear();
				getVariableTrace().addAll((Collection<? extends VariableMapping>)newValue);
				return;
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__OPTIMIZED_DISJUNCTION:
				setOptimizedDisjunction(newValue);
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
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME:
				setPatternFullyQualifiedName(PATTERN_FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY:
				setPatternPQuery(PATTERN_PQUERY_EDEFAULT);
				return;
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__VARIABLE_TRACE:
				getVariableTrace().clear();
				return;
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__OPTIMIZED_DISJUNCTION:
				setOptimizedDisjunction(OPTIMIZED_DISJUNCTION_EDEFAULT);
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
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME:
				return PATTERN_FULLY_QUALIFIED_NAME_EDEFAULT == null ? patternFullyQualifiedName != null : !PATTERN_FULLY_QUALIFIED_NAME_EDEFAULT.equals(patternFullyQualifiedName);
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY:
				return PATTERN_PQUERY_EDEFAULT == null ? patternPQuery != null : !PATTERN_PQUERY_EDEFAULT.equals(patternPQuery);
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__VARIABLE_TRACE:
				return variableTrace != null && !variableTrace.isEmpty();
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__OPTIMIZED_DISJUNCTION:
				return OPTIMIZED_DISJUNCTION_EDEFAULT == null ? optimizedDisjunction != null : !OPTIMIZED_DISJUNCTION_EDEFAULT.equals(optimizedDisjunction);
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
		result.append(" (patternFullyQualifiedName: ");
		result.append(patternFullyQualifiedName);
		result.append(", patternPQuery: ");
		result.append(patternPQuery);
		result.append(", optimizedDisjunction: ");
		result.append(optimizedDisjunction);
		result.append(')');
		return result.toString();
	}

} //TransfomedViatraQueryImpl
