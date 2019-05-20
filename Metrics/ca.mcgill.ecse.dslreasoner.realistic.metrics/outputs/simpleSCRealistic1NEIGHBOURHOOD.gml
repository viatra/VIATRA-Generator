graph
[
	node
		[
			id	0
			graphics
			[
				w	137.5
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
				text	"[State class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	1
			graphics
			[
				w	137.5
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
				text	"[Entry class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	2
			graphics
			[
				w	137.5
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
				text	"[State class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	3
			graphics
			[
				w	137.5
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
				text	"[State class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	4
			graphics
			[
				w	137.5
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
				text	"[State class] (2)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	5
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
				text	"[Statechart class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	edge
		[
			source  1
			target  2
			label	"entry reference Entry"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"entry reference Entry"
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
			source  3
			target  2
			label	"next reference State"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"next reference State"
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
				text	"[1, 1, 1, 1]"
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
			label	"next reference State"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"next reference State"
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
				text	"[1, 1, 1, 1]"
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
			target  4
			label	"next reference State"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"next reference State"
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
				text	"[1, 1, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
	edge
		[
			source  2
			target  3
			label	"next reference State"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"next reference State"
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
			source  4
			target  2
			label	"next reference State"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"next reference State"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1, 0]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 1]"
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
			target  3
			label	"next reference State"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"next reference State"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"head"
			]
			LabelGraphics
			[
				text	"[1, 0]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 1]"
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
			target  2
			label	"state reference Statechart"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"state reference Statechart"
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
				text	"[1, 1, 1, 1, 1]"
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
			target  1
			label	"entry reference Statechart"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"entry reference Statechart"
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
			target  4
			label	"state reference Statechart"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"state reference Statechart"
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
				text	"[1, 1, 1, 1, 1]"
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
			target  3
			label	"state reference Statechart"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"state reference Statechart"
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
				text	"[1, 1, 1, 1, 1]"
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
			label	"state reference Statechart"
			graphics
			[
				fill	"#000000"
				targetArrow	"standard"
				Line
				[
				]
			]
			LabelGraphics
			[
				text	"state reference Statechart"
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
				text	"[1, 1, 1, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
]
