/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.filesystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage
 * @generated
 */
public interface filesystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	filesystemFactory eINSTANCE = ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System</em>'.
	 * @generated
	 */
	FileSystem createFileSystem();

	/**
	 * Returns a new object of class '<em>Dir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dir</em>'.
	 * @generated
	 */
	Dir createDir();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	filesystemPackage getfilesystemPackage();

} //filesystemFactory
