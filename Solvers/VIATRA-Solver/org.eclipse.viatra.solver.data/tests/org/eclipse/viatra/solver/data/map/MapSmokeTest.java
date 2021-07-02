package org.eclipse.viatra.solver.data.map;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class MapSmokeTest {
	
	private void runTest(int seed, int steps, int maxKey, int maxValue) {
		String[] values = new String[maxValue];
		for(int i = 0; i<values.length; i++) {
			values[i] = "VALUE-"+i;
		}
		ContinousHashProvider<Integer> chp = new ContinousHashProvider<Integer>() {
			
			@Override
			public int getHash(Integer key, int index) {
				int result = 1;
				final int prime = 31;
				result = prime*result + key;
				result = prime*result + index;
				return result;
			}
			
			@Override
			public boolean equals(Integer key1, Integer key2) {
				return key1.equals(key2);
			}
		};
		
		VersionedMap<Integer, String> sut = new VersionedMap<Integer, String>(chp, values[0]);
		MapTestEnvironment<Integer, String> e = new MapTestEnvironment<Integer, String>(sut);
		
		Random r = new Random(seed);
		
		iterativeCall(steps, maxKey, maxValue, values, e, r);
	}

	void recursiveCall(
		int steps,
		int maxKey,
		int maxValue,
		String[] values,
		MapTestEnvironment<Integer, String> e,
		Random r)
	{
		if(steps<=0) {
			return;
		} else {
			e.put(r.nextInt(maxKey), values[r.nextInt(maxValue)]);
			e.checkEquivalence();
			
			recursiveCall(steps-1, maxKey, maxValue, values, e, r);
		}
	}
	
	void iterativeCall(int steps,
		int maxKey,
		int maxValue,
		String[] values,
		MapTestEnvironment<Integer, String> e,
		Random r)
	{
		for(int i=0; i<steps; i++) {
			e.put(r.nextInt(maxKey), values[r.nextInt(maxValue)]);
			e.checkEquivalence();
		}
	}
	
	@Test
	void runTest1() {
		runTest(0, 100000, 3, 2);
	}
	@Test
	void runTest2() {
		runTest(1, 100000, 3, 2);
	}
	@Test
	void runTest3() {
		runTest(1, 32*32*32*32, 32*32-1, 2);
	}
}
