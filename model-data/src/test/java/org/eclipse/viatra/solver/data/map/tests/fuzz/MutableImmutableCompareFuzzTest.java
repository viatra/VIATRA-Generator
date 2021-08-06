package org.eclipse.viatra.solver.data.map.tests.fuzz;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Random;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.eclipse.viatra.solver.data.map.tests.fuzz.utils.FuzzTestUtils;
import org.eclipse.viatra.solver.data.map.tests.utils.MapTestEnvironment;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MutableImmutableCompareFuzzTest {
	private void runFuzzTest(String scenario, int seed, int steps, int maxKey, int maxValue, int commitFrequency,
			boolean evilHash) {
		String[] values = MapTestEnvironment.prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = MapTestEnvironment.prepareHashProvider(evilHash);

		VersionedMapStore<Integer, String> store = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		VersionedMapImpl<Integer, String> immutable = (VersionedMapImpl<Integer, String>) store.createMap();
		VersionedMapImpl<Integer, String> mutable = (VersionedMapImpl<Integer, String>) store.createMap();

		Random r = new Random(seed);

		iterativeRandomPutsAndCommitsAndCompare(scenario, immutable, mutable, steps, maxKey, values, r,
				commitFrequency);
	}

	private void iterativeRandomPutsAndCommitsAndCompare(String scenario, VersionedMapImpl<Integer, String> immutable,
			VersionedMapImpl<Integer, String> mutable, int steps, int maxKey, String[] values, Random r,
			int commitFrequency) {
		for (int i = 0; i < steps; i++) {
			int index = i + 1;
			int nextKey = r.nextInt(maxKey);
			String nextValue = values[r.nextInt(values.length)];
			try {
				immutable.put(nextKey, nextValue);
				mutable.put(nextKey, nextValue);
			} catch (Exception exception) {
				exception.printStackTrace();
				fail(scenario + ":" + index + ": exception happened: " + exception);
			}
			if (index % commitFrequency == 0) {
				immutable.commit();
			}
			MapTestEnvironment.compareTwoMaps(scenario + ":" + index, immutable, mutable);

			MapTestEnvironment.printStatus(scenario, index, steps, null);
		}
	}

	@ParameterizedTest(name = "Mutable-Immutable Compare {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Timeout(value = 10)
	@Tag("fuzz")
	void parametrizedFastFuzz(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runFuzzTest("MutableImmutableCompareS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps,
				noKeys, noValues, commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedFastFuzz() {
		return FuzzTestUtils.permutationWithSize(new Object[] { FuzzTestUtils.FAST_STEP_COUNT }, new Object[] { 3, 32, 32 * 32 },
				new Object[] { 2, 3 }, new Object[] { 1, 10, 100 }, new Object[] { 1, 2, 3 },
				new Object[] { false, true });
	}

	@ParameterizedTest(name = "Mutable-Immutable Compare {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Tag("fuzz")
	@Tag("slow")
	void parametrizedSlowFuzz(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runFuzzTest("MutableImmutableCompareS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps,
				noKeys, noValues, commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedSlowFuzz() {
		return FuzzTestUtils.changeStepCount(MutableImmutableCompareFuzzTest.parametrizedFastFuzz(), 1);
	}
}
