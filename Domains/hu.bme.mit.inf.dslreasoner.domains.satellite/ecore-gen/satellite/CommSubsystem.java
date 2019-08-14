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

} // CommSubsystem
