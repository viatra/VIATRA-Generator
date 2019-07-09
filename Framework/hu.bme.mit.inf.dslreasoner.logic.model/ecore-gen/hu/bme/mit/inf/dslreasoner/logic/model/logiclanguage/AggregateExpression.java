/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression#getRelation <em>Relation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getAggregateExpression()
 * @model abstract="true"
 * @generated
 */
public interface AggregateExpression extends Term {
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
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getAggregateExpression_Relation()
	 * @model
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregatedParameterSubstitution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getAggregateExpression_ParameterSubstitution()
	 * @model containment="true"
	 * @generated
	 */
	EList<AggregatedParameterSubstitution> getParameterSubstitution();

} // AggregateExpression
