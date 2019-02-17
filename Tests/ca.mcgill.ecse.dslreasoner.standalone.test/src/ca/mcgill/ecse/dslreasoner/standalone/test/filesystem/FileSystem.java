/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.filesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem#getRoot <em>Root</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem#getLive <em>Live</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getFileSystem()
 * @model
 * @generated
 */
public interface FileSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Dir)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getFileSystem_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dir getRoot();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Dir value);

	/**
	 * Returns the value of the '<em><b>Live</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Live</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Live</em>' reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getFileSystem_Live()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<FSObject> getLive();

} // FileSystem
