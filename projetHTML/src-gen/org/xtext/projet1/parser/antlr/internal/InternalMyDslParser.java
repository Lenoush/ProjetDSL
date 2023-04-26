package org.xtext.projet1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.projet1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NameDashboard'", "':'", "'CSV'", "'Delimiter'", "'TypeOfGraph'", "'Abscissa'", "'Ordinate(s)'", "'Color(s)'", "'graph'", "'Transformation'", "'in'", "'TitleAxeX'", "'TitleAxeY'", "'Group'", "'by'", "'NotNull'", "'ComparisonColumnsWithString'", "'ComparisonColumnsWithNumber'", "'Bar'", "'Line'", "'Nuage de point'", "'median'", "'sum'", "'mean'", "'min'", "'max'", "'count'", "'std'", "'var'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dashboard";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDashboard"
    // InternalMyDsl.g:65:1: entryRuleDashboard returns [EObject current=null] : iv_ruleDashboard= ruleDashboard EOF ;
    public final EObject entryRuleDashboard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashboard = null;


        try {
            // InternalMyDsl.g:65:50: (iv_ruleDashboard= ruleDashboard EOF )
            // InternalMyDsl.g:66:2: iv_ruleDashboard= ruleDashboard EOF
            {
             newCompositeNode(grammarAccess.getDashboardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDashboard=ruleDashboard();

            state._fsp--;

             current =iv_ruleDashboard; 
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
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // InternalMyDsl.g:72:1: ruleDashboard returns [EObject current=null] : (otherlv_0= 'NameDashboard' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedGraphRealisation_3_0= ruleGraphRealisation ) )* ) ;
    public final EObject ruleDashboard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedGraphRealisation_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'NameDashboard' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedGraphRealisation_3_0= ruleGraphRealisation ) )* ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'NameDashboard' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedGraphRealisation_3_0= ruleGraphRealisation ) )* )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'NameDashboard' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedGraphRealisation_3_0= ruleGraphRealisation ) )* )
            // InternalMyDsl.g:80:3: otherlv_0= 'NameDashboard' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ( (lv_ownedGraphRealisation_3_0= ruleGraphRealisation ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDashboardAccess().getNameDashboardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDashboardAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:88:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:89:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:89:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:90:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashboardRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:107:3: ( (lv_ownedGraphRealisation_3_0= ruleGraphRealisation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:108:4: (lv_ownedGraphRealisation_3_0= ruleGraphRealisation )
            	    {
            	    // InternalMyDsl.g:108:4: (lv_ownedGraphRealisation_3_0= ruleGraphRealisation )
            	    // InternalMyDsl.g:109:5: lv_ownedGraphRealisation_3_0= ruleGraphRealisation
            	    {

            	    					newCompositeNode(grammarAccess.getDashboardAccess().getOwnedGraphRealisationGraphRealisationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedGraphRealisation_3_0=ruleGraphRealisation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDashboardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedGraphRealisation",
            	    						lv_ownedGraphRealisation_3_0,
            	    						"org.xtext.projet1.MyDsl.GraphRealisation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRuleGraphRealisation"
    // InternalMyDsl.g:130:1: entryRuleGraphRealisation returns [EObject current=null] : iv_ruleGraphRealisation= ruleGraphRealisation EOF ;
    public final EObject entryRuleGraphRealisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphRealisation = null;


        try {
            // InternalMyDsl.g:130:57: (iv_ruleGraphRealisation= ruleGraphRealisation EOF )
            // InternalMyDsl.g:131:2: iv_ruleGraphRealisation= ruleGraphRealisation EOF
            {
             newCompositeNode(grammarAccess.getGraphRealisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphRealisation=ruleGraphRealisation();

            state._fsp--;

             current =iv_ruleGraphRealisation; 
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
    // $ANTLR end "entryRuleGraphRealisation"


    // $ANTLR start "ruleGraphRealisation"
    // InternalMyDsl.g:137:1: ruleGraphRealisation returns [EObject current=null] : ( ( (lv_ownedImport_0_0= ruleImportFile ) ) ( (lv_ownedGraphMaker_1_0= ruleGraphMaker ) ) ( (lv_ownedFilter_2_0= ruleFilterData ) )* ( (lv_ownedGraphUpdate_3_0= ruleGraphUpdate ) )* ) ;
    public final EObject ruleGraphRealisation() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedGraphMaker_1_0 = null;

        EObject lv_ownedFilter_2_0 = null;

        EObject lv_ownedGraphUpdate_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:143:2: ( ( ( (lv_ownedImport_0_0= ruleImportFile ) ) ( (lv_ownedGraphMaker_1_0= ruleGraphMaker ) ) ( (lv_ownedFilter_2_0= ruleFilterData ) )* ( (lv_ownedGraphUpdate_3_0= ruleGraphUpdate ) )* ) )
            // InternalMyDsl.g:144:2: ( ( (lv_ownedImport_0_0= ruleImportFile ) ) ( (lv_ownedGraphMaker_1_0= ruleGraphMaker ) ) ( (lv_ownedFilter_2_0= ruleFilterData ) )* ( (lv_ownedGraphUpdate_3_0= ruleGraphUpdate ) )* )
            {
            // InternalMyDsl.g:144:2: ( ( (lv_ownedImport_0_0= ruleImportFile ) ) ( (lv_ownedGraphMaker_1_0= ruleGraphMaker ) ) ( (lv_ownedFilter_2_0= ruleFilterData ) )* ( (lv_ownedGraphUpdate_3_0= ruleGraphUpdate ) )* )
            // InternalMyDsl.g:145:3: ( (lv_ownedImport_0_0= ruleImportFile ) ) ( (lv_ownedGraphMaker_1_0= ruleGraphMaker ) ) ( (lv_ownedFilter_2_0= ruleFilterData ) )* ( (lv_ownedGraphUpdate_3_0= ruleGraphUpdate ) )*
            {
            // InternalMyDsl.g:145:3: ( (lv_ownedImport_0_0= ruleImportFile ) )
            // InternalMyDsl.g:146:4: (lv_ownedImport_0_0= ruleImportFile )
            {
            // InternalMyDsl.g:146:4: (lv_ownedImport_0_0= ruleImportFile )
            // InternalMyDsl.g:147:5: lv_ownedImport_0_0= ruleImportFile
            {

            					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedImportImportFileParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_ownedImport_0_0=ruleImportFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
            					}
            					set(
            						current,
            						"ownedImport",
            						lv_ownedImport_0_0,
            						"org.xtext.projet1.MyDsl.ImportFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:164:3: ( (lv_ownedGraphMaker_1_0= ruleGraphMaker ) )
            // InternalMyDsl.g:165:4: (lv_ownedGraphMaker_1_0= ruleGraphMaker )
            {
            // InternalMyDsl.g:165:4: (lv_ownedGraphMaker_1_0= ruleGraphMaker )
            // InternalMyDsl.g:166:5: lv_ownedGraphMaker_1_0= ruleGraphMaker
            {

            					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedGraphMakerGraphMakerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_ownedGraphMaker_1_0=ruleGraphMaker();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
            					}
            					set(
            						current,
            						"ownedGraphMaker",
            						lv_ownedGraphMaker_1_0,
            						"org.xtext.projet1.MyDsl.GraphMaker");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:183:3: ( (lv_ownedFilter_2_0= ruleFilterData ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24||(LA2_0>=26 && LA2_0<=28)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:184:4: (lv_ownedFilter_2_0= ruleFilterData )
            	    {
            	    // InternalMyDsl.g:184:4: (lv_ownedFilter_2_0= ruleFilterData )
            	    // InternalMyDsl.g:185:5: lv_ownedFilter_2_0= ruleFilterData
            	    {

            	    					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedFilterFilterDataParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_ownedFilter_2_0=ruleFilterData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedFilter",
            	    						lv_ownedFilter_2_0,
            	    						"org.xtext.projet1.MyDsl.FilterData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:202:3: ( (lv_ownedGraphUpdate_3_0= ruleGraphUpdate ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||LA3_0==20||(LA3_0>=22 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:203:4: (lv_ownedGraphUpdate_3_0= ruleGraphUpdate )
            	    {
            	    // InternalMyDsl.g:203:4: (lv_ownedGraphUpdate_3_0= ruleGraphUpdate )
            	    // InternalMyDsl.g:204:5: lv_ownedGraphUpdate_3_0= ruleGraphUpdate
            	    {

            	    					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedGraphUpdateGraphUpdateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ownedGraphUpdate_3_0=ruleGraphUpdate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedGraphUpdate",
            	    						lv_ownedGraphUpdate_3_0,
            	    						"org.xtext.projet1.MyDsl.GraphUpdate");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleGraphRealisation"


    // $ANTLR start "entryRuleImportFile"
    // InternalMyDsl.g:225:1: entryRuleImportFile returns [EObject current=null] : iv_ruleImportFile= ruleImportFile EOF ;
    public final EObject entryRuleImportFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportFile = null;


        try {
            // InternalMyDsl.g:225:51: (iv_ruleImportFile= ruleImportFile EOF )
            // InternalMyDsl.g:226:2: iv_ruleImportFile= ruleImportFile EOF
            {
             newCompositeNode(grammarAccess.getImportFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportFile=ruleImportFile();

            state._fsp--;

             current =iv_ruleImportFile; 
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
    // $ANTLR end "entryRuleImportFile"


    // $ANTLR start "ruleImportFile"
    // InternalMyDsl.g:232:1: ruleImportFile returns [EObject current=null] : (otherlv_0= 'CSV' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Delimiter' otherlv_4= ':' ( (lv_delimeter_5_0= ruleEString ) ) ) ;
    public final EObject ruleImportFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_delimeter_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:238:2: ( (otherlv_0= 'CSV' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Delimiter' otherlv_4= ':' ( (lv_delimeter_5_0= ruleEString ) ) ) )
            // InternalMyDsl.g:239:2: (otherlv_0= 'CSV' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Delimiter' otherlv_4= ':' ( (lv_delimeter_5_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:239:2: (otherlv_0= 'CSV' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Delimiter' otherlv_4= ':' ( (lv_delimeter_5_0= ruleEString ) ) )
            // InternalMyDsl.g:240:3: otherlv_0= 'CSV' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Delimiter' otherlv_4= ':' ( (lv_delimeter_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportFileAccess().getCSVKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImportFileAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:248:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:249:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:249:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:250:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportFileAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportFileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getImportFileAccess().getDelimiterKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getImportFileAccess().getColonKeyword_4());
            		
            // InternalMyDsl.g:275:3: ( (lv_delimeter_5_0= ruleEString ) )
            // InternalMyDsl.g:276:4: (lv_delimeter_5_0= ruleEString )
            {
            // InternalMyDsl.g:276:4: (lv_delimeter_5_0= ruleEString )
            // InternalMyDsl.g:277:5: lv_delimeter_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportFileAccess().getDelimeterEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_delimeter_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportFileRule());
            					}
            					set(
            						current,
            						"delimeter",
            						lv_delimeter_5_0,
            						"org.xtext.projet1.MyDsl.EString");
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
    // $ANTLR end "ruleImportFile"


    // $ANTLR start "entryRuleGraphMaker"
    // InternalMyDsl.g:298:1: entryRuleGraphMaker returns [EObject current=null] : iv_ruleGraphMaker= ruleGraphMaker EOF ;
    public final EObject entryRuleGraphMaker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphMaker = null;


        try {
            // InternalMyDsl.g:298:51: (iv_ruleGraphMaker= ruleGraphMaker EOF )
            // InternalMyDsl.g:299:2: iv_ruleGraphMaker= ruleGraphMaker EOF
            {
             newCompositeNode(grammarAccess.getGraphMakerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphMaker=ruleGraphMaker();

            state._fsp--;

             current =iv_ruleGraphMaker; 
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
    // $ANTLR end "entryRuleGraphMaker"


    // $ANTLR start "ruleGraphMaker"
    // InternalMyDsl.g:305:1: ruleGraphMaker returns [EObject current=null] : (otherlv_0= 'TypeOfGraph' otherlv_1= ':' ( (lv_type_2_0= ruleTypeGraph ) ) otherlv_3= 'Abscissa' otherlv_4= ':' ( (lv_nameAbscisse_5_0= ruleEString ) ) otherlv_6= 'Ordinate(s)' otherlv_7= ':' ( (lv_nameOrdonnees_8_0= ruleEString ) )+ ) ;
    public final EObject ruleGraphMaker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_nameAbscisse_5_0 = null;

        AntlrDatatypeRuleToken lv_nameOrdonnees_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:311:2: ( (otherlv_0= 'TypeOfGraph' otherlv_1= ':' ( (lv_type_2_0= ruleTypeGraph ) ) otherlv_3= 'Abscissa' otherlv_4= ':' ( (lv_nameAbscisse_5_0= ruleEString ) ) otherlv_6= 'Ordinate(s)' otherlv_7= ':' ( (lv_nameOrdonnees_8_0= ruleEString ) )+ ) )
            // InternalMyDsl.g:312:2: (otherlv_0= 'TypeOfGraph' otherlv_1= ':' ( (lv_type_2_0= ruleTypeGraph ) ) otherlv_3= 'Abscissa' otherlv_4= ':' ( (lv_nameAbscisse_5_0= ruleEString ) ) otherlv_6= 'Ordinate(s)' otherlv_7= ':' ( (lv_nameOrdonnees_8_0= ruleEString ) )+ )
            {
            // InternalMyDsl.g:312:2: (otherlv_0= 'TypeOfGraph' otherlv_1= ':' ( (lv_type_2_0= ruleTypeGraph ) ) otherlv_3= 'Abscissa' otherlv_4= ':' ( (lv_nameAbscisse_5_0= ruleEString ) ) otherlv_6= 'Ordinate(s)' otherlv_7= ':' ( (lv_nameOrdonnees_8_0= ruleEString ) )+ )
            // InternalMyDsl.g:313:3: otherlv_0= 'TypeOfGraph' otherlv_1= ':' ( (lv_type_2_0= ruleTypeGraph ) ) otherlv_3= 'Abscissa' otherlv_4= ':' ( (lv_nameAbscisse_5_0= ruleEString ) ) otherlv_6= 'Ordinate(s)' otherlv_7= ':' ( (lv_nameOrdonnees_8_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphMakerAccess().getTypeOfGraphKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphMakerAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:321:3: ( (lv_type_2_0= ruleTypeGraph ) )
            // InternalMyDsl.g:322:4: (lv_type_2_0= ruleTypeGraph )
            {
            // InternalMyDsl.g:322:4: (lv_type_2_0= ruleTypeGraph )
            // InternalMyDsl.g:323:5: lv_type_2_0= ruleTypeGraph
            {

            					newCompositeNode(grammarAccess.getGraphMakerAccess().getTypeTypeGraphEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleTypeGraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphMakerRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.projet1.MyDsl.TypeGraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphMakerAccess().getAbscissaKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphMakerAccess().getColonKeyword_4());
            		
            // InternalMyDsl.g:348:3: ( (lv_nameAbscisse_5_0= ruleEString ) )
            // InternalMyDsl.g:349:4: (lv_nameAbscisse_5_0= ruleEString )
            {
            // InternalMyDsl.g:349:4: (lv_nameAbscisse_5_0= ruleEString )
            // InternalMyDsl.g:350:5: lv_nameAbscisse_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphMakerAccess().getNameAbscisseEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_nameAbscisse_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphMakerRule());
            					}
            					set(
            						current,
            						"nameAbscisse",
            						lv_nameAbscisse_5_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphMakerAccess().getOrdinateSKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphMakerAccess().getColonKeyword_7());
            		
            // InternalMyDsl.g:375:3: ( (lv_nameOrdonnees_8_0= ruleEString ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:376:4: (lv_nameOrdonnees_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:376:4: (lv_nameOrdonnees_8_0= ruleEString )
            	    // InternalMyDsl.g:377:5: lv_nameOrdonnees_8_0= ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getGraphMakerAccess().getNameOrdonneesEStringParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_nameOrdonnees_8_0=ruleEString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGraphMakerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nameOrdonnees",
            	    						lv_nameOrdonnees_8_0,
            	    						"org.xtext.projet1.MyDsl.EString");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleGraphMaker"


    // $ANTLR start "entryRuleGraphUpdate"
    // InternalMyDsl.g:398:1: entryRuleGraphUpdate returns [EObject current=null] : iv_ruleGraphUpdate= ruleGraphUpdate EOF ;
    public final EObject entryRuleGraphUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphUpdate = null;


        try {
            // InternalMyDsl.g:398:52: (iv_ruleGraphUpdate= ruleGraphUpdate EOF )
            // InternalMyDsl.g:399:2: iv_ruleGraphUpdate= ruleGraphUpdate EOF
            {
             newCompositeNode(grammarAccess.getGraphUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphUpdate=ruleGraphUpdate();

            state._fsp--;

             current =iv_ruleGraphUpdate; 
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
    // $ANTLR end "entryRuleGraphUpdate"


    // $ANTLR start "ruleGraphUpdate"
    // InternalMyDsl.g:405:1: ruleGraphUpdate returns [EObject current=null] : (this_UpdateNameAxeX_0= ruleUpdateNameAxeX | this_UpdateNameAxeY_1= ruleUpdateNameAxeY | this_UpdateNameLegend_2= ruleUpdateNameLegend | this_UpdateCouleurGraph_3= ruleUpdateCouleurGraph ) ;
    public final EObject ruleGraphUpdate() throws RecognitionException {
        EObject current = null;

        EObject this_UpdateNameAxeX_0 = null;

        EObject this_UpdateNameAxeY_1 = null;

        EObject this_UpdateNameLegend_2 = null;

        EObject this_UpdateCouleurGraph_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:411:2: ( (this_UpdateNameAxeX_0= ruleUpdateNameAxeX | this_UpdateNameAxeY_1= ruleUpdateNameAxeY | this_UpdateNameLegend_2= ruleUpdateNameLegend | this_UpdateCouleurGraph_3= ruleUpdateCouleurGraph ) )
            // InternalMyDsl.g:412:2: (this_UpdateNameAxeX_0= ruleUpdateNameAxeX | this_UpdateNameAxeY_1= ruleUpdateNameAxeY | this_UpdateNameLegend_2= ruleUpdateNameLegend | this_UpdateCouleurGraph_3= ruleUpdateCouleurGraph )
            {
            // InternalMyDsl.g:412:2: (this_UpdateNameAxeX_0= ruleUpdateNameAxeX | this_UpdateNameAxeY_1= ruleUpdateNameAxeY | this_UpdateNameLegend_2= ruleUpdateNameLegend | this_UpdateCouleurGraph_3= ruleUpdateCouleurGraph )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:413:3: this_UpdateNameAxeX_0= ruleUpdateNameAxeX
                    {

                    			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeXParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdateNameAxeX_0=ruleUpdateNameAxeX();

                    state._fsp--;


                    			current = this_UpdateNameAxeX_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:422:3: this_UpdateNameAxeY_1= ruleUpdateNameAxeY
                    {

                    			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeYParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdateNameAxeY_1=ruleUpdateNameAxeY();

                    state._fsp--;


                    			current = this_UpdateNameAxeY_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:431:3: this_UpdateNameLegend_2= ruleUpdateNameLegend
                    {

                    			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateNameLegendParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdateNameLegend_2=ruleUpdateNameLegend();

                    state._fsp--;


                    			current = this_UpdateNameLegend_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:440:3: this_UpdateCouleurGraph_3= ruleUpdateCouleurGraph
                    {

                    			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateCouleurGraphParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdateCouleurGraph_3=ruleUpdateCouleurGraph();

                    state._fsp--;


                    			current = this_UpdateCouleurGraph_3;
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
    // $ANTLR end "ruleGraphUpdate"


    // $ANTLR start "entryRuleUpdateCouleurGraph"
    // InternalMyDsl.g:452:1: entryRuleUpdateCouleurGraph returns [EObject current=null] : iv_ruleUpdateCouleurGraph= ruleUpdateCouleurGraph EOF ;
    public final EObject entryRuleUpdateCouleurGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateCouleurGraph = null;


        try {
            // InternalMyDsl.g:452:59: (iv_ruleUpdateCouleurGraph= ruleUpdateCouleurGraph EOF )
            // InternalMyDsl.g:453:2: iv_ruleUpdateCouleurGraph= ruleUpdateCouleurGraph EOF
            {
             newCompositeNode(grammarAccess.getUpdateCouleurGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateCouleurGraph=ruleUpdateCouleurGraph();

            state._fsp--;

             current =iv_ruleUpdateCouleurGraph; 
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
    // $ANTLR end "entryRuleUpdateCouleurGraph"


    // $ANTLR start "ruleUpdateCouleurGraph"
    // InternalMyDsl.g:459:1: ruleUpdateCouleurGraph returns [EObject current=null] : (otherlv_0= 'Color(s)' otherlv_1= 'graph' otherlv_2= ':' ( (lv_couleur_3_0= ruleEString ) )+ ) ;
    public final EObject ruleUpdateCouleurGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_couleur_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:465:2: ( (otherlv_0= 'Color(s)' otherlv_1= 'graph' otherlv_2= ':' ( (lv_couleur_3_0= ruleEString ) )+ ) )
            // InternalMyDsl.g:466:2: (otherlv_0= 'Color(s)' otherlv_1= 'graph' otherlv_2= ':' ( (lv_couleur_3_0= ruleEString ) )+ )
            {
            // InternalMyDsl.g:466:2: (otherlv_0= 'Color(s)' otherlv_1= 'graph' otherlv_2= ':' ( (lv_couleur_3_0= ruleEString ) )+ )
            // InternalMyDsl.g:467:3: otherlv_0= 'Color(s)' otherlv_1= 'graph' otherlv_2= ':' ( (lv_couleur_3_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateCouleurGraphAccess().getColorSKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateCouleurGraphAccess().getGraphKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateCouleurGraphAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:479:3: ( (lv_couleur_3_0= ruleEString ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:480:4: (lv_couleur_3_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:480:4: (lv_couleur_3_0= ruleEString )
            	    // InternalMyDsl.g:481:5: lv_couleur_3_0= ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getUpdateCouleurGraphAccess().getCouleurEStringParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_couleur_3_0=ruleEString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUpdateCouleurGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"couleur",
            	    						lv_couleur_3_0,
            	    						"org.xtext.projet1.MyDsl.EString");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleUpdateCouleurGraph"


    // $ANTLR start "entryRuleUpdateNameLegend"
    // InternalMyDsl.g:502:1: entryRuleUpdateNameLegend returns [EObject current=null] : iv_ruleUpdateNameLegend= ruleUpdateNameLegend EOF ;
    public final EObject entryRuleUpdateNameLegend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateNameLegend = null;


        try {
            // InternalMyDsl.g:502:57: (iv_ruleUpdateNameLegend= ruleUpdateNameLegend EOF )
            // InternalMyDsl.g:503:2: iv_ruleUpdateNameLegend= ruleUpdateNameLegend EOF
            {
             newCompositeNode(grammarAccess.getUpdateNameLegendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateNameLegend=ruleUpdateNameLegend();

            state._fsp--;

             current =iv_ruleUpdateNameLegend; 
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
    // $ANTLR end "entryRuleUpdateNameLegend"


    // $ANTLR start "ruleUpdateNameLegend"
    // InternalMyDsl.g:509:1: ruleUpdateNameLegend returns [EObject current=null] : (otherlv_0= 'Transformation' ( (lv_oldname_1_0= ruleEString ) ) otherlv_2= 'in' ( (lv_newname_3_0= ruleEString ) ) ) ;
    public final EObject ruleUpdateNameLegend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_oldname_1_0 = null;

        AntlrDatatypeRuleToken lv_newname_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:515:2: ( (otherlv_0= 'Transformation' ( (lv_oldname_1_0= ruleEString ) ) otherlv_2= 'in' ( (lv_newname_3_0= ruleEString ) ) ) )
            // InternalMyDsl.g:516:2: (otherlv_0= 'Transformation' ( (lv_oldname_1_0= ruleEString ) ) otherlv_2= 'in' ( (lv_newname_3_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:516:2: (otherlv_0= 'Transformation' ( (lv_oldname_1_0= ruleEString ) ) otherlv_2= 'in' ( (lv_newname_3_0= ruleEString ) ) )
            // InternalMyDsl.g:517:3: otherlv_0= 'Transformation' ( (lv_oldname_1_0= ruleEString ) ) otherlv_2= 'in' ( (lv_newname_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateNameLegendAccess().getTransformationKeyword_0());
            		
            // InternalMyDsl.g:521:3: ( (lv_oldname_1_0= ruleEString ) )
            // InternalMyDsl.g:522:4: (lv_oldname_1_0= ruleEString )
            {
            // InternalMyDsl.g:522:4: (lv_oldname_1_0= ruleEString )
            // InternalMyDsl.g:523:5: lv_oldname_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateNameLegendAccess().getOldnameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_oldname_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateNameLegendRule());
            					}
            					set(
            						current,
            						"oldname",
            						lv_oldname_1_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateNameLegendAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:544:3: ( (lv_newname_3_0= ruleEString ) )
            // InternalMyDsl.g:545:4: (lv_newname_3_0= ruleEString )
            {
            // InternalMyDsl.g:545:4: (lv_newname_3_0= ruleEString )
            // InternalMyDsl.g:546:5: lv_newname_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateNameLegendAccess().getNewnameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_newname_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateNameLegendRule());
            					}
            					set(
            						current,
            						"newname",
            						lv_newname_3_0,
            						"org.xtext.projet1.MyDsl.EString");
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
    // $ANTLR end "ruleUpdateNameLegend"


    // $ANTLR start "entryRuleUpdateNameAxeX"
    // InternalMyDsl.g:567:1: entryRuleUpdateNameAxeX returns [EObject current=null] : iv_ruleUpdateNameAxeX= ruleUpdateNameAxeX EOF ;
    public final EObject entryRuleUpdateNameAxeX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateNameAxeX = null;


        try {
            // InternalMyDsl.g:567:55: (iv_ruleUpdateNameAxeX= ruleUpdateNameAxeX EOF )
            // InternalMyDsl.g:568:2: iv_ruleUpdateNameAxeX= ruleUpdateNameAxeX EOF
            {
             newCompositeNode(grammarAccess.getUpdateNameAxeXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateNameAxeX=ruleUpdateNameAxeX();

            state._fsp--;

             current =iv_ruleUpdateNameAxeX; 
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
    // $ANTLR end "entryRuleUpdateNameAxeX"


    // $ANTLR start "ruleUpdateNameAxeX"
    // InternalMyDsl.g:574:1: ruleUpdateNameAxeX returns [EObject current=null] : (otherlv_0= 'TitleAxeX' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleUpdateNameAxeX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:580:2: ( (otherlv_0= 'TitleAxeX' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:581:2: (otherlv_0= 'TitleAxeX' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:581:2: (otherlv_0= 'TitleAxeX' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:582:3: otherlv_0= 'TitleAxeX' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateNameAxeXAccess().getTitleAxeXKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateNameAxeXAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:590:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:591:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:591:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:592:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateNameAxeXAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateNameAxeXRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.projet1.MyDsl.EString");
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
    // $ANTLR end "ruleUpdateNameAxeX"


    // $ANTLR start "entryRuleUpdateNameAxeY"
    // InternalMyDsl.g:613:1: entryRuleUpdateNameAxeY returns [EObject current=null] : iv_ruleUpdateNameAxeY= ruleUpdateNameAxeY EOF ;
    public final EObject entryRuleUpdateNameAxeY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateNameAxeY = null;


        try {
            // InternalMyDsl.g:613:55: (iv_ruleUpdateNameAxeY= ruleUpdateNameAxeY EOF )
            // InternalMyDsl.g:614:2: iv_ruleUpdateNameAxeY= ruleUpdateNameAxeY EOF
            {
             newCompositeNode(grammarAccess.getUpdateNameAxeYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateNameAxeY=ruleUpdateNameAxeY();

            state._fsp--;

             current =iv_ruleUpdateNameAxeY; 
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
    // $ANTLR end "entryRuleUpdateNameAxeY"


    // $ANTLR start "ruleUpdateNameAxeY"
    // InternalMyDsl.g:620:1: ruleUpdateNameAxeY returns [EObject current=null] : (otherlv_0= 'TitleAxeY' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleUpdateNameAxeY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:626:2: ( (otherlv_0= 'TitleAxeY' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:627:2: (otherlv_0= 'TitleAxeY' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:627:2: (otherlv_0= 'TitleAxeY' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:628:3: otherlv_0= 'TitleAxeY' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateNameAxeYAccess().getTitleAxeYKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateNameAxeYAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:636:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:637:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:637:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:638:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateNameAxeYAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateNameAxeYRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.projet1.MyDsl.EString");
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
    // $ANTLR end "ruleUpdateNameAxeY"


    // $ANTLR start "entryRuleFilterData"
    // InternalMyDsl.g:659:1: entryRuleFilterData returns [EObject current=null] : iv_ruleFilterData= ruleFilterData EOF ;
    public final EObject entryRuleFilterData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterData = null;


        try {
            // InternalMyDsl.g:659:51: (iv_ruleFilterData= ruleFilterData EOF )
            // InternalMyDsl.g:660:2: iv_ruleFilterData= ruleFilterData EOF
            {
             newCompositeNode(grammarAccess.getFilterDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterData=ruleFilterData();

            state._fsp--;

             current =iv_ruleFilterData; 
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
    // $ANTLR end "entryRuleFilterData"


    // $ANTLR start "ruleFilterData"
    // InternalMyDsl.g:666:1: ruleFilterData returns [EObject current=null] : (this_FilterNotNull_0= ruleFilterNotNull | this_FilterCompare_1= ruleFilterCompare | this_FilterGroupBy_2= ruleFilterGroupBy ) ;
    public final EObject ruleFilterData() throws RecognitionException {
        EObject current = null;

        EObject this_FilterNotNull_0 = null;

        EObject this_FilterCompare_1 = null;

        EObject this_FilterGroupBy_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:672:2: ( (this_FilterNotNull_0= ruleFilterNotNull | this_FilterCompare_1= ruleFilterCompare | this_FilterGroupBy_2= ruleFilterGroupBy ) )
            // InternalMyDsl.g:673:2: (this_FilterNotNull_0= ruleFilterNotNull | this_FilterCompare_1= ruleFilterCompare | this_FilterGroupBy_2= ruleFilterGroupBy )
            {
            // InternalMyDsl.g:673:2: (this_FilterNotNull_0= ruleFilterNotNull | this_FilterCompare_1= ruleFilterCompare | this_FilterGroupBy_2= ruleFilterGroupBy )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
            case 28:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:674:3: this_FilterNotNull_0= ruleFilterNotNull
                    {

                    			newCompositeNode(grammarAccess.getFilterDataAccess().getFilterNotNullParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterNotNull_0=ruleFilterNotNull();

                    state._fsp--;


                    			current = this_FilterNotNull_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:683:3: this_FilterCompare_1= ruleFilterCompare
                    {

                    			newCompositeNode(grammarAccess.getFilterDataAccess().getFilterCompareParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterCompare_1=ruleFilterCompare();

                    state._fsp--;


                    			current = this_FilterCompare_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:692:3: this_FilterGroupBy_2= ruleFilterGroupBy
                    {

                    			newCompositeNode(grammarAccess.getFilterDataAccess().getFilterGroupByParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterGroupBy_2=ruleFilterGroupBy();

                    state._fsp--;


                    			current = this_FilterGroupBy_2;
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
    // $ANTLR end "ruleFilterData"


    // $ANTLR start "entryRuleFilterGroupBy"
    // InternalMyDsl.g:704:1: entryRuleFilterGroupBy returns [EObject current=null] : iv_ruleFilterGroupBy= ruleFilterGroupBy EOF ;
    public final EObject entryRuleFilterGroupBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterGroupBy = null;


        try {
            // InternalMyDsl.g:704:54: (iv_ruleFilterGroupBy= ruleFilterGroupBy EOF )
            // InternalMyDsl.g:705:2: iv_ruleFilterGroupBy= ruleFilterGroupBy EOF
            {
             newCompositeNode(grammarAccess.getFilterGroupByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterGroupBy=ruleFilterGroupBy();

            state._fsp--;

             current =iv_ruleFilterGroupBy; 
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
    // $ANTLR end "entryRuleFilterGroupBy"


    // $ANTLR start "ruleFilterGroupBy"
    // InternalMyDsl.g:711:1: ruleFilterGroupBy returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_nameColumnsY_1_0= ruleEString ) ) otherlv_2= 'by' ( (lv_nameColumnsX_3_0= ruleEString ) ) otherlv_4= 'in' ( (lv_fonctionAgregation_5_0= ruleFonctionAgregation ) ) ) ;
    public final EObject ruleFilterGroupBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nameColumnsY_1_0 = null;

        AntlrDatatypeRuleToken lv_nameColumnsX_3_0 = null;

        Enumerator lv_fonctionAgregation_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:717:2: ( (otherlv_0= 'Group' ( (lv_nameColumnsY_1_0= ruleEString ) ) otherlv_2= 'by' ( (lv_nameColumnsX_3_0= ruleEString ) ) otherlv_4= 'in' ( (lv_fonctionAgregation_5_0= ruleFonctionAgregation ) ) ) )
            // InternalMyDsl.g:718:2: (otherlv_0= 'Group' ( (lv_nameColumnsY_1_0= ruleEString ) ) otherlv_2= 'by' ( (lv_nameColumnsX_3_0= ruleEString ) ) otherlv_4= 'in' ( (lv_fonctionAgregation_5_0= ruleFonctionAgregation ) ) )
            {
            // InternalMyDsl.g:718:2: (otherlv_0= 'Group' ( (lv_nameColumnsY_1_0= ruleEString ) ) otherlv_2= 'by' ( (lv_nameColumnsX_3_0= ruleEString ) ) otherlv_4= 'in' ( (lv_fonctionAgregation_5_0= ruleFonctionAgregation ) ) )
            // InternalMyDsl.g:719:3: otherlv_0= 'Group' ( (lv_nameColumnsY_1_0= ruleEString ) ) otherlv_2= 'by' ( (lv_nameColumnsX_3_0= ruleEString ) ) otherlv_4= 'in' ( (lv_fonctionAgregation_5_0= ruleFonctionAgregation ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterGroupByAccess().getGroupKeyword_0());
            		
            // InternalMyDsl.g:723:3: ( (lv_nameColumnsY_1_0= ruleEString ) )
            // InternalMyDsl.g:724:4: (lv_nameColumnsY_1_0= ruleEString )
            {
            // InternalMyDsl.g:724:4: (lv_nameColumnsY_1_0= ruleEString )
            // InternalMyDsl.g:725:5: lv_nameColumnsY_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterGroupByAccess().getNameColumnsYEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_nameColumnsY_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterGroupByRule());
            					}
            					set(
            						current,
            						"nameColumnsY",
            						lv_nameColumnsY_1_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterGroupByAccess().getByKeyword_2());
            		
            // InternalMyDsl.g:746:3: ( (lv_nameColumnsX_3_0= ruleEString ) )
            // InternalMyDsl.g:747:4: (lv_nameColumnsX_3_0= ruleEString )
            {
            // InternalMyDsl.g:747:4: (lv_nameColumnsX_3_0= ruleEString )
            // InternalMyDsl.g:748:5: lv_nameColumnsX_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterGroupByAccess().getNameColumnsXEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_nameColumnsX_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterGroupByRule());
            					}
            					set(
            						current,
            						"nameColumnsX",
            						lv_nameColumnsX_3_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getFilterGroupByAccess().getInKeyword_4());
            		
            // InternalMyDsl.g:769:3: ( (lv_fonctionAgregation_5_0= ruleFonctionAgregation ) )
            // InternalMyDsl.g:770:4: (lv_fonctionAgregation_5_0= ruleFonctionAgregation )
            {
            // InternalMyDsl.g:770:4: (lv_fonctionAgregation_5_0= ruleFonctionAgregation )
            // InternalMyDsl.g:771:5: lv_fonctionAgregation_5_0= ruleFonctionAgregation
            {

            					newCompositeNode(grammarAccess.getFilterGroupByAccess().getFonctionAgregationFonctionAgregationEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_fonctionAgregation_5_0=ruleFonctionAgregation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterGroupByRule());
            					}
            					set(
            						current,
            						"fonctionAgregation",
            						lv_fonctionAgregation_5_0,
            						"org.xtext.projet1.MyDsl.FonctionAgregation");
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
    // $ANTLR end "ruleFilterGroupBy"


    // $ANTLR start "entryRuleFilterNotNull"
    // InternalMyDsl.g:792:1: entryRuleFilterNotNull returns [EObject current=null] : iv_ruleFilterNotNull= ruleFilterNotNull EOF ;
    public final EObject entryRuleFilterNotNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterNotNull = null;


        try {
            // InternalMyDsl.g:792:54: (iv_ruleFilterNotNull= ruleFilterNotNull EOF )
            // InternalMyDsl.g:793:2: iv_ruleFilterNotNull= ruleFilterNotNull EOF
            {
             newCompositeNode(grammarAccess.getFilterNotNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterNotNull=ruleFilterNotNull();

            state._fsp--;

             current =iv_ruleFilterNotNull; 
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
    // $ANTLR end "entryRuleFilterNotNull"


    // $ANTLR start "ruleFilterNotNull"
    // InternalMyDsl.g:799:1: ruleFilterNotNull returns [EObject current=null] : (otherlv_0= 'NotNull' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFilterNotNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:805:2: ( (otherlv_0= 'NotNull' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:806:2: (otherlv_0= 'NotNull' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:806:2: (otherlv_0= 'NotNull' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:807:3: otherlv_0= 'NotNull' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterNotNullAccess().getNotNullKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterNotNullAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:815:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:816:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:816:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:817:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterNotNullAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterNotNullRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.projet1.MyDsl.EString");
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
    // $ANTLR end "ruleFilterNotNull"


    // $ANTLR start "entryRuleFilterCompare"
    // InternalMyDsl.g:838:1: entryRuleFilterCompare returns [EObject current=null] : iv_ruleFilterCompare= ruleFilterCompare EOF ;
    public final EObject entryRuleFilterCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterCompare = null;


        try {
            // InternalMyDsl.g:838:54: (iv_ruleFilterCompare= ruleFilterCompare EOF )
            // InternalMyDsl.g:839:2: iv_ruleFilterCompare= ruleFilterCompare EOF
            {
             newCompositeNode(grammarAccess.getFilterCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterCompare=ruleFilterCompare();

            state._fsp--;

             current =iv_ruleFilterCompare; 
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
    // $ANTLR end "entryRuleFilterCompare"


    // $ANTLR start "ruleFilterCompare"
    // InternalMyDsl.g:845:1: ruleFilterCompare returns [EObject current=null] : (this_CompareQuali_0= ruleCompareQuali | this_CompareQuanti_1= ruleCompareQuanti ) ;
    public final EObject ruleFilterCompare() throws RecognitionException {
        EObject current = null;

        EObject this_CompareQuali_0 = null;

        EObject this_CompareQuanti_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:851:2: ( (this_CompareQuali_0= ruleCompareQuali | this_CompareQuanti_1= ruleCompareQuanti ) )
            // InternalMyDsl.g:852:2: (this_CompareQuali_0= ruleCompareQuali | this_CompareQuanti_1= ruleCompareQuanti )
            {
            // InternalMyDsl.g:852:2: (this_CompareQuali_0= ruleCompareQuali | this_CompareQuanti_1= ruleCompareQuanti )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:853:3: this_CompareQuali_0= ruleCompareQuali
                    {

                    			newCompositeNode(grammarAccess.getFilterCompareAccess().getCompareQualiParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompareQuali_0=ruleCompareQuali();

                    state._fsp--;


                    			current = this_CompareQuali_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:862:3: this_CompareQuanti_1= ruleCompareQuanti
                    {

                    			newCompositeNode(grammarAccess.getFilterCompareAccess().getCompareQuantiParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompareQuanti_1=ruleCompareQuanti();

                    state._fsp--;


                    			current = this_CompareQuanti_1;
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
    // $ANTLR end "ruleFilterCompare"


    // $ANTLR start "entryRuleCompareQuali"
    // InternalMyDsl.g:874:1: entryRuleCompareQuali returns [EObject current=null] : iv_ruleCompareQuali= ruleCompareQuali EOF ;
    public final EObject entryRuleCompareQuali() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareQuali = null;


        try {
            // InternalMyDsl.g:874:53: (iv_ruleCompareQuali= ruleCompareQuali EOF )
            // InternalMyDsl.g:875:2: iv_ruleCompareQuali= ruleCompareQuali EOF
            {
             newCompositeNode(grammarAccess.getCompareQualiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareQuali=ruleCompareQuali();

            state._fsp--;

             current =iv_ruleCompareQuali; 
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
    // $ANTLR end "entryRuleCompareQuali"


    // $ANTLR start "ruleCompareQuali"
    // InternalMyDsl.g:881:1: ruleCompareQuali returns [EObject current=null] : (otherlv_0= 'ComparisonColumnsWithString' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuali ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) ) ;
    public final EObject ruleCompareQuali() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_comparaison_2_0 = null;

        AntlrDatatypeRuleToken lv_somethingtocompare_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:887:2: ( (otherlv_0= 'ComparisonColumnsWithString' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuali ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) ) )
            // InternalMyDsl.g:888:2: (otherlv_0= 'ComparisonColumnsWithString' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuali ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:888:2: (otherlv_0= 'ComparisonColumnsWithString' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuali ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) )
            // InternalMyDsl.g:889:3: otherlv_0= 'ComparisonColumnsWithString' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuali ) ) ( (lv_somethingtocompare_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompareQualiAccess().getComparisonColumnsWithStringKeyword_0());
            		
            // InternalMyDsl.g:893:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:894:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:894:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:895:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompareQualiAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareQualiRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:912:3: ( (lv_comparaison_2_0= ruleFonctionComparaisonQuali ) )
            // InternalMyDsl.g:913:4: (lv_comparaison_2_0= ruleFonctionComparaisonQuali )
            {
            // InternalMyDsl.g:913:4: (lv_comparaison_2_0= ruleFonctionComparaisonQuali )
            // InternalMyDsl.g:914:5: lv_comparaison_2_0= ruleFonctionComparaisonQuali
            {

            					newCompositeNode(grammarAccess.getCompareQualiAccess().getComparaisonFonctionComparaisonQualiEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_comparaison_2_0=ruleFonctionComparaisonQuali();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareQualiRule());
            					}
            					set(
            						current,
            						"comparaison",
            						lv_comparaison_2_0,
            						"org.xtext.projet1.MyDsl.FonctionComparaisonQuali");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:931:3: ( (lv_somethingtocompare_3_0= ruleEString ) )
            // InternalMyDsl.g:932:4: (lv_somethingtocompare_3_0= ruleEString )
            {
            // InternalMyDsl.g:932:4: (lv_somethingtocompare_3_0= ruleEString )
            // InternalMyDsl.g:933:5: lv_somethingtocompare_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompareQualiAccess().getSomethingtocompareEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_somethingtocompare_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareQualiRule());
            					}
            					set(
            						current,
            						"somethingtocompare",
            						lv_somethingtocompare_3_0,
            						"org.xtext.projet1.MyDsl.EString");
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
    // $ANTLR end "ruleCompareQuali"


    // $ANTLR start "entryRuleCompareQuanti"
    // InternalMyDsl.g:954:1: entryRuleCompareQuanti returns [EObject current=null] : iv_ruleCompareQuanti= ruleCompareQuanti EOF ;
    public final EObject entryRuleCompareQuanti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareQuanti = null;


        try {
            // InternalMyDsl.g:954:54: (iv_ruleCompareQuanti= ruleCompareQuanti EOF )
            // InternalMyDsl.g:955:2: iv_ruleCompareQuanti= ruleCompareQuanti EOF
            {
             newCompositeNode(grammarAccess.getCompareQuantiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareQuanti=ruleCompareQuanti();

            state._fsp--;

             current =iv_ruleCompareQuanti; 
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
    // $ANTLR end "entryRuleCompareQuanti"


    // $ANTLR start "ruleCompareQuanti"
    // InternalMyDsl.g:961:1: ruleCompareQuanti returns [EObject current=null] : (otherlv_0= 'ComparisonColumnsWithNumber' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuanti ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) ) ;
    public final EObject ruleCompareQuanti() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_comparaison_2_0 = null;

        AntlrDatatypeRuleToken lv_somethingtocompare_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:967:2: ( (otherlv_0= 'ComparisonColumnsWithNumber' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuanti ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) ) )
            // InternalMyDsl.g:968:2: (otherlv_0= 'ComparisonColumnsWithNumber' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuanti ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:968:2: (otherlv_0= 'ComparisonColumnsWithNumber' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuanti ) ) ( (lv_somethingtocompare_3_0= ruleEString ) ) )
            // InternalMyDsl.g:969:3: otherlv_0= 'ComparisonColumnsWithNumber' ( (lv_name_1_0= ruleEString ) ) ( (lv_comparaison_2_0= ruleFonctionComparaisonQuanti ) ) ( (lv_somethingtocompare_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompareQuantiAccess().getComparisonColumnsWithNumberKeyword_0());
            		
            // InternalMyDsl.g:973:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:974:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:974:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:975:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompareQuantiAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareQuantiRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.projet1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:992:3: ( (lv_comparaison_2_0= ruleFonctionComparaisonQuanti ) )
            // InternalMyDsl.g:993:4: (lv_comparaison_2_0= ruleFonctionComparaisonQuanti )
            {
            // InternalMyDsl.g:993:4: (lv_comparaison_2_0= ruleFonctionComparaisonQuanti )
            // InternalMyDsl.g:994:5: lv_comparaison_2_0= ruleFonctionComparaisonQuanti
            {

            					newCompositeNode(grammarAccess.getCompareQuantiAccess().getComparaisonFonctionComparaisonQuantiEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_comparaison_2_0=ruleFonctionComparaisonQuanti();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareQuantiRule());
            					}
            					set(
            						current,
            						"comparaison",
            						lv_comparaison_2_0,
            						"org.xtext.projet1.MyDsl.FonctionComparaisonQuanti");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1011:3: ( (lv_somethingtocompare_3_0= ruleEString ) )
            // InternalMyDsl.g:1012:4: (lv_somethingtocompare_3_0= ruleEString )
            {
            // InternalMyDsl.g:1012:4: (lv_somethingtocompare_3_0= ruleEString )
            // InternalMyDsl.g:1013:5: lv_somethingtocompare_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompareQuantiAccess().getSomethingtocompareEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_somethingtocompare_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareQuantiRule());
            					}
            					set(
            						current,
            						"somethingtocompare",
            						lv_somethingtocompare_3_0,
            						"org.xtext.projet1.MyDsl.EString");
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
    // $ANTLR end "ruleCompareQuanti"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1034:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1034:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1035:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:1041:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1047:2: (this_STRING_0= RULE_STRING )
            // InternalMyDsl.g:1048:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleTypeGraph"
    // InternalMyDsl.g:1058:1: ruleTypeGraph returns [Enumerator current=null] : ( (enumLiteral_0= 'Bar' ) | (enumLiteral_1= 'Line' ) | (enumLiteral_2= 'Nuage de point' ) ) ;
    public final Enumerator ruleTypeGraph() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1064:2: ( ( (enumLiteral_0= 'Bar' ) | (enumLiteral_1= 'Line' ) | (enumLiteral_2= 'Nuage de point' ) ) )
            // InternalMyDsl.g:1065:2: ( (enumLiteral_0= 'Bar' ) | (enumLiteral_1= 'Line' ) | (enumLiteral_2= 'Nuage de point' ) )
            {
            // InternalMyDsl.g:1065:2: ( (enumLiteral_0= 'Bar' ) | (enumLiteral_1= 'Line' ) | (enumLiteral_2= 'Nuage de point' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1066:3: (enumLiteral_0= 'Bar' )
                    {
                    // InternalMyDsl.g:1066:3: (enumLiteral_0= 'Bar' )
                    // InternalMyDsl.g:1067:4: enumLiteral_0= 'Bar'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getBarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeGraphAccess().getBarEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1074:3: (enumLiteral_1= 'Line' )
                    {
                    // InternalMyDsl.g:1074:3: (enumLiteral_1= 'Line' )
                    // InternalMyDsl.g:1075:4: enumLiteral_1= 'Line'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getScatterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeGraphAccess().getScatterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1082:3: (enumLiteral_2= 'Nuage de point' )
                    {
                    // InternalMyDsl.g:1082:3: (enumLiteral_2= 'Nuage de point' )
                    // InternalMyDsl.g:1083:4: enumLiteral_2= 'Nuage de point'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getBoxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeGraphAccess().getBoxEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleTypeGraph"


    // $ANTLR start "ruleFonctionAgregation"
    // InternalMyDsl.g:1093:1: ruleFonctionAgregation returns [Enumerator current=null] : ( (enumLiteral_0= 'median' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'mean' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'count' ) | (enumLiteral_6= 'std' ) | (enumLiteral_7= 'var' ) ) ;
    public final Enumerator ruleFonctionAgregation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1099:2: ( ( (enumLiteral_0= 'median' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'mean' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'count' ) | (enumLiteral_6= 'std' ) | (enumLiteral_7= 'var' ) ) )
            // InternalMyDsl.g:1100:2: ( (enumLiteral_0= 'median' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'mean' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'count' ) | (enumLiteral_6= 'std' ) | (enumLiteral_7= 'var' ) )
            {
            // InternalMyDsl.g:1100:2: ( (enumLiteral_0= 'median' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'mean' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'count' ) | (enumLiteral_6= 'std' ) | (enumLiteral_7= 'var' ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 35:
                {
                alt10=4;
                }
                break;
            case 36:
                {
                alt10=5;
                }
                break;
            case 37:
                {
                alt10=6;
                }
                break;
            case 38:
                {
                alt10=7;
                }
                break;
            case 39:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1101:3: (enumLiteral_0= 'median' )
                    {
                    // InternalMyDsl.g:1101:3: (enumLiteral_0= 'median' )
                    // InternalMyDsl.g:1102:4: enumLiteral_0= 'median'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getMedianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFonctionAgregationAccess().getMedianEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1109:3: (enumLiteral_1= 'sum' )
                    {
                    // InternalMyDsl.g:1109:3: (enumLiteral_1= 'sum' )
                    // InternalMyDsl.g:1110:4: enumLiteral_1= 'sum'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getSumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFonctionAgregationAccess().getSumEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1117:3: (enumLiteral_2= 'mean' )
                    {
                    // InternalMyDsl.g:1117:3: (enumLiteral_2= 'mean' )
                    // InternalMyDsl.g:1118:4: enumLiteral_2= 'mean'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getMeanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFonctionAgregationAccess().getMeanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1125:3: (enumLiteral_3= 'min' )
                    {
                    // InternalMyDsl.g:1125:3: (enumLiteral_3= 'min' )
                    // InternalMyDsl.g:1126:4: enumLiteral_3= 'min'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFonctionAgregationAccess().getMinEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1133:3: (enumLiteral_4= 'max' )
                    {
                    // InternalMyDsl.g:1133:3: (enumLiteral_4= 'max' )
                    // InternalMyDsl.g:1134:4: enumLiteral_4= 'max'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getMaxEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFonctionAgregationAccess().getMaxEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1141:3: (enumLiteral_5= 'count' )
                    {
                    // InternalMyDsl.g:1141:3: (enumLiteral_5= 'count' )
                    // InternalMyDsl.g:1142:4: enumLiteral_5= 'count'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getCountEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFonctionAgregationAccess().getCountEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1149:3: (enumLiteral_6= 'std' )
                    {
                    // InternalMyDsl.g:1149:3: (enumLiteral_6= 'std' )
                    // InternalMyDsl.g:1150:4: enumLiteral_6= 'std'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getStdEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFonctionAgregationAccess().getStdEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1157:3: (enumLiteral_7= 'var' )
                    {
                    // InternalMyDsl.g:1157:3: (enumLiteral_7= 'var' )
                    // InternalMyDsl.g:1158:4: enumLiteral_7= 'var'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFonctionAgregationAccess().getVarEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFonctionAgregationAccess().getVarEnumLiteralDeclaration_7());
                    			

                    }


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
    // $ANTLR end "ruleFonctionAgregation"


    // $ANTLR start "ruleFonctionComparaisonQuanti"
    // InternalMyDsl.g:1168:1: ruleFonctionComparaisonQuanti returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleFonctionComparaisonQuanti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1174:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // InternalMyDsl.g:1175:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // InternalMyDsl.g:1175:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '!=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 45:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1176:3: (enumLiteral_0= '<' )
                    {
                    // InternalMyDsl.g:1176:3: (enumLiteral_0= '<' )
                    // InternalMyDsl.g:1177:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQuantiAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFonctionComparaisonQuantiAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1184:3: (enumLiteral_1= '>' )
                    {
                    // InternalMyDsl.g:1184:3: (enumLiteral_1= '>' )
                    // InternalMyDsl.g:1185:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQuantiAccess().getSupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFonctionComparaisonQuantiAccess().getSupEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1192:3: (enumLiteral_2= '==' )
                    {
                    // InternalMyDsl.g:1192:3: (enumLiteral_2= '==' )
                    // InternalMyDsl.g:1193:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQuantiAccess().getEgalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFonctionComparaisonQuantiAccess().getEgalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1200:3: (enumLiteral_3= '!=' )
                    {
                    // InternalMyDsl.g:1200:3: (enumLiteral_3= '!=' )
                    // InternalMyDsl.g:1201:4: enumLiteral_3= '!='
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQuantiAccess().getDifferentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFonctionComparaisonQuantiAccess().getDifferentEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1208:3: (enumLiteral_4= '>=' )
                    {
                    // InternalMyDsl.g:1208:3: (enumLiteral_4= '>=' )
                    // InternalMyDsl.g:1209:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQuantiAccess().getSupegalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFonctionComparaisonQuantiAccess().getSupegalEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1216:3: (enumLiteral_5= '<=' )
                    {
                    // InternalMyDsl.g:1216:3: (enumLiteral_5= '<=' )
                    // InternalMyDsl.g:1217:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQuantiAccess().getInfegalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFonctionComparaisonQuantiAccess().getInfegalEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleFonctionComparaisonQuanti"


    // $ANTLR start "ruleFonctionComparaisonQuali"
    // InternalMyDsl.g:1227:1: ruleFonctionComparaisonQuali returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleFonctionComparaisonQuali() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1233:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalMyDsl.g:1234:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalMyDsl.g:1234:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==42) ) {
                alt12=1;
            }
            else if ( (LA12_0==43) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1235:3: (enumLiteral_0= '==' )
                    {
                    // InternalMyDsl.g:1235:3: (enumLiteral_0= '==' )
                    // InternalMyDsl.g:1236:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQualiAccess().getEgalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFonctionComparaisonQualiAccess().getEgalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1243:3: (enumLiteral_1= '!=' )
                    {
                    // InternalMyDsl.g:1243:3: (enumLiteral_1= '!=' )
                    // InternalMyDsl.g:1244:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFonctionComparaisonQualiAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFonctionComparaisonQualiAccess().getDifferentEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleFonctionComparaisonQuali"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001DD40002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000D40002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00003F0000000000L});

}