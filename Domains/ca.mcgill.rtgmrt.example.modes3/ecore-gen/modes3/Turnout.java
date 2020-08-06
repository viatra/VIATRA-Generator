/**
 */
package modes3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modes3.Turnout#getStraight <em>Straight</em>}</li>
 *   <li>{@link modes3.Turnout#getDivergent <em>Divergent</em>}</li>
 * </ul>
 *
 * @see modes3.Modes3Package#getTurnout()
 * @model
 * @generated
 */
public interface Turnout extends Segment {
	/**
	 * Returns the value of the '<em><b>Straight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Straight</em>' reference.
	 * @see #setStraight(Segment)
	 * @see modes3.Modes3Package#getTurnout_Straight()
	 * @model required="true"
	 * @generated
	 */
	Segment getStraight();

	/**
	 * Sets the value of the '{@link modes3.Turnout#getStraight <em>Straight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Straight</em>' reference.
	 * @see #getStraight()
	 * @generated
	 */
	void setStraight(Segment value);

	/**
	 * Returns the value of the '<em><b>Divergent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divergent</em>' reference.
	 * @see #setDivergent(Segment)
	 * @see modes3.Modes3Package#getTurnout_Divergent()
	 * @model required="true"
	 * @generated
	 */
	Segment getDivergent();

	/**
	 * Sets the value of the '{@link modes3.Turnout#getDivergent <em>Divergent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divergent</em>' reference.
	 * @see #getDivergent()
	 * @generated
	 */
	void setDivergent(Segment value);

} // Turnout
