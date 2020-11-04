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
