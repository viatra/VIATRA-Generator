/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree#getEvents <em>Events</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree#getTopEvent <em>Top Event</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getFaultTree()
 * @model
 * @generated
 */
public interface FaultTree extends ReliabilityModel {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getFaultTree_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<RandomEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Top Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Event</em>' reference.
	 * @see #setTopEvent(RandomEvent)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getFaultTree_TopEvent()
	 * @model required="true"
	 * @generated
	 */
	RandomEvent getTopEvent();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree#getTopEvent <em>Top Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Event</em>' reference.
	 * @see #getTopEvent()
	 * @generated
	 */
	void setTopEvent(RandomEvent value);

} // FaultTree
