/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl;

import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FSObject;
import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.FileSystem;
import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Model;
import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.ModelImpl#getFilesystems <em>Filesystems</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.impl.ModelImpl#getOtherFSObjects <em>Other FS Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getFilesystems() <em>Filesystems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesystems()
	 * @generated
	 * @ordered
	 */
	protected FileSystem filesystems;

	/**
	 * The cached value of the '{@link #getOtherFSObjects() <em>Other FS Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFSObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<FSObject> otherFSObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filesystemPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystem getFilesystems() {
		return filesystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilesystems(FileSystem newFilesystems, NotificationChain msgs) {
		FileSystem oldFilesystems = filesystems;
		filesystems = newFilesystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filesystemPackage.MODEL__FILESYSTEMS, oldFilesystems, newFilesystems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilesystems(FileSystem newFilesystems) {
		if (newFilesystems != filesystems) {
			NotificationChain msgs = null;
			if (filesystems != null)
				msgs = ((InternalEObject)filesystems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filesystemPackage.MODEL__FILESYSTEMS, null, msgs);
			if (newFilesystems != null)
				msgs = ((InternalEObject)newFilesystems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filesystemPackage.MODEL__FILESYSTEMS, null, msgs);
			msgs = basicSetFilesystems(newFilesystems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filesystemPackage.MODEL__FILESYSTEMS, newFilesystems, newFilesystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FSObject> getOtherFSObjects() {
		if (otherFSObjects == null) {
			otherFSObjects = new EObjectContainmentEList<FSObject>(FSObject.class, this, filesystemPackage.MODEL__OTHER_FS_OBJECTS);
		}
		return otherFSObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filesystemPackage.MODEL__FILESYSTEMS:
				return basicSetFilesystems(null, msgs);
			case filesystemPackage.MODEL__OTHER_FS_OBJECTS:
				return ((InternalEList<?>)getOtherFSObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case filesystemPackage.MODEL__FILESYSTEMS:
				return getFilesystems();
			case filesystemPackage.MODEL__OTHER_FS_OBJECTS:
				return getOtherFSObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case filesystemPackage.MODEL__FILESYSTEMS:
				setFilesystems((FileSystem)newValue);
				return;
			case filesystemPackage.MODEL__OTHER_FS_OBJECTS:
				getOtherFSObjects().clear();
				getOtherFSObjects().addAll((Collection<? extends FSObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case filesystemPackage.MODEL__FILESYSTEMS:
				setFilesystems((FileSystem)null);
				return;
			case filesystemPackage.MODEL__OTHER_FS_OBJECTS:
				getOtherFSObjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case filesystemPackage.MODEL__FILESYSTEMS:
				return filesystems != null;
			case filesystemPackage.MODEL__OTHER_FS_OBJECTS:
				return otherFSObjects != null && !otherFSObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
