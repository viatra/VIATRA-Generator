package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.BackendSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.MonitoredVampireSolution;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class VampireHandler {
  public MonitoredVampireSolution callSolver(final VampireModel problem, final ReasonerWorkspace workspace, final VampireSolverConfiguration configuration) {
    try {
      final String VAMPDIR = "..\\..\\Solvers\\Vampire-Solver\\ca.mcgill.ecse.dslreasoner.vampire.reasoner\\lib\\";
      final String VAMPNAME = "vampire.exe";
      final String VAMPLOC = (VAMPDIR + VAMPNAME);
      final String CVC4DIR = "..\\..\\Solvers\\Vampire-Solver\\ca.mcgill.ecse.dslreasoner.vampire.reasoner\\lib\\";
      final String CVC4NAME = "vampire.exe";
      final String CVC4LOC = (CVC4DIR + CVC4NAME);
      final String CMD = "cmd /c ";
      final String TEMPNAME = "TEMP.tptp";
      String _string = configuration.solver.toString();
      String _plus = ("solution" + _string);
      String _plus_1 = (_plus + "_");
      String _plus_2 = (_plus_1 + Integer.valueOf(configuration.typeScopes.maxNewElements));
      String _plus_3 = (_plus_2 + 
        "_");
      String _plus_4 = (_plus_3 + Integer.valueOf(configuration.iteration));
      final String SOLNNAME = (_plus_4 + ".tptp");
      final String PATH = "C:/cygwin64/bin";
      final URI wsURI = workspace.getWorkspaceURI();
      final String tempLoc = (wsURI + TEMPNAME);
      String _plus_5 = (wsURI + SOLNNAME);
      final String solnLoc = (_plus_5 + " ");
      String tempURI = workspace.writeModel(problem, TEMPNAME).toFileString();
      long startTime = (-((long) 1));
      long solverTime = (-((long) 1));
      Process p = null;
      boolean _equals = Objects.equal(configuration.solver, BackendSolver.VAMP);
      if (_equals) {
        String OPTION = " --mode casc_sat ";
        if ((configuration.runtimeLimit != (-1))) {
          OPTION = (((OPTION + "-t ") + Integer.valueOf(configuration.runtimeLimit)) + " ");
        }
        startTime = System.currentTimeMillis();
        p = Runtime.getRuntime().exec((((((CMD + VAMPLOC) + OPTION) + tempLoc) + " > ") + solnLoc), ((String[])Conversions.unwrapArray(CollectionLiterals.<String>newArrayList(("Path=" + PATH)), String.class)));
        p.waitFor();
        long _currentTimeMillis = System.currentTimeMillis();
        long _minus = (_currentTimeMillis - startTime);
        solverTime = _minus;
      }
      boolean _equals_1 = Objects.equal(configuration.solver, BackendSolver.CVC4);
      if (_equals_1) {
        String OPTION_1 = " SAT ";
        if ((configuration.runtimeLimit != (-1))) {
          OPTION_1 = ((" " + Integer.valueOf(configuration.runtimeLimit)) + OPTION_1);
        }
        InputOutput.<String>println((((((CMD + CVC4LOC) + tempLoc) + OPTION_1) + " > ") + solnLoc));
        p = Runtime.getRuntime().exec((((((CMD + CVC4LOC) + tempLoc) + OPTION_1) + " > ") + solnLoc), ((String[])Conversions.unwrapArray(CollectionLiterals.<String>newArrayList(("Path=" + PATH)), String.class)));
        p.waitFor();
        long _currentTimeMillis_1 = System.currentTimeMillis();
        long _minus_1 = (_currentTimeMillis_1 - startTime);
        solverTime = _minus_1;
      }
      InputStream _inputStream = p.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      final BufferedReader reader = new BufferedReader(_inputStreamReader);
      final List<String> output = CollectionLiterals.<String>newArrayList();
      String line = "";
      while ((!Objects.equal((line = reader.readLine()), null))) {
        output.add((line + "\n"));
      }
      workspace.getFile(TEMPNAME).delete();
      final EList<EObject> root = workspace.<VampireModel>readModel(VampireModel.class, SOLNNAME).eResource().getContents();
      EObject _get = root.get(0);
      return new MonitoredVampireSolution(solverTime, ((VampireModel) _get));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
