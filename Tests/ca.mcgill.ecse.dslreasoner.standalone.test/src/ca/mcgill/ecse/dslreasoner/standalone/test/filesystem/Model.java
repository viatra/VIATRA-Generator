/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.filesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model#getFilesystems <em>Filesystems</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model#getOtherFSObjects <em>Other FS Objects</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Filesystems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filesystems</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filesystems</em>' containment reference.
	 * @see #setFilesystems(FileSystem)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getModel_Filesystems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileSystem getFilesystems();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model#getFilesystems <em>Filesystems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filesystems</em>' containment reference.
	 * @see #getFilesystems()
	 * @generated
	 */
	void setFilesystems(FileSystem value);

	/**
	 * Returns the value of the '<em><b>Other FS Objects</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other FS Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other FS Objects</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getModel_OtherFSObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<FSObject> getOtherFSObjects();

} // Model
