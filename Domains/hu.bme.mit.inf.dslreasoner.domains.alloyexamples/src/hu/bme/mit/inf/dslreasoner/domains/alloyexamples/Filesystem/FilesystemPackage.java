/**
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem;

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
 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.viatra.query.querybasedfeature'"
 * @generated
 */
public interface FilesystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Filesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "FS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesystemPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileSystemImpl <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileSystemImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getFileSystem()
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
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FSObjectImpl <em>FS Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FSObjectImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getFSObject()
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
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.DirImpl <em>Dir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.DirImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getDir()
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
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getFile()
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
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.ModelImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getModel()
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
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem
	 * @generated
	 */
	EClass getFileSystem();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem#getRoot()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Root();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem#getLive <em>Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Live</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem#getLive()
	 * @see #getFileSystem()
	 * @generated
	 */
	EReference getFileSystem_Live();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject <em>FS Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FS Object</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject
	 * @generated
	 */
	EClass getFSObject();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject#getParent()
	 * @see #getFSObject()
	 * @generated
	 */
	EReference getFSObject_Parent();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dir</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir
	 * @generated
	 */
	EClass getDir();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir#getContents()
	 * @see #getDir()
	 * @generated
	 */
	EReference getDir_Contents();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model#getFilesystems <em>Filesystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filesystems</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model#getFilesystems()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Filesystems();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model#getOtherFSObjects <em>Other FS Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other FS Objects</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model#getOtherFSObjects()
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
	FilesystemFactory getFilesystemFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileSystemImpl <em>File System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileSystemImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getFileSystem()
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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FSObjectImpl <em>FS Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FSObjectImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getFSObject()
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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.DirImpl <em>Dir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.DirImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getDir()
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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FileImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.ModelImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.impl.FilesystemPackageImpl#getModel()
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

} //FilesystemPackage
