/**
 */
package satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicating Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link satellite.CommunicatingElement#getCommSubsystem <em>Comm Subsystem</em>}</li>
 * </ul>
 *
 * @see satellite.SatellitePackage#getCommunicatingElement()
 * @model abstract="true"
 * @generated
 */
public interface CommunicatingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Comm Subsystem</b></em>' containment reference list.
	 * The list contents are of type {@link satellite.CommSubsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Subsystem</em>' containment reference list.
	 * @see satellite.SatellitePackage#getCommunicatingElement_CommSubsystem()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<CommSubsystem> getCommSubsystem();

} // CommunicatingElement
