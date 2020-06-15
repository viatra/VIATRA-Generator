/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface#getData <em>Data</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalInterface()
 * @model
 * @generated
 */
public interface FunctionalInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalInterface_Data()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<FunctionalData> getData();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(FunctionalElement)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalInterface_Element()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement#getInterface
	 * @model opposite="interface" transient="false"
	 * @generated
	 */
	FunctionalElement getElement();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(FunctionalElement value);

} // FunctionalInterface
