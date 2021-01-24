/**
 */
package crossingScenario;

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
 *   <li>{@link crossingScenario.Lane#getReferenceCoord <em>Reference Coord</em>}</li>
 *   <li>{@link crossingScenario.Lane#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see crossingScenario.CrossingScenarioPackage#getLane()
 * @model abstract="true"
 * @generated
 */
public interface Lane extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Coord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Coord</em>' attribute.
	 * @see #setReferenceCoord(double)
	 * @see crossingScenario.CrossingScenarioPackage#getLane_ReferenceCoord()
	 * @model required="true"
	 * @generated
	 */
	double getReferenceCoord();

	/**
	 * Sets the value of the '{@link crossingScenario.Lane#getReferenceCoord <em>Reference Coord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Coord</em>' attribute.
	 * @see #getReferenceCoord()
	 * @generated
	 */
	void setReferenceCoord(double value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link crossingScenario.Actor}.
	 * It is bidirectional and its opposite is '{@link crossingScenario.Actor#getPlacedOn <em>Placed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see crossingScenario.CrossingScenarioPackage#getLane_Actors()
	 * @see crossingScenario.Actor#getPlacedOn
	 * @model opposite="placedOn"
	 * @generated
	 */
	EList<Actor> getActors();

} // Lane
