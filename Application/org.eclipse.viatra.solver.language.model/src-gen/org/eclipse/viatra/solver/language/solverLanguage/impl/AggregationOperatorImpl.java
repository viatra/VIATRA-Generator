/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.AggregationOperator;
import org.eclipse.viatra.solver.language.solverLanguage.Datatype;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationOperatorImpl#getArgumentType <em>Argument Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationOperatorImpl#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationOperatorImpl extends SymbolImpl implements AggregationOperator {
	/**
	 * The cached value of the '{@link #getArgumentType() <em>Argument Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentType()
	 * @generated
	 * @ordered
	 */
	protected Datatype argumentType;

	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected Datatype resultType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.AGGREGATION_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getArgumentType() {
		if (argumentType != null && argumentType.eIsProxy()) {
			InternalEObject oldArgumentType = (InternalEObject) argumentType;
			argumentType = (Datatype) eResolveProxy(oldArgumentType);
			if (argumentType != oldArgumentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SolverLanguagePackage.AGGREGATION_OPERATOR__ARGUMENT_TYPE, oldArgumentType, argumentType));
			}
		}
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetArgumentType() {
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentType(Datatype newArgumentType) {
		Datatype oldArgumentType = argumentType;
		argumentType = newArgumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.AGGREGATION_OPERATOR__ARGUMENT_TYPE, oldArgumentType, argumentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getResultType() {
		if (resultType != null && resultType.eIsProxy()) {
			InternalEObject oldResultType = (InternalEObject) resultType;
			resultType = (Datatype) eResolveProxy(oldResultType);
			if (resultType != oldResultType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SolverLanguagePackage.AGGREGATION_OPERATOR__RESULT_TYPE, oldResultType, resultType));
			}
		}
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(Datatype newResultType) {
		Datatype oldResultType = resultType;
		resultType = newResultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.AGGREGATION_OPERATOR__RESULT_TYPE, oldResultType, resultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SolverLanguagePackage.AGGREGATION_OPERATOR__ARGUMENT_TYPE:
			if (resolve)
				return getArgumentType();
			return basicGetArgumentType();
		case SolverLanguagePackage.AGGREGATION_OPERATOR__RESULT_TYPE:
			if (resolve)
				return getResultType();
			return basicGetResultType();
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
		case SolverLanguagePackage.AGGREGATION_OPERATOR__ARGUMENT_TYPE:
			setArgumentType((Datatype) newValue);
			return;
		case SolverLanguagePackage.AGGREGATION_OPERATOR__RESULT_TYPE:
			setResultType((Datatype) newValue);
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
		case SolverLanguagePackage.AGGREGATION_OPERATOR__ARGUMENT_TYPE:
			setArgumentType((Datatype) null);
			return;
		case SolverLanguagePackage.AGGREGATION_OPERATOR__RESULT_TYPE:
			setResultType((Datatype) null);
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
		case SolverLanguagePackage.AGGREGATION_OPERATOR__ARGUMENT_TYPE:
			return argumentType != null;
		case SolverLanguagePackage.AGGREGATION_OPERATOR__RESULT_TYPE:
			return resultType != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregationOperatorImpl
