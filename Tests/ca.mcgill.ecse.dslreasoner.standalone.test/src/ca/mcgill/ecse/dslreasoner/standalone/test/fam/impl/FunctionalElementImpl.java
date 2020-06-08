/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl;

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalArchitectureModel;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage;

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
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl.FunctionalElementImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl.FunctionalElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl.FunctionalElementImpl#getParent <em>Parent</em>}</li>
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
	protected FunctionalInterface interface_;

	/**
	 * The cached setting delegate for the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MODEL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)famPackage.Literals.FUNCTIONAL_ELEMENT__MODEL).getSettingDelegate();

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
		return famPackage.Literals.FUNCTIONAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalInterface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(FunctionalInterface newInterface, NotificationChain msgs) {
		FunctionalInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, famPackage.FUNCTIONAL_ELEMENT__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(FunctionalInterface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, famPackage.FUNCTIONAL_INTERFACE__ELEMENT, FunctionalInterface.class, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, famPackage.FUNCTIONAL_INTERFACE__ELEMENT, FunctionalInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, famPackage.FUNCTIONAL_ELEMENT__INTERFACE, newInterface, newInterface));
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
		if (eContainerFeatureID() != famPackage.FUNCTIONAL_ELEMENT__PARENT) return null;
		return (Function)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Function newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, famPackage.FUNCTIONAL_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Function newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != famPackage.FUNCTIONAL_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, famPackage.FUNCTION__SUB_ELEMENTS, Function.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, famPackage.FUNCTIONAL_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case famPackage.FUNCTIONAL_ELEMENT__INTERFACE:
				if (interface_ != null)
					msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - famPackage.FUNCTIONAL_ELEMENT__INTERFACE, null, msgs);
				return basicSetInterface((FunctionalInterface)otherEnd, msgs);
			case famPackage.FUNCTIONAL_ELEMENT__PARENT:
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
			case famPackage.FUNCTIONAL_ELEMENT__INTERFACE:
				return basicSetInterface(null, msgs);
			case famPackage.FUNCTIONAL_ELEMENT__PARENT:
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
			case famPackage.FUNCTIONAL_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, famPackage.FUNCTION__SUB_ELEMENTS, Function.class, msgs);
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
			case famPackage.FUNCTIONAL_ELEMENT__INTERFACE:
				return getInterface();
			case famPackage.FUNCTIONAL_ELEMENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case famPackage.FUNCTIONAL_ELEMENT__PARENT:
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
			case famPackage.FUNCTIONAL_ELEMENT__INTERFACE:
				setInterface((FunctionalInterface)newValue);
				return;
			case famPackage.FUNCTIONAL_ELEMENT__MODEL:
				setModel((FunctionalArchitectureModel)newValue);
				return;
			case famPackage.FUNCTIONAL_ELEMENT__PARENT:
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
			case famPackage.FUNCTIONAL_ELEMENT__INTERFACE:
				setInterface((FunctionalInterface)null);
				return;
			case famPackage.FUNCTIONAL_ELEMENT__MODEL:
				setModel((FunctionalArchitectureModel)null);
				return;
			case famPackage.FUNCTIONAL_ELEMENT__PARENT:
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
			case famPackage.FUNCTIONAL_ELEMENT__INTERFACE:
				return interface_ != null;
			case famPackage.FUNCTIONAL_ELEMENT__MODEL:
				return MODEL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case famPackage.FUNCTIONAL_ELEMENT__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalElementImpl
