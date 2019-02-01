package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireBackendSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import com.google.common.util.concurrent.SimpleTimeLimiter
import com.google.common.util.concurrent.UncheckedTimeoutException
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit
import org.eclipse.emf.common.command.Command
import org.eclipse.xtend.lib.annotations.Data

class VampireSolverException extends Exception{
	new(String s) { super(s) }
	new(String s, Exception e) { super(s,e) }
	new(String s, List<String> errors, Exception e) {
		super(s + '\n' + errors.join('\n'), e)
	}
}

@Data class VampireSolutionModel{
//	List<String> warnings
//	List<String> debugs
//	long kodkodTime
//	val List<Pair<A4Solution, Long>> aswers
//	val boolean finishedBeforeTimeout


}

class VampireHandler {

	//val fileName = "problem.als"
	
	public def callSolver(VampireModel problem, ReasonerWorkspace workspace, VampireSolverConfiguration configuration,String vampireCode) {
		/*
		//Prepare
		val warnings = new LinkedList<String>
		val debugs = new LinkedList<String>
		val runtime = new ArrayList<Long>
		val reporter = new A4Reporter() {
			override debug(String message) { debugs += message }
			override resultSAT (Object command, long solvingTime, Object solution) { runtime += solvingTime }
   			override resultUNSAT (Object command, long solvingTime, Object solution) { runtime += solvingTime }
			override warning(ErrorWarning msg) { warnings += msg.message }
		}
		
		val options = new A4Options() => [
			it.symmetry = configuration.symmetry
			it.noOverflow = true
			it.solver = getSolver(configuration.getSolver, configuration)
			if(configuration.getSolver.externalSolver) {
				it.solverDirectory = configuration.solverPath
			}
			//it.inferPartialInstance
			//it.tempDirectory = CommonPlugin.resolve(workspace.workspaceURI).toFileString
		]
		
		// Transform
		var Command command = null;
		var CompModule compModule = null
		
		// Start: Alloy -> Kodkod
		val kodkodTransformStart = System.currentTimeMillis();
		try {
			compModule = CompUtil.parseEverything_fromString(reporter,alloyCode)
			if(compModule.allCommands.size != 1)
				throw new UnsupportedOperationException('''Alloy files with multiple commands are not supported!''')
			command = compModule.allCommands.head
		} catch (Err e){
			throw new AlloySolverException(e.message,warnings,e)
		}
		val kodkodTransformFinish = System.currentTimeMillis - kodkodTransformStart
		// Finish: Alloy -> Kodkod
		
		val limiter = new SimpleTimeLimiter
		val callable = new AlloyCallerWithTimeout(warnings,debugs,reporter,options,command,compModule,configuration)
		var List<Pair<A4Solution, Long>> answers
		var boolean finished
		if(configuration.runtimeLimit == LogicSolverConfiguration::Unlimited) {
			answers = callable.call
			finished = true
		} else {
			try{
				answers = limiter.callWithTimeout(callable,configuration.runtimeLimit,TimeUnit.SECONDS,true)
				finished = true
			} catch (UncheckedTimeoutException e) {
				answers = callable.partialAnswers
				finished = false
			}
		}

		new MonitoredAlloySolution(warnings,debugs,kodkodTransformFinish,answers,finished)
		*/
	}
	/*
	val static Map<SolverConfiguration, SatSolver> previousSolverConfigurations = new HashMap
	def getSolverConfiguration(AlloyBackendSolver backedSolver, String path, String[] options) {
		val config = new SolverConfiguration(backedSolver,path,options)
		if(previousSolverConfigurations.containsKey(config)) {
			return previousSolverConfigurations.get(config)
		} else {
			val id ='''DSLReasoner_Alloy_«previousSolverConfigurations.size»_«backedSolver»'''
			val newSolver = A4Options.SatSolver.make(id,id,path,options)
			previousSolverConfigurations.put(config,newSolver)
			return newSolver
		}
	}
	
	def getSolver(AlloyBackendSolver backedSolver, AlloySolverConfiguration configuration) {
		switch(backedSolver){
			case BerkMinPIPE: return A4Options.SatSolver.BerkMinPIPE
			case SpearPIPE: return A4Options.SatSolver.SpearPIPE
			case MiniSatJNI: return A4Options.SatSolver.MiniSatJNI
			case MiniSatProverJNI: return A4Options.SatSolver.MiniSatProverJNI
			case LingelingJNI: return A4Options.SatSolver.LingelingJNI
			case PLingelingJNI: return getSolverConfiguration(backedSolver,configuration.solverPath,null)
			case GlucoseJNI: return A4Options.SatSolver.GlucoseJNI
			case CryptoMiniSatJNI: return A4Options.SatSolver.CryptoMiniSatJNI
			case SAT4J: return A4Options.SatSolver.SAT4J
			case CNF: return A4Options.SatSolver.CNF
			case KodKod: return A4Options.SatSolver.KK
		}
	}
	
	def isExternalSolver(AlloyBackendSolver backedSolver) {
		return !(backedSolver == AlloyBackendSolver.SAT4J)
	}
*/
}
/*
class VampireCallerWithTimeout implements Callable<List<Pair<A4Solution,Long>>>{
	
	val List<String> warnings
	val List<String> debugs
	val A4Reporter reporter
	val A4Options options
	
	val Command command
	val CompModule compModule
	val AlloySolverConfiguration configuration
	
	val List<Pair<A4Solution,Long>> answers = new LinkedList()
	
	new(List<String> warnings,
		List<String> debugs,
		A4Reporter reporter,
		A4Options options,
		Command command,
		CompModule compModule,
		AlloySolverConfiguration configuration)
	{
		this.warnings = warnings
		this.debugs = debugs
		this.reporter = reporter
		this.options = options
		this.command = command
		this.compModule = compModule
		this.configuration = configuration
	}
	
	override call() throws Exception {
		val startTime = System.currentTimeMillis
		
		// Start: Execute
		var A4Solution lastAnswer = null
		try {
			if(!configuration.progressMonitor.isCancelled) {
				do{
					if(lastAnswer == null) {
						lastAnswer = TranslateAlloyToKodkod.execute_command(reporter,compModule.allSigs,command,options)
					} else {
						lastAnswer = lastAnswer.next
					}
					configuration.progressMonitor.workedBackwardTransformation(configuration.solutionScope.numberOfRequiredSolution)
					
					val runtime = System.currentTimeMillis -startTime
					synchronized(this) {
						answers += (lastAnswer->runtime)
					}
				} while(lastAnswer.satisfiable != false && !hasEnoughSolution(answers) && !configuration.progressMonitor.isCancelled)
				
			}
		}catch(Exception e) {
			warnings +=e.message
		}
		// Finish: execute
		return answers
	}
	
	def hasEnoughSolution(List<?> answers) {
		if(configuration.solutionScope.numberOfRequiredSolution < 0) return false
		else return answers.size() == configuration.solutionScope.numberOfRequiredSolution
	}
	
	public def getPartialAnswers() {
		return answers
	}

}
/*
@Data class SolverConfiguration {
	VampireBackendSolver backendSolver
	String path
	String[] options
}
*/
