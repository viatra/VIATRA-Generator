/**
 */
package hu.bme.mit.inf.smartgrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.smartgrid.Entity#getCommunicationParent <em>Communication Parent</em>}</li>
 *   <li>{@link hu.bme.mit.inf.smartgrid.Entity#getCommunicationChild <em>Communication Child</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.smartgrid.SmartgridPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Communication Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.smartgrid.Entity#getCommunicationChild <em>Communication Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Parent</em>' container reference.
	 * @see #setCommunicationParent(Entity)
	 * @see hu.bme.mit.inf.smartgrid.SmartgridPackage#getEntity_CommunicationParent()
	 * @see hu.bme.mit.inf.smartgrid.Entity#getCommunicationChild
	 * @model opposite="communicationChild" transient="false"
	 * @generated
	 */
	Entity getCommunicationParent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.smartgrid.Entity#getCommunicationParent <em>Communication Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Parent</em>' container reference.
	 * @see #getCommunicationParent()
	 * @generated
	 */
	void setCommunicationParent(Entity value);

	/**
	 * Returns the value of the '<em><b>Communication Child</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.smartgrid.Entity}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.smartgrid.Entity#getCommunicationParent <em>Communication Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Child</em>' containment reference list.
	 * @see hu.bme.mit.inf.smartgrid.SmartgridPackage#getEntity_CommunicationChild()
	 * @see hu.bme.mit.inf.smartgrid.Entity#getCommunicationParent
	 * @model opposite="communicationParent" containment="true"
	 * @generated
	 */
	EList<Entity> getCommunicationChild();

} // Entity
