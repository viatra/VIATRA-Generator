package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.objectives.ObjectiveComparatorHelper;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.MetricDistanceGroup;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.PartialInterpretationMetricDistance;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.PartialInterpretation2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder.NeighbourhoodBasedPartialInterpretationStateCoder;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualiser;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ModelGenerationMethod;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.RealisticGuidance;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;

public class HillClimbingOnRealisticMetricStrategyForModelGeneration implements IStrategy {
	// Services and Configuration
	private ThreadContext context;
	private ReasonerWorkspace workspace;
	private ViatraReasonerConfiguration configuration;
	private ModelGenerationMethod method;
	private PartialInterpretation2Logic partialInterpretation2Logic = new PartialInterpretation2Logic();
	private Comparator<TrajectoryWithFitness> comparator;
	private Logger logger = Logger.getLogger(IStrategy.class);
	public NumericSolver numericSolver = null;

	// Running
	private PriorityQueue<TrajectoryWithFitness> trajectoiresToExplore;
	private SolutionStore solutionStore;
	private SolutionStoreWithCopy solutionStoreWithCopy;
	private SolutionStoreWithDiversityDescriptor solutionStoreWithDiversityDescriptor;
	private volatile boolean isInterrupted = false;
	private ModelResult modelResultByInternalSolver = null;
	private Random random = new Random();
	
	// matchers for detecting the number of violations
	private Collection<ViatraQueryMatcher<? extends IPatternMatch>> mustMatchers;
	private Collection<ViatraQueryMatcher<? extends IPatternMatch>> mayMatchers;

	// Encode the used activations of a particular state
	private Map<Object, List<Object>> stateAndActivations;
	private boolean allowMustViolation;
	private Domain domain;
	int targetSize;
	public ActivationSelector activationSelector = new EvenActivationSelector(random);
	// Statistics
	private int numberOfStatecoderFail = 0;
	private int numberOfPrintedModel = 0;
	private int numberOfSolverCalls = 0;
	private PartialInterpretationMetricDistance metricDistance; 
	private double currentStateValue = Double.MAX_VALUE;
	private double currentNodeTypeDistance = 1;
	private int numNodesToGenerate = 0;
	public long explorationStarted = 0;
	public long globalConstraintEvaluationTime = 0;
	public long fitnessCalculationTime = 0;
	
	public HillClimbingOnRealisticMetricStrategyForModelGeneration(
			ReasonerWorkspace workspace,
			ViatraReasonerConfiguration configuration,
			ModelGenerationMethod method)
	{
		this.workspace = workspace;
		this.configuration = configuration;
		this.method = method;
	}
	
	public SolutionStoreWithCopy getSolutionStoreWithCopy() {
		return solutionStoreWithCopy;
	}
	public SolutionStoreWithDiversityDescriptor getSolutionStoreWithDiversityDescriptor() {
		return solutionStoreWithDiversityDescriptor;
	}
	public int getNumberOfStatecoderFail() {
		return numberOfStatecoderFail;
	}
	
	public long getForwardTime() {
		return context.getDesignSpaceManager().getForwardTime();
	}
	public long getBacktrackingTime() {
		return context.getDesignSpaceManager().getBacktrackingTime();
	}

	@Override
	public void initStrategy(ThreadContext context) {
		this.context = context;
		this.solutionStore = context.getGlobalContext().getSolutionStore();
		domain = Domain.valueOf(configuration.domain);

		ViatraQueryEngine engine = context.getQueryEngine();
//			// TODO: visualisation
		mustMatchers = new LinkedList<ViatraQueryMatcher<? extends IPatternMatch>>();
		mayMatchers = new LinkedList<ViatraQueryMatcher<? extends IPatternMatch>>();
		
		// manully restict the number of super types of one class
		this.method.getInvalidWF().forEach(a ->{ 
			ViatraQueryMatcher<? extends IPatternMatch> matcher = a.getMatcher(engine);
			mustMatchers.add(matcher);
		});
		
		this.method.getUnfinishedWF().forEach(a ->{ 
			ViatraQueryMatcher<? extends IPatternMatch> matcher = a.getMatcher(engine);
			mayMatchers.add(matcher);
		});
	
		
		//set up comparator
		final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();
		this.comparator = new Comparator<TrajectoryWithFitness>() {
			@Override
			public int compare(TrajectoryWithFitness o1, TrajectoryWithFitness o2) {
				return objectiveComparatorHelper.compare(o2.fitness, o1.fitness);
			}
		};
		
		this.solutionStoreWithCopy = new SolutionStoreWithCopy();
		this.solutionStoreWithDiversityDescriptor = new SolutionStoreWithDiversityDescriptor(configuration.diversityRequirement);
		
		trajectoiresToExplore = new PriorityQueue<TrajectoryWithFitness>(11, comparator);
		stateAndActivations = new HashMap<Object, List<Object>>();
		metricDistance = new PartialInterpretationMetricDistance(domain);
		
		//set whether allows must violations during the realistic generation
		allowMustViolation = configuration.allowMustViolations;
		targetSize = configuration.typeScopes.maxNewElements + 2;
		//this.numericSolver = new NumericSolver(method, this.configuration.runIntermediateNumericalConsistencyChecks, false);
	}

	@Override
	public void explore() {
		this.explorationStarted=System.nanoTime();
		if (!checkGlobalConstraints()) {
			logger.info("Global contraint is not satisifed in the first state. Terminate.");
			return;
		}
		if (configuration.searchSpaceConstraints.maxDepth == 0) {
			logger.info("Maximal depth is reached in the initial solution. Terminate.");
			return;
		}
		
		final Fitness firstFittness = context.calculateFitness();
		
		//final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();
		final Object[] firstTrajectory = context.getTrajectory().toArray(new Object[0]);
		TrajectoryWithFitness currentTrajectoryWithFittness = new TrajectoryWithFitness(firstTrajectory, firstFittness);
		trajectoiresToExplore.add(currentTrajectoryWithFittness);
		Object lastState = null;
		
		//if(configuration)
		visualiseCurrentState();
		// the two is the True and False node generated at the beginning of the generation
		int count = 0;
		mainLoop: while (!isInterrupted && !configuration.progressMonitor.isCancelled()) {

			if (currentTrajectoryWithFittness == null) {
				if (trajectoiresToExplore.isEmpty()) {
					logger.debug("State space is fully traversed.");
					return;
				} else {
					currentTrajectoryWithFittness = selectState();
					if (logger.isDebugEnabled()) {
						logger.debug("Current trajectory: " + Arrays.toString(context.getTrajectory().toArray()));
						logger.debug("New trajectory is chosen: " + currentTrajectoryWithFittness);
					}
					context.getDesignSpaceManager().executeTrajectoryWithMinimalBacktrackWithoutStateCoding(currentTrajectoryWithFittness.trajectory);
					
					// reset the regression for this trajectory
					metricDistance.getLinearModel().resetRegression(context.getCurrentStateId());
				}
			}
			
			List<Object> activationIds = selectActivation();
			PartialInterpretation model = (PartialInterpretation) context.getModel();
			System.out.println(model.getNewElements().size());
			System.out.println("# violations: " + getNumberOfViolations(mayMatchers));
			
			Map<Object, Double> valueMap = new HashMap<Object,Double>();
			
			//init epsilon and draw
			MetricDistanceGroup heuristics =  metricDistance.calculateMetricDistanceKS(model);

			if(!stateAndActivations.containsKey(context.getCurrentStateId())) {
				stateAndActivations.put(context.getCurrentStateId(), new ArrayList<Object>());
			}
			
			// calculate values for epsilon greedy
			double epsilon = 1.0/count;
			double draw = Math.random();
			count++;
			this.currentNodeTypeDistance = heuristics.getNodeTypeDistance();
			numNodesToGenerate = model.getMaxNewElements();
			System.out.println("NA distance: " + heuristics.getNADistance());	
			System.out.println("MPC distance: " + heuristics.getMPCDistance());	
			System.out.println("Out degree distance:" + heuristics.getOutDegreeDistance());	
			System.out.println("NodeType :" + currentNodeTypeDistance);	


			//TODO: the number of activations to be checked should be configurasble
			if(activationIds.size() > 50) {
				activationIds = activationIds.subList(0, 50);
			}
			
			valueMap = sortWithWeight(activationIds);
			lastState = context.getCurrentStateId();
			while (!isInterrupted && !configuration.progressMonitor.isCancelled() && activationIds.size() > 0) {
				final Object nextActivation = drawWithEpsilonProbabilty(activationIds, valueMap, epsilon, draw);
									
				stateAndActivations.get(context.getCurrentStateId()).add(nextActivation);
				logger.debug("Executing new activation: " + nextActivation);
				context.executeAcitvationId(nextActivation);
				visualiseCurrentState();
				boolean consistencyCheckResult = checkConsistency(currentTrajectoryWithFittness);
				if(consistencyCheckResult == true) { continue mainLoop; }
				
//				if (context.isCurrentStateAlreadyTraversed()) {
//					logger.info("The new state is already visited.");
//					context.backtrack();
//				} else if (!checkGlobalConstraints()) {
//					logger.debug("Global contraint is not satisifed.");
//					context.backtrack();
//				} 
				
				int currentSize = model.getNewElements().size();
				int targetDiff = targetSize - currentSize;
				boolean shouldFinish = currentSize >= targetSize;
				
				// does not allow must violations
				if((getNumberOfViolations(mustMatchers) > 0|| getNumberOfViolations(mayMatchers) > targetDiff) && !allowMustViolation && !shouldFinish) {
					context.backtrack();
				}else {
					final Fitness nextFitness = context.calculateFitness();
					
					// the only hard objectives are configured in the config file
					checkForSolution(nextFitness);
			
					if (context.getDepth() > configuration.searchSpaceConstraints.maxDepth) {
						logger.debug("Reached max depth.");
						context.backtrack();
						continue;
					}
					
					//Record value for current trajectory
					TrajectoryWithFitness nextTrajectoryWithFittness = new TrajectoryWithFitness(
							context.getTrajectory().toArray(), nextFitness);
					int nodeSize = ((PartialInterpretation) context.getModel()).getNewElements().size();
					int violation = getNumberOfViolations(mayMatchers);
					double currentValue = calculateCurrentStateValue(nodeSize, violation);
					metricDistance.getLinearModel().feedData(context.getCurrentStateId(), metricDistance.calculateFeature(nodeSize, violation), currentValue, lastState);
					trajectoiresToExplore.add(nextTrajectoryWithFittness);
					currentStateValue = currentValue;
					//Currently, just go to the next state without considering the value of trajectory
					currentTrajectoryWithFittness = nextTrajectoryWithFittness;
					continue mainLoop;

				}
			}
			logger.debug("State is fully traversed.");
			trajectoiresToExplore.remove(currentTrajectoryWithFittness);
			currentTrajectoryWithFittness = null;
			context.backtrack();
		}
		logger.info("Interrupted.");
	}

	private boolean checkGlobalConstraints() {
		long start = System.nanoTime();
		boolean result = context.checkGlobalConstraints();
		globalConstraintEvaluationTime += System.nanoTime() - start;
		return result;
	}
	
	private Fitness calculateFitness() {
		long start = System.nanoTime();
		Fitness fitness = context.calculateFitness(); 
		fitnessCalculationTime += System.nanoTime() - start;
		return fitness;
	}
	
	/**
	 *
	 * @param activationIds
	 * @return: activation to value map
	 */
	private Map<Object, Double> sortWithWeight(List<Object> activationIds){
		Map<Object, Double> valueMap = new HashMap<Object, Double>();
		Object currentId = context.getCurrentStateId();
		// check for next states
		for(Object id : activationIds) {
			context.executeAcitvationId(id);
			int violation = getNumberOfViolations(mayMatchers);

			if(!allowMustViolation && getNumberOfViolations(mustMatchers) > 0) {
				valueMap.put(id, Double.MAX_VALUE);
				stateAndActivations.get(currentId).add(id);
			}else {
				valueMap.put(id, calculateFutureStateValue(violation));
			}
				
			
			
			context.backtrack();
		}
		
		//remove all the elements having large distance
		Collections.sort(activationIds, Comparator.comparing(li -> valueMap.get(li)));
		return valueMap;
	}
	
	private double calculateFutureStateValue(int violation) {
		long start = System.nanoTime();
		int nodeSize = ((PartialInterpretation) context.getModel()).getNewElements().size();
		double currentValue = calculateCurrentStateValue(nodeSize,violation);
		double[] toPredict = metricDistance.calculateFeature(100, violation);
		if(Math.abs(currentValue - currentStateValue) < 0.001) {
			this.method.getStatistics().addMetricCalculationTime(System.nanoTime() - start);
			return Double.MAX_VALUE;
		}
		try {
			this.method.getStatistics().addMetricCalculationTime(System.nanoTime() - start);
			return metricDistance.getLinearModel().getPredictionForNextDataSample(metricDistance.calculateFeature(nodeSize, violation), currentValue, toPredict);
		}catch(IllegalArgumentException e) {
			this.method.getStatistics().addMetricCalculationTime(System.nanoTime() - start);
			return currentValue;
		}

	}
	private double calculateCurrentStateValue(int factor, int violation) {
		PartialInterpretation model = (PartialInterpretation) context.getModel();
		MetricDistanceGroup g = metricDistance.calculateMetricDistanceKS(model);
		if(configuration.realisticGuidance == RealisticGuidance.MPC) {
			return g.getMPCDistance();
		}else if(configuration.realisticGuidance == RealisticGuidance.NodeActivity) {
			return g.getNADistance();
		}else if(configuration.realisticGuidance == RealisticGuidance.OutDegree) {
			return g.getOutDegreeDistance();
		}else if(configuration.realisticGuidance == RealisticGuidance.NodeType) {
			return g.getNodeTypeDistance();
		}else if(configuration.realisticGuidance == RealisticGuidance.Composite) {
			double consistenceWeights = 5 * factor / (configuration.typeScopes.maxNewElements + 2) * (1- 1.0/(1+violation));
			if(domain == Domain.Yakindumm) {
				double unfinishFactor = 50 * (1 - (double)factor / targetSize);
				double nodeTypeFactor = g.getNodeTypeDistance();
				double normalFactor = 5;
				if(currentNodeTypeDistance <= 0.05 || numNodesToGenerate == 1) {
					nodeTypeFactor = 0;
					normalFactor = 100;
					unfinishFactor = 0; 
				}
				
				return 100*(nodeTypeFactor) + normalFactor*(2*g.getNADistance() + g.getMPCDistance() + 2*g.getOutDegreeDistance()) + normalFactor / 5*consistenceWeights + unfinishFactor;
			}else if (domain == Domain.Ecore) {
				double unfinishFactor = 100 * (1 - (double)factor / targetSize);
				double nodeTypeFactor = g.getNodeTypeDistance();
				double normalFactor = 5;
				if(currentNodeTypeDistance <= 0.12 || numNodesToGenerate == 1) {
					nodeTypeFactor = 0;
					normalFactor = 100;
					unfinishFactor *= 0.5; 
				}
				
				return 100*(nodeTypeFactor) + normalFactor*(2*g.getNADistance() + g.getMPCDistance() + 2*g.getOutDegreeDistance()) + normalFactor / 5*consistenceWeights + unfinishFactor;
			}else {
				double unfinishFactor = context.calculateFitness().get("CompositeUnfinishednessObjective");
				double nodeTypeFactor = g.getNodeTypeDistance();
				double normalFactor = 5;
				if(currentNodeTypeDistance <= 0.05 || numNodesToGenerate == 1) {
					nodeTypeFactor = 0;
					normalFactor = 100;
					//unfinishFactor *= 0.5; 
				}
				
				return 100*(nodeTypeFactor) + normalFactor*(2*g.getNADistance() + 2*g.getMPCDistance() + 2*g.getOutDegreeDistance()) + normalFactor / 5*consistenceWeights + unfinishFactor;
			}

		}else if(configuration.realisticGuidance == RealisticGuidance.Composite_Without_Violations) {
			if(domain == Domain.Yakindumm) {
				double unfinishFactor = 50 * (1 - (double)factor / targetSize);
				double nodeTypeFactor = g.getNodeTypeDistance();
				double normalFactor = 5;
				if(currentNodeTypeDistance <= 0.05 || numNodesToGenerate == 1) {
					nodeTypeFactor = 0;
					normalFactor = 100;
					unfinishFactor = 0; 
				}
				
				return 100*(nodeTypeFactor) + normalFactor*(2*g.getNADistance() + g.getMPCDistance() + 2*g.getOutDegreeDistance()) + unfinishFactor;
			}else if (domain == Domain.Github) {
				double unfinishFactor = 100 * (1 - (double)factor / targetSize);
				double nodeTypeFactor = g.getNodeTypeDistance();
				double normalFactor = 5;
				if(currentNodeTypeDistance <= 0.12 || numNodesToGenerate == 1) {
					nodeTypeFactor = 0;
					normalFactor = 100;
					unfinishFactor *= 0.5; 
				}
				
				return 100*(nodeTypeFactor) + normalFactor*(2*g.getNADistance() + g.getMPCDistance() + 2*g.getOutDegreeDistance()) + unfinishFactor;
			} else {
				double unfinishFactor = 100 * (1 - (double)factor / targetSize);
				double nodeTypeFactor = g.getNodeTypeDistance();
				double normalFactor = 5;
				if(currentNodeTypeDistance <= 0.20 || numNodesToGenerate == 1) {
					nodeTypeFactor = 0;
					normalFactor = 100;
					unfinishFactor *= 0.5; 
				}
				
				return 100*(nodeTypeFactor) + normalFactor*(2*g.getNADistance() + g.getMPCDistance() + 2*g.getOutDegreeDistance()) + unfinishFactor;
			}
		}else {
			return violation;
		}
	}
	
	private int getNumberOfViolations(Collection<ViatraQueryMatcher<? extends IPatternMatch>> matchers) {
		int violations = matchers.stream().mapToInt(m -> m.countMatches()).sum();
		
		return violations;
	}
	
	// Modified epsilon greedy choose for action based on value function
	// with probability epsilon, choose the state with probability based on the weight
	// with probability 1 - epsilon, choose the best state
	// epsilon should decay w.r.t. time
	private Object drawWithEpsilonProbabilty(List<Object> activationIds, Map<Object, Double> valueMap, double epsilon, double currentDraw) {
		if(activationIds.size() <= 0) {
			return null;
		}
		
		// if epsilon is smaller than current draw, return greedy choice 
		if(epsilon < currentDraw) {
			return activationIds.remove(0);
		}else {
			//else return draw with probability of the weights
			//find the sum of all 1-weights: the smaller the better
			double sum = valueMap.values().stream().mapToDouble(d->1).sum();
			double rand = Math.random() * sum;
			double iterator = 0.0;
			Object idToReturn = null;
			
			// draw an item with probability
			for(Object o : valueMap.keySet()) {
				iterator += (1);
				if(rand < iterator) {
					idToReturn = o;
					break;
				}
			}
			
			//delete the item from the list
			activationIds.remove(idToReturn);
			valueMap.remove(idToReturn);
			return idToReturn;
		}
	}
	
	private List<Object> selectActivation() {
		List<Object> activationIds;
		try {
			activationIds = this.activationSelector.randomizeActivationIDs(context.getUntraversedActivationIds());
		} catch (NullPointerException e) {
			numberOfStatecoderFail++;
			activationIds = Collections.emptyList();
		}
		return activationIds;
	}

	private void checkForSolution(final Fitness fittness) {
		if (fittness.isSatisifiesHardObjectives()) {
			logger.debug("Solution Found!!");
			logger.debug("# violations: " + (getNumberOfViolations(mustMatchers)));
			if (solutionStoreWithDiversityDescriptor.isDifferent(context)) {
				solutionStoreWithCopy.newSolution(context);
				solutionStoreWithDiversityDescriptor.newSolution(context);
				solutionStore.newSolution(context);
				configuration.progressMonitor.workedModelFound(configuration.solutionScope.numberOfRequiredSolutions);

				logger.debug("Found a solution.");
			}
		}
	}
	
	public List<String> times = new LinkedList<String>();
	private void saveTimes() {
		long forwardTime = context.getDesignSpaceManager().getForwardTime()/1000000;
		long backtrackingTime = context.getDesignSpaceManager().getBacktrackingTime()/1000000;
		long statecoderTime = ((NeighbourhoodBasedPartialInterpretationStateCoder)this.context.getStateCoder()).getStatecoderRuntime()/1000000;
		long solutionCopy = solutionStoreWithCopy.getSumRuntime()/1000000;
		long activationSelection = this.activationSelector.getRuntime()/1000000;
//		long numericalSolverSumTime = this.numericSolver.getRuntime()/1000000;
//		long numericalSolverProblemForming = this.numericSolver.getSolverSolvingProblem()/1000000;
//		long numericalSolverSolving = this.numericSolver.getSolverSolvingProblem()/1000000;
//		long numericalSolverInterpreting = this.numericSolver.getSolverSolution()/1000000;
		long metricCalculationTime = this.method.getStatistics().metricCalculationTime / 1000000;
		this.times.add(
			"(TransformationExecutionTime"+method.getStatistics().transformationExecutionTime/1000000+ 
			"|ForwardTime:"+forwardTime+
			"|Backtrackingtime:"+backtrackingTime+
			"|StateCoderTime:"+statecoderTime+
			"|SolutionCopyTime:"+solutionCopy+
			"|ActivationSelectionTime:"+activationSelection+
			//"|NumericalSolverSumTime:"+numericalSolverSumTime+
			//"|NumericalSolverProblemFormingTime:"+numericalSolverProblemForming+
			//"|NumericalSolverSolvingTime:"+numericalSolverSolving+
			//"|NumericalSolverInterpretingSolution:"+numericalSolverInterpreting+
			"|MetricCalculationTime:"+metricCalculationTime + ")"
			);
		
	}

	@Override
	public void interruptStrategy() {
		isInterrupted = true;
	}


	private TrajectoryWithFitness selectState() {
		int randomNumber = random.nextInt(configuration.randomBacktrackChance);
		if (randomNumber == 0) {
			int elements = trajectoiresToExplore.size();
			int randomElementIndex = random.nextInt(elements);
			logger.debug("Randomly backtract to the " + randomElementIndex + " best solution...");
			Iterator<TrajectoryWithFitness> iterator = trajectoiresToExplore.iterator();
			while (randomElementIndex != 0) {
				iterator.next();
				randomElementIndex--;
			}
			TrajectoryWithFitness res = iterator.next();
			if (res == null) {
				return trajectoiresToExplore.element();
			} else {
				return res;
			}
		} else {
			return trajectoiresToExplore.element();
		}
	}	
	
//		private void logCurrentStateMetric() {
//			if(this.configuration.documentationLevel != DocumentationLevel.NONE || workspace == null) {
//				return;
//			}
//			
//			PartialInterpretation interpretation = (PartialInterpretation)context.getModel();   //pattern.get("interpretation");
//			PartialInterpretationMetric.calculateMetric(interpretation, "debug/metric/" + context.getModel().hashCode(), context.getCurrentStateId().toString());		
//		}

	public void visualiseCurrentState() {
		PartialInterpretationVisualiser partialInterpretatioVisualiser = configuration.debugConfiguration.partialInterpretatioVisualiser;
		if(partialInterpretatioVisualiser != null && this.configuration.documentationLevel == DocumentationLevel.FULL && workspace != null) {
			PartialInterpretation p = (PartialInterpretation) (context.getModel());
			int id = ++numberOfPrintedModel;
			if (id % configuration.debugConfiguration.partalInterpretationVisualisationFrequency == 0) {
				PartialInterpretationVisualisation visualisation = partialInterpretatioVisualiser.visualiseConcretization(p);
				logger.debug("Visualizing state: " + id + " (" + context.getDesignSpaceManager().getCurrentState() + ")");
				String name = String.format("state%09d", id);
				visualisation.writeToFile(workspace, name + ".png");
				workspace.writeModel((EObject) context.getModel(), name + ".xmi");
			}
		}
	}

	protected boolean checkConsistency(TrajectoryWithFitness t) {
		LogicReasoner internalIncosnsitencyDetector = configuration.internalConsistencyCheckerConfiguration.internalIncosnsitencyDetector;
		if (internalIncosnsitencyDetector!= null) {
			int id = ++numberOfSolverCalls;
			if (id % configuration.internalConsistencyCheckerConfiguration.incternalConsistencyCheckingFrequency == 0) {
				try {
					PartialInterpretation interpretation = (PartialInterpretation) (context.getModel());
					PartialInterpretation copied = EcoreUtil.copy(interpretation);
					this.partialInterpretation2Logic.transformPartialIntepretation2Logic(copied.getProblem(), copied);
					LogicProblem newProblem = copied.getProblem();

					this.configuration.typeScopes.maxNewElements = interpretation.getMaxNewElements();
					this.configuration.typeScopes.minNewElements = interpretation.getMinNewElements();
					LogicResult result = internalIncosnsitencyDetector.solve(newProblem, configuration, workspace);
					if (result instanceof InconsistencyResult) {
						logger.debug("Solver found an Inconsistency!");
						removeSubtreeFromQueue(t);
						return true;
					} else if (result instanceof ModelResult) {
						logger.debug("Solver found a model!");
						solutionStore.newSolution(context);

						this.modelResultByInternalSolver = (ModelResult) result;
						return true;
					} else {
						logger.debug("Failed consistency check.");
						return false;
					}
				} catch (Exception e) {
					logger.debug("Problem with internal consistency checking: "+e.getMessage());
					e.printStackTrace();
					return false;
				}
			}

		}
		return false;
	}

	protected void removeSubtreeFromQueue(TrajectoryWithFitness t) {
		PriorityQueue<TrajectoryWithFitness> previous = this.trajectoiresToExplore;
		this.trajectoiresToExplore = new PriorityQueue<>(this.comparator);
		for (TrajectoryWithFitness trajectoryWithFitness : previous) {
			if (!containsAsSubstring(trajectoryWithFitness.trajectory, t.trajectory)) {
				this.trajectoiresToExplore.add(trajectoryWithFitness);
			} else {
				logger.debug("State has been excluded due to inherent inconsistency");
			}
		}
	}

	private boolean containsAsSubstring(Object[] full, Object[] substring) {
		if (substring.length > full.length) {
			return false;
		} else if (substring.length == full.length) {
			return Arrays.equals(full, substring);
		} else {
			Object[] part = Arrays.copyOfRange(full, 0, substring.length);
			return Arrays.equals(part, substring);
		}
	}
}
