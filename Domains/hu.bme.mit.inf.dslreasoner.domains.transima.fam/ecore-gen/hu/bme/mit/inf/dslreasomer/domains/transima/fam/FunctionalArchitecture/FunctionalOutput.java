/**
 */
package hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture;

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
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalOutput#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage#getFunctionalOutput()
 * @model
 * @generated
 */
public interface FunctionalOutput extends FunctionalData {
	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.InformationLink}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.InformationLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage#getFunctionalOutput_OutgoingLinks()
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.InformationLink#getFrom
	 * @model opposite="from" containment="true"
	 * @generated
	 */
	EList<InformationLink> getOutgoingLinks();

} // FunctionalOutput
