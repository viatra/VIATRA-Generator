package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolverProgressMonitor
import org.eclipse.core.runtime.IProgressMonitor

class EclipseBasedProgressMonitor extends SolverProgressMonitor{
	val IProgressMonitor internalMonitor
	
	public new(IProgressMonitor internalMonitor) {
		this.internalMonitor = internalMonitor
	}
	var double currentDouble = 0.0
	var int currentInt = 0
	
	override protected processWorked(double amount) {
		val newDouble = currentDouble+amount
		val newInt = (newDouble*1000).intValue
		internalMonitor.worked(newInt-currentInt)
		currentDouble = newDouble
		currentInt = newInt
	}
	
	override isCancelled() {
		super.isCancelled() || internalMonitor.isCanceled
	}
	
}