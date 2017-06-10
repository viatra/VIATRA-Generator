/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Constant Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialConstantInterpretationImpl#getInterpretationOf <em>Interpretation Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialConstantInterpretationImpl extends MinimalEObjectImpl.Container implements PartialConstantInterpretation {
	/**
	 * The cached value of the '{@link #getInterpretationOf() <em>Interpretation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationOf()
	 * @generated
	 * @ordered
	 */
	protected ConstantDeclaration interpretationOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialConstantInterpretationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.PARTIAL_CONSTANT_INTERPRETATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantDeclaration getInterpretationOf() {
		if (interpretationOf != null && interpretationOf.eIsProxy()) {
			InternalEObject oldInterpretationOf = (InternalEObject)interpretationOf;
			interpretationOf = (ConstantDeclaration)eResolveProxy(oldInterpretationOf);
			if (interpretationOf != oldInterpretationOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
			}
		}
		return interpretationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantDeclaration basicGetInterpretationOf() {
		return interpretationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretationOf(ConstantDeclaration newInterpretationOf) {
		ConstantDeclaration oldInterpretationOf = interpretationOf;
		interpretationOf = newInterpretationOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF:
				if (resolve) return getInterpretationOf();
				return basicGetInterpretationOf();
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
			case PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF:
				setInterpretationOf((ConstantDeclaration)newValue);
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
			case PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF:
				setInterpretationOf((ConstantDeclaration)null);
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
			case PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF:
				return interpretationOf != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialConstantInterpretationImpl
