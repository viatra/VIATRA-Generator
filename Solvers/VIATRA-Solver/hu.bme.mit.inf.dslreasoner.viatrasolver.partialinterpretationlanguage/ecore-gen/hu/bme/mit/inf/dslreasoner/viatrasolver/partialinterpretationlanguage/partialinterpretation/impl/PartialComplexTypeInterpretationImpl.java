/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Complex Type Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl#getSupertypeInterpretation <em>Supertype Interpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl#getInterpretationOf <em>Interpretation Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialComplexTypeInterpretationImpl extends PartialTypeInterpratationImpl implements PartialComplexTypeInterpretation {
	/**
	 * The cached value of the '{@link #getSupertypeInterpretation() <em>Supertype Interpretation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypeInterpretation()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialComplexTypeInterpretation> supertypeInterpretation;

	/**
	 * The cached value of the '{@link #getInterpretationOf() <em>Interpretation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationOf()
	 * @generated
	 * @ordered
	 */
	protected TypeDeclaration interpretationOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialComplexTypeInterpretationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.PARTIAL_COMPLEX_TYPE_INTERPRETATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialComplexTypeInterpretation> getSupertypeInterpretation() {
		if (supertypeInterpretation == null) {
			supertypeInterpretation = new EObjectResolvingEList<PartialComplexTypeInterpretation>(PartialComplexTypeInterpretation.class, this, PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__SUPERTYPE_INTERPRETATION);
		}
		return supertypeInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration getInterpretationOf() {
		if (interpretationOf != null && interpretationOf.eIsProxy()) {
			InternalEObject oldInterpretationOf = (InternalEObject)interpretationOf;
			interpretationOf = (TypeDeclaration)eResolveProxy(oldInterpretationOf);
			if (interpretationOf != oldInterpretationOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
			}
		}
		return interpretationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration basicGetInterpretationOf() {
		return interpretationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretationOf(TypeDeclaration newInterpretationOf) {
		TypeDeclaration oldInterpretationOf = interpretationOf;
		interpretationOf = newInterpretationOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__SUPERTYPE_INTERPRETATION:
				return getSupertypeInterpretation();
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__SUPERTYPE_INTERPRETATION:
				getSupertypeInterpretation().clear();
				getSupertypeInterpretation().addAll((Collection<? extends PartialComplexTypeInterpretation>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF:
				setInterpretationOf((TypeDeclaration)newValue);
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
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__SUPERTYPE_INTERPRETATION:
				getSupertypeInterpretation().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF:
				setInterpretationOf((TypeDeclaration)null);
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
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__SUPERTYPE_INTERPRETATION:
				return supertypeInterpretation != null && !supertypeInterpretation.isEmpty();
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF:
				return interpretationOf != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialComplexTypeInterpretationImpl
