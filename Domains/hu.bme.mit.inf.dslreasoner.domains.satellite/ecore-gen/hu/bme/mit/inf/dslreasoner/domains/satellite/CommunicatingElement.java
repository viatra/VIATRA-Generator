/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicating Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommunicatingElement#getCommSubsystem <em>Comm Subsystem</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommunicatingElement#getCommunicationLink <em>Communication Link</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getCommunicatingElement()
 * @model abstract="true"
 * @generated
 */
public interface CommunicatingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommSubsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Subsystem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Subsystem</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getCommunicatingElement_CommSubsystem()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<CommSubsystem> getCommSubsystem();

	/**
	 * Returns the value of the '<em><b>Communication Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link</em>' containment reference.
	 * @see #setCommunicationLink(DirectedCommunicationLink)
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getCommunicatingElement_CommunicationLink()
	 * @model containment="true"
	 * @generated
	 */
	DirectedCommunicationLink getCommunicationLink();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.satellite.CommunicatingElement#getCommunicationLink <em>Communication Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Link</em>' containment reference.
	 * @see #getCommunicationLink()
	 * @generated
	 */
	void setCommunicationLink(DirectedCommunicationLink value);

} // CommunicatingElement
