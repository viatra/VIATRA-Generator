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
			x	-352.0
			y	-118.0
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
			x	319.0
			y	34.0
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
			x	75.0
			y	-196.0
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
			x	90.0
			y	247.0
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
					x	-352.0
					y	-118.0
				]
				point
				[
					x	-362.0
					y	247.0
				]
				point
				[
					x	90.0
					y	247.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.14545454545454545
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
					x	319.0
					y	34.0
				]
				point
				[
					x	319.0
					y	-122.0
				]
				point
				[
					x	319.0
					y	34.0
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
			text	"[1, 1, 1]"
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
			text	"[1, 1, 0]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	44.025390625
			contentHeight	18.701171875
			model	"six_pos"
			position	"shead"
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
			Line
			[
				point
				[
					x	75.0
					y	-196.0
				]
				point
				[
					x	65.0
					y	173.5
				]
				point
				[
					x	90.0
					y	173.5
				]
				point
				[
					x	90.0
					y	247.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.11363636363636363
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
			text	"[4, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	30.68359375
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
					x	75.0
					y	-196.0
				]
				point
				[
					x	-377.0
					y	-196.0
				]
				point
				[
					x	-352.0
					y	-118.0
				]
			]
		]
		edgeAnchor
		[
			xTarget	-0.36363636363636365
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
		source	3
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
					x	90.0
					y	247.0
				]
				point
				[
					x	309.0
					y	241.5
				]
				point
				[
					x	319.0
					y	34.0
				]
			]
		]
		edgeAnchor
		[
			ySource	-0.275
			xTarget	-0.14545454545454545
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
