/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.filesystem;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.viatra.query.querybasedfeature'"
 * @generated
 */
public interface filesystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "FileSystemMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	filesystemPackage eINSTANCE = ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileSystemImpl <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileSystemImpl
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getFileSystem()
	 * @generated
	 */
	int FILE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Live</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM__LIVE = 1;

	/**
	 * The number of structural features of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FSObjectImpl <em>FS Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FSObjectImpl
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getFSObject()
	 * @generated
	 */
	int FS_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_OBJECT__PARENT = 0;

	/**
	 * The number of structural features of the '<em>FS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FS Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FS_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.DirImpl <em>Dir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.DirImpl
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getDir()
	 * @generated
	 */
	int DIR = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR__PARENT = FS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR__CONTENTS = FS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_FEATURE_COUNT = FS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_OPERATION_COUNT = FS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileImpl
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PARENT = FS_OBJECT__PARENT;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = FS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = FS_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.ModelImpl
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 4;

	/**
	 * The feature id for the '<em><b>Filesystems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FILESYSTEMS = 0;

	/**
	 * The feature id for the '<em><b>Other FS Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OTHER_FS_OBJECTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem
	 * @generated
	 */
	EClass getFileSystem();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem#getRoot()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Root();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem#getLive <em>Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Live</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem#getLive()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Live();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject <em>FS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FS Object</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject
	 * @generated
	 */
	EClass getFSObject();

	/**
	 * Returns the meta object for the container reference '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject#getParent()
	 * @see #getFSObject()
	 * @generated
	 */
	EReference getFSObject_Parent();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dir</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir
	 * @generated
	 */
	EClass getDir();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir#getContents()
	 * @see #getDir()
	 * @generated
	 */
	EReference getDir_Contents();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model#getFilesystems <em>Filesystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filesystems</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model#getFilesystems()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Filesystems();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model#getOtherFSObjects <em>Other FS Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other FS Objects</em>'.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model#getOtherFSObjects()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OtherFSObjects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	filesystemFactory getfilesystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileSystemImpl <em>File System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileSystemImpl
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getFileSystem()
		 * @generated
		 */
		EClass FILE_SYSTEM = eINSTANCE.getFileSystem();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SYSTEM__ROOT = eINSTANCE.getFileSystem_Root();

		/**
		 * The meta object literal for the '<em><b>Live</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_SYSTEM__LIVE = eINSTANCE.getFileSystem_Live();

		/**
		 * The meta object literal for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FSObjectImpl <em>FS Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FSObjectImpl
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getFSObject()
		 * @generated
		 */
		EClass FS_OBJECT = eINSTANCE.getFSObject();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FS_OBJECT__PARENT = eINSTANCE.getFSObject_Parent();

		/**
		 * The meta object literal for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.DirImpl <em>Dir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.DirImpl
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getDir()
		 * @generated
		 */
		EClass DIR = eINSTANCE.getDir();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIR__CONTENTS = eINSTANCE.getDir_Contents();

		/**
		 * The meta object literal for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.FileImpl
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.ModelImpl
		 * @see ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.filesystemPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Filesystems</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FILESYSTEMS = eINSTANCE.getModel_Filesystems();

		/**
		 * The meta object literal for the '<em><b>Other FS Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OTHER_FS_OBJECTS = eINSTANCE.getModel_OtherFSObjects();

	}

} //filesystemPackage
