/**
 */
package Taxation.impl;

import Taxation.Household;
import Taxation.Legal_Union_Record;
import Taxation.Physical_Person;
import Taxation.Separation_Causes;
import Taxation.Tax_Property;
import Taxation.TaxationPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Union Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getStart_year <em>Start year</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getEnd_year <em>End year</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getSeparation_cause <em>Separation cause</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getIndividual_A <em>Individual A</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getIndividual_B <em>Individual B</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#isMutual_agreement <em>Mutual agreement</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getId9 <em>Id9</em>}</li>
 *   <li>{@link Taxation.impl.Legal_Union_RecordImpl#getHousehold <em>Household</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Legal_Union_RecordImpl extends MinimalEObjectImpl.Container implements Legal_Union_Record {
	/**
	 * The default value of the '{@link #getStart_year() <em>Start year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_year()
	 * @generated
	 * @ordered
	 */
	protected static final int START_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart_year() <em>Start year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_year()
	 * @generated
	 * @ordered
	 */
	protected int start_year = START_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd_year() <em>End year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_year()
	 * @generated
	 * @ordered
	 */
	protected static final int END_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd_year() <em>End year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_year()
	 * @generated
	 * @ordered
	 */
	protected int end_year = END_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeparation_cause() <em>Separation cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparation_cause()
	 * @generated
	 * @ordered
	 */
	protected static final Separation_Causes SEPARATION_CAUSE_EDEFAULT = Separation_Causes.NONE;

	/**
	 * The cached value of the '{@link #getSeparation_cause() <em>Separation cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparation_cause()
	 * @generated
	 * @ordered
	 */
	protected Separation_Causes separation_cause = SEPARATION_CAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndividual_A() <em>Individual A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual_A()
	 * @generated
	 * @ordered
	 */
	protected Physical_Person individual_A;

	/**
	 * The cached value of the '{@link #getIndividual_B() <em>Individual B</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual_B()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Person> individual_B;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Tax_Property> properties;

	/**
	 * The default value of the '{@link #isMutual_agreement() <em>Mutual agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutual_agreement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTUAL_AGREEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutual_agreement() <em>Mutual agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutual_agreement()
	 * @generated
	 * @ordered
	 */
	protected boolean mutual_agreement = MUTUAL_AGREEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId9() <em>Id9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId9()
	 * @generated
	 * @ordered
	 */
	protected static final String ID9_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId9() <em>Id9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId9()
	 * @generated
	 * @ordered
	 */
	protected String id9 = ID9_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legal_Union_RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.LEGAL_UNION_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStart_year() {
		return start_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart_year(int newStart_year) {
		int oldStart_year = start_year;
		start_year = newStart_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__START_YEAR, oldStart_year, start_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnd_year() {
		return end_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd_year(int newEnd_year) {
		int oldEnd_year = end_year;
		end_year = newEnd_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__END_YEAR, oldEnd_year, end_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Separation_Causes getSeparation_cause() {
		return separation_cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeparation_cause(Separation_Causes newSeparation_cause) {
		Separation_Causes oldSeparation_cause = separation_cause;
		separation_cause = newSeparation_cause == null ? SEPARATION_CAUSE_EDEFAULT : newSeparation_cause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__SEPARATION_CAUSE, oldSeparation_cause, separation_cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Physical_Person getIndividual_A() {
		return individual_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividual_A(Physical_Person newIndividual_A, NotificationChain msgs) {
		Physical_Person oldIndividual_A = individual_A;
		individual_A = newIndividual_A;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A, oldIndividual_A, newIndividual_A);
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
	public void setIndividual_A(Physical_Person newIndividual_A) {
		if (newIndividual_A != individual_A) {
			NotificationChain msgs = null;
			if (individual_A != null)
				msgs = ((InternalEObject)individual_A).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A, null, msgs);
			if (newIndividual_A != null)
				msgs = ((InternalEObject)newIndividual_A).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A, null, msgs);
			msgs = basicSetIndividual_A(newIndividual_A, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A, newIndividual_A, newIndividual_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Person> getIndividual_B() {
		if (individual_B == null) {
			individual_B = new EObjectContainmentEList<Physical_Person>(Physical_Person.class, this, TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_B);
		}
		return individual_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tax_Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentWithInverseEList<Tax_Property>(Tax_Property.class, this, TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES, TaxationPackage.TAX_PROPERTY__UNION_RECORD);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMutual_agreement() {
		return mutual_agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutual_agreement(boolean newMutual_agreement) {
		boolean oldMutual_agreement = mutual_agreement;
		mutual_agreement = newMutual_agreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__MUTUAL_AGREEMENT, oldMutual_agreement, mutual_agreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId9() {
		return id9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId9(String newId9) {
		String oldId9 = id9;
		id9 = newId9;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__ID9, oldId9, id9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Household getHousehold() {
		if (eContainerFeatureID() != TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD) return null;
		return (Household)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHousehold(Household newHousehold, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHousehold, TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHousehold(Household newHousehold) {
		if (newHousehold != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD && newHousehold != null)) {
			if (EcoreUtil.isAncestor(this, newHousehold))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHousehold != null)
				msgs = ((InternalEObject)newHousehold).eInverseAdd(this, TaxationPackage.HOUSEHOLD__PARENTS, Household.class, msgs);
			msgs = basicSetHousehold(newHousehold, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD, newHousehold, newHousehold));
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
			case TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHousehold((Household)otherEnd, msgs);
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
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A:
				return basicSetIndividual_A(null, msgs);
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_B:
				return ((InternalEList<?>)getIndividual_B()).basicRemove(otherEnd, msgs);
			case TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD:
				return basicSetHousehold(null, msgs);
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
			case TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.HOUSEHOLD__PARENTS, Household.class, msgs);
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
			case TaxationPackage.LEGAL_UNION_RECORD__START_YEAR:
				return getStart_year();
			case TaxationPackage.LEGAL_UNION_RECORD__END_YEAR:
				return getEnd_year();
			case TaxationPackage.LEGAL_UNION_RECORD__SEPARATION_CAUSE:
				return getSeparation_cause();
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A:
				return getIndividual_A();
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_B:
				return getIndividual_B();
			case TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES:
				return getProperties();
			case TaxationPackage.LEGAL_UNION_RECORD__MUTUAL_AGREEMENT:
				return isMutual_agreement();
			case TaxationPackage.LEGAL_UNION_RECORD__ID9:
				return getId9();
			case TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD:
				return getHousehold();
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
			case TaxationPackage.LEGAL_UNION_RECORD__START_YEAR:
				setStart_year((Integer)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__END_YEAR:
				setEnd_year((Integer)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__SEPARATION_CAUSE:
				setSeparation_cause((Separation_Causes)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A:
				setIndividual_A((Physical_Person)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_B:
				getIndividual_B().clear();
				getIndividual_B().addAll((Collection<? extends Physical_Person>)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Tax_Property>)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__MUTUAL_AGREEMENT:
				setMutual_agreement((Boolean)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__ID9:
				setId9((String)newValue);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD:
				setHousehold((Household)newValue);
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
			case TaxationPackage.LEGAL_UNION_RECORD__START_YEAR:
				setStart_year(START_YEAR_EDEFAULT);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__END_YEAR:
				setEnd_year(END_YEAR_EDEFAULT);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__SEPARATION_CAUSE:
				setSeparation_cause(SEPARATION_CAUSE_EDEFAULT);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A:
				setIndividual_A((Physical_Person)null);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_B:
				getIndividual_B().clear();
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES:
				getProperties().clear();
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__MUTUAL_AGREEMENT:
				setMutual_agreement(MUTUAL_AGREEMENT_EDEFAULT);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__ID9:
				setId9(ID9_EDEFAULT);
				return;
			case TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD:
				setHousehold((Household)null);
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
			case TaxationPackage.LEGAL_UNION_RECORD__START_YEAR:
				return start_year != START_YEAR_EDEFAULT;
			case TaxationPackage.LEGAL_UNION_RECORD__END_YEAR:
				return end_year != END_YEAR_EDEFAULT;
			case TaxationPackage.LEGAL_UNION_RECORD__SEPARATION_CAUSE:
				return separation_cause != SEPARATION_CAUSE_EDEFAULT;
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_A:
				return individual_A != null;
			case TaxationPackage.LEGAL_UNION_RECORD__INDIVIDUAL_B:
				return individual_B != null && !individual_B.isEmpty();
			case TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case TaxationPackage.LEGAL_UNION_RECORD__MUTUAL_AGREEMENT:
				return mutual_agreement != MUTUAL_AGREEMENT_EDEFAULT;
			case TaxationPackage.LEGAL_UNION_RECORD__ID9:
				return ID9_EDEFAULT == null ? id9 != null : !ID9_EDEFAULT.equals(id9);
			case TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD:
				return getHousehold() != null;
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
		result.append(" (start_year: ");
		result.append(start_year);
		result.append(", end_year: ");
		result.append(end_year);
		result.append(", separation_cause: ");
		result.append(separation_cause);
		result.append(", mutual_agreement: ");
		result.append(mutual_agreement);
		result.append(", id9: ");
		result.append(id9);
		result.append(')');
		return result.toString();
	}

} //Legal_Union_RecordImpl
