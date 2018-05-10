package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolverProgressMonitor
import org.eclipse.core.runtime.IProgressMonitor

class EclipseBasedProgressMonitor extends SolverProgressMonitor{
	val IProgressMonitor internalMonitor
	
	public new(IProgressMonitor internalMonitor) {
		this.internalMonitor = internalMonitor
	}
	
	override protected processWorked(double amount) {
		internalMonitor.worked((amount*1000).intValue)
	}
	
	override isCancelled() {
		super.isCancelled() || internalMonitor.isCanceled
	}
	
}