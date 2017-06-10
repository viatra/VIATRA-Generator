/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getContainmentHierarchies <em>Containment Hierarchies</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicProblemImpl extends MinimalEObjectImpl.Container implements LogicProblem {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assertion> assertions;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinedElement> elements;

	/**
	 * The cached value of the '{@link #getContainmentHierarchies() <em>Containment Hierarchies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentHierarchies()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainmentHierarchy> containmentHierarchies;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicproblemPackage.Literals.LOGIC_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, LogicproblemPackage.LOGIC_PROBLEM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, LogicproblemPackage.LOGIC_PROBLEM__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assertion> getAssertions() {
		if (assertions == null) {
			assertions = new EObjectContainmentEList<Assertion>(Assertion.class, this, LogicproblemPackage.LOGIC_PROBLEM__ASSERTIONS);
		}
		return assertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, LogicproblemPackage.LOGIC_PROBLEM__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<Constant>(Constant.class, this, LogicproblemPackage.LOGIC_PROBLEM__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinedElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<DefinedElement>(DefinedElement.class, this, LogicproblemPackage.LOGIC_PROBLEM__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainmentHierarchy> getContainmentHierarchies() {
		if (containmentHierarchies == null) {
			containmentHierarchies = new EObjectContainmentEList<ContainmentHierarchy>(ContainmentHierarchy.class, this, LogicproblemPackage.LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES);
		}
		return containmentHierarchies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, LogicproblemPackage.LOGIC_PROBLEM__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicproblemPackage.LOGIC_PROBLEM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case LogicproblemPackage.LOGIC_PROBLEM__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case LogicproblemPackage.LOGIC_PROBLEM__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
			case LogicproblemPackage.LOGIC_PROBLEM__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case LogicproblemPackage.LOGIC_PROBLEM__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case LogicproblemPackage.LOGIC_PROBLEM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case LogicproblemPackage.LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES:
				return ((InternalEList<?>)getContainmentHierarchies()).basicRemove(otherEnd, msgs);
			case LogicproblemPackage.LOGIC_PROBLEM__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case LogicproblemPackage.LOGIC_PROBLEM__TYPES:
				return getTypes();
			case LogicproblemPackage.LOGIC_PROBLEM__FUNCTIONS:
				return getFunctions();
			case LogicproblemPackage.LOGIC_PROBLEM__ASSERTIONS:
				return getAssertions();
			case LogicproblemPackage.LOGIC_PROBLEM__RELATIONS:
				return getRelations();
			case LogicproblemPackage.LOGIC_PROBLEM__CONSTANTS:
				return getConstants();
			case LogicproblemPackage.LOGIC_PROBLEM__ELEMENTS:
				return getElements();
			case LogicproblemPackage.LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES:
				return getContainmentHierarchies();
			case LogicproblemPackage.LOGIC_PROBLEM__ANNOTATIONS:
				return getAnnotations();
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
			case LogicproblemPackage.LOGIC_PROBLEM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends Assertion>)newValue);
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends DefinedElement>)newValue);
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES:
				getContainmentHierarchies().clear();
				getContainmentHierarchies().addAll((Collection<? extends ContainmentHierarchy>)newValue);
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case LogicproblemPackage.LOGIC_PROBLEM__TYPES:
				getTypes().clear();
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__FUNCTIONS:
				getFunctions().clear();
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__ASSERTIONS:
				getAssertions().clear();
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__RELATIONS:
				getRelations().clear();
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__CONSTANTS:
				getConstants().clear();
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__ELEMENTS:
				getElements().clear();
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES:
				getContainmentHierarchies().clear();
				return;
			case LogicproblemPackage.LOGIC_PROBLEM__ANNOTATIONS:
				getAnnotations().clear();
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
			case LogicproblemPackage.LOGIC_PROBLEM__TYPES:
				return types != null && !types.isEmpty();
			case LogicproblemPackage.LOGIC_PROBLEM__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case LogicproblemPackage.LOGIC_PROBLEM__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
			case LogicproblemPackage.LOGIC_PROBLEM__RELATIONS:
				return relations != null && !relations.isEmpty();
			case LogicproblemPackage.LOGIC_PROBLEM__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case LogicproblemPackage.LOGIC_PROBLEM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case LogicproblemPackage.LOGIC_PROBLEM__CONTAINMENT_HIERARCHIES:
				return containmentHierarchies != null && !containmentHierarchies.isEmpty();
			case LogicproblemPackage.LOGIC_PROBLEM__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicProblemImpl
