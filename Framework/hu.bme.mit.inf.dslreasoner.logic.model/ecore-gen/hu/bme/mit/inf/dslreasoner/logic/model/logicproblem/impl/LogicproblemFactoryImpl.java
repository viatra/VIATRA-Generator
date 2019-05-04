/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicproblemFactoryImpl extends EFactoryImpl implements LogicproblemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicproblemFactory init() {
		try {
			LogicproblemFactory theLogicproblemFactory = (LogicproblemFactory)EPackage.Registry.INSTANCE.getEFactory(LogicproblemPackage.eNS_URI);
			if (theLogicproblemFactory != null) {
				return theLogicproblemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicproblemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicproblemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogicproblemPackage.LOGIC_PROBLEM: return createLogicProblem();
			case LogicproblemPackage.CONTAINMENT_HIERARCHY: return createContainmentHierarchy();
			case LogicproblemPackage.RELATION_ANNOTATION: return createRelationAnnotation();
			case LogicproblemPackage.CONSTANT_ANNOTATION: return createConstantAnnotation();
			case LogicproblemPackage.FUNCTION_ANNOTATION: return createFunctionAnnotation();
			case LogicproblemPackage.ASSERTION_ANNOTATION: return createAssertionAnnotation();
			case LogicproblemPackage.ANNOTATION: return createAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicProblem createLogicProblem() {
		LogicProblemImpl logicProblem = new LogicProblemImpl();
		return logicProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainmentHierarchy createContainmentHierarchy() {
		ContainmentHierarchyImpl containmentHierarchy = new ContainmentHierarchyImpl();
		return containmentHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationAnnotation createRelationAnnotation() {
		RelationAnnotationImpl relationAnnotation = new RelationAnnotationImpl();
		return relationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantAnnotation createConstantAnnotation() {
		ConstantAnnotationImpl constantAnnotation = new ConstantAnnotationImpl();
		return constantAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionAnnotation createFunctionAnnotation() {
		FunctionAnnotationImpl functionAnnotation = new FunctionAnnotationImpl();
		return functionAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertionAnnotation createAssertionAnnotation() {
		AssertionAnnotationImpl assertionAnnotation = new AssertionAnnotationImpl();
		return assertionAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicproblemPackage getLogicproblemPackage() {
		return (LogicproblemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicproblemPackage getPackage() {
		return LogicproblemPackage.eINSTANCE;
	}

} //LogicproblemFactoryImpl
