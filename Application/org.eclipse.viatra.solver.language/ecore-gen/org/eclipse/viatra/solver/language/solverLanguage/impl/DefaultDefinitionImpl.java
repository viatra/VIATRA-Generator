/**
 * generated by Xtext 2.21.0
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.Call;
import org.eclipse.viatra.solver.language.solverLanguage.DefaultDefinition;
import org.eclipse.viatra.solver.language.solverLanguage.Expression;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DefaultDefinitionImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.DefaultDefinitionImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultDefinitionImpl extends StatementImpl implements DefaultDefinition {
	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected Call head;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Expression range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.DEFAULT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Call getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Call newHead, NotificationChain msgs) {
		Call oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.DEFAULT_DEFINITION__HEAD, oldHead, newHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHead(Call newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.DEFAULT_DEFINITION__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.DEFAULT_DEFINITION__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.DEFAULT_DEFINITION__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Expression newRange, NotificationChain msgs) {
		Expression oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.DEFAULT_DEFINITION__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(Expression newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.DEFAULT_DEFINITION__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.DEFAULT_DEFINITION__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.DEFAULT_DEFINITION__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverLanguagePackage.DEFAULT_DEFINITION__HEAD:
				return basicSetHead(null, msgs);
			case SolverLanguagePackage.DEFAULT_DEFINITION__RANGE:
				return basicSetRange(null, msgs);
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
			case SolverLanguagePackage.DEFAULT_DEFINITION__HEAD:
				return getHead();
			case SolverLanguagePackage.DEFAULT_DEFINITION__RANGE:
				return getRange();
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
			case SolverLanguagePackage.DEFAULT_DEFINITION__HEAD:
				setHead((Call)newValue);
				return;
			case SolverLanguagePackage.DEFAULT_DEFINITION__RANGE:
				setRange((Expression)newValue);
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
			case SolverLanguagePackage.DEFAULT_DEFINITION__HEAD:
				setHead((Call)null);
				return;
			case SolverLanguagePackage.DEFAULT_DEFINITION__RANGE:
				setRange((Expression)null);
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
			case SolverLanguagePackage.DEFAULT_DEFINITION__HEAD:
				return head != null;
			case SolverLanguagePackage.DEFAULT_DEFINITION__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //DefaultDefinitionImpl
