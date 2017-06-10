/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Relation Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseA <em>Inverse A</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseB <em>Inverse B</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getInverseRelationAssertion()
 * @model
 * @generated
 */
public interface InverseRelationAssertion extends AssertionAnnotation {
	/**
	 * Returns the value of the '<em><b>Inverse A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse A</em>' reference.
	 * @see #setInverseA(Relation)
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getInverseRelationAssertion_InverseA()
	 * @model required="true"
	 * @generated
	 */
	Relation getInverseA();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseA <em>Inverse A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse A</em>' reference.
	 * @see #getInverseA()
	 * @generated
	 */
	void setInverseA(Relation value);

	/**
	 * Returns the value of the '<em><b>Inverse B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse B</em>' reference.
	 * @see #setInverseB(Relation)
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getInverseRelationAssertion_InverseB()
	 * @model required="true"
	 * @generated
	 */
	Relation getInverseB();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseB <em>Inverse B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse B</em>' reference.
	 * @see #getInverseB()
	 * @generated
	 */
	void setInverseB(Relation value);

} // InverseRelationAssertion
