/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.solver.language.solverLanguage.AggregateExpression;
import org.eclipse.viatra.solver.language.solverLanguage.Expression;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregateExpressionImpl#getForallVariables <em>Forall Variables</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregateExpressionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AggregateExpressionImpl extends ExpressionImpl implements AggregateExpression {
	/**
	 * The cached value of the '{@link #getForallVariables() <em>Forall Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForallVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> forallVariables;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.AGGREGATE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getForallVariables() {
		if (forallVariables == null) {
			forallVariables = new EObjectContainmentEList<Variable>(Variable.class, this,
					SolverLanguagePackage.AGGREGATE_EXPRESSION__FORALL_VARIABLES);
		}
		return forallVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__FORALL_VARIABLES:
			return ((InternalEList<?>) getForallVariables()).basicRemove(otherEnd, msgs);
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION:
			return basicSetCondition(null, msgs);
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
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__FORALL_VARIABLES:
			return getForallVariables();
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION:
			return getCondition();
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
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__FORALL_VARIABLES:
			getForallVariables().clear();
			getForallVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION:
			setCondition((Expression) newValue);
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
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__FORALL_VARIABLES:
			getForallVariables().clear();
			return;
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION:
			setCondition((Expression) null);
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
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__FORALL_VARIABLES:
			return forallVariables != null && !forallVariables.isEmpty();
		case SolverLanguagePackage.AGGREGATE_EXPRESSION__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregateExpressionImpl
