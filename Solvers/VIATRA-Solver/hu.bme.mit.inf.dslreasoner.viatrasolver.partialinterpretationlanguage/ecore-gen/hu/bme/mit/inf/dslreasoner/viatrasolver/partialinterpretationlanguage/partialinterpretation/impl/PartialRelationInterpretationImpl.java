/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Relation Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl#getInterpretationOf <em>Interpretation Of</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl#getRelationlinks <em>Relationlinks</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl#getParam1 <em>Param1</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl#getParam2 <em>Param2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialRelationInterpretationImpl extends MinimalEObjectImpl.Container implements PartialRelationInterpretation {
	/**
	 * The cached value of the '{@link #getInterpretationOf() <em>Interpretation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretationOf()
	 * @generated
	 * @ordered
	 */
	protected RelationDeclaration interpretationOf;

	/**
	 * The cached value of the '{@link #getRelationlinks() <em>Relationlinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationlinks()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationLink> relationlinks;

	/**
	 * The cached value of the '{@link #getParam1() <em>Param1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam1()
	 * @generated
	 * @ordered
	 */
	protected TypeReference param1;

	/**
	 * The cached value of the '{@link #getParam2() <em>Param2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam2()
	 * @generated
	 * @ordered
	 */
	protected TypeReference param2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialRelationInterpretationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.PARTIAL_RELATION_INTERPRETATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration getInterpretationOf() {
		if (interpretationOf != null && interpretationOf.eIsProxy()) {
			InternalEObject oldInterpretationOf = (InternalEObject)interpretationOf;
			interpretationOf = (RelationDeclaration)eResolveProxy(oldInterpretationOf);
			if (interpretationOf != oldInterpretationOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
			}
		}
		return interpretationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationDeclaration basicGetInterpretationOf() {
		return interpretationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretationOf(RelationDeclaration newInterpretationOf) {
		RelationDeclaration oldInterpretationOf = interpretationOf;
		interpretationOf = newInterpretationOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF, oldInterpretationOf, interpretationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationLink> getRelationlinks() {
		if (relationlinks == null) {
			relationlinks = new EObjectContainmentEList<RelationLink>(RelationLink.class, this, PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS);
		}
		return relationlinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getParam1() {
		if (param1 != null && param1.eIsProxy()) {
			InternalEObject oldParam1 = (InternalEObject)param1;
			param1 = (TypeReference)eResolveProxy(oldParam1);
			if (param1 != oldParam1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM1, oldParam1, param1));
			}
		}
		return param1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetParam1() {
		return param1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam1(TypeReference newParam1) {
		TypeReference oldParam1 = param1;
		param1 = newParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM1, oldParam1, param1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getParam2() {
		if (param2 != null && param2.eIsProxy()) {
			InternalEObject oldParam2 = (InternalEObject)param2;
			param2 = (TypeReference)eResolveProxy(oldParam2);
			if (param2 != oldParam2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM2, oldParam2, param2));
			}
		}
		return param2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference basicGetParam2() {
		return param2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam2(TypeReference newParam2) {
		TypeReference oldParam2 = param2;
		param2 = newParam2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM2, oldParam2, param2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS:
				return ((InternalEList<?>)getRelationlinks()).basicRemove(otherEnd, msgs);
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
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF:
				if (resolve) return getInterpretationOf();
				return basicGetInterpretationOf();
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS:
				return getRelationlinks();
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM1:
				if (resolve) return getParam1();
				return basicGetParam1();
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM2:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF:
				setInterpretationOf((RelationDeclaration)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS:
				getRelationlinks().clear();
				getRelationlinks().addAll((Collection<? extends RelationLink>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM1:
				setParam1((TypeReference)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM2:
				setParam2((TypeReference)newValue);
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
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF:
				setInterpretationOf((RelationDeclaration)null);
				return;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS:
				getRelationlinks().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM1:
				setParam1((TypeReference)null);
				return;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM2:
				setParam2((TypeReference)null);
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
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF:
				return interpretationOf != null;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS:
				return relationlinks != null && !relationlinks.isEmpty();
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM1:
				return param1 != null;
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION__PARAM2:
				return param2 != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialRelationInterpretationImpl
