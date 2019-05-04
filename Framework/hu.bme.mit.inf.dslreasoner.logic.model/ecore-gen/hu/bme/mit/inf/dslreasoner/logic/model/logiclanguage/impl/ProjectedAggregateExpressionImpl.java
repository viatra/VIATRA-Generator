/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projected Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ProjectedAggregateExpressionImpl#getProjectionIndex <em>Projection Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProjectedAggregateExpressionImpl extends AggregateExpressionImpl implements ProjectedAggregateExpression {
	/**
	 * The default value of the '{@link #getProjectionIndex() <em>Projection Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int PROJECTION_INDEX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getProjectionIndex() <em>Projection Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionIndex()
	 * @generated
	 * @ordered
	 */
	protected int projectionIndex = PROJECTION_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectedAggregateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogiclanguagePackage.Literals.PROJECTED_AGGREGATE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProjectionIndex() {
		return projectionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectionIndex(int newProjectionIndex) {
		int oldProjectionIndex = projectionIndex;
		projectionIndex = newProjectionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX, oldProjectionIndex, projectionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogiclanguagePackage.PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX:
				return getProjectionIndex();
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
			case LogiclanguagePackage.PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX:
				setProjectionIndex((Integer)newValue);
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
			case LogiclanguagePackage.PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX:
				setProjectionIndex(PROJECTION_INDEX_EDEFAULT);
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
			case LogiclanguagePackage.PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX:
				return projectionIndex != PROJECTION_INDEX_EDEFAULT;
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
		result.append(" (projectionIndex: ");
		result.append(projectionIndex);
		result.append(')');
		return result.toString();
	}

} //ProjectedAggregateExpressionImpl
