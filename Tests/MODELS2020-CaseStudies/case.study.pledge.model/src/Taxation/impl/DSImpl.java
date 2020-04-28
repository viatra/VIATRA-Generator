/**
 */
package Taxation.impl;

import Taxation.DS;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.DSImpl#getMaximum_deductible_amount <em>Maximum deductible amount</em>}</li>
 *   <li>{@link Taxation.impl.DSImpl#getId3 <em>Id3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSImpl extends MinimalEObjectImpl.Container implements DS {
	/**
	 * The default value of the '{@link #getMaximum_deductible_amount() <em>Maximum deductible amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_deductible_amount()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum_deductible_amount() <em>Maximum deductible amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_deductible_amount()
	 * @generated
	 * @ordered
	 */
	protected double maximum_deductible_amount = MAXIMUM_DEDUCTIBLE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId3() <em>Id3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId3()
	 * @generated
	 * @ordered
	 */
	protected static final String ID3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId3() <em>Id3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId3()
	 * @generated
	 * @ordered
	 */
	protected String id3 = ID3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximum_deductible_amount() {
		return maximum_deductible_amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum_deductible_amount(double newMaximum_deductible_amount) {
		double oldMaximum_deductible_amount = maximum_deductible_amount;
		maximum_deductible_amount = newMaximum_deductible_amount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS__MAXIMUM_DEDUCTIBLE_AMOUNT, oldMaximum_deductible_amount, maximum_deductible_amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId3() {
		return id3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId3(String newId3) {
		String oldId3 = id3;
		id3 = newId3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS__ID3, oldId3, id3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.DS__MAXIMUM_DEDUCTIBLE_AMOUNT:
				return getMaximum_deductible_amount();
			case TaxationPackage.DS__ID3:
				return getId3();
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
			case TaxationPackage.DS__MAXIMUM_DEDUCTIBLE_AMOUNT:
				setMaximum_deductible_amount((Double)newValue);
				return;
			case TaxationPackage.DS__ID3:
				setId3((String)newValue);
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
			case TaxationPackage.DS__MAXIMUM_DEDUCTIBLE_AMOUNT:
				setMaximum_deductible_amount(MAXIMUM_DEDUCTIBLE_AMOUNT_EDEFAULT);
				return;
			case TaxationPackage.DS__ID3:
				setId3(ID3_EDEFAULT);
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
			case TaxationPackage.DS__MAXIMUM_DEDUCTIBLE_AMOUNT:
				return maximum_deductible_amount != MAXIMUM_DEDUCTIBLE_AMOUNT_EDEFAULT;
			case TaxationPackage.DS__ID3:
				return ID3_EDEFAULT == null ? id3 != null : !ID3_EDEFAULT.equals(id3);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (maximum_deductible_amount: ");
		result.append(maximum_deductible_amount);
		result.append(", id3: ");
		result.append(id3);
		result.append(')');
		return result.toString();
	}

} //DSImpl
