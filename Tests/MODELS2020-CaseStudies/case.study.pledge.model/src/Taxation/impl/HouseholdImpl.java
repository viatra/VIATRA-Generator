/**
 */
package Taxation.impl;

import Taxation.Dependent;
import Taxation.Household;
import Taxation.Legal_Union_Record;
import Taxation.TaxationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Household</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.HouseholdImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link Taxation.impl.HouseholdImpl#getId1 <em>Id1</em>}</li>
 *   <li>{@link Taxation.impl.HouseholdImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HouseholdImpl extends MinimalEObjectImpl.Container implements Household {
	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected Legal_Union_Record parents;

	/**
	 * The default value of the '{@link #getId1() <em>Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId1()
	 * @generated
	 * @ordered
	 */
	protected static final String ID1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId1() <em>Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId1()
	 * @generated
	 * @ordered
	 */
	protected String id1 = ID1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependent> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.HOUSEHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Legal_Union_Record getParents() {
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParents(Legal_Union_Record newParents, NotificationChain msgs) {
		Legal_Union_Record oldParents = parents;
		parents = newParents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.HOUSEHOLD__PARENTS, oldParents, newParents);
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
	public void setParents(Legal_Union_Record newParents) {
		if (newParents != parents) {
			NotificationChain msgs = null;
			if (parents != null)
				msgs = ((InternalEObject)parents).eInverseRemove(this, TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD, Legal_Union_Record.class, msgs);
			if (newParents != null)
				msgs = ((InternalEObject)newParents).eInverseAdd(this, TaxationPackage.LEGAL_UNION_RECORD__HOUSEHOLD, Legal_Union_Record.class, msgs);
			msgs = basicSetParents(newParents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.HOUSEHOLD__PARENTS, newParents, newParents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId1() {
		return id1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId1(String newId1) {
		String oldId1 = id1;
		id1 = newId1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.HOUSEHOLD__ID1, oldId1, id1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dependent> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Dependent>(Dependent.class, this, TaxationPackage.HOUSEHOLD__CHILDREN, TaxationPackage.DEPENDENT__HOUSEHOLD);
		}
		return children;
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
			case TaxationPackage.HOUSEHOLD__PARENTS:
				if (parents != null)
					msgs = ((InternalEObject)parents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaxationPackage.HOUSEHOLD__PARENTS, null, msgs);
				return basicSetParents((Legal_Union_Record)otherEnd, msgs);
			case TaxationPackage.HOUSEHOLD__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case TaxationPackage.HOUSEHOLD__PARENTS:
				return basicSetParents(null, msgs);
			case TaxationPackage.HOUSEHOLD__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case TaxationPackage.HOUSEHOLD__PARENTS:
				return getParents();
			case TaxationPackage.HOUSEHOLD__ID1:
				return getId1();
			case TaxationPackage.HOUSEHOLD__CHILDREN:
				return getChildren();
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
			case TaxationPackage.HOUSEHOLD__PARENTS:
				setParents((Legal_Union_Record)newValue);
				return;
			case TaxationPackage.HOUSEHOLD__ID1:
				setId1((String)newValue);
				return;
			case TaxationPackage.HOUSEHOLD__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Dependent>)newValue);
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
			case TaxationPackage.HOUSEHOLD__PARENTS:
				setParents((Legal_Union_Record)null);
				return;
			case TaxationPackage.HOUSEHOLD__ID1:
				setId1(ID1_EDEFAULT);
				return;
			case TaxationPackage.HOUSEHOLD__CHILDREN:
				getChildren().clear();
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
			case TaxationPackage.HOUSEHOLD__PARENTS:
				return parents != null;
			case TaxationPackage.HOUSEHOLD__ID1:
				return ID1_EDEFAULT == null ? id1 != null : !ID1_EDEFAULT.equals(id1);
			case TaxationPackage.HOUSEHOLD__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (id1: ");
		result.append(id1);
		result.append(')');
		return result.toString();
	}

} //HouseholdImpl
