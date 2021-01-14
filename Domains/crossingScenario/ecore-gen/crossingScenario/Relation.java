/**
 */
package crossingScenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see crossingScenario.CrossingScenarioPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Actor)
	 * @see crossingScenario.CrossingScenarioPackage#getRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Actor getTarget();

	/**
	 * Sets the value of the '{@link crossingScenario.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Actor value);

} // Relation
