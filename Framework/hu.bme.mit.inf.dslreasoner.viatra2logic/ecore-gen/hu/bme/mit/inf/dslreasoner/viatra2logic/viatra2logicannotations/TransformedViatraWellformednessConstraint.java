/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformed Viatra Wellformedness Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getTransformedViatraWellformednessConstraint()
 * @model
 * @generated
 */
public interface TransformedViatraWellformednessConstraint extends AssertionAnnotation {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(TransfomedViatraQuery)
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getTransformedViatraWellformednessConstraint_Query()
	 * @model required="true"
	 * @generated
	 */
	TransfomedViatraQuery getQuery();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint#getQuery <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(TransfomedViatraQuery value);

} // TransformedViatraWellformednessConstraint
