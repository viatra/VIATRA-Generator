/**
 */
package satellite;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link satellite.CommSubsystem#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see satellite.SatellitePackage#getCommSubsystem()
 * @model abstract="true"
 * @generated
 */
public interface CommSubsystem extends EObject {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link satellite.CommSubsystem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CommSubsystem)
	 * @see satellite.SatellitePackage#getCommSubsystem_Target()
	 * @see satellite.CommSubsystem#getSource
	 * @model opposite="source"
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
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link satellite.CommSubsystem}.
	 * It is bidirectional and its opposite is '{@link satellite.CommSubsystem#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see satellite.SatellitePackage#getCommSubsystem_Source()
	 * @see satellite.CommSubsystem#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<CommSubsystem> getSource();

} // CommSubsystem
