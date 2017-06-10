/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl#getMaxInteger <em>Max Integer</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl#getMinInteger <em>Min Integer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelResultImpl extends LogicResultImpl implements ModelResult {
	/**
	 * The default value of the '{@link #getMaxInteger() <em>Max Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInteger()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INTEGER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInteger() <em>Max Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInteger()
	 * @generated
	 * @ordered
	 */
	protected int maxInteger = MAX_INTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinInteger() <em>Min Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInteger()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INTEGER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinInteger() <em>Min Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInteger()
	 * @generated
	 * @ordered
	 */
	protected int minInteger = MIN_INTEGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicresultPackage.Literals.MODEL_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInteger() {
		return maxInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInteger(int newMaxInteger) {
		int oldMaxInteger = maxInteger;
		maxInteger = newMaxInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.MODEL_RESULT__MAX_INTEGER, oldMaxInteger, maxInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInteger() {
		return minInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInteger(int newMinInteger) {
		int oldMinInteger = minInteger;
		minInteger = newMinInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicresultPackage.MODEL_RESULT__MIN_INTEGER, oldMinInteger, minInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicresultPackage.MODEL_RESULT__MAX_INTEGER:
				return getMaxInteger();
			case LogicresultPackage.MODEL_RESULT__MIN_INTEGER:
				return getMinInteger();
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
			case LogicresultPackage.MODEL_RESULT__MAX_INTEGER:
				setMaxInteger((Integer)newValue);
				return;
			case LogicresultPackage.MODEL_RESULT__MIN_INTEGER:
				setMinInteger((Integer)newValue);
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
			case LogicresultPackage.MODEL_RESULT__MAX_INTEGER:
				setMaxInteger(MAX_INTEGER_EDEFAULT);
				return;
			case LogicresultPackage.MODEL_RESULT__MIN_INTEGER:
				setMinInteger(MIN_INTEGER_EDEFAULT);
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
			case LogicresultPackage.MODEL_RESULT__MAX_INTEGER:
				return maxInteger != MAX_INTEGER_EDEFAULT;
			case LogicresultPackage.MODEL_RESULT__MIN_INTEGER:
				return minInteger != MIN_INTEGER_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxInteger: ");
		result.append(maxInteger);
		result.append(", minInteger: ");
		result.append(minInteger);
		result.append(')');
		return result.toString();
	}

} //ModelResultImpl
