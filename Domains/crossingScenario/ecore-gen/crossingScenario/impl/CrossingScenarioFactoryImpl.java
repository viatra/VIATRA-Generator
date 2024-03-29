/**
 */
package crossingScenario.impl;

import crossingScenario.*;

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
			case CrossingScenarioPackage.VISION_BLOCKED: return createVisionBlocked();
			case CrossingScenarioPackage.COLLISION_EXISTS: return createCollisionExists();
			case CrossingScenarioPackage.PEDESTRIAN: return createPedestrian();
			case CrossingScenarioPackage.VEHICLE: return createVehicle();
			case CrossingScenarioPackage.LANE_HORIZONTAL: return createLane_Horizontal();
			case CrossingScenarioPackage.LANE_VERTICAL: return createLane_Vertical();
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
	@Override
	public Lane_Horizontal createLane_Horizontal() {
		Lane_HorizontalImpl lane_Horizontal = new Lane_HorizontalImpl();
		return lane_Horizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lane_Vertical createLane_Vertical() {
		Lane_VerticalImpl lane_Vertical = new Lane_VerticalImpl();
		return lane_Vertical;
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
