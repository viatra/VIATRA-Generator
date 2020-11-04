/**
 */
package Taxation.impl;

import Taxation.Category_of_Private_Insurance_and_Plan;
import Taxation.Private_Insurance_and_Plan;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Insurance and Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Private_Insurance_and_PlanImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link Taxation.impl.Private_Insurance_and_PlanImpl#getDuration_of_contract <em>Duration of contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Private_Insurance_and_PlanImpl extends Special_Expense_DSImpl implements Private_Insurance_and_Plan {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category_of_Private_Insurance_and_Plan CATEGORY_EDEFAULT = Category_of_Private_Insurance_and_Plan.PRIVATE_INSURANCE;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category_of_Private_Insurance_and_Plan category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration_of_contract() <em>Duration of contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_of_contract()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_OF_CONTRACT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration_of_contract() <em>Duration of contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_of_contract()
	 * @generated
	 * @ordered
	 */
	protected int duration_of_contract = DURATION_OF_CONTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Private_Insurance_and_PlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.PRIVATE_INSURANCE_AND_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category_of_Private_Insurance_and_Plan getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Category_of_Private_Insurance_and_Plan newCategory) {
		Category_of_Private_Insurance_and_Plan oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration_of_contract() {
		return duration_of_contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration_of_contract(int newDuration_of_contract) {
		int oldDuration_of_contract = duration_of_contract;
		duration_of_contract = newDuration_of_contract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT, oldDuration_of_contract, duration_of_contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__CATEGORY:
				return getCategory();
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT:
				return getDuration_of_contract();
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
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__CATEGORY:
				setCategory((Category_of_Private_Insurance_and_Plan)newValue);
				return;
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT:
				setDuration_of_contract((Integer)newValue);
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
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT:
				setDuration_of_contract(DURATION_OF_CONTRACT_EDEFAULT);
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
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT:
				return duration_of_contract != DURATION_OF_CONTRACT_EDEFAULT;
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
		result.append(", duration_of_contract: ");
		result.append(duration_of_contract);
		result.append(')');
		return result.toString();
	}

} //Private_Insurance_and_PlanImpl
