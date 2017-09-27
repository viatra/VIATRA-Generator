package hu.bme.mit.inf.dslreasoner.workspace

import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStreamReader
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.common.util.URI

class ProjectWorkspace extends ReasonerWorkspace{
	
	val monitor = new NullProgressMonitor
	var IContainer target;
	
	new(String targetFolder, String prefix) {
		super(targetFolder, prefix)
	}
	
	override protected getURI(String name) {
		URI.createPlatformResourceURI(targetFolder + "/" + prefix + name,true);
	}
	
	def protected getDirUri() {
		URI.createPlatformResourceURI(targetFolder,true)
	}
	
	override getWorkspaceURI() {
		getDirUri
	}
	
	override initAndClear() {
		target = ResourcesPlugin.workspace.root
		for(nameSegment : dirUri.segments) {
			target = createContainer(target,nameSegment)
		}
		target.members.forEach[delete(false,monitor)]
	}
	
	def protected dispatch createContainer(IWorkspaceRoot root, String name) {
		val project = root.getProject(name)
		if(project.exists) {
			if(!project.open) {
				project.open(monitor)
			}
		} else {
			project.create(monitor)
		}
		return project
	}
	
	def protected dispatch createContainer(IProject root, String name) {
		val folder = root.getFolder(name);
		if(folder.exists) {
			folder.create(false,true,monitor)
		}
		return folder
	}
	
	def protected dispatch createContainer(IFolder root, String name) {
		val folder = root.getFolder(name);
		if(folder.exists) {
			folder.create(false,true,monitor)
		}
		return folder
	}
	
	def dispatch getTargetFile(IFolder targetFolder, String name) { targetFolder.getFile(name) }
	def dispatch getTargetFile(IProject targetProject, String name) { targetProject.getFile(name) }
	
	override writeText(String name, CharSequence content) {
		val file = target.getTargetFile(name);
		if(!file.exists()) {
			file.create(new ByteArrayInputStream(content.toString().getBytes()),true, new NullProgressMonitor());
			return URI.createPlatformResourceURI(file.projectRelativePath.toString,true)
		}
		else throw new IOException("The file is already existing.")
	}
	
	override readText(String name) {		
		val file = target.getTargetFile(name)
		val in = new BufferedReader(new InputStreamReader(file.contents))
		
		var result = ""
		var String line;
		
		while ((line = in.readLine()) != null) {
			result = result.concat(line)
		}
		
        return result
	}
	
	override protected renameFile(String name) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override subWorkspace(String targetFolder, String prefix) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override allFiles() {
		target.members.map[it.name]
	}
	
}
