enum util'boolean {
	util'boolean'true, util'boolean'false
}
one sig util'language {
	util'root : one type'EEnumLiteral'class + (type'EEnum'class + (type'EAnnotation'class + (type'EDataType'class + (type'EGenericType'class + (type'ENamedElement'class + (type'EModelElement'class + (type'ETypedElement'class + (type'EAttribute'class + (type'EObject'class + (type'EClass'class + (type'EStringToStringMapEntry'class + (type'EPackage'class + (type'EReference'class + (type'EClassifier'class + (type'EOperation'class + (type'ETypeParameter'class + (type'EParameter'class + (type'EStructuralFeature'class + (type'EModelElement'class'DefinedPart + (type'EModelElement'class'UndefinedPart + (type'ENamedElement'class'DefinedPart + (type'ENamedElement'class'UndefinedPart + (type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart))))))))))))))))))))))),
	util'contains : (type'EEnumLiteral'class + (type'EEnum'class + (type'EAnnotation'class + (type'EDataType'class + (type'EGenericType'class + (type'ENamedElement'class + (type'EModelElement'class + (type'ETypedElement'class + (type'EAttribute'class + (type'EObject'class + (type'EClass'class + (type'EStringToStringMapEntry'class + (type'EPackage'class + (type'EReference'class + (type'EClassifier'class + (type'EOperation'class + (type'ETypeParameter'class + (type'EParameter'class + (type'EStructuralFeature'class + (type'EModelElement'class'DefinedPart + (type'EModelElement'class'UndefinedPart + (type'ENamedElement'class'DefinedPart + (type'ENamedElement'class'UndefinedPart + (type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart)))))))))))))))))))))))) lone->set (type'EEnumLiteral'class + (type'EEnum'class + (type'EAnnotation'class + (type'EDataType'class + (type'EGenericType'class + (type'ENamedElement'class + (type'EModelElement'class + (type'ETypedElement'class + (type'EAttribute'class + (type'EObject'class + (type'EClass'class + (type'EStringToStringMapEntry'class + (type'EPackage'class + (type'EReference'class + (type'EClassifier'class + (type'EOperation'class + (type'ETypeParameter'class + (type'EParameter'class + (type'EStructuralFeature'class + (type'EModelElement'class'DefinedPart + (type'EModelElement'class'UndefinedPart + (type'ENamedElement'class'DefinedPart + (type'ENamedElement'class'UndefinedPart + (type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart))))))))))))))))))))))))
}
abstract sig util'Object {
}
sig type'EAttribute'class in type'EStructuralFeature'class {
	eAttributeType'reference'EAttribute : one type'EDataType'class,
	iD'attribute'EAttribute : lone util'boolean
}
sig type'EAnnotation'class in type'EModelElement'class + type'EModelElement'class'UndefinedPart {
	details'reference'EAnnotation : set type'EStringToStringMapEntry'class,
	eModelElement'reference'EAnnotation : lone type'EModelElement'class,
	contents'reference'EAnnotation : set type'EObject'class,
	references'reference'EAnnotation : set type'EObject'class,
	source'attribute'EAnnotation : lone String
}
sig type'EClass'class in type'EClassifier'class {
	eSuperTypes'reference'EClass : set type'EClass'class,
	eOperations'reference'EClass : set type'EOperation'class,
	eAllAttributes'reference'EClass : set type'EAttribute'class,
	eAllReferences'reference'EClass : set type'EReference'class,
	eReferences'reference'EClass : set type'EReference'class,
	eAttributes'reference'EClass : set type'EAttribute'class,
	eAllContainments'reference'EClass : set type'EReference'class,
	eAllOperations'reference'EClass : set type'EOperation'class,
	eAllStructuralFeatures'reference'EClass : set type'EStructuralFeature'class,
	eAllSuperTypes'reference'EClass : set type'EClass'class,
	eIDAttribute'reference'EClass : lone type'EAttribute'class,
	eStructuralFeatures'reference'EClass : set type'EStructuralFeature'class,
	eGenericSuperTypes'reference'EClass : set type'EGenericType'class,
	eAllGenericSuperTypes'reference'EClass : set type'EGenericType'class,
	abstract'attribute'EClass : lone util'boolean,
	interface'attribute'EClass : lone util'boolean
}
sig type'EClassifier'class in type'ENamedElement'class + type'ENamedElement'class'UndefinedPart {
	ePackage'reference'EClassifier : lone type'EPackage'class,
	eTypeParameters'reference'EClassifier : set type'ETypeParameter'class,
	instanceClassName'attribute'EClassifier : lone String,
	instanceTypeName'attribute'EClassifier : lone String
}
sig type'EDataType'class in type'EClassifier'class {
	serializable'attribute'EDataType : lone util'boolean
}
sig type'EEnum'class in type'EDataType'class {
	eLiterals'reference'EEnum : set type'EEnumLiteral'class
}
sig type'EEnumLiteral'class in type'ENamedElement'class + type'ENamedElement'class'UndefinedPart {
	eEnum'reference'EEnumLiteral : lone type'EEnum'class,
	value'attribute'EEnumLiteral : lone Int,
	literal'attribute'EEnumLiteral : lone String
}
sig type'EModelElement'class in util'Object {
	eAnnotations'reference'EModelElement : set type'EAnnotation'class
}
sig type'ENamedElement'class in type'EModelElement'class {
	name'attribute'ENamedElement : lone String
}
sig type'EObject'class in util'Object {
}
sig type'EOperation'class in type'ETypedElement'class {
	eContainingClass'reference'EOperation : lone type'EClass'class,
	eTypeParameters'reference'EOperation : set type'ETypeParameter'class,
	eParameters'reference'EOperation : set type'EParameter'class,
	eExceptions'reference'EOperation : set type'EClassifier'class,
	eGenericExceptions'reference'EOperation : set type'EGenericType'class
}
sig type'EPackage'class in type'ENamedElement'class {
	eClassifiers'reference'EPackage : set type'EClassifier'class,
	eSubpackages'reference'EPackage : set type'EPackage'class,
	eSuperPackage'reference'EPackage : lone type'EPackage'class,
	nsURI'attribute'EPackage : lone String,
	nsPrefix'attribute'EPackage : lone String
}
sig type'EParameter'class in type'ETypedElement'class {
	eOperation'reference'EParameter : lone type'EOperation'class
}
sig type'EReference'class in type'EStructuralFeature'class {
	eOpposite'reference'EReference : lone type'EReference'class,
	eReferenceType'reference'EReference : one type'EClass'class,
	eKeys'reference'EReference : set type'EAttribute'class,
	containment'attribute'EReference : lone util'boolean,
	container'attribute'EReference : lone util'boolean,
	resolveProxies'attribute'EReference : lone util'boolean
}
sig type'EStructuralFeature'class in type'ETypedElement'class {
	eContainingClass'reference'EStructuralFeature : lone type'EClass'class,
	changeable'attribute'EStructuralFeature : lone util'boolean,
	volatile'attribute'EStructuralFeature : lone util'boolean,
	transient'attribute'EStructuralFeature : lone util'boolean,
	defaultValueLiteral'attribute'EStructuralFeature : lone String,
	unsettable'attribute'EStructuralFeature : lone util'boolean,
	derived'attribute'EStructuralFeature : lone util'boolean
}
sig type'ETypedElement'class in type'ENamedElement'class + type'ENamedElement'class'UndefinedPart {
	eType'reference'ETypedElement : lone type'EClassifier'class,
	eGenericType'reference'ETypedElement : lone type'EGenericType'class,
	ordered'attribute'ETypedElement : lone util'boolean,
	unique'attribute'ETypedElement : lone util'boolean,
	lowerBound'attribute'ETypedElement : lone Int,
	upperBound'attribute'ETypedElement : lone Int,
	many'attribute'ETypedElement : lone util'boolean,
	required'attribute'ETypedElement : lone util'boolean
}
sig type'EStringToStringMapEntry'class in util'Object {
	key'attribute'EStringToStringMapEntry : lone String,
	value'attribute'EStringToStringMapEntry : lone String
}
sig type'EGenericType'class in util'Object {
	eUpperBound'reference'EGenericType : lone type'EGenericType'class,
	eTypeArguments'reference'EGenericType : set type'EGenericType'class,
	eRawType'reference'EGenericType : one type'EClassifier'class,
	eLowerBound'reference'EGenericType : lone type'EGenericType'class,
	eTypeParameter'reference'EGenericType : lone type'ETypeParameter'class,
	eClassifier'reference'EGenericType : lone type'EClassifier'class
}
sig type'ETypeParameter'class in type'ENamedElement'class + type'ENamedElement'class'UndefinedPart {
	eBounds'reference'ETypeParameter : set type'EGenericType'class
}
sig type'EModelElement'class'DefinedPart in type'EModelElement'class {
}
sig type'EModelElement'class'UndefinedPart in type'EModelElement'class {
}
sig type'ENamedElement'class'DefinedPart in type'ENamedElement'class + type'EModelElement'class'DefinedPart {
}
sig type'ENamedElement'class'UndefinedPart in type'ENamedElement'class + type'EModelElement'class'UndefinedPart {
}
sig type'EPackage'class'DefinedPart in type'EPackage'class + type'ENamedElement'class'DefinedPart {
}
sig type'EPackage'class'UndefinedPart in type'EPackage'class + type'ENamedElement'class'UndefinedPart {
}
one sig element'o'1 in type'EModelElement'class'DefinedPart {
}
fact typedefinition'EModelElement'class'DefinedPart {
	type'EModelElement'class'DefinedPart = element'o'1
}
fact typedefinition'ENamedElement'class'DefinedPart {
	type'ENamedElement'class'DefinedPart = element'o'1
}
fact typedefinition'EPackage'class'DefinedPart {
	type'EPackage'class'DefinedPart = element'o'1
}
fact abstract'EAnnotation'class {
	type'EAnnotation'class = type'EModelElement'class & type'EModelElement'class'UndefinedPart
}
fact abstract'EClassifier'class {
	type'EClassifier'class = type'ENamedElement'class & type'ENamedElement'class'UndefinedPart
}
fact abstract'EEnumLiteral'class {
	type'EEnumLiteral'class = type'ENamedElement'class & type'ENamedElement'class'UndefinedPart
}
fact abstract'ETypedElement'class {
	type'ETypedElement'class = type'ENamedElement'class & type'ENamedElement'class'UndefinedPart
}
fact abstract'ETypeParameter'class {
	type'ETypeParameter'class = type'ENamedElement'class & type'ENamedElement'class'UndefinedPart
}
fact abstract'ENamedElement'class'DefinedPart {
	type'ENamedElement'class'DefinedPart = type'ENamedElement'class & type'EModelElement'class'DefinedPart
}
fact abstract'ENamedElement'class'UndefinedPart {
	type'ENamedElement'class'UndefinedPart = type'ENamedElement'class & type'EModelElement'class'UndefinedPart
}
fact abstract'EPackage'class'DefinedPart {
	type'EPackage'class'DefinedPart = type'EPackage'class & type'ENamedElement'class'DefinedPart
}
fact abstract'EPackage'class'UndefinedPart {
	type'EPackage'class'UndefinedPart = type'EPackage'class & type'ENamedElement'class'UndefinedPart
}
fact abstract'EClassifier'class {
	type'EClassifier'class = type'EClass'class + type'EDataType'class
}
fact abstract'EModelElement'class {
	type'EModelElement'class = type'EAnnotation'class + (type'ENamedElement'class + (type'EModelElement'class'DefinedPart + type'EModelElement'class'UndefinedPart))
}
fact abstract'ENamedElement'class {
	type'ENamedElement'class = type'EClassifier'class + (type'EEnumLiteral'class + (type'EPackage'class + (type'ETypedElement'class + (type'ETypeParameter'class + (type'ENamedElement'class'DefinedPart + type'ENamedElement'class'UndefinedPart)))))
}
fact abstract'EPackage'class {
	type'EPackage'class = type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart
}
fact abstract'EStructuralFeature'class {
	type'EStructuralFeature'class = type'EAttribute'class + type'EReference'class
}
fact abstract'ETypedElement'class {
	type'ETypedElement'class = type'EOperation'class + (type'EParameter'class + type'EStructuralFeature'class)
}
fact abstract'EModelElement'class'DefinedPart {
	type'EModelElement'class'DefinedPart = type'ENamedElement'class'DefinedPart
}
fact abstract'EModelElement'class'UndefinedPart {
	type'EModelElement'class'UndefinedPart = type'EAnnotation'class + type'ENamedElement'class'UndefinedPart
}
fact abstract'ENamedElement'class'DefinedPart {
	type'ENamedElement'class'DefinedPart = type'EPackage'class'DefinedPart
}
fact abstract'ENamedElement'class'UndefinedPart {
	type'ENamedElement'class'UndefinedPart = type'EClassifier'class + (type'EEnumLiteral'class + (type'EPackage'class'UndefinedPart + (type'ETypedElement'class + type'ETypeParameter'class)))
}
fact ObjectTypeDefinition {
	util'Object = type'EModelElement'class + (type'EObject'class + (type'EStringToStringMapEntry'class + type'EGenericType'class))
}
fact common'types'EObject'class'EModelElement'class {
	type'EObject'class & type'EModelElement'class = none
}
fact common'types'EStringToStringMapEntry'class'EModelElement'class {
	type'EStringToStringMapEntry'class & type'EModelElement'class = none
}
fact common'types'EStringToStringMapEntry'class'EObject'class {
	type'EStringToStringMapEntry'class & type'EObject'class = none
}
fact common'types'EGenericType'class'EModelElement'class {
	type'EGenericType'class & type'EModelElement'class = none
}
fact common'types'EGenericType'class'EObject'class {
	type'EGenericType'class & type'EObject'class = none
}
fact common'types'EGenericType'class'EStringToStringMapEntry'class {
	type'EGenericType'class & type'EStringToStringMapEntry'class = none
}
fact common'types'EDataType'class'EClass'class {
	type'EDataType'class & type'EClass'class = none
}
fact common'types'ENamedElement'class'EAnnotation'class {
	type'ENamedElement'class & type'EAnnotation'class = none
}
fact common'types'EModelElement'class'DefinedPart'EAnnotation'class {
	type'EModelElement'class'DefinedPart & type'EAnnotation'class = none
}
fact common'types'EModelElement'class'DefinedPart'ENamedElement'class {
	type'EModelElement'class'DefinedPart & type'ENamedElement'class = type'ENamedElement'class'DefinedPart
}
fact common'types'EModelElement'class'UndefinedPart'EAnnotation'class {
	type'EModelElement'class'UndefinedPart & type'EAnnotation'class = type'EAnnotation'class
}
fact common'types'EModelElement'class'UndefinedPart'ENamedElement'class {
	type'EModelElement'class'UndefinedPart & type'ENamedElement'class = type'ENamedElement'class'UndefinedPart
}
fact common'types'EModelElement'class'UndefinedPart'EModelElement'class'DefinedPart {
	type'EModelElement'class'UndefinedPart & type'EModelElement'class'DefinedPart = none
}
fact common'types'EEnumLiteral'class'EClassifier'class {
	type'EEnumLiteral'class & type'EClassifier'class = none
}
fact common'types'EPackage'class'EClassifier'class {
	type'EPackage'class & type'EClassifier'class = none
}
fact common'types'EPackage'class'EEnumLiteral'class {
	type'EPackage'class & type'EEnumLiteral'class = none
}
fact common'types'ETypedElement'class'EClassifier'class {
	type'ETypedElement'class & type'EClassifier'class = none
}
fact common'types'ETypedElement'class'EEnumLiteral'class {
	type'ETypedElement'class & type'EEnumLiteral'class = none
}
fact common'types'ETypedElement'class'EPackage'class {
	type'ETypedElement'class & type'EPackage'class = none
}
fact common'types'ETypeParameter'class'EClassifier'class {
	type'ETypeParameter'class & type'EClassifier'class = none
}
fact common'types'ETypeParameter'class'EEnumLiteral'class {
	type'ETypeParameter'class & type'EEnumLiteral'class = none
}
fact common'types'ETypeParameter'class'EPackage'class {
	type'ETypeParameter'class & type'EPackage'class = none
}
fact common'types'ETypeParameter'class'ETypedElement'class {
	type'ETypeParameter'class & type'ETypedElement'class = none
}
fact common'types'ENamedElement'class'DefinedPart'EClassifier'class {
	type'ENamedElement'class'DefinedPart & type'EClassifier'class = none
}
fact common'types'ENamedElement'class'DefinedPart'EEnumLiteral'class {
	type'ENamedElement'class'DefinedPart & type'EEnumLiteral'class = none
}
fact common'types'ENamedElement'class'DefinedPart'EPackage'class {
	type'ENamedElement'class'DefinedPart & type'EPackage'class = type'EPackage'class'DefinedPart
}
fact common'types'ENamedElement'class'DefinedPart'ETypedElement'class {
	type'ENamedElement'class'DefinedPart & type'ETypedElement'class = none
}
fact common'types'ENamedElement'class'DefinedPart'ETypeParameter'class {
	type'ENamedElement'class'DefinedPart & type'ETypeParameter'class = none
}
fact common'types'ENamedElement'class'UndefinedPart'EClassifier'class {
	type'ENamedElement'class'UndefinedPart & type'EClassifier'class = type'EClassifier'class
}
fact common'types'ENamedElement'class'UndefinedPart'EEnumLiteral'class {
	type'ENamedElement'class'UndefinedPart & type'EEnumLiteral'class = type'EEnumLiteral'class
}
fact common'types'ENamedElement'class'UndefinedPart'EPackage'class {
	type'ENamedElement'class'UndefinedPart & type'EPackage'class = type'EPackage'class'UndefinedPart
}
fact common'types'ENamedElement'class'UndefinedPart'ETypedElement'class {
	type'ENamedElement'class'UndefinedPart & type'ETypedElement'class = type'ETypedElement'class
}
fact common'types'ENamedElement'class'UndefinedPart'ETypeParameter'class {
	type'ENamedElement'class'UndefinedPart & type'ETypeParameter'class = type'ETypeParameter'class
}
fact common'types'ENamedElement'class'UndefinedPart'ENamedElement'class'DefinedPart {
	type'ENamedElement'class'UndefinedPart & type'ENamedElement'class'DefinedPart = none
}
fact common'types'EPackage'class'UndefinedPart'EPackage'class'DefinedPart {
	type'EPackage'class'UndefinedPart & type'EPackage'class'DefinedPart = none
}
fact common'types'EReference'class'EAttribute'class {
	type'EReference'class & type'EAttribute'class = none
}
fact common'types'EParameter'class'EOperation'class {
	type'EParameter'class & type'EOperation'class = none
}
fact common'types'EStructuralFeature'class'EOperation'class {
	type'EStructuralFeature'class & type'EOperation'class = none
}
fact common'types'EStructuralFeature'class'EParameter'class {
	type'EStructuralFeature'class & type'EParameter'class = none
}
fact common'types'ENamedElement'class'UndefinedPart'EAnnotation'class {
	type'ENamedElement'class'UndefinedPart & type'EAnnotation'class = none
}
fact common'types'EEnumLiteral'class'EClassifier'class {
	type'EEnumLiteral'class & type'EClassifier'class = none
}
fact common'types'EPackage'class'UndefinedPart'EClassifier'class {
	type'EPackage'class'UndefinedPart & type'EClassifier'class = none
}
fact common'types'EPackage'class'UndefinedPart'EEnumLiteral'class {
	type'EPackage'class'UndefinedPart & type'EEnumLiteral'class = none
}
fact common'types'ETypedElement'class'EClassifier'class {
	type'ETypedElement'class & type'EClassifier'class = none
}
fact common'types'ETypedElement'class'EEnumLiteral'class {
	type'ETypedElement'class & type'EEnumLiteral'class = none
}
fact common'types'ETypedElement'class'EPackage'class'UndefinedPart {
	type'ETypedElement'class & type'EPackage'class'UndefinedPart = none
}
fact common'types'ETypeParameter'class'EClassifier'class {
	type'ETypeParameter'class & type'EClassifier'class = none
}
fact common'types'ETypeParameter'class'EEnumLiteral'class {
	type'ETypeParameter'class & type'EEnumLiteral'class = none
}
fact common'types'ETypeParameter'class'EPackage'class'UndefinedPart {
	type'ETypeParameter'class & type'EPackage'class'UndefinedPart = none
}
fact common'types'ETypeParameter'class'ETypedElement'class {
	type'ETypeParameter'class & type'ETypedElement'class = none
}
fact util'containmentDefinition {
	util'language.util'contains = details'reference'EAnnotation + (contents'reference'EAnnotation + (eOperations'reference'EClass + (eStructuralFeatures'reference'EClass + (eGenericSuperTypes'reference'EClass + (eTypeParameters'reference'EClassifier + (eLiterals'reference'EEnum + (eAnnotations'reference'EModelElement + (eTypeParameters'reference'EOperation + (eParameters'reference'EOperation + (eGenericExceptions'reference'EOperation + (eClassifiers'reference'EPackage + (eSubpackages'reference'EPackage + (eGenericType'reference'ETypedElement + (eUpperBound'reference'EGenericType + (eTypeArguments'reference'EGenericType + (eLowerBound'reference'EGenericType + eBounds'reference'ETypeParameter))))))))))))))))
}
fact util'noParentForRoot {
	no parent: type'EEnumLiteral'class + (type'EEnum'class + (type'EAnnotation'class + (type'EDataType'class + (type'EGenericType'class + (type'ENamedElement'class + (type'EModelElement'class + (type'ETypedElement'class + (type'EAttribute'class + (type'EObject'class + (type'EClass'class + (type'EStringToStringMapEntry'class + (type'EPackage'class + (type'EReference'class + (type'EClassifier'class + (type'EOperation'class + (type'ETypeParameter'class + (type'EParameter'class + (type'EStructuralFeature'class + (type'EModelElement'class'DefinedPart + (type'EModelElement'class'UndefinedPart + (type'ENamedElement'class'DefinedPart + (type'ENamedElement'class'UndefinedPart + (type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart))))))))))))))))))))))) { parent->(util'language.util'root) in util'language.util'contains }
}
fact util'atLeastOneParent {
	all child: type'EEnumLiteral'class + (type'EEnum'class + (type'EAnnotation'class + (type'EDataType'class + (type'EGenericType'class + (type'ENamedElement'class + (type'EModelElement'class + (type'ETypedElement'class + (type'EAttribute'class + (type'EObject'class + (type'EClass'class + (type'EStringToStringMapEntry'class + (type'EPackage'class + (type'EReference'class + (type'EClassifier'class + (type'EOperation'class + (type'ETypeParameter'class + (type'EParameter'class + (type'EStructuralFeature'class + (type'EModelElement'class'DefinedPart + (type'EModelElement'class'UndefinedPart + (type'ENamedElement'class'DefinedPart + (type'ENamedElement'class'UndefinedPart + (type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart))))))))))))))))))))))) { child = util'language.util'root or (some parent: type'EEnumLiteral'class + (type'EEnum'class + (type'EAnnotation'class + (type'EDataType'class + (type'EGenericType'class + (type'ENamedElement'class + (type'EModelElement'class + (type'ETypedElement'class + (type'EAttribute'class + (type'EObject'class + (type'EClass'class + (type'EStringToStringMapEntry'class + (type'EPackage'class + (type'EReference'class + (type'EClassifier'class + (type'EOperation'class + (type'ETypeParameter'class + (type'EParameter'class + (type'EStructuralFeature'class + (type'EModelElement'class'DefinedPart + (type'EModelElement'class'UndefinedPart + (type'ENamedElement'class'DefinedPart + (type'ENamedElement'class'UndefinedPart + (type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart))))))))))))))))))))))) { parent->child in util'language.util'contains }) }
}
fact util'noCircularContainment {
	no circle: type'EEnumLiteral'class + (type'EEnum'class + (type'EAnnotation'class + (type'EDataType'class + (type'EGenericType'class + (type'ENamedElement'class + (type'EModelElement'class + (type'ETypedElement'class + (type'EAttribute'class + (type'EObject'class + (type'EClass'class + (type'EStringToStringMapEntry'class + (type'EPackage'class + (type'EReference'class + (type'EClassifier'class + (type'EOperation'class + (type'ETypeParameter'class + (type'EParameter'class + (type'EStructuralFeature'class + (type'EModelElement'class'DefinedPart + (type'EModelElement'class'UndefinedPart + (type'ENamedElement'class'DefinedPart + (type'ENamedElement'class'UndefinedPart + (type'EPackage'class'DefinedPart + type'EPackage'class'UndefinedPart))))))))))))))))))))))) { circle->circle in ^ (util'language.util'contains) }
}
fact oppositeReference'eModelElement'EAnnotation {
	eModelElement'reference'EAnnotation = ~ eAnnotations'reference'EModelElement
}
fact oppositeReference'eOperations'EClass {
	eOperations'reference'EClass = ~ eContainingClass'reference'EOperation
}
fact oppositeReference'eStructuralFeatures'EClass {
	eStructuralFeatures'reference'EClass = ~ eContainingClass'reference'EStructuralFeature
}
fact oppositeReference'ePackage'EClassifier {
	ePackage'reference'EClassifier = ~ eClassifiers'reference'EPackage
}
fact oppositeReference'eLiterals'EEnum {
	eLiterals'reference'EEnum = ~ eEnum'reference'EEnumLiteral
}
fact oppositeReference'eParameters'EOperation {
	eParameters'reference'EOperation = ~ eOperation'reference'EParameter
}
fact oppositeReference'eSubpackages'EPackage {
	eSubpackages'reference'EPackage = ~ eSuperPackage'reference'EPackage
}
fact PartialInterpretation'name'attribute'ENamedElement {
	"packageName" in element'o'1.name'attribute'ENamedElement
}
fact PartialInterpretation'nsURI'attribute'EPackage {
	"nsUri" in element'o'1.nsURI'attribute'EPackage
}
fact PartialInterpretation'nsPrefix'attribute'EPackage {
	"nsPrefix" in element'o'1.nsPrefix'attribute'EPackage
}
fact EnsureAllStrings {
	"A" = "A" && ("B" = "B" && ("nsPrefix" = "nsPrefix" && ("nsUri" = "nsUri" && "packageName" = "packageName")))
}
run { } for exactly 6 util'Object , 2 Int , exactly 0 String