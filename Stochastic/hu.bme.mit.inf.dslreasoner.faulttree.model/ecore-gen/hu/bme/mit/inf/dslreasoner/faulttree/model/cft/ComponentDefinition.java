/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getInputEvents <em>Input Events</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getEventDefinitions <em>Event Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getOutputEvents <em>Output Events</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentDefinition()
 * @model
 * @generated
 */
public interface ComponentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Events</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Events</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentDefinition_InputEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntputEvent> getInputEvents();

	/**
	 * Returns the value of the '<em><b>Event Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definitions</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentDefinition_EventDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventDefinition> getEventDefinitions();

	/**
	 * Returns the value of the '<em><b>Output Events</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Events</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentDefinition_OutputEvents()
	 * @model
	 * @generated
	 */
	EList<EventDeclaration> getOutputEvents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentDefinition
