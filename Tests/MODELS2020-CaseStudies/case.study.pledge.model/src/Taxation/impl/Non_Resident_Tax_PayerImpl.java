/**
 */
package Taxation.impl;

import Taxation.Non_Resident_Tax_Payer;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Resident Tax Payer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Non_Resident_Tax_PayerImpl#isIs_assimilated_to_resident <em>Is assimilated to resident</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Non_Resident_Tax_PayerImpl extends Tax_PayerImpl implements Non_Resident_Tax_Payer {
	/**
	 * The default value of the '{@link #isIs_assimilated_to_resident() <em>Is assimilated to resident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_assimilated_to_resident()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSIMILATED_TO_RESIDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_assimilated_to_resident() <em>Is assimilated to resident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_assimilated_to_resident()
	 * @generated
	 * @ordered
	 */
	protected boolean is_assimilated_to_resident = IS_ASSIMILATED_TO_RESIDENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Non_Resident_Tax_PayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.NON_RESIDENT_TAX_PAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_assimilated_to_resident() {
		return is_assimilated_to_resident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_assimilated_to_resident(boolean newIs_assimilated_to_resident) {
		boolean oldIs_assimilated_to_resident = is_assimilated_to_resident;
		is_assimilated_to_resident = newIs_assimilated_to_resident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT, oldIs_assimilated_to_resident, is_assimilated_to_resident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT:
				return isIs_assimilated_to_resident();
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
			case TaxationPackage.NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT:
				setIs_assimilated_to_resident((Boolean)newValue);
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
			case TaxationPackage.NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT:
				setIs_assimilated_to_resident(IS_ASSIMILATED_TO_RESIDENT_EDEFAULT);
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
			case TaxationPackage.NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT:
				return is_assimilated_to_resident != IS_ASSIMILATED_TO_RESIDENT_EDEFAULT;
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
		result.append(" (is_assimilated_to_resident: ");
		result.append(is_assimilated_to_resident);
		result.append(')');
		return result.toString();
	}

} //Non_Resident_Tax_PayerImpl
