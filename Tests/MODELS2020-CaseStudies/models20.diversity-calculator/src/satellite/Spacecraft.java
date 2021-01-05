/**
 */
package satellite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link satellite.Spacecraft#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see satellite.SatellitePackage#getSpacecraft()
 * @model abstract="true"
 * @generated
 */
public interface Spacecraft extends CommunicatingElement {
	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference.
	 * @see #setPayload(Payload)
	 * @see satellite.SatellitePackage#getSpacecraft_Payload()
	 * @model containment="true"
	 * @generated
	 */
	Payload getPayload();

	/**
	 * Sets the value of the '{@link satellite.Spacecraft#getPayload <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' containment reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(Payload value);

} // Spacecraft
