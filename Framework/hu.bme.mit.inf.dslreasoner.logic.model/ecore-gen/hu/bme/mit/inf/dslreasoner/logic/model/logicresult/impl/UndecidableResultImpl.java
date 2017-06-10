/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UndecidableResult;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Undecidable Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UndecidableResultImpl extends UnknownResultImpl implements UndecidableResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndecidableResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicresultPackage.Literals.UNDECIDABLE_RESULT;
	}

} //UndecidableResultImpl
