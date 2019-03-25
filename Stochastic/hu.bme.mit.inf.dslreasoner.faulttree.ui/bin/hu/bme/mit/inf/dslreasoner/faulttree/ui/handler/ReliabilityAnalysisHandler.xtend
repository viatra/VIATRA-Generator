package hu.bme.mit.inf.dslreasoner.faulttree.ui.handler

import hu.bme.mit.inf.dslreasoner.application.execution.EclipseBasedProgressMonitor
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft.Cft2FtTransformation
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.Ecore2CftTransformation
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.FtAnalysisObjective
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.ReliabilityResult
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.StormDftConfiguration
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.StormDftSolver
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.workspace.ProjectWorkspace
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.swt.widgets.MessageBox
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

class ReliabilityAnalysisHandler extends AbstractHandler {

	override execute(ExecutionEvent event) throws ExecutionException {
		val selection = HandlerUtil.getCurrentStructuredSelection(event)
		val resourceSet = new ResourceSetImpl
		val iterator = selection.iterator
		var IProject targetProject = null
		var Resource targetResource = null
		var TransformationDefinition transformationDefinition = null
		while (iterator.hasNext) {
			val selectedElement = iterator.next
			if (selectedElement instanceof IFile) {
				val resource = tryLoadResource(resourceSet, selectedElement)
				if (resource !== null && !resource.contents.empty) {
					val rootElement = resource.contents.head
					if (rootElement instanceof CftModel) {
						if (rootElement.transformationDefinitions.empty) {
							throw new IllegalArgumentException("Selected cft file is not a transformation definition.")
						}
						if (transformationDefinition !== null) {
							throw new IllegalArgumentException(
								"Only a single transformation definition may be selected.")
						}
						transformationDefinition = rootElement.transformationDefinitions.head
					} else {
						if (targetResource !== null) {
							throw new IllegalArgumentException("Only a single architecture model may be selected.")
						}
						targetResource = resource
						targetProject = selectedElement.project
					}
				}
			}
		}
		if (targetResource === null || targetResource === null) {
			throw new IllegalArgumentException(
				"A transformation definition and an architecture model must be selected.")
		}
		runAnalysis(transformationDefinition, targetResource, targetProject, new NullProgressMonitor)
		null
	}

	private static def tryLoadResource(ResourceSet resourceSet, IFile file) {
		val fullPath = file.fullPath.toString
		val uri = URI.createPlatformResourceURI(fullPath, true)
		try {
			resourceSet.getResource(uri, true)
		} catch (RuntimeException e) {
			null
		}
	}

	private def runAnalysis(TransformationDefinition transformationDefinition, Resource resource, IProject project,
		IProgressMonitor monitor) {
		val workspace = createWorkspace(project, monitor)
		val cft = createComponentFaultTree(transformationDefinition, resource)
		workspace.writeModel(cft, "cft.xmi")
		val cft2ft = new Cft2FtTransformation
		val ft = cft2ft.createFaultTree(cft)
		workspace.writeModel(ft, "ft.xmi")
		val solver = new StormDftSolver
		val config = new StormDftConfiguration
		config.progressMonitor = new EclipseBasedProgressMonitor(monitor)
		config.documentationLevel = DocumentationLevel.NORMAL
		config.objective = FtAnalysisObjective.MTTF
		val result = solver.solve(ft, config, workspace)
		displayResult(result)
	}

	private def createWorkspace(IProject project, IProgressMonitor monitor) {
		val folder = project.getFolder("debug")
		if (!folder.exists) {
			folder.create(IResource.NONE, true, monitor)
		}
		val path = folder.fullPath.toString
		val uri = URI.createPlatformResourceURI(path, true)
		val workspace = new ProjectWorkspace(uri.toString, "")
		workspace.initAndClear
		workspace
	}

	private def createComponentFaultTree(TransformationDefinition transformationDefinition, Resource resource) {
		val queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(resource))
		try {
			val ecore2cft = new Ecore2CftTransformation(transformationDefinition, queryEngine)
			ecore2cft.createComponentFaultTree
		} finally {
			queryEngine.dispose
		}
	}

	private def displayResult(ReliabilityResult result) {
		val messageBox = new MessageBox(PlatformUI.workbench.activeWorkbenchWindow.shell)
		messageBox.message = result.toString
		messageBox.open
	}
}
