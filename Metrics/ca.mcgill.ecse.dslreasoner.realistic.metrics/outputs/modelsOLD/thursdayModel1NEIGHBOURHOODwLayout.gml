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
			x	474.0
			y	339.0
			w	145.20000000000002
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
			text	"[Object class] (1)"
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
			x	-200.0
			y	-11.0
			w	152.9
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
			text	"[Element class] (1)"
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
			x	474.0
			y	-11.0
			w	152.9
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
			text	"[Element class] (1)"
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
			x	-286.0
			y	352.0
			w	145.20000000000002
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
			text	"[Object class] (1)"
			fontSize	14
			fontName	"Dialog"
			anchor	"c"
		]
	]
	node
	[
		id	4
		label	""
		graphics
		[
			x	137.0
			y	-11.0
			w	152.9
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
			text	"[Element class] (2)"
			fontSize	14
			fontName	"Dialog"
			anchor	"c"
		]
	]
	node
	[
		id	5
		label	""
		graphics
		[
			x	-339.0
			y	-256.0
			w	129.8
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
			text	"[List class] (1)"
			fontSize	14
			fontName	"Dialog"
			anchor	"c"
		]
	]
	edge
	[
		source	0
		target	2
		label	"owner reference Object"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xSource	0.9641873278236913
			xTarget	0.9156311314584695
		]
		LabelGraphics
		[
			text	"owner reference Object"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	128.728515625
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
		label	"value reference Element"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xSource	-0.5624591236102027
			xTarget	0.5922865013774103
		]
		LabelGraphics
		[
			text	"value reference Element"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	134.072265625
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
		target	4
		label	"next reference Element"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xSource	-0.05035971223021538
		]
		LabelGraphics
		[
			text	"next reference Element"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	128.06640625
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
			text	"[1, 0]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	30.68359375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	2
		target	0
		label	"value reference Element"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xSource	-0.9025506867233486
			xTarget	-0.9504132231404958
		]
		LabelGraphics
		[
			text	"value reference Element"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	134.072265625
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
		source	5
		target	1
		label	"elements reference List"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-339.0
					y	-256.0
				]
				point
				[
					x	-403.9
					y	-11.0
				]
				point
				[
					x	-200.0
					y	-11.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.9999999999999996
		]
		LabelGraphics
		[
			text	"elements reference List"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	128.728515625
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
			text	"[1, 1, 1, 1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	70.708984375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	5
		target	0
		label	"objects reference List"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-339.0
					y	-256.0
				]
				point
				[
					x	-503.0
					y	-236.0
				]
				point
				[
					x	-503.0
					y	484.0
				]
				point
				[
					x	474.0
					y	484.0
				]
				point
				[
					x	474.0
					y	339.0
				]
			]
		]
		edgeAnchor
		[
			ySource	1.0
		]
		LabelGraphics
		[
			text	"objects reference List"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	118.05859375
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
			text	"[1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	30.68359375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	5
		target	2
		label	"elements reference List"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-339.0
					y	-256.0
				]
				point
				[
					x	474.0
					y	-276.0
				]
				point
				[
					x	474.0
					y	-11.0
				]
			]
		]
		edgeAnchor
		[
			ySource	-1.0
			yTarget	-1.0
		]
		LabelGraphics
		[
			text	"elements reference List"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	128.728515625
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
			text	"[1, 1, 1, 1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	70.708984375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	5
		target	1
		label	"first reference List"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-339.0
					y	-256.0
				]
				point
				[
					x	-302.09999999999997
					y	-109.875
				]
				point
				[
					x	-242.09999999999997
					y	-109.875
				]
				point
				[
					x	-200.0
					y	-11.0
				]
			]
		]
		edgeAnchor
		[
			xSource	0.5685670261941453
			xTarget	-0.5506867233485934
			yTarget	-0.993359375
		]
		LabelGraphics
		[
			text	"first reference List"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	99.3671875
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
			text	"[1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	30.68359375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	5
		target	4
		label	"elements reference List"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-339.0
					y	-256.0
				]
				point
				[
					x	137.0
					y	-236.0
				]
				point
				[
					x	137.0
					y	-11.0
				]
			]
		]
		edgeAnchor
		[
			xSource	1.0000000000000004
			ySource	1.0
		]
		LabelGraphics
		[
			text	"elements reference List"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	128.728515625
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[2]"
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
			text	"[1, 1, 1, 1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	70.708984375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	5
		target	3
		label	"objects reference List"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-339.0
					y	-256.0
				]
				point
				[
					x	-570.6
					y	-276.0
				]
				point
				[
					x	-570.6
					y	353.5
				]
				point
				[
					x	-286.0
					y	352.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.30200308166409895
			ySource	-1.0
			xTarget	-0.571625344352617
			yTarget	0.075
		]
		LabelGraphics
		[
			text	"objects reference List"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	118.05859375
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
			text	"[1, 1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	30.68359375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	4
		target	4
		label	"next reference Element"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	137.0
					y	-11.0
				]
				point
				[
					x	153.0
					y	161.0
				]
				point
				[
					x	137.0
					y	-11.0
				]
			]
		]
		LabelGraphics
		[
			text	"next reference Element"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	128.06640625
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1, 0]"
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
			text	"[1, 0, 1]"
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
		source	4
		target	2
		label	"next reference Element"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			xTarget	-0.05035971223021538
		]
		LabelGraphics
		[
			text	"next reference Element"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	128.06640625
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[1, 0]"
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
			text	"[1, 0, 1]"
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
