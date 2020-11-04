package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import java.util.HashMap
import java.util.List

class MetricSampleGroup{
	public var List<Double> mpcSamples;
	public var List<Double> naSamples;
	public var List<Double> outDegreeSamples;
	public var HashMap<String, List<Integer>> typedOutDegreeSamples;
	public var HashMap<String, Double> nodeTypeSamples;
	public var HashMap<String, Double> edgeTypeSamples;
}