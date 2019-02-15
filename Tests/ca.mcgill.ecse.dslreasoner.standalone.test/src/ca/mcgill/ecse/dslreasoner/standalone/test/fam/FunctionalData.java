/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getTerminator <em>Terminator</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalData()
 * @model abstract="true"
 * @generated
 */
public interface FunctionalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Terminator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminator</em>' containment reference.
	 * @see #setTerminator(FAMTerminator)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalData_Terminator()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator#getData
	 * @model opposite="data" containment="true"
	 * @generated
	 */
	FAMTerminator getTerminator();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getTerminator <em>Terminator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminator</em>' containment reference.
	 * @see #getTerminator()
	 * @generated
	 */
	void setTerminator(FAMTerminator value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(FunctionalInterface)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunctionalData_Interface()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface#getData
	 * @model opposite="data" transient="false"
	 * @generated
	 */
	FunctionalInterface getInterface();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(FunctionalInterface value);

} // FunctionalData
