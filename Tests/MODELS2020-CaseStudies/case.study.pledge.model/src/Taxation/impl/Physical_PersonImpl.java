/**
 */
package Taxation.impl;

import Taxation.Address;
import Taxation.Disability_Types;
import Taxation.Expense;
import Taxation.Physical_Person;
import Taxation.TaxationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#isIs_assisting_spouse <em>Is assisting spouse</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getSSNo <em>SS No</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getBirth_year <em>Birth year</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getDisability_percentage <em>Disability percentage</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getDisability_type <em>Disability type</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#isIs_affiliated_personnaly_to_social_security <em>Is affiliated personnaly to social security</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getBirth_month <em>Birth month</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getBirth_day <em>Birth day</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#getExpenses <em>Expenses</em>}</li>
 *   <li>{@link Taxation.impl.Physical_PersonImpl#isIs_widower <em>Is widower</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Physical_PersonImpl extends MinimalEObjectImpl.Container implements Physical_Person {
	/**
	 * The default value of the '{@link #isIs_assisting_spouse() <em>Is assisting spouse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_assisting_spouse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSISTING_SPOUSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_assisting_spouse() <em>Is assisting spouse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_assisting_spouse()
	 * @generated
	 * @ordered
	 */
	protected boolean is_assisting_spouse = IS_ASSISTING_SPOUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSNo() <em>SS No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSNo()
	 * @generated
	 * @ordered
	 */
	protected static final String SS_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSNo() <em>SS No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSNo()
	 * @generated
	 * @ordered
	 */
	protected String ssNo = SS_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The default value of the '{@link #getBirth_year() <em>Birth year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_year()
	 * @generated
	 * @ordered
	 */
	protected static final int BIRTH_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBirth_year() <em>Birth year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_year()
	 * @generated
	 * @ordered
	 */
	protected int birth_year = BIRTH_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisability_percentage() <em>Disability percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisability_percentage()
	 * @generated
	 * @ordered
	 */
	protected static final double DISABILITY_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisability_percentage() <em>Disability percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisability_percentage()
	 * @generated
	 * @ordered
	 */
	protected double disability_percentage = DISABILITY_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisability_type() <em>Disability type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisability_type()
	 * @generated
	 * @ordered
	 */
	protected static final Disability_Types DISABILITY_TYPE_EDEFAULT = Disability_Types.BEUG;

	/**
	 * The cached value of the '{@link #getDisability_type() <em>Disability type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisability_type()
	 * @generated
	 * @ordered
	 */
	protected Disability_Types disability_type = DISABILITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_affiliated_personnaly_to_social_security() <em>Is affiliated personnaly to social security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_affiliated_personnaly_to_social_security()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_affiliated_personnaly_to_social_security() <em>Is affiliated personnaly to social security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_affiliated_personnaly_to_social_security()
	 * @generated
	 * @ordered
	 */
	protected boolean is_affiliated_personnaly_to_social_security = IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirth_month() <em>Birth month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_month()
	 * @generated
	 * @ordered
	 */
	protected static final int BIRTH_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBirth_month() <em>Birth month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_month()
	 * @generated
	 * @ordered
	 */
	protected int birth_month = BIRTH_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirth_day() <em>Birth day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_day()
	 * @generated
	 * @ordered
	 */
	protected static final int BIRTH_DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBirth_day() <em>Birth day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirth_day()
	 * @generated
	 * @ordered
	 */
	protected int birth_day = BIRTH_DAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpenses() <em>Expenses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpenses()
	 * @generated
	 * @ordered
	 */
	protected EList<Expense> expenses;

	/**
	 * The default value of the '{@link #isIs_widower() <em>Is widower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_widower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WIDOWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_widower() <em>Is widower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_widower()
	 * @generated
	 * @ordered
	 */
	protected boolean is_widower = IS_WIDOWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Physical_PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.PHYSICAL_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_assisting_spouse() {
		return is_assisting_spouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_assisting_spouse(boolean newIs_assisting_spouse) {
		boolean oldIs_assisting_spouse = is_assisting_spouse;
		is_assisting_spouse = newIs_assisting_spouse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__IS_ASSISTING_SPOUSE, oldIs_assisting_spouse, is_assisting_spouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSNo() {
		return ssNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSNo(String newSSNo) {
		String oldSSNo = ssNo;
		ssNo = newSSNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__SS_NO, oldSSNo, ssNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectWithInverseResolvingEList.ManyInverse<Address>(Address.class, this, TaxationPackage.PHYSICAL_PERSON__ADDRESSES, TaxationPackage.ADDRESS__TAX_PAYER);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBirth_year() {
		return birth_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirth_year(int newBirth_year) {
		int oldBirth_year = birth_year;
		birth_year = newBirth_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__BIRTH_YEAR, oldBirth_year, birth_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDisability_percentage() {
		return disability_percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisability_percentage(double newDisability_percentage) {
		double oldDisability_percentage = disability_percentage;
		disability_percentage = newDisability_percentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__DISABILITY_PERCENTAGE, oldDisability_percentage, disability_percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disability_Types getDisability_type() {
		return disability_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisability_type(Disability_Types newDisability_type) {
		Disability_Types oldDisability_type = disability_type;
		disability_type = newDisability_type == null ? DISABILITY_TYPE_EDEFAULT : newDisability_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__DISABILITY_TYPE, oldDisability_type, disability_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_affiliated_personnaly_to_social_security() {
		return is_affiliated_personnaly_to_social_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_affiliated_personnaly_to_social_security(boolean newIs_affiliated_personnaly_to_social_security) {
		boolean oldIs_affiliated_personnaly_to_social_security = is_affiliated_personnaly_to_social_security;
		is_affiliated_personnaly_to_social_security = newIs_affiliated_personnaly_to_social_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY, oldIs_affiliated_personnaly_to_social_security, is_affiliated_personnaly_to_social_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBirth_month() {
		return birth_month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirth_month(int newBirth_month) {
		int oldBirth_month = birth_month;
		birth_month = newBirth_month;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__BIRTH_MONTH, oldBirth_month, birth_month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBirth_day() {
		return birth_day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirth_day(int newBirth_day) {
		int oldBirth_day = birth_day;
		birth_day = newBirth_day;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__BIRTH_DAY, oldBirth_day, birth_day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expense> getExpenses() {
		if (expenses == null) {
			expenses = new EObjectWithInverseResolvingEList<Expense>(Expense.class, this, TaxationPackage.PHYSICAL_PERSON__EXPENSES, TaxationPackage.EXPENSE__BENEFICIARY);
		}
		return expenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_widower() {
		return is_widower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_widower(boolean newIs_widower) {
		boolean oldIs_widower = is_widower;
		is_widower = newIs_widower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.PHYSICAL_PERSON__IS_WIDOWER, oldIs_widower, is_widower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.PHYSICAL_PERSON__ADDRESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddresses()).basicAdd(otherEnd, msgs);
			case TaxationPackage.PHYSICAL_PERSON__EXPENSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpenses()).basicAdd(otherEnd, msgs);
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
			case TaxationPackage.PHYSICAL_PERSON__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case TaxationPackage.PHYSICAL_PERSON__EXPENSES:
				return ((InternalEList<?>)getExpenses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.PHYSICAL_PERSON__IS_ASSISTING_SPOUSE:
				return isIs_assisting_spouse();
			case TaxationPackage.PHYSICAL_PERSON__SS_NO:
				return getSSNo();
			case TaxationPackage.PHYSICAL_PERSON__ADDRESSES:
				return getAddresses();
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_YEAR:
				return getBirth_year();
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_PERCENTAGE:
				return getDisability_percentage();
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_TYPE:
				return getDisability_type();
			case TaxationPackage.PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY:
				return isIs_affiliated_personnaly_to_social_security();
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_MONTH:
				return getBirth_month();
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_DAY:
				return getBirth_day();
			case TaxationPackage.PHYSICAL_PERSON__EXPENSES:
				return getExpenses();
			case TaxationPackage.PHYSICAL_PERSON__IS_WIDOWER:
				return isIs_widower();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaxationPackage.PHYSICAL_PERSON__IS_ASSISTING_SPOUSE:
				setIs_assisting_spouse((Boolean)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__SS_NO:
				setSSNo((String)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_YEAR:
				setBirth_year((Integer)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_PERCENTAGE:
				setDisability_percentage((Double)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_TYPE:
				setDisability_type((Disability_Types)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY:
				setIs_affiliated_personnaly_to_social_security((Boolean)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_MONTH:
				setBirth_month((Integer)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_DAY:
				setBirth_day((Integer)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__EXPENSES:
				getExpenses().clear();
				getExpenses().addAll((Collection<? extends Expense>)newValue);
				return;
			case TaxationPackage.PHYSICAL_PERSON__IS_WIDOWER:
				setIs_widower((Boolean)newValue);
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
			case TaxationPackage.PHYSICAL_PERSON__IS_ASSISTING_SPOUSE:
				setIs_assisting_spouse(IS_ASSISTING_SPOUSE_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__SS_NO:
				setSSNo(SS_NO_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__ADDRESSES:
				getAddresses().clear();
				return;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_YEAR:
				setBirth_year(BIRTH_YEAR_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_PERCENTAGE:
				setDisability_percentage(DISABILITY_PERCENTAGE_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_TYPE:
				setDisability_type(DISABILITY_TYPE_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY:
				setIs_affiliated_personnaly_to_social_security(IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_MONTH:
				setBirth_month(BIRTH_MONTH_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_DAY:
				setBirth_day(BIRTH_DAY_EDEFAULT);
				return;
			case TaxationPackage.PHYSICAL_PERSON__EXPENSES:
				getExpenses().clear();
				return;
			case TaxationPackage.PHYSICAL_PERSON__IS_WIDOWER:
				setIs_widower(IS_WIDOWER_EDEFAULT);
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
			case TaxationPackage.PHYSICAL_PERSON__IS_ASSISTING_SPOUSE:
				return is_assisting_spouse != IS_ASSISTING_SPOUSE_EDEFAULT;
			case TaxationPackage.PHYSICAL_PERSON__SS_NO:
				return SS_NO_EDEFAULT == null ? ssNo != null : !SS_NO_EDEFAULT.equals(ssNo);
			case TaxationPackage.PHYSICAL_PERSON__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_YEAR:
				return birth_year != BIRTH_YEAR_EDEFAULT;
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_PERCENTAGE:
				return disability_percentage != DISABILITY_PERCENTAGE_EDEFAULT;
			case TaxationPackage.PHYSICAL_PERSON__DISABILITY_TYPE:
				return disability_type != DISABILITY_TYPE_EDEFAULT;
			case TaxationPackage.PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY:
				return is_affiliated_personnaly_to_social_security != IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY_EDEFAULT;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_MONTH:
				return birth_month != BIRTH_MONTH_EDEFAULT;
			case TaxationPackage.PHYSICAL_PERSON__BIRTH_DAY:
				return birth_day != BIRTH_DAY_EDEFAULT;
			case TaxationPackage.PHYSICAL_PERSON__EXPENSES:
				return expenses != null && !expenses.isEmpty();
			case TaxationPackage.PHYSICAL_PERSON__IS_WIDOWER:
				return is_widower != IS_WIDOWER_EDEFAULT;
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
		result.append(" (is_assisting_spouse: ");
		result.append(is_assisting_spouse);
		result.append(", SSNo: ");
		result.append(ssNo);
		result.append(", birth_year: ");
		result.append(birth_year);
		result.append(", disability_percentage: ");
		result.append(disability_percentage);
		result.append(", disability_type: ");
		result.append(disability_type);
		result.append(", is_affiliated_personnaly_to_social_security: ");
		result.append(is_affiliated_personnaly_to_social_security);
		result.append(", birth_month: ");
		result.append(birth_month);
		result.append(", birth_day: ");
		result.append(birth_day);
		result.append(", is_widower: ");
		result.append(is_widower);
		result.append(')');
		return result.toString();
	}

} //Physical_PersonImpl
