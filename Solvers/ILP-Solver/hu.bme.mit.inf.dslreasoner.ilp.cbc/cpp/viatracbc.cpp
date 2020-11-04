
#include <cmath>
#include <cstdlib>
#include <iostream>
#include <stdexcept>

#include <jni.h>

#include "CbcBranchDefaultDecision.hpp"
#include "CbcCompareDefault.hpp"
#include "CbcHeuristic.hpp"
#include "CbcHeuristicLocal.hpp"
#include "CbcModel.hpp"
#include "CglClique.hpp"
#include "CglFlowCover.hpp"
#include "CglGomory.hpp"
#include "CglKnapsackCover.hpp"
#include "CglMixedIntegerRounding.hpp"
#include "CglOddHole.hpp"
#include "CglProbing.hpp"
#include "CoinModel.hpp"
#include "OsiClpSolverInterface.hpp"

#include "viatracbc.hpp"

static const char *const kCbcExceptionClassName = "hu/bme/mit/inf/dslreasoner/ilp/cbc/CbcException";
static const char *const kRuntimeExceptionClassName = "java/lang/RuntimeException";

static const jint kCbcSolutionBounded = 0;
static const jint kCbcSolutionUnbounded = 1;
static const jint kCbcUnsat = 2;
static const jint kCbcAbandoned = 3;
static const jint kCbcTimeout = 4;
static const jint kCbcError = 5;

static CoinModel CreateModel(JNIEnv *env, jdoubleArray columnLowerBoundsArray,
    jdoubleArray columnUpperBoundsArray, jintArray rowStartsArray, jintArray columnIndicesArray,
    jdoubleArray entriedArray, jdoubleArray rowLowerBoundsArray, jdoubleArray rowUpperBoundsArray,
    jdoubleArray objectiveArray, jboolean lpRelaxation);
static void CreateModelColumns(JNIEnv *env, jdoubleArray columnLowerBoundsArray,
    jdoubleArray columnUpperBoundsArray, jdoubleArray objectiveArray, jboolean lpRelaxation,
    CoinModel &build);
static void CreateModelRows(JNIEnv *env, jintArray rowStartsArray, jintArray columnIndicesArray,
    jdoubleArray entriesArray, jdoubleArray rowLowerBoundsArray, jdoubleArray rowUpperBoundsArray,
    CoinModel &build);
static jint SolveModel(CoinModel &build, jdouble timeoutSeconds, jboolean silent, jdouble &value);
static void ThrowException(JNIEnv *env, const char *message);

template <
    typename Array,
    typename Element,
    Element *(JNIEnv::*GetElementsPtr)(Array, jboolean *),
    void (JNIEnv::*ReleaseElementsPtr)(Array, Element *, jint)
>
class PinnedArray {
public:
    PinnedArray(JNIEnv *env, Array array)
        : env_{env}, array_{array}, elements_{(env->*GetElementsPtr)(array, nullptr)} {
        if (elements_ == nullptr) {
            throw std::runtime_error("Failed to pin array elements");
        }
    }
    PinnedArray(const PinnedArray &) = delete;
    PinnedArray(PinnedArray &&) = delete;
    PinnedArray &operator=(const PinnedArray &) = delete;
    PinnedArray &operator=(PinnedArray &&) = delete;
    ~PinnedArray() {
        (env_->*ReleaseElementsPtr)(array_, elements_, 0);
    }

    operator Element *() { return elements_; }
    operator const Element *() const { return elements_; }

private:
    JNIEnv *env_;
    Array array_;
    Element *elements_;
};

using PinnedIntArray = PinnedArray<jintArray, jint, &JNIEnv::GetIntArrayElements, &JNIEnv::ReleaseIntArrayElements>;
using PinnedDoubleArray = PinnedArray<jdoubleArray, jdouble, &JNIEnv::GetDoubleArrayElements, &JNIEnv::ReleaseDoubleArrayElements>;

jint Java_hu_bme_mit_inf_dslreasoner_ilp_cbc_CbcSolver_solveIlpProblem(
    JNIEnv *env, jclass klazz, jdoubleArray columnLowerBoundsArray, jdoubleArray columnUpperBoundsArray,
    jintArray rowStartsArray, jintArray columnIndicesArray, jdoubleArray entriesArray,
    jdoubleArray rowLowerBoundsArray, jdoubleArray rowUpperBoundsArray, jdoubleArray objectiveArray,
    jdoubleArray outputArray, jboolean lpRelaxation, jdouble timeoutSeconds, jboolean silent) {
    try {
        auto build = CreateModel(env, columnLowerBoundsArray, columnUpperBoundsArray,
            rowStartsArray, columnIndicesArray, entriesArray, rowLowerBoundsArray, rowUpperBoundsArray,
            objectiveArray, lpRelaxation);
        double value;
        jint result = SolveModel(build, timeoutSeconds, silent, value);
        if (result == kCbcSolutionBounded) {
            PinnedDoubleArray output{env, outputArray};
            *output = value;
        }
        return result;
    } catch (const std::exception &e) {
        ThrowException(env, e.what());
    } catch (...) {
        ThrowException(env, "Unknown solver error");
    }
    return kCbcError;
}

CoinModel CreateModel(JNIEnv *env, jdoubleArray columnLowerBoundsArray,
    jdoubleArray columnUpperBoundsArray, jintArray rowStartsArray, jintArray columnIndicesArray,
    jdoubleArray entriesArray, jdoubleArray rowLowerBoundsArray, jdoubleArray rowUpperBoundsArray,
    jdoubleArray objectiveArray, jboolean lpRelaxation) {
    CoinModel build;
    CreateModelColumns(env, columnLowerBoundsArray, columnUpperBoundsArray, objectiveArray,
        lpRelaxation, build);
    CreateModelRows(env, rowStartsArray, columnIndicesArray, entriesArray, rowLowerBoundsArray,
        rowUpperBoundsArray, build);
    return build;
}

void CreateModelColumns(JNIEnv *env, jdoubleArray columnLowerBoundsArray,
    jdoubleArray columnUpperBoundsArray, jdoubleArray objectiveArray, jboolean lpRelaxation,
    CoinModel &build) {
    int numColumns = env->GetArrayLength(columnLowerBoundsArray);
    PinnedDoubleArray columnLowerBounds{env, columnLowerBoundsArray};
    PinnedDoubleArray columnUpperBounds{env, columnUpperBoundsArray};
    PinnedDoubleArray objective{env, objectiveArray};
    for (int i = 0; i < numColumns; i++) {
        build.setColumnBounds(i, columnLowerBounds[i], columnUpperBounds[i]);
        build.setObjective(i, objective[i]);
        if (!lpRelaxation) {
            build.setInteger(i);
        }
    }
}

void CreateModelRows(JNIEnv *env, jintArray rowStartsArray, jintArray columnIndicesArray,
    jdoubleArray entriesArray, jdoubleArray rowLowerBoundsArray, jdoubleArray rowUpperBoundsArray,
    CoinModel &build) {
    int numRows = env->GetArrayLength(rowLowerBoundsArray);
    PinnedIntArray rowStarts{env, rowStartsArray};
    PinnedIntArray columnIndices{env, columnIndicesArray};
    PinnedDoubleArray entries{env, entriesArray};
    PinnedDoubleArray rowLowerBounds{env, rowLowerBoundsArray};
    PinnedDoubleArray rowUpperBounds{env, rowUpperBoundsArray};
    for (int i = 0; i < numRows; i++) {
        int rowStart = rowStarts[i];
        int numbersInRow = rowStarts[i + 1] - rowStart;
        build.addRow(numbersInRow, &columnIndices[rowStart], &entries[rowStart],
            rowLowerBounds[i], rowUpperBounds[i]);
    }
}

jint SolveModel(CoinModel &build, jdouble timeoutSeconds, jboolean silent, jdouble &value) {
    OsiClpSolverInterface solver;
    solver.loadFromCoinModel(build);
    CbcModel model{solver};

    if (timeoutSeconds >= 0) {
        model.setDblParam(CbcModel::CbcMaximumSeconds, timeoutSeconds);
    }
    if (silent == JNI_FALSE) {
        model.messageHandler()->setLogLevel(2);
        model.solver()->messageHandler()->setLogLevel(1);
    } else {
        model.solver()->setHintParam(OsiDoReducePrint, true, OsiHintTry);
        model.messageHandler()->setLogLevel(0);
        model.solver()->messageHandler()->setLogLevel(0);
    }
    
    // Cut generators and heuristics are used according to
    // https://github.com/coin-or/Cbc/blob/6b977b6707f1755520c64fea57b95891c1f3ddc0/Cbc/examples/sample2.cpp

    CglProbing probing;
    probing.setUsingObjective(true);
    probing.setMaxPass(1);
    probing.setMaxPassRoot(5);
    probing.setMaxProbe(10);
    probing.setMaxProbeRoot(1000);
    probing.setMaxLook(50);
    probing.setMaxLookRoot(500);
    probing.setMaxElements(200);
    probing.setRowCuts(3);
    model.addCutGenerator(&probing, -1, "Probing");

    CglGomory gomory;
    gomory.setLimit(300);
    model.addCutGenerator(&gomory, -1, "Gomory");

    CglKnapsackCover knapsackCover;
    model.addCutGenerator(&knapsackCover, -1, "KnapsackCover");

    CglClique clique;
    clique.setStarCliqueReport(false);
    clique.setRowCliqueReport(false);
    model.addCutGenerator(&clique, -1, "Clique");

    CglFlowCover flowCover;
    model.addCutGenerator(&flowCover, -1, "FlowCover");

    CglMixedIntegerRounding mixedIntegerRounding;
    model.addCutGenerator(&mixedIntegerRounding, -1, "MixedIntegerRounding");

    OsiClpSolverInterface *osiClp = dynamic_cast<OsiClpSolverInterface *>(model.solver());
    if (osiClp != nullptr) {
        osiClp->setSpecialOptions(128);
        osiClp->setupForRepeatedUse(0, 0);
    }

    CbcRounding rounding;
    model.addHeuristic(&rounding);

    CbcHeuristicLocal localHeuristic;
    model.addHeuristic(&localHeuristic);

    CbcBranchDefaultDecision branchDecision;
    model.setBranchingMethod(&branchDecision);

    CbcCompareDefault nodeComparison;
    model.setNodeComparison(nodeComparison);

    model.initialSolve();

    if (model.isInitialSolveProvenPrimalInfeasible()) {
        return kCbcUnsat;
    }
    if (model.isInitialSolveProvenDualInfeasible()) {
        return kCbcSolutionUnbounded;
    }
    if (model.isInitialSolveAbandoned()) {
        return kCbcTimeout;
    }

    model.setMinimumDrop(CoinMin(1.0, fabs(model.getMinimizationObjValue()) * 1.0e-3 + 1.0e-4));
    model.setMaximumCutPassesAtRoot(-100);
    model.setNumberStrong(10);
    model.solver()->setIntParam(OsiMaxNumIterationHotStart, 100);

    model.branchAndBound();

    switch (model.status()) {
    case 0:
        if (model.isProvenInfeasible()) {
            return kCbcUnsat;
        }
        if (model.isProvenDualInfeasible()) {
            return kCbcSolutionUnbounded;
        }
        if (model.isProvenOptimal()) {
            value = model.getMinimizationObjValue();
            return kCbcSolutionBounded;
        }
        throw std::runtime_error("CBC status is 0, but no solution is found");
    case 1:
        return kCbcTimeout;
    case 2:
        return kCbcAbandoned;
    default:
        throw std::runtime_error("Unknown CBC status");
    }
}

void ThrowException(JNIEnv *env, const char *message) {
    jclass exceptionClass = env->FindClass(kCbcExceptionClassName);
    if (exceptionClass == nullptr) {
        std::cerr << "WARNING: " << kCbcExceptionClassName << " class was not found" << std::endl;
        exceptionClass = env->FindClass(kRuntimeExceptionClassName);
        if (exceptionClass == nullptr) {
            std::cerr << "FATAL: " << kRuntimeExceptionClassName << " class was not found" << std::endl;
            std::cerr << "FATAL: " << message << std::endl;
            std::exit(EXIT_FAILURE);
        }
    }
    if (env->ThrowNew(exceptionClass, message) < 0) {
        std::cerr << "FATAL: Could not throw java exception" << std::endl;
        std::cerr << "FATAL: " << message << std::endl;
        std::exit(EXIT_FAILURE);
    }
}
