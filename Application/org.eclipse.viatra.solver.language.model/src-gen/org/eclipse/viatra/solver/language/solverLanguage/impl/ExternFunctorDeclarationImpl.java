/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.ArgumentList;
import org.eclipse.viatra.solver.language.solverLanguage.ExternFunctorDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extern Functor Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternFunctorDeclarationImpl#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExternFunctorDeclarationImpl extends ExternDeclarationImpl implements ExternFunctorDeclaration {
	/**
	 * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentList()
	 * @generated
	 * @ordered
	 */
	protected ArgumentList argumentList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternFunctorDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.EXTERN_FUNCTOR_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentList getArgumentList() {
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentList(ArgumentList newArgumentList, NotificationChain msgs) {
		ArgumentList oldArgumentList = argumentList;
		argumentList = newArgumentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST, oldArgumentList, newArgumentList);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentList(ArgumentList newArgumentList) {
		if (newArgumentList != argumentList) {
			NotificationChain msgs = null;
			if (argumentList != null)
				msgs = ((InternalEObject) argumentList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST, null,
						msgs);
			if (newArgumentList != null)
				msgs = ((InternalEObject) newArgumentList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST, null,
						msgs);
			msgs = basicSetArgumentList(newArgumentList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST, newArgumentList, newArgumentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST:
			return basicSetArgumentList(null, msgs);
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
		case SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST:
			return getArgumentList();
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
		case SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST:
			setArgumentList((ArgumentList) newValue);
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
		case SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST:
			setArgumentList((ArgumentList) null);
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
		case SolverLanguagePackage.EXTERN_FUNCTOR_DECLARATION__ARGUMENT_LIST:
			return argumentList != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternFunctorDeclarationImpl
