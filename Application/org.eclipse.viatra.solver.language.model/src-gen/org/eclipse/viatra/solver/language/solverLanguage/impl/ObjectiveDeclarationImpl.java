/**
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.Expression;
import org.eclipse.viatra.solver.language.solverLanguage.ObjectiveDeclaration;
import org.eclipse.viatra.solver.language.solverLanguage.ObjectiveKind;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ObjectiveDeclarationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ObjectiveDeclarationImpl#getObjective <em>Objective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveDeclarationImpl extends StatementImpl implements ObjectiveDeclaration {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectiveKind KIND_EDEFAULT = ObjectiveKind.MINIMIZATION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ObjectiveKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected Expression objective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.OBJECTIVE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ObjectiveKind newKind) {
		ObjectiveKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.OBJECTIVE_DECLARATION__KIND,
					oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjective(Expression newObjective, NotificationChain msgs) {
		Expression oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE, oldObjective, newObjective);
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
	public void setObjective(Expression newObjective) {
		if (newObjective != objective) {
			NotificationChain msgs = null;
			if (objective != null)
				msgs = ((InternalEObject) objective).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE, null, msgs);
			if (newObjective != null)
				msgs = ((InternalEObject) newObjective).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE, null, msgs);
			msgs = basicSetObjective(newObjective, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE, newObjective, newObjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE:
			return basicSetObjective(null, msgs);
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
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__KIND:
			return getKind();
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE:
			return getObjective();
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
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__KIND:
			setKind((ObjectiveKind) newValue);
			return;
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE:
			setObjective((Expression) newValue);
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
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE:
			setObjective((Expression) null);
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
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__KIND:
			return kind != KIND_EDEFAULT;
		case SolverLanguagePackage.OBJECTIVE_DECLARATION__OBJECTIVE:
			return objective != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ObjectiveDeclarationImpl
