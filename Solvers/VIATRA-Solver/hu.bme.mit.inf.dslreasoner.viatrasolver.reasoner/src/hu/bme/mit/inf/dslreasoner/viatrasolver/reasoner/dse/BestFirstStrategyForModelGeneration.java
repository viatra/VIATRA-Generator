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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;

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
	private SolutionStoreWithCopy solutionStoreWithCopy;
	private SolutionStoreWithDiversityDescriptor solutionStoreWithDiversityDescriptor;
	private volatile boolean isInterrupted = false;
	private ModelResult modelResultByInternalSolver = null;
	private Random random = new Random();
	
	// Statistics
	private int numberOfStatecoderFail = 0;
	private int numberOfPrintedModel = 0;
	private int numberOfSolverCalls = 0;

	public BestFirstStrategyForModelGeneration(
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
		// TODO: visualisation
//		for(IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> p : this.method.getAllPatterns()) {
//			ViatraQueryMatcher<? extends IPatternMatch> matcher = p.getMatcher(engine);
//			matcher.getAllMatches();
//		}
		
		this.solutionStoreWithCopy = new SolutionStoreWithCopy();
		this.solutionStoreWithDiversityDescriptor = new SolutionStoreWithDiversityDescriptor(configuration.diversityRequirement);

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
		if (!context.checkGlobalConstraints()) {
			logger.info("Global contraint is not satisifed in the first state. Terminate.");
			return;
		}
		if (configuration.searchSpaceConstraints.maxDepth == 0) {
			logger.info("Maximal depth is reached in the initial solution. Terminate.");
			return;
		}
		
		final Fitness firstFittness = context.calculateFitness();
		checkForSolution(firstFittness);
		
		final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();
		final Object[] firstTrajectory = context.getTrajectory().toArray(new Object[0]);
		TrajectoryWithFitness currentTrajectoryWithFittness = new TrajectoryWithFitness(firstTrajectory, firstFittness);
		trajectoiresToExplore.add(currentTrajectoryWithFittness);

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
				}
			}
			
//			visualiseCurrentState();
//			boolean consistencyCheckResult = checkConsistency(currentTrajectoryWithFittness);
//			if(consistencyCheckResult == true) {
//				continue mainLoop;
//			}

			List<Object> activationIds = selectActivation();
			Iterator<Object> iterator = activationIds.iterator();

			while (!isInterrupted && !configuration.progressMonitor.isCancelled() && iterator.hasNext()) {
				final Object nextActivation = iterator.next();
//				if (!iterator.hasNext()) {
//					logger.debug("Last untraversed activation of the state.");
//					trajectoiresToExplore.remove(currentTrajectoryWithFittness);
//				}
				logger.debug("Executing new activation: " + nextActivation);
				context.executeAcitvationId(nextActivation);

				visualiseCurrentState();
				boolean consistencyCheckResult = checkConsistency(currentTrajectoryWithFittness);
				if(consistencyCheckResult == true) { continue mainLoop; }

				if (context.isCurrentStateAlreadyTraversed()) {
					logger.info("The new state is already visited.");
					context.backtrack();
				} else if (!context.checkGlobalConstraints()) {
					logger.debug("Global contraint is not satisifed.");
					context.backtrack();
				} else {
					final Fitness nextFitness = context.calculateFitness();
					checkForSolution(nextFitness);
					if (context.getDepth() > configuration.searchSpaceConstraints.maxDepth) {
						logger.debug("Reached max depth.");
						context.backtrack();
						continue;
					}

					TrajectoryWithFitness nextTrajectoryWithFittness = new TrajectoryWithFitness(
							context.getTrajectory().toArray(), nextFitness);
					trajectoiresToExplore.add(nextTrajectoryWithFittness);

					int compare = objectiveComparatorHelper.compare(currentTrajectoryWithFittness.fitness,
							nextTrajectoryWithFittness.fitness);
					if (compare < 0) {
						logger.debug("Better fitness, moving on: " + nextFitness);
						currentTrajectoryWithFittness = nextTrajectoryWithFittness;
						continue mainLoop;
					} else if (compare == 0) {
						logger.debug("Equally good fitness, moving on: " + nextFitness);
						currentTrajectoryWithFittness = nextTrajectoryWithFittness;
						continue mainLoop;
					} else {
						logger.debug("Worse fitness.");
						currentTrajectoryWithFittness = null;
						continue mainLoop;
					}
				}
			}

			logger.debug("State is fully traversed.");
			trajectoiresToExplore.remove(currentTrajectoryWithFittness);
			currentTrajectoryWithFittness = null;

		}
		logger.info("Interrupted.");
	}

	private List<Object> selectActivation() {
		List<Object> activationIds;
		try {
			activationIds = new ArrayList<Object>(context.getUntraversedActivationIds());
			Collections.shuffle(activationIds);
		} catch (NullPointerException e) {
			numberOfStatecoderFail++;
			activationIds = Collections.emptyList();
		}
		return activationIds;
	}

	private void checkForSolution(final Fitness fittness) {
		if (fittness.isSatisifiesHardObjectives()) {
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

	public void visualiseCurrentState() {
		PartialInterpretationVisualiser partialInterpretatioVisualiser = configuration.debugCongiguration.partialInterpretatioVisualiser;
		if(partialInterpretatioVisualiser != null) {
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
