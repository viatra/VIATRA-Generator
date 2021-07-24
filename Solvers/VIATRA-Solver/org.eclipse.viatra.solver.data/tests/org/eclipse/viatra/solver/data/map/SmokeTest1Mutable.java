package org.eclipse.viatra.solver.data.map;

import static org.junit.Assert.fail;

import java.util.Random;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SmokeTest1Mutable {
	
	private void runSmokeTest(String scenario, int seed, int steps, int maxKey, int maxValue, boolean evilHash) {
		String[] values = MapTestEnvironment.prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = MapTestEnvironment.prepareHashProvider(evilHash);
		
		VersionedMapStore<Integer, String> store = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		VersionedMapImpl<Integer, String> sut = (VersionedMapImpl<Integer, String>) store.createMap();
		MapTestEnvironment<Integer, String> e = new MapTestEnvironment<Integer, String>(sut);
		
		Random r = new Random(seed);
		
		iterativeRandomPuts(scenario, steps, maxKey, values, e, r);
	}

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
	
	@ParameterizedTest(name = "Mutable Smoke {index}/{0} Steps={1} Keys={2} Values={3} seed={4}, evil-hash={5}")
	@MethodSource
	void parametrizedSmoke(int test, int steps, int noKeys, int noValues, int seed, boolean evilHash) {
		runSmokeTest("SmokeS"+steps+"K"+noKeys+"V"+noValues+"s"+seed+"H"+(evilHash?"Evil":"Normal"),seed,steps,noKeys,noValues,evilHash);
	}
	
	private static Stream<Arguments> parametrizedSmoke(){
		return TestPermuter.permutationWithSize(
			new Object[] {1000,32*32*32*32},
			new Object[] {3,32, 32*32, 32*32*32*32},
			new Object[] {2,3},
			new Object[] {1,2,3},
			new Object[] {false,true}
		);
	}


	
//	@Test
//	void MiniSmokeK3V2v1() {
//		runSmokeTest("MiniSmokeK3V2v1",0, 1000, 3, 2);
//	}
//	@Test
//	void MiniSmokeK3V2v2() {
//		runSmokeTest("MiniSmokeK3V2v2",1, 1000, 3, 2);
//	}
//	@Test
//	void MiniSmokeK3V2v3() {
//		runSmokeTest("MiniSmokeK3V2v3",3, 1000, 3, 2);
//	}
//	@Test
//	void MediumSmokeK3V2v1() {
//		runSmokeTest("MediumSmokeK3V2v1",1, 1000, 32, 2);
//	}
//	@Test
//	void MediumSmokeK3V2v2() {
//		runSmokeTest("MediumSmokeK3V2v2",2, 1000, 32, 2);
//	}
//	@Test
//	void MediumSmokeK3V2v3() {
//		runSmokeTest("MediumSmokeK3V2v3",3, 1000, 32, 2);
//	}
//	@Test
//	void SmokeLarge() {
//		var milis = System.currentTimeMillis();
//		runSmokeTest("SmokeLarge",0, 32*32*32*32, 32*32-1, 2);
//		System.out.println(System.currentTimeMillis()-milis);
//	}
}
