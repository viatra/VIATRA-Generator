package org.eclipse.viatra.solver.language.mwe2;

import java.util.Set;

import org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment;

import com.google.common.collect.Multimap;

public class ProblemWebIntegrationFragment extends WebIntegrationFragment {
	private static final String START_STATE = "start";
	private static final String PREDICATE_BODY_STATE = "predicateBody";
	private static final String CM_MODE_META = "meta";

	public ProblemWebIntegrationFragment() {
		setFramework(Framework.CODEMIRROR.name());
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
		patterns.put(START_STATE, "{token: \"quoted-name\", regex: \"['](?:(?:\\\\\\\\.)|(?:[^'\\\\\\\\]))*?[']\"}");
		// Use the CodeMirror default .cm-number instead of .cm-constant.cm-numeric
		patterns.put(START_STATE,
				"{token: \"number\", regex: \"[+-]?\\\\d+(?:(?:\\\\.\\\\d*)?(?:[eE][+-]?\\\\d+)?)?\\\\b\"}");
		patterns.put(START_STATE, "{token: \"number\", regex: \"[*]\"}");
		// We use our own custom single-line comments
		patterns.put(START_STATE, "{token: \"comment\", regex: \"%.*$\"}");
		patterns.put(START_STATE, "{token: \"comment\", regex: \"\\\\/\\\\/.*$\"}");
		patterns.put(CM_MODE_META, "lineComment: \"%\"");
		// Override indentation behavior
		patterns.put(START_STATE, "{token: \"lparen\", indent: true, regex: \"[[({]\"}");
		patterns.put(START_STATE, "{token: \"rparen\", dedent: true, regex: \"[\\\\])}]\"}");
		patterns.putAll(PREDICATE_BODY_STATE, patterns.get(START_STATE));
		patterns.put(START_STATE, "{indent: true, push: \"" + PREDICATE_BODY_STATE + "\", regex: \"<=>\"}");
		patterns.put(PREDICATE_BODY_STATE,
				"{dedent: true, dedentIfLineStart: false, pop: true, regex: \"\\\\.\\\\s*$\"}");
		patterns.put(PREDICATE_BODY_STATE, "{indent: true, dedent: true, regex: \"[;]\"}");
		// We must repeat the keyword rule here, because Xtext only adds it to "main"
		// later
		patterns.put(PREDICATE_BODY_STATE, "{token: \"keyword\", regex: \"\\\\b(?:\" + keywords + \")\\\\b\"}");
		patterns.put(CM_MODE_META, "electricChars: \"])];\"");
		return patterns;
	}
}
