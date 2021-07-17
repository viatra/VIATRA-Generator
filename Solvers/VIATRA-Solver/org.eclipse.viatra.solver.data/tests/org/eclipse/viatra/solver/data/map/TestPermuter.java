package org.eclipse.viatra.solver.data.map;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

public class TestPermuter {
	private static List<List<Object>> permutation_internal(int from, Object[]... valueOption) {
		if(valueOption.length == from) {
			return List.of(List.of()); // empty list
		} else {
			Object[] permuteThis = valueOption[from];
			List<List<Object>> otherCombination = permutation_internal(from+1,valueOption);
			
			List<List<Object>> result = new LinkedList<>();
			for(Object permuteThisElement : permuteThis) {
				for(List<Object> otherCombinationList : otherCombination) {
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
		List<List<Object>> permutations = permutation_internal(0, valueOption);
		return permutations.stream().map(x -> Arguments.of(x.toArray()));
	}
	public static Stream<Arguments> permutationWithSize(Object[]... valueOption) {
		int size = 1;
		for(int i = 0; i< valueOption.length; i++) {
			size *= valueOption[i].length;
		}
		Object[][] newValueOption = new Object[valueOption.length+1][];
		newValueOption[0] = new Object[] {size};
		for(int i = 1; i<newValueOption.length; i++) {
			newValueOption[i]=valueOption[i-1];
		}
		return permutation(newValueOption);
	}
	
	@Test
	public void permutation_internalTest() {
		List<List<Object>> res = permutation_internal(0,
			new Object[]{1,2,3},
			new Object[]{'a','b','c'},
			new Object[]{"alpha","beta","gamma","delta"}
		);
//		for(var permutation : res) {
//			System.out.print("[");
//			for(int index = 0; index<permutation.size(); index++) {
//				if(index!=0) System.out.print(",");
//				System.out.print(permutation.get(index));
//			}
//			System.out.println("]");
//		}
		assertTrue(res.size()==3*3*4);
	}
	
	@Test
	public void permutationTest1() {
		var res = permutation(
			new Object[]{1,2,3},
			new Object[]{'a','b','c'},
			new Object[]{"alpha","beta","gamma","delta"}
		);
		assertTrue(res.count()==3*3*4);
	}
	@Test
	public void permutationTest2() {
		var res = permutation(
			new Object[]{1,2,3},
			new Object[]{'a','b','c'},
			new Object[]{"alpha","beta","gamma","delta"}
		);
		var arguments = res.findFirst().get().get();
		assertEquals(arguments[0], 1);
		assertEquals(arguments[1], 'a');
		assertEquals(arguments[2], "alpha");
		System.out.println(arguments[0]);
	}
}
