package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Task
import java.util.HashMap
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Metamodel
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EAttribute
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import org.eclipse.emf.ecore.EObject
import java.util.LinkedHashMap
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import java.util.LinkedList
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualisation
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicStructureBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage

class Executor {
	public def void execute(ConfigurationScript configurationScript) {
		val tasks = configurationScript.commands.filter(Task)
		val numberOfModels = tasks.map[it.calculateTaskSteps].reduce[p1, p2|p1+p2]
	}
	
	def private dispatch calculateTaskSteps(Task task) {
		throw new UnsupportedOperationException()
	}
	def private dispatch calculateTaskSteps(GenerationTask task) {
		return task.number * task.runs
	} 
	
	def private dispatch executeTask(Task task) {
		throw new UnsupportedOperationException()
	}
	def private dispatch executeTask(GenerationTask generationTask) {
		val metamodel = generationTask.metamodel
		if(metamodel != null) {
			
		}
	}
	
	def protected loadPackage(ResourceSet rs, String path) {
		var EObject content = null
		
		try {
			val resource = rs.getResource(URI.createURI(path),true)
			content = resource.contents.get(0)
		} catch(IllegalArgumentException e) {
			return null
		} catch(RuntimeException e) {
			return null
		}
		
		if(content instanceof EPackage) {
			
		} else return null
	}
	
	def loadPatternModel(ResourceSet rs, String path) {
		var model = null
		
		
	}
}
