package org.eclipse.viatra.solver.data.map.tests.fuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;
import org.eclipse.viatra.solver.data.map.tests.utils.MapTestEnvironment;

public class MultiThreadTestRunnable implements Runnable {
	String scenario;
	VersionedMapStore<Integer, String> store;
	int steps;
	int maxKey;
	String[] values;
	int seed;
	int commitFrequency;
	List<Throwable> errors = new LinkedList<>();
	
	public MultiThreadTestRunnable(String scenario, VersionedMapStore<Integer, String> store, int steps,
			int maxKey, String[] values, int seed, int commitFrequency) {
		super();
		this.scenario = scenario;
		this.store = store;
		this.steps = steps;
		this.maxKey = maxKey;
		this.values = values;
		this.seed = seed;
		this.commitFrequency = commitFrequency;
	}

	private void logAndThrowError(String message) {
		AssertionError error = new AssertionError(message);
		errors.add(error);
	}
	
	public List<Throwable> getErrors() {
		return errors;
	}
	
	@Override
	public void run() {
		// 1. build a map with versions
		Random r = new Random(seed);
		VersionedMapImpl<Integer, String> versioned = (VersionedMapImpl<Integer, String>) store.createMap();
		Map<Integer, Long> index2Version = new HashMap<>();

		for (int i = 0; i < steps; i++) {
			int index = i + 1;
			int nextKey = r.nextInt(maxKey);
			String nextValue = values[r.nextInt(values.length)];
			try {
				versioned.put(nextKey, nextValue);
			} catch (Exception exception) {
				exception.printStackTrace();
				logAndThrowError(scenario + ":" + index + ": exception happened: " + exception);
			}
			if (index % commitFrequency == 0) {
				long version = versioned.commit();
				index2Version.put(i, version);
			}
			MapTestEnvironment.printStatus(scenario, index, steps, "building");
		}
		// 2. create a non-versioned 
		VersionedMapImpl<Integer, String> reference = (VersionedMapImpl<Integer, String>) store.createMap();
		r = new Random(seed);
		Random r2 = new Random(seed+1);

		for (int i = 0; i < steps; i++) {
			int index = i + 1;
			int nextKey = r.nextInt(maxKey);
			String nextValue = values[r.nextInt(values.length)];
			try {
				reference.put(nextKey, nextValue);
			} catch (Exception exception) {
				exception.printStackTrace();
				logAndThrowError(scenario + ":" + index + ": exception happened: " + exception);
			}
			// go back to an existing state and compare to the reference
			if (index % (commitFrequency) == 0) {
				versioned.restore(index2Version.get(i));
				MapTestEnvironment.compareTwoMaps(scenario + ":" + index, reference, versioned,errors);
				
				// go back to a random state (probably created by another thread)
				List<Long> states = new ArrayList<>(store.getStates());
				Collections.shuffle(states, r2);
				for(Long state : states.subList(0, Math.min(states.size(), 100))) {
					versioned.restore(state);
				}
				versioned.restore(index2Version.get(i));
			}

			MapTestEnvironment.printStatus(scenario, index, steps, "comparison");
		}
	}
}
