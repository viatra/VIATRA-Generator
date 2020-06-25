/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Andras Szabolcs Nagy - initial API and implementation
 *******************************************************************************/
package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.objectives.ObjectiveComparatorHelper;
import org.eclipse.viatra.dse.solutionstore.ISolutionFoundHandler;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;

import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.PartialInterpretation2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder.NeighbourhoodBasedPartialInterpretationStateCoder;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualiser;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;

/**
 * This exploration strategy eventually explorers the whole design space but
 * goes in the most promising directions first, based on the {@link Fitness}.
 * 
 * There are a few parameter to tune such as
 * <ul>
 * <li>maximum depth</li>
 * <li>continue the exploration from a state that satisfies the hard objectives
 * (the default that it will backtrack),</li>
 * <li>whether to continue the exploration from the newly explored state if it
 * is at least equally good than the previous one or only if it is better
 * (default is "at least equally good").</li>
 * </ul>
 * 
 */
public class BestFirstStrategyForModelGeneration implements IStrategy {
	
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
	private volatile boolean isInterrupted = false;
	private ModelResult modelResultByInternalSolver = null;
	private Random random = new Random();
	//private Collection<ViatraQueryMatcher<? extends IPatternMatch>> matchers;
	public ActivationSelector activationSelector = new EvenActivationSelector(random);
	public ViatraReasonerSolutionSaver solutionSaver;
	public NumericSolver numericSolver;
	// Statistics
	private int numberOfStatecoderFail = 0;
	private int numberOfPrintedModel = 0;
	private int numberOfSolverCalls = 0;
	public long globalConstraintEvaluationTime = 0;
	public long fitnessCalculationTime = 0;
	
	public long explorationStarted = 0;

	public BestFirstStrategyForModelGeneration(
			ReasonerWorkspace workspace,
			ViatraReasonerConfiguration configuration,
			ModelGenerationMethod method,
			ViatraReasonerSolutionSaver solutionSaver,
			NumericSolver numericSolver) {
		this.workspace = workspace;
		this.configuration = configuration;
		this.method = method;
		this.solutionSaver = solutionSaver;
		this.numericSolver = numericSolver;
		//logger.setLevel(Level.DEBUG);
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
		solutionStore.registerSolutionFoundHandler(new ISolutionFoundHandler() {
			
			@Override
			public void solutionTriedToSave(ThreadContext context, SolutionTrajectory trajectory) {
				// Ignore.
			}
			
			@Override
			public void solutionFound(ThreadContext context, SolutionTrajectory trajectory) {
				configuration.progressMonitor.workedModelFound(configuration.solutionScope.numberOfRequiredSolutions);
				saveTimes();
				logger.debug("Found a solution.");
			}
		});
		numericSolver.init(context);
		
//		ViatraQueryEngine engine = context.getQueryEngine();
//		matchers = new LinkedList<ViatraQueryMatcher<? extends IPatternMatch>>();
//		for(IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> p : this.method.getAllPatterns()) {
//			//System.out.println(p.getSimpleName());
//			ViatraQueryMatcher<? extends IPatternMatch> matcher = p.getMatcher(engine);
//			matchers.add(matcher);
//		}
		
		final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();
		this.comparator = new Comparator<TrajectoryWithFitness>() {
			@Override
			public int compare(TrajectoryWithFitness o1, TrajectoryWithFitness o2) {
				return objectiveComparatorHelper.compare(o2.fitness, o1.fitness);
			}
		};

		trajectoiresToExplore = new PriorityQueue<TrajectoryWithFitness>(11, comparator);
	}

	@Override
	public void explore() {
//		System.out.println("press enter");
//		try {
//			new BufferedReader(new InputStreamReader(System.in)).readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.explorationStarted=System.nanoTime();
		if (!checkGlobalConstraints()) {
			logger.info("Global contraint is not satisifed in the first state. Terminate.");
			return;
		} else if(!numericSolver.maySatisfiable()) {
			logger.info("Numeric contraints are not satisifed in the first state. Terminate.");
			return;
		}
		if (configuration.searchSpaceConstraints.maxDepth == 0) {
			logger.info("Maximal depth is reached in the initial solution. Terminate.");
			return;
		}
		
		final Fitness firstFitness = calculateFitness();
		checkForSolution(firstFitness);
		
		final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();
		final Object[] firstTrajectory = context.getTrajectory().toArray(new Object[0]);
		TrajectoryWithFitness currentTrajectoryWithFitness = new TrajectoryWithFitness(firstTrajectory, firstFitness);
		trajectoiresToExplore.add(currentTrajectoryWithFitness);
		//if(configuration)
		visualiseCurrentState();
//		for(ViatraQueryMatcher<? extends IPatternMatch> matcher : matchers) {
//			System.out.println(matcher.getPatternName());
//			System.out.println("---------");
//			for(IPatternMatch m : matcher.getAllMatches()) {
//				System.out.println(m);
//			}
//			System.out.println("---------");
//		}
		
		mainLoop: while (!isInterrupted && !configuration.progressMonitor.isCancelled()) {

			if (currentTrajectoryWithFitness == null) {
				if (trajectoiresToExplore.isEmpty()) {
					logger.debug("State space is fully traversed.");
					return;
				} else {
					currentTrajectoryWithFitness = selectState();
					if (logger.isDebugEnabled()) {
						logger.debug("Current trajectory: " + Arrays.toString(context.getTrajectory().toArray()));
						logger.debug("New trajectory is chosen: " + currentTrajectoryWithFitness);
					}
					context.getDesignSpaceManager().executeTrajectoryWithMinimalBacktrackWithoutStateCoding(currentTrajectoryWithFitness.trajectory);
				}
			}
			
//			visualiseCurrentState();
//			boolean consistencyCheckResult = checkConsistency(currentTrajectoryWithfitness);
//			if(consistencyCheckResult == true) {
//				continue mainLoop;
//			}

			List<Object> activationIds = selectActivation();
			Iterator<Object> iterator = activationIds.iterator();

			while (!isInterrupted && !configuration.progressMonitor.isCancelled() && iterator.hasNext()) {
				final Object nextActivation = iterator.next();
//				if (!iterator.hasNext()) {
//					logger.debug("Last untraversed activation of the state.");
//					trajectoiresToExplore.remove(currentTrajectoryWithfitness);
//				}
				logger.debug("Executing new activation: " + nextActivation);
				context.executeAcitvationId(nextActivation);
				method.getStatistics().incrementDecisionCount();

				visualiseCurrentState();
//				for(ViatraQueryMatcher<? extends IPatternMatch> matcher : matchers) {
//					int c = matcher.countMatches();
//					if(c>=100) {
//						System.out.println(c+ " " +matcher.getPatternName());
//					}
//					
//				}
				
				boolean consistencyCheckResult = checkConsistency(currentTrajectoryWithFitness);
				if(consistencyCheckResult == true) { continue mainLoop; }

				if (context.isCurrentStateAlreadyTraversed()) {
					logger.info("The new state is already visited.");
					context.backtrack();
				} else if (!checkGlobalConstraints()) {
					logger.debug("Global contraint is not satisifed.");
					context.backtrack();
				} else if (!numericSolver.maySatisfiable()) {
					logger.debug("Numeric constraints are not satisifed.");
					context.backtrack();
				} else {
					final Fitness nextFitness = context.calculateFitness();
					checkForSolution(nextFitness);
					if (context.getDepth() > configuration.searchSpaceConstraints.maxDepth) {
						logger.debug("Reached max depth.");
						context.backtrack();
						continue;
					}

					TrajectoryWithFitness nextTrajectoryWithfitness = new TrajectoryWithFitness(
							context.getTrajectory().toArray(), nextFitness);
					trajectoiresToExplore.add(nextTrajectoryWithfitness);

					int compare = objectiveComparatorHelper.compare(currentTrajectoryWithFitness.fitness,
							nextTrajectoryWithfitness.fitness);
					if (compare < 0) {
						logger.debug("Better fitness, moving on: " + nextFitness);
						currentTrajectoryWithFitness = nextTrajectoryWithfitness;
						continue mainLoop;
					} else if (compare == 0) {
						logger.debug("Equally good fitness, moving on: " + nextFitness);
						currentTrajectoryWithFitness = nextTrajectoryWithfitness;
						continue mainLoop;
					} else {
						logger.debug("Worse fitness.");
						currentTrajectoryWithFitness = null;
						continue mainLoop;
					}
				}
			}

			logger.debug("State is fully traversed.");
			trajectoiresToExplore.remove(currentTrajectoryWithFitness);
			currentTrajectoryWithFitness = null;

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
	
	private List<Object> selectActivation() {
		List<Object> activationIds;
		try {
			activationIds = this.activationSelector.randomizeActivationIDs(context.getUntraversedActivationIds());
		} catch (NullPointerException e) {
//			logger.warn("Unexpected state code: " + context.getDesignSpaceManager().getCurrentState());
			numberOfStatecoderFail++;
			activationIds = Collections.emptyList();
		}
		return activationIds;
	}

	private void checkForSolution(final Fitness fittness) {
		solutionStore.newSolution(context);
	}
	
	public List<String> times = new LinkedList<String>();
	private void saveTimes() {
		long statecoderTime = ((NeighbourhoodBasedPartialInterpretationStateCoder<?, ?>)this.context.getStateCoder()).getStatecoderRuntime()/1000000;
		long forwardTime = context.getDesignSpaceManager().getForwardTime()/1000000;
		long backtrackingTime = context.getDesignSpaceManager().getBacktrackingTime()/1000000;
		long activationSelection = this.activationSelector.getRuntime()/1000000;
		long solutionCopierTime = this.solutionSaver.getTotalCopierRuntime()/1000000;
		long numericalSolverSumTime = this.numericSolver.getRuntime()/1000000;
		long numericalSolverProblemForming = this.numericSolver.getSolverSolvingProblem()/1000000;
		long numericalSolverSolving = this.numericSolver.getSolverSolvingProblem()/1000000;
		long numericalSolverInterpreting = this.numericSolver.getSolverSolution()/1000000;
		this.times.add(
			"(TransformationExecutionTime"+method.getStatistics().transformationExecutionTime/1000000+ 
			"|StateCoderTime:"+statecoderTime+
			"|ForwardTime:"+forwardTime+
			"|Backtrackingtime:"+backtrackingTime+
			"|GlobalConstraintEvaluationTime:"+(globalConstraintEvaluationTime/1000000)+
			"|FitnessCalculationTime:"+(fitnessCalculationTime/1000000)+
			"|ActivationSelectionTime:"+activationSelection+
			"|SolutionCopyTime:"+solutionCopierTime+
			"|NumericalSolverSumTime:"+numericalSolverSumTime+
			"|NumericalSolverProblemFormingTime:"+numericalSolverProblemForming+
			"|NumericalSolverSolvingTime:"+numericalSolverSolving+
			"|NumericalSolverInterpretingSolution:"+numericalSolverInterpreting+")");
		
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