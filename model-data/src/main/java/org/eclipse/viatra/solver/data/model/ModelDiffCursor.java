package org.eclipse.viatra.solver.data.model;

import java.util.Map;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.DiffCursor;
import org.eclipse.viatra.solver.data.model.representation.DataRepresentation;

public class ModelDiffCursor {
	final Map<DataRepresentation<?, ?>,DiffCursor<?,?>> diffcursors;

	public ModelDiffCursor(Map<DataRepresentation<?, ?>, DiffCursor<?, ?>> diffcursors) {
		super();
		this.diffcursors = diffcursors;
	}
	
	@SuppressWarnings("unchecked")
	public <K,V> DiffCursor<K,V> getCursor(DataRepresentation<K, V> representation) {
		Cursor<?, ?> cursor = diffcursors.get(representation);
		if(cursor != null) {
			return (DiffCursor<K, V>) cursor;
		} else {
			throw new IllegalArgumentException("ModelCursor does not contain cursor for representation "+representation);
		}
	}
}
