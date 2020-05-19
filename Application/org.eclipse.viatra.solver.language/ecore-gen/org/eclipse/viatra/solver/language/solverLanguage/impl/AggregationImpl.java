/**
 * generated by Xtext 2.21.0
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.Aggregation;
import org.eclipse.viatra.solver.language.solverLanguage.Expression;
import org.eclipse.viatra.solver.language.solverLanguage.LocalVariables;
import org.eclipse.viatra.solver.language.solverLanguage.NamedElement;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.AggregationImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationImpl extends ExpressionImpl implements Aggregation {
	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected NamedElement op;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected LocalVariables localVariables;

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
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getOp() {
		if (op != null && op.eIsProxy()) {
			InternalEObject oldOp = (InternalEObject)op;
			op = (NamedElement)eResolveProxy(oldOp);
			if (op != oldOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverLanguagePackage.AGGREGATION__OP, oldOp, op));
			}
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp(NamedElement newOp) {
		NamedElement oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATION__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVariables getLocalVariables() {
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalVariables(LocalVariables newLocalVariables, NotificationChain msgs) {
		LocalVariables oldLocalVariables = localVariables;
		localVariables = newLocalVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES, oldLocalVariables, newLocalVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalVariables(LocalVariables newLocalVariables) {
		if (newLocalVariables != localVariables) {
			NotificationChain msgs = null;
			if (localVariables != null)
				msgs = ((InternalEObject)localVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES, null, msgs);
			if (newLocalVariables != null)
				msgs = ((InternalEObject)newLocalVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES, null, msgs);
			msgs = basicSetLocalVariables(newLocalVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES, newLocalVariables, newLocalVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(Expression newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.AGGREGATION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.AGGREGATION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES:
				return basicSetLocalVariables(null, msgs);
			case SolverLanguagePackage.AGGREGATION__BODY:
				return basicSetBody(null, msgs);
			case SolverLanguagePackage.AGGREGATION__CONDITION:
				return basicSetCondition(null, msgs);
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
			case SolverLanguagePackage.AGGREGATION__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES:
				return getLocalVariables();
			case SolverLanguagePackage.AGGREGATION__BODY:
				return getBody();
			case SolverLanguagePackage.AGGREGATION__CONDITION:
				return getCondition();
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
			case SolverLanguagePackage.AGGREGATION__OP:
				setOp((NamedElement)newValue);
				return;
			case SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)newValue);
				return;
			case SolverLanguagePackage.AGGREGATION__BODY:
				setBody((Expression)newValue);
				return;
			case SolverLanguagePackage.AGGREGATION__CONDITION:
				setCondition((Expression)newValue);
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
			case SolverLanguagePackage.AGGREGATION__OP:
				setOp((NamedElement)null);
				return;
			case SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES:
				setLocalVariables((LocalVariables)null);
				return;
			case SolverLanguagePackage.AGGREGATION__BODY:
				setBody((Expression)null);
				return;
			case SolverLanguagePackage.AGGREGATION__CONDITION:
				setCondition((Expression)null);
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
			case SolverLanguagePackage.AGGREGATION__OP:
				return op != null;
			case SolverLanguagePackage.AGGREGATION__LOCAL_VARIABLES:
				return localVariables != null;
			case SolverLanguagePackage.AGGREGATION__BODY:
				return body != null;
			case SolverLanguagePackage.AGGREGATION__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregationImpl
