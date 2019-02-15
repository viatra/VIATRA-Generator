/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.filesystem;

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
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getDir()
 * @model
 * @generated
 */
public interface Dir extends FSObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage#getDir_Contents()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FSObject> getContents();

} // Dir
