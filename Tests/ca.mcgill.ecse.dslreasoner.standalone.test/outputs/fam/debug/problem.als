one sig util'language {
	util'root : one type'InformationLink'class + (type'FunctionalOutput'class + (type'FunctionalInput'class + (type'FunctionalData'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'Function'class + (type'FunctionalInterface'class + (type'FunctionalElement'class + (type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart))))))))),
	util'contains : (type'InformationLink'class + (type'FunctionalOutput'class + (type'FunctionalInput'class + (type'FunctionalData'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'Function'class + (type'FunctionalInterface'class + (type'FunctionalElement'class + (type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart)))))))))) lone->set (type'InformationLink'class + (type'FunctionalOutput'class + (type'FunctionalInput'class + (type'FunctionalData'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'Function'class + (type'FunctionalInterface'class + (type'FunctionalElement'class + (type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart))))))))))
}
abstract sig util'Object {
}
sig type'FunctionalElement'class in util'Object {
	interface'reference'FunctionalElement : lone type'FunctionalInterface'class,
	parent'reference'FunctionalElement : lone type'Function'class
}
sig type'FunctionalArchitectureModel'class in util'Object {
	rootElements'reference'FunctionalArchitectureModel : set type'FunctionalElement'class
}
sig type'Function'class in type'FunctionalElement'class {
	subElements'reference'Function : set type'FunctionalElement'class,
	type'attribute'Function : one type'FunctionType'enum
}
sig type'FAMTerminator'class in util'Object {
	data'reference'FAMTerminator : lone type'FunctionalData'class
}
sig type'InformationLink'class in util'Object {
	from'reference'InformationLink : lone type'FunctionalOutput'class,
	to'reference'InformationLink : one type'FunctionalInput'class
}
sig type'FunctionalInterface'class in util'Object {
	data'reference'FunctionalInterface : set type'FunctionalData'class,
	element'reference'FunctionalInterface : lone type'FunctionalElement'class
}
sig type'FunctionalInput'class in type'FunctionalData'class {
	IncomingLinks'reference'FunctionalInput : set type'InformationLink'class
}
sig type'FunctionalOutput'class in type'FunctionalData'class {
	outgoingLinks'reference'FunctionalOutput : set type'InformationLink'class
}
sig type'FunctionalData'class in util'Object {
	terminator'reference'FunctionalData : lone type'FAMTerminator'class,
	interface'reference'FunctionalData : lone type'FunctionalInterface'class
}
sig type'FunctionType'enum in util'Object {
}
sig type'FunctionalArchitectureModel'class'DefinedPart in type'FunctionalArchitectureModel'class {
}
sig type'FunctionalArchitectureModel'class'UndefinedPart in type'FunctionalArchitectureModel'class {
}
one sig element'Root'literal'FunctionType,
element'Intermediate'literal'FunctionType,
element'Leaf'literal'FunctionType in type'FunctionType'enum {
}
one sig element'o'1 in type'FunctionalArchitectureModel'class'DefinedPart {
}
pred pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'terminatorAndInformation [parameter'T: type'FAMTerminator'class, parameter'I: type'InformationLink'class] {
	(some variable'Out: type'FunctionalOutput'class { parameter'I in variable'Out.outgoingLinks'reference'FunctionalOutput && parameter'T in variable'Out.terminator'reference'FunctionalData }) or (some variable'In: type'FunctionalInput'class { variable'In in parameter'I.to'reference'InformationLink && (variable'In in type'FunctionalInput'class && parameter'T in variable'In.terminator'reference'FunctionalData) })
}
pred pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'rootElements [parameter'Model: type'FunctionalArchitectureModel'class, parameter'Root: type'Function'class] {
	parameter'Root in type'Function'class && parameter'Root in parameter'Model.rootElements'reference'FunctionalArchitectureModel
}
pred pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'parent [parameter'Func: type'Function'class, parameter'Par: type'Function'class] {
	parameter'Func in type'Function'class && (parameter'Par in parameter'Func.parent'reference'FunctionalElement && parameter'Par in type'Function'class)
}
pred pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'model [parameter'This: type'FunctionalElement'class, parameter'Target: type'FunctionalArchitectureModel'class] {
	parameter'This in type'FunctionalElement'class && parameter'Target in type'FunctionalArchitectureModel'class
}
fact typedefinition'FunctionType'enum {
	type'FunctionType'enum = element'Root'literal'FunctionType + (element'Intermediate'literal'FunctionType + element'Leaf'literal'FunctionType)
}
fact typedefinition'FunctionalArchitectureModel'class'DefinedPart {
	type'FunctionalArchitectureModel'class'DefinedPart = element'o'1
}
fact typeElementsUnique'FunctionType'enum {
	element'Root'literal'FunctionType != element'Intermediate'literal'FunctionType && (element'Root'literal'FunctionType != element'Leaf'literal'FunctionType && (element'Root'literal'FunctionType != element'o'1 && (element'Intermediate'literal'FunctionType != element'Leaf'literal'FunctionType && (element'Intermediate'literal'FunctionType != element'o'1 && element'Leaf'literal'FunctionType != element'o'1))))
}
fact typeElementsUnique'FunctionalArchitectureModel'class'DefinedPart {
	element'Root'literal'FunctionType != element'Intermediate'literal'FunctionType && (element'Root'literal'FunctionType != element'Leaf'literal'FunctionType && (element'Root'literal'FunctionType != element'o'1 && (element'Intermediate'literal'FunctionType != element'Leaf'literal'FunctionType && (element'Intermediate'literal'FunctionType != element'o'1 && element'Leaf'literal'FunctionType != element'o'1))))
}
fact abstract'FunctionalElement'class {
	type'FunctionalElement'class = type'Function'class
}
fact abstract'FunctionalArchitectureModel'class {
	type'FunctionalArchitectureModel'class = type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart
}
fact abstract'FunctionalData'class {
	type'FunctionalData'class = type'FunctionalInput'class + type'FunctionalOutput'class
}
fact ObjectTypeDefinition {
	util'Object = type'FunctionalElement'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'InformationLink'class + (type'FunctionalInterface'class + (type'FunctionalData'class + type'FunctionType'enum)))))
}
fact common'types'FunctionalArchitectureModel'class'FunctionalElement'class {
	type'FunctionalArchitectureModel'class & type'FunctionalElement'class = none
}
fact common'types'FAMTerminator'class'FunctionalElement'class {
	type'FAMTerminator'class & type'FunctionalElement'class = none
}
fact common'types'FAMTerminator'class'FunctionalArchitectureModel'class {
	type'FAMTerminator'class & type'FunctionalArchitectureModel'class = none
}
fact common'types'InformationLink'class'FunctionalElement'class {
	type'InformationLink'class & type'FunctionalElement'class = none
}
fact common'types'InformationLink'class'FunctionalArchitectureModel'class {
	type'InformationLink'class & type'FunctionalArchitectureModel'class = none
}
fact common'types'InformationLink'class'FAMTerminator'class {
	type'InformationLink'class & type'FAMTerminator'class = none
}
fact common'types'FunctionalInterface'class'FunctionalElement'class {
	type'FunctionalInterface'class & type'FunctionalElement'class = none
}
fact common'types'FunctionalInterface'class'FunctionalArchitectureModel'class {
	type'FunctionalInterface'class & type'FunctionalArchitectureModel'class = none
}
fact common'types'FunctionalInterface'class'FAMTerminator'class {
	type'FunctionalInterface'class & type'FAMTerminator'class = none
}
fact common'types'FunctionalInterface'class'InformationLink'class {
	type'FunctionalInterface'class & type'InformationLink'class = none
}
fact common'types'FunctionalData'class'FunctionalElement'class {
	type'FunctionalData'class & type'FunctionalElement'class = none
}
fact common'types'FunctionalData'class'FunctionalArchitectureModel'class {
	type'FunctionalData'class & type'FunctionalArchitectureModel'class = none
}
fact common'types'FunctionalData'class'FAMTerminator'class {
	type'FunctionalData'class & type'FAMTerminator'class = none
}
fact common'types'FunctionalData'class'InformationLink'class {
	type'FunctionalData'class & type'InformationLink'class = none
}
fact common'types'FunctionalData'class'FunctionalInterface'class {
	type'FunctionalData'class & type'FunctionalInterface'class = none
}
fact common'types'FunctionType'enum'FunctionalElement'class {
	type'FunctionType'enum & type'FunctionalElement'class = none
}
fact common'types'FunctionType'enum'FunctionalArchitectureModel'class {
	type'FunctionType'enum & type'FunctionalArchitectureModel'class = none
}
fact common'types'FunctionType'enum'FAMTerminator'class {
	type'FunctionType'enum & type'FAMTerminator'class = none
}
fact common'types'FunctionType'enum'InformationLink'class {
	type'FunctionType'enum & type'InformationLink'class = none
}
fact common'types'FunctionType'enum'FunctionalInterface'class {
	type'FunctionType'enum & type'FunctionalInterface'class = none
}
fact common'types'FunctionType'enum'FunctionalData'class {
	type'FunctionType'enum & type'FunctionalData'class = none
}
fact common'types'FunctionalArchitectureModel'class'UndefinedPart'FunctionalArchitectureModel'class'DefinedPart {
	type'FunctionalArchitectureModel'class'UndefinedPart & type'FunctionalArchitectureModel'class'DefinedPart = none
}
fact common'types'FunctionalOutput'class'FunctionalInput'class {
	type'FunctionalOutput'class & type'FunctionalInput'class = none
}
fact util'containmentDefinition {
	util'language.util'contains = interface'reference'FunctionalElement + (rootElements'reference'FunctionalArchitectureModel + (subElements'reference'Function + (data'reference'FunctionalInterface + (outgoingLinks'reference'FunctionalOutput + terminator'reference'FunctionalData))))
}
fact util'noParentForRoot {
	no parent: type'InformationLink'class + (type'FunctionalOutput'class + (type'FunctionalInput'class + (type'FunctionalData'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'Function'class + (type'FunctionalInterface'class + (type'FunctionalElement'class + (type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart))))))))) { parent->(util'language.util'root) in util'language.util'contains }
}
fact util'atLeastOneParent {
	all child: type'InformationLink'class + (type'FunctionalOutput'class + (type'FunctionalInput'class + (type'FunctionalData'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'Function'class + (type'FunctionalInterface'class + (type'FunctionalElement'class + (type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart))))))))) { child = util'language.util'root or (some parent: type'InformationLink'class + (type'FunctionalOutput'class + (type'FunctionalInput'class + (type'FunctionalData'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'Function'class + (type'FunctionalInterface'class + (type'FunctionalElement'class + (type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart))))))))) { parent->child in util'language.util'contains }) }
}
fact util'noCircularContainment {
	no circle: type'InformationLink'class + (type'FunctionalOutput'class + (type'FunctionalInput'class + (type'FunctionalData'class + (type'FunctionalArchitectureModel'class + (type'FAMTerminator'class + (type'Function'class + (type'FunctionalInterface'class + (type'FunctionalElement'class + (type'FunctionalArchitectureModel'class'DefinedPart + type'FunctionalArchitectureModel'class'UndefinedPart))))))))) { circle->circle in ^ (util'language.util'contains) }
}
fact lowerMultiplicity'model'FunctionalElement {
	all src: type'FunctionalElement'class { some trg'1: type'FunctionalArchitectureModel'class { pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'model [ src , trg'1 ] } }
}
fact upperMultiplicity'model'FunctionalElement {
	all src: type'FunctionalElement'class, trg'1: type'FunctionalArchitectureModel'class, trg'2: type'FunctionalArchitectureModel'class { pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'model [ src , trg'1 ] && pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'model [ src , trg'2 ] implies ! (trg'1 != trg'2) }
}
fact oppositeReference'interface'FunctionalElement {
	interface'reference'FunctionalElement = ~ element'reference'FunctionalInterface
}
fact oppositeReference'parent'FunctionalElement {
	parent'reference'FunctionalElement = ~ subElements'reference'Function
}
fact oppositeReference'data'FAMTerminator {
	data'reference'FAMTerminator = ~ terminator'reference'FunctionalData
}
fact oppositeReference'from'InformationLink {
	from'reference'InformationLink = ~ outgoingLinks'reference'FunctionalOutput
}
fact oppositeReference'to'InformationLink {
	to'reference'InformationLink = ~ IncomingLinks'reference'FunctionalInput
}
fact oppositeReference'data'FunctionalInterface {
	data'reference'FunctionalInterface = ~ interface'reference'FunctionalData
}
fact errorpattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'terminatorAndInformation {
	all p0: type'FAMTerminator'class, p1: type'InformationLink'class { ! (pattern'ca'mcgill'ecse'dslreasoner'standalone'test'fam'queries'terminatorAndInformation [ p0 , p1 ]) }
}
run { } for exactly 10 util'Object , 31 Int , exactly 0 String