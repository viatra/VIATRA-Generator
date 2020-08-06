/**
 */
package modes3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modes3.Modes3ModelRoot#getId <em>Id</em>}</li>
 *   <li>{@link modes3.Modes3ModelRoot#getTrains <em>Trains</em>}</li>
 *   <li>{@link modes3.Modes3ModelRoot#getSegments <em>Segments</em>}</li>
 *   <li>{@link modes3.Modes3ModelRoot#getTurnouts <em>Turnouts</em>}</li>
 * </ul>
 *
 * @see modes3.Modes3Package#getModes3ModelRoot()
 * @model
 * @generated
 */
public interface Modes3ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see modes3.Modes3Package#getModes3ModelRoot_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link modes3.Modes3ModelRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Trains</b></em>' containment reference list.
	 * The list contents are of type {@link modes3.Train}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trains</em>' containment reference list.
	 * @see modes3.Modes3Package#getModes3ModelRoot_Trains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Train> getTrains();

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link modes3.Segment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see modes3.Modes3Package#getModes3ModelRoot_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * Returns the value of the '<em><b>Turnouts</b></em>' containment reference list.
	 * The list contents are of type {@link modes3.Turnout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turnouts</em>' containment reference list.
	 * @see modes3.Modes3Package#getModes3ModelRoot_Turnouts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Turnout> getTurnouts();

} // Modes3ModelRoot
