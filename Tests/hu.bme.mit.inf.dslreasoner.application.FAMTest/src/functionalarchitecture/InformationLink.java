/**
 */
package functionalarchitecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.InformationLink#getFrom <em>From</em>}</li>
 *   <li>{@link functionalarchitecture.InformationLink#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see functionalarchitecture.FunctionalarchitecturePackage#getInformationLink()
 * @model
 * @generated
 */
public interface InformationLink extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link functionalarchitecture.FunctionalOutput#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' container reference.
	 * @see #setFrom(FunctionalOutput)
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getInformationLink_From()
	 * @see functionalarchitecture.FunctionalOutput#getOutgoingLinks
	 * @model opposite="outgoingLinks" transient="false"
	 * @generated
	 */
	FunctionalOutput getFrom();

	/**
	 * Sets the value of the '{@link functionalarchitecture.InformationLink#getFrom <em>From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' container reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FunctionalOutput value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link functionalarchitecture.FunctionalInput#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(FunctionalInput)
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getInformationLink_To()
	 * @see functionalarchitecture.FunctionalInput#getIncomingLinks
	 * @model opposite="IncomingLinks" required="true"
	 * @generated
	 */
	FunctionalInput getTo();

	/**
	 * Sets the value of the '{@link functionalarchitecture.InformationLink#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(FunctionalInput value);

} // InformationLink
