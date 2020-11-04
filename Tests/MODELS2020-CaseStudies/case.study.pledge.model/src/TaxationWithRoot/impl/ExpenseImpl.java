/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Dependent;
import TaxationWithRoot.Expense;
import TaxationWithRoot.Expense_Purpose;
import TaxationWithRoot.FromAgent;
import TaxationWithRoot.Income;
import TaxationWithRoot.Physical_Person;
import TaxationWithRoot.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.ExpenseImpl#getDeclared_amount <em>Declared amount</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.ExpenseImpl#getExpense_purpose <em>Expense purpose</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.ExpenseImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.ExpenseImpl#getFrom_agent <em>From agent</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.ExpenseImpl#getIncome <em>Income</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.ExpenseImpl#getId4 <em>Id4</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.ExpenseImpl#getBeneficiary <em>Beneficiary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpenseImpl extends MinimalEObjectImpl.Container implements Expense {
	/**
	 * The default value of the '{@link #getDeclared_amount() <em>Declared amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclared_amount()
	 * @generated
	 * @ordered
	 */
	protected static final double DECLARED_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeclared_amount() <em>Declared amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclared_amount()
	 * @generated
	 * @ordered
	 */
	protected double declared_amount = DECLARED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpense_purpose() <em>Expense purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpense_purpose()
	 * @generated
	 * @ordered
	 */
	protected static final Expense_Purpose EXPENSE_PURPOSE_EDEFAULT = Expense_Purpose.OTHER;

	/**
	 * The cached value of the '{@link #getExpense_purpose() <em>Expense purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpense_purpose()
	 * @generated
	 * @ordered
	 */
	protected Expense_Purpose expense_purpose = EXPENSE_PURPOSE_EDEFAULT;

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
	 * The cached value of the '{@link #getFrom_agent() <em>From agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_agent()
	 * @generated
	 * @ordered
	 */
	protected FromAgent from_agent;

	/**
	 * The default value of the '{@link #getId4() <em>Id4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId4()
	 * @generated
	 * @ordered
	 */
	protected static final String ID4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId4() <em>Id4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId4()
	 * @generated
	 * @ordered
	 */
	protected String id4 = ID4_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBeneficiary() <em>Beneficiary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeneficiary()
	 * @generated
	 * @ordered
	 */
	protected Physical_Person beneficiary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.EXPENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeclared_amount() {
		return declared_amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclared_amount(double newDeclared_amount) {
		double oldDeclared_amount = declared_amount;
		declared_amount = newDeclared_amount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__DECLARED_AMOUNT, oldDeclared_amount, declared_amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expense_Purpose getExpense_purpose() {
		return expense_purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpense_purpose(Expense_Purpose newExpense_purpose) {
		Expense_Purpose oldExpense_purpose = expense_purpose;
		expense_purpose = newExpense_purpose == null ? EXPENSE_PURPOSE_EDEFAULT : newExpense_purpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__EXPENSE_PURPOSE, oldExpense_purpose, expense_purpose));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.EXPENSE__DEPENDENT, oldDependent, dependent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__DEPENDENT, oldDependent, newDependent);
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
				msgs = ((InternalEObject)dependent).eInverseRemove(this, TaxationPackage.DEPENDENT__EXPENSE, Dependent.class, msgs);
			if (newDependent != null)
				msgs = ((InternalEObject)newDependent).eInverseAdd(this, TaxationPackage.DEPENDENT__EXPENSE, Dependent.class, msgs);
			msgs = basicSetDependent(newDependent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__DEPENDENT, newDependent, newDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromAgent getFrom_agent() {
		if (from_agent != null && from_agent.eIsProxy()) {
			InternalEObject oldFrom_agent = (InternalEObject)from_agent;
			from_agent = (FromAgent)eResolveProxy(oldFrom_agent);
			if (from_agent != oldFrom_agent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.EXPENSE__FROM_AGENT, oldFrom_agent, from_agent));
			}
		}
		return from_agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromAgent basicGetFrom_agent() {
		return from_agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom_agent(FromAgent newFrom_agent, NotificationChain msgs) {
		FromAgent oldFrom_agent = from_agent;
		from_agent = newFrom_agent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__FROM_AGENT, oldFrom_agent, newFrom_agent);
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
	public void setFrom_agent(FromAgent newFrom_agent) {
		if (newFrom_agent != from_agent) {
			NotificationChain msgs = null;
			if (from_agent != null)
				msgs = ((InternalEObject)from_agent).eInverseRemove(this, TaxationPackage.FROM_AGENT__EXPENSE, FromAgent.class, msgs);
			if (newFrom_agent != null)
				msgs = ((InternalEObject)newFrom_agent).eInverseAdd(this, TaxationPackage.FROM_AGENT__EXPENSE, FromAgent.class, msgs);
			msgs = basicSetFrom_agent(newFrom_agent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__FROM_AGENT, newFrom_agent, newFrom_agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income getIncome() {
		if (eContainerFeatureID() != TaxationPackage.EXPENSE__INCOME) return null;
		return (Income)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncome(Income newIncome, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIncome, TaxationPackage.EXPENSE__INCOME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncome(Income newIncome) {
		if (newIncome != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.EXPENSE__INCOME && newIncome != null)) {
			if (EcoreUtil.isAncestor(this, newIncome))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncome != null)
				msgs = ((InternalEObject)newIncome).eInverseAdd(this, TaxationPackage.INCOME__EXPENSES, Income.class, msgs);
			msgs = basicSetIncome(newIncome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__INCOME, newIncome, newIncome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId4() {
		return id4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId4(String newId4) {
		String oldId4 = id4;
		id4 = newId4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__ID4, oldId4, id4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Physical_Person getBeneficiary() {
		if (beneficiary != null && beneficiary.eIsProxy()) {
			InternalEObject oldBeneficiary = (InternalEObject)beneficiary;
			beneficiary = (Physical_Person)eResolveProxy(oldBeneficiary);
			if (beneficiary != oldBeneficiary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.EXPENSE__BENEFICIARY, oldBeneficiary, beneficiary));
			}
		}
		return beneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physical_Person basicGetBeneficiary() {
		return beneficiary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeneficiary(Physical_Person newBeneficiary, NotificationChain msgs) {
		Physical_Person oldBeneficiary = beneficiary;
		beneficiary = newBeneficiary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__BENEFICIARY, oldBeneficiary, newBeneficiary);
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
	public void setBeneficiary(Physical_Person newBeneficiary) {
		if (newBeneficiary != beneficiary) {
			NotificationChain msgs = null;
			if (beneficiary != null)
				msgs = ((InternalEObject)beneficiary).eInverseRemove(this, TaxationPackage.PHYSICAL_PERSON__EXPENSES, Physical_Person.class, msgs);
			if (newBeneficiary != null)
				msgs = ((InternalEObject)newBeneficiary).eInverseAdd(this, TaxationPackage.PHYSICAL_PERSON__EXPENSES, Physical_Person.class, msgs);
			msgs = basicSetBeneficiary(newBeneficiary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.EXPENSE__BENEFICIARY, newBeneficiary, newBeneficiary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.EXPENSE__DEPENDENT:
				if (dependent != null)
					msgs = ((InternalEObject)dependent).eInverseRemove(this, TaxationPackage.DEPENDENT__EXPENSE, Dependent.class, msgs);
				return basicSetDependent((Dependent)otherEnd, msgs);
			case TaxationPackage.EXPENSE__FROM_AGENT:
				if (from_agent != null)
					msgs = ((InternalEObject)from_agent).eInverseRemove(this, TaxationPackage.FROM_AGENT__EXPENSE, FromAgent.class, msgs);
				return basicSetFrom_agent((FromAgent)otherEnd, msgs);
			case TaxationPackage.EXPENSE__INCOME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIncome((Income)otherEnd, msgs);
			case TaxationPackage.EXPENSE__BENEFICIARY:
				if (beneficiary != null)
					msgs = ((InternalEObject)beneficiary).eInverseRemove(this, TaxationPackage.PHYSICAL_PERSON__EXPENSES, Physical_Person.class, msgs);
				return basicSetBeneficiary((Physical_Person)otherEnd, msgs);
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
			case TaxationPackage.EXPENSE__DEPENDENT:
				return basicSetDependent(null, msgs);
			case TaxationPackage.EXPENSE__FROM_AGENT:
				return basicSetFrom_agent(null, msgs);
			case TaxationPackage.EXPENSE__INCOME:
				return basicSetIncome(null, msgs);
			case TaxationPackage.EXPENSE__BENEFICIARY:
				return basicSetBeneficiary(null, msgs);
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
			case TaxationPackage.EXPENSE__INCOME:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.INCOME__EXPENSES, Income.class, msgs);
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
			case TaxationPackage.EXPENSE__DECLARED_AMOUNT:
				return getDeclared_amount();
			case TaxationPackage.EXPENSE__EXPENSE_PURPOSE:
				return getExpense_purpose();
			case TaxationPackage.EXPENSE__DEPENDENT:
				if (resolve) return getDependent();
				return basicGetDependent();
			case TaxationPackage.EXPENSE__FROM_AGENT:
				if (resolve) return getFrom_agent();
				return basicGetFrom_agent();
			case TaxationPackage.EXPENSE__INCOME:
				return getIncome();
			case TaxationPackage.EXPENSE__ID4:
				return getId4();
			case TaxationPackage.EXPENSE__BENEFICIARY:
				if (resolve) return getBeneficiary();
				return basicGetBeneficiary();
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
			case TaxationPackage.EXPENSE__DECLARED_AMOUNT:
				setDeclared_amount((Double)newValue);
				return;
			case TaxationPackage.EXPENSE__EXPENSE_PURPOSE:
				setExpense_purpose((Expense_Purpose)newValue);
				return;
			case TaxationPackage.EXPENSE__DEPENDENT:
				setDependent((Dependent)newValue);
				return;
			case TaxationPackage.EXPENSE__FROM_AGENT:
				setFrom_agent((FromAgent)newValue);
				return;
			case TaxationPackage.EXPENSE__INCOME:
				setIncome((Income)newValue);
				return;
			case TaxationPackage.EXPENSE__ID4:
				setId4((String)newValue);
				return;
			case TaxationPackage.EXPENSE__BENEFICIARY:
				setBeneficiary((Physical_Person)newValue);
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
			case TaxationPackage.EXPENSE__DECLARED_AMOUNT:
				setDeclared_amount(DECLARED_AMOUNT_EDEFAULT);
				return;
			case TaxationPackage.EXPENSE__EXPENSE_PURPOSE:
				setExpense_purpose(EXPENSE_PURPOSE_EDEFAULT);
				return;
			case TaxationPackage.EXPENSE__DEPENDENT:
				setDependent((Dependent)null);
				return;
			case TaxationPackage.EXPENSE__FROM_AGENT:
				setFrom_agent((FromAgent)null);
				return;
			case TaxationPackage.EXPENSE__INCOME:
				setIncome((Income)null);
				return;
			case TaxationPackage.EXPENSE__ID4:
				setId4(ID4_EDEFAULT);
				return;
			case TaxationPackage.EXPENSE__BENEFICIARY:
				setBeneficiary((Physical_Person)null);
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
			case TaxationPackage.EXPENSE__DECLARED_AMOUNT:
				return declared_amount != DECLARED_AMOUNT_EDEFAULT;
			case TaxationPackage.EXPENSE__EXPENSE_PURPOSE:
				return expense_purpose != EXPENSE_PURPOSE_EDEFAULT;
			case TaxationPackage.EXPENSE__DEPENDENT:
				return dependent != null;
			case TaxationPackage.EXPENSE__FROM_AGENT:
				return from_agent != null;
			case TaxationPackage.EXPENSE__INCOME:
				return getIncome() != null;
			case TaxationPackage.EXPENSE__ID4:
				return ID4_EDEFAULT == null ? id4 != null : !ID4_EDEFAULT.equals(id4);
			case TaxationPackage.EXPENSE__BENEFICIARY:
				return beneficiary != null;
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
		result.append(" (declared_amount: ");
		result.append(declared_amount);
		result.append(", expense_purpose: ");
		result.append(expense_purpose);
		result.append(", id4: ");
		result.append(id4);
		result.append(')');
		return result.toString();
	}

} //ExpenseImpl
