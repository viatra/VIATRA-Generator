define(["codemirror", "codemirror/addon/mode/simple"], function(CodeMirror, SimpleMode) {
	var keywords = "abstract|class|contains|enum|error|extends|false|opposite|pred|problem|refers|scope|true|unknown";
	CodeMirror.defineSimpleMode("xtext/problem", {
		start: [
			{token: "comment", regex: "\\/\\/.*$"},
			{token: "comment", regex: "\\/\\*", next : "comment"},
			{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
			{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
			{token: "lparen", regex: "[\\[({]"},
			{token: "rparen", regex: "[\\])}]"},
			{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
		],
		comment: [
			{token: "comment", regex: ".*?\\*\\/", next : "start"},
			{token: "comment", regex: ".+"}
		],
		meta: {
			dontIndentStates: ["comment"],
			lineComment: "//"
		}
	});
});
