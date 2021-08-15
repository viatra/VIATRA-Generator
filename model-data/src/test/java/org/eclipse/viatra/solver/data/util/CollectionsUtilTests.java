package org.eclipse.viatra.solver.data.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.eclipse.viatra.solver.data.util.CollectionsUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsUtilTests {
	List<Integer> list10 = List.of(1,2,3,4,5,6,7,8,9,10);
	List<String> listTen = List.of("1","2","3","4","5","6","7","8","9","10");
	
	private static <T> void compare(Iterable<T> a, Iterable<T> b) {
		List<T> listA = toList(a);
		List<T> listB = toList(b);
		assertEquals(listA, listB);
	}
	private static <T> List<T> toList(Iterable<T> a) {
		List<T> result = new ArrayList<T>();
		Iterator<T> iterator = a.iterator();
		while(iterator.hasNext()) {
			result.add(iterator.next());
		}
		return result;
	}
	
	@Test
	void testFilterEven() {
		compare(List.of(2,4,6,8,10), filter(list10, (x->x%2==0)));
	}
	
	@Test
	void testFilterOdd() {
		compare(List.of(1,3,5,7,9), filter(list10, (x->x%2==1)));
	}
	
	@Test
	void testFilterFalse() {
		compare(List.of(), filter(list10, (x->false)));
	}
	
	@Test
	void testFilterTrue() {
		compare(list10, filter(list10, (x->true)));
	}
	
	@Test
	void testFilterEmpty() {
		compare(List.of(), filter(List.of(), (x->true)));
	}
	
	@Test()
	void testNoSuchElement() {
		Iterable<Integer> iterable = filter(list10, (x->x%2==0));
		Iterator<Integer> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
		Assertions.assertThrows(NoSuchElementException.class, ()->iterator.next());
	}
	
	void mapTest() {
		compare(listTen,map(list10, x->x.toString()));
	}
	void mapEmtyTest() {
		compare(List.of(),map(List.of(), x->x.toString()));
	}
}
