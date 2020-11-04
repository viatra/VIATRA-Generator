/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Donation;
import TaxationWithRoot.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Donation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.DonationImpl#getBeneficiary1 <em>Beneficiary1</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.DonationImpl#isIs_donation_reported <em>Is donation reported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DonationImpl extends Special_Expense_DSImpl implements Donation {
	/**
	 * The default value of the '{@link #getBeneficiary1() <em>Beneficiary1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiary1()
	 * @generated
	 * @ordered
	 */
	protected static final String BENEFICIARY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeneficiary1() <em>Beneficiary1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiary1()
	 * @generated
	 * @ordered
	 */
	protected String beneficiary1 = BENEFICIARY1_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_donation_reported() <em>Is donation reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_donation_reported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DONATION_REPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_donation_reported() <em>Is donation reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_donation_reported()
	 * @generated
	 * @ordered
	 */
	protected boolean is_donation_reported = IS_DONATION_REPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DonationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.DONATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeneficiary1() {
		return beneficiary1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeneficiary1(String newBeneficiary1) {
		String oldBeneficiary1 = beneficiary1;
		beneficiary1 = newBeneficiary1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DONATION__BENEFICIARY1, oldBeneficiary1, beneficiary1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_donation_reported() {
		return is_donation_reported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_donation_reported(boolean newIs_donation_reported) {
		boolean oldIs_donation_reported = is_donation_reported;
		is_donation_reported = newIs_donation_reported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DONATION__IS_DONATION_REPORTED, oldIs_donation_reported, is_donation_reported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.DONATION__BENEFICIARY1:
				return getBeneficiary1();
			case TaxationPackage.DONATION__IS_DONATION_REPORTED:
				return isIs_donation_reported();
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
			case TaxationPackage.DONATION__BENEFICIARY1:
				setBeneficiary1((String)newValue);
				return;
			case TaxationPackage.DONATION__IS_DONATION_REPORTED:
				setIs_donation_reported((Boolean)newValue);
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
			case TaxationPackage.DONATION__BENEFICIARY1:
				setBeneficiary1(BENEFICIARY1_EDEFAULT);
				return;
			case TaxationPackage.DONATION__IS_DONATION_REPORTED:
				setIs_donation_reported(IS_DONATION_REPORTED_EDEFAULT);
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
			case TaxationPackage.DONATION__BENEFICIARY1:
				return BENEFICIARY1_EDEFAULT == null ? beneficiary1 != null : !BENEFICIARY1_EDEFAULT.equals(beneficiary1);
			case TaxationPackage.DONATION__IS_DONATION_REPORTED:
				return is_donation_reported != IS_DONATION_REPORTED_EDEFAULT;
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
		result.append(" (beneficiary1: ");
		result.append(beneficiary1);
		result.append(", is_donation_reported: ");
		result.append(is_donation_reported);
		result.append(')');
		return result.toString();
	}

} //DonationImpl
