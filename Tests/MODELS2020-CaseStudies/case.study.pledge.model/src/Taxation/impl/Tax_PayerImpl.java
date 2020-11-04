/**
 */
package Taxation.impl;

import Taxation.Dependent;
import Taxation.FromAgent;
import Taxation.FromLaw;
import Taxation.Income;
import Taxation.Tax_Payer;
import Taxation.TaxationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Payer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Tax_PayerImpl#getDependents <em>Dependents</em>}</li>
 *   <li>{@link Taxation.impl.Tax_PayerImpl#getFrom_agent <em>From agent</em>}</li>
 *   <li>{@link Taxation.impl.Tax_PayerImpl#getIncomes <em>Incomes</em>}</li>
 *   <li>{@link Taxation.impl.Tax_PayerImpl#getFrom_law <em>From law</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Tax_PayerImpl extends Physical_PersonImpl implements Tax_Payer {
	/**
	 * The cached value of the '{@link #getDependents() <em>Dependents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependent> dependents;

	/**
	 * The cached value of the '{@link #getFrom_agent() <em>From agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_agent()
	 * @generated
	 * @ordered
	 */
	protected FromAgent from_agent;

	/**
	 * The cached value of the '{@link #getIncomes() <em>Incomes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomes()
	 * @generated
	 * @ordered
	 */
	protected EList<Income> incomes;

	/**
	 * The cached value of the '{@link #getFrom_law() <em>From law</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_law()
	 * @generated
	 * @ordered
	 */
	protected FromLaw from_law;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tax_PayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.TAX_PAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dependent> getDependents() {
		if (dependents == null) {
			dependents = new EObjectContainmentWithInverseEList<Dependent>(Dependent.class, this, TaxationPackage.TAX_PAYER__DEPENDENTS, TaxationPackage.DEPENDENT__RESPONSIBLE_PERSON);
		}
		return dependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromAgent getFrom_agent() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_PAYER__FROM_AGENT, oldFrom_agent, newFrom_agent);
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
				msgs = ((InternalEObject)from_agent).eInverseRemove(this, TaxationPackage.FROM_AGENT__TAX_PAYER, FromAgent.class, msgs);
			if (newFrom_agent != null)
				msgs = ((InternalEObject)newFrom_agent).eInverseAdd(this, TaxationPackage.FROM_AGENT__TAX_PAYER, FromAgent.class, msgs);
			msgs = basicSetFrom_agent(newFrom_agent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_PAYER__FROM_AGENT, newFrom_agent, newFrom_agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Income> getIncomes() {
		if (incomes == null) {
			incomes = new EObjectContainmentWithInverseEList<Income>(Income.class, this, TaxationPackage.TAX_PAYER__INCOMES, TaxationPackage.INCOME__TAX_PAYER);
		}
		return incomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromLaw getFrom_law() {
		return from_law;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom_law(FromLaw newFrom_law, NotificationChain msgs) {
		FromLaw oldFrom_law = from_law;
		from_law = newFrom_law;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_PAYER__FROM_LAW, oldFrom_law, newFrom_law);
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
	public void setFrom_law(FromLaw newFrom_law) {
		if (newFrom_law != from_law) {
			NotificationChain msgs = null;
			if (from_law != null)
				msgs = ((InternalEObject)from_law).eInverseRemove(this, TaxationPackage.FROM_LAW__TAX_PAYER, FromLaw.class, msgs);
			if (newFrom_law != null)
				msgs = ((InternalEObject)newFrom_law).eInverseAdd(this, TaxationPackage.FROM_LAW__TAX_PAYER, FromLaw.class, msgs);
			msgs = basicSetFrom_law(newFrom_law, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_PAYER__FROM_LAW, newFrom_law, newFrom_law));
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
			case TaxationPackage.TAX_PAYER__DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependents()).basicAdd(otherEnd, msgs);
			case TaxationPackage.TAX_PAYER__FROM_AGENT:
				if (from_agent != null)
					msgs = ((InternalEObject)from_agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxationPackage.TAX_PAYER__FROM_AGENT, null, msgs);
				return basicSetFrom_agent((FromAgent)otherEnd, msgs);
			case TaxationPackage.TAX_PAYER__INCOMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomes()).basicAdd(otherEnd, msgs);
			case TaxationPackage.TAX_PAYER__FROM_LAW:
				if (from_law != null)
					msgs = ((InternalEObject)from_law).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxationPackage.TAX_PAYER__FROM_LAW, null, msgs);
				return basicSetFrom_law((FromLaw)otherEnd, msgs);
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
			case TaxationPackage.TAX_PAYER__DEPENDENTS:
				return ((InternalEList<?>)getDependents()).basicRemove(otherEnd, msgs);
			case TaxationPackage.TAX_PAYER__FROM_AGENT:
				return basicSetFrom_agent(null, msgs);
			case TaxationPackage.TAX_PAYER__INCOMES:
				return ((InternalEList<?>)getIncomes()).basicRemove(otherEnd, msgs);
			case TaxationPackage.TAX_PAYER__FROM_LAW:
				return basicSetFrom_law(null, msgs);
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
			case TaxationPackage.TAX_PAYER__DEPENDENTS:
				return getDependents();
			case TaxationPackage.TAX_PAYER__FROM_AGENT:
				return getFrom_agent();
			case TaxationPackage.TAX_PAYER__INCOMES:
				return getIncomes();
			case TaxationPackage.TAX_PAYER__FROM_LAW:
				return getFrom_law();
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
			case TaxationPackage.TAX_PAYER__DEPENDENTS:
				getDependents().clear();
				getDependents().addAll((Collection<? extends Dependent>)newValue);
				return;
			case TaxationPackage.TAX_PAYER__FROM_AGENT:
				setFrom_agent((FromAgent)newValue);
				return;
			case TaxationPackage.TAX_PAYER__INCOMES:
				getIncomes().clear();
				getIncomes().addAll((Collection<? extends Income>)newValue);
				return;
			case TaxationPackage.TAX_PAYER__FROM_LAW:
				setFrom_law((FromLaw)newValue);
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
			case TaxationPackage.TAX_PAYER__DEPENDENTS:
				getDependents().clear();
				return;
			case TaxationPackage.TAX_PAYER__FROM_AGENT:
				setFrom_agent((FromAgent)null);
				return;
			case TaxationPackage.TAX_PAYER__INCOMES:
				getIncomes().clear();
				return;
			case TaxationPackage.TAX_PAYER__FROM_LAW:
				setFrom_law((FromLaw)null);
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
			case TaxationPackage.TAX_PAYER__DEPENDENTS:
				return dependents != null && !dependents.isEmpty();
			case TaxationPackage.TAX_PAYER__FROM_AGENT:
				return from_agent != null;
			case TaxationPackage.TAX_PAYER__INCOMES:
				return incomes != null && !incomes.isEmpty();
			case TaxationPackage.TAX_PAYER__FROM_LAW:
				return from_law != null;
		}
		return super.eIsSet(featureID);
	}

} //Tax_PayerImpl
