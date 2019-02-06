/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KOf MGate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.KOfMGateImpl#getK <em>K</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl.KOfMGateImpl#getM <em>M</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KOfMGateImpl extends GateImpl implements KOfMGate {
	/**
	 * The default value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected static final int K_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected int k = K_EDEFAULT;

	/**
	 * The default value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected static final int M_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected int m = M_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KOfMGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.KOF_MGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setK(int newK) {
		int oldK = k;
		k = newK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.KOF_MGATE__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setM(int newM) {
		int oldM = m;
		m = newM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.KOF_MGATE__M, oldM, m));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.KOF_MGATE__K:
				return getK();
			case FtPackage.KOF_MGATE__M:
				return getM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FtPackage.KOF_MGATE__K:
				setK((Integer)newValue);
				return;
			case FtPackage.KOF_MGATE__M:
				setM((Integer)newValue);
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
			case FtPackage.KOF_MGATE__K:
				setK(K_EDEFAULT);
				return;
			case FtPackage.KOF_MGATE__M:
				setM(M_EDEFAULT);
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
			case FtPackage.KOF_MGATE__K:
				return k != K_EDEFAULT;
			case FtPackage.KOF_MGATE__M:
				return m != M_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (k: ");
		result.append(k);
		result.append(", m: ");
		result.append(m);
		result.append(')');
		return result.toString();
	}

} //KOfMGateImpl
