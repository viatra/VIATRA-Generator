package org.eclipse.viatra.solver.data.map.benchmarks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Measurement(time = 1, timeUnit = TimeUnit.SECONDS)
@Warmup(time = 1, timeUnit = TimeUnit.SECONDS)
public class ImmutablePutBenchmark {
	@Benchmark
	public void immutablePutBenchmark(ImmutablePutExecutionPlan executionPlan, Blackhole blackhole) {
		var sut = executionPlan.createSut();
		for (int i = 0; i < executionPlan.nPut; i++) {
			sut.put(executionPlan.nextKey(), executionPlan.nextValue());
		}
		blackhole.consume(sut);
	}

	@Benchmark
	public void immutablePutAndCommitBenchmark(ImmutablePutExecutionPlan executionPlan, Blackhole blackhole) {
		var sut = executionPlan.createSut();
		for (int i = 0; i < executionPlan.nPut; i++) {
			sut.put(executionPlan.nextKey(), executionPlan.nextValue());
			if (i % 10 == 0) {
				blackhole.consume(sut.commit());
			}
		}
		blackhole.consume(sut);
	}

	@Benchmark
	public void baselinePutBenchmark(ImmutablePutExecutionPlan executionPlan, Blackhole blackhole) {
		var sut = new HashMap<Integer, String>();
		for (int i = 0; i < executionPlan.nPut; i++) {
			var key = executionPlan.nextKey();
			var value = executionPlan.nextValue();
			if (executionPlan.isDefault(value)) {
				sut.remove(key);
			} else {
				sut.put(key, value);
			}
		}
		blackhole.consume(sut);
	}

	@Benchmark
	public void baselinePutAndCommitBenchmark(ImmutablePutExecutionPlan executionPlan, Blackhole blackhole) {
		var sut = new HashMap<Integer, String>();
		var store = new ArrayList<HashMap<Integer, String>>();
		for (int i = 0; i < executionPlan.nPut; i++) {
			var key = executionPlan.nextKey();
			var value = executionPlan.nextValue();
			if (executionPlan.isDefault(value)) {
				sut.remove(key);
			} else {
				sut.put(key, value);
			}
			if (i % 10 == 0) {
				store.add(new HashMap<>(sut));
			}
		}
		blackhole.consume(sut);
		blackhole.consume(store);
	}
}
