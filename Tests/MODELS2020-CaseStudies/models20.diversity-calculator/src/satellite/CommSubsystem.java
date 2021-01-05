/**
 */
package satellite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link satellite.CommSubsystem#getTarget <em>Target</em>}</li>
 *   <li>{@link satellite.CommSubsystem#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link satellite.CommSubsystem#getPathLength <em>Path Length</em>}</li>
 * </ul>
 *
 * @see satellite.SatellitePackage#getCommSubsystem()
 * @model abstract="true"
 * @generated
 */
public interface CommSubsystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CommSubsystem)
	 * @see satellite.SatellitePackage#getCommSubsystem_Target()
	 * @model
	 * @generated
	 */
	CommSubsystem getTarget();

	/**
	 * Sets the value of the '{@link satellite.CommSubsystem#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CommSubsystem value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see satellite.SatellitePackage#getCommSubsystem_Frequency()
	 * @model required="true"
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link satellite.CommSubsystem#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Path Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Length</em>' attribute.
	 * @see #setPathLength(int)
	 * @see satellite.SatellitePackage#getCommSubsystem_PathLength()
	 * @model required="true"
	 * @generated
	 */
	int getPathLength();

	/**
	 * Sets the value of the '{@link satellite.CommSubsystem#getPathLength <em>Path Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Length</em>' attribute.
	 * @see #getPathLength()
	 * @generated
	 */
	void setPathLength(int value);

} // CommSubsystem
