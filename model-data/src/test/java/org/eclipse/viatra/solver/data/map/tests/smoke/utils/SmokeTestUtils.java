package org.eclipse.viatra.solver.data.map.tests.smoke.utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

public final class SmokeTestUtils {
	private static final int SLOW_STEP_COUNT = 32 * 32 * 32 * 32;

	private SmokeTestUtils() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly");
	}

	public static Stream<Arguments> changeStepCount(Stream<Arguments> arguments, int parameterIndex) {
		return arguments.map(x -> Arguments.of(updatedStepCount(x.get(), parameterIndex)));
	}

	public static Object[] updatedStepCount(Object[] arguments, int parameterIndex) {
		Object[] copy = Arrays.copyOf(arguments, arguments.length);
		copy[parameterIndex] = SLOW_STEP_COUNT;
		return copy;
	}

	static List<List<Object>> permutationInternal(int from, Object[]... valueOption) {
		if (valueOption.length == from) {
			return List.of(List.of());
		} else {
			Object[] permuteThis = valueOption[from];
			List<List<Object>> otherCombination = permutationInternal(from + 1, valueOption);
			List<List<Object>> result = new LinkedList<>();
			for (Object permuteThisElement : permuteThis) {
				for (List<Object> otherCombinationList : otherCombination) {
					List<Object> newResult = new LinkedList<>();
					newResult.add(permuteThisElement);
					newResult.addAll(otherCombinationList);
					result.add(newResult);
				}
			}
			return result;
		}
	}

	public static Stream<Arguments> permutation(Object[]... valueOption) {
		List<List<Object>> permutations = permutationInternal(0, valueOption);
		return permutations.stream().map(x -> Arguments.of(x.toArray()));
	}

	public static Stream<Arguments> permutationWithSize(Object[]... valueOption) {
		int size = 1;
		for (int i = 0; i < valueOption.length; i++) {
			size *= valueOption[i].length;
		}
		Object[][] newValueOption = new Object[valueOption.length + 1][];
		newValueOption[0] = new Object[] { size };
		for (int i = 1; i < newValueOption.length; i++) {
			newValueOption[i] = valueOption[i - 1];
		}
		return permutation(newValueOption);
	}
}
