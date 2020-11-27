package modes3.run;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EReferenceMapper_RelationsOverTypes_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsFactory;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolutionScope;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.VariableContext;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicTrace;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorConstraints;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorSolver;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveConfiguration;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveElementConfiguration;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DebugConfiguration;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.PartialModelAsLogicInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveKind;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold;
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import modes3.Modes3Factory;
import modes3.Modes3ModelRoot;
import modes3.Modes3Package;
import modes3.queries.CloseTrains_step_2;
import modes3.queries.CloseTrains_step_3;
import modes3.queries.CloseTrains_step_4;
import modes3.queries.CloseTrains_step_5;
import modes3.queries.CloseTrains_step_6;
import modes3.queries.CloseTrains_step_7;
import modes3.queries.EndOfSiding_step_2;
import modes3.queries.EndOfSiding_step_3;
import modes3.queries.EndOfSiding_step_4;
import modes3.queries.EndOfSiding_step_5;
import modes3.queries.MisalignedTurnout_step_2;
import modes3.queries.MisalignedTurnout_step_3;
import modes3.queries.MisalignedTurnout_step_4;
import modes3.queries.MisalignedTurnout_step_5;
import modes3.queries.Modes3Queries;
import modes3.queries.TrainLocations_step_2;
import modes3.queries.TrainLocations_step_3;
import modes3.run.CloseTrainsObjectiveHint;
import modes3.run.EndOfSidingObjectiveHint;
import modes3.run.MisalignedTurnoutObjectiveHint;
import modes3.run.Modes3TypeScopeHint;
import modes3.run.Modes3UnitPropagationGenerator;
import modes3.run.TrainLocationsObjectiveHint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@FinalFieldsConstructor
@SuppressWarnings("all")
public class Modes3ModelGenerator {
  private enum MonitoringQuery {
    closeTrains,
    
    trainLocations,
    
    endOfSiding,
    
    misalignedTurnout;
  }
  
  private final Modes3ModelGenerator.MonitoringQuery monitoringQuery;
  
  private final int modelSize;
  
  private final Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
  
  private final Viatra2Logic viatra2Logic = new Viatra2Logic(this.ecore2Logic);
  
  private final ViatraReasoner solver = new ViatraReasoner();
  
  @Extension
  private final LogicProblemBuilder _logicProblemBuilder = new LogicProblemBuilder();
  
  public URI generate() {
    try {
      URI _xblockexpression = null;
      {
        final EcoreMetamodelDescriptor metamodel = Modes3ModelGenerator.createMetamodelDescriptor();
        Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
        final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelLogic = this.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
        final Type segment = this.ecore2Logic.TypeofEClass(metamodelLogic.getTrace(), Modes3Package.eINSTANCE.getSegment());
        final RelationDeclaration connectedTo = this.ecore2Logic.relationOfReference(metamodelLogic.getTrace(), 
          Modes3Package.eINSTANCE.getSegment_ConnectedTo());
        final RelationDeclaration connectedToIndicator = ((EReferenceMapper_RelationsOverTypes_Trace) metamodelLogic.getTrace().referenceMapperTrace).indicators.get(
          Modes3Package.eINSTANCE.getSegment_ConnectedTo());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("oppositeReference ");
        String _name = connectedTo.getName();
        _builder.append(_name);
        _builder.append(" ");
        String _name_1 = connectedTo.getName();
        _builder.append(_name_1);
        final Function1<VariableContext, TermDescription> _function = (VariableContext it) -> {
          Iff _xblockexpression_1 = null;
          {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("src");
            final Variable src = it.addVar(_builder_1, segment);
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("trg");
            final Variable trg = it.addVar(_builder_2, segment);
            SymbolicValue _call = this._logicProblemBuilder.call(connectedToIndicator, src, trg);
            SymbolicValue _call_1 = this._logicProblemBuilder.call(connectedToIndicator, trg, src);
            _xblockexpression_1 = this._logicProblemBuilder.operator_spaceship(_call, _call_1);
          }
          return _xblockexpression_1;
        };
        final Assertion inverseAssertion = this._logicProblemBuilder.Assertion(_builder, 
          this._logicProblemBuilder.Forall(_function));
        EList<Assertion> _assertions = metamodelLogic.getOutput().getAssertions();
        _assertions.add(inverseAssertion);
        InverseRelationAssertion _createInverseRelationAssertion = Ecore2logicannotationsFactory.eINSTANCE.createInverseRelationAssertion();
        final Procedure1<InverseRelationAssertion> _function_1 = (InverseRelationAssertion it) -> {
          it.setTarget(inverseAssertion);
          it.setInverseA(connectedTo);
          it.setInverseB(connectedTo);
        };
        final InverseRelationAssertion inverseAnnotation = ObjectExtensions.<InverseRelationAssertion>operator_doubleArrow(_createInverseRelationAssertion, _function_1);
        EList<Annotation> _annotations = metamodelLogic.getOutput().getAnnotations();
        _annotations.add(inverseAnnotation);
        final List<EObject> initialModel = Modes3ModelGenerator.loadInitialModel();
        final TracedOutput<LogicProblem, Ecore2Logic_Trace> initialModelLogic = this.instanceModel2Logic.transform(metamodelLogic, initialModel);
        final ViatraQuerySetDescriptor queries = this.loadQueries();
        Viatra2LogicConfiguration _viatra2LogicConfiguration = new Viatra2LogicConfiguration();
        final TracedOutput<LogicProblem, Viatra2LogicTrace> logic = this.viatra2Logic.transformQueries(queries, initialModelLogic, _viatra2LogicConfiguration);
        ViatraReasonerConfiguration _viatraReasonerConfiguration = new ViatraReasonerConfiguration();
        final Procedure1<ViatraReasonerConfiguration> _function_2 = (ViatraReasonerConfiguration it) -> {
          it.runtimeLimit = 3600;
          final Procedure1<TypeScopes> _function_3 = (TypeScopes it_1) -> {
            it_1.minNewElements = this.modelSize;
            it_1.maxNewElements = this.modelSize;
            final Procedure1<Map<Type, Integer>> _function_4 = (Map<Type, Integer> it_2) -> {
            };
            ObjectExtensions.<Map<Type, Integer>>operator_doubleArrow(
              it_1.minNewElementsByType, _function_4);
            final Procedure1<Map<Type, Integer>> _function_5 = (Map<Type, Integer> it_2) -> {
              it_2.put(this.ecore2Logic.TypeofEClass(metamodelLogic.getTrace(), Modes3Package.eINSTANCE.getTrain()), Integer.valueOf((this.modelSize / 5)));
              it_2.put(this.ecore2Logic.TypeofEClass(metamodelLogic.getTrace(), Modes3Package.eINSTANCE.getTurnout()), Integer.valueOf((this.modelSize / 5)));
            };
            ObjectExtensions.<Map<Type, Integer>>operator_doubleArrow(
              it_1.maxNewElementsByType, _function_5);
          };
          ObjectExtensions.<TypeScopes>operator_doubleArrow(
            it.typeScopes, _function_3);
          final Procedure1<SolutionScope> _function_4 = (SolutionScope it_1) -> {
            it_1.numberOfRequiredSolutions = 1;
          };
          ObjectExtensions.<SolutionScope>operator_doubleArrow(
            it.solutionScope, _function_4);
          CostObjectiveConfiguration _objective = this.getObjective(this.ecore2Logic, metamodelLogic.getTrace());
          it.costObjectives.add(_objective);
          it.scopeWeight = 6;
          it.nameNewElements = false;
          it.typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis;
          it.stateCoderStrategy = StateCoderStrategy.PairwiseNeighbourhood;
          ScopePropagatorStrategy.Polyhedral _polyhedral = new ScopePropagatorStrategy.Polyhedral(
            PolyhedralScopePropagatorConstraints.Relational, PolyhedralScopePropagatorSolver.Clp);
          it.scopePropagatorStrategy = _polyhedral;
          Ecore2Logic_Trace _trace = metamodelLogic.getTrace();
          Modes3TypeScopeHint _modes3TypeScopeHint = new Modes3TypeScopeHint(this.ecore2Logic, _trace);
          it.hints.add(_modes3TypeScopeHint);
          Ecore2Logic_Trace _trace_1 = metamodelLogic.getTrace();
          Modes3UnitPropagationGenerator _modes3UnitPropagationGenerator = new Modes3UnitPropagationGenerator(this.ecore2Logic, _trace_1);
          it.unitPropagationPatternGenerators.add(_modes3UnitPropagationGenerator);
          final Procedure1<DebugConfiguration> _function_5 = (DebugConfiguration it_1) -> {
            GraphvizVisualiser _graphvizVisualiser = new GraphvizVisualiser();
            it_1.partialInterpretatioVisualiser = _graphvizVisualiser;
          };
          ObjectExtensions.<DebugConfiguration>operator_doubleArrow(
            it.debugConfiguration, _function_5);
          it.documentationLevel = DocumentationLevel.NORMAL;
        };
        final ViatraReasonerConfiguration config = ObjectExtensions.<ViatraReasonerConfiguration>operator_doubleArrow(_viatraReasonerConfiguration, _function_2);
        final FileSystemWorkspace workspace = new FileSystemWorkspace("output/", "");
        workspace.writeModel(logic.getOutput(), "problem.logicproblem");
        final LogicResult solution = this.solver.solve(logic.getOutput(), config, workspace);
        URI _xifexpression = null;
        if ((solution instanceof ModelResult)) {
          InputOutput.<String>println("Saving generated solutions");
          final Logic2Ecore logic2Ecore = new Logic2Ecore(this.ecore2Logic);
          final List<? extends LogicModelInterpretation> interpretations = this.solver.getInterpretations(((ModelResult)solution));
          int _size = interpretations.size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
          for (final Integer representationIndex : _doubleDotLessThan) {
            {
              final LogicModelInterpretation interpretation = interpretations.get((representationIndex).intValue());
              final int representationNumber = ((representationIndex).intValue() + 1);
              if ((interpretation instanceof PartialModelAsLogicInterpretation)) {
                final PartialInterpretation representation = ((PartialModelAsLogicInterpretation)interpretation).getPartialInterpretation();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("solution");
                _builder_1.append(representationNumber);
                _builder_1.append(".partialinterpretation");
                workspace.writeModel(representation, _builder_1.toString());
                final PartialInterpretation2Gml partialInterpretation2GML = new PartialInterpretation2Gml();
                final String gml = partialInterpretation2GML.transform(representation);
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("solution");
                _builder_2.append(representationNumber);
                _builder_2.append(".gml");
                workspace.writeText(_builder_2.toString(), gml);
                final EObject model = logic2Ecore.transformInterpretation(interpretation, metamodelLogic.getTrace());
                final TreeIterator<EObject> iterator = model.eAllContents();
                int id = 0;
                while (iterator.hasNext()) {
                  {
                    final EObject obj = iterator.next();
                    final Function1<EAttribute, Boolean> _function_3 = (EAttribute it) -> {
                      String _name_2 = it.getName();
                      return Boolean.valueOf(Objects.equal(_name_2, "id"));
                    };
                    final EAttribute idFeature = IterableExtensions.<EAttribute>findFirst(obj.eClass().getEAllAttributes(), _function_3);
                    if ((idFeature != null)) {
                      obj.eSet(idFeature, Integer.valueOf(id));
                      id++;
                    }
                  }
                }
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("solution");
                _builder_3.append(representationNumber);
                _builder_3.append(".modes3");
                workspace.writeModel(model, _builder_3.toString());
                int _size_1 = representation.getNewElements().size();
                boolean _lessThan = (_size_1 < 160);
                if (_lessThan) {
                  final Function1<Type, Boolean> _function_3 = (Type it) -> {
                    String _name_2 = it.getName();
                    return Boolean.valueOf(Objects.equal(_name_2, "Modes3ModelRoot class DefinedPart"));
                  };
                  Type _findFirst = IterableExtensions.<Type>findFirst(representation.getProblem().getTypes(), _function_3);
                  final TypeDefinition rootType = ((TypeDefinition) _findFirst);
                  final Function1<PartialComplexTypeInterpretation, Boolean> _function_4 = (PartialComplexTypeInterpretation it) -> {
                    String _name_2 = it.getInterpretationOf().getName();
                    return Boolean.valueOf(Objects.equal(_name_2, "Modes3ModelRoot class"));
                  };
                  final PartialComplexTypeInterpretation rootIntepretation = IterableExtensions.<PartialComplexTypeInterpretation>findFirst(Iterables.<PartialComplexTypeInterpretation>filter(representation.getPartialtypeinterpratation(), 
                    PartialComplexTypeInterpretation.class), _function_4);
                  rootIntepretation.getElements().removeAll(rootType.getElements());
                  representation.getProblem().getElements().removeAll(rootType.getElements());
                  EList<PartialRelationInterpretation> _partialrelationinterpretation = representation.getPartialrelationinterpretation();
                  for (final PartialRelationInterpretation relationInterpretation : _partialrelationinterpretation) {
                    final Predicate<RelationLink> _function_5 = (RelationLink link) -> {
                      boolean _xifexpression_1 = false;
                      if ((link instanceof BinaryElementRelationLink)) {
                        _xifexpression_1 = (rootType.getElements().contains(((BinaryElementRelationLink)link).getParam1()) || 
                          rootType.getElements().contains(((BinaryElementRelationLink)link).getParam2()));
                      } else {
                        _xifexpression_1 = false;
                      }
                      return _xifexpression_1;
                    };
                    relationInterpretation.getRelationlinks().removeIf(_function_5);
                  }
                  rootType.getElements().clear();
                  final GraphvizVisualiser visualiser = new GraphvizVisualiser();
                  final PartialInterpretationVisualisation visualisation = visualiser.visualiseConcretization(representation);
                  StringConcatenation _builder_4 = new StringConcatenation();
                  _builder_4.append("solution");
                  _builder_4.append(representationNumber);
                  _builder_4.append(".png");
                  visualisation.writeToFile(workspace, _builder_4.toString());
                }
              } else {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("solution");
                _builder_5.append(representationNumber);
                _builder_5.append(".txt");
                workspace.writeText(_builder_5.toString(), interpretation.toString());
              }
            }
          }
        } else {
          URI _xblockexpression_1 = null;
          {
            InputOutput.<String>println("Failed to solve problem");
            final LogicProblem partial = logic.getOutput();
            _xblockexpression_1 = workspace.writeModel(partial, "solution.partialinterpretation");
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static EcoreMetamodelDescriptor createMetamodelDescriptor() {
    EcoreMetamodelDescriptor _xblockexpression = null;
    {
      final ImmutableList<EClass> eClasses = ImmutableList.<EClass>copyOf(Iterables.<EClass>filter(Modes3Package.eINSTANCE.getEClassifiers(), EClass.class));
      Set<EClass> _emptySet = CollectionLiterals.<EClass>emptySet();
      List<EEnum> _emptyList = CollectionLiterals.<EEnum>emptyList();
      List<EEnumLiteral> _emptyList_1 = CollectionLiterals.<EEnumLiteral>emptyList();
      final Function1<EClass, EList<EReference>> _function = (EClass it) -> {
        return it.getEReferences();
      };
      ImmutableList<EReference> _copyOf = ImmutableList.<EReference>copyOf(IterableExtensions.<EClass, EReference>flatMap(eClasses, _function));
      List<EAttribute> _emptyList_2 = CollectionLiterals.<EAttribute>emptyList();
      _xblockexpression = new EcoreMetamodelDescriptor(eClasses, _emptySet, 
        false, _emptyList, _emptyList_1, _copyOf, _emptyList_2);
    }
    return _xblockexpression;
  }
  
  public static List<EObject> loadInitialModel() {
    Modes3ModelRoot _createModes3ModelRoot = Modes3Factory.eINSTANCE.createModes3ModelRoot();
    return Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_createModes3ModelRoot));
  }
  
  public ViatraQuerySetDescriptor loadQueries() {
    ViatraQuerySetDescriptor _xblockexpression = null;
    {
      final ImmutableList.Builder<IQuerySpecification<?>> patternsBuilder = ImmutableList.<IQuerySpecification<?>>builder();
      patternsBuilder.addAll(Modes3Queries.instance().getSpecifications());
      final ImmutableList<IQuerySpecification<?>> patterns = patternsBuilder.build();
      final Function1<IQuerySpecification<?>, Boolean> _function = (IQuerySpecification<?> pattern) -> {
        final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it) -> {
          String _name = it.getName();
          return Boolean.valueOf(Objects.equal(_name, "Constraint"));
        };
        return Boolean.valueOf(IterableExtensions.<PAnnotation>exists(pattern.getAllAnnotations(), _function_1));
      };
      final ImmutableSet<IQuerySpecification<?>> validationPatterns = ImmutableSet.<IQuerySpecification<?>>copyOf(IterableExtensions.<IQuerySpecification<?>>filter(patterns, _function));
      Map<IQuerySpecification<?>, EStructuralFeature> _emptyMap = CollectionLiterals.<IQuerySpecification<?>, EStructuralFeature>emptyMap();
      _xblockexpression = new ViatraQuerySetDescriptor(patterns, validationPatterns, _emptyMap);
    }
    return _xblockexpression;
  }
  
  public CostObjectiveConfiguration getObjective(final Ecore2Logic ecore2Logic, final Ecore2Logic_Trace ecore2LogicTrace) {
    CostObjectiveConfiguration _costObjectiveConfiguration = new CostObjectiveConfiguration();
    final Procedure1<CostObjectiveConfiguration> _function = (CostObjectiveConfiguration it) -> {
      final Modes3ModelGenerator.MonitoringQuery monitoringQuery = this.monitoringQuery;
      if (monitoringQuery != null) {
        switch (monitoringQuery) {
          case closeTrains:
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_1 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = CloseTrains_step_2.instance().getFullyQualifiedName();
              it_1.weight = ((14 + 53) + 11);
            };
            CostObjectiveElementConfiguration _doubleArrow = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration, _function_1);
            it.elements.add(_doubleArrow);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_1 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_2 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = CloseTrains_step_3.instance().getFullyQualifiedName();
              it_1.weight = (21 + 14);
            };
            CostObjectiveElementConfiguration _doubleArrow_1 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_1, _function_2);
            it.elements.add(_doubleArrow_1);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_2 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_3 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = CloseTrains_step_4.instance().getFullyQualifiedName();
              it_1.weight = (((14 + 44) + 14) + 9);
            };
            CostObjectiveElementConfiguration _doubleArrow_2 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_2, _function_3);
            it.elements.add(_doubleArrow_2);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_3 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_4 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = CloseTrains_step_5.instance().getFullyQualifiedName();
              it_1.weight = ((14 + 41) + 11);
            };
            CostObjectiveElementConfiguration _doubleArrow_3 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_3, _function_4);
            it.elements.add(_doubleArrow_3);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_4 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_5 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = CloseTrains_step_6.instance().getFullyQualifiedName();
              it_1.weight = 27;
            };
            CostObjectiveElementConfiguration _doubleArrow_4 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_4, _function_5);
            it.elements.add(_doubleArrow_4);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_5 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_6 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = CloseTrains_step_7.instance().getFullyQualifiedName();
              it_1.weight = 48;
            };
            CostObjectiveElementConfiguration _doubleArrow_5 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_5, _function_6);
            it.elements.add(_doubleArrow_5);
            CloseTrainsObjectiveHint _closeTrainsObjectiveHint = new CloseTrainsObjectiveHint(ecore2Logic, ecore2LogicTrace);
            it.hint = _closeTrainsObjectiveHint;
            break;
          case trainLocations:
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_6 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_7 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = TrainLocations_step_2.instance().getFullyQualifiedName();
              it_1.weight = ((14 + 53) + 11);
            };
            CostObjectiveElementConfiguration _doubleArrow_6 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_6, _function_7);
            it.elements.add(_doubleArrow_6);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_7 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_8 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = TrainLocations_step_3.instance().getFullyQualifiedName();
              it_1.weight = 48;
            };
            CostObjectiveElementConfiguration _doubleArrow_7 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_7, _function_8);
            it.elements.add(_doubleArrow_7);
            TrainLocationsObjectiveHint _trainLocationsObjectiveHint = new TrainLocationsObjectiveHint(ecore2Logic, ecore2LogicTrace);
            it.hint = _trainLocationsObjectiveHint;
            break;
          case misalignedTurnout:
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_8 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_9 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = MisalignedTurnout_step_2.instance().getFullyQualifiedName();
              it_1.weight = ((14 + 53) + 11);
            };
            CostObjectiveElementConfiguration _doubleArrow_8 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_8, _function_9);
            it.elements.add(_doubleArrow_8);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_9 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_10 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = MisalignedTurnout_step_3.instance().getFullyQualifiedName();
              it_1.weight = 108;
            };
            CostObjectiveElementConfiguration _doubleArrow_9 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_9, _function_10);
            it.elements.add(_doubleArrow_9);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_10 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_11 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = MisalignedTurnout_step_4.instance().getFullyQualifiedName();
              it_1.weight = 27;
            };
            CostObjectiveElementConfiguration _doubleArrow_10 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_10, _function_11);
            it.elements.add(_doubleArrow_10);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_11 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_12 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = MisalignedTurnout_step_5.instance().getFullyQualifiedName();
              it_1.weight = 48;
            };
            CostObjectiveElementConfiguration _doubleArrow_11 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_11, _function_12);
            it.elements.add(_doubleArrow_11);
            MisalignedTurnoutObjectiveHint _misalignedTurnoutObjectiveHint = new MisalignedTurnoutObjectiveHint(ecore2Logic, ecore2LogicTrace);
            it.hint = _misalignedTurnoutObjectiveHint;
            break;
          case endOfSiding:
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_12 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_13 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = EndOfSiding_step_2.instance().getFullyQualifiedName();
              it_1.weight = ((14 + 53) + 11);
            };
            CostObjectiveElementConfiguration _doubleArrow_12 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_12, _function_13);
            it.elements.add(_doubleArrow_12);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_13 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_14 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = EndOfSiding_step_3.instance().getFullyQualifiedName();
              it_1.weight = (21 + 14);
            };
            CostObjectiveElementConfiguration _doubleArrow_13 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_13, _function_14);
            it.elements.add(_doubleArrow_13);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_14 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_15 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = EndOfSiding_step_4.instance().getFullyQualifiedName();
              it_1.weight = (((((((14 + 35) + 21) + 15) + 14) + 21) + 15) + 11);
            };
            CostObjectiveElementConfiguration _doubleArrow_14 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_14, _function_15);
            it.elements.add(_doubleArrow_14);
            CostObjectiveElementConfiguration _costObjectiveElementConfiguration_15 = new CostObjectiveElementConfiguration();
            final Procedure1<CostObjectiveElementConfiguration> _function_16 = (CostObjectiveElementConfiguration it_1) -> {
              it_1.patternQualifiedName = EndOfSiding_step_5.instance().getFullyQualifiedName();
              it_1.weight = 48;
            };
            CostObjectiveElementConfiguration _doubleArrow_15 = ObjectExtensions.<CostObjectiveElementConfiguration>operator_doubleArrow(_costObjectiveElementConfiguration_15, _function_16);
            it.elements.add(_doubleArrow_15);
            EndOfSidingObjectiveHint _endOfSidingObjectiveHint = new EndOfSidingObjectiveHint(ecore2Logic, ecore2LogicTrace);
            it.hint = _endOfSidingObjectiveHint;
            break;
          default:
            throw new IllegalArgumentException(("Unknown monitoring query: " + this.monitoringQuery));
        }
      } else {
        throw new IllegalArgumentException(("Unknown monitoring query: " + this.monitoringQuery));
      }
      it.kind = ObjectiveKind.HIGHER_IS_BETTER;
      it.threshold = ObjectiveThreshold.NO_THRESHOLD;
      it.findExtremum = true;
    };
    return ObjectExtensions.<CostObjectiveConfiguration>operator_doubleArrow(_costObjectiveConfiguration, _function);
  }
  
  public static Object init() {
    Object _xblockexpression = null;
    {
      EMFPatternLanguageStandaloneSetup.doSetup();
      ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, 
        LocalSearchEMFBackendFactory.INSTANCE);
      LogiclanguagePackage.eINSTANCE.getClass();
      LogicproblemPackage.eINSTANCE.getClass();
      PartialinterpretationPackage.eINSTANCE.getClass();
      Ecore2logicannotationsPackage.eINSTANCE.getClass();
      Viatra2LogicAnnotationsPackage.eINSTANCE.getClass();
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (_length != 2);
    if (_notEquals) {
      System.err.println("Usage: <query> <model size>");
    }
    final Modes3ModelGenerator.MonitoringQuery monitoringQuery = Modes3ModelGenerator.MonitoringQuery.valueOf(args[0]);
    final int modelSize = Integer.parseInt(args[1]);
    Modes3ModelGenerator.init();
    final Modes3ModelGenerator generator = new Modes3ModelGenerator(monitoringQuery, modelSize);
    generator.generate();
  }
  
  public Modes3ModelGenerator(final Modes3ModelGenerator.MonitoringQuery monitoringQuery, final int modelSize) {
    super();
    this.monitoringQuery = monitoringQuery;
    this.modelSize = modelSize;
  }
}
