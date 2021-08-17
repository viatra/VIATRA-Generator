package org.eclipse.viatra.solver.data.query.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.Set;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.GenericPatternMatch;
import org.eclipse.viatra.query.runtime.api.GenericPatternMatcher;
import org.eclipse.viatra.query.runtime.api.GenericQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.ModelStore;
import org.eclipse.viatra.solver.data.model.ModelStoreImpl;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.Relation;
import org.eclipse.viatra.solver.data.model.representation.TruthValue;
import org.eclipse.viatra.solver.data.query.RelationalQuery;
import org.eclipse.viatra.solver.data.query.RelationalScope;
import org.eclipse.viatra.solver.data.query.view.FilteredRelationView;
import org.eclipse.viatra.solver.data.query.view.FunctionalRelationView;
import org.eclipse.viatra.solver.data.query.view.RelationView;
import org.eclipse.viatra.solver.data.query.view.KeyOnlyRelationView;
import org.junit.jupiter.api.Test;

class QueryTest {
	@Test
	void minimalTest() {
		Relation<Boolean> person = new Relation<>("Person", 1, false);

		RelationView<Boolean> persionView = new KeyOnlyRelationView(person);
		GenericQuerySpecification<GenericPatternMatcher> personQuery = (new RelationalQuery("PersonQuery"))
				.addParameter("p", persionView).addConstraint(persionView, "p").build();

		ModelStore store = new ModelStoreImpl(Set.of(person));
		Model model = store.createModel();

		model.put(person, Tuple.of(0), true);
		model.put(person, Tuple.of(1), true);

		RelationalScope scope = new RelationalScope(model, Set.of(persionView));

		ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(scope);
		GenericPatternMatcher personMatcher = engine.getMatcher(personQuery);

		assertEquals(2, personMatcher.countMatches());
	}

	void modelBuildingTest() {
		Relation<Boolean> person = new Relation<>("Person", 1, false);
		Relation<Integer> age = new Relation<Integer>("age", 1, null);
		Relation<TruthValue> friend = new Relation<>("friend", 2, TruthValue.False);

		ModelStore store = new ModelStoreImpl(Set.of(person, age, friend));
		Model model = store.createModel();

		model.put(person, Tuple.of(0), true);
		model.put(person, Tuple.of(1), true);
		model.put(age, Tuple.of(0), 3);
		model.put(age, Tuple.of(1), 1);
		model.put(friend, Tuple.of(0, 1), TruthValue.True);
		model.put(friend, Tuple.of(1, 0), TruthValue.Unknown);

		// Sanity check
		assertTrue(model.get(person, Tuple.of(0)));
		assertTrue(model.get(person, Tuple.of(1)));
		assertFalse(model.get(person, Tuple.of(2)));

		RelationView<Boolean> persionView = new KeyOnlyRelationView(person);
		RelationView<Integer> ageView = new FunctionalRelationView<>(age);
		RelationView<TruthValue> friendMustView = new FilteredRelationView<TruthValue>(friend, (k, v) -> v.must());
		RelationView<TruthValue> friendMayView = new FilteredRelationView<TruthValue>(friend, (k, v) -> v.may());

		RelationalScope scope = new RelationalScope(model, Set.of(persionView, ageView, friendMustView, friendMayView));

		GenericQuerySpecification<GenericPatternMatcher> personQuery = (new RelationalQuery("PersonQuery"))
				.addParameter("p", persionView).addConstraint(persionView, "p").build();

		ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(scope);
		GenericPatternMatcher personMatcher = engine.getMatcher(personQuery);
		Collection<GenericPatternMatch> personMatches = personMatcher.getAllMatches();
		for (GenericPatternMatch personMatch : personMatches) {
			System.out.println(personMatch);
		}
	}
}