/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.viatra.solver.language.model.problem.Multiplicity;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ReferenceDeclarationImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceDeclarationImpl extends RelationImpl implements ReferenceDeclaration {
	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected Relation referenceType;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected ReferenceDeclaration opposite;

	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean containment = CONTAINMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.REFERENCE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getReferenceType() {
		if (referenceType != null && referenceType.eIsProxy()) {
			InternalEObject oldReferenceType = (InternalEObject) referenceType;
			referenceType = (Relation) eResolveProxy(oldReferenceType);
			if (referenceType != oldReferenceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProblemPackage.REFERENCE_DECLARATION__REFERENCE_TYPE, oldReferenceType, referenceType));
			}
		}
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetReferenceType() {
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceType(Relation newReferenceType) {
		Relation oldReferenceType = referenceType;
		referenceType = newReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.REFERENCE_DECLARATION__REFERENCE_TYPE,
					oldReferenceType, referenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDeclaration getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject) opposite;
			opposite = (ReferenceDeclaration) eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProblemPackage.REFERENCE_DECLARATION__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDeclaration basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(ReferenceDeclaration newOpposite) {
		ReferenceDeclaration oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.REFERENCE_DECLARATION__OPPOSITE,
					oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(boolean newContainment) {
		boolean oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.REFERENCE_DECLARATION__CONTAINMENT,
					oldContainment, containment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY, oldMultiplicity, newMultiplicity);
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
	public void setMultiplicity(Multiplicity newMultiplicity) {
		if (newMultiplicity != multiplicity) {
			NotificationChain msgs = null;
			if (multiplicity != null)
				msgs = ((InternalEObject) multiplicity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY, null, msgs);
			if (newMultiplicity != null)
				msgs = ((InternalEObject) newMultiplicity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY, null, msgs);
			msgs = basicSetMultiplicity(newMultiplicity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY,
					newMultiplicity, newMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY:
			return basicSetMultiplicity(null, msgs);
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
		case ProblemPackage.REFERENCE_DECLARATION__REFERENCE_TYPE:
			if (resolve)
				return getReferenceType();
			return basicGetReferenceType();
		case ProblemPackage.REFERENCE_DECLARATION__OPPOSITE:
			if (resolve)
				return getOpposite();
			return basicGetOpposite();
		case ProblemPackage.REFERENCE_DECLARATION__CONTAINMENT:
			return isContainment();
		case ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY:
			return getMultiplicity();
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
		case ProblemPackage.REFERENCE_DECLARATION__REFERENCE_TYPE:
			setReferenceType((Relation) newValue);
			return;
		case ProblemPackage.REFERENCE_DECLARATION__OPPOSITE:
			setOpposite((ReferenceDeclaration) newValue);
			return;
		case ProblemPackage.REFERENCE_DECLARATION__CONTAINMENT:
			setContainment((Boolean) newValue);
			return;
		case ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY:
			setMultiplicity((Multiplicity) newValue);
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
		case ProblemPackage.REFERENCE_DECLARATION__REFERENCE_TYPE:
			setReferenceType((Relation) null);
			return;
		case ProblemPackage.REFERENCE_DECLARATION__OPPOSITE:
			setOpposite((ReferenceDeclaration) null);
			return;
		case ProblemPackage.REFERENCE_DECLARATION__CONTAINMENT:
			setContainment(CONTAINMENT_EDEFAULT);
			return;
		case ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY:
			setMultiplicity((Multiplicity) null);
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
		case ProblemPackage.REFERENCE_DECLARATION__REFERENCE_TYPE:
			return referenceType != null;
		case ProblemPackage.REFERENCE_DECLARATION__OPPOSITE:
			return opposite != null;
		case ProblemPackage.REFERENCE_DECLARATION__CONTAINMENT:
			return containment != CONTAINMENT_EDEFAULT;
		case ProblemPackage.REFERENCE_DECLARATION__MULTIPLICITY:
			return multiplicity != null;
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
		result.append(" (containment: ");
		result.append(containment);
		result.append(')');
		return result.toString();
	}

} //ReferenceDeclarationImpl
