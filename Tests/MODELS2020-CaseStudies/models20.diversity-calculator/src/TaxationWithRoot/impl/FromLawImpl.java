/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.FromLaw;
import TaxationWithRoot.Tax_Payer;
import TaxationWithRoot.TaxationWithRootPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Law</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.FromLawImpl#getId <em>Id</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.FromLawImpl#getTaxPayer <em>Tax Payer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FromLawImpl extends MinimalEObjectImpl.Container implements FromLaw {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromLawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationWithRootPackage.Literals.FROM_LAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.FROM_LAW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Payer getTaxPayer() {
		if (eContainerFeatureID() != TaxationWithRootPackage.FROM_LAW__TAX_PAYER) return null;
		return (Tax_Payer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxPayer(Tax_Payer newTaxPayer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaxPayer, TaxationWithRootPackage.FROM_LAW__TAX_PAYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPayer(Tax_Payer newTaxPayer) {
		if (newTaxPayer != eInternalContainer() || (eContainerFeatureID() != TaxationWithRootPackage.FROM_LAW__TAX_PAYER && newTaxPayer != null)) {
			if (EcoreUtil.isAncestor(this, newTaxPayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaxPayer != null)
				msgs = ((InternalEObject)newTaxPayer).eInverseAdd(this, TaxationWithRootPackage.TAX_PAYER__FROM_LAW, Tax_Payer.class, msgs);
			msgs = basicSetTaxPayer(newTaxPayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationWithRootPackage.FROM_LAW__TAX_PAYER, newTaxPayer, newTaxPayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationWithRootPackage.FROM_LAW__TAX_PAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaxPayer((Tax_Payer)otherEnd, msgs);
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
			case TaxationWithRootPackage.FROM_LAW__TAX_PAYER:
				return basicSetTaxPayer(null, msgs);
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
			case TaxationWithRootPackage.FROM_LAW__TAX_PAYER:
				return eInternalContainer().eInverseRemove(this, TaxationWithRootPackage.TAX_PAYER__FROM_LAW, Tax_Payer.class, msgs);
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
			case TaxationWithRootPackage.FROM_LAW__ID:
				return getId();
			case TaxationWithRootPackage.FROM_LAW__TAX_PAYER:
				return getTaxPayer();
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
			case TaxationWithRootPackage.FROM_LAW__ID:
				setId((String)newValue);
				return;
			case TaxationWithRootPackage.FROM_LAW__TAX_PAYER:
				setTaxPayer((Tax_Payer)newValue);
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
			case TaxationWithRootPackage.FROM_LAW__ID:
				setId(ID_EDEFAULT);
				return;
			case TaxationWithRootPackage.FROM_LAW__TAX_PAYER:
				setTaxPayer((Tax_Payer)null);
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
			case TaxationWithRootPackage.FROM_LAW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TaxationWithRootPackage.FROM_LAW__TAX_PAYER:
				return getTaxPayer() != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FromLawImpl
