package org.eclipse.viatra.solver.language.mwe2;

import java.util.Set;

import org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment;

import com.google.common.collect.Multimap;

public class ProblemWebIntegrationFragment extends WebIntegrationFragment {
	public ProblemWebIntegrationFragment() {
		setFramework(Framework.CODEMIRROR.name());
		// The exponential operators e and E are not keywords
		setKeywordsFilter("[^eE]|\\w\\w+");
		// We use our custom token style for single-quoted names
		addSuppressPattern("string_singleQuote");
		// Use the CodeMirror default .cm-number instead of .cm-constant.cm-numeric
		addSuppressPattern("number_decimal");
		// We use our own custom single-line comments
		addSuppressPattern("comment_singleLine");
		// Override bracket indentation behavior
		addSuppressPattern("bracket_open");
		addSuppressPattern("parenthesis_open");
		addSuppressPattern("brace_open");
		addSuppressPattern("bracket_close");
		addSuppressPattern("parenthesis_close");
		addSuppressPattern("brace_close");
	}

	@Override
	public void setFramework(String frameworkName) {
		if (!frameworkName.toUpperCase().equals(Framework.CODEMIRROR.name())) {
			throw new IllegalStateException("Framework cannot be changed from CodeMirror");
		}
		super.setFramework(frameworkName);
	}

	@Override
	protected Multimap<String, String> createCodeMirrorPatterns(String langId, Set<String> keywords) {
		Multimap<String, String> patterns = super.createCodeMirrorPatterns(langId, keywords);
		// We use our custom token style for single-quoted names
		patterns.put("start", "{token: \"quoted-name\", regex: \"['](?:(?:\\\\\\\\.)|(?:[^'\\\\\\\\]))*?[']\"}");
		// Use the CodeMirror default .cm-number instead of .cm-constant.cm-numeric
		patterns.put("start",
				"{token: \"number\", regex: \"[+-]?\\\\d+(?:(?:\\\\.\\\\d*)?(?:[eE][+-]?\\\\d+)?)?\\\\b\"}");
		patterns.put("start", "{token: \"number\", regex: \"[*]\"}");
		// We use our own custom single-line comments
		patterns.put("start", "{token: \"comment\", regex: \"%.*$\"}");
		patterns.put("start", "{token: \"comment\", regex: \"\\\\/\\\\/.*$\"}");
		patterns.put("meta", "lineComment: \"%\"");
		// Override indentation behavior
		patterns.put("start", "{token: \"lparen\", indent: true, regex: \"[[({]\"}");
		patterns.put("start", "{token: \"rparen\", dedent: true, regex: \"[\\\\])}]\"}");
		patterns.putAll("predicateBody", patterns.get("start"));
		patterns.put("start", "{indent: true, push: \"predicateBody\", regex: \":-\"}");
		patterns.put("predicateBody", "{dedent: true, dedentIfLineStart: false, pop: true, regex: \"\\\\.\\\\s*$\"}");
		patterns.put("predicateBody", "{indent: true, dedent: true, regex: \"[;]\"}");
		// We must repeat the keyword rule here, because Xtext only adds it to "main" later.
		patterns.put("predicateBody", "{token: \"keyword\", regex: \"\\\\b(?:\" + keywords + \")\\\\b\"}");
		patterns.put("meta", "electricChars: \"])];\"");
		return patterns;
	}
}
