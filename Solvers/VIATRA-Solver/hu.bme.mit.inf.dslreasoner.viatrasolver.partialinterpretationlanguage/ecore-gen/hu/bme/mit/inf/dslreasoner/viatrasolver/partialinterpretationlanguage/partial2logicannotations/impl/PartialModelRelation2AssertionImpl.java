/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.AssertionAnnotationImpl;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Model Relation2 Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl.PartialModelRelation2AssertionImpl#getTargetRelation <em>Target Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialModelRelation2AssertionImpl extends AssertionAnnotationImpl implements PartialModelRelation2Assertion {
	/**
	 * The cached value of the '{@link #getTargetRelation() <em>Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRelation()
	 * @generated
	 * @ordered
	 */
	protected RelationDeclaration targetRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialModelRelation2AssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Partial2logicannotationsPackage.Literals.PARTIAL_MODEL_RELATION2_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration getTargetRelation() {
		if (targetRelation != null && targetRelation.eIsProxy()) {
			InternalEObject oldTargetRelation = (InternalEObject)targetRelation;
			targetRelation = (RelationDeclaration)eResolveProxy(oldTargetRelation);
			if (targetRelation != oldTargetRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Partial2logicannotationsPackage.PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION, oldTargetRelation, targetRelation));
			}
		}
		return targetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration basicGetTargetRelation() {
		return targetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRelation(RelationDeclaration newTargetRelation) {
		RelationDeclaration oldTargetRelation = targetRelation;
		targetRelation = newTargetRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Partial2logicannotationsPackage.PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION, oldTargetRelation, targetRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Partial2logicannotationsPackage.PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION:
				if (resolve) return getTargetRelation();
				return basicGetTargetRelation();
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
			case Partial2logicannotationsPackage.PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION:
				setTargetRelation((RelationDeclaration)newValue);
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
			case Partial2logicannotationsPackage.PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION:
				setTargetRelation((RelationDeclaration)null);
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
			case Partial2logicannotationsPackage.PARTIAL_MODEL_RELATION2_ASSERTION__TARGET_RELATION:
				return targetRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialModelRelation2AssertionImpl
