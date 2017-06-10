/**
 */
package hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.impl;

import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage;
import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalData;
import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalElement;
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
 * An implementation of the model object '<em><b>Functional Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.impl.FunctionalInterfaceImpl#getData <em>Data</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.impl.FunctionalInterfaceImpl#getElement <em>Element</em>}</li>
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
		return FunctionalArchitecturePackage.Literals.FUNCTIONAL_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalData> getData() {
		if (data == null) {
			data = new EObjectContainmentWithInverseEList<FunctionalData>(FunctionalData.class, this, FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA, FunctionalArchitecturePackage.FUNCTIONAL_DATA__INTERFACE);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalElement getElement() {
		if (eContainerFeatureID() != FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT) return null;
		return (FunctionalElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(FunctionalElement newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(FunctionalElement newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, FunctionalArchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE, FunctionalElement.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT, newElement, newElement));
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
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getData()).basicAdd(otherEnd, msgs);
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
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
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
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
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				return eInternalContainer().eInverseRemove(this, FunctionalArchitecturePackage.FUNCTIONAL_ELEMENT__INTERFACE, FunctionalElement.class, msgs);
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
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return getData();
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
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
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends FunctionalData>)newValue);
				return;
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
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
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				getData().clear();
				return;
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
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
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__DATA:
				return data != null && !data.isEmpty();
			case FunctionalArchitecturePackage.FUNCTIONAL_INTERFACE__ELEMENT:
				return getElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalInterfaceImpl
