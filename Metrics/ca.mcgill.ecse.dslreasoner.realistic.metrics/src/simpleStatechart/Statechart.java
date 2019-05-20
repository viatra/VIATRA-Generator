/**
 */
package simpleStatechart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleStatechart.Statechart#getState <em>State</em>}</li>
 *   <li>{@link simpleStatechart.Statechart#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see simpleStatechart.SimpleStatechartPackage#getStatechart()
 * @model
 * @generated
 */
public interface Statechart extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link simpleStatechart.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see simpleStatechart.SimpleStatechartPackage#getStatechart_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Entry)
	 * @see simpleStatechart.SimpleStatechartPackage#getStatechart_Entry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entry getEntry();

	/**
	 * Sets the value of the '{@link simpleStatechart.Statechart#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Entry value);

} // Statechart
