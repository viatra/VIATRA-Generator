/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FAM Terminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFAMTerminator()
 * @model
 * @generated
 */
public interface FAMTerminator extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getTerminator <em>Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' container reference.
	 * @see #setData(FunctionalData)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFAMTerminator_Data()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData#getTerminator
	 * @model opposite="terminator" transient="false"
	 * @generated
	 */
	FunctionalData getData();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator#getData <em>Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' container reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(FunctionalData value);

} // FAMTerminator
