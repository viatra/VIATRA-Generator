package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace

class PartialInterpretationSizePrinter implements PartialInterpretationVisualiser {
	long startTime
	
	public new() {
		startTime = System.currentTimeMillis
	}
	
	override visualiseConcretization(PartialInterpretation partialInterpretation) {
		return new PartialInterpretationSizePrinterAction(partialInterpretation.newElements.size,System.currentTimeMillis-startTime)
	}
	
	override visualisePartialSolution(PartialInterpretation partialInterpretation) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}
class PartialInterpretationSizePrinterAction implements PartialInterpretationVisualisation {
	val int size
	long millis
	
	public new(int size, long millis) {
		this.size = size
		this.millis = millis
	}
	
	override writeToFile(ReasonerWorkspace workspace, String name) {
		println("Size="+size+", Time="+millis/1000+"s")
	}
}