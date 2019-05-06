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
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft#getKind <em>Kind</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.domains.satellite.SpacecraftKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SpacecraftKind
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getSpacecraft_Kind()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SpacecraftKind getKind();

} // Spacecraft
