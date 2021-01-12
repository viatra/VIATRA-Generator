/**
 */
package simpleScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.Lane#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link simpleScenario.Lane#getWidth <em>Width</em>}</li>
 *   <li>{@link simpleScenario.Lane#getReferenceCoord <em>Reference Coord</em>}</li>
 *   <li>{@link simpleScenario.Lane#getAdjacent <em>Adjacent</em>}</li>
 *   <li>{@link simpleScenario.Lane#getActors <em>Actors</em>}</li>
 *   <li>{@link simpleScenario.Lane#getNumWidth <em>Num Width</em>}</li>
 * </ul>
 *
 * @see simpleScenario.SimpleScenarioPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends EObject {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleScenario.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see simpleScenario.Orientation
	 * @see #setOrientation(Orientation)
	 * @see simpleScenario.SimpleScenarioPackage#getLane_Orientation()
	 * @model required="true"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link simpleScenario.Lane#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see simpleScenario.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleScenario.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see simpleScenario.Size
	 * @see #setWidth(Size)
	 * @see simpleScenario.SimpleScenarioPackage#getLane_Width()
	 * @model required="true"
	 * @generated
	 */
	Size getWidth();

	/**
	 * Sets the value of the '{@link simpleScenario.Lane#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see simpleScenario.Size
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Size value);

	/**
	 * Returns the value of the '<em><b>Reference Coord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Coord</em>' attribute.
	 * @see #setReferenceCoord(double)
	 * @see simpleScenario.SimpleScenarioPackage#getLane_ReferenceCoord()
	 * @model required="true"
	 * @generated
	 */
	double getReferenceCoord();

	/**
	 * Sets the value of the '{@link simpleScenario.Lane#getReferenceCoord <em>Reference Coord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Coord</em>' attribute.
	 * @see #getReferenceCoord()
	 * @generated
	 */
	void setReferenceCoord(double value);

	/**
	 * Returns the value of the '<em><b>Adjacent</b></em>' reference list.
	 * The list contents are of type {@link simpleScenario.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacent</em>' reference list.
	 * @see simpleScenario.SimpleScenarioPackage#getLane_Adjacent()
	 * @model upper="2"
	 * @generated
	 */
	EList<Lane> getAdjacent();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link simpleScenario.Actor}.
	 * It is bidirectional and its opposite is '{@link simpleScenario.Actor#getPlacedOn <em>Placed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see simpleScenario.SimpleScenarioPackage#getLane_Actors()
	 * @see simpleScenario.Actor#getPlacedOn
	 * @model opposite="placedOn"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Num Width</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Width</em>' attribute.
	 * @see #setNumWidth(double)
	 * @see simpleScenario.SimpleScenarioPackage#getLane_NumWidth()
	 * @model default="0.0" required="true" derived="true"
	 * @generated
	 */
	double getNumWidth();

	/**
	 * Sets the value of the '{@link simpleScenario.Lane#getNumWidth <em>Num Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Width</em>' attribute.
	 * @see #getNumWidth()
	 * @generated
	 */
	void setNumWidth(double value);

} // Lane
