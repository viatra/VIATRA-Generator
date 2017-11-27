/**
 */
package hu.bme.mit.inf.smartgrid;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.smartgrid.SmartgridFactory
 * @model kind="package"
 * @generated
 */
public interface SmartgridPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartgrid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.inf.smartgrid/smartgrid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smartgrid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartgridPackage eINSTANCE = hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.smartgrid.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.smartgrid.impl.EntityImpl
	 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Communication Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMMUNICATION_PARENT = 0;

	/**
	 * The feature id for the '<em><b>Communication Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMMUNICATION_CHILD = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.smartgrid.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.smartgrid.impl.MeterImpl
	 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 1;

	/**
	 * The feature id for the '<em><b>Communication Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__COMMUNICATION_PARENT = ENTITY__COMMUNICATION_PARENT;

	/**
	 * The feature id for the '<em><b>Communication Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__COMMUNICATION_CHILD = ENTITY__COMMUNICATION_CHILD;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.smartgrid.impl.ConcentratorImpl <em>Concentrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.smartgrid.impl.ConcentratorImpl
	 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getConcentrator()
	 * @generated
	 */
	int CONCENTRATOR = 2;

	/**
	 * The feature id for the '<em><b>Communication Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR__COMMUNICATION_PARENT = ENTITY__COMMUNICATION_PARENT;

	/**
	 * The feature id for the '<em><b>Communication Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR__COMMUNICATION_CHILD = ENTITY__COMMUNICATION_CHILD;

	/**
	 * The number of structural features of the '<em>Concentrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concentrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCENTRATOR_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.smartgrid.impl.SmartMeterImpl <em>Smart Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.smartgrid.impl.SmartMeterImpl
	 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getSmartMeter()
	 * @generated
	 */
	int SMART_METER = 3;

	/**
	 * The feature id for the '<em><b>Communication Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__COMMUNICATION_PARENT = METER__COMMUNICATION_PARENT;

	/**
	 * The feature id for the '<em><b>Communication Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__COMMUNICATION_CHILD = METER__COMMUNICATION_CHILD;

	/**
	 * The number of structural features of the '<em>Smart Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_FEATURE_COUNT = METER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smart Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_OPERATION_COUNT = METER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.smartgrid.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see hu.bme.mit.inf.smartgrid.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.smartgrid.Entity#getCommunicationParent <em>Communication Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Communication Parent</em>'.
	 * @see hu.bme.mit.inf.smartgrid.Entity#getCommunicationParent()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_CommunicationParent();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.smartgrid.Entity#getCommunicationChild <em>Communication Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Child</em>'.
	 * @see hu.bme.mit.inf.smartgrid.Entity#getCommunicationChild()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_CommunicationChild();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.smartgrid.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see hu.bme.mit.inf.smartgrid.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.smartgrid.Concentrator <em>Concentrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concentrator</em>'.
	 * @see hu.bme.mit.inf.smartgrid.Concentrator
	 * @generated
	 */
	EClass getConcentrator();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.smartgrid.SmartMeter <em>Smart Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Meter</em>'.
	 * @see hu.bme.mit.inf.smartgrid.SmartMeter
	 * @generated
	 */
	EClass getSmartMeter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartgridFactory getSmartgridFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.smartgrid.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.smartgrid.impl.EntityImpl
		 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Communication Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__COMMUNICATION_PARENT = eINSTANCE.getEntity_CommunicationParent();

		/**
		 * The meta object literal for the '<em><b>Communication Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__COMMUNICATION_CHILD = eINSTANCE.getEntity_CommunicationChild();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.smartgrid.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.smartgrid.impl.MeterImpl
		 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.smartgrid.impl.ConcentratorImpl <em>Concentrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.smartgrid.impl.ConcentratorImpl
		 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getConcentrator()
		 * @generated
		 */
		EClass CONCENTRATOR = eINSTANCE.getConcentrator();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.smartgrid.impl.SmartMeterImpl <em>Smart Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.smartgrid.impl.SmartMeterImpl
		 * @see hu.bme.mit.inf.smartgrid.impl.SmartgridPackageImpl#getSmartMeter()
		 * @generated
		 */
		EClass SMART_METER = eINSTANCE.getSmartMeter();

	}

} //SmartgridPackage
