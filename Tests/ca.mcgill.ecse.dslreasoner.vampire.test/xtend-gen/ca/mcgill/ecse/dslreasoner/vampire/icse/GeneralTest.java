package ca.mcgill.ecse.dslreasoner.vampire.icse;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class GeneralTest {
  private final static String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0 Win64 x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36";
  
  public static void main(final String[] args) {
    try {
      final String form = GeneralTest.makeForm("fof (a, axiom, ! [A] : a(A) ) .", "Z3---4.4.1", "run_z3_tptp -proof -model -t:20 -file:%s", 300);
      final String x = GeneralTest.sendPost(form);
      InputOutput.<String>print(x.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String makeForm(final String formula, final String solver, final String cmd, final int time) {
    String _header = GeneralTest.getHeader();
    String _addSpec = GeneralTest.addSpec(formula);
    String _plus = (_header + _addSpec);
    String _addOptions = GeneralTest.addOptions();
    String _plus_1 = (_plus + _addOptions);
    String _addSolver = GeneralTest.addSolver(solver, cmd.replace("%d", Integer.valueOf(time).toString()));
    String _plus_2 = (_plus_1 + _addSolver);
    String _addEnd = GeneralTest.addEnd();
    return (_plus_2 + _addEnd);
  }
  
  public static String sendPost(final String formData) throws Exception {
    final OkHttpClient client = new OkHttpClient();
    final MediaType mediaType = MediaType.parse(
      "multipart/form-data boundary=----WebKitFormBoundaryBdFiQ5zEvTbBl4DA");
    final RequestBody body = RequestBody.create(mediaType, formData);
    final Request request = new Request.Builder().url("http://www.tptp.org/cgi-bin/SystemOnTPTPFormReply").post(body).addHeader("Connection", "keep-alive").addHeader("Cache-Control", "max-age=0").addHeader("Origin", 
      "http://tptp.cs.miami.edu").addHeader("Upgrade-Insecure-Requests", "1").addHeader("Content-Type", 
      "multipart/form-data boundary=----WebKitFormBoundaryBdFiQ5zEvTbBl4DA").addHeader("User-Agent", 
      "Mozilla/5.0 (Windows NT 10.0 Win64 x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36").addHeader("Accept", 
      "text/html,application/xhtml+xml,application/xmlq=0.9,image/webp,image/apng,*/*q=0.8,application/signed-exchangev=b3").addHeader("Referer", "http://tptp.cs.miami.edu/cgi-bin/SystemOnTPTP").addHeader("Accept-Encoding", 
      "gzip, deflate").addHeader("Accept-Language", "en-US,enq=0.9").addHeader("Postman-Token", 
      "639ff59f-ab5c-4d9f-9da5-ac8bb64be466,ecb71882-f4d8-4126-8a97-4edb07d4055c").addHeader("Host", 
      "www.tptp.org").addHeader("Content-Length", "44667").addHeader("cache-control", "no-cache").build();
    final Response response = client.newCall(request).execute();
    return response.body().string();
  }
  
  public static String getHeader() {
    return "------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"ProblemSource\"\r\n\r\nFORMULAE\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"FORMULAEProblem\"\r\n\r\n\r\n";
  }
  
  public static String addSpec(final String spec) {
    return spec.replace("\n", "\r\n");
  }
  
  public static String addOptions() {
    return "\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"QuietFlag\"\r\n\r\n-q3\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"SubmitButton\"\r\n\r\nRunSelectedSystems\r\n";
  }
  
  public static String addSolver(final String ID, final String cmd) {
    return (((((((("------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"System___" + ID) + "\"\r\n\r\n") + ID) + "\r\n------WebKitFormBoundaryBdFiQ5zEvTbBl4DA\r\nContent-Disposition: form-data; name=\"Command___") + ID) + "\"\r\n\r\n") + cmd) + "\r\n");
  }
  
  public static String addEnd() {
    return "------WebKitFormBoundaryBdFiQ5zEvTbBl4DA--";
  }
  
  public static Map<Type, Integer> getTypeMap(final Map<Class, Integer> classMap, final EcoreMetamodelDescriptor metamodel, final Ecore2Logic e2l, final Ecore2Logic_Trace trace) {
    final HashMap<Type, Integer> typeMap = new HashMap<Type, Integer>();
    final Function1<EClass, String> _function = (EClass s) -> {
      return s.getName();
    };
    final Map<String, EClass> listMap = IterableExtensions.<String, EClass>toMap(metamodel.getClasses(), _function);
    Set<Class> _keySet = classMap.keySet();
    for (final Class elem : _keySet) {
      typeMap.put(
        e2l.TypeofEClass(trace, 
          listMap.get(elem.getSimpleName())), classMap.get(elem));
    }
    return typeMap;
  }
  
  public static EcoreMetamodelDescriptor loadMetamodel(final EPackage pckg) {
    final List<EClass> classes = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
    final List<EEnum> enums = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
    final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
      return it.getELiterals();
    };
    final List<EEnumLiteral> literals = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(ListExtensions.<EEnum, EList<EEnumLiteral>>map(enums, _function)));
    final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
      return it.getEReferences();
    };
    final List<EReference> references = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(ListExtensions.<EClass, EList<EReference>>map(classes, _function_1)));
    final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
      return it.getEAttributes();
    };
    final List<EAttribute> attributes = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(ListExtensions.<EClass, EList<EAttribute>>map(classes, _function_2)));
    return new EcoreMetamodelDescriptor(classes, Collections.<EClass>unmodifiableSet(CollectionLiterals.<EClass>newHashSet()), false, enums, literals, references, attributes);
  }
  
  public static EList<EObject> loadPartialModel(final ReasonerWorkspace inputs, final String path) {
    EList<EObject> _xblockexpression = null;
    {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      _xblockexpression = inputs.<EObject>readModel(EObject.class, path).eResource().getContents();
    }
    return _xblockexpression;
  }
  
  public static ViatraQuerySetDescriptor loadQueries(final EcoreMetamodelDescriptor metamodel, final IQueryGroup i) {
    final List<IQuerySpecification<?>> patterns = IterableExtensions.<IQuerySpecification<?>>toList(i.getSpecifications());
    final Function1<IQuerySpecification<?>, Boolean> _function = (IQuerySpecification<?> it) -> {
      final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it_1) -> {
        String _name = it_1.getName();
        return Boolean.valueOf(Objects.equal(_name, "Constraint"));
      };
      return Boolean.valueOf(IterableExtensions.<PAnnotation>exists(it.getAllAnnotations(), _function_1));
    };
    final Set<IQuerySpecification<?>> wfPatterns = IterableExtensions.<IQuerySpecification<?>>toSet(IterableExtensions.<IQuerySpecification<?>>filter(patterns, _function));
    final Map<IQuerySpecification<?>, EStructuralFeature> derivedFeatures = CollectionLiterals.<IQuerySpecification<?>, EStructuralFeature>emptyMap();
    final ViatraQuerySetDescriptor res = new ViatraQuerySetDescriptor(patterns, wfPatterns, derivedFeatures);
    return res;
  }
}
