/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Model Relation2 Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion#getLinks <em>Links</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion#getTargetRelation <em>Target Relation</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsPackage#getPartialModelRelation2Assertion()
 * @model
 * @generated
 */
public interface PartialModelRelation2Assertion extends AssertionAnnotation {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsPackage#getPartialModelRelation2Assertion_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Target Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Relation</em>' reference.
	 * @see #setTargetRelation(RelationDeclaration)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsPackage#getPartialModelRelation2Assertion_TargetRelation()
	 * @model required="true"
	 * @generated
	 */
	RelationDeclaration getTargetRelation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion#getTargetRelation <em>Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Relation</em>' reference.
	 * @see #getTargetRelation()
	 * @generated
	 */
	void setTargetRelation(RelationDeclaration value);

} // PartialModelRelation2Assertion
