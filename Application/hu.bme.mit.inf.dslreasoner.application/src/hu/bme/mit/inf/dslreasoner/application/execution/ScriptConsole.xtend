package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ProjectWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.File
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.concurrent.CompletableFuture
import javax.swing.text.BadLocationException
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.text.DocumentEvent
import org.eclipse.jface.text.IDocumentListener
import org.eclipse.swt.graphics.Color
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream
import org.eclipse.xtend.lib.annotations.Data

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
		
		this.printToConsole = (ConsolePlugin.getDefault() === null)
		this.runtimeConsole = if(printToRuntimeConsole) { prepareRuntimeConsole } else { null }
		
		errorMessagesDuringInitialisation.forEach[
			this.writeError('''Error during console initialisation: "«it»"''')
		]
	}
	
	public def writeMessage(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		val resolvedText = this.resolveToText(message, separator, decorators)
		if(messageWorkspace!==null) {
			messageWorkspace.writeText(messageFileName,resolvedText);
		}
		if(printToConsole) {
			println(resolvedText)
		}
		if(runtimeConsole!==null) {
			writeToRuntimeConsole(message, separator, decorators)
		}
	}
	public def writeMessage(String message) {
		if(messageWorkspace!==null) {
			messageWorkspace.writeText(messageFileName,message);
		}
		if(printToConsole) {
			println(message)
		}
		if(runtimeConsole!==null) {
			writeToRuntimeConsole(message)
		}
	}
	public def writeError(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		val resolvedText = this.resolveToText(message, separator, decorators)
		if(errorWorkspace!==null) {
			errorWorkspace.writeText(errorFileName,resolvedText);
		}
		println(message)
		if(runtimeConsole!==null) {
			writeToRuntimeConsole(message, separator, decorators)
		}
	}
	public def writeError(String message) {
		if(errorWorkspace!==null) {
			errorWorkspace.writeText(errorFileName,message);
		}
		println(message)
		if(runtimeConsole!==null) {
			writeToRuntimeConsole(message)
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
			«FOR line : statisticsDataBuffer»
				«FOR key : statisticsHeaderBuffer SEPARATOR delimier»«IF line.containsKey(key)»«line.get(key)»«ELSE»«empty»«ENDIF»«ENDFOR»
			«ENDFOR»
			'''
			statisticsWorkspace.writeText(statisticsFileName,message);
			statisticsHeaderBuffer.clear
			statisticsDataBuffer.clear
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
		if(plugin === null) {
			return null
		} else {
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
	}
	private def resolveToText(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		val messageString = message.toString
		// 0. split the message
		val separatedMessage = if(messageString.startsWith(separator,-1)) {
			#[""]+messageString.split(separator,-1)
		} else {
			messageString.split(separator,-1).toList
		}
		if(separatedMessage.size-1 !== decorators.size) {
			throw new IllegalArgumentException
		}
		
		return '''«FOR i : 0..<decorators.size»«separatedMessage.get(i)»[«decorators.get(i).text»]«ENDFOR»«separatedMessage.last»'''
	}
	private def writeToRuntimeConsole(CharSequence message) {
		// 1. reveal the console view
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(this.runtimeConsole);
		val stream = this.runtimeConsole.newMessageStream
		stream.println(message.toString)
		stream.close
	}
	private def writeToRuntimeConsole(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		val messageString = message.toString
		// 0. split the message
		val separatedMessage = if(messageString.startsWith(separator)) {
			#[""]+messageString.split(separator,-1)
		} else {
			messageString.split(separator,-1).toList
		}
		if(separatedMessage.size-1 !== decorators.size) {
			throw new IllegalArgumentException
		}
		
		// 1. reveal the console view
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(this.runtimeConsole);
		val stream = this.runtimeConsole.newMessageStream
		
		// 2. print the segments of the view
		for(i : 0..<decorators.size) {
			stream.print(separatedMessage.get(i))
			writeDecoratedTextToRuntimeConsole(decorators.get(i),stream)
			
		}
		// 2.1 write the last segment of 
		stream.println(separatedMessage.last)
		
		//stream.println(message.toString)
		stream.close
	}
	private def writeDecoratedTextToRuntimeConsole(ScriptConsoleDecorator message, MessageConsoleStream stream) {
		val originalBackgroundColor = this.runtimeConsole.background
		var Color newColor = null;
		
		val text = '''[«message.text»]'''
		if(message.red >= 0 && message.green >= 0 && message.blue >= 0) {
			newColor = new Color(originalBackgroundColor.device,message.red,message.green,message.blue)
			this.runtimeConsole.setBackground(newColor)
		}
		stream.flush
		val CompletableFuture<Boolean> finished = new CompletableFuture<Boolean>
		val listener = new IDocumentListener() {
			override documentAboutToBeChanged(DocumentEvent event) { }
			override documentChanged(DocumentEvent event) {
				//println('''ftext="«event.fText»", message="«message.text»" endswith=«event.fText.endsWith(message.text)»''')
				if(event.fText.endsWith(text)) {
					val from = event.fDocument.length-text.length+1
					val length = message.text.length
					//println('''from: «from» length «length»''')
					try{
						runtimeConsole.addHyperlink(
							new ScriptConsoleFileHiperlink(message.hyperlink),
							from,
							length
						)
						//println("link added")
					} catch(BadLocationException e) {
						
					} finally {
						runtimeConsole.document.removeDocumentListener(this)
						finished.complete(true)
					}
				}
				
			}
		}
		runtimeConsole.document.addDocumentListener(listener)
		stream.print(text)
		stream.flush
		finished.get
		//stream.console.new
		if(message.red >= 0 && message.green >= 0 && message.blue >= 0) {
			newColor.dispose
			this.runtimeConsole.setBackground(originalBackgroundColor)
		}
	}
}
@Data
class ScriptConsoleDecorator {
	String text
	File hyperlink
	int Red
	int Green
	int Blue
	
	public new(String text) {
		this.text = text
		this.hyperlink = null
		this.Red = -1
		this.Green = -1
		this.Blue = -1
	}
	public new(String text, File hyperlink) {
		this.text = text
		this.hyperlink = hyperlink
		this.Red = -1
		this.Green = -1
		this.Blue = -1
	}
	public new(String text, int red, int green, int blue) {
		this.text = text
		this.hyperlink = null
		this.Red = red
		this.Green = green
		this.Blue = blue
	}
	public new(String text, File hyperlink, int red, int green, int blue) {
		this.text = text
		this.hyperlink = hyperlink
		this.Red = red
		this.Green = green
		this.Blue = blue
	}
}