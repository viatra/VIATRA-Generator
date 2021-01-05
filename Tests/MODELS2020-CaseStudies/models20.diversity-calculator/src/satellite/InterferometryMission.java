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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation Time</em>' attribute.
	 * @see #setObservationTime(int)
	 * @see satellite.SatellitePackage#getInterferometryMission_ObservationTime()
	 * @model required="true"
	 * @generated
	 */
	int getObservationTime();

	/**
	 * Sets the value of the '{@link satellite.InterferometryMission#getObservationTime <em>Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Time</em>' attribute.
	 * @see #getObservationTime()
	 * @generated
	 */
	void setObservationTime(int value);

} // InterferometryMission
