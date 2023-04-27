package org.xtext.projet1.ide.contentassist.antlr.internal;

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
import org.xtext.projet1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bar'", "'Line'", "'Nuage de point'", "'median'", "'sum'", "'mean'", "'min'", "'max'", "'count'", "'std'", "'var'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='", "'NameDashboard'", "':'", "'CSV'", "'Delimiter'", "'TypeOfGraph'", "'Abscissa'", "'Ordinate(s)'", "'Color(s)'", "'graph'", "'Transformation'", "'in'", "'TitleAxeX'", "'TitleAxeY'", "'Group'", "'by'", "'NotNull'", "'ComparisonColumnsWithString'", "'ComparisonColumnsWithNumber'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDashboard"
    // InternalMyDsl.g:53:1: entryRuleDashboard : ruleDashboard EOF ;
    public final void entryRuleDashboard() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDashboard EOF )
            // InternalMyDsl.g:55:1: ruleDashboard EOF
            {
             before(grammarAccess.getDashboardRule()); 
            pushFollow(FOLLOW_1);
            ruleDashboard();

            state._fsp--;

             after(grammarAccess.getDashboardRule()); 
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
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // InternalMyDsl.g:62:1: ruleDashboard : ( ( rule__Dashboard__Group__0 ) ) ;
    public final void ruleDashboard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Dashboard__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Dashboard__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Dashboard__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Dashboard__Group__0 )
            {
             before(grammarAccess.getDashboardAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Dashboard__Group__0 )
            // InternalMyDsl.g:69:4: rule__Dashboard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getGroup()); 

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
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRuleGraphRealisation"
    // InternalMyDsl.g:78:1: entryRuleGraphRealisation : ruleGraphRealisation EOF ;
    public final void entryRuleGraphRealisation() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleGraphRealisation EOF )
            // InternalMyDsl.g:80:1: ruleGraphRealisation EOF
            {
             before(grammarAccess.getGraphRealisationRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphRealisation();

            state._fsp--;

             after(grammarAccess.getGraphRealisationRule()); 
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
    // $ANTLR end "entryRuleGraphRealisation"


    // $ANTLR start "ruleGraphRealisation"
    // InternalMyDsl.g:87:1: ruleGraphRealisation : ( ( rule__GraphRealisation__Group__0 ) ) ;
    public final void ruleGraphRealisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__GraphRealisation__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__GraphRealisation__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__GraphRealisation__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__GraphRealisation__Group__0 )
            {
             before(grammarAccess.getGraphRealisationAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__GraphRealisation__Group__0 )
            // InternalMyDsl.g:94:4: rule__GraphRealisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphRealisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphRealisationAccess().getGroup()); 

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
    // $ANTLR end "ruleGraphRealisation"


    // $ANTLR start "entryRuleImportFile"
    // InternalMyDsl.g:103:1: entryRuleImportFile : ruleImportFile EOF ;
    public final void entryRuleImportFile() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleImportFile EOF )
            // InternalMyDsl.g:105:1: ruleImportFile EOF
            {
             before(grammarAccess.getImportFileRule()); 
            pushFollow(FOLLOW_1);
            ruleImportFile();

            state._fsp--;

             after(grammarAccess.getImportFileRule()); 
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
    // $ANTLR end "entryRuleImportFile"


    // $ANTLR start "ruleImportFile"
    // InternalMyDsl.g:112:1: ruleImportFile : ( ( rule__ImportFile__Group__0 ) ) ;
    public final void ruleImportFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ImportFile__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ImportFile__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ImportFile__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ImportFile__Group__0 )
            {
             before(grammarAccess.getImportFileAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ImportFile__Group__0 )
            // InternalMyDsl.g:119:4: rule__ImportFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportFileAccess().getGroup()); 

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
    // $ANTLR end "ruleImportFile"


    // $ANTLR start "entryRuleGraphMaker"
    // InternalMyDsl.g:128:1: entryRuleGraphMaker : ruleGraphMaker EOF ;
    public final void entryRuleGraphMaker() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleGraphMaker EOF )
            // InternalMyDsl.g:130:1: ruleGraphMaker EOF
            {
             before(grammarAccess.getGraphMakerRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphMaker();

            state._fsp--;

             after(grammarAccess.getGraphMakerRule()); 
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
    // $ANTLR end "entryRuleGraphMaker"


    // $ANTLR start "ruleGraphMaker"
    // InternalMyDsl.g:137:1: ruleGraphMaker : ( ( rule__GraphMaker__Group__0 ) ) ;
    public final void ruleGraphMaker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__GraphMaker__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__GraphMaker__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__GraphMaker__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__GraphMaker__Group__0 )
            {
             before(grammarAccess.getGraphMakerAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__GraphMaker__Group__0 )
            // InternalMyDsl.g:144:4: rule__GraphMaker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphMakerAccess().getGroup()); 

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
    // $ANTLR end "ruleGraphMaker"


    // $ANTLR start "entryRuleGraphUpdate"
    // InternalMyDsl.g:153:1: entryRuleGraphUpdate : ruleGraphUpdate EOF ;
    public final void entryRuleGraphUpdate() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleGraphUpdate EOF )
            // InternalMyDsl.g:155:1: ruleGraphUpdate EOF
            {
             before(grammarAccess.getGraphUpdateRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphUpdate();

            state._fsp--;

             after(grammarAccess.getGraphUpdateRule()); 
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
    // $ANTLR end "entryRuleGraphUpdate"


    // $ANTLR start "ruleGraphUpdate"
    // InternalMyDsl.g:162:1: ruleGraphUpdate : ( ( rule__GraphUpdate__Alternatives ) ) ;
    public final void ruleGraphUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__GraphUpdate__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__GraphUpdate__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__GraphUpdate__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__GraphUpdate__Alternatives )
            {
             before(grammarAccess.getGraphUpdateAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__GraphUpdate__Alternatives )
            // InternalMyDsl.g:169:4: rule__GraphUpdate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphUpdate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphUpdateAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGraphUpdate"


    // $ANTLR start "entryRuleUpdateCouleurGraph"
    // InternalMyDsl.g:178:1: entryRuleUpdateCouleurGraph : ruleUpdateCouleurGraph EOF ;
    public final void entryRuleUpdateCouleurGraph() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleUpdateCouleurGraph EOF )
            // InternalMyDsl.g:180:1: ruleUpdateCouleurGraph EOF
            {
             before(grammarAccess.getUpdateCouleurGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateCouleurGraph();

            state._fsp--;

             after(grammarAccess.getUpdateCouleurGraphRule()); 
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
    // $ANTLR end "entryRuleUpdateCouleurGraph"


    // $ANTLR start "ruleUpdateCouleurGraph"
    // InternalMyDsl.g:187:1: ruleUpdateCouleurGraph : ( ( rule__UpdateCouleurGraph__Group__0 ) ) ;
    public final void ruleUpdateCouleurGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__UpdateCouleurGraph__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__UpdateCouleurGraph__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__UpdateCouleurGraph__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__UpdateCouleurGraph__Group__0 )
            {
             before(grammarAccess.getUpdateCouleurGraphAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__UpdateCouleurGraph__Group__0 )
            // InternalMyDsl.g:194:4: rule__UpdateCouleurGraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateCouleurGraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateCouleurGraphAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdateCouleurGraph"


    // $ANTLR start "entryRuleUpdateNameLegend"
    // InternalMyDsl.g:203:1: entryRuleUpdateNameLegend : ruleUpdateNameLegend EOF ;
    public final void entryRuleUpdateNameLegend() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleUpdateNameLegend EOF )
            // InternalMyDsl.g:205:1: ruleUpdateNameLegend EOF
            {
             before(grammarAccess.getUpdateNameLegendRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateNameLegend();

            state._fsp--;

             after(grammarAccess.getUpdateNameLegendRule()); 
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
    // $ANTLR end "entryRuleUpdateNameLegend"


    // $ANTLR start "ruleUpdateNameLegend"
    // InternalMyDsl.g:212:1: ruleUpdateNameLegend : ( ( rule__UpdateNameLegend__Group__0 ) ) ;
    public final void ruleUpdateNameLegend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__UpdateNameLegend__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__UpdateNameLegend__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__UpdateNameLegend__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__UpdateNameLegend__Group__0 )
            {
             before(grammarAccess.getUpdateNameLegendAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__UpdateNameLegend__Group__0 )
            // InternalMyDsl.g:219:4: rule__UpdateNameLegend__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameLegend__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateNameLegendAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdateNameLegend"


    // $ANTLR start "entryRuleUpdateNameAxeX"
    // InternalMyDsl.g:228:1: entryRuleUpdateNameAxeX : ruleUpdateNameAxeX EOF ;
    public final void entryRuleUpdateNameAxeX() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleUpdateNameAxeX EOF )
            // InternalMyDsl.g:230:1: ruleUpdateNameAxeX EOF
            {
             before(grammarAccess.getUpdateNameAxeXRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateNameAxeX();

            state._fsp--;

             after(grammarAccess.getUpdateNameAxeXRule()); 
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
    // $ANTLR end "entryRuleUpdateNameAxeX"


    // $ANTLR start "ruleUpdateNameAxeX"
    // InternalMyDsl.g:237:1: ruleUpdateNameAxeX : ( ( rule__UpdateNameAxeX__Group__0 ) ) ;
    public final void ruleUpdateNameAxeX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__UpdateNameAxeX__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__UpdateNameAxeX__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__UpdateNameAxeX__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__UpdateNameAxeX__Group__0 )
            {
             before(grammarAccess.getUpdateNameAxeXAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__UpdateNameAxeX__Group__0 )
            // InternalMyDsl.g:244:4: rule__UpdateNameAxeX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateNameAxeXAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdateNameAxeX"


    // $ANTLR start "entryRuleUpdateNameAxeY"
    // InternalMyDsl.g:253:1: entryRuleUpdateNameAxeY : ruleUpdateNameAxeY EOF ;
    public final void entryRuleUpdateNameAxeY() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleUpdateNameAxeY EOF )
            // InternalMyDsl.g:255:1: ruleUpdateNameAxeY EOF
            {
             before(grammarAccess.getUpdateNameAxeYRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateNameAxeY();

            state._fsp--;

             after(grammarAccess.getUpdateNameAxeYRule()); 
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
    // $ANTLR end "entryRuleUpdateNameAxeY"


    // $ANTLR start "ruleUpdateNameAxeY"
    // InternalMyDsl.g:262:1: ruleUpdateNameAxeY : ( ( rule__UpdateNameAxeY__Group__0 ) ) ;
    public final void ruleUpdateNameAxeY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__UpdateNameAxeY__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__UpdateNameAxeY__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__UpdateNameAxeY__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__UpdateNameAxeY__Group__0 )
            {
             before(grammarAccess.getUpdateNameAxeYAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__UpdateNameAxeY__Group__0 )
            // InternalMyDsl.g:269:4: rule__UpdateNameAxeY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateNameAxeYAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdateNameAxeY"


    // $ANTLR start "entryRuleFilterData"
    // InternalMyDsl.g:278:1: entryRuleFilterData : ruleFilterData EOF ;
    public final void entryRuleFilterData() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleFilterData EOF )
            // InternalMyDsl.g:280:1: ruleFilterData EOF
            {
             before(grammarAccess.getFilterDataRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterData();

            state._fsp--;

             after(grammarAccess.getFilterDataRule()); 
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
    // $ANTLR end "entryRuleFilterData"


    // $ANTLR start "ruleFilterData"
    // InternalMyDsl.g:287:1: ruleFilterData : ( ( rule__FilterData__Alternatives ) ) ;
    public final void ruleFilterData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__FilterData__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__FilterData__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__FilterData__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__FilterData__Alternatives )
            {
             before(grammarAccess.getFilterDataAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__FilterData__Alternatives )
            // InternalMyDsl.g:294:4: rule__FilterData__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterData__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterDataAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFilterData"


    // $ANTLR start "entryRuleFilterGroupBy"
    // InternalMyDsl.g:303:1: entryRuleFilterGroupBy : ruleFilterGroupBy EOF ;
    public final void entryRuleFilterGroupBy() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleFilterGroupBy EOF )
            // InternalMyDsl.g:305:1: ruleFilterGroupBy EOF
            {
             before(grammarAccess.getFilterGroupByRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterGroupBy();

            state._fsp--;

             after(grammarAccess.getFilterGroupByRule()); 
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
    // $ANTLR end "entryRuleFilterGroupBy"


    // $ANTLR start "ruleFilterGroupBy"
    // InternalMyDsl.g:312:1: ruleFilterGroupBy : ( ( rule__FilterGroupBy__Group__0 ) ) ;
    public final void ruleFilterGroupBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__FilterGroupBy__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__FilterGroupBy__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__FilterGroupBy__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__FilterGroupBy__Group__0 )
            {
             before(grammarAccess.getFilterGroupByAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__FilterGroupBy__Group__0 )
            // InternalMyDsl.g:319:4: rule__FilterGroupBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterGroupByAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterGroupBy"


    // $ANTLR start "entryRuleFilterNotNull"
    // InternalMyDsl.g:328:1: entryRuleFilterNotNull : ruleFilterNotNull EOF ;
    public final void entryRuleFilterNotNull() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleFilterNotNull EOF )
            // InternalMyDsl.g:330:1: ruleFilterNotNull EOF
            {
             before(grammarAccess.getFilterNotNullRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterNotNull();

            state._fsp--;

             after(grammarAccess.getFilterNotNullRule()); 
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
    // $ANTLR end "entryRuleFilterNotNull"


    // $ANTLR start "ruleFilterNotNull"
    // InternalMyDsl.g:337:1: ruleFilterNotNull : ( ( rule__FilterNotNull__Group__0 ) ) ;
    public final void ruleFilterNotNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__FilterNotNull__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__FilterNotNull__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__FilterNotNull__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__FilterNotNull__Group__0 )
            {
             before(grammarAccess.getFilterNotNullAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__FilterNotNull__Group__0 )
            // InternalMyDsl.g:344:4: rule__FilterNotNull__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterNotNull__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterNotNullAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterNotNull"


    // $ANTLR start "entryRuleFilterCompare"
    // InternalMyDsl.g:353:1: entryRuleFilterCompare : ruleFilterCompare EOF ;
    public final void entryRuleFilterCompare() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleFilterCompare EOF )
            // InternalMyDsl.g:355:1: ruleFilterCompare EOF
            {
             before(grammarAccess.getFilterCompareRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterCompare();

            state._fsp--;

             after(grammarAccess.getFilterCompareRule()); 
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
    // $ANTLR end "entryRuleFilterCompare"


    // $ANTLR start "ruleFilterCompare"
    // InternalMyDsl.g:362:1: ruleFilterCompare : ( ( rule__FilterCompare__Alternatives ) ) ;
    public final void ruleFilterCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__FilterCompare__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__FilterCompare__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__FilterCompare__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__FilterCompare__Alternatives )
            {
             before(grammarAccess.getFilterCompareAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__FilterCompare__Alternatives )
            // InternalMyDsl.g:369:4: rule__FilterCompare__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterCompare__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterCompareAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFilterCompare"


    // $ANTLR start "entryRuleCompareQuali"
    // InternalMyDsl.g:378:1: entryRuleCompareQuali : ruleCompareQuali EOF ;
    public final void entryRuleCompareQuali() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleCompareQuali EOF )
            // InternalMyDsl.g:380:1: ruleCompareQuali EOF
            {
             before(grammarAccess.getCompareQualiRule()); 
            pushFollow(FOLLOW_1);
            ruleCompareQuali();

            state._fsp--;

             after(grammarAccess.getCompareQualiRule()); 
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
    // $ANTLR end "entryRuleCompareQuali"


    // $ANTLR start "ruleCompareQuali"
    // InternalMyDsl.g:387:1: ruleCompareQuali : ( ( rule__CompareQuali__Group__0 ) ) ;
    public final void ruleCompareQuali() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__CompareQuali__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__CompareQuali__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__CompareQuali__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__CompareQuali__Group__0 )
            {
             before(grammarAccess.getCompareQualiAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__CompareQuali__Group__0 )
            // InternalMyDsl.g:394:4: rule__CompareQuali__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuali__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareQualiAccess().getGroup()); 

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
    // $ANTLR end "ruleCompareQuali"


    // $ANTLR start "entryRuleCompareQuanti"
    // InternalMyDsl.g:403:1: entryRuleCompareQuanti : ruleCompareQuanti EOF ;
    public final void entryRuleCompareQuanti() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleCompareQuanti EOF )
            // InternalMyDsl.g:405:1: ruleCompareQuanti EOF
            {
             before(grammarAccess.getCompareQuantiRule()); 
            pushFollow(FOLLOW_1);
            ruleCompareQuanti();

            state._fsp--;

             after(grammarAccess.getCompareQuantiRule()); 
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
    // $ANTLR end "entryRuleCompareQuanti"


    // $ANTLR start "ruleCompareQuanti"
    // InternalMyDsl.g:412:1: ruleCompareQuanti : ( ( rule__CompareQuanti__Group__0 ) ) ;
    public final void ruleCompareQuanti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__CompareQuanti__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__CompareQuanti__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__CompareQuanti__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__CompareQuanti__Group__0 )
            {
             before(grammarAccess.getCompareQuantiAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__CompareQuanti__Group__0 )
            // InternalMyDsl.g:419:4: rule__CompareQuanti__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuanti__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareQuantiAccess().getGroup()); 

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
    // $ANTLR end "ruleCompareQuanti"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:428:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleEString EOF )
            // InternalMyDsl.g:430:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:437:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( RULE_STRING ) )
            // InternalMyDsl.g:442:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:442:2: ( RULE_STRING )
            // InternalMyDsl.g:443:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleTypeGraph"
    // InternalMyDsl.g:453:1: ruleTypeGraph : ( ( rule__TypeGraph__Alternatives ) ) ;
    public final void ruleTypeGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( ( rule__TypeGraph__Alternatives ) ) )
            // InternalMyDsl.g:458:2: ( ( rule__TypeGraph__Alternatives ) )
            {
            // InternalMyDsl.g:458:2: ( ( rule__TypeGraph__Alternatives ) )
            // InternalMyDsl.g:459:3: ( rule__TypeGraph__Alternatives )
            {
             before(grammarAccess.getTypeGraphAccess().getAlternatives()); 
            // InternalMyDsl.g:460:3: ( rule__TypeGraph__Alternatives )
            // InternalMyDsl.g:460:4: rule__TypeGraph__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeGraph__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeGraphAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeGraph"


    // $ANTLR start "ruleFonctionAgregation"
    // InternalMyDsl.g:469:1: ruleFonctionAgregation : ( ( rule__FonctionAgregation__Alternatives ) ) ;
    public final void ruleFonctionAgregation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ( rule__FonctionAgregation__Alternatives ) ) )
            // InternalMyDsl.g:474:2: ( ( rule__FonctionAgregation__Alternatives ) )
            {
            // InternalMyDsl.g:474:2: ( ( rule__FonctionAgregation__Alternatives ) )
            // InternalMyDsl.g:475:3: ( rule__FonctionAgregation__Alternatives )
            {
             before(grammarAccess.getFonctionAgregationAccess().getAlternatives()); 
            // InternalMyDsl.g:476:3: ( rule__FonctionAgregation__Alternatives )
            // InternalMyDsl.g:476:4: rule__FonctionAgregation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FonctionAgregation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFonctionAgregationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFonctionAgregation"


    // $ANTLR start "ruleFonctionComparaisonQuanti"
    // InternalMyDsl.g:485:1: ruleFonctionComparaisonQuanti : ( ( rule__FonctionComparaisonQuanti__Alternatives ) ) ;
    public final void ruleFonctionComparaisonQuanti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:489:1: ( ( ( rule__FonctionComparaisonQuanti__Alternatives ) ) )
            // InternalMyDsl.g:490:2: ( ( rule__FonctionComparaisonQuanti__Alternatives ) )
            {
            // InternalMyDsl.g:490:2: ( ( rule__FonctionComparaisonQuanti__Alternatives ) )
            // InternalMyDsl.g:491:3: ( rule__FonctionComparaisonQuanti__Alternatives )
            {
             before(grammarAccess.getFonctionComparaisonQuantiAccess().getAlternatives()); 
            // InternalMyDsl.g:492:3: ( rule__FonctionComparaisonQuanti__Alternatives )
            // InternalMyDsl.g:492:4: rule__FonctionComparaisonQuanti__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FonctionComparaisonQuanti__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFonctionComparaisonQuantiAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFonctionComparaisonQuanti"


    // $ANTLR start "ruleFonctionComparaisonQuali"
    // InternalMyDsl.g:501:1: ruleFonctionComparaisonQuali : ( ( rule__FonctionComparaisonQuali__Alternatives ) ) ;
    public final void ruleFonctionComparaisonQuali() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( ( ( rule__FonctionComparaisonQuali__Alternatives ) ) )
            // InternalMyDsl.g:506:2: ( ( rule__FonctionComparaisonQuali__Alternatives ) )
            {
            // InternalMyDsl.g:506:2: ( ( rule__FonctionComparaisonQuali__Alternatives ) )
            // InternalMyDsl.g:507:3: ( rule__FonctionComparaisonQuali__Alternatives )
            {
             before(grammarAccess.getFonctionComparaisonQualiAccess().getAlternatives()); 
            // InternalMyDsl.g:508:3: ( rule__FonctionComparaisonQuali__Alternatives )
            // InternalMyDsl.g:508:4: rule__FonctionComparaisonQuali__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FonctionComparaisonQuali__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFonctionComparaisonQualiAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFonctionComparaisonQuali"


    // $ANTLR start "rule__GraphUpdate__Alternatives"
    // InternalMyDsl.g:516:1: rule__GraphUpdate__Alternatives : ( ( ruleUpdateNameAxeX ) | ( ruleUpdateNameAxeY ) | ( ruleUpdateNameLegend ) | ( ruleUpdateCouleurGraph ) );
    public final void rule__GraphUpdate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( ( ruleUpdateNameAxeX ) | ( ruleUpdateNameAxeY ) | ( ruleUpdateNameLegend ) | ( ruleUpdateCouleurGraph ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:521:2: ( ruleUpdateNameAxeX )
                    {
                    // InternalMyDsl.g:521:2: ( ruleUpdateNameAxeX )
                    // InternalMyDsl.g:522:3: ruleUpdateNameAxeX
                    {
                     before(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeXParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdateNameAxeX();

                    state._fsp--;

                     after(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeXParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:527:2: ( ruleUpdateNameAxeY )
                    {
                    // InternalMyDsl.g:527:2: ( ruleUpdateNameAxeY )
                    // InternalMyDsl.g:528:3: ruleUpdateNameAxeY
                    {
                     before(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeYParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdateNameAxeY();

                    state._fsp--;

                     after(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeYParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:533:2: ( ruleUpdateNameLegend )
                    {
                    // InternalMyDsl.g:533:2: ( ruleUpdateNameLegend )
                    // InternalMyDsl.g:534:3: ruleUpdateNameLegend
                    {
                     before(grammarAccess.getGraphUpdateAccess().getUpdateNameLegendParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdateNameLegend();

                    state._fsp--;

                     after(grammarAccess.getGraphUpdateAccess().getUpdateNameLegendParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:539:2: ( ruleUpdateCouleurGraph )
                    {
                    // InternalMyDsl.g:539:2: ( ruleUpdateCouleurGraph )
                    // InternalMyDsl.g:540:3: ruleUpdateCouleurGraph
                    {
                     before(grammarAccess.getGraphUpdateAccess().getUpdateCouleurGraphParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdateCouleurGraph();

                    state._fsp--;

                     after(grammarAccess.getGraphUpdateAccess().getUpdateCouleurGraphParserRuleCall_3()); 

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
    // $ANTLR end "rule__GraphUpdate__Alternatives"


    // $ANTLR start "rule__FilterData__Alternatives"
    // InternalMyDsl.g:549:1: rule__FilterData__Alternatives : ( ( ruleFilterNotNull ) | ( ruleFilterCompare ) | ( ruleFilterGroupBy ) );
    public final void rule__FilterData__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( ( ruleFilterNotNull ) | ( ruleFilterCompare ) | ( ruleFilterGroupBy ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt2=1;
                }
                break;
            case 44:
            case 45:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:554:2: ( ruleFilterNotNull )
                    {
                    // InternalMyDsl.g:554:2: ( ruleFilterNotNull )
                    // InternalMyDsl.g:555:3: ruleFilterNotNull
                    {
                     before(grammarAccess.getFilterDataAccess().getFilterNotNullParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterNotNull();

                    state._fsp--;

                     after(grammarAccess.getFilterDataAccess().getFilterNotNullParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:560:2: ( ruleFilterCompare )
                    {
                    // InternalMyDsl.g:560:2: ( ruleFilterCompare )
                    // InternalMyDsl.g:561:3: ruleFilterCompare
                    {
                     before(grammarAccess.getFilterDataAccess().getFilterCompareParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterCompare();

                    state._fsp--;

                     after(grammarAccess.getFilterDataAccess().getFilterCompareParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:566:2: ( ruleFilterGroupBy )
                    {
                    // InternalMyDsl.g:566:2: ( ruleFilterGroupBy )
                    // InternalMyDsl.g:567:3: ruleFilterGroupBy
                    {
                     before(grammarAccess.getFilterDataAccess().getFilterGroupByParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterGroupBy();

                    state._fsp--;

                     after(grammarAccess.getFilterDataAccess().getFilterGroupByParserRuleCall_2()); 

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
    // $ANTLR end "rule__FilterData__Alternatives"


    // $ANTLR start "rule__FilterCompare__Alternatives"
    // InternalMyDsl.g:576:1: rule__FilterCompare__Alternatives : ( ( ruleCompareQuali ) | ( ruleCompareQuanti ) );
    public final void rule__FilterCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( ( ruleCompareQuali ) | ( ruleCompareQuanti ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            else if ( (LA3_0==45) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:581:2: ( ruleCompareQuali )
                    {
                    // InternalMyDsl.g:581:2: ( ruleCompareQuali )
                    // InternalMyDsl.g:582:3: ruleCompareQuali
                    {
                     before(grammarAccess.getFilterCompareAccess().getCompareQualiParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCompareQuali();

                    state._fsp--;

                     after(grammarAccess.getFilterCompareAccess().getCompareQualiParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:587:2: ( ruleCompareQuanti )
                    {
                    // InternalMyDsl.g:587:2: ( ruleCompareQuanti )
                    // InternalMyDsl.g:588:3: ruleCompareQuanti
                    {
                     before(grammarAccess.getFilterCompareAccess().getCompareQuantiParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompareQuanti();

                    state._fsp--;

                     after(grammarAccess.getFilterCompareAccess().getCompareQuantiParserRuleCall_1()); 

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
    // $ANTLR end "rule__FilterCompare__Alternatives"


    // $ANTLR start "rule__TypeGraph__Alternatives"
    // InternalMyDsl.g:597:1: rule__TypeGraph__Alternatives : ( ( ( 'Bar' ) ) | ( ( 'Line' ) ) | ( ( 'Nuage de point' ) ) );
    public final void rule__TypeGraph__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( ( ( 'Bar' ) ) | ( ( 'Line' ) ) | ( ( 'Nuage de point' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:602:2: ( ( 'Bar' ) )
                    {
                    // InternalMyDsl.g:602:2: ( ( 'Bar' ) )
                    // InternalMyDsl.g:603:3: ( 'Bar' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getBarEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:604:3: ( 'Bar' )
                    // InternalMyDsl.g:604:4: 'Bar'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getBarEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:608:2: ( ( 'Line' ) )
                    {
                    // InternalMyDsl.g:608:2: ( ( 'Line' ) )
                    // InternalMyDsl.g:609:3: ( 'Line' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getScatterEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:610:3: ( 'Line' )
                    // InternalMyDsl.g:610:4: 'Line'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getScatterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:614:2: ( ( 'Nuage de point' ) )
                    {
                    // InternalMyDsl.g:614:2: ( ( 'Nuage de point' ) )
                    // InternalMyDsl.g:615:3: ( 'Nuage de point' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getBoxEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:616:3: ( 'Nuage de point' )
                    // InternalMyDsl.g:616:4: 'Nuage de point'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getBoxEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TypeGraph__Alternatives"


    // $ANTLR start "rule__FonctionAgregation__Alternatives"
    // InternalMyDsl.g:624:1: rule__FonctionAgregation__Alternatives : ( ( ( 'median' ) ) | ( ( 'sum' ) ) | ( ( 'mean' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'count' ) ) | ( ( 'std' ) ) | ( ( 'var' ) ) );
    public final void rule__FonctionAgregation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( ( ( 'median' ) ) | ( ( 'sum' ) ) | ( ( 'mean' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'count' ) ) | ( ( 'std' ) ) | ( ( 'var' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            case 20:
                {
                alt5=7;
                }
                break;
            case 21:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:629:2: ( ( 'median' ) )
                    {
                    // InternalMyDsl.g:629:2: ( ( 'median' ) )
                    // InternalMyDsl.g:630:3: ( 'median' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getMedianEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:631:3: ( 'median' )
                    // InternalMyDsl.g:631:4: 'median'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getMedianEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:635:2: ( ( 'sum' ) )
                    {
                    // InternalMyDsl.g:635:2: ( ( 'sum' ) )
                    // InternalMyDsl.g:636:3: ( 'sum' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getSumEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:637:3: ( 'sum' )
                    // InternalMyDsl.g:637:4: 'sum'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getSumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:641:2: ( ( 'mean' ) )
                    {
                    // InternalMyDsl.g:641:2: ( ( 'mean' ) )
                    // InternalMyDsl.g:642:3: ( 'mean' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getMeanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:643:3: ( 'mean' )
                    // InternalMyDsl.g:643:4: 'mean'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getMeanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:647:2: ( ( 'min' ) )
                    {
                    // InternalMyDsl.g:647:2: ( ( 'min' ) )
                    // InternalMyDsl.g:648:3: ( 'min' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getMinEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:649:3: ( 'min' )
                    // InternalMyDsl.g:649:4: 'min'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getMinEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:653:2: ( ( 'max' ) )
                    {
                    // InternalMyDsl.g:653:2: ( ( 'max' ) )
                    // InternalMyDsl.g:654:3: ( 'max' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getMaxEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:655:3: ( 'max' )
                    // InternalMyDsl.g:655:4: 'max'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getMaxEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:659:2: ( ( 'count' ) )
                    {
                    // InternalMyDsl.g:659:2: ( ( 'count' ) )
                    // InternalMyDsl.g:660:3: ( 'count' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getCountEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:661:3: ( 'count' )
                    // InternalMyDsl.g:661:4: 'count'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getCountEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:665:2: ( ( 'std' ) )
                    {
                    // InternalMyDsl.g:665:2: ( ( 'std' ) )
                    // InternalMyDsl.g:666:3: ( 'std' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getStdEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:667:3: ( 'std' )
                    // InternalMyDsl.g:667:4: 'std'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getStdEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:671:2: ( ( 'var' ) )
                    {
                    // InternalMyDsl.g:671:2: ( ( 'var' ) )
                    // InternalMyDsl.g:672:3: ( 'var' )
                    {
                     before(grammarAccess.getFonctionAgregationAccess().getVarEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:673:3: ( 'var' )
                    // InternalMyDsl.g:673:4: 'var'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionAgregationAccess().getVarEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__FonctionAgregation__Alternatives"


    // $ANTLR start "rule__FonctionComparaisonQuanti__Alternatives"
    // InternalMyDsl.g:681:1: rule__FonctionComparaisonQuanti__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__FonctionComparaisonQuanti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:686:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:686:2: ( ( '<' ) )
                    // InternalMyDsl.g:687:3: ( '<' )
                    {
                     before(grammarAccess.getFonctionComparaisonQuantiAccess().getInfEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:688:3: ( '<' )
                    // InternalMyDsl.g:688:4: '<'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQuantiAccess().getInfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:692:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:692:2: ( ( '>' ) )
                    // InternalMyDsl.g:693:3: ( '>' )
                    {
                     before(grammarAccess.getFonctionComparaisonQuantiAccess().getSupEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:694:3: ( '>' )
                    // InternalMyDsl.g:694:4: '>'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQuantiAccess().getSupEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:698:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:698:2: ( ( '==' ) )
                    // InternalMyDsl.g:699:3: ( '==' )
                    {
                     before(grammarAccess.getFonctionComparaisonQuantiAccess().getEgalEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:700:3: ( '==' )
                    // InternalMyDsl.g:700:4: '=='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQuantiAccess().getEgalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:704:2: ( ( '!=' ) )
                    {
                    // InternalMyDsl.g:704:2: ( ( '!=' ) )
                    // InternalMyDsl.g:705:3: ( '!=' )
                    {
                     before(grammarAccess.getFonctionComparaisonQuantiAccess().getDifferentEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:706:3: ( '!=' )
                    // InternalMyDsl.g:706:4: '!='
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQuantiAccess().getDifferentEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:710:2: ( ( '>=' ) )
                    {
                    // InternalMyDsl.g:710:2: ( ( '>=' ) )
                    // InternalMyDsl.g:711:3: ( '>=' )
                    {
                     before(grammarAccess.getFonctionComparaisonQuantiAccess().getSupegalEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:712:3: ( '>=' )
                    // InternalMyDsl.g:712:4: '>='
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQuantiAccess().getSupegalEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:716:2: ( ( '<=' ) )
                    {
                    // InternalMyDsl.g:716:2: ( ( '<=' ) )
                    // InternalMyDsl.g:717:3: ( '<=' )
                    {
                     before(grammarAccess.getFonctionComparaisonQuantiAccess().getInfegalEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:718:3: ( '<=' )
                    // InternalMyDsl.g:718:4: '<='
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQuantiAccess().getInfegalEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__FonctionComparaisonQuanti__Alternatives"


    // $ANTLR start "rule__FonctionComparaisonQuali__Alternatives"
    // InternalMyDsl.g:726:1: rule__FonctionComparaisonQuali__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__FonctionComparaisonQuali__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:731:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:731:2: ( ( '==' ) )
                    // InternalMyDsl.g:732:3: ( '==' )
                    {
                     before(grammarAccess.getFonctionComparaisonQualiAccess().getEgalEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:733:3: ( '==' )
                    // InternalMyDsl.g:733:4: '=='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQualiAccess().getEgalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:737:2: ( ( '!=' ) )
                    {
                    // InternalMyDsl.g:737:2: ( ( '!=' ) )
                    // InternalMyDsl.g:738:3: ( '!=' )
                    {
                     before(grammarAccess.getFonctionComparaisonQualiAccess().getDifferentEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:739:3: ( '!=' )
                    // InternalMyDsl.g:739:4: '!='
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonctionComparaisonQualiAccess().getDifferentEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__FonctionComparaisonQuali__Alternatives"


    // $ANTLR start "rule__Dashboard__Group__0"
    // InternalMyDsl.g:747:1: rule__Dashboard__Group__0 : rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1 ;
    public final void rule__Dashboard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1 )
            // InternalMyDsl.g:752:2: rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Dashboard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__1();

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
    // $ANTLR end "rule__Dashboard__Group__0"


    // $ANTLR start "rule__Dashboard__Group__0__Impl"
    // InternalMyDsl.g:759:1: rule__Dashboard__Group__0__Impl : ( 'NameDashboard' ) ;
    public final void rule__Dashboard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( ( 'NameDashboard' ) )
            // InternalMyDsl.g:764:1: ( 'NameDashboard' )
            {
            // InternalMyDsl.g:764:1: ( 'NameDashboard' )
            // InternalMyDsl.g:765:2: 'NameDashboard'
            {
             before(grammarAccess.getDashboardAccess().getNameDashboardKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getNameDashboardKeyword_0()); 

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
    // $ANTLR end "rule__Dashboard__Group__0__Impl"


    // $ANTLR start "rule__Dashboard__Group__1"
    // InternalMyDsl.g:774:1: rule__Dashboard__Group__1 : rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2 ;
    public final void rule__Dashboard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2 )
            // InternalMyDsl.g:779:2: rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Dashboard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__2();

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
    // $ANTLR end "rule__Dashboard__Group__1"


    // $ANTLR start "rule__Dashboard__Group__1__Impl"
    // InternalMyDsl.g:786:1: rule__Dashboard__Group__1__Impl : ( ':' ) ;
    public final void rule__Dashboard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( ( ':' ) )
            // InternalMyDsl.g:791:1: ( ':' )
            {
            // InternalMyDsl.g:791:1: ( ':' )
            // InternalMyDsl.g:792:2: ':'
            {
             before(grammarAccess.getDashboardAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Dashboard__Group__1__Impl"


    // $ANTLR start "rule__Dashboard__Group__2"
    // InternalMyDsl.g:801:1: rule__Dashboard__Group__2 : rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3 ;
    public final void rule__Dashboard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3 )
            // InternalMyDsl.g:806:2: rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Dashboard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__3();

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
    // $ANTLR end "rule__Dashboard__Group__2"


    // $ANTLR start "rule__Dashboard__Group__2__Impl"
    // InternalMyDsl.g:813:1: rule__Dashboard__Group__2__Impl : ( ( rule__Dashboard__NameAssignment_2 ) ) ;
    public final void rule__Dashboard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( ( ( rule__Dashboard__NameAssignment_2 ) ) )
            // InternalMyDsl.g:818:1: ( ( rule__Dashboard__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:818:1: ( ( rule__Dashboard__NameAssignment_2 ) )
            // InternalMyDsl.g:819:2: ( rule__Dashboard__NameAssignment_2 )
            {
             before(grammarAccess.getDashboardAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:820:2: ( rule__Dashboard__NameAssignment_2 )
            // InternalMyDsl.g:820:3: rule__Dashboard__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Dashboard__Group__2__Impl"


    // $ANTLR start "rule__Dashboard__Group__3"
    // InternalMyDsl.g:828:1: rule__Dashboard__Group__3 : rule__Dashboard__Group__3__Impl ;
    public final void rule__Dashboard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( rule__Dashboard__Group__3__Impl )
            // InternalMyDsl.g:833:2: rule__Dashboard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__3__Impl();

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
    // $ANTLR end "rule__Dashboard__Group__3"


    // $ANTLR start "rule__Dashboard__Group__3__Impl"
    // InternalMyDsl.g:839:1: rule__Dashboard__Group__3__Impl : ( ( rule__Dashboard__OwnedGraphRealisationAssignment_3 )* ) ;
    public final void rule__Dashboard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( ( ( rule__Dashboard__OwnedGraphRealisationAssignment_3 )* ) )
            // InternalMyDsl.g:844:1: ( ( rule__Dashboard__OwnedGraphRealisationAssignment_3 )* )
            {
            // InternalMyDsl.g:844:1: ( ( rule__Dashboard__OwnedGraphRealisationAssignment_3 )* )
            // InternalMyDsl.g:845:2: ( rule__Dashboard__OwnedGraphRealisationAssignment_3 )*
            {
             before(grammarAccess.getDashboardAccess().getOwnedGraphRealisationAssignment_3()); 
            // InternalMyDsl.g:846:2: ( rule__Dashboard__OwnedGraphRealisationAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:846:3: rule__Dashboard__OwnedGraphRealisationAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Dashboard__OwnedGraphRealisationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDashboardAccess().getOwnedGraphRealisationAssignment_3()); 

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
    // $ANTLR end "rule__Dashboard__Group__3__Impl"


    // $ANTLR start "rule__GraphRealisation__Group__0"
    // InternalMyDsl.g:855:1: rule__GraphRealisation__Group__0 : rule__GraphRealisation__Group__0__Impl rule__GraphRealisation__Group__1 ;
    public final void rule__GraphRealisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( rule__GraphRealisation__Group__0__Impl rule__GraphRealisation__Group__1 )
            // InternalMyDsl.g:860:2: rule__GraphRealisation__Group__0__Impl rule__GraphRealisation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GraphRealisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphRealisation__Group__1();

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
    // $ANTLR end "rule__GraphRealisation__Group__0"


    // $ANTLR start "rule__GraphRealisation__Group__0__Impl"
    // InternalMyDsl.g:867:1: rule__GraphRealisation__Group__0__Impl : ( ( rule__GraphRealisation__OwnedImportAssignment_0 ) ) ;
    public final void rule__GraphRealisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( ( ( rule__GraphRealisation__OwnedImportAssignment_0 ) ) )
            // InternalMyDsl.g:872:1: ( ( rule__GraphRealisation__OwnedImportAssignment_0 ) )
            {
            // InternalMyDsl.g:872:1: ( ( rule__GraphRealisation__OwnedImportAssignment_0 ) )
            // InternalMyDsl.g:873:2: ( rule__GraphRealisation__OwnedImportAssignment_0 )
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedImportAssignment_0()); 
            // InternalMyDsl.g:874:2: ( rule__GraphRealisation__OwnedImportAssignment_0 )
            // InternalMyDsl.g:874:3: rule__GraphRealisation__OwnedImportAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphRealisation__OwnedImportAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphRealisationAccess().getOwnedImportAssignment_0()); 

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
    // $ANTLR end "rule__GraphRealisation__Group__0__Impl"


    // $ANTLR start "rule__GraphRealisation__Group__1"
    // InternalMyDsl.g:882:1: rule__GraphRealisation__Group__1 : rule__GraphRealisation__Group__1__Impl rule__GraphRealisation__Group__2 ;
    public final void rule__GraphRealisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( rule__GraphRealisation__Group__1__Impl rule__GraphRealisation__Group__2 )
            // InternalMyDsl.g:887:2: rule__GraphRealisation__Group__1__Impl rule__GraphRealisation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GraphRealisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphRealisation__Group__2();

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
    // $ANTLR end "rule__GraphRealisation__Group__1"


    // $ANTLR start "rule__GraphRealisation__Group__1__Impl"
    // InternalMyDsl.g:894:1: rule__GraphRealisation__Group__1__Impl : ( ( rule__GraphRealisation__OwnedGraphMakerAssignment_1 ) ) ;
    public final void rule__GraphRealisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( ( rule__GraphRealisation__OwnedGraphMakerAssignment_1 ) ) )
            // InternalMyDsl.g:899:1: ( ( rule__GraphRealisation__OwnedGraphMakerAssignment_1 ) )
            {
            // InternalMyDsl.g:899:1: ( ( rule__GraphRealisation__OwnedGraphMakerAssignment_1 ) )
            // InternalMyDsl.g:900:2: ( rule__GraphRealisation__OwnedGraphMakerAssignment_1 )
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedGraphMakerAssignment_1()); 
            // InternalMyDsl.g:901:2: ( rule__GraphRealisation__OwnedGraphMakerAssignment_1 )
            // InternalMyDsl.g:901:3: rule__GraphRealisation__OwnedGraphMakerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphRealisation__OwnedGraphMakerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphRealisationAccess().getOwnedGraphMakerAssignment_1()); 

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
    // $ANTLR end "rule__GraphRealisation__Group__1__Impl"


    // $ANTLR start "rule__GraphRealisation__Group__2"
    // InternalMyDsl.g:909:1: rule__GraphRealisation__Group__2 : rule__GraphRealisation__Group__2__Impl rule__GraphRealisation__Group__3 ;
    public final void rule__GraphRealisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( rule__GraphRealisation__Group__2__Impl rule__GraphRealisation__Group__3 )
            // InternalMyDsl.g:914:2: rule__GraphRealisation__Group__2__Impl rule__GraphRealisation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__GraphRealisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphRealisation__Group__3();

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
    // $ANTLR end "rule__GraphRealisation__Group__2"


    // $ANTLR start "rule__GraphRealisation__Group__2__Impl"
    // InternalMyDsl.g:921:1: rule__GraphRealisation__Group__2__Impl : ( ( rule__GraphRealisation__OwnedFilterAssignment_2 )* ) ;
    public final void rule__GraphRealisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( ( ( rule__GraphRealisation__OwnedFilterAssignment_2 )* ) )
            // InternalMyDsl.g:926:1: ( ( rule__GraphRealisation__OwnedFilterAssignment_2 )* )
            {
            // InternalMyDsl.g:926:1: ( ( rule__GraphRealisation__OwnedFilterAssignment_2 )* )
            // InternalMyDsl.g:927:2: ( rule__GraphRealisation__OwnedFilterAssignment_2 )*
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedFilterAssignment_2()); 
            // InternalMyDsl.g:928:2: ( rule__GraphRealisation__OwnedFilterAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==41||(LA9_0>=43 && LA9_0<=45)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:928:3: rule__GraphRealisation__OwnedFilterAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__GraphRealisation__OwnedFilterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGraphRealisationAccess().getOwnedFilterAssignment_2()); 

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
    // $ANTLR end "rule__GraphRealisation__Group__2__Impl"


    // $ANTLR start "rule__GraphRealisation__Group__3"
    // InternalMyDsl.g:936:1: rule__GraphRealisation__Group__3 : rule__GraphRealisation__Group__3__Impl ;
    public final void rule__GraphRealisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:940:1: ( rule__GraphRealisation__Group__3__Impl )
            // InternalMyDsl.g:941:2: rule__GraphRealisation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphRealisation__Group__3__Impl();

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
    // $ANTLR end "rule__GraphRealisation__Group__3"


    // $ANTLR start "rule__GraphRealisation__Group__3__Impl"
    // InternalMyDsl.g:947:1: rule__GraphRealisation__Group__3__Impl : ( ( rule__GraphRealisation__OwnedGraphUpdateAssignment_3 )* ) ;
    public final void rule__GraphRealisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( ( rule__GraphRealisation__OwnedGraphUpdateAssignment_3 )* ) )
            // InternalMyDsl.g:952:1: ( ( rule__GraphRealisation__OwnedGraphUpdateAssignment_3 )* )
            {
            // InternalMyDsl.g:952:1: ( ( rule__GraphRealisation__OwnedGraphUpdateAssignment_3 )* )
            // InternalMyDsl.g:953:2: ( rule__GraphRealisation__OwnedGraphUpdateAssignment_3 )*
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedGraphUpdateAssignment_3()); 
            // InternalMyDsl.g:954:2: ( rule__GraphRealisation__OwnedGraphUpdateAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35||LA10_0==37||(LA10_0>=39 && LA10_0<=40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:954:3: rule__GraphRealisation__OwnedGraphUpdateAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GraphRealisation__OwnedGraphUpdateAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGraphRealisationAccess().getOwnedGraphUpdateAssignment_3()); 

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
    // $ANTLR end "rule__GraphRealisation__Group__3__Impl"


    // $ANTLR start "rule__ImportFile__Group__0"
    // InternalMyDsl.g:963:1: rule__ImportFile__Group__0 : rule__ImportFile__Group__0__Impl rule__ImportFile__Group__1 ;
    public final void rule__ImportFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( rule__ImportFile__Group__0__Impl rule__ImportFile__Group__1 )
            // InternalMyDsl.g:968:2: rule__ImportFile__Group__0__Impl rule__ImportFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ImportFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFile__Group__1();

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
    // $ANTLR end "rule__ImportFile__Group__0"


    // $ANTLR start "rule__ImportFile__Group__0__Impl"
    // InternalMyDsl.g:975:1: rule__ImportFile__Group__0__Impl : ( 'CSV' ) ;
    public final void rule__ImportFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( ( 'CSV' ) )
            // InternalMyDsl.g:980:1: ( 'CSV' )
            {
            // InternalMyDsl.g:980:1: ( 'CSV' )
            // InternalMyDsl.g:981:2: 'CSV'
            {
             before(grammarAccess.getImportFileAccess().getCSVKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getImportFileAccess().getCSVKeyword_0()); 

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
    // $ANTLR end "rule__ImportFile__Group__0__Impl"


    // $ANTLR start "rule__ImportFile__Group__1"
    // InternalMyDsl.g:990:1: rule__ImportFile__Group__1 : rule__ImportFile__Group__1__Impl rule__ImportFile__Group__2 ;
    public final void rule__ImportFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( rule__ImportFile__Group__1__Impl rule__ImportFile__Group__2 )
            // InternalMyDsl.g:995:2: rule__ImportFile__Group__1__Impl rule__ImportFile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ImportFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFile__Group__2();

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
    // $ANTLR end "rule__ImportFile__Group__1"


    // $ANTLR start "rule__ImportFile__Group__1__Impl"
    // InternalMyDsl.g:1002:1: rule__ImportFile__Group__1__Impl : ( ':' ) ;
    public final void rule__ImportFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( ( ':' ) )
            // InternalMyDsl.g:1007:1: ( ':' )
            {
            // InternalMyDsl.g:1007:1: ( ':' )
            // InternalMyDsl.g:1008:2: ':'
            {
             before(grammarAccess.getImportFileAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getImportFileAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ImportFile__Group__1__Impl"


    // $ANTLR start "rule__ImportFile__Group__2"
    // InternalMyDsl.g:1017:1: rule__ImportFile__Group__2 : rule__ImportFile__Group__2__Impl rule__ImportFile__Group__3 ;
    public final void rule__ImportFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1021:1: ( rule__ImportFile__Group__2__Impl rule__ImportFile__Group__3 )
            // InternalMyDsl.g:1022:2: rule__ImportFile__Group__2__Impl rule__ImportFile__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ImportFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFile__Group__3();

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
    // $ANTLR end "rule__ImportFile__Group__2"


    // $ANTLR start "rule__ImportFile__Group__2__Impl"
    // InternalMyDsl.g:1029:1: rule__ImportFile__Group__2__Impl : ( ( rule__ImportFile__NameAssignment_2 ) ) ;
    public final void rule__ImportFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( ( ( rule__ImportFile__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1034:1: ( ( rule__ImportFile__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1034:1: ( ( rule__ImportFile__NameAssignment_2 ) )
            // InternalMyDsl.g:1035:2: ( rule__ImportFile__NameAssignment_2 )
            {
             before(grammarAccess.getImportFileAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1036:2: ( rule__ImportFile__NameAssignment_2 )
            // InternalMyDsl.g:1036:3: rule__ImportFile__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImportFile__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportFileAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ImportFile__Group__2__Impl"


    // $ANTLR start "rule__ImportFile__Group__3"
    // InternalMyDsl.g:1044:1: rule__ImportFile__Group__3 : rule__ImportFile__Group__3__Impl rule__ImportFile__Group__4 ;
    public final void rule__ImportFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( rule__ImportFile__Group__3__Impl rule__ImportFile__Group__4 )
            // InternalMyDsl.g:1049:2: rule__ImportFile__Group__3__Impl rule__ImportFile__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ImportFile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFile__Group__4();

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
    // $ANTLR end "rule__ImportFile__Group__3"


    // $ANTLR start "rule__ImportFile__Group__3__Impl"
    // InternalMyDsl.g:1056:1: rule__ImportFile__Group__3__Impl : ( 'Delimiter' ) ;
    public final void rule__ImportFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1060:1: ( ( 'Delimiter' ) )
            // InternalMyDsl.g:1061:1: ( 'Delimiter' )
            {
            // InternalMyDsl.g:1061:1: ( 'Delimiter' )
            // InternalMyDsl.g:1062:2: 'Delimiter'
            {
             before(grammarAccess.getImportFileAccess().getDelimiterKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getImportFileAccess().getDelimiterKeyword_3()); 

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
    // $ANTLR end "rule__ImportFile__Group__3__Impl"


    // $ANTLR start "rule__ImportFile__Group__4"
    // InternalMyDsl.g:1071:1: rule__ImportFile__Group__4 : rule__ImportFile__Group__4__Impl rule__ImportFile__Group__5 ;
    public final void rule__ImportFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1075:1: ( rule__ImportFile__Group__4__Impl rule__ImportFile__Group__5 )
            // InternalMyDsl.g:1076:2: rule__ImportFile__Group__4__Impl rule__ImportFile__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ImportFile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportFile__Group__5();

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
    // $ANTLR end "rule__ImportFile__Group__4"


    // $ANTLR start "rule__ImportFile__Group__4__Impl"
    // InternalMyDsl.g:1083:1: rule__ImportFile__Group__4__Impl : ( ':' ) ;
    public final void rule__ImportFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( ( ':' ) )
            // InternalMyDsl.g:1088:1: ( ':' )
            {
            // InternalMyDsl.g:1088:1: ( ':' )
            // InternalMyDsl.g:1089:2: ':'
            {
             before(grammarAccess.getImportFileAccess().getColonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getImportFileAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__ImportFile__Group__4__Impl"


    // $ANTLR start "rule__ImportFile__Group__5"
    // InternalMyDsl.g:1098:1: rule__ImportFile__Group__5 : rule__ImportFile__Group__5__Impl ;
    public final void rule__ImportFile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( rule__ImportFile__Group__5__Impl )
            // InternalMyDsl.g:1103:2: rule__ImportFile__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportFile__Group__5__Impl();

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
    // $ANTLR end "rule__ImportFile__Group__5"


    // $ANTLR start "rule__ImportFile__Group__5__Impl"
    // InternalMyDsl.g:1109:1: rule__ImportFile__Group__5__Impl : ( ( rule__ImportFile__DelimeterAssignment_5 ) ) ;
    public final void rule__ImportFile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1113:1: ( ( ( rule__ImportFile__DelimeterAssignment_5 ) ) )
            // InternalMyDsl.g:1114:1: ( ( rule__ImportFile__DelimeterAssignment_5 ) )
            {
            // InternalMyDsl.g:1114:1: ( ( rule__ImportFile__DelimeterAssignment_5 ) )
            // InternalMyDsl.g:1115:2: ( rule__ImportFile__DelimeterAssignment_5 )
            {
             before(grammarAccess.getImportFileAccess().getDelimeterAssignment_5()); 
            // InternalMyDsl.g:1116:2: ( rule__ImportFile__DelimeterAssignment_5 )
            // InternalMyDsl.g:1116:3: rule__ImportFile__DelimeterAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ImportFile__DelimeterAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImportFileAccess().getDelimeterAssignment_5()); 

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
    // $ANTLR end "rule__ImportFile__Group__5__Impl"


    // $ANTLR start "rule__GraphMaker__Group__0"
    // InternalMyDsl.g:1125:1: rule__GraphMaker__Group__0 : rule__GraphMaker__Group__0__Impl rule__GraphMaker__Group__1 ;
    public final void rule__GraphMaker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( rule__GraphMaker__Group__0__Impl rule__GraphMaker__Group__1 )
            // InternalMyDsl.g:1130:2: rule__GraphMaker__Group__0__Impl rule__GraphMaker__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphMaker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__1();

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
    // $ANTLR end "rule__GraphMaker__Group__0"


    // $ANTLR start "rule__GraphMaker__Group__0__Impl"
    // InternalMyDsl.g:1137:1: rule__GraphMaker__Group__0__Impl : ( 'TypeOfGraph' ) ;
    public final void rule__GraphMaker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( ( 'TypeOfGraph' ) )
            // InternalMyDsl.g:1142:1: ( 'TypeOfGraph' )
            {
            // InternalMyDsl.g:1142:1: ( 'TypeOfGraph' )
            // InternalMyDsl.g:1143:2: 'TypeOfGraph'
            {
             before(grammarAccess.getGraphMakerAccess().getTypeOfGraphKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGraphMakerAccess().getTypeOfGraphKeyword_0()); 

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
    // $ANTLR end "rule__GraphMaker__Group__0__Impl"


    // $ANTLR start "rule__GraphMaker__Group__1"
    // InternalMyDsl.g:1152:1: rule__GraphMaker__Group__1 : rule__GraphMaker__Group__1__Impl rule__GraphMaker__Group__2 ;
    public final void rule__GraphMaker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( rule__GraphMaker__Group__1__Impl rule__GraphMaker__Group__2 )
            // InternalMyDsl.g:1157:2: rule__GraphMaker__Group__1__Impl rule__GraphMaker__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__GraphMaker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__2();

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
    // $ANTLR end "rule__GraphMaker__Group__1"


    // $ANTLR start "rule__GraphMaker__Group__1__Impl"
    // InternalMyDsl.g:1164:1: rule__GraphMaker__Group__1__Impl : ( ':' ) ;
    public final void rule__GraphMaker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( ( ':' ) )
            // InternalMyDsl.g:1169:1: ( ':' )
            {
            // InternalMyDsl.g:1169:1: ( ':' )
            // InternalMyDsl.g:1170:2: ':'
            {
             before(grammarAccess.getGraphMakerAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGraphMakerAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__GraphMaker__Group__1__Impl"


    // $ANTLR start "rule__GraphMaker__Group__2"
    // InternalMyDsl.g:1179:1: rule__GraphMaker__Group__2 : rule__GraphMaker__Group__2__Impl rule__GraphMaker__Group__3 ;
    public final void rule__GraphMaker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( rule__GraphMaker__Group__2__Impl rule__GraphMaker__Group__3 )
            // InternalMyDsl.g:1184:2: rule__GraphMaker__Group__2__Impl rule__GraphMaker__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__GraphMaker__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__3();

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
    // $ANTLR end "rule__GraphMaker__Group__2"


    // $ANTLR start "rule__GraphMaker__Group__2__Impl"
    // InternalMyDsl.g:1191:1: rule__GraphMaker__Group__2__Impl : ( ( rule__GraphMaker__TypeAssignment_2 ) ) ;
    public final void rule__GraphMaker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( ( ( rule__GraphMaker__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:1196:1: ( ( rule__GraphMaker__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:1196:1: ( ( rule__GraphMaker__TypeAssignment_2 ) )
            // InternalMyDsl.g:1197:2: ( rule__GraphMaker__TypeAssignment_2 )
            {
             before(grammarAccess.getGraphMakerAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:1198:2: ( rule__GraphMaker__TypeAssignment_2 )
            // InternalMyDsl.g:1198:3: rule__GraphMaker__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphMaker__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphMakerAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__GraphMaker__Group__2__Impl"


    // $ANTLR start "rule__GraphMaker__Group__3"
    // InternalMyDsl.g:1206:1: rule__GraphMaker__Group__3 : rule__GraphMaker__Group__3__Impl rule__GraphMaker__Group__4 ;
    public final void rule__GraphMaker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( rule__GraphMaker__Group__3__Impl rule__GraphMaker__Group__4 )
            // InternalMyDsl.g:1211:2: rule__GraphMaker__Group__3__Impl rule__GraphMaker__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__GraphMaker__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__4();

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
    // $ANTLR end "rule__GraphMaker__Group__3"


    // $ANTLR start "rule__GraphMaker__Group__3__Impl"
    // InternalMyDsl.g:1218:1: rule__GraphMaker__Group__3__Impl : ( 'Abscissa' ) ;
    public final void rule__GraphMaker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( 'Abscissa' ) )
            // InternalMyDsl.g:1223:1: ( 'Abscissa' )
            {
            // InternalMyDsl.g:1223:1: ( 'Abscissa' )
            // InternalMyDsl.g:1224:2: 'Abscissa'
            {
             before(grammarAccess.getGraphMakerAccess().getAbscissaKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGraphMakerAccess().getAbscissaKeyword_3()); 

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
    // $ANTLR end "rule__GraphMaker__Group__3__Impl"


    // $ANTLR start "rule__GraphMaker__Group__4"
    // InternalMyDsl.g:1233:1: rule__GraphMaker__Group__4 : rule__GraphMaker__Group__4__Impl rule__GraphMaker__Group__5 ;
    public final void rule__GraphMaker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( rule__GraphMaker__Group__4__Impl rule__GraphMaker__Group__5 )
            // InternalMyDsl.g:1238:2: rule__GraphMaker__Group__4__Impl rule__GraphMaker__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__GraphMaker__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__5();

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
    // $ANTLR end "rule__GraphMaker__Group__4"


    // $ANTLR start "rule__GraphMaker__Group__4__Impl"
    // InternalMyDsl.g:1245:1: rule__GraphMaker__Group__4__Impl : ( ':' ) ;
    public final void rule__GraphMaker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( ( ':' ) )
            // InternalMyDsl.g:1250:1: ( ':' )
            {
            // InternalMyDsl.g:1250:1: ( ':' )
            // InternalMyDsl.g:1251:2: ':'
            {
             before(grammarAccess.getGraphMakerAccess().getColonKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGraphMakerAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__GraphMaker__Group__4__Impl"


    // $ANTLR start "rule__GraphMaker__Group__5"
    // InternalMyDsl.g:1260:1: rule__GraphMaker__Group__5 : rule__GraphMaker__Group__5__Impl rule__GraphMaker__Group__6 ;
    public final void rule__GraphMaker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( rule__GraphMaker__Group__5__Impl rule__GraphMaker__Group__6 )
            // InternalMyDsl.g:1265:2: rule__GraphMaker__Group__5__Impl rule__GraphMaker__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__GraphMaker__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__6();

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
    // $ANTLR end "rule__GraphMaker__Group__5"


    // $ANTLR start "rule__GraphMaker__Group__5__Impl"
    // InternalMyDsl.g:1272:1: rule__GraphMaker__Group__5__Impl : ( ( rule__GraphMaker__NameAbscisseAssignment_5 ) ) ;
    public final void rule__GraphMaker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( ( rule__GraphMaker__NameAbscisseAssignment_5 ) ) )
            // InternalMyDsl.g:1277:1: ( ( rule__GraphMaker__NameAbscisseAssignment_5 ) )
            {
            // InternalMyDsl.g:1277:1: ( ( rule__GraphMaker__NameAbscisseAssignment_5 ) )
            // InternalMyDsl.g:1278:2: ( rule__GraphMaker__NameAbscisseAssignment_5 )
            {
             before(grammarAccess.getGraphMakerAccess().getNameAbscisseAssignment_5()); 
            // InternalMyDsl.g:1279:2: ( rule__GraphMaker__NameAbscisseAssignment_5 )
            // InternalMyDsl.g:1279:3: rule__GraphMaker__NameAbscisseAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GraphMaker__NameAbscisseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGraphMakerAccess().getNameAbscisseAssignment_5()); 

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
    // $ANTLR end "rule__GraphMaker__Group__5__Impl"


    // $ANTLR start "rule__GraphMaker__Group__6"
    // InternalMyDsl.g:1287:1: rule__GraphMaker__Group__6 : rule__GraphMaker__Group__6__Impl rule__GraphMaker__Group__7 ;
    public final void rule__GraphMaker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( rule__GraphMaker__Group__6__Impl rule__GraphMaker__Group__7 )
            // InternalMyDsl.g:1292:2: rule__GraphMaker__Group__6__Impl rule__GraphMaker__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__GraphMaker__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__7();

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
    // $ANTLR end "rule__GraphMaker__Group__6"


    // $ANTLR start "rule__GraphMaker__Group__6__Impl"
    // InternalMyDsl.g:1299:1: rule__GraphMaker__Group__6__Impl : ( 'Ordinate(s)' ) ;
    public final void rule__GraphMaker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( ( 'Ordinate(s)' ) )
            // InternalMyDsl.g:1304:1: ( 'Ordinate(s)' )
            {
            // InternalMyDsl.g:1304:1: ( 'Ordinate(s)' )
            // InternalMyDsl.g:1305:2: 'Ordinate(s)'
            {
             before(grammarAccess.getGraphMakerAccess().getOrdinateSKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGraphMakerAccess().getOrdinateSKeyword_6()); 

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
    // $ANTLR end "rule__GraphMaker__Group__6__Impl"


    // $ANTLR start "rule__GraphMaker__Group__7"
    // InternalMyDsl.g:1314:1: rule__GraphMaker__Group__7 : rule__GraphMaker__Group__7__Impl rule__GraphMaker__Group__8 ;
    public final void rule__GraphMaker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( rule__GraphMaker__Group__7__Impl rule__GraphMaker__Group__8 )
            // InternalMyDsl.g:1319:2: rule__GraphMaker__Group__7__Impl rule__GraphMaker__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__GraphMaker__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__8();

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
    // $ANTLR end "rule__GraphMaker__Group__7"


    // $ANTLR start "rule__GraphMaker__Group__7__Impl"
    // InternalMyDsl.g:1326:1: rule__GraphMaker__Group__7__Impl : ( ':' ) ;
    public final void rule__GraphMaker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ':' ) )
            // InternalMyDsl.g:1331:1: ( ':' )
            {
            // InternalMyDsl.g:1331:1: ( ':' )
            // InternalMyDsl.g:1332:2: ':'
            {
             before(grammarAccess.getGraphMakerAccess().getColonKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGraphMakerAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__GraphMaker__Group__7__Impl"


    // $ANTLR start "rule__GraphMaker__Group__8"
    // InternalMyDsl.g:1341:1: rule__GraphMaker__Group__8 : rule__GraphMaker__Group__8__Impl ;
    public final void rule__GraphMaker__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( rule__GraphMaker__Group__8__Impl )
            // InternalMyDsl.g:1346:2: rule__GraphMaker__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphMaker__Group__8__Impl();

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
    // $ANTLR end "rule__GraphMaker__Group__8"


    // $ANTLR start "rule__GraphMaker__Group__8__Impl"
    // InternalMyDsl.g:1352:1: rule__GraphMaker__Group__8__Impl : ( ( ( rule__GraphMaker__NameOrdonneesAssignment_8 ) ) ( ( rule__GraphMaker__NameOrdonneesAssignment_8 )* ) ) ;
    public final void rule__GraphMaker__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( ( ( ( rule__GraphMaker__NameOrdonneesAssignment_8 ) ) ( ( rule__GraphMaker__NameOrdonneesAssignment_8 )* ) ) )
            // InternalMyDsl.g:1357:1: ( ( ( rule__GraphMaker__NameOrdonneesAssignment_8 ) ) ( ( rule__GraphMaker__NameOrdonneesAssignment_8 )* ) )
            {
            // InternalMyDsl.g:1357:1: ( ( ( rule__GraphMaker__NameOrdonneesAssignment_8 ) ) ( ( rule__GraphMaker__NameOrdonneesAssignment_8 )* ) )
            // InternalMyDsl.g:1358:2: ( ( rule__GraphMaker__NameOrdonneesAssignment_8 ) ) ( ( rule__GraphMaker__NameOrdonneesAssignment_8 )* )
            {
            // InternalMyDsl.g:1358:2: ( ( rule__GraphMaker__NameOrdonneesAssignment_8 ) )
            // InternalMyDsl.g:1359:3: ( rule__GraphMaker__NameOrdonneesAssignment_8 )
            {
             before(grammarAccess.getGraphMakerAccess().getNameOrdonneesAssignment_8()); 
            // InternalMyDsl.g:1360:3: ( rule__GraphMaker__NameOrdonneesAssignment_8 )
            // InternalMyDsl.g:1360:4: rule__GraphMaker__NameOrdonneesAssignment_8
            {
            pushFollow(FOLLOW_15);
            rule__GraphMaker__NameOrdonneesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGraphMakerAccess().getNameOrdonneesAssignment_8()); 

            }

            // InternalMyDsl.g:1363:2: ( ( rule__GraphMaker__NameOrdonneesAssignment_8 )* )
            // InternalMyDsl.g:1364:3: ( rule__GraphMaker__NameOrdonneesAssignment_8 )*
            {
             before(grammarAccess.getGraphMakerAccess().getNameOrdonneesAssignment_8()); 
            // InternalMyDsl.g:1365:3: ( rule__GraphMaker__NameOrdonneesAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1365:4: rule__GraphMaker__NameOrdonneesAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GraphMaker__NameOrdonneesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGraphMakerAccess().getNameOrdonneesAssignment_8()); 

            }


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
    // $ANTLR end "rule__GraphMaker__Group__8__Impl"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__0"
    // InternalMyDsl.g:1375:1: rule__UpdateCouleurGraph__Group__0 : rule__UpdateCouleurGraph__Group__0__Impl rule__UpdateCouleurGraph__Group__1 ;
    public final void rule__UpdateCouleurGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__UpdateCouleurGraph__Group__0__Impl rule__UpdateCouleurGraph__Group__1 )
            // InternalMyDsl.g:1380:2: rule__UpdateCouleurGraph__Group__0__Impl rule__UpdateCouleurGraph__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UpdateCouleurGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateCouleurGraph__Group__1();

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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__0"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__0__Impl"
    // InternalMyDsl.g:1387:1: rule__UpdateCouleurGraph__Group__0__Impl : ( 'Color(s)' ) ;
    public final void rule__UpdateCouleurGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( 'Color(s)' ) )
            // InternalMyDsl.g:1392:1: ( 'Color(s)' )
            {
            // InternalMyDsl.g:1392:1: ( 'Color(s)' )
            // InternalMyDsl.g:1393:2: 'Color(s)'
            {
             before(grammarAccess.getUpdateCouleurGraphAccess().getColorSKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUpdateCouleurGraphAccess().getColorSKeyword_0()); 

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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__0__Impl"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__1"
    // InternalMyDsl.g:1402:1: rule__UpdateCouleurGraph__Group__1 : rule__UpdateCouleurGraph__Group__1__Impl rule__UpdateCouleurGraph__Group__2 ;
    public final void rule__UpdateCouleurGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__UpdateCouleurGraph__Group__1__Impl rule__UpdateCouleurGraph__Group__2 )
            // InternalMyDsl.g:1407:2: rule__UpdateCouleurGraph__Group__1__Impl rule__UpdateCouleurGraph__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__UpdateCouleurGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateCouleurGraph__Group__2();

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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__1"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__1__Impl"
    // InternalMyDsl.g:1414:1: rule__UpdateCouleurGraph__Group__1__Impl : ( 'graph' ) ;
    public final void rule__UpdateCouleurGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( 'graph' ) )
            // InternalMyDsl.g:1419:1: ( 'graph' )
            {
            // InternalMyDsl.g:1419:1: ( 'graph' )
            // InternalMyDsl.g:1420:2: 'graph'
            {
             before(grammarAccess.getUpdateCouleurGraphAccess().getGraphKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUpdateCouleurGraphAccess().getGraphKeyword_1()); 

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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__1__Impl"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__2"
    // InternalMyDsl.g:1429:1: rule__UpdateCouleurGraph__Group__2 : rule__UpdateCouleurGraph__Group__2__Impl rule__UpdateCouleurGraph__Group__3 ;
    public final void rule__UpdateCouleurGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__UpdateCouleurGraph__Group__2__Impl rule__UpdateCouleurGraph__Group__3 )
            // InternalMyDsl.g:1434:2: rule__UpdateCouleurGraph__Group__2__Impl rule__UpdateCouleurGraph__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UpdateCouleurGraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateCouleurGraph__Group__3();

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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__2"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__2__Impl"
    // InternalMyDsl.g:1441:1: rule__UpdateCouleurGraph__Group__2__Impl : ( ':' ) ;
    public final void rule__UpdateCouleurGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( ':' ) )
            // InternalMyDsl.g:1446:1: ( ':' )
            {
            // InternalMyDsl.g:1446:1: ( ':' )
            // InternalMyDsl.g:1447:2: ':'
            {
             before(grammarAccess.getUpdateCouleurGraphAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUpdateCouleurGraphAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__2__Impl"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__3"
    // InternalMyDsl.g:1456:1: rule__UpdateCouleurGraph__Group__3 : rule__UpdateCouleurGraph__Group__3__Impl ;
    public final void rule__UpdateCouleurGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( rule__UpdateCouleurGraph__Group__3__Impl )
            // InternalMyDsl.g:1461:2: rule__UpdateCouleurGraph__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateCouleurGraph__Group__3__Impl();

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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__3"


    // $ANTLR start "rule__UpdateCouleurGraph__Group__3__Impl"
    // InternalMyDsl.g:1467:1: rule__UpdateCouleurGraph__Group__3__Impl : ( ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 ) ) ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 )* ) ) ;
    public final void rule__UpdateCouleurGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 ) ) ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 )* ) ) )
            // InternalMyDsl.g:1472:1: ( ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 ) ) ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 )* ) )
            {
            // InternalMyDsl.g:1472:1: ( ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 ) ) ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 )* ) )
            // InternalMyDsl.g:1473:2: ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 ) ) ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 )* )
            {
            // InternalMyDsl.g:1473:2: ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 ) )
            // InternalMyDsl.g:1474:3: ( rule__UpdateCouleurGraph__CouleurAssignment_3 )
            {
             before(grammarAccess.getUpdateCouleurGraphAccess().getCouleurAssignment_3()); 
            // InternalMyDsl.g:1475:3: ( rule__UpdateCouleurGraph__CouleurAssignment_3 )
            // InternalMyDsl.g:1475:4: rule__UpdateCouleurGraph__CouleurAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__UpdateCouleurGraph__CouleurAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateCouleurGraphAccess().getCouleurAssignment_3()); 

            }

            // InternalMyDsl.g:1478:2: ( ( rule__UpdateCouleurGraph__CouleurAssignment_3 )* )
            // InternalMyDsl.g:1479:3: ( rule__UpdateCouleurGraph__CouleurAssignment_3 )*
            {
             before(grammarAccess.getUpdateCouleurGraphAccess().getCouleurAssignment_3()); 
            // InternalMyDsl.g:1480:3: ( rule__UpdateCouleurGraph__CouleurAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1480:4: rule__UpdateCouleurGraph__CouleurAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UpdateCouleurGraph__CouleurAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUpdateCouleurGraphAccess().getCouleurAssignment_3()); 

            }


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
    // $ANTLR end "rule__UpdateCouleurGraph__Group__3__Impl"


    // $ANTLR start "rule__UpdateNameLegend__Group__0"
    // InternalMyDsl.g:1490:1: rule__UpdateNameLegend__Group__0 : rule__UpdateNameLegend__Group__0__Impl rule__UpdateNameLegend__Group__1 ;
    public final void rule__UpdateNameLegend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( rule__UpdateNameLegend__Group__0__Impl rule__UpdateNameLegend__Group__1 )
            // InternalMyDsl.g:1495:2: rule__UpdateNameLegend__Group__0__Impl rule__UpdateNameLegend__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UpdateNameLegend__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateNameLegend__Group__1();

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
    // $ANTLR end "rule__UpdateNameLegend__Group__0"


    // $ANTLR start "rule__UpdateNameLegend__Group__0__Impl"
    // InternalMyDsl.g:1502:1: rule__UpdateNameLegend__Group__0__Impl : ( 'Transformation' ) ;
    public final void rule__UpdateNameLegend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( ( 'Transformation' ) )
            // InternalMyDsl.g:1507:1: ( 'Transformation' )
            {
            // InternalMyDsl.g:1507:1: ( 'Transformation' )
            // InternalMyDsl.g:1508:2: 'Transformation'
            {
             before(grammarAccess.getUpdateNameLegendAccess().getTransformationKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getUpdateNameLegendAccess().getTransformationKeyword_0()); 

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
    // $ANTLR end "rule__UpdateNameLegend__Group__0__Impl"


    // $ANTLR start "rule__UpdateNameLegend__Group__1"
    // InternalMyDsl.g:1517:1: rule__UpdateNameLegend__Group__1 : rule__UpdateNameLegend__Group__1__Impl rule__UpdateNameLegend__Group__2 ;
    public final void rule__UpdateNameLegend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( rule__UpdateNameLegend__Group__1__Impl rule__UpdateNameLegend__Group__2 )
            // InternalMyDsl.g:1522:2: rule__UpdateNameLegend__Group__1__Impl rule__UpdateNameLegend__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__UpdateNameLegend__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateNameLegend__Group__2();

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
    // $ANTLR end "rule__UpdateNameLegend__Group__1"


    // $ANTLR start "rule__UpdateNameLegend__Group__1__Impl"
    // InternalMyDsl.g:1529:1: rule__UpdateNameLegend__Group__1__Impl : ( ( rule__UpdateNameLegend__OldnameAssignment_1 ) ) ;
    public final void rule__UpdateNameLegend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( ( rule__UpdateNameLegend__OldnameAssignment_1 ) ) )
            // InternalMyDsl.g:1534:1: ( ( rule__UpdateNameLegend__OldnameAssignment_1 ) )
            {
            // InternalMyDsl.g:1534:1: ( ( rule__UpdateNameLegend__OldnameAssignment_1 ) )
            // InternalMyDsl.g:1535:2: ( rule__UpdateNameLegend__OldnameAssignment_1 )
            {
             before(grammarAccess.getUpdateNameLegendAccess().getOldnameAssignment_1()); 
            // InternalMyDsl.g:1536:2: ( rule__UpdateNameLegend__OldnameAssignment_1 )
            // InternalMyDsl.g:1536:3: rule__UpdateNameLegend__OldnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameLegend__OldnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateNameLegendAccess().getOldnameAssignment_1()); 

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
    // $ANTLR end "rule__UpdateNameLegend__Group__1__Impl"


    // $ANTLR start "rule__UpdateNameLegend__Group__2"
    // InternalMyDsl.g:1544:1: rule__UpdateNameLegend__Group__2 : rule__UpdateNameLegend__Group__2__Impl rule__UpdateNameLegend__Group__3 ;
    public final void rule__UpdateNameLegend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( rule__UpdateNameLegend__Group__2__Impl rule__UpdateNameLegend__Group__3 )
            // InternalMyDsl.g:1549:2: rule__UpdateNameLegend__Group__2__Impl rule__UpdateNameLegend__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UpdateNameLegend__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateNameLegend__Group__3();

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
    // $ANTLR end "rule__UpdateNameLegend__Group__2"


    // $ANTLR start "rule__UpdateNameLegend__Group__2__Impl"
    // InternalMyDsl.g:1556:1: rule__UpdateNameLegend__Group__2__Impl : ( 'in' ) ;
    public final void rule__UpdateNameLegend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( ( 'in' ) )
            // InternalMyDsl.g:1561:1: ( 'in' )
            {
            // InternalMyDsl.g:1561:1: ( 'in' )
            // InternalMyDsl.g:1562:2: 'in'
            {
             before(grammarAccess.getUpdateNameLegendAccess().getInKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUpdateNameLegendAccess().getInKeyword_2()); 

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
    // $ANTLR end "rule__UpdateNameLegend__Group__2__Impl"


    // $ANTLR start "rule__UpdateNameLegend__Group__3"
    // InternalMyDsl.g:1571:1: rule__UpdateNameLegend__Group__3 : rule__UpdateNameLegend__Group__3__Impl ;
    public final void rule__UpdateNameLegend__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( rule__UpdateNameLegend__Group__3__Impl )
            // InternalMyDsl.g:1576:2: rule__UpdateNameLegend__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameLegend__Group__3__Impl();

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
    // $ANTLR end "rule__UpdateNameLegend__Group__3"


    // $ANTLR start "rule__UpdateNameLegend__Group__3__Impl"
    // InternalMyDsl.g:1582:1: rule__UpdateNameLegend__Group__3__Impl : ( ( rule__UpdateNameLegend__NewnameAssignment_3 ) ) ;
    public final void rule__UpdateNameLegend__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1586:1: ( ( ( rule__UpdateNameLegend__NewnameAssignment_3 ) ) )
            // InternalMyDsl.g:1587:1: ( ( rule__UpdateNameLegend__NewnameAssignment_3 ) )
            {
            // InternalMyDsl.g:1587:1: ( ( rule__UpdateNameLegend__NewnameAssignment_3 ) )
            // InternalMyDsl.g:1588:2: ( rule__UpdateNameLegend__NewnameAssignment_3 )
            {
             before(grammarAccess.getUpdateNameLegendAccess().getNewnameAssignment_3()); 
            // InternalMyDsl.g:1589:2: ( rule__UpdateNameLegend__NewnameAssignment_3 )
            // InternalMyDsl.g:1589:3: rule__UpdateNameLegend__NewnameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameLegend__NewnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateNameLegendAccess().getNewnameAssignment_3()); 

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
    // $ANTLR end "rule__UpdateNameLegend__Group__3__Impl"


    // $ANTLR start "rule__UpdateNameAxeX__Group__0"
    // InternalMyDsl.g:1598:1: rule__UpdateNameAxeX__Group__0 : rule__UpdateNameAxeX__Group__0__Impl rule__UpdateNameAxeX__Group__1 ;
    public final void rule__UpdateNameAxeX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( rule__UpdateNameAxeX__Group__0__Impl rule__UpdateNameAxeX__Group__1 )
            // InternalMyDsl.g:1603:2: rule__UpdateNameAxeX__Group__0__Impl rule__UpdateNameAxeX__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UpdateNameAxeX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeX__Group__1();

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
    // $ANTLR end "rule__UpdateNameAxeX__Group__0"


    // $ANTLR start "rule__UpdateNameAxeX__Group__0__Impl"
    // InternalMyDsl.g:1610:1: rule__UpdateNameAxeX__Group__0__Impl : ( 'TitleAxeX' ) ;
    public final void rule__UpdateNameAxeX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( ( 'TitleAxeX' ) )
            // InternalMyDsl.g:1615:1: ( 'TitleAxeX' )
            {
            // InternalMyDsl.g:1615:1: ( 'TitleAxeX' )
            // InternalMyDsl.g:1616:2: 'TitleAxeX'
            {
             before(grammarAccess.getUpdateNameAxeXAccess().getTitleAxeXKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUpdateNameAxeXAccess().getTitleAxeXKeyword_0()); 

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
    // $ANTLR end "rule__UpdateNameAxeX__Group__0__Impl"


    // $ANTLR start "rule__UpdateNameAxeX__Group__1"
    // InternalMyDsl.g:1625:1: rule__UpdateNameAxeX__Group__1 : rule__UpdateNameAxeX__Group__1__Impl rule__UpdateNameAxeX__Group__2 ;
    public final void rule__UpdateNameAxeX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( rule__UpdateNameAxeX__Group__1__Impl rule__UpdateNameAxeX__Group__2 )
            // InternalMyDsl.g:1630:2: rule__UpdateNameAxeX__Group__1__Impl rule__UpdateNameAxeX__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UpdateNameAxeX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeX__Group__2();

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
    // $ANTLR end "rule__UpdateNameAxeX__Group__1"


    // $ANTLR start "rule__UpdateNameAxeX__Group__1__Impl"
    // InternalMyDsl.g:1637:1: rule__UpdateNameAxeX__Group__1__Impl : ( ':' ) ;
    public final void rule__UpdateNameAxeX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( ( ':' ) )
            // InternalMyDsl.g:1642:1: ( ':' )
            {
            // InternalMyDsl.g:1642:1: ( ':' )
            // InternalMyDsl.g:1643:2: ':'
            {
             before(grammarAccess.getUpdateNameAxeXAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUpdateNameAxeXAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__UpdateNameAxeX__Group__1__Impl"


    // $ANTLR start "rule__UpdateNameAxeX__Group__2"
    // InternalMyDsl.g:1652:1: rule__UpdateNameAxeX__Group__2 : rule__UpdateNameAxeX__Group__2__Impl ;
    public final void rule__UpdateNameAxeX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( rule__UpdateNameAxeX__Group__2__Impl )
            // InternalMyDsl.g:1657:2: rule__UpdateNameAxeX__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeX__Group__2__Impl();

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
    // $ANTLR end "rule__UpdateNameAxeX__Group__2"


    // $ANTLR start "rule__UpdateNameAxeX__Group__2__Impl"
    // InternalMyDsl.g:1663:1: rule__UpdateNameAxeX__Group__2__Impl : ( ( rule__UpdateNameAxeX__NameAssignment_2 ) ) ;
    public final void rule__UpdateNameAxeX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( ( ( rule__UpdateNameAxeX__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1668:1: ( ( rule__UpdateNameAxeX__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1668:1: ( ( rule__UpdateNameAxeX__NameAssignment_2 ) )
            // InternalMyDsl.g:1669:2: ( rule__UpdateNameAxeX__NameAssignment_2 )
            {
             before(grammarAccess.getUpdateNameAxeXAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1670:2: ( rule__UpdateNameAxeX__NameAssignment_2 )
            // InternalMyDsl.g:1670:3: rule__UpdateNameAxeX__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeX__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateNameAxeXAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__UpdateNameAxeX__Group__2__Impl"


    // $ANTLR start "rule__UpdateNameAxeY__Group__0"
    // InternalMyDsl.g:1679:1: rule__UpdateNameAxeY__Group__0 : rule__UpdateNameAxeY__Group__0__Impl rule__UpdateNameAxeY__Group__1 ;
    public final void rule__UpdateNameAxeY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( rule__UpdateNameAxeY__Group__0__Impl rule__UpdateNameAxeY__Group__1 )
            // InternalMyDsl.g:1684:2: rule__UpdateNameAxeY__Group__0__Impl rule__UpdateNameAxeY__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UpdateNameAxeY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeY__Group__1();

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
    // $ANTLR end "rule__UpdateNameAxeY__Group__0"


    // $ANTLR start "rule__UpdateNameAxeY__Group__0__Impl"
    // InternalMyDsl.g:1691:1: rule__UpdateNameAxeY__Group__0__Impl : ( 'TitleAxeY' ) ;
    public final void rule__UpdateNameAxeY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( 'TitleAxeY' ) )
            // InternalMyDsl.g:1696:1: ( 'TitleAxeY' )
            {
            // InternalMyDsl.g:1696:1: ( 'TitleAxeY' )
            // InternalMyDsl.g:1697:2: 'TitleAxeY'
            {
             before(grammarAccess.getUpdateNameAxeYAccess().getTitleAxeYKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getUpdateNameAxeYAccess().getTitleAxeYKeyword_0()); 

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
    // $ANTLR end "rule__UpdateNameAxeY__Group__0__Impl"


    // $ANTLR start "rule__UpdateNameAxeY__Group__1"
    // InternalMyDsl.g:1706:1: rule__UpdateNameAxeY__Group__1 : rule__UpdateNameAxeY__Group__1__Impl rule__UpdateNameAxeY__Group__2 ;
    public final void rule__UpdateNameAxeY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( rule__UpdateNameAxeY__Group__1__Impl rule__UpdateNameAxeY__Group__2 )
            // InternalMyDsl.g:1711:2: rule__UpdateNameAxeY__Group__1__Impl rule__UpdateNameAxeY__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UpdateNameAxeY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeY__Group__2();

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
    // $ANTLR end "rule__UpdateNameAxeY__Group__1"


    // $ANTLR start "rule__UpdateNameAxeY__Group__1__Impl"
    // InternalMyDsl.g:1718:1: rule__UpdateNameAxeY__Group__1__Impl : ( ':' ) ;
    public final void rule__UpdateNameAxeY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( ( ':' ) )
            // InternalMyDsl.g:1723:1: ( ':' )
            {
            // InternalMyDsl.g:1723:1: ( ':' )
            // InternalMyDsl.g:1724:2: ':'
            {
             before(grammarAccess.getUpdateNameAxeYAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUpdateNameAxeYAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__UpdateNameAxeY__Group__1__Impl"


    // $ANTLR start "rule__UpdateNameAxeY__Group__2"
    // InternalMyDsl.g:1733:1: rule__UpdateNameAxeY__Group__2 : rule__UpdateNameAxeY__Group__2__Impl ;
    public final void rule__UpdateNameAxeY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( rule__UpdateNameAxeY__Group__2__Impl )
            // InternalMyDsl.g:1738:2: rule__UpdateNameAxeY__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeY__Group__2__Impl();

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
    // $ANTLR end "rule__UpdateNameAxeY__Group__2"


    // $ANTLR start "rule__UpdateNameAxeY__Group__2__Impl"
    // InternalMyDsl.g:1744:1: rule__UpdateNameAxeY__Group__2__Impl : ( ( rule__UpdateNameAxeY__NameAssignment_2 ) ) ;
    public final void rule__UpdateNameAxeY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1748:1: ( ( ( rule__UpdateNameAxeY__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1749:1: ( ( rule__UpdateNameAxeY__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1749:1: ( ( rule__UpdateNameAxeY__NameAssignment_2 ) )
            // InternalMyDsl.g:1750:2: ( rule__UpdateNameAxeY__NameAssignment_2 )
            {
             before(grammarAccess.getUpdateNameAxeYAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1751:2: ( rule__UpdateNameAxeY__NameAssignment_2 )
            // InternalMyDsl.g:1751:3: rule__UpdateNameAxeY__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpdateNameAxeY__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateNameAxeYAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__UpdateNameAxeY__Group__2__Impl"


    // $ANTLR start "rule__FilterGroupBy__Group__0"
    // InternalMyDsl.g:1760:1: rule__FilterGroupBy__Group__0 : rule__FilterGroupBy__Group__0__Impl rule__FilterGroupBy__Group__1 ;
    public final void rule__FilterGroupBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( rule__FilterGroupBy__Group__0__Impl rule__FilterGroupBy__Group__1 )
            // InternalMyDsl.g:1765:2: rule__FilterGroupBy__Group__0__Impl rule__FilterGroupBy__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FilterGroupBy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__Group__1();

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
    // $ANTLR end "rule__FilterGroupBy__Group__0"


    // $ANTLR start "rule__FilterGroupBy__Group__0__Impl"
    // InternalMyDsl.g:1772:1: rule__FilterGroupBy__Group__0__Impl : ( 'Group' ) ;
    public final void rule__FilterGroupBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( ( 'Group' ) )
            // InternalMyDsl.g:1777:1: ( 'Group' )
            {
            // InternalMyDsl.g:1777:1: ( 'Group' )
            // InternalMyDsl.g:1778:2: 'Group'
            {
             before(grammarAccess.getFilterGroupByAccess().getGroupKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFilterGroupByAccess().getGroupKeyword_0()); 

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
    // $ANTLR end "rule__FilterGroupBy__Group__0__Impl"


    // $ANTLR start "rule__FilterGroupBy__Group__1"
    // InternalMyDsl.g:1787:1: rule__FilterGroupBy__Group__1 : rule__FilterGroupBy__Group__1__Impl rule__FilterGroupBy__Group__2 ;
    public final void rule__FilterGroupBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( rule__FilterGroupBy__Group__1__Impl rule__FilterGroupBy__Group__2 )
            // InternalMyDsl.g:1792:2: rule__FilterGroupBy__Group__1__Impl rule__FilterGroupBy__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FilterGroupBy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__Group__2();

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
    // $ANTLR end "rule__FilterGroupBy__Group__1"


    // $ANTLR start "rule__FilterGroupBy__Group__1__Impl"
    // InternalMyDsl.g:1799:1: rule__FilterGroupBy__Group__1__Impl : ( ( rule__FilterGroupBy__NameColumnsYAssignment_1 ) ) ;
    public final void rule__FilterGroupBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( ( ( rule__FilterGroupBy__NameColumnsYAssignment_1 ) ) )
            // InternalMyDsl.g:1804:1: ( ( rule__FilterGroupBy__NameColumnsYAssignment_1 ) )
            {
            // InternalMyDsl.g:1804:1: ( ( rule__FilterGroupBy__NameColumnsYAssignment_1 ) )
            // InternalMyDsl.g:1805:2: ( rule__FilterGroupBy__NameColumnsYAssignment_1 )
            {
             before(grammarAccess.getFilterGroupByAccess().getNameColumnsYAssignment_1()); 
            // InternalMyDsl.g:1806:2: ( rule__FilterGroupBy__NameColumnsYAssignment_1 )
            // InternalMyDsl.g:1806:3: rule__FilterGroupBy__NameColumnsYAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__NameColumnsYAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterGroupByAccess().getNameColumnsYAssignment_1()); 

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
    // $ANTLR end "rule__FilterGroupBy__Group__1__Impl"


    // $ANTLR start "rule__FilterGroupBy__Group__2"
    // InternalMyDsl.g:1814:1: rule__FilterGroupBy__Group__2 : rule__FilterGroupBy__Group__2__Impl rule__FilterGroupBy__Group__3 ;
    public final void rule__FilterGroupBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( rule__FilterGroupBy__Group__2__Impl rule__FilterGroupBy__Group__3 )
            // InternalMyDsl.g:1819:2: rule__FilterGroupBy__Group__2__Impl rule__FilterGroupBy__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FilterGroupBy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__Group__3();

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
    // $ANTLR end "rule__FilterGroupBy__Group__2"


    // $ANTLR start "rule__FilterGroupBy__Group__2__Impl"
    // InternalMyDsl.g:1826:1: rule__FilterGroupBy__Group__2__Impl : ( 'by' ) ;
    public final void rule__FilterGroupBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( ( 'by' ) )
            // InternalMyDsl.g:1831:1: ( 'by' )
            {
            // InternalMyDsl.g:1831:1: ( 'by' )
            // InternalMyDsl.g:1832:2: 'by'
            {
             before(grammarAccess.getFilterGroupByAccess().getByKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFilterGroupByAccess().getByKeyword_2()); 

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
    // $ANTLR end "rule__FilterGroupBy__Group__2__Impl"


    // $ANTLR start "rule__FilterGroupBy__Group__3"
    // InternalMyDsl.g:1841:1: rule__FilterGroupBy__Group__3 : rule__FilterGroupBy__Group__3__Impl rule__FilterGroupBy__Group__4 ;
    public final void rule__FilterGroupBy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( rule__FilterGroupBy__Group__3__Impl rule__FilterGroupBy__Group__4 )
            // InternalMyDsl.g:1846:2: rule__FilterGroupBy__Group__3__Impl rule__FilterGroupBy__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__FilterGroupBy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__Group__4();

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
    // $ANTLR end "rule__FilterGroupBy__Group__3"


    // $ANTLR start "rule__FilterGroupBy__Group__3__Impl"
    // InternalMyDsl.g:1853:1: rule__FilterGroupBy__Group__3__Impl : ( ( rule__FilterGroupBy__NameColumnsXAssignment_3 ) ) ;
    public final void rule__FilterGroupBy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( ( rule__FilterGroupBy__NameColumnsXAssignment_3 ) ) )
            // InternalMyDsl.g:1858:1: ( ( rule__FilterGroupBy__NameColumnsXAssignment_3 ) )
            {
            // InternalMyDsl.g:1858:1: ( ( rule__FilterGroupBy__NameColumnsXAssignment_3 ) )
            // InternalMyDsl.g:1859:2: ( rule__FilterGroupBy__NameColumnsXAssignment_3 )
            {
             before(grammarAccess.getFilterGroupByAccess().getNameColumnsXAssignment_3()); 
            // InternalMyDsl.g:1860:2: ( rule__FilterGroupBy__NameColumnsXAssignment_3 )
            // InternalMyDsl.g:1860:3: rule__FilterGroupBy__NameColumnsXAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__NameColumnsXAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFilterGroupByAccess().getNameColumnsXAssignment_3()); 

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
    // $ANTLR end "rule__FilterGroupBy__Group__3__Impl"


    // $ANTLR start "rule__FilterGroupBy__Group__4"
    // InternalMyDsl.g:1868:1: rule__FilterGroupBy__Group__4 : rule__FilterGroupBy__Group__4__Impl rule__FilterGroupBy__Group__5 ;
    public final void rule__FilterGroupBy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( rule__FilterGroupBy__Group__4__Impl rule__FilterGroupBy__Group__5 )
            // InternalMyDsl.g:1873:2: rule__FilterGroupBy__Group__4__Impl rule__FilterGroupBy__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__FilterGroupBy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__Group__5();

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
    // $ANTLR end "rule__FilterGroupBy__Group__4"


    // $ANTLR start "rule__FilterGroupBy__Group__4__Impl"
    // InternalMyDsl.g:1880:1: rule__FilterGroupBy__Group__4__Impl : ( 'in' ) ;
    public final void rule__FilterGroupBy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( ( 'in' ) )
            // InternalMyDsl.g:1885:1: ( 'in' )
            {
            // InternalMyDsl.g:1885:1: ( 'in' )
            // InternalMyDsl.g:1886:2: 'in'
            {
             before(grammarAccess.getFilterGroupByAccess().getInKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFilterGroupByAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__FilterGroupBy__Group__4__Impl"


    // $ANTLR start "rule__FilterGroupBy__Group__5"
    // InternalMyDsl.g:1895:1: rule__FilterGroupBy__Group__5 : rule__FilterGroupBy__Group__5__Impl ;
    public final void rule__FilterGroupBy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( rule__FilterGroupBy__Group__5__Impl )
            // InternalMyDsl.g:1900:2: rule__FilterGroupBy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__Group__5__Impl();

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
    // $ANTLR end "rule__FilterGroupBy__Group__5"


    // $ANTLR start "rule__FilterGroupBy__Group__5__Impl"
    // InternalMyDsl.g:1906:1: rule__FilterGroupBy__Group__5__Impl : ( ( rule__FilterGroupBy__FonctionAgregationAssignment_5 ) ) ;
    public final void rule__FilterGroupBy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1910:1: ( ( ( rule__FilterGroupBy__FonctionAgregationAssignment_5 ) ) )
            // InternalMyDsl.g:1911:1: ( ( rule__FilterGroupBy__FonctionAgregationAssignment_5 ) )
            {
            // InternalMyDsl.g:1911:1: ( ( rule__FilterGroupBy__FonctionAgregationAssignment_5 ) )
            // InternalMyDsl.g:1912:2: ( rule__FilterGroupBy__FonctionAgregationAssignment_5 )
            {
             before(grammarAccess.getFilterGroupByAccess().getFonctionAgregationAssignment_5()); 
            // InternalMyDsl.g:1913:2: ( rule__FilterGroupBy__FonctionAgregationAssignment_5 )
            // InternalMyDsl.g:1913:3: rule__FilterGroupBy__FonctionAgregationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FilterGroupBy__FonctionAgregationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFilterGroupByAccess().getFonctionAgregationAssignment_5()); 

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
    // $ANTLR end "rule__FilterGroupBy__Group__5__Impl"


    // $ANTLR start "rule__FilterNotNull__Group__0"
    // InternalMyDsl.g:1922:1: rule__FilterNotNull__Group__0 : rule__FilterNotNull__Group__0__Impl rule__FilterNotNull__Group__1 ;
    public final void rule__FilterNotNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( rule__FilterNotNull__Group__0__Impl rule__FilterNotNull__Group__1 )
            // InternalMyDsl.g:1927:2: rule__FilterNotNull__Group__0__Impl rule__FilterNotNull__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FilterNotNull__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterNotNull__Group__1();

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
    // $ANTLR end "rule__FilterNotNull__Group__0"


    // $ANTLR start "rule__FilterNotNull__Group__0__Impl"
    // InternalMyDsl.g:1934:1: rule__FilterNotNull__Group__0__Impl : ( 'NotNull' ) ;
    public final void rule__FilterNotNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( ( 'NotNull' ) )
            // InternalMyDsl.g:1939:1: ( 'NotNull' )
            {
            // InternalMyDsl.g:1939:1: ( 'NotNull' )
            // InternalMyDsl.g:1940:2: 'NotNull'
            {
             before(grammarAccess.getFilterNotNullAccess().getNotNullKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFilterNotNullAccess().getNotNullKeyword_0()); 

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
    // $ANTLR end "rule__FilterNotNull__Group__0__Impl"


    // $ANTLR start "rule__FilterNotNull__Group__1"
    // InternalMyDsl.g:1949:1: rule__FilterNotNull__Group__1 : rule__FilterNotNull__Group__1__Impl rule__FilterNotNull__Group__2 ;
    public final void rule__FilterNotNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( rule__FilterNotNull__Group__1__Impl rule__FilterNotNull__Group__2 )
            // InternalMyDsl.g:1954:2: rule__FilterNotNull__Group__1__Impl rule__FilterNotNull__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FilterNotNull__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterNotNull__Group__2();

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
    // $ANTLR end "rule__FilterNotNull__Group__1"


    // $ANTLR start "rule__FilterNotNull__Group__1__Impl"
    // InternalMyDsl.g:1961:1: rule__FilterNotNull__Group__1__Impl : ( ':' ) ;
    public final void rule__FilterNotNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( ( ':' ) )
            // InternalMyDsl.g:1966:1: ( ':' )
            {
            // InternalMyDsl.g:1966:1: ( ':' )
            // InternalMyDsl.g:1967:2: ':'
            {
             before(grammarAccess.getFilterNotNullAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFilterNotNullAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__FilterNotNull__Group__1__Impl"


    // $ANTLR start "rule__FilterNotNull__Group__2"
    // InternalMyDsl.g:1976:1: rule__FilterNotNull__Group__2 : rule__FilterNotNull__Group__2__Impl ;
    public final void rule__FilterNotNull__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( rule__FilterNotNull__Group__2__Impl )
            // InternalMyDsl.g:1981:2: rule__FilterNotNull__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterNotNull__Group__2__Impl();

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
    // $ANTLR end "rule__FilterNotNull__Group__2"


    // $ANTLR start "rule__FilterNotNull__Group__2__Impl"
    // InternalMyDsl.g:1987:1: rule__FilterNotNull__Group__2__Impl : ( ( rule__FilterNotNull__NameAssignment_2 ) ) ;
    public final void rule__FilterNotNull__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1991:1: ( ( ( rule__FilterNotNull__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1992:1: ( ( rule__FilterNotNull__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1992:1: ( ( rule__FilterNotNull__NameAssignment_2 ) )
            // InternalMyDsl.g:1993:2: ( rule__FilterNotNull__NameAssignment_2 )
            {
             before(grammarAccess.getFilterNotNullAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1994:2: ( rule__FilterNotNull__NameAssignment_2 )
            // InternalMyDsl.g:1994:3: rule__FilterNotNull__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterNotNull__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterNotNullAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FilterNotNull__Group__2__Impl"


    // $ANTLR start "rule__CompareQuali__Group__0"
    // InternalMyDsl.g:2003:1: rule__CompareQuali__Group__0 : rule__CompareQuali__Group__0__Impl rule__CompareQuali__Group__1 ;
    public final void rule__CompareQuali__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( rule__CompareQuali__Group__0__Impl rule__CompareQuali__Group__1 )
            // InternalMyDsl.g:2008:2: rule__CompareQuali__Group__0__Impl rule__CompareQuali__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CompareQuali__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareQuali__Group__1();

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
    // $ANTLR end "rule__CompareQuali__Group__0"


    // $ANTLR start "rule__CompareQuali__Group__0__Impl"
    // InternalMyDsl.g:2015:1: rule__CompareQuali__Group__0__Impl : ( 'ComparisonColumnsWithString' ) ;
    public final void rule__CompareQuali__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( 'ComparisonColumnsWithString' ) )
            // InternalMyDsl.g:2020:1: ( 'ComparisonColumnsWithString' )
            {
            // InternalMyDsl.g:2020:1: ( 'ComparisonColumnsWithString' )
            // InternalMyDsl.g:2021:2: 'ComparisonColumnsWithString'
            {
             before(grammarAccess.getCompareQualiAccess().getComparisonColumnsWithStringKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCompareQualiAccess().getComparisonColumnsWithStringKeyword_0()); 

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
    // $ANTLR end "rule__CompareQuali__Group__0__Impl"


    // $ANTLR start "rule__CompareQuali__Group__1"
    // InternalMyDsl.g:2030:1: rule__CompareQuali__Group__1 : rule__CompareQuali__Group__1__Impl rule__CompareQuali__Group__2 ;
    public final void rule__CompareQuali__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( rule__CompareQuali__Group__1__Impl rule__CompareQuali__Group__2 )
            // InternalMyDsl.g:2035:2: rule__CompareQuali__Group__1__Impl rule__CompareQuali__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CompareQuali__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareQuali__Group__2();

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
    // $ANTLR end "rule__CompareQuali__Group__1"


    // $ANTLR start "rule__CompareQuali__Group__1__Impl"
    // InternalMyDsl.g:2042:1: rule__CompareQuali__Group__1__Impl : ( ( rule__CompareQuali__NameAssignment_1 ) ) ;
    public final void rule__CompareQuali__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( ( rule__CompareQuali__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2047:1: ( ( rule__CompareQuali__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2047:1: ( ( rule__CompareQuali__NameAssignment_1 ) )
            // InternalMyDsl.g:2048:2: ( rule__CompareQuali__NameAssignment_1 )
            {
             before(grammarAccess.getCompareQualiAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2049:2: ( rule__CompareQuali__NameAssignment_1 )
            // InternalMyDsl.g:2049:3: rule__CompareQuali__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuali__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompareQualiAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CompareQuali__Group__1__Impl"


    // $ANTLR start "rule__CompareQuali__Group__2"
    // InternalMyDsl.g:2057:1: rule__CompareQuali__Group__2 : rule__CompareQuali__Group__2__Impl rule__CompareQuali__Group__3 ;
    public final void rule__CompareQuali__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2061:1: ( rule__CompareQuali__Group__2__Impl rule__CompareQuali__Group__3 )
            // InternalMyDsl.g:2062:2: rule__CompareQuali__Group__2__Impl rule__CompareQuali__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CompareQuali__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareQuali__Group__3();

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
    // $ANTLR end "rule__CompareQuali__Group__2"


    // $ANTLR start "rule__CompareQuali__Group__2__Impl"
    // InternalMyDsl.g:2069:1: rule__CompareQuali__Group__2__Impl : ( ( rule__CompareQuali__ComparaisonAssignment_2 ) ) ;
    public final void rule__CompareQuali__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( ( ( rule__CompareQuali__ComparaisonAssignment_2 ) ) )
            // InternalMyDsl.g:2074:1: ( ( rule__CompareQuali__ComparaisonAssignment_2 ) )
            {
            // InternalMyDsl.g:2074:1: ( ( rule__CompareQuali__ComparaisonAssignment_2 ) )
            // InternalMyDsl.g:2075:2: ( rule__CompareQuali__ComparaisonAssignment_2 )
            {
             before(grammarAccess.getCompareQualiAccess().getComparaisonAssignment_2()); 
            // InternalMyDsl.g:2076:2: ( rule__CompareQuali__ComparaisonAssignment_2 )
            // InternalMyDsl.g:2076:3: rule__CompareQuali__ComparaisonAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuali__ComparaisonAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareQualiAccess().getComparaisonAssignment_2()); 

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
    // $ANTLR end "rule__CompareQuali__Group__2__Impl"


    // $ANTLR start "rule__CompareQuali__Group__3"
    // InternalMyDsl.g:2084:1: rule__CompareQuali__Group__3 : rule__CompareQuali__Group__3__Impl ;
    public final void rule__CompareQuali__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( rule__CompareQuali__Group__3__Impl )
            // InternalMyDsl.g:2089:2: rule__CompareQuali__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuali__Group__3__Impl();

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
    // $ANTLR end "rule__CompareQuali__Group__3"


    // $ANTLR start "rule__CompareQuali__Group__3__Impl"
    // InternalMyDsl.g:2095:1: rule__CompareQuali__Group__3__Impl : ( ( rule__CompareQuali__SomethingtocompareAssignment_3 ) ) ;
    public final void rule__CompareQuali__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( ( ( rule__CompareQuali__SomethingtocompareAssignment_3 ) ) )
            // InternalMyDsl.g:2100:1: ( ( rule__CompareQuali__SomethingtocompareAssignment_3 ) )
            {
            // InternalMyDsl.g:2100:1: ( ( rule__CompareQuali__SomethingtocompareAssignment_3 ) )
            // InternalMyDsl.g:2101:2: ( rule__CompareQuali__SomethingtocompareAssignment_3 )
            {
             before(grammarAccess.getCompareQualiAccess().getSomethingtocompareAssignment_3()); 
            // InternalMyDsl.g:2102:2: ( rule__CompareQuali__SomethingtocompareAssignment_3 )
            // InternalMyDsl.g:2102:3: rule__CompareQuali__SomethingtocompareAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuali__SomethingtocompareAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompareQualiAccess().getSomethingtocompareAssignment_3()); 

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
    // $ANTLR end "rule__CompareQuali__Group__3__Impl"


    // $ANTLR start "rule__CompareQuanti__Group__0"
    // InternalMyDsl.g:2111:1: rule__CompareQuanti__Group__0 : rule__CompareQuanti__Group__0__Impl rule__CompareQuanti__Group__1 ;
    public final void rule__CompareQuanti__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( rule__CompareQuanti__Group__0__Impl rule__CompareQuanti__Group__1 )
            // InternalMyDsl.g:2116:2: rule__CompareQuanti__Group__0__Impl rule__CompareQuanti__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CompareQuanti__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareQuanti__Group__1();

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
    // $ANTLR end "rule__CompareQuanti__Group__0"


    // $ANTLR start "rule__CompareQuanti__Group__0__Impl"
    // InternalMyDsl.g:2123:1: rule__CompareQuanti__Group__0__Impl : ( 'ComparisonColumnsWithNumber' ) ;
    public final void rule__CompareQuanti__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( ( 'ComparisonColumnsWithNumber' ) )
            // InternalMyDsl.g:2128:1: ( 'ComparisonColumnsWithNumber' )
            {
            // InternalMyDsl.g:2128:1: ( 'ComparisonColumnsWithNumber' )
            // InternalMyDsl.g:2129:2: 'ComparisonColumnsWithNumber'
            {
             before(grammarAccess.getCompareQuantiAccess().getComparisonColumnsWithNumberKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCompareQuantiAccess().getComparisonColumnsWithNumberKeyword_0()); 

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
    // $ANTLR end "rule__CompareQuanti__Group__0__Impl"


    // $ANTLR start "rule__CompareQuanti__Group__1"
    // InternalMyDsl.g:2138:1: rule__CompareQuanti__Group__1 : rule__CompareQuanti__Group__1__Impl rule__CompareQuanti__Group__2 ;
    public final void rule__CompareQuanti__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( rule__CompareQuanti__Group__1__Impl rule__CompareQuanti__Group__2 )
            // InternalMyDsl.g:2143:2: rule__CompareQuanti__Group__1__Impl rule__CompareQuanti__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CompareQuanti__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareQuanti__Group__2();

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
    // $ANTLR end "rule__CompareQuanti__Group__1"


    // $ANTLR start "rule__CompareQuanti__Group__1__Impl"
    // InternalMyDsl.g:2150:1: rule__CompareQuanti__Group__1__Impl : ( ( rule__CompareQuanti__NameAssignment_1 ) ) ;
    public final void rule__CompareQuanti__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2154:1: ( ( ( rule__CompareQuanti__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2155:1: ( ( rule__CompareQuanti__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2155:1: ( ( rule__CompareQuanti__NameAssignment_1 ) )
            // InternalMyDsl.g:2156:2: ( rule__CompareQuanti__NameAssignment_1 )
            {
             before(grammarAccess.getCompareQuantiAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2157:2: ( rule__CompareQuanti__NameAssignment_1 )
            // InternalMyDsl.g:2157:3: rule__CompareQuanti__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuanti__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompareQuantiAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CompareQuanti__Group__1__Impl"


    // $ANTLR start "rule__CompareQuanti__Group__2"
    // InternalMyDsl.g:2165:1: rule__CompareQuanti__Group__2 : rule__CompareQuanti__Group__2__Impl rule__CompareQuanti__Group__3 ;
    public final void rule__CompareQuanti__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( rule__CompareQuanti__Group__2__Impl rule__CompareQuanti__Group__3 )
            // InternalMyDsl.g:2170:2: rule__CompareQuanti__Group__2__Impl rule__CompareQuanti__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CompareQuanti__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareQuanti__Group__3();

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
    // $ANTLR end "rule__CompareQuanti__Group__2"


    // $ANTLR start "rule__CompareQuanti__Group__2__Impl"
    // InternalMyDsl.g:2177:1: rule__CompareQuanti__Group__2__Impl : ( ( rule__CompareQuanti__ComparaisonAssignment_2 ) ) ;
    public final void rule__CompareQuanti__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( ( ( rule__CompareQuanti__ComparaisonAssignment_2 ) ) )
            // InternalMyDsl.g:2182:1: ( ( rule__CompareQuanti__ComparaisonAssignment_2 ) )
            {
            // InternalMyDsl.g:2182:1: ( ( rule__CompareQuanti__ComparaisonAssignment_2 ) )
            // InternalMyDsl.g:2183:2: ( rule__CompareQuanti__ComparaisonAssignment_2 )
            {
             before(grammarAccess.getCompareQuantiAccess().getComparaisonAssignment_2()); 
            // InternalMyDsl.g:2184:2: ( rule__CompareQuanti__ComparaisonAssignment_2 )
            // InternalMyDsl.g:2184:3: rule__CompareQuanti__ComparaisonAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuanti__ComparaisonAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareQuantiAccess().getComparaisonAssignment_2()); 

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
    // $ANTLR end "rule__CompareQuanti__Group__2__Impl"


    // $ANTLR start "rule__CompareQuanti__Group__3"
    // InternalMyDsl.g:2192:1: rule__CompareQuanti__Group__3 : rule__CompareQuanti__Group__3__Impl ;
    public final void rule__CompareQuanti__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2196:1: ( rule__CompareQuanti__Group__3__Impl )
            // InternalMyDsl.g:2197:2: rule__CompareQuanti__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuanti__Group__3__Impl();

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
    // $ANTLR end "rule__CompareQuanti__Group__3"


    // $ANTLR start "rule__CompareQuanti__Group__3__Impl"
    // InternalMyDsl.g:2203:1: rule__CompareQuanti__Group__3__Impl : ( ( rule__CompareQuanti__SomethingtocompareAssignment_3 ) ) ;
    public final void rule__CompareQuanti__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2207:1: ( ( ( rule__CompareQuanti__SomethingtocompareAssignment_3 ) ) )
            // InternalMyDsl.g:2208:1: ( ( rule__CompareQuanti__SomethingtocompareAssignment_3 ) )
            {
            // InternalMyDsl.g:2208:1: ( ( rule__CompareQuanti__SomethingtocompareAssignment_3 ) )
            // InternalMyDsl.g:2209:2: ( rule__CompareQuanti__SomethingtocompareAssignment_3 )
            {
             before(grammarAccess.getCompareQuantiAccess().getSomethingtocompareAssignment_3()); 
            // InternalMyDsl.g:2210:2: ( rule__CompareQuanti__SomethingtocompareAssignment_3 )
            // InternalMyDsl.g:2210:3: rule__CompareQuanti__SomethingtocompareAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompareQuanti__SomethingtocompareAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompareQuantiAccess().getSomethingtocompareAssignment_3()); 

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
    // $ANTLR end "rule__CompareQuanti__Group__3__Impl"


    // $ANTLR start "rule__Dashboard__NameAssignment_2"
    // InternalMyDsl.g:2219:1: rule__Dashboard__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Dashboard__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2224:2: ( ruleEString )
            {
            // InternalMyDsl.g:2224:2: ( ruleEString )
            // InternalMyDsl.g:2225:3: ruleEString
            {
             before(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Dashboard__NameAssignment_2"


    // $ANTLR start "rule__Dashboard__OwnedGraphRealisationAssignment_3"
    // InternalMyDsl.g:2234:1: rule__Dashboard__OwnedGraphRealisationAssignment_3 : ( ruleGraphRealisation ) ;
    public final void rule__Dashboard__OwnedGraphRealisationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( ( ruleGraphRealisation ) )
            // InternalMyDsl.g:2239:2: ( ruleGraphRealisation )
            {
            // InternalMyDsl.g:2239:2: ( ruleGraphRealisation )
            // InternalMyDsl.g:2240:3: ruleGraphRealisation
            {
             before(grammarAccess.getDashboardAccess().getOwnedGraphRealisationGraphRealisationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphRealisation();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getOwnedGraphRealisationGraphRealisationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Dashboard__OwnedGraphRealisationAssignment_3"


    // $ANTLR start "rule__GraphRealisation__OwnedImportAssignment_0"
    // InternalMyDsl.g:2249:1: rule__GraphRealisation__OwnedImportAssignment_0 : ( ruleImportFile ) ;
    public final void rule__GraphRealisation__OwnedImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2253:1: ( ( ruleImportFile ) )
            // InternalMyDsl.g:2254:2: ( ruleImportFile )
            {
            // InternalMyDsl.g:2254:2: ( ruleImportFile )
            // InternalMyDsl.g:2255:3: ruleImportFile
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedImportImportFileParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportFile();

            state._fsp--;

             after(grammarAccess.getGraphRealisationAccess().getOwnedImportImportFileParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__GraphRealisation__OwnedImportAssignment_0"


    // $ANTLR start "rule__GraphRealisation__OwnedGraphMakerAssignment_1"
    // InternalMyDsl.g:2264:1: rule__GraphRealisation__OwnedGraphMakerAssignment_1 : ( ruleGraphMaker ) ;
    public final void rule__GraphRealisation__OwnedGraphMakerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( ruleGraphMaker ) )
            // InternalMyDsl.g:2269:2: ( ruleGraphMaker )
            {
            // InternalMyDsl.g:2269:2: ( ruleGraphMaker )
            // InternalMyDsl.g:2270:3: ruleGraphMaker
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedGraphMakerGraphMakerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphMaker();

            state._fsp--;

             after(grammarAccess.getGraphRealisationAccess().getOwnedGraphMakerGraphMakerParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__GraphRealisation__OwnedGraphMakerAssignment_1"


    // $ANTLR start "rule__GraphRealisation__OwnedFilterAssignment_2"
    // InternalMyDsl.g:2279:1: rule__GraphRealisation__OwnedFilterAssignment_2 : ( ruleFilterData ) ;
    public final void rule__GraphRealisation__OwnedFilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ruleFilterData ) )
            // InternalMyDsl.g:2284:2: ( ruleFilterData )
            {
            // InternalMyDsl.g:2284:2: ( ruleFilterData )
            // InternalMyDsl.g:2285:3: ruleFilterData
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedFilterFilterDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterData();

            state._fsp--;

             after(grammarAccess.getGraphRealisationAccess().getOwnedFilterFilterDataParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GraphRealisation__OwnedFilterAssignment_2"


    // $ANTLR start "rule__GraphRealisation__OwnedGraphUpdateAssignment_3"
    // InternalMyDsl.g:2294:1: rule__GraphRealisation__OwnedGraphUpdateAssignment_3 : ( ruleGraphUpdate ) ;
    public final void rule__GraphRealisation__OwnedGraphUpdateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( ruleGraphUpdate ) )
            // InternalMyDsl.g:2299:2: ( ruleGraphUpdate )
            {
            // InternalMyDsl.g:2299:2: ( ruleGraphUpdate )
            // InternalMyDsl.g:2300:3: ruleGraphUpdate
            {
             before(grammarAccess.getGraphRealisationAccess().getOwnedGraphUpdateGraphUpdateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphUpdate();

            state._fsp--;

             after(grammarAccess.getGraphRealisationAccess().getOwnedGraphUpdateGraphUpdateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GraphRealisation__OwnedGraphUpdateAssignment_3"


    // $ANTLR start "rule__ImportFile__NameAssignment_2"
    // InternalMyDsl.g:2309:1: rule__ImportFile__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ImportFile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2314:2: ( ruleEString )
            {
            // InternalMyDsl.g:2314:2: ( ruleEString )
            // InternalMyDsl.g:2315:3: ruleEString
            {
             before(grammarAccess.getImportFileAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImportFileAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ImportFile__NameAssignment_2"


    // $ANTLR start "rule__ImportFile__DelimeterAssignment_5"
    // InternalMyDsl.g:2324:1: rule__ImportFile__DelimeterAssignment_5 : ( ruleEString ) ;
    public final void rule__ImportFile__DelimeterAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2329:2: ( ruleEString )
            {
            // InternalMyDsl.g:2329:2: ( ruleEString )
            // InternalMyDsl.g:2330:3: ruleEString
            {
             before(grammarAccess.getImportFileAccess().getDelimeterEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImportFileAccess().getDelimeterEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ImportFile__DelimeterAssignment_5"


    // $ANTLR start "rule__GraphMaker__TypeAssignment_2"
    // InternalMyDsl.g:2339:1: rule__GraphMaker__TypeAssignment_2 : ( ruleTypeGraph ) ;
    public final void rule__GraphMaker__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2343:1: ( ( ruleTypeGraph ) )
            // InternalMyDsl.g:2344:2: ( ruleTypeGraph )
            {
            // InternalMyDsl.g:2344:2: ( ruleTypeGraph )
            // InternalMyDsl.g:2345:3: ruleTypeGraph
            {
             before(grammarAccess.getGraphMakerAccess().getTypeTypeGraphEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeGraph();

            state._fsp--;

             after(grammarAccess.getGraphMakerAccess().getTypeTypeGraphEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__GraphMaker__TypeAssignment_2"


    // $ANTLR start "rule__GraphMaker__NameAbscisseAssignment_5"
    // InternalMyDsl.g:2354:1: rule__GraphMaker__NameAbscisseAssignment_5 : ( ruleEString ) ;
    public final void rule__GraphMaker__NameAbscisseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2359:2: ( ruleEString )
            {
            // InternalMyDsl.g:2359:2: ( ruleEString )
            // InternalMyDsl.g:2360:3: ruleEString
            {
             before(grammarAccess.getGraphMakerAccess().getNameAbscisseEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphMakerAccess().getNameAbscisseEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GraphMaker__NameAbscisseAssignment_5"


    // $ANTLR start "rule__GraphMaker__NameOrdonneesAssignment_8"
    // InternalMyDsl.g:2369:1: rule__GraphMaker__NameOrdonneesAssignment_8 : ( ruleEString ) ;
    public final void rule__GraphMaker__NameOrdonneesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2374:2: ( ruleEString )
            {
            // InternalMyDsl.g:2374:2: ( ruleEString )
            // InternalMyDsl.g:2375:3: ruleEString
            {
             before(grammarAccess.getGraphMakerAccess().getNameOrdonneesEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphMakerAccess().getNameOrdonneesEStringParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__GraphMaker__NameOrdonneesAssignment_8"


    // $ANTLR start "rule__UpdateCouleurGraph__CouleurAssignment_3"
    // InternalMyDsl.g:2384:1: rule__UpdateCouleurGraph__CouleurAssignment_3 : ( ruleEString ) ;
    public final void rule__UpdateCouleurGraph__CouleurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2388:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2389:2: ( ruleEString )
            {
            // InternalMyDsl.g:2389:2: ( ruleEString )
            // InternalMyDsl.g:2390:3: ruleEString
            {
             before(grammarAccess.getUpdateCouleurGraphAccess().getCouleurEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateCouleurGraphAccess().getCouleurEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UpdateCouleurGraph__CouleurAssignment_3"


    // $ANTLR start "rule__UpdateNameLegend__OldnameAssignment_1"
    // InternalMyDsl.g:2399:1: rule__UpdateNameLegend__OldnameAssignment_1 : ( ruleEString ) ;
    public final void rule__UpdateNameLegend__OldnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2404:2: ( ruleEString )
            {
            // InternalMyDsl.g:2404:2: ( ruleEString )
            // InternalMyDsl.g:2405:3: ruleEString
            {
             before(grammarAccess.getUpdateNameLegendAccess().getOldnameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateNameLegendAccess().getOldnameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UpdateNameLegend__OldnameAssignment_1"


    // $ANTLR start "rule__UpdateNameLegend__NewnameAssignment_3"
    // InternalMyDsl.g:2414:1: rule__UpdateNameLegend__NewnameAssignment_3 : ( ruleEString ) ;
    public final void rule__UpdateNameLegend__NewnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2419:2: ( ruleEString )
            {
            // InternalMyDsl.g:2419:2: ( ruleEString )
            // InternalMyDsl.g:2420:3: ruleEString
            {
             before(grammarAccess.getUpdateNameLegendAccess().getNewnameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateNameLegendAccess().getNewnameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UpdateNameLegend__NewnameAssignment_3"


    // $ANTLR start "rule__UpdateNameAxeX__NameAssignment_2"
    // InternalMyDsl.g:2429:1: rule__UpdateNameAxeX__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UpdateNameAxeX__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2434:2: ( ruleEString )
            {
            // InternalMyDsl.g:2434:2: ( ruleEString )
            // InternalMyDsl.g:2435:3: ruleEString
            {
             before(grammarAccess.getUpdateNameAxeXAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateNameAxeXAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UpdateNameAxeX__NameAssignment_2"


    // $ANTLR start "rule__UpdateNameAxeY__NameAssignment_2"
    // InternalMyDsl.g:2444:1: rule__UpdateNameAxeY__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UpdateNameAxeY__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2449:2: ( ruleEString )
            {
            // InternalMyDsl.g:2449:2: ( ruleEString )
            // InternalMyDsl.g:2450:3: ruleEString
            {
             before(grammarAccess.getUpdateNameAxeYAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateNameAxeYAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UpdateNameAxeY__NameAssignment_2"


    // $ANTLR start "rule__FilterGroupBy__NameColumnsYAssignment_1"
    // InternalMyDsl.g:2459:1: rule__FilterGroupBy__NameColumnsYAssignment_1 : ( ruleEString ) ;
    public final void rule__FilterGroupBy__NameColumnsYAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2464:2: ( ruleEString )
            {
            // InternalMyDsl.g:2464:2: ( ruleEString )
            // InternalMyDsl.g:2465:3: ruleEString
            {
             before(grammarAccess.getFilterGroupByAccess().getNameColumnsYEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterGroupByAccess().getNameColumnsYEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterGroupBy__NameColumnsYAssignment_1"


    // $ANTLR start "rule__FilterGroupBy__NameColumnsXAssignment_3"
    // InternalMyDsl.g:2474:1: rule__FilterGroupBy__NameColumnsXAssignment_3 : ( ruleEString ) ;
    public final void rule__FilterGroupBy__NameColumnsXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2479:2: ( ruleEString )
            {
            // InternalMyDsl.g:2479:2: ( ruleEString )
            // InternalMyDsl.g:2480:3: ruleEString
            {
             before(grammarAccess.getFilterGroupByAccess().getNameColumnsXEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterGroupByAccess().getNameColumnsXEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FilterGroupBy__NameColumnsXAssignment_3"


    // $ANTLR start "rule__FilterGroupBy__FonctionAgregationAssignment_5"
    // InternalMyDsl.g:2489:1: rule__FilterGroupBy__FonctionAgregationAssignment_5 : ( ruleFonctionAgregation ) ;
    public final void rule__FilterGroupBy__FonctionAgregationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( ( ruleFonctionAgregation ) )
            // InternalMyDsl.g:2494:2: ( ruleFonctionAgregation )
            {
            // InternalMyDsl.g:2494:2: ( ruleFonctionAgregation )
            // InternalMyDsl.g:2495:3: ruleFonctionAgregation
            {
             before(grammarAccess.getFilterGroupByAccess().getFonctionAgregationFonctionAgregationEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionAgregation();

            state._fsp--;

             after(grammarAccess.getFilterGroupByAccess().getFonctionAgregationFonctionAgregationEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__FilterGroupBy__FonctionAgregationAssignment_5"


    // $ANTLR start "rule__FilterNotNull__NameAssignment_2"
    // InternalMyDsl.g:2504:1: rule__FilterNotNull__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FilterNotNull__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2509:2: ( ruleEString )
            {
            // InternalMyDsl.g:2509:2: ( ruleEString )
            // InternalMyDsl.g:2510:3: ruleEString
            {
             before(grammarAccess.getFilterNotNullAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterNotNullAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FilterNotNull__NameAssignment_2"


    // $ANTLR start "rule__CompareQuali__NameAssignment_1"
    // InternalMyDsl.g:2519:1: rule__CompareQuali__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompareQuali__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2523:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2524:2: ( ruleEString )
            {
            // InternalMyDsl.g:2524:2: ( ruleEString )
            // InternalMyDsl.g:2525:3: ruleEString
            {
             before(grammarAccess.getCompareQualiAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompareQualiAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompareQuali__NameAssignment_1"


    // $ANTLR start "rule__CompareQuali__ComparaisonAssignment_2"
    // InternalMyDsl.g:2534:1: rule__CompareQuali__ComparaisonAssignment_2 : ( ruleFonctionComparaisonQuali ) ;
    public final void rule__CompareQuali__ComparaisonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( ( ruleFonctionComparaisonQuali ) )
            // InternalMyDsl.g:2539:2: ( ruleFonctionComparaisonQuali )
            {
            // InternalMyDsl.g:2539:2: ( ruleFonctionComparaisonQuali )
            // InternalMyDsl.g:2540:3: ruleFonctionComparaisonQuali
            {
             before(grammarAccess.getCompareQualiAccess().getComparaisonFonctionComparaisonQualiEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionComparaisonQuali();

            state._fsp--;

             after(grammarAccess.getCompareQualiAccess().getComparaisonFonctionComparaisonQualiEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompareQuali__ComparaisonAssignment_2"


    // $ANTLR start "rule__CompareQuali__SomethingtocompareAssignment_3"
    // InternalMyDsl.g:2549:1: rule__CompareQuali__SomethingtocompareAssignment_3 : ( ruleEString ) ;
    public final void rule__CompareQuali__SomethingtocompareAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2554:2: ( ruleEString )
            {
            // InternalMyDsl.g:2554:2: ( ruleEString )
            // InternalMyDsl.g:2555:3: ruleEString
            {
             before(grammarAccess.getCompareQualiAccess().getSomethingtocompareEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompareQualiAccess().getSomethingtocompareEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CompareQuali__SomethingtocompareAssignment_3"


    // $ANTLR start "rule__CompareQuanti__NameAssignment_1"
    // InternalMyDsl.g:2564:1: rule__CompareQuanti__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompareQuanti__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2568:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2569:2: ( ruleEString )
            {
            // InternalMyDsl.g:2569:2: ( ruleEString )
            // InternalMyDsl.g:2570:3: ruleEString
            {
             before(grammarAccess.getCompareQuantiAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompareQuantiAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompareQuanti__NameAssignment_1"


    // $ANTLR start "rule__CompareQuanti__ComparaisonAssignment_2"
    // InternalMyDsl.g:2579:1: rule__CompareQuanti__ComparaisonAssignment_2 : ( ruleFonctionComparaisonQuanti ) ;
    public final void rule__CompareQuanti__ComparaisonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2583:1: ( ( ruleFonctionComparaisonQuanti ) )
            // InternalMyDsl.g:2584:2: ( ruleFonctionComparaisonQuanti )
            {
            // InternalMyDsl.g:2584:2: ( ruleFonctionComparaisonQuanti )
            // InternalMyDsl.g:2585:3: ruleFonctionComparaisonQuanti
            {
             before(grammarAccess.getCompareQuantiAccess().getComparaisonFonctionComparaisonQuantiEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionComparaisonQuanti();

            state._fsp--;

             after(grammarAccess.getCompareQuantiAccess().getComparaisonFonctionComparaisonQuantiEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompareQuanti__ComparaisonAssignment_2"


    // $ANTLR start "rule__CompareQuanti__SomethingtocompareAssignment_3"
    // InternalMyDsl.g:2594:1: rule__CompareQuanti__SomethingtocompareAssignment_3 : ( ruleEString ) ;
    public final void rule__CompareQuanti__SomethingtocompareAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2598:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2599:2: ( ruleEString )
            {
            // InternalMyDsl.g:2599:2: ( ruleEString )
            // InternalMyDsl.g:2600:3: ruleEString
            {
             before(grammarAccess.getCompareQuantiAccess().getSomethingtocompareEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompareQuantiAccess().getSomethingtocompareEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CompareQuanti__SomethingtocompareAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00003BA800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00003A0000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001A800000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000003FC000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000FC00000L});

}