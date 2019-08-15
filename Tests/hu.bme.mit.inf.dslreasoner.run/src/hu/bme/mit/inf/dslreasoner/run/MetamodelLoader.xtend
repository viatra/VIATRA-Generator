package hu.bme.mit.inf.dslreasoner.run

import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Ecore
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.FileSystem
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SatelliteQueriesAll
import hu.bme.mit.inf.dslreasoner.domains.transima.fam.FamPatterns
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.partialsnapshot_mavo.yakindu.Patterns
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeConstraintHint
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ModelGenerationMethodBasedGlobalConstraint
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.Collection
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.xbase.lib.Functions.Function1
import satellite.SatellitePackage

@Data
class TypeQuantiles {
	double low
	double high
}

abstract class MetamodelLoader {
	protected val ReasonerWorkspace workspace

	new(ReasonerWorkspace workspace) {
		this.workspace = workspace
	}

	def EcoreMetamodelDescriptor loadMetamodel()

	def Set<EClass> getRelevantTypes(EcoreMetamodelDescriptor descriptor)

	def Set<EReference> getRelevantReferences(EcoreMetamodelDescriptor descriptor)

	def ViatraQuerySetDescriptor loadQueries(EcoreMetamodelDescriptor metamodel)

	def List<EObject> loadPartialModel()

	def List<Function1<ModelGenerationMethod, ModelGenerationMethodBasedGlobalConstraint>> additionalConstraints()

	def Map<String, TypeQuantiles> getTypeQuantiles() {
		emptyMap
	}

	def List<LinearTypeConstraintHint> getHints(Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		emptyList
	}

	def <T> filterByNames(Iterable<T> collection, Function1<T, String> nameExtractor,
		Collection<String> requiredNames) {
		val res = collection.filter[requiredNames.contains(nameExtractor.apply(it))]
		if(res.size != requiredNames.size) throw new IllegalArgumentException
		return res.toSet
	}
}

class FAMLoader extends MetamodelLoader {

	new(ReasonerWorkspace workspace) {
		super(workspace)
	}

	override loadMetamodel() {
		val package = FunctionalarchitecturePackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.filter[name != "type" && name != "model"].
			toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	override getRelevantTypes(EcoreMetamodelDescriptor descriptor) {
		return descriptor.classes.filterByNames([it.name], #["FunctionalElement"])
	}

	override getRelevantReferences(EcoreMetamodelDescriptor descriptor) {
		return descriptor.references.filterByNames([it.name], #["subElements"])
	}

	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val i = FamPatterns.instance
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
//		derivedFeatures.put(Type.instance,metamodel.attributes.filter[it.name == "type"].head)
//		derivedFeatures.put(Model.instance,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}

	override loadPartialModel() {
		this.workspace.readModel(EObject, "FAM.xmi").eResource.allContents.toList
	}

	override additionalConstraints() { #[] }
}

class YakinduLoader extends MetamodelLoader {

	var useSynchronization = true;
	var useComplexStates = false;
	public static val patternsWithSynchronization = #["synchHasNoOutgoing", "synchHasNoIncoming",
		"SynchronizedIncomingInSameRegion", "SynchronizedIncomingInSameRegionHelper1",
		"SynchronizedIncomingInSameRegionHelper2", "notSynchronizingStates", "hasMultipleOutgoingTrainsition",
		"hasMultipleIncomingTrainsition", "SynchronizedRegionsAreNotSiblings",
		"SynchronizedRegionsAreNotSiblingsHelper1", "SynchronizedRegionsAreNotSiblingsHelper2",
		"SynchronizedRegionDoesNotHaveMultipleRegions", "synchThree", "twoSynch", "noSynch2", "synch", "noSynch4",
		"noSynch3", "noSynch"]
	public static val patternsWithComplexStates = #["outgoingFromExit", "outgoingFromFinal", "choiceHasNoOutgoing",
		"choiceHasNoIncoming"]

	new(ReasonerWorkspace workspace) {
		super(workspace)
		YakindummPackage.eINSTANCE.eClass
	}

	def setUseSynchronization(boolean useSynchronization) {
		this.useSynchronization = useSynchronization
	}

	def setUseComplexStates(boolean useComplexStates) {
		this.useComplexStates = useComplexStates
	}

	override loadMetamodel() {
		val useSynchInThisLoad = this.useSynchronization
		val useComplexStates = this.useComplexStates

		val package = YakindummPackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).filter [
			useSynchInThisLoad || (it.name != "Synchronization")
		].filter[useComplexStates || (it.name != "Choice" && it.name != "Exit" && it.name != "FinalState")].toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList

		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val useSynchInThisLoad = this.useSynchronization

		val i = Patterns.instance
		val patterns = i.specifications.filter [ spec |
			useSynchInThisLoad || !patternsWithSynchronization.exists[spec.fullyQualifiedName.endsWith(it)]
		].filter [ spec |
			useComplexStates || !patternsWithComplexStates.exists[spec.fullyQualifiedName.endsWith(it)]
		].toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}

	override getRelevantTypes(EcoreMetamodelDescriptor descriptor) {
		descriptor.classes.filterByNames([it.name], #["Vertex", "Transition", "Synchronization"])
	}

	override getRelevantReferences(EcoreMetamodelDescriptor descriptor) {
		descriptor.references.filterByNames([it.name], #["source", "target"])
	}

	override loadPartialModel() {
		this.workspace.readModel(EObject, "Yakindu.xmi").eResource.allContents.toList
	}

	override additionalConstraints() {
		//#[[method|new SGraphInconsistencyDetector(method)]]
		emptyList
	}

	override getTypeQuantiles() {
		#{
			"Choice" -> new TypeQuantiles(0.118279569892473, 0.154020979020979),
			"Entry" -> new TypeQuantiles(0.0283018867924528, 0.0620167525773196),
			"Exit" -> new TypeQuantiles(0, 0),
			"FinalState" -> new TypeQuantiles(0, 0),
			"Region" -> new TypeQuantiles(0.0294117647058824, 0.0633258678611422),
			"State" -> new TypeQuantiles(0.132023636740618, 0.175925925925926),
//			"Statechart" -> new TypeQuantiles(0.00961538461538462, 0.010752688172043),
			"Transition" -> new TypeQuantiles(0.581632653061224, 0.645161290322581)
		}
	}

	override getHints(Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		#[new SGraphHint(ecore2Logic, trace)]
	}
}

class FileSystemLoader extends MetamodelLoader {

	new(ReasonerWorkspace workspace) {
		super(workspace)
	}

	override loadMetamodel() {
		val package = FilesystemPackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.filter[name != "live"].toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	override getRelevantTypes(EcoreMetamodelDescriptor descriptor) {
		return null
	}

	override getRelevantReferences(EcoreMetamodelDescriptor descriptor) {
		null
	}

	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val patternGroup = FileSystem.instance
		val patterns = patternGroup.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = new HashMap
//		derivedFeatures.put(patternGroup.live,metamodel.references.filter[it.name == "live"].head)
		return new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)

	}

	override loadPartialModel() {
		this.workspace.readModel(EObject, "fs.xmi").eResource.allContents.toList
	}

	override additionalConstraints() {
		//#[[method|new FileSystemInconsistencyDetector(method)]]
		emptyList
	}

	override getTypeQuantiles() {
		#{
			"Filesystem" -> new TypeQuantiles(0, 0.05),
			"Dir" -> new TypeQuantiles(0.15, 0.3),
			"File" -> new TypeQuantiles(0.25, 0.85)
		}
	}
}

class EcoreLoader extends MetamodelLoader {

	new(ReasonerWorkspace workspace) {
		super(workspace)
	}

	override loadMetamodel() {
		val package = EcorePackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).filter [
			it.name != "EFactory" && it.name != "EObject" && it.name != "EResource"
		].toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.filter [
			it.name != "eFactoryInstance" && it.name != "contents" && it.name != "references" &&
				it.name != "eGenericType" && it.name != "eGenericSuperTypes"
		].filter[!it.derived].toList
		val List<EAttribute> attributes = #[] // classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	override getRelevantTypes(EcoreMetamodelDescriptor descriptor) {
		return null
	}

	override getRelevantReferences(EcoreMetamodelDescriptor descriptor) {
		null
	}

	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val patternGroup = Ecore.instance
		val patterns = patternGroup.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = new HashMap
		return new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)

	}

	override loadPartialModel() {
		this.workspace.readModel(EObject, "ecore.xmi").eResource.allContents.toList
	}

	override additionalConstraints() {
		#[]
	}

	override getTypeQuantiles() {
		#{
			"EAnnotation" -> new TypeQuantiles(0, 0),
			"EAttribute" -> new TypeQuantiles(0.14, 0.300943396226415),
			"EClass" -> new TypeQuantiles(0.224014336917563, 0.372881355932203),
			"EDataType" -> new TypeQuantiles(0, 0),
			"EEnum" -> new TypeQuantiles(0, 0.0275208638045255),
			"EEnumLiteral" -> new TypeQuantiles(0, 0.105204907665065),
			"EGenericType" -> new TypeQuantiles(0, 0),
			"EOperation" -> new TypeQuantiles(0, 0),
			"EPackage" -> new TypeQuantiles(0.0119047619047619, 0.0192307692307692),
			"EParameter" -> new TypeQuantiles(0, 0),
			"EReference" -> new TypeQuantiles(0.217599234815878, 0.406779661016949),
			"EStringToStringMapEntry" -> new TypeQuantiles(0, 0),
			"ETypeParameter" -> new TypeQuantiles(0, 0)
		}
	}

}

class SatelliteLoader extends MetamodelLoader {

	new(ReasonerWorkspace workspace) {
		super(workspace)
	}

	override loadMetamodel() {
		val package = SatellitePackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	override getRelevantTypes(EcoreMetamodelDescriptor descriptor) {
		null
	}

	override getRelevantReferences(EcoreMetamodelDescriptor descriptor) {
		null
	}

	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val i = SatelliteQueriesAll.instance
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}

	override loadPartialModel() {
		this.workspace.readModel(EObject, "satellite.xmi").eResource.allContents.toList
	}

	override additionalConstraints() { #[] }
	
	override getHints(Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		#[new SatelliteHint(ecore2Logic, trace)]
	}
	
	override getTypeQuantiles() {
		#{
			"CubeSat3U" -> new TypeQuantiles(0.1, 0.25),
			"CubeSat6U" -> new TypeQuantiles(0, 0.25),
			"SmallSat" -> new TypeQuantiles(0, 0.15),
			"UHFCommSubsystem" -> new TypeQuantiles(0.08, 0.25),
			"XCommSubsystem" -> new TypeQuantiles(0.08, 0.25),
			"KaCommSubsystem" -> new TypeQuantiles(0, 0.1),
			"InterferometryPayload" -> new TypeQuantiles(0.15, 0.25)
		}
	}
	
}
