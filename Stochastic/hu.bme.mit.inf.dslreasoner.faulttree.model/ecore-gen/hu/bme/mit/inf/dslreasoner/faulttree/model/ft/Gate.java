/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate#getInputEvents <em>Input Events</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getGate()
 * @model abstract="true"
 * @generated
 */
public interface Gate extends RandomEvent {
	/**
	 * Returns the value of the '<em><b>Input Events</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Events</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getGate_InputEvents()
	 * @model lower="2"
	 * @generated
	 */
	EList<RandomEvent> getInputEvents();

} // Gate
