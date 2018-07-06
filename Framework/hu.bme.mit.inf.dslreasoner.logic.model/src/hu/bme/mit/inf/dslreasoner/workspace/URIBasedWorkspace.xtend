package hu.bme.mit.inf.dslreasoner.workspace

import org.eclipse.emf.common.util.URI

class URIBasedWorkspace extends ReasonerWorkspace{
	val ReasonerWorkspace delegatedWorkspace;
	
	new(String targetFolder, String prefix) {
		super(targetFolder, prefix)
		val targetFolderURI = URI.createURI(targetFolder)
		if(targetFolderURI.isFile) {
			delegatedWorkspace = new FileSystemWorkspace(targetFolder,prefix)
		} else if(targetFolderURI.isPlatformResource){
			delegatedWorkspace = new ProjectWorkspace(targetFolder,prefix)
		} else {
			delegatedWorkspace = null
			throw new UnsupportedOperationException('''Unknown URI: «targetFolder»''')
		}
	}
	
	override subWorkspace(String targetFolder, String prefix) {
		delegatedWorkspace.subWorkspace(targetFolder,prefix)
	}
	
	override getWorkspaceURI() {
		delegatedWorkspace.getWorkspaceURI
	}
	
	override init() {
		delegatedWorkspace.init
	}
	
	override clear() {
		delegatedWorkspace.clear
	}
	
	override protected getURI(String name) {
		delegatedWorkspace.getURI(name)
	}
	
	override getFile(String name) {
		delegatedWorkspace.getFile(name)
	}
	
	override refreshFile(String name) {
		delegatedWorkspace.refreshFile(name)
	}
	
	override protected renameFile(String name) {
		delegatedWorkspace.renameFile(name)
	}
	
	override allFiles() {
		delegatedWorkspace.allFiles
	}
	
	override writeText(String name, CharSequence content) {
		delegatedWorkspace.writeText(name, content)
	}
	
	override readText(String name) {
		delegatedWorkspace.readText(name)
	}
	
}