package hu.bme.mit.inf.dslreasoner.diversitycalculator;

import hu.bme.mit.inf.dslreasoner.diversitycalculator.MeasureDiversity;
import java.io.File;
import java.util.Comparator;

@SuppressWarnings("all")
public class FileComparator implements Comparator<File> {
  @Override
  public int compare(final File arg0, final File arg1) {
    int _xblockexpression = (int) 0;
    {
      final int r1 = Integer.parseInt(MeasureDiversity.runIndex(arg0.getName()));
      final int r2 = Integer.parseInt(MeasureDiversity.runIndex(arg1.getName()));
      final int runRes = Integer.compare(r1, r2);
      if ((runRes == 0)) {
        final int a = Integer.parseInt(MeasureDiversity.modelIndex(arg0.getName()));
        final int b = Integer.parseInt(MeasureDiversity.modelIndex(arg1.getName()));
        Integer.compare(a, b);
      } else {
        return runRes;
      }
      _xblockexpression = arg0.getName().compareTo(arg1.getName());
    }
    return _xblockexpression;
  }
}
