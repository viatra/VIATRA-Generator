/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyber Physical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getRequests <em>Requests</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getApplicationTypes <em>Application Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getHostTypes <em>Host Types</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getCyberPhysicalSystem()
 * @model
 * @generated
 */
public interface CyberPhysicalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getCyberPhysicalSystem_Requests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Request> getRequests();

	/**
	 * Returns the value of the '<em><b>Application Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Types</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getCyberPhysicalSystem_ApplicationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationType> getApplicationTypes();

	/**
	 * Returns the value of the '<em><b>Host Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Types</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getCyberPhysicalSystem_HostTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HostType> getHostTypes();

} // CyberPhysicalSystem
