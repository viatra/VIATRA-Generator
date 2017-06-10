/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IfThenElseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IfThenElseImpl#getIfTrue <em>If True</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IfThenElseImpl#getIfFalse <em>If False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfThenElseImpl extends TermImpl implements IfThenElse {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Term condition;

	/**
	 * The cached value of the '{@link #getIfTrue() <em>If True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfTrue()
	 * @generated
	 * @ordered
	 */
	protected Term ifTrue;

	/**
	 * The cached value of the '{@link #getIfFalse() <em>If False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFalse()
	 * @generated
	 * @ordered
	 */
	protected Term ifFalse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogiclanguagePackage.Literals.IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Term newCondition, NotificationChain msgs) {
		Term oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.IF_THEN_ELSE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Term newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiclanguagePackage.IF_THEN_ELSE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiclanguagePackage.IF_THEN_ELSE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.IF_THEN_ELSE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getIfTrue() {
		return ifTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfTrue(Term newIfTrue, NotificationChain msgs) {
		Term oldIfTrue = ifTrue;
		ifTrue = newIfTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE, oldIfTrue, newIfTrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfTrue(Term newIfTrue) {
		if (newIfTrue != ifTrue) {
			NotificationChain msgs = null;
			if (ifTrue != null)
				msgs = ((InternalEObject)ifTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE, null, msgs);
			if (newIfTrue != null)
				msgs = ((InternalEObject)newIfTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE, null, msgs);
			msgs = basicSetIfTrue(newIfTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE, newIfTrue, newIfTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getIfFalse() {
		return ifFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfFalse(Term newIfFalse, NotificationChain msgs) {
		Term oldIfFalse = ifFalse;
		ifFalse = newIfFalse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE, oldIfFalse, newIfFalse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfFalse(Term newIfFalse) {
		if (newIfFalse != ifFalse) {
			NotificationChain msgs = null;
			if (ifFalse != null)
				msgs = ((InternalEObject)ifFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE, null, msgs);
			if (newIfFalse != null)
				msgs = ((InternalEObject)newIfFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE, null, msgs);
			msgs = basicSetIfFalse(newIfFalse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE, newIfFalse, newIfFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogiclanguagePackage.IF_THEN_ELSE__CONDITION:
				return basicSetCondition(null, msgs);
			case LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE:
				return basicSetIfTrue(null, msgs);
			case LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE:
				return basicSetIfFalse(null, msgs);
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
			case LogiclanguagePackage.IF_THEN_ELSE__CONDITION:
				return getCondition();
			case LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE:
				return getIfTrue();
			case LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE:
				return getIfFalse();
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
			case LogiclanguagePackage.IF_THEN_ELSE__CONDITION:
				setCondition((Term)newValue);
				return;
			case LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE:
				setIfTrue((Term)newValue);
				return;
			case LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE:
				setIfFalse((Term)newValue);
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
			case LogiclanguagePackage.IF_THEN_ELSE__CONDITION:
				setCondition((Term)null);
				return;
			case LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE:
				setIfTrue((Term)null);
				return;
			case LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE:
				setIfFalse((Term)null);
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
			case LogiclanguagePackage.IF_THEN_ELSE__CONDITION:
				return condition != null;
			case LogiclanguagePackage.IF_THEN_ELSE__IF_TRUE:
				return ifTrue != null;
			case LogiclanguagePackage.IF_THEN_ELSE__IF_FALSE:
				return ifFalse != null;
		}
		return super.eIsSet(featureID);
	}

} //IfThenElseImpl
