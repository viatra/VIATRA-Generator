/**
 */
package crossingScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Blocked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.VisionBlocked#getBlockedBy <em>Blocked By</em>}</li>
 * </ul>
 *
 * @see crossingScenario.CrossingScenarioPackage#getVisionBlocked()
 * @model
 * @generated
 */
public interface VisionBlocked extends SpatialRelation {
	/**
	 * Returns the value of the '<em><b>Blocked By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked By</em>' reference.
	 * @see #setBlockedBy(Actor)
	 * @see crossingScenario.CrossingScenarioPackage#getVisionBlocked_BlockedBy()
	 * @model required="true"
	 * @generated
	 */
	Actor getBlockedBy();

	/**
	 * Sets the value of the '{@link crossingScenario.VisionBlocked#getBlockedBy <em>Blocked By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked By</em>' reference.
	 * @see #getBlockedBy()
	 * @generated
	 */
	void setBlockedBy(Actor value);

} // VisionBlocked
