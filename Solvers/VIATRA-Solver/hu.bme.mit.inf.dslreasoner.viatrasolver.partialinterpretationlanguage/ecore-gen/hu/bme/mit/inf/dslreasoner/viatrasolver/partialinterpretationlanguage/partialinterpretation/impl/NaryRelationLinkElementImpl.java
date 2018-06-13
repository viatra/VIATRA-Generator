/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nary Relation Link Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkElementImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkElementImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaryRelationLinkElementImpl extends MinimalEObjectImpl.Container implements NaryRelationLinkElement {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected DefinedElement param;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaryRelationLinkElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.NARY_RELATION_LINK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedElement getParam() {
		if (param != null && param.eIsProxy()) {
			InternalEObject oldParam = (InternalEObject)param;
			param = (DefinedElement)eResolveProxy(oldParam);
			if (param != oldParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__PARAM, oldParam, param));
			}
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedElement basicGetParam() {
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(DefinedElement newParam) {
		DefinedElement oldParam = param;
		param = newParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__PARAM, oldParam, param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__INDEX:
				return getIndex();
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__PARAM:
				if (resolve) return getParam();
				return basicGetParam();
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
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__INDEX:
				setIndex((Integer)newValue);
				return;
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__PARAM:
				setParam((DefinedElement)newValue);
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
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__PARAM:
				setParam((DefinedElement)null);
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
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__INDEX:
				return index != INDEX_EDEFAULT;
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT__PARAM:
				return param != null;
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //NaryRelationLinkElementImpl
