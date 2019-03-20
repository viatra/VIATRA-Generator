/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ModalElement#getExists <em>Exists</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getModalElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * The default value is <code>"MUST"</code>.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exists</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality
	 * @see #setExists(Modality)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getModalElement_Exists()
	 * @model default="MUST"
	 * @generated
	 */
	Modality getExists();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ModalElement#getExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality
	 * @see #getExists()
	 * @generated
	 */
	void setExists(Modality value);

} // ModalElement
