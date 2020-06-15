/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalArchitectureModel;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalOutput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage
 * @generated
 */
public class famAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static famPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public famAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = famPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected famSwitch<Adapter> modelSwitch =
		new famSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionalElement(FunctionalElement object) {
				return createFunctionalElementAdapter();
			}
			@Override
			public Adapter caseFunctionalArchitectureModel(FunctionalArchitectureModel object) {
				return createFunctionalArchitectureModelAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseFAMTerminator(FAMTerminator object) {
				return createFAMTerminatorAdapter();
			}
			@Override
			public Adapter caseInformationLink(InformationLink object) {
				return createInformationLinkAdapter();
			}
			@Override
			public Adapter caseFunctionalInterface(FunctionalInterface object) {
				return createFunctionalInterfaceAdapter();
			}
			@Override
			public Adapter caseFunctionalInput(FunctionalInput object) {
				return createFunctionalInputAdapter();
			}
			@Override
			public Adapter caseFunctionalOutput(FunctionalOutput object) {
				return createFunctionalOutputAdapter();
			}
			@Override
			public Adapter caseFunctionalData(FunctionalData object) {
				return createFunctionalDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement <em>Functional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement
	 * @generated
	 */
	public Adapter createFunctionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalArchitectureModel <em>Functional Architecture Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalArchitectureModel
	 * @generated
	 */
	public Adapter createFunctionalArchitectureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator <em>FAM Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FAMTerminator
	 * @generated
	 */
	public Adapter createFAMTerminatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink <em>Information Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink
	 * @generated
	 */
	public Adapter createInformationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface <em>Functional Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInterface
	 * @generated
	 */
	public Adapter createFunctionalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInput <em>Functional Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInput
	 * @generated
	 */
	public Adapter createFunctionalInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalOutput <em>Functional Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalOutput
	 * @generated
	 */
	public Adapter createFunctionalOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData <em>Functional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalData
	 * @generated
	 */
	public Adapter createFunctionalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //famAdapterFactory
