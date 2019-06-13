package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.RepMetricsReader
import java.util.List
import org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest

class KSDistance {
	var static ksTester = new KolmogorovSmirnovTest();
	var double[] mpcSamples;
	var double[] naSamples;
	var double[] outDegreeSamples;
	
	new(Domain d){
		var metrics = RepMetricsReader.read(d);
		mpcSamples = metrics.mpcSamples;
		naSamples = metrics.naSamples.stream.mapToDouble([it]).toArray();
		outDegreeSamples = metrics.outDegreeSamples.stream.mapToDouble([it]).toArray();
	}
	
	def double mpcDistance(List<Double> samples){
		// map list to array
		var arr = samples.stream.mapToDouble([it]).toArray();
		
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(arr.size < 2) return 1;
		return ksTester.kolmogorovSmirnovStatistic(mpcSamples, arr);
	}
	
	def double naDistance(List<Double> samples){
		// map list to array
		var arr = samples.stream.mapToDouble([it]).toArray();
		
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(arr.size < 2) return 1;
		return ksTester.kolmogorovSmirnovStatistic(naSamples as double[], arr);
	}
	
	def double outDegreeDistance(List<Double> samples){
		// map list to array
		var arr = samples.stream.mapToDouble([it]).toArray();
		
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(arr.size < 2) return 1;
		return ksTester.kolmogorovSmirnovStatistic(outDegreeSamples, arr);
	}
}