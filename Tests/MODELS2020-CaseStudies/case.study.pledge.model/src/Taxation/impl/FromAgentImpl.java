/**
 */
package Taxation.impl;

import Taxation.Dependent;
import Taxation.Expense;
import Taxation.FromAgent;
import Taxation.Tax_Payer;
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
 * An implementation of the model object '<em><b>From Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.FromAgentImpl#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link Taxation.impl.FromAgentImpl#isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care <em>Is dependent eligible for CE Not In Houshold Children Care</em>}</li>
 *   <li>{@link Taxation.impl.FromAgentImpl#getExpense <em>Expense</em>}</li>
 *   <li>{@link Taxation.impl.FromAgentImpl#isIs_eligible_debt <em>Is eligible debt</em>}</li>
 *   <li>{@link Taxation.impl.FromAgentImpl#getDependent <em>Dependent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FromAgentImpl extends MinimalEObjectImpl.Container implements FromAgent {
	/**
	 * The default value of the '{@link #isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care() <em>Is dependent eligible for CE Not In Houshold Children Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care() <em>Is dependent eligible for CE Not In Houshold Children Care</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care()
	 * @generated
	 * @ordered
	 */
	protected boolean is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care = IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpense() <em>Expense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpense()
	 * @generated
	 * @ordered
	 */
	protected Expense expense;

	/**
	 * The default value of the '{@link #isIs_eligible_debt() <em>Is eligible debt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_eligible_debt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ELIGIBLE_DEBT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_eligible_debt() <em>Is eligible debt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_eligible_debt()
	 * @generated
	 * @ordered
	 */
	protected boolean is_eligible_debt = IS_ELIGIBLE_DEBT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected Dependent dependent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.FROM_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Payer getTaxPayer() {
		if (eContainerFeatureID() != TaxationPackage.FROM_AGENT__TAX_PAYER) return null;
		return (Tax_Payer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxPayer(Tax_Payer newTaxPayer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaxPayer, TaxationPackage.FROM_AGENT__TAX_PAYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPayer(Tax_Payer newTaxPayer) {
		if (newTaxPayer != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.FROM_AGENT__TAX_PAYER && newTaxPayer != null)) {
			if (EcoreUtil.isAncestor(this, newTaxPayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaxPayer != null)
				msgs = ((InternalEObject)newTaxPayer).eInverseAdd(this, TaxationPackage.TAX_PAYER__FROM_AGENT, Tax_Payer.class, msgs);
			msgs = basicSetTaxPayer(newTaxPayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.FROM_AGENT__TAX_PAYER, newTaxPayer, newTaxPayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care() {
		return is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care(boolean newIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care) {
		boolean oldIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care = is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care;
		is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care = newIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE, oldIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care, is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expense getExpense() {
		if (expense != null && expense.eIsProxy()) {
			InternalEObject oldExpense = (InternalEObject)expense;
			expense = (Expense)eResolveProxy(oldExpense);
			if (expense != oldExpense) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.FROM_AGENT__EXPENSE, oldExpense, expense));
			}
		}
		return expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expense basicGetExpense() {
		return expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpense(Expense newExpense, NotificationChain msgs) {
		Expense oldExpense = expense;
		expense = newExpense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.FROM_AGENT__EXPENSE, oldExpense, newExpense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpense(Expense newExpense) {
		if (newExpense != expense) {
			NotificationChain msgs = null;
			if (expense != null)
				msgs = ((InternalEObject)expense).eInverseRemove(this, TaxationPackage.EXPENSE__FROM_AGENT, Expense.class, msgs);
			if (newExpense != null)
				msgs = ((InternalEObject)newExpense).eInverseAdd(this, TaxationPackage.EXPENSE__FROM_AGENT, Expense.class, msgs);
			msgs = basicSetExpense(newExpense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.FROM_AGENT__EXPENSE, newExpense, newExpense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_eligible_debt() {
		return is_eligible_debt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_eligible_debt(boolean newIs_eligible_debt) {
		boolean oldIs_eligible_debt = is_eligible_debt;
		is_eligible_debt = newIs_eligible_debt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.FROM_AGENT__IS_ELIGIBLE_DEBT, oldIs_eligible_debt, is_eligible_debt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependent getDependent() {
		if (dependent != null && dependent.eIsProxy()) {
			InternalEObject oldDependent = (InternalEObject)dependent;
			dependent = (Dependent)eResolveProxy(oldDependent);
			if (dependent != oldDependent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.FROM_AGENT__DEPENDENT, oldDependent, dependent));
			}
		}
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependent basicGetDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependent(Dependent newDependent, NotificationChain msgs) {
		Dependent oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.FROM_AGENT__DEPENDENT, oldDependent, newDependent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependent(Dependent newDependent) {
		if (newDependent != dependent) {
			NotificationChain msgs = null;
			if (dependent != null)
				msgs = ((InternalEObject)dependent).eInverseRemove(this, TaxationPackage.DEPENDENT__FROM_AGENT, Dependent.class, msgs);
			if (newDependent != null)
				msgs = ((InternalEObject)newDependent).eInverseAdd(this, TaxationPackage.DEPENDENT__FROM_AGENT, Dependent.class, msgs);
			msgs = basicSetDependent(newDependent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.FROM_AGENT__DEPENDENT, newDependent, newDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.FROM_AGENT__TAX_PAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaxPayer((Tax_Payer)otherEnd, msgs);
			case TaxationPackage.FROM_AGENT__EXPENSE:
				if (expense != null)
					msgs = ((InternalEObject)expense).eInverseRemove(this, TaxationPackage.EXPENSE__FROM_AGENT, Expense.class, msgs);
				return basicSetExpense((Expense)otherEnd, msgs);
			case TaxationPackage.FROM_AGENT__DEPENDENT:
				if (dependent != null)
					msgs = ((InternalEObject)dependent).eInverseRemove(this, TaxationPackage.DEPENDENT__FROM_AGENT, Dependent.class, msgs);
				return basicSetDependent((Dependent)otherEnd, msgs);
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
			case TaxationPackage.FROM_AGENT__TAX_PAYER:
				return basicSetTaxPayer(null, msgs);
			case TaxationPackage.FROM_AGENT__EXPENSE:
				return basicSetExpense(null, msgs);
			case TaxationPackage.FROM_AGENT__DEPENDENT:
				return basicSetDependent(null, msgs);
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
			case TaxationPackage.FROM_AGENT__TAX_PAYER:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.TAX_PAYER__FROM_AGENT, Tax_Payer.class, msgs);
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
			case TaxationPackage.FROM_AGENT__TAX_PAYER:
				return getTaxPayer();
			case TaxationPackage.FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE:
				return isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care();
			case TaxationPackage.FROM_AGENT__EXPENSE:
				if (resolve) return getExpense();
				return basicGetExpense();
			case TaxationPackage.FROM_AGENT__IS_ELIGIBLE_DEBT:
				return isIs_eligible_debt();
			case TaxationPackage.FROM_AGENT__DEPENDENT:
				if (resolve) return getDependent();
				return basicGetDependent();
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
			case TaxationPackage.FROM_AGENT__TAX_PAYER:
				setTaxPayer((Tax_Payer)newValue);
				return;
			case TaxationPackage.FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE:
				setIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care((Boolean)newValue);
				return;
			case TaxationPackage.FROM_AGENT__EXPENSE:
				setExpense((Expense)newValue);
				return;
			case TaxationPackage.FROM_AGENT__IS_ELIGIBLE_DEBT:
				setIs_eligible_debt((Boolean)newValue);
				return;
			case TaxationPackage.FROM_AGENT__DEPENDENT:
				setDependent((Dependent)newValue);
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
			case TaxationPackage.FROM_AGENT__TAX_PAYER:
				setTaxPayer((Tax_Payer)null);
				return;
			case TaxationPackage.FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE:
				setIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care(IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE_EDEFAULT);
				return;
			case TaxationPackage.FROM_AGENT__EXPENSE:
				setExpense((Expense)null);
				return;
			case TaxationPackage.FROM_AGENT__IS_ELIGIBLE_DEBT:
				setIs_eligible_debt(IS_ELIGIBLE_DEBT_EDEFAULT);
				return;
			case TaxationPackage.FROM_AGENT__DEPENDENT:
				setDependent((Dependent)null);
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
			case TaxationPackage.FROM_AGENT__TAX_PAYER:
				return getTaxPayer() != null;
			case TaxationPackage.FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE:
				return is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care != IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE_EDEFAULT;
			case TaxationPackage.FROM_AGENT__EXPENSE:
				return expense != null;
			case TaxationPackage.FROM_AGENT__IS_ELIGIBLE_DEBT:
				return is_eligible_debt != IS_ELIGIBLE_DEBT_EDEFAULT;
			case TaxationPackage.FROM_AGENT__DEPENDENT:
				return dependent != null;
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
		result.append(" (is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care: ");
		result.append(is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care);
		result.append(", is_eligible_debt: ");
		result.append(is_eligible_debt);
		result.append(')');
		return result.toString();
	}

} //FromAgentImpl
