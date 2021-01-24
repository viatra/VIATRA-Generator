/**
 */
package crossingScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crossing Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crossingScenario.CrossingScenario#getXSize <em>XSize</em>}</li>
 *   <li>{@link crossingScenario.CrossingScenario#getYSize <em>YSize</em>}</li>
 *   <li>{@link crossingScenario.CrossingScenario#getActors <em>Actors</em>}</li>
 *   <li>{@link crossingScenario.CrossingScenario#getLanes <em>Lanes</em>}</li>
 *   <li>{@link crossingScenario.CrossingScenario#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link crossingScenario.CrossingScenario#getRelations <em>Relations</em>}</li>
 *   <li>{@link crossingScenario.CrossingScenario#getMaxXSpeed <em>Max XSpeed</em>}</li>
 *   <li>{@link crossingScenario.CrossingScenario#getMaxYSpeed <em>Max YSpeed</em>}</li>
 * </ul>
 *
 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario()
 * @model
 * @generated
 */
public interface CrossingScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSize</em>' attribute.
	 * @see #setXSize(double)
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_XSize()
	 * @model
	 * @generated
	 */
	double getXSize();

	/**
	 * Sets the value of the '{@link crossingScenario.CrossingScenario#getXSize <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSize</em>' attribute.
	 * @see #getXSize()
	 * @generated
	 */
	void setXSize(double value);

	/**
	 * Returns the value of the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YSize</em>' attribute.
	 * @see #setYSize(double)
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_YSize()
	 * @model
	 * @generated
	 */
	double getYSize();

	/**
	 * Sets the value of the '{@link crossingScenario.CrossingScenario#getYSize <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSize</em>' attribute.
	 * @see #getYSize()
	 * @generated
	 */
	void setYSize(double value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link crossingScenario.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link crossingScenario.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' containment reference list.
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_Lanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lane> getLanes();

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(double)
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_MaxTime()
	 * @model
	 * @generated
	 */
	double getMaxTime();

	/**
	 * Sets the value of the '{@link crossingScenario.CrossingScenario#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(double value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link crossingScenario.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Max XSpeed</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max XSpeed</em>' attribute.
	 * @see #setMaxXSpeed(double)
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_MaxXSpeed()
	 * @model default="0.0"
	 * @generated
	 */
	double getMaxXSpeed();

	/**
	 * Sets the value of the '{@link crossingScenario.CrossingScenario#getMaxXSpeed <em>Max XSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max XSpeed</em>' attribute.
	 * @see #getMaxXSpeed()
	 * @generated
	 */
	void setMaxXSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Max YSpeed</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max YSpeed</em>' attribute.
	 * @see #setMaxYSpeed(double)
	 * @see crossingScenario.CrossingScenarioPackage#getCrossingScenario_MaxYSpeed()
	 * @model default="0.0"
	 * @generated
	 */
	double getMaxYSpeed();

	/**
	 * Sets the value of the '{@link crossingScenario.CrossingScenario#getMaxYSpeed <em>Max YSpeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max YSpeed</em>' attribute.
	 * @see #getMaxYSpeed()
	 * @generated
	 */
	void setMaxYSpeed(double value);

} // CrossingScenario
