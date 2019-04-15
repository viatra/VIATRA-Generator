/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommSubsystem#getBand <em>Band</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommSubsystem#getGain <em>Gain</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getCommSubsystem()
 * @model
 * @generated
 */
public interface CommSubsystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Band</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.domains.satellite.TransceiverBand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Band</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.TransceiverBand
	 * @see #setBand(TransceiverBand)
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getCommSubsystem_Band()
	 * @model required="true"
	 * @generated
	 */
	TransceiverBand getBand();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommSubsystem#getBand <em>Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Band</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.TransceiverBand
	 * @see #getBand()
	 * @generated
	 */
	void setBand(TransceiverBand value);

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.domains.satellite.AntennaGain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.AntennaGain
	 * @see #setGain(AntennaGain)
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getCommSubsystem_Gain()
	 * @model required="true"
	 * @generated
	 */
	AntennaGain getGain();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommSubsystem#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.AntennaGain
	 * @see #getGain()
	 * @generated
	 */
	void setGain(AntennaGain value);

} // CommSubsystem
