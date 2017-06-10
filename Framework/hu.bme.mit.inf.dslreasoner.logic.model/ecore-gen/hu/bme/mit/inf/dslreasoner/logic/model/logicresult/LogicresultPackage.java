/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult;

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
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory
 * @model kind="package"
 * @generated
 */
public interface LogicresultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logicresult";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/logic/model/result";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "language";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicresultPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl <em>Logic Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getLogicResult()
	 * @generated
	 */
	int LOGIC_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_RESULT__PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_RESULT__STATISTICS = 1;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_RESULT__TRACE = 2;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_RESULT__REPRESENTATION = 3;

	/**
	 * The number of structural features of the '<em>Logic Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_RESULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Logic Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl <em>Model Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getModelResult()
	 * @generated
	 */
	int MODEL_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT__PROBLEM = LOGIC_RESULT__PROBLEM;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT__STATISTICS = LOGIC_RESULT__STATISTICS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT__TRACE = LOGIC_RESULT__TRACE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT__REPRESENTATION = LOGIC_RESULT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Max Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT__MAX_INTEGER = LOGIC_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT__MIN_INTEGER = LOGIC_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT_FEATURE_COUNT = LOGIC_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RESULT_OPERATION_COUNT = LOGIC_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InconsistencyResultImpl <em>Inconsistency Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InconsistencyResultImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getInconsistencyResult()
	 * @generated
	 */
	int INCONSISTENCY_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_RESULT__PROBLEM = LOGIC_RESULT__PROBLEM;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_RESULT__STATISTICS = LOGIC_RESULT__STATISTICS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_RESULT__TRACE = LOGIC_RESULT__TRACE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_RESULT__REPRESENTATION = LOGIC_RESULT__REPRESENTATION;

	/**
	 * The number of structural features of the '<em>Inconsistency Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_RESULT_FEATURE_COUNT = LOGIC_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inconsistency Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENCY_RESULT_OPERATION_COUNT = LOGIC_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UnknownResultImpl <em>Unknown Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UnknownResultImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getUnknownResult()
	 * @generated
	 */
	int UNKNOWN_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_RESULT__PROBLEM = LOGIC_RESULT__PROBLEM;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_RESULT__STATISTICS = LOGIC_RESULT__STATISTICS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_RESULT__TRACE = LOGIC_RESULT__TRACE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_RESULT__REPRESENTATION = LOGIC_RESULT__REPRESENTATION;

	/**
	 * The number of structural features of the '<em>Unknown Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_RESULT_FEATURE_COUNT = LOGIC_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unknown Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_RESULT_OPERATION_COUNT = LOGIC_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InsuficientResourcesResultImpl <em>Insuficient Resources Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InsuficientResourcesResultImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getInsuficientResourcesResult()
	 * @generated
	 */
	int INSUFICIENT_RESOURCES_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSUFICIENT_RESOURCES_RESULT__PROBLEM = UNKNOWN_RESULT__PROBLEM;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSUFICIENT_RESOURCES_RESULT__STATISTICS = UNKNOWN_RESULT__STATISTICS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSUFICIENT_RESOURCES_RESULT__TRACE = UNKNOWN_RESULT__TRACE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSUFICIENT_RESOURCES_RESULT__REPRESENTATION = UNKNOWN_RESULT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSUFICIENT_RESOURCES_RESULT__RESOURCE_NAME = UNKNOWN_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insuficient Resources Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSUFICIENT_RESOURCES_RESULT_FEATURE_COUNT = UNKNOWN_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Insuficient Resources Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSUFICIENT_RESOURCES_RESULT_OPERATION_COUNT = UNKNOWN_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ErrorResultImpl <em>Error Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ErrorResultImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getErrorResult()
	 * @generated
	 */
	int ERROR_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__PROBLEM = UNKNOWN_RESULT__PROBLEM;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__STATISTICS = UNKNOWN_RESULT__STATISTICS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__TRACE = UNKNOWN_RESULT__TRACE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__REPRESENTATION = UNKNOWN_RESULT__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT__MESSAGE = UNKNOWN_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT_FEATURE_COUNT = UNKNOWN_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESULT_OPERATION_COUNT = UNKNOWN_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl <em>Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getStatistics()
	 * @generated
	 */
	int STATISTICS = 6;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Transformation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__TRANSFORMATION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Solver Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__SOLVER_TIME = 2;

	/**
	 * The feature id for the '<em><b>Solver Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__SOLVER_MEMORY = 3;

	/**
	 * The number of structural features of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticEntryImpl <em>Statistic Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticEntryImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getStatisticEntry()
	 * @generated
	 */
	int STATISTIC_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UndecidableResultImpl <em>Undecidable Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UndecidableResultImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getUndecidableResult()
	 * @generated
	 */
	int UNDECIDABLE_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECIDABLE_RESULT__PROBLEM = UNKNOWN_RESULT__PROBLEM;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECIDABLE_RESULT__STATISTICS = UNKNOWN_RESULT__STATISTICS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECIDABLE_RESULT__TRACE = UNKNOWN_RESULT__TRACE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECIDABLE_RESULT__REPRESENTATION = UNKNOWN_RESULT__REPRESENTATION;

	/**
	 * The number of structural features of the '<em>Undecidable Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECIDABLE_RESULT_FEATURE_COUNT = UNKNOWN_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undecidable Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECIDABLE_RESULT_OPERATION_COUNT = UNKNOWN_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.IntStatisticEntryImpl <em>Int Statistic Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.IntStatisticEntryImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getIntStatisticEntry()
	 * @generated
	 */
	int INT_STATISTIC_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_STATISTIC_ENTRY__NAME = STATISTIC_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_STATISTIC_ENTRY__VALUE = STATISTIC_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_STATISTIC_ENTRY_FEATURE_COUNT = STATISTIC_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_STATISTIC_ENTRY_OPERATION_COUNT = STATISTIC_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.RealStatisticEntryImpl <em>Real Statistic Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.RealStatisticEntryImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getRealStatisticEntry()
	 * @generated
	 */
	int REAL_STATISTIC_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_STATISTIC_ENTRY__NAME = STATISTIC_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_STATISTIC_ENTRY__VALUE = STATISTIC_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_STATISTIC_ENTRY_FEATURE_COUNT = STATISTIC_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_STATISTIC_ENTRY_OPERATION_COUNT = STATISTIC_ENTRY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StringStatisticEntryImpl <em>String Statistic Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StringStatisticEntryImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getStringStatisticEntry()
	 * @generated
	 */
	int STRING_STATISTIC_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_STATISTIC_ENTRY__NAME = STATISTIC_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_STATISTIC_ENTRY__VALUE = STATISTIC_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_STATISTIC_ENTRY_FEATURE_COUNT = STATISTIC_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_STATISTIC_ENTRY_OPERATION_COUNT = STATISTIC_ENTRY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult <em>Logic Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Result</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
	 * @generated
	 */
	EClass getLogicResult();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getProblem()
	 * @see #getLogicResult()
	 * @generated
	 */
	EReference getLogicResult_Problem();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getStatistics()
	 * @see #getLogicResult()
	 * @generated
	 */
	EReference getLogicResult_Statistics();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getTrace()
	 * @see #getLogicResult()
	 * @generated
	 */
	EAttribute getLogicResult_Trace();

	/**
	 * Returns the meta object for the attribute list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Representation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult#getRepresentation()
	 * @see #getLogicResult()
	 * @generated
	 */
	EAttribute getLogicResult_Representation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult <em>Model Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Result</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
	 * @generated
	 */
	EClass getModelResult();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMaxInteger <em>Max Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Integer</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMaxInteger()
	 * @see #getModelResult()
	 * @generated
	 */
	EAttribute getModelResult_MaxInteger();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMinInteger <em>Min Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Integer</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMinInteger()
	 * @see #getModelResult()
	 * @generated
	 */
	EAttribute getModelResult_MinInteger();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult <em>Inconsistency Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inconsistency Result</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult
	 * @generated
	 */
	EClass getInconsistencyResult();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UnknownResult <em>Unknown Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Result</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UnknownResult
	 * @generated
	 */
	EClass getUnknownResult();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InsuficientResourcesResult <em>Insuficient Resources Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insuficient Resources Result</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InsuficientResourcesResult
	 * @generated
	 */
	EClass getInsuficientResourcesResult();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InsuficientResourcesResult#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InsuficientResourcesResult#getResourceName()
	 * @see #getInsuficientResourcesResult()
	 * @generated
	 */
	EAttribute getInsuficientResourcesResult_ResourceName();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ErrorResult <em>Error Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Result</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ErrorResult
	 * @generated
	 */
	EClass getErrorResult();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ErrorResult#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ErrorResult#getMessage()
	 * @see #getErrorResult()
	 * @generated
	 */
	EAttribute getErrorResult_Message();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics
	 * @generated
	 */
	EClass getStatistics();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getEntries()
	 * @see #getStatistics()
	 * @generated
	 */
	EReference getStatistics_Entries();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getTransformationTime <em>Transformation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Time</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getTransformationTime()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_TransformationTime();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverTime <em>Solver Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Time</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverTime()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_SolverTime();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverMemory <em>Solver Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solver Memory</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverMemory()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_SolverMemory();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry <em>Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic Entry</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry
	 * @generated
	 */
	EClass getStatisticEntry();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry#getName()
	 * @see #getStatisticEntry()
	 * @generated
	 */
	EAttribute getStatisticEntry_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UndecidableResult <em>Undecidable Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undecidable Result</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UndecidableResult
	 * @generated
	 */
	EClass getUndecidableResult();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry <em>Int Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Statistic Entry</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry
	 * @generated
	 */
	EClass getIntStatisticEntry();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry#getValue()
	 * @see #getIntStatisticEntry()
	 * @generated
	 */
	EAttribute getIntStatisticEntry_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry <em>Real Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Statistic Entry</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry
	 * @generated
	 */
	EClass getRealStatisticEntry();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry#getValue()
	 * @see #getRealStatisticEntry()
	 * @generated
	 */
	EAttribute getRealStatisticEntry_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry <em>String Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Statistic Entry</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry
	 * @generated
	 */
	EClass getStringStatisticEntry();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry#getValue()
	 * @see #getStringStatisticEntry()
	 * @generated
	 */
	EAttribute getStringStatisticEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicresultFactory getLogicresultFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl <em>Logic Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicResultImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getLogicResult()
		 * @generated
		 */
		EClass LOGIC_RESULT = eINSTANCE.getLogicResult();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_RESULT__PROBLEM = eINSTANCE.getLogicResult_Problem();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_RESULT__STATISTICS = eINSTANCE.getLogicResult_Statistics();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_RESULT__TRACE = eINSTANCE.getLogicResult_Trace();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_RESULT__REPRESENTATION = eINSTANCE.getLogicResult_Representation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl <em>Model Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getModelResult()
		 * @generated
		 */
		EClass MODEL_RESULT = eINSTANCE.getModelResult();

		/**
		 * The meta object literal for the '<em><b>Max Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_RESULT__MAX_INTEGER = eINSTANCE.getModelResult_MaxInteger();

		/**
		 * The meta object literal for the '<em><b>Min Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_RESULT__MIN_INTEGER = eINSTANCE.getModelResult_MinInteger();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InconsistencyResultImpl <em>Inconsistency Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InconsistencyResultImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getInconsistencyResult()
		 * @generated
		 */
		EClass INCONSISTENCY_RESULT = eINSTANCE.getInconsistencyResult();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UnknownResultImpl <em>Unknown Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UnknownResultImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getUnknownResult()
		 * @generated
		 */
		EClass UNKNOWN_RESULT = eINSTANCE.getUnknownResult();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InsuficientResourcesResultImpl <em>Insuficient Resources Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.InsuficientResourcesResultImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getInsuficientResourcesResult()
		 * @generated
		 */
		EClass INSUFICIENT_RESOURCES_RESULT = eINSTANCE.getInsuficientResourcesResult();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSUFICIENT_RESOURCES_RESULT__RESOURCE_NAME = eINSTANCE.getInsuficientResourcesResult_ResourceName();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ErrorResultImpl <em>Error Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ErrorResultImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getErrorResult()
		 * @generated
		 */
		EClass ERROR_RESULT = eINSTANCE.getErrorResult();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_RESULT__MESSAGE = eINSTANCE.getErrorResult_Message();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl <em>Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticsImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getStatistics()
		 * @generated
		 */
		EClass STATISTICS = eINSTANCE.getStatistics();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS__ENTRIES = eINSTANCE.getStatistics_Entries();

		/**
		 * The meta object literal for the '<em><b>Transformation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__TRANSFORMATION_TIME = eINSTANCE.getStatistics_TransformationTime();

		/**
		 * The meta object literal for the '<em><b>Solver Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__SOLVER_TIME = eINSTANCE.getStatistics_SolverTime();

		/**
		 * The meta object literal for the '<em><b>Solver Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__SOLVER_MEMORY = eINSTANCE.getStatistics_SolverMemory();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticEntryImpl <em>Statistic Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StatisticEntryImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getStatisticEntry()
		 * @generated
		 */
		EClass STATISTIC_ENTRY = eINSTANCE.getStatisticEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC_ENTRY__NAME = eINSTANCE.getStatisticEntry_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UndecidableResultImpl <em>Undecidable Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.UndecidableResultImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getUndecidableResult()
		 * @generated
		 */
		EClass UNDECIDABLE_RESULT = eINSTANCE.getUndecidableResult();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.IntStatisticEntryImpl <em>Int Statistic Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.IntStatisticEntryImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getIntStatisticEntry()
		 * @generated
		 */
		EClass INT_STATISTIC_ENTRY = eINSTANCE.getIntStatisticEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_STATISTIC_ENTRY__VALUE = eINSTANCE.getIntStatisticEntry_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.RealStatisticEntryImpl <em>Real Statistic Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.RealStatisticEntryImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getRealStatisticEntry()
		 * @generated
		 */
		EClass REAL_STATISTIC_ENTRY = eINSTANCE.getRealStatisticEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_STATISTIC_ENTRY__VALUE = eINSTANCE.getRealStatisticEntry_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StringStatisticEntryImpl <em>String Statistic Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.StringStatisticEntryImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl#getStringStatisticEntry()
		 * @generated
		 */
		EClass STRING_STATISTIC_ENTRY = eINSTANCE.getStringStatisticEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_STATISTIC_ENTRY__VALUE = eINSTANCE.getStringStatisticEntry_Value();

	}

} //LogicresultPackage
