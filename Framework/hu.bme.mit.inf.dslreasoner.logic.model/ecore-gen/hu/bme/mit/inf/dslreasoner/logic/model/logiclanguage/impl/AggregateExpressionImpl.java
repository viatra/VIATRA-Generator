/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregatedParameterSubstitution;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
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
 * An implementation of the model object '<em><b>Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AggregateExpressionImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AggregateExpressionImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AggregateExpressionImpl#getResultVariable <em>Result Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AggregateExpressionImpl extends TermImpl implements AggregateExpression {
	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation relation;

	/**
	 * The cached value of the '{@link #getParameterSubstitution() <em>Parameter Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedParameterSubstitution> parameterSubstitution;

	/**
	 * The cached value of the '{@link #getResultVariable() <em>Result Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable resultVariable;

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
		return LogiclanguagePackage.Literals.AGGREGATE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (Relation)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogiclanguagePackage.AGGREGATE_EXPRESSION__RELATION, oldRelation, relation));
			}
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelation(Relation newRelation) {
		Relation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.AGGREGATE_EXPRESSION__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AggregatedParameterSubstitution> getParameterSubstitution() {
		if (parameterSubstitution == null) {
			parameterSubstitution = new EObjectContainmentEList<AggregatedParameterSubstitution>(AggregatedParameterSubstitution.class, this, LogiclanguagePackage.AGGREGATE_EXPRESSION__PARAMETER_SUBSTITUTION);
		}
		return parameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getResultVariable() {
		if (resultVariable != null && resultVariable.eIsProxy()) {
			InternalEObject oldResultVariable = (InternalEObject)resultVariable;
			resultVariable = (Variable)eResolveProxy(oldResultVariable);
			if (resultVariable != oldResultVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogiclanguagePackage.AGGREGATE_EXPRESSION__RESULT_VARIABLE, oldResultVariable, resultVariable));
			}
		}
		return resultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetResultVariable() {
		return resultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultVariable(Variable newResultVariable) {
		Variable oldResultVariable = resultVariable;
		resultVariable = newResultVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.AGGREGATE_EXPRESSION__RESULT_VARIABLE, oldResultVariable, resultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__PARAMETER_SUBSTITUTION:
				return ((InternalEList<?>)getParameterSubstitution()).basicRemove(otherEnd, msgs);
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
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__PARAMETER_SUBSTITUTION:
				return getParameterSubstitution();
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RESULT_VARIABLE:
				if (resolve) return getResultVariable();
				return basicGetResultVariable();
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
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RELATION:
				setRelation((Relation)newValue);
				return;
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__PARAMETER_SUBSTITUTION:
				getParameterSubstitution().clear();
				getParameterSubstitution().addAll((Collection<? extends AggregatedParameterSubstitution>)newValue);
				return;
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RESULT_VARIABLE:
				setResultVariable((Variable)newValue);
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
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RELATION:
				setRelation((Relation)null);
				return;
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__PARAMETER_SUBSTITUTION:
				getParameterSubstitution().clear();
				return;
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RESULT_VARIABLE:
				setResultVariable((Variable)null);
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
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RELATION:
				return relation != null;
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__PARAMETER_SUBSTITUTION:
				return parameterSubstitution != null && !parameterSubstitution.isEmpty();
			case LogiclanguagePackage.AGGREGATE_EXPRESSION__RESULT_VARIABLE:
				return resultVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregateExpressionImpl
