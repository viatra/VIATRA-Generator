/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.ImplicitVariable;
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.NegativeLiteralImpl#getImplicitVariables <em>Implicit Variables</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.NegativeLiteralImpl#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegativeLiteralImpl extends MinimalEObjectImpl.Container implements NegativeLiteral {
	/**
	 * The cached value of the '{@link #getImplicitVariables() <em>Implicit Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplicitVariable> implicitVariables;
	/**
	 * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtom()
	 * @generated
	 * @ordered
	 */
	protected Atom atom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegativeLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.NEGATIVE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplicitVariable> getImplicitVariables() {
		if (implicitVariables == null) {
			implicitVariables = new EObjectContainmentEList<ImplicitVariable>(ImplicitVariable.class, this,
					ProblemPackage.NEGATIVE_LITERAL__IMPLICIT_VARIABLES);
		}
		return implicitVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom getAtom() {
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtom(Atom newAtom, NotificationChain msgs) {
		Atom oldAtom = atom;
		atom = newAtom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProblemPackage.NEGATIVE_LITERAL__ATOM, oldAtom, newAtom);
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
	public void setAtom(Atom newAtom) {
		if (newAtom != atom) {
			NotificationChain msgs = null;
			if (atom != null)
				msgs = ((InternalEObject) atom).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.NEGATIVE_LITERAL__ATOM, null, msgs);
			if (newAtom != null)
				msgs = ((InternalEObject) newAtom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.NEGATIVE_LITERAL__ATOM, null, msgs);
			msgs = basicSetAtom(newAtom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.NEGATIVE_LITERAL__ATOM, newAtom,
					newAtom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemPackage.NEGATIVE_LITERAL__IMPLICIT_VARIABLES:
			return ((InternalEList<?>) getImplicitVariables()).basicRemove(otherEnd, msgs);
		case ProblemPackage.NEGATIVE_LITERAL__ATOM:
			return basicSetAtom(null, msgs);
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
		case ProblemPackage.NEGATIVE_LITERAL__IMPLICIT_VARIABLES:
			return getImplicitVariables();
		case ProblemPackage.NEGATIVE_LITERAL__ATOM:
			return getAtom();
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
		case ProblemPackage.NEGATIVE_LITERAL__IMPLICIT_VARIABLES:
			getImplicitVariables().clear();
			getImplicitVariables().addAll((Collection<? extends ImplicitVariable>) newValue);
			return;
		case ProblemPackage.NEGATIVE_LITERAL__ATOM:
			setAtom((Atom) newValue);
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
		case ProblemPackage.NEGATIVE_LITERAL__IMPLICIT_VARIABLES:
			getImplicitVariables().clear();
			return;
		case ProblemPackage.NEGATIVE_LITERAL__ATOM:
			setAtom((Atom) null);
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
		case ProblemPackage.NEGATIVE_LITERAL__IMPLICIT_VARIABLES:
			return implicitVariables != null && !implicitVariables.isEmpty();
		case ProblemPackage.NEGATIVE_LITERAL__ATOM:
			return atom != null;
		}
		return super.eIsSet(featureID);
	}

} //NegativeLiteralImpl
