/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.filesystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FS Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getFSObject()
 * @model abstract="true"
 * @generated
 */
public interface FSObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Dir)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getFSObject_Parent()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir#getContents
	 * @model opposite="contents" transient="false"
	 * @generated
	 */
	Dir getParent();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Dir value);

} // FSObject
