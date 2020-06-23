/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.solver.language.solverLanguage.Expression;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExpressionImpl#getExistsVariables <em>Exists Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends StatementImpl implements Expression {
	/**
	 * The cached value of the '{@link #getExistsVariables() <em>Exists Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistsVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> existsVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getExistsVariables() {
		if (existsVariables == null) {
			existsVariables = new EObjectContainmentEList<Variable>(Variable.class, this,
					SolverLanguagePackage.EXPRESSION__EXISTS_VARIABLES);
		}
		return existsVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SolverLanguagePackage.EXPRESSION__EXISTS_VARIABLES:
			return ((InternalEList<?>) getExistsVariables()).basicRemove(otherEnd, msgs);
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
		case SolverLanguagePackage.EXPRESSION__EXISTS_VARIABLES:
			return getExistsVariables();
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
		case SolverLanguagePackage.EXPRESSION__EXISTS_VARIABLES:
			getExistsVariables().clear();
			getExistsVariables().addAll((Collection<? extends Variable>) newValue);
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
		case SolverLanguagePackage.EXPRESSION__EXISTS_VARIABLES:
			getExistsVariables().clear();
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
		case SolverLanguagePackage.EXPRESSION__EXISTS_VARIABLES:
			return existsVariables != null && !existsVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpressionImpl
