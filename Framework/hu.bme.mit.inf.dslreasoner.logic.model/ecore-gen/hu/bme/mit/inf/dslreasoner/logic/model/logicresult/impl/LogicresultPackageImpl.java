/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ErrorResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InsuficientResourcesResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UndecidableResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UnknownResult;

import org.eclipse.emf.ecore.EAttribute;
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
public class LogicresultPackageImpl extends EPackageImpl implements LogicresultPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inconsistencyResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insuficientResourcesResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undecidableResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intStatisticEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realStatisticEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringStatisticEntryEClass = null;

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
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicresultPackageImpl() {
		super(eNS_URI, LogicresultFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogicresultPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicresultPackage init() {
		if (isInited) return (LogicresultPackage)EPackage.Registry.INSTANCE.getEPackage(LogicresultPackage.eNS_URI);

		// Obtain or create and register package
		LogicresultPackageImpl theLogicresultPackage = (LogicresultPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogicresultPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogicresultPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		LogiclanguagePackageImpl theLogiclanguagePackage = (LogiclanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI) instanceof LogiclanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI) : LogiclanguagePackage.eINSTANCE);
		LogicproblemPackageImpl theLogicproblemPackage = (LogicproblemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI) instanceof LogicproblemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI) : LogicproblemPackage.eINSTANCE);

		// Create package meta-data objects
		theLogicresultPackage.createPackageContents();
		theLogiclanguagePackage.createPackageContents();
		theLogicproblemPackage.createPackageContents();

		// Initialize created meta-data
		theLogicresultPackage.initializePackageContents();
		theLogiclanguagePackage.initializePackageContents();
		theLogicproblemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogicresultPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogicresultPackage.eNS_URI, theLogicresultPackage);
		return theLogicresultPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicResult() {
		return logicResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicResult_Problem() {
		return (EReference)logicResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicResult_Statistics() {
		return (EReference)logicResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicResult_Trace() {
		return (EAttribute)logicResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicResult_Representation() {
		return (EAttribute)logicResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelResult() {
		return modelResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelResult_MaxInteger() {
		return (EAttribute)modelResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelResult_MinInteger() {
		return (EAttribute)modelResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInconsistencyResult() {
		return inconsistencyResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownResult() {
		return unknownResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsuficientResourcesResult() {
		return insuficientResourcesResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsuficientResourcesResult_ResourceName() {
		return (EAttribute)insuficientResourcesResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorResult() {
		return errorResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorResult_Message() {
		return (EAttribute)errorResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatistics() {
		return statisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatistics_Entries() {
		return (EReference)statisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_TransformationTime() {
		return (EAttribute)statisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_SolverTime() {
		return (EAttribute)statisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_SolverMemory() {
		return (EAttribute)statisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatisticEntry() {
		return statisticEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatisticEntry_Name() {
		return (EAttribute)statisticEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndecidableResult() {
		return undecidableResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntStatisticEntry() {
		return intStatisticEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntStatisticEntry_Value() {
		return (EAttribute)intStatisticEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealStatisticEntry() {
		return realStatisticEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealStatisticEntry_Value() {
		return (EAttribute)realStatisticEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringStatisticEntry() {
		return stringStatisticEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringStatisticEntry_Value() {
		return (EAttribute)stringStatisticEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicresultFactory getLogicresultFactory() {
		return (LogicresultFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		logicResultEClass = createEClass(LOGIC_RESULT);
		createEReference(logicResultEClass, LOGIC_RESULT__PROBLEM);
		createEReference(logicResultEClass, LOGIC_RESULT__STATISTICS);
		createEAttribute(logicResultEClass, LOGIC_RESULT__TRACE);
		createEAttribute(logicResultEClass, LOGIC_RESULT__REPRESENTATION);

		modelResultEClass = createEClass(MODEL_RESULT);
		createEAttribute(modelResultEClass, MODEL_RESULT__MAX_INTEGER);
		createEAttribute(modelResultEClass, MODEL_RESULT__MIN_INTEGER);

		inconsistencyResultEClass = createEClass(INCONSISTENCY_RESULT);

		unknownResultEClass = createEClass(UNKNOWN_RESULT);

		insuficientResourcesResultEClass = createEClass(INSUFICIENT_RESOURCES_RESULT);
		createEAttribute(insuficientResourcesResultEClass, INSUFICIENT_RESOURCES_RESULT__RESOURCE_NAME);

		errorResultEClass = createEClass(ERROR_RESULT);
		createEAttribute(errorResultEClass, ERROR_RESULT__MESSAGE);

		statisticsEClass = createEClass(STATISTICS);
		createEReference(statisticsEClass, STATISTICS__ENTRIES);
		createEAttribute(statisticsEClass, STATISTICS__TRANSFORMATION_TIME);
		createEAttribute(statisticsEClass, STATISTICS__SOLVER_TIME);
		createEAttribute(statisticsEClass, STATISTICS__SOLVER_MEMORY);

		statisticEntryEClass = createEClass(STATISTIC_ENTRY);
		createEAttribute(statisticEntryEClass, STATISTIC_ENTRY__NAME);

		undecidableResultEClass = createEClass(UNDECIDABLE_RESULT);

		intStatisticEntryEClass = createEClass(INT_STATISTIC_ENTRY);
		createEAttribute(intStatisticEntryEClass, INT_STATISTIC_ENTRY__VALUE);

		realStatisticEntryEClass = createEClass(REAL_STATISTIC_ENTRY);
		createEAttribute(realStatisticEntryEClass, REAL_STATISTIC_ENTRY__VALUE);

		stringStatisticEntryEClass = createEClass(STRING_STATISTIC_ENTRY);
		createEAttribute(stringStatisticEntryEClass, STRING_STATISTIC_ENTRY__VALUE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LogicproblemPackage theLogicproblemPackage = (LogicproblemPackage)EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelResultEClass.getESuperTypes().add(this.getLogicResult());
		inconsistencyResultEClass.getESuperTypes().add(this.getLogicResult());
		unknownResultEClass.getESuperTypes().add(this.getLogicResult());
		insuficientResourcesResultEClass.getESuperTypes().add(this.getUnknownResult());
		errorResultEClass.getESuperTypes().add(this.getUnknownResult());
		undecidableResultEClass.getESuperTypes().add(this.getUnknownResult());
		intStatisticEntryEClass.getESuperTypes().add(this.getStatisticEntry());
		realStatisticEntryEClass.getESuperTypes().add(this.getStatisticEntry());
		stringStatisticEntryEClass.getESuperTypes().add(this.getStatisticEntry());

		// Initialize classes, features, and operations; add parameters
		initEClass(logicResultEClass, LogicResult.class, "LogicResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicResult_Problem(), theLogicproblemPackage.getLogicProblem(), null, "problem", null, 0, 1, LogicResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicResult_Statistics(), this.getStatistics(), null, "statistics", null, 0, 1, LogicResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicResult_Trace(), ecorePackage.getEJavaObject(), "trace", null, 0, 1, LogicResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicResult_Representation(), ecorePackage.getEJavaObject(), "representation", null, 0, -1, LogicResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelResultEClass, ModelResult.class, "ModelResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelResult_MaxInteger(), ecorePackage.getEInt(), "maxInteger", null, 1, 1, ModelResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelResult_MinInteger(), ecorePackage.getEInt(), "minInteger", null, 1, 1, ModelResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inconsistencyResultEClass, InconsistencyResult.class, "InconsistencyResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownResultEClass, UnknownResult.class, "UnknownResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(insuficientResourcesResultEClass, InsuficientResourcesResult.class, "InsuficientResourcesResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsuficientResourcesResult_ResourceName(), ecorePackage.getEString(), "resourceName", null, 1, 1, InsuficientResourcesResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorResultEClass, ErrorResult.class, "ErrorResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorResult_Message(), ecorePackage.getEString(), "message", null, 1, 1, ErrorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticsEClass, Statistics.class, "Statistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatistics_Entries(), this.getStatisticEntry(), null, "entries", null, 0, -1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_TransformationTime(), ecorePackage.getEInt(), "transformationTime", "-1", 1, 1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_SolverTime(), ecorePackage.getEInt(), "solverTime", "-1", 1, 1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_SolverMemory(), ecorePackage.getEInt(), "solverMemory", "-1", 0, 1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticEntryEClass, StatisticEntry.class, "StatisticEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatisticEntry_Name(), ecorePackage.getEString(), "name", null, 1, 1, StatisticEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undecidableResultEClass, UndecidableResult.class, "UndecidableResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intStatisticEntryEClass, IntStatisticEntry.class, "IntStatisticEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntStatisticEntry_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntStatisticEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realStatisticEntryEClass, RealStatisticEntry.class, "RealStatisticEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealStatisticEntry_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, RealStatisticEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringStatisticEntryEClass, StringStatisticEntry.class, "StringStatisticEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringStatisticEntry_Value(), ecorePackage.getEString(), "value", "Unfilled", 1, 1, StringStatisticEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogicresultPackageImpl
