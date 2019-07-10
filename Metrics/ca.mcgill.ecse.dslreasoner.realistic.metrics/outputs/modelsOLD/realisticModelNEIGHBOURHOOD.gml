graph
[
	node
		[
			id	0
			graphics
			[
				w	176.0
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[Transition class] (7)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	1
			graphics
			[
				w	584.1
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[State class, CompositeElement class, Vertex class, RegularState class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	2
			graphics
			[
				w	360.8
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[Statechart class, CompositeElement class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	3
			graphics
			[
				w	584.1
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[State class, CompositeElement class, Vertex class, RegularState class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	4
			graphics
			[
				w	584.1
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[State class, CompositeElement class, Vertex class, RegularState class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	5
			graphics
			[
				w	584.1
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[State class, CompositeElement class, Vertex class, RegularState class] (2)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	6
			graphics
			[
				w	391.6
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[Pseudostate class, Entry class, Vertex class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	7
			graphics
			[
				w	145.20000000000002
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[Region class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	8
			graphics
			[
				w	176.0
				h	40
				type	"roundrectangle"
				fill	"#FFCC00"
				outline	"#000000"
			]
			LabelGraphics
			[
			]
			LabelGraphics
			[
				text	"[Transition class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	edge
		[
			source  2
			target  7
			label	"regions reference CompositeElement"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"regions reference CompositeElement"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  5
			target  0
			label	"incomingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"incomingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 0, 0, 0, 0, 0, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  5
			target  0
			label	"outgoingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"outgoingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 1, 0, 0, 0, 0, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  4
			target  0
			label	"incomingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"incomingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[2]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 1, 0, 0, 0, 0, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  4
			target  0
			label	"outgoingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"outgoingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[4]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 1, 1, 0, 0, 0, 1, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  3
			target  0
			label	"incomingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"incomingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1, 2]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 1, 0, 0, 0, 0, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  3
			target  0
			label	"outgoingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"outgoingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 0, 0, 0, 0, 0, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  6
			target  8
			label	"outgoingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"outgoingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  7
			target  6
			label	"vertices reference Region"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"vertices reference Region"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1, 1, 1, 2, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  0
			target  1
			label	"target reference Transition"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"target reference Transition"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1, 1, 1, 1, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 2]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  0
			target  4
			label	"source reference Transition"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"source reference Transition"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1, 1, 1, 1, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[4]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  1
			target  0
			label	"incomingTransitions reference Vertex"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"incomingTransitions reference Vertex"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 0, 0, 0, 0, 0]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  8
			target  3
			label	"target reference Transition"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"target reference Transition"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  8
			target  6
			label	"source reference Transition"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"source reference Transition"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
]
