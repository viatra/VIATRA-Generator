/**
 */
package functionalarchitecture.impl;

import functionalarchitecture.Function;
import functionalarchitecture.FunctionalArchitectureModel;
import functionalarchitecture.FunctionalElement;
import functionalarchitecture.FunctionalarchitecturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.impl.FunctionalElementImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link functionalarchitecture.impl.FunctionalElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link functionalarchitecture.impl.FunctionalElementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionalElementImpl extends MinimalEObjectImpl.Container implements FunctionalElement {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected functionalarchitecture.FunctionalInterface interface_;

	/**
	 * The cached setting delegate for the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MODEL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FunctionalarchitecturePackage.Literals.FUNCTIONAL_ELEMENT__MODEL).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalarchitecturePackage.Literals.FUNCTIONAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public functionalarchitecture.FunctionalInterface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(functionalarchitecture.FunctionalInterface newInterface, NotificationChain msgs) {
		functionalarchitecture.FunctionalInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(functionalarchitecture.FunctionalInterface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT, functionalarchitecture.FunctionalInterface.class, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT, functionalarchitecture.FunctionalInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalArchitectureModel getModel() {
		return (FunctionalArchitectureModel)MODEL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalArchitectureModel basicGetModel() {
		return (FunctionalArchitectureModel)MODEL__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(FunctionalArchitectureModel newModel) {
		MODEL__ESETTING_DELEGATE.dynamicSet(this, null, 0, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getParent() {
		if (eContainerFeatureID() != FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT) return null;
		return (Function)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Function newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Function newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FunctionalarchitecturePackage.FUNCTION__SUB_ELEMENTS, Function.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE:
				if (interface_ != null)
					msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE, null, msgs);
				return basicSetInterface((functionalarchitecture.FunctionalInterface)otherEnd, msgs);
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Function)otherEnd, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE:
				return basicSetInterface(null, msgs);
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, FunctionalarchitecturePackage.FUNCTION__SUB_ELEMENTS, Function.class, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE:
				return getInterface();
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT:
				return getParent();
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
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE:
				setInterface((functionalarchitecture.FunctionalInterface)newValue);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__MODEL:
				setModel((FunctionalArchitectureModel)newValue);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT:
				setParent((Function)newValue);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE:
				setInterface((functionalarchitecture.FunctionalInterface)null);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__MODEL:
				setModel((FunctionalArchitectureModel)null);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT:
				setParent((Function)null);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE:
				return interface_ != null;
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__MODEL:
				return MODEL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalElementImpl
