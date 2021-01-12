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
 *   <li>{@link simpleScenario.SeperationDistance#getNumDistance <em>Num Distance</em>}</li>
 * </ul>
 *
 * @see simpleScenario.SimpleScenarioPackage#getSeperationDistance()
 * @model
 * @generated
 */
public interface SeperationDistance extends SpatialRelation {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleScenario.Distance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see simpleScenario.Distance
	 * @see #setDistance(Distance)
	 * @see simpleScenario.SimpleScenarioPackage#getSeperationDistance_Distance()
	 * @model required="true"
	 * @generated
	 */
	Distance getDistance();

	/**
	 * Sets the value of the '{@link simpleScenario.SeperationDistance#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see simpleScenario.Distance
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Distance value);

	/**
	 * Returns the value of the '<em><b>Num Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Distance</em>' attribute.
	 * @see #setNumDistance(double)
	 * @see simpleScenario.SimpleScenarioPackage#getSeperationDistance_NumDistance()
	 * @model required="true" derived="true"
	 * @generated
	 */
	double getNumDistance();

	/**
	 * Sets the value of the '{@link simpleScenario.SeperationDistance#getNumDistance <em>Num Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Distance</em>' attribute.
	 * @see #getNumDistance()
	 * @generated
	 */
	void setNumDistance(double value);

} // SeperationDistance
