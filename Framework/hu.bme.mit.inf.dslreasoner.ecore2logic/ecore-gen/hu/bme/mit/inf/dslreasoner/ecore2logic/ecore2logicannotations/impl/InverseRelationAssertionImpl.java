/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AssertionAnnotationImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Relation Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.InverseRelationAssertionImpl#getInverseA <em>Inverse A</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.InverseRelationAssertionImpl#getInverseB <em>Inverse B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InverseRelationAssertionImpl extends AssertionAnnotationImpl implements InverseRelationAssertion {
	/**
	 * The cached value of the '{@link #getInverseA() <em>Inverse A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseA()
	 * @generated
	 * @ordered
	 */
	protected Relation inverseA;
	/**
	 * The cached value of the '{@link #getInverseB() <em>Inverse B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseB()
	 * @generated
	 * @ordered
	 */
	protected Relation inverseB;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverseRelationAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecore2logicannotationsPackage.Literals.INVERSE_RELATION_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getInverseA() {
		if (inverseA != null && inverseA.eIsProxy()) {
			InternalEObject oldInverseA = (InternalEObject)inverseA;
			inverseA = (Relation)eResolveProxy(oldInverseA);
			if (inverseA != oldInverseA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_A, oldInverseA, inverseA));
			}
		}
		return inverseA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetInverseA() {
		return inverseA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseA(Relation newInverseA) {
		Relation oldInverseA = inverseA;
		inverseA = newInverseA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_A, oldInverseA, inverseA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getInverseB() {
		if (inverseB != null && inverseB.eIsProxy()) {
			InternalEObject oldInverseB = (InternalEObject)inverseB;
			inverseB = (Relation)eResolveProxy(oldInverseB);
			if (inverseB != oldInverseB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_B, oldInverseB, inverseB));
			}
		}
		return inverseB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetInverseB() {
		return inverseB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseB(Relation newInverseB) {
		Relation oldInverseB = inverseB;
		inverseB = newInverseB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_B, oldInverseB, inverseB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_A:
				if (resolve) return getInverseA();
				return basicGetInverseA();
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_B:
				if (resolve) return getInverseB();
				return basicGetInverseB();
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
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_A:
				setInverseA((Relation)newValue);
				return;
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_B:
				setInverseB((Relation)newValue);
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
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_A:
				setInverseA((Relation)null);
				return;
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_B:
				setInverseB((Relation)null);
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
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_A:
				return inverseA != null;
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION__INVERSE_B:
				return inverseB != null;
		}
		return super.eIsSet(featureID);
	}

} //InverseRelationAssertionImpl
