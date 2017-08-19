/**
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getDir()
 * @model
 * @generated
 */
public interface Dir extends FSObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage#getDir_Contents()
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FSObject> getContents();

} // Dir
