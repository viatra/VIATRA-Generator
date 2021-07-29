package org.eclipse.viatra.solver.data.map.tests.smoke.fast;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Random;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.DiffCursor;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.eclipse.viatra.solver.data.map.tests.smoke.utils.TestPermuter;
import org.eclipse.viatra.solver.data.map.tests.support.MapTestEnvironment;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DiffCursorSmokeTest {
	public void runSmokeTest(String scenario, int seed, int steps, int maxKey, int maxValue, int commitFrequency,
			boolean evilHash) {
		String[] values = MapTestEnvironment.prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = MapTestEnvironment.prepareHashProvider(evilHash);

		VersionedMapStore<Integer, String> store = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		iterativeRandomPutsAndCommitsThenDiffcursor(scenario, store, steps, maxKey, values, seed, commitFrequency);
	}

	void iterativeRandomPutsAndCommitsThenDiffcursor(String scenario, VersionedMapStore<Integer, String> store,
			int steps, int maxKey, String[] values, int seed, int commitFrequency) {
		// 1. build a map with versions
		Random r = new Random(seed);
		VersionedMapImpl<Integer, String> versioned = (VersionedMapImpl<Integer, String>) store.createMap();
		int largestCommit = -1;

		for (int i = 0; i < steps; i++) {
			int index = i + 1;
			int nextKey = r.nextInt(maxKey);
			String nextValue = values[r.nextInt(values.length)];
			try {
				versioned.put(nextKey, nextValue);
			} catch (Exception exception) {
				exception.printStackTrace();
				fail(scenario + ":" + index + ": exception happened: " + exception);
			}
			if (index % commitFrequency == 0) {
				long version = versioned.commit();
				largestCommit = (int) version;
			}
			if (index % 10000 == 0)
				System.out.println(scenario + ":" + index + "/" + steps + " building finished");
		}
		// 2. create a non-versioned map,
		VersionedMapImpl<Integer, String> moving = (VersionedMapImpl<Integer, String>) store.createMap();
		Random r2 = new Random(seed + 1);

		final int diffTravelFrequency = commitFrequency * 2;
		for (int i = 0; i < steps; i++) {
			int index = i + 1;
			if (index % diffTravelFrequency == 0) {
				// difftravel
				long travelToVersion = r2.nextInt(largestCommit + 1);
				DiffCursor<Integer, String> diffCursor = moving.getDiffCursor(travelToVersion);
				moving.putAll(diffCursor);

			} else {
				// random puts
				int nextKey = r2.nextInt(maxKey);
				String nextValue = values[r2.nextInt(values.length)];
				try {
					moving.put(nextKey, nextValue);
				} catch (Exception exception) {
					exception.printStackTrace();
					fail(scenario + ":" + index + ": exception happened: " + exception);
				}
				if (index % commitFrequency == 0) {
					versioned.commit();
				}
				if (index % 10000 == 0)
					System.out.println(scenario + ":" + index + "/" + steps + " building finished");
			}
		}

	}

	@ParameterizedTest(name = "Mutable-Immutable Compare Smoke {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Timeout(value = 10)
	void parametrizedSmoke(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runSmokeTest("SmokeMutableImmutableCompareS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps,
				noKeys, noValues, commitFrequency, evilHash);
	}

	public static Stream<Arguments> parametrizedSmoke() {
		return TestPermuter.permutationWithSize(new Object[] { 1000 }, new Object[] { 3, 32, 32 * 32 },
				new Object[] { 2, 3 }, new Object[] { 1, 10, 100 }, new Object[] { 1, 2, 3 },
				new Object[] { false, true });
	}
}
