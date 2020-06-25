/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.Request#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getRequest_Requirements()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getRequest
	 * @model opposite="request" containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // Request
