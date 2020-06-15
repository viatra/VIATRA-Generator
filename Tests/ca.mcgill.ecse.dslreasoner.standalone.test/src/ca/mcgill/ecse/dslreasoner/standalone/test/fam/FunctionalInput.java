/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInput#getIncomingLinks <em>Incoming Links</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalInput()
 * @model
 * @generated
 */
public interface FunctionalInput extends FunctionalData {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalInput_IncomingLinks()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<InformationLink> getIncomingLinks();

} // FunctionalInput
