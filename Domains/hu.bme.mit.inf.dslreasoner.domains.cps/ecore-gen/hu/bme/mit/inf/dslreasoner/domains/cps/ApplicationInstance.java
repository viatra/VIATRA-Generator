/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getApplicationInstance()
 * @model
 * @generated
 */
public interface ApplicationInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getApplicationInstance_Requirement()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(ApplicationType)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getApplicationInstance_Type()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType#getInstances
	 * @model opposite="instances" required="true" transient="false"
	 * @generated
	 */
	ApplicationType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Allocated To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated To</em>' reference.
	 * @see #setAllocatedTo(HostInstance)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getApplicationInstance_AllocatedTo()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getApplications
	 * @model opposite="applications" required="true"
	 * @generated
	 */
	HostInstance getAllocatedTo();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated To</em>' reference.
	 * @see #getAllocatedTo()
	 * @generated
	 */
	void setAllocatedTo(HostInstance value);

} // ApplicationInstance
