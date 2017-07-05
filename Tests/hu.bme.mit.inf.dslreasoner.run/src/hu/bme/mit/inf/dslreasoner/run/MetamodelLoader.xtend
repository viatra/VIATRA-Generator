package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import java.util.LinkedHashMap
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EReference
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ModelGenerationMethodBasedGlobalConstraint
import org.eclipse.xtext.xbase.lib.Functions.Function1
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod
import org.eclipse.emf.ecore.EObject
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import java.util.Collection
import java.util.Set
import java.util.Collections

abstract class MetamodelLoader {
	protected val ReasonerWorkspace workspace
	public new(ReasonerWorkspace workspace) {
		this.workspace = workspace
	} 
	def EcoreMetamodelDescriptor loadMetamodel()
	def Set<EClass> getRelevantTypes(EcoreMetamodelDescriptor descriptor)
	def Set<EReference> getRelevantReferences(EcoreMetamodelDescriptor descriptor)
	def ViatraQuerySetDescriptor loadQueries(EcoreMetamodelDescriptor metamodel)
	def List<EObject> loadPartialModel()
	
	def List<Function1<ModelGenerationMethod,ModelGenerationMethodBasedGlobalConstraint>> additionalConstraints()
	
	def <T> filterByNames(Iterable<T> collection, Function1<T,String> nameExtractor, Collection<String> requiredNames) {
		val res = collection.filter[requiredNames.contains(nameExtractor.apply(it))]
		if(res.size != requiredNames.size) throw new IllegalArgumentException
		return res.toSet
	}
}

class FAMLoader extends MetamodelLoader{
	
	new(ReasonerWorkspace workspace) {
		super(workspace)
	}
	
	override loadMetamodel() {
		val package = FunctionalArchitecturePackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
	}
	
	override  getRelevantTypes(EcoreMetamodelDescriptor descriptor) {
		return descriptor.classes.filterByNames([it.name],#["FunctionalElement"])
	}
	override getRelevantReferences(EcoreMetamodelDescriptor descriptor) {
		return descriptor.references.filterByNames([it.name],#["subElements"])
	}
	
	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val i = hu.bme.mit.inf.dslreasoner.domains.transima.fam.patterns.Pattern.instance
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name== "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		derivedFeatures.put(i.type.internalQueryRepresentation,metamodel.attributes.filter[it.name == "type"].head)
		derivedFeatures.put(i.model.internalQueryRepresentation,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}
	override loadPartialModel() {
		this.workspace.readModel(EObject,"FAM.xmi").eResource.allContents.toList
	}
	
	override additionalConstraints() { #[] }
}

class YakinduLoader extends MetamodelLoader{
	
	private var useSynchronization = true;
	public static val patternsWithSynchronization = #[
		"synchHasNoOutgoing", "synchHasNoIncoming", "SynchronizedIncomingInSameRegion", "notSynchronizingStates",
		"hasMultipleOutgoingTrainsition", "hasMultipleIncomingTrainsition", "SynchronizedRegionsAreNotSiblings",
		"SynchronizedRegionDoesNotHaveMultipleRegions", "synchThree", "twoSynch"]
	
	new(ReasonerWorkspace workspace) {
		super(workspace)
	}
	
	public def setUseSynchronization(boolean useSynchronization) {
		this.useSynchronization = useSynchronization
	}
	
	override loadMetamodel() {
		val useSynchInThisLoad = this.useSynchronization
		
		val package = YakindummPackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).filter[(useSynchInThisLoad) || (it.name != "Synchronization")].toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList

		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
	}
	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val useSynchInThisLoad = this.useSynchronization
		
		val i = hu.bme.mit.inf.dslreasoner.partialsnapshot_mavo.yakindu.Patterns.instance
		val patterns = i.specifications.filter[spec |
			useSynchInThisLoad ||
			!patternsWithSynchronization.exists[spec.fullyQualifiedName.endsWith(it)]
		].toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name== "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}
	override getRelevantTypes(EcoreMetamodelDescriptor descriptor) {
		descriptor.classes.filterByNames([it.name],#["Vertex","Transition","Synchronization"])
	}
	
	override getRelevantReferences(EcoreMetamodelDescriptor descriptor) {
		descriptor.references.filterByNames([it.name],#["source","target"])
	}
	
	override loadPartialModel() {
		this.workspace.readModel(EObject,"Yakindu.xmi").eResource.allContents.toList
	}
	
	override additionalConstraints() { //#[]
		#[[method | new SGraphInconsistencyDetector(method)]]
	}
}