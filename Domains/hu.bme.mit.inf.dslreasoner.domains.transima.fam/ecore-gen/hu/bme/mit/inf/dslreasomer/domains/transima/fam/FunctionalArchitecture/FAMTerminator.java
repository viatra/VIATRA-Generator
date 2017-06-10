/**
 */
package hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture;

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
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FAMTerminator#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage#getFAMTerminator()
 * @model
 * @generated
 */
public interface FAMTerminator extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalData#getTerminator <em>Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' container reference.
	 * @see #setData(FunctionalData)
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage#getFAMTerminator_Data()
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalData#getTerminator
	 * @model opposite="terminator" transient="false"
	 * @generated
	 */
	FunctionalData getData();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FAMTerminator#getData <em>Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' container reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(FunctionalData value);

} // FAMTerminator
