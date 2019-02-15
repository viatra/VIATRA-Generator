/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionType;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalArchitectureModel;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalOutput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.famFactory;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class famFactoryImpl extends EFactoryImpl implements famFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static famFactory init() {
		try {
			famFactory thefamFactory = (famFactory)EPackage.Registry.INSTANCE.getEFactory(famPackage.eNS_URI);
			if (thefamFactory != null) {
				return thefamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new famFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public famFactoryImpl() {
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
			case famPackage.FUNCTIONAL_ARCHITECTURE_MODEL: return createFunctionalArchitectureModel();
			case famPackage.FUNCTION: return createFunction();
			case famPackage.FAM_TERMINATOR: return createFAMTerminator();
			case famPackage.INFORMATION_LINK: return createInformationLink();
			case famPackage.FUNCTIONAL_INTERFACE: return createFunctionalInterface();
			case famPackage.FUNCTIONAL_INPUT: return createFunctionalInput();
			case famPackage.FUNCTIONAL_OUTPUT: return createFunctionalOutput();
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
			case famPackage.FUNCTION_TYPE:
				return createFunctionTypeFromString(eDataType, initialValue);
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
			case famPackage.FUNCTION_TYPE:
				return convertFunctionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalArchitectureModel createFunctionalArchitectureModel() {
		FunctionalArchitectureModelImpl functionalArchitectureModel = new FunctionalArchitectureModelImpl();
		return functionalArchitectureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAMTerminator createFAMTerminator() {
		FAMTerminatorImpl famTerminator = new FAMTerminatorImpl();
		return famTerminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationLink createInformationLink() {
		InformationLinkImpl informationLink = new InformationLinkImpl();
		return informationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalInterface createFunctionalInterface() {
		FunctionalInterfaceImpl functionalInterface = new FunctionalInterfaceImpl();
		return functionalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalInput createFunctionalInput() {
		FunctionalInputImpl functionalInput = new FunctionalInputImpl();
		return functionalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalOutput createFunctionalOutput() {
		FunctionalOutputImpl functionalOutput = new FunctionalOutputImpl();
		return functionalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionTypeFromString(EDataType eDataType, String initialValue) {
		FunctionType result = FunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public famPackage getfamPackage() {
		return (famPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static famPackage getPackage() {
		return famPackage.eINSTANCE;
	}

} //famFactoryImpl
