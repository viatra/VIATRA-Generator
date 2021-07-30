package org.eclipse.viatra.solver.data.map.benchmarks;

import java.util.Random;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.eclipse.viatra.solver.data.map.tests.utils.MapTestEnvironment;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ImmutablePutExecutionPlan {

	@Param({ "100", "10000" })
	public int nPut;

	@Param({ "32", "1000", "100000" })
	public int nKeys;

	@Param({ "2", "3" })
	public int nValues;

	private Random random;

	private String[] values;

	private ContinousHashProvider<Integer> hashProvider = MapTestEnvironment.prepareHashProvider(false);

	@Setup(Level.Trial)
	public void setUpTrial() {
		random = new Random();
		values = MapTestEnvironment.prepareValues(nValues);
	}

	public VersionedMapImpl<Integer, String> createSut() {
		VersionedMapStore<Integer, String> store = new VersionedMapStoreImpl<Integer, String>(hashProvider, values[0]);
		return (VersionedMapImpl<Integer, String>) store.createMap();
	}

	public Integer nextKey() {
		return random.nextInt(nKeys);
	}

	public boolean isDefault(String value) {
		return value == values[0];
	}

	public String nextValue() {
		return values[random.nextInt(nValues)];
	}
}
