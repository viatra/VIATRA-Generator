package ca.mcgill.ecse.dslreasoner.vampire.icse

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.HashMap
import java.util.List
import java.util.Map
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.IQueryGroup

class GeneralTest {
	val static USER_AGENT = "Mozilla/5.0 (Windows NT 10.0 Win64 x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36"

	def static void main(String[] args) {
		val form = makeForm("fof (a, axiom, ! [A] : a(A) ) .", "Z3---4.4.1", "run_z3_tptp -proof -model -t:20 -file:%s", 300)
		
//		val x =sendPost("------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"ProblemSource\"\r\n\r\nFORMULAE\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"FORMULAEProblem\"\r\n\r\n\r\ntester
//
//\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"QuietFlag\"\r\n\r\n-q3\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"SubmitButton\"\r\n\r\nRunSelectedSystems\r\n
//
//------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"System___Paradox---4.0\"\r\n\r\nParadox---4.0\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"Command___Paradox---4.0\"\r\n\r\nparadox --no-progress --time %d --tstp --model %s\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA--")
		val x = sendPost(form)
		print(x.toString)
	}
	
	def static makeForm(String formula, String solver, String cmd, int time) {
		return header + addSpec(formula) + addOptions + addSolver(solver, cmd.replace("%d", time.toString)) + addEnd
	}

	def static sendPost(String formData ) throws Exception {

		val OkHttpClient client = new OkHttpClient()

		val MediaType mediaType = MediaType.parse(
			"multipart/form-data boundary=----WebKitFormBoundaryBdFiQ5zEvTbBl4DA")
		val RequestBody body = RequestBody.create(mediaType, formData)		
		val Request request = new Request.Builder().url("http://www.tptp.org/cgi-bin/SystemOnTPTPFormReply").post(body).
			addHeader("Connection", "keep-alive").addHeader("Cache-Control", "max-age=0").addHeader("Origin",
				"http://tptp.cs.miami.edu").addHeader("Upgrade-Insecure-Requests", "1").addHeader("Content-Type",
				"multipart/form-data boundary=----WebKitFormBoundaryBdFiQ5zEvTbBl4DA").addHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0 Win64 x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36").
			addHeader("Accept",
				"text/html,application/xhtml+xml,application/xmlq=0.9,image/webp,image/apng,*/*q=0.8,application/signed-exchangev=b3").
			addHeader("Referer", "http://tptp.cs.miami.edu/cgi-bin/SystemOnTPTP").addHeader("Accept-Encoding",
				"gzip, deflate").addHeader("Accept-Language", "en-US,enq=0.9").addHeader("Postman-Token",
				"639ff59f-ab5c-4d9f-9da5-ac8bb64be466,ecb71882-f4d8-4126-8a97-4edb07d4055c").addHeader("Host",
				"www.tptp.org").addHeader("Content-Length", "44667").addHeader("cache-control", "no-cache").build()

		val Response response = client.newCall(request).execute()
//		TimeUnit.SECONDS.sleep(5)
//		return newArrayList( response.body.string.split("\n"))
return response.body.string

	// case 1: 
	}
	def static getHeader() {
		return "------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"ProblemSource\"\r\n\r\nFORMULAE\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"FORMULAEProblem\"\r\n\r\n\r\n"
	}
	def static addSpec(String spec) {
		return spec.replace("\n", "\r\n")
	}
	def static addOptions() {
		return "\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"QuietFlag\"\r\n\r\n-q3\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"SubmitButton\"\r\n\r\nRunSelectedSystems\r\n"
	}
	def static addSolver(String ID, String cmd) {
		return "------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"System___" + ID + "\"\r\n\r\n" + ID + "\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"Command___" + ID + "\"\r\n\r\n" + cmd + "\r\n"
	}
	def static addEnd() {
		return "------WebKitFormBoundaryBdFiQ5zEvTbBl4DA--"
	}

	def static Map<Type, Integer> getTypeMap(Map<Class, Integer> classMap, EcoreMetamodelDescriptor metamodel,
		Ecore2Logic e2l, Ecore2Logic_Trace trace) {
		val typeMap = new HashMap<Type, Integer>
		val listMap = metamodel.classes.toMap[s|s.name]

		for (Class  elem : classMap.keySet) {
			typeMap.put(e2l.TypeofEClass(
				trace,
				listMap.get(elem.simpleName)
			), classMap.get(elem))
		}
		return typeMap
	}

	def static loadMetamodel(EPackage pckg) {
		val List<EClass> classes = pckg.getEClassifiers.filter(EClass).toList
		val List<EEnum> enums = pckg.getEClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[getELiterals].flatten.toList
		val List<EReference> references = classes.map[getEReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[getEAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	def static loadPartialModel(ReasonerWorkspace inputs, String path) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl())
		inputs.readModel(EObject, path).eResource.contents
//		inputs.readModel(EObject,"FamInstance.xmi").eResource.allContents.toList
	}

	def static loadQueries(EcoreMetamodelDescriptor metamodel, IQueryGroup i) {
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = emptyMap
		// NO DERIVED FEATURES
//		val derivedFeatures = new LinkedHashMap
//		derivedFeatures.put(i.type,metamodel.attributes.filter[it.name == "type"].head)
//		derivedFeatures.put(i.model,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}
}
