package org.eclipse.viatra.solver.language.naming;

import java.util.regex.Pattern;

public final class NamingUtil {
	private static final String SINGLETON_VARIABLE_PREFIX = "_";

	private static final String ENUM_NODE_NAME_QUOTE = "'";
	
	private static final Pattern ID_REGEX = Pattern.compile("[_a-zA-Z][_0-9a-zA-Z]*");

	private NamingUtil() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly");
	}
	
	public static boolean isNullOrEmpty(String name) {
		return name == null || name.isEmpty();
	}

	public static boolean isSingletonVariableName(String name) {
		return name != null && name.startsWith(SINGLETON_VARIABLE_PREFIX);
	}

	public static boolean isQuotedName(String name) {
		return name != null && name.startsWith(ENUM_NODE_NAME_QUOTE) && name.endsWith(ENUM_NODE_NAME_QUOTE);
	}
	
	public static boolean isValidId(String name) {
		return name != null && ID_REGEX.matcher(name).matches();
	}
	
	public static boolean isValidNodeName(String name) {
		return isValidId(name) || isQuotedName(name);
	}
}
