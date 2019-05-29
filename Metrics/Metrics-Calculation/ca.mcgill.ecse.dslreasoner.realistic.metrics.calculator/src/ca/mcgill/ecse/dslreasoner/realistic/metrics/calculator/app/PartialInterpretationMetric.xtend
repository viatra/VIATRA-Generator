package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.PartialInterpretationGraph
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.output.CsvFileWriter
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.dse.api.Solution

class PartialInterpretationMetric {
	var static state = 0;
	
	// calculate the metrics for a state
	def static void calculateMetric(PartialInterpretation partial, String path, String currentStateId, Integer counter){
		val metrics = new ArrayList<Metric>();
		metrics.add(new OutDegreeMetric());
		metrics.add(new NodeActivityMetric());
		metrics.add(new MultiplexParticipationCoefficientMetric());
		
		//make dir since the folder can be none existing
		new File(path).mkdir();
		val filename = path + "/state_"+currentStateId+"-"+counter+".csv";
		state++;
		val metricCalculator = new PartialInterpretationGraph(partial, metrics, currentStateId);
		
		CsvFileWriter.write(metricCalculator.evaluateAllMetrics(), filename);
	}
	
	def static void outputTrajectories(PartialInterpretation empty, List<Solution>  solutions){	
		for(solution : solutions){
			//need to copy the empty solution because the transition directly worked on the graph
			val emptySolutionCopy = EcoreUtil.copy(empty)
			val trajectory = solution.shortestTrajectory;
			trajectory.modelWithEditingDomain = emptySolutionCopy
			
			// state codes that will record the trajectory
			val stateCodes = newArrayList()
			
			var counter = 0
			//transform and record the state codes for each state
			while(trajectory.doNextTransformation){
				//println(trajectory.stateCoder.createStateCode)
				val stateId = trajectory.stateCoder.createStateCode.toString
				val interpretation = trajectory.getModel();
				//calculate metrics of current state
				calculateMetric(interpretation as PartialInterpretation, "debug/metric/output", stateId, counter)
				stateCodes.add(stateId)
				counter++
			}
			
			
			//output the trajectory
			try{
				new File("debug/metric/trajectories/").mkdir();
				val path = "debug/metric/trajectories/trajectory"+trajectory.stateCoder.createStateCode.toString+".csv"
				val PrintWriter writer = new PrintWriter(new File(path))
				val output = new StringBuilder
				for(stateCode : stateCodes){
					output.append(stateCode+'\n')
				}
				writer.write(output.toString())
				writer.close()
			}catch(FileNotFoundException e) {
				e.printStackTrace()
			}
		}			
	}
}