/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl#getMinNewElements <em>Min New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl#getMaxNewElements <em>Max New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl#getTargetTypeInterpretation <em>Target Type Interpretation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope {
	/**
	 * The default value of the '{@link #getMinNewElements() <em>Min New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNewElements()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_NEW_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinNewElements() <em>Min New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNewElements()
	 * @generated
	 * @ordered
	 */
	protected int minNewElements = MIN_NEW_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNewElements() <em>Max New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewElements()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NEW_ELEMENTS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaxNewElements() <em>Max New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewElements()
	 * @generated
	 * @ordered
	 */
	protected int maxNewElements = MAX_NEW_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetTypeInterpretation() <em>Target Type Interpretation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTypeInterpretation()
	 * @generated
	 * @ordered
	 */
	protected PartialTypeInterpratation targetTypeInterpretation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinNewElements() {
		return minNewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinNewElements(int newMinNewElements) {
		int oldMinNewElements = minNewElements;
		minNewElements = newMinNewElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS, oldMinNewElements, minNewElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNewElements() {
		return maxNewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNewElements(int newMaxNewElements) {
		int oldMaxNewElements = maxNewElements;
		maxNewElements = newMaxNewElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.SCOPE__MAX_NEW_ELEMENTS, oldMaxNewElements, maxNewElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialTypeInterpratation getTargetTypeInterpretation() {
		if (targetTypeInterpretation != null && targetTypeInterpretation.eIsProxy()) {
			InternalEObject oldTargetTypeInterpretation = (InternalEObject)targetTypeInterpretation;
			targetTypeInterpretation = (PartialTypeInterpratation)eResolveProxy(oldTargetTypeInterpretation);
			if (targetTypeInterpretation != oldTargetTypeInterpretation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION, oldTargetTypeInterpretation, targetTypeInterpretation));
			}
		}
		return targetTypeInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialTypeInterpratation basicGetTargetTypeInterpretation() {
		return targetTypeInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTypeInterpretation(PartialTypeInterpratation newTargetTypeInterpretation) {
		PartialTypeInterpratation oldTargetTypeInterpretation = targetTypeInterpretation;
		targetTypeInterpretation = newTargetTypeInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION, oldTargetTypeInterpretation, targetTypeInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS:
				return getMinNewElements();
			case PartialinterpretationPackage.SCOPE__MAX_NEW_ELEMENTS:
				return getMaxNewElements();
			case PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION:
				if (resolve) return getTargetTypeInterpretation();
				return basicGetTargetTypeInterpretation();
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
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS:
				setMinNewElements((Integer)newValue);
				return;
			case PartialinterpretationPackage.SCOPE__MAX_NEW_ELEMENTS:
				setMaxNewElements((Integer)newValue);
				return;
			case PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION:
				setTargetTypeInterpretation((PartialTypeInterpratation)newValue);
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
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS:
				setMinNewElements(MIN_NEW_ELEMENTS_EDEFAULT);
				return;
			case PartialinterpretationPackage.SCOPE__MAX_NEW_ELEMENTS:
				setMaxNewElements(MAX_NEW_ELEMENTS_EDEFAULT);
				return;
			case PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION:
				setTargetTypeInterpretation((PartialTypeInterpratation)null);
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
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS:
				return minNewElements != MIN_NEW_ELEMENTS_EDEFAULT;
			case PartialinterpretationPackage.SCOPE__MAX_NEW_ELEMENTS:
				return maxNewElements != MAX_NEW_ELEMENTS_EDEFAULT;
			case PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION:
				return targetTypeInterpretation != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minNewElements: ");
		result.append(minNewElements);
		result.append(", maxNewElements: ");
		result.append(maxNewElements);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
