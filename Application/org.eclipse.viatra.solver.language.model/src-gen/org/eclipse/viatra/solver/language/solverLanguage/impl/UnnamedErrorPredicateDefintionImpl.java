/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.ArgumentList;
import org.eclipse.viatra.solver.language.solverLanguage.Expression;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;
import org.eclipse.viatra.solver.language.solverLanguage.UnnamedErrorPredicateDefintion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnamed Error Predicate Defintion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnnamedErrorPredicateDefintionImpl#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.UnnamedErrorPredicateDefintionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnnamedErrorPredicateDefintionImpl extends StatementImpl implements UnnamedErrorPredicateDefintion {
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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Expression body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnnamedErrorPredicateDefintionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.UNNAMED_ERROR_PREDICATE_DEFINTION;
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
					SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST, oldArgumentList,
					newArgumentList);
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
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST,
						null, msgs);
			if (newArgumentList != null)
				msgs = ((InternalEObject) newArgumentList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST,
						null, msgs);
			msgs = basicSetArgumentList(newArgumentList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST, newArgumentList,
					newArgumentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Expression newBody, NotificationChain msgs) {
		Expression oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY, oldBody, newBody);
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
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY, null,
						msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY, null,
						msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST:
			return basicSetArgumentList(null, msgs);
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY:
			return basicSetBody(null, msgs);
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
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST:
			return getArgumentList();
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY:
			return getBody();
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
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST:
			setArgumentList((ArgumentList) newValue);
			return;
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY:
			setBody((Expression) newValue);
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
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST:
			setArgumentList((ArgumentList) null);
			return;
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY:
			setBody((Expression) null);
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
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__ARGUMENT_LIST:
			return argumentList != null;
		case SolverLanguagePackage.UNNAMED_ERROR_PREDICATE_DEFINTION__BODY:
			return body != null;
		}
		return super.eIsSet(featureID);
	}

} //UnnamedErrorPredicateDefintionImpl
