package org.eclipse.viatra.solver.data.model;

import java.util.Set;

import org.eclipse.viatra.solver.data.model.symbols.Symbol;

public interface ModelStore {

	Set<Symbol> getSymbols();
	Model createModel();
	Model createModel(long state);
	Set<Long> getStates();

}