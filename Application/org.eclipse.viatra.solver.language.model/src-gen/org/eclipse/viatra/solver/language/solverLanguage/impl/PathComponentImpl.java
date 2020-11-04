/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.viatra.solver.language.solverLanguage.PathComponent;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.Symbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl#isInverse <em>Inverse</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl#isTransitiveClosure <em>Transitive Closure</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.PathComponentImpl#isReflexiveTransitiveClosure <em>Reflexive Transitive Closure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathComponentImpl extends MinimalEObjectImpl.Container implements PathComponent {
	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected Symbol symbol;

	/**
	 * The default value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected boolean inverse = INVERSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransitiveClosure() <em>Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitiveClosure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSITIVE_CLOSURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransitiveClosure() <em>Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitiveClosure()
	 * @generated
	 * @ordered
	 */
	protected boolean transitiveClosure = TRANSITIVE_CLOSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReflexiveTransitiveClosure() <em>Reflexive Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReflexiveTransitiveClosure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFLEXIVE_TRANSITIVE_CLOSURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReflexiveTransitiveClosure() <em>Reflexive Transitive Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReflexiveTransitiveClosure()
	 * @generated
	 * @ordered
	 */
	protected boolean reflexiveTransitiveClosure = REFLEXIVE_TRANSITIVE_CLOSURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.PATH_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getSymbol() {
		if (symbol != null && symbol.eIsProxy()) {
			InternalEObject oldSymbol = (InternalEObject) symbol;
			symbol = (Symbol) eResolveProxy(oldSymbol);
			if (symbol != oldSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SolverLanguagePackage.PATH_COMPONENT__SYMBOL, oldSymbol, symbol));
			}
		}
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(Symbol newSymbol) {
		Symbol oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.PATH_COMPONENT__SYMBOL,
					oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverse(boolean newInverse) {
		boolean oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.PATH_COMPONENT__INVERSE,
					oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransitiveClosure() {
		return transitiveClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitiveClosure(boolean newTransitiveClosure) {
		boolean oldTransitiveClosure = transitiveClosure;
		transitiveClosure = newTransitiveClosure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.PATH_COMPONENT__TRANSITIVE_CLOSURE, oldTransitiveClosure, transitiveClosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReflexiveTransitiveClosure() {
		return reflexiveTransitiveClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflexiveTransitiveClosure(boolean newReflexiveTransitiveClosure) {
		boolean oldReflexiveTransitiveClosure = reflexiveTransitiveClosure;
		reflexiveTransitiveClosure = newReflexiveTransitiveClosure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE, oldReflexiveTransitiveClosure,
					reflexiveTransitiveClosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SolverLanguagePackage.PATH_COMPONENT__SYMBOL:
			if (resolve)
				return getSymbol();
			return basicGetSymbol();
		case SolverLanguagePackage.PATH_COMPONENT__INVERSE:
			return isInverse();
		case SolverLanguagePackage.PATH_COMPONENT__TRANSITIVE_CLOSURE:
			return isTransitiveClosure();
		case SolverLanguagePackage.PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE:
			return isReflexiveTransitiveClosure();
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
		case SolverLanguagePackage.PATH_COMPONENT__SYMBOL:
			setSymbol((Symbol) newValue);
			return;
		case SolverLanguagePackage.PATH_COMPONENT__INVERSE:
			setInverse((Boolean) newValue);
			return;
		case SolverLanguagePackage.PATH_COMPONENT__TRANSITIVE_CLOSURE:
			setTransitiveClosure((Boolean) newValue);
			return;
		case SolverLanguagePackage.PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE:
			setReflexiveTransitiveClosure((Boolean) newValue);
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
		case SolverLanguagePackage.PATH_COMPONENT__SYMBOL:
			setSymbol((Symbol) null);
			return;
		case SolverLanguagePackage.PATH_COMPONENT__INVERSE:
			setInverse(INVERSE_EDEFAULT);
			return;
		case SolverLanguagePackage.PATH_COMPONENT__TRANSITIVE_CLOSURE:
			setTransitiveClosure(TRANSITIVE_CLOSURE_EDEFAULT);
			return;
		case SolverLanguagePackage.PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE:
			setReflexiveTransitiveClosure(REFLEXIVE_TRANSITIVE_CLOSURE_EDEFAULT);
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
		case SolverLanguagePackage.PATH_COMPONENT__SYMBOL:
			return symbol != null;
		case SolverLanguagePackage.PATH_COMPONENT__INVERSE:
			return inverse != INVERSE_EDEFAULT;
		case SolverLanguagePackage.PATH_COMPONENT__TRANSITIVE_CLOSURE:
			return transitiveClosure != TRANSITIVE_CLOSURE_EDEFAULT;
		case SolverLanguagePackage.PATH_COMPONENT__REFLEXIVE_TRANSITIVE_CLOSURE:
			return reflexiveTransitiveClosure != REFLEXIVE_TRANSITIVE_CLOSURE_EDEFAULT;
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
		result.append(" (inverse: ");
		result.append(inverse);
		result.append(", transitiveClosure: ");
		result.append(transitiveClosure);
		result.append(", reflexiveTransitiveClosure: ");
		result.append(reflexiveTransitiveClosure);
		result.append(')');
		return result.toString();
	}

} //PathComponentImpl
