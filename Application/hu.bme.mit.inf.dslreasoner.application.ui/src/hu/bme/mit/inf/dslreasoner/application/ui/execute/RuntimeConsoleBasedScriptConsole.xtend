package hu.bme.mit.inf.dslreasoner.application.ui.execute

import hu.bme.mit.inf.dslreasoner.application.execution.ScriptConsole
import hu.bme.mit.inf.dslreasoner.application.execution.ScriptConsoleDecorator
import java.util.concurrent.CompletableFuture
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.text.BadLocationException
import org.eclipse.jface.text.DocumentEvent
import org.eclipse.jface.text.IDocumentListener
import org.eclipse.swt.graphics.Color
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream

class RuntimeConsoleBasedScriptConsole extends ScriptConsole {
	/**
	 * Console is identified with the name of this class.
	 */
	static val consoleID = ScriptConsole.name

	val MessageConsole runtimeConsole

	new(boolean cleanFiles, URI messageConsoleURI, URI errorConsoleURI, URI statisticsConsoleURI) {
		super(!hasConsolePlugin, cleanFiles, messageConsoleURI, errorConsoleURI, statisticsConsoleURI)
		runtimeConsole = prepareRuntimeConsole
		writeErrorMessagesDuringInitialisation()
	}

	override writeMessage(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		super.writeMessage(message, separator, decorators)
		if (runtimeConsole !== null) {
			writeToRuntimeConsole(message, separator, decorators)
		}
	}

	override writeMessage(String message) {
		super.writeMessage(message)
		if (runtimeConsole !== null) {
			writeToRuntimeConsole(message)
		}
	}

	override writeError(CharSequence message, String separator, ScriptConsoleDecorator[] decorators) {
		super.writeError(message, separator, decorators)
		if (runtimeConsole !== null) {
			writeToRuntimeConsole(message, separator, decorators)
		}
	}

	override writeError(String message) {
		super.writeError(message)
		if (runtimeConsole !== null) {
			writeToRuntimeConsole(message)
		}
	}

	private def MessageConsole prepareRuntimeConsole() {
		val plugin = ConsolePlugin.getDefault();
		if (plugin === null) {
			return null
		} else {
			val conMan = plugin.getConsoleManager();
			val existingConsoles = conMan.getConsoles();
			val existingConsolesWithID = existingConsoles.filter[it.name.equals(consoleID)]
			if (existingConsolesWithID.empty) {
				val MessageConsole res = new MessageConsole(consoleID, null)
				conMan.addConsoles(#[res]);

				return res
			} else {
				return existingConsolesWithID.head as MessageConsole
			}
		}
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
		val separatedMessage = if (messageString.startsWith(separator)) {
				#[""] + messageString.split(separator, -1)
			} else {
				messageString.split(separator, -1).toList
			}
		if (separatedMessage.size - 1 !== decorators.size) {
			throw new IllegalArgumentException
		}

		// 1. reveal the console view
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(this.runtimeConsole);
		val stream = this.runtimeConsole.newMessageStream

		// 2. print the segments of the view
		for (i : 0 ..< decorators.size) {
			stream.print(separatedMessage.get(i))
			writeDecoratedTextToRuntimeConsole(decorators.get(i), stream)

		}
		// 2.1 write the last segment of 
		stream.println(separatedMessage.last)

		// stream.println(message.toString)
		stream.close
	}

	private def writeDecoratedTextToRuntimeConsole(ScriptConsoleDecorator message, MessageConsoleStream stream) {
		val originalBackgroundColor = this.runtimeConsole.background
		var Color newColor = null;

		val text = '''[«message.text»]'''
		if (message.red >= 0 && message.green >= 0 && message.blue >= 0) {
			newColor = new Color(originalBackgroundColor.device, message.red, message.green, message.blue)
			this.runtimeConsole.setBackground(newColor)
		}
		stream.flush
		val CompletableFuture<Boolean> finished = new CompletableFuture<Boolean>
		val listener = new IDocumentListener() {
			override documentAboutToBeChanged(DocumentEvent event) {}

			override documentChanged(DocumentEvent event) {
				// println('''ftext="«event.fText»", message="«message.text»" endswith=«event.fText.endsWith(message.text)»''')
				if (event.fText.endsWith(text)) {
					val from = event.fDocument.length - text.length + 1
					val length = message.text.length
					// println('''from: «from» length «length»''')
					try {
						runtimeConsole.addHyperlink(
							new ScriptConsoleFileHiperlink(message.hyperlink),
							from,
							length
						)
					// println("link added")
					} catch (BadLocationException e) {
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
		// stream.console.new
		if (message.red >= 0 && message.green >= 0 && message.blue >= 0) {
			newColor.dispose
			this.runtimeConsole.setBackground(originalBackgroundColor)
		}
	}

	private static def hasConsolePlugin() {
		ConsolePlugin.getDefault() !== null
	}

	public static val FACTORY = new ScriptConsole.Factory {

		override createScriptConsole(boolean cleanFiles, URI messageConsoleURI, URI errorConsoleURI,
			URI statisticsConsoleURI) {
			new RuntimeConsoleBasedScriptConsole(cleanFiles, messageConsoleURI, errorConsoleURI, statisticsConsoleURI)
		}

	}
}
