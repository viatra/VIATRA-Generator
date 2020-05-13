/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Dependent;
import TaxationWithRoot.Dependent_Type;
import TaxationWithRoot.Expense;
import TaxationWithRoot.External_Allowance;
import TaxationWithRoot.FromAgent;
import TaxationWithRoot.Household;
import TaxationWithRoot.Tax_Payer;
import TaxationWithRoot.TaxationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.DependentImpl#getDependent_type <em>Dependent type</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.DependentImpl#getResponsible_person <em>Responsible person</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.DependentImpl#isContinued_studies <em>Continued studies</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.DependentImpl#getAllowances <em>Allowances</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.DependentImpl#getHousehold <em>Household</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.DependentImpl#getFrom_agent <em>From agent</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.DependentImpl#getExpense <em>Expense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependentImpl extends Physical_PersonImpl implements Dependent {
	/**
	 * The default value of the '{@link #getDependent_type() <em>Dependent type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent_type()
	 * @generated
	 * @ordered
	 */
	protected static final Dependent_Type DEPENDENT_TYPE_EDEFAULT = Dependent_Type.CHILD;

	/**
	 * The cached value of the '{@link #getDependent_type() <em>Dependent type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent_type()
	 * @generated
	 * @ordered
	 */
	protected Dependent_Type dependent_type = DEPENDENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isContinued_studies() <em>Continued studies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinued_studies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUED_STUDIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinued_studies() <em>Continued studies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinued_studies()
	 * @generated
	 * @ordered
	 */
	protected boolean continued_studies = CONTINUED_STUDIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowances() <em>Allowances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowances()
	 * @generated
	 * @ordered
	 */
	protected External_Allowance allowances;

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
	 * The cached value of the '{@link #getExpense() <em>Expense</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpense()
	 * @generated
	 * @ordered
	 */
	protected EList<Expense> expense;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.DEPENDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependent_Type getDependent_type() {
		return dependent_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependent_type(Dependent_Type newDependent_type) {
		Dependent_Type oldDependent_type = dependent_type;
		dependent_type = newDependent_type == null ? DEPENDENT_TYPE_EDEFAULT : newDependent_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__DEPENDENT_TYPE, oldDependent_type, dependent_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Payer getResponsible_person() {
		if (eContainerFeatureID() != TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON) return null;
		return (Tax_Payer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible_person(Tax_Payer newResponsible_person, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResponsible_person, TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsible_person(Tax_Payer newResponsible_person) {
		if (newResponsible_person != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON && newResponsible_person != null)) {
			if (EcoreUtil.isAncestor(this, newResponsible_person))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResponsible_person != null)
				msgs = ((InternalEObject)newResponsible_person).eInverseAdd(this, TaxationPackage.TAX_PAYER__DEPENDENTS, Tax_Payer.class, msgs);
			msgs = basicSetResponsible_person(newResponsible_person, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON, newResponsible_person, newResponsible_person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContinued_studies() {
		return continued_studies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinued_studies(boolean newContinued_studies) {
		boolean oldContinued_studies = continued_studies;
		continued_studies = newContinued_studies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__CONTINUED_STUDIES, oldContinued_studies, continued_studies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public External_Allowance getAllowances() {
		return allowances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowances(External_Allowance newAllowances, NotificationChain msgs) {
		External_Allowance oldAllowances = allowances;
		allowances = newAllowances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__ALLOWANCES, oldAllowances, newAllowances);
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
	public void setAllowances(External_Allowance newAllowances) {
		if (newAllowances != allowances) {
			NotificationChain msgs = null;
			if (allowances != null)
				msgs = ((InternalEObject)allowances).eInverseRemove(this, TaxationPackage.EXTERNAL_ALLOWANCE__PERSON, External_Allowance.class, msgs);
			if (newAllowances != null)
				msgs = ((InternalEObject)newAllowances).eInverseAdd(this, TaxationPackage.EXTERNAL_ALLOWANCE__PERSON, External_Allowance.class, msgs);
			msgs = basicSetAllowances(newAllowances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__ALLOWANCES, newAllowances, newAllowances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Household getHousehold() {
		if (eContainerFeatureID() != TaxationPackage.DEPENDENT__HOUSEHOLD) return null;
		return (Household)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHousehold(Household newHousehold, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHousehold, TaxationPackage.DEPENDENT__HOUSEHOLD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHousehold(Household newHousehold) {
		if (newHousehold != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.DEPENDENT__HOUSEHOLD && newHousehold != null)) {
			if (EcoreUtil.isAncestor(this, newHousehold))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHousehold != null)
				msgs = ((InternalEObject)newHousehold).eInverseAdd(this, TaxationPackage.HOUSEHOLD__CHILDREN, Household.class, msgs);
			msgs = basicSetHousehold(newHousehold, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__HOUSEHOLD, newHousehold, newHousehold));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.DEPENDENT__FROM_AGENT, oldFrom_agent, from_agent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__FROM_AGENT, oldFrom_agent, newFrom_agent);
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
				msgs = ((InternalEObject)from_agent).eInverseRemove(this, TaxationPackage.FROM_AGENT__DEPENDENT, FromAgent.class, msgs);
			if (newFrom_agent != null)
				msgs = ((InternalEObject)newFrom_agent).eInverseAdd(this, TaxationPackage.FROM_AGENT__DEPENDENT, FromAgent.class, msgs);
			msgs = basicSetFrom_agent(newFrom_agent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.DEPENDENT__FROM_AGENT, newFrom_agent, newFrom_agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expense> getExpense() {
		if (expense == null) {
			expense = new EObjectWithInverseResolvingEList<Expense>(Expense.class, this, TaxationPackage.DEPENDENT__EXPENSE, TaxationPackage.EXPENSE__DEPENDENT);
		}
		return expense;
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
			case TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResponsible_person((Tax_Payer)otherEnd, msgs);
			case TaxationPackage.DEPENDENT__ALLOWANCES:
				if (allowances != null)
					msgs = ((InternalEObject)allowances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxationPackage.DEPENDENT__ALLOWANCES, null, msgs);
				return basicSetAllowances((External_Allowance)otherEnd, msgs);
			case TaxationPackage.DEPENDENT__HOUSEHOLD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHousehold((Household)otherEnd, msgs);
			case TaxationPackage.DEPENDENT__FROM_AGENT:
				if (from_agent != null)
					msgs = ((InternalEObject)from_agent).eInverseRemove(this, TaxationPackage.FROM_AGENT__DEPENDENT, FromAgent.class, msgs);
				return basicSetFrom_agent((FromAgent)otherEnd, msgs);
			case TaxationPackage.DEPENDENT__EXPENSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpense()).basicAdd(otherEnd, msgs);
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
			case TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON:
				return basicSetResponsible_person(null, msgs);
			case TaxationPackage.DEPENDENT__ALLOWANCES:
				return basicSetAllowances(null, msgs);
			case TaxationPackage.DEPENDENT__HOUSEHOLD:
				return basicSetHousehold(null, msgs);
			case TaxationPackage.DEPENDENT__FROM_AGENT:
				return basicSetFrom_agent(null, msgs);
			case TaxationPackage.DEPENDENT__EXPENSE:
				return ((InternalEList<?>)getExpense()).basicRemove(otherEnd, msgs);
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
			case TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.TAX_PAYER__DEPENDENTS, Tax_Payer.class, msgs);
			case TaxationPackage.DEPENDENT__HOUSEHOLD:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.HOUSEHOLD__CHILDREN, Household.class, msgs);
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
			case TaxationPackage.DEPENDENT__DEPENDENT_TYPE:
				return getDependent_type();
			case TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON:
				return getResponsible_person();
			case TaxationPackage.DEPENDENT__CONTINUED_STUDIES:
				return isContinued_studies();
			case TaxationPackage.DEPENDENT__ALLOWANCES:
				return getAllowances();
			case TaxationPackage.DEPENDENT__HOUSEHOLD:
				return getHousehold();
			case TaxationPackage.DEPENDENT__FROM_AGENT:
				if (resolve) return getFrom_agent();
				return basicGetFrom_agent();
			case TaxationPackage.DEPENDENT__EXPENSE:
				return getExpense();
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
			case TaxationPackage.DEPENDENT__DEPENDENT_TYPE:
				setDependent_type((Dependent_Type)newValue);
				return;
			case TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON:
				setResponsible_person((Tax_Payer)newValue);
				return;
			case TaxationPackage.DEPENDENT__CONTINUED_STUDIES:
				setContinued_studies((Boolean)newValue);
				return;
			case TaxationPackage.DEPENDENT__ALLOWANCES:
				setAllowances((External_Allowance)newValue);
				return;
			case TaxationPackage.DEPENDENT__HOUSEHOLD:
				setHousehold((Household)newValue);
				return;
			case TaxationPackage.DEPENDENT__FROM_AGENT:
				setFrom_agent((FromAgent)newValue);
				return;
			case TaxationPackage.DEPENDENT__EXPENSE:
				getExpense().clear();
				getExpense().addAll((Collection<? extends Expense>)newValue);
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
			case TaxationPackage.DEPENDENT__DEPENDENT_TYPE:
				setDependent_type(DEPENDENT_TYPE_EDEFAULT);
				return;
			case TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON:
				setResponsible_person((Tax_Payer)null);
				return;
			case TaxationPackage.DEPENDENT__CONTINUED_STUDIES:
				setContinued_studies(CONTINUED_STUDIES_EDEFAULT);
				return;
			case TaxationPackage.DEPENDENT__ALLOWANCES:
				setAllowances((External_Allowance)null);
				return;
			case TaxationPackage.DEPENDENT__HOUSEHOLD:
				setHousehold((Household)null);
				return;
			case TaxationPackage.DEPENDENT__FROM_AGENT:
				setFrom_agent((FromAgent)null);
				return;
			case TaxationPackage.DEPENDENT__EXPENSE:
				getExpense().clear();
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
			case TaxationPackage.DEPENDENT__DEPENDENT_TYPE:
				return dependent_type != DEPENDENT_TYPE_EDEFAULT;
			case TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON:
				return getResponsible_person() != null;
			case TaxationPackage.DEPENDENT__CONTINUED_STUDIES:
				return continued_studies != CONTINUED_STUDIES_EDEFAULT;
			case TaxationPackage.DEPENDENT__ALLOWANCES:
				return allowances != null;
			case TaxationPackage.DEPENDENT__HOUSEHOLD:
				return getHousehold() != null;
			case TaxationPackage.DEPENDENT__FROM_AGENT:
				return from_agent != null;
			case TaxationPackage.DEPENDENT__EXPENSE:
				return expense != null && !expense.isEmpty();
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
		result.append(" (dependent_type: ");
		result.append(dependent_type);
		result.append(", continued_studies: ");
		result.append(continued_studies);
		result.append(')');
		return result.toString();
	}

} //DependentImpl
