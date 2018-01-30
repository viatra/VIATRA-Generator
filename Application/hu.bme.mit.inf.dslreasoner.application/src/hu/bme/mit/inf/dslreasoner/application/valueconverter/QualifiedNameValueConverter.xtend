package hu.bme.mit.inf.dslreasoner.application.valueconverter

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractValueConverter
import org.eclipse.xtext.nodemodel.INode

class QualifiedNameValueConverter extends AbstractValueConverter<String>{
	
	@Inject
	protected IValueConverterService valueConverterService;
	
	override toString(String value) throws ValueConverterException {
		//println('''toString: «value»''')
		return value
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		//println('''toValue: «string»''')
		if (node != null) {
			val segments = node.leafNodes.filter[grammarElement.isDelegateRuleCall].map[it.text]
			val res = segments.join('.')
			return res
		} else {
			val segments = string.split('\\.')
			val translatedSegments = segments.map[valueConverterService.toValue(it,"ID",null)]
			val res = translatedSegments.join('.')
			return res
		}
	}
	
	def protected boolean isDelegateRuleCall(EObject grammarElement) {
		if(grammarElement instanceof RuleCall) {
			grammarElement.rule.name == "ID"
		} else {
			return false
		}
	}
}
