/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbolic Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicValueImpl#getSymbolicReference <em>Symbolic Reference</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicValueImpl#getParameterSubstitutions <em>Parameter Substitutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolicValueImpl extends TermImpl implements SymbolicValue {
	/**
	 * The cached value of the '{@link #getSymbolicReference() <em>Symbolic Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicReference()
	 * @generated
	 * @ordered
	 */
	protected SymbolicDeclaration symbolicReference;

	/**
	 * The cached value of the '{@link #getParameterSubstitutions() <em>Parameter Substitutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> parameterSubstitutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogiclanguagePackage.Literals.SYMBOLIC_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicDeclaration getSymbolicReference() {
		if (symbolicReference != null && symbolicReference.eIsProxy()) {
			InternalEObject oldSymbolicReference = (InternalEObject)symbolicReference;
			symbolicReference = (SymbolicDeclaration)eResolveProxy(oldSymbolicReference);
			if (symbolicReference != oldSymbolicReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogiclanguagePackage.SYMBOLIC_VALUE__SYMBOLIC_REFERENCE, oldSymbolicReference, symbolicReference));
			}
		}
		return symbolicReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicDeclaration basicGetSymbolicReference() {
		return symbolicReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolicReference(SymbolicDeclaration newSymbolicReference) {
		SymbolicDeclaration oldSymbolicReference = symbolicReference;
		symbolicReference = newSymbolicReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiclanguagePackage.SYMBOLIC_VALUE__SYMBOLIC_REFERENCE, oldSymbolicReference, symbolicReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getParameterSubstitutions() {
		if (parameterSubstitutions == null) {
			parameterSubstitutions = new EObjectContainmentEList<Term>(Term.class, this, LogiclanguagePackage.SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS);
		}
		return parameterSubstitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogiclanguagePackage.SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
				return ((InternalEList<?>)getParameterSubstitutions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogiclanguagePackage.SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
				if (resolve) return getSymbolicReference();
				return basicGetSymbolicReference();
			case LogiclanguagePackage.SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
				return getParameterSubstitutions();
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
			case LogiclanguagePackage.SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
				setSymbolicReference((SymbolicDeclaration)newValue);
				return;
			case LogiclanguagePackage.SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
				getParameterSubstitutions().clear();
				getParameterSubstitutions().addAll((Collection<? extends Term>)newValue);
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
			case LogiclanguagePackage.SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
				setSymbolicReference((SymbolicDeclaration)null);
				return;
			case LogiclanguagePackage.SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
				getParameterSubstitutions().clear();
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
			case LogiclanguagePackage.SYMBOLIC_VALUE__SYMBOLIC_REFERENCE:
				return symbolicReference != null;
			case LogiclanguagePackage.SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS:
				return parameterSubstitutions != null && !parameterSubstitutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SymbolicValueImpl
