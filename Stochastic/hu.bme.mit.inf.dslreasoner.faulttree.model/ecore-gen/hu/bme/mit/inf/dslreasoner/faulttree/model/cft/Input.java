/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getComponent <em>Component</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Event</em>' reference.
	 * @see #setInputEvent(InputEvent)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getInput_InputEvent()
	 * @model required="true"
	 * @generated
	 */
	InputEvent getInputEvent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getInputEvent <em>Input Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event</em>' reference.
	 * @see #getInputEvent()
	 * @generated
	 */
	void setInputEvent(InputEvent value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getInput_Component()
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getInputs
	 * @model opposite="inputs" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getInput_IncomingConnections()
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getInput
	 * @model opposite="input" containment="true"
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

} // Input
