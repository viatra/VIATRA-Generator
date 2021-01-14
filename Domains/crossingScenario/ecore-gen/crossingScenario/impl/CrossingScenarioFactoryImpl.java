/**
 */
package crossingScenario.impl;

import crossingScenario.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CrossingScenarioFactoryImpl extends EFactoryImpl implements CrossingScenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CrossingScenarioFactory init() {
		try {
			CrossingScenarioFactory theCrossingScenarioFactory = (CrossingScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(CrossingScenarioPackage.eNS_URI);
			if (theCrossingScenarioFactory != null) {
				return theCrossingScenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CrossingScenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossingScenarioFactoryImpl() {
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
			case CrossingScenarioPackage.CROSSING_SCENARIO: return createCrossingScenario();
			case CrossingScenarioPackage.LANE: return createLane();
			case CrossingScenarioPackage.VISION_BLOCKED: return createVisionBlocked();
			case CrossingScenarioPackage.SEPARATION_DISTANCE: return createSeparationDistance();
			case CrossingScenarioPackage.COLLISION_EXISTS: return createCollisionExists();
			case CrossingScenarioPackage.COLLISION_DOES_NOT_EXIST: return createCollisionDoesNotExist();
			case CrossingScenarioPackage.PEDESTRIAN: return createPedestrian();
			case CrossingScenarioPackage.VEHICLE: return createVehicle();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CrossingScenarioPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case CrossingScenarioPackage.SIZE:
				return createSizeFromString(eDataType, initialValue);
			case CrossingScenarioPackage.DISTANCE:
				return createDistanceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CrossingScenarioPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case CrossingScenarioPackage.SIZE:
				return convertSizeToString(eDataType, instanceValue);
			case CrossingScenarioPackage.DISTANCE:
				return convertDistanceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossingScenario createCrossingScenario() {
		CrossingScenarioImpl crossingScenario = new CrossingScenarioImpl();
		return crossingScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisionBlocked createVisionBlocked() {
		VisionBlockedImpl visionBlocked = new VisionBlockedImpl();
		return visionBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeparationDistance createSeparationDistance() {
		SeparationDistanceImpl separationDistance = new SeparationDistanceImpl();
		return separationDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollisionExists createCollisionExists() {
		CollisionExistsImpl collisionExists = new CollisionExistsImpl();
		return collisionExists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollisionDoesNotExist createCollisionDoesNotExist() {
		CollisionDoesNotExistImpl collisionDoesNotExist = new CollisionDoesNotExistImpl();
		return collisionDoesNotExist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pedestrian createPedestrian() {
		PedestrianImpl pedestrian = new PedestrianImpl();
		return pedestrian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		Size result = Size.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistanceFromString(EDataType eDataType, String initialValue) {
		Distance result = Distance.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossingScenarioPackage getCrossingScenarioPackage() {
		return (CrossingScenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CrossingScenarioPackage getPackage() {
		return CrossingScenarioPackage.eINSTANCE;
	}

} //CrossingScenarioFactoryImpl
