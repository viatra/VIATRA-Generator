/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getRequest <em>Request</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getCount <em>Count</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Request#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' container reference.
	 * @see #setRequest(Request)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getRequirement_Request()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Request#getRequirements
	 * @model opposite="requirements" required="true" transient="false"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getRequest <em>Request</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' container reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getRequirement_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ApplicationType)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getRequirement_Type()
	 * @model
	 * @generated
	 */
	ApplicationType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getRequirement_Instances()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getRequirement
	 * @model opposite="requirement"
	 * @generated
	 */
	EList<ApplicationInstance> getInstances();

} // Requirement
