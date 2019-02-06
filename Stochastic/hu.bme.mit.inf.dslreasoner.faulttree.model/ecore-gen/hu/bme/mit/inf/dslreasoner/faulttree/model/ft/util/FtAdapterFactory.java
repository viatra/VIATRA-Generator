/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft.util;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage
 * @generated
 */
public class FtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FtPackage.eINSTANCE;
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
	protected FtSwitch<Adapter> modelSwitch =
		new FtSwitch<Adapter>() {
			@Override
			public Adapter caseFaultTree(FaultTree object) {
				return createFaultTreeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseBasicEvent(BasicEvent object) {
				return createBasicEventAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseDistribution(Distribution object) {
				return createDistributionAdapter();
			}
			@Override
			public Adapter caseConstantDistribution(ConstantDistribution object) {
				return createConstantDistributionAdapter();
			}
			@Override
			public Adapter caseExponentialDistribution(ExponentialDistribution object) {
				return createExponentialDistributionAdapter();
			}
			@Override
			public Adapter caseAndGate(AndGate object) {
				return createAndGateAdapter();
			}
			@Override
			public Adapter caseOrGate(OrGate object) {
				return createOrGateAdapter();
			}
			@Override
			public Adapter caseKOfMGate(KOfMGate object) {
				return createKOfMGateAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree
	 * @generated
	 */
	public Adapter createFaultTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent
	 * @generated
	 */
	public Adapter createBasicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution <em>Constant Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution
	 * @generated
	 */
	public Adapter createConstantDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution <em>Exponential Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution
	 * @generated
	 */
	public Adapter createExponentialDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate <em>And Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate
	 * @generated
	 */
	public Adapter createAndGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate <em>Or Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate
	 * @generated
	 */
	public Adapter createOrGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate <em>KOf MGate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate
	 * @generated
	 */
	public Adapter createKOfMGateAdapter() {
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

} //FtAdapterFactory
