package org.eclipse.viatra.solver.data.query.view;

import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.Relation;

public class TupleRelationView extends FilteredRelationView<Boolean>{

	public TupleRelationView(Model model, Relation<Boolean> representation) {
		super(model, representation, (k,v)->true);
	}
	@Override
	protected boolean filter(Tuple key, Boolean value) {
		return true;
	}
	
}
