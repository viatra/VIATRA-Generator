/**
 */
package functionalarchitecture.impl;

import functionalarchitecture.FAMTerminator;
import functionalarchitecture.Function;
import functionalarchitecture.FunctionType;
import functionalarchitecture.FunctionalArchitectureModel;
import functionalarchitecture.FunctionalInput;
import functionalarchitecture.FunctionalOutput;
import functionalarchitecture.FunctionalarchitectureFactory;
import functionalarchitecture.FunctionalarchitecturePackage;
import functionalarchitecture.InformationLink;
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
public class FunctionalarchitectureFactoryImpl extends EFactoryImpl implements FunctionalarchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionalarchitectureFactory init() {
		try {
			FunctionalarchitectureFactory theFunctionalarchitectureFactory = (FunctionalarchitectureFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionalarchitecturePackage.eNS_URI);
			if (theFunctionalarchitectureFactory != null) {
				return theFunctionalarchitectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionalarchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalarchitectureFactoryImpl() {
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
			case FunctionalarchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL: return createFunctionalArchitectureModel();
			case FunctionalarchitecturePackage.FUNCTION: return createFunction();
			case FunctionalarchitecturePackage.FAM_TERMINATOR: return createFAMTerminator();
			case FunctionalarchitecturePackage.INFORMATION_LINK: return createInformationLink();
			case FunctionalarchitecturePackage.FUNCTIONAL_INTERFACE: return createFunctionalInterface();
			case FunctionalarchitecturePackage.FUNCTIONAL_INPUT: return createFunctionalInput();
			case FunctionalarchitecturePackage.FUNCTIONAL_OUTPUT: return createFunctionalOutput();
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
			case FunctionalarchitecturePackage.FUNCTION_TYPE:
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
			case FunctionalarchitecturePackage.FUNCTION_TYPE:
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
	public functionalarchitecture.FunctionalInterface createFunctionalInterface() {
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
	public FunctionalarchitecturePackage getFunctionalarchitecturePackage() {
		return (FunctionalarchitecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionalarchitecturePackage getPackage() {
		return FunctionalarchitecturePackage.eINSTANCE;
	}

} //FunctionalarchitectureFactoryImpl
