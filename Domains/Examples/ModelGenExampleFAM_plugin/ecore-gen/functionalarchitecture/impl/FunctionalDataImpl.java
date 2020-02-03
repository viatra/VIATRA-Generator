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
 * An implementation of the model object '<em><b>Functional Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.impl.FunctionalDataImpl#getTerminator <em>Terminator</em>}</li>
 *   <li>{@link functionalarchitecture.impl.FunctionalDataImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link functionalarchitecture.impl.FunctionalDataImpl#getValue <em>Value</em>}</li>
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

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
		return FunctionalarchitecturePackage.Literals.FUNCTIONAL_DATA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, oldTerminator, newTerminator);
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
				msgs = ((InternalEObject)terminator).eInverseRemove(this, FunctionalarchitecturePackage.FAM_TERMINATOR__DATA, FAMTerminator.class, msgs);
			if (newTerminator != null)
				msgs = ((InternalEObject)newTerminator).eInverseAdd(this, FunctionalarchitecturePackage.FAM_TERMINATOR__DATA, FAMTerminator.class, msgs);
			msgs = basicSetTerminator(newTerminator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, newTerminator, newTerminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public functionalarchitecture.FunctionalInterface getInterface() {
		if (eContainerFeatureID() != FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE) return null;
		return (functionalarchitecture.FunctionalInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(functionalarchitecture.FunctionalInterface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface, FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(functionalarchitecture.FunctionalInterface newInterface) {
		if (newInterface != eInternalContainer() || (eContainerFeatureID() != FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA, functionalarchitecture.FunctionalInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionalarchitecturePackage.FUNCTIONAL_DATA__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				if (terminator != null)
					msgs = ((InternalEObject)terminator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR, null, msgs);
				return basicSetTerminator((FAMTerminator)otherEnd, msgs);
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((functionalarchitecture.FunctionalInterface)otherEnd, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				return basicSetTerminator(null, msgs);
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
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
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				return eInternalContainer().eInverseRemove(this, FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE__DATA, functionalarchitecture.FunctionalInterface.class, msgs);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				return getTerminator();
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				return getInterface();
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__VALUE:
				return getValue();
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
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				setTerminator((FAMTerminator)newValue);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				setInterface((functionalarchitecture.FunctionalInterface)newValue);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__VALUE:
				setValue((Integer)newValue);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				setTerminator((FAMTerminator)null);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				setInterface((functionalarchitecture.FunctionalInterface)null);
				return;
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__TERMINATOR:
				return terminator != null;
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__INTERFACE:
				return getInterface() != null;
			case FunctionalarchitecturePackage.FUNCTIONAL_DATA__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //FunctionalDataImpl
