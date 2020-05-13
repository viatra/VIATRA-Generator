/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Category_of_Permanent_Expense;
import TaxationWithRoot.DS_for_Permanent_Expense;
import TaxationWithRoot.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DS for Permanent Expense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.DS_for_Permanent_ExpenseImpl#getPermanent_expense_category <em>Permanent expense category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DS_for_Permanent_ExpenseImpl extends DSImpl implements DS_for_Permanent_Expense {
	/**
	 * The default value of the '{@link #getPermanent_expense_category() <em>Permanent expense category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanent_expense_category()
	 * @generated
	 * @ordered
	 */
	protected static final Category_of_Permanent_Expense PERMANENT_EXPENSE_CATEGORY_EDEFAULT = Category_of_Permanent_Expense.MISCELLANEOUS_DEBT;

	/**
	 * The cached value of the '{@link #getPermanent_expense_category() <em>Permanent expense category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanent_expense_category()
	 * @generated
	 * @ordered
	 */
	protected Category_of_Permanent_Expense permanent_expense_category = PERMANENT_EXPENSE_CATEGORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DS_for_Permanent_ExpenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.DS_FOR_PERMANENT_EXPENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category_of_Permanent_Expense getPermanent_expense_category() {
		return permanent_expense_category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermanent_expense_category(Category_of_Permanent_Expense newPermanent_expense_category) {
		Category_of_Permanent_Expense oldPermanent_expense_category = permanent_expense_category;
		permanent_expense_category = newPermanent_expense_category == null ? PERMANENT_EXPENSE_CATEGORY_EDEFAULT : newPermanent_expense_category;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DS_FOR_PERMANENT_EXPENSE__PERMANENT_EXPENSE_CATEGORY, oldPermanent_expense_category, permanent_expense_category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.DS_FOR_PERMANENT_EXPENSE__PERMANENT_EXPENSE_CATEGORY:
				return getPermanent_expense_category();
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
			case TaxationPackage.DS_FOR_PERMANENT_EXPENSE__PERMANENT_EXPENSE_CATEGORY:
				setPermanent_expense_category((Category_of_Permanent_Expense)newValue);
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
			case TaxationPackage.DS_FOR_PERMANENT_EXPENSE__PERMANENT_EXPENSE_CATEGORY:
				setPermanent_expense_category(PERMANENT_EXPENSE_CATEGORY_EDEFAULT);
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
			case TaxationPackage.DS_FOR_PERMANENT_EXPENSE__PERMANENT_EXPENSE_CATEGORY:
				return permanent_expense_category != PERMANENT_EXPENSE_CATEGORY_EDEFAULT;
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
		result.append(" (permanent_expense_category: ");
		result.append(permanent_expense_category);
		result.append(')');
		return result.toString();
	}

} //DS_for_Permanent_ExpenseImpl
