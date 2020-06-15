/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam;

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
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalOutput#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalOutput()
 * @model
 * @generated
 */
public interface FunctionalOutput extends FunctionalData {
	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalOutput_OutgoingLinks()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink#getFrom
	 * @model opposite="from" containment="true"
	 * @generated
	 */
	EList<InformationLink> getOutgoingLinks();

} // FunctionalOutput
