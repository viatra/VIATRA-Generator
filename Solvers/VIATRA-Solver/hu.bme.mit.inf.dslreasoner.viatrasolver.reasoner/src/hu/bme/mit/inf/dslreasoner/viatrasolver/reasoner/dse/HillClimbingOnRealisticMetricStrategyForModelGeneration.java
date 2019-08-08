package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;

import org.apache.log4j.Logger;
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
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.PartialInterpretation2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualiser;
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
		private Map<TrajectoryWithFitness, Double> trajectoryFit; 
		
		private boolean allowMustViolation;
		private Domain domain;
		
		// Statistics
		private int numberOfStatecoderFail = 0;
		private int numberOfPrintedModel = 0;
		private int numberOfSolverCalls = 0;
		private PartialInterpretationMetricDistance metricDistance; 

		
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

		@Override
		public void initStrategy(ThreadContext context) {
			this.context = context;
			this.solutionStore = context.getGlobalContext().getSolutionStore();
			
			ViatraQueryEngine engine = context.getQueryEngine();
//			// TODO: visualisation
			mustMatchers = new LinkedList<ViatraQueryMatcher<? extends IPatternMatch>>();
			mayMatchers = new LinkedList<ViatraQueryMatcher<? extends IPatternMatch>>();

			this.method.getInvalidWF().forEach(a ->{ 
				ViatraQueryMatcher<? extends IPatternMatch> matcher = a.getMatcher(engine);
				mustMatchers.add(matcher);
			});
			
			this.method.getUnfinishedWF().forEach(a ->{ 
				ViatraQueryMatcher<? extends IPatternMatch> matcher = a.getMatcher(engine);
				mayMatchers.add(matcher);
			});
			
			
			this.solutionStoreWithCopy = new SolutionStoreWithCopy();
			this.solutionStoreWithDiversityDescriptor = new SolutionStoreWithDiversityDescriptor(configuration.diversityRequirement);

			trajectoryFit = new HashMap<TrajectoryWithFitness, Double>();
			this.comparator = new Comparator<TrajectoryWithFitness>() {
				@Override
				public int compare(TrajectoryWithFitness o1, TrajectoryWithFitness o2) {
					return Double.compare(trajectoryFit.get(o1), trajectoryFit.get(o2));
				}
			};
			
			trajectoiresToExplore = new PriorityQueue<TrajectoryWithFitness>(11, comparator);
			stateAndActivations = new HashMap<Object, List<Object>>();
			
			domain = Domain.valueOf(configuration.domain);
			metricDistance = new PartialInterpretationMetricDistance(domain);
			
			//set whether allows must violations during the realistic generation
			allowMustViolation = configuration.allowMustViolations;
		}

		@Override
		public void explore() {
			if (!context.checkGlobalConstraints()) {
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
			trajectoryFit.put(currentTrajectoryWithFittness, Double.MAX_VALUE);
			trajectoiresToExplore.add(currentTrajectoryWithFittness);
			Object lastState = null;
			
			//if(configuration)
			visualiseCurrentState();
			// the two is the True and False node generated at the beginning of the generation
			int targetSize = configuration.typeScopes.maxNewElements + 2;
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
				
				System.out.println("NA distance: " + heuristics.getNADistance());	
				System.out.println("MPC distance: " + heuristics.getMPCDistance());	
				System.out.println("Out degree distance:" + heuristics.getOutDegreeDistance());	
				System.out.println("NodeType :" + heuristics.getNodeTypeDistance());	
				System.out.println("Edge :" + heuristics.edgeTypeDistance);	

//				System.out.println("FinalState :" + heuristics.getNodeTypePercentage("FinalState"));	

				//TODO: the number of activations to be checked should be configurasble
				if(activationIds.size() > 50) {
					activationIds = activationIds.subList(0, 50);
				}
				
				valueMap = sortWithWeight(activationIds, model.getNewElements().size());
				lastState = context.getCurrentStateId();
				while (!isInterrupted && !configuration.progressMonitor.isCancelled() && activationIds.size() > 0) {
					final Object nextActivation = drawWithEpsilonProbabilty(activationIds, valueMap, epsilon, draw);
										
					stateAndActivations.get(context.getCurrentStateId()).add(nextActivation);
					logger.debug("Executing new activation: " + nextActivation);
					context.executeAcitvationId(nextActivation);
					visualiseCurrentState();
					boolean consistencyCheckResult = checkConsistency(currentTrajectoryWithFittness);
					if(consistencyCheckResult == true) { continue mainLoop; }
					
					int currentSize = model.getNewElements().size();
					int targetDiff = targetSize - currentSize;
					
					// does not allow must violations
					if((getNumberOfViolations(mustMatchers) > 0|| getNumberOfViolations(mayMatchers) > targetDiff) && !allowMustViolation) {
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
						metricDistance.getLinearModel().feedData(context.getCurrentStateId(), metricDistance.calculateFeature(nodeSize, violation), calculateCurrentStateValue(nodeSize, violation), lastState);
						double value = calculateCurrentStateValue(nodeSize, violation);
						trajectoryFit.put(nextTrajectoryWithFittness, value);
						trajectoiresToExplore.add(nextTrajectoryWithFittness);
						
						//Currently, just go to the next state without considering the value of trajectory
						currentTrajectoryWithFittness = nextTrajectoryWithFittness;
						continue mainLoop;

//						int compare = objectiveComparatorHelper.compare(currentTrajectoryWithFittness.fitness,
//								nextTrajectoryWithFittness.fitness);
//						if (compare < 0) {
//							logger.debug("Better fitness, moving on: " + nextFitness);
//							currentTrajectoryWithFittness = nextTrajectoryWithFittness;
//							continue mainLoop;
//						} else if (compare == 0) {
//							logger.debug("Equally good fitness, moving on: " + nextFitness);
//							currentTrajectoryWithFittness = nextTrajectoryWithFittness;
//							continue mainLoop;
//						} else {
//							logger.debug("Worse fitness.");
//							currentTrajectoryWithFittness = nextTrajectoryWithFittness;
//							continue mainLoop;
						}
					}
				}
				logger.debug("State is fully traversed.");
				trajectoiresToExplore.remove(currentTrajectoryWithFittness);
				currentTrajectoryWithFittness = null;
				context.backtrack();
//			}
			
			logger.info("Interrupted.");
		}

		/**
		 *
		 * @param activationIds
		 * @return: activation to value map
		 */
		private Map<Object, Double> sortWithWeight(List<Object> activationIds, int factor){
			Map<Object, Double> valueMap = new HashMap<Object, Double>();
			
			// check for next states
			for(Object id : activationIds) {
				context.executeAcitvationId(id);
				int violation = getNumberOfViolations(mayMatchers);
				valueMap.put(id, calculateFutureStateValue(factor, violation));
				context.backtrack();
			}
			
			//remove all the elements having large distance
			activationIds.removeIf(li -> valueMap.get(li) >= 10000);
			Collections.sort(activationIds, Comparator.comparing(li -> valueMap.get(li)));
			return valueMap;
		}
		
		private double calculateFutureStateValue(int step, int violation) {
			double currentValue = calculateCurrentStateValue(step, violation);
			
			if(step > 10 && currentValue < 10000) {
				double[] toPredict = metricDistance.calculateFeature(100, violation);
				try {
					return metricDistance.getLinearModel().getPredictionForNextDataSample(metricDistance.calculateFeature(step, violation), currentValue, toPredict);
				}catch(IllegalArgumentException e) {
					return currentValue;
				}
			}else {
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
					return(100.0 *(g.getNodeTypeDistance()) + 5*(g.getNADistance() + 5*g.getMPCDistance() +g.getOutDegreeDistance()) + consistenceWeights);
				}else {
					return 10*(g.getNodeTypeDistance()) + 5*(g.getNADistance() + g.getMPCDistance() +2*g.getOutDegreeDistance()) + consistenceWeights;
				}

			}else if(configuration.realisticGuidance == RealisticGuidance.Composite_Without_Violations) {
				if(domain == Domain.Yakindumm) {
					return 100.0 *(g.getNodeTypeDistance()) + 5*(g.getNADistance() + g.getMPCDistance() +g.getOutDegreeDistance());
				}else {
					return 10*(g.getNodeTypeDistance()) + 5*(g.getNADistance() + g.getMPCDistance() + 2*g.getOutDegreeDistance());
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
				activationIds = new ArrayList<Object>(context.getCurrentActivationIds());
				if(stateAndActivations.containsKey(context.getCurrentStateId())) {
					activationIds.removeAll(stateAndActivations.get(context.getCurrentStateId()));
				}
				Collections.shuffle(activationIds);
			} catch (NullPointerException e) {
				numberOfStatecoderFail++;
				activationIds = Collections.emptyList();
			}
			return activationIds;
		}

		private void checkForSolution(final Fitness fittness) {
			if (fittness.isSatisifiesHardObjectives()) {
				System.out.println("Solution Found!!");
				System.out.println("# violations: " + (getNumberOfViolations(mustMatchers)));
				if (solutionStoreWithDiversityDescriptor.isDifferent(context)) {
					solutionStoreWithCopy.newSolution(context);
					solutionStoreWithDiversityDescriptor.newSolution(context);
					solutionStore.newSolution(context);
					configuration.progressMonitor.workedModelFound(configuration.solutionScope.numberOfRequiredSolution);

					logger.debug("Found a solution.");
				}
			}
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
			PartialInterpretationVisualiser partialInterpretatioVisualiser = configuration.debugCongiguration.partialInterpretatioVisualiser;
			if(partialInterpretatioVisualiser != null && this.configuration.documentationLevel == DocumentationLevel.FULL && workspace != null) {
				PartialInterpretation p = (PartialInterpretation) (context.getModel());
				int id = ++numberOfPrintedModel;
				if (id % configuration.debugCongiguration.partalInterpretationVisualisationFrequency == 0) {
					PartialInterpretationVisualisation visualisation = partialInterpretatioVisualiser.visualiseConcretization(p);
					visualisation.writeToFile(workspace, String.format("state%09d.png", id));
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
