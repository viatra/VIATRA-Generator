package org.eclipse.viatra.solver.data.map.tests.smoke;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.eclipse.viatra.solver.data.map.tests.smoke.utils.FuzzTestUtils;
import org.eclipse.viatra.solver.data.map.tests.utils.MapTestEnvironment;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContentEqualsFuzzTest {
	private void runSmokeTest(String scenario, int seed, int steps, int maxKey, int maxValue, int commitFrequency,
			boolean evilHash) {
		String[] values = MapTestEnvironment.prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = MapTestEnvironment.prepareHashProvider(evilHash);

		Random r = new Random(seed);

		iterativeRandomPutsAndCommitsThenCompare(scenario, chp, steps, maxKey, values, r, commitFrequency);
	}

	private void iterativeRandomPutsAndCommitsThenCompare(String scenario, ContinousHashProvider<Integer> chp, int steps, int maxKey, String[] values, Random r, int commitFrequency) {
		
		VersionedMapStore<Integer, String> store1 = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		VersionedMap<Integer, String> sut1 = store1.createMap();
		
		// Fill one map
		for (int i = 0; i < steps; i++) {
			int index1 = i + 1;
			int nextKey = r.nextInt(maxKey);
			String nextValue = values[r.nextInt(values.length)];
			try {
				sut1.put(nextKey, nextValue);
			} catch (Exception exception) {
				exception.printStackTrace();
				fail(scenario + ":" + index1 + ": exception happened: " + exception);
			}
			MapTestEnvironment.printStatus(scenario, index1, steps, "Fill");
			if (index1 % commitFrequency == 0) {
				sut1.commit();
			}
		}
		
		// Get the content of the first map
		List<SimpleEntry<Integer, String>> content = new LinkedList<>();
		Cursor<Integer, String> cursor = sut1.getCursor();
		while (cursor.move()) {
			content.add(new SimpleEntry<>(cursor.getKey(), cursor.getValue()));
		}
		
		// Randomize the order of the content
		Collections.shuffle(content, r);
		
		VersionedMapStore<Integer, String> store2 = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		VersionedMap<Integer, String> sut2 = store2.createMap();
		int index2 = 1;
		for (SimpleEntry<Integer, String> entry : content) {
			sut2.put(entry.getKey(), entry.getValue());
			if(index2++%commitFrequency == 0)
				sut2.commit();
		}
		
		// Check the integrity of the maps
		((VersionedMapImpl<Integer,String>) sut1).checkIntegrity();
		((VersionedMapImpl<Integer,String>) sut2).checkIntegrity();
		
//		// Compare the two maps
		// By size
		assertEquals(sut1.getSize(), content.size());
		assertEquals(sut2.getSize(), content.size());
		
		
		
		// By cursors
		Cursor<Integer, String> cursor1 = sut1.getCursor();
		Cursor<Integer, String> cursor2 = sut2.getCursor();
		int index3 = 1;
		boolean canMove = true;
		do{
			boolean canMove1 = cursor1.move();
			boolean canMove2 = cursor2.move();
			assertEquals(canMove1, canMove2, scenario + ":" + index3 +" Cursors stopped at different times!");
			assertEquals(cursor1.getKey(), cursor2.getKey(), scenario + ":" + index3 +" Cursors have different keys!");
			assertEquals(cursor1.getValue(), cursor2.getValue(), scenario + ":" + index3 +" Cursors have different values!");
			
			canMove = canMove1;
			MapTestEnvironment.printStatus(scenario, index3++, content.size(), "Compare");
		} while (canMove);
		
		// By hashcode
		assertEquals(sut1.hashCode(), sut2.hashCode(), "Hash codes are not equal!");
		
		// By equals
		assertEquals(sut1, sut2, "Maps are not equals");
	}

	@ParameterizedTest(name = "Compare Smoke {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Timeout(value = 10)
	@Tag("smoke")
	void parametrizedFastSmoke(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runSmokeTest("SmokeCommitS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps, noKeys, noValues,
				commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedFastSmoke() {
		return FuzzTestUtils.permutationWithSize(new Object[] { FuzzTestUtils.FAST_STEP_COUNT }, new Object[] { 3, 32, 32 * 32 },
				new Object[] { 2, 3 }, new Object[] { 1, 10, 100 }, new Object[] { 1, 2, 3 },
				new Object[] { false, true });
	}

	@ParameterizedTest(name = "Immutable Smoke {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Tag("smoke")
	@Tag("slow")
	void parametrizedSlowSmoke(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed,
			boolean evilHash) {
		runSmokeTest("SmokeCommitS" + steps + "K" + noKeys + "V" + noValues + "s" + seed, seed, steps, noKeys, noValues,
				commitFrequency, evilHash);
	}

	static Stream<Arguments> parametrizedSlowSmoke() {
		return FuzzTestUtils.changeStepCount(parametrizedFastSmoke(), 1);
	}
}
