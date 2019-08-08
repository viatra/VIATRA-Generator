package ca.mcgill.ecse.socialnetwork.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.KSDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.CsvFileWriter;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.RepMetricsReader;
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
	
	private static String configFolder = "yakinduum/config22/";
	private static String configFileName = configFolder + "info_old_metric.csv";
	private static String aggregateViolationMeasureFileName = configFolder + "aggregateInfo.csv";
	private static String fileReadFolder = "output/Ecore_100/";
	
	public static void main(String args[]) {
		String ecoreFile = args[0];
		System.out.println("Generation Started");
		long begin = System.currentTimeMillis();
		String message = runWithPath(ecoreFile);
		long elapsed = System.currentTimeMillis() - begin;

		if(message != null) {
			System.out.println(message);
			return;
		}
//		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
//		String time = formatTime(elapsed);
//		ArrayList<String> infoOutput = new ArrayList<String>();
//		infoOutput.add(time);
//		output.add(infoOutput);
//		System.out.println(time);
//		CsvFileWriter.write(output, configFileName);
//		
//		
//		output = new ArrayList<ArrayList<String>>();
//		output.add(prepareInfo());
//		CsvFileWriter.append(output, configFileName);
//		
//		for(int i = 0; i < 50; i++) {
//			generateModel(i+1);
//		}
//		aggregateViolationMeasure(50);
		System.out.println("Finished");
	}

	public static void generateModel(int run) {
		String filename = run+"_1.xmi";
		//prepare initial info
		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		ArrayList<String> infoOutput = new ArrayList<String>();
		infoOutput.add(run+ "");
		infoOutput.addAll(calculateMetric(run));

		YakinduumModel model = new YakinduumModel(fileReadFolder +"run" +run + "/" + filename);
		int violationCount = ViolationCheck.calculateViolationCounts(model.yakinduum);
		infoOutput.add(violationCount + "");

		
		
		//save model to another directory
		model.save(configFolder + run + ".xmi");
		output.add(infoOutput);
		CsvFileWriter.append(output, configFileName);
	}
	
	public static void singleModelViolationMeasure(int run) {
		String filename = run+"_1.xmi";
		//prepare initial info
		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		ArrayList<String> infoOutput = new ArrayList<String>();
		infoOutput.add(run+ "");

		YakinduumModel model = new YakinduumModel(fileReadFolder+"/run"+run+"/"+ filename);
		
		//parse map of violation counts to two list and add them to the result list 
		Map<String, Integer> map = ViolationCheck.violationMaps(model.yakinduum);
		ArrayList<String> counts = new ArrayList<String>();
		ArrayList<String> violationNames = new ArrayList<String>(map.keySet());
		for(int i = 0; i < violationNames.size(); i++) {
			String name = violationNames.get(i);
			int total = map.get(name);
			counts.add(total + "");
		}
		output.add(infoOutput);
		output.add(violationNames);
		output.add(counts);
		
		CsvFileWriter.append(output, configFileName);
	}
	
	public static void aggregateViolationMeasure(int size) {
		ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
		ArrayList<String> counts = new ArrayList<String>();
		ArrayList<String> violationNames = null;
		for(int run = 1; run < size+1; run++) {
			String filename = run+"_1.xmi";
			YakinduumModel model = new YakinduumModel(fileReadFolder+"/run"+run+"/"+ filename);

			Map<String, Integer> map = ViolationCheck.violationMaps(model.yakinduum);
			if(run == 1) {
				violationNames = new ArrayList<String>(map.keySet());
				for(int i = 0; i < violationNames.size(); i++) {
					String name = violationNames.get(i);
					int total = map.get(name);
					counts.add(total + "");
				}
			}else {
				for(int i = 0; i < violationNames.size(); i++) {
					int count = Integer.parseInt(counts.get(i));
					String name = violationNames.get(i);
					int total = count + map.get(name);
					counts.set(i, total + "");
				}
			}
		}
		
		for(int i = 0; i < counts.size(); i++) {
			double count = Integer.parseInt(counts.get(i)) / (double) size;
			counts.set(i, count + "");
		}
		
		output.add(violationNames);
		output.add(counts);
		CsvFileWriter.write(output, aggregateViolationMeasureFileName);
	}
	
	public static ArrayList<String> calculateMetric(int run) {
		//read model and metric
		ArrayList<String> output = new ArrayList<String>();
		GraphReader reader = new GraphReader(YakindummPackage.eINSTANCE, ".xmi");
		EMFGraph graph = reader.readModel(fileReadFolder+"/run"+run, run + "_1.xmi");
		MetricSampleGroup metrics = RepMetricsReader.read(Domain.Yakindumm);
		//KS distance
		KSDistance ks = new KSDistance(metrics);
		
		//calculate and put metric data to output array
		MetricSampleGroup samples = graph.evaluateAllMetricsToSamples();
		output.add(graph.getStatistic().getAllNodes().size() + "");
		output.add(ks.outDegreeDistance(samples.outDegreeSamples) + "");
		output.add(ks.naDistance(samples.naSamples)+ "");
		output.add(ks.mpcDistance(samples.mpcSamples) + "");
		output.add(ks.typedOutDegreeDistance(samples.typedOutDegreeSamples) + "");
		return output;
	}
	
	public static ArrayList<String> prepareInfo() {
		ArrayList<String> info = new ArrayList<String>();
		info.add("ID");
		info.add("# of Nodes");
		info.add("Out Degree");
		info.add("Node Activity");
		info.add("MPC");
		info.add("Typed Out Degree");
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
