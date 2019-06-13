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
			x	370.0
			y	238.0
			w	124.0
			h	90.0
			type	"roundrectangle"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
		]
		LabelGraphics
		[
			text	"label1"
			fontSize	12
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
			x	876.0
			y	238.0
			w	30.0
			h	30.0
			type	"roundrectangle"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
		]
	]
	node
	[
		id	2
		label	""
		graphics
		[
			x	641.0
			y	184.0
			w	36.0
			h	30.0
			type	"rectangle"
			fill	"#CCCCFF"
			outline	"#000000"
		]
		LabelGraphics
		[
		]
	]
	node
	[
		id	3
		label	""
		graphics
		[
			x	608.476623535156
			y	435.7376708984377
			w	126.0
			h	61.0
			fill	"#CCCCFF"
			outline	"#000000"
		]
		LabelGraphics
		[
		]
	]
	edge
	[
		source	0
		target	1
		label	"name"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		LabelGraphics
		[
			text	"name"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	34.017578125
			contentHeight	18.701171875
			model	"six_pos"
			position	"tail"
		]
		LabelGraphics
		[
			text	"m1"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	20.669921875
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
		LabelGraphics
		[
			text	"m2"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	20.669921875
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
	]
	edge
	[
		source	3
		target	0
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
			Line
			[
				point
				[
					x	608.476623535156
					y	435.7376708984377
				]
				point
				[
					x	370.0
					y	435.7376708984377
				]
				point
				[
					x	370.0
					y	238.0
				]
			]
		]
	]
]
