graph
[
	node
		[
			id	0
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
			id	1
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
				text	"[Object class] (4)" 
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
				text	"[Element class] (4)" 
				fontSize	14
				fontName	"Dialog"
			]
		]
	edge
		[
			source  2
			target  3
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
				text	"[1, 0, 0]"
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
			target  3
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
				text	"[1, 1, 1]"
				fontSize	12
				fontName	"Dialog"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"stail"
			]
			LabelGraphics
			[
				text	"[1, 1, 0]"
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
			target  1
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
				text	"[1, 1, 1]"
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
