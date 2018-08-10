package hu.bme.mit.inf.dslreasoner.application.execution

import org.eclipse.ui.console.IHyperlink
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.PlatformUI
import org.eclipse.core.filesystem.EFS
import java.io.File
import java.net.URI

class ScriptConsoleFileHiperlink implements IHyperlink {
	
	private val URI path;
	
	new(File file) {
		this.path = file.toURI()
	}
	
	override linkActivated() {
		//println("open path: "+path.toString)
		val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		val fileStore = EFS.getStore(path)
		IDE.openEditorOnFileStore(page,fileStore)
	}
	
	override linkEntered() { }
	
	override linkExited() { }
}