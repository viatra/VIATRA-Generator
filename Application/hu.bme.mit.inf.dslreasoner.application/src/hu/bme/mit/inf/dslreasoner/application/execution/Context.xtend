package hu.bme.mit.inf.dslreasoner.application.execution

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