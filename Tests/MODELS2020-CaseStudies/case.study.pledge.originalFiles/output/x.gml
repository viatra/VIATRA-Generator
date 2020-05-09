graph
[
  node
  [
   id 1
   label "Node A"
  ]
  node
  [
   id 2
   label "Node B"
   		graphics
		[
			fill	"#00FF00"
		]
  ]
  node
  [
   id 3
   label "Node C"
  ]
   edge
  [
   source 2
   target 1
   label "Edge B to A"
  ]
  edge
  [
   source 3
   target 1
   label "Edge C to A"
  ]
]