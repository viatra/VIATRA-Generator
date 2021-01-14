/**
 */
package simpleScenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vision Blocked</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.VisionBlocked#getBlockedBy <em>Blocked By</em>}</li>
 * </ul>
 *
 * @see simpleScenario.SimpleScenarioPackage#getVisionBlocked()
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
	 * @see simpleScenario.SimpleScenarioPackage#getVisionBlocked_BlockedBy()
	 * @model required="true"
	 * @generated
	 */
	Actor getBlockedBy();

	/**
	 * Sets the value of the '{@link simpleScenario.VisionBlocked#getBlockedBy <em>Blocked By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked By</em>' reference.
	 * @see #getBlockedBy()
	 * @generated
	 */
	void setBlockedBy(Actor value);

} // VisionBlocked
