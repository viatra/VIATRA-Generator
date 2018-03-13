one sig util'language {
}
abstract sig util'Object {
}
sig type'RPS in util'Object {
}
one sig element'Rock,
element'Paper,
element'Scissor in type'RPS {
}
fact typedefinition'RPS {
	type'RPS = element'Rock + (element'Paper + element'Scissor)
}
fact typeElementsUnique'RPS {
	element'Rock != element'Paper && (element'Rock != element'Scissor && element'Paper != element'Scissor)
}
fact ObjectTypeDefinition {
	util'Object = type'RPS
}
run { } for exactly 8 util'Object , 0 Int
