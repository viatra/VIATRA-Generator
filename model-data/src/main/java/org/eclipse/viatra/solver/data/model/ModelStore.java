package org.eclipse.viatra.solver.data.model;

import java.util.Set;

import org.eclipse.viatra.solver.data.model.representation.DataRepresentation;

public interface ModelStore {
	@SuppressWarnings("squid:S1452")
	Set<DataRepresentation<?, ?>> getDataRepresentations();
	
	Model createModel();
	Model createModel(long state);
	
	Set<Long> getStates();
	ModelDiffCursor getDiffCursor(long from, long to);
}