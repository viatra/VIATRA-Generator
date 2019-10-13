package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.BackendSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSAnd;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSExistentialQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunctionAsTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSImplies;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSInequality;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSOr;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTffTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_Support {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  protected String toIDMultiple(final String... ids) {
    final Function1<String, String> _function = (String it) -> {
      return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(it.split("\\s+"))), "_");
    };
    return IterableExtensions.join(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ids)), _function), "_");
  }
  
  protected String toID(final String ids) {
    return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ids.split("\\s+"))), "_");
  }
  
  protected VLSVariable duplicate(final VLSVariable term) {
    VLSVariable _createVLSVariable = this.factory.createVLSVariable();
    final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
      it.setName(term.getName());
    };
    return ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
  }
  
  protected VLSFunctionAsTerm duplicate(final VLSFunctionAsTerm term) {
    VLSFunctionAsTerm _createVLSFunctionAsTerm = this.factory.createVLSFunctionAsTerm();
    final Procedure1<VLSFunctionAsTerm> _function = (VLSFunctionAsTerm it) -> {
      it.setFunctor(term.getFunctor());
    };
    return ObjectExtensions.<VLSFunctionAsTerm>operator_doubleArrow(_createVLSFunctionAsTerm, _function);
  }
  
  protected VLSConstant duplicate(final VLSConstant term) {
    VLSConstant _createVLSConstant = this.factory.createVLSConstant();
    final Procedure1<VLSConstant> _function = (VLSConstant it) -> {
      it.setName(term.getName());
    };
    return ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function);
  }
  
  protected VLSFunction duplicate(final VLSFunction term) {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant(term.getConstant());
      EList<VLSTerm> _terms = term.getTerms();
      for (final VLSTerm v : _terms) {
        EList<VLSTerm> _terms_1 = it.getTerms();
        VLSVariable _duplicate = this.duplicate(((VLSVariable) v));
        _terms_1.add(_duplicate);
      }
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  protected VLSFunction duplicate(final VLSFunction term, final VLSVariable v) {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant(term.getConstant());
      EList<VLSTerm> _terms = it.getTerms();
      VLSVariable _duplicate = this.duplicate(v);
      _terms.add(_duplicate);
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  protected VLSFunction duplicate(final VLSFunction term, final List<VLSVariable> vars) {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant(term.getConstant());
      for (final VLSVariable v : vars) {
        EList<VLSTerm> _terms = it.getTerms();
        VLSVariable _duplicate = this.duplicate(v);
        _terms.add(_duplicate);
      }
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  protected VLSFunction duplicate(final VLSFunction term, final VLSFunctionAsTerm v) {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant(term.getConstant());
      EList<VLSTerm> _terms = it.getTerms();
      VLSFunctionAsTerm _duplicate = this.duplicate(v);
      _terms.add(_duplicate);
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  protected List<VLSVariable> duplicate(final List<VLSVariable> vars) {
    ArrayList<VLSVariable> newList = CollectionLiterals.<VLSVariable>newArrayList();
    for (final VLSVariable v : vars) {
      newList.add(this.duplicate(v));
    }
    return newList;
  }
  
  protected VLSConstant toConstant(final VLSFunctionAsTerm term) {
    VLSConstant _createVLSConstant = this.factory.createVLSConstant();
    final Procedure1<VLSConstant> _function = (VLSConstant it) -> {
      it.setName(term.getFunctor());
    };
    return ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function);
  }
  
  protected VLSFunction topLevelTypeFunc() {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant("object");
      EList<VLSTerm> _terms = it.getTerms();
      VLSVariable _createVLSVariable = this.factory.createVLSVariable();
      final Procedure1<VLSVariable> _function_1 = (VLSVariable it_1) -> {
        it_1.setName("A");
      };
      VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
      _terms.add(_doubleArrow);
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  protected VLSFunction topLevelTypeFunc(final VLSVariable v) {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant("object");
      EList<VLSTerm> _terms = it.getTerms();
      VLSVariable _duplicate = this.duplicate(v);
      _terms.add(_duplicate);
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  protected VLSFunction topLevelTypeFunc(final VLSFunctionAsTerm v) {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant("object");
      EList<VLSTerm> _terms = it.getTerms();
      VLSFunctionAsTerm _duplicate = this.duplicate(v);
      _terms.add(_duplicate);
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  public VLSTerm establishUniqueness(final List<VLSConstant> terms, final VLSConstant t2) {
    final List<VLSInequality> eqs = CollectionLiterals.<VLSInequality>newArrayList();
    for (final VLSConstant t1 : terms) {
      boolean _notEquals = (!Objects.equal(t1, t2));
      if (_notEquals) {
        VLSInequality _createVLSInequality = this.factory.createVLSInequality();
        final Procedure1<VLSInequality> _function = (VLSInequality it) -> {
          VLSConstant _createVLSConstant = this.factory.createVLSConstant();
          final Procedure1<VLSConstant> _function_1 = (VLSConstant it_1) -> {
            it_1.setName(t2.getName());
          };
          VLSConstant _doubleArrow = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function_1);
          it.setLeft(_doubleArrow);
          VLSConstant _createVLSConstant_1 = this.factory.createVLSConstant();
          final Procedure1<VLSConstant> _function_2 = (VLSConstant it_1) -> {
            it_1.setName(t1.getName());
          };
          VLSConstant _doubleArrow_1 = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant_1, _function_2);
          it.setRight(_doubleArrow_1);
        };
        final VLSInequality eq = ObjectExtensions.<VLSInequality>operator_doubleArrow(_createVLSInequality, _function);
        eqs.add(eq);
      }
    }
    return this.unfoldAnd(eqs);
  }
  
  protected VLSTerm unfoldAnd(final List<? extends VLSTerm> operands) {
    int _size = operands.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return IterableExtensions.head(operands);
    } else {
      int _size_1 = operands.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        VLSAnd _createVLSAnd = this.factory.createVLSAnd();
        final Procedure1<VLSAnd> _function = (VLSAnd it) -> {
          it.setLeft(IterableExtensions.head(operands));
          it.setRight(this.unfoldAnd(operands.subList(1, operands.size())));
        };
        return ObjectExtensions.<VLSAnd>operator_doubleArrow(_createVLSAnd, _function);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Logic operator with 0 operands!");
        throw new UnsupportedOperationException(_builder.toString());
      }
    }
  }
  
  protected VLSTerm unfoldOr(final List<? extends VLSTerm> operands) {
    int _size = operands.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return IterableExtensions.head(operands);
    } else {
      int _size_1 = operands.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        VLSOr _createVLSOr = this.factory.createVLSOr();
        final Procedure1<VLSOr> _function = (VLSOr it) -> {
          it.setLeft(IterableExtensions.head(operands));
          it.setRight(this.unfoldOr(operands.subList(1, operands.size())));
        };
        return ObjectExtensions.<VLSOr>operator_doubleArrow(_createVLSOr, _function);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Logic operator with 0 operands!");
        throw new UnsupportedOperationException(_builder.toString());
      }
    }
  }
  
  protected VLSTerm unfoldDistinctTerms(final Logic2VampireLanguageMapper m, final EList<Term> operands, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    int _size = operands.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return m.transformTerm(IterableExtensions.<Term>head(operands), trace, variables);
    } else {
      int _size_1 = operands.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        int _size_2 = operands.size();
        int _size_3 = operands.size();
        int _multiply = (_size_2 * _size_3);
        int _divide = (_multiply / 2);
        final ArrayList<VLSTerm> notEquals = new ArrayList<VLSTerm>(_divide);
        int _size_4 = operands.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_4, true);
        for (final Integer i : _doubleDotLessThan) {
          int _size_5 = operands.size();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(((i).intValue() + 1), _size_5, true);
          for (final Integer j : _doubleDotLessThan_1) {
            VLSInequality _createVLSInequality = this.factory.createVLSInequality();
            final Procedure1<VLSInequality> _function = (VLSInequality it) -> {
              it.setLeft(m.transformTerm(operands.get((i).intValue()), trace, variables));
              it.setRight(m.transformTerm(operands.get((j).intValue()), trace, variables));
            };
            VLSInequality _doubleArrow = ObjectExtensions.<VLSInequality>operator_doubleArrow(_createVLSInequality, _function);
            notEquals.add(_doubleArrow);
          }
        }
        return this.unfoldAnd(notEquals);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Logic operator with 0 operands!");
        throw new UnsupportedOperationException(_builder.toString());
      }
    }
  }
  
  /**
   * def protected  String toID(List<String> ids) {
   * 	ids.map[it.split("\\s+").join("'")].join("'")
   * }
   */
  protected VLSTerm createQuantifiedExpression(final Logic2VampireLanguageMapper mapper, final QuantifiedExpression expression, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables, final boolean isUniversal) {
    VLSTerm _xblockexpression = null;
    {
      final Function1<Variable, VLSVariable> _function = (Variable v) -> {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function_1 = (VLSVariable it) -> {
          it.setName(this.toIDMultiple("V", v.getName()));
        };
        return ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
      };
      final Map<Variable, VLSVariable> variableMap = IterableExtensions.<Variable, VLSVariable>toInvertedMap(expression.getQuantifiedVariables(), _function);
      final ArrayList<VLSTerm> typedefs = new ArrayList<VLSTerm>();
      EList<Variable> _quantifiedVariables = expression.getQuantifiedVariables();
      for (final Variable variable : _quantifiedVariables) {
        {
          TypeReference _range = variable.getRange();
          final VLSFunction eq = this.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(((ComplexTypeReference) _range).getReferred(), trace.type2Predicate), 
            CollectionsUtil.<Variable, VLSVariable>lookup(variable, variableMap));
          typedefs.add(eq);
        }
      }
      VLSTerm _xifexpression = null;
      if (isUniversal) {
        VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
        final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it) -> {
          EList<VLSTffTerm> _variables = it.getVariables();
          Collection<VLSVariable> _values = variableMap.values();
          Iterables.<VLSTffTerm>addAll(_variables, _values);
          VLSImplies _createVLSImplies = this.factory.createVLSImplies();
          final Procedure1<VLSImplies> _function_2 = (VLSImplies it_1) -> {
            it_1.setLeft(this.unfoldAnd(typedefs));
            it_1.setRight(mapper.transformTerm(expression.getExpression(), trace, this.withAddition(variables, variableMap)));
          };
          VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_2);
          it.setOperand(_doubleArrow);
        };
        _xifexpression = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_1);
      } else {
        VLSExistentialQuantifier _xblockexpression_1 = null;
        {
          typedefs.add(mapper.transformTerm(expression.getExpression(), trace, this.withAddition(variables, variableMap)));
          VLSExistentialQuantifier _createVLSExistentialQuantifier = this.factory.createVLSExistentialQuantifier();
          final Procedure1<VLSExistentialQuantifier> _function_2 = (VLSExistentialQuantifier it) -> {
            EList<VLSTffTerm> _variables = it.getVariables();
            Collection<VLSVariable> _values = variableMap.values();
            Iterables.<VLSTffTerm>addAll(_variables, _values);
            it.setOperand(this.unfoldAnd(typedefs));
          };
          _xblockexpression_1 = ObjectExtensions.<VLSExistentialQuantifier>operator_doubleArrow(_createVLSExistentialQuantifier, _function_2);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected boolean dfsSupertypeCheck(final Type type, final Type type2) {
    boolean _xifexpression = false;
    boolean _isEmpty = type.getSupertypes().isEmpty();
    if (_isEmpty) {
      return false;
    } else {
      boolean _xifexpression_1 = false;
      boolean _contains = type.getSupertypes().contains(type2);
      if (_contains) {
        return true;
      } else {
        EList<Type> _supertypes = type.getSupertypes();
        for (final Type supertype : _supertypes) {
          boolean _dfsSupertypeCheck = this.dfsSupertypeCheck(supertype, type2);
          if (_dfsSupertypeCheck) {
            return true;
          }
        }
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected boolean dfsSubtypeCheck(final Type type, final Type type2) {
    boolean _xifexpression = false;
    boolean _isEmpty = type.getSubtypes().isEmpty();
    if (_isEmpty) {
      return false;
    } else {
      boolean _xifexpression_1 = false;
      boolean _contains = type.getSubtypes().contains(type2);
      if (_contains) {
        return true;
      } else {
        EList<Type> _subtypes = type.getSubtypes();
        for (final Type subtype : _subtypes) {
          boolean _dfsSubtypeCheck = this.dfsSubtypeCheck(subtype, type2);
          if (_dfsSubtypeCheck) {
            return true;
          }
        }
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected void listSubtypes(final Type t, final List<Type> allSubtypes) {
    EList<Type> _subtypes = t.getSubtypes();
    for (final Type subt : _subtypes) {
      {
        allSubtypes.add(subt);
        this.listSubtypes(subt, allSubtypes);
      }
    }
  }
  
  protected HashMap<Variable, VLSVariable> withAddition(final Map<Variable, VLSVariable> map1, final Map<Variable, VLSVariable> map2) {
    HashMap<Variable, VLSVariable> _hashMap = new HashMap<Variable, VLSVariable>(map1);
    final Procedure1<HashMap<Variable, VLSVariable>> _function = (HashMap<Variable, VLSVariable> it) -> {
      it.putAll(map2);
    };
    return ObjectExtensions.<HashMap<Variable, VLSVariable>>operator_doubleArrow(_hashMap, _function);
  }
  
  public String makeForm(final String formula, final BackendSolver solver, final int time) {
    String _header = this.getHeader();
    String _plus = (_header + formula);
    String _addOptions = this.addOptions();
    String _plus_1 = (_plus + _addOptions);
    String _addSolver = this.addSolver(solver, time);
    String _plus_2 = (_plus_1 + _addSolver);
    String _addEnd = this.addEnd();
    return (_plus_2 + _addEnd);
  }
  
  public ArrayList<String> getSolverSpecs(final BackendSolver solver) {
    if (solver != null) {
      switch (solver) {
        case CVC4:
          return CollectionLiterals.<String>newArrayList("CVC4---SAT-1.7", "do_CVC4 %s %d SAT");
        case DARWINFM:
          return CollectionLiterals.<String>newArrayList("DarwinFM---1.4.5", "darwin -fd true -ppp true -pl 0 -to %d -pmtptp true %s");
        case EDARWIN:
          return CollectionLiterals.<String>newArrayList("E-Darwin---1.5", 
            "e-darwin -pev \"TPTP\" -pmd true -if tptp -pl 2 -pc false -ps false %s");
        case GEOIII:
          return CollectionLiterals.<String>newArrayList("Geo-III---2018C", 
            "geo -tptp_input -nonempty -include /home/tptp/TPTP -inputfile %s");
        case IPROVER:
          return CollectionLiterals.<String>newArrayList("iProver---SAT-3.0", "iproveropt_run_sat.sh %d %s");
        case PARADOX:
          return CollectionLiterals.<String>newArrayList("Paradox---4.0", "paradox --no-progress --time %d --tstp --model %s");
        case VAMPIRE:
          return CollectionLiterals.<String>newArrayList("Vampire---SAT-4.4", "vampire --mode casc_sat -t %d %s");
        case Z3:
          return CollectionLiterals.<String>newArrayList("Z3---4.4.1", "run_z3_tptp -proof -model -t:%d -file:%s");
        default:
          break;
      }
    }
    return null;
  }
  
  public String getHeader() {
    return "------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"ProblemSource\"\r\n\r\nFORMULAE\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"FORMULAEProblem\"\r\n\r\n\r\n";
  }
  
  public String addSpec(final String spec) {
    return spec.replace("\n", "\\r\\n");
  }
  
  public String addOptions() {
    return "\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"QuietFlag\"\r\n\r\n-q3\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"SubmitButton\"\r\n\r\nRunSelectedSystems\r\n";
  }
  
  public String addSolver(final BackendSolver solver, final int time) {
    final ArrayList<String> solverSpecs = this.getSolverSpecs(solver);
    final String ID = solverSpecs.get(0);
    final String cmd = solverSpecs.get(1);
    return (((((((((((("------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"TimeLimit___" + ID) + 
      "\"\r\n\r\n") + Integer.valueOf(time)) + 
      "\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"System___") + ID) + 
      "\"\r\n\r\n") + ID) + 
      "\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"Command___") + ID) + 
      "\"\r\n\r\n") + cmd) + "\r\n");
  }
  
  public String addEnd() {
    return "------WebKitFormBoundaryBdFiQ5zEvTbBl4DA--";
  }
  
  public ArrayList<String> sendPost(final String formData) throws Exception {
    final OkHttpClient client = new OkHttpClient.Builder().connectTimeout(600, TimeUnit.SECONDS).readTimeout(350, 
      TimeUnit.SECONDS).build();
    final MediaType mediaType = MediaType.parse("multipart/form-data boundary=----WebKitFormBoundaryBdFiQ5zEvTbBl4DA");
    final RequestBody body = RequestBody.create(mediaType, formData);
    final Request request = new Request.Builder().url("http://www.tptp.org/cgi-bin/SystemOnTPTPFormReply").post(body).addHeader("Connection", "keep-alive").addHeader("Cache-Control", "max-age=0").addHeader("Origin", 
      "http://tptp.cs.miami.edu").addHeader("Upgrade-Insecure-Requests", "1").addHeader("Content-Type", 
      "multipart/form-data boundary=----WebKitFormBoundaryBdFiQ5zEvTbBl4DA").addHeader("User-Agent", 
      "Mozilla/5.0 (Windows NT 10.0 Win64 x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36").addHeader("Accept", 
      "text/html,application/xhtml+xml,application/xmlq=0.9,image/webp,image/apng,*/*q=0.8,application/signed-exchangev=b3").addHeader("Referer", "http://tptp.cs.miami.edu/cgi-bin/SystemOnTPTP").addHeader("Accept-Encoding", 
      "gzip, deflate").addHeader("Accept-Language", "en-US,enq=0.9").addHeader("Postman-Token", 
      "639ff59f-ab5c-4d9f-9da5-ac8bb64be466,ecb71882-f4d8-4126-8a97-4edb07d4055c").addHeader("Host", 
      "www.tptp.org").addHeader("Content-Length", "44667").addHeader("cache-control", "no-cache").build();
    final Response response = client.newCall(request).execute();
    return CollectionLiterals.<String>newArrayList(response.body().string().split("\n"));
  }
}
