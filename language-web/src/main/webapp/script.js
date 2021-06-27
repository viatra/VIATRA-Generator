var baseUrl = window.location.pathname;
var fileIndex = baseUrl.indexOf("index.html");
if (fileIndex > 0)
    baseUrl = baseUrl.slice(0, fileIndex)
require.config({
    baseUrl: baseUrl,
    paths: {
        "text": "webjars/requirejs-text/2.26.0.M1/text",
        "jquery": "webjars/jquery/3.6.0/jquery.min",
        "xtext/xtext-codemirror": "xtext/2.26.0.M1/xtext-codemirror",
    },
    packages: [{
        name: "codemirror",
        location: "webjars/codemirror/5.52.2",
        main: "lib/codemirror"
    }]
});
require(["xtext-resources/generated/mode-problem", "xtext/xtext-codemirror"], function(mode, xtext) {
	window.xtextEditor = xtext.createEditor({baseUrl: baseUrl,});
});
