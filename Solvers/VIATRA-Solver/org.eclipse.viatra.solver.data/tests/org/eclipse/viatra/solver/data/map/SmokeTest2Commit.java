package org.eclipse.viatra.solver.data.map;

import static org.junit.Assert.fail;

import java.util.Random;

import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.junit.jupiter.api.Test;

public class SmokeTest2Commit {
	private void runSmokeTest(String scenario, int seed, int steps, int maxKey, int maxValue, int commitFrequency) {
		String[] values = prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = prepareHashProvider();
		
		VersionedMapStore<Integer, String> store = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		VersionedMapImpl<Integer, String> sut = (VersionedMapImpl<Integer, String>) store.createMap();
		MapTestEnvironment<Integer, String> e = new MapTestEnvironment<Integer, String>(sut);
		
		Random r = new Random(seed);
		
		iterativeRandomPutsAndCommits(scenario, steps, maxKey, values, e, r, commitFrequency);
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
	
	void iterativeRandomPutsAndCommits(
		String scenario,
		int steps,
		int maxKey,
		String[] values,
		MapTestEnvironment<Integer, String> e,
		Random r,
		int commitFrequency)
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
			if(index%commitFrequency == 0) {
				long version = e.sut.commit();
				System.out.println(scenario+":"+index+": Commit! " + version);
			}
		}
	}
	
	// Mini smoke frequent commints
	@Test
	void MiniSmokeFrequentK3V2v1() {
		runSmokeTest("MiniSmokeK3V2v1",0, 1000, 3, 2, 1);
	}
	@Test
	void MiniSmokeFrequentK3V2v2() {
		runSmokeTest("MiniSmokeK3V2v2",1, 1000, 3, 2, 1);
	}
	@Test
	void MiniSmokeFrequentK3V2v3() {
		runSmokeTest("MiniSmokeK3V2v3",3, 1000, 3, 2, 1);
	}
	@Test
	void MiniSmokeFrequentK3V3v1() {
		runSmokeTest("MiniSmokeK3V2v1",0, 1000, 3, 3, 1);
	}
	@Test
	void MiniSmokeFrequentK3V3v2() {
		runSmokeTest("MiniSmokeK3V2v2",1, 1000, 3, 3, 1);
	}
	@Test
	void MiniSmokeFrequentK3V3v3() {
		runSmokeTest("MiniSmokeK3V2v3",3, 1000, 3, 3, 1);
	}
	// Mini smoke rare commits
	@Test
	void MiniSmokeRareK3V2v1() {
		runSmokeTest("MiniSmokeK3V2v1",0, 1000, 3, 2, 100);
	}
	@Test
	void MiniSmokeRareK3V2v2() {
		runSmokeTest("MiniSmokeK3V2v2",1, 1000, 3, 2, 100);
	}
	@Test
	void MiniSmokeKRare3V2v3() {
		runSmokeTest("MiniSmokeK3V2v3",3, 1000, 3, 2, 100);
	}
	@Test
	void MiniSmokeRareK3V3v1() {
		runSmokeTest("MiniSmokeK3V2v1",0, 1000, 3, 3, 100);
	}
	@Test
	void MiniSmokeRareK3V3v2() {
		runSmokeTest("MiniSmokeK3V2v2",1, 1000, 3, 3, 100);
	}
	@Test
	void MiniSmokeRareK3V3v3() {
		runSmokeTest("MiniSmokeK3V2v3",3, 1000, 3, 3, 100);
	}
	
	// Medium smoke
	@Test
	void MediumSmokeK3V2v1() {
		runSmokeTest("MediumSmokeK3V2v1",1, 1000, 32, 2, 10);
	}
	@Test
	void MediumSmokeK3V2v2() {
		runSmokeTest("MediumSmokeK3V2v2",2, 1000, 32, 2, 10);
	}
	@Test
	void MediumSmokeK3V2v3() {
		runSmokeTest("MediumSmokeK3V2v3",3, 1000, 32, 2, 10);
	}
	
	//Large Smoke
	@Test
	void SmokeLargeRareCommit() {
		runSmokeTest("SmokeLarge",0, 32*32*32*32, 32*32-1, 2, 100);
	}
	@Test
	void SmokeLargeNormalCommit() {
		runSmokeTest("SmokeLarge",0, 32*32*32*32, 32*32-1, 2, 10);
	}
	@Test
	void SmokeLargeFrequentCommit() {
		runSmokeTest("SmokeLarge",0, 32*32*32*32, 32*32-1, 2, 1);
	}
}
