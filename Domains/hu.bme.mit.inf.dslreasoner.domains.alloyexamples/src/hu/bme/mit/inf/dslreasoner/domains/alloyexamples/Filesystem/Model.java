/**
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem;

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
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model#getFilesystems <em>Filesystems</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model#getOtherFSObjects <em>Other FS Objects</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getModel()
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
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getModel_Filesystems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FileSystem getFilesystems();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model#getFilesystems <em>Filesystems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filesystems</em>' containment reference.
	 * @see #getFilesystems()
	 * @generated
	 */
	void setFilesystems(FileSystem value);

	/**
	 * Returns the value of the '<em><b>Other FS Objects</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other FS Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other FS Objects</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getModel_OtherFSObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<FSObject> getOtherFSObjects();

} // Model
