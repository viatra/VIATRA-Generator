#ifndef HU_BME_MIT_INF_DSLREASONER_ILP_CBC_
#define HU_BME_MIT_INF_DSLREASONER_ILP_CBC_

#include <jni.h>

extern "C" {

JNIEXPORT jint JNICALL Java_hu_bme_mit_inf_dslreasoner_ilp_cbc_CbcSolver_solveIlpProblem(
    JNIEnv *env, jclass klazz, jdoubleArray columnLowerBoundsArray, jdoubleArray columnUpperBoundsArray,
    jintArray rowStartsArray, jintArray columnIndicesArray, jdoubleArray entriesArray,
    jdoubleArray rowLowerBoundsArray, jdoubleArray rowUpperBoundsArray, jdoubleArray objectiveArray,
    jdoubleArray outputArray, jdouble timeoutSeconds, jboolean silent);

}

#endif // HU_BME_MIT_INF_DSLREASONER_ILP_CBC_
