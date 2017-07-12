package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation

import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace

interface PartialInterpretationVisualisation {
	def void writeToFile(ReasonerWorkspace workspace, String name)
}
