package ca.mcgill.ecse.socialnetwork.runner;

import javax.annotation.Resource;

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.Statechart;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummFactory;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummFactoryImpl;
import socialnetwork.SocialNetwork;
import socialnetwork.SocialnetworkFactory;

public class YakinduumModel {
	private final static String  SUFFIX = "xmi";
	
	private static boolean isInit = false;
	
	private String uri;
	
	public static void init() {
		YakindummFactory.eINSTANCE.eClass();
		YakindummPackage.eINSTANCE.eClass();
		YakindummFactoryImpl.init();
	}
	
	// container for the social network model
	public Statechart yakinduum;
	
	
	// persistent
	Persisitence<Statechart> persistence;
	
	
	public YakinduumModel(String uri){
		if(!isInit) {
			init();
		}
		this.uri = uri;
		//create persistence
		persistence = new Persisitence<Statechart>(SUFFIX, uri);
		// try load the model
		this.yakinduum = persistence.load();
	}
	
	public boolean save(String uri) {
		if(this.uri.equals(uri)) {
			return persistence.save(yakinduum);
		}else {
			persistence = new Persisitence<Statechart>(SUFFIX, uri);
			return persistence.save(yakinduum);
		}
	}
}
