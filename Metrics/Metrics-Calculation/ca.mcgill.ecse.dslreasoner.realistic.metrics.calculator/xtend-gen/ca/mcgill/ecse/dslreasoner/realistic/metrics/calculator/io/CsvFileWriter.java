package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CsvFileWriter {
  public static void write(final ArrayList<ArrayList<String>> datas, final String uri) {
    try {
      int _size = datas.size();
      boolean _lessEqualsThan = (_size <= 0);
      if (_lessEqualsThan) {
        return;
      }
      File _file = new File(uri);
      final PrintWriter writer = new PrintWriter(_file);
      CsvFileWriter.output(writer, datas, uri);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void append(final ArrayList<ArrayList<String>> datas, final String uri) {
    try {
      int _size = datas.size();
      boolean _lessEqualsThan = (_size <= 0);
      if (_lessEqualsThan) {
        return;
      }
      File _file = new File(uri);
      FileOutputStream _fileOutputStream = new FileOutputStream(_file, true);
      final PrintWriter writer = new PrintWriter(_fileOutputStream);
      CsvFileWriter.output(writer, datas, uri);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static void output(final PrintWriter writer, final ArrayList<ArrayList<String>> datas, final String uri) {
    try {
      final StringBuilder output = new StringBuilder();
      for (final List<String> datarow : datas) {
        {
          for (int i = 0; (i < (datarow.size() - 1)); i++) {
            String _get = datarow.get(i);
            String _plus = (_get + ",");
            output.append(_plus);
          }
          int _size = datarow.size();
          boolean _greaterEqualsThan = (_size >= 1);
          if (_greaterEqualsThan) {
            int _size_1 = datarow.size();
            int _minus = (_size_1 - 1);
            output.append(datarow.get(_minus));
            output.append("\n");
          }
        }
      }
      writer.write(output.toString());
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof FileNotFoundException) {
        final FileNotFoundException e = (FileNotFoundException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
