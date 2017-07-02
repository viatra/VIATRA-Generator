package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.SmtLanguageStandaloneSetupGenerated
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.smt.reasoner.builder.SmtSolverHandler
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import org.eclipse.emf.ecore.util.EcoreUtil

class SMTSolver extends LogicReasoner{
	
	public new() {
		SmtLanguagePackage.eINSTANCE.eClass
		val x = new SmtLanguageStandaloneSetupGenerated
		x.createInjectorAndDoEMFRegistration
	}
	
	val forwardMapper = new Logic2SmtMapper(new Logic2Smt_TypeMapper_FilteredTypes);
	val backMapper = new Smt2LogicMapper;
	val handler = new SmtSolverHandler
	
	override solve(LogicProblem problem, LogicSolverConfiguration configuration, ReasonerWorkspace workspace) {
		if(configuration instanceof SmtSolverConfiguration) {
			val transformationStart = System.currentTimeMillis
			val transformationResult = forwardMapper.transformProblem(problem,configuration.typeScopes,configuration.strategy)
			val SMTDocument inputModel= transformationResult.output
			val trace = transformationResult.trace
			val input = workspace.writeModel(inputModel,"problem.smt2")
			val transformationTime = System.currentTimeMillis-transformationStart
			val solverTimeStart = System.currentTimeMillis
			handler.callSolver(input,configuration)
			val solverTime = System.currentTimeMillis - solverTimeStart
			val outputModel = workspace.reloadModel(typeof(SMTDocument), "problem.smt2")
			EcoreUtil.resolveAll(outputModel)
			workspace.deactivateModel("problem.smt2")
			return backMapper.transformOutput(problem,outputModel.output,trace, transformationTime, solverTime)
		} else throw new IllegalArgumentException('''The configuration have to be an «SmtSolverConfiguration.simpleName»!''')
	}
	
	override getInterpretations(ModelResult modelResult) {
		val representation = modelResult.representation.head as SMTDocument
		val trace = modelResult.trace as Logic2SmtMapperTrace
		return #[new SmtModelInterpretation(trace.problem,representation,trace.forwardMapper,trace)]
	}
}