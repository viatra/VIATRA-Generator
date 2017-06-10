/**
 */
package hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.impl;

import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FAMTerminator;
import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage;
import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalData;
import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.impl.FunctionalDataImpl#getTerminator <em>Terminator</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.impl.FunctionalDataImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionalDataImpl extends MinimalEObjectImpl.Container implements FunctionalData {
	/**
	 * The cached value of the '{@link #getTerminator() <em>Terminator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminator()
	 * @generated
	 * @ordered
	 */
	protected FAMTerminator terminator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalArchitecturePackage.Literals.FUNCTIONAL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAMTerminator getTerminator() {
		return terminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminator(FAMTerminator newTerminator, NotificationChain msgs) {
		FAMTerminator oldTerminator = terminator;
		terminator = newTerminator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, oldTerminator, newTerminator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminator(FAMTerminator newTerminator) {
		if (newTerminator != terminator) {
			NotificationChain msgs = null;
			if (terminator != null)
				msgs = ((InternalEObject)terminator).eInverseRemove(this, FunctionalArchitecturePackage.FAM_TERMINATOR__DATA, FAMTerminator.class, msgs);
			if (newTerminator != null)
				msgs = ((InternalEObject)newTerminator).eInverseAdd(this, FunctionalArchitecturePackage.FAM_TERMINATOR__DATA, FAMTerminator.class, msgs);
			msgs = basicSetTerminator(newTerminator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, newTerminator, newTerminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalInterface getInterface() {
		if (eContainerFeatureID() != FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE) return null;
		return (FunctionalInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(FunctionalInterface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface, FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(FunctionalInterface newInterface) {
		if (newInterface != eInternalContainer() || (eContainerFeatureID() != FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA, FunctionalInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE, newInterface, newInterface));
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
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				if (terminator != null)
					msgs = ((InternalEObject)terminator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, null, msgs);
				return basicSetTerminator((FAMTerminator)otherEnd, msgs);
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((FunctionalInterface)otherEnd, msgs);
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
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				return basicSetTerminator(null, msgs);
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				return basicSetInterface(null, msgs);
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
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				return eInternalContainer().eInverseRemove(this, FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA, FunctionalInterface.class, msgs);
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
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				return getTerminator();
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				return getInterface();
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
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				setTerminator((FAMTerminator)newValue);
				return;
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				setInterface((FunctionalInterface)newValue);
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
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				setTerminator((FAMTerminator)null);
				return;
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				setInterface((FunctionalInterface)null);
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
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				return terminator != null;
			case FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				return getInterface() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalDataImpl
