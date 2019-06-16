package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodOptions
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.viatra.dse.statecode.IStateCoder
import org.eclipse.viatra.dse.statecode.IStateCoderFactory
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.base.api.FeatureListener
import org.eclipse.viatra.query.runtime.base.api.IndexingLevel
import org.eclipse.viatra.query.runtime.base.api.InstanceListener
import org.eclipse.viatra.query.runtime.emf.EMFBaseIndexWrapper
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.Accessors

abstract class AbstractNeighbourhoodBasedStateCoderFactory implements IStateCoderFactory {
	val List<AbstractNeighbourhoodBasedPartialInterpretationStateCoder> statecoders = new LinkedList

	val NeighbourhoodOptions options

	protected new() {
		this(NeighbourhoodOptions.DEFAULT)
	}

	protected new(NeighbourhoodOptions options) {
		this.options = options
	}

	synchronized override createStateCoder() {
		val res = doCreateStateCoder(options)
		statecoders += res
		return res
	}

	protected def AbstractNeighbourhoodBasedPartialInterpretationStateCoder doCreateStateCoder(
		NeighbourhoodOptions options)

	def getSumStatecoderRuntime() {
		statecoders.map[statecoderRuntime].reduce[p1, p2|p1 + p2]
	}
}

abstract class AbstractNeighbourhoodBasedPartialInterpretationStateCoder implements IStateCoder {
	val NeighbourhoodOptions options

	var PartialInterpretation target

	protected new(NeighbourhoodOptions options) {
		this.options = options
	}

	@Accessors(PUBLIC_GETTER) var long statecoderRuntime = 0

	synchronized private def refreshStateCodes() {
		if (refreshNeeded) {
			val startTime = System.nanoTime
			doRefreshStateCodes(target, options)
			statecoderRuntime += (System.nanoTime - startTime)
		}
	}

	protected def boolean isRefreshNeeded()

	protected def void doRefreshStateCodes(PartialInterpretation target, NeighbourhoodOptions options)

	synchronized override createActivationCode(IPatternMatch match) {
		refreshStateCodes
		val startTime = System.nanoTime
		val code = doCreateActivationCode(match)
		statecoderRuntime += (System.nanoTime - startTime)
		code
	}

	protected def Object doCreateActivationCode(IPatternMatch match)

	synchronized override createStateCode() {
		refreshStateCodes
		doCreateStateCode
	}

	protected def Object doCreateStateCode()

	override init(Notifier notifier) {
		this.target = notifier as PartialInterpretation
		val queryEngine = ViatraQueryEngine.on(new EMFScope(notifier))
		val baseIndex = queryEngine.getBaseIndex() as EMFBaseIndexWrapper
		val navigationHelper = baseIndex.getNavigationHelper();

		val classes = PartialinterpretationPackage.eINSTANCE.EClassifiers.filter(EClass).toSet
		val features = classes.map[it.EAllStructuralFeatures].flatten.toSet
		navigationHelper.registerObservedTypes(classes, null, features, IndexingLevel.FULL);

		navigationHelper.addFeatureListener(features, new FeatureListener() {
			override void featureInserted(EObject host, EStructuralFeature feature, Object value) { invalidate }

			override void featureDeleted(EObject host, EStructuralFeature feature, Object value) { invalidate }
		})
		navigationHelper.addInstanceListener(classes, new InstanceListener() {
			override void instanceInserted(EClass clazz, EObject instance) { invalidate }

			override void instanceDeleted(EClass clazz, EObject instance) { invalidate }
		})
	}

	synchronized def invalidate() {
		doInvalidate
	}

	protected def void doInvalidate()

	def protected getFallbackCode(Object o) {
		switch (o) {
			PartialInterpretation,
			LogicProblem:
				null
			PartialRelationInterpretation:
				o.interpretationOf.name
			PartialPrimitiveInterpretation:
				o.class.simpleName.hashCode
			PartialComplexTypeInterpretation:
				o.interpretationOf.name.hashCode
			default:
				throw new UnsupportedOperationException('''Unsupported type: «o.class.simpleName»''')
		}
	}
}
