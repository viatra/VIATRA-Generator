/**
 */
package simpleScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seperation Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.SeperationDistance#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see simpleScenario.SimpleScenarioPackage#getSeperationDistance()
 * @model
 * @generated
 */
public interface SeperationDistance extends SpatialRelation {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleScenario.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see simpleScenario.Size
	 * @see #setDistance(Size)
	 * @see simpleScenario.SimpleScenarioPackage#getSeperationDistance_Distance()
	 * @model required="true"
	 * @generated
	 */
	Size getDistance();

	/**
	 * Sets the value of the '{@link simpleScenario.SeperationDistance#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see simpleScenario.Size
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Size value);

} // SeperationDistance
