/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getAvailableMemory <em>Available Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getAvailableHdd <em>Available Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getTotalMemory <em>Total Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getTotalHdd <em>Total Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostInstance()
 * @model
 * @generated
 */
public interface HostInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(HostType)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostInstance_Type()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getInstances
	 * @model opposite="instances" required="true" transient="false"
	 * @generated
	 */
	HostType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(HostType value);

	/**
	 * Returns the value of the '<em><b>Available Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Memory</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostInstance_AvailableMemory()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.cps.queries.availableMemory'"
	 * @generated
	 */
	int getAvailableMemory();

	/**
	 * Returns the value of the '<em><b>Available Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Hdd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Hdd</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostInstance_AvailableHdd()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.cps.queries.availableHdd'"
	 * @generated
	 */
	int getAvailableHdd();

	/**
	 * Returns the value of the '<em><b>Total Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Memory</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostInstance_TotalMemory()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.cps.queries.totalMemory'"
	 * @generated
	 */
	int getTotalMemory();

	/**
	 * Returns the value of the '<em><b>Total Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Hdd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Hdd</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostInstance_TotalHdd()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.cps.queries.totalHdd'"
	 * @generated
	 */
	int getTotalHdd();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostInstance_Applications()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getAllocatedTo
	 * @model opposite="allocatedTo"
	 * @generated
	 */
	EList<ApplicationInstance> getApplications();

} // HostInstance
