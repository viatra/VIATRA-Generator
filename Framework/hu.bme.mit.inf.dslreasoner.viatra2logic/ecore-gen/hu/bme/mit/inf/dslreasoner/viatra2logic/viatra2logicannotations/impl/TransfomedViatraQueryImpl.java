/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl;

import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	public String getPatternFullyQualifiedName() {
		return patternFullyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Object getPatternPQuery() {
		return patternPQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME:
				return getPatternFullyQualifiedName();
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY:
				return getPatternPQuery();
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
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_FULLY_QUALIFIED_NAME:
				setPatternFullyQualifiedName((String)newValue);
				return;
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY__PATTERN_PQUERY:
				setPatternPQuery(newValue);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (patternFullyQualifiedName: ");
		result.append(patternFullyQualifiedName);
		result.append(", patternPQuery: ");
		result.append(patternPQuery);
		result.append(')');
		return result.toString();
	}

} //TransfomedViatraQueryImpl
