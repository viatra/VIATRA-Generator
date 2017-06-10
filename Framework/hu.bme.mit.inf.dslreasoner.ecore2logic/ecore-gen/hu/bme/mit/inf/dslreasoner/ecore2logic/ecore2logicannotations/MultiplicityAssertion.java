/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.MultiplicityAssertion#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getMultiplicityAssertion()
 * @model
 * @generated
 */
public interface MultiplicityAssertion extends AssertionAnnotation {

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getMultiplicityAssertion_Relation()
	 * @model required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.MultiplicityAssertion#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);
} // MultiplicityAssertion
