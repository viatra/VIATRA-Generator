/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AtomicTerm;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolOperation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Distinct;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Divison;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Forall;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntOperation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Minus;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Mod;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Multiply;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Plus;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveRelation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.UnknownBecauseUninterpreted;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicproblemPackageImpl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.LogicresultPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogiclanguagePackageImpl extends EPackageImpl implements LogiclanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolicDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolicValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distinctEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moreThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessOrEqualThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moreOrEqualThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifThenElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownBecauseUninterpretedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitiveClosureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogiclanguagePackageImpl() {
		super(eNS_URI, LogiclanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LogiclanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogiclanguagePackage init() {
		if (isInited) return (LogiclanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI);

		// Obtain or create and register package
		LogiclanguagePackageImpl theLogiclanguagePackage = (LogiclanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogiclanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogiclanguagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		LogicproblemPackageImpl theLogicproblemPackage = (LogicproblemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI) instanceof LogicproblemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI) : LogicproblemPackage.eINSTANCE);
		LogicresultPackageImpl theLogicresultPackage = (LogicresultPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicresultPackage.eNS_URI) instanceof LogicresultPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicresultPackage.eNS_URI) : LogicresultPackage.eINSTANCE);

		// Create package meta-data objects
		theLogiclanguagePackage.createPackageContents();
		theLogicproblemPackage.createPackageContents();
		theLogicresultPackage.createPackageContents();

		// Initialize created meta-data
		theLogiclanguagePackage.initializePackageContents();
		theLogicproblemPackage.initializePackageContents();
		theLogicresultPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogiclanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogiclanguagePackage.eNS_URI, theLogiclanguagePackage);
		return theLogiclanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Subtypes() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Supertypes() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_IsAbstract() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedElement() {
		return definedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedElement_DefinedInType() {
		return (EReference)definedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Elements() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Defines() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexTypeReference() {
		return complexTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexTypeReference_Referred() {
		return (EReference)complexTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeReference() {
		return primitiveTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntTypeReference() {
		return intTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolTypeReference() {
		return boolTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealTypeReference() {
		return realTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Range() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Annotations() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolicDeclaration() {
		return symbolicDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolicDeclaration_Name() {
		return (EAttribute)symbolicDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolicValue() {
		return symbolicValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolicValue_SymbolicReference() {
		return (EReference)symbolicValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolicValue_ParameterSubstitutions() {
		return (EReference)symbolicValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicTerm() {
		return atomicTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntLiteral() {
		return intLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntLiteral_Value() {
		return (EAttribute)intLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolLiteral() {
		return boolLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolLiteral_Value() {
		return (EAttribute)boolLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealLiteral() {
		return realLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealLiteral_Value() {
		return (EAttribute)realLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Range() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedExpression() {
		return quantifiedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedExpression_QuantifiedVariables() {
		return (EReference)quantifiedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedExpression_Expression() {
		return (EReference)quantifiedExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExists() {
		return existsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForall() {
		return forallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolOperation() {
		return boolOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Operands() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Operands() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpl() {
		return implEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpl_LeftOperand() {
		return (EReference)implEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpl_RightOperand() {
		return (EReference)implEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Operand() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIff() {
		return iffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIff_LeftOperand() {
		return (EReference)iffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIff_RightOperand() {
		return (EReference)iffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveRelation() {
		return primitiveRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquals() {
		return equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquals_LeftOperand() {
		return (EReference)equalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquals_RightOperand() {
		return (EReference)equalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistinct() {
		return distinctEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistinct_Operands() {
		return (EReference)distinctEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLessThan_LeftOperand() {
		return (EReference)lessThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLessThan_RightOperand() {
		return (EReference)lessThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoreThan() {
		return moreThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoreThan_LeftOperand() {
		return (EReference)moreThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoreThan_RightOperand() {
		return (EReference)moreThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessOrEqualThan() {
		return lessOrEqualThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLessOrEqualThan_LeftOperand() {
		return (EReference)lessOrEqualThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLessOrEqualThan_RightOperand() {
		return (EReference)lessOrEqualThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoreOrEqualThan() {
		return moreOrEqualThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoreOrEqualThan_LeftOperand() {
		return (EReference)moreOrEqualThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoreOrEqualThan_RightOperand() {
		return (EReference)moreOrEqualThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntOperation() {
		return intOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntOperation_LeftOperand() {
		return (EReference)intOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntOperation_RightOperand() {
		return (EReference)intOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivison() {
		return divisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMod() {
		return modEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDescriptor() {
		return typeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermDescription() {
		return termDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Value() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Name() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Annotations() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Parameters() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Annotations() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Type() {
		return (EReference)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Annotations() {
		return (EReference)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantDefinition() {
		return constantDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantDefinition_Value() {
		return (EReference)constantDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantDefinition_Defines() {
		return (EReference)constantDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationDefinition() {
		return relationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDefinition_Variables() {
		return (EReference)relationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDefinition_Value() {
		return (EReference)relationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationDefinition_Defines() {
		return (EReference)relationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDefinition() {
		return functionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Variable() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Defines() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Value() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfThenElse() {
		return ifThenElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_Condition() {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_IfTrue() {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_IfFalse() {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantDeclaration() {
		return constantDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationDeclaration() {
		return relationDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDeclaration() {
		return functionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownBecauseUninterpreted() {
		return unknownBecauseUninterpretedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceOf() {
		return instanceOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceOf_Value() {
		return (EReference)instanceOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceOf_Range() {
		return (EReference)instanceOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringTypeReference() {
		return stringTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitiveClosure() {
		return transitiveClosureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveClosure_LeftOperand() {
		return (EReference)transitiveClosureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveClosure_RightOperand() {
		return (EReference)transitiveClosureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveClosure_Relation() {
		return (EReference)transitiveClosureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogiclanguageFactory getLogiclanguageFactory() {
		return (LogiclanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);
		createEReference(typeEClass, TYPE__SUBTYPES);
		createEReference(typeEClass, TYPE__SUPERTYPES);
		createEAttribute(typeEClass, TYPE__IS_ABSTRACT);

		definedElementEClass = createEClass(DEFINED_ELEMENT);
		createEReference(definedElementEClass, DEFINED_ELEMENT__DEFINED_IN_TYPE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__ELEMENTS);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__DEFINES);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		complexTypeReferenceEClass = createEClass(COMPLEX_TYPE_REFERENCE);
		createEReference(complexTypeReferenceEClass, COMPLEX_TYPE_REFERENCE__REFERRED);

		primitiveTypeReferenceEClass = createEClass(PRIMITIVE_TYPE_REFERENCE);

		intTypeReferenceEClass = createEClass(INT_TYPE_REFERENCE);

		boolTypeReferenceEClass = createEClass(BOOL_TYPE_REFERENCE);

		realTypeReferenceEClass = createEClass(REAL_TYPE_REFERENCE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RANGE);
		createEReference(functionEClass, FUNCTION__PARAMETERS);
		createEReference(functionEClass, FUNCTION__ANNOTATIONS);

		termEClass = createEClass(TERM);

		symbolicDeclarationEClass = createEClass(SYMBOLIC_DECLARATION);
		createEAttribute(symbolicDeclarationEClass, SYMBOLIC_DECLARATION__NAME);

		symbolicValueEClass = createEClass(SYMBOLIC_VALUE);
		createEReference(symbolicValueEClass, SYMBOLIC_VALUE__SYMBOLIC_REFERENCE);
		createEReference(symbolicValueEClass, SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS);

		atomicTermEClass = createEClass(ATOMIC_TERM);

		intLiteralEClass = createEClass(INT_LITERAL);
		createEAttribute(intLiteralEClass, INT_LITERAL__VALUE);

		boolLiteralEClass = createEClass(BOOL_LITERAL);
		createEAttribute(boolLiteralEClass, BOOL_LITERAL__VALUE);

		realLiteralEClass = createEClass(REAL_LITERAL);
		createEAttribute(realLiteralEClass, REAL_LITERAL__VALUE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__RANGE);

		quantifiedExpressionEClass = createEClass(QUANTIFIED_EXPRESSION);
		createEReference(quantifiedExpressionEClass, QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES);
		createEReference(quantifiedExpressionEClass, QUANTIFIED_EXPRESSION__EXPRESSION);

		existsEClass = createEClass(EXISTS);

		forallEClass = createEClass(FORALL);

		boolOperationEClass = createEClass(BOOL_OPERATION);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__OPERANDS);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__OPERANDS);

		implEClass = createEClass(IMPL);
		createEReference(implEClass, IMPL__LEFT_OPERAND);
		createEReference(implEClass, IMPL__RIGHT_OPERAND);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__OPERAND);

		iffEClass = createEClass(IFF);
		createEReference(iffEClass, IFF__LEFT_OPERAND);
		createEReference(iffEClass, IFF__RIGHT_OPERAND);

		primitiveRelationEClass = createEClass(PRIMITIVE_RELATION);

		equalsEClass = createEClass(EQUALS);
		createEReference(equalsEClass, EQUALS__LEFT_OPERAND);
		createEReference(equalsEClass, EQUALS__RIGHT_OPERAND);

		distinctEClass = createEClass(DISTINCT);
		createEReference(distinctEClass, DISTINCT__OPERANDS);

		lessThanEClass = createEClass(LESS_THAN);
		createEReference(lessThanEClass, LESS_THAN__LEFT_OPERAND);
		createEReference(lessThanEClass, LESS_THAN__RIGHT_OPERAND);

		moreThanEClass = createEClass(MORE_THAN);
		createEReference(moreThanEClass, MORE_THAN__LEFT_OPERAND);
		createEReference(moreThanEClass, MORE_THAN__RIGHT_OPERAND);

		lessOrEqualThanEClass = createEClass(LESS_OR_EQUAL_THAN);
		createEReference(lessOrEqualThanEClass, LESS_OR_EQUAL_THAN__LEFT_OPERAND);
		createEReference(lessOrEqualThanEClass, LESS_OR_EQUAL_THAN__RIGHT_OPERAND);

		moreOrEqualThanEClass = createEClass(MORE_OR_EQUAL_THAN);
		createEReference(moreOrEqualThanEClass, MORE_OR_EQUAL_THAN__LEFT_OPERAND);
		createEReference(moreOrEqualThanEClass, MORE_OR_EQUAL_THAN__RIGHT_OPERAND);

		intOperationEClass = createEClass(INT_OPERATION);
		createEReference(intOperationEClass, INT_OPERATION__LEFT_OPERAND);
		createEReference(intOperationEClass, INT_OPERATION__RIGHT_OPERAND);

		plusEClass = createEClass(PLUS);

		minusEClass = createEClass(MINUS);

		multiplyEClass = createEClass(MULTIPLY);

		divisonEClass = createEClass(DIVISON);

		modEClass = createEClass(MOD);

		typeDescriptorEClass = createEClass(TYPE_DESCRIPTOR);

		termDescriptionEClass = createEClass(TERM_DESCRIPTION);

		assertionEClass = createEClass(ASSERTION);
		createEReference(assertionEClass, ASSERTION__VALUE);
		createEAttribute(assertionEClass, ASSERTION__NAME);
		createEReference(assertionEClass, ASSERTION__ANNOTATIONS);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__PARAMETERS);
		createEReference(relationEClass, RELATION__ANNOTATIONS);

		constantEClass = createEClass(CONSTANT);
		createEReference(constantEClass, CONSTANT__TYPE);
		createEReference(constantEClass, CONSTANT__ANNOTATIONS);

		constantDefinitionEClass = createEClass(CONSTANT_DEFINITION);
		createEReference(constantDefinitionEClass, CONSTANT_DEFINITION__VALUE);
		createEReference(constantDefinitionEClass, CONSTANT_DEFINITION__DEFINES);

		relationDefinitionEClass = createEClass(RELATION_DEFINITION);
		createEReference(relationDefinitionEClass, RELATION_DEFINITION__VARIABLES);
		createEReference(relationDefinitionEClass, RELATION_DEFINITION__VALUE);
		createEReference(relationDefinitionEClass, RELATION_DEFINITION__DEFINES);

		functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__VARIABLE);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__DEFINES);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__VALUE);

		ifThenElseEClass = createEClass(IF_THEN_ELSE);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__CONDITION);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__IF_TRUE);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__IF_FALSE);

		constantDeclarationEClass = createEClass(CONSTANT_DECLARATION);

		relationDeclarationEClass = createEClass(RELATION_DECLARATION);

		functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);

		unknownBecauseUninterpretedEClass = createEClass(UNKNOWN_BECAUSE_UNINTERPRETED);

		instanceOfEClass = createEClass(INSTANCE_OF);
		createEReference(instanceOfEClass, INSTANCE_OF__VALUE);
		createEReference(instanceOfEClass, INSTANCE_OF__RANGE);

		stringTypeReferenceEClass = createEClass(STRING_TYPE_REFERENCE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		transitiveClosureEClass = createEClass(TRANSITIVE_CLOSURE);
		createEReference(transitiveClosureEClass, TRANSITIVE_CLOSURE__LEFT_OPERAND);
		createEReference(transitiveClosureEClass, TRANSITIVE_CLOSURE__RIGHT_OPERAND);
		createEReference(transitiveClosureEClass, TRANSITIVE_CLOSURE__RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LogicproblemPackage theLogicproblemPackage = (LogicproblemPackage)EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(this.getTypeDescriptor());
		definedElementEClass.getESuperTypes().add(this.getSymbolicDeclaration());
		typeDefinitionEClass.getESuperTypes().add(this.getType());
		typeReferenceEClass.getESuperTypes().add(this.getTypeDescriptor());
		complexTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		primitiveTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		intTypeReferenceEClass.getESuperTypes().add(this.getPrimitiveTypeReference());
		boolTypeReferenceEClass.getESuperTypes().add(this.getPrimitiveTypeReference());
		realTypeReferenceEClass.getESuperTypes().add(this.getPrimitiveTypeReference());
		functionEClass.getESuperTypes().add(this.getSymbolicDeclaration());
		termEClass.getESuperTypes().add(this.getTermDescription());
		symbolicDeclarationEClass.getESuperTypes().add(this.getTermDescription());
		symbolicValueEClass.getESuperTypes().add(this.getTerm());
		atomicTermEClass.getESuperTypes().add(this.getTerm());
		intLiteralEClass.getESuperTypes().add(this.getAtomicTerm());
		boolLiteralEClass.getESuperTypes().add(this.getAtomicTerm());
		realLiteralEClass.getESuperTypes().add(this.getAtomicTerm());
		variableEClass.getESuperTypes().add(this.getSymbolicDeclaration());
		quantifiedExpressionEClass.getESuperTypes().add(this.getTerm());
		existsEClass.getESuperTypes().add(this.getQuantifiedExpression());
		forallEClass.getESuperTypes().add(this.getQuantifiedExpression());
		boolOperationEClass.getESuperTypes().add(this.getTerm());
		andEClass.getESuperTypes().add(this.getBoolOperation());
		orEClass.getESuperTypes().add(this.getBoolOperation());
		implEClass.getESuperTypes().add(this.getBoolOperation());
		notEClass.getESuperTypes().add(this.getBoolOperation());
		iffEClass.getESuperTypes().add(this.getBoolOperation());
		primitiveRelationEClass.getESuperTypes().add(this.getTerm());
		equalsEClass.getESuperTypes().add(this.getPrimitiveRelation());
		distinctEClass.getESuperTypes().add(this.getPrimitiveRelation());
		lessThanEClass.getESuperTypes().add(this.getPrimitiveRelation());
		moreThanEClass.getESuperTypes().add(this.getPrimitiveRelation());
		lessOrEqualThanEClass.getESuperTypes().add(this.getPrimitiveRelation());
		moreOrEqualThanEClass.getESuperTypes().add(this.getPrimitiveRelation());
		intOperationEClass.getESuperTypes().add(this.getTerm());
		plusEClass.getESuperTypes().add(this.getIntOperation());
		minusEClass.getESuperTypes().add(this.getIntOperation());
		multiplyEClass.getESuperTypes().add(this.getIntOperation());
		divisonEClass.getESuperTypes().add(this.getIntOperation());
		modEClass.getESuperTypes().add(this.getIntOperation());
		relationEClass.getESuperTypes().add(this.getSymbolicDeclaration());
		constantEClass.getESuperTypes().add(this.getSymbolicDeclaration());
		constantDefinitionEClass.getESuperTypes().add(this.getConstant());
		relationDefinitionEClass.getESuperTypes().add(this.getRelation());
		functionDefinitionEClass.getESuperTypes().add(this.getFunction());
		ifThenElseEClass.getESuperTypes().add(this.getTerm());
		constantDeclarationEClass.getESuperTypes().add(this.getConstant());
		relationDeclarationEClass.getESuperTypes().add(this.getRelation());
		functionDeclarationEClass.getESuperTypes().add(this.getFunction());
		typeDeclarationEClass.getESuperTypes().add(this.getType());
		unknownBecauseUninterpretedEClass.getESuperTypes().add(this.getTerm());
		instanceOfEClass.getESuperTypes().add(this.getTerm());
		stringTypeReferenceEClass.getESuperTypes().add(this.getPrimitiveTypeReference());
		stringLiteralEClass.getESuperTypes().add(this.getAtomicTerm());
		transitiveClosureEClass.getESuperTypes().add(this.getTerm());

		// Initialize classes, features, and operations; add parameters
		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Subtypes(), this.getType(), this.getType_Supertypes(), "subtypes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Supertypes(), this.getType(), this.getType_Subtypes(), "supertypes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definedElementEClass, DefinedElement.class, "DefinedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinedElement_DefinedInType(), this.getTypeDefinition(), this.getTypeDefinition_Elements(), "definedInType", null, 1, -1, DefinedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinition_Elements(), this.getDefinedElement(), this.getDefinedElement_DefinedInType(), "elements", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinition_Defines(), this.getTypeDeclaration(), null, "defines", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexTypeReferenceEClass, ComplexTypeReference.class, "ComplexTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexTypeReference_Referred(), this.getType(), null, "referred", null, 0, 1, ComplexTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeReferenceEClass, PrimitiveTypeReference.class, "PrimitiveTypeReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intTypeReferenceEClass, IntTypeReference.class, "IntTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolTypeReferenceEClass, BoolTypeReference.class, "BoolTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realTypeReferenceEClass, RealTypeReference.class, "RealTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Range(), this.getTypeReference(), null, "range", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getTypeReference(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Annotations(), theLogicproblemPackage.getFunctionAnnotation(), theLogicproblemPackage.getFunctionAnnotation_Target(), "annotations", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symbolicDeclarationEClass, SymbolicDeclaration.class, "SymbolicDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolicDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1, SymbolicDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolicValueEClass, SymbolicValue.class, "SymbolicValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolicValue_SymbolicReference(), this.getSymbolicDeclaration(), null, "symbolicReference", null, 0, 1, SymbolicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolicValue_ParameterSubstitutions(), this.getTerm(), null, "parameterSubstitutions", null, 0, -1, SymbolicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicTermEClass, AtomicTerm.class, "AtomicTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntLiteral_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolLiteralEClass, BoolLiteral.class, "BoolLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BoolLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realLiteralEClass, RealLiteral.class, "RealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealLiteral_Value(), ecorePackage.getEBigDecimal(), "value", null, 1, 1, RealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Range(), this.getTypeReference(), null, "range", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedExpressionEClass, QuantifiedExpression.class, "QuantifiedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifiedExpression_QuantifiedVariables(), this.getVariable(), null, "quantifiedVariables", null, 0, -1, QuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedExpression_Expression(), this.getTerm(), null, "expression", null, 0, 1, QuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existsEClass, Exists.class, "Exists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forallEClass, Forall.class, "Forall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolOperationEClass, BoolOperation.class, "BoolOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Operands(), this.getTerm(), null, "operands", null, 0, -1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Operands(), this.getTerm(), null, "operands", null, 0, -1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implEClass, Impl.class, "Impl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpl_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, Impl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpl_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, Impl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Operand(), this.getTerm(), null, "operand", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iffEClass, Iff.class, "Iff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIff_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, Iff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIff_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, Iff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveRelationEClass, PrimitiveRelation.class, "PrimitiveRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquals_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquals_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distinctEClass, Distinct.class, "Distinct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistinct_Operands(), this.getTerm(), null, "operands", null, 0, -1, Distinct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLessThan_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, LessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLessThan_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, LessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moreThanEClass, MoreThan.class, "MoreThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoreThan_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, MoreThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoreThan_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, MoreThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lessOrEqualThanEClass, LessOrEqualThan.class, "LessOrEqualThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLessOrEqualThan_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, LessOrEqualThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLessOrEqualThan_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, LessOrEqualThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moreOrEqualThanEClass, MoreOrEqualThan.class, "MoreOrEqualThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoreOrEqualThan_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, MoreOrEqualThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoreOrEqualThan_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, MoreOrEqualThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intOperationEClass, IntOperation.class, "IntOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntOperation_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, IntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntOperation_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, IntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplyEClass, Multiply.class, "Multiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisonEClass, Divison.class, "Divison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modEClass, Mod.class, "Mod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDescriptorEClass, TypeDescriptor.class, "TypeDescriptor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termDescriptionEClass, TermDescription.class, "TermDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertion_Value(), this.getTerm(), null, "value", null, 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_Name(), ecorePackage.getEString(), "name", null, 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertion_Annotations(), theLogicproblemPackage.getAssertionAnnotation(), theLogicproblemPackage.getAssertionAnnotation_Target(), "annotations", null, 0, -1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Parameters(), this.getTypeReference(), null, "parameters", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Annotations(), theLogicproblemPackage.getRelationAnnotation(), theLogicproblemPackage.getRelationAnnotation_Target(), "annotations", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstant_Type(), this.getTypeReference(), null, "type", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstant_Annotations(), theLogicproblemPackage.getConstantAnnotation(), theLogicproblemPackage.getConstantAnnotation_Target(), "annotations", null, 0, -1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantDefinitionEClass, ConstantDefinition.class, "ConstantDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantDefinition_Value(), this.getTerm(), null, "value", null, 1, 1, ConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstantDefinition_Defines(), this.getConstantDeclaration(), null, "defines", null, 0, 1, ConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationDefinitionEClass, RelationDefinition.class, "RelationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationDefinition_Variables(), this.getVariable(), null, "variables", null, 0, -1, RelationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationDefinition_Value(), this.getTerm(), null, "value", null, 1, 1, RelationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationDefinition_Defines(), this.getRelationDeclaration(), null, "defines", null, 0, 1, RelationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionDefinition_Variable(), this.getVariable(), null, "variable", null, 0, -1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDefinition_Defines(), this.getFunctionDeclaration(), null, "defines", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDefinition_Value(), this.getTerm(), null, "value", null, 1, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifThenElseEClass, IfThenElse.class, "IfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfThenElse_Condition(), this.getTerm(), null, "condition", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElse_IfTrue(), this.getTerm(), null, "ifTrue", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElse_IfFalse(), this.getTerm(), null, "ifFalse", null, 1, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantDeclarationEClass, ConstantDeclaration.class, "ConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationDeclarationEClass, RelationDeclaration.class, "RelationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownBecauseUninterpretedEClass, UnknownBecauseUninterpreted.class, "UnknownBecauseUninterpreted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceOfEClass, InstanceOf.class, "InstanceOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceOf_Value(), this.getTerm(), null, "value", null, 1, 1, InstanceOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceOf_Range(), this.getTypeReference(), null, "range", null, 1, 1, InstanceOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeReferenceEClass, StringTypeReference.class, "StringTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitiveClosureEClass, TransitiveClosure.class, "TransitiveClosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitiveClosure_LeftOperand(), this.getTerm(), null, "leftOperand", null, 0, 1, TransitiveClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitiveClosure_RightOperand(), this.getTerm(), null, "rightOperand", null, 0, 1, TransitiveClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitiveClosure_Relation(), this.getRelation(), null, "relation", null, 0, 1, TransitiveClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogiclanguagePackageImpl
