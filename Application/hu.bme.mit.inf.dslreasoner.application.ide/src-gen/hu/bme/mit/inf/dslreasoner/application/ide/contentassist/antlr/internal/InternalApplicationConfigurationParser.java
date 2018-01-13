package hu.bme.mit.inf.dslreasoner.application.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.inf.dslreasoner.application.services.ApplicationConfigurationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplicationConfigurationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'epackage'", "'viatra'", "'{'", "'}'", "','", "'package'", "'excluding'", "'::'", "'.'", "'metamodel'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalApplicationConfigurationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApplicationConfigurationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApplicationConfigurationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalApplicationConfiguration.g"; }


    	private ApplicationConfigurationGrammarAccess grammarAccess;

    	public void setGrammarAccess(ApplicationConfigurationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleConfigurationScript"
    // InternalApplicationConfiguration.g:53:1: entryRuleConfigurationScript : ruleConfigurationScript EOF ;
    public final void entryRuleConfigurationScript() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:54:1: ( ruleConfigurationScript EOF )
            // InternalApplicationConfiguration.g:55:1: ruleConfigurationScript EOF
            {
             before(grammarAccess.getConfigurationScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationScript();

            state._fsp--;

             after(grammarAccess.getConfigurationScriptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationScript"


    // $ANTLR start "ruleConfigurationScript"
    // InternalApplicationConfiguration.g:62:1: ruleConfigurationScript : ( ( rule__ConfigurationScript__Group__0 ) ) ;
    public final void ruleConfigurationScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:66:2: ( ( ( rule__ConfigurationScript__Group__0 ) ) )
            // InternalApplicationConfiguration.g:67:2: ( ( rule__ConfigurationScript__Group__0 ) )
            {
            // InternalApplicationConfiguration.g:67:2: ( ( rule__ConfigurationScript__Group__0 ) )
            // InternalApplicationConfiguration.g:68:3: ( rule__ConfigurationScript__Group__0 )
            {
             before(grammarAccess.getConfigurationScriptAccess().getGroup()); 
            // InternalApplicationConfiguration.g:69:3: ( rule__ConfigurationScript__Group__0 )
            // InternalApplicationConfiguration.g:69:4: rule__ConfigurationScript__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationScript__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationScript"


    // $ANTLR start "entryRuleCommand"
    // InternalApplicationConfiguration.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:79:1: ( ruleCommand EOF )
            // InternalApplicationConfiguration.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalApplicationConfiguration.g:87:1: ruleCommand : ( ruleDeclaration ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:91:2: ( ( ruleDeclaration ) )
            // InternalApplicationConfiguration.g:92:2: ( ruleDeclaration )
            {
            // InternalApplicationConfiguration.g:92:2: ( ruleDeclaration )
            // InternalApplicationConfiguration.g:93:3: ruleDeclaration
            {
             before(grammarAccess.getCommandAccess().getDeclarationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getDeclarationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleDeclaration"
    // InternalApplicationConfiguration.g:103:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:104:1: ( ruleDeclaration EOF )
            // InternalApplicationConfiguration.g:105:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalApplicationConfiguration.g:112:1: ruleDeclaration : ( ruleMetamodelDeclaration ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:116:2: ( ( ruleMetamodelDeclaration ) )
            // InternalApplicationConfiguration.g:117:2: ( ruleMetamodelDeclaration )
            {
            // InternalApplicationConfiguration.g:117:2: ( ruleMetamodelDeclaration )
            // InternalApplicationConfiguration.g:118:3: ruleMetamodelDeclaration
            {
             before(grammarAccess.getDeclarationAccess().getMetamodelDeclarationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleMetamodelDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getMetamodelDeclarationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleImport"
    // InternalApplicationConfiguration.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:129:1: ( ruleImport EOF )
            // InternalApplicationConfiguration.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalApplicationConfiguration.g:137:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:141:2: ( ( ( rule__Import__Alternatives ) ) )
            // InternalApplicationConfiguration.g:142:2: ( ( rule__Import__Alternatives ) )
            {
            // InternalApplicationConfiguration.g:142:2: ( ( rule__Import__Alternatives ) )
            // InternalApplicationConfiguration.g:143:3: ( rule__Import__Alternatives )
            {
             before(grammarAccess.getImportAccess().getAlternatives()); 
            // InternalApplicationConfiguration.g:144:3: ( rule__Import__Alternatives )
            // InternalApplicationConfiguration.g:144:4: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Import__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleEPackageImport"
    // InternalApplicationConfiguration.g:153:1: entryRuleEPackageImport : ruleEPackageImport EOF ;
    public final void entryRuleEPackageImport() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:154:1: ( ruleEPackageImport EOF )
            // InternalApplicationConfiguration.g:155:1: ruleEPackageImport EOF
            {
             before(grammarAccess.getEPackageImportRule()); 
            pushFollow(FOLLOW_1);
            ruleEPackageImport();

            state._fsp--;

             after(grammarAccess.getEPackageImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEPackageImport"


    // $ANTLR start "ruleEPackageImport"
    // InternalApplicationConfiguration.g:162:1: ruleEPackageImport : ( ( rule__EPackageImport__Group__0 ) ) ;
    public final void ruleEPackageImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:166:2: ( ( ( rule__EPackageImport__Group__0 ) ) )
            // InternalApplicationConfiguration.g:167:2: ( ( rule__EPackageImport__Group__0 ) )
            {
            // InternalApplicationConfiguration.g:167:2: ( ( rule__EPackageImport__Group__0 ) )
            // InternalApplicationConfiguration.g:168:3: ( rule__EPackageImport__Group__0 )
            {
             before(grammarAccess.getEPackageImportAccess().getGroup()); 
            // InternalApplicationConfiguration.g:169:3: ( rule__EPackageImport__Group__0 )
            // InternalApplicationConfiguration.g:169:4: rule__EPackageImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EPackageImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEPackageImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEPackageImport"


    // $ANTLR start "entryRuleViatraImport"
    // InternalApplicationConfiguration.g:178:1: entryRuleViatraImport : ruleViatraImport EOF ;
    public final void entryRuleViatraImport() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:179:1: ( ruleViatraImport EOF )
            // InternalApplicationConfiguration.g:180:1: ruleViatraImport EOF
            {
             before(grammarAccess.getViatraImportRule()); 
            pushFollow(FOLLOW_1);
            ruleViatraImport();

            state._fsp--;

             after(grammarAccess.getViatraImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViatraImport"


    // $ANTLR start "ruleViatraImport"
    // InternalApplicationConfiguration.g:187:1: ruleViatraImport : ( ( rule__ViatraImport__Group__0 ) ) ;
    public final void ruleViatraImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:191:2: ( ( ( rule__ViatraImport__Group__0 ) ) )
            // InternalApplicationConfiguration.g:192:2: ( ( rule__ViatraImport__Group__0 ) )
            {
            // InternalApplicationConfiguration.g:192:2: ( ( rule__ViatraImport__Group__0 ) )
            // InternalApplicationConfiguration.g:193:3: ( rule__ViatraImport__Group__0 )
            {
             before(grammarAccess.getViatraImportAccess().getGroup()); 
            // InternalApplicationConfiguration.g:194:3: ( rule__ViatraImport__Group__0 )
            // InternalApplicationConfiguration.g:194:4: rule__ViatraImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViatraImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViatraImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViatraImport"


    // $ANTLR start "entryRuleMetamodelSpecification"
    // InternalApplicationConfiguration.g:203:1: entryRuleMetamodelSpecification : ruleMetamodelSpecification EOF ;
    public final void entryRuleMetamodelSpecification() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:204:1: ( ruleMetamodelSpecification EOF )
            // InternalApplicationConfiguration.g:205:1: ruleMetamodelSpecification EOF
            {
             before(grammarAccess.getMetamodelSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodelSpecification();

            state._fsp--;

             after(grammarAccess.getMetamodelSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelSpecification"


    // $ANTLR start "ruleMetamodelSpecification"
    // InternalApplicationConfiguration.g:212:1: ruleMetamodelSpecification : ( ( rule__MetamodelSpecification__Group__0 ) ) ;
    public final void ruleMetamodelSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:216:2: ( ( ( rule__MetamodelSpecification__Group__0 ) ) )
            // InternalApplicationConfiguration.g:217:2: ( ( rule__MetamodelSpecification__Group__0 ) )
            {
            // InternalApplicationConfiguration.g:217:2: ( ( rule__MetamodelSpecification__Group__0 ) )
            // InternalApplicationConfiguration.g:218:3: ( rule__MetamodelSpecification__Group__0 )
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getGroup()); 
            // InternalApplicationConfiguration.g:219:3: ( rule__MetamodelSpecification__Group__0 )
            // InternalApplicationConfiguration.g:219:4: rule__MetamodelSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelSpecification"


    // $ANTLR start "entryRuleMetamodelEntry"
    // InternalApplicationConfiguration.g:228:1: entryRuleMetamodelEntry : ruleMetamodelEntry EOF ;
    public final void entryRuleMetamodelEntry() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:229:1: ( ruleMetamodelEntry EOF )
            // InternalApplicationConfiguration.g:230:1: ruleMetamodelEntry EOF
            {
             before(grammarAccess.getMetamodelEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodelEntry();

            state._fsp--;

             after(grammarAccess.getMetamodelEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelEntry"


    // $ANTLR start "ruleMetamodelEntry"
    // InternalApplicationConfiguration.g:237:1: ruleMetamodelEntry : ( ( rule__MetamodelEntry__Alternatives ) ) ;
    public final void ruleMetamodelEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:241:2: ( ( ( rule__MetamodelEntry__Alternatives ) ) )
            // InternalApplicationConfiguration.g:242:2: ( ( rule__MetamodelEntry__Alternatives ) )
            {
            // InternalApplicationConfiguration.g:242:2: ( ( rule__MetamodelEntry__Alternatives ) )
            // InternalApplicationConfiguration.g:243:3: ( rule__MetamodelEntry__Alternatives )
            {
             before(grammarAccess.getMetamodelEntryAccess().getAlternatives()); 
            // InternalApplicationConfiguration.g:244:3: ( rule__MetamodelEntry__Alternatives )
            // InternalApplicationConfiguration.g:244:4: rule__MetamodelEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelEntry"


    // $ANTLR start "entryRuleAllPackageEntry"
    // InternalApplicationConfiguration.g:253:1: entryRuleAllPackageEntry : ruleAllPackageEntry EOF ;
    public final void entryRuleAllPackageEntry() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:254:1: ( ruleAllPackageEntry EOF )
            // InternalApplicationConfiguration.g:255:1: ruleAllPackageEntry EOF
            {
             before(grammarAccess.getAllPackageEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleAllPackageEntry();

            state._fsp--;

             after(grammarAccess.getAllPackageEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllPackageEntry"


    // $ANTLR start "ruleAllPackageEntry"
    // InternalApplicationConfiguration.g:262:1: ruleAllPackageEntry : ( ( rule__AllPackageEntry__Group__0 ) ) ;
    public final void ruleAllPackageEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:266:2: ( ( ( rule__AllPackageEntry__Group__0 ) ) )
            // InternalApplicationConfiguration.g:267:2: ( ( rule__AllPackageEntry__Group__0 ) )
            {
            // InternalApplicationConfiguration.g:267:2: ( ( rule__AllPackageEntry__Group__0 ) )
            // InternalApplicationConfiguration.g:268:3: ( rule__AllPackageEntry__Group__0 )
            {
             before(grammarAccess.getAllPackageEntryAccess().getGroup()); 
            // InternalApplicationConfiguration.g:269:3: ( rule__AllPackageEntry__Group__0 )
            // InternalApplicationConfiguration.g:269:4: rule__AllPackageEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllPackageEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllPackageEntry"


    // $ANTLR start "entryRuleMetamodelElement"
    // InternalApplicationConfiguration.g:278:1: entryRuleMetamodelElement : ruleMetamodelElement EOF ;
    public final void entryRuleMetamodelElement() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:279:1: ( ruleMetamodelElement EOF )
            // InternalApplicationConfiguration.g:280:1: ruleMetamodelElement EOF
            {
             before(grammarAccess.getMetamodelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodelElement();

            state._fsp--;

             after(grammarAccess.getMetamodelElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelElement"


    // $ANTLR start "ruleMetamodelElement"
    // InternalApplicationConfiguration.g:287:1: ruleMetamodelElement : ( ( rule__MetamodelElement__Group__0 ) ) ;
    public final void ruleMetamodelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:291:2: ( ( ( rule__MetamodelElement__Group__0 ) ) )
            // InternalApplicationConfiguration.g:292:2: ( ( rule__MetamodelElement__Group__0 ) )
            {
            // InternalApplicationConfiguration.g:292:2: ( ( rule__MetamodelElement__Group__0 ) )
            // InternalApplicationConfiguration.g:293:3: ( rule__MetamodelElement__Group__0 )
            {
             before(grammarAccess.getMetamodelElementAccess().getGroup()); 
            // InternalApplicationConfiguration.g:294:3: ( rule__MetamodelElement__Group__0 )
            // InternalApplicationConfiguration.g:294:4: rule__MetamodelElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelElement"


    // $ANTLR start "entryRuleMetamodelDeclaration"
    // InternalApplicationConfiguration.g:303:1: entryRuleMetamodelDeclaration : ruleMetamodelDeclaration EOF ;
    public final void entryRuleMetamodelDeclaration() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:304:1: ( ruleMetamodelDeclaration EOF )
            // InternalApplicationConfiguration.g:305:1: ruleMetamodelDeclaration EOF
            {
             before(grammarAccess.getMetamodelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodelDeclaration();

            state._fsp--;

             after(grammarAccess.getMetamodelDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelDeclaration"


    // $ANTLR start "ruleMetamodelDeclaration"
    // InternalApplicationConfiguration.g:312:1: ruleMetamodelDeclaration : ( ( rule__MetamodelDeclaration__Group__0 ) ) ;
    public final void ruleMetamodelDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:316:2: ( ( ( rule__MetamodelDeclaration__Group__0 ) ) )
            // InternalApplicationConfiguration.g:317:2: ( ( rule__MetamodelDeclaration__Group__0 ) )
            {
            // InternalApplicationConfiguration.g:317:2: ( ( rule__MetamodelDeclaration__Group__0 ) )
            // InternalApplicationConfiguration.g:318:3: ( rule__MetamodelDeclaration__Group__0 )
            {
             before(grammarAccess.getMetamodelDeclarationAccess().getGroup()); 
            // InternalApplicationConfiguration.g:319:3: ( rule__MetamodelDeclaration__Group__0 )
            // InternalApplicationConfiguration.g:319:4: rule__MetamodelDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelDeclaration"


    // $ANTLR start "entryRuleMetamodelReference"
    // InternalApplicationConfiguration.g:328:1: entryRuleMetamodelReference : ruleMetamodelReference EOF ;
    public final void entryRuleMetamodelReference() throws RecognitionException {
        try {
            // InternalApplicationConfiguration.g:329:1: ( ruleMetamodelReference EOF )
            // InternalApplicationConfiguration.g:330:1: ruleMetamodelReference EOF
            {
             before(grammarAccess.getMetamodelReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodelReference();

            state._fsp--;

             after(grammarAccess.getMetamodelReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelReference"


    // $ANTLR start "ruleMetamodelReference"
    // InternalApplicationConfiguration.g:337:1: ruleMetamodelReference : ( ( rule__MetamodelReference__ReferredAssignment ) ) ;
    public final void ruleMetamodelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:341:2: ( ( ( rule__MetamodelReference__ReferredAssignment ) ) )
            // InternalApplicationConfiguration.g:342:2: ( ( rule__MetamodelReference__ReferredAssignment ) )
            {
            // InternalApplicationConfiguration.g:342:2: ( ( rule__MetamodelReference__ReferredAssignment ) )
            // InternalApplicationConfiguration.g:343:3: ( rule__MetamodelReference__ReferredAssignment )
            {
             before(grammarAccess.getMetamodelReferenceAccess().getReferredAssignment()); 
            // InternalApplicationConfiguration.g:344:3: ( rule__MetamodelReference__ReferredAssignment )
            // InternalApplicationConfiguration.g:344:4: rule__MetamodelReference__ReferredAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelReference__ReferredAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelReferenceAccess().getReferredAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelReference"


    // $ANTLR start "rule__Import__Alternatives"
    // InternalApplicationConfiguration.g:352:1: rule__Import__Alternatives : ( ( ruleEPackageImport ) | ( ruleViatraImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:356:1: ( ( ruleEPackageImport ) | ( ruleViatraImport ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==12) ) {
                    alt1=1;
                }
                else if ( (LA1_1==13) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalApplicationConfiguration.g:357:2: ( ruleEPackageImport )
                    {
                    // InternalApplicationConfiguration.g:357:2: ( ruleEPackageImport )
                    // InternalApplicationConfiguration.g:358:3: ruleEPackageImport
                    {
                     before(grammarAccess.getImportAccess().getEPackageImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEPackageImport();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getEPackageImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:363:2: ( ruleViatraImport )
                    {
                    // InternalApplicationConfiguration.g:363:2: ( ruleViatraImport )
                    // InternalApplicationConfiguration.g:364:3: ruleViatraImport
                    {
                     before(grammarAccess.getImportAccess().getViatraImportParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleViatraImport();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getViatraImportParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__MetamodelEntry__Alternatives"
    // InternalApplicationConfiguration.g:373:1: rule__MetamodelEntry__Alternatives : ( ( ruleMetamodelElement ) | ( ruleAllPackageEntry ) );
    public final void rule__MetamodelEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:377:1: ( ( ruleMetamodelElement ) | ( ruleAllPackageEntry ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalApplicationConfiguration.g:378:2: ( ruleMetamodelElement )
                    {
                    // InternalApplicationConfiguration.g:378:2: ( ruleMetamodelElement )
                    // InternalApplicationConfiguration.g:379:3: ruleMetamodelElement
                    {
                     before(grammarAccess.getMetamodelEntryAccess().getMetamodelElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMetamodelElement();

                    state._fsp--;

                     after(grammarAccess.getMetamodelEntryAccess().getMetamodelElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalApplicationConfiguration.g:384:2: ( ruleAllPackageEntry )
                    {
                    // InternalApplicationConfiguration.g:384:2: ( ruleAllPackageEntry )
                    // InternalApplicationConfiguration.g:385:3: ruleAllPackageEntry
                    {
                     before(grammarAccess.getMetamodelEntryAccess().getAllPackageEntryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAllPackageEntry();

                    state._fsp--;

                     after(grammarAccess.getMetamodelEntryAccess().getAllPackageEntryParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelEntry__Alternatives"


    // $ANTLR start "rule__ConfigurationScript__Group__0"
    // InternalApplicationConfiguration.g:394:1: rule__ConfigurationScript__Group__0 : rule__ConfigurationScript__Group__0__Impl rule__ConfigurationScript__Group__1 ;
    public final void rule__ConfigurationScript__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:398:1: ( rule__ConfigurationScript__Group__0__Impl rule__ConfigurationScript__Group__1 )
            // InternalApplicationConfiguration.g:399:2: rule__ConfigurationScript__Group__0__Impl rule__ConfigurationScript__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConfigurationScript__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigurationScript__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationScript__Group__0"


    // $ANTLR start "rule__ConfigurationScript__Group__0__Impl"
    // InternalApplicationConfiguration.g:406:1: rule__ConfigurationScript__Group__0__Impl : ( ( rule__ConfigurationScript__ImportsAssignment_0 )* ) ;
    public final void rule__ConfigurationScript__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:410:1: ( ( ( rule__ConfigurationScript__ImportsAssignment_0 )* ) )
            // InternalApplicationConfiguration.g:411:1: ( ( rule__ConfigurationScript__ImportsAssignment_0 )* )
            {
            // InternalApplicationConfiguration.g:411:1: ( ( rule__ConfigurationScript__ImportsAssignment_0 )* )
            // InternalApplicationConfiguration.g:412:2: ( rule__ConfigurationScript__ImportsAssignment_0 )*
            {
             before(grammarAccess.getConfigurationScriptAccess().getImportsAssignment_0()); 
            // InternalApplicationConfiguration.g:413:2: ( rule__ConfigurationScript__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:413:3: rule__ConfigurationScript__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ConfigurationScript__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getConfigurationScriptAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationScript__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationScript__Group__1"
    // InternalApplicationConfiguration.g:421:1: rule__ConfigurationScript__Group__1 : rule__ConfigurationScript__Group__1__Impl ;
    public final void rule__ConfigurationScript__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:425:1: ( rule__ConfigurationScript__Group__1__Impl )
            // InternalApplicationConfiguration.g:426:2: rule__ConfigurationScript__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationScript__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationScript__Group__1"


    // $ANTLR start "rule__ConfigurationScript__Group__1__Impl"
    // InternalApplicationConfiguration.g:432:1: rule__ConfigurationScript__Group__1__Impl : ( ( rule__ConfigurationScript__CommandsAssignment_1 )* ) ;
    public final void rule__ConfigurationScript__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:436:1: ( ( ( rule__ConfigurationScript__CommandsAssignment_1 )* ) )
            // InternalApplicationConfiguration.g:437:1: ( ( rule__ConfigurationScript__CommandsAssignment_1 )* )
            {
            // InternalApplicationConfiguration.g:437:1: ( ( rule__ConfigurationScript__CommandsAssignment_1 )* )
            // InternalApplicationConfiguration.g:438:2: ( rule__ConfigurationScript__CommandsAssignment_1 )*
            {
             before(grammarAccess.getConfigurationScriptAccess().getCommandsAssignment_1()); 
            // InternalApplicationConfiguration.g:439:2: ( rule__ConfigurationScript__CommandsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:439:3: rule__ConfigurationScript__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ConfigurationScript__CommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConfigurationScriptAccess().getCommandsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationScript__Group__1__Impl"


    // $ANTLR start "rule__EPackageImport__Group__0"
    // InternalApplicationConfiguration.g:448:1: rule__EPackageImport__Group__0 : rule__EPackageImport__Group__0__Impl rule__EPackageImport__Group__1 ;
    public final void rule__EPackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:452:1: ( rule__EPackageImport__Group__0__Impl rule__EPackageImport__Group__1 )
            // InternalApplicationConfiguration.g:453:2: rule__EPackageImport__Group__0__Impl rule__EPackageImport__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EPackageImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EPackageImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageImport__Group__0"


    // $ANTLR start "rule__EPackageImport__Group__0__Impl"
    // InternalApplicationConfiguration.g:460:1: rule__EPackageImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__EPackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:464:1: ( ( 'import' ) )
            // InternalApplicationConfiguration.g:465:1: ( 'import' )
            {
            // InternalApplicationConfiguration.g:465:1: ( 'import' )
            // InternalApplicationConfiguration.g:466:2: 'import'
            {
             before(grammarAccess.getEPackageImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEPackageImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageImport__Group__0__Impl"


    // $ANTLR start "rule__EPackageImport__Group__1"
    // InternalApplicationConfiguration.g:475:1: rule__EPackageImport__Group__1 : rule__EPackageImport__Group__1__Impl rule__EPackageImport__Group__2 ;
    public final void rule__EPackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:479:1: ( rule__EPackageImport__Group__1__Impl rule__EPackageImport__Group__2 )
            // InternalApplicationConfiguration.g:480:2: rule__EPackageImport__Group__1__Impl rule__EPackageImport__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EPackageImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EPackageImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageImport__Group__1"


    // $ANTLR start "rule__EPackageImport__Group__1__Impl"
    // InternalApplicationConfiguration.g:487:1: rule__EPackageImport__Group__1__Impl : ( 'epackage' ) ;
    public final void rule__EPackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:491:1: ( ( 'epackage' ) )
            // InternalApplicationConfiguration.g:492:1: ( 'epackage' )
            {
            // InternalApplicationConfiguration.g:492:1: ( 'epackage' )
            // InternalApplicationConfiguration.g:493:2: 'epackage'
            {
             before(grammarAccess.getEPackageImportAccess().getEpackageKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEPackageImportAccess().getEpackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageImport__Group__1__Impl"


    // $ANTLR start "rule__EPackageImport__Group__2"
    // InternalApplicationConfiguration.g:502:1: rule__EPackageImport__Group__2 : rule__EPackageImport__Group__2__Impl ;
    public final void rule__EPackageImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:506:1: ( rule__EPackageImport__Group__2__Impl )
            // InternalApplicationConfiguration.g:507:2: rule__EPackageImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EPackageImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageImport__Group__2"


    // $ANTLR start "rule__EPackageImport__Group__2__Impl"
    // InternalApplicationConfiguration.g:513:1: rule__EPackageImport__Group__2__Impl : ( ( rule__EPackageImport__ImportedPackageAssignment_2 ) ) ;
    public final void rule__EPackageImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:517:1: ( ( ( rule__EPackageImport__ImportedPackageAssignment_2 ) ) )
            // InternalApplicationConfiguration.g:518:1: ( ( rule__EPackageImport__ImportedPackageAssignment_2 ) )
            {
            // InternalApplicationConfiguration.g:518:1: ( ( rule__EPackageImport__ImportedPackageAssignment_2 ) )
            // InternalApplicationConfiguration.g:519:2: ( rule__EPackageImport__ImportedPackageAssignment_2 )
            {
             before(grammarAccess.getEPackageImportAccess().getImportedPackageAssignment_2()); 
            // InternalApplicationConfiguration.g:520:2: ( rule__EPackageImport__ImportedPackageAssignment_2 )
            // InternalApplicationConfiguration.g:520:3: rule__EPackageImport__ImportedPackageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EPackageImport__ImportedPackageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEPackageImportAccess().getImportedPackageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageImport__Group__2__Impl"


    // $ANTLR start "rule__ViatraImport__Group__0"
    // InternalApplicationConfiguration.g:529:1: rule__ViatraImport__Group__0 : rule__ViatraImport__Group__0__Impl rule__ViatraImport__Group__1 ;
    public final void rule__ViatraImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:533:1: ( rule__ViatraImport__Group__0__Impl rule__ViatraImport__Group__1 )
            // InternalApplicationConfiguration.g:534:2: rule__ViatraImport__Group__0__Impl rule__ViatraImport__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ViatraImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViatraImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViatraImport__Group__0"


    // $ANTLR start "rule__ViatraImport__Group__0__Impl"
    // InternalApplicationConfiguration.g:541:1: rule__ViatraImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__ViatraImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:545:1: ( ( 'import' ) )
            // InternalApplicationConfiguration.g:546:1: ( 'import' )
            {
            // InternalApplicationConfiguration.g:546:1: ( 'import' )
            // InternalApplicationConfiguration.g:547:2: 'import'
            {
             before(grammarAccess.getViatraImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getViatraImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViatraImport__Group__0__Impl"


    // $ANTLR start "rule__ViatraImport__Group__1"
    // InternalApplicationConfiguration.g:556:1: rule__ViatraImport__Group__1 : rule__ViatraImport__Group__1__Impl rule__ViatraImport__Group__2 ;
    public final void rule__ViatraImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:560:1: ( rule__ViatraImport__Group__1__Impl rule__ViatraImport__Group__2 )
            // InternalApplicationConfiguration.g:561:2: rule__ViatraImport__Group__1__Impl rule__ViatraImport__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ViatraImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViatraImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViatraImport__Group__1"


    // $ANTLR start "rule__ViatraImport__Group__1__Impl"
    // InternalApplicationConfiguration.g:568:1: rule__ViatraImport__Group__1__Impl : ( 'viatra' ) ;
    public final void rule__ViatraImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:572:1: ( ( 'viatra' ) )
            // InternalApplicationConfiguration.g:573:1: ( 'viatra' )
            {
            // InternalApplicationConfiguration.g:573:1: ( 'viatra' )
            // InternalApplicationConfiguration.g:574:2: 'viatra'
            {
             before(grammarAccess.getViatraImportAccess().getViatraKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getViatraImportAccess().getViatraKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViatraImport__Group__1__Impl"


    // $ANTLR start "rule__ViatraImport__Group__2"
    // InternalApplicationConfiguration.g:583:1: rule__ViatraImport__Group__2 : rule__ViatraImport__Group__2__Impl ;
    public final void rule__ViatraImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:587:1: ( rule__ViatraImport__Group__2__Impl )
            // InternalApplicationConfiguration.g:588:2: rule__ViatraImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViatraImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViatraImport__Group__2"


    // $ANTLR start "rule__ViatraImport__Group__2__Impl"
    // InternalApplicationConfiguration.g:594:1: rule__ViatraImport__Group__2__Impl : ( ( rule__ViatraImport__ImportedViatraAssignment_2 ) ) ;
    public final void rule__ViatraImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:598:1: ( ( ( rule__ViatraImport__ImportedViatraAssignment_2 ) ) )
            // InternalApplicationConfiguration.g:599:1: ( ( rule__ViatraImport__ImportedViatraAssignment_2 ) )
            {
            // InternalApplicationConfiguration.g:599:1: ( ( rule__ViatraImport__ImportedViatraAssignment_2 ) )
            // InternalApplicationConfiguration.g:600:2: ( rule__ViatraImport__ImportedViatraAssignment_2 )
            {
             before(grammarAccess.getViatraImportAccess().getImportedViatraAssignment_2()); 
            // InternalApplicationConfiguration.g:601:2: ( rule__ViatraImport__ImportedViatraAssignment_2 )
            // InternalApplicationConfiguration.g:601:3: rule__ViatraImport__ImportedViatraAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ViatraImport__ImportedViatraAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViatraImportAccess().getImportedViatraAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViatraImport__Group__2__Impl"


    // $ANTLR start "rule__MetamodelSpecification__Group__0"
    // InternalApplicationConfiguration.g:610:1: rule__MetamodelSpecification__Group__0 : rule__MetamodelSpecification__Group__0__Impl rule__MetamodelSpecification__Group__1 ;
    public final void rule__MetamodelSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:614:1: ( rule__MetamodelSpecification__Group__0__Impl rule__MetamodelSpecification__Group__1 )
            // InternalApplicationConfiguration.g:615:2: rule__MetamodelSpecification__Group__0__Impl rule__MetamodelSpecification__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MetamodelSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__0"


    // $ANTLR start "rule__MetamodelSpecification__Group__0__Impl"
    // InternalApplicationConfiguration.g:622:1: rule__MetamodelSpecification__Group__0__Impl : ( '{' ) ;
    public final void rule__MetamodelSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:626:1: ( ( '{' ) )
            // InternalApplicationConfiguration.g:627:1: ( '{' )
            {
            // InternalApplicationConfiguration.g:627:1: ( '{' )
            // InternalApplicationConfiguration.g:628:2: '{'
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMetamodelSpecificationAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__0__Impl"


    // $ANTLR start "rule__MetamodelSpecification__Group__1"
    // InternalApplicationConfiguration.g:637:1: rule__MetamodelSpecification__Group__1 : rule__MetamodelSpecification__Group__1__Impl rule__MetamodelSpecification__Group__2 ;
    public final void rule__MetamodelSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:641:1: ( rule__MetamodelSpecification__Group__1__Impl rule__MetamodelSpecification__Group__2 )
            // InternalApplicationConfiguration.g:642:2: rule__MetamodelSpecification__Group__1__Impl rule__MetamodelSpecification__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MetamodelSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__1"


    // $ANTLR start "rule__MetamodelSpecification__Group__1__Impl"
    // InternalApplicationConfiguration.g:649:1: rule__MetamodelSpecification__Group__1__Impl : ( ( rule__MetamodelSpecification__EntriesAssignment_1 ) ) ;
    public final void rule__MetamodelSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:653:1: ( ( ( rule__MetamodelSpecification__EntriesAssignment_1 ) ) )
            // InternalApplicationConfiguration.g:654:1: ( ( rule__MetamodelSpecification__EntriesAssignment_1 ) )
            {
            // InternalApplicationConfiguration.g:654:1: ( ( rule__MetamodelSpecification__EntriesAssignment_1 ) )
            // InternalApplicationConfiguration.g:655:2: ( rule__MetamodelSpecification__EntriesAssignment_1 )
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getEntriesAssignment_1()); 
            // InternalApplicationConfiguration.g:656:2: ( rule__MetamodelSpecification__EntriesAssignment_1 )
            // InternalApplicationConfiguration.g:656:3: rule__MetamodelSpecification__EntriesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__EntriesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelSpecificationAccess().getEntriesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__1__Impl"


    // $ANTLR start "rule__MetamodelSpecification__Group__2"
    // InternalApplicationConfiguration.g:664:1: rule__MetamodelSpecification__Group__2 : rule__MetamodelSpecification__Group__2__Impl rule__MetamodelSpecification__Group__3 ;
    public final void rule__MetamodelSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:668:1: ( rule__MetamodelSpecification__Group__2__Impl rule__MetamodelSpecification__Group__3 )
            // InternalApplicationConfiguration.g:669:2: rule__MetamodelSpecification__Group__2__Impl rule__MetamodelSpecification__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MetamodelSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__2"


    // $ANTLR start "rule__MetamodelSpecification__Group__2__Impl"
    // InternalApplicationConfiguration.g:676:1: rule__MetamodelSpecification__Group__2__Impl : ( ( rule__MetamodelSpecification__Group_2__0 )* ) ;
    public final void rule__MetamodelSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:680:1: ( ( ( rule__MetamodelSpecification__Group_2__0 )* ) )
            // InternalApplicationConfiguration.g:681:1: ( ( rule__MetamodelSpecification__Group_2__0 )* )
            {
            // InternalApplicationConfiguration.g:681:1: ( ( rule__MetamodelSpecification__Group_2__0 )* )
            // InternalApplicationConfiguration.g:682:2: ( rule__MetamodelSpecification__Group_2__0 )*
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getGroup_2()); 
            // InternalApplicationConfiguration.g:683:2: ( rule__MetamodelSpecification__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:683:3: rule__MetamodelSpecification__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MetamodelSpecification__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMetamodelSpecificationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__2__Impl"


    // $ANTLR start "rule__MetamodelSpecification__Group__3"
    // InternalApplicationConfiguration.g:691:1: rule__MetamodelSpecification__Group__3 : rule__MetamodelSpecification__Group__3__Impl ;
    public final void rule__MetamodelSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:695:1: ( rule__MetamodelSpecification__Group__3__Impl )
            // InternalApplicationConfiguration.g:696:2: rule__MetamodelSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__3"


    // $ANTLR start "rule__MetamodelSpecification__Group__3__Impl"
    // InternalApplicationConfiguration.g:702:1: rule__MetamodelSpecification__Group__3__Impl : ( '}' ) ;
    public final void rule__MetamodelSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:706:1: ( ( '}' ) )
            // InternalApplicationConfiguration.g:707:1: ( '}' )
            {
            // InternalApplicationConfiguration.g:707:1: ( '}' )
            // InternalApplicationConfiguration.g:708:2: '}'
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetamodelSpecificationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group__3__Impl"


    // $ANTLR start "rule__MetamodelSpecification__Group_2__0"
    // InternalApplicationConfiguration.g:718:1: rule__MetamodelSpecification__Group_2__0 : rule__MetamodelSpecification__Group_2__0__Impl rule__MetamodelSpecification__Group_2__1 ;
    public final void rule__MetamodelSpecification__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:722:1: ( rule__MetamodelSpecification__Group_2__0__Impl rule__MetamodelSpecification__Group_2__1 )
            // InternalApplicationConfiguration.g:723:2: rule__MetamodelSpecification__Group_2__0__Impl rule__MetamodelSpecification__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__MetamodelSpecification__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group_2__0"


    // $ANTLR start "rule__MetamodelSpecification__Group_2__0__Impl"
    // InternalApplicationConfiguration.g:730:1: rule__MetamodelSpecification__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MetamodelSpecification__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:734:1: ( ( ',' ) )
            // InternalApplicationConfiguration.g:735:1: ( ',' )
            {
            // InternalApplicationConfiguration.g:735:1: ( ',' )
            // InternalApplicationConfiguration.g:736:2: ','
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetamodelSpecificationAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group_2__0__Impl"


    // $ANTLR start "rule__MetamodelSpecification__Group_2__1"
    // InternalApplicationConfiguration.g:745:1: rule__MetamodelSpecification__Group_2__1 : rule__MetamodelSpecification__Group_2__1__Impl ;
    public final void rule__MetamodelSpecification__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:749:1: ( rule__MetamodelSpecification__Group_2__1__Impl )
            // InternalApplicationConfiguration.g:750:2: rule__MetamodelSpecification__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group_2__1"


    // $ANTLR start "rule__MetamodelSpecification__Group_2__1__Impl"
    // InternalApplicationConfiguration.g:756:1: rule__MetamodelSpecification__Group_2__1__Impl : ( ( rule__MetamodelSpecification__EntriesAssignment_2_1 ) ) ;
    public final void rule__MetamodelSpecification__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:760:1: ( ( ( rule__MetamodelSpecification__EntriesAssignment_2_1 ) ) )
            // InternalApplicationConfiguration.g:761:1: ( ( rule__MetamodelSpecification__EntriesAssignment_2_1 ) )
            {
            // InternalApplicationConfiguration.g:761:1: ( ( rule__MetamodelSpecification__EntriesAssignment_2_1 ) )
            // InternalApplicationConfiguration.g:762:2: ( rule__MetamodelSpecification__EntriesAssignment_2_1 )
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getEntriesAssignment_2_1()); 
            // InternalApplicationConfiguration.g:763:2: ( rule__MetamodelSpecification__EntriesAssignment_2_1 )
            // InternalApplicationConfiguration.g:763:3: rule__MetamodelSpecification__EntriesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelSpecification__EntriesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelSpecificationAccess().getEntriesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__Group_2__1__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group__0"
    // InternalApplicationConfiguration.g:772:1: rule__AllPackageEntry__Group__0 : rule__AllPackageEntry__Group__0__Impl rule__AllPackageEntry__Group__1 ;
    public final void rule__AllPackageEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:776:1: ( rule__AllPackageEntry__Group__0__Impl rule__AllPackageEntry__Group__1 )
            // InternalApplicationConfiguration.g:777:2: rule__AllPackageEntry__Group__0__Impl rule__AllPackageEntry__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AllPackageEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group__0"


    // $ANTLR start "rule__AllPackageEntry__Group__0__Impl"
    // InternalApplicationConfiguration.g:784:1: rule__AllPackageEntry__Group__0__Impl : ( 'package' ) ;
    public final void rule__AllPackageEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:788:1: ( ( 'package' ) )
            // InternalApplicationConfiguration.g:789:1: ( 'package' )
            {
            // InternalApplicationConfiguration.g:789:1: ( 'package' )
            // InternalApplicationConfiguration.g:790:2: 'package'
            {
             before(grammarAccess.getAllPackageEntryAccess().getPackageKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAllPackageEntryAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group__0__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group__1"
    // InternalApplicationConfiguration.g:799:1: rule__AllPackageEntry__Group__1 : rule__AllPackageEntry__Group__1__Impl rule__AllPackageEntry__Group__2 ;
    public final void rule__AllPackageEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:803:1: ( rule__AllPackageEntry__Group__1__Impl rule__AllPackageEntry__Group__2 )
            // InternalApplicationConfiguration.g:804:2: rule__AllPackageEntry__Group__1__Impl rule__AllPackageEntry__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AllPackageEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group__1"


    // $ANTLR start "rule__AllPackageEntry__Group__1__Impl"
    // InternalApplicationConfiguration.g:811:1: rule__AllPackageEntry__Group__1__Impl : ( ( rule__AllPackageEntry__PackageAssignment_1 ) ) ;
    public final void rule__AllPackageEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:815:1: ( ( ( rule__AllPackageEntry__PackageAssignment_1 ) ) )
            // InternalApplicationConfiguration.g:816:1: ( ( rule__AllPackageEntry__PackageAssignment_1 ) )
            {
            // InternalApplicationConfiguration.g:816:1: ( ( rule__AllPackageEntry__PackageAssignment_1 ) )
            // InternalApplicationConfiguration.g:817:2: ( rule__AllPackageEntry__PackageAssignment_1 )
            {
             before(grammarAccess.getAllPackageEntryAccess().getPackageAssignment_1()); 
            // InternalApplicationConfiguration.g:818:2: ( rule__AllPackageEntry__PackageAssignment_1 )
            // InternalApplicationConfiguration.g:818:3: rule__AllPackageEntry__PackageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__PackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllPackageEntryAccess().getPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group__1__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group__2"
    // InternalApplicationConfiguration.g:826:1: rule__AllPackageEntry__Group__2 : rule__AllPackageEntry__Group__2__Impl ;
    public final void rule__AllPackageEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:830:1: ( rule__AllPackageEntry__Group__2__Impl )
            // InternalApplicationConfiguration.g:831:2: rule__AllPackageEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group__2"


    // $ANTLR start "rule__AllPackageEntry__Group__2__Impl"
    // InternalApplicationConfiguration.g:837:1: rule__AllPackageEntry__Group__2__Impl : ( ( rule__AllPackageEntry__Group_2__0 )? ) ;
    public final void rule__AllPackageEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:841:1: ( ( ( rule__AllPackageEntry__Group_2__0 )? ) )
            // InternalApplicationConfiguration.g:842:1: ( ( rule__AllPackageEntry__Group_2__0 )? )
            {
            // InternalApplicationConfiguration.g:842:1: ( ( rule__AllPackageEntry__Group_2__0 )? )
            // InternalApplicationConfiguration.g:843:2: ( rule__AllPackageEntry__Group_2__0 )?
            {
             before(grammarAccess.getAllPackageEntryAccess().getGroup_2()); 
            // InternalApplicationConfiguration.g:844:2: ( rule__AllPackageEntry__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalApplicationConfiguration.g:844:3: rule__AllPackageEntry__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllPackageEntry__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllPackageEntryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group__2__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group_2__0"
    // InternalApplicationConfiguration.g:853:1: rule__AllPackageEntry__Group_2__0 : rule__AllPackageEntry__Group_2__0__Impl rule__AllPackageEntry__Group_2__1 ;
    public final void rule__AllPackageEntry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:857:1: ( rule__AllPackageEntry__Group_2__0__Impl rule__AllPackageEntry__Group_2__1 )
            // InternalApplicationConfiguration.g:858:2: rule__AllPackageEntry__Group_2__0__Impl rule__AllPackageEntry__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__AllPackageEntry__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__0"


    // $ANTLR start "rule__AllPackageEntry__Group_2__0__Impl"
    // InternalApplicationConfiguration.g:865:1: rule__AllPackageEntry__Group_2__0__Impl : ( 'excluding' ) ;
    public final void rule__AllPackageEntry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:869:1: ( ( 'excluding' ) )
            // InternalApplicationConfiguration.g:870:1: ( 'excluding' )
            {
            // InternalApplicationConfiguration.g:870:1: ( 'excluding' )
            // InternalApplicationConfiguration.g:871:2: 'excluding'
            {
             before(grammarAccess.getAllPackageEntryAccess().getExcludingKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAllPackageEntryAccess().getExcludingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__0__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group_2__1"
    // InternalApplicationConfiguration.g:880:1: rule__AllPackageEntry__Group_2__1 : rule__AllPackageEntry__Group_2__1__Impl rule__AllPackageEntry__Group_2__2 ;
    public final void rule__AllPackageEntry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:884:1: ( rule__AllPackageEntry__Group_2__1__Impl rule__AllPackageEntry__Group_2__2 )
            // InternalApplicationConfiguration.g:885:2: rule__AllPackageEntry__Group_2__1__Impl rule__AllPackageEntry__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__AllPackageEntry__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__1"


    // $ANTLR start "rule__AllPackageEntry__Group_2__1__Impl"
    // InternalApplicationConfiguration.g:892:1: rule__AllPackageEntry__Group_2__1__Impl : ( '{' ) ;
    public final void rule__AllPackageEntry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:896:1: ( ( '{' ) )
            // InternalApplicationConfiguration.g:897:1: ( '{' )
            {
            // InternalApplicationConfiguration.g:897:1: ( '{' )
            // InternalApplicationConfiguration.g:898:2: '{'
            {
             before(grammarAccess.getAllPackageEntryAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAllPackageEntryAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__1__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group_2__2"
    // InternalApplicationConfiguration.g:907:1: rule__AllPackageEntry__Group_2__2 : rule__AllPackageEntry__Group_2__2__Impl rule__AllPackageEntry__Group_2__3 ;
    public final void rule__AllPackageEntry__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:911:1: ( rule__AllPackageEntry__Group_2__2__Impl rule__AllPackageEntry__Group_2__3 )
            // InternalApplicationConfiguration.g:912:2: rule__AllPackageEntry__Group_2__2__Impl rule__AllPackageEntry__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__AllPackageEntry__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__2"


    // $ANTLR start "rule__AllPackageEntry__Group_2__2__Impl"
    // InternalApplicationConfiguration.g:919:1: rule__AllPackageEntry__Group_2__2__Impl : ( ( rule__AllPackageEntry__ExclusionAssignment_2_2 ) ) ;
    public final void rule__AllPackageEntry__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:923:1: ( ( ( rule__AllPackageEntry__ExclusionAssignment_2_2 ) ) )
            // InternalApplicationConfiguration.g:924:1: ( ( rule__AllPackageEntry__ExclusionAssignment_2_2 ) )
            {
            // InternalApplicationConfiguration.g:924:1: ( ( rule__AllPackageEntry__ExclusionAssignment_2_2 ) )
            // InternalApplicationConfiguration.g:925:2: ( rule__AllPackageEntry__ExclusionAssignment_2_2 )
            {
             before(grammarAccess.getAllPackageEntryAccess().getExclusionAssignment_2_2()); 
            // InternalApplicationConfiguration.g:926:2: ( rule__AllPackageEntry__ExclusionAssignment_2_2 )
            // InternalApplicationConfiguration.g:926:3: rule__AllPackageEntry__ExclusionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__ExclusionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAllPackageEntryAccess().getExclusionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__2__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group_2__3"
    // InternalApplicationConfiguration.g:934:1: rule__AllPackageEntry__Group_2__3 : rule__AllPackageEntry__Group_2__3__Impl rule__AllPackageEntry__Group_2__4 ;
    public final void rule__AllPackageEntry__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:938:1: ( rule__AllPackageEntry__Group_2__3__Impl rule__AllPackageEntry__Group_2__4 )
            // InternalApplicationConfiguration.g:939:2: rule__AllPackageEntry__Group_2__3__Impl rule__AllPackageEntry__Group_2__4
            {
            pushFollow(FOLLOW_10);
            rule__AllPackageEntry__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__3"


    // $ANTLR start "rule__AllPackageEntry__Group_2__3__Impl"
    // InternalApplicationConfiguration.g:946:1: rule__AllPackageEntry__Group_2__3__Impl : ( ( rule__AllPackageEntry__Group_2_3__0 )* ) ;
    public final void rule__AllPackageEntry__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:950:1: ( ( ( rule__AllPackageEntry__Group_2_3__0 )* ) )
            // InternalApplicationConfiguration.g:951:1: ( ( rule__AllPackageEntry__Group_2_3__0 )* )
            {
            // InternalApplicationConfiguration.g:951:1: ( ( rule__AllPackageEntry__Group_2_3__0 )* )
            // InternalApplicationConfiguration.g:952:2: ( rule__AllPackageEntry__Group_2_3__0 )*
            {
             before(grammarAccess.getAllPackageEntryAccess().getGroup_2_3()); 
            // InternalApplicationConfiguration.g:953:2: ( rule__AllPackageEntry__Group_2_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalApplicationConfiguration.g:953:3: rule__AllPackageEntry__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AllPackageEntry__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAllPackageEntryAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__3__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group_2__4"
    // InternalApplicationConfiguration.g:961:1: rule__AllPackageEntry__Group_2__4 : rule__AllPackageEntry__Group_2__4__Impl ;
    public final void rule__AllPackageEntry__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:965:1: ( rule__AllPackageEntry__Group_2__4__Impl )
            // InternalApplicationConfiguration.g:966:2: rule__AllPackageEntry__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__4"


    // $ANTLR start "rule__AllPackageEntry__Group_2__4__Impl"
    // InternalApplicationConfiguration.g:972:1: rule__AllPackageEntry__Group_2__4__Impl : ( '}' ) ;
    public final void rule__AllPackageEntry__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:976:1: ( ( '}' ) )
            // InternalApplicationConfiguration.g:977:1: ( '}' )
            {
            // InternalApplicationConfiguration.g:977:1: ( '}' )
            // InternalApplicationConfiguration.g:978:2: '}'
            {
             before(grammarAccess.getAllPackageEntryAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAllPackageEntryAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2__4__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group_2_3__0"
    // InternalApplicationConfiguration.g:988:1: rule__AllPackageEntry__Group_2_3__0 : rule__AllPackageEntry__Group_2_3__0__Impl rule__AllPackageEntry__Group_2_3__1 ;
    public final void rule__AllPackageEntry__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:992:1: ( rule__AllPackageEntry__Group_2_3__0__Impl rule__AllPackageEntry__Group_2_3__1 )
            // InternalApplicationConfiguration.g:993:2: rule__AllPackageEntry__Group_2_3__0__Impl rule__AllPackageEntry__Group_2_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AllPackageEntry__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2_3__0"


    // $ANTLR start "rule__AllPackageEntry__Group_2_3__0__Impl"
    // InternalApplicationConfiguration.g:1000:1: rule__AllPackageEntry__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__AllPackageEntry__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1004:1: ( ( ',' ) )
            // InternalApplicationConfiguration.g:1005:1: ( ',' )
            {
            // InternalApplicationConfiguration.g:1005:1: ( ',' )
            // InternalApplicationConfiguration.g:1006:2: ','
            {
             before(grammarAccess.getAllPackageEntryAccess().getCommaKeyword_2_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAllPackageEntryAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2_3__0__Impl"


    // $ANTLR start "rule__AllPackageEntry__Group_2_3__1"
    // InternalApplicationConfiguration.g:1015:1: rule__AllPackageEntry__Group_2_3__1 : rule__AllPackageEntry__Group_2_3__1__Impl ;
    public final void rule__AllPackageEntry__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1019:1: ( rule__AllPackageEntry__Group_2_3__1__Impl )
            // InternalApplicationConfiguration.g:1020:2: rule__AllPackageEntry__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2_3__1"


    // $ANTLR start "rule__AllPackageEntry__Group_2_3__1__Impl"
    // InternalApplicationConfiguration.g:1026:1: rule__AllPackageEntry__Group_2_3__1__Impl : ( ( rule__AllPackageEntry__ExclusionAssignment_2_3_1 ) ) ;
    public final void rule__AllPackageEntry__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1030:1: ( ( ( rule__AllPackageEntry__ExclusionAssignment_2_3_1 ) ) )
            // InternalApplicationConfiguration.g:1031:1: ( ( rule__AllPackageEntry__ExclusionAssignment_2_3_1 ) )
            {
            // InternalApplicationConfiguration.g:1031:1: ( ( rule__AllPackageEntry__ExclusionAssignment_2_3_1 ) )
            // InternalApplicationConfiguration.g:1032:2: ( rule__AllPackageEntry__ExclusionAssignment_2_3_1 )
            {
             before(grammarAccess.getAllPackageEntryAccess().getExclusionAssignment_2_3_1()); 
            // InternalApplicationConfiguration.g:1033:2: ( rule__AllPackageEntry__ExclusionAssignment_2_3_1 )
            // InternalApplicationConfiguration.g:1033:3: rule__AllPackageEntry__ExclusionAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AllPackageEntry__ExclusionAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAllPackageEntryAccess().getExclusionAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__Group_2_3__1__Impl"


    // $ANTLR start "rule__MetamodelElement__Group__0"
    // InternalApplicationConfiguration.g:1042:1: rule__MetamodelElement__Group__0 : rule__MetamodelElement__Group__0__Impl rule__MetamodelElement__Group__1 ;
    public final void rule__MetamodelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1046:1: ( rule__MetamodelElement__Group__0__Impl rule__MetamodelElement__Group__1 )
            // InternalApplicationConfiguration.g:1047:2: rule__MetamodelElement__Group__0__Impl rule__MetamodelElement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MetamodelElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group__0"


    // $ANTLR start "rule__MetamodelElement__Group__0__Impl"
    // InternalApplicationConfiguration.g:1054:1: rule__MetamodelElement__Group__0__Impl : ( ( rule__MetamodelElement__Group_0__0 )? ) ;
    public final void rule__MetamodelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1058:1: ( ( ( rule__MetamodelElement__Group_0__0 )? ) )
            // InternalApplicationConfiguration.g:1059:1: ( ( rule__MetamodelElement__Group_0__0 )? )
            {
            // InternalApplicationConfiguration.g:1059:1: ( ( rule__MetamodelElement__Group_0__0 )? )
            // InternalApplicationConfiguration.g:1060:2: ( rule__MetamodelElement__Group_0__0 )?
            {
             before(grammarAccess.getMetamodelElementAccess().getGroup_0()); 
            // InternalApplicationConfiguration.g:1061:2: ( rule__MetamodelElement__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==19) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalApplicationConfiguration.g:1061:3: rule__MetamodelElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetamodelElement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetamodelElementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group__0__Impl"


    // $ANTLR start "rule__MetamodelElement__Group__1"
    // InternalApplicationConfiguration.g:1069:1: rule__MetamodelElement__Group__1 : rule__MetamodelElement__Group__1__Impl rule__MetamodelElement__Group__2 ;
    public final void rule__MetamodelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1073:1: ( rule__MetamodelElement__Group__1__Impl rule__MetamodelElement__Group__2 )
            // InternalApplicationConfiguration.g:1074:2: rule__MetamodelElement__Group__1__Impl rule__MetamodelElement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MetamodelElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group__1"


    // $ANTLR start "rule__MetamodelElement__Group__1__Impl"
    // InternalApplicationConfiguration.g:1081:1: rule__MetamodelElement__Group__1__Impl : ( ( rule__MetamodelElement__ClassifierAssignment_1 ) ) ;
    public final void rule__MetamodelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1085:1: ( ( ( rule__MetamodelElement__ClassifierAssignment_1 ) ) )
            // InternalApplicationConfiguration.g:1086:1: ( ( rule__MetamodelElement__ClassifierAssignment_1 ) )
            {
            // InternalApplicationConfiguration.g:1086:1: ( ( rule__MetamodelElement__ClassifierAssignment_1 ) )
            // InternalApplicationConfiguration.g:1087:2: ( rule__MetamodelElement__ClassifierAssignment_1 )
            {
             before(grammarAccess.getMetamodelElementAccess().getClassifierAssignment_1()); 
            // InternalApplicationConfiguration.g:1088:2: ( rule__MetamodelElement__ClassifierAssignment_1 )
            // InternalApplicationConfiguration.g:1088:3: rule__MetamodelElement__ClassifierAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelElement__ClassifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelElementAccess().getClassifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group__1__Impl"


    // $ANTLR start "rule__MetamodelElement__Group__2"
    // InternalApplicationConfiguration.g:1096:1: rule__MetamodelElement__Group__2 : rule__MetamodelElement__Group__2__Impl ;
    public final void rule__MetamodelElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1100:1: ( rule__MetamodelElement__Group__2__Impl )
            // InternalApplicationConfiguration.g:1101:2: rule__MetamodelElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group__2"


    // $ANTLR start "rule__MetamodelElement__Group__2__Impl"
    // InternalApplicationConfiguration.g:1107:1: rule__MetamodelElement__Group__2__Impl : ( ( rule__MetamodelElement__Group_2__0 )? ) ;
    public final void rule__MetamodelElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1111:1: ( ( ( rule__MetamodelElement__Group_2__0 )? ) )
            // InternalApplicationConfiguration.g:1112:1: ( ( rule__MetamodelElement__Group_2__0 )? )
            {
            // InternalApplicationConfiguration.g:1112:1: ( ( rule__MetamodelElement__Group_2__0 )? )
            // InternalApplicationConfiguration.g:1113:2: ( rule__MetamodelElement__Group_2__0 )?
            {
             before(grammarAccess.getMetamodelElementAccess().getGroup_2()); 
            // InternalApplicationConfiguration.g:1114:2: ( rule__MetamodelElement__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalApplicationConfiguration.g:1114:3: rule__MetamodelElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetamodelElement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetamodelElementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group__2__Impl"


    // $ANTLR start "rule__MetamodelElement__Group_0__0"
    // InternalApplicationConfiguration.g:1123:1: rule__MetamodelElement__Group_0__0 : rule__MetamodelElement__Group_0__0__Impl rule__MetamodelElement__Group_0__1 ;
    public final void rule__MetamodelElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1127:1: ( rule__MetamodelElement__Group_0__0__Impl rule__MetamodelElement__Group_0__1 )
            // InternalApplicationConfiguration.g:1128:2: rule__MetamodelElement__Group_0__0__Impl rule__MetamodelElement__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__MetamodelElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_0__0"


    // $ANTLR start "rule__MetamodelElement__Group_0__0__Impl"
    // InternalApplicationConfiguration.g:1135:1: rule__MetamodelElement__Group_0__0__Impl : ( ( rule__MetamodelElement__PackageAssignment_0_0 ) ) ;
    public final void rule__MetamodelElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1139:1: ( ( ( rule__MetamodelElement__PackageAssignment_0_0 ) ) )
            // InternalApplicationConfiguration.g:1140:1: ( ( rule__MetamodelElement__PackageAssignment_0_0 ) )
            {
            // InternalApplicationConfiguration.g:1140:1: ( ( rule__MetamodelElement__PackageAssignment_0_0 ) )
            // InternalApplicationConfiguration.g:1141:2: ( rule__MetamodelElement__PackageAssignment_0_0 )
            {
             before(grammarAccess.getMetamodelElementAccess().getPackageAssignment_0_0()); 
            // InternalApplicationConfiguration.g:1142:2: ( rule__MetamodelElement__PackageAssignment_0_0 )
            // InternalApplicationConfiguration.g:1142:3: rule__MetamodelElement__PackageAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelElement__PackageAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelElementAccess().getPackageAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_0__0__Impl"


    // $ANTLR start "rule__MetamodelElement__Group_0__1"
    // InternalApplicationConfiguration.g:1150:1: rule__MetamodelElement__Group_0__1 : rule__MetamodelElement__Group_0__1__Impl ;
    public final void rule__MetamodelElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1154:1: ( rule__MetamodelElement__Group_0__1__Impl )
            // InternalApplicationConfiguration.g:1155:2: rule__MetamodelElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_0__1"


    // $ANTLR start "rule__MetamodelElement__Group_0__1__Impl"
    // InternalApplicationConfiguration.g:1161:1: rule__MetamodelElement__Group_0__1__Impl : ( '::' ) ;
    public final void rule__MetamodelElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1165:1: ( ( '::' ) )
            // InternalApplicationConfiguration.g:1166:1: ( '::' )
            {
            // InternalApplicationConfiguration.g:1166:1: ( '::' )
            // InternalApplicationConfiguration.g:1167:2: '::'
            {
             before(grammarAccess.getMetamodelElementAccess().getColonColonKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMetamodelElementAccess().getColonColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_0__1__Impl"


    // $ANTLR start "rule__MetamodelElement__Group_2__0"
    // InternalApplicationConfiguration.g:1177:1: rule__MetamodelElement__Group_2__0 : rule__MetamodelElement__Group_2__0__Impl rule__MetamodelElement__Group_2__1 ;
    public final void rule__MetamodelElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1181:1: ( rule__MetamodelElement__Group_2__0__Impl rule__MetamodelElement__Group_2__1 )
            // InternalApplicationConfiguration.g:1182:2: rule__MetamodelElement__Group_2__0__Impl rule__MetamodelElement__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__MetamodelElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_2__0"


    // $ANTLR start "rule__MetamodelElement__Group_2__0__Impl"
    // InternalApplicationConfiguration.g:1189:1: rule__MetamodelElement__Group_2__0__Impl : ( '.' ) ;
    public final void rule__MetamodelElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1193:1: ( ( '.' ) )
            // InternalApplicationConfiguration.g:1194:1: ( '.' )
            {
            // InternalApplicationConfiguration.g:1194:1: ( '.' )
            // InternalApplicationConfiguration.g:1195:2: '.'
            {
             before(grammarAccess.getMetamodelElementAccess().getFullStopKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMetamodelElementAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_2__0__Impl"


    // $ANTLR start "rule__MetamodelElement__Group_2__1"
    // InternalApplicationConfiguration.g:1204:1: rule__MetamodelElement__Group_2__1 : rule__MetamodelElement__Group_2__1__Impl ;
    public final void rule__MetamodelElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1208:1: ( rule__MetamodelElement__Group_2__1__Impl )
            // InternalApplicationConfiguration.g:1209:2: rule__MetamodelElement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelElement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_2__1"


    // $ANTLR start "rule__MetamodelElement__Group_2__1__Impl"
    // InternalApplicationConfiguration.g:1215:1: rule__MetamodelElement__Group_2__1__Impl : ( ( rule__MetamodelElement__FeatureAssignment_2_1 ) ) ;
    public final void rule__MetamodelElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1219:1: ( ( ( rule__MetamodelElement__FeatureAssignment_2_1 ) ) )
            // InternalApplicationConfiguration.g:1220:1: ( ( rule__MetamodelElement__FeatureAssignment_2_1 ) )
            {
            // InternalApplicationConfiguration.g:1220:1: ( ( rule__MetamodelElement__FeatureAssignment_2_1 ) )
            // InternalApplicationConfiguration.g:1221:2: ( rule__MetamodelElement__FeatureAssignment_2_1 )
            {
             before(grammarAccess.getMetamodelElementAccess().getFeatureAssignment_2_1()); 
            // InternalApplicationConfiguration.g:1222:2: ( rule__MetamodelElement__FeatureAssignment_2_1 )
            // InternalApplicationConfiguration.g:1222:3: rule__MetamodelElement__FeatureAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelElement__FeatureAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelElementAccess().getFeatureAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__Group_2__1__Impl"


    // $ANTLR start "rule__MetamodelDeclaration__Group__0"
    // InternalApplicationConfiguration.g:1231:1: rule__MetamodelDeclaration__Group__0 : rule__MetamodelDeclaration__Group__0__Impl rule__MetamodelDeclaration__Group__1 ;
    public final void rule__MetamodelDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1235:1: ( rule__MetamodelDeclaration__Group__0__Impl rule__MetamodelDeclaration__Group__1 )
            // InternalApplicationConfiguration.g:1236:2: rule__MetamodelDeclaration__Group__0__Impl rule__MetamodelDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MetamodelDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__Group__0"


    // $ANTLR start "rule__MetamodelDeclaration__Group__0__Impl"
    // InternalApplicationConfiguration.g:1243:1: rule__MetamodelDeclaration__Group__0__Impl : ( 'metamodel' ) ;
    public final void rule__MetamodelDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1247:1: ( ( 'metamodel' ) )
            // InternalApplicationConfiguration.g:1248:1: ( 'metamodel' )
            {
            // InternalApplicationConfiguration.g:1248:1: ( 'metamodel' )
            // InternalApplicationConfiguration.g:1249:2: 'metamodel'
            {
             before(grammarAccess.getMetamodelDeclarationAccess().getMetamodelKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMetamodelDeclarationAccess().getMetamodelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__Group__0__Impl"


    // $ANTLR start "rule__MetamodelDeclaration__Group__1"
    // InternalApplicationConfiguration.g:1258:1: rule__MetamodelDeclaration__Group__1 : rule__MetamodelDeclaration__Group__1__Impl rule__MetamodelDeclaration__Group__2 ;
    public final void rule__MetamodelDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1262:1: ( rule__MetamodelDeclaration__Group__1__Impl rule__MetamodelDeclaration__Group__2 )
            // InternalApplicationConfiguration.g:1263:2: rule__MetamodelDeclaration__Group__1__Impl rule__MetamodelDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MetamodelDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetamodelDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__Group__1"


    // $ANTLR start "rule__MetamodelDeclaration__Group__1__Impl"
    // InternalApplicationConfiguration.g:1270:1: rule__MetamodelDeclaration__Group__1__Impl : ( ( rule__MetamodelDeclaration__NameAssignment_1 ) ) ;
    public final void rule__MetamodelDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1274:1: ( ( ( rule__MetamodelDeclaration__NameAssignment_1 ) ) )
            // InternalApplicationConfiguration.g:1275:1: ( ( rule__MetamodelDeclaration__NameAssignment_1 ) )
            {
            // InternalApplicationConfiguration.g:1275:1: ( ( rule__MetamodelDeclaration__NameAssignment_1 ) )
            // InternalApplicationConfiguration.g:1276:2: ( rule__MetamodelDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getMetamodelDeclarationAccess().getNameAssignment_1()); 
            // InternalApplicationConfiguration.g:1277:2: ( rule__MetamodelDeclaration__NameAssignment_1 )
            // InternalApplicationConfiguration.g:1277:3: rule__MetamodelDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MetamodelDeclaration__Group__2"
    // InternalApplicationConfiguration.g:1285:1: rule__MetamodelDeclaration__Group__2 : rule__MetamodelDeclaration__Group__2__Impl ;
    public final void rule__MetamodelDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1289:1: ( rule__MetamodelDeclaration__Group__2__Impl )
            // InternalApplicationConfiguration.g:1290:2: rule__MetamodelDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__Group__2"


    // $ANTLR start "rule__MetamodelDeclaration__Group__2__Impl"
    // InternalApplicationConfiguration.g:1296:1: rule__MetamodelDeclaration__Group__2__Impl : ( ( rule__MetamodelDeclaration__SpecificationAssignment_2 ) ) ;
    public final void rule__MetamodelDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1300:1: ( ( ( rule__MetamodelDeclaration__SpecificationAssignment_2 ) ) )
            // InternalApplicationConfiguration.g:1301:1: ( ( rule__MetamodelDeclaration__SpecificationAssignment_2 ) )
            {
            // InternalApplicationConfiguration.g:1301:1: ( ( rule__MetamodelDeclaration__SpecificationAssignment_2 ) )
            // InternalApplicationConfiguration.g:1302:2: ( rule__MetamodelDeclaration__SpecificationAssignment_2 )
            {
             before(grammarAccess.getMetamodelDeclarationAccess().getSpecificationAssignment_2()); 
            // InternalApplicationConfiguration.g:1303:2: ( rule__MetamodelDeclaration__SpecificationAssignment_2 )
            // InternalApplicationConfiguration.g:1303:3: rule__MetamodelDeclaration__SpecificationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MetamodelDeclaration__SpecificationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelDeclarationAccess().getSpecificationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationScript__ImportsAssignment_0"
    // InternalApplicationConfiguration.g:1312:1: rule__ConfigurationScript__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__ConfigurationScript__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1316:1: ( ( ruleImport ) )
            // InternalApplicationConfiguration.g:1317:2: ( ruleImport )
            {
            // InternalApplicationConfiguration.g:1317:2: ( ruleImport )
            // InternalApplicationConfiguration.g:1318:3: ruleImport
            {
             before(grammarAccess.getConfigurationScriptAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getConfigurationScriptAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationScript__ImportsAssignment_0"


    // $ANTLR start "rule__ConfigurationScript__CommandsAssignment_1"
    // InternalApplicationConfiguration.g:1327:1: rule__ConfigurationScript__CommandsAssignment_1 : ( ruleCommand ) ;
    public final void rule__ConfigurationScript__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1331:1: ( ( ruleCommand ) )
            // InternalApplicationConfiguration.g:1332:2: ( ruleCommand )
            {
            // InternalApplicationConfiguration.g:1332:2: ( ruleCommand )
            // InternalApplicationConfiguration.g:1333:3: ruleCommand
            {
             before(grammarAccess.getConfigurationScriptAccess().getCommandsCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getConfigurationScriptAccess().getCommandsCommandParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationScript__CommandsAssignment_1"


    // $ANTLR start "rule__EPackageImport__ImportedPackageAssignment_2"
    // InternalApplicationConfiguration.g:1342:1: rule__EPackageImport__ImportedPackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__EPackageImport__ImportedPackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1346:1: ( ( ( RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:1347:2: ( ( RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:1347:2: ( ( RULE_STRING ) )
            // InternalApplicationConfiguration.g:1348:3: ( RULE_STRING )
            {
             before(grammarAccess.getEPackageImportAccess().getImportedPackageEPackageCrossReference_2_0()); 
            // InternalApplicationConfiguration.g:1349:3: ( RULE_STRING )
            // InternalApplicationConfiguration.g:1350:4: RULE_STRING
            {
             before(grammarAccess.getEPackageImportAccess().getImportedPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEPackageImportAccess().getImportedPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEPackageImportAccess().getImportedPackageEPackageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EPackageImport__ImportedPackageAssignment_2"


    // $ANTLR start "rule__ViatraImport__ImportedViatraAssignment_2"
    // InternalApplicationConfiguration.g:1361:1: rule__ViatraImport__ImportedViatraAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ViatraImport__ImportedViatraAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1365:1: ( ( ( RULE_STRING ) ) )
            // InternalApplicationConfiguration.g:1366:2: ( ( RULE_STRING ) )
            {
            // InternalApplicationConfiguration.g:1366:2: ( ( RULE_STRING ) )
            // InternalApplicationConfiguration.g:1367:3: ( RULE_STRING )
            {
             before(grammarAccess.getViatraImportAccess().getImportedViatraPatternModelCrossReference_2_0()); 
            // InternalApplicationConfiguration.g:1368:3: ( RULE_STRING )
            // InternalApplicationConfiguration.g:1369:4: RULE_STRING
            {
             before(grammarAccess.getViatraImportAccess().getImportedViatraPatternModelSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViatraImportAccess().getImportedViatraPatternModelSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getViatraImportAccess().getImportedViatraPatternModelCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViatraImport__ImportedViatraAssignment_2"


    // $ANTLR start "rule__MetamodelSpecification__EntriesAssignment_1"
    // InternalApplicationConfiguration.g:1380:1: rule__MetamodelSpecification__EntriesAssignment_1 : ( ruleMetamodelEntry ) ;
    public final void rule__MetamodelSpecification__EntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1384:1: ( ( ruleMetamodelEntry ) )
            // InternalApplicationConfiguration.g:1385:2: ( ruleMetamodelEntry )
            {
            // InternalApplicationConfiguration.g:1385:2: ( ruleMetamodelEntry )
            // InternalApplicationConfiguration.g:1386:3: ruleMetamodelEntry
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodelEntry();

            state._fsp--;

             after(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__EntriesAssignment_1"


    // $ANTLR start "rule__MetamodelSpecification__EntriesAssignment_2_1"
    // InternalApplicationConfiguration.g:1395:1: rule__MetamodelSpecification__EntriesAssignment_2_1 : ( ruleMetamodelEntry ) ;
    public final void rule__MetamodelSpecification__EntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1399:1: ( ( ruleMetamodelEntry ) )
            // InternalApplicationConfiguration.g:1400:2: ( ruleMetamodelEntry )
            {
            // InternalApplicationConfiguration.g:1400:2: ( ruleMetamodelEntry )
            // InternalApplicationConfiguration.g:1401:3: ruleMetamodelEntry
            {
             before(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodelEntry();

            state._fsp--;

             after(grammarAccess.getMetamodelSpecificationAccess().getEntriesMetamodelEntryParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSpecification__EntriesAssignment_2_1"


    // $ANTLR start "rule__AllPackageEntry__PackageAssignment_1"
    // InternalApplicationConfiguration.g:1410:1: rule__AllPackageEntry__PackageAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllPackageEntry__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1414:1: ( ( ( RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1415:2: ( ( RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1415:2: ( ( RULE_ID ) )
            // InternalApplicationConfiguration.g:1416:3: ( RULE_ID )
            {
             before(grammarAccess.getAllPackageEntryAccess().getPackageEPackageCrossReference_1_0()); 
            // InternalApplicationConfiguration.g:1417:3: ( RULE_ID )
            // InternalApplicationConfiguration.g:1418:4: RULE_ID
            {
             before(grammarAccess.getAllPackageEntryAccess().getPackageEPackageIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllPackageEntryAccess().getPackageEPackageIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAllPackageEntryAccess().getPackageEPackageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__PackageAssignment_1"


    // $ANTLR start "rule__AllPackageEntry__ExclusionAssignment_2_2"
    // InternalApplicationConfiguration.g:1429:1: rule__AllPackageEntry__ExclusionAssignment_2_2 : ( ruleMetamodelElement ) ;
    public final void rule__AllPackageEntry__ExclusionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1433:1: ( ( ruleMetamodelElement ) )
            // InternalApplicationConfiguration.g:1434:2: ( ruleMetamodelElement )
            {
            // InternalApplicationConfiguration.g:1434:2: ( ruleMetamodelElement )
            // InternalApplicationConfiguration.g:1435:3: ruleMetamodelElement
            {
             before(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodelElement();

            state._fsp--;

             after(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__ExclusionAssignment_2_2"


    // $ANTLR start "rule__AllPackageEntry__ExclusionAssignment_2_3_1"
    // InternalApplicationConfiguration.g:1444:1: rule__AllPackageEntry__ExclusionAssignment_2_3_1 : ( ruleMetamodelElement ) ;
    public final void rule__AllPackageEntry__ExclusionAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1448:1: ( ( ruleMetamodelElement ) )
            // InternalApplicationConfiguration.g:1449:2: ( ruleMetamodelElement )
            {
            // InternalApplicationConfiguration.g:1449:2: ( ruleMetamodelElement )
            // InternalApplicationConfiguration.g:1450:3: ruleMetamodelElement
            {
             before(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodelElement();

            state._fsp--;

             after(grammarAccess.getAllPackageEntryAccess().getExclusionMetamodelElementParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllPackageEntry__ExclusionAssignment_2_3_1"


    // $ANTLR start "rule__MetamodelElement__PackageAssignment_0_0"
    // InternalApplicationConfiguration.g:1459:1: rule__MetamodelElement__PackageAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__MetamodelElement__PackageAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1463:1: ( ( ( RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1464:2: ( ( RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1464:2: ( ( RULE_ID ) )
            // InternalApplicationConfiguration.g:1465:3: ( RULE_ID )
            {
             before(grammarAccess.getMetamodelElementAccess().getPackageEPackageCrossReference_0_0_0()); 
            // InternalApplicationConfiguration.g:1466:3: ( RULE_ID )
            // InternalApplicationConfiguration.g:1467:4: RULE_ID
            {
             before(grammarAccess.getMetamodelElementAccess().getPackageEPackageIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetamodelElementAccess().getPackageEPackageIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getMetamodelElementAccess().getPackageEPackageCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__PackageAssignment_0_0"


    // $ANTLR start "rule__MetamodelElement__ClassifierAssignment_1"
    // InternalApplicationConfiguration.g:1478:1: rule__MetamodelElement__ClassifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MetamodelElement__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1482:1: ( ( ( RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1483:2: ( ( RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1483:2: ( ( RULE_ID ) )
            // InternalApplicationConfiguration.g:1484:3: ( RULE_ID )
            {
             before(grammarAccess.getMetamodelElementAccess().getClassifierEClassifierCrossReference_1_0()); 
            // InternalApplicationConfiguration.g:1485:3: ( RULE_ID )
            // InternalApplicationConfiguration.g:1486:4: RULE_ID
            {
             before(grammarAccess.getMetamodelElementAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetamodelElementAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMetamodelElementAccess().getClassifierEClassifierCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__ClassifierAssignment_1"


    // $ANTLR start "rule__MetamodelElement__FeatureAssignment_2_1"
    // InternalApplicationConfiguration.g:1497:1: rule__MetamodelElement__FeatureAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MetamodelElement__FeatureAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1501:1: ( ( ( RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1502:2: ( ( RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1502:2: ( ( RULE_ID ) )
            // InternalApplicationConfiguration.g:1503:3: ( RULE_ID )
            {
             before(grammarAccess.getMetamodelElementAccess().getFeatureENamedElementCrossReference_2_1_0()); 
            // InternalApplicationConfiguration.g:1504:3: ( RULE_ID )
            // InternalApplicationConfiguration.g:1505:4: RULE_ID
            {
             before(grammarAccess.getMetamodelElementAccess().getFeatureENamedElementIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetamodelElementAccess().getFeatureENamedElementIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMetamodelElementAccess().getFeatureENamedElementCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelElement__FeatureAssignment_2_1"


    // $ANTLR start "rule__MetamodelDeclaration__NameAssignment_1"
    // InternalApplicationConfiguration.g:1516:1: rule__MetamodelDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MetamodelDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1520:1: ( ( RULE_ID ) )
            // InternalApplicationConfiguration.g:1521:2: ( RULE_ID )
            {
            // InternalApplicationConfiguration.g:1521:2: ( RULE_ID )
            // InternalApplicationConfiguration.g:1522:3: RULE_ID
            {
             before(grammarAccess.getMetamodelDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetamodelDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__NameAssignment_1"


    // $ANTLR start "rule__MetamodelDeclaration__SpecificationAssignment_2"
    // InternalApplicationConfiguration.g:1531:1: rule__MetamodelDeclaration__SpecificationAssignment_2 : ( ruleMetamodelSpecification ) ;
    public final void rule__MetamodelDeclaration__SpecificationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1535:1: ( ( ruleMetamodelSpecification ) )
            // InternalApplicationConfiguration.g:1536:2: ( ruleMetamodelSpecification )
            {
            // InternalApplicationConfiguration.g:1536:2: ( ruleMetamodelSpecification )
            // InternalApplicationConfiguration.g:1537:3: ruleMetamodelSpecification
            {
             before(grammarAccess.getMetamodelDeclarationAccess().getSpecificationMetamodelSpecificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodelSpecification();

            state._fsp--;

             after(grammarAccess.getMetamodelDeclarationAccess().getSpecificationMetamodelSpecificationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelDeclaration__SpecificationAssignment_2"


    // $ANTLR start "rule__MetamodelReference__ReferredAssignment"
    // InternalApplicationConfiguration.g:1546:1: rule__MetamodelReference__ReferredAssignment : ( ( RULE_ID ) ) ;
    public final void rule__MetamodelReference__ReferredAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApplicationConfiguration.g:1550:1: ( ( ( RULE_ID ) ) )
            // InternalApplicationConfiguration.g:1551:2: ( ( RULE_ID ) )
            {
            // InternalApplicationConfiguration.g:1551:2: ( ( RULE_ID ) )
            // InternalApplicationConfiguration.g:1552:3: ( RULE_ID )
            {
             before(grammarAccess.getMetamodelReferenceAccess().getReferredMetamodelDeclarationCrossReference_0()); 
            // InternalApplicationConfiguration.g:1553:3: ( RULE_ID )
            // InternalApplicationConfiguration.g:1554:4: RULE_ID
            {
             before(grammarAccess.getMetamodelReferenceAccess().getReferredMetamodelDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetamodelReferenceAccess().getReferredMetamodelDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getMetamodelReferenceAccess().getReferredMetamodelDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelReference__ReferredAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});

}