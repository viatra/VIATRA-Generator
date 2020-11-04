/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl#getMinNewElementsHeuristic <em>Min New Elements Heuristic</em>}</li>
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
	 * The default value of the '{@link #getMinNewElementsHeuristic() <em>Min New Elements Heuristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNewElementsHeuristic()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_NEW_ELEMENTS_HEURISTIC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinNewElementsHeuristic() <em>Min New Elements Heuristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNewElementsHeuristic()
	 * @generated
	 * @ordered
	 */
	protected int minNewElementsHeuristic = MIN_NEW_ELEMENTS_HEURISTIC_EDEFAULT;

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
	@Override
	public int getMinNewElements() {
		return minNewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public int getMaxNewElements() {
		return maxNewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	public NotificationChain basicSetTargetTypeInterpretation(PartialTypeInterpratation newTargetTypeInterpretation, NotificationChain msgs) {
		PartialTypeInterpratation oldTargetTypeInterpretation = targetTypeInterpretation;
		targetTypeInterpretation = newTargetTypeInterpretation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION, oldTargetTypeInterpretation, newTargetTypeInterpretation);
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
	public void setTargetTypeInterpretation(PartialTypeInterpratation newTargetTypeInterpretation) {
		if (newTargetTypeInterpretation != targetTypeInterpretation) {
			NotificationChain msgs = null;
			if (targetTypeInterpretation != null)
				msgs = ((InternalEObject)targetTypeInterpretation).eInverseRemove(this, PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SCOPES, PartialTypeInterpratation.class, msgs);
			if (newTargetTypeInterpretation != null)
				msgs = ((InternalEObject)newTargetTypeInterpretation).eInverseAdd(this, PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SCOPES, PartialTypeInterpratation.class, msgs);
			msgs = basicSetTargetTypeInterpretation(newTargetTypeInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION, newTargetTypeInterpretation, newTargetTypeInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinNewElementsHeuristic() {
		return minNewElementsHeuristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinNewElementsHeuristic(int newMinNewElementsHeuristic) {
		int oldMinNewElementsHeuristic = minNewElementsHeuristic;
		minNewElementsHeuristic = newMinNewElementsHeuristic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS_HEURISTIC, oldMinNewElementsHeuristic, minNewElementsHeuristic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION:
				if (targetTypeInterpretation != null)
					msgs = ((InternalEObject)targetTypeInterpretation).eInverseRemove(this, PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION__SCOPES, PartialTypeInterpratation.class, msgs);
				return basicSetTargetTypeInterpretation((PartialTypeInterpratation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION:
				return basicSetTargetTypeInterpretation(null, msgs);
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
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS:
				return getMinNewElements();
			case PartialinterpretationPackage.SCOPE__MAX_NEW_ELEMENTS:
				return getMaxNewElements();
			case PartialinterpretationPackage.SCOPE__TARGET_TYPE_INTERPRETATION:
				if (resolve) return getTargetTypeInterpretation();
				return basicGetTargetTypeInterpretation();
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS_HEURISTIC:
				return getMinNewElementsHeuristic();
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
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS_HEURISTIC:
				setMinNewElementsHeuristic((Integer)newValue);
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
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS_HEURISTIC:
				setMinNewElementsHeuristic(MIN_NEW_ELEMENTS_HEURISTIC_EDEFAULT);
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
			case PartialinterpretationPackage.SCOPE__MIN_NEW_ELEMENTS_HEURISTIC:
				return minNewElementsHeuristic != MIN_NEW_ELEMENTS_HEURISTIC_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minNewElements: ");
		result.append(minNewElements);
		result.append(", maxNewElements: ");
		result.append(maxNewElements);
		result.append(", minNewElementsHeuristic: ");
		result.append(minNewElementsHeuristic);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
