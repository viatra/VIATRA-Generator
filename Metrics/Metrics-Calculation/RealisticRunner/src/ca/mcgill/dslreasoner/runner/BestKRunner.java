package ca.mcgill.dslreasoner.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.EcoreMetricDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.MetricDistanceGroup;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.validation.ViolationCheck;

public class BestKRunner {
	private class ModelWithScore implements Comparable<ModelWithScore> {
		public final EObject root;
		public final double score;
		
		public ModelWithScore(EObject root, double score) {
			this.root = root;
			this.score = score;
		}

		@Override
		public int compareTo(ModelWithScore o) {
			return Double.compare(o.score, this.score);
		}
	}
	
	private int k = 100;
	IGeneratorRunner runner;
	long timeLimit;
	EcoreMetricDistance distanceCalculator;
	Domain d;
	int singleRun;
	ViolationCheck checker;
	
	public BestKRunner(int k, IGeneratorRunner runner, long time, Domain d, int singleRun) {
		this(k, time, d, singleRun);
		this.runner = runner;
	}
	
	public BestKRunner(int k, long time, Domain d, int singleRun) {
		this.k = k;
		this.timeLimit = time;
		this.d = d;
		this.singleRun = singleRun;
		this.distanceCalculator = new EcoreMetricDistance(d);
	}
	
	public void setRunner(IGeneratorRunner runner) {
		this.runner = runner;
	}
	
	public List<EObject> generate() {
		this.checker = new ViolationCheck(d);
		PriorityQueue<ModelWithScore> queue = new PriorityQueue<ModelWithScore>();
		long time = 0;
		
		
		while (time < timeLimit) {
			System.out.println(time);
			long start = System.currentTimeMillis();
			try {
				List<EObject> roots =runner.runGeneration(singleRun);
				int j = 0;
				for (EObject root : roots) {
					j++;
//					System.out.println(j);
					tryAdd(queue, root);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
			
			time += (System.currentTimeMillis() - start);
		}
		
		return queue.stream().map(e -> e.root).collect(Collectors.toList());
	}
	
	private void tryAdd(PriorityQueue<ModelWithScore> queue, EObject root) throws Exception {
		MetricDistanceGroup g = distanceCalculator.calculateMetricDistanceKS(root);
		// int violations = checker.calculateViolationCounts(root);
		ModelWithScore model = new ModelWithScore(root, calculateScore(g, 0));
		
		
		if (queue.size() < k) {
//			System.out.println("-----------------------------------------------");
//			System.out.println("MPC: " + g.getMPCDistance());
//			System.out.println("NA: " + g.getNADistance());
//			System.out.println("NT: " + g.getNodeTypeDistance());
//			System.out.println("OD: " + g.getOutDegreeDistance());
			
			queue.offer(model);
		} else if (model.compareTo(queue.peek()) > 0) {
			
//			System.out.println("-----------------------------------------------");
//			System.out.println("MPC: " + g.getMPCDistance());
//			System.out.println("NA: " + g.getNADistance());
//			System.out.println("NT: " + g.getNodeTypeDistance());
//			System.out.println("OD: " + g.getOutDegreeDistance());
			
			queue.offer(model);
			queue.poll();
		}
		
	}

	
	private double calculateScore(MetricDistanceGroup g, int violations) {
		return g.getMPCDistance() + g.getNADistance() + g.getNodeTypeDistance() + g.getOutDegreeDistance() + violations;
	}
}
