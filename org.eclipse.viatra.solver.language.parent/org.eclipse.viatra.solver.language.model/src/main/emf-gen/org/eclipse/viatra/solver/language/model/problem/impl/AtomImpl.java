/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.Relation;
import org.eclipse.viatra.solver.language.model.problem.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.AtomImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.AtomImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.AtomImpl#isTransitiveClosure <em>Transitive Closure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomImpl extends LiteralImpl implements Atom {
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
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> arguments;

	/**
	 * The default value of the '{@link #isTransitiveClosure() <em>Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitiveClosure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSITIVE_CLOSURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransitiveClosure() <em>Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitiveClosure()
	 * @generated
	 * @ordered
	 */
	protected boolean transitiveClosure = TRANSITIVE_CLOSURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject) relation;
			relation = (Relation) eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProblemPackage.ATOM__RELATION,
							oldRelation, relation));
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
	public void setRelation(Relation newRelation) {
		Relation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.ATOM__RELATION, oldRelation,
					relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<Variable>(Variable.class, this, ProblemPackage.ATOM__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransitiveClosure() {
		return transitiveClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitiveClosure(boolean newTransitiveClosure) {
		boolean oldTransitiveClosure = transitiveClosure;
		transitiveClosure = newTransitiveClosure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.ATOM__TRANSITIVE_CLOSURE,
					oldTransitiveClosure, transitiveClosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProblemPackage.ATOM__RELATION:
			if (resolve)
				return getRelation();
			return basicGetRelation();
		case ProblemPackage.ATOM__ARGUMENTS:
			return getArguments();
		case ProblemPackage.ATOM__TRANSITIVE_CLOSURE:
			return isTransitiveClosure();
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
		case ProblemPackage.ATOM__RELATION:
			setRelation((Relation) newValue);
			return;
		case ProblemPackage.ATOM__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection<? extends Variable>) newValue);
			return;
		case ProblemPackage.ATOM__TRANSITIVE_CLOSURE:
			setTransitiveClosure((Boolean) newValue);
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
		case ProblemPackage.ATOM__RELATION:
			setRelation((Relation) null);
			return;
		case ProblemPackage.ATOM__ARGUMENTS:
			getArguments().clear();
			return;
		case ProblemPackage.ATOM__TRANSITIVE_CLOSURE:
			setTransitiveClosure(TRANSITIVE_CLOSURE_EDEFAULT);
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
		case ProblemPackage.ATOM__RELATION:
			return relation != null;
		case ProblemPackage.ATOM__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		case ProblemPackage.ATOM__TRANSITIVE_CLOSURE:
			return transitiveClosure != TRANSITIVE_CLOSURE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (transitiveClosure: ");
		result.append(transitiveClosure);
		result.append(')');
		return result.toString();
	}

} //AtomImpl
