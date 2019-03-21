package hu.bme.mit.inf.dslreasoner.application.ui.execute

import java.io.File
import java.net.URI
import org.eclipse.core.filesystem.EFS
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.console.IHyperlink
import org.eclipse.ui.ide.IDE

class ScriptConsoleFileHiperlink implements IHyperlink {

	val URI path

	new(File file) {
		this.path = file.toURI()
	}

	override linkActivated() {
		// println("open path: "+path.toString)
		val page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		val fileStore = EFS.getStore(path)
		IDE.openEditorOnFileStore(page, fileStore)
	}

	override linkEntered() {}

	override linkExited() {}
}
