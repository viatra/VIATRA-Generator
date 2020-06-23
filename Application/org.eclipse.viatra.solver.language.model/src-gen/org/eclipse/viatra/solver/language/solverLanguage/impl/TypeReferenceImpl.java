/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.Symbol;
import org.eclipse.viatra.solver.language.solverLanguage.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypeReferenceImpl#isForceObjectType <em>Force Object Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.TypeReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeReferenceImpl extends MinimalEObjectImpl.Container implements TypeReference {
	/**
	 * The default value of the '{@link #isForceObjectType() <em>Force Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCE_OBJECT_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForceObjectType() <em>Force Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceObjectType()
	 * @generated
	 * @ordered
	 */
	protected boolean forceObjectType = FORCE_OBJECT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Symbol type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForceObjectType() {
		return forceObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceObjectType(boolean newForceObjectType) {
		boolean oldForceObjectType = forceObjectType;
		forceObjectType = newForceObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.TYPE_REFERENCE__FORCE_OBJECT_TYPE, oldForceObjectType, forceObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Symbol) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SolverLanguagePackage.TYPE_REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Symbol newType) {
		Symbol oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.TYPE_REFERENCE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SolverLanguagePackage.TYPE_REFERENCE__FORCE_OBJECT_TYPE:
			return isForceObjectType();
		case SolverLanguagePackage.TYPE_REFERENCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case SolverLanguagePackage.TYPE_REFERENCE__FORCE_OBJECT_TYPE:
			setForceObjectType((Boolean) newValue);
			return;
		case SolverLanguagePackage.TYPE_REFERENCE__TYPE:
			setType((Symbol) newValue);
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
		case SolverLanguagePackage.TYPE_REFERENCE__FORCE_OBJECT_TYPE:
			setForceObjectType(FORCE_OBJECT_TYPE_EDEFAULT);
			return;
		case SolverLanguagePackage.TYPE_REFERENCE__TYPE:
			setType((Symbol) null);
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
		case SolverLanguagePackage.TYPE_REFERENCE__FORCE_OBJECT_TYPE:
			return forceObjectType != FORCE_OBJECT_TYPE_EDEFAULT;
		case SolverLanguagePackage.TYPE_REFERENCE__TYPE:
			return type != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (forceObjectType: ");
		result.append(forceObjectType);
		result.append(')');
		return result.toString();
	}

} //TypeReferenceImpl
