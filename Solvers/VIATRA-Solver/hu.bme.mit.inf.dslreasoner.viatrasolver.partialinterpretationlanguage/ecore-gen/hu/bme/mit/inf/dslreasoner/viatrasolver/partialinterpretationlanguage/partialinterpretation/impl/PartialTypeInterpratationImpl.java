/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Type Interpratation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialTypeInterpratationImpl#getInterpretationOf <em>Interpretation Of</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialTypeInterpratationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialTypeInterpratationImpl#getSupertypeInterpretation <em>Supertype Interpretation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialTypeInterpratationImpl extends MinimalEObjectImpl.Container implements PartialTypeInterpratation {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinedElement> elements;

	/**
	 * The cached value of the '{@link #getSupertypeInterpretation() <em>Supertype Interpretation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypeInterpretation()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialTypeInterpratation> supertypeInterpretation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialTypeInterpratationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.PARTIAL_TYPE_INTERPRATATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinedElement> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<DefinedElement>(DefinedElement.class, this, PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialTypeInterpratation> getSupertypeInterpretation() {
		if (supertypeInterpretation == null) {
			supertypeInterpretation = new EObjectResolvingEList<PartialTypeInterpratation>(PartialTypeInterpratation.class, this, PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION);
		}
		return supertypeInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF:
				if (resolve) return getInterpretationOf();
				return basicGetInterpretationOf();
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__ELEMENTS:
				return getElements();
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION:
				return getSupertypeInterpretation();
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
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF:
				setInterpretationOf((TypeDeclaration)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends DefinedElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION:
				getSupertypeInterpretation().clear();
				getSupertypeInterpretation().addAll((Collection<? extends PartialTypeInterpratation>)newValue);
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
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF:
				setInterpretationOf((TypeDeclaration)null);
				return;
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__ELEMENTS:
				getElements().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION:
				getSupertypeInterpretation().clear();
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
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF:
				return interpretationOf != null;
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION:
				return supertypeInterpretation != null && !supertypeInterpretation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PartialTypeInterpratationImpl
