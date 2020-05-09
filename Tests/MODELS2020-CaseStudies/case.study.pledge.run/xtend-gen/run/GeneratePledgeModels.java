package run;

import Taxation.TaxationPackage;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import familytree.FamilytreePackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicTrace;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import queries.Case_study_A;
import queries.FamilyTreeConstraints;

@SuppressWarnings("all")
public class GeneratePledgeModels {
  private static final int SIZE_LB = 20;
  
  private static final int SIZE_UB = 20;
  
  private static final int SIZE_MUL = 1;
  
  private static final int SIZE_INC = 5;
  
  private static int REPS = 1;
  
  private static final int RUNTIME = 600;
  
  private static final String DOMAIN = "FamilyTree";
  
  private static final boolean QUERIES = false;
  
  private static final boolean INDIV_WRT = true;
  
  private static final boolean GLOBAL_WRT = true;
  
  private static final String q2t = new Function0<String>() {
    @Override
    public String apply() {
      String _xifexpression = null;
      if (GeneratePledgeModels.QUERIES) {
        _xifexpression = "Y";
      } else {
        _xifexpression = "N";
      }
      return _xifexpression;
    }
  }.apply();
  
  public static void main(final String[] args) {
    try {
      new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Map<String, Object> _extensionToFactoryMap_1 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
      _extensionToFactoryMap_1.put("logicproblem", _xMIResourceFactoryImpl_1);
      Map<String, Object> _extensionToFactoryMap_2 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_2 = new XMIResourceFactoryImpl();
      _extensionToFactoryMap_2.put("partialmodel", _xMIResourceFactoryImpl_2);
      ReteEngine.class.getClass();
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      long _currentTimeMillis = System.currentTimeMillis();
      final Date date = new Date(_currentTimeMillis);
      final SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
      final String formattedDate = format.format(date);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("inputs/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("output/");
      final FileSystemWorkspace dataws = new FileSystemWorkspace(_builder_1.toString(), "");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("output/");
      String _plus = (_builder_2.toString() + formattedDate);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("/models/");
      String _plus_1 = (_plus + _builder_3);
      final FileSystemWorkspace modelsws = new FileSystemWorkspace(_plus_1, "");
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("output/");
      String _plus_2 = (_builder_4.toString() + formattedDate);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("/");
      String _plus_3 = (_plus_2 + _builder_5);
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_plus_3, "");
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("output/");
      String _plus_4 = (_builder_6.toString() + GeneratePledgeModels.DOMAIN);
      String _plus_5 = (_plus_4 + "-");
      String _plus_6 = (_plus_5 + formattedDate);
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("/debug/");
      String _plus_7 = (_plus_6 + _builder_7);
      final FileSystemWorkspace debug = new FileSystemWorkspace(_plus_7, "");
      workspace.initAndClear();
      modelsws.initAndClear();
      InputOutput.<String>println("Input and output workspaces are created");
      EcoreMetamodelDescriptor metamodel = null;
      EList<EObject> partialModel = null;
      ViatraQuerySetDescriptor queries = null;
      final String DOMAIN = GeneratePledgeModels.DOMAIN;
      if (DOMAIN != null) {
        switch (DOMAIN) {
          case "Taxation":
            metamodel = GeneratePledgeModels.loadMetamodel(TaxationPackage.eINSTANCE);
            partialModel = GeneratePledgeModels.loadPartialModel(inputs, "Household.xmi");
            queries = GeneratePledgeModels.loadQueries(metamodel, Case_study_A.instance());
            break;
          case "FamilyTree":
            metamodel = GeneratePledgeModels.loadMetamodel(FamilytreePackage.eINSTANCE);
            partialModel = GeneratePledgeModels.loadPartialModel(inputs, "FamilyTree.xmi");
            queries = GeneratePledgeModels.loadQueries(metamodel, FamilyTreeConstraints.instance());
            break;
          default:
            {
              System.err.println("Unsupported Domain");
              throw new Exception();
            }
        }
      } else {
        {
          System.err.println("Unsupported Domain");
          throw new Exception();
        }
      }
      InputOutput.<String>println("DSL loaded");
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      LogicProblem problem = modelGenerationProblem.getOutput();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel);
      problem = modelExtensionProblem.getOutput();
      if (GeneratePledgeModels.QUERIES) {
        Viatra2LogicConfiguration _viatra2LogicConfiguration = new Viatra2LogicConfiguration();
        final TracedOutput<LogicProblem, Viatra2LogicTrace> validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem, _viatra2LogicConfiguration);
        problem = validModelExtensionProblem.getOutput();
      }
      InputOutput.<String>println("Problem created");
      PrintWriter global_writer = null;
      final String header = "domain, queries?,size,model?,timeout,measuredTime,TransformatonTime,SolverTime\n";
      if (GeneratePledgeModels.GLOBAL_WRT) {
        URI _workspaceURI = workspace.getWorkspaceURI();
        String _plus_8 = (_workspaceURI + "//_");
        String _plus_9 = (_plus_8 + GeneratePledgeModels.DOMAIN);
        String _plus_10 = (_plus_9 + Integer.valueOf(GeneratePledgeModels.SIZE_LB));
        String _plus_11 = (_plus_10 + "to");
        String _plus_12 = (_plus_11 + Integer.valueOf(GeneratePledgeModels.SIZE_UB));
        String _plus_13 = (_plus_12 + "x");
        String _plus_14 = (_plus_13 + Integer.valueOf(GeneratePledgeModels.REPS));
        String _plus_15 = (_plus_14 + "q");
        String _plus_16 = (_plus_15 + GeneratePledgeModels.q2t);
        String _plus_17 = (_plus_16 + "-");
        String _plus_18 = (_plus_17 + formattedDate);
        String _plus_19 = (_plus_18 + ".csv");
        PrintWriter _printWriter = new PrintWriter(_plus_19);
        global_writer = _printWriter;
        global_writer.append(header);
      }
      int NEXT_INC = GeneratePledgeModels.SIZE_INC;
      {
        int size = GeneratePledgeModels.SIZE_LB;
        boolean _while = (size <= GeneratePledgeModels.SIZE_UB);
        while (_while) {
          {
            int _NEXT_INC = NEXT_INC;
            NEXT_INC = (_NEXT_INC * GeneratePledgeModels.SIZE_MUL);
            PrintWriter indiv_writer = null;
            if (GeneratePledgeModels.INDIV_WRT) {
              URI _workspaceURI_1 = workspace.getWorkspaceURI();
              String _plus_20 = (_workspaceURI_1 + "//__");
              String _plus_21 = (_plus_20 + GeneratePledgeModels.DOMAIN);
              String _plus_22 = (_plus_21 + "Sz");
              String _plus_23 = (_plus_22 + Integer.valueOf(size));
              String _plus_24 = (_plus_23 + "x");
              String _plus_25 = (_plus_24 + Integer.valueOf(GeneratePledgeModels.REPS));
              String _plus_26 = (_plus_25 + "q");
              String _plus_27 = (_plus_26 + GeneratePledgeModels.q2t);
              String _plus_28 = (_plus_27 + "-");
              String _plus_29 = (_plus_28 + formattedDate);
              String _plus_30 = (_plus_29 + 
                ".csv");
              PrintWriter _printWriter_1 = new PrintWriter(_plus_30);
              indiv_writer = _printWriter_1;
              indiv_writer.append(header);
            }
            InputOutput.println();
            InputOutput.<String>println(((("DOMAIN: " + GeneratePledgeModels.DOMAIN) + ", SIZE=") + Integer.valueOf(size)));
            for (int i = 0; (i < GeneratePledgeModels.REPS); i++) {
              {
                InputOutput.<String>print((("<<Run number " + Integer.valueOf(i)) + ">> : "));
                ViatraReasoner reasoner = new ViatraReasoner();
                final TreeSet<Integer> knownIntegers = new TreeSet<Integer>();
                CollectionExtensions.<Integer>addAll(knownIntegers, Integer.valueOf(0), Integer.valueOf(10), Integer.valueOf(20), Integer.valueOf(30), Integer.valueOf(40), Integer.valueOf(50));
                final TreeSet<BigDecimal> knownReals = new TreeSet<BigDecimal>();
                BigDecimal _bigDecimal = new BigDecimal("0.0");
                CollectionExtensions.<BigDecimal>addAll(knownReals, _bigDecimal);
                final TreeSet<String> knownStrings = new TreeSet<String>();
                CollectionExtensions.<String>addAll(knownStrings, "r0", "r1", "r2", "r3", "r4", "r5", "r6");
                final int curSize = size;
                ViatraReasonerConfiguration _viatraReasonerConfiguration = new ViatraReasonerConfiguration();
                final Procedure1<ViatraReasonerConfiguration> _function = (ViatraReasonerConfiguration it) -> {
                  it.documentationLevel = DocumentationLevel.NONE;
                  it.runtimeLimit = GeneratePledgeModels.RUNTIME;
                  it.typeScopes.minNewElements = curSize;
                  boolean _isEmpty = knownReals.isEmpty();
                  boolean _not = (!_isEmpty);
                  if (_not) {
                    it.typeScopes.knownReals = knownReals;
                  }
                };
                final ViatraReasonerConfiguration solverConfig = ObjectExtensions.<ViatraReasonerConfiguration>operator_doubleArrow(_viatraReasonerConfiguration, _function);
                final long startTime = System.currentTimeMillis();
                LogicResult solution = reasoner.solve(problem, solverConfig, debug);
                long _currentTimeMillis_1 = System.currentTimeMillis();
                final long measuredTime = (_currentTimeMillis_1 - startTime);
                InputOutput.<String>print("<<END");
                Class<? extends LogicResult> _class = solution.getClass();
                String _string = Boolean.valueOf(Objects.equal(_class, ModelResultImpl.class)).toString();
                String _plus_31 = ((((((GeneratePledgeModels.DOMAIN + ",") + Boolean.valueOf(GeneratePledgeModels.QUERIES)) + ",") + Integer.valueOf(size)) + ",") + _string);
                String _plus_32 = (_plus_31 + 
                  ",");
                String _plus_33 = (_plus_32 + Integer.valueOf(GeneratePledgeModels.RUNTIME));
                String _plus_34 = (_plus_33 + ",");
                String _plus_35 = (_plus_34 + Double.valueOf((measuredTime / 1000.0)));
                String _plus_36 = (_plus_35 + ",");
                int _transformationTime = solution.getStatistics().getTransformationTime();
                double _divide = (_transformationTime / 1000.0);
                String _plus_37 = (_plus_36 + Double.valueOf(_divide));
                String _plus_38 = (_plus_37 + 
                  ",");
                int _solverTime = solution.getStatistics().getSolverTime();
                double _divide_1 = (_solverTime / 1000.0);
                String _plus_39 = (_plus_38 + Double.valueOf(_divide_1));
                final String toAddtoCSV = (_plus_39 + "\n");
                if (GeneratePledgeModels.GLOBAL_WRT) {
                  global_writer.append(toAddtoCSV);
                }
                if (GeneratePledgeModels.INDIV_WRT) {
                  indiv_writer.append(toAddtoCSV);
                }
                InputOutput.<String>println((("->" + Double.valueOf((measuredTime / 1000.0))) + "s"));
                try {
                  if ((solution instanceof ModelResult)) {
                    String _plus_40 = (Integer.valueOf(size) + "_");
                    String _plus_41 = (_plus_40 + Integer.valueOf(i));
                    GeneratePledgeModels.writeInterpretation(solution, logic2Ecore, modelsws, _plus_41, reasoner, modelGenerationProblem);
                    InputOutput.<String>println(" (XMI Success)");
                  }
                } catch (final Throwable _t) {
                  if (_t instanceof Exception) {
                    final Exception e = (Exception)_t;
                    String _message = e.getMessage();
                    String _plus_42 = (" (XMI Error)" + _message);
                    System.err.println(_plus_42);
                  } else {
                    throw Exceptions.sneakyThrow(_t);
                  }
                }
                try {
                  if ((solution instanceof ModelResult)) {
                    String _plus_40 = (Integer.valueOf(size) + "_");
                    String _plus_41 = (_plus_40 + Integer.valueOf(i));
                    GeneratePledgeModels.writeRepresentation(solution, modelsws, _plus_41);
                    InputOutput.<String>println(" (VIZ Success) >>");
                  }
                } catch (final Throwable _t) {
                  if (_t instanceof Exception) {
                    final Exception e = (Exception)_t;
                    String _message = e.getMessage();
                    String _plus_42 = (" (VIZ Error)" + _message);
                    String _plus_43 = (_plus_42 + ">>");
                    System.err.println(_plus_43);
                  } else {
                    throw Exceptions.sneakyThrow(_t);
                  }
                }
                InputOutput.println();
                final Runtime r = Runtime.getRuntime();
                r.gc();
                r.gc();
                r.gc();
                Thread.sleep(3000);
              }
            }
            if (GeneratePledgeModels.INDIV_WRT) {
              indiv_writer.close();
            }
          }
          int _size = size;
          size = (_size + NEXT_INC);
          _while = (size <= GeneratePledgeModels.SIZE_UB);
        }
      }
      if (GeneratePledgeModels.GLOBAL_WRT) {
        global_writer.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Map<Type, Integer> getTypeMap(final Map<Class, Integer> classMap, final EcoreMetamodelDescriptor metamodel, final Ecore2Logic e2l, final Ecore2Logic_Trace trace) {
    final HashMap<Type, Integer> typeMap = new HashMap<Type, Integer>();
    final Function1<EClass, String> _function = (EClass s) -> {
      return s.getName();
    };
    final Map<String, EClass> listMap = IterableExtensions.<String, EClass>toMap(metamodel.getClasses(), _function);
    Set<Class> _keySet = classMap.keySet();
    for (final Class elem : _keySet) {
      typeMap.put(
        e2l.TypeofEClass(trace, 
          listMap.get(elem.getSimpleName())), classMap.get(elem));
    }
    return typeMap;
  }
  
  public static EcoreMetamodelDescriptor loadMetamodel(final EPackage pckg) {
    final List<EClass> classes = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
    final List<EEnum> enums = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
    final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
      return it.getELiterals();
    };
    final List<EEnumLiteral> literals = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(ListExtensions.<EEnum, EList<EEnumLiteral>>map(enums, _function)));
    final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
      return it.getEReferences();
    };
    final List<EReference> references = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(ListExtensions.<EClass, EList<EReference>>map(classes, _function_1)));
    final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
      return it.getEAttributes();
    };
    final List<EAttribute> attributes = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(ListExtensions.<EClass, EList<EAttribute>>map(classes, _function_2)));
    return new EcoreMetamodelDescriptor(classes, Collections.<EClass>unmodifiableSet(CollectionLiterals.<EClass>newHashSet()), false, enums, literals, references, attributes);
  }
  
  public static EList<EObject> loadPartialModel(final ReasonerWorkspace inputs, final String path) {
    EList<EObject> _xblockexpression = null;
    {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      _xblockexpression = inputs.<EObject>readModel(EObject.class, path).eResource().getContents();
    }
    return _xblockexpression;
  }
  
  public static ViatraQuerySetDescriptor loadQueries(final EcoreMetamodelDescriptor metamodel, final IQueryGroup i) {
    final List<IQuerySpecification<?>> patterns = IterableExtensions.<IQuerySpecification<?>>toList(i.getSpecifications());
    final Function1<IQuerySpecification<?>, Boolean> _function = (IQuerySpecification<?> it) -> {
      final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it_1) -> {
        String _name = it_1.getName();
        return Boolean.valueOf(Objects.equal(_name, "Constraint"));
      };
      return Boolean.valueOf(IterableExtensions.<PAnnotation>exists(it.getAllAnnotations(), _function_1));
    };
    final Set<IQuerySpecification<?>> wfPatterns = IterableExtensions.<IQuerySpecification<?>>toSet(IterableExtensions.<IQuerySpecification<?>>filter(patterns, _function));
    final Map<IQuerySpecification<?>, EStructuralFeature> derivedFeatures = CollectionLiterals.<IQuerySpecification<?>, EStructuralFeature>emptyMap();
    final ViatraQuerySetDescriptor res = new ViatraQuerySetDescriptor(patterns, wfPatterns, derivedFeatures);
    return res;
  }
  
  public static void writeInterpretation(final LogicResult solution, final Logic2Ecore logic2Ecore, final ReasonerWorkspace workspace, final String id, final ViatraReasoner reasoner, final TracedOutput<LogicProblem, Ecore2Logic_Trace> mgProb) {
    final List<? extends LogicModelInterpretation> interpretations = reasoner.getInterpretations(((ModelResult) solution));
    int _size = interpretations.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer interpIndex : _doubleDotLessThan) {
      {
        final LogicModelInterpretation interpretation = interpretations.get((interpIndex).intValue());
        final EObject model = logic2Ecore.transformInterpretation(interpretation, mgProb.getTrace());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("sol-");
        _builder.append(id);
        _builder.append("_");
        _builder.append(interpIndex);
        _builder.append(".xmi");
        workspace.writeModel(model, _builder.toString());
      }
    }
  }
  
  public static void writeRepresentation(final LogicResult solution, final ReasonerWorkspace workspace, final String id) {
    final EList<Object> representations = solution.getRepresentation();
    int _size = representations.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer representationIndex : _doubleDotLessThan) {
      {
        final Object representation = representations.get((representationIndex).intValue());
        if ((representation instanceof PartialInterpretation)) {
          final String gml = new PartialInterpretation2Gml().transform(((PartialInterpretation)representation));
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("sol-");
          _builder.append(id);
          _builder.append("_");
          _builder.append(representationIndex);
          _builder.append(".gml");
          workspace.writeText(_builder.toString(), gml);
          final PartialInterpretationVisualisation png = new GraphvizVisualiser().visualiseConcretization(((PartialInterpretation)representation));
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("sol-");
          _builder_1.append(id);
          _builder_1.append("_");
          _builder_1.append(representationIndex);
          _builder_1.append(".png");
          png.writeToFile(workspace, _builder_1.toString());
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("sol-");
          _builder_2.append(representationIndex);
          _builder_2.append(".txt");
          workspace.writeText(_builder_2.toString(), representation.toString());
        }
      }
    }
  }
  
  public static String writeStats(final LogicResult solution, final long time, final ViatraReasonerConfiguration config) {
    String _xblockexpression = null;
    {
      final Statistics stats = solution.getStatistics();
      InputOutput.<String>println("  Statistics:");
      Object _xifexpression = null;
      if ((config.typeScopes.maxNewElements == 2147483647)) {
        _xifexpression = "*";
      } else {
        _xifexpression = Integer.valueOf(config.typeScopes.maxNewElements);
      }
      String _plus = ((("    #new nodes    : [" + Integer.valueOf(config.typeScopes.minNewElements)) + "..") + _xifexpression);
      String _plus_1 = (_plus + "]");
      InputOutput.<String>println(_plus_1);
      _xblockexpression = InputOutput.<String>println((("    \"solve\" time: " + Double.valueOf((((double) time) / 1000))) + " s"));
    }
    return _xblockexpression;
  }
}
