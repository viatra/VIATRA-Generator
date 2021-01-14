/**
 */
package crossingScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separation Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.SeparationDistance#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see crossingScenario.CrossingScenarioPackage#getSeparationDistance()
 * @model
 * @generated
 */
public interface SeparationDistance extends SpatialRelation {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The literals are from the enumeration {@link crossingScenario.Distance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see crossingScenario.Distance
	 * @see #setDistance(Distance)
	 * @see crossingScenario.CrossingScenarioPackage#getSeparationDistance_Distance()
	 * @model required="true"
	 * @generated
	 */
	Distance getDistance();

	/**
	 * Sets the value of the '{@link crossingScenario.SeparationDistance#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see crossingScenario.Distance
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Distance value);

} // SeparationDistance
