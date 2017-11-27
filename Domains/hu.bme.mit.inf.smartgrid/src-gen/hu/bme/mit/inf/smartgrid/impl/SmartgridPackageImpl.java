/**
 */
package hu.bme.mit.inf.smartgrid.impl;

import hu.bme.mit.inf.smartgrid.Concentrator;
import hu.bme.mit.inf.smartgrid.Entity;
import hu.bme.mit.inf.smartgrid.Meter;
import hu.bme.mit.inf.smartgrid.SmartMeter;
import hu.bme.mit.inf.smartgrid.SmartgridFactory;
import hu.bme.mit.inf.smartgrid.SmartgridPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartgridPackageImpl extends EPackageImpl implements SmartgridPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concentratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartMeterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.smartgrid.SmartgridPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmartgridPackageImpl() {
		super(eNS_URI, SmartgridFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SmartgridPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmartgridPackage init() {
		if (isInited)
			return (SmartgridPackage) EPackage.Registry.INSTANCE.getEPackage(SmartgridPackage.eNS_URI);

		// Obtain or create and register package
		SmartgridPackageImpl theSmartgridPackage = (SmartgridPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SmartgridPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SmartgridPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSmartgridPackage.createPackageContents();

		// Initialize created meta-data
		theSmartgridPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmartgridPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmartgridPackage.eNS_URI, theSmartgridPackage);
		return theSmartgridPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_CommunicationParent() {
		return (EReference) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_CommunicationChild() {
		return (EReference) entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeter() {
		return meterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcentrator() {
		return concentratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartMeter() {
		return smartMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartgridFactory getSmartgridFactory() {
		return (SmartgridFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__COMMUNICATION_PARENT);
		createEReference(entityEClass, ENTITY__COMMUNICATION_CHILD);

		meterEClass = createEClass(METER);

		concentratorEClass = createEClass(CONCENTRATOR);

		smartMeterEClass = createEClass(SMART_METER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		meterEClass.getESuperTypes().add(this.getEntity());
		concentratorEClass.getESuperTypes().add(this.getEntity());
		smartMeterEClass.getESuperTypes().add(this.getMeter());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_CommunicationParent(), this.getEntity(), this.getEntity_CommunicationChild(),
				"communicationParent", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_CommunicationChild(), this.getEntity(), this.getEntity_CommunicationParent(),
				"communicationChild", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterEClass, Meter.class, "Meter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concentratorEClass, Concentrator.class, "Concentrator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(smartMeterEClass, SmartMeter.class, "SmartMeter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SmartgridPackageImpl
