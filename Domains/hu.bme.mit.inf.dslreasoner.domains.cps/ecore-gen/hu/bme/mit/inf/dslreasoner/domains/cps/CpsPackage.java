/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsFactory
 * @model kind="package"
 * @generated
 */
public interface CpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpsPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl <em>Cyber Physical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getCyberPhysicalSystem()
	 * @generated
	 */
	int CYBER_PHYSICAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__REQUESTS = 0;

	/**
	 * The feature id for the '<em><b>Application Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Host Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM__HOST_TYPES = 2;

	/**
	 * The number of structural features of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cyber Physical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationTypeImpl <em>Application Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationTypeImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__REQUIREMENTS = 1;

	/**
	 * The number of structural features of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl <em>Host Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getHostType()
	 * @generated
	 */
	int HOST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Default Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__DEFAULT_MEMORY = 0;

	/**
	 * The feature id for the '<em><b>Default Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__DEFAULT_HDD = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE__COST = 3;

	/**
	 * The number of structural features of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Host Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequestImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUIREMENTS = 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequirementImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Request</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COUNT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__INSTANCES = 3;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationInstanceImpl <em>Application Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationInstanceImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getApplicationInstance()
	 * @generated
	 */
	int APPLICATION_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE__ALLOCATED_TO = 2;

	/**
	 * The number of structural features of the '<em>Application Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ResourceRequirementImpl <em>Resource Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.ResourceRequirementImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getResourceRequirement()
	 * @generated
	 */
	int RESOURCE_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Required Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT__REQUIRED_MEMORY = 0;

	/**
	 * The feature id for the '<em><b>Required Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT__REQUIRED_HDD = 1;

	/**
	 * The feature id for the '<em><b>Host Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT__HOST_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl <em>Host Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getHostInstance()
	 * @generated
	 */
	int HOST_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE__APPLICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem <em>Cyber Physical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyber Physical System</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
	 * @generated
	 */
	EClass getCyberPhysicalSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requests</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getRequests()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_Requests();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getApplicationTypes <em>Application Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Types</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getApplicationTypes()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_ApplicationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getHostTypes <em>Host Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host Types</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem#getHostTypes()
	 * @see #getCyberPhysicalSystem()
	 * @generated
	 */
	EReference getCyberPhysicalSystem_HostTypes();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType
	 * @generated
	 */
	EClass getApplicationType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType#getInstances()
	 * @see #getApplicationType()
	 * @generated
	 */
	EReference getApplicationType_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType#getRequirements()
	 * @see #getApplicationType()
	 * @generated
	 */
	EReference getApplicationType_Requirements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostType
	 * @generated
	 */
	EClass getHostType();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultMemory <em>Default Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Memory</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultMemory()
	 * @see #getHostType()
	 * @generated
	 */
	EAttribute getHostType_DefaultMemory();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultHdd <em>Default Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Hdd</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultHdd()
	 * @see #getHostType()
	 * @generated
	 */
	EAttribute getHostType_DefaultHdd();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getInstances()
	 * @see #getHostType()
	 * @generated
	 */
	EReference getHostType_Instances();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getCost()
	 * @see #getHostType()
	 * @generated
	 */
	EAttribute getHostType_Cost();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Request#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Request#getRequirements()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Requirements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Request</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getRequest()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Request();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Count();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Type();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.Requirement#getInstances()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Instances();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance <em>Application Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Instance</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance
	 * @generated
	 */
	EClass getApplicationInstance();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getRequirement()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EReference getApplicationInstance_Requirement();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getType()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EReference getApplicationInstance_Type();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocated To</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance#getAllocatedTo()
	 * @see #getApplicationInstance()
	 * @generated
	 */
	EReference getApplicationInstance_AllocatedTo();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement <em>Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirement</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement
	 * @generated
	 */
	EClass getResourceRequirement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredMemory <em>Required Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Memory</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredMemory()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	EAttribute getResourceRequirement_RequiredMemory();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredHdd <em>Required Hdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Hdd</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getRequiredHdd()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	EAttribute getResourceRequirement_RequiredHdd();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getHostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement#getHostType()
	 * @see #getResourceRequirement()
	 * @generated
	 */
	EReference getResourceRequirement_HostType();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance <em>Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Instance</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance
	 * @generated
	 */
	EClass getHostInstance();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getType()
	 * @see #getHostInstance()
	 * @generated
	 */
	EReference getHostInstance_Type();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getApplications()
	 * @see #getHostInstance()
	 * @generated
	 */
	EReference getHostInstance_Applications();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpsFactory getCpsFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl <em>Cyber Physical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getCyberPhysicalSystem()
		 * @generated
		 */
		EClass CYBER_PHYSICAL_SYSTEM = eINSTANCE.getCyberPhysicalSystem();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__REQUESTS = eINSTANCE.getCyberPhysicalSystem_Requests();

		/**
		 * The meta object literal for the '<em><b>Application Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES = eINSTANCE.getCyberPhysicalSystem_ApplicationTypes();

		/**
		 * The meta object literal for the '<em><b>Host Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYBER_PHYSICAL_SYSTEM__HOST_TYPES = eINSTANCE.getCyberPhysicalSystem_HostTypes();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationTypeImpl <em>Application Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationTypeImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getApplicationType()
		 * @generated
		 */
		EClass APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TYPE__INSTANCES = eINSTANCE.getApplicationType_Instances();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TYPE__REQUIREMENTS = eINSTANCE.getApplicationType_Requirements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl <em>Host Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostTypeImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getHostType()
		 * @generated
		 */
		EClass HOST_TYPE = eINSTANCE.getHostType();

		/**
		 * The meta object literal for the '<em><b>Default Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_TYPE__DEFAULT_MEMORY = eINSTANCE.getHostType_DefaultMemory();

		/**
		 * The meta object literal for the '<em><b>Default Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_TYPE__DEFAULT_HDD = eINSTANCE.getHostType_DefaultHdd();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_TYPE__INSTANCES = eINSTANCE.getHostType_Instances();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_TYPE__COST = eINSTANCE.getHostType_Cost();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequestImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__REQUIREMENTS = eINSTANCE.getRequest_Requirements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.RequirementImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUEST = eINSTANCE.getRequirement_Request();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__COUNT = eINSTANCE.getRequirement_Count();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__INSTANCES = eINSTANCE.getRequirement_Instances();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationInstanceImpl <em>Application Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.ApplicationInstanceImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getApplicationInstance()
		 * @generated
		 */
		EClass APPLICATION_INSTANCE = eINSTANCE.getApplicationInstance();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INSTANCE__REQUIREMENT = eINSTANCE.getApplicationInstance_Requirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INSTANCE__TYPE = eINSTANCE.getApplicationInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INSTANCE__ALLOCATED_TO = eINSTANCE.getApplicationInstance_AllocatedTo();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.ResourceRequirementImpl <em>Resource Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.ResourceRequirementImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getResourceRequirement()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENT = eINSTANCE.getResourceRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REQUIREMENT__REQUIRED_MEMORY = eINSTANCE.getResourceRequirement_RequiredMemory();

		/**
		 * The meta object literal for the '<em><b>Required Hdd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REQUIREMENT__REQUIRED_HDD = eINSTANCE.getResourceRequirement_RequiredHdd();

		/**
		 * The meta object literal for the '<em><b>Host Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIREMENT__HOST_TYPE = eINSTANCE.getResourceRequirement_HostType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl <em>Host Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.HostInstanceImpl
		 * @see hu.bme.mit.inf.dslreasoner.domains.cps.impl.CpsPackageImpl#getHostInstance()
		 * @generated
		 */
		EClass HOST_INSTANCE = eINSTANCE.getHostInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_INSTANCE__TYPE = eINSTANCE.getHostInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_INSTANCE__APPLICATIONS = eINSTANCE.getHostInstance_Applications();

	}

} //CpsPackage
