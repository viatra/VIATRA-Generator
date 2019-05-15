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
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getHosts <em>Hosts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getApplications <em>Applications</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getCyberPhysicalSystem_Hosts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsHosts'"
	 * @generated
	 */
	EList<HostInstance> getHosts();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getCyberPhysicalSystem_Applications()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsApplications'"
	 * @generated
	 */
	EList<ApplicationInstance> getApplications();

} // CyberPhysicalSystem
