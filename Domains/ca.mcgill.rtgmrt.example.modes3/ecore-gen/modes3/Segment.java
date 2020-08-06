/**
 */
package modes3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modes3.Segment#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link modes3.Segment#getOccupiedBy <em>Occupied By</em>}</li>
 *   <li>{@link modes3.Segment#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see modes3.Modes3Package#getSegment()
 * @model
 * @generated
 */
public interface Segment extends EObject {
	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link modes3.Segment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see modes3.Modes3Package#getSegment_ConnectedTo()
	 * @model upper="2"
	 * @generated
	 */
	EList<Segment> getConnectedTo();

	/**
	 * Returns the value of the '<em><b>Occupied By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modes3.Train#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied By</em>' reference.
	 * @see #setOccupiedBy(Train)
	 * @see modes3.Modes3Package#getSegment_OccupiedBy()
	 * @see modes3.Train#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	Train getOccupiedBy();

	/**
	 * Sets the value of the '{@link modes3.Segment#getOccupiedBy <em>Occupied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied By</em>' reference.
	 * @see #getOccupiedBy()
	 * @generated
	 */
	void setOccupiedBy(Train value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see modes3.Modes3Package#getSegment_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link modes3.Segment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Segment
