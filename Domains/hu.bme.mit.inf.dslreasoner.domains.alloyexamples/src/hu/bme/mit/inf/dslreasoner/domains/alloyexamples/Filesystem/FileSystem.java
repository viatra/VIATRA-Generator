/**
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem;

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
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem#getRoot <em>Root</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem#getLive <em>Live</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getFileSystem()
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
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getFileSystem_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dir getRoot();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Dir value);

	/**
	 * Returns the value of the '<em><b>Live</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Live</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Live</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getFileSystem_Live()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.alloyexamples.live'"
	 * @generated
	 */
	EList<FSObject> getLive();

} // FileSystem
