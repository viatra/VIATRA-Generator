/**
 */
package simpleScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleScenario.SimpleScenario#getXSize <em>XSize</em>}</li>
 *   <li>{@link simpleScenario.SimpleScenario#getYSize <em>YSize</em>}</li>
 *   <li>{@link simpleScenario.SimpleScenario#getActors <em>Actors</em>}</li>
 *   <li>{@link simpleScenario.SimpleScenario#getLanes <em>Lanes</em>}</li>
 * </ul>
 *
 * @see simpleScenario.SimpleScenarioPackage#getSimpleScenario()
 * @model
 * @generated
 */
public interface SimpleScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSize</em>' attribute.
	 * @see #setXSize(double)
	 * @see simpleScenario.SimpleScenarioPackage#getSimpleScenario_XSize()
	 * @model
	 * @generated
	 */
	double getXSize();

	/**
	 * Sets the value of the '{@link simpleScenario.SimpleScenario#getXSize <em>XSize</em>}' attribute.
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
	 * @see simpleScenario.SimpleScenarioPackage#getSimpleScenario_YSize()
	 * @model
	 * @generated
	 */
	double getYSize();

	/**
	 * Sets the value of the '{@link simpleScenario.SimpleScenario#getYSize <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSize</em>' attribute.
	 * @see #getYSize()
	 * @generated
	 */
	void setYSize(double value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link simpleScenario.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see simpleScenario.SimpleScenarioPackage#getSimpleScenario_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link simpleScenario.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' containment reference list.
	 * @see simpleScenario.SimpleScenarioPackage#getSimpleScenario_Lanes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lane> getLanes();

} // SimpleScenario
