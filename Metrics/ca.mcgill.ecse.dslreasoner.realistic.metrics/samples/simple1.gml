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
		label	"Statechart"
		graphics
		[
			x	313.5
			y	225.0
			w	81.0
			h	32.0
			type	"roundrectangle"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"Statechart"
			fontSize	12
			fontName	"Dialog"
			anchor	"c"
		]
	]
	node
	[
		id	1
		label	"Region0"
		graphics
		[
			x	-31.5
			y	207.5
			w	55.5
			h	32.0
			type	"roundrectangle"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"Region0"
			fontSize	12
			fontName	"Dialog"
			anchor	"c"
		]
	]
	node
	[
		id	2
		label	"Region0"
		graphics
		[
			x	313.5
			y	440.0
			w	55.5
			h	32.0
			type	"roundrectangle"
			raisedBorder	0
			fill	"#FFCC00"
			outline	"#000000"
		]
		LabelGraphics
		[
			text	"Region0"
			fontSize	12
			fontName	"Dialog"
			anchor	"c"
		]
	]
	edge
	[
		source	1
		target	0
		label	"RefName"
		graphics
		[
			fill	"#000000"
			targetArrow	"standard"
		]
		LabelGraphics
		[
			text	"RefName"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	54.68359375
			contentHeight	18.701171875
			model	"six_pos"
			position	"head"
		]
		LabelGraphics
		[
			text	"[2,3]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	27.349609375
			contentHeight	18.701171875
			model	"six_pos"
			position	"ttail"
		]
		LabelGraphics
		[
			text	"[0,1]"
			fontSize	12
			fontName	"Dialog"
			configuration	"AutoFlippingLabel"
			contentWidth	27.349609375
			contentHeight	18.701171875
			model	"six_pos"
			position	"stail"
		]
	]
]
