package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ProjectWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.LinkedList
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.IConsoleConstants
import org.eclipse.ui.console.IConsoleView
import org.eclipse.ui.console.MessageConsole
import java.util.List

//import org.eclipse.ui.console.MessageConsole

class ScriptConsole {
	/**
	 * Console is identified with the name of this class.
	 */
	val final consoleID = ScriptConsole.name
	val boolean printToConsole
	val MessageConsole runtimeConsole;
	val ReasonerWorkspace messageWorkspace;
	val String messageFileName;
	val ReasonerWorkspace errorWorkspace;
	val String errorFileName;
	val ReasonerWorkspace statisticsWorkspace;
	val String statisticsFileName;
	
	val statisticsHeaderBuffer = new LinkedHashSet<String>
	val statisticsDataBuffer = new LinkedList<Map<String,? extends Object>>
	
	static val delimier = ';'
	static val empty = ""
	
	public new(
		boolean printToConsole,
		boolean printToRuntimeConsole,
		boolean cleanFiles,
		URI messageConsoleURI,
		URI errorConsoleURI,
		URI statisticsConsoleURI)
	{
		val List<String> errorMessagesDuringInitialisation = new LinkedList
		
		this.messageWorkspace = prepareWorkspace(messageConsoleURI,errorMessagesDuringInitialisation)
		this.messageFileName = prepareFileName(messageConsoleURI)
		this.errorWorkspace = prepareWorkspace(errorConsoleURI,errorMessagesDuringInitialisation)
		this.errorFileName = prepareFileName(errorConsoleURI)
		this.statisticsWorkspace = prepareWorkspace(statisticsConsoleURI,errorMessagesDuringInitialisation)
		this.statisticsFileName = prepareFileName(statisticsConsoleURI)
		
		this.printToConsole = printToConsole
		this.runtimeConsole = if(printToRuntimeConsole) { prepareRuntimeConsole } else { null }
		
		errorMessagesDuringInitialisation.forEach[
			this.writeError('''Error during console initialisation: "«it»"''')
		]
	}
	
	public def writeMessage(String message) {
		if(messageWorkspace!=null) {
			messageWorkspace.writeText(messageFileName,message);
		}
		if(printToConsole) {
			println(message)
		}
		if(runtimeConsole!==null) {
			this.writeToRuntimeConsole(message)
		}
	}
	public def writeError(String message) {
		if(errorWorkspace!=null) {
			errorWorkspace.writeText(errorFileName,message);
		}
		if(printToConsole) {
			println(message)
		}
		if(runtimeConsole!==null) {
			this.writeToRuntimeConsole(message)
		}
	}
	public def writeStatistics(LinkedHashMap<String,? extends Object> statistics) {
		if(statisticsWorkspace!==null) {
			val message = '''
			«FOR key : statistics.keySet SEPARATOR delimier»«key»«ENDFOR»
			«FOR value : statistics.values SEPARATOR delimier»«value»«ENDFOR»'''
			statisticsWorkspace.writeText(statisticsFileName,message);
		}
	}
	public def addStatistics(LinkedHashMap<String,? extends Object> statistics) {
		for(key : statistics.keySet) {
			this.statisticsHeaderBuffer.add(key);
		}
		this.statisticsDataBuffer.add(statistics)
	}
	public def flushStatistics() {
		if(statisticsWorkspace!==null) {
			val message = '''
			«FOR key : statisticsHeaderBuffer SEPARATOR delimier»«key»«ENDFOR»
			«FOR line : statisticsDataBuffer »
				«FOR key : statisticsHeaderBuffer»«IF line.containsKey(key)»«empty»«ELSE»«line.get(key)»«ENDIF»«ENDFOR»
			«ENDFOR»
			'''
			statisticsWorkspace.writeText(statisticsFileName,message);
		}
	}

	private def prepareWorkspace(URI uri, List<String> errors) {
		if (uri === null) {
			return null
		} else {
			try{
				val folderURI = uri.trimSegments(1)
				if(folderURI.isFile) {
					return new FileSystemWorkspace(folderURI.toString,"")=>[init]
				} else if(folderURI.isPlatformResource) {
					return new ProjectWorkspace(folderURI.toString,"")=>[init]
				} else {
					throw new UnsupportedOperationException('''Unsupported file usi: "«uri»"!''')
				}
			} catch(Exception e) {
				errors += e.message
				return null
			}
		}
	}
	private def prepareFileName(URI uri) {
		if(uri!==null) {
			return uri.lastSegment
		} else {
			null
		}
	}
	
	private def MessageConsole prepareRuntimeConsole() {
		val plugin = ConsolePlugin.getDefault();
		val conMan = plugin.getConsoleManager();
		val existingConsoles = conMan.getConsoles();
		val existingConsolesWithID = existingConsoles.filter[it.name.equals(consoleID)]
		if(existingConsolesWithID.empty) {
			val MessageConsole res = new MessageConsole(consoleID,null)
			conMan.addConsoles(#[res]);
			return res
		} else {
			return existingConsolesWithID.head as MessageConsole
		}
	}
	
	private def writeToRuntimeConsole(CharSequence message) {
		// 1. reveal the console view
//		val IWorkbench wb = PlatformUI.getWorkbench();
//		val IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
//		val IWorkbenchPage page = win.getActivePage();
//		val id = IConsoleConstants.ID_CONSOLE_VIEW;
//		val view = page.showView(id) as IConsoleView;
//		view.display(this.runtimeConsole);	
		
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(this.runtimeConsole);
		
		// 2. write to the console
		val stream = this.runtimeConsole.newMessageStream
		stream.println(message.toString)
		stream.close
	}
}