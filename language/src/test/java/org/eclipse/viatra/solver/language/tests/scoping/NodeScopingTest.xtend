package org.eclipse.viatra.solver.language.tests.scoping

import com.google.inject.Inject
import java.util.stream.Stream
import org.eclipse.viatra.solver.language.model.problem.Problem
import org.eclipse.viatra.solver.language.tests.ProblemInjectorProvider
import org.eclipse.viatra.solver.language.tests.ProblemTestUtil
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

@ExtendWith(InjectionExtension)
@InjectWith(ProblemInjectorProvider)
class NodeScopingTest {
	@Inject
	ParseHelper<Problem> parseHelper

	@Inject
	extension ProblemTestUtil

	@ParameterizedTest
	@ValueSource(strings=#["", "builtin::"])
	def void builtInArgumentTypeTest(String prefix) {
		val it = parseHelper.parse('''
			pred predicate(«prefix»node a, «prefix»data b, «prefix»int c).
		''')
		assertThat(errors, empty)
		assertThat(pred('predicate').param(0).parameterType, equalTo(builtin.findClass('node')))
		assertThat(pred('predicate').param(1).parameterType, equalTo(builtin.findClass('data')))
		assertThat(pred('predicate').param(2).parameterType, equalTo(builtin.findClass('int')))
	}

	@Test
	def void implicitNodeInAssertionTest() {
		val it = parseHelper.parse('''
			pred predicate(node x, node y) :- node(x).
			predicate(a, a).
			?predicate(a, b).
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, hasItems('a', 'b'))
		assertThat(assertion(0).arg(0).node, equalTo(node('a')))
		assertThat(assertion(0).arg(1).node, equalTo(node('a')))
		assertThat(assertion(1).arg(0).node, equalTo(node('a')))
		assertThat(assertion(1).arg(1).node, equalTo(node('b')))
	}

	@Test
	def void implicitNodeInNodeValueAssertionTest() {
		val it = parseHelper.parse('''
			a: 16.
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, hasItems('a'))
		assertThat(nodeValueAssertion(0).node, equalTo(node('a')))
	}

	def void implicitNodeInPredicateTest() {
		val it = parseHelper.parse('''
			pred predicate(node a) :- node(b).
			predicate(b).
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, hasItem("b"))
		assertThat(pred("predicate").conj(0).lit(0).arg(0).node, equalTo(node("b")))
		assertThat(assertion(0).arg(0).node, equalTo(node("b")))
	}

	@Test
	def void quotedNodeInAssertionTest() {
		val it = parseHelper.parse('''
			pred predicate(node x, node y) :- node(x).
			predicate('a', 'a').
			?predicate('a', 'b').
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, hasItems("'a'", "'b'"))
		assertThat(assertion(0).arg(0).node, equalTo(node("'a'")))
		assertThat(assertion(0).arg(1).node, equalTo(node("'a'")))
		assertThat(assertion(1).arg(0).node, equalTo(node("'a'")))
		assertThat(assertion(1).arg(1).node, equalTo(node("'b'")))
	}

	@Test
	def void quotedNodeInNodeValueAssertionTest() {
		val it = parseHelper.parse('''
			'a': 16.
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, hasItems("'a'"))
		assertThat(nodeValueAssertion(0).node, equalTo(node("'a'")))
	}

	@Test
	def void quotedNodeInPredicateTest() {
		val it = parseHelper.parse('''
			pred predicate(node a) :- node('b').
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, hasItem("'b'"))
		assertThat(pred("predicate").conj(0).lit(0).arg(0).node, equalTo(node("'b'")))
	}

	@ParameterizedTest
	@MethodSource("builtInNodeReferencesSource")
	def void builtInNodeTest(String qualifiedName) {
		val it = parseHelper.parse('''
			pred predicate(node x) :- node(x).
			predicate(«qualifiedName»).
		''')
		assertThat(errors, empty)
		assertThat(nodes, empty)
		assertThat(assertion(0).arg(0).node, equalTo(builtin.findClass('int').newNode))
	}

	@ParameterizedTest
	@MethodSource("builtInNodeReferencesSource")
	def void builtInNodeInNodeValueAssertionTest(String qualifiedName) {
		val it = parseHelper.parse('''
			«qualifiedName»: 16.
		''')
		assertThat(errors, empty)
		assertThat(nodes, empty)
		assertThat(nodeValueAssertion(0).node, equalTo(builtin.findClass('int').newNode))
	}

	@ParameterizedTest
	@MethodSource("builtInNodeReferencesSource")
	def void builtInNodeInPredicateTest(String qualifiedName) {
		val it = parseHelper.parse('''
			pred predicate(node x) :- node(«qualifiedName»).
		''')
		assertThat(errors, empty)
		assertThat(pred("predicate").conj(0).lit(0).arg(0).node, equalTo(builtin.findClass('int').newNode))
	}

	static def builtInNodeReferencesSource() {
		Stream.of(
			Arguments.of("int::new"),
			Arguments.of("builtin::int::new")
		)
	}

	@ParameterizedTest(name="{0}, namedProblem={1}")
	@MethodSource("classNewNodeReferencesSource")
	def void classNewNodeTest(String qualifiedName, boolean namedProblem) {
		val it = parseHelper.parse('''
			«IF namedProblem»problem test.«ENDIF»
			class Foo.
			pred predicate(node x) :- node(x).
			predicate(«qualifiedName»).
		''')
		assertThat(errors, empty)
		assertThat(nodes, empty)
		assertThat(assertion(0).arg(0).node, equalTo(findClass('Foo').newNode))
	}

	@ParameterizedTest(name="{0}, namedProblem={1}")
	@MethodSource("classNewNodeReferencesSource")
	def void classNewNodeInNodeValueAssertionTest(String qualifiedName, boolean namedProblem) {
		val it = parseHelper.parse('''
			«IF namedProblem»problem test.«ENDIF»
			class Foo.
			«qualifiedName»: 16.
		''')
		assertThat(errors, empty)
		assertThat(nodes, empty)
		assertThat(nodeValueAssertion(0).node, equalTo(findClass('Foo').newNode))
	}

	@ParameterizedTest(name="{0}, namedProblem={1}")
	@MethodSource("classNewNodeReferencesSource")
	def void classNewNodeInPredicateTest(String qualifiedName, boolean namedProblem) {
		val it = parseHelper.parse('''
			«IF namedProblem»problem test.«ENDIF»
			class Foo.
			pred predicate(node x) :- node(«qualifiedName»).
		''')
		assertThat(errors, empty)
		assertThat(pred("predicate").conj(0).lit(0).arg(0).node, equalTo(findClass('Foo').newNode))
	}

	static def classNewNodeReferencesSource() {
		Stream.of(
			Arguments.of("Foo::new", false),
			Arguments.of("Foo::new", true),
			Arguments.of("test::Foo::new", true)
		)
	}

	@Test
	def void newNodeIsNotSpecial() {
		val it = parseHelper.parse('''
			class Foo.
			pred predicate(node x) :- node(x).
			predicate(new).
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, hasItem('new'))
		assertThat(assertion(0).arg(0).node, not(equalTo(findClass('Foo').newNode)))
	}

	@ParameterizedTest(name="{0}, namedProblem={1}")
	@MethodSource("enumLiteralReferencesSource")
	def void enumLiteralTest(String qualifiedName, boolean namedProblem) {
		val it = parseHelper.parse('''
			«IF namedProblem»problem test.«ENDIF»
			enum Foo { alpha, beta }
			pred predicate(Foo a) :- node(a).
			predicate(«qualifiedName»).
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, empty)
		assertThat(assertion(0).arg(0).node, equalTo(findEnum("Foo").literal("alpha")))
	}

	@ParameterizedTest(name="{0}, namedProblem={1}")
	@MethodSource("enumLiteralReferencesSource")
	def void enumLiteralInNodeValueAssertionTest(String qualifiedName, boolean namedProblem) {
		val it = parseHelper.parse('''
			«IF namedProblem»problem test.«ENDIF»
			enum Foo { alpha, beta }
			«qualifiedName»: 16.
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, empty)
		assertThat(nodeValueAssertion(0).node, equalTo(findEnum("Foo").literal("alpha")))
	}

	@ParameterizedTest(name="{0}, namedProblem={1}")
	@MethodSource("enumLiteralReferencesSource")
	def void enumLiteralInPredicateTest(String qualifiedName, boolean namedProblem) {
		val it = parseHelper.parse('''
			«IF namedProblem»problem test.«ENDIF»
			enum Foo { alpha, beta }
			pred predicate(Foo a) :- node(«qualifiedName»).
		''')
		assertThat(errors, empty)
		assertThat(nodeNames, empty)
		assertThat(pred("predicate").conj(0).lit(0).arg(0).node, equalTo(findEnum("Foo").literal("alpha")))
	}

	static def enumLiteralReferencesSource() {
		Stream.of(
			Arguments.of("alpha", false),
			Arguments.of("alpha", true),
			Arguments.of("Foo::alpha", false),
			Arguments.of("Foo::alpha", true),
			Arguments.of("test::alpha", true),
			Arguments.of("test::Foo::alpha", true)
		)
	}
}
