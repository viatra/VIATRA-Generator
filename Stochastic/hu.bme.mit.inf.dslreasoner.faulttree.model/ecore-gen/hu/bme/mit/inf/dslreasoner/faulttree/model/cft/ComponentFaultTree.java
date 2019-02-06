/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree#getComponents <em>Components</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree#getTopEvent <em>Top Event</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentFaultTree()
 * @model
 * @generated
 */
public interface ComponentFaultTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentFaultTree_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Top Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Event</em>' reference.
	 * @see #setTopEvent(Output)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getComponentFaultTree_TopEvent()
	 * @model required="true"
	 * @generated
	 */
	Output getTopEvent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree#getTopEvent <em>Top Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Event</em>' reference.
	 * @see #getTopEvent()
	 * @generated
	 */
	void setTopEvent(Output value);

} // ComponentFaultTree
