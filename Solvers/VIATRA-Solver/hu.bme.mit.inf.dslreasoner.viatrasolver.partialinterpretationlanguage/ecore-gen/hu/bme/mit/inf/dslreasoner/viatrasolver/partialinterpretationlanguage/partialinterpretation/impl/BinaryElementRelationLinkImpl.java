/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Element Relation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BinaryElementRelationLinkImpl#getParam1 <em>Param1</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BinaryElementRelationLinkImpl#getParam2 <em>Param2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryElementRelationLinkImpl extends RelationLinkImpl implements BinaryElementRelationLink {
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
	 * The cached value of the '{@link #getParam2() <em>Param2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam2()
	 * @generated
	 * @ordered
	 */
	protected DefinedElement param2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryElementRelationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.BINARY_ELEMENT_RELATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedElement getParam1() {
		if (param1 != null && param1.eIsProxy()) {
			InternalEObject oldParam1 = (InternalEObject)param1;
			param1 = (DefinedElement)eResolveProxy(oldParam1);
			if (param1 != oldParam1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM1, oldParam1, param1));
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
	public void setParam1(DefinedElement newParam1) {
		DefinedElement oldParam1 = param1;
		param1 = newParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM1, oldParam1, param1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedElement getParam2() {
		if (param2 != null && param2.eIsProxy()) {
			InternalEObject oldParam2 = (InternalEObject)param2;
			param2 = (DefinedElement)eResolveProxy(oldParam2);
			if (param2 != oldParam2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM2, oldParam2, param2));
			}
		}
		return param2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedElement basicGetParam2() {
		return param2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam2(DefinedElement newParam2) {
		DefinedElement oldParam2 = param2;
		param2 = newParam2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM2, oldParam2, param2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM1:
				if (resolve) return getParam1();
				return basicGetParam1();
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM2:
				if (resolve) return getParam2();
				return basicGetParam2();
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
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM1:
				setParam1((DefinedElement)newValue);
				return;
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM2:
				setParam2((DefinedElement)newValue);
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
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM1:
				setParam1((DefinedElement)null);
				return;
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM2:
				setParam2((DefinedElement)null);
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
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM1:
				return param1 != null;
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK__PARAM2:
				return param2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryElementRelationLinkImpl
