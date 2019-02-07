/*
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.serializer;

import com.google.inject.Inject;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.Assignment;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ComponentInstance;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.EventReference;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ImportDeclaration;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingParameter;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.services.CftLanguageGrammarAccess;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.AndGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.OrGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CftLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CftLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CftPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CftPackage.AND_GATE_DEFINITION:
				sequence_AndGateDefinition(context, (AndGateDefinition) semanticObject); 
				return; 
			case CftPackage.BASIC_EVENT_DEFINITION:
				sequence_BasicEventDefinition(context, (BasicEventDefinition) semanticObject); 
				return; 
			case CftPackage.COMPONENT_DEFINITION:
				sequence_ComponentDefinition(context, (ComponentDefinition) semanticObject); 
				return; 
			case CftPackage.INPUT_EVENT:
				sequence_InputEvent(context, (InputEvent) semanticObject); 
				return; 
			case CftPackage.KOF_MGATE_DEFINITION:
				sequence_KOfMGateDefinition(context, (KOfMGateDefinition) semanticObject); 
				return; 
			case CftPackage.OR_GATE_DEFINITION:
				sequence_OrGateDefinition(context, (OrGateDefinition) semanticObject); 
				return; 
			}
		else if (epackage == CftLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CftLanguagePackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case CftLanguagePackage.CFT_MODEL:
				sequence_CftModel(context, (CftModel) semanticObject); 
				return; 
			case CftLanguagePackage.COMPONENT_INSTANCE:
				sequence_ComponentInstance(context, (ComponentInstance) semanticObject); 
				return; 
			case CftLanguagePackage.EVENT_REFERENCE:
				sequence_EventReference(context, (EventReference) semanticObject); 
				return; 
			case CftLanguagePackage.IMPORT_DECLARATION:
				sequence_ImportDeclaration(context, (ImportDeclaration) semanticObject); 
				return; 
			case CftLanguagePackage.LOOKUP_DEFINITION:
				sequence_LookupDefinition(context, (LookupDefinition) semanticObject); 
				return; 
			case CftLanguagePackage.MAPPING_DEFINITION:
				sequence_MappingDefinition(context, (MappingDefinition) semanticObject); 
				return; 
			case CftLanguagePackage.MAPPING_PARAMETER:
				sequence_MappingParameter(context, (MappingParameter) semanticObject); 
				return; 
			case CftLanguagePackage.TRANSFORMATION_DEFINITION:
				sequence_TransformationDefinition(context, (TransformationDefinition) semanticObject); 
				return; 
			}
		else if (epackage == FtPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FtPackage.CONSTANT_DISTRIBUTION:
				sequence_ConstantDistribution(context, (ConstantDistribution) semanticObject); 
				return; 
			case FtPackage.EXPONENTIAL_DISTRIBUTION:
				sequence_ExponentialDistribution(context, (ExponentialDistribution) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EventDefinition returns AndGateDefinition
	 *     GateDefinition returns AndGateDefinition
	 *     AndGateDefinition returns AndGateDefinition
	 *
	 * Constraint:
	 *     (name=ValidId inputEvents+=[EventDeclaration|ValidId]*)
	 */
	protected void sequence_AndGateDefinition(ISerializationContext context, AndGateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (input=EventReference multiple?='+='? output=EventReference)
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventDefinition returns BasicEventDefinition
	 *     BasicEventDefinition returns BasicEventDefinition
	 *
	 * Constraint:
	 *     (name=ValidId distribution=Distribution)
	 */
	protected void sequence_BasicEventDefinition(ISerializationContext context, BasicEventDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CftPackage.Literals.EVENT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CftPackage.Literals.EVENT_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, CftPackage.Literals.BASIC_EVENT_DEFINITION__DISTRIBUTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CftPackage.Literals.BASIC_EVENT_DEFINITION__DISTRIBUTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBasicEventDefinitionAccess().getNameValidIdParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBasicEventDefinitionAccess().getDistributionDistributionParserRuleCall_1_0(), semanticObject.getDistribution());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CftModel returns CftModel
	 *
	 * Constraint:
	 *     (
	 *         packageName=QualifiedName 
	 *         imports+=ImportDeclaration* 
	 *         (componentDefinitions+=ComponentDefinition | transformationDefinitions+=TransformationDefinition)*
	 *     )
	 */
	protected void sequence_CftModel(ISerializationContext context, CftModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDefinition returns ComponentDefinition
	 *
	 * Constraint:
	 *     (name=ValidId (inputEvents+=InputEvent | outputEvents+=[EventDeclaration|ValidId])* eventDefinitions+=EventDefinition*)
	 */
	protected void sequence_ComponentDefinition(ISerializationContext context, ComponentDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns ComponentInstance
	 *     ComponentInstance returns ComponentInstance
	 *
	 * Constraint:
	 *     (componentType=[ComponentDefinition|QualifiedName] name=ID?)
	 */
	protected void sequence_ComponentInstance(ISerializationContext context, ComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Distribution returns ConstantDistribution
	 *     ConstantDistribution returns ConstantDistribution
	 *
	 * Constraint:
	 *     p=Double
	 */
	protected void sequence_ConstantDistribution(ISerializationContext context, ConstantDistribution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FtPackage.Literals.CONSTANT_DISTRIBUTION__P) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FtPackage.Literals.CONSTANT_DISTRIBUTION__P));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantDistributionAccess().getPDoubleParserRuleCall_2_0(), semanticObject.getP());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventReference returns EventReference
	 *
	 * Constraint:
	 *     (component=[Variable|ValidId] event=[EventDeclaration|ValidId])
	 */
	protected void sequence_EventReference(ISerializationContext context, EventReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CftLanguagePackage.Literals.EVENT_REFERENCE__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CftLanguagePackage.Literals.EVENT_REFERENCE__COMPONENT));
			if (transientValues.isValueTransient(semanticObject, CftLanguagePackage.Literals.EVENT_REFERENCE__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CftLanguagePackage.Literals.EVENT_REFERENCE__EVENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventReferenceAccess().getComponentVariableValidIdParserRuleCall_0_0_1(), semanticObject.eGet(CftLanguagePackage.Literals.EVENT_REFERENCE__COMPONENT, false));
		feeder.accept(grammarAccess.getEventReferenceAccess().getEventEventDeclarationValidIdParserRuleCall_2_0_1(), semanticObject.eGet(CftLanguagePackage.Literals.EVENT_REFERENCE__EVENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Distribution returns ExponentialDistribution
	 *     ExponentialDistribution returns ExponentialDistribution
	 *
	 * Constraint:
	 *     lambda=Double
	 */
	protected void sequence_ExponentialDistribution(ISerializationContext context, ExponentialDistribution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FtPackage.Literals.EXPONENTIAL_DISTRIBUTION__LAMBDA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FtPackage.Literals.EXPONENTIAL_DISTRIBUTION__LAMBDA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExponentialDistributionAccess().getLambdaDoubleParserRuleCall_2_0(), semanticObject.getLambda());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImportDeclaration returns ImportDeclaration
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_ImportDeclaration(ISerializationContext context, ImportDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CftLanguagePackage.Literals.IMPORT_DECLARATION__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CftLanguagePackage.Literals.IMPORT_DECLARATION__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InputEvent returns InputEvent
	 *
	 * Constraint:
	 *     (name=ValidId multiple?='[]'?)
	 */
	protected void sequence_InputEvent(ISerializationContext context, InputEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventDefinition returns KOfMGateDefinition
	 *     GateDefinition returns KOfMGateDefinition
	 *     KOfMGateDefinition returns KOfMGateDefinition
	 *
	 * Constraint:
	 *     (name=ValidId k=INT (m=INT | m=OF_INT) inputEvents+=[EventDeclaration|ValidId]*)
	 */
	protected void sequence_KOfMGateDefinition(ISerializationContext context, KOfMGateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LookupDefinition returns LookupDefinition
	 *     Variable returns LookupDefinition
	 *
	 * Constraint:
	 *     (mapping=[MappingDefinition|QualifiedName] arguments+=[MappingParameter|ValidId] arguments+=[MappingParameter|ValidId]* name=ValidId)
	 */
	protected void sequence_LookupDefinition(ISerializationContext context, LookupDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappingDefinition returns MappingDefinition
	 *
	 * Constraint:
	 *     (
	 *         topLevel?='toplevel'? 
	 *         pattern=[Pattern|QualifiedName] 
	 *         parameters+=MappingParameter 
	 *         parameters+=MappingParameter* 
	 *         componentInstance=ComponentInstance? 
	 *         (lookupDefinitions+=LookupDefinition | assignments+=Assignment)*
	 *     )
	 */
	protected void sequence_MappingDefinition(ISerializationContext context, MappingDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappingParameter returns MappingParameter
	 *
	 * Constraint:
	 *     name=ValidId
	 */
	protected void sequence_MappingParameter(ISerializationContext context, MappingParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CftLanguagePackage.Literals.MAPPING_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CftLanguagePackage.Literals.MAPPING_PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMappingParameterAccess().getNameValidIdParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventDefinition returns OrGateDefinition
	 *     GateDefinition returns OrGateDefinition
	 *     OrGateDefinition returns OrGateDefinition
	 *
	 * Constraint:
	 *     (name=ValidId inputEvents+=[EventDeclaration|ValidId]*)
	 */
	protected void sequence_OrGateDefinition(ISerializationContext context, OrGateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransformationDefinition returns TransformationDefinition
	 *
	 * Constraint:
	 *     (name=ValidId mappingDefinitions+=MappingDefinition*)
	 */
	protected void sequence_TransformationDefinition(ISerializationContext context, TransformationDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
