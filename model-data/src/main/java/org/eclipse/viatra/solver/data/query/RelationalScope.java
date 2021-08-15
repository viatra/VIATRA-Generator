package org.eclipse.viatra.solver.data.query;

import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.scope.IEngineContext;
import org.eclipse.viatra.query.runtime.api.scope.IIndexingErrorListener;
import org.eclipse.viatra.query.runtime.api.scope.QueryScope;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.query.internal.RelationUpdateListener;
import org.eclipse.viatra.solver.data.query.internal.RelationalEngineContext;
import org.eclipse.viatra.solver.data.query.view.RelationView;

public class RelationalScope extends QueryScope{
	private final RelationUpdateListener updateListener;
	
	public RelationalScope(Set<RelationView<?>> relationViews) {
		updateListener = new RelationUpdateListener(relationViews);
	}
	
	public <D> void processUpdate(RelationView<D> relationView, Tuple key, D oldValue, D newValue) {
		updateListener.processChange(relationView, key, oldValue, newValue);
	}

	@Override
	protected IEngineContext createEngineContext(ViatraQueryEngine engine, IIndexingErrorListener errorListener,
			Logger logger) {
		return new RelationalEngineContext(this.updateListener);
	}
}
