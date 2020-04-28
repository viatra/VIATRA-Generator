/**
 */
package Taxation.impl;

import Taxation.Legal_Union_Record;
import Taxation.Tax_Property;
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
 * An implementation of the model object '<em><b>Tax Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Tax_PropertyImpl#getStarting_year <em>Starting year</em>}</li>
 *   <li>{@link Taxation.impl.Tax_PropertyImpl#getId10 <em>Id10</em>}</li>
 *   <li>{@link Taxation.impl.Tax_PropertyImpl#getUnion_record <em>Union record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tax_PropertyImpl extends MinimalEObjectImpl.Container implements Tax_Property {
	/**
	 * The default value of the '{@link #getStarting_year() <em>Starting year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarting_year()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTING_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStarting_year() <em>Starting year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarting_year()
	 * @generated
	 * @ordered
	 */
	protected int starting_year = STARTING_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getId10() <em>Id10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId10()
	 * @generated
	 * @ordered
	 */
	protected static final String ID10_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId10() <em>Id10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId10()
	 * @generated
	 * @ordered
	 */
	protected String id10 = ID10_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tax_PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.TAX_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStarting_year() {
		return starting_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarting_year(int newStarting_year) {
		int oldStarting_year = starting_year;
		starting_year = newStarting_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_PROPERTY__STARTING_YEAR, oldStarting_year, starting_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId10() {
		return id10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId10(String newId10) {
		String oldId10 = id10;
		id10 = newId10;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_PROPERTY__ID10, oldId10, id10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Legal_Union_Record getUnion_record() {
		if (eContainerFeatureID() != TaxationPackage.TAX_PROPERTY__UNION_RECORD) return null;
		return (Legal_Union_Record)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnion_record(Legal_Union_Record newUnion_record, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnion_record, TaxationPackage.TAX_PROPERTY__UNION_RECORD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnion_record(Legal_Union_Record newUnion_record) {
		if (newUnion_record != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.TAX_PROPERTY__UNION_RECORD && newUnion_record != null)) {
			if (EcoreUtil.isAncestor(this, newUnion_record))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnion_record != null)
				msgs = ((InternalEObject)newUnion_record).eInverseAdd(this, TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES, Legal_Union_Record.class, msgs);
			msgs = basicSetUnion_record(newUnion_record, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_PROPERTY__UNION_RECORD, newUnion_record, newUnion_record));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.TAX_PROPERTY__UNION_RECORD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnion_record((Legal_Union_Record)otherEnd, msgs);
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
			case TaxationPackage.TAX_PROPERTY__UNION_RECORD:
				return basicSetUnion_record(null, msgs);
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
			case TaxationPackage.TAX_PROPERTY__UNION_RECORD:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.LEGAL_UNION_RECORD__PROPERTIES, Legal_Union_Record.class, msgs);
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
			case TaxationPackage.TAX_PROPERTY__STARTING_YEAR:
				return getStarting_year();
			case TaxationPackage.TAX_PROPERTY__ID10:
				return getId10();
			case TaxationPackage.TAX_PROPERTY__UNION_RECORD:
				return getUnion_record();
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
			case TaxationPackage.TAX_PROPERTY__STARTING_YEAR:
				setStarting_year((Integer)newValue);
				return;
			case TaxationPackage.TAX_PROPERTY__ID10:
				setId10((String)newValue);
				return;
			case TaxationPackage.TAX_PROPERTY__UNION_RECORD:
				setUnion_record((Legal_Union_Record)newValue);
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
			case TaxationPackage.TAX_PROPERTY__STARTING_YEAR:
				setStarting_year(STARTING_YEAR_EDEFAULT);
				return;
			case TaxationPackage.TAX_PROPERTY__ID10:
				setId10(ID10_EDEFAULT);
				return;
			case TaxationPackage.TAX_PROPERTY__UNION_RECORD:
				setUnion_record((Legal_Union_Record)null);
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
			case TaxationPackage.TAX_PROPERTY__STARTING_YEAR:
				return starting_year != STARTING_YEAR_EDEFAULT;
			case TaxationPackage.TAX_PROPERTY__ID10:
				return ID10_EDEFAULT == null ? id10 != null : !ID10_EDEFAULT.equals(id10);
			case TaxationPackage.TAX_PROPERTY__UNION_RECORD:
				return getUnion_record() != null;
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
		result.append(" (starting_year: ");
		result.append(starting_year);
		result.append(", id10: ");
		result.append(id10);
		result.append(')');
		return result.toString();
	}

} //Tax_PropertyImpl
