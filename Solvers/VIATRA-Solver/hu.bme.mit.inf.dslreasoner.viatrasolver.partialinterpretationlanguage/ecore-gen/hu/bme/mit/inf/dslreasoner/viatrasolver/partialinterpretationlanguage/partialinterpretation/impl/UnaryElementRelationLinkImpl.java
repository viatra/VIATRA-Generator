/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Element Relation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.UnaryElementRelationLinkImpl#getParam1 <em>Param1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryElementRelationLinkImpl extends RelationLinkImpl implements UnaryElementRelationLink {
	/**
	 * The cached value of the '{@link #getParam1() <em>Param1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam1()
	 * @generated
	 * @ordered
	 */
	protected DefinedElement param1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryElementRelationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.UNARY_ELEMENT_RELATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinedElement getParam1() {
		if (param1 != null && param1.eIsProxy()) {
			InternalEObject oldParam1 = (InternalEObject)param1;
			param1 = (DefinedElement)eResolveProxy(oldParam1);
			if (param1 != oldParam1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK__PARAM1, oldParam1, param1));
			}
		}
		return param1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedElement basicGetParam1() {
		return param1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParam1(DefinedElement newParam1) {
		DefinedElement oldParam1 = param1;
		param1 = newParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK__PARAM1, oldParam1, param1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK__PARAM1:
				if (resolve) return getParam1();
				return basicGetParam1();
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
			case PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK__PARAM1:
				setParam1((DefinedElement)newValue);
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
			case PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK__PARAM1:
				setParam1((DefinedElement)null);
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
			case PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK__PARAM1:
				return param1 != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryElementRelationLinkImpl
