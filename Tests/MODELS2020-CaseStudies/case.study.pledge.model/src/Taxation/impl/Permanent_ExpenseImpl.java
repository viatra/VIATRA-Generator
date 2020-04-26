/**
 */
package Taxation.impl;

import Taxation.Category_of_Permanent_Expense;
import Taxation.Permanent_Expense;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permanent Expense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Permanent_ExpenseImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link Taxation.impl.Permanent_ExpenseImpl#isIs_eligible_for_deduction <em>Is eligible for deduction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permanent_ExpenseImpl extends Special_Expense_DSImpl implements Permanent_Expense {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category_of_Permanent_Expense CATEGORY_EDEFAULT = Category_of_Permanent_Expense.MISCELLANEOUS_DEBT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category_of_Permanent_Expense category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_eligible_for_deduction() <em>Is eligible for deduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_eligible_for_deduction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ELIGIBLE_FOR_DEDUCTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_eligible_for_deduction() <em>Is eligible for deduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_eligible_for_deduction()
	 * @generated
	 * @ordered
	 */
	protected boolean is_eligible_for_deduction = IS_ELIGIBLE_FOR_DEDUCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permanent_ExpenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.PERMANENT_EXPENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category_of_Permanent_Expense getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Category_of_Permanent_Expense newCategory) {
		Category_of_Permanent_Expense oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PERMANENT_EXPENSE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_eligible_for_deduction() {
		return is_eligible_for_deduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_eligible_for_deduction(boolean newIs_eligible_for_deduction) {
		boolean oldIs_eligible_for_deduction = is_eligible_for_deduction;
		is_eligible_for_deduction = newIs_eligible_for_deduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PERMANENT_EXPENSE__IS_ELIGIBLE_FOR_DEDUCTION, oldIs_eligible_for_deduction, is_eligible_for_deduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.PERMANENT_EXPENSE__CATEGORY:
				return getCategory();
			case TaxationPackage.PERMANENT_EXPENSE__IS_ELIGIBLE_FOR_DEDUCTION:
				return isIs_eligible_for_deduction();
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
			case TaxationPackage.PERMANENT_EXPENSE__CATEGORY:
				setCategory((Category_of_Permanent_Expense)newValue);
				return;
			case TaxationPackage.PERMANENT_EXPENSE__IS_ELIGIBLE_FOR_DEDUCTION:
				setIs_eligible_for_deduction((Boolean)newValue);
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
			case TaxationPackage.PERMANENT_EXPENSE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case TaxationPackage.PERMANENT_EXPENSE__IS_ELIGIBLE_FOR_DEDUCTION:
				setIs_eligible_for_deduction(IS_ELIGIBLE_FOR_DEDUCTION_EDEFAULT);
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
			case TaxationPackage.PERMANENT_EXPENSE__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case TaxationPackage.PERMANENT_EXPENSE__IS_ELIGIBLE_FOR_DEDUCTION:
				return is_eligible_for_deduction != IS_ELIGIBLE_FOR_DEDUCTION_EDEFAULT;
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
		result.append(" (category: ");
		result.append(category);
		result.append(", is_eligible_for_deduction: ");
		result.append(is_eligible_for_deduction);
		result.append(')');
		return result.toString();
	}

} //Permanent_ExpenseImpl
