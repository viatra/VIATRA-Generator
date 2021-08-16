package org.eclipse.viatra.solver.data.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.ModelStore;
import org.eclipse.viatra.solver.data.model.ModelStoreImpl;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.Relation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ModelTest {
	
	@Test
	void modelConstructionTest() {
		Relation<Boolean> person = new Relation<>("Person", 1, false);
		Relation<Boolean> friend = new Relation<>("friend", 2, false);
		
		ModelStore store = new ModelStoreImpl(Set.of(person,friend));
		Model model = store.createModel();
		
		assertTrue(store.getDataRepresentations().contains(person));
		assertTrue(store.getDataRepresentations().contains(friend));
		assertTrue(model.getDataRepresentations().contains(person));
		assertTrue(model.getDataRepresentations().contains(friend));
		
		Relation<Integer> other = new Relation<Integer>("other", 2, null);
		assertFalse(model.getDataRepresentations().contains(other));
	}
	
	@Test
	void modelBuildingTest() {
		Relation<Boolean> person = new Relation<>("Person", 1, false);
		Relation<Integer> age = new Relation<Integer>("age", 1, null);
		Relation<Boolean> friend = new Relation<>("friend", 2, false);
		
		ModelStore store = new ModelStoreImpl(Set.of(person,age,friend));
		Model model = store.createModel();
		
		model.put(person, Tuple.of(0), true);
		model.put(person, Tuple.of(1), true);
		model.put(age, Tuple.of(0), 3);
		model.put(age, Tuple.of(1), 1);
		model.put(friend, Tuple.of(0,1), true);
		model.put(friend, Tuple.of(1,0), true);
		
		assertTrue(model.get(person, Tuple.of(0)));
		assertTrue(model.get(person, Tuple.of(1)));
		assertFalse(model.get(person, Tuple.of(2)));
		
		assertEquals(3, model.get(age, Tuple.of(0)));
		assertEquals(1, model.get(age, Tuple.of(1)));
		assertEquals(null, model.get(age, Tuple.of(2)));
		
		assertTrue(model.get(friend, Tuple.of(0,1)));
		assertFalse(model.get(friend, Tuple.of(0,5)));
	}
	
	@Test
	void modelBuildingArityFailTest() {
		Relation<Boolean> person = new Relation<>("Person", 1, false);
		ModelStore store = new ModelStoreImpl(Set.of(person));
		Model model = store.createModel();
		
		final Tuple tuple3 = Tuple.of(1,1,1);
		Assertions.assertThrows(IllegalArgumentException.class, ()-> model.put(person, tuple3, true));
		Assertions.assertThrows(IllegalArgumentException.class, ()-> model.get(person, tuple3));
	}
	
	@Test
	void modelBuildingNullFailTest() {
		Relation<Integer> age = new Relation<Integer>("age", 1, null);
		ModelStore store = new ModelStoreImpl(Set.of(age));
		Model model = store.createModel();
		
		//final Tuple tuple3 = Tuple.of(1,1,1);
		
		model.put(age, Tuple.of(1), null); // valid
		Assertions.assertThrows(IllegalArgumentException.class, ()-> model.put(age, null, 1));
		Assertions.assertThrows(IllegalArgumentException.class, ()-> model.get(age, null));
		
	}
	
	@Test
	void modelUpdateTest() {
		Relation<Boolean> person = new Relation<>("Person", 1, false);
		Relation<Integer> age = new Relation<Integer>("age", 1, null);
		Relation<Boolean> friend = new Relation<>("friend", 2, false);
		
		ModelStore store = new ModelStoreImpl(Set.of(person,age,friend));
		Model model = store.createModel();
		
		model.put(person, Tuple.of(0), true);
		model.put(person, Tuple.of(1), true);
		model.put(age, Tuple.of(0), 3);
		model.put(age, Tuple.of(1), 1);
		model.put(friend, Tuple.of(0,1), true);
		model.put(friend, Tuple.of(1,0), true);
		
		assertEquals(3, model.get(age, Tuple.of(0)));
		assertTrue(model.get(friend, Tuple.of(0,1)));
		
		model.put(age, Tuple.of(0), 4);
		model.put(friend, Tuple.of(0,1), false);
		
		assertEquals(4, model.get(age, Tuple.of(0)));
		assertFalse(model.get(friend, Tuple.of(0,1)));
	}
	
	@Test
	void restoreTest() {
		Relation<Boolean> person = new Relation<Boolean>("Person", 1, false);
		Relation<Boolean> friend = new Relation<Boolean>("friend", 2, false);
		
		ModelStore store = new ModelStoreImpl(Set.of(person,friend));
		Model model = store.createModel();
		
		model.put(person, Tuple.of(0), true);
		model.put(person, Tuple.of(1), true);
		model.put(friend, Tuple.of(0,1), true);
		model.put(friend, Tuple.of(1,0), true);
		long state1 = model.commit();
		
		assertFalse(model.get(person, Tuple.of(2)));
		assertFalse(model.get(friend, Tuple.of(0,2)));
		
		model.put(person, Tuple.of(2), true);
		model.put(friend, Tuple.of(0,2), true);
		long state2 = model.commit();
		
		assertTrue(model.get(person, Tuple.of(2)));
		assertTrue(model.get(friend, Tuple.of(0,2)));
		
		model.restore(state1);
		
		assertFalse(model.get(person, Tuple.of(2)));
		assertFalse(model.get(friend, Tuple.of(0,2)));
		
		model.restore(state2);
		
		assertTrue(model.get(person, Tuple.of(2)));
		assertTrue(model.get(friend, Tuple.of(0,2)));
	}
}
