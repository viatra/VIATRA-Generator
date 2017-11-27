/**
 */
package hu.bme.mit.inf.smartgrid.impl;

import hu.bme.mit.inf.smartgrid.Meter;
import hu.bme.mit.inf.smartgrid.SmartgridPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MeterImpl extends EntityImpl implements Meter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartgridPackage.Literals.METER;
	}

} //MeterImpl
