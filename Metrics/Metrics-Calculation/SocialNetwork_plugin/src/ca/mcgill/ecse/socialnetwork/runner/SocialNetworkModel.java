package ca.mcgill.ecse.socialnetwork.runner;

import org.eclipse.emf.common.util.EList;

import socialnetwork.Person;
import socialnetwork.SocialNetwork;
import socialnetwork.SocialnetworkFactory;
import socialnetwork.SocialnetworkPackage;
import socialnetwork.impl.SocialnetworkFactoryImpl;



public class SocialNetworkModel {
	private final static String  SUFFIX = "xmi";
	
	private static boolean isInit = false;
	
	public static void init() {
		SocialnetworkFactory.eINSTANCE.eClass();
		SocialnetworkPackage.eINSTANCE.eClass();
		SocialnetworkFactoryImpl.init();
	}
	
	// container for the social network model
	public SocialNetwork socialNetwork;
	
	// factory for social network model
	SocialnetworkFactory factory;
	
	// persistent
	Persisitence<SocialNetwork> persistence;
	
	
	public SocialNetworkModel(String uri){
		if(!isInit) {
			init();
		}
		
		//create persistence
		persistence = new Persisitence<SocialNetwork>(SUFFIX, uri);
		factory = SocialnetworkFactory.eINSTANCE;
		// try load the model
		this.socialNetwork = persistence.load();
		if(this.socialNetwork == null) {
			this.socialNetwork = factory.createSocialNetwork();
		}
	}
	
	public Person createPerson() {
		Person p = factory.createPerson();
		socialNetwork.getPersons().add(p);
		return p;
	}
	
	public EList<Person> getPersons(){
		return socialNetwork.getPersons();
	}
	
	public boolean save() {
		return persistence.save(socialNetwork);
	}
}
