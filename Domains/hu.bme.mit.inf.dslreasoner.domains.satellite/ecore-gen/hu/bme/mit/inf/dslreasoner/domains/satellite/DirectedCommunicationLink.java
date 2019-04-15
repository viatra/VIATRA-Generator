/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getDirectedCommunicationLink()
 * @model
 * @generated
 */
public interface DirectedCommunicationLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CommSubsystem)
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getDirectedCommunicationLink_Source()
	 * @model required="true"
	 * @generated
	 */
	CommSubsystem getSource();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CommSubsystem value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CommSubsystem)
	 * @see hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage#getDirectedCommunicationLink_Target()
	 * @model required="true"
	 * @generated
	 */
	CommSubsystem getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CommSubsystem value);

} // DirectedCommunicationLink
