package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.AllPatternEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternElement
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ViatraImport
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import java.util.HashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternCompositionConstraint
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.xtext.EcoreUtil2

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternCall
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import java.util.LinkedHashMap
import java.util.LinkedList

class QueryLoader {
	//val parser = new VQLParser
	val builder = new SpecificationBuilder
	
	def loadQueries(PatternSpecification specification) {
		val patterns = new LinkedHashSet
		
		for(entry: specification.entries) {
			patterns += getPatterns(entry)
		}
		
		//val errors = patterns.map[eResource].toSet.map[errors]
		//errors.forEach[println(it)]
		
		val allConcernedPatterns = patterns.allReferredPatterns
		val pattern2Specification = allConcernedPatterns.translatePatterns()
		
		val List<IQuerySpecification<?>> patternsToTranslate =
			pattern2Specification.values.toList
		val Set<IQuerySpecification<?>> validationPatterns =
			patterns.filter[it.annotations.exists[it.name.equals("Constraint")]]
			.map[lookup(pattern2Specification)]
			.toSet
		val derivedFeatures = calculateDerivedFeatures(patterns.referredEcoreModels,patterns.map[it.lookup(pattern2Specification)])
		
		return new ViatraQuerySetDescriptor(
			patternsToTranslate,
			validationPatterns,
			derivedFeatures
		) -> allConcernedPatterns
	}
	
	def dispatch List<Pattern> getPatterns(AllPatternEntry entry) {
		val excluded = entry.exclusuion.map[getPatterns]
		val referredPatternModels = allPatternsWithSamePackage(entry,entry.package as PatternModel).toSet
		val patterns = referredPatternModels.map[patterns].flatten
		return patterns.filter[!excluded.contains(it)].toList
	}
	
	def dispatch List<Pattern> getPatterns(PatternElement entry) {
		return #[entry.pattern]
	}
	
	def private allPatternsWithSamePackage(PatternEntry entry, PatternModel model) {
		val packageURI = model.packageName
		val document = EcoreUtil2.getContainerOfType(entry,ConfigurationScript)
		val viatraImportsWithSamePackage = document.imports
			.filter(ViatraImport)
			.map[it.importedViatra]
			.filterNull
			.filter[packageName.equals(packageURI)]
		return viatraImportsWithSamePackage
	}
	
	/**
	 * Adds all referred patterns to a given set of patterns.
	 */
	def private Set<Pattern> allReferredPatterns(Set<Pattern> patterns) {
		val res = new LinkedHashSet
		res+=patterns
		
		var boolean changed
		do{
			changed = false
			val newElements =  res.map[directlyReferredPatterns].flatten.filter[!res.contains(it)]
			if(!newElements.empty) {
				changed = true
				res.addAll(newElements)
			}
		} while(changed)
		
		return res
	}
	
	def private directlyReferredPatterns(Pattern pattern) {
		return pattern
			.bodies
			.map[constraints]
			.flatten
			.filter(PatternCompositionConstraint)
			.map[(call as PatternCall).patternRef].toSet
	}
	
	def private referredEcoreModels(Set<Pattern> patterns) {
		patterns.map[eContainer as PatternModel].map[it.importPackages.packageImport.map[it.EPackage].filterNull].flatten.toSet
	}
	
	def private translatePatterns(Set<Pattern> xtextPattern) {
		val res = new LinkedHashMap<Pattern,IQuerySpecification<?>>
		val patterns = new LinkedList<IQuerySpecification<?>>
		for(pattern : xtextPattern) {
			val querySpecification = builder.getOrCreateSpecification(pattern,patterns,true)
			res.put(pattern,querySpecification)
			patterns += querySpecification
		}
		
		return res
	}
	
	def private calculateDerivedFeatures(Set<EPackage> packages, Iterable<IQuerySpecification<?>> patterns) {
		val features = packages.map[EClassifiers].flatten.filter(EClass).map[it.EStructuralFeatures].flatten
		val res = new HashMap
		for(feature : features) {
			val QBFAnnotation = feature.EAnnotations.filter[it.source.equals("org.eclipse.viatra.query.querybasedfeature")].head
			if(QBFAnnotation !== null) {
				val targetFQN =	QBFAnnotation.details.get("patternFQN")
				val referredPattern = patterns.filter[
					val fqn = it.fullyQualifiedName
					fqn.equals(targetFQN)
				].head
				if(referredPattern!== null) {
					res.put(referredPattern, feature)
				}
			}
		}
		return res
	}
}
