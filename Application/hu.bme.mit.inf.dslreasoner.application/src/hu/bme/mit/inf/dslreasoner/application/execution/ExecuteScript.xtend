package hu.bme.mit.inf.dslreasoner.application.execution

import org.apache.log4j.Logger
import org.apache.log4j.LogManager
import org.apache.log4j.Level
import java.io.PrintStream
import java.io.OutputStream
import java.io.BufferedWriter
import java.io.Writer

class ExecuteScript {
	def static void main(String[] args) {
		val Logger logger = LogManager.getLogger(ExecuteScript);
		logger.level = Level::DEBUG
		
		println()
		System.out.println("asd")
		
		logger.debug("debug")
		logger.info("info")
		logger.warn("warning")
		logger.error("error")
		logger.fatal("fatal")
	}
}