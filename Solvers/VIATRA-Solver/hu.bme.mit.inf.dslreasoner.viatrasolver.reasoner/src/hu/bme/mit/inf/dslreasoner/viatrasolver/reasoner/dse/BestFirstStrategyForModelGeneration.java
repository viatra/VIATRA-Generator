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
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.objectives.ObjectiveComparatorHelper;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.PartialInterpretation2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;

/**
 * This exploration strategy eventually explorers the whole design space but goes in the most promising directions
 * first, based on the {@link Fitness}.
 * 
 * There are a few parameter to tune such as
 * <ul>
 * <li>maximum depth</li>
 * <li>continue the exploration from a state that satisfies the hard objectives (the default that it will
 * backtrack),</li>
 * <li>whether to continue the exploration from the newly explored state if it is at least equally good than the
 * previous one or only if it is better (default is "at least equally good").</li>
 * </ul>
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class BestFirstStrategyForModelGeneration implements IStrategy {

    private ThreadContext context;
    private SolutionStore solutionStore;
    private SolutionStoreWithCopy solutionStoreWithCopy;
    private SolutionStoreWithDiversityDescriptor solutionStoreWithDiversityDescriptor;
    private int numberOfStatecoderFail=0;

    private int maxDepth = Integer.MAX_VALUE;
    private boolean isInterrupted = false;
    //private boolean backTrackIfSolution = true;
    private boolean onlyBetterFirst = false;

    private PriorityQueue<TrajectoryWithFitness> trajectoiresToExplore;
    private Logger logger = Logger.getLogger(IStrategy.class);

    private static class TrajectoryWithFitness {

        public Object[] trajectory;
        public Fitness fitness;

        public TrajectoryWithFitness(Object[] trajectory, Fitness fitness) {
            super();
            this.trajectory = trajectory;
            this.fitness = fitness;
        }

        @Override
        public String toString() {
            return Arrays.toString(trajectory) + fitness.toString();
        }

    }

    public BestFirstStrategyForModelGeneration(ReasonerWorkspace workspace, LogicReasoner reasoner, LogicSolverConfiguration configuration, DiversityDescriptor descriptor) {
    			this.maxDepth = Integer.MAX_VALUE;
        this.workspace = workspace;
        this.reasoner = reasoner;
        this.configuration = configuration;
        this.solutionStoreWithDiversityDescriptor = new SolutionStoreWithDiversityDescriptor(descriptor);
    }

    @Override
    public void initStrategy(ThreadContext context) {
        this.context = context;
        this.solutionStore = context.getGlobalContext().getSolutionStore();
        this.solutionStoreWithCopy = new SolutionStoreWithCopy();
        
        
        final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();

        Comparator<TrajectoryWithFitness> comparator = new Comparator<BestFirstStrategyForModelGeneration.TrajectoryWithFitness>() {

            @Override
            public int compare(TrajectoryWithFitness o1, TrajectoryWithFitness o2) {
                return objectiveComparatorHelper.compare(o2.fitness, o1.fitness);
            }
        };

        trajectoiresToExplore = new PriorityQueue<TrajectoryWithFitness>(11, comparator);

    }
    
			public SolutionStoreWithCopy getSolutionStoreWithCopy() {
				return solutionStoreWithCopy;
			}
		
			public SolutionStoreWithDiversityDescriptor getSolutionStoreWithDiversityDescriptor() {
				return solutionStoreWithDiversityDescriptor;
			}
		
			public int getNumberOfStatecoderFaiL() {
				return numberOfStatecoderFail;
			}

    @Override
    public void explore() {
        final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();

        boolean globalConstraintsAreSatisfied = context.checkGlobalConstraints();
        if (!globalConstraintsAreSatisfied) {
            logger.info("Global contraint is not satisifed in the first state. Terminate.");
            return;
        }

        final Fitness firstFittness = context.calculateFitness();
        if (firstFittness.isSatisifiesHardObjectives()) {
            context.newSolution();
            logger.info("First state is a solution. Terminate.");
            return;
        }

        if (maxDepth == 0) {
            return;
        }

        final Object[] firstTrajectory = context.getTrajectory().toArray(new Object[0]);
        TrajectoryWithFitness currentTrajectoryWithFittness = new TrajectoryWithFitness(firstTrajectory, firstFittness);
        trajectoiresToExplore.add(currentTrajectoryWithFittness);

        mainLoop: while (!isInterrupted) {

            if (currentTrajectoryWithFittness == null) {
                if (trajectoiresToExplore.isEmpty()) {
                    logger.debug("State space is fully traversed.");
                    return;
                } else {
                    currentTrajectoryWithFittness = selectRandomState();// trajectoiresToExplore.element();
                    if (logger.isDebugEnabled()) {
                        logger.debug("Current trajectory: " + Arrays.toString(context.getTrajectory().toArray()));
                        logger.debug("New trajectory is chosen: " + currentTrajectoryWithFittness);
                    }
//                    context.backtrackUntilRoot();
//                    context.executeTrajectoryWithoutStateCoding(currentTrajectoryWithFittness.trajectory);
                    context.getDesignSpaceManager().executeTrajectoryWithMinimalBacktrackWithoutStateCoding(currentTrajectoryWithFittness.trajectory);
                }
                
            }
            
            List<Object> activationIds;
            try {
            	activationIds = new ArrayList<Object>(context.getUntraversedActivationIds());
            	Collections.shuffle(activationIds);
            } catch (NullPointerException e) {
            	numberOfStatecoderFail++;
            	activationIds = Collections.emptyList();
            }
            
            Iterator<Object> iterator = activationIds.iterator();
            
//            writeCurrentState();
//            boolean consistencyCheckResult = checkConsistency(currentTrajectoryWithFittness);
//            if(consistencyCheckResult == true) {
//            	continue mainLoop;
//            }
            
            while (!isInterrupted && iterator.hasNext()) {
                final Object nextActivation = iterator.next();
                if (!iterator.hasNext()) {
                    logger.debug("Last untraversed activation of the state.");
                    trajectoiresToExplore.remove(currentTrajectoryWithFittness);
                }

                if (logger.isDebugEnabled()) {
                    logger.debug("Executing new activation: " + nextActivation);
                }
                context.executeAcitvationId(nextActivation);

//                writeCurrentState();
                
                if (context.isCurrentStateAlreadyTraversed()) {
                    logger.info("The new state is already visited.");
                    context.backtrack();
                } else if (!context.checkGlobalConstraints()) {
                    logger.debug("Global contraint is not satisifed.");
                    context.backtrack();
                } else {
                    final Fitness nextFitness = context.calculateFitness();
                    if (nextFitness.isSatisifiesHardObjectives()) {
                    	if(solutionStoreWithDiversityDescriptor.isDifferent(context)) {
                            solutionStoreWithCopy.newSolution(context);
                            solutionStoreWithDiversityDescriptor.newSolution(context);
                            solutionStore.newSolution(context);
                            logger.debug("Found a solution.");
                    	}
                    }
                    if (context.getDepth() > maxDepth) {
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
                        if (onlyBetterFirst) {
                            logger.debug("Equally good fitness, backtrack: " + nextFitness);
                            context.backtrack();
                            continue;
                        } else {
                            logger.debug("Equally good fitness, moving on: " + nextFitness);
                            currentTrajectoryWithFittness = nextTrajectoryWithFittness;
                            continue mainLoop;
                        }
                    } else {
                        logger.debug("Worse fitness.");
//                        context.backtrack();
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

    @Override
    public void interruptStrategy() {
        isInterrupted = true;
    }

    Random random = new Random();
    private TrajectoryWithFitness selectRandomState() {
        int randomNumber = random.nextInt(100);
        if(randomNumber < 5) {
            int elements = trajectoiresToExplore.size();
            int randomElementIndex = random.nextInt(elements);
            logger.debug("Randomly backtract to the " + randomElementIndex + " best solution...");
            Iterator<TrajectoryWithFitness> iterator = trajectoiresToExplore.iterator();
            while(randomElementIndex!=0) {
                iterator.next();
                randomElementIndex--;
            }
            TrajectoryWithFitness res = iterator.next();
            if(res == null) {
                return trajectoiresToExplore.element();
            } else {
                return res;
            }
        } else {
            return trajectoiresToExplore.element();
        }
    }

    private PartialInterpretation2Logic partialInterpretation2Logic = new PartialInterpretation2Logic();
    private LogicReasoner reasoner;
    private PartialInterpretation2Gml partialInterpretation2Gml = new PartialInterpretation2Gml();
    private ReasonerWorkspace workspace;
    private LogicSolverConfiguration configuration;
    int numberOfPrintedModel = 0;
    public ModelResult modelResultByTheSolver  = null;
    public void writeCurrentState() {
    	PartialInterpretation p = (PartialInterpretation)(context.getModel());
    	int id= ++numberOfPrintedModel;
    	if(id%100 == 1) {
	    	String text = this.partialInterpretation2Gml.transform(p);
	    	this.workspace.writeText(id+".gml", text);
	    	this.workspace.writeModel(p, id+".partialinterpretation");
	    	logger.debug("State "+id+" is saved.");
    	}
    }
    
//    int numberOfSolverCalls = 0;
//
//		protected boolean checkConsistency(TrajectoryWithFitness t) {
//		if (reasoner != null) {
//			int id = ++numberOfSolverCalls;
//			if (id % 100 == 1) {
//				try {
//					PartialInterpretation interpretation = (PartialInterpretation) (context.getModel());
//					PartialInterpretation copied = EcoreUtil.copy(interpretation);
//					this.partialInterpretation2Logic.transformPartialIntepretation2Logic(copied.getProblem(), copied);
//					LogicProblem newProblem = copied.getProblem();
//				
//					this.configuration.typeScopes.maxNewElements = interpretation.getMaxNewElements();
//					this.configuration.typeScopes.minNewElements = interpretation.getMinNewElements();
//					LogicResult result = reasoner.solve(newProblem, configuration, workspace);
//					if (result instanceof InconsistencyResult) {
//						logger.debug("Solver found an Inconsistency!");
//						removeSubtreeFromQueue(t);
//						return true;
//					} else if (result instanceof ModelResult) {
//						logger.debug("Solver found a model!");
//						solutionStore.newSolution(context);
    
//						modelResultByTheSolver = (ModelResult) result;
//						return true;
//					} else {
//						logger.debug("Failed consistency check.");
//						return false;
//					}
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					return false;
//				}
//			}
//
//		}
//		return false;
//	}
//    
//    protected void removeSubtreeFromQueue(TrajectoryWithFitness t) {
//    	PriorityQueue<TrajectoryWithFitness> previous = this.trajectoiresToExplore;
//    	this.trajectoiresToExplore = new PriorityQueue<>(this.comparator);
//    	for (TrajectoryWithFitness trajectoryWithFitness : previous) {
//    		if(! containsAsSubstring(trajectoryWithFitness.trajectory,t.trajectory)) {
//    			this.trajectoiresToExplore.add(trajectoryWithFitness);
//    		} else {
//    			logger.debug("State has been excluded due to inherent inconsistency");
//    		}
//		}
//    }
//    
//    private boolean containsAsSubstring(Object[] full, Object[] substring) {
//    	if(substring.length > full.length) {
//    		return false;
//    	} else if(substring.length == full.length) {
//    		return Arrays.equals(full, substring);
//    	} else {
//    		Object[] part = Arrays.copyOfRange(full, 0, substring.length);
//    		return Arrays.equals(part, substring);
//    	}
//    }
//    
    
}
