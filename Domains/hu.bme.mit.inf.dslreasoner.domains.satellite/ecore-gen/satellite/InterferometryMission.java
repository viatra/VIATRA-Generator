/**
 */
package satellite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interferometry Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link satellite.InterferometryMission#getObservationTime <em>Observation Time</em>}</li>
 * </ul>
 *
 * @see satellite.SatellitePackage#getInterferometryMission()
 * @model
 * @generated
 */
public interface InterferometryMission extends ConstellationMission {
	/**
	 * Returns the value of the '<em><b>Observation Time</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation Time</em>' attribute.
	 * @see #setObservationTime(float)
	 * @see satellite.SatellitePackage#getInterferometryMission_ObservationTime()
	 * @model default="2.0" required="true"
	 * @generated
	 */
	float getObservationTime();

	/**
	 * Sets the value of the '{@link satellite.InterferometryMission#getObservationTime <em>Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Time</em>' attribute.
	 * @see #getObservationTime()
	 * @generated
	 */
	void setObservationTime(float value);

} // InterferometryMission
