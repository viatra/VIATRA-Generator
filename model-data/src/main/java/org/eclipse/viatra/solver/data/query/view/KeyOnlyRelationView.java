package org.eclipse.viatra.solver.data.query.view;

import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.Relation;

public class KeyOnlyRelationView extends FilteredRelationView<Boolean>{

	public KeyOnlyRelationView(Relation<Boolean> representation) {
		super(representation, (k,v)->true);
	}
	@Override
	protected boolean filter(Tuple key, Boolean value) {
		return true;
	}
	
}
