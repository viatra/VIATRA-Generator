package hu.bme.mit.inf.dlsreasoner.alloy.reasoner

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Alloy2LogicMapper
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.AlloyHandler
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.AlloyModelInterpretation
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Logic2AlloyLanguageMapper
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Logic2AlloyLanguageMapperTrace
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.MonitoredAlloySolution
import hu.bme.mit.inf.dslreasoner.AlloyLanguageStandaloneSetupGenerated
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Logic2AlloyLanguageMapper_TypeMapper_FilteredTypes
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.AlloyModelInterpretation_TypeInterpretation_FilteredTypes
import org.eclipse.emf.common.util.URI

class AlloySolver extends LogicReasoner{
	
	new() {
		AlloyLanguagePackage.eINSTANCE.eClass
		val x = new AlloyLanguageStandaloneSetupGenerated
		x.createInjectorAndDoEMFRegistration
	}
	
	val Logic2AlloyLanguageMapper forwardMapper = new Logic2AlloyLanguageMapper(new Logic2AlloyLanguageMapper_TypeMapper_FilteredTypes)
	val AlloyHandler handler = new AlloyHandler
	val Alloy2LogicMapper backwardMapper = new Alloy2LogicMapper
	
	val fileName = "problem.als"
	
	override solve(LogicProblem problem, LogicSolverConfiguration configuration, ReasonerWorkspace workspace) throws LogicReasonerException {
		if(configuration instanceof AlloySolverConfiguration) {
			val transformationStart = System.currentTimeMillis
			val result = forwardMapper.transformProblem(problem,configuration)
			val alloyProblem = result.output
			
			/*val x = alloyProblem.eAllContents.filter(ALSFunctionCall).filter[it.referredDefinition == null].toList
			println(x)*/
			val forwardTrace = result.trace
			
			var String fileURI = null;
			var String alloyCode = null;
			if(configuration.writeToFile) {
				fileURI = workspace.writeModel(alloyProblem,fileName).toFileString
			} else {
				alloyCode = workspace.writeModelToString(alloyProblem,fileName)
			}
			
			//val alloyCode = workspace.readText(fileName)
			//val FunctionWithTimeout<MonitoredAlloySolution> call = new FunctionWithTimeout[] 
			
			val transformationTime = System.currentTimeMillis - transformationStart
			val result2 = handler.callSolver(alloyProblem,workspace,configuration,fileURI,alloyCode)
			workspace.deactivateModel(fileName)
			val logicResult = backwardMapper.transformOutput(problem,result2,forwardTrace,transformationTime)
			return logicResult
		} else throw new IllegalArgumentException('''The configuration have to be an «AlloySolverConfiguration.simpleName»!''')
	}
	
	override getInterpretation(ModelResult modelResult) {
		return new AlloyModelInterpretation(
			new AlloyModelInterpretation_TypeInterpretation_FilteredTypes,
			(modelResult.representation as MonitoredAlloySolution).solution,
			forwardMapper,
			modelResult.trace as Logic2AlloyLanguageMapperTrace
		);
	}	
}