/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.InlinePredicateAttrributes;
import org.eclipse.viatra.solver.language.solverLanguage.PredicateDefinition;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateDefinitionImpl#isError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PredicateDefinitionImpl#isFunctional <em>Functional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateDefinitionImpl extends FunctorDefinitonImpl implements PredicateDefinition {
	/**
	 * The default value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected boolean error = ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #isFunctional() <em>Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUNCTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFunctional() <em>Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFunctional()
	 * @generated
	 * @ordered
	 */
	protected boolean functional = FUNCTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.PREDICATE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(boolean newError) {
		boolean oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.PREDICATE_DEFINITION__ERROR,
					oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFunctional() {
		return functional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctional(boolean newFunctional) {
		boolean oldFunctional = functional;
		functional = newFunctional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.PREDICATE_DEFINITION__FUNCTIONAL, oldFunctional, functional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SolverLanguagePackage.PREDICATE_DEFINITION__ERROR:
			return isError();
		case SolverLanguagePackage.PREDICATE_DEFINITION__FUNCTIONAL:
			return isFunctional();
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
		case SolverLanguagePackage.PREDICATE_DEFINITION__ERROR:
			setError((Boolean) newValue);
			return;
		case SolverLanguagePackage.PREDICATE_DEFINITION__FUNCTIONAL:
			setFunctional((Boolean) newValue);
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
		case SolverLanguagePackage.PREDICATE_DEFINITION__ERROR:
			setError(ERROR_EDEFAULT);
			return;
		case SolverLanguagePackage.PREDICATE_DEFINITION__FUNCTIONAL:
			setFunctional(FUNCTIONAL_EDEFAULT);
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
		case SolverLanguagePackage.PREDICATE_DEFINITION__ERROR:
			return error != ERROR_EDEFAULT;
		case SolverLanguagePackage.PREDICATE_DEFINITION__FUNCTIONAL:
			return functional != FUNCTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InlinePredicateAttrributes.class) {
			switch (derivedFeatureID) {
			case SolverLanguagePackage.PREDICATE_DEFINITION__ERROR:
				return SolverLanguagePackage.INLINE_PREDICATE_ATTRRIBUTES__ERROR;
			case SolverLanguagePackage.PREDICATE_DEFINITION__FUNCTIONAL:
				return SolverLanguagePackage.INLINE_PREDICATE_ATTRRIBUTES__FUNCTIONAL;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InlinePredicateAttrributes.class) {
			switch (baseFeatureID) {
			case SolverLanguagePackage.INLINE_PREDICATE_ATTRRIBUTES__ERROR:
				return SolverLanguagePackage.PREDICATE_DEFINITION__ERROR;
			case SolverLanguagePackage.INLINE_PREDICATE_ATTRRIBUTES__FUNCTIONAL:
				return SolverLanguagePackage.PREDICATE_DEFINITION__FUNCTIONAL;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (error: ");
		result.append(error);
		result.append(", functional: ");
		result.append(functional);
		result.append(')');
		return result.toString();
	}

} //PredicateDefinitionImpl
