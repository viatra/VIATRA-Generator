package org.eclipse.viatra.solver.data.map.tests.smoke;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.eclipse.viatra.solver.data.map.tests.smoke.utils.SmokeTestUtils;
import org.eclipse.viatra.solver.data.map.tests.utils.MapTestEnvironment;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SharedStoreTest {
	private void runSmokeTest(String scenario, int seed, int steps, int maxKey, int maxValue, int commitFrequency,
			boolean evilHash) {
		String[] values = MapTestEnvironment.prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = MapTestEnvironment.prepareHashProvider(evilHash);

		List<VersionedMapStore<Integer, String>> stores = VersionedMapStoreImpl.createSharedVersionedMapStores(5, chp, values[0]);

		iterativeRandomPutsAndCommitsThenRestore(scenario, stores, steps, maxKey, values, seed, commitFrequency);
	}

	private void iterativeRandomPutsAndCommitsThenRestore(String scenario, List<VersionedMapStore<Integer, String>> stores,
			int steps, int maxKey, String[] values, int seed, int commitFrequency) {
		// 1. maps with versions
		Random r = new Random(seed);
		List<VersionedMapImpl<Integer, String>> versioneds = new LinkedList<>();
		for(VersionedMapStore<Integer, String> store : stores) {
			versioneds.add((VersionedMapImpl<Integer, String>) store.createMap());
		}
				
		List<Map<Integer, Long>> index2Version = new LinkedList<>();
		for(VersionedMapStore<Integer, String> store : stores) {
			index2Version.add(new HashMap<>());
		}

		for (int i = 0; i < steps; i++) {
			int stepIndex = i + 1;
			for (int storeIndex = 0; storeIndex<versioneds.size(); storeIndex++) {
				int nextKey = r.nextInt(maxKey);
				String nextValue = values[r.nextInt(values.length)];
				versioneds.get(storeIndex).put(nextKey, nextValue);
				if (stepIndex % commitFrequency == 0) {
					long version = versioneds.get(storeIndex).commit();
					index2Version.get(storeIndex).put(i, version);
				}
				MapTestEnvironment.printStatus(scenario, stepIndex, steps, "building");
			}		
		}
		// 2. create a non-versioned and
		List<VersionedMapImpl<Integer, String>> reference = new LinkedList<>();
		for(VersionedMapStore<Integer, String> store : stores) {
			reference.add((VersionedMapImpl<Integer, String>) store.createMap());
		}
		r = new Random(seed);

		for (int i = 0; i < steps; i++) {
			int index = i + 1;
			for (int storeIndex = 0; storeIndex<versioneds.size(); storeIndex++) {
				int nextKey = r.nextInt(maxKey);
				String nextValue = values[r.nextInt(values.length)];
				reference.get(storeIndex).put(nextKey, nextValue);
				if (index % commitFrequency == 0) {
					versioneds.get(storeIndex).restore(index2Version.get(storeIndex).get(i));
					MapTestEnvironment.compareTwoMaps(scenario + ":" + index, reference.get(storeIndex), versioneds.get(storeIndex));
				}
			}
			MapTestEnvironment.printStatus(scenario, index, steps, "comparison");	
		}

	}

	@ParameterizedTest(name = "Shared Store Test {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Timeout(value = 10)
	@Tag("smoke")
	void parametrizedFastSmoke(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runSmokeTest("RestoreS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps, noKeys, noValues,
				commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedFastSmoke() {
		return SmokeTestUtils.permutationWithSize(new Object[] { SmokeTestUtils.FAST_STEP_COUNT }, new Object[] { 3, 32, 32 * 32 },
				new Object[] { 2, 3 }, new Object[] { 1, 10, 100 }, new Object[] { 1, 2, 3 },
				new Object[] { false, true });
	}

	@ParameterizedTest(name = "Shared Store Test {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Tag("smoke")
	@Tag("slow")
	void parametrizedSlowSmoke(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runSmokeTest("RestoreS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps, noKeys, noValues,
				commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedSlowSmoke() {
		return SmokeTestUtils.changeStepCount(RestoreSmokeTest.parametrizedFastSmoke(), 1);
	}
}
