package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.validation

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import com.google.common.reflect.ClassPath
import ecore.Ecore
import hu.bme.mit.inf.dslreasoner.partialsnapshot_mavo.yakindu.Patterns
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.addon.validation.core.api.IConstraintSpecification

class ViolationCheck {
	/**
	 * Return the total number of violations
	 */
	def static int calculateViolationCounts(EObject root, Domain d) {
		var packageName = '';
		if (d == Domain.Yakindumm) {
			packageName = 'constraints.yakindumm';
		} else if (d == Domain.Ecore) {
			packageName = 'constraints.ecore';
		} else if (d == Domain.Github) {
			return -1;
		}

		var constriants = loadConstraints(packageName);
		var collections = new ConstraintCollection(constriants, Ecore.instance);
		collections.addModel(root);
		var results = collections.calculateViolations();
		if (results.size > 0) {
			return results.get(0);
		} else {
			throw new IllegalArgumentException("Calculate Violation Failed");
		}
	}

	/**
	 * return a map contain the count for each type of violation
	 */
	def static violationMaps(EObject root) {
		var constriants = loadConstraints('hu.bme.mit.inf.dslreasoner.partialsnapshot_mavo.yakindu');
		var collections = new ConstraintCollection(constriants, Patterns.instance);
		collections.addModel(root);
		var results = collections.calculateViolationMaps();
		if (results.size > 0) {
			return results.get(0);
		} else {
			throw new IllegalArgumentException("Calculate Violation Failed");
		}
	}

	def static loadConstraints(String packageName) {
		val constraints = new ArrayList<IConstraintSpecification>();

		val classPath = ClassPath.from(ClassLoader.systemClassLoader);
		val classInfos = classPath.getTopLevelClasses(packageName);
		for (info : classInfos) {
			if (info.load.interfaces.contains(IConstraintSpecification)) {
				// IConstraintSpecification only has one constructor with empty argument list
				var constructor = info.load.constructors.get(0);
				var instance = constructor.newInstance();
				constraints.add(instance as IConstraintSpecification);
			}
		}
		return constraints
	}
}
