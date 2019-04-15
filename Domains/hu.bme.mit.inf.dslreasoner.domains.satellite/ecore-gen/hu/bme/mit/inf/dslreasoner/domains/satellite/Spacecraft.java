/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getSpacecraft()
 * @model abstract="true"
 * @generated
 */
public interface Spacecraft extends CommunicatingElement {
	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference.
	 * @see #setPayload(Payload)
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getSpacecraft_Payload()
	 * @model containment="true"
	 * @generated
	 */
	Payload getPayload();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft#getPayload <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' containment reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(Payload value);

} // Spacecraft
