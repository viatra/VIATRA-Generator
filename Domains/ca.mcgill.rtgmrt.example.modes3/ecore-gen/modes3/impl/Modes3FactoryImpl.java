/**
 */
package modes3.impl;

import modes3.*;

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
public class Modes3FactoryImpl extends EFactoryImpl implements Modes3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Modes3Factory init() {
		try {
			Modes3Factory theModes3Factory = (Modes3Factory)EPackage.Registry.INSTANCE.getEFactory(Modes3Package.eNS_URI);
			if (theModes3Factory != null) {
				return theModes3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Modes3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modes3FactoryImpl() {
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
			case Modes3Package.SEGMENT: return createSegment();
			case Modes3Package.MODES3_MODEL_ROOT: return createModes3ModelRoot();
			case Modes3Package.TURNOUT: return createTurnout();
			case Modes3Package.TRAIN: return createTrain();
			case Modes3Package.SIMPLE_SEGMENT: return createSimpleSegment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modes3ModelRoot createModes3ModelRoot() {
		Modes3ModelRootImpl modes3ModelRoot = new Modes3ModelRootImpl();
		return modes3ModelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turnout createTurnout() {
		TurnoutImpl turnout = new TurnoutImpl();
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Train createTrain() {
		TrainImpl train = new TrainImpl();
		return train;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSegment createSimpleSegment() {
		SimpleSegmentImpl simpleSegment = new SimpleSegmentImpl();
		return simpleSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modes3Package getModes3Package() {
		return (Modes3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Modes3Package getPackage() {
		return Modes3Package.eINSTANCE;
	}

} //Modes3FactoryImpl
