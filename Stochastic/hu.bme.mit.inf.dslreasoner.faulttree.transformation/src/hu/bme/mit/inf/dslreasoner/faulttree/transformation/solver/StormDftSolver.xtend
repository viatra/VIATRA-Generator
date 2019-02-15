package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantModel
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ReliabilityModel
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ft2galileo.Ft2GalileoTransformation
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace

class StormDftSolver {
	static val DFT_FILE_NAME = "ft.dft"

	val ft2Galileo = new Ft2GalileoTransformation
	val handler = new StormDftHandler

	def solve(ReliabilityModel reliabilityModel, StormDftConfiguration configuration,
		ReasonerWorkspace reasonerWorkspace) {
		switch (reliabilityModel) {
			FaultTree:
				solve(reliabilityModel, configuration, reasonerWorkspace)
			ConstantModel: {
				val result = if (reliabilityModel.failed) {
						0
					} else {
						switch (objective : configuration.objective) {
							case FtAnalysisObjective.MTTF: Double.POSITIVE_INFINITY
							FtAnalysisObjective.TimeBound: 1
							default: throw new IllegalArgumentException("Unknown objective: " + objective)
						}
					}
				new ReliabilityResult.Solution(result)
			}
			default:
				throw new IllegalArgumentException("Unknown reliability model: " + reliabilityModel)
		}
	}

	def solve(FaultTree faultTree, StormDftConfiguration configuration, ReasonerWorkspace reasonerWorkspace) {
		val galileo = ft2Galileo.toGalileo(faultTree)
		reasonerWorkspace.writeText(DFT_FILE_NAME, galileo)
		val dftFilePath = reasonerWorkspace.getFile(DFT_FILE_NAME).absolutePath
		handler.callSolver(dftFilePath, configuration)
	}
}
