/**
 */
package crossingScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision Exists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.CollisionExists#getCollisionTime <em>Collision Time</em>}</li>
 * </ul>
 *
 * @see crossingScenario.CrossingScenarioPackage#getCollisionExists()
 * @model
 * @generated
 */
public interface CollisionExists extends TemporalRelation {
	/**
	 * Returns the value of the '<em><b>Collision Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collision Time</em>' attribute.
	 * @see #setCollisionTime(double)
	 * @see crossingScenario.CrossingScenarioPackage#getCollisionExists_CollisionTime()
	 * @model required="true"
	 * @generated
	 */
	double getCollisionTime();

	/**
	 * Sets the value of the '{@link crossingScenario.CollisionExists#getCollisionTime <em>Collision Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collision Time</em>' attribute.
	 * @see #getCollisionTime()
	 * @generated
	 */
	void setCollisionTime(double value);

} // CollisionExists
