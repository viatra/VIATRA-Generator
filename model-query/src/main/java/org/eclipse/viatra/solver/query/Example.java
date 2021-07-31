package org.eclipse.viatra.solver.query;

import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.scope.IEngineContext;
import org.eclipse.viatra.query.runtime.api.scope.IIndexingErrorListener;
import org.eclipse.viatra.query.runtime.api.scope.QueryScope;

public class Example {
	public static void main(String[] args) {
		ViatraQueryEngine.on(new QueryScope() {
			
			@Override
			protected IEngineContext createEngineContext(ViatraQueryEngine engine, IIndexingErrorListener errorListener,
					Logger logger) {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
}
