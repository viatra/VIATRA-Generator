/**
 */
package Taxation.impl;

import Taxation.Loss_Carryforward;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loss Carryforward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Loss_CarryforwardImpl#isRegular_accountability <em>Regular accountability</em>}</li>
 *   <li>{@link Taxation.impl.Loss_CarryforwardImpl#isCompensation_by_other_means <em>Compensation by other means</em>}</li>
 *   <li>{@link Taxation.impl.Loss_CarryforwardImpl#isTax_payer_has_inherited_business_ownership <em>Tax payer has inherited business ownership</em>}</li>
 *   <li>{@link Taxation.impl.Loss_CarryforwardImpl#isTax_payer_has_been_partner_in_business <em>Tax payer has been partner in business</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Loss_CarryforwardImpl extends Special_Expense_DSImpl implements Loss_Carryforward {
	/**
	 * The default value of the '{@link #isRegular_accountability() <em>Regular accountability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegular_accountability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULAR_ACCOUNTABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegular_accountability() <em>Regular accountability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegular_accountability()
	 * @generated
	 * @ordered
	 */
	protected boolean regular_accountability = REGULAR_ACCOUNTABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCompensation_by_other_means() <em>Compensation by other means</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompensation_by_other_means()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPENSATION_BY_OTHER_MEANS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompensation_by_other_means() <em>Compensation by other means</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompensation_by_other_means()
	 * @generated
	 * @ordered
	 */
	protected boolean compensation_by_other_means = COMPENSATION_BY_OTHER_MEANS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTax_payer_has_inherited_business_ownership() <em>Tax payer has inherited business ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTax_payer_has_inherited_business_ownership()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTax_payer_has_inherited_business_ownership() <em>Tax payer has inherited business ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTax_payer_has_inherited_business_ownership()
	 * @generated
	 * @ordered
	 */
	protected boolean tax_payer_has_inherited_business_ownership = TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #isTax_payer_has_been_partner_in_business() <em>Tax payer has been partner in business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTax_payer_has_been_partner_in_business()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTax_payer_has_been_partner_in_business() <em>Tax payer has been partner in business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTax_payer_has_been_partner_in_business()
	 * @generated
	 * @ordered
	 */
	protected boolean tax_payer_has_been_partner_in_business = TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Loss_CarryforwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.LOSS_CARRYFORWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRegular_accountability() {
		return regular_accountability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegular_accountability(boolean newRegular_accountability) {
		boolean oldRegular_accountability = regular_accountability;
		regular_accountability = newRegular_accountability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LOSS_CARRYFORWARD__REGULAR_ACCOUNTABILITY, oldRegular_accountability, regular_accountability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCompensation_by_other_means() {
		return compensation_by_other_means;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompensation_by_other_means(boolean newCompensation_by_other_means) {
		boolean oldCompensation_by_other_means = compensation_by_other_means;
		compensation_by_other_means = newCompensation_by_other_means;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LOSS_CARRYFORWARD__COMPENSATION_BY_OTHER_MEANS, oldCompensation_by_other_means, compensation_by_other_means));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTax_payer_has_inherited_business_ownership() {
		return tax_payer_has_inherited_business_ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_payer_has_inherited_business_ownership(boolean newTax_payer_has_inherited_business_ownership) {
		boolean oldTax_payer_has_inherited_business_ownership = tax_payer_has_inherited_business_ownership;
		tax_payer_has_inherited_business_ownership = newTax_payer_has_inherited_business_ownership;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP, oldTax_payer_has_inherited_business_ownership, tax_payer_has_inherited_business_ownership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTax_payer_has_been_partner_in_business() {
		return tax_payer_has_been_partner_in_business;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_payer_has_been_partner_in_business(boolean newTax_payer_has_been_partner_in_business) {
		boolean oldTax_payer_has_been_partner_in_business = tax_payer_has_been_partner_in_business;
		tax_payer_has_been_partner_in_business = newTax_payer_has_been_partner_in_business;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS, oldTax_payer_has_been_partner_in_business, tax_payer_has_been_partner_in_business));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.LOSS_CARRYFORWARD__REGULAR_ACCOUNTABILITY:
				return isRegular_accountability();
			case TaxationPackage.LOSS_CARRYFORWARD__COMPENSATION_BY_OTHER_MEANS:
				return isCompensation_by_other_means();
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP:
				return isTax_payer_has_inherited_business_ownership();
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS:
				return isTax_payer_has_been_partner_in_business();
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
			case TaxationPackage.LOSS_CARRYFORWARD__REGULAR_ACCOUNTABILITY:
				setRegular_accountability((Boolean)newValue);
				return;
			case TaxationPackage.LOSS_CARRYFORWARD__COMPENSATION_BY_OTHER_MEANS:
				setCompensation_by_other_means((Boolean)newValue);
				return;
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP:
				setTax_payer_has_inherited_business_ownership((Boolean)newValue);
				return;
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS:
				setTax_payer_has_been_partner_in_business((Boolean)newValue);
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
			case TaxationPackage.LOSS_CARRYFORWARD__REGULAR_ACCOUNTABILITY:
				setRegular_accountability(REGULAR_ACCOUNTABILITY_EDEFAULT);
				return;
			case TaxationPackage.LOSS_CARRYFORWARD__COMPENSATION_BY_OTHER_MEANS:
				setCompensation_by_other_means(COMPENSATION_BY_OTHER_MEANS_EDEFAULT);
				return;
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP:
				setTax_payer_has_inherited_business_ownership(TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP_EDEFAULT);
				return;
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS:
				setTax_payer_has_been_partner_in_business(TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS_EDEFAULT);
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
			case TaxationPackage.LOSS_CARRYFORWARD__REGULAR_ACCOUNTABILITY:
				return regular_accountability != REGULAR_ACCOUNTABILITY_EDEFAULT;
			case TaxationPackage.LOSS_CARRYFORWARD__COMPENSATION_BY_OTHER_MEANS:
				return compensation_by_other_means != COMPENSATION_BY_OTHER_MEANS_EDEFAULT;
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP:
				return tax_payer_has_inherited_business_ownership != TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP_EDEFAULT;
			case TaxationPackage.LOSS_CARRYFORWARD__TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS:
				return tax_payer_has_been_partner_in_business != TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS_EDEFAULT;
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
		result.append(" (regular_accountability: ");
		result.append(regular_accountability);
		result.append(", compensation_by_other_means: ");
		result.append(compensation_by_other_means);
		result.append(", tax_payer_has_inherited_business_ownership: ");
		result.append(tax_payer_has_inherited_business_ownership);
		result.append(", tax_payer_has_been_partner_in_business: ");
		result.append(tax_payer_has_been_partner_in_business);
		result.append(')');
		return result.toString();
	}

} //Loss_CarryforwardImpl
