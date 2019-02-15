package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantModel;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ReliabilityModel;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ft2galileo.Ft2GalileoTransformation;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.FtAnalysisObjective;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.ReliabilityResult;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.StormDftConfiguration;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.StormDftHandler;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;

@SuppressWarnings("all")
public class StormDftSolver {
  private static final String DFT_FILE_NAME = "ft.dft";
  
  private final Ft2GalileoTransformation ft2Galileo = new Ft2GalileoTransformation();
  
  private final StormDftHandler handler = new StormDftHandler();
  
  public ReliabilityResult solve(final ReliabilityModel reliabilityModel, final StormDftConfiguration configuration, final ReasonerWorkspace reasonerWorkspace) {
    ReliabilityResult _switchResult = null;
    boolean _matched = false;
    if (reliabilityModel instanceof FaultTree) {
      _matched=true;
      _switchResult = this.solve(((FaultTree)reliabilityModel), configuration, reasonerWorkspace);
    }
    if (!_matched) {
      if (reliabilityModel instanceof ConstantModel) {
        _matched=true;
        ReliabilityResult.Solution _xblockexpression = null;
        {
          double _xifexpression = (double) 0;
          boolean _isFailed = ((ConstantModel)reliabilityModel).isFailed();
          if (_isFailed) {
            _xifexpression = 0;
          } else {
            double _switchResult_1 = (double) 0;
            final FtAnalysisObjective objective = configuration.objective;
            boolean _matched_1 = false;
            if (Objects.equal(objective, FtAnalysisObjective.MTTF)) {
              _matched_1=true;
              _switchResult_1 = Double.POSITIVE_INFINITY;
            }
            if (!_matched_1) {
              if (objective instanceof FtAnalysisObjective.TimeBound) {
                _matched_1=true;
                _switchResult_1 = 1;
              }
            }
            if (!_matched_1) {
              throw new IllegalArgumentException(("Unknown objective: " + objective));
            }
            _xifexpression = _switchResult_1;
          }
          final double result = _xifexpression;
          _xblockexpression = new ReliabilityResult.Solution(result);
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      throw new IllegalArgumentException(("Unknown reliability model: " + reliabilityModel));
    }
    return _switchResult;
  }
  
  public ReliabilityResult solve(final FaultTree faultTree, final StormDftConfiguration configuration, final ReasonerWorkspace reasonerWorkspace) {
    ReliabilityResult _xblockexpression = null;
    {
      final CharSequence galileo = this.ft2Galileo.toGalileo(faultTree);
      reasonerWorkspace.writeText(StormDftSolver.DFT_FILE_NAME, galileo);
      final String dftFilePath = reasonerWorkspace.getFile(StormDftSolver.DFT_FILE_NAME).getAbsolutePath();
      _xblockexpression = this.handler.callSolver(dftFilePath, configuration);
    }
    return _xblockexpression;
  }
}
