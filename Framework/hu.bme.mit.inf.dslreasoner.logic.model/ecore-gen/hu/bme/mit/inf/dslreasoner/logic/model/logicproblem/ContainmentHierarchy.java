/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getTypesOrderedInHierarchy <em>Types Ordered In Hierarchy</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getContainmentFunctions <em>Containment Functions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getContainmentRelations <em>Containment Relations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getRootConstant <em>Root Constant</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#getContainmentHierarchy()
 * @model
 * @generated
 */
public interface ContainmentHierarchy extends EObject {
	/**
	 * Returns the value of the '<em><b>Types Ordered In Hierarchy</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Ordered In Hierarchy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Ordered In Hierarchy</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#getContainmentHierarchy_TypesOrderedInHierarchy()
	 * @model
	 * @generated
	 */
	EList<Type> getTypesOrderedInHierarchy();

	/**
	 * Returns the value of the '<em><b>Containment Functions</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Functions</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#getContainmentHierarchy_ContainmentFunctions()
	 * @model
	 * @generated
	 */
	EList<Function> getContainmentFunctions();

	/**
	 * Returns the value of the '<em><b>Containment Relations</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Relations</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#getContainmentHierarchy_ContainmentRelations()
	 * @model
	 * @generated
	 */
	EList<Relation> getContainmentRelations();

	/**
	 * Returns the value of the '<em><b>Root Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Constant</em>' reference.
	 * @see #setRootConstant(Constant)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#getContainmentHierarchy_RootConstant()
	 * @model
	 * @generated
	 */
	Constant getRootConstant();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy#getRootConstant <em>Root Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Constant</em>' reference.
	 * @see #getRootConstant()
	 * @generated
	 */
	void setRootConstant(Constant value);

} // ContainmentHierarchy
