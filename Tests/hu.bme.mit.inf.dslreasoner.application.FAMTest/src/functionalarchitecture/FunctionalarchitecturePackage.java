/**
 */
package functionalarchitecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see functionalarchitecture.FunctionalarchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionalarchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functionalarchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.mit.bme.hu/viatrasolver/example/fam";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functionalarchitecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionalarchitecturePackage eINSTANCE = functionalarchitecture.impl.FunctionalarchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FunctionalElementImpl <em>Functional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FunctionalElementImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalElement()
	 * @generated
	 */
	int FUNCTIONAL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ELEMENT__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ELEMENT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ELEMENT__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Functional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Functional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FunctionalArchitectureModelImpl <em>Functional Architecture Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FunctionalArchitectureModelImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalArchitectureModel()
	 * @generated
	 */
	int FUNCTIONAL_ARCHITECTURE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ARCHITECTURE_MODEL__ROOT_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Functional Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ARCHITECTURE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Functional Architecture Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ARCHITECTURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FunctionImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INTERFACE = FUNCTIONAL_ELEMENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MODEL = FUNCTIONAL_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARENT = FUNCTIONAL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SUB_ELEMENTS = FUNCTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = FUNCTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = FUNCTIONAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = FUNCTIONAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FAMTerminatorImpl <em>FAM Terminator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FAMTerminatorImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFAMTerminator()
	 * @generated
	 */
	int FAM_TERMINATOR = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAM_TERMINATOR__DATA = 0;

	/**
	 * The number of structural features of the '<em>FAM Terminator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAM_TERMINATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FAM Terminator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAM_TERMINATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.InformationLinkImpl <em>Information Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.InformationLinkImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getInformationLink()
	 * @generated
	 */
	int INFORMATION_LINK = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_LINK__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_LINK__TO = 1;

	/**
	 * The number of structural features of the '<em>Information Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FunctionalInterfaceImpl <em>Functional Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FunctionalInterfaceImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalInterface()
	 * @generated
	 */
	int FUNCTIONAL_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INTERFACE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INTERFACE__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Functional Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Functional Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FunctionalDataImpl <em>Functional Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FunctionalDataImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalData()
	 * @generated
	 */
	int FUNCTIONAL_DATA = 8;

	/**
	 * The feature id for the '<em><b>Terminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__TERMINATOR = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Functional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Functional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FunctionalInputImpl <em>Functional Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FunctionalInputImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalInput()
	 * @generated
	 */
	int FUNCTIONAL_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Terminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INPUT__TERMINATOR = FUNCTIONAL_DATA__TERMINATOR;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INPUT__INTERFACE = FUNCTIONAL_DATA__INTERFACE;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INPUT__INCOMING_LINKS = FUNCTIONAL_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INPUT_FEATURE_COUNT = FUNCTIONAL_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functional Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_INPUT_OPERATION_COUNT = FUNCTIONAL_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.impl.FunctionalOutputImpl <em>Functional Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.impl.FunctionalOutputImpl
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalOutput()
	 * @generated
	 */
	int FUNCTIONAL_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Terminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OUTPUT__TERMINATOR = FUNCTIONAL_DATA__TERMINATOR;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OUTPUT__INTERFACE = FUNCTIONAL_DATA__INTERFACE;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OUTPUT__OUTGOING_LINKS = FUNCTIONAL_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OUTPUT_FEATURE_COUNT = FUNCTIONAL_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functional Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OUTPUT_OPERATION_COUNT = FUNCTIONAL_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link functionalarchitecture.FunctionType <em>Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see functionalarchitecture.FunctionType
	 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link functionalarchitecture.FunctionalElement <em>Functional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Element</em>'.
	 * @see functionalarchitecture.FunctionalElement
	 * @generated
	 */
	EClass getFunctionalElement();

	/**
	 * Returns the meta object for the containment reference '{@link functionalarchitecture.FunctionalElement#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see functionalarchitecture.FunctionalElement#getInterface()
	 * @see #getFunctionalElement()
	 * @generated
	 */
	EReference getFunctionalElement_Interface();

	/**
	 * Returns the meta object for the reference '{@link functionalarchitecture.FunctionalElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see functionalarchitecture.FunctionalElement#getModel()
	 * @see #getFunctionalElement()
	 * @generated
	 */
	EReference getFunctionalElement_Model();

	/**
	 * Returns the meta object for the container reference '{@link functionalarchitecture.FunctionalElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see functionalarchitecture.FunctionalElement#getParent()
	 * @see #getFunctionalElement()
	 * @generated
	 */
	EReference getFunctionalElement_Parent();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.FunctionalArchitectureModel <em>Functional Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Architecture Model</em>'.
	 * @see functionalarchitecture.FunctionalArchitectureModel
	 * @generated
	 */
	EClass getFunctionalArchitectureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link functionalarchitecture.FunctionalArchitectureModel#getRootElements <em>Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Elements</em>'.
	 * @see functionalarchitecture.FunctionalArchitectureModel#getRootElements()
	 * @see #getFunctionalArchitectureModel()
	 * @generated
	 */
	EReference getFunctionalArchitectureModel_RootElements();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see functionalarchitecture.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link functionalarchitecture.Function#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
	 * @see functionalarchitecture.Function#getSubElements()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_SubElements();

	/**
	 * Returns the meta object for the attribute '{@link functionalarchitecture.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see functionalarchitecture.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Type();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.FAMTerminator <em>FAM Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FAM Terminator</em>'.
	 * @see functionalarchitecture.FAMTerminator
	 * @generated
	 */
	EClass getFAMTerminator();

	/**
	 * Returns the meta object for the container reference '{@link functionalarchitecture.FAMTerminator#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data</em>'.
	 * @see functionalarchitecture.FAMTerminator#getData()
	 * @see #getFAMTerminator()
	 * @generated
	 */
	EReference getFAMTerminator_Data();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.InformationLink <em>Information Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Link</em>'.
	 * @see functionalarchitecture.InformationLink
	 * @generated
	 */
	EClass getInformationLink();

	/**
	 * Returns the meta object for the container reference '{@link functionalarchitecture.InformationLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see functionalarchitecture.InformationLink#getFrom()
	 * @see #getInformationLink()
	 * @generated
	 */
	EReference getInformationLink_From();

	/**
	 * Returns the meta object for the reference '{@link functionalarchitecture.InformationLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see functionalarchitecture.InformationLink#getTo()
	 * @see #getInformationLink()
	 * @generated
	 */
	EReference getInformationLink_To();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.FunctionalInterface <em>Functional Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Interface</em>'.
	 * @see functionalarchitecture.FunctionalInterface
	 * @generated
	 */
	EClass getFunctionalInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link functionalarchitecture.FunctionalInterface#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see functionalarchitecture.FunctionalInterface#getData()
	 * @see #getFunctionalInterface()
	 * @generated
	 */
	EReference getFunctionalInterface_Data();

	/**
	 * Returns the meta object for the container reference '{@link functionalarchitecture.FunctionalInterface#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see functionalarchitecture.FunctionalInterface#getElement()
	 * @see #getFunctionalInterface()
	 * @generated
	 */
	EReference getFunctionalInterface_Element();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.FunctionalInput <em>Functional Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Input</em>'.
	 * @see functionalarchitecture.FunctionalInput
	 * @generated
	 */
	EClass getFunctionalInput();

	/**
	 * Returns the meta object for the reference list '{@link functionalarchitecture.FunctionalInput#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see functionalarchitecture.FunctionalInput#getIncomingLinks()
	 * @see #getFunctionalInput()
	 * @generated
	 */
	EReference getFunctionalInput_IncomingLinks();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.FunctionalOutput <em>Functional Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Output</em>'.
	 * @see functionalarchitecture.FunctionalOutput
	 * @generated
	 */
	EClass getFunctionalOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link functionalarchitecture.FunctionalOutput#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Links</em>'.
	 * @see functionalarchitecture.FunctionalOutput#getOutgoingLinks()
	 * @see #getFunctionalOutput()
	 * @generated
	 */
	EReference getFunctionalOutput_OutgoingLinks();

	/**
	 * Returns the meta object for class '{@link functionalarchitecture.FunctionalData <em>Functional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Data</em>'.
	 * @see functionalarchitecture.FunctionalData
	 * @generated
	 */
	EClass getFunctionalData();

	/**
	 * Returns the meta object for the containment reference '{@link functionalarchitecture.FunctionalData#getTerminator <em>Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminator</em>'.
	 * @see functionalarchitecture.FunctionalData#getTerminator()
	 * @see #getFunctionalData()
	 * @generated
	 */
	EReference getFunctionalData_Terminator();

	/**
	 * Returns the meta object for the container reference '{@link functionalarchitecture.FunctionalData#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see functionalarchitecture.FunctionalData#getInterface()
	 * @see #getFunctionalData()
	 * @generated
	 */
	EReference getFunctionalData_Interface();

	/**
	 * Returns the meta object for enum '{@link functionalarchitecture.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type</em>'.
	 * @see functionalarchitecture.FunctionType
	 * @generated
	 */
	EEnum getFunctionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionalarchitectureFactory getFunctionalarchitectureFactory();

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
		 * The meta object literal for the '{@link functionalarchitecture.impl.FunctionalElementImpl <em>Functional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FunctionalElementImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalElement()
		 * @generated
		 */
		EClass FUNCTIONAL_ELEMENT = eINSTANCE.getFunctionalElement();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ELEMENT__INTERFACE = eINSTANCE.getFunctionalElement_Interface();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ELEMENT__MODEL = eINSTANCE.getFunctionalElement_Model();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ELEMENT__PARENT = eINSTANCE.getFunctionalElement_Parent();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.FunctionalArchitectureModelImpl <em>Functional Architecture Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FunctionalArchitectureModelImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalArchitectureModel()
		 * @generated
		 */
		EClass FUNCTIONAL_ARCHITECTURE_MODEL = eINSTANCE.getFunctionalArchitectureModel();

		/**
		 * The meta object literal for the '<em><b>Root Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ARCHITECTURE_MODEL__ROOT_ELEMENTS = eINSTANCE.getFunctionalArchitectureModel_RootElements();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FunctionImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__SUB_ELEMENTS = eINSTANCE.getFunction_SubElements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__TYPE = eINSTANCE.getFunction_Type();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.FAMTerminatorImpl <em>FAM Terminator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FAMTerminatorImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFAMTerminator()
		 * @generated
		 */
		EClass FAM_TERMINATOR = eINSTANCE.getFAMTerminator();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAM_TERMINATOR__DATA = eINSTANCE.getFAMTerminator_Data();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.InformationLinkImpl <em>Information Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.InformationLinkImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getInformationLink()
		 * @generated
		 */
		EClass INFORMATION_LINK = eINSTANCE.getInformationLink();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_LINK__FROM = eINSTANCE.getInformationLink_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_LINK__TO = eINSTANCE.getInformationLink_To();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.FunctionalInterfaceImpl <em>Functional Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FunctionalInterfaceImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalInterface()
		 * @generated
		 */
		EClass FUNCTIONAL_INTERFACE = eINSTANCE.getFunctionalInterface();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_INTERFACE__DATA = eINSTANCE.getFunctionalInterface_Data();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_INTERFACE__ELEMENT = eINSTANCE.getFunctionalInterface_Element();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.FunctionalInputImpl <em>Functional Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FunctionalInputImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalInput()
		 * @generated
		 */
		EClass FUNCTIONAL_INPUT = eINSTANCE.getFunctionalInput();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_INPUT__INCOMING_LINKS = eINSTANCE.getFunctionalInput_IncomingLinks();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.FunctionalOutputImpl <em>Functional Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FunctionalOutputImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalOutput()
		 * @generated
		 */
		EClass FUNCTIONAL_OUTPUT = eINSTANCE.getFunctionalOutput();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_OUTPUT__OUTGOING_LINKS = eINSTANCE.getFunctionalOutput_OutgoingLinks();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.impl.FunctionalDataImpl <em>Functional Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.impl.FunctionalDataImpl
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionalData()
		 * @generated
		 */
		EClass FUNCTIONAL_DATA = eINSTANCE.getFunctionalData();

		/**
		 * The meta object literal for the '<em><b>Terminator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DATA__TERMINATOR = eINSTANCE.getFunctionalData_Terminator();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DATA__INTERFACE = eINSTANCE.getFunctionalData_Interface();

		/**
		 * The meta object literal for the '{@link functionalarchitecture.FunctionType <em>Function Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see functionalarchitecture.FunctionType
		 * @see functionalarchitecture.impl.FunctionalarchitecturePackageImpl#getFunctionType()
		 * @generated
		 */
		EEnum FUNCTION_TYPE = eINSTANCE.getFunctionType();

	}

} //FunctionalarchitecturePackage
