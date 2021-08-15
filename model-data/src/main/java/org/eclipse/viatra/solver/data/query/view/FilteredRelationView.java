package org.eclipse.viatra.solver.data.query.view;

import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.Tuple.Tuple1;
import org.eclipse.viatra.solver.data.model.representation.Relation;

public abstract class FilteredRelationView<D> extends RelationView<D>{

	protected FilteredRelationView(Model model, Relation<D> representation) {
		super(model, representation);
	}
	@Override
	protected Object[] forwardMap(Tuple key, D value) {
		return toTuple1Array(key);
	}
	@Override
	public boolean get(Object[] tuple) {
		int[] content = new int[tuple.length];
		for(int i = 0; i<tuple.length; i++) {
			content[i] =((Tuple1)tuple[i]).get(0);
		}
		Tuple key = Tuple.of(content);
		D value = this.model.get(representation, key);
		return filter(key, value);
	}
	
	public static Object[] toTuple1Array(Tuple t) {
		Object[] result = new Object[t.getSize()];
		for(int i = 0; i<t.getSize(); i++) {
			result[i] = t.get(i);
		}
		return result;
	}
	
	@Override
	public int getArity() {
		return this.representation.getArity();
	}
}
