/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getEventDeclaration <em>Event Declaration</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Declaration</em>' reference.
	 * @see #setEventDeclaration(EventDeclaration)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getOutput_EventDeclaration()
	 * @model required="true"
	 * @generated
	 */
	EventDeclaration getEventDeclaration();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getEventDeclaration <em>Event Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Declaration</em>' reference.
	 * @see #getEventDeclaration()
	 * @generated
	 */
	void setEventDeclaration(EventDeclaration value);

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getOutput_OutgoingConnections()
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getOutput_Component()
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component#getOutputs
	 * @model opposite="outputs" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // Output
