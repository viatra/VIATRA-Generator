/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.designspace.api.IBacktrackListener;
import org.eclipse.viatra.dse.designspace.api.IDesignSpace;
import org.eclipse.viatra.dse.designspace.api.TrajectoryInfo;
import org.eclipse.viatra.dse.objectives.ActivationFitnessProcessor;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.visualizer.IExploreEventHandler;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.transformation.evm.api.Activation;
import org.eclipse.viatra.transformation.evm.api.Context;
import org.eclipse.viatra.transformation.evm.api.resolver.ChangeableConflictSet;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

public class DesignSpaceManager implements IBacktrackListener {

	private final IStateCoder stateCoder;
	private final EditingDomain domain;
	private Notifier model;

	private IDesignSpace designSpace;

	private final TrajectoryInfo trajectory;

	// the occurence vector callback
	private List<IExploreEventHandler> handlers;

	// Dummy context for evm
	private final Context evmContext = Context.create();

	private Logger logger = Logger.getLogger(this.getClass());

	private boolean isNewState = false;
	private Map<BatchTransformationRule<?, ?>, ActivationFitnessProcessor> activationFitnessProcessors;
	private Map<BatchTransformationRule<?, ?>, String> activationFitnessProcessorNames;
	private ThreadContext context;

	private ActivationCodesConflictSet activationCodes;
	private ChangeableConflictSet conflictSet;

	private AdvancedViatraQueryEngine engine;

	private Random random = new Random();

	private long forwardTime = 0;
	private long backtrackingTime = 0;

	public DesignSpaceManager(ThreadContext context) {

		this.context = context;
		model = context.getModel();
		designSpace = context.getGlobalContext().getDesignSpace();
		domain = context.getEditingDomain();

		conflictSet = context.getConflictResolver().getLastCreatedConflictSet();

		stateCoder = context.getStateCoder();
		Object initialStateId = stateCoder.createStateCode();
		designSpace.addState(null, null, initialStateId);

		activationCodes = context.getActivationCodesConflictSet();

		engine = (AdvancedViatraQueryEngine) context.getQueryEngine();

		this.trajectory = new TrajectoryInfo(initialStateId);

		logger.debug("DesignSpaceManager initialized with initial model: " + initialStateId);
	}

	public void fireActivation(final Object transition) {
		if (fireActivationSilent(transition)) {
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(
				"A retrieved Transition SHOULD have a matching Activation. Possible causes: the state serializer is faulty; the algorithm choosed a wrong Transition.");
		sb.append("\nSought transition: ");
		sb.append(transition);
		Object currentStateId = getCurrentState();
		sb.append("\nCurrent known state: ");
		sb.append(currentStateId);
		Object actualStateId = stateCoder.createStateCode();
		sb.append("\nActual state: ");
		sb.append((actualStateId.equals(currentStateId) ? "same as current" : actualStateId));
		sb.append("\n");
		sb.append(trajectory);
		sb.append("\nAvailable transitions:");
		for (Activation<?> act : conflictSet.getNextActivations()) {
			IPatternMatch match = (IPatternMatch) act.getAtom();
			Object code = generateMatchCode(match);
			sb.append("\n\t");
			sb.append(code);
		}

		throw new DSEException(sb.toString());
	}

	public boolean tryFireActivation(final Object transition) {
		return fireActivationSilent(transition);
	}

	private boolean fireActivationSilent(final Object transition) {
		final Activation<?> activation = getActivationById(transition);

		if (activation == null) {
			return false;
		}

		BatchTransformationRule<?, ?> rule = getRuleByActivation(activation);

		Map<String, Double> measureCosts = new HashMap<String, Double>();
		if (activationFitnessProcessors != null && activationFitnessProcessors.containsKey(rule)) {
			IPatternMatch match = (IPatternMatch) activation.getAtom();
			ActivationFitnessProcessor processor = activationFitnessProcessors.get(rule);
			double fitness = processor.process(match);
			measureCosts.put(activationFitnessProcessorNames.get(rule), fitness);
		}

		ChangeCommand rc = new ChangeCommand(model) {
			@Override
			protected void doExecute() {
				activation.fire(evmContext);
			}
		};

		Object previousState = trajectory.getCurrentStateId();

		long start = System.nanoTime();
		try {
			engine.delayUpdatePropagation(() -> {
				domain.getCommandStack().execute(rc);
				return null;
			});
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		forwardTime += System.nanoTime() - start;

		Object newStateId = stateCoder.createStateCode();
		updateActivationCodes();

		if (designSpace != null) {
			isNewState = !designSpace.isTraversed(newStateId);
			designSpace.addState(previousState, transition, newStateId);
		}

		trajectory.addStep(transition, rule, newStateId, measureCosts);

		if (handlers != null) {
			for (IExploreEventHandler iExploreEventHandler : handlers) {
				iExploreEventHandler.transitionFired(transition);
			}
		}

		logger.debug("Executed activation: " + transition);/*
															 * + " from state: " + previousState + " to " + newStateId);
															 */

		return true;
	}

	public boolean executeRandomActivationId() {
		Collection<Object> transitions = getTransitionsFromCurrentState();
		int size = transitions.size();
		if (size == 0) {
			return false;
		}

		int index = random.nextInt(size);
		Iterator<Object> iterator = transitions.iterator();
		for (int i = 0; i < index; ++i) {
			iterator.next();
		}
		Object transition = iterator.next();

		fireActivation(transition);
		return true;
	}

	public int executeTrajectory(Object[] trajectoryToExecute) {
		return executeTrajectory(trajectoryToExecute, 0, trajectoryToExecute.length, false, true);
	}

	public int executeTrajectory(Object[] trajectoryToExecute, int fromIncludedIndex, int toExcludedIndex) {
		return executeTrajectory(trajectoryToExecute, fromIncludedIndex, toExcludedIndex, false, true);
	}

	public int executeTrajectoryByTrying(Object[] trajectoryToExecute) {
		return executeTrajectory(trajectoryToExecute, 0, trajectoryToExecute.length, true, true);
	}

	public int executeTrajectoryByTrying(Object[] trajectoryToExecute, int fromIncludedIndex, int toExcludedIndex) {
		return executeTrajectory(trajectoryToExecute, fromIncludedIndex, toExcludedIndex, true, true);
	}

	public int executeTrajectoryWithoutStateCoding(Object[] trajectoryToExecute) {
		return executeTrajectory(trajectoryToExecute, 0, trajectoryToExecute.length, false, false);
	}

	public int executeTrajectoryWithoutStateCoding(Object[] trajectoryToExecute, int fromIncludedIndex,
			int toExcludedIndex) {
		return executeTrajectory(trajectoryToExecute, fromIncludedIndex, toExcludedIndex, false, false);
	}

	public int executeTrajectoryByTryingWithoutStateCoding(Object[] trajectoryToExecute) {
		return executeTrajectory(trajectoryToExecute, 0, trajectoryToExecute.length, true, false);
	}

	public int executeTrajectoryByTryingWithoutStateCoding(Object[] trajectoryToExecute, int fromIncludedIndex,
			int toExcludedIndex) {
		return executeTrajectory(trajectoryToExecute, fromIncludedIndex, toExcludedIndex, true, false);
	}

	private int executeTrajectory(Object[] trajectoryToExecute, int fromIncludedIndex, int toExcludedIndex,
			boolean tryAllActivations, boolean createStateCode) {
		logger.debug("Executing trajectory.");
		int unsuccesfulIndex = -1;
		if (tryAllActivations) {
			unsuccesfulIndex = 0;
		}
		for (int i = fromIncludedIndex; i < toExcludedIndex; i++) {
			Object activationId = trajectoryToExecute[i];
			final Activation<?> activation = getActivationById(activationId);

			if (activation == null) {
				logger.debug("Couldn't execute activation: " + activationId);
				if (tryAllActivations) {
					unsuccesfulIndex++;
					continue;
				} else {
					unsuccesfulIndex = i;
					logger.debug("Trajectory execution stopped at index " + i + "/" + trajectoryToExecute.length);
					break;
				}
			}

			BatchTransformationRule<?, ?> rule = getRuleByActivation(activation);

			Map<String, Double> measureCosts = new HashMap<String, Double>();
			if (activationFitnessProcessors != null && activationFitnessProcessors.containsKey(rule)) {
				IPatternMatch match = (IPatternMatch) activation.getAtom();
				ActivationFitnessProcessor processor = activationFitnessProcessors.get(rule);
				double fitness = processor.process(match);
				measureCosts.put(activationFitnessProcessorNames.get(rule), fitness);
			}

			ChangeCommand rc = new ChangeCommand(model) {
				@Override
				protected void doExecute() {
					activation.fire(evmContext);
				}
			};
			
			long start = System.nanoTime();
			try {
				engine.delayUpdatePropagation(() -> {
					domain.getCommandStack().execute(rc);
					return null;
				});
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
			forwardTime += System.nanoTime() - start;

			Object newStateId = null;
			if (createStateCode) {
				newStateId = stateCoder.createStateCode();
			}
			updateActivationCodes();

			trajectory.addStep(activationId, rule, newStateId, measureCosts);

			logger.debug("Activation executed: " + activationId);
		}
		if (!createStateCode) {
			trajectory.modifyLastStateCode(stateCoder.createStateCode());
		}
		logger.debug("Trajectory execution finished.");
		return unsuccesfulIndex;

	}

	public Object getTransitionByActivation(Activation<?> activation) {
		return activationCodes.getActivationId(activation);
	}

	public Activation<?> getActivationById(Object activationId) {
		return activationCodes.getActivation(activationId);
	}

	public BatchTransformationRule<?, ?> getRuleByActivation(Activation<?> activation) {
		return context.getGlobalContext().getSpecificationRuleMap().get(activation.getInstance().getSpecification());
	}

	public BatchTransformationRule<?, ?> getRuleByActivationId(Object activationId) {
		return getRuleByActivation(getActivationById(activationId));
	}

	/**
	 * Returns true if the given state is not owned by this crawler.
	 * 
	 **/
	public boolean isNewModelStateAlreadyTraversed() {
		return !isNewState;
	}

	public List<Object> getTrajectoryFromRoot() {
		return trajectory.getTrajectory();
	}

	public Collection<Object> getTransitionsFromCurrentState() {
		return activationCodes.getCurrentActivationCodes();
	}

	public Collection<Object> getUntraversedTransitionsFromCurrentState() {
		if (designSpace == null) {
			throw new DSEException("Unsupported without a design space");
		}
		Object currentState = trajectory.getCurrentStateId();
		Collection<Object> traversedIds = designSpace.getActivationIds(currentState);

		List<Object> untraversedTransitions = new ArrayList<>();
		for (Object activationId : activationCodes.getCurrentActivationCodes()) {
			if (!traversedIds.contains(activationId)) {
				untraversedTransitions.add(activationId);
			}
		}

		return untraversedTransitions;
	}

	public boolean undoLastTransformation() {

		if (!trajectory.canStepBack()) {
			return false;
		}

		long start = System.nanoTime();
		try {
			engine.delayUpdatePropagation(() -> {
				domain.getCommandStack().undo();
				return null;
			});
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		backtrackingTime += System.nanoTime() - start;
		updateActivationCodes();

		Object lastActivationId = trajectory.getLastActivationId();

		trajectory.backtrack();

		if (handlers != null) {
			for (IExploreEventHandler iExploreEventHandler : handlers) {
				iExploreEventHandler.undo(lastActivationId);
			}
		}

		logger.debug("Backtrack.");

		return true;
	}

	public void backtrackXTimes(int steps) {
		long start = System.nanoTime();
		try {
			engine.delayUpdatePropagation(() -> {
				for (int i = steps; i > 0; i--) {
					domain.getCommandStack().undo();
					trajectory.backtrack();
				}
				return null;
			});
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		backtrackingTime += System.nanoTime() - start;
		updateActivationCodes();
		logger.debug("Backtracked " + steps + " times.");
	}

	public int backtrackUntilLastCommonActivation(Object[] newTrajectory) {
		long start = System.nanoTime();
		Iterator<Object> currentTrajectoryIterator = trajectory.getTrajectory().iterator();
		if (!currentTrajectoryIterator.hasNext()) {
			return 0;
		}
		int indexOfLastCommonActivation = 0;
		for (Object activationCode : newTrajectory) {
			if (currentTrajectoryIterator.hasNext()) {
				Object activationCodeFromCurrent = currentTrajectoryIterator.next();
				if (activationCodeFromCurrent.equals(activationCode)) {
					indexOfLastCommonActivation++;
				} else {
					break;
				}
			} else {
				// current trajectory is smaller
				break;
			}
		}
		int numberOfBacktracks = trajectory.getDepth() - indexOfLastCommonActivation;
		if (numberOfBacktracks > 0) {
			try {
				engine.delayUpdatePropagation(() -> {
					for (int i = numberOfBacktracks; i > 0; i--) {
						domain.getCommandStack().undo();
						trajectory.backtrack();
					}
					return null;
				});
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		}
		backtrackingTime += System.nanoTime() - start;
		updateActivationCodes();
		logger.debug("Backtracked " + numberOfBacktracks + " times.");
		return indexOfLastCommonActivation;
	}

	public void executeTrajectoryWithMinimalBacktrack(Object[] trajectory) {
		executeTrajectoryWithMinimalBacktrack(trajectory, trajectory.length);
	}

	public void executeTrajectoryWithMinimalBacktrack(Object[] trajectory, int toExcludedIndex) {
		int fromIndex = backtrackUntilLastCommonActivation(trajectory);
		executeTrajectory(trajectory, fromIndex, toExcludedIndex, false, true);
	}

	public void executeTrajectoryWithMinimalBacktrackWithoutStateCoding(Object[] trajectory) {
		executeTrajectoryWithMinimalBacktrackWithoutStateCoding(trajectory, trajectory.length);
	}

	public void executeTrajectoryWithMinimalBacktrackWithoutStateCoding(Object[] trajectory, int toExcludedIndex) {
		int fromIndex = backtrackUntilLastCommonActivation(trajectory);
		executeTrajectory(trajectory, fromIndex, toExcludedIndex, false, false);
		Object stateCode = stateCoder.createStateCode();
		this.trajectory.modifyLastStateCode(stateCode);
	}

	public void undoUntilRoot() {
		long start = System.nanoTime();
		try {
			engine.delayUpdatePropagation(() -> {
				while (trajectory.canStepBack()) {
					domain.getCommandStack().undo();
					trajectory.backtrack();
				}
				return null;
			});
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		backtrackingTime += System.nanoTime() - start;
		updateActivationCodes();
		logger.debug("Backtracked to root.");
	}

	private Object generateMatchCode(IPatternMatch match) {
		return stateCoder.createActivationCode(match);
	}

	public Object getCurrentState() {
		return trajectory.getCurrentStateId();
	}

	public SolutionTrajectory createSolutionTrajectroy() {
		return trajectory.createSolutionTrajectory(context.getGlobalContext().getStateCoderFactory(), this);
	}

	public TrajectoryInfo getTrajectoryInfo() {
		return trajectory;
	}

	public void setDesignSpace(IDesignSpace designSpace) {
		this.designSpace = designSpace;
	}

	public IDesignSpace getDesignSpace() {
		return designSpace;
	}

	public void registerExploreEventHandler(IExploreEventHandler handler) {
		if (handler == null) {
			return;
		}
		if (handlers == null) {
			handlers = new ArrayList<IExploreEventHandler>();
		}
		handlers.add(handler);
	}

	public void deregisterExploreEventHandler(IExploreEventHandler handler) {
		if (handler == null) {
			return;
		}
		if (handlers != null) {
			handlers.remove(handler);
		}
	}

	public void registerActivationCostProcessor(String name, BatchTransformationRule<?, ?> rule,
			ActivationFitnessProcessor activationFitnessProcessor) {
		if (activationFitnessProcessors == null || activationFitnessProcessorNames == null) {
			activationFitnessProcessors = new HashMap<BatchTransformationRule<?, ?>, ActivationFitnessProcessor>();
			activationFitnessProcessorNames = new HashMap<BatchTransformationRule<?, ?>, String>();
		}
		activationFitnessProcessors.put(rule, activationFitnessProcessor);
		activationFitnessProcessorNames.put(rule, name);
	}

	public boolean isCurentStateInTrajectory() {
		Object currentStateId = trajectory.getCurrentStateId();
		List<Object> stateTrajectory = trajectory.getStateTrajectory();
		int size = stateTrajectory.size();
		for (int i = 0; i < size - 1; i++) {
			Object stateId = stateTrajectory.get(i);
			if (currentStateId.equals(stateId)) {
				return true;
			}
		}
		return false;
	}

	public IStateCoder getStateCoder() {
		return stateCoder;
	}

	private void updateActivationCodes() {
		activationCodes.updateActivationCodes();
	}
	
	public long getForwardTime() {
		return forwardTime;
	}

	public long getBacktrackingTime() {
		return backtrackingTime;
	}
	
	@Override
	public void forwardWorked(long nanos) {
		forwardTime += nanos;
	}

	@Override
	public void backtrackWorked(long nanos) {
		backtrackingTime += nanos;
	}
}
