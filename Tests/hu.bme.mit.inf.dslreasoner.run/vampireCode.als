one sig util'language {
}
abstract sig util'Object {
}
sig type'allRPS in util'Object {
}
sig type'oldRPS in type'allRPS {
}
sig type'newRPS in type'allRPS {
}
sig type'color in util'Object {
}
one sig element'Rock,
element'Paper,
element'Scissor in type'oldRPS {
}
one sig element'Red,
element'Green in type'color {
}
fact typedefinition'oldRPS {
	type'oldRPS = element'Rock + (element'Paper + element'Scissor)
}
fact typedefinition'color {
	type'color = element'Red + element'Green
}
fact typeElementsUnique'oldRPS {
	element'Rock != element'Paper and (element'Rock != element'Scissor and (element'Rock != element'Red and (element'Rock != element'Green and (element'Paper != element'Scissor and (element'Paper != element'Red and (element'Paper != element'Green and (element'Scissor != element'Red and (element'Scissor != element'Green and element'Red != element'Green))))))))
}
fact typeElementsUnique'color {
	element'Rock != element'Paper and (element'Rock != element'Scissor and (element'Rock != element'Red and (element'Rock != element'Green and (element'Paper != element'Scissor and (element'Paper != element'Red and (element'Paper != element'Green and (element'Scissor != element'Red and (element'Scissor != element'Green and element'Red != element'Green))))))))
}
fact abstract'allRPS {
	type'allRPS = type'oldRPS + type'newRPS
}
fact ObjectTypeDefinition {
	util'Object = type'allRPS + type'color
}
fact common'types'color'allRPS {
	type'color & type'allRPS = none
}
fact common'types'newRPS'oldRPS {
	type'newRPS & type'oldRPS = none
}
run { } for exactly 10 util'Object , 0 Int
