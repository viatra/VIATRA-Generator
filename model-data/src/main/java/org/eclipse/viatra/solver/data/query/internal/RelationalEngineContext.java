package org.eclipse.viatra.solver.data.query.internal;

import org.eclipse.viatra.query.runtime.api.scope.IBaseIndex;
import org.eclipse.viatra.query.runtime.api.scope.IEngineContext;
import org.eclipse.viatra.query.runtime.matchers.context.IQueryRuntimeContext;

public class RelationalEngineContext implements IEngineContext{
	private final IBaseIndex baseIndex = new DummyBaseIndexer();
	private final RelationalRuntimeContext runtimeContext;
	

	public RelationalEngineContext(RelationUpdateListener updateListener) {
		runtimeContext = new RelationalRuntimeContext(updateListener);
	}

	@Override
	public IBaseIndex getBaseIndex() {
		return this.baseIndex;
	}

	@Override
	public void dispose() {
		//lifecycle not controlled by engine
	}

	@Override
	public IQueryRuntimeContext getQueryRuntimeContext() {
		return runtimeContext;
	}

}
