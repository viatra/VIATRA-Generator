/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Rentals_and_Leases_Income;
import TaxationWithRoot.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rentals and Leases Income</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.Rentals_and_Leases_IncomeImpl#isIs_periodic <em>Is periodic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Rentals_and_Leases_IncomeImpl extends Income_TypeImpl implements Rentals_and_Leases_Income {
	/**
	 * The default value of the '{@link #isIs_periodic() <em>Is periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_periodic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERIODIC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIs_periodic() <em>Is periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_periodic()
	 * @generated
	 * @ordered
	 */
	protected boolean is_periodic = IS_PERIODIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rentals_and_Leases_IncomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.RENTALS_AND_LEASES_INCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_periodic() {
		return is_periodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_periodic(boolean newIs_periodic) {
		boolean oldIs_periodic = is_periodic;
		is_periodic = newIs_periodic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.RENTALS_AND_LEASES_INCOME__IS_PERIODIC, oldIs_periodic, is_periodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.RENTALS_AND_LEASES_INCOME__IS_PERIODIC:
				return isIs_periodic();
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
			case TaxationPackage.RENTALS_AND_LEASES_INCOME__IS_PERIODIC:
				setIs_periodic((Boolean)newValue);
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
			case TaxationPackage.RENTALS_AND_LEASES_INCOME__IS_PERIODIC:
				setIs_periodic(IS_PERIODIC_EDEFAULT);
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
			case TaxationPackage.RENTALS_AND_LEASES_INCOME__IS_PERIODIC:
				return is_periodic != IS_PERIODIC_EDEFAULT;
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
		result.append(" (is_periodic: ");
		result.append(is_periodic);
		result.append(')');
		return result.toString();
	}

} //Rentals_and_Leases_IncomeImpl
