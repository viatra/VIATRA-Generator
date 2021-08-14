package org.eclipse.viatra.solver.data.query;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import org.eclipse.viatra.solver.data.map.CursorAsIterator;
import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.RelationRepresentation;

/**
 * Represents a view of a {@link RelationRepresentation} that can be queried.
 * @author Oszkar Semerath
 *
 * @param <D>
 */
public class RelationView<D>{
	protected final Model model;
	protected final RelationRepresentation<D> representation;
	protected final BiPredicate<Tuple, D> filter;
	protected final BiFunction<Tuple,D,Object[]> mapping;
	
	protected RelationView(Model model, RelationRepresentation<D> representation, BiPredicate<Tuple,D> filter, BiFunction<Tuple,D,Object[]> mapping) {
		this.model = model;
		this.representation = representation;
		this.filter = filter;
		this.mapping = mapping;
		checkRepresentation(model, representation);
	}
	
	protected RelationView(Model model, RelationRepresentation<D> representation, BiPredicate<Tuple,D> filter) {
		this.model = model;
		this.representation = representation;
		this.filter = filter;
		this.mapping = ((k,v)->toTuple1Array(k));
		checkRepresentation(model, representation);
	}
	protected RelationView(Model model, RelationRepresentation<D> representation, BiFunction<Tuple,D,Object[]> mapping) {
		this.model = model;
		this.representation = representation;
		this.filter = ((k,v)->true);
		this.mapping = mapping;
		checkRepresentation(model, representation);
	}
	protected RelationView(Model model, RelationRepresentation<D> representation) {
		this.model = model;
		this.representation = representation;
		this.filter = ((k,v)->true);
		this.mapping = (RelationView::toTuple1ArrayPlusValue);
		checkRepresentation(model, representation);
	}
	
	private void checkRepresentation(Model model, RelationRepresentation<D> representation) {
		if(!model.getDataRepresentations().contains(representation)) {
			throw new IllegalArgumentException("Selected model does not contain representation " + representation + "!");
		}
	}
	
	public Model getModel() {
		return model;
	}
	public RelationRepresentation<D> getRepresentation() {
		return representation;
	}
	
	public boolean get(Tuple t) {
		D value = model.get(representation, t);
		return value != representation.getDefaultValue() && filter.test(t,value);
	}

	public Iterable<Object[]> getAll() {
		return (()->new CursorAsIterator<>(model.getAll(representation), mapping, filter));
	}
	
	public static Object[] toTuple1Array(Tuple t) {
		Object[] result = new Object[t.getSize()];
		for(int i = 0; i<t.getSize(); i++) {
			result[i] = t.get(i);
		}
		return result;
	}
	public static <D> Object[] toTuple1ArrayPlusValue(Tuple t, D value) {
		Object[] result = new Object[t.getSize()+1];
		for(int i = 0; i<t.getSize(); i++) {
			result[i] = t.get(i);
		}
		result[t.getSize()] = value;
		return result;
	}
}
