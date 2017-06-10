/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

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
 * An implementation of the model object '<em><b>Containment Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl#getTypesOrderedInHierarchy <em>Types Ordered In Hierarchy</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl#getContainmentFunctions <em>Containment Functions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl#getContainmentRelations <em>Containment Relations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.ContainmentHierarchyImpl#getRootConstant <em>Root Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainmentHierarchyImpl extends MinimalEObjectImpl.Container implements ContainmentHierarchy {
	/**
	 * The cached value of the '{@link #getTypesOrderedInHierarchy() <em>Types Ordered In Hierarchy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesOrderedInHierarchy()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> typesOrderedInHierarchy;

	/**
	 * The cached value of the '{@link #getContainmentFunctions() <em>Containment Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> containmentFunctions;

	/**
	 * The cached value of the '{@link #getContainmentRelations() <em>Containment Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> containmentRelations;

	/**
	 * The cached value of the '{@link #getRootConstant() <em>Root Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant rootConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicproblemPackage.Literals.CONTAINMENT_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypesOrderedInHierarchy() {
		if (typesOrderedInHierarchy == null) {
			typesOrderedInHierarchy = new EObjectResolvingEList<Type>(Type.class, this, LogicproblemPackage.CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY);
		}
		return typesOrderedInHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getContainmentFunctions() {
		if (containmentFunctions == null) {
			containmentFunctions = new EObjectResolvingEList<Function>(Function.class, this, LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS);
		}
		return containmentFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getContainmentRelations() {
		if (containmentRelations == null) {
			containmentRelations = new EObjectResolvingEList<Relation>(Relation.class, this, LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS);
		}
		return containmentRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getRootConstant() {
		if (rootConstant != null && rootConstant.eIsProxy()) {
			InternalEObject oldRootConstant = (InternalEObject)rootConstant;
			rootConstant = (Constant)eResolveProxy(oldRootConstant);
			if (rootConstant != oldRootConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicproblemPackage.CONTAINMENT_HIERARCHY__ROOT_CONSTANT, oldRootConstant, rootConstant));
			}
		}
		return rootConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant basicGetRootConstant() {
		return rootConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootConstant(Constant newRootConstant) {
		Constant oldRootConstant = rootConstant;
		rootConstant = newRootConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicproblemPackage.CONTAINMENT_HIERARCHY__ROOT_CONSTANT, oldRootConstant, rootConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY:
				return getTypesOrderedInHierarchy();
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS:
				return getContainmentFunctions();
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS:
				return getContainmentRelations();
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__ROOT_CONSTANT:
				if (resolve) return getRootConstant();
				return basicGetRootConstant();
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
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY:
				getTypesOrderedInHierarchy().clear();
				getTypesOrderedInHierarchy().addAll((Collection<? extends Type>)newValue);
				return;
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS:
				getContainmentFunctions().clear();
				getContainmentFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS:
				getContainmentRelations().clear();
				getContainmentRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__ROOT_CONSTANT:
				setRootConstant((Constant)newValue);
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
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY:
				getTypesOrderedInHierarchy().clear();
				return;
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS:
				getContainmentFunctions().clear();
				return;
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS:
				getContainmentRelations().clear();
				return;
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__ROOT_CONSTANT:
				setRootConstant((Constant)null);
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
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__TYPES_ORDERED_IN_HIERARCHY:
				return typesOrderedInHierarchy != null && !typesOrderedInHierarchy.isEmpty();
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_FUNCTIONS:
				return containmentFunctions != null && !containmentFunctions.isEmpty();
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__CONTAINMENT_RELATIONS:
				return containmentRelations != null && !containmentRelations.isEmpty();
			case LogicproblemPackage.CONTAINMENT_HIERARCHY__ROOT_CONSTANT:
				return rootConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainmentHierarchyImpl
