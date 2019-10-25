package ca.mcgill.ecse.dslreasoner.vampire.reasoner;

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup;
import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetupGenerated;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.MonitoredVampireSolution;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Vampire2LogicMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireHandler;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireModelInterpretation;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class VampireSolver extends LogicReasoner {
  public VampireSolver() {
    VampireLanguagePackage.eINSTANCE.eClass();
    final VampireLanguageStandaloneSetupGenerated x = new VampireLanguageStandaloneSetupGenerated();
    VampireLanguageStandaloneSetup.doSetup();
  }
  
  private final Logic2VampireLanguageMapper forwardMapper = new Logic2VampireLanguageMapper();
  
  private final Vampire2LogicMapper backwardMapper = new Vampire2LogicMapper();
  
  private final VampireHandler handler = new VampireHandler();
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  @Extension
  private final LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE;
  
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  @Override
  public LogicResult solve(final LogicProblem problem, final LogicSolverConfiguration config, final ReasonerWorkspace workspace) throws LogicReasonerException {
    try {
      final VampireSolverConfiguration vampireConfig = this.asConfig(config);
      String fileName = (((("problem_" + Integer.valueOf(vampireConfig.typeScopes.minNewElements)) + "-") + 
        Integer.valueOf(vampireConfig.typeScopes.maxNewElements)) + ".tptp");
      final long transformationStart = System.currentTimeMillis();
      final TracedOutput<VampireModel, Logic2VampireLanguageMapperTrace> result = this.forwardMapper.transformProblem(problem, vampireConfig);
      long _currentTimeMillis = System.currentTimeMillis();
      final long transformationTime = (_currentTimeMillis - transformationStart);
      final VampireModel vampireProblem = result.getOutput();
      final Logic2VampireLanguageMapperTrace forwardTrace = result.getTrace();
      String fileURI = null;
      String vampireCode = null;
      vampireCode = workspace.writeModelToString(vampireProblem, fileName);
      final boolean writeFile = ((vampireConfig.documentationLevel == DocumentationLevel.NORMAL) || 
        (vampireConfig.documentationLevel == DocumentationLevel.FULL));
      if (writeFile) {
        fileURI = workspace.writeModel(vampireProblem, fileName).toFileString();
      }
      if (vampireConfig.genModel) {
        if (vampireConfig.server) {
          final String form = this.support.makeForm(vampireCode, vampireConfig.solver, vampireConfig.runtimeLimit);
          ArrayList<String> response = CollectionLiterals.<String>newArrayList();
          int ind = 0;
          boolean done = false;
          InputOutput.<String>print(" ");
          while ((!done)) {
            {
              InputOutput.<String>print("(x)");
              done = false;
              response = this.support.sendPost(form);
              boolean responseFound = false;
              ind = 0;
              while ((!responseFound)) {
                {
                  String line = response.get(ind);
                  if (((line.length() >= 5) && Objects.equal(line.substring(0, 5), "ERROR"))) {
                    done = false;
                    responseFound = true;
                  } else {
                    boolean _equals = Objects.equal(line, "</PRE>");
                    if (_equals) {
                      done = true;
                      responseFound = true;
                    }
                  }
                  ind++;
                }
              }
            }
          }
          final String satRaw = response.get((ind - 3));
          final String modRaw = response.get((ind - 2));
          final ArrayList<String> sat = CollectionLiterals.<String>newArrayList(satRaw.split(" "));
          final ArrayList<String> mod = CollectionLiterals.<String>newArrayList(modRaw.split(" "));
          final String satOut = sat.get(1);
          final String modOut = mod.get(1);
          final String satTime = sat.get(2);
          final String modTime = mod.get(2);
          InputOutput.println();
          InputOutput.<ArrayList<String>>println(sat);
          InputOutput.<ArrayList<String>>println(mod);
          ModelResult _createModelResult = this.resultFactory.createModelResult();
          final Procedure1<ModelResult> _function = (ModelResult it) -> {
            it.setProblem(null);
            EList<Object> _representation = it.getRepresentation();
            VampireModel _createVampireModel = this.factory.createVampireModel();
            final Procedure1<VampireModel> _function_1 = (VampireModel it_1) -> {
            };
            VampireModel _doubleArrow = ObjectExtensions.<VampireModel>operator_doubleArrow(_createVampireModel, _function_1);
            _representation.add(_doubleArrow);
            it.setTrace(it.getTrace());
            Statistics _createStatistics = this.resultFactory.createStatistics();
            final Procedure1<Statistics> _function_2 = (Statistics it_1) -> {
              it_1.setTransformationTime(((int) transformationTime));
              EList<StatisticEntry> _entries = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_3 = (StringStatisticEntry it_2) -> {
                it_2.setName("satOut");
                it_2.setValue(satOut);
              };
              StringStatisticEntry _doubleArrow_1 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry, _function_3);
              _entries.add(_doubleArrow_1);
              EList<StatisticEntry> _entries_1 = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry_1 = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_4 = (StringStatisticEntry it_2) -> {
                it_2.setName("satTime");
                it_2.setValue(satTime);
              };
              StringStatisticEntry _doubleArrow_2 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry_1, _function_4);
              _entries_1.add(_doubleArrow_2);
              EList<StatisticEntry> _entries_2 = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry_2 = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_5 = (StringStatisticEntry it_2) -> {
                it_2.setName("modOut");
                it_2.setValue(modOut);
              };
              StringStatisticEntry _doubleArrow_3 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry_2, _function_5);
              _entries_2.add(_doubleArrow_3);
              EList<StatisticEntry> _entries_3 = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry_3 = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_6 = (StringStatisticEntry it_2) -> {
                it_2.setName("modTime");
                it_2.setValue(modTime);
              };
              StringStatisticEntry _doubleArrow_4 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry_3, _function_6);
              _entries_3.add(_doubleArrow_4);
            };
            Statistics _doubleArrow_1 = ObjectExtensions.<Statistics>operator_doubleArrow(_createStatistics, _function_2);
            it.setStatistics(_doubleArrow_1);
          };
          return ObjectExtensions.<ModelResult>operator_doubleArrow(_createModelResult, _function);
        } else {
          InputOutput.println();
          final MonitoredVampireSolution vampSol = this.handler.callSolver(vampireProblem, workspace, vampireConfig);
          String modOut_1 = "no";
          boolean _isFiniteModelGenerated = vampSol.isFiniteModelGenerated();
          if (_isFiniteModelGenerated) {
            modOut_1 = "FiniteModel";
          }
          final String realModOut = modOut_1;
          ModelResult _createModelResult_1 = this.resultFactory.createModelResult();
          final Procedure1<ModelResult> _function_1 = (ModelResult it) -> {
            it.setProblem(null);
            EList<Object> _representation = it.getRepresentation();
            VampireModel _createVampireModel = this.factory.createVampireModel();
            final Procedure1<VampireModel> _function_2 = (VampireModel it_1) -> {
            };
            VampireModel _doubleArrow = ObjectExtensions.<VampireModel>operator_doubleArrow(_createVampireModel, _function_2);
            _representation.add(_doubleArrow);
            it.setTrace(it.getTrace());
            Statistics _createStatistics = this.resultFactory.createStatistics();
            final Procedure1<Statistics> _function_3 = (Statistics it_1) -> {
              it_1.setTransformationTime(((int) transformationTime));
              EList<StatisticEntry> _entries = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_4 = (StringStatisticEntry it_2) -> {
                it_2.setName("satOut");
                it_2.setValue("-");
              };
              StringStatisticEntry _doubleArrow_1 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry, _function_4);
              _entries.add(_doubleArrow_1);
              EList<StatisticEntry> _entries_1 = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry_1 = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_5 = (StringStatisticEntry it_2) -> {
                it_2.setName("satTime");
                it_2.setValue("-");
              };
              StringStatisticEntry _doubleArrow_2 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry_1, _function_5);
              _entries_1.add(_doubleArrow_2);
              EList<StatisticEntry> _entries_2 = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry_2 = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_6 = (StringStatisticEntry it_2) -> {
                it_2.setName("modOut");
                it_2.setValue(realModOut);
              };
              StringStatisticEntry _doubleArrow_3 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry_2, _function_6);
              _entries_2.add(_doubleArrow_3);
              EList<StatisticEntry> _entries_3 = it_1.getEntries();
              StringStatisticEntry _createStringStatisticEntry_3 = this.resultFactory.createStringStatisticEntry();
              final Procedure1<StringStatisticEntry> _function_7 = (StringStatisticEntry it_2) -> {
                it_2.setName("modTime");
                long _solverTime = vampSol.getSolverTime();
                it_2.setValue(Double.valueOf((_solverTime / 1000.0)).toString());
              };
              StringStatisticEntry _doubleArrow_4 = ObjectExtensions.<StringStatisticEntry>operator_doubleArrow(_createStringStatisticEntry_3, _function_7);
              _entries_3.add(_doubleArrow_4);
            };
            Statistics _doubleArrow_1 = ObjectExtensions.<Statistics>operator_doubleArrow(_createStatistics, _function_3);
            it.setStatistics(_doubleArrow_1);
          };
          return ObjectExtensions.<ModelResult>operator_doubleArrow(_createModelResult_1, _function_1);
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public VampireSolverConfiguration asConfig(final LogicSolverConfiguration configuration) {
    if ((configuration instanceof VampireSolverConfiguration)) {
      return ((VampireSolverConfiguration)configuration);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The configuration have to be an ");
      String _simpleName = VampireSolverConfiguration.class.getSimpleName();
      _builder.append(_simpleName);
      _builder.append("!");
      throw new IllegalArgumentException(_builder.toString());
    }
  }
  
  @Override
  public List<? extends LogicModelInterpretation> getInterpretations(final ModelResult modelResult) {
    List<VampireModelInterpretation> _xblockexpression = null;
    {
      final EList<Object> sols = modelResult.getRepresentation();
      final Function1<Object, VampireModelInterpretation> _function = (Object it) -> {
        Object _trace = modelResult.getTrace();
        return new VampireModelInterpretation(
          ((VampireModel) it), 
          ((Logic2VampireLanguageMapperTrace) _trace));
      };
      _xblockexpression = ListExtensions.<Object, VampireModelInterpretation>map(sols, _function);
    }
    return _xblockexpression;
  }
}
