/**
 */
package functionalarchitecture.impl;

import functionalarchitecture.FunctionalData;
import functionalarchitecture.FunctionalElement;
import functionalarchitecture.FunctionalInterface;
import functionalarchitecture.FunctionalarchitecturePackage;

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
 * An implementation of the model object '<em><b>Functional Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.impl.FunctionalInterfaceImpl#getData <em>Data</em>}</li>
 *   <li>{@link functionalarchitecture.impl.FunctionalInterfaceImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalInterfaceImpl extends MinimalEObjectImpl.Container implements FunctionalInterface {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalData> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionalarchitecturePackage.Literals.FUNCTIONAL_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalData> getData() {
		if (data == null) {
			data = new EObjectContainmentWithInverseEList<FunctionalData>(FunctionalData.class, this, FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA, FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalElement getElement() {
		if (eContainerFeatureID() != FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT) return null;
		return (FunctionalElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(FunctionalElement newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(FunctionalElement newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE, FunctionalElement.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT, newElement, newElement));
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
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getData()).basicAdd(otherEnd, msgs);
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((FunctionalElement)otherEnd, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				return basicSetElement(null, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				return eInternalContainer().eInverseRemove(this, FunctionalarchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE, FunctionalElement.class, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return getData();
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				return getElement();
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
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends FunctionalData>)newValue);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				setElement((FunctionalElement)newValue);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				getData().clear();
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				setElement((FunctionalElement)null);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return data != null && !data.isEmpty();
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				return getElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalInterfaceImpl
