/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.viatra.solver.language.model.problem.Argument;
import org.eclipse.viatra.solver.language.model.problem.ImplicitVariable;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ArgumentImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ArgumentImpl#getSingletonVariable <em>Singleton Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getSingletonVariable() <em>Singleton Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonVariable()
	 * @generated
	 * @ordered
	 */
	protected ImplicitVariable singletonVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (Variable) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProblemPackage.ARGUMENT__VARIABLE,
							oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.ARGUMENT__VARIABLE, oldVariable,
					variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitVariable getSingletonVariable() {
		return singletonVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingletonVariable(ImplicitVariable newSingletonVariable, NotificationChain msgs) {
		ImplicitVariable oldSingletonVariable = singletonVariable;
		singletonVariable = newSingletonVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProblemPackage.ARGUMENT__SINGLETON_VARIABLE, oldSingletonVariable, newSingletonVariable);
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
	public void setSingletonVariable(ImplicitVariable newSingletonVariable) {
		if (newSingletonVariable != singletonVariable) {
			NotificationChain msgs = null;
			if (singletonVariable != null)
				msgs = ((InternalEObject) singletonVariable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.ARGUMENT__SINGLETON_VARIABLE, null, msgs);
			if (newSingletonVariable != null)
				msgs = ((InternalEObject) newSingletonVariable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.ARGUMENT__SINGLETON_VARIABLE, null, msgs);
			msgs = basicSetSingletonVariable(newSingletonVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.ARGUMENT__SINGLETON_VARIABLE,
					newSingletonVariable, newSingletonVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemPackage.ARGUMENT__SINGLETON_VARIABLE:
			return basicSetSingletonVariable(null, msgs);
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
		case ProblemPackage.ARGUMENT__VARIABLE:
			if (resolve)
				return getVariable();
			return basicGetVariable();
		case ProblemPackage.ARGUMENT__SINGLETON_VARIABLE:
			return getSingletonVariable();
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
		case ProblemPackage.ARGUMENT__VARIABLE:
			setVariable((Variable) newValue);
			return;
		case ProblemPackage.ARGUMENT__SINGLETON_VARIABLE:
			setSingletonVariable((ImplicitVariable) newValue);
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
		case ProblemPackage.ARGUMENT__VARIABLE:
			setVariable((Variable) null);
			return;
		case ProblemPackage.ARGUMENT__SINGLETON_VARIABLE:
			setSingletonVariable((ImplicitVariable) null);
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
		case ProblemPackage.ARGUMENT__VARIABLE:
			return variable != null;
		case ProblemPackage.ARGUMENT__SINGLETON_VARIABLE:
			return singletonVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //ArgumentImpl
