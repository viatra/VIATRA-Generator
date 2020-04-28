/**
 */
package Taxation.impl;

import Taxation.Income;
import Taxation.Income_Detail;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Income Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Income_DetailImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link Taxation.impl.Income_DetailImpl#isIs_worked <em>Is worked</em>}</li>
 *   <li>{@link Taxation.impl.Income_DetailImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link Taxation.impl.Income_DetailImpl#getWorked_days <em>Worked days</em>}</li>
 *   <li>{@link Taxation.impl.Income_DetailImpl#isIs_contributing_CNS <em>Is contributing CNS</em>}</li>
 *   <li>{@link Taxation.impl.Income_DetailImpl#getId5 <em>Id5</em>}</li>
 *   <li>{@link Taxation.impl.Income_DetailImpl#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Income_DetailImpl extends MinimalEObjectImpl.Container implements Income_Detail {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_worked() <em>Is worked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_worked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WORKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_worked() <em>Is worked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_worked()
	 * @generated
	 * @ordered
	 */
	protected boolean is_worked = IS_WORKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorked_days() <em>Worked days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorked_days()
	 * @generated
	 * @ordered
	 */
	protected static final int WORKED_DAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWorked_days() <em>Worked days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorked_days()
	 * @generated
	 * @ordered
	 */
	protected int worked_days = WORKED_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_contributing_CNS() <em>Is contributing CNS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_contributing_CNS()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTRIBUTING_CNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_contributing_CNS() <em>Is contributing CNS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_contributing_CNS()
	 * @generated
	 * @ordered
	 */
	protected boolean is_contributing_CNS = IS_CONTRIBUTING_CNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId5() <em>Id5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId5()
	 * @generated
	 * @ordered
	 */
	protected static final String ID5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId5() <em>Id5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId5()
	 * @generated
	 * @ordered
	 */
	protected String id5 = ID5_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Income_DetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.INCOME_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_DETAIL__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_worked() {
		return is_worked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_worked(boolean newIs_worked) {
		boolean oldIs_worked = is_worked;
		is_worked = newIs_worked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_DETAIL__IS_WORKED, oldIs_worked, is_worked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_DETAIL__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWorked_days() {
		return worked_days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorked_days(int newWorked_days) {
		int oldWorked_days = worked_days;
		worked_days = newWorked_days;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_DETAIL__WORKED_DAYS, oldWorked_days, worked_days));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_contributing_CNS() {
		return is_contributing_CNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_contributing_CNS(boolean newIs_contributing_CNS) {
		boolean oldIs_contributing_CNS = is_contributing_CNS;
		is_contributing_CNS = newIs_contributing_CNS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_DETAIL__IS_CONTRIBUTING_CNS, oldIs_contributing_CNS, is_contributing_CNS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId5() {
		return id5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId5(String newId5) {
		String oldId5 = id5;
		id5 = newId5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_DETAIL__ID5, oldId5, id5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income getIncome() {
		if (eContainerFeatureID() != TaxationPackage.INCOME_DETAIL__INCOME) return null;
		return (Income)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncome(Income newIncome, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIncome, TaxationPackage.INCOME_DETAIL__INCOME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncome(Income newIncome) {
		if (newIncome != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.INCOME_DETAIL__INCOME && newIncome != null)) {
			if (EcoreUtil.isAncestor(this, newIncome))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncome != null)
				msgs = ((InternalEObject)newIncome).eInverseAdd(this, TaxationPackage.INCOME__DETAILS, Income.class, msgs);
			msgs = basicSetIncome(newIncome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_DETAIL__INCOME, newIncome, newIncome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.INCOME_DETAIL__INCOME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIncome((Income)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.INCOME_DETAIL__INCOME:
				return basicSetIncome(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TaxationPackage.INCOME_DETAIL__INCOME:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.INCOME__DETAILS, Income.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.INCOME_DETAIL__AMOUNT:
				return getAmount();
			case TaxationPackage.INCOME_DETAIL__IS_WORKED:
				return isIs_worked();
			case TaxationPackage.INCOME_DETAIL__DISTANCE:
				return getDistance();
			case TaxationPackage.INCOME_DETAIL__WORKED_DAYS:
				return getWorked_days();
			case TaxationPackage.INCOME_DETAIL__IS_CONTRIBUTING_CNS:
				return isIs_contributing_CNS();
			case TaxationPackage.INCOME_DETAIL__ID5:
				return getId5();
			case TaxationPackage.INCOME_DETAIL__INCOME:
				return getIncome();
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
			case TaxationPackage.INCOME_DETAIL__AMOUNT:
				setAmount((Double)newValue);
				return;
			case TaxationPackage.INCOME_DETAIL__IS_WORKED:
				setIs_worked((Boolean)newValue);
				return;
			case TaxationPackage.INCOME_DETAIL__DISTANCE:
				setDistance((Double)newValue);
				return;
			case TaxationPackage.INCOME_DETAIL__WORKED_DAYS:
				setWorked_days((Integer)newValue);
				return;
			case TaxationPackage.INCOME_DETAIL__IS_CONTRIBUTING_CNS:
				setIs_contributing_CNS((Boolean)newValue);
				return;
			case TaxationPackage.INCOME_DETAIL__ID5:
				setId5((String)newValue);
				return;
			case TaxationPackage.INCOME_DETAIL__INCOME:
				setIncome((Income)newValue);
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
			case TaxationPackage.INCOME_DETAIL__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case TaxationPackage.INCOME_DETAIL__IS_WORKED:
				setIs_worked(IS_WORKED_EDEFAULT);
				return;
			case TaxationPackage.INCOME_DETAIL__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case TaxationPackage.INCOME_DETAIL__WORKED_DAYS:
				setWorked_days(WORKED_DAYS_EDEFAULT);
				return;
			case TaxationPackage.INCOME_DETAIL__IS_CONTRIBUTING_CNS:
				setIs_contributing_CNS(IS_CONTRIBUTING_CNS_EDEFAULT);
				return;
			case TaxationPackage.INCOME_DETAIL__ID5:
				setId5(ID5_EDEFAULT);
				return;
			case TaxationPackage.INCOME_DETAIL__INCOME:
				setIncome((Income)null);
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
			case TaxationPackage.INCOME_DETAIL__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case TaxationPackage.INCOME_DETAIL__IS_WORKED:
				return is_worked != IS_WORKED_EDEFAULT;
			case TaxationPackage.INCOME_DETAIL__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case TaxationPackage.INCOME_DETAIL__WORKED_DAYS:
				return worked_days != WORKED_DAYS_EDEFAULT;
			case TaxationPackage.INCOME_DETAIL__IS_CONTRIBUTING_CNS:
				return is_contributing_CNS != IS_CONTRIBUTING_CNS_EDEFAULT;
			case TaxationPackage.INCOME_DETAIL__ID5:
				return ID5_EDEFAULT == null ? id5 != null : !ID5_EDEFAULT.equals(id5);
			case TaxationPackage.INCOME_DETAIL__INCOME:
				return getIncome() != null;
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", is_worked: ");
		result.append(is_worked);
		result.append(", distance: ");
		result.append(distance);
		result.append(", worked_days: ");
		result.append(worked_days);
		result.append(", is_contributing_CNS: ");
		result.append(is_contributing_CNS);
		result.append(", id5: ");
		result.append(id5);
		result.append(')');
		return result.toString();
	}

} //Income_DetailImpl
