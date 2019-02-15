package hu.bme.mit.inf.dslreasoner.faulttree.components.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.dslreasoner.faulttree.components.services.CftLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCftLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OF_INT", "RULE_ID", "RULE_T_DOUBLE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'cft'", "'{'", "'in'", "'out'", "'}'", "'[]'", "'prob'", "'='", "'lambda'", "'and'", "'or'", "'of'", "'transformation'", "'toplevel'", "'mapping'", "'('", "','", "')'", "'lookup'", "'as'", "'+='", "':='", "'.'", "'=>'", "'*'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_T_DOUBLE=7;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_OF_INT=5;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCftLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCftLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCftLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCftLanguage.g"; }



     	private CftLanguageGrammarAccess grammarAccess;

        public InternalCftLanguageParser(TokenStream input, CftLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CftModel";
       	}

       	@Override
       	protected CftLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCftModel"
    // InternalCftLanguage.g:64:1: entryRuleCftModel returns [EObject current=null] : iv_ruleCftModel= ruleCftModel EOF ;
    public final EObject entryRuleCftModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCftModel = null;


        try {
            // InternalCftLanguage.g:64:49: (iv_ruleCftModel= ruleCftModel EOF )
            // InternalCftLanguage.g:65:2: iv_ruleCftModel= ruleCftModel EOF
            {
             newCompositeNode(grammarAccess.getCftModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCftModel=ruleCftModel();

            state._fsp--;

             current =iv_ruleCftModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCftModel"


    // $ANTLR start "ruleCftModel"
    // InternalCftLanguage.g:71:1: ruleCftModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) ) | ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) ) )* ) ;
    public final EObject ruleCftModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_componentDefinitions_4_0 = null;

        EObject lv_transformationDefinitions_5_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:77:2: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) ) | ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) ) )* ) )
            // InternalCftLanguage.g:78:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) ) | ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) ) )* )
            {
            // InternalCftLanguage.g:78:2: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) ) | ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) ) )* )
            // InternalCftLanguage.g:79:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleImportDeclaration ) )* ( ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) ) | ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCftModelAccess().getPackageKeyword_0());
            		
            // InternalCftLanguage.g:83:3: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // InternalCftLanguage.g:84:4: (lv_packageName_1_0= ruleQualifiedName )
            {
            // InternalCftLanguage.g:84:4: (lv_packageName_1_0= ruleQualifiedName )
            // InternalCftLanguage.g:85:5: lv_packageName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getCftModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCftModelRule());
            					}
            					set(
            						current,
            						"packageName",
            						lv_packageName_1_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:102:3: (otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCftLanguage.g:103:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCftModelAccess().getSemicolonKeyword_2());
                    			

                    }
                    break;

            }

            // InternalCftLanguage.g:108:3: ( (lv_imports_3_0= ruleImportDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCftLanguage.g:109:4: (lv_imports_3_0= ruleImportDeclaration )
            	    {
            	    // InternalCftLanguage.g:109:4: (lv_imports_3_0= ruleImportDeclaration )
            	    // InternalCftLanguage.g:110:5: lv_imports_3_0= ruleImportDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getCftModelAccess().getImportsImportDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImportDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCftModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ImportDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCftLanguage.g:127:3: ( ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) ) | ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }
                else if ( (LA3_0==28) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCftLanguage.g:128:4: ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) )
            	    {
            	    // InternalCftLanguage.g:128:4: ( (lv_componentDefinitions_4_0= ruleComponentDefinition ) )
            	    // InternalCftLanguage.g:129:5: (lv_componentDefinitions_4_0= ruleComponentDefinition )
            	    {
            	    // InternalCftLanguage.g:129:5: (lv_componentDefinitions_4_0= ruleComponentDefinition )
            	    // InternalCftLanguage.g:130:6: lv_componentDefinitions_4_0= ruleComponentDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getCftModelAccess().getComponentDefinitionsComponentDefinitionParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_componentDefinitions_4_0=ruleComponentDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCftModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentDefinitions",
            	    							lv_componentDefinitions_4_0,
            	    							"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ComponentDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCftLanguage.g:148:4: ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) )
            	    {
            	    // InternalCftLanguage.g:148:4: ( (lv_transformationDefinitions_5_0= ruleTransformationDefinition ) )
            	    // InternalCftLanguage.g:149:5: (lv_transformationDefinitions_5_0= ruleTransformationDefinition )
            	    {
            	    // InternalCftLanguage.g:149:5: (lv_transformationDefinitions_5_0= ruleTransformationDefinition )
            	    // InternalCftLanguage.g:150:6: lv_transformationDefinitions_5_0= ruleTransformationDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getCftModelAccess().getTransformationDefinitionsTransformationDefinitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_transformationDefinitions_5_0=ruleTransformationDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCftModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transformationDefinitions",
            	    							lv_transformationDefinitions_5_0,
            	    							"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.TransformationDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCftModel"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalCftLanguage.g:172:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalCftLanguage.g:172:58: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalCftLanguage.g:173:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalCftLanguage.g:179:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:185:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) )
            // InternalCftLanguage.g:186:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            {
            // InternalCftLanguage.g:186:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            // InternalCftLanguage.g:187:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
            		
            // InternalCftLanguage.g:191:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalCftLanguage.g:192:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalCftLanguage.g:192:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalCftLanguage.g:193:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:210:3: (otherlv_2= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCftLanguage.g:211:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportDeclarationAccess().getSemicolonKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleComponentDefinition"
    // InternalCftLanguage.g:220:1: entryRuleComponentDefinition returns [EObject current=null] : iv_ruleComponentDefinition= ruleComponentDefinition EOF ;
    public final EObject entryRuleComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinition = null;


        try {
            // InternalCftLanguage.g:220:60: (iv_ruleComponentDefinition= ruleComponentDefinition EOF )
            // InternalCftLanguage.g:221:2: iv_ruleComponentDefinition= ruleComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDefinition=ruleComponentDefinition();

            state._fsp--;

             current =iv_ruleComponentDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDefinition"


    // $ANTLR start "ruleComponentDefinition"
    // InternalCftLanguage.g:227:1: ruleComponentDefinition returns [EObject current=null] : (otherlv_0= 'cft' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_inputEvents_5_0 = null;

        EObject lv_eventDefinitions_10_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:233:2: ( (otherlv_0= 'cft' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' ) )
            // InternalCftLanguage.g:234:2: (otherlv_0= 'cft' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' )
            {
            // InternalCftLanguage.g:234:2: (otherlv_0= 'cft' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' )
            // InternalCftLanguage.g:235:3: otherlv_0= 'cft' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getCftKeyword_0());
            		
            // InternalCftLanguage.g:239:3: ( (lv_name_1_0= ruleValidId ) )
            // InternalCftLanguage.g:240:4: (lv_name_1_0= ruleValidId )
            {
            // InternalCftLanguage.g:240:4: (lv_name_1_0= ruleValidId )
            // InternalCftLanguage.g:241:5: lv_name_1_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getComponentDefinitionAccess().getNameValidIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCftLanguage.g:262:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) ) )
            // InternalCftLanguage.g:263:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) )
            {
            // InternalCftLanguage.g:263:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* ) )
            // InternalCftLanguage.g:264:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3());
            				
            // InternalCftLanguage.g:267:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )* )
            // InternalCftLanguage.g:268:6: ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )*
            {
            // InternalCftLanguage.g:268:6: ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCftLanguage.g:269:4: ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalCftLanguage.g:269:4: ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) )
            	    // InternalCftLanguage.g:270:5: {...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalCftLanguage.g:270:116: ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) )
            	    // InternalCftLanguage.g:271:6: ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalCftLanguage.g:274:9: ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) )
            	    // InternalCftLanguage.g:274:10: {...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "true");
            	    }
            	    // InternalCftLanguage.g:274:19: (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' )
            	    // InternalCftLanguage.g:274:20: otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentDefinitionAccess().getInKeyword_3_0_0());
            	    								
            	    // InternalCftLanguage.g:278:9: ( (lv_inputEvents_5_0= ruleInputEvent ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=RULE_OF_INT && LA5_0<=RULE_ID)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalCftLanguage.g:279:10: (lv_inputEvents_5_0= ruleInputEvent )
            	    	    {
            	    	    // InternalCftLanguage.g:279:10: (lv_inputEvents_5_0= ruleInputEvent )
            	    	    // InternalCftLanguage.g:280:11: lv_inputEvents_5_0= ruleInputEvent
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getComponentDefinitionAccess().getInputEventsInputEventParserRuleCall_3_0_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_inputEvents_5_0=ruleInputEvent();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"inputEvents",
            	    	    												lv_inputEvents_5_0,
            	    	    												"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.InputEvent");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getComponentDefinitionAccess().getSemicolonKeyword_3_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCftLanguage.g:307:4: ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalCftLanguage.g:307:4: ({...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) ) )
            	    // InternalCftLanguage.g:308:5: {...}? => ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalCftLanguage.g:308:116: ( ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) ) )
            	    // InternalCftLanguage.g:309:6: ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalCftLanguage.g:312:9: ({...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' ) )
            	    // InternalCftLanguage.g:312:10: {...}? => (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "true");
            	    }
            	    // InternalCftLanguage.g:312:19: (otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';' )
            	    // InternalCftLanguage.g:312:20: otherlv_7= 'out' ( ( ruleValidId ) )* otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_10); 

            	    									newLeafNode(otherlv_7, grammarAccess.getComponentDefinitionAccess().getOutKeyword_3_1_0());
            	    								
            	    // InternalCftLanguage.g:316:9: ( ( ruleValidId ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>=RULE_OF_INT && LA6_0<=RULE_ID)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalCftLanguage.g:317:10: ( ruleValidId )
            	    	    {
            	    	    // InternalCftLanguage.g:317:10: ( ruleValidId )
            	    	    // InternalCftLanguage.g:318:11: ruleValidId
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getComponentDefinitionRule());
            	    	    											}
            	    	    										

            	    	    											newCompositeNode(grammarAccess.getComponentDefinitionAccess().getOutputEventsEventDeclarationCrossReference_3_1_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_10);
            	    	    ruleValidId();

            	    	    state._fsp--;


            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,14,FOLLOW_9); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentDefinitionAccess().getSemicolonKeyword_3_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3());
            				

            }

            // InternalCftLanguage.g:349:3: ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_OF_INT && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCftLanguage.g:350:4: ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';'
            	    {
            	    // InternalCftLanguage.g:350:4: ( (lv_eventDefinitions_10_0= ruleEventDefinition ) )
            	    // InternalCftLanguage.g:351:5: (lv_eventDefinitions_10_0= ruleEventDefinition )
            	    {
            	    // InternalCftLanguage.g:351:5: (lv_eventDefinitions_10_0= ruleEventDefinition )
            	    // InternalCftLanguage.g:352:6: lv_eventDefinitions_10_0= ruleEventDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getComponentDefinitionAccess().getEventDefinitionsEventDefinitionParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_eventDefinitions_10_0=ruleEventDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"eventDefinitions",
            	    							lv_eventDefinitions_10_0,
            	    							"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.EventDefinition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_11, grammarAccess.getComponentDefinitionAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleInputEvent"
    // InternalCftLanguage.g:382:1: entryRuleInputEvent returns [EObject current=null] : iv_ruleInputEvent= ruleInputEvent EOF ;
    public final EObject entryRuleInputEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputEvent = null;


        try {
            // InternalCftLanguage.g:382:51: (iv_ruleInputEvent= ruleInputEvent EOF )
            // InternalCftLanguage.g:383:2: iv_ruleInputEvent= ruleInputEvent EOF
            {
             newCompositeNode(grammarAccess.getInputEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputEvent=ruleInputEvent();

            state._fsp--;

             current =iv_ruleInputEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputEvent"


    // $ANTLR start "ruleInputEvent"
    // InternalCftLanguage.g:389:1: ruleInputEvent returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_multiple_1_0= '[]' ) )? ) ;
    public final EObject ruleInputEvent() throws RecognitionException {
        EObject current = null;

        Token lv_multiple_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:395:2: ( ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_multiple_1_0= '[]' ) )? ) )
            // InternalCftLanguage.g:396:2: ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_multiple_1_0= '[]' ) )? )
            {
            // InternalCftLanguage.g:396:2: ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_multiple_1_0= '[]' ) )? )
            // InternalCftLanguage.g:397:3: ( (lv_name_0_0= ruleValidId ) ) ( (lv_multiple_1_0= '[]' ) )?
            {
            // InternalCftLanguage.g:397:3: ( (lv_name_0_0= ruleValidId ) )
            // InternalCftLanguage.g:398:4: (lv_name_0_0= ruleValidId )
            {
            // InternalCftLanguage.g:398:4: (lv_name_0_0= ruleValidId )
            // InternalCftLanguage.g:399:5: lv_name_0_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getInputEventAccess().getNameValidIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_0_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:416:3: ( (lv_multiple_1_0= '[]' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCftLanguage.g:417:4: (lv_multiple_1_0= '[]' )
                    {
                    // InternalCftLanguage.g:417:4: (lv_multiple_1_0= '[]' )
                    // InternalCftLanguage.g:418:5: lv_multiple_1_0= '[]'
                    {
                    lv_multiple_1_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_multiple_1_0, grammarAccess.getInputEventAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputEventRule());
                    					}
                    					setWithLastConsumed(current, "multiple", true, "[]");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputEvent"


    // $ANTLR start "entryRuleEventDefinition"
    // InternalCftLanguage.g:434:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // InternalCftLanguage.g:434:56: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // InternalCftLanguage.g:435:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
             newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;

             current =iv_ruleEventDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDefinition"


    // $ANTLR start "ruleEventDefinition"
    // InternalCftLanguage.g:441:1: ruleEventDefinition returns [EObject current=null] : (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_BasicEventDefinition_0 = null;

        EObject this_GateDefinition_1 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:447:2: ( (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition ) )
            // InternalCftLanguage.g:448:2: (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition )
            {
            // InternalCftLanguage.g:448:2: (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_INT||(LA10_1>=25 && LA10_1<=26)) ) {
                    alt10=2;
                }
                else if ( (LA10_1==22||LA10_1==24) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_OF_INT) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==22||LA10_2==24) ) {
                    alt10=1;
                }
                else if ( (LA10_2==RULE_INT||(LA10_2>=25 && LA10_2<=26)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCftLanguage.g:449:3: this_BasicEventDefinition_0= ruleBasicEventDefinition
                    {

                    			newCompositeNode(grammarAccess.getEventDefinitionAccess().getBasicEventDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicEventDefinition_0=ruleBasicEventDefinition();

                    state._fsp--;


                    			current = this_BasicEventDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:458:3: this_GateDefinition_1= ruleGateDefinition
                    {

                    			newCompositeNode(grammarAccess.getEventDefinitionAccess().getGateDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GateDefinition_1=ruleGateDefinition();

                    state._fsp--;


                    			current = this_GateDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDefinition"


    // $ANTLR start "entryRuleBasicEventDefinition"
    // InternalCftLanguage.g:470:1: entryRuleBasicEventDefinition returns [EObject current=null] : iv_ruleBasicEventDefinition= ruleBasicEventDefinition EOF ;
    public final EObject entryRuleBasicEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicEventDefinition = null;


        try {
            // InternalCftLanguage.g:470:61: (iv_ruleBasicEventDefinition= ruleBasicEventDefinition EOF )
            // InternalCftLanguage.g:471:2: iv_ruleBasicEventDefinition= ruleBasicEventDefinition EOF
            {
             newCompositeNode(grammarAccess.getBasicEventDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicEventDefinition=ruleBasicEventDefinition();

            state._fsp--;

             current =iv_ruleBasicEventDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicEventDefinition"


    // $ANTLR start "ruleBasicEventDefinition"
    // InternalCftLanguage.g:477:1: ruleBasicEventDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_distribution_1_0= ruleDistribution ) ) ) ;
    public final EObject ruleBasicEventDefinition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_distribution_1_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:483:2: ( ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_distribution_1_0= ruleDistribution ) ) ) )
            // InternalCftLanguage.g:484:2: ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_distribution_1_0= ruleDistribution ) ) )
            {
            // InternalCftLanguage.g:484:2: ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_distribution_1_0= ruleDistribution ) ) )
            // InternalCftLanguage.g:485:3: ( (lv_name_0_0= ruleValidId ) ) ( (lv_distribution_1_0= ruleDistribution ) )
            {
            // InternalCftLanguage.g:485:3: ( (lv_name_0_0= ruleValidId ) )
            // InternalCftLanguage.g:486:4: (lv_name_0_0= ruleValidId )
            {
            // InternalCftLanguage.g:486:4: (lv_name_0_0= ruleValidId )
            // InternalCftLanguage.g:487:5: lv_name_0_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getBasicEventDefinitionAccess().getNameValidIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicEventDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:504:3: ( (lv_distribution_1_0= ruleDistribution ) )
            // InternalCftLanguage.g:505:4: (lv_distribution_1_0= ruleDistribution )
            {
            // InternalCftLanguage.g:505:4: (lv_distribution_1_0= ruleDistribution )
            // InternalCftLanguage.g:506:5: lv_distribution_1_0= ruleDistribution
            {

            					newCompositeNode(grammarAccess.getBasicEventDefinitionAccess().getDistributionDistributionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distribution_1_0=ruleDistribution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicEventDefinitionRule());
            					}
            					set(
            						current,
            						"distribution",
            						lv_distribution_1_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.Distribution");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicEventDefinition"


    // $ANTLR start "entryRuleDistribution"
    // InternalCftLanguage.g:527:1: entryRuleDistribution returns [EObject current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final EObject entryRuleDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistribution = null;


        try {
            // InternalCftLanguage.g:527:53: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalCftLanguage.g:528:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistribution"


    // $ANTLR start "ruleDistribution"
    // InternalCftLanguage.g:534:1: ruleDistribution returns [EObject current=null] : (this_ConstantDistribution_0= ruleConstantDistribution | this_ExponentialDistribution_1= ruleExponentialDistribution ) ;
    public final EObject ruleDistribution() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantDistribution_0 = null;

        EObject this_ExponentialDistribution_1 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:540:2: ( (this_ConstantDistribution_0= ruleConstantDistribution | this_ExponentialDistribution_1= ruleExponentialDistribution ) )
            // InternalCftLanguage.g:541:2: (this_ConstantDistribution_0= ruleConstantDistribution | this_ExponentialDistribution_1= ruleExponentialDistribution )
            {
            // InternalCftLanguage.g:541:2: (this_ConstantDistribution_0= ruleConstantDistribution | this_ExponentialDistribution_1= ruleExponentialDistribution )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCftLanguage.g:542:3: this_ConstantDistribution_0= ruleConstantDistribution
                    {

                    			newCompositeNode(grammarAccess.getDistributionAccess().getConstantDistributionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantDistribution_0=ruleConstantDistribution();

                    state._fsp--;


                    			current = this_ConstantDistribution_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:551:3: this_ExponentialDistribution_1= ruleExponentialDistribution
                    {

                    			newCompositeNode(grammarAccess.getDistributionAccess().getExponentialDistributionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExponentialDistribution_1=ruleExponentialDistribution();

                    state._fsp--;


                    			current = this_ExponentialDistribution_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleConstantDistribution"
    // InternalCftLanguage.g:563:1: entryRuleConstantDistribution returns [EObject current=null] : iv_ruleConstantDistribution= ruleConstantDistribution EOF ;
    public final EObject entryRuleConstantDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDistribution = null;


        try {
            // InternalCftLanguage.g:563:61: (iv_ruleConstantDistribution= ruleConstantDistribution EOF )
            // InternalCftLanguage.g:564:2: iv_ruleConstantDistribution= ruleConstantDistribution EOF
            {
             newCompositeNode(grammarAccess.getConstantDistributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantDistribution=ruleConstantDistribution();

            state._fsp--;

             current =iv_ruleConstantDistribution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDistribution"


    // $ANTLR start "ruleConstantDistribution"
    // InternalCftLanguage.g:570:1: ruleConstantDistribution returns [EObject current=null] : (otherlv_0= 'prob' otherlv_1= '=' ( (lv_p_2_0= ruleDouble ) ) ) ;
    public final EObject ruleConstantDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_p_2_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:576:2: ( (otherlv_0= 'prob' otherlv_1= '=' ( (lv_p_2_0= ruleDouble ) ) ) )
            // InternalCftLanguage.g:577:2: (otherlv_0= 'prob' otherlv_1= '=' ( (lv_p_2_0= ruleDouble ) ) )
            {
            // InternalCftLanguage.g:577:2: (otherlv_0= 'prob' otherlv_1= '=' ( (lv_p_2_0= ruleDouble ) ) )
            // InternalCftLanguage.g:578:3: otherlv_0= 'prob' otherlv_1= '=' ( (lv_p_2_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantDistributionAccess().getProbKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantDistributionAccess().getEqualsSignKeyword_1());
            		
            // InternalCftLanguage.g:586:3: ( (lv_p_2_0= ruleDouble ) )
            // InternalCftLanguage.g:587:4: (lv_p_2_0= ruleDouble )
            {
            // InternalCftLanguage.g:587:4: (lv_p_2_0= ruleDouble )
            // InternalCftLanguage.g:588:5: lv_p_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getConstantDistributionAccess().getPDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_p_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantDistributionRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_2_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDistribution"


    // $ANTLR start "entryRuleExponentialDistribution"
    // InternalCftLanguage.g:609:1: entryRuleExponentialDistribution returns [EObject current=null] : iv_ruleExponentialDistribution= ruleExponentialDistribution EOF ;
    public final EObject entryRuleExponentialDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialDistribution = null;


        try {
            // InternalCftLanguage.g:609:64: (iv_ruleExponentialDistribution= ruleExponentialDistribution EOF )
            // InternalCftLanguage.g:610:2: iv_ruleExponentialDistribution= ruleExponentialDistribution EOF
            {
             newCompositeNode(grammarAccess.getExponentialDistributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentialDistribution=ruleExponentialDistribution();

            state._fsp--;

             current =iv_ruleExponentialDistribution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponentialDistribution"


    // $ANTLR start "ruleExponentialDistribution"
    // InternalCftLanguage.g:616:1: ruleExponentialDistribution returns [EObject current=null] : (otherlv_0= 'lambda' otherlv_1= '=' ( (lv_lambda_2_0= ruleDouble ) ) ) ;
    public final EObject ruleExponentialDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lambda_2_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:622:2: ( (otherlv_0= 'lambda' otherlv_1= '=' ( (lv_lambda_2_0= ruleDouble ) ) ) )
            // InternalCftLanguage.g:623:2: (otherlv_0= 'lambda' otherlv_1= '=' ( (lv_lambda_2_0= ruleDouble ) ) )
            {
            // InternalCftLanguage.g:623:2: (otherlv_0= 'lambda' otherlv_1= '=' ( (lv_lambda_2_0= ruleDouble ) ) )
            // InternalCftLanguage.g:624:3: otherlv_0= 'lambda' otherlv_1= '=' ( (lv_lambda_2_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getExponentialDistributionAccess().getLambdaKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getExponentialDistributionAccess().getEqualsSignKeyword_1());
            		
            // InternalCftLanguage.g:632:3: ( (lv_lambda_2_0= ruleDouble ) )
            // InternalCftLanguage.g:633:4: (lv_lambda_2_0= ruleDouble )
            {
            // InternalCftLanguage.g:633:4: (lv_lambda_2_0= ruleDouble )
            // InternalCftLanguage.g:634:5: lv_lambda_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getExponentialDistributionAccess().getLambdaDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_lambda_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExponentialDistributionRule());
            					}
            					set(
            						current,
            						"lambda",
            						lv_lambda_2_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponentialDistribution"


    // $ANTLR start "entryRuleGateDefinition"
    // InternalCftLanguage.g:655:1: entryRuleGateDefinition returns [EObject current=null] : iv_ruleGateDefinition= ruleGateDefinition EOF ;
    public final EObject entryRuleGateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateDefinition = null;


        try {
            // InternalCftLanguage.g:655:55: (iv_ruleGateDefinition= ruleGateDefinition EOF )
            // InternalCftLanguage.g:656:2: iv_ruleGateDefinition= ruleGateDefinition EOF
            {
             newCompositeNode(grammarAccess.getGateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateDefinition=ruleGateDefinition();

            state._fsp--;

             current =iv_ruleGateDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGateDefinition"


    // $ANTLR start "ruleGateDefinition"
    // InternalCftLanguage.g:662:1: ruleGateDefinition returns [EObject current=null] : (this_AndGateDefinition_0= ruleAndGateDefinition | this_OrGateDefinition_1= ruleOrGateDefinition | this_KOfMGateDefinition_2= ruleKOfMGateDefinition ) ;
    public final EObject ruleGateDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_AndGateDefinition_0 = null;

        EObject this_OrGateDefinition_1 = null;

        EObject this_KOfMGateDefinition_2 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:668:2: ( (this_AndGateDefinition_0= ruleAndGateDefinition | this_OrGateDefinition_1= ruleOrGateDefinition | this_KOfMGateDefinition_2= ruleKOfMGateDefinition ) )
            // InternalCftLanguage.g:669:2: (this_AndGateDefinition_0= ruleAndGateDefinition | this_OrGateDefinition_1= ruleOrGateDefinition | this_KOfMGateDefinition_2= ruleKOfMGateDefinition )
            {
            // InternalCftLanguage.g:669:2: (this_AndGateDefinition_0= ruleAndGateDefinition | this_OrGateDefinition_1= ruleOrGateDefinition | this_KOfMGateDefinition_2= ruleKOfMGateDefinition )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    alt12=3;
                    }
                    break;
                case 26:
                    {
                    alt12=2;
                    }
                    break;
                case 25:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA12_0==RULE_OF_INT) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    alt12=3;
                    }
                    break;
                case 26:
                    {
                    alt12=2;
                    }
                    break;
                case 25:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCftLanguage.g:670:3: this_AndGateDefinition_0= ruleAndGateDefinition
                    {

                    			newCompositeNode(grammarAccess.getGateDefinitionAccess().getAndGateDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndGateDefinition_0=ruleAndGateDefinition();

                    state._fsp--;


                    			current = this_AndGateDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:679:3: this_OrGateDefinition_1= ruleOrGateDefinition
                    {

                    			newCompositeNode(grammarAccess.getGateDefinitionAccess().getOrGateDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrGateDefinition_1=ruleOrGateDefinition();

                    state._fsp--;


                    			current = this_OrGateDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCftLanguage.g:688:3: this_KOfMGateDefinition_2= ruleKOfMGateDefinition
                    {

                    			newCompositeNode(grammarAccess.getGateDefinitionAccess().getKOfMGateDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_KOfMGateDefinition_2=ruleKOfMGateDefinition();

                    state._fsp--;


                    			current = this_KOfMGateDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGateDefinition"


    // $ANTLR start "entryRuleAndGateDefinition"
    // InternalCftLanguage.g:700:1: entryRuleAndGateDefinition returns [EObject current=null] : iv_ruleAndGateDefinition= ruleAndGateDefinition EOF ;
    public final EObject entryRuleAndGateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndGateDefinition = null;


        try {
            // InternalCftLanguage.g:700:58: (iv_ruleAndGateDefinition= ruleAndGateDefinition EOF )
            // InternalCftLanguage.g:701:2: iv_ruleAndGateDefinition= ruleAndGateDefinition EOF
            {
             newCompositeNode(grammarAccess.getAndGateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndGateDefinition=ruleAndGateDefinition();

            state._fsp--;

             current =iv_ruleAndGateDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndGateDefinition"


    // $ANTLR start "ruleAndGateDefinition"
    // InternalCftLanguage.g:707:1: ruleAndGateDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'and' ( ( ruleValidId ) )* ) ;
    public final EObject ruleAndGateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:713:2: ( ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'and' ( ( ruleValidId ) )* ) )
            // InternalCftLanguage.g:714:2: ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'and' ( ( ruleValidId ) )* )
            {
            // InternalCftLanguage.g:714:2: ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'and' ( ( ruleValidId ) )* )
            // InternalCftLanguage.g:715:3: ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'and' ( ( ruleValidId ) )*
            {
            // InternalCftLanguage.g:715:3: ( (lv_name_0_0= ruleValidId ) )
            // InternalCftLanguage.g:716:4: (lv_name_0_0= ruleValidId )
            {
            // InternalCftLanguage.g:716:4: (lv_name_0_0= ruleValidId )
            // InternalCftLanguage.g:717:5: lv_name_0_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getAndGateDefinitionAccess().getNameValidIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_0_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndGateDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAndGateDefinitionAccess().getAndKeyword_1());
            		
            // InternalCftLanguage.g:738:3: ( ( ruleValidId ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_OF_INT && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCftLanguage.g:739:4: ( ruleValidId )
            	    {
            	    // InternalCftLanguage.g:739:4: ( ruleValidId )
            	    // InternalCftLanguage.g:740:5: ruleValidId
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAndGateDefinitionRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getAndGateDefinitionAccess().getInputEventsEventDeclarationCrossReference_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    ruleValidId();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndGateDefinition"


    // $ANTLR start "entryRuleOrGateDefinition"
    // InternalCftLanguage.g:758:1: entryRuleOrGateDefinition returns [EObject current=null] : iv_ruleOrGateDefinition= ruleOrGateDefinition EOF ;
    public final EObject entryRuleOrGateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGateDefinition = null;


        try {
            // InternalCftLanguage.g:758:57: (iv_ruleOrGateDefinition= ruleOrGateDefinition EOF )
            // InternalCftLanguage.g:759:2: iv_ruleOrGateDefinition= ruleOrGateDefinition EOF
            {
             newCompositeNode(grammarAccess.getOrGateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrGateDefinition=ruleOrGateDefinition();

            state._fsp--;

             current =iv_ruleOrGateDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrGateDefinition"


    // $ANTLR start "ruleOrGateDefinition"
    // InternalCftLanguage.g:765:1: ruleOrGateDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'or' ( ( ruleValidId ) )* ) ;
    public final EObject ruleOrGateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:771:2: ( ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'or' ( ( ruleValidId ) )* ) )
            // InternalCftLanguage.g:772:2: ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'or' ( ( ruleValidId ) )* )
            {
            // InternalCftLanguage.g:772:2: ( ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'or' ( ( ruleValidId ) )* )
            // InternalCftLanguage.g:773:3: ( (lv_name_0_0= ruleValidId ) ) otherlv_1= 'or' ( ( ruleValidId ) )*
            {
            // InternalCftLanguage.g:773:3: ( (lv_name_0_0= ruleValidId ) )
            // InternalCftLanguage.g:774:4: (lv_name_0_0= ruleValidId )
            {
            // InternalCftLanguage.g:774:4: (lv_name_0_0= ruleValidId )
            // InternalCftLanguage.g:775:5: lv_name_0_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getOrGateDefinitionAccess().getNameValidIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_0_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrGateDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getOrGateDefinitionAccess().getOrKeyword_1());
            		
            // InternalCftLanguage.g:796:3: ( ( ruleValidId ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_OF_INT && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCftLanguage.g:797:4: ( ruleValidId )
            	    {
            	    // InternalCftLanguage.g:797:4: ( ruleValidId )
            	    // InternalCftLanguage.g:798:5: ruleValidId
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOrGateDefinitionRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getOrGateDefinitionAccess().getInputEventsEventDeclarationCrossReference_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    ruleValidId();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrGateDefinition"


    // $ANTLR start "entryRuleKOfMGateDefinition"
    // InternalCftLanguage.g:816:1: entryRuleKOfMGateDefinition returns [EObject current=null] : iv_ruleKOfMGateDefinition= ruleKOfMGateDefinition EOF ;
    public final EObject entryRuleKOfMGateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOfMGateDefinition = null;


        try {
            // InternalCftLanguage.g:816:59: (iv_ruleKOfMGateDefinition= ruleKOfMGateDefinition EOF )
            // InternalCftLanguage.g:817:2: iv_ruleKOfMGateDefinition= ruleKOfMGateDefinition EOF
            {
             newCompositeNode(grammarAccess.getKOfMGateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKOfMGateDefinition=ruleKOfMGateDefinition();

            state._fsp--;

             current =iv_ruleKOfMGateDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKOfMGateDefinition"


    // $ANTLR start "ruleKOfMGateDefinition"
    // InternalCftLanguage.g:823:1: ruleKOfMGateDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_k_1_0= RULE_INT ) ) ( (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) ) | ( (lv_m_4_0= RULE_OF_INT ) ) ) ( ( ruleValidId ) )* ) ;
    public final EObject ruleKOfMGateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_k_1_0=null;
        Token otherlv_2=null;
        Token lv_m_3_0=null;
        Token lv_m_4_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:829:2: ( ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_k_1_0= RULE_INT ) ) ( (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) ) | ( (lv_m_4_0= RULE_OF_INT ) ) ) ( ( ruleValidId ) )* ) )
            // InternalCftLanguage.g:830:2: ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_k_1_0= RULE_INT ) ) ( (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) ) | ( (lv_m_4_0= RULE_OF_INT ) ) ) ( ( ruleValidId ) )* )
            {
            // InternalCftLanguage.g:830:2: ( ( (lv_name_0_0= ruleValidId ) ) ( (lv_k_1_0= RULE_INT ) ) ( (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) ) | ( (lv_m_4_0= RULE_OF_INT ) ) ) ( ( ruleValidId ) )* )
            // InternalCftLanguage.g:831:3: ( (lv_name_0_0= ruleValidId ) ) ( (lv_k_1_0= RULE_INT ) ) ( (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) ) | ( (lv_m_4_0= RULE_OF_INT ) ) ) ( ( ruleValidId ) )*
            {
            // InternalCftLanguage.g:831:3: ( (lv_name_0_0= ruleValidId ) )
            // InternalCftLanguage.g:832:4: (lv_name_0_0= ruleValidId )
            {
            // InternalCftLanguage.g:832:4: (lv_name_0_0= ruleValidId )
            // InternalCftLanguage.g:833:5: lv_name_0_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getKOfMGateDefinitionAccess().getNameValidIdParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKOfMGateDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:850:3: ( (lv_k_1_0= RULE_INT ) )
            // InternalCftLanguage.g:851:4: (lv_k_1_0= RULE_INT )
            {
            // InternalCftLanguage.g:851:4: (lv_k_1_0= RULE_INT )
            // InternalCftLanguage.g:852:5: lv_k_1_0= RULE_INT
            {
            lv_k_1_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_k_1_0, grammarAccess.getKOfMGateDefinitionAccess().getKINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKOfMGateDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"k",
            						lv_k_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCftLanguage.g:868:3: ( (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) ) | ( (lv_m_4_0= RULE_OF_INT ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_OF_INT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCftLanguage.g:869:4: (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) )
                    {
                    // InternalCftLanguage.g:869:4: (otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) ) )
                    // InternalCftLanguage.g:870:5: otherlv_2= 'of' ( (lv_m_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_20); 

                    					newLeafNode(otherlv_2, grammarAccess.getKOfMGateDefinitionAccess().getOfKeyword_2_0_0());
                    				
                    // InternalCftLanguage.g:874:5: ( (lv_m_3_0= RULE_INT ) )
                    // InternalCftLanguage.g:875:6: (lv_m_3_0= RULE_INT )
                    {
                    // InternalCftLanguage.g:875:6: (lv_m_3_0= RULE_INT )
                    // InternalCftLanguage.g:876:7: lv_m_3_0= RULE_INT
                    {
                    lv_m_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    							newLeafNode(lv_m_3_0, grammarAccess.getKOfMGateDefinitionAccess().getMINTTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getKOfMGateDefinitionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"m",
                    								lv_m_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:894:4: ( (lv_m_4_0= RULE_OF_INT ) )
                    {
                    // InternalCftLanguage.g:894:4: ( (lv_m_4_0= RULE_OF_INT ) )
                    // InternalCftLanguage.g:895:5: (lv_m_4_0= RULE_OF_INT )
                    {
                    // InternalCftLanguage.g:895:5: (lv_m_4_0= RULE_OF_INT )
                    // InternalCftLanguage.g:896:6: lv_m_4_0= RULE_OF_INT
                    {
                    lv_m_4_0=(Token)match(input,RULE_OF_INT,FOLLOW_18); 

                    						newLeafNode(lv_m_4_0, grammarAccess.getKOfMGateDefinitionAccess().getMOF_INTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKOfMGateDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"m",
                    							lv_m_4_0,
                    							"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.OF_INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCftLanguage.g:913:3: ( ( ruleValidId ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_OF_INT && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCftLanguage.g:914:4: ( ruleValidId )
            	    {
            	    // InternalCftLanguage.g:914:4: ( ruleValidId )
            	    // InternalCftLanguage.g:915:5: ruleValidId
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getKOfMGateDefinitionRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getKOfMGateDefinitionAccess().getInputEventsEventDeclarationCrossReference_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    ruleValidId();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKOfMGateDefinition"


    // $ANTLR start "entryRuleTransformationDefinition"
    // InternalCftLanguage.g:933:1: entryRuleTransformationDefinition returns [EObject current=null] : iv_ruleTransformationDefinition= ruleTransformationDefinition EOF ;
    public final EObject entryRuleTransformationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinition = null;


        try {
            // InternalCftLanguage.g:933:65: (iv_ruleTransformationDefinition= ruleTransformationDefinition EOF )
            // InternalCftLanguage.g:934:2: iv_ruleTransformationDefinition= ruleTransformationDefinition EOF
            {
             newCompositeNode(grammarAccess.getTransformationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformationDefinition=ruleTransformationDefinition();

            state._fsp--;

             current =iv_ruleTransformationDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformationDefinition"


    // $ANTLR start "ruleTransformationDefinition"
    // InternalCftLanguage.g:940:1: ruleTransformationDefinition returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransformationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mappingDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:946:2: ( (otherlv_0= 'transformation' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' ) )
            // InternalCftLanguage.g:947:2: (otherlv_0= 'transformation' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' )
            {
            // InternalCftLanguage.g:947:2: (otherlv_0= 'transformation' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' )
            // InternalCftLanguage.g:948:3: otherlv_0= 'transformation' ( (lv_name_1_0= ruleValidId ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationDefinitionAccess().getTransformationKeyword_0());
            		
            // InternalCftLanguage.g:952:3: ( (lv_name_1_0= ruleValidId ) )
            // InternalCftLanguage.g:953:4: (lv_name_1_0= ruleValidId )
            {
            // InternalCftLanguage.g:953:4: (lv_name_1_0= ruleValidId )
            // InternalCftLanguage.g:954:5: lv_name_1_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getTransformationDefinitionAccess().getNameValidIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformationDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCftLanguage.g:975:3: ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCftLanguage.g:976:4: (lv_mappingDefinitions_3_0= ruleMappingDefinition )
            	    {
            	    // InternalCftLanguage.g:976:4: (lv_mappingDefinitions_3_0= ruleMappingDefinition )
            	    // InternalCftLanguage.g:977:5: lv_mappingDefinitions_3_0= ruleMappingDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTransformationDefinitionAccess().getMappingDefinitionsMappingDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_mappingDefinitions_3_0=ruleMappingDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransformationDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappingDefinitions",
            	    						lv_mappingDefinitions_3_0,
            	    						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.MappingDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTransformationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformationDefinition"


    // $ANTLR start "entryRuleMappingDefinition"
    // InternalCftLanguage.g:1002:1: entryRuleMappingDefinition returns [EObject current=null] : iv_ruleMappingDefinition= ruleMappingDefinition EOF ;
    public final EObject entryRuleMappingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingDefinition = null;


        try {
            // InternalCftLanguage.g:1002:58: (iv_ruleMappingDefinition= ruleMappingDefinition EOF )
            // InternalCftLanguage.g:1003:2: iv_ruleMappingDefinition= ruleMappingDefinition EOF
            {
             newCompositeNode(grammarAccess.getMappingDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingDefinition=ruleMappingDefinition();

            state._fsp--;

             current =iv_ruleMappingDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingDefinition"


    // $ANTLR start "ruleMappingDefinition"
    // InternalCftLanguage.g:1009:1: ruleMappingDefinition returns [EObject current=null] : ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? ) ;
    public final EObject ruleMappingDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_topLevel_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_componentInstance_8_0 = null;

        EObject lv_lookupDefinitions_10_0 = null;

        EObject lv_assignments_11_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1015:2: ( ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? ) )
            // InternalCftLanguage.g:1016:2: ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? )
            {
            // InternalCftLanguage.g:1016:2: ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? )
            // InternalCftLanguage.g:1017:3: ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )?
            {
            // InternalCftLanguage.g:1017:3: ( (lv_topLevel_0_0= 'toplevel' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCftLanguage.g:1018:4: (lv_topLevel_0_0= 'toplevel' )
                    {
                    // InternalCftLanguage.g:1018:4: (lv_topLevel_0_0= 'toplevel' )
                    // InternalCftLanguage.g:1019:5: lv_topLevel_0_0= 'toplevel'
                    {
                    lv_topLevel_0_0=(Token)match(input,29,FOLLOW_23); 

                    					newLeafNode(lv_topLevel_0_0, grammarAccess.getMappingDefinitionAccess().getTopLevelToplevelKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMappingDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "topLevel", true, "toplevel");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingDefinitionAccess().getMappingKeyword_1());
            		
            // InternalCftLanguage.g:1035:3: ( ( ruleQualifiedName ) )
            // InternalCftLanguage.g:1036:4: ( ruleQualifiedName )
            {
            // InternalCftLanguage.g:1036:4: ( ruleQualifiedName )
            // InternalCftLanguage.g:1037:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingDefinitionAccess().getPatternPatternCrossReference_2_0());
            				
            pushFollow(FOLLOW_24);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMappingDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCftLanguage.g:1055:3: ( (lv_parameters_4_0= ruleMappingParameter ) )
            // InternalCftLanguage.g:1056:4: (lv_parameters_4_0= ruleMappingParameter )
            {
            // InternalCftLanguage.g:1056:4: (lv_parameters_4_0= ruleMappingParameter )
            // InternalCftLanguage.g:1057:5: lv_parameters_4_0= ruleMappingParameter
            {

            					newCompositeNode(grammarAccess.getMappingDefinitionAccess().getParametersMappingParameterParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_parameters_4_0=ruleMappingParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingDefinitionRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_4_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.MappingParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:1074:3: (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCftLanguage.g:1075:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,32,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMappingDefinitionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCftLanguage.g:1079:4: ( (lv_parameters_6_0= ruleMappingParameter ) )
            	    // InternalCftLanguage.g:1080:5: (lv_parameters_6_0= ruleMappingParameter )
            	    {
            	    // InternalCftLanguage.g:1080:5: (lv_parameters_6_0= ruleMappingParameter )
            	    // InternalCftLanguage.g:1081:6: lv_parameters_6_0= ruleMappingParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMappingDefinitionAccess().getParametersMappingParameterParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_parameters_6_0=ruleMappingParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMappingDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.MappingParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getMappingDefinitionAccess().getRightParenthesisKeyword_6());
            		
            // InternalCftLanguage.g:1103:3: ( (lv_componentInstance_8_0= ruleComponentInstance ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCftLanguage.g:1104:4: (lv_componentInstance_8_0= ruleComponentInstance )
                    {
                    // InternalCftLanguage.g:1104:4: (lv_componentInstance_8_0= ruleComponentInstance )
                    // InternalCftLanguage.g:1105:5: lv_componentInstance_8_0= ruleComponentInstance
                    {

                    					newCompositeNode(grammarAccess.getMappingDefinitionAccess().getComponentInstanceComponentInstanceParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_componentInstance_8_0=ruleComponentInstance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMappingDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"componentInstance",
                    						lv_componentInstance_8_0,
                    						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ComponentInstance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCftLanguage.g:1122:3: (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCftLanguage.g:1123:4: otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappingDefinitionAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalCftLanguage.g:1127:4: ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=RULE_OF_INT && LA22_0<=RULE_ID)||LA22_0==34) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCftLanguage.g:1128:5: ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';'
                    	    {
                    	    // InternalCftLanguage.g:1128:5: ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) )
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==34) ) {
                    	        alt21=1;
                    	    }
                    	    else if ( ((LA21_0>=RULE_OF_INT && LA21_0<=RULE_ID)) ) {
                    	        alt21=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 21, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // InternalCftLanguage.g:1129:6: ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) )
                    	            {
                    	            // InternalCftLanguage.g:1129:6: ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) )
                    	            // InternalCftLanguage.g:1130:7: (lv_lookupDefinitions_10_0= ruleLookupDefinition )
                    	            {
                    	            // InternalCftLanguage.g:1130:7: (lv_lookupDefinitions_10_0= ruleLookupDefinition )
                    	            // InternalCftLanguage.g:1131:8: lv_lookupDefinitions_10_0= ruleLookupDefinition
                    	            {

                    	            								newCompositeNode(grammarAccess.getMappingDefinitionAccess().getLookupDefinitionsLookupDefinitionParserRuleCall_8_1_0_0_0());
                    	            							
                    	            pushFollow(FOLLOW_11);
                    	            lv_lookupDefinitions_10_0=ruleLookupDefinition();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMappingDefinitionRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"lookupDefinitions",
                    	            									lv_lookupDefinitions_10_0,
                    	            									"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.LookupDefinition");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalCftLanguage.g:1149:6: ( (lv_assignments_11_0= ruleAssignment ) )
                    	            {
                    	            // InternalCftLanguage.g:1149:6: ( (lv_assignments_11_0= ruleAssignment ) )
                    	            // InternalCftLanguage.g:1150:7: (lv_assignments_11_0= ruleAssignment )
                    	            {
                    	            // InternalCftLanguage.g:1150:7: (lv_assignments_11_0= ruleAssignment )
                    	            // InternalCftLanguage.g:1151:8: lv_assignments_11_0= ruleAssignment
                    	            {

                    	            								newCompositeNode(grammarAccess.getMappingDefinitionAccess().getAssignmentsAssignmentParserRuleCall_8_1_0_1_0());
                    	            							
                    	            pushFollow(FOLLOW_11);
                    	            lv_assignments_11_0=ruleAssignment();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getMappingDefinitionRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"assignments",
                    	            									lv_assignments_11_0,
                    	            									"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.Assignment");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_12=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getMappingDefinitionAccess().getSemicolonKeyword_8_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getMappingDefinitionAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingDefinition"


    // $ANTLR start "entryRuleMappingParameter"
    // InternalCftLanguage.g:1183:1: entryRuleMappingParameter returns [EObject current=null] : iv_ruleMappingParameter= ruleMappingParameter EOF ;
    public final EObject entryRuleMappingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingParameter = null;


        try {
            // InternalCftLanguage.g:1183:57: (iv_ruleMappingParameter= ruleMappingParameter EOF )
            // InternalCftLanguage.g:1184:2: iv_ruleMappingParameter= ruleMappingParameter EOF
            {
             newCompositeNode(grammarAccess.getMappingParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingParameter=ruleMappingParameter();

            state._fsp--;

             current =iv_ruleMappingParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingParameter"


    // $ANTLR start "ruleMappingParameter"
    // InternalCftLanguage.g:1190:1: ruleMappingParameter returns [EObject current=null] : ( (lv_name_0_0= ruleValidId ) ) ;
    public final EObject ruleMappingParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1196:2: ( ( (lv_name_0_0= ruleValidId ) ) )
            // InternalCftLanguage.g:1197:2: ( (lv_name_0_0= ruleValidId ) )
            {
            // InternalCftLanguage.g:1197:2: ( (lv_name_0_0= ruleValidId ) )
            // InternalCftLanguage.g:1198:3: (lv_name_0_0= ruleValidId )
            {
            // InternalCftLanguage.g:1198:3: (lv_name_0_0= ruleValidId )
            // InternalCftLanguage.g:1199:4: lv_name_0_0= ruleValidId
            {

            				newCompositeNode(grammarAccess.getMappingParameterAccess().getNameValidIdParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleValidId();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMappingParameterRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingParameter"


    // $ANTLR start "entryRuleLookupDefinition"
    // InternalCftLanguage.g:1219:1: entryRuleLookupDefinition returns [EObject current=null] : iv_ruleLookupDefinition= ruleLookupDefinition EOF ;
    public final EObject entryRuleLookupDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupDefinition = null;


        try {
            // InternalCftLanguage.g:1219:57: (iv_ruleLookupDefinition= ruleLookupDefinition EOF )
            // InternalCftLanguage.g:1220:2: iv_ruleLookupDefinition= ruleLookupDefinition EOF
            {
             newCompositeNode(grammarAccess.getLookupDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLookupDefinition=ruleLookupDefinition();

            state._fsp--;

             current =iv_ruleLookupDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLookupDefinition"


    // $ANTLR start "ruleLookupDefinition"
    // InternalCftLanguage.g:1226:1: ruleLookupDefinition returns [EObject current=null] : (otherlv_0= 'lookup' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleValidId ) ) (otherlv_4= ',' ( ( ruleValidId ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= ruleValidId ) ) ) ;
    public final EObject ruleLookupDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_8_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1232:2: ( (otherlv_0= 'lookup' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleValidId ) ) (otherlv_4= ',' ( ( ruleValidId ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= ruleValidId ) ) ) )
            // InternalCftLanguage.g:1233:2: (otherlv_0= 'lookup' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleValidId ) ) (otherlv_4= ',' ( ( ruleValidId ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= ruleValidId ) ) )
            {
            // InternalCftLanguage.g:1233:2: (otherlv_0= 'lookup' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleValidId ) ) (otherlv_4= ',' ( ( ruleValidId ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= ruleValidId ) ) )
            // InternalCftLanguage.g:1234:3: otherlv_0= 'lookup' ( ( ruleQualifiedName ) ) otherlv_2= '(' ( ( ruleValidId ) ) (otherlv_4= ',' ( ( ruleValidId ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= ruleValidId ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLookupDefinitionAccess().getLookupKeyword_0());
            		
            // InternalCftLanguage.g:1238:3: ( ( ruleQualifiedName ) )
            // InternalCftLanguage.g:1239:4: ( ruleQualifiedName )
            {
            // InternalCftLanguage.g:1239:4: ( ruleQualifiedName )
            // InternalCftLanguage.g:1240:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLookupDefinitionAccess().getMappingMappingDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_24);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLookupDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCftLanguage.g:1258:3: ( ( ruleValidId ) )
            // InternalCftLanguage.g:1259:4: ( ruleValidId )
            {
            // InternalCftLanguage.g:1259:4: ( ruleValidId )
            // InternalCftLanguage.g:1260:5: ruleValidId
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLookupDefinitionAccess().getArgumentsMappingParameterCrossReference_3_0());
            				
            pushFollow(FOLLOW_25);
            ruleValidId();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:1274:3: (otherlv_4= ',' ( ( ruleValidId ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCftLanguage.g:1275:4: otherlv_4= ',' ( ( ruleValidId ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLookupDefinitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCftLanguage.g:1279:4: ( ( ruleValidId ) )
            	    // InternalCftLanguage.g:1280:5: ( ruleValidId )
            	    {
            	    // InternalCftLanguage.g:1280:5: ( ruleValidId )
            	    // InternalCftLanguage.g:1281:6: ruleValidId
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLookupDefinitionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLookupDefinitionAccess().getArgumentsMappingParameterCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleValidId();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getLookupDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getLookupDefinitionAccess().getAsKeyword_6());
            		
            // InternalCftLanguage.g:1304:3: ( (lv_name_8_0= ruleValidId ) )
            // InternalCftLanguage.g:1305:4: (lv_name_8_0= ruleValidId )
            {
            // InternalCftLanguage.g:1305:4: (lv_name_8_0= ruleValidId )
            // InternalCftLanguage.g:1306:5: lv_name_8_0= ruleValidId
            {

            					newCompositeNode(grammarAccess.getLookupDefinitionAccess().getNameValidIdParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_8_0=ruleValidId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLookupDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_8_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLookupDefinition"


    // $ANTLR start "entryRuleAssignment"
    // InternalCftLanguage.g:1327:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalCftLanguage.g:1327:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalCftLanguage.g:1328:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalCftLanguage.g:1334:1: ruleAssignment returns [EObject current=null] : ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_multiple_1_0=null;
        Token otherlv_2=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_3_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1340:2: ( ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) ) )
            // InternalCftLanguage.g:1341:2: ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) )
            {
            // InternalCftLanguage.g:1341:2: ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) )
            // InternalCftLanguage.g:1342:3: ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) )
            {
            // InternalCftLanguage.g:1342:3: ( (lv_input_0_0= ruleEventReference ) )
            // InternalCftLanguage.g:1343:4: (lv_input_0_0= ruleEventReference )
            {
            // InternalCftLanguage.g:1343:4: (lv_input_0_0= ruleEventReference )
            // InternalCftLanguage.g:1344:5: lv_input_0_0= ruleEventReference
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getInputEventReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_input_0_0=ruleEventReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.EventReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:1361:3: ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCftLanguage.g:1362:4: ( (lv_multiple_1_0= '+=' ) )
                    {
                    // InternalCftLanguage.g:1362:4: ( (lv_multiple_1_0= '+=' ) )
                    // InternalCftLanguage.g:1363:5: (lv_multiple_1_0= '+=' )
                    {
                    // InternalCftLanguage.g:1363:5: (lv_multiple_1_0= '+=' )
                    // InternalCftLanguage.g:1364:6: lv_multiple_1_0= '+='
                    {
                    lv_multiple_1_0=(Token)match(input,36,FOLLOW_31); 

                    						newLeafNode(lv_multiple_1_0, grammarAccess.getAssignmentAccess().getMultiplePlusSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    						setWithLastConsumed(current, "multiple", true, "+=");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:1377:4: otherlv_2= ':='
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCftLanguage.g:1382:3: ( (lv_output_3_0= ruleEventReference ) )
            // InternalCftLanguage.g:1383:4: (lv_output_3_0= ruleEventReference )
            {
            // InternalCftLanguage.g:1383:4: (lv_output_3_0= ruleEventReference )
            // InternalCftLanguage.g:1384:5: lv_output_3_0= ruleEventReference
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getOutputEventReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_output_3_0=ruleEventReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_3_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.EventReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleEventReference"
    // InternalCftLanguage.g:1405:1: entryRuleEventReference returns [EObject current=null] : iv_ruleEventReference= ruleEventReference EOF ;
    public final EObject entryRuleEventReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventReference = null;


        try {
            // InternalCftLanguage.g:1405:55: (iv_ruleEventReference= ruleEventReference EOF )
            // InternalCftLanguage.g:1406:2: iv_ruleEventReference= ruleEventReference EOF
            {
             newCompositeNode(grammarAccess.getEventReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventReference=ruleEventReference();

            state._fsp--;

             current =iv_ruleEventReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventReference"


    // $ANTLR start "ruleEventReference"
    // InternalCftLanguage.g:1412:1: ruleEventReference returns [EObject current=null] : ( ( ( ruleValidId ) ) otherlv_1= '.' ( ( ruleValidId ) ) ) ;
    public final EObject ruleEventReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:1418:2: ( ( ( ( ruleValidId ) ) otherlv_1= '.' ( ( ruleValidId ) ) ) )
            // InternalCftLanguage.g:1419:2: ( ( ( ruleValidId ) ) otherlv_1= '.' ( ( ruleValidId ) ) )
            {
            // InternalCftLanguage.g:1419:2: ( ( ( ruleValidId ) ) otherlv_1= '.' ( ( ruleValidId ) ) )
            // InternalCftLanguage.g:1420:3: ( ( ruleValidId ) ) otherlv_1= '.' ( ( ruleValidId ) )
            {
            // InternalCftLanguage.g:1420:3: ( ( ruleValidId ) )
            // InternalCftLanguage.g:1421:4: ( ruleValidId )
            {
            // InternalCftLanguage.g:1421:4: ( ruleValidId )
            // InternalCftLanguage.g:1422:5: ruleValidId
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventReferenceAccess().getComponentVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_32);
            ruleValidId();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventReferenceAccess().getFullStopKeyword_1());
            		
            // InternalCftLanguage.g:1440:3: ( ( ruleValidId ) )
            // InternalCftLanguage.g:1441:4: ( ruleValidId )
            {
            // InternalCftLanguage.g:1441:4: ( ruleValidId )
            // InternalCftLanguage.g:1442:5: ruleValidId
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventReferenceAccess().getEventEventDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleValidId();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventReference"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalCftLanguage.g:1460:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalCftLanguage.g:1460:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalCftLanguage.g:1461:2: iv_ruleComponentInstance= ruleComponentInstance EOF
            {
             newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;

             current =iv_ruleComponentInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalCftLanguage.g:1467:1: ruleComponentInstance returns [EObject current=null] : (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleValidId ) )? ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1473:2: ( (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleValidId ) )? ) )
            // InternalCftLanguage.g:1474:2: (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleValidId ) )? )
            {
            // InternalCftLanguage.g:1474:2: (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleValidId ) )? )
            // InternalCftLanguage.g:1475:3: otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleValidId ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getEqualsSignGreaterThanSignKeyword_0());
            		
            // InternalCftLanguage.g:1479:3: ( ( ruleQualifiedName ) )
            // InternalCftLanguage.g:1480:4: ( ruleQualifiedName )
            {
            // InternalCftLanguage.g:1480:4: ( ruleQualifiedName )
            // InternalCftLanguage.g:1481:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentInstanceAccess().getComponentTypeComponentDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCftLanguage.g:1495:3: ( (lv_name_2_0= ruleValidId ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_OF_INT && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCftLanguage.g:1496:4: (lv_name_2_0= ruleValidId )
                    {
                    // InternalCftLanguage.g:1496:4: (lv_name_2_0= ruleValidId )
                    // InternalCftLanguage.g:1497:5: lv_name_2_0= ruleValidId
                    {

                    					newCompositeNode(grammarAccess.getComponentInstanceAccess().getNameValidIdParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleValidId();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.ValidId");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCftLanguage.g:1518:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCftLanguage.g:1518:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCftLanguage.g:1519:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCftLanguage.g:1525:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidId_0= ruleValidId (kw= '.' this_ValidId_2= ruleValidId )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidId_0 = null;

        AntlrDatatypeRuleToken this_ValidId_2 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1531:2: ( (this_ValidId_0= ruleValidId (kw= '.' this_ValidId_2= ruleValidId )* ) )
            // InternalCftLanguage.g:1532:2: (this_ValidId_0= ruleValidId (kw= '.' this_ValidId_2= ruleValidId )* )
            {
            // InternalCftLanguage.g:1532:2: (this_ValidId_0= ruleValidId (kw= '.' this_ValidId_2= ruleValidId )* )
            // InternalCftLanguage.g:1533:3: this_ValidId_0= ruleValidId (kw= '.' this_ValidId_2= ruleValidId )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIdParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_ValidId_0=ruleValidId();

            state._fsp--;


            			current.merge(this_ValidId_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCftLanguage.g:1543:3: (kw= '.' this_ValidId_2= ruleValidId )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    int LA27_2 = input.LA(2);

                    if ( ((LA27_2>=RULE_OF_INT && LA27_2<=RULE_ID)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalCftLanguage.g:1544:4: kw= '.' this_ValidId_2= ruleValidId
            	    {
            	    kw=(Token)match(input,38,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIdParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_33);
            	    this_ValidId_2=ruleValidId();

            	    state._fsp--;


            	    				current.merge(this_ValidId_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalCftLanguage.g:1564:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalCftLanguage.g:1564:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalCftLanguage.g:1565:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalCftLanguage.g:1571:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1577:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalCftLanguage.g:1578:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalCftLanguage.g:1578:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalCftLanguage.g:1579:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCftLanguage.g:1589:3: (kw= '.' kw= '*' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCftLanguage.g:1590:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidId"
    // InternalCftLanguage.g:1605:1: entryRuleValidId returns [String current=null] : iv_ruleValidId= ruleValidId EOF ;
    public final String entryRuleValidId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidId = null;


        try {
            // InternalCftLanguage.g:1605:47: (iv_ruleValidId= ruleValidId EOF )
            // InternalCftLanguage.g:1606:2: iv_ruleValidId= ruleValidId EOF
            {
             newCompositeNode(grammarAccess.getValidIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidId=ruleValidId();

            state._fsp--;

             current =iv_ruleValidId.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidId"


    // $ANTLR start "ruleValidId"
    // InternalCftLanguage.g:1612:1: ruleValidId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_OF_INT_1= RULE_OF_INT ) ;
    public final AntlrDatatypeRuleToken ruleValidId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_OF_INT_1=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:1618:2: ( (this_ID_0= RULE_ID | this_OF_INT_1= RULE_OF_INT ) )
            // InternalCftLanguage.g:1619:2: (this_ID_0= RULE_ID | this_OF_INT_1= RULE_OF_INT )
            {
            // InternalCftLanguage.g:1619:2: (this_ID_0= RULE_ID | this_OF_INT_1= RULE_OF_INT )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_OF_INT) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCftLanguage.g:1620:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValidIdAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:1628:3: this_OF_INT_1= RULE_OF_INT
                    {
                    this_OF_INT_1=(Token)match(input,RULE_OF_INT,FOLLOW_2); 

                    			current.merge(this_OF_INT_1);
                    		

                    			newLeafNode(this_OF_INT_1, grammarAccess.getValidIdAccess().getOF_INTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidId"


    // $ANTLR start "entryRuleDouble"
    // InternalCftLanguage.g:1639:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalCftLanguage.g:1639:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalCftLanguage.g:1640:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalCftLanguage.g:1646:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_T_DOUBLE_1= RULE_T_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_T_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:1652:2: ( (this_INT_0= RULE_INT | this_T_DOUBLE_1= RULE_T_DOUBLE ) )
            // InternalCftLanguage.g:1653:2: (this_INT_0= RULE_INT | this_T_DOUBLE_1= RULE_T_DOUBLE )
            {
            // InternalCftLanguage.g:1653:2: (this_INT_0= RULE_INT | this_T_DOUBLE_1= RULE_T_DOUBLE )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_T_DOUBLE) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCftLanguage.g:1654:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:1662:3: this_T_DOUBLE_1= RULE_T_DOUBLE
                    {
                    this_T_DOUBLE_1=(Token)match(input,RULE_T_DOUBLE,FOLLOW_2); 

                    			current.merge(this_T_DOUBLE_1);
                    		

                    			newLeafNode(this_T_DOUBLE_1, grammarAccess.getDoubleAccess().getT_DOUBLETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001001C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010018002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C0060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000020002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400100060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000060L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});

}
