/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.dse.base.DseIdPoolHelper;
import org.eclipse.viatra.dse.designspace.api.IBacktrackListener;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.matchers.ViatraQueryRuntimeException;
import org.eclipse.viatra.query.runtime.matchers.util.Preconditions;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

import com.google.common.util.concurrent.UncheckedExecutionException;

/**
 * A SolutionTrajectory represents a trajectory (i.e. sequence of transformation
 * rule applications), which can transform the initial model to a desired state.
 * An instance of this class holds the the actual rule sequence and the
 * corresponding activation codes. Furthermore it can be used to perform the
 * transformation on a given model (if possible).
 * <p>
 * It is also possible to undo the transformation if initialized with an editing
 * domain.
 * <p>
 * The instance of this class can be reused for different models.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class SolutionTrajectory {

	private final List<Object> activationCodes;
	private final List<BatchTransformationRule<?, ?>> transformationRules;
	private final IStateCoderFactory stateCoderFactory;
	private Fitness fitness;
	private Solution solution;

	private ViatraQueryEngine engine;
	private Notifier model;
	private EditingDomain editingDomain;
	private IStateCoder stateCoder;
	private IBacktrackListener listener;

	private int currentIndex;

	public SolutionTrajectory(final List<Object> activationCodes,
			final List<BatchTransformationRule<?, ?>> transformationRules, final IStateCoderFactory stateCoderFactory,
			final IBacktrackListener backtrackListener) {
		Objects.requireNonNull(transformationRules, "Parameter transformationRules cannot be null!");
		Objects.requireNonNull(stateCoderFactory, "Parameter stateCoderFactory cannot be null!");
		Objects.requireNonNull(activationCodes, "Parameter activations cannot be null!");
		Preconditions.checkState(transformationRules.size() == activationCodes.size(),
				"The two List parameters must be the same in size.");

		this.activationCodes = activationCodes;
		this.transformationRules = transformationRules;
		this.stateCoderFactory = stateCoderFactory;
		this.listener = backtrackListener;
		currentIndex = 0;
	}

	/**
	 * Initialize this SolutionTrajectory for transforming the model along the
	 * trajectory.
	 * 
	 * @param model The model.
	 * @throws ViatraQueryRuntimeException If the VIATRA Query fails to initialize.
	 */
	public void setModel(Notifier model) {
		editingDomain = null;
		EMFScope scope = new EMFScope(model);
		this.engine = ViatraQueryEngine.on(scope);
		this.model = model;
		stateCoder = stateCoderFactory.createStateCoder();
		stateCoder.init(model);
		currentIndex = 0;
		DseIdPoolHelper.INSTANCE.disposeByThread();
		DseIdPoolHelper.INSTANCE.registerRules(rule -> {
			int id = 0;
			for (BatchTransformationRule<?, ?> r : transformationRules.subList(0, currentIndex)) {
				if (r.equals(rule)) {
					id++;
				}
			}
			return id;
		}, new HashSet<BatchTransformationRule<?, ?>>(transformationRules));
	}

	/**
	 * Initialize this SolutionTrajectory for transforming the given model along the
	 * trajectory.
	 * <p>
	 * The transformation will be reversible by creating an {@link EditingDomain} on
	 * the model.
	 * 
	 * @param modelRoot The root of the model.
	 * @throws ViatraQueryRuntimeException If the VIATRA Query fails to initialize.
	 */
	public void setModelWithEditingDomain(Notifier modelRoot) {
		setModel(modelRoot);
		editingDomain = EMFHelper.createEditingDomain(model);
	}

	/**
	 * Transforms the given model along the trajectory.
	 * 
	 * @param modelRoot The root of the model.
	 * @throws ViatraQueryRuntimeException If the VIATRA Query fails to initialize.
	 */
	public void doTransformation(Notifier modelRoot) {
		setModel(modelRoot);
		doTransformation();
	}

	/**
	 * Transforms the given model along the trajectory.
	 * <p>
	 * The transformation will be reversible by creating an {@link EditingDomain} on
	 * the model.
	 * 
	 * @param modelRoot The root of the model.
	 * @throws ViatraQueryRuntimeException If the VIATRA Query fails to initialize.
	 */
	public void doTransformationUndoable(Notifier modelRoot) {
		setModelWithEditingDomain(modelRoot);
		doTransformation();
	}

	/**
	 * Transforms the given model along the trajectory. To initialize the model call
	 * the {@link SolutionTrajectory#setModel(Notifier)} method.
	 * 
	 * @throws Exception                   If the activation to fire is not found.
	 *                                     Possible problems: wrong model, bad state
	 *                                     serializer.
	 * @throws ViatraQueryRuntimeException If the VIATRA Query fails to initialize.
	 */
	public void doTransformation() {
		while (doNextTransformation())
			;
	}

	/**
	 * Transforms the given model by one step to the solution (makes one step in the
	 * trajectory). To initialize the model call the
	 * {@link SolutionTrajectory#setModel(Notifier)} method.
	 * 
	 * @throws ViatraQueryRuntimeException
	 */
	public boolean doNextTransformation() {
		if (currentIndex >= activationCodes.size()) {
			return false;
		} else {
			doNextTransformation(currentIndex);
			currentIndex++;
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	private void doNextTransformation(int index) {
		Objects.requireNonNull(model, "The model cannot be null! Use the setModel method.");

		// cast for the ".process(match)" method.
		BatchTransformationRule<?, ?> tr = transformationRules.get(index);
		Object activationCode = activationCodes.get(index);

		ViatraQueryMatcher<?> matcher = tr.getPrecondition().getMatcher(engine);

		boolean isActivationFound = false;
		for (final IPatternMatch match : matcher.getAllMatches()) {
			Object matchHash = stateCoder.createActivationCode(match);
			if (matchHash.equals(activationCode)) {
				@SuppressWarnings("rawtypes")
				final Consumer action = tr.getAction();

				if (editingDomain == null) {
					action.accept(match);
				} else {
					ChangeCommand cc = new ChangeCommand(model) {
						@Override
						protected void doExecute() {
							action.accept(match);
						}
					};
					long start = System.nanoTime();
					try {
						((AdvancedViatraQueryEngine) engine).delayUpdatePropagation(() -> {
							editingDomain.getCommandStack().execute(cc);
							return null;
						});
					} catch (InvocationTargetException e) {
						throw new RuntimeException(e);
					}
					listener.forwardWorked(System.nanoTime() - start);
				}

				isActivationFound = true;
				break;
			}
		}
		if (!isActivationFound) {
			throw new UncheckedExecutionException(
					"Activation was not found for transformation! Possible cause: wrong model, bad state coder. index: "
							+ index + " Activation code: " + activationCode,
					null);
		}
	}

	/**
	 * Call this method to undo the last transformation.
	 * 
	 * @return True, if it was successful.
	 */
	public boolean undoLastTransformation() {
		Objects.requireNonNull(editingDomain, "To be able to undo the transformation initialize with editing domain.");
		long start = System.nanoTime();
		boolean result;
		
		if (currentIndex > 0) {
			try {
				((AdvancedViatraQueryEngine) engine).delayUpdatePropagation(() -> {
					editingDomain.getCommandStack().undo();
					return null;
				});
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
			currentIndex--;
			result = true;
		}
		result = false;
		listener.backtrackWorked(System.nanoTime() - start);
		return result;
	}

	/**
	 * Call this method to undo the transformation.
	 */
	public void undoTransformation() {
		while (undoLastTransformation())
			;
	}

	public List<Object> getActivationCodes() {
		return activationCodes;
	}

	public List<BatchTransformationRule<?, ?>> getTransformationRules() {
		return transformationRules;
	}

	public IStateCoderFactory getStateCoderFactory() {
		return stateCoderFactory;
	}

	public ViatraQueryEngine getEngine() {
		return engine;
	}

	public Notifier getModel() {
		return model;
	}

	public IStateCoder getStateCoder() {
		return stateCoder;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public int getTrajectoryLength() {
		return activationCodes.size();
	}

	public Fitness getFitness() {
		return fitness;
	}

	public void setFitness(Fitness fitness) {
		this.fitness = fitness;
	}

	public String toPrettyString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Fitness: ");
		sb.append(fitness.toString());
		sb.append(" | Trajectory (");
		sb.append(activationCodes.size());
		sb.append("): ");
		for (Object object : activationCodes) {
			sb.append(object.toString());
			sb.append(" | ");
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		return activationCodes.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof SolutionTrajectory) {
			SolutionTrajectory that = (SolutionTrajectory) obj;
			return activationCodes.equals(that.activationCodes);
		}
		return false;
	}

	public Solution getSolution() {
		return solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}
}
