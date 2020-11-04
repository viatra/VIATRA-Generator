/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.CE_Type;
import TaxationWithRoot.Extraordinary_Expense_CE;
import TaxationWithRoot.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extraordinary Expense CE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.Extraordinary_Expense_CEImpl#getThresholded_deduction_percentage <em>Thresholded deduction percentage</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Extraordinary_Expense_CEImpl#getCe_type <em>Ce type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Extraordinary_Expense_CEImpl extends ExpenseImpl implements Extraordinary_Expense_CE {
	/**
	 * The default value of the '{@link #getThresholded_deduction_percentage() <em>Thresholded deduction percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholded_deduction_percentage()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLDED_DEDUCTION_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThresholded_deduction_percentage() <em>Thresholded deduction percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholded_deduction_percentage()
	 * @generated
	 * @ordered
	 */
	protected double thresholded_deduction_percentage = THRESHOLDED_DEDUCTION_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCe_type() <em>Ce type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCe_type()
	 * @generated
	 * @ordered
	 */
	protected static final CE_Type CE_TYPE_EDEFAULT = CE_Type.INALIDITY_AND_INFIRMITY;

	/**
	 * The cached value of the '{@link #getCe_type() <em>Ce type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCe_type()
	 * @generated
	 * @ordered
	 */
	protected CE_Type ce_type = CE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Extraordinary_Expense_CEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.EXTRAORDINARY_EXPENSE_CE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThresholded_deduction_percentage() {
		return thresholded_deduction_percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholded_deduction_percentage(double newThresholded_deduction_percentage) {
		double oldThresholded_deduction_percentage = thresholded_deduction_percentage;
		thresholded_deduction_percentage = newThresholded_deduction_percentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE, oldThresholded_deduction_percentage, thresholded_deduction_percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CE_Type getCe_type() {
		return ce_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCe_type(CE_Type newCe_type) {
		CE_Type oldCe_type = ce_type;
		ce_type = newCe_type == null ? CE_TYPE_EDEFAULT : newCe_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXTRAORDINARY_EXPENSE_CE__CE_TYPE, oldCe_type, ce_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE:
				return getThresholded_deduction_percentage();
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__CE_TYPE:
				return getCe_type();
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
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE:
				setThresholded_deduction_percentage((Double)newValue);
				return;
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__CE_TYPE:
				setCe_type((CE_Type)newValue);
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
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE:
				setThresholded_deduction_percentage(THRESHOLDED_DEDUCTION_PERCENTAGE_EDEFAULT);
				return;
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__CE_TYPE:
				setCe_type(CE_TYPE_EDEFAULT);
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
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE:
				return thresholded_deduction_percentage != THRESHOLDED_DEDUCTION_PERCENTAGE_EDEFAULT;
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE__CE_TYPE:
				return ce_type != CE_TYPE_EDEFAULT;
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
		result.append(" (thresholded_deduction_percentage: ");
		result.append(thresholded_deduction_percentage);
		result.append(", ce_type: ");
		result.append(ce_type);
		result.append(')');
		return result.toString();
	}

} //Extraordinary_Expense_CEImpl
