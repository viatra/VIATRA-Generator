/**
 */
package functionalarchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.FunctionalOutput#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionalOutput()
 * @model
 * @generated
 */
public interface FunctionalOutput extends FunctionalData {
	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * The list contents are of type {@link functionalarchitecture.InformationLink}.
	 * It is bidirectional and its opposite is '{@link functionalarchitecture.InformationLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' containment reference list.
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionalOutput_OutgoingLinks()
	 * @see functionalarchitecture.InformationLink#getFrom
	 * @model opposite="from" containment="true"
	 * @generated
	 */
	EList<InformationLink> getOutgoingLinks();

} // FunctionalOutput
