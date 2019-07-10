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
			x	120.0
			y	68.0
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
			text	"[State class] (5)"
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
			x	435.0
			y	82.0
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
		id	2
		label	""
		graphics
		[
			x	-139.25
			y	68.0
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
	edge
	[
		source	0
		target	0
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	120.0
					y	68.0
				]
				point
				[
					x	90.0
					y	-141.0
				]
				point
				[
					x	120.0
					y	68.0
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
			text	"[1, 4, 1]"
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
			text	"[1, 2, 2, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	57.3671875
			contentHeight	18.701171875
			model	"six_pos"
			position	"shead"
		]
	]
	edge
	[
		source	1
		target	0
		label	"state reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	-0.7
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
			text	"[5]"
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
		source	1
		target	2
		label	"entry reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	435.0
					y	82.0
				]
				point
				[
					x	415.75
					y	287.0
				]
				point
				[
					x	-139.25
					y	287.0
				]
				point
				[
					x	-139.25
					y	68.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.21875
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
		target	0
		label	"entry reference Entry"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	0.35
			xTarget	-0.28
			yTarget	0.35
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
			text	"[1, 0, 0, 0]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	57.3671875
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
]
