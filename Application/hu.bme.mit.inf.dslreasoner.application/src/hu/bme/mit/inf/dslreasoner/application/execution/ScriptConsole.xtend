package hu.bme.mit.inf.dslreasoner.application.execution

import java.io.File
import java.io.PrintWriter
import java.util.LinkedHashSet
import java.util.LinkedList
import java.util.Map
import org.eclipse.emf.common.util.URI
import java.io.Closeable
import java.io.IOException
import java.util.LinkedHashMap
import java.util.HashMap

class ScriptConsole implements Closeable {
	val boolean printToConsole
	val boolean cleanFiles
	
	val File messageConsoleFile
	val File errorConsoleFile
	val File statisticsConsoleFile
	val Map<File,PrintWriter> file2Writer = new HashMap
	
	val statisticsHeaderBuffer = new LinkedHashSet<String>
	val statisticsDataBuffer = new LinkedList<Map<String,? extends Object>>
	
	static val delimier = ';'
	static val empty = ""
	
	public new(
		boolean printToConsole,
		boolean cleanFiles,
		URI messageConsoleURI,
		URI errorConsoleURI,
		URI statisticsConsoleURI)
	{
		this.printToConsole = printToConsole
		this.cleanFiles = cleanFiles
		this.messageConsoleFile = messageConsoleURI.prepareFile
		this.errorConsoleFile = errorConsoleURI.prepareFile
		this.statisticsConsoleFile = statisticsConsoleURI.prepareFile
	}
	
	public def writeMessage(String message) {
		messageConsoleFile.writeToFile(message)
	}
	public def writeError(String message) {
		errorConsoleFile.writeToFile(message)
	}
	public def writeStatistics(LinkedHashMap<String,? extends Object> statistics) {
		val message = '''
			«FOR key : statistics.keySet SEPARATOR delimier»«key»«ENDFOR»
			«FOR value : statistics.values SEPARATOR delimier»«value»«ENDFOR»'''
		statisticsConsoleFile.writeToFile(message)
	}
	public def addStatistics(LinkedHashMap<String,? extends Object> statistics) {
		for(key : statistics.keySet) {
			this.statisticsHeaderBuffer.add(key);
		}
		this.statisticsDataBuffer.add(statistics)
	}
	public def flushStatistics() {
		val message = '''
			«FOR key : statisticsHeaderBuffer SEPARATOR delimier»«key»«ENDFOR»
			«FOR line : statisticsDataBuffer »
				«FOR key : statisticsHeaderBuffer»«IF line.containsKey(key)»«empty»«ELSE»«line.get(key)»«ENDIF»«ENDFOR»
			«ENDFOR»
			'''
		statisticsConsoleFile.writeToFile(message)
	}
	/**
	 * Writes a line of text to a file and the console. Initializes a writer to the file for at the first message.
	 */
	private def writeToFile(File file, String text) {
		if(file != null) {
			val writer = if(this.file2Writer.containsKey(file)) {
				this.file2Writer.get(file)
			} else {
				if(!file.exists) {
					file.createNewFile
				}
				val writer = new PrintWriter(file, "UTF-8");
				this.file2Writer.put(file,writer)
				writer
			}
			writer.println(text)
		}
		if(printToConsole) {
			println(text)
		}
	}
	
	private def prepareFile(URI uri) {
		if (uri === null) {
			return null
		} else {
			if(uri.isFile) {
				val fileString = uri.toFileString
				val file = new File(fileString)
				if (this.cleanFiles && file.exists) {
					file.delete
				}
				return file
			} else if(uri.isPlatformResource) {
				val platformString = uri.toPlatformString(true)
				val file = new File(platformString)
				if (this.cleanFiles && file.exists) {
					file.delete
				}
				return file
			} else {
				throw new UnsupportedOperationException('''Unksupported file usi: "«uri»"!''')
			}
		}
	}
	
	override close() throws IOException {
		this.file2Writer.values.forEach[close]
	}
}