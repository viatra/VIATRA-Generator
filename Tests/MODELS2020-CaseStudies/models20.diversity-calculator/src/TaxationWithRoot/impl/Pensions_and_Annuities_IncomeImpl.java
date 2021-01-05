/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Pensions_and_Annuities_Income;
import TaxationWithRoot.TaxationWithRootPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pensions and Annuities Income</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.Pensions_and_Annuities_IncomeImpl#isOccasional_payement <em>Occasional payement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pensions_and_Annuities_IncomeImpl extends Income_TypeImpl implements Pensions_and_Annuities_Income {
	/**
	 * The default value of the '{@link #isOccasional_payement() <em>Occasional payement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccasional_payement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OCCASIONAL_PAYEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOccasional_payement() <em>Occasional payement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccasional_payement()
	 * @generated
	 * @ordered
	 */
	protected boolean occasional_payement = OCCASIONAL_PAYEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pensions_and_Annuities_IncomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationWithRootPackage.Literals.PENSIONS_AND_ANNUITIES_INCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOccasional_payement() {
		return occasional_payement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccasional_payement(boolean newOccasional_payement) {
		boolean oldOccasional_payement = occasional_payement;
		occasional_payement = newOccasional_payement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT, oldOccasional_payement, occasional_payement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationWithRootPackage.PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT:
				return isOccasional_payement();
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
			case TaxationWithRootPackage.PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT:
				setOccasional_payement((Boolean)newValue);
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
			case TaxationWithRootPackage.PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT:
				setOccasional_payement(OCCASIONAL_PAYEMENT_EDEFAULT);
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
			case TaxationWithRootPackage.PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT:
				return occasional_payement != OCCASIONAL_PAYEMENT_EDEFAULT;
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
		result.append(" (occasional_payement: ");
		result.append(occasional_payement);
		result.append(')');
		return result.toString();
	}

} //Pensions_and_Annuities_IncomeImpl
