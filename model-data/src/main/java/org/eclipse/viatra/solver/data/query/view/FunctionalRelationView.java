package org.eclipse.viatra.solver.data.query.view;

import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.Tuple.Tuple1;
import org.eclipse.viatra.solver.data.model.representation.Relation;

public class FunctionalRelationView<D> extends RelationView<D> {

	public FunctionalRelationView(Relation<D> representation) {
		super(representation);
	}

	@Override
	protected boolean filter(Tuple key, D value) {
		return true;
	}

	@Override
	protected Object[] forwardMap(Tuple key, D value) {
		return toTuple1ArrayPlusValue(key, value);
	}

	@Override
	public boolean get(Model model, Object[] tuple) {
		int[] content = new int[tuple.length-1];
		for(int i = 0; i<tuple.length-1; i++) {
			content[i] =((Tuple1)tuple[i]).get(0);
		}
		Tuple key = Tuple.of(content);
		@SuppressWarnings("unchecked")
		D valueInTuple = (D) tuple[tuple.length-1];
		D valueInMap = model.get(representation, key);
		return valueInTuple.equals(valueInMap);
	}
	
	public static <D> Object[] toTuple1ArrayPlusValue(Tuple t, D value) {
		Object[] result = new Object[t.getSize()+1];
		for(int i = 0; i<t.getSize(); i++) {
			result[i] = t.get(i);
		}
		result[t.getSize()] = value;
		return result;
	}
	
	@Override
	public int getArity() {
		return this.representation.getArity()+1;
	}
}
