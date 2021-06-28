package org.eclipse.viatra.solver.language.tests

import org.eclipse.viatra.solver.language.ProblemUtil
import org.eclipse.viatra.solver.language.model.problem.Argument
import org.eclipse.viatra.solver.language.model.problem.Assertion
import org.eclipse.viatra.solver.language.model.problem.AssertionArgument
import org.eclipse.viatra.solver.language.model.problem.Atom
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration
import org.eclipse.viatra.solver.language.model.problem.Conjunction
import org.eclipse.viatra.solver.language.model.problem.EnumDeclaration
import org.eclipse.viatra.solver.language.model.problem.Literal
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral
import org.eclipse.viatra.solver.language.model.problem.Node
import org.eclipse.viatra.solver.language.model.problem.NodeAssertionArgument
import org.eclipse.viatra.solver.language.model.problem.PredicateDefinition
import org.eclipse.viatra.solver.language.model.problem.Problem
import org.eclipse.viatra.solver.language.model.problem.Variable
import org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument

class ProblemTestUtil {
	def builtin(Problem it) {
		ProblemUtil.getBuiltInLibrary(it).get
	}
	
	def errors(Problem it) {
		eResource.errors
	}
	
	def nodeNames(Problem it) {
		nodes.map[name]
	}
	
	def pred(Problem it, String name) {
		statements.filter(PredicateDefinition).findFirst[it.name == name]
	}
	
	def param(PredicateDefinition it, int i) {
		parameters.get(i)
	} 

	def conj(PredicateDefinition it, int i) {
		bodies.get(i)
	}

	def lit(Conjunction it, int i) {
		literals.get(i)
	}

	def negated(Literal it) {
		(it as NegativeLiteral).atom
	}

	def relation(Literal it) {
		(it as Atom).relation
	}

	def arg(Atom it, int i) {
		it.arguments.get(i)
	}

	def arg(Literal it, int i) {
		(it as Atom).arg(i)
	}

	def variable(Argument it) {
		(it as VariableOrNodeArgument).variableOrNode as Variable
	}

	def node(Argument it) {
		(it as VariableOrNodeArgument).variableOrNode as Node
	}
	
	def assertion(Problem it, int i) {
		statements.filter(Assertion).get(i)
	}
	
	def arg(Assertion it, int i) {
		arguments.get(i)
	}
	
	def node(AssertionArgument it) {
		(it as NodeAssertionArgument).node
	}
	
	def node(Problem it, String name) {
		nodes.findFirst[it.name == name]
	}
	
	def findClass(Problem it, String name) {
		statements.filter(ClassDeclaration).findFirst[it.name == name]
	}
	
	def reference(ClassDeclaration it, String name) {
		it.referenceDeclarations.findFirst[it.name == name]
	}
	
	def findEnum(Problem it, String name) {
		statements.filter(EnumDeclaration).findFirst[it.name == name]
	}
	
	def literal(EnumDeclaration it, String name) {
		literals.findFirst[it.name == name]
	}
}
