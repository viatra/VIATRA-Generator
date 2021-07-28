package org.eclipse.viatra.solver.data.map.test.smoke.fast;

import static org.junit.Assert.fail;

import java.util.Random;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.eclipse.viatra.solver.data.map.test.smoke.TestPermuter;
import org.eclipse.viatra.solver.data.map.test.support.MapTestEnvironment;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SmokeTest2Commit {
	public void runSmokeTest(String scenario, int seed, int steps, int maxKey, int maxValue, int commitFrequency, boolean evilHash) {
		String[] values = MapTestEnvironment.prepareValues(maxValue);
		ContinousHashProvider<Integer> chp = MapTestEnvironment.prepareHashProvider(evilHash);
		
		VersionedMapStore<Integer, String> store = new VersionedMapStoreImpl<Integer, String>(chp, values[0]);
		VersionedMapImpl<Integer, String> sut = (VersionedMapImpl<Integer, String>) store.createMap();
		MapTestEnvironment<Integer, String> e = new MapTestEnvironment<Integer, String>(sut);
		
		Random r = new Random(seed);
		
		iterativeRandomPutsAndCommits(scenario, steps, maxKey, values, e, r, commitFrequency);
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
			MapTestEnvironment.printStatus(scenario, index, steps, null);
			if(index%commitFrequency == 0) {
				e.sut.commit();
				//System.out.println(scenario+":"+index+": Commit! version=" + version);
			}
		}
	}
	
	
	@ParameterizedTest(name = "Immutable Smoke {index}/{0} Steps={1} Keys={2} Values={3} commit frequency={4} seed={5} evil-hash={6}")
	@MethodSource
	@Timeout(value = 10)
	void parametrizedSmoke(int tests, int steps, int noKeys, int noValues, int commitFrequency, int seed, boolean evilHash) {
		runSmokeTest("SmokeCommitS"+steps+"K"+noKeys+"V"+noValues+"s"+seed,seed,steps,noKeys,noValues,commitFrequency,evilHash);
	}
	
	public static Stream<Arguments> parametrizedSmoke(){
		return TestPermuter.permutationWithSize(
			new Object[] {1000},
			new Object[] {3,32, 32*32},
			new Object[] {2,3},
			new Object[] {1,10,100},
			new Object[] {1,2,3},
			new Object[] {false,true}
		);
	}
}
