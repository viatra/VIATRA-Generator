package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.ApproximationHeuristic;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.FtAnalysisObjective;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.ReliabilityResult;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.StormDftConfiguration;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.StormDftException;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolverConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class StormDftHandler {
  private static final String DOUBLE_REGEX = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
  
  private static final String SINGLE_RESULT_GROUP = "single";
  
  private static final String LOWER_BOUND_GROUP = "lower";
  
  private static final String UPPER_BOUND_GROUP = "upper";
  
  private static final String RESULT_REGEX = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("^Result:\\s*\\[(?:(?<");
      _builder.append(StormDftHandler.SINGLE_RESULT_GROUP);
      _builder.append(">");
      _builder.append(StormDftHandler.DOUBLE_REGEX);
      _builder.append(")|\\((?<");
      _builder.append(StormDftHandler.LOWER_BOUND_GROUP);
      _builder.append(">");
      _builder.append(StormDftHandler.DOUBLE_REGEX);
      _builder.append("),\\s*(?<");
      _builder.append(StormDftHandler.UPPER_BOUND_GROUP);
      _builder.append(">");
      _builder.append(StormDftHandler.DOUBLE_REGEX);
      _builder.append(")\\))\\]");
      return _builder.toString();
    }
  }.apply();
  
  private static final Pattern RESULT_PATTERN = Pattern.compile(StormDftHandler.RESULT_REGEX);
  
  private static final int SIGNAL_EXIT_VALUE_OFFSET = 0x80;
  
  private static final int SIGXCPU = 24;
  
  private static final int SIGXFSZ = 25;
  
  private static final int STORM_GENERAL_ERROR = ((-1) & 0xff);
  
  private static final int STORM_TIMEOUT = ((-2) & 0xff);
  
  private static final int STORM_MEMOUT = ((-3) & 0xff);
  
  public ReliabilityResult callSolver(final String dftFilePath, final StormDftConfiguration configuration) {
    try {
      ReliabilityResult _xblockexpression = null;
      {
        final ImmutableList<String> commandLine = this.toCommandLine(configuration, dftFilePath);
        final DocumentationLevel documentationLevel = configuration.documentationLevel;
        final boolean printOutput = (Objects.equal(documentationLevel, DocumentationLevel.NORMAL) || 
          Objects.equal(documentationLevel, DocumentationLevel.FULL));
        final ProcessBuilder processBuilder = new ProcessBuilder().command(commandLine);
        Process process = null;
        ReliabilityResult _xtrycatchfinallyexpression = null;
        try {
          ReliabilityResult _xtrycatchfinallyexpression_1 = null;
          try {
            ReliabilityResult _xblockexpression_1 = null;
            {
              process = processBuilder.start();
              process.getOutputStream().close();
              final ReliabilityResult.Solution result = this.readOutput(process.getInputStream(), printOutput);
              final String error = this.readError(process.getErrorStream(), printOutput);
              final int exitValue = process.waitFor();
              ReliabilityResult _xifexpression = null;
              if ((result == null)) {
                _xifexpression = this.interpretExitStatus(exitValue, error);
              } else {
                _xifexpression = result;
              }
              _xblockexpression_1 = _xifexpression;
            }
            _xtrycatchfinallyexpression_1 = _xblockexpression_1;
          } catch (final Throwable _t) {
            if (_t instanceof IOException) {
              final IOException e = (IOException)_t;
              throw new StormDftException("Error during input/output handling of the stochastic solver.", e);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          _xtrycatchfinallyexpression = _xtrycatchfinallyexpression_1;
        } catch (final Throwable _t_1) {
          if (_t_1 instanceof Exception) {
            final Exception e_1 = (Exception)_t_1;
            if ((process != null)) {
              process.destroyForcibly().waitFor();
            }
            throw e_1;
          } else {
            throw Exceptions.sneakyThrow(_t_1);
          }
        }
        _xblockexpression = _xtrycatchfinallyexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private ImmutableList<String> toCommandLine(@Extension final StormDftConfiguration configuration, final String dftFilePath) {
    ImmutableList<String> _xblockexpression = null;
    {
      @Extension
      final ImmutableList.Builder<String> optionsBuilder = ImmutableList.<String>builder();
      String _elvis = null;
      if (configuration.solverPath != null) {
        _elvis = configuration.solverPath;
      } else {
        _elvis = StormDftConfiguration.DEFAULT_SOLVER_PATH;
      }
      optionsBuilder.add(_elvis);
      if ((configuration.runtimeLimit != SolverConfiguration.Unlimited)) {
        optionsBuilder.add("--timeout", Integer.valueOf(configuration.runtimeLimit).toString());
      }
      optionsBuilder.add("--precision", Double.valueOf(configuration.precision).toString());
      if (configuration.bisimulation) {
        optionsBuilder.add("--bisimulation");
      }
      if (configuration.symmetryReduction) {
        optionsBuilder.add("--symmetryreduction");
      }
      if (configuration.modularization) {
        optionsBuilder.add("--modularisation");
      }
      if ((!configuration.dontCarePropagation)) {
        optionsBuilder.add("--disabledc");
      }
      boolean _isApproximationInUse = configuration.isApproximationInUse();
      if (_isApproximationInUse) {
        String _switchResult = null;
        final ApproximationHeuristic approximationHeuristic = configuration.approximationHeuristic;
        if (approximationHeuristic != null) {
          switch (approximationHeuristic) {
            case DEPTH:
              _switchResult = "depth";
              break;
            default:
              throw new IllegalArgumentException(("Unknown approximation heuristic: " + configuration.approximationHeuristic));
          }
        } else {
          throw new IllegalArgumentException(("Unknown approximation heuristic: " + configuration.approximationHeuristic));
        }
        final String heuristicName = _switchResult;
        optionsBuilder.add("--approximation", Double.valueOf(configuration.approximation).toString(), "--approximationheuristic", heuristicName);
      }
      optionsBuilder.add("--dftfile", dftFilePath);
      final FtAnalysisObjective objective = configuration.objective;
      boolean _matched = false;
      if (Objects.equal(objective, FtAnalysisObjective.MTTF)) {
        _matched=true;
        optionsBuilder.add("--expectedtime");
      }
      if (!_matched) {
        if (objective instanceof FtAnalysisObjective.TimeBound) {
          _matched=true;
          optionsBuilder.add("--timebound");
        }
      }
      if (!_matched) {
        throw new IllegalArgumentException(("Unknown analysis objective: " + configuration.objective));
      }
      boolean _equals = Objects.equal(configuration.documentationLevel, DocumentationLevel.FULL);
      if (_equals) {
        optionsBuilder.add("--verbose");
      }
      _xblockexpression = optionsBuilder.build();
    }
    return _xblockexpression;
  }
  
  private ReliabilityResult.Solution readOutput(final InputStream inputStream, final boolean printOutput) {
    try {
      Object _xblockexpression = null;
      {
        InputStreamReader _inputStreamReader = new InputStreamReader(inputStream);
        final BufferedReader bufferedReader = new BufferedReader(_inputStreamReader);
        try {
          String line = null;
          while (((line = bufferedReader.readLine()) != null)) {
            {
              if (printOutput) {
                InputOutput.<String>println(line);
              }
              final Matcher matcher = StormDftHandler.RESULT_PATTERN.matcher(line);
              boolean _find = matcher.find();
              if (_find) {
                try {
                  final String single = matcher.group(StormDftHandler.SINGLE_RESULT_GROUP);
                  if ((single != null)) {
                    final double singleValue = Double.parseDouble(single);
                    return new ReliabilityResult.Solution(singleValue);
                  }
                  final String lower = matcher.group(StormDftHandler.LOWER_BOUND_GROUP);
                  final String upper = matcher.group(StormDftHandler.UPPER_BOUND_GROUP);
                  if (((lower != null) && (upper != null))) {
                    final double lowerValue = Double.parseDouble(lower);
                    final double upperValue = Double.parseDouble(upper);
                    return new ReliabilityResult.Solution(lowerValue, upperValue);
                  }
                  throw new StormDftException(("Inconsistent stochastic solver output: " + line));
                } catch (final Throwable _t) {
                  if (_t instanceof NumberFormatException) {
                    final NumberFormatException e = (NumberFormatException)_t;
                    throw new StormDftException("Malformatted number from stochastic solver.", e);
                  } else {
                    throw Exceptions.sneakyThrow(_t);
                  }
                }
              }
            }
          }
        } finally {
          bufferedReader.close();
        }
        _xblockexpression = null;
      }
      return ((ReliabilityResult.Solution)_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String readError(final InputStream inputStream, final boolean printOutput) {
    try {
      String _xblockexpression = null;
      {
        InputStreamReader _inputStreamReader = new InputStreamReader(inputStream);
        final BufferedReader bufferedReader = new BufferedReader(_inputStreamReader);
        String _xtrycatchfinallyexpression = null;
        try {
          String _xblockexpression_1 = null;
          {
            final ArrayList<String> lines = CollectionLiterals.<String>newArrayList();
            String line = null;
            while (((line = bufferedReader.readLine()) != null)) {
              {
                if (printOutput) {
                  System.err.println(line);
                }
                lines.add(line);
              }
            }
            _xblockexpression_1 = IterableExtensions.join(lines, "\n");
          }
          _xtrycatchfinallyexpression = _xblockexpression_1;
        } finally {
          bufferedReader.close();
        }
        _xblockexpression = _xtrycatchfinallyexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private ReliabilityResult.Unknown interpretExitStatus(final int exitValue, final String error) {
    ReliabilityResult.Unknown _switchResult = null;
    boolean _matched = false;
    if (Objects.equal(exitValue, StormDftHandler.STORM_GENERAL_ERROR)) {
      _matched=true;
      throw new StormDftException(("Storm error: " + error));
    }
    if (!_matched) {
      if (Objects.equal(exitValue, StormDftHandler.STORM_TIMEOUT)) {
        _matched=true;
      }
      if (!_matched) {
        if (Objects.equal(exitValue, (StormDftHandler.SIGNAL_EXIT_VALUE_OFFSET + StormDftHandler.SIGXCPU))) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = ReliabilityResult.TIMEOUT;
      }
    }
    if (!_matched) {
      if (Objects.equal(exitValue, StormDftHandler.STORM_MEMOUT)) {
        _matched=true;
      }
      if (!_matched) {
        if (Objects.equal(exitValue, (StormDftHandler.SIGNAL_EXIT_VALUE_OFFSET + StormDftHandler.SIGXFSZ))) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = ReliabilityResult.MEMOUT;
      }
    }
    if (!_matched) {
      {
        if ((exitValue > StormDftHandler.SIGNAL_EXIT_VALUE_OFFSET)) {
          final int signalNumber = (exitValue - StormDftHandler.SIGNAL_EXIT_VALUE_OFFSET);
          throw new StormDftException(((("Storm unexpectedly killed by signal " + Integer.valueOf(signalNumber)) + ": ") + error));
        }
        throw new StormDftException(((("Storm unexpectedly exit with status " + Integer.valueOf(exitValue)) + ": ") + error));
      }
    }
    return _switchResult;
  }
}
