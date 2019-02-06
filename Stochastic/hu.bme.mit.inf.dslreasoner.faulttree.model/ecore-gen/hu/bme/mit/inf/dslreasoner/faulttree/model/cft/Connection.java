/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getInput <em>Input</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' container reference.
	 * @see #setInput(Input)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getConnection_Input()
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input#getIncomingConnections
	 * @model opposite="incomingConnections" required="true" transient="false"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getInput <em>Input</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' container reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getConnection_Output()
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getOutgoingConnections
	 * @model opposite="outgoingConnections" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

} // Connection
