package org.eclipse.viatra.solver.data.map.tests.fuzz.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class FuzzTestUtilsTest {
	@Test
	void permutationInternalTest() {
		List<List<Object>> res = FuzzTestUtils.permutationInternal(0, new Object[] { 1, 2, 3 },
				new Object[] { 'a', 'b', 'c' }, new Object[] { "alpha", "beta", "gamma", "delta" });
		assertEquals(3 * 3 * 4, res.size());
	}

	@Test
	void permutationTest1() {
		var res = FuzzTestUtils.permutation(new Object[] { 1, 2, 3 }, new Object[] { 'a', 'b', 'c' },
				new Object[] { "alpha", "beta", "gamma", "delta" });
		assertEquals(3 * 3 * 4, res.count());
	}

	@Test
	void permutationTest2() {
		var res = FuzzTestUtils.permutation(new Object[] { 1, 2, 3 }, new Object[] { 'a', 'b', 'c' },
				new Object[] { "alpha", "beta", "gamma", "delta" });
		var arguments = res.findFirst().get().get();
		assertEquals(1, arguments[0]);
		assertEquals('a', arguments[1]);
		assertEquals("alpha", arguments[2]);
	}
}
