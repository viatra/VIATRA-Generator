package org.eclipse.viatra.solver.data.map;

import static org.junit.Assert.fail;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class MapSmokeTest {
	
	private void runSmokeTest(String scenario, int seed, int steps, int maxKey, int maxValue) {
		String[] values = prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = prepareHashProvider();
		
		VersionedMap<Integer, String> sut = new VersionedMap<Integer, String>(chp, values[0]);
		MapTestEnvironment<Integer, String> e = new MapTestEnvironment<Integer, String>(sut);
		
		Random r = new Random(seed);
		
		iterativeRandomPuts(scenario, steps, maxKey, values, e, r);
	}



	private String[] prepareValues(int maxValue) {
		String[] values = new String[maxValue];
		values[0] = "DEFAULT";
		for(int i = 1; i<values.length; i++) {
			values[i] = "VAL"+i;
		}
		return values;
	}
	private ContinousHashProvider<Integer> prepareHashProvider() {
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
		return chp;
	}

//	void recursiveCall(
//		int steps,
//		int maxKey,
//		int maxValue,
//		String[] values,
//		MapTestEnvironment<Integer, String> e,
//		Random r)
//	{
//		if(steps<=0) {
//			return;
//		} else {
//			e.put(r.nextInt(maxKey), values[r.nextInt(maxValue)]);
//			e.checkEquivalence();
//			
//			recursiveCall(steps-1, maxKey, maxValue, values, e, r);
//		}
//	}
	
	void iterativeRandomPuts(
		String scenario,
		int steps,
		int maxKey,
		String[] values,
		MapTestEnvironment<Integer, String> e,
		Random r)
	{
		int stopAt = -1;
		for(int i=0; i<steps; i++) {
			int index = i+1;
			int nextKey = r.nextInt(maxKey);
			String nextValue = values[r.nextInt(values.length)];
			if(index == stopAt) {
				System.out.println("issue!");
				System.out.println("State before:");
				e.printComparison();
				e.sut.prettyPrint();
				System.out.println("Next: put("+nextKey+","+nextValue+")");
			}
			try {
				e.put(nextKey, nextValue);
				if(index == stopAt) {
					e.sut.prettyPrint();
				}
				e.checkEquivalence(scenario+":"+index);
			} catch (Exception exception) {
				exception.printStackTrace();
				fail(scenario+":"+index+": exception happened: "+exception);
			}
			if(index%10000==0) System.out.println(scenario+":"+index+" finished");
		}
	}
	
	@Test
	void MiniSmokeK3V2v1() {
		runSmokeTest("MiniSmokeK3V2v1",0, 1000, 3, 2);
	}
	@Test
	void MiniSmokeK3V2v2() {
		runSmokeTest("MiniSmokeK3V2v2",1, 1000, 3, 2);
	}
	@Test
	void MiniSmokeK3V2v3() {
		runSmokeTest("MiniSmokeK3V2v3",3, 1000, 3, 2);
	}
	@Test
	void MediumSmokeK3V2v1() {
		runSmokeTest("MediumSmokeK3V2v1",1, 1000, 32, 2);
	}
	@Test
	void MediumSmokeK3V2v2() {
		runSmokeTest("MediumSmokeK3V2v2",2, 1000, 32, 2);
	}
	@Test
	void MediumSmokeK3V2v3() {
		runSmokeTest("MediumSmokeK3V2v3",3, 1000, 32, 2);
	}
	@Test
	void SmokeLarge() {
		runSmokeTest("SmokeLarge",0, 32*32*32*32, 32*32-1, 2);
	}
}
