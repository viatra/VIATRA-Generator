package modes3.run

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import hu.bme.mit.inf.dslreasoner.ecore2logic.EReferenceMapper_RelationsOverTypes_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsFactory
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorConstraints
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveElementConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.PartialModelAsLogicInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveKind
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.List
import modes3.Modes3Factory
import modes3.Modes3Package
import modes3.queries.CloseTrains_step_2
import modes3.queries.CloseTrains_step_3
import modes3.queries.CloseTrains_step_4
import modes3.queries.CloseTrains_step_5
import modes3.queries.CloseTrains_step_6
import modes3.queries.CloseTrains_step_7
import modes3.queries.EndOfSiding_step_2
import modes3.queries.EndOfSiding_step_3
import modes3.queries.EndOfSiding_step_4
import modes3.queries.EndOfSiding_step_5
import modes3.queries.MisalignedTurnout_step_2
import modes3.queries.MisalignedTurnout_step_3
import modes3.queries.MisalignedTurnout_step_4
import modes3.queries.MisalignedTurnout_step_5
import modes3.queries.Modes3Queries
import modes3.queries.TrainLocations_step_2
import modes3.queries.TrainLocations_step_3
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class Modes3ModelGenerator {
	val MonitoringQuery monitoringQuery
	val int modelSize

	val ecore2Logic = new Ecore2Logic
	val instanceModel2Logic = new InstanceModel2Logic
	val viatra2Logic = new Viatra2Logic(ecore2Logic)
	val solver = new ViatraReasoner
	extension val LogicProblemBuilder = new LogicProblemBuilder

	def generate() {
		val metamodel = createMetamodelDescriptor()
		val metamodelLogic = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration)
		val segment = ecore2Logic.TypeofEClass(metamodelLogic.trace, Modes3Package.eINSTANCE.segment)
		val connectedTo = ecore2Logic.relationOfReference(metamodelLogic.trace,
			Modes3Package.eINSTANCE.segment_ConnectedTo)
		val connectedToIndicator = (metamodelLogic.trace.
			referenceMapperTrace as EReferenceMapper_RelationsOverTypes_Trace).indicators.get(
			Modes3Package.eINSTANCE.segment_ConnectedTo)
		val inverseAssertion = Assertion(
			'''oppositeReference «connectedTo.name» «connectedTo.name»''',
			Forall[
				val src = addVar('''src''', segment)
				val trg = addVar('''trg''', segment)
				connectedToIndicator.call(src, trg) <=> connectedToIndicator.call(trg, src)
			]
		)
		metamodelLogic.output.assertions += inverseAssertion
		val inverseAnnotation = Ecore2logicannotationsFactory.eINSTANCE.createInverseRelationAssertion => [
			target = inverseAssertion
			inverseA = connectedTo
			inverseB = connectedTo
		]
		metamodelLogic.output.annotations += inverseAnnotation
		val initialModel = loadInitialModel()
		val initialModelLogic = instanceModel2Logic.transform(metamodelLogic, initialModel)
		val queries = loadQueries
		val logic = viatra2Logic.transformQueries(queries, initialModelLogic, new Viatra2LogicConfiguration)
		val config = new ViatraReasonerConfiguration => [
			runtimeLimit = 3600
			typeScopes => [
				minNewElements = modelSize
				maxNewElements = modelSize
				minNewElementsByType => [
//					put(ecore2Logic.TypeofEClass(metamodelLogic.trace, Modes3Package.eINSTANCE.train), modelSize / 5)
//					put(ecore2Logic.TypeofEClass(metamodelLogic.trace, Modes3Package.eINSTANCE.turnout), modelSize / 5)
//					put(ecore2Logic.TypeofEClass(metamodelLogic.trace, Modes3Package.eINSTANCE.simpleSegment), 3 * modelSize / 5)
				]
				maxNewElementsByType => [
					put(ecore2Logic.TypeofEClass(metamodelLogic.trace, Modes3Package.eINSTANCE.train), modelSize / 5)
					put(ecore2Logic.TypeofEClass(metamodelLogic.trace, Modes3Package.eINSTANCE.turnout), modelSize / 5)
					put(ecore2Logic.TypeofEClass(metamodelLogic.trace, Modes3Package.eINSTANCE.simpleSegment), 3 * modelSize / 5)
				]
			]
			solutionScope => [
				numberOfRequiredSolutions = 1
			]
			costObjectives += getObjective(ecore2Logic, metamodelLogic.trace)
			scopeWeight = 6
			nameNewElements = false
			typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis
			stateCoderStrategy = StateCoderStrategy.PairwiseNeighbourhood
			scopePropagatorStrategy = new ScopePropagatorStrategy.Polyhedral(
				PolyhedralScopePropagatorConstraints.Relational, PolyhedralScopePropagatorSolver.Clp)
			hints += new Modes3TypeScopeHint(ecore2Logic, metamodelLogic.trace)
			unitPropagationPatternGenerators += new Modes3UnitPropagationGenerator(ecore2Logic, metamodelLogic.trace)
			debugConfiguration => [
				partialInterpretatioVisualiser = new GraphvizVisualiser
//				partalInterpretationVisualisationFrequency = 50
			]
			documentationLevel = DocumentationLevel.NORMAL
		]
		val workspace = new FileSystemWorkspace("output/", "")
		workspace.writeModel(logic.output, "problem.logicproblem")
		val solution = solver.solve(logic.output, config, workspace)
		if (solution instanceof ModelResult) {
			println("Saving generated solutions")
			val logic2Ecore = new Logic2Ecore(ecore2Logic)
			val interpretations = solver.getInterpretations(solution)
			for (representationIndex : 0 ..< interpretations.size) {
				val interpretation = interpretations.get(representationIndex)
				val representationNumber = representationIndex + 1
				if (interpretation instanceof PartialModelAsLogicInterpretation) {
					val representation = interpretation.partialInterpretation
					workspace.writeModel(representation, '''solution«representationNumber».partialinterpretation''')
					val partialInterpretation2GML = new PartialInterpretation2Gml
					val gml = partialInterpretation2GML.transform(representation)
					workspace.writeText('''solution«representationNumber».gml''', gml)
					val model = logic2Ecore.transformInterpretation(interpretation, metamodelLogic.trace)
					val iterator = model.eAllContents
					var int id = 0
					while (iterator.hasNext) {
						val obj = iterator.next
						val idFeature = obj.eClass.EAllAttributes.findFirst[name == 'id']
						if (idFeature !== null) {
							obj.eSet(idFeature, id)
							id++
						}
					}
					workspace.writeModel(model, '''solution«representationNumber».modes3''')
					if (representation.newElements.size < 160) {
						val rootType = (representation.problem.types.findFirst [
							name == "Modes3ModelRoot class DefinedPart"
						] as TypeDefinition)
						val rootIntepretation = representation.partialtypeinterpratation.filter(
							PartialComplexTypeInterpretation).findFirst [
							interpretationOf.name == "Modes3ModelRoot class"
						]
						rootIntepretation.elements.removeAll(rootType.elements)
						representation.problem.elements.removeAll(rootType.elements)
						for (relationInterpretation : representation.partialrelationinterpretation) {
							relationInterpretation.relationlinks.removeIf [ link |
								if (link instanceof BinaryElementRelationLink) {
									rootType.elements.contains(link.param1) ||
										rootType.elements.contains(link.param2)
								} else {
									false
								}
							]
						}
						rootType.elements.clear
						val visualiser = new GraphvizVisualiser
						val visualisation = visualiser.visualiseConcretization(representation)
						visualisation.writeToFile(workspace, '''solution«representationNumber».png''')
					}
				} else {
					workspace.writeText('''solution«representationNumber».txt''', interpretation.toString)
				}
			}
		} else {
			println("Failed to solve problem")
			val partial = logic.output
			workspace.writeModel(partial, "solution.partialinterpretation")
		}
	}

	static def createMetamodelDescriptor() {
		val eClasses = ImmutableList.copyOf(Modes3Package.eINSTANCE.EClassifiers.filter(EClass))
		new EcoreMetamodelDescriptor(
			eClasses,
			emptySet,
			false,
			emptyList,
			emptyList,
			ImmutableList.copyOf(eClasses.flatMap[EReferences]),
			emptyList
		)
	}

	static def List<EObject> loadInitialModel() {
		#[Modes3Factory.eINSTANCE.createModes3ModelRoot]
	}

	def loadQueries() {
		val patternsBuilder = ImmutableList.builder
		patternsBuilder.addAll(Modes3Queries.instance.specifications)
		val patterns = patternsBuilder.build
		val validationPatterns = ImmutableSet.copyOf(patterns.filter [ pattern |
			pattern.allAnnotations.exists[name == "Constraint"]
		])
		new ViatraQuerySetDescriptor(
			patterns,
			validationPatterns,
			emptyMap
		)
	}

	def getObjective(Ecore2Logic ecore2Logic, Ecore2Logic_Trace ecore2LogicTrace) {
		new CostObjectiveConfiguration => [
			switch (monitoringQuery) {
				case closeTrains: {
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = CloseTrains_step_2.instance.fullyQualifiedName
						weight = 14 + 53 + 11
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = CloseTrains_step_3.instance.fullyQualifiedName
						weight = 21 + 14
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = CloseTrains_step_4.instance.fullyQualifiedName
						weight = 14 + 44 + 14 + 9
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = CloseTrains_step_5.instance.fullyQualifiedName
						weight = 14 + 41 + 11
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = CloseTrains_step_6.instance.fullyQualifiedName
						weight = 27
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = CloseTrains_step_7.instance.fullyQualifiedName
						weight = 48
					]
					hint = new CloseTrainsObjectiveHint(ecore2Logic, ecore2LogicTrace)
				}
				case trainLocations: {
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = TrainLocations_step_2.instance.fullyQualifiedName
						weight = 14 + 53 + 11
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = TrainLocations_step_3.instance.fullyQualifiedName
						weight = 48
					]
					hint = new TrainLocationsObjectiveHint(ecore2Logic, ecore2LogicTrace)
				}
				case misalignedTurnout: {
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = MisalignedTurnout_step_2.instance.fullyQualifiedName
						weight = 14 + 53 + 11
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = MisalignedTurnout_step_3.instance.fullyQualifiedName
						weight = 108
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = MisalignedTurnout_step_4.instance.fullyQualifiedName
						weight = 27
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = MisalignedTurnout_step_5.instance.fullyQualifiedName
						weight = 48
					]
					hint = new MisalignedTurnoutObjectiveHint(ecore2Logic, ecore2LogicTrace)
				}
				case endOfSiding: {
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = EndOfSiding_step_2.instance.fullyQualifiedName
						weight = 14 + 53 + 11
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = EndOfSiding_step_3.instance.fullyQualifiedName
						weight = 21 + 14
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = EndOfSiding_step_4.instance.fullyQualifiedName
						weight = 14 + 35 + 21 + 15 + 14 + 21 + 15 + 11
					]
					elements += new CostObjectiveElementConfiguration => [
						patternQualifiedName = EndOfSiding_step_5.instance.fullyQualifiedName
						weight = 48
					]
					hint = new EndOfSidingObjectiveHint(ecore2Logic, ecore2LogicTrace)
				}
				default:
					throw new IllegalArgumentException("Unknown monitoring query: " + monitoringQuery)
			}
			kind = ObjectiveKind.HIGHER_IS_BETTER
			threshold = ObjectiveThreshold.NO_THRESHOLD
			findExtremum = true
		]
	}

	def static init() {
		EMFPatternLanguageStandaloneSetup.doSetup
		ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE,
			LocalSearchEMFBackendFactory.INSTANCE)
		LogiclanguagePackage.eINSTANCE.class
		LogicproblemPackage.eINSTANCE.class
		PartialinterpretationPackage.eINSTANCE.class
		Ecore2logicannotationsPackage.eINSTANCE.class
		Viatra2LogicAnnotationsPackage.eINSTANCE.class
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
	}

	def static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Usage: <query> <model size>")
		}
		val monitoringQuery = MonitoringQuery.valueOf(args.get(0))
		val modelSize = Integer.parseInt(args.get(1))
		init()
		val generator = new Modes3ModelGenerator(monitoringQuery, modelSize)
		generator.generate()
	}

	private static enum MonitoringQuery {
		closeTrains,
		trainLocations,
		endOfSiding,
		misalignedTurnout
	}
}
