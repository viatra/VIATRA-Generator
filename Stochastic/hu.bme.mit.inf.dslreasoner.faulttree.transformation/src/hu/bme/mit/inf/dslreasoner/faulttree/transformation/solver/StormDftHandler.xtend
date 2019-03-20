package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolverConfiguration
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.regex.Pattern

class StormDftException extends RuntimeException {
	new(String s) {
		super(s)
	}

	new(String s, Exception e) {
		super(s, e)
	}
}

class StormDftHandler {
	static val DOUBLE_REGEX = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"
	static val SINGLE_RESULT_GROUP = "single"
	static val LOWER_BOUND_GROUP = "lower"
	static val UPPER_BOUND_GROUP = "upper"
	static val RESULT_REGEX = '''^Result:\s*\[(?:(?<«SINGLE_RESULT_GROUP»>«DOUBLE_REGEX»)|\((?<«LOWER_BOUND_GROUP»>«DOUBLE_REGEX»),\s*(?<«UPPER_BOUND_GROUP»>«DOUBLE_REGEX»)\))\]'''
	static val RESULT_PATTERN = Pattern.compile(RESULT_REGEX)

	static val SIGNAL_EXIT_VALUE_OFFSET = 0x80
	static val SIGXCPU = 24
	static val SIGXFSZ = 25

	static val STORM_GENERAL_ERROR = (-1).bitwiseAnd(0xff)
	static val STORM_TIMEOUT = (-2).bitwiseAnd(0xff)
	static val STORM_MEMOUT = (-3).bitwiseAnd(0xff)

	def callSolver(String dftFilePath, StormDftConfiguration configuration) {
		val commandLine = configuration.toCommandLine(dftFilePath)
		val documentationLevel = configuration.documentationLevel
		val printOutput = documentationLevel == DocumentationLevel.NORMAL ||
			documentationLevel == DocumentationLevel.FULL
		val processBuilder = new ProcessBuilder().command(commandLine)
		var Process process = null
		try {
			try {
				process = processBuilder.start
				process.outputStream.close
				val result = readOutput(process.inputStream, printOutput)
				val error = readError(process.errorStream, printOutput)
				val exitValue = process.waitFor
				if (result === null) {
					interpretExitStatus(exitValue, error)
				} else {
					result
				}
			} catch (IOException e) {
				throw new StormDftException("Error during input/output handling of the stochastic solver.", e)
			}
		} catch (Exception e) {
			if (process !== null) {
				process.destroyForcibly.waitFor
			}
			throw e
		}
	}

	private def toCommandLine(extension StormDftConfiguration configuration, String dftFilePath) {
		extension val optionsBuilder = ImmutableList.builder
		add(solverPath ?: StormDftConfiguration.DEFAULT_SOLVER_PATH)
		if (runtimeLimit != SolverConfiguration.Unlimited) {
			add("--timeout", runtimeLimit.toString)
		}
		add("--precision", precision.toString)
		if (bisimulation) {
			add("--bisimulation")
		}
		if (symmetryReduction) {
			add("--symmetryreduction")
		}
		if (modularization) {
			add("--modularisation")
		}
		if (!dontCarePropagation) {
			add("--disabledc")
		}
		if (approximationInUse) {
			val heuristicName = switch (approximationHeuristic) {
				case DEPTH:
					"depth"
				default:
					throw new IllegalArgumentException("Unknown approximation heuristic: " + approximationHeuristic)
			}
			add("--approximation", approximation.toString, "--approximationheuristic", heuristicName)
		}
		add("--dftfile", dftFilePath)
		switch (objective) {
			case FtAnalysisObjective.MTTF:
				add("--expectedtime")
			FtAnalysisObjective.TimeBound:
				add("--timebound")
			default:
				throw new IllegalArgumentException("Unknown analysis objective: " + objective)
		}
		if (documentationLevel == DocumentationLevel.FULL) {
			add("--verbose")
		}
		build
	}

	private def readOutput(InputStream inputStream, boolean printOutput) {
		val bufferedReader = new BufferedReader(new InputStreamReader(inputStream))
		try {
			var String line
			while ((line = bufferedReader.readLine) !== null) {
				if (printOutput) {
					println(line)
				}
				val matcher = RESULT_PATTERN.matcher(line)
				if (matcher.find) {
					try {
						val single = matcher.group(SINGLE_RESULT_GROUP)
						if (single !== null) {
							val singleValue = Double.parseDouble(single)
							return new ReliabilityResult.Solution(singleValue)
						}
						val lower = matcher.group(LOWER_BOUND_GROUP)
						val upper = matcher.group(UPPER_BOUND_GROUP)
						if (lower !== null && upper !== null) {
							val lowerValue = Double.parseDouble(lower)
							val upperValue = Double.parseDouble(upper)
							return new ReliabilityResult.Solution(lowerValue, upperValue)
						}
						throw new StormDftException("Inconsistent stochastic solver output: " + line)
					} catch (NumberFormatException e) {
						throw new StormDftException("Malformatted number from stochastic solver.", e)
					}
				}
			}
		} finally {
			bufferedReader.close
		}
		null
	}

	private def readError(InputStream inputStream, boolean printOutput) {
		val bufferedReader = new BufferedReader(new InputStreamReader(inputStream))
		try {
			val lines = newArrayList
			var String line
			while ((line = bufferedReader.readLine) !== null) {
				if (printOutput) {
					System.err.println(line)
				}
				lines += line
			}
			lines.join("\n")
		} finally {
			bufferedReader.close
		}
	}

	private def interpretExitStatus(int exitValue, String error) {
		switch (exitValue) {
			case STORM_GENERAL_ERROR:
				throw new StormDftException("Storm error: " + error)
			case STORM_TIMEOUT,
			case SIGNAL_EXIT_VALUE_OFFSET + SIGXCPU:
				ReliabilityResult.TIMEOUT
			case STORM_MEMOUT,
			case SIGNAL_EXIT_VALUE_OFFSET + SIGXFSZ:
				ReliabilityResult.MEMOUT
			default: {
				if (exitValue > SIGNAL_EXIT_VALUE_OFFSET) {
					val signalNumber = exitValue - SIGNAL_EXIT_VALUE_OFFSET
					throw new StormDftException("Storm unexpectedly killed by signal " + signalNumber + ": " + error)
				}
				throw new StormDftException("Storm unexpectedly exit with status " + exitValue + ": " + error)
			}
		}
	}
}
