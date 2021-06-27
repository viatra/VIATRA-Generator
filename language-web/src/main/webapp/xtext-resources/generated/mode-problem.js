define(["codemirror", "codemirror/addon/mode/simple"], function(CodeMirror, SimpleMode) {
	var keywords = "abstract|class|contains|enum|error|extends|false|opposite|pred|problem|refers|scope|true|unknown";
	CodeMirror.defineSimpleMode("xtext/problem", {
		start: [
			{token: "comment", regex: "\\/\\*", next : "comment"},
			{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
			{token: "quoted-name", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
			{token: "number", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
			{token: "number", regex: "[*]"},
			{token: "comment", regex: "%.*$"},
			{token: "comment", regex: "\\/\\/.*$"},
			{token: "lparen", indent: true, regex: "[[({]"},
			{token: "rparen", dedent: true, dedentIfLineStart: true, regex: "[\\])}]"},
			{indent: true, push: "predicateBody", regex: ":-"},
			{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
		],
		comment: [
			{token: "comment", regex: ".*?\\*\\/", next : "start"},
			{token: "comment", regex: ".+"}
		],
		meta: {
			dontIndentStates: ["comment"],
			lineComment: "%",
			electricChars: "])]"
		},
		predicateBody: [
			{token: "comment", regex: "\\/\\*", next : "comment"},
			{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
			{token: "quoted-name", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
			{token: "number", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
			{token: "number", regex: "[*]"},
			{token: "comment", regex: "%.*$"},
			{token: "comment", regex: "\\/\\/.*$"},
			{token: "lparen", indent: true, regex: "[[({]"},
			{token: "rparen", dedent: true, dedentIfLineStart: true, regex: "[\\])}]"},
			{dedent: true, dedentIfLineStart: false, pop: true, regex: "\\.\\s*$"},
			{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
		]
	});
});
