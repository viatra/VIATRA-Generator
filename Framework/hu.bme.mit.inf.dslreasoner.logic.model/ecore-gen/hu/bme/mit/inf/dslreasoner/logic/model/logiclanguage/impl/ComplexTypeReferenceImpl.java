/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ComplexTypeReferenceImpl#getReferred <em>Referred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeReferenceImpl extends TypeReferenceImpl implements ComplexTypeReference {
	/**
	 * The cached value of the '{@link #getReferred() <em>Referred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferred()
	 * @generated
	 * @ordered
	 */
	protected Type referred;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogiclanguagePackage.Literals.COMPLEX_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getReferred() {
		if (referred != null && referred.eIsProxy()) {
			InternalEObject oldReferred = (InternalEObject)referred;
			referred = (Type)eResolveProxy(oldReferred);
			if (referred != oldReferred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogiclanguagePackage.COMPLEX_TYPE_REFERENCE__REFERRED, oldReferred, referred));
			}
		}
		return referred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReferred() {
		return referred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferred(Type newReferred) {
		Type oldReferred = referred;
		referred = newReferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.COMPLEX_TYPE_REFERENCE__REFERRED, oldReferred, referred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogiclanguagePackage.COMPLEX_TYPE_REFERENCE__REFERRED:
				if (resolve) return getReferred();
				return basicGetReferred();
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
			case LogiclanguagePackage.COMPLEX_TYPE_REFERENCE__REFERRED:
				setReferred((Type)newValue);
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
			case LogiclanguagePackage.COMPLEX_TYPE_REFERENCE__REFERRED:
				setReferred((Type)null);
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
			case LogiclanguagePackage.COMPLEX_TYPE_REFERENCE__REFERRED:
				return referred != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexTypeReferenceImpl
