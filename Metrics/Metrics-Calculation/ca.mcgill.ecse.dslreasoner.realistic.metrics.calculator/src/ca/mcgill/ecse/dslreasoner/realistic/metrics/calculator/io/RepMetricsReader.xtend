package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl

/**
 * Read the sample of the distribution of a metric provided the csv file of the metric
 */
class RepMetricsReader {
	static def read(Domain d){
		var reader = new GraphReader(YakindummPackageImpl.eINSTANCE);
		
		
		var domainRepPath = DataName.REP_PATH + d.name + '/';
		var rep = new MetricSampleGroup()
		var out_d = readMetrics(reader, domainRepPath + DataName.OUT_D_REP);
		rep.mpcSamples = readMetrics(reader, domainRepPath + DataName.MPC_REP).mpcSamples;
		rep.outDegreeSamples = out_d.outDegreeSamples;
		rep.naSamples = readMetrics(reader, domainRepPath + DataName.NA_REP).naSamples;
		rep.typedOutDegreeSamples = out_d.typedOutDegreeSamples;
		rep.edgeTypeSamples = out_d.edgeTypeSamples;
		rep.nodeTypeSamples = out_d.nodeTypeSamples;
		return rep;
	}
	
	/**
	 * Read representative model
	 */
	private static def readMetrics(GraphReader r, String path){
		var model = r.readModels(path).head;
		return model.evaluateAllMetricsToSamples();
	}
	
}

class DataName{
	public static val REP_PATH = 'data/';
	public static val MPC_REP = 'mpc_rep';
	public static val NA_REP = 'na_rep';
	public static val OUT_D_REP = 'out_d_rep';
}

