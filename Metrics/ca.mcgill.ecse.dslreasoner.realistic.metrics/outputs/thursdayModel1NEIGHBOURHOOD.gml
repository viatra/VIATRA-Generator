graph
[
	node
		[
			id	0
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
				text	"[Object class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	1
			graphics
			[
				w	152.9
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
				text	"[Element class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	2
			graphics
			[
				w	152.9
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
				text	"[Element class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	3
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
				text	"[Object class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	4
			graphics
			[
				w	129.8
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
				text	"[List class] (1)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	node
		[
			id	5
			graphics
			[
				w	152.9
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
				text	"[Element class] (2)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	edge
		[
			source  0
			target  2
			label	"owner reference Object"
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
				text	"owner reference Object"
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
			source  1
			target  3
			label	"value reference Element"
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
				text	"value reference Element"
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
			source  1
			target  5
			label	"next reference Element"
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
				text	"next reference Element"
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
				text	"[1, 0]"
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
			target  0
			label	"value reference Element"
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
				text	"value reference Element"
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
			target  1
			label	"elements reference List"
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
				text	"elements reference List"
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
			source  4
			target  0
			label	"objects reference List"
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
				text	"objects reference List"
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
			target  2
			label	"elements reference List"
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
				text	"elements reference List"
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
			source  4
			target  1
			label	"first reference List"
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
				text	"first reference List"
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
			target  5
			label	"elements reference List"
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
				text	"elements reference List"
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
			source  4
			target  3
			label	"objects reference List"
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
				text	"objects reference List"
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
			target  5
			label	"next reference Element"
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
				text	"next reference Element"
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
				text	"[1, 0, 1]"
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
			label	"next reference Element"
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
				text	"next reference Element"
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
				text	"[1, 0, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"ttail"
			]
		]
]
