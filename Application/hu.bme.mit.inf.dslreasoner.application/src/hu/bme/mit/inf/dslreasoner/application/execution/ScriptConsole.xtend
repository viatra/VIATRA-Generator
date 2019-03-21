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
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.Data

abstract class ScriptConsole {
	val boolean printToConsole
	val ReasonerWorkspace messageWorkspace;
	val String messageFileName;
	val ReasonerWorkspace errorWorkspace;
	val String errorFileName;
	val ReasonerWorkspace statisticsWorkspace;
	val String statisticsFileName;
	val List<String> errorMessagesDuringInitialisation = new LinkedList;

	val statisticsHeaderBuffer = new LinkedHashSet<String>
	val statisticsDataBuffer = new LinkedList<Map<String, ? extends Object>>

	static val delimier = ';'
	static val empty = ""

	new(boolean printToConsole, boolean cleanFiles, URI messageConsoleURI, URI errorConsoleURI,
		URI statisticsConsoleURI) {
		this.messageWorkspace = prepareWorkspace(messageConsoleURI, errorMessagesDuringInitialisation)
		this.messageFileName = prepareFileName(messageConsoleURI)
		this.errorWorkspace = prepareWorkspace(errorConsoleURI, errorMessagesDuringInitialisation)
		this.errorFileName = prepareFileName(errorConsoleURI)
		this.statisticsWorkspace = prepareWorkspace(statisticsConsoleURI, errorMessagesDuringInitialisation)
		this.statisticsFileName = prepareFileName(statisticsConsoleURI)

		this.printToConsole = printToConsole
	}

	/**
	 * Writes any error messages that occurred during console initialization.
	 * 
	 * Should be called by implementations at the end of their constructors.
	 */
	protected final def writeErrorMessagesDuringInitialisation() {
		errorMessagesDuringInitialisation.forEach [
			this.writeError('''Error during console initialisation: "«it»"''')
		]
		errorMessagesDuringInitialisation.clear
	}

	def void writeMessage(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		val resolvedText = this.resolveToText(message, separator, decorators)
		if (messageWorkspace !== null) {
			messageWorkspace.writeText(messageFileName, resolvedText);
		}
		if (printToConsole) {
			println(resolvedText)
		}
	}

	def void writeMessage(String message) {
		if (messageWorkspace !== null) {
			messageWorkspace.writeText(messageFileName, message);
		}
		if (printToConsole) {
			println(message)
		}
	}

	def void writeError(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		val resolvedText = this.resolveToText(message, separator, decorators)
		if (errorWorkspace !== null) {
			errorWorkspace.writeText(errorFileName, resolvedText);
		}
		println(message)
	}

	def void writeError(String message) {
		if (errorWorkspace !== null) {
			errorWorkspace.writeText(errorFileName, message);
		}
		println(message)
	}

	def writeStatistics(LinkedHashMap<String, ? extends Object> statistics) {
		if (statisticsWorkspace !== null) {
			val message = '''
			«FOR key : statistics.keySet SEPARATOR delimier»«key»«ENDFOR»
			«FOR value : statistics.values SEPARATOR delimier»«value»«ENDFOR»'''
			statisticsWorkspace.writeText(statisticsFileName, message);
		}
	}

	def addStatistics(LinkedHashMap<String, ? extends Object> statistics) {
		for (key : statistics.keySet) {
			this.statisticsHeaderBuffer.add(key);
		}
		this.statisticsDataBuffer.add(statistics)
	}

	def flushStatistics() {
		if (statisticsWorkspace !== null) {
			val message = '''
				«FOR key : statisticsHeaderBuffer SEPARATOR delimier»«key»«ENDFOR»
				«FOR line : statisticsDataBuffer»
					«FOR key : statisticsHeaderBuffer SEPARATOR delimier»«IF line.containsKey(key)»«line.get(key)»«ELSE»«empty»«ENDIF»«ENDFOR»
				«ENDFOR»
			'''
			statisticsWorkspace.writeText(statisticsFileName, message);
			statisticsHeaderBuffer.clear
			statisticsDataBuffer.clear
		}
	}

	private def prepareWorkspace(URI uri, List<String> errors) {
		if (uri === null) {
			return null
		} else {
			try {
				val folderURI = uri.trimSegments(1)
				if (folderURI.isFile) {
					return new FileSystemWorkspace(folderURI.toString, "") => [init]
				} else if (folderURI.isPlatformResource) {
					return new ProjectWorkspace(folderURI.toString, "") => [init]
				} else {
					throw new UnsupportedOperationException('''Unsupported file usi: "«uri»"!''')
				}
			} catch (Exception e) {
				errors += e.message
				return null
			}
		}
	}

	private def prepareFileName(URI uri) {
		if (uri !== null) {
			return uri.lastSegment
		} else {
			null
		}
	}

	private def resolveToText(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		val messageString = message.toString
		// 0. split the message
		val separatedMessage = if (messageString.startsWith(separator, -1)) {
				#[""] + messageString.split(separator, -1)
			} else {
				messageString.split(separator, -1).toList
			}
		if (separatedMessage.size - 1 !== decorators.size) {
			throw new IllegalArgumentException
		}

		return '''«FOR i : 0..<decorators.size»«separatedMessage.get(i)»[«decorators.get(i).text»]«ENDFOR»«separatedMessage.last»'''
	}

	@FunctionalInterface
	interface Factory {
		def ScriptConsole createScriptConsole(boolean cleanFiles, URI messageConsoleURI, URI errorConsoleURI,
			URI statisticsConsoleURI)
	}
}

class StandardOutputBasedScriptConsole extends ScriptConsole {
	new(boolean cleanFiles, URI messageConsoleURI, URI errorConsoleURI, URI statisticsConsoleURI) {
		super(true, cleanFiles, messageConsoleURI, errorConsoleURI, statisticsConsoleURI)
		writeErrorMessagesDuringInitialisation()
	}

	public static val FACTORY = new ScriptConsole.Factory {
		override createScriptConsole(boolean cleanFiles, URI messageConsoleURI, URI errorConsoleURI,
			URI statisticsConsoleURI) {
			new StandardOutputBasedScriptConsole(cleanFiles, messageConsoleURI, errorConsoleURI, statisticsConsoleURI)
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

	new(String text) {
		this.text = text
		this.hyperlink = null
		this.Red = -1
		this.Green = -1
		this.Blue = -1
	}

	new(String text, File hyperlink) {
		this.text = text
		this.hyperlink = hyperlink
		this.Red = -1
		this.Green = -1
		this.Blue = -1
	}

	new(String text, int red, int green, int blue) {
		this.text = text
		this.hyperlink = null
		this.Red = red
		this.Green = green
		this.Blue = blue
	}

	new(String text, File hyperlink, int red, int green, int blue) {
		this.text = text
		this.hyperlink = hyperlink
		this.Red = red
		this.Green = green
		this.Blue = blue
	}
}
