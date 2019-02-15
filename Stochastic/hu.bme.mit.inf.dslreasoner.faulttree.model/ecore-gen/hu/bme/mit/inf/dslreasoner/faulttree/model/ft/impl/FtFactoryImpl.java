/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtFactoryImpl extends EFactoryImpl implements FtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FtFactory init() {
		try {
			FtFactory theFtFactory = (FtFactory)EPackage.Registry.INSTANCE.getEFactory(FtPackage.eNS_URI);
			if (theFtFactory != null) {
				return theFtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FtPackage.FAULT_TREE: return createFaultTree();
			case FtPackage.BASIC_EVENT: return createBasicEvent();
			case FtPackage.CONSTANT_DISTRIBUTION: return createConstantDistribution();
			case FtPackage.EXPONENTIAL_DISTRIBUTION: return createExponentialDistribution();
			case FtPackage.AND_GATE: return createAndGate();
			case FtPackage.OR_GATE: return createOrGate();
			case FtPackage.KOF_MGATE: return createKOfMGate();
			case FtPackage.CONSTANT_MODEL: return createConstantModel();
			case FtPackage.CONSTANT_EVENT: return createConstantEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaultTree createFaultTree() {
		FaultTreeImpl faultTree = new FaultTreeImpl();
		return faultTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantDistribution createConstantDistribution() {
		ConstantDistributionImpl constantDistribution = new ConstantDistributionImpl();
		return constantDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialDistribution createExponentialDistribution() {
		ExponentialDistributionImpl exponentialDistribution = new ExponentialDistributionImpl();
		return exponentialDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndGate createAndGate() {
		AndGateImpl andGate = new AndGateImpl();
		return andGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrGate createOrGate() {
		OrGateImpl orGate = new OrGateImpl();
		return orGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KOfMGate createKOfMGate() {
		KOfMGateImpl kOfMGate = new KOfMGateImpl();
		return kOfMGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantModel createConstantModel() {
		ConstantModelImpl constantModel = new ConstantModelImpl();
		return constantModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantEvent createConstantEvent() {
		ConstantEventImpl constantEvent = new ConstantEventImpl();
		return constantEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FtPackage getFtPackage() {
		return (FtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FtPackage getPackage() {
		return FtPackage.eINSTANCE;
	}

} //FtFactoryImpl
