package org.eclipse.viatra.solver.data.map.tests.fuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.map.tests.fuzz.utils.FuzzTestUtils;
import org.eclipse.viatra.solver.data.map.tests.utils.MapTestEnvironment;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MultiThreadFuzzTest {
	public static final int noThreads = 32;
	
	private void runFuzzTest(String scenario, int seed, int steps, int maxKey, int maxValue, int commitFrequency,
			boolean evilHash) {
		String[] values = MapTestEnvironment.prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = MapTestEnvironment.prepareHashProvider(evilHash);

		VersionedMapStore<Integer, String> store = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		
		// initialize runnables
		MultiThreadTestRunnable[] runnables = new MultiThreadTestRunnable[noThreads];
		for(int i = 0; i<noThreads; i++) {
			runnables[i] = new MultiThreadTestRunnable(scenario+"-T"+(i+1), store, steps, maxKey, values, seed, commitFrequency);
		}
		
		// initialize threads
		Thread[] threads = new Thread[noThreads];
		for(int i = 0; i<noThreads; i++) {
			threads[i] = new Thread(runnables[i]);
		}
		
		// start threads;
		for(int i = 0; i<noThreads; i++) {
			threads[i].start();
		}
		
		// wait all the threads;
		for(int i = 0; i<noThreads; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				fail("Thread "+i+" interrupted.");
			}
		}
		
		// collect errors
		List<Throwable> errors = new LinkedList<>();
		for(int i = 0; i<noThreads; i++) {
			errors.addAll(runnables[i].getErrors());
		}
		
		assertEquals(Collections.EMPTY_LIST, errors);
	}

	@ParameterizedTest(name = "Multithread {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Timeout(value = 10)
	@Tag("fuzz")
	void parametrizedFastFuzz(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runFuzzTest("MultithreadS" + steps + "K" + noKeys + "V" + noValues + "CF" + commitFrequency + "s" + seed, seed, steps, noKeys, noValues,
				commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedFastFuzz() {
		return FuzzTestUtils.permutationWithSize(new Object[] { FuzzTestUtils.FAST_STEP_COUNT }, new Object[] { 3, 32, 32 * 32 },
				new Object[] { 2, 3 }, new Object[] { 1, 10, 100 }, new Object[] { 1, 2, 3 },
				new Object[] { false, true });
	}

	@ParameterizedTest(name = "Multithread {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Tag("fuzz")
	@Tag("slow")
	void parametrizedSlowFuzz(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runFuzzTest("RestoreS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps, noKeys, noValues,
				commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedSlowFuzz() {
		return FuzzTestUtils.changeStepCount(RestoreFuzzTest.parametrizedFastFuzz(), 1);
	}
}
