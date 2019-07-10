Creator	"yFiles"
Version	"2.16"
graph
[
	hierarchic	1
	label	""
	directed	1
	node
	[
		id	0
		label	""
		graphics
		[
			x	-396.0
			y	-37.0
			w	137.5
			h	40.0
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
			anchor	"c"
		]
	]
	node
	[
		id	1
		label	""
		graphics
		[
			x	197.0
			y	232.0
			w	137.5
			h	40.0
			type	"roundrectangle"
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
		]
		LabelGraphics
		[
			text	"[State class] (4)"
			fontSize	14
			fontName	"Dialog"
			anchor	"c"
		]
	]
	node
	[
		id	2
		label	""
		graphics
		[
			x	-40.0
			y	-240.0
			w	176.0
			h	40.0
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
			anchor	"c"
		]
	]
	node
	[
		id	3
		label	""
		graphics
		[
			x	-118.0
			y	232.0
			w	137.5
			h	40.0
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
			anchor	"c"
		]
	]
	edge
	[
		source	0
		target	3
		label	"entry reference Entry"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-396.0
					y	-37.0
				]
				point
				[
					x	-443.0
					y	226.5
				]
				point
				[
					x	-118.0
					y	232.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.6836363636363636
			yTarget	-0.275
		]
		LabelGraphics
		[
			text	"entry reference Entry"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	116.048828125
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	17.341796875
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"[1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	17.341796875
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	1
		target	3
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	0.85
			yTarget	0.85
		]
		LabelGraphics
		[
			text	"next reference State"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	112.064453125
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1, 0, 0]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	44.025390625
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"[1, 1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	44.025390625
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	1
		target	1
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	197.0
					y	232.0
				]
				point
				[
					x	280.0
					y	317.0
				]
				point
				[
					x	197.0
					y	232.0
				]
			]
		]
		LabelGraphics
		[
			text	"next reference State"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	112.064453125
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1, 1, 0]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	44.025390625
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"[1, 1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	44.025390625
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	2
		target	3
		label	"state reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xSource	-0.8863636363636364
		]
		LabelGraphics
		[
			text	"state reference Statechart"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	142.076171875
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	17.341796875
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"[1, 1, 1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	57.3671875
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	2
		target	0
		label	"entry reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-40.0
					y	-240.0
				]
				point
				[
					x	-391.0
					y	-240.0
				]
				point
				[
					x	-396.0
					y	-37.0
				]
			]
		]
		edgeAnchor
		[
			xTarget	0.07272727272727272
		]
		LabelGraphics
		[
			text	"entry reference Statechart"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	142.73828125
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	17.341796875
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"[1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	17.341796875
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	2
		target	1
		label	"state reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-40.0
					y	-240.0
				]
				point
				[
					x	213.0
					y	-240.0
				]
				point
				[
					x	197.0
					y	232.0
				]
			]
		]
		edgeAnchor
		[
			xTarget	0.23272727272727273
		]
		LabelGraphics
		[
			text	"state reference Statechart"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	142.076171875
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[4]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	17.341796875
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"[1, 1, 1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	57.3671875
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	3
		target	1
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	-1.0
			yTarget	-1.0
		]
		LabelGraphics
		[
			text	"next reference State"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	112.064453125
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	17.341796875
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"[1, 0, 0]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	44.025390625
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
]
