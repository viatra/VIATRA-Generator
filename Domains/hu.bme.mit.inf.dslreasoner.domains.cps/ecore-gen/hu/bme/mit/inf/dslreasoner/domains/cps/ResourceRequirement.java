/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredMemory <em>Required Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredHdd <em>Required Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getHostType <em>Host Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getResourceRequirement()
 * @model
 * @generated
 */
public interface ResourceRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Memory</em>' attribute.
	 * @see #setRequiredMemory(int)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getResourceRequirement_RequiredMemory()
	 * @model required="true"
	 * @generated
	 */
	int getRequiredMemory();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredMemory <em>Required Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Memory</em>' attribute.
	 * @see #getRequiredMemory()
	 * @generated
	 */
	void setRequiredMemory(int value);

	/**
	 * Returns the value of the '<em><b>Required Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Hdd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Hdd</em>' attribute.
	 * @see #setRequiredHdd(int)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getResourceRequirement_RequiredHdd()
	 * @model required="true"
	 * @generated
	 */
	int getRequiredHdd();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredHdd <em>Required Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Hdd</em>' attribute.
	 * @see #getRequiredHdd()
	 * @generated
	 */
	void setRequiredHdd(int value);

	/**
	 * Returns the value of the '<em><b>Host Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Type</em>' reference.
	 * @see #setHostType(HostType)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getResourceRequirement_HostType()
	 * @model required="true"
	 * @generated
	 */
	HostType getHostType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getHostType <em>Host Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Type</em>' reference.
	 * @see #getHostType()
	 * @generated
	 */
	void setHostType(HostType value);

} // ResourceRequirement
