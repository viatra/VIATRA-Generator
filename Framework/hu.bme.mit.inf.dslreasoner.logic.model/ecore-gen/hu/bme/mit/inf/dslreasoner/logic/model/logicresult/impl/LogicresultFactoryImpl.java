/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.*;

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
public class LogicresultFactoryImpl extends EFactoryImpl implements LogicresultFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicresultFactory init() {
		try {
			LogicresultFactory theLogicresultFactory = (LogicresultFactory)EPackage.Registry.INSTANCE.getEFactory(LogicresultPackage.eNS_URI);
			if (theLogicresultFactory != null) {
				return theLogicresultFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicresultFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicresultFactoryImpl() {
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
			case LogicresultPackage.MODEL_RESULT: return createModelResult();
			case LogicresultPackage.INCONSISTENCY_RESULT: return createInconsistencyResult();
			case LogicresultPackage.INSUFICIENT_RESOURCES_RESULT: return createInsuficientResourcesResult();
			case LogicresultPackage.ERROR_RESULT: return createErrorResult();
			case LogicresultPackage.STATISTICS: return createStatistics();
			case LogicresultPackage.UNDECIDABLE_RESULT: return createUndecidableResult();
			case LogicresultPackage.INT_STATISTIC_ENTRY: return createIntStatisticEntry();
			case LogicresultPackage.REAL_STATISTIC_ENTRY: return createRealStatisticEntry();
			case LogicresultPackage.STRING_STATISTIC_ENTRY: return createStringStatisticEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelResult createModelResult() {
		ModelResultImpl modelResult = new ModelResultImpl();
		return modelResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InconsistencyResult createInconsistencyResult() {
		InconsistencyResultImpl inconsistencyResult = new InconsistencyResultImpl();
		return inconsistencyResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuficientResourcesResult createInsuficientResourcesResult() {
		InsuficientResourcesResultImpl insuficientResourcesResult = new InsuficientResourcesResultImpl();
		return insuficientResourcesResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorResult createErrorResult() {
		ErrorResultImpl errorResult = new ErrorResultImpl();
		return errorResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistics createStatistics() {
		StatisticsImpl statistics = new StatisticsImpl();
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndecidableResult createUndecidableResult() {
		UndecidableResultImpl undecidableResult = new UndecidableResultImpl();
		return undecidableResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntStatisticEntry createIntStatisticEntry() {
		IntStatisticEntryImpl intStatisticEntry = new IntStatisticEntryImpl();
		return intStatisticEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealStatisticEntry createRealStatisticEntry() {
		RealStatisticEntryImpl realStatisticEntry = new RealStatisticEntryImpl();
		return realStatisticEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringStatisticEntry createStringStatisticEntry() {
		StringStatisticEntryImpl stringStatisticEntry = new StringStatisticEntryImpl();
		return stringStatisticEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicresultPackage getLogicresultPackage() {
		return (LogicresultPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicresultPackage getPackage() {
		return LogicresultPackage.eINSTANCE;
	}

} //LogicresultFactoryImpl
