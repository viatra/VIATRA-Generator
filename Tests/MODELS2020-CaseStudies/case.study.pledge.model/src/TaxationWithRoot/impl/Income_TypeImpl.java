/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Income;
import TaxationWithRoot.Income_Type;
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
 * An implementation of the model object '<em><b>Income Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.Income_TypeImpl#getId8 <em>Id8</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_TypeImpl#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Income_TypeImpl extends MinimalEObjectImpl.Container implements Income_Type {
	/**
	 * The default value of the '{@link #getId8() <em>Id8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId8()
	 * @generated
	 * @ordered
	 */
	protected static final String ID8_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId8() <em>Id8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId8()
	 * @generated
	 * @ordered
	 */
	protected String id8 = ID8_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Income_TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.INCOME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId8() {
		return id8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId8(String newId8) {
		String oldId8 = id8;
		id8 = newId8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TYPE__ID8, oldId8, id8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income getIncome() {
		if (eContainerFeatureID() != TaxationPackage.INCOME_TYPE__INCOME) return null;
		return (Income)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncome(Income newIncome, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIncome, TaxationPackage.INCOME_TYPE__INCOME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncome(Income newIncome) {
		if (newIncome != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.INCOME_TYPE__INCOME && newIncome != null)) {
			if (EcoreUtil.isAncestor(this, newIncome))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncome != null)
				msgs = ((InternalEObject)newIncome).eInverseAdd(this, TaxationPackage.INCOME__INCOME_TYPE, Income.class, msgs);
			msgs = basicSetIncome(newIncome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TYPE__INCOME, newIncome, newIncome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.INCOME_TYPE__INCOME:
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
			case TaxationPackage.INCOME_TYPE__INCOME:
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
			case TaxationPackage.INCOME_TYPE__INCOME:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.INCOME__INCOME_TYPE, Income.class, msgs);
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
			case TaxationPackage.INCOME_TYPE__ID8:
				return getId8();
			case TaxationPackage.INCOME_TYPE__INCOME:
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
			case TaxationPackage.INCOME_TYPE__ID8:
				setId8((String)newValue);
				return;
			case TaxationPackage.INCOME_TYPE__INCOME:
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
			case TaxationPackage.INCOME_TYPE__ID8:
				setId8(ID8_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TYPE__INCOME:
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
			case TaxationPackage.INCOME_TYPE__ID8:
				return ID8_EDEFAULT == null ? id8 != null : !ID8_EDEFAULT.equals(id8);
			case TaxationPackage.INCOME_TYPE__INCOME:
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
		result.append(" (id8: ");
		result.append(id8);
		result.append(')');
		return result.toString();
	}

} //Income_TypeImpl
