/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Element Relation Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink#getParam1 <em>Param1</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getUnaryElementRelationLink()
 * @model
 * @generated
 */
public interface UnaryElementRelationLink extends RelationLink {
	/**
	 * Returns the value of the '<em><b>Param1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param1</em>' reference.
	 * @see #setParam1(DefinedElement)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getUnaryElementRelationLink_Param1()
	 * @model required="true"
	 * @generated
	 */
	DefinedElement getParam1();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink#getParam1 <em>Param1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param1</em>' reference.
	 * @see #getParam1()
	 * @generated
	 */
	void setParam1(DefinedElement value);

} // UnaryElementRelationLink
