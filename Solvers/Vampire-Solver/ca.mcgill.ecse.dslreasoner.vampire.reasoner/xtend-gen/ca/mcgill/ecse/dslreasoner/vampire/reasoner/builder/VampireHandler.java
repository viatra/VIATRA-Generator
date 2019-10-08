package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

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

@SuppressWarnings("all")
public class VampireHandler {
  public MonitoredVampireSolution callSolver(final VampireModel problem, final ReasonerWorkspace workspace, final VampireSolverConfiguration configuration) {
    try {
      final String CMD = "cmd /c ";
      final String VAMPDIR = "..\\..\\Solvers\\Vampire-Solver\\ca.mcgill.ecse.dslreasoner.vampire.reasoner\\lib\\";
      final String VAMPNAME = "vampire.exe";
      final String TEMPNAME = "TEMP.tptp";
      final String OPTION = " --mode casc_sat -t 300 ";
      final String SOLNNAME = (((("solution" + Integer.valueOf(configuration.typeScopes.maxNewElements)) + "_") + Integer.valueOf(configuration.iteration)) + ".tptp");
      final String PATH = "C:/cygwin64/bin";
      final URI wsURI = workspace.getWorkspaceURI();
      final String tempLoc = (wsURI + TEMPNAME);
      String _plus = (wsURI + SOLNNAME);
      final String solnLoc = (_plus + " ");
      final String vampLoc = (VAMPDIR + VAMPNAME);
      String tempURI = workspace.writeModel(problem, TEMPNAME).toFileString();
      long startTime = System.currentTimeMillis();
      final Process p = Runtime.getRuntime().exec((((((CMD + vampLoc) + OPTION) + tempLoc) + " > ") + solnLoc), ((String[])Conversions.unwrapArray(CollectionLiterals.<String>newArrayList(("Path=" + PATH)), String.class)));
      p.waitFor();
      long _currentTimeMillis = System.currentTimeMillis();
      final long solverTime = (_currentTimeMillis - startTime);
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
