/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.ExternAggregationOperatorDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.Symbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extern Aggregation Operator Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregationOperatorDeclarationImpl#getArgumentType <em>Argument Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregationOperatorDeclarationImpl#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternAggregationOperatorDeclarationImpl extends ExternDeclarationImpl
		implements ExternAggregationOperatorDeclaration {
	/**
	 * The cached value of the '{@link #getArgumentType() <em>Argument Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentType()
	 * @generated
	 * @ordered
	 */
	protected Symbol argumentType;

	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected Symbol resultType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternAggregationOperatorDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.EXTERN_AGGREGATION_OPERATOR_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getArgumentType() {
		if (argumentType != null && argumentType.eIsProxy()) {
			InternalEObject oldArgumentType = (InternalEObject) argumentType;
			argumentType = (Symbol) eResolveProxy(oldArgumentType);
			if (argumentType != oldArgumentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE,
							oldArgumentType, argumentType));
			}
		}
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetArgumentType() {
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentType(Symbol newArgumentType) {
		Symbol oldArgumentType = argumentType;
		argumentType = newArgumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE, oldArgumentType,
					argumentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getResultType() {
		if (resultType != null && resultType.eIsProxy()) {
			InternalEObject oldResultType = (InternalEObject) resultType;
			resultType = (Symbol) eResolveProxy(oldResultType);
			if (resultType != oldResultType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE, oldResultType,
							resultType));
			}
		}
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(Symbol newResultType) {
		Symbol oldResultType = resultType;
		resultType = newResultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE, oldResultType,
					resultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE:
			if (resolve)
				return getArgumentType();
			return basicGetArgumentType();
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE:
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
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE:
			setArgumentType((Symbol) newValue);
			return;
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE:
			setResultType((Symbol) newValue);
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
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE:
			setArgumentType((Symbol) null);
			return;
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE:
			setResultType((Symbol) null);
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
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__ARGUMENT_TYPE:
			return argumentType != null;
		case SolverLanguagePackage.EXTERN_AGGREGATION_OPERATOR_DECLARATION__RESULT_TYPE:
			return resultType != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternAggregationOperatorDeclarationImpl
