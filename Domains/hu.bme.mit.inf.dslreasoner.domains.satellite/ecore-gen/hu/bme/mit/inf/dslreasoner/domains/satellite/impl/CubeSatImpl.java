/**
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.impl;

import hu.bme.mit.inf.dslreasoner.domains.satellite.CubeSat;
import hu.bme.mit.inf.dslreasoner.domains.satellite.SatellitePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Sat</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CubeSatImpl extends SpacecraftImpl implements CubeSat {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeSatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SatellitePackage.Literals.CUBE_SAT;
	}

} //CubeSatImpl
