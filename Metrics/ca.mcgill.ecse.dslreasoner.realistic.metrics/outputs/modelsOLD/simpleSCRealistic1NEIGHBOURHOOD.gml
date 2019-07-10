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
			x	313.0
			y	14.0
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
	node
	[
		id	1
		label	""
		graphics
		[
			x	-183.0
			y	-69.0
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
		id	2
		label	""
		graphics
		[
			x	-402.25
			y	87.0
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
	node
	[
		id	3
		label	""
		graphics
		[
			x	-109.75
			y	449.0
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
	node
	[
		id	4
		label	""
		graphics
		[
			x	102.0
			y	72.0
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
			text	"[State class] (2)"
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
			x	-5.0
			y	-322.0
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
	edge
	[
		source	1
		target	2
		label	"entry reference Entry"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-183.0
					y	-69.0
				]
				point
				[
					x	-344.5
					y	-69.0
				]
				point
				[
					x	-402.25
					y	87.0
				]
			]
		]
		edgeAnchor
		[
			xTarget	0.84
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
		source	3
		target	2
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-109.75
					y	449.0
				]
				point
				[
					x	-471.0
					y	469.0
				]
				point
				[
					x	-402.25
					y	87.0
				]
			]
		]
		edgeAnchor
		[
			ySource	1.0
			xTarget	-1.0
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
					x	-109.75
					y	449.0
				]
				point
				[
					x	304.625
					y	469.0
				]
				point
				[
					x	313.0
					y	14.0
				]
			]
		]
		edgeAnchor
		[
			ySource	1.0
			xTarget	-0.12181818181818181
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
		target	4
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-109.75
					y	449.0
				]
				point
				[
					x	-147.0
					y	231.5
				]
				point
				[
					x	47.0
					y	231.5
				]
				point
				[
					x	102.0
					y	72.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.5418181818181819
			xTarget	-0.8
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
		target	3
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-402.25
					y	87.0
				]
				point
				[
					x	-333.5
					y	429.0
				]
				point
				[
					x	-109.75
					y	449.0
				]
			]
		]
		edgeAnchor
		[
			xSource	1.0
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
		source	4
		target	2
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		edgeAnchor
		[
			ySource	0.75
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
		target	3
		label	"next reference State"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	102.0
					y	72.0
				]
				point
				[
					x	157.0
					y	429.0
				]
				point
				[
					x	-109.75
					y	449.0
				]
			]
		]
		edgeAnchor
		[
			xSource	0.8
			xTarget	0.4909090909090909
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
		label	"state reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-5.0
					y	-322.0
				]
				point
				[
					x	-471.0
					y	-315.0
				]
				point
				[
					x	-402.25
					y	87.0
				]
			]
		]
		edgeAnchor
		[
			ySource	0.35
			xTarget	-1.0
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
		label	"entry reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-5.0
					y	-322.0
				]
				point
				[
					x	-79.0
					y	-239.0
				]
				point
				[
					x	-194.0
					y	-239.0
				]
				point
				[
					x	-183.0
					y	-69.0
				]
			]
		]
		edgeAnchor
		[
			xSource	-0.8409090909090909
			xTarget	-0.16
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
		source	5
		target	4
		label	"state reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-5.0
					y	-322.0
				]
				point
				[
					x	59.0
					y	-54.0
				]
				point
				[
					x	153.0
					y	-54.0
				]
				point
				[
					x	102.0
					y	72.0
				]
			]
		]
		edgeAnchor
		[
			xSource	0.7272727272727273
			xTarget	0.7418181818181818
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
		label	"state reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-5.0
					y	-322.0
				]
				point
				[
					x	591.25
					y	-335.0
				]
				point
				[
					x	591.25
					y	528.1666666666667
				]
				point
				[
					x	-120.75
					y	528.1666666666667
				]
				point
				[
					x	-109.75
					y	449.0
				]
			]
		]
		edgeAnchor
		[
			xSource	0.4318181818181818
			ySource	-0.65
			xTarget	-0.16
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
		label	"state reference Statechart"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	-5.0
					y	-322.0
				]
				point
				[
					x	302.0
					y	-302.0
				]
				point
				[
					x	313.0
					y	14.0
				]
			]
		]
		edgeAnchor
		[
			xSource	0.45454545454545453
			ySource	1.0
			xTarget	-0.16
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
]
