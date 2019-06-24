package ca.mcgill.ecse.socialnetwork.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.KSDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.CsvFileWriter;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.validation.ViolationCheck;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import socialnetwork.Person;

public class Main {
	
	private static String runWithPath(String path) {
		String message = StandaloneScriptExecutor.executeScript(path);
		return message;
	}
	
	public static void main(String args[]) {
//		try {
		
		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		output.add(prepareInfo());
		CsvFileWriter.write(output, "yakinduum/info.csv");
		//YakinduumModel.init();
		generateModel(1);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			outDegreeStatistic();
//		}
//		outDegreeStatistic();

	}
	
	public static void generateModel(int run) {
		//prepare initial info
		long begin = System.currentTimeMillis();
		String message = runWithPath("yakinduGeneration.vsconfig");
	
		
		
		if(message == null) {
			ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
			long elapsed = System.currentTimeMillis() - begin;
			String time = formatTime(elapsed);
			
			ArrayList<String> infoOutput = new ArrayList<String>();
			infoOutput.add(run+ "");
			infoOutput.add(time);
			infoOutput.addAll(calculateMetric());
			
			YakinduumModel model = new YakinduumModel("output/Viatra_100/1.xmi");
			int violationCount = ViolationCheck.calculateViolationCounts(model.yakinduum);
			infoOutput.add(violationCount + "");
			
			//save model to another directory
			model.save("yakinduum/" + run + ".xmi");
			
			output.add(infoOutput);
			CsvFileWriter.append(output, "yakinduum/info.csv");
			System.out.println("Finished");
		}
		
	}
	
	public static ArrayList<String> calculateMetric() {
		//read model and metric
		ArrayList<String> output = new ArrayList<String>();
		GraphReader reader = new GraphReader(YakindummPackage.eINSTANCE);
		EMFGraph graph = reader.readModels("output/Viatra_100/").get(0);
		
		//KS distance
		KSDistance ks = new KSDistance(Domain.Yakinduum);
		
		//calculate and put metric data to output array
		MetricSampleGroup samples = graph.evaluateAllMetricsToSamples();
		output.add(graph.getStatistic().getAllNodes().size() + "");
		output.add(ks.outDegreeDistance(samples.outDegreeSamples) + "");
		output.add(ks.naDistance(samples.naSamples)+ "");
		output.add(ks.mpcDistance(samples.mpcSamples) + "");
		return output;
	}
	
	public static ArrayList<String> prepareInfo() {
		ArrayList<String> info = new ArrayList<String>();
		info.add("ID");
		info.add("Time");
		info.add("# of Nodes");
		info.add("Out Degree");
		info.add("Node Activity");
		info.add("MPC");
		info.add("Violations");
		return info;
	}
	
	public static String formatTime(long time) {
		long mili = time % 1000;
		long second = (time / 1000) % 60;
		long minute = (time / (1000 * 60));
		return String.format("%d : %d.%d", minute, second, mili);
	}
	
	public static void statistics() {
		String uri = "output/1.xmi";
		SocialNetworkModel socialNetwork = new SocialNetworkModel(uri);
		System.out.println(socialNetwork.getPersons().size());
		
		File file = new File("model/statistics/output.txt");
		try {
			@SuppressWarnings("resource")
			PrintStream out = new PrintStream(file);
			for(Person p : socialNetwork.getPersons()) {
				out.println(p.getFriends().size());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Output Finished");
	}
}
