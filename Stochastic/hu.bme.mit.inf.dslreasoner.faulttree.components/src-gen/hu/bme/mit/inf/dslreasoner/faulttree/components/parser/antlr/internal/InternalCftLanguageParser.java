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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOULBE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'cft'", "'{'", "'in'", "'out'", "'}'", "'[]'", "'lambda'", "'='", "'and'", "'or'", "'transformation'", "'toplevel'", "'mapping'", "'('", "','", "')'", "'lookup'", "'as'", "'+='", "':='", "'.'", "'=>'", "'*'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_DOULBE=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

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

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCftLanguage.g:103:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCftModelAccess().getSemicolonKeyword_2());
                    			

                    }
                    break;

            }

            // InternalCftLanguage.g:108:3: ( (lv_imports_3_0= ruleImportDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
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

                if ( (LA3_0==15) ) {
                    alt3=1;
                }
                else if ( (LA3_0==25) ) {
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
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

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

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCftLanguage.g:211:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCftLanguage.g:227:1: ruleComponentDefinition returns [EObject current=null] : (otherlv_0= 'cft' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' ) ;
    public final EObject ruleComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_inputEvents_5_0 = null;

        EObject lv_eventDefinitions_10_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:233:2: ( (otherlv_0= 'cft' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' ) )
            // InternalCftLanguage.g:234:2: (otherlv_0= 'cft' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' )
            {
            // InternalCftLanguage.g:234:2: (otherlv_0= 'cft' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}' )
            // InternalCftLanguage.g:235:3: otherlv_0= 'cft' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) ) ) ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDefinitionAccess().getCftKeyword_0());
            		
            // InternalCftLanguage.g:239:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCftLanguage.g:240:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCftLanguage.g:240:4: (lv_name_1_0= RULE_ID )
            // InternalCftLanguage.g:241:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCftLanguage.g:261:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) ) )
            // InternalCftLanguage.g:262:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) )
            {
            // InternalCftLanguage.g:262:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* ) )
            // InternalCftLanguage.g:263:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3());
            				
            // InternalCftLanguage.g:266:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )* )
            // InternalCftLanguage.g:267:6: ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )*
            {
            // InternalCftLanguage.g:267:6: ( ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCftLanguage.g:268:4: ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalCftLanguage.g:268:4: ({...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) ) )
            	    // InternalCftLanguage.g:269:5: {...}? => ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalCftLanguage.g:269:116: ( ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) ) )
            	    // InternalCftLanguage.g:270:6: ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalCftLanguage.g:273:9: ({...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' ) )
            	    // InternalCftLanguage.g:273:10: {...}? => (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "true");
            	    }
            	    // InternalCftLanguage.g:273:19: (otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';' )
            	    // InternalCftLanguage.g:273:20: otherlv_4= 'in' ( (lv_inputEvents_5_0= ruleInputEvent ) )* otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentDefinitionAccess().getInKeyword_3_0_0());
            	    								
            	    // InternalCftLanguage.g:277:9: ( (lv_inputEvents_5_0= ruleInputEvent ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalCftLanguage.g:278:10: (lv_inputEvents_5_0= ruleInputEvent )
            	    	    {
            	    	    // InternalCftLanguage.g:278:10: (lv_inputEvents_5_0= ruleInputEvent )
            	    	    // InternalCftLanguage.g:279:11: lv_inputEvents_5_0= ruleInputEvent
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

            	    otherlv_6=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getComponentDefinitionAccess().getSemicolonKeyword_3_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCftLanguage.g:306:4: ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalCftLanguage.g:306:4: ({...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) ) )
            	    // InternalCftLanguage.g:307:5: {...}? => ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalCftLanguage.g:307:116: ( ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) ) )
            	    // InternalCftLanguage.g:308:6: ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDefinitionAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalCftLanguage.g:311:9: ({...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' ) )
            	    // InternalCftLanguage.g:311:10: {...}? => (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinition", "true");
            	    }
            	    // InternalCftLanguage.g:311:19: (otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';' )
            	    // InternalCftLanguage.g:311:20: otherlv_7= 'out' ( (otherlv_8= RULE_ID ) )* otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_10); 

            	    									newLeafNode(otherlv_7, grammarAccess.getComponentDefinitionAccess().getOutKeyword_3_1_0());
            	    								
            	    // InternalCftLanguage.g:315:9: ( (otherlv_8= RULE_ID ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ID) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalCftLanguage.g:316:10: (otherlv_8= RULE_ID )
            	    	    {
            	    	    // InternalCftLanguage.g:316:10: (otherlv_8= RULE_ID )
            	    	    // InternalCftLanguage.g:317:11: otherlv_8= RULE_ID
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getComponentDefinitionRule());
            	    	    											}
            	    	    										
            	    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    	    											newLeafNode(otherlv_8, grammarAccess.getComponentDefinitionAccess().getOutputEventsEventDeclarationCrossReference_3_1_1_0());
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,13,FOLLOW_9); 

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

            // InternalCftLanguage.g:345:3: ( ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCftLanguage.g:346:4: ( (lv_eventDefinitions_10_0= ruleEventDefinition ) ) otherlv_11= ';'
            	    {
            	    // InternalCftLanguage.g:346:4: ( (lv_eventDefinitions_10_0= ruleEventDefinition ) )
            	    // InternalCftLanguage.g:347:5: (lv_eventDefinitions_10_0= ruleEventDefinition )
            	    {
            	    // InternalCftLanguage.g:347:5: (lv_eventDefinitions_10_0= ruleEventDefinition )
            	    // InternalCftLanguage.g:348:6: lv_eventDefinitions_10_0= ruleEventDefinition
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

            	    otherlv_11=(Token)match(input,13,FOLLOW_12); 

            	    				newLeafNode(otherlv_11, grammarAccess.getComponentDefinitionAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalCftLanguage.g:378:1: entryRuleInputEvent returns [EObject current=null] : iv_ruleInputEvent= ruleInputEvent EOF ;
    public final EObject entryRuleInputEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputEvent = null;


        try {
            // InternalCftLanguage.g:378:51: (iv_ruleInputEvent= ruleInputEvent EOF )
            // InternalCftLanguage.g:379:2: iv_ruleInputEvent= ruleInputEvent EOF
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
    // InternalCftLanguage.g:385:1: ruleInputEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '[]' ) )? ) ;
    public final EObject ruleInputEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_multiple_1_0=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:391:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '[]' ) )? ) )
            // InternalCftLanguage.g:392:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '[]' ) )? )
            {
            // InternalCftLanguage.g:392:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '[]' ) )? )
            // InternalCftLanguage.g:393:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '[]' ) )?
            {
            // InternalCftLanguage.g:393:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCftLanguage.g:394:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCftLanguage.g:394:4: (lv_name_0_0= RULE_ID )
            // InternalCftLanguage.g:395:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInputEventAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCftLanguage.g:411:3: ( (lv_multiple_1_0= '[]' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCftLanguage.g:412:4: (lv_multiple_1_0= '[]' )
                    {
                    // InternalCftLanguage.g:412:4: (lv_multiple_1_0= '[]' )
                    // InternalCftLanguage.g:413:5: lv_multiple_1_0= '[]'
                    {
                    lv_multiple_1_0=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCftLanguage.g:429:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // InternalCftLanguage.g:429:56: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // InternalCftLanguage.g:430:2: iv_ruleEventDefinition= ruleEventDefinition EOF
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
    // InternalCftLanguage.g:436:1: ruleEventDefinition returns [EObject current=null] : (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_BasicEventDefinition_0 = null;

        EObject this_GateDefinition_1 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:442:2: ( (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition ) )
            // InternalCftLanguage.g:443:2: (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition )
            {
            // InternalCftLanguage.g:443:2: (this_BasicEventDefinition_0= ruleBasicEventDefinition | this_GateDefinition_1= ruleGateDefinition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=23 && LA10_1<=24)) ) {
                    alt10=2;
                }
                else if ( (LA10_1==21) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

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
                    // InternalCftLanguage.g:444:3: this_BasicEventDefinition_0= ruleBasicEventDefinition
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
                    // InternalCftLanguage.g:453:3: this_GateDefinition_1= ruleGateDefinition
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
    // InternalCftLanguage.g:465:1: entryRuleBasicEventDefinition returns [EObject current=null] : iv_ruleBasicEventDefinition= ruleBasicEventDefinition EOF ;
    public final EObject entryRuleBasicEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicEventDefinition = null;


        try {
            // InternalCftLanguage.g:465:61: (iv_ruleBasicEventDefinition= ruleBasicEventDefinition EOF )
            // InternalCftLanguage.g:466:2: iv_ruleBasicEventDefinition= ruleBasicEventDefinition EOF
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
    // InternalCftLanguage.g:472:1: ruleBasicEventDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'lambda' otherlv_2= '=' ( (lv_rate_3_0= RULE_DOULBE ) ) ) ;
    public final EObject ruleBasicEventDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_rate_3_0=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:478:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'lambda' otherlv_2= '=' ( (lv_rate_3_0= RULE_DOULBE ) ) ) )
            // InternalCftLanguage.g:479:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'lambda' otherlv_2= '=' ( (lv_rate_3_0= RULE_DOULBE ) ) )
            {
            // InternalCftLanguage.g:479:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'lambda' otherlv_2= '=' ( (lv_rate_3_0= RULE_DOULBE ) ) )
            // InternalCftLanguage.g:480:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'lambda' otherlv_2= '=' ( (lv_rate_3_0= RULE_DOULBE ) )
            {
            // InternalCftLanguage.g:480:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCftLanguage.g:481:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCftLanguage.g:481:4: (lv_name_0_0= RULE_ID )
            // InternalCftLanguage.g:482:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBasicEventDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicEventDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicEventDefinitionAccess().getLambdaKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getBasicEventDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalCftLanguage.g:506:3: ( (lv_rate_3_0= RULE_DOULBE ) )
            // InternalCftLanguage.g:507:4: (lv_rate_3_0= RULE_DOULBE )
            {
            // InternalCftLanguage.g:507:4: (lv_rate_3_0= RULE_DOULBE )
            // InternalCftLanguage.g:508:5: lv_rate_3_0= RULE_DOULBE
            {
            lv_rate_3_0=(Token)match(input,RULE_DOULBE,FOLLOW_2); 

            					newLeafNode(lv_rate_3_0, grammarAccess.getBasicEventDefinitionAccess().getRateDOULBETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicEventDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rate",
            						lv_rate_3_0,
            						"hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguage.DOULBE");
            				

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


    // $ANTLR start "entryRuleGateDefinition"
    // InternalCftLanguage.g:528:1: entryRuleGateDefinition returns [EObject current=null] : iv_ruleGateDefinition= ruleGateDefinition EOF ;
    public final EObject entryRuleGateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateDefinition = null;


        try {
            // InternalCftLanguage.g:528:55: (iv_ruleGateDefinition= ruleGateDefinition EOF )
            // InternalCftLanguage.g:529:2: iv_ruleGateDefinition= ruleGateDefinition EOF
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
    // InternalCftLanguage.g:535:1: ruleGateDefinition returns [EObject current=null] : (this_AndGate_0= ruleAndGate | this_OrGate_1= ruleOrGate ) ;
    public final EObject ruleGateDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_AndGate_0 = null;

        EObject this_OrGate_1 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:541:2: ( (this_AndGate_0= ruleAndGate | this_OrGate_1= ruleOrGate ) )
            // InternalCftLanguage.g:542:2: (this_AndGate_0= ruleAndGate | this_OrGate_1= ruleOrGate )
            {
            // InternalCftLanguage.g:542:2: (this_AndGate_0= ruleAndGate | this_OrGate_1= ruleOrGate )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==24) ) {
                    alt11=2;
                }
                else if ( (LA11_1==23) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCftLanguage.g:543:3: this_AndGate_0= ruleAndGate
                    {

                    			newCompositeNode(grammarAccess.getGateDefinitionAccess().getAndGateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndGate_0=ruleAndGate();

                    state._fsp--;


                    			current = this_AndGate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:552:3: this_OrGate_1= ruleOrGate
                    {

                    			newCompositeNode(grammarAccess.getGateDefinitionAccess().getOrGateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrGate_1=ruleOrGate();

                    state._fsp--;


                    			current = this_OrGate_1;
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


    // $ANTLR start "entryRuleAndGate"
    // InternalCftLanguage.g:564:1: entryRuleAndGate returns [EObject current=null] : iv_ruleAndGate= ruleAndGate EOF ;
    public final EObject entryRuleAndGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndGate = null;


        try {
            // InternalCftLanguage.g:564:48: (iv_ruleAndGate= ruleAndGate EOF )
            // InternalCftLanguage.g:565:2: iv_ruleAndGate= ruleAndGate EOF
            {
             newCompositeNode(grammarAccess.getAndGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndGate=ruleAndGate();

            state._fsp--;

             current =iv_ruleAndGate; 
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
    // $ANTLR end "entryRuleAndGate"


    // $ANTLR start "ruleAndGate"
    // InternalCftLanguage.g:571:1: ruleAndGate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) )* ) ;
    public final EObject ruleAndGate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:577:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) )* ) )
            // InternalCftLanguage.g:578:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) )* )
            {
            // InternalCftLanguage.g:578:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) )* )
            // InternalCftLanguage.g:579:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'and' ( (otherlv_2= RULE_ID ) )*
            {
            // InternalCftLanguage.g:579:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCftLanguage.g:580:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCftLanguage.g:580:4: (lv_name_0_0= RULE_ID )
            // InternalCftLanguage.g:581:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAndGateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndGateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAndGateAccess().getAndKeyword_1());
            		
            // InternalCftLanguage.g:601:3: ( (otherlv_2= RULE_ID ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCftLanguage.g:602:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalCftLanguage.g:602:4: (otherlv_2= RULE_ID )
            	    // InternalCftLanguage.g:603:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAndGateRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    					newLeafNode(otherlv_2, grammarAccess.getAndGateAccess().getInputEventsEventDeclarationCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleAndGate"


    // $ANTLR start "entryRuleOrGate"
    // InternalCftLanguage.g:618:1: entryRuleOrGate returns [EObject current=null] : iv_ruleOrGate= ruleOrGate EOF ;
    public final EObject entryRuleOrGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGate = null;


        try {
            // InternalCftLanguage.g:618:47: (iv_ruleOrGate= ruleOrGate EOF )
            // InternalCftLanguage.g:619:2: iv_ruleOrGate= ruleOrGate EOF
            {
             newCompositeNode(grammarAccess.getOrGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrGate=ruleOrGate();

            state._fsp--;

             current =iv_ruleOrGate; 
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
    // $ANTLR end "entryRuleOrGate"


    // $ANTLR start "ruleOrGate"
    // InternalCftLanguage.g:625:1: ruleOrGate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'or' ( (otherlv_2= RULE_ID ) )* ) ;
    public final EObject ruleOrGate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:631:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'or' ( (otherlv_2= RULE_ID ) )* ) )
            // InternalCftLanguage.g:632:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'or' ( (otherlv_2= RULE_ID ) )* )
            {
            // InternalCftLanguage.g:632:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'or' ( (otherlv_2= RULE_ID ) )* )
            // InternalCftLanguage.g:633:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'or' ( (otherlv_2= RULE_ID ) )*
            {
            // InternalCftLanguage.g:633:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCftLanguage.g:634:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCftLanguage.g:634:4: (lv_name_0_0= RULE_ID )
            // InternalCftLanguage.g:635:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOrGateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrGateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getOrGateAccess().getOrKeyword_1());
            		
            // InternalCftLanguage.g:655:3: ( (otherlv_2= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCftLanguage.g:656:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalCftLanguage.g:656:4: (otherlv_2= RULE_ID )
            	    // InternalCftLanguage.g:657:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOrGateRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    					newLeafNode(otherlv_2, grammarAccess.getOrGateAccess().getInputEventsEventDeclarationCrossReference_2_0());
            	    				

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
    // $ANTLR end "ruleOrGate"


    // $ANTLR start "entryRuleTransformationDefinition"
    // InternalCftLanguage.g:672:1: entryRuleTransformationDefinition returns [EObject current=null] : iv_ruleTransformationDefinition= ruleTransformationDefinition EOF ;
    public final EObject entryRuleTransformationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationDefinition = null;


        try {
            // InternalCftLanguage.g:672:65: (iv_ruleTransformationDefinition= ruleTransformationDefinition EOF )
            // InternalCftLanguage.g:673:2: iv_ruleTransformationDefinition= ruleTransformationDefinition EOF
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
    // InternalCftLanguage.g:679:1: ruleTransformationDefinition returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransformationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappingDefinitions_3_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:685:2: ( (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' ) )
            // InternalCftLanguage.g:686:2: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' )
            {
            // InternalCftLanguage.g:686:2: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}' )
            // InternalCftLanguage.g:687:3: otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationDefinitionAccess().getTransformationKeyword_0());
            		
            // InternalCftLanguage.g:691:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCftLanguage.g:692:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCftLanguage.g:692:4: (lv_name_1_0= RULE_ID )
            // InternalCftLanguage.g:693:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransformationDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformationDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformationDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCftLanguage.g:713:3: ( (lv_mappingDefinitions_3_0= ruleMappingDefinition ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=26 && LA14_0<=27)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCftLanguage.g:714:4: (lv_mappingDefinitions_3_0= ruleMappingDefinition )
            	    {
            	    // InternalCftLanguage.g:714:4: (lv_mappingDefinitions_3_0= ruleMappingDefinition )
            	    // InternalCftLanguage.g:715:5: lv_mappingDefinitions_3_0= ruleMappingDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTransformationDefinitionAccess().getMappingDefinitionsMappingDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalCftLanguage.g:740:1: entryRuleMappingDefinition returns [EObject current=null] : iv_ruleMappingDefinition= ruleMappingDefinition EOF ;
    public final EObject entryRuleMappingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingDefinition = null;


        try {
            // InternalCftLanguage.g:740:58: (iv_ruleMappingDefinition= ruleMappingDefinition EOF )
            // InternalCftLanguage.g:741:2: iv_ruleMappingDefinition= ruleMappingDefinition EOF
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
    // InternalCftLanguage.g:747:1: ruleMappingDefinition returns [EObject current=null] : ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? ) ;
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
            // InternalCftLanguage.g:753:2: ( ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? ) )
            // InternalCftLanguage.g:754:2: ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? )
            {
            // InternalCftLanguage.g:754:2: ( ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )? )
            // InternalCftLanguage.g:755:3: ( (lv_topLevel_0_0= 'toplevel' ) )? otherlv_1= 'mapping' ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleMappingParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )* otherlv_7= ')' ( (lv_componentInstance_8_0= ruleComponentInstance ) )? (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )?
            {
            // InternalCftLanguage.g:755:3: ( (lv_topLevel_0_0= 'toplevel' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCftLanguage.g:756:4: (lv_topLevel_0_0= 'toplevel' )
                    {
                    // InternalCftLanguage.g:756:4: (lv_topLevel_0_0= 'toplevel' )
                    // InternalCftLanguage.g:757:5: lv_topLevel_0_0= 'toplevel'
                    {
                    lv_topLevel_0_0=(Token)match(input,26,FOLLOW_21); 

                    					newLeafNode(lv_topLevel_0_0, grammarAccess.getMappingDefinitionAccess().getTopLevelToplevelKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMappingDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "topLevel", true, "toplevel");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingDefinitionAccess().getMappingKeyword_1());
            		
            // InternalCftLanguage.g:773:3: ( ( ruleQualifiedName ) )
            // InternalCftLanguage.g:774:4: ( ruleQualifiedName )
            {
            // InternalCftLanguage.g:774:4: ( ruleQualifiedName )
            // InternalCftLanguage.g:775:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingDefinitionAccess().getPatternPatternCrossReference_2_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMappingDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCftLanguage.g:793:3: ( (lv_parameters_4_0= ruleMappingParameter ) )
            // InternalCftLanguage.g:794:4: (lv_parameters_4_0= ruleMappingParameter )
            {
            // InternalCftLanguage.g:794:4: (lv_parameters_4_0= ruleMappingParameter )
            // InternalCftLanguage.g:795:5: lv_parameters_4_0= ruleMappingParameter
            {

            					newCompositeNode(grammarAccess.getMappingDefinitionAccess().getParametersMappingParameterParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalCftLanguage.g:812:3: (otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCftLanguage.g:813:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleMappingParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMappingDefinitionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCftLanguage.g:817:4: ( (lv_parameters_6_0= ruleMappingParameter ) )
            	    // InternalCftLanguage.g:818:5: (lv_parameters_6_0= ruleMappingParameter )
            	    {
            	    // InternalCftLanguage.g:818:5: (lv_parameters_6_0= ruleMappingParameter )
            	    // InternalCftLanguage.g:819:6: lv_parameters_6_0= ruleMappingParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMappingDefinitionAccess().getParametersMappingParameterParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getMappingDefinitionAccess().getRightParenthesisKeyword_6());
            		
            // InternalCftLanguage.g:841:3: ( (lv_componentInstance_8_0= ruleComponentInstance ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCftLanguage.g:842:4: (lv_componentInstance_8_0= ruleComponentInstance )
                    {
                    // InternalCftLanguage.g:842:4: (lv_componentInstance_8_0= ruleComponentInstance )
                    // InternalCftLanguage.g:843:5: lv_componentInstance_8_0= ruleComponentInstance
                    {

                    					newCompositeNode(grammarAccess.getMappingDefinitionAccess().getComponentInstanceComponentInstanceParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_25);
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

            // InternalCftLanguage.g:860:3: (otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCftLanguage.g:861:4: otherlv_9= '{' ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappingDefinitionAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalCftLanguage.g:865:4: ( ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||LA19_0==31) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCftLanguage.g:866:5: ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) ) otherlv_12= ';'
                    	    {
                    	    // InternalCftLanguage.g:866:5: ( ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) ) | ( (lv_assignments_11_0= ruleAssignment ) ) )
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==31) ) {
                    	        alt18=1;
                    	    }
                    	    else if ( (LA18_0==RULE_ID) ) {
                    	        alt18=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 18, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // InternalCftLanguage.g:867:6: ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) )
                    	            {
                    	            // InternalCftLanguage.g:867:6: ( (lv_lookupDefinitions_10_0= ruleLookupDefinition ) )
                    	            // InternalCftLanguage.g:868:7: (lv_lookupDefinitions_10_0= ruleLookupDefinition )
                    	            {
                    	            // InternalCftLanguage.g:868:7: (lv_lookupDefinitions_10_0= ruleLookupDefinition )
                    	            // InternalCftLanguage.g:869:8: lv_lookupDefinitions_10_0= ruleLookupDefinition
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
                    	            // InternalCftLanguage.g:887:6: ( (lv_assignments_11_0= ruleAssignment ) )
                    	            {
                    	            // InternalCftLanguage.g:887:6: ( (lv_assignments_11_0= ruleAssignment ) )
                    	            // InternalCftLanguage.g:888:7: (lv_assignments_11_0= ruleAssignment )
                    	            {
                    	            // InternalCftLanguage.g:888:7: (lv_assignments_11_0= ruleAssignment )
                    	            // InternalCftLanguage.g:889:8: lv_assignments_11_0= ruleAssignment
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

                    	    otherlv_12=(Token)match(input,13,FOLLOW_26); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getMappingDefinitionAccess().getSemicolonKeyword_8_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

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
    // InternalCftLanguage.g:921:1: entryRuleMappingParameter returns [EObject current=null] : iv_ruleMappingParameter= ruleMappingParameter EOF ;
    public final EObject entryRuleMappingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingParameter = null;


        try {
            // InternalCftLanguage.g:921:57: (iv_ruleMappingParameter= ruleMappingParameter EOF )
            // InternalCftLanguage.g:922:2: iv_ruleMappingParameter= ruleMappingParameter EOF
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
    // InternalCftLanguage.g:928:1: ruleMappingParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMappingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:934:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCftLanguage.g:935:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCftLanguage.g:935:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCftLanguage.g:936:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCftLanguage.g:936:3: (lv_name_0_0= RULE_ID )
            // InternalCftLanguage.g:937:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMappingParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMappingParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalCftLanguage.g:956:1: entryRuleLookupDefinition returns [EObject current=null] : iv_ruleLookupDefinition= ruleLookupDefinition EOF ;
    public final EObject entryRuleLookupDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupDefinition = null;


        try {
            // InternalCftLanguage.g:956:57: (iv_ruleLookupDefinition= ruleLookupDefinition EOF )
            // InternalCftLanguage.g:957:2: iv_ruleLookupDefinition= ruleLookupDefinition EOF
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
    // InternalCftLanguage.g:963:1: ruleLookupDefinition returns [EObject current=null] : (otherlv_0= 'lookup' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= RULE_ID ) ) ) ;
    public final EObject ruleLookupDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:969:2: ( (otherlv_0= 'lookup' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= RULE_ID ) ) ) )
            // InternalCftLanguage.g:970:2: (otherlv_0= 'lookup' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= RULE_ID ) ) )
            {
            // InternalCftLanguage.g:970:2: (otherlv_0= 'lookup' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= RULE_ID ) ) )
            // InternalCftLanguage.g:971:3: otherlv_0= 'lookup' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'as' ( (lv_name_8_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLookupDefinitionAccess().getLookupKeyword_0());
            		
            // InternalCftLanguage.g:975:3: ( (otherlv_1= RULE_ID ) )
            // InternalCftLanguage.g:976:4: (otherlv_1= RULE_ID )
            {
            // InternalCftLanguage.g:976:4: (otherlv_1= RULE_ID )
            // InternalCftLanguage.g:977:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupDefinitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getLookupDefinitionAccess().getMappingMappingDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLookupDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCftLanguage.g:992:3: ( (otherlv_3= RULE_ID ) )
            // InternalCftLanguage.g:993:4: (otherlv_3= RULE_ID )
            {
            // InternalCftLanguage.g:993:4: (otherlv_3= RULE_ID )
            // InternalCftLanguage.g:994:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupDefinitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getLookupDefinitionAccess().getArgumentsMappingParameterCrossReference_3_0());
            				

            }


            }

            // InternalCftLanguage.g:1005:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCftLanguage.g:1006:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLookupDefinitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCftLanguage.g:1010:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalCftLanguage.g:1011:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCftLanguage.g:1011:5: (otherlv_5= RULE_ID )
            	    // InternalCftLanguage.g:1012:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLookupDefinitionRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_5, grammarAccess.getLookupDefinitionAccess().getArgumentsMappingParameterCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getLookupDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getLookupDefinitionAccess().getAsKeyword_6());
            		
            // InternalCftLanguage.g:1032:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCftLanguage.g:1033:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCftLanguage.g:1033:4: (lv_name_8_0= RULE_ID )
            // InternalCftLanguage.g:1034:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_8_0, grammarAccess.getLookupDefinitionAccess().getNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalCftLanguage.g:1054:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalCftLanguage.g:1054:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalCftLanguage.g:1055:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalCftLanguage.g:1061:1: ruleAssignment returns [EObject current=null] : ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_multiple_1_0=null;
        Token otherlv_2=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_3_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1067:2: ( ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) ) )
            // InternalCftLanguage.g:1068:2: ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) )
            {
            // InternalCftLanguage.g:1068:2: ( ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) ) )
            // InternalCftLanguage.g:1069:3: ( (lv_input_0_0= ruleEventReference ) ) ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' ) ( (lv_output_3_0= ruleEventReference ) )
            {
            // InternalCftLanguage.g:1069:3: ( (lv_input_0_0= ruleEventReference ) )
            // InternalCftLanguage.g:1070:4: (lv_input_0_0= ruleEventReference )
            {
            // InternalCftLanguage.g:1070:4: (lv_input_0_0= ruleEventReference )
            // InternalCftLanguage.g:1071:5: lv_input_0_0= ruleEventReference
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getInputEventReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalCftLanguage.g:1088:3: ( ( (lv_multiple_1_0= '+=' ) ) | otherlv_2= ':=' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( (LA22_0==34) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCftLanguage.g:1089:4: ( (lv_multiple_1_0= '+=' ) )
                    {
                    // InternalCftLanguage.g:1089:4: ( (lv_multiple_1_0= '+=' ) )
                    // InternalCftLanguage.g:1090:5: (lv_multiple_1_0= '+=' )
                    {
                    // InternalCftLanguage.g:1090:5: (lv_multiple_1_0= '+=' )
                    // InternalCftLanguage.g:1091:6: lv_multiple_1_0= '+='
                    {
                    lv_multiple_1_0=(Token)match(input,33,FOLLOW_29); 

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
                    // InternalCftLanguage.g:1104:4: otherlv_2= ':='
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalCftLanguage.g:1109:3: ( (lv_output_3_0= ruleEventReference ) )
            // InternalCftLanguage.g:1110:4: (lv_output_3_0= ruleEventReference )
            {
            // InternalCftLanguage.g:1110:4: (lv_output_3_0= ruleEventReference )
            // InternalCftLanguage.g:1111:5: lv_output_3_0= ruleEventReference
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
    // InternalCftLanguage.g:1132:1: entryRuleEventReference returns [EObject current=null] : iv_ruleEventReference= ruleEventReference EOF ;
    public final EObject entryRuleEventReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventReference = null;


        try {
            // InternalCftLanguage.g:1132:55: (iv_ruleEventReference= ruleEventReference EOF )
            // InternalCftLanguage.g:1133:2: iv_ruleEventReference= ruleEventReference EOF
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
    // InternalCftLanguage.g:1139:1: ruleEventReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEventReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:1145:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalCftLanguage.g:1146:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalCftLanguage.g:1146:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalCftLanguage.g:1147:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalCftLanguage.g:1147:3: ( (otherlv_0= RULE_ID ) )
            // InternalCftLanguage.g:1148:4: (otherlv_0= RULE_ID )
            {
            // InternalCftLanguage.g:1148:4: (otherlv_0= RULE_ID )
            // InternalCftLanguage.g:1149:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getEventReferenceAccess().getComponentVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventReferenceAccess().getFullStopKeyword_1());
            		
            // InternalCftLanguage.g:1164:3: ( (otherlv_2= RULE_ID ) )
            // InternalCftLanguage.g:1165:4: (otherlv_2= RULE_ID )
            {
            // InternalCftLanguage.g:1165:4: (otherlv_2= RULE_ID )
            // InternalCftLanguage.g:1166:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getEventReferenceAccess().getEventEventDeclarationCrossReference_2_0());
            				

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
    // InternalCftLanguage.g:1181:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalCftLanguage.g:1181:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalCftLanguage.g:1182:2: iv_ruleComponentInstance= ruleComponentInstance EOF
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
    // InternalCftLanguage.g:1188:1: ruleComponentInstance returns [EObject current=null] : (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:1194:2: ( (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalCftLanguage.g:1195:2: (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalCftLanguage.g:1195:2: (otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )? )
            // InternalCftLanguage.g:1196:3: otherlv_0= '=>' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getEqualsSignGreaterThanSignKeyword_0());
            		
            // InternalCftLanguage.g:1200:3: ( ( ruleQualifiedName ) )
            // InternalCftLanguage.g:1201:4: ( ruleQualifiedName )
            {
            // InternalCftLanguage.g:1201:4: ( ruleQualifiedName )
            // InternalCftLanguage.g:1202:5: ruleQualifiedName
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

            // InternalCftLanguage.g:1216:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCftLanguage.g:1217:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalCftLanguage.g:1217:4: (lv_name_2_0= RULE_ID )
                    // InternalCftLanguage.g:1218:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentInstanceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // InternalCftLanguage.g:1238:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCftLanguage.g:1238:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCftLanguage.g:1239:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCftLanguage.g:1245:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCftLanguage.g:1251:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCftLanguage.g:1252:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCftLanguage.g:1252:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCftLanguage.g:1253:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalCftLanguage.g:1260:3: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalCftLanguage.g:1261:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalCftLanguage.g:1278:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalCftLanguage.g:1278:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalCftLanguage.g:1279:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalCftLanguage.g:1285:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCftLanguage.g:1291:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalCftLanguage.g:1292:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalCftLanguage.g:1292:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalCftLanguage.g:1293:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCftLanguage.g:1303:3: (kw= '.' kw= '*' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCftLanguage.g:1304:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0());
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000200E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000200C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080080010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});

}
