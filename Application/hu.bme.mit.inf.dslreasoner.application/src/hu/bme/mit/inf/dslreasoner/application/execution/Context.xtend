package hu.bme.mit.inf.dslreasoner.application.execution

import java.io.OutputStream
import java.util.LinkedList
import java.util.List
import java.io.FileWriter
import org.eclipse.xtend.lib.annotations.Accessors

class Context {
	@Accessors(PUBLIC_GETTER,PUBLIC_SETTER)
	var boolean printToConsole = true
	
	def writeError(Object object) {
		if(printToConsole) {
			println(object)
		}
	}
}