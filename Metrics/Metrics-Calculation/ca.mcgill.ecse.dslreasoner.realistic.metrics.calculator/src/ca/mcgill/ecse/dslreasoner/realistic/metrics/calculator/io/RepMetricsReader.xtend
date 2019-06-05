package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric
import java.io.File
import java.util.List
import java.util.Scanner
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup

/**
 * Read the sample of the distribution of a metric provided the csv file of the metric
 */
class RepMetricsReader {
	static def read(Domain d){
		var domainRepPath = CsvDataName.REP_PATH + d.name + '/';
		var rep = new MetricSampleGroup()
		rep.mpcSamples = readFile(domainRepPath + CsvDataName.MPC_REP, MultiplexParticipationCoefficientMetric.valueName,
							  MultiplexParticipationCoefficientMetric.countName).map[Double.parseDouble(it)];
		rep.naSamples = readFile(domainRepPath+CsvDataName.NA_REP, NodeActivityMetric.valueName, NodeActivityMetric.countName
							).map[Double.parseDouble(it)];
		rep.outDegreeSamples = readFile(domainRepPath+CsvDataName.OUT_D_REP, OutDegreeMetric.valueName,	OutDegreeMetric.countName
							).map[Double.parseDouble(it)];
		return rep;
	}
	
	/**
	 * read metric data and parse it to samples
	 */
	private static def List<String> readFile(String filename, String valueDataName, String countDataName){
		var s = new Scanner(new File(filename));
		val counts = newArrayList();
		val values = newArrayList();
		//read data from csv
		while(s.hasNext()){
			var data = s.nextLine().split(',');	
			
			if(data.size >= 1){
				if(data.get(0).equals(countDataName)){
					//add all data with parsing them as integers
					counts.addAll(data.subList(1, data.size()).map[Integer.parseInt(it)]);
				}else if(data.get(0).equals(valueDataName)){
					//add all data without parsing (there can be either double or string, to be parsed later)
					values.addAll(data.subList(1, data.size()));
				}
			}
		}
		
		return createSamples(counts, values);
	}
	
	// create samples from values and counts
	private static def List<String> createSamples(List<Integer> counts, List<String> values){
		val samples = newArrayList();
		
		if(counts.size() != values.size()){
			throw new RuntimeException("counts and values should have the same size!");
		}
		
		for(var i = 0; i < counts.size(); i++){
			for(var j = 0; j < counts.get(i); j++){
				samples.add(values.get(i));
			}
		}
		
		return samples;
	}
	
	
}

class CsvDataName{
	public static val REP_PATH = 'data/';
	public static val MPC_REP = 'mpc_rep.csv';
	public static val NA_REP = 'na_rep.csv';
	public static val OUT_D_REP = 'out_d_rep.csv';
}

