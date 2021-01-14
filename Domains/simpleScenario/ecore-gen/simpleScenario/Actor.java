/**
 */
package simpleScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.Actor#getXPos <em>XPos</em>}</li>
 *   <li>{@link simpleScenario.Actor#getYPos <em>YPos</em>}</li>
 *   <li>{@link simpleScenario.Actor#getLength <em>Length</em>}</li>
 *   <li>{@link simpleScenario.Actor#getWidth <em>Width</em>}</li>
 *   <li>{@link simpleScenario.Actor#getXSpeed <em>XSpeed</em>}</li>
 *   <li>{@link simpleScenario.Actor#getRelations <em>Relations</em>}</li>
 *   <li>{@link simpleScenario.Actor#getPlacedOn <em>Placed On</em>}</li>
 *   <li>{@link simpleScenario.Actor#getYSpeed <em>YSpeed</em>}</li>
 * </ul>
 *
 * @see simpleScenario.SimpleScenarioPackage#getActor()
 * @model abstract="true"
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPos</em>' attribute.
	 * @see #setXPos(double)
	 * @see simpleScenario.SimpleScenarioPackage#getActor_XPos()
	 * @model required="true"
	 * @generated
	 */
	double getXPos();

	/**
	 * Sets the value of the '{@link simpleScenario.Actor#getXPos <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPos</em>' attribute.
	 * @see #getXPos()
	 * @generated
	 */
	void setXPos(double value);

	/**
	 * Returns the value of the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPos</em>' attribute.
	 * @see #setYPos(double)
	 * @see simpleScenario.SimpleScenarioPackage#getActor_YPos()
	 * @model required="true"
	 * @generated
	 */
	double getYPos();

	/**
	 * Sets the value of the '{@link simpleScenario.Actor#getYPos <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPos</em>' attribute.
	 * @see #getYPos()
	 * @generated
	 */
	void setYPos(double value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see simpleScenario.SimpleScenarioPackage#getActor_Length()
	 * @model default="0.0" required="true" derived="true"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link simpleScenario.Actor#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see simpleScenario.SimpleScenarioPackage#getActor_Width()
	 * @model required="true" derived="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link simpleScenario.Actor#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>XSpeed</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSpeed</em>' attribute.
	 * @see #setXSpeed(double)
	 * @see simpleScenario.SimpleScenarioPackage#getActor_XSpeed()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getXSpeed();

	/**
	 * Sets the value of the '{@link simpleScenario.Actor#getXSpeed <em>XSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSpeed</em>' attribute.
	 * @see #getXSpeed()
	 * @generated
	 */
	void setXSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link simpleScenario.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see simpleScenario.SimpleScenarioPackage#getActor_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Placed On</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simpleScenario.Lane#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placed On</em>' reference.
	 * @see #setPlacedOn(Lane)
	 * @see simpleScenario.SimpleScenarioPackage#getActor_PlacedOn()
	 * @see simpleScenario.Lane#getActors
	 * @model opposite="actors" required="true"
	 * @generated
	 */
	Lane getPlacedOn();

	/**
	 * Sets the value of the '{@link simpleScenario.Actor#getPlacedOn <em>Placed On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placed On</em>' reference.
	 * @see #getPlacedOn()
	 * @generated
	 */
	void setPlacedOn(Lane value);

	/**
	 * Returns the value of the '<em><b>YSpeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YSpeed</em>' attribute.
	 * @see #setYSpeed(double)
	 * @see simpleScenario.SimpleScenarioPackage#getActor_YSpeed()
	 * @model required="true"
	 * @generated
	 */
	double getYSpeed();

	/**
	 * Sets the value of the '{@link simpleScenario.Actor#getYSpeed <em>YSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSpeed</em>' attribute.
	 * @see #getYSpeed()
	 * @generated
	 */
	void setYSpeed(double value);

} // Actor
