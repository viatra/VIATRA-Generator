/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.model.problem.Constant;
import org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Assertion Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ConstantAssertionArgumentImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantAssertionArgumentImpl extends AssertionArgumentImpl implements ConstantAssertionArgument {
	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant constant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantAssertionArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.CONSTANT_ASSERTION_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(Constant newConstant, NotificationChain msgs) {
		Constant oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT, oldConstant, newConstant);
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
	public void setConstant(Constant newConstant) {
		if (newConstant != constant) {
			NotificationChain msgs = null;
			if (constant != null)
				msgs = ((InternalEObject) constant).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject) newConstant).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT,
					newConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT:
			return basicSetConstant(null, msgs);
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
		case ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT:
			return getConstant();
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
		case ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT:
			setConstant((Constant) newValue);
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
		case ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT:
			setConstant((Constant) null);
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
		case ProblemPackage.CONSTANT_ASSERTION_ARGUMENT__CONSTANT:
			return constant != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstantAssertionArgumentImpl
