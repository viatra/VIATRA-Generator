package hu.bme.mit.inf.dslreasoner.workspace

import java.io.FileNotFoundException
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.util.List

abstract class ReasonerWorkspace{
	
	protected val String targetFolder;
	protected val String prefix;
	val ResourceSet resSet = new ResourceSetImpl();
	
	public new(String targetFolder, String prefix) {
		this.targetFolder = targetFolder
		this.prefix = prefix
	}
	
	public def ReasonerWorkspace subWorkspace(String targetFolder, String prefix);
	
	def URI getWorkspaceURI();
	
	/**
	 * Creates the target folder and clears the workspace for the reasoning
	 */
	def public void initAndClear()
	
	def protected URI getURI(String name);
	protected def Resource getResource(String name) {
		val prevoius = resSet.getResource(getURI(name),false);
		if(prevoius!= null) prevoius.delete(Collections.EMPTY_MAP)
		
		val URI resourceURI = getURI(name)
		return resSet.createResource(resourceURI);
	}
	
	
	/**
	 * Writes a model 
	 */
	def public URI writeModel(EObject modelRoot, String name) {
	    val resource = getResource(name);
	    resource.getContents().add(modelRoot);
		resource.save(Collections.EMPTY_MAP);
		return resource.URI
	}
	
	
	def public String writeModelToString(EObject modelRoot, String name) {
		val resource = getResource(name);
		resource.getContents().add(modelRoot);
		val ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		resource.save(outputStream, null);
		return outputStream.toString();
	}
	
	def public <RootType extends EObject> RootType reloadModel(Class<RootType> type, String name) {
		try {
			val resource = resSet.getResource(getURI(name),false);
			if(resource.loaded) {
				resource.unload
			}
			resource.load(Collections.EMPTY_MAP)
			if(resource == null) throw new FileNotFoundException(getURI(name).toString)
			else return resource.contents.get(0) as RootType	
		} catch(Exception e) {
			throw new FileNotFoundException(getURI(name).toString)
		}
	} 
	
	def public <RootType extends EObject> RootType readModel(Class<RootType> type, String name) {
		try {
			val resource = resSet.getResource(getURI(name),true);
			if(resource == null) throw new FileNotFoundException(getURI(name).toString)
			else return resource.contents.get(0) as RootType	
		} catch(Exception e) {
			throw new FileNotFoundException(getURI(name).toString + "reason: " + e.message)
		}
	}
	
	def public deactivateModel(String name) {
		val resource = resSet.getResource(getURI(name),true);
		resource.unload
		renameFile(name)
	}
	val static protected deactivationPostfix = ".deactivated"
	def protected void renameFile(String name)
	
//	def void reactivate()
//	def void deactivate()

	def public List<String> allFiles();

	def public URI writeText(String name, CharSequence content);
	
	def public String readText(String name);
}