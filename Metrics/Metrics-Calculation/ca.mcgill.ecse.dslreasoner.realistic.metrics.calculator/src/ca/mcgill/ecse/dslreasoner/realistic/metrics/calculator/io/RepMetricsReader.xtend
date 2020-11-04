package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup
import github.impl.GithubPackageImpl
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl
import java.util.HashMap
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.impl.EcorePackageImpl

/**
 * Read the sample of the distribution of a metric provided the csv file of the metric
 */
class RepMetricsReader {
	static var Domain domain;
	static def read(Domain d){
		var GraphReader reader;
		if(d == Domain.Yakindumm){
			reader = new GraphReader(YakindummPackageImpl.eINSTANCE, '.xmi');
		}else if (d == Domain.Ecore){
			reader = new GraphReader(EcorePackageImpl.eINSTANCE, '.ecore');
		}else if (d == Domain.Github){
			reader = new GraphReader(GithubPackageImpl.eINSTANCE, '.githubmodel')
		}
		
		domain = d;
		
		var domainRepPath = DataName.REP_PATH + d.name + '/';
		var rep = new MetricSampleGroup()
		var out_d = readMetrics(reader, domainRepPath + DataName.OUT_D_REP);
		var mpc = readMetrics(reader, domainRepPath + DataName.MPC_REP);
		rep.mpcSamples = mpc.mpcSamples;
		rep.outDegreeSamples = out_d.outDegreeSamples;
		rep.naSamples = readMetrics(reader, domainRepPath + DataName.NA_REP).naSamples;
		rep.typedOutDegreeSamples = out_d.typedOutDegreeSamples;
		rep.edgeTypeSamples = mpc.edgeTypeSamples;
		
		//TODO: Parameterize the prior node distribution
		var nodeTypeSamples = new HashMap<String, Double>();
		if(d == Domain.Yakindumm){
			nodeTypeSamples.put('Entry', 0.04257802080554814);
			nodeTypeSamples.put('Choice', 0.1267671379034409);
			nodeTypeSamples.put('State', 0.1596092291277674);
			nodeTypeSamples.put('Transition', 0.6138636969858629);
			nodeTypeSamples.put('Statechart', 0.010136036276340358);
			nodeTypeSamples.put('Region', 0.04467858095492131);
			nodeTypeSamples.put('Exit', 0.0018338223526273673);
			nodeTypeSamples.put('FinalState', 0.0005334755934915977);
		}else if(d ==Domain.Ecore){
			nodeTypeSamples.put('EAttribute', 0.23539778449144008);
			nodeTypeSamples.put('EClass', 0.33081570996978854);
			nodeTypeSamples.put('EReference', 0.30996978851963747);
			nodeTypeSamples.put('EPackage', 0.012789526686807653);
			nodeTypeSamples.put('EAnnotation', 0.002517623363544813);
			nodeTypeSamples.put('EEnumLiteral', 0.07275931520644502);
			nodeTypeSamples.put('EEnum', 0.013645518630412891);
			nodeTypeSamples.put('EDataType', 0.004028197381671702);
			nodeTypeSamples.put('EParameter', 0.005941591137965764);
			nodeTypeSamples.put('EGenericType', 0.002014098690835851);
			nodeTypeSamples.put('EOperation', 0.009415911379657605);
			nodeTypeSamples.put('ETypeParameter', 0.0007049345417925478);	
		}else if (d == Domain.Github){
			nodeTypeSamples.put('Project', 0.012636538873420432);
			nodeTypeSamples.put('Commit', 0.5525808524309276);
			nodeTypeSamples.put('User', 0.05847076461769116);
			nodeTypeSamples.put('Issue', 0.12743628185907047);
			nodeTypeSamples.put('PullRequest', 0.07560505461554937);
			nodeTypeSamples.put('IssueEvent', 0.17327050760334123);
		}
		
		
		
		rep.nodeTypeSamples = nodeTypeSamples;
		return rep;
	}
	
	/**
	 * Read representative model
	 */
	private static def readMetrics(GraphReader r, String path){
		val model = r.readModels(path).head;
		if(domain == Domain.Ecore){
			var refsToRemove = EcorePackageImpl.eINSTANCE.eAllContents.filter(EReference).filter[
				it.name.equals('eGenericType') || it.name.equals('eGenericSuperTypes') || it.name.equals('eFactoryInstance') ||
				it.name.equals('eGenericExceptions') || it.name.equals('references') || it.name.equals('contents');
			];
			refsToRemove.forEach[model.removeReference(it)];
		}
		return model.evaluateAllMetricsToSamples();
	}
	
}

class DataName{
	public static val REP_PATH = 'data/';
	public static val MPC_REP = 'mpc_rep';
	public static val NA_REP = 'na_rep';
	public static val OUT_D_REP = 'out_d_rep';
}

