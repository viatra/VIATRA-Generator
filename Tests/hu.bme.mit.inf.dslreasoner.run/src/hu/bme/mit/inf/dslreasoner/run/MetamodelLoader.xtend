package hu.bme.mit.inf.dslreasoner.run

import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Ecore
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.FileSystem
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FilesystemPackage
import hu.bme.mit.inf.dslreasoner.domains.transima.fam.FamPatterns
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.partialsnapshot_mavo.yakindu.Patterns
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ModelGenerationMethodBasedGlobalConstraint
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.Collection
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.xbase.lib.Functions.Function1
import hu.bme.mit.inf.dslreasoner.domains.transima.fam.Type
import hu.bme.mit.inf.dslreasoner.domains.transima.fam.Model

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
		val package = FunctionalarchitecturePackage.eINSTANCE
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
		val i = FamPatterns.instance
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name== "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		derivedFeatures.put(Type.instance,metamodel.attributes.filter[it.name == "type"].head)
		derivedFeatures.put(Model.instance,metamodel.references.filter[it.name == "model"].head)
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
	
	var useSynchronization = true;
	var useComplexStates = false; 
	public static val patternsWithSynchronization = #[
		"synchHasNoOutgoing", "synchHasNoIncoming", "SynchronizedIncomingInSameRegion", "notSynchronizingStates",
		"hasMultipleOutgoingTrainsition", "hasMultipleIncomingTrainsition", "SynchronizedRegionsAreNotSiblings",
		"SynchronizedRegionDoesNotHaveMultipleRegions", "synchThree", "twoSynch","noSynch2","synch","noSynch4","noSynch3","noSynch"]
	public static val patternsWithComplexStates =#["outgoingFromExit","outgoingFromFinal","choiceHasNoOutgoing","choiceHasNoIncoming"]
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
		val List<EClass> classes = package.EClassifiers.filter(EClass)
			.filter[useSynchInThisLoad || (it.name != "Synchronization")]
			.filter[useComplexStates   || (it.name != "Choice" && it.name != "Exit" && it.name != "FinalState")]
			.toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList

		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
	}
	override loadQueries(EcoreMetamodelDescriptor metamodel) {
		val useSynchInThisLoad = this.useSynchronization
		
		val i = Patterns.instance
		val patterns = i.specifications
			.filter[spec |
				useSynchInThisLoad ||
				!patternsWithSynchronization.exists[spec.fullyQualifiedName.endsWith(it)]
			]
			.filter[spec |
				useComplexStates ||
				!patternsWithComplexStates.exists[spec.fullyQualifiedName.endsWith(it)]
			]
			.toList
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

class FileSystemLoader extends MetamodelLoader{
	
	new(ReasonerWorkspace workspace) {
		super(workspace)
	}
	
	override loadMetamodel() {
		val package = FilesystemPackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
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
		derivedFeatures.put(patternGroup.live,metamodel.references.filter[it.name == "live"].head)
		return new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)

	}
	
	override loadPartialModel() {
		this.workspace.readModel(EObject,"fs.xmi").eResource.allContents.toList
	}
	
	override additionalConstraints() {
		#[[method | new FileSystemInconsistencyDetector(method)]]
	}
	
}

class EcoreLoader extends MetamodelLoader {
	
	new(ReasonerWorkspace workspace) {
		super(workspace)
	}
	
	override loadMetamodel() {
		val package = EcorePackage.eINSTANCE
		val List<EClass> classes = package.EClassifiers.filter(EClass).filter[it.name!="EFactory"].toList
		val List<EEnum> enums = package.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.filter[it.name!="eFactoryInstance"].filter[!it.derived].toList
		val List<EAttribute> attributes = #[] //classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
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
		this.workspace.readModel(EObject,"ecore.xmi").eResource.allContents.toList
	}
	
	override additionalConstraints() {
		#[]
	}
	
}