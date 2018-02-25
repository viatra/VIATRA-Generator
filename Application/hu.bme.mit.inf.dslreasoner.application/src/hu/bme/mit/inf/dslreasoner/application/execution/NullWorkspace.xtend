package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.ByteArrayOutputStream
import java.io.FileNotFoundException
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

class NullWorkspace extends ReasonerWorkspace{
	
	new() {
		super(null, null)
	}
	
	static val message = "No workspace is specified!"
	
	public override ReasonerWorkspace subWorkspace(String targetFolder, String prefix) {
		return new NullWorkspace()
	}

	override URI getWorkspaceURI() {
		throw new UnsupportedOperationException(message)
	}
	override public void initAndClear() {}
	override protected URI getURI(String name) {
		throw new UnsupportedOperationException(message)
	}
	protected override Resource getResource(String name) {
		throw new UnsupportedOperationException(message)
	}
	override public URI writeModel(EObject modelRoot, String name) { }
	override writeModelToString(EObject modelRoot, String name) { }
	
	override public <RootType extends EObject> RootType reloadModel(Class<RootType> type, String name) {
		throw new UnsupportedOperationException(message)
	} 
	override public <RootType extends EObject> RootType readModel(Class<RootType> type, String name) {
		throw new UnsupportedOperationException(message)
	}
	override public deactivateModel(String name) { }
	override protected void renameFile(String name) { }
	
	override public List<String> allFiles() {
		throw new UnsupportedOperationException(message)
	}
	override public URI writeText(String name, CharSequence content) { }
	
	override public String readText(String name) {
		throw new UnsupportedOperationException(message)
	}
}