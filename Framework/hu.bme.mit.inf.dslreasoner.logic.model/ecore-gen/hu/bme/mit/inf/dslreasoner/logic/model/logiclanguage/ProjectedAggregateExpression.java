/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projected Aggregate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression#getProjectionIndex <em>Projection Index</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getProjectedAggregateExpression()
 * @model abstract="true"
 * @generated
 */
public interface ProjectedAggregateExpression extends AggregateExpression {
	/**
	 * Returns the value of the '<em><b>Projection Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection Index</em>' attribute.
	 * @see #setProjectionIndex(int)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getProjectedAggregateExpression_ProjectionIndex()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getProjectionIndex();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression#getProjectionIndex <em>Projection Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection Index</em>' attribute.
	 * @see #getProjectionIndex()
	 * @generated
	 */
	void setProjectionIndex(int value);

} // ProjectedAggregateExpression
