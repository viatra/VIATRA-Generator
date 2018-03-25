/**
 */
package functionalarchitecture.impl;

import functionalarchitecture.FAMTerminator;
import functionalarchitecture.FunctionalData;
import functionalarchitecture.FunctionalarchitecturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FAM Terminator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.impl.FAMTerminatorImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FAMTerminatorImpl extends MinimalEObjectImpl.Container implements FAMTerminator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FAMTerminatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalarchitecturePackage.Literals.FAM_TERMINATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalData getData() {
		if (eContainerFeatureID() != FunctionalarchitecturePackage.FAM_TERMINATOR__DATA) return null;
		return (FunctionalData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(FunctionalData newData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newData, FunctionalarchitecturePackage.FAM_TERMINATOR__DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(FunctionalData newData) {
		if (newData != eInternalContainer() || (eContainerFeatureID() != FunctionalarchitecturePackage.FAM_TERMINATOR__DATA && newData != null)) {
			if (EcoreUtil.isAncestor(this, newData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, FunctionalData.class, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FAM_TERMINATOR__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalarchitecturePackage.FAM_TERMINATOR__DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetData((FunctionalData)otherEnd, msgs);
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
			case FunctionalarchitecturePackage.FAM_TERMINATOR__DATA:
				return basicSetData(null, msgs);
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
			case FunctionalarchitecturePackage.FAM_TERMINATOR__DATA:
				return eInternalContainer().eInverseRemove(this, FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, FunctionalData.class, msgs);
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
			case FunctionalarchitecturePackage.FAM_TERMINATOR__DATA:
				return getData();
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
			case FunctionalarchitecturePackage.FAM_TERMINATOR__DATA:
				setData((FunctionalData)newValue);
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
			case FunctionalarchitecturePackage.FAM_TERMINATOR__DATA:
				setData((FunctionalData)null);
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
			case FunctionalarchitecturePackage.FAM_TERMINATOR__DATA:
				return getData() != null;
		}
		return super.eIsSet(featureID);
	}

} //FAMTerminatorImpl
