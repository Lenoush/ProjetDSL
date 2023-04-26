/*
 * generated by Xtext 2.25.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.projet1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDashboard
entryRuleDashboard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDashboardRule()); }
	iv_ruleDashboard=ruleDashboard
	{ $current=$iv_ruleDashboard.current; }
	EOF;

// Rule Dashboard
ruleDashboard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NameDashboard'
		{
			newLeafNode(otherlv_0, grammarAccess.getDashboardAccess().getNameDashboardKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getDashboardAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDashboardRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDashboardAccess().getOwnedGraphRealisationGraphRealisationParserRuleCall_3_0());
				}
				lv_ownedGraphRealisation_3_0=ruleGraphRealisation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDashboardRule());
					}
					add(
						$current,
						"ownedGraphRealisation",
						lv_ownedGraphRealisation_3_0,
						"org.xtext.projet1.MyDsl.GraphRealisation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleGraphRealisation
entryRuleGraphRealisation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphRealisationRule()); }
	iv_ruleGraphRealisation=ruleGraphRealisation
	{ $current=$iv_ruleGraphRealisation.current; }
	EOF;

// Rule GraphRealisation
ruleGraphRealisation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedImportImportFileParserRuleCall_0_0());
				}
				lv_ownedImport_0_0=ruleImportFile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
					}
					set(
						$current,
						"ownedImport",
						lv_ownedImport_0_0,
						"org.xtext.projet1.MyDsl.ImportFile");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedGraphMakerGraphMakerParserRuleCall_1_0());
				}
				lv_ownedGraphMaker_1_0=ruleGraphMaker
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
					}
					set(
						$current,
						"ownedGraphMaker",
						lv_ownedGraphMaker_1_0,
						"org.xtext.projet1.MyDsl.GraphMaker");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedFilterFilterDataParserRuleCall_2_0());
				}
				lv_ownedFilter_2_0=ruleFilterData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
					}
					add(
						$current,
						"ownedFilter",
						lv_ownedFilter_2_0,
						"org.xtext.projet1.MyDsl.FilterData");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphRealisationAccess().getOwnedGraphUpdateGraphUpdateParserRuleCall_3_0());
				}
				lv_ownedGraphUpdate_3_0=ruleGraphUpdate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphRealisationRule());
					}
					add(
						$current,
						"ownedGraphUpdate",
						lv_ownedGraphUpdate_3_0,
						"org.xtext.projet1.MyDsl.GraphUpdate");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleImportFile
entryRuleImportFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportFileRule()); }
	iv_ruleImportFile=ruleImportFile
	{ $current=$iv_ruleImportFile.current; }
	EOF;

// Rule ImportFile
ruleImportFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CSV'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportFileAccess().getCSVKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getImportFileAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportFileAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportFileRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='Delimiter'
		{
			newLeafNode(otherlv_3, grammarAccess.getImportFileAccess().getDelimiterKeyword_3());
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getImportFileAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportFileAccess().getDelimeterEStringParserRuleCall_5_0());
				}
				lv_delimeter_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportFileRule());
					}
					set(
						$current,
						"delimeter",
						lv_delimeter_5_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleGraphMaker
entryRuleGraphMaker returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphMakerRule()); }
	iv_ruleGraphMaker=ruleGraphMaker
	{ $current=$iv_ruleGraphMaker.current; }
	EOF;

// Rule GraphMaker
ruleGraphMaker returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TypeOfGraph'
		{
			newLeafNode(otherlv_0, grammarAccess.getGraphMakerAccess().getTypeOfGraphKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getGraphMakerAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphMakerAccess().getTypeTypeGraphEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleTypeGraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphMakerRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.xtext.projet1.MyDsl.TypeGraph");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='Abscissa'
		{
			newLeafNode(otherlv_3, grammarAccess.getGraphMakerAccess().getAbscissaKeyword_3());
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getGraphMakerAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphMakerAccess().getNameAbscisseEStringParserRuleCall_5_0());
				}
				lv_nameAbscisse_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphMakerRule());
					}
					set(
						$current,
						"nameAbscisse",
						lv_nameAbscisse_5_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='Ordinate(s)'
		{
			newLeafNode(otherlv_6, grammarAccess.getGraphMakerAccess().getOrdinateSKeyword_6());
		}
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getGraphMakerAccess().getColonKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGraphMakerAccess().getNameOrdonneesEStringParserRuleCall_8_0());
				}
				lv_nameOrdonnees_8_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGraphMakerRule());
					}
					add(
						$current,
						"nameOrdonnees",
						lv_nameOrdonnees_8_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleGraphUpdate
entryRuleGraphUpdate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphUpdateRule()); }
	iv_ruleGraphUpdate=ruleGraphUpdate
	{ $current=$iv_ruleGraphUpdate.current; }
	EOF;

// Rule GraphUpdate
ruleGraphUpdate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeXParserRuleCall_0());
		}
		this_UpdateNameAxeX_0=ruleUpdateNameAxeX
		{
			$current = $this_UpdateNameAxeX_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateNameAxeYParserRuleCall_1());
		}
		this_UpdateNameAxeY_1=ruleUpdateNameAxeY
		{
			$current = $this_UpdateNameAxeY_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateNameLegendParserRuleCall_2());
		}
		this_UpdateNameLegend_2=ruleUpdateNameLegend
		{
			$current = $this_UpdateNameLegend_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getGraphUpdateAccess().getUpdateCouleurGraphParserRuleCall_3());
		}
		this_UpdateCouleurGraph_3=ruleUpdateCouleurGraph
		{
			$current = $this_UpdateCouleurGraph_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleUpdateCouleurGraph
entryRuleUpdateCouleurGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdateCouleurGraphRule()); }
	iv_ruleUpdateCouleurGraph=ruleUpdateCouleurGraph
	{ $current=$iv_ruleUpdateCouleurGraph.current; }
	EOF;

// Rule UpdateCouleurGraph
ruleUpdateCouleurGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Color(s)'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpdateCouleurGraphAccess().getColorSKeyword_0());
		}
		otherlv_1='graph'
		{
			newLeafNode(otherlv_1, grammarAccess.getUpdateCouleurGraphAccess().getGraphKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getUpdateCouleurGraphAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateCouleurGraphAccess().getCouleurEStringParserRuleCall_3_0());
				}
				lv_couleur_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateCouleurGraphRule());
					}
					add(
						$current,
						"couleur",
						lv_couleur_3_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleUpdateNameLegend
entryRuleUpdateNameLegend returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdateNameLegendRule()); }
	iv_ruleUpdateNameLegend=ruleUpdateNameLegend
	{ $current=$iv_ruleUpdateNameLegend.current; }
	EOF;

// Rule UpdateNameLegend
ruleUpdateNameLegend returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Transformation'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpdateNameLegendAccess().getTransformationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateNameLegendAccess().getOldnameEStringParserRuleCall_1_0());
				}
				lv_oldname_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateNameLegendRule());
					}
					set(
						$current,
						"oldname",
						lv_oldname_1_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getUpdateNameLegendAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateNameLegendAccess().getNewnameEStringParserRuleCall_3_0());
				}
				lv_newname_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateNameLegendRule());
					}
					set(
						$current,
						"newname",
						lv_newname_3_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUpdateNameAxeX
entryRuleUpdateNameAxeX returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdateNameAxeXRule()); }
	iv_ruleUpdateNameAxeX=ruleUpdateNameAxeX
	{ $current=$iv_ruleUpdateNameAxeX.current; }
	EOF;

// Rule UpdateNameAxeX
ruleUpdateNameAxeX returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TitleAxeX'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpdateNameAxeXAccess().getTitleAxeXKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getUpdateNameAxeXAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateNameAxeXAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateNameAxeXRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUpdateNameAxeY
entryRuleUpdateNameAxeY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdateNameAxeYRule()); }
	iv_ruleUpdateNameAxeY=ruleUpdateNameAxeY
	{ $current=$iv_ruleUpdateNameAxeY.current; }
	EOF;

// Rule UpdateNameAxeY
ruleUpdateNameAxeY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TitleAxeY'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpdateNameAxeYAccess().getTitleAxeYKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getUpdateNameAxeYAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateNameAxeYAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateNameAxeYRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFilterData
entryRuleFilterData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterDataRule()); }
	iv_ruleFilterData=ruleFilterData
	{ $current=$iv_ruleFilterData.current; }
	EOF;

// Rule FilterData
ruleFilterData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFilterDataAccess().getFilterNotNullParserRuleCall_0());
		}
		this_FilterNotNull_0=ruleFilterNotNull
		{
			$current = $this_FilterNotNull_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFilterDataAccess().getFilterCompareParserRuleCall_1());
		}
		this_FilterCompare_1=ruleFilterCompare
		{
			$current = $this_FilterCompare_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFilterDataAccess().getFilterGroupByParserRuleCall_2());
		}
		this_FilterGroupBy_2=ruleFilterGroupBy
		{
			$current = $this_FilterGroupBy_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFilterGroupBy
entryRuleFilterGroupBy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterGroupByRule()); }
	iv_ruleFilterGroupBy=ruleFilterGroupBy
	{ $current=$iv_ruleFilterGroupBy.current; }
	EOF;

// Rule FilterGroupBy
ruleFilterGroupBy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Group'
		{
			newLeafNode(otherlv_0, grammarAccess.getFilterGroupByAccess().getGroupKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterGroupByAccess().getNameColumnsYEStringParserRuleCall_1_0());
				}
				lv_nameColumnsY_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterGroupByRule());
					}
					set(
						$current,
						"nameColumnsY",
						lv_nameColumnsY_1_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='by'
		{
			newLeafNode(otherlv_2, grammarAccess.getFilterGroupByAccess().getByKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterGroupByAccess().getNameColumnsXEStringParserRuleCall_3_0());
				}
				lv_nameColumnsX_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterGroupByRule());
					}
					set(
						$current,
						"nameColumnsX",
						lv_nameColumnsX_3_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getFilterGroupByAccess().getInKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterGroupByAccess().getFonctionAgregationFonctionAgregationEnumRuleCall_5_0());
				}
				lv_fonctionAgregation_5_0=ruleFonctionAgregation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterGroupByRule());
					}
					set(
						$current,
						"fonctionAgregation",
						lv_fonctionAgregation_5_0,
						"org.xtext.projet1.MyDsl.FonctionAgregation");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFilterNotNull
entryRuleFilterNotNull returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterNotNullRule()); }
	iv_ruleFilterNotNull=ruleFilterNotNull
	{ $current=$iv_ruleFilterNotNull.current; }
	EOF;

// Rule FilterNotNull
ruleFilterNotNull returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NotNull'
		{
			newLeafNode(otherlv_0, grammarAccess.getFilterNotNullAccess().getNotNullKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFilterNotNullAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFilterNotNullAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFilterNotNullRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFilterCompare
entryRuleFilterCompare returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterCompareRule()); }
	iv_ruleFilterCompare=ruleFilterCompare
	{ $current=$iv_ruleFilterCompare.current; }
	EOF;

// Rule FilterCompare
ruleFilterCompare returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFilterCompareAccess().getCompareQualiParserRuleCall_0());
		}
		this_CompareQuali_0=ruleCompareQuali
		{
			$current = $this_CompareQuali_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFilterCompareAccess().getCompareQuantiParserRuleCall_1());
		}
		this_CompareQuanti_1=ruleCompareQuanti
		{
			$current = $this_CompareQuanti_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCompareQuali
entryRuleCompareQuali returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompareQualiRule()); }
	iv_ruleCompareQuali=ruleCompareQuali
	{ $current=$iv_ruleCompareQuali.current; }
	EOF;

// Rule CompareQuali
ruleCompareQuali returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComparisonColumnsWithString'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompareQualiAccess().getComparisonColumnsWithStringKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompareQualiAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompareQualiRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompareQualiAccess().getComparaisonFonctionComparaisonQualiEnumRuleCall_2_0());
				}
				lv_comparaison_2_0=ruleFonctionComparaisonQuali
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompareQualiRule());
					}
					set(
						$current,
						"comparaison",
						lv_comparaison_2_0,
						"org.xtext.projet1.MyDsl.FonctionComparaisonQuali");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompareQualiAccess().getSomethingtocompareEStringParserRuleCall_3_0());
				}
				lv_somethingtocompare_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompareQualiRule());
					}
					set(
						$current,
						"somethingtocompare",
						lv_somethingtocompare_3_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCompareQuanti
entryRuleCompareQuanti returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompareQuantiRule()); }
	iv_ruleCompareQuanti=ruleCompareQuanti
	{ $current=$iv_ruleCompareQuanti.current; }
	EOF;

// Rule CompareQuanti
ruleCompareQuanti returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ComparisonColumnsWithNumber'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompareQuantiAccess().getComparisonColumnsWithNumberKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompareQuantiAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompareQuantiRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompareQuantiAccess().getComparaisonFonctionComparaisonQuantiEnumRuleCall_2_0());
				}
				lv_comparaison_2_0=ruleFonctionComparaisonQuanti
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompareQuantiRule());
					}
					set(
						$current,
						"comparaison",
						lv_comparaison_2_0,
						"org.xtext.projet1.MyDsl.FonctionComparaisonQuanti");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompareQuantiAccess().getSomethingtocompareEStringParserRuleCall_3_0());
				}
				lv_somethingtocompare_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompareQuantiRule());
					}
					set(
						$current,
						"somethingtocompare",
						lv_somethingtocompare_3_0,
						"org.xtext.projet1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
	}
;

// Rule TypeGraph
ruleTypeGraph returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Bar'
			{
				$current = grammarAccess.getTypeGraphAccess().getBarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeGraphAccess().getBarEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Line'
			{
				$current = grammarAccess.getTypeGraphAccess().getScatterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeGraphAccess().getScatterEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Nuage de point'
			{
				$current = grammarAccess.getTypeGraphAccess().getBoxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeGraphAccess().getBoxEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule FonctionAgregation
ruleFonctionAgregation returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='median'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getMedianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFonctionAgregationAccess().getMedianEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sum'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getSumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFonctionAgregationAccess().getSumEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='mean'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getMeanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getFonctionAgregationAccess().getMeanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='min'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getFonctionAgregationAccess().getMinEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='max'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getMaxEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getFonctionAgregationAccess().getMaxEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='count'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getCountEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getFonctionAgregationAccess().getCountEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='std'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getStdEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getFonctionAgregationAccess().getStdEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='var'
			{
				$current = grammarAccess.getFonctionAgregationAccess().getVarEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getFonctionAgregationAccess().getVarEnumLiteralDeclaration_7());
			}
		)
	)
;

// Rule FonctionComparaisonQuanti
ruleFonctionComparaisonQuanti returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='<'
			{
				$current = grammarAccess.getFonctionComparaisonQuantiAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFonctionComparaisonQuantiAccess().getInfEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='>'
			{
				$current = grammarAccess.getFonctionComparaisonQuantiAccess().getSupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFonctionComparaisonQuantiAccess().getSupEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='=='
			{
				$current = grammarAccess.getFonctionComparaisonQuantiAccess().getEgalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getFonctionComparaisonQuantiAccess().getEgalEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='!='
			{
				$current = grammarAccess.getFonctionComparaisonQuantiAccess().getDifferentEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getFonctionComparaisonQuantiAccess().getDifferentEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='>='
			{
				$current = grammarAccess.getFonctionComparaisonQuantiAccess().getSupegalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getFonctionComparaisonQuantiAccess().getSupegalEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='<='
			{
				$current = grammarAccess.getFonctionComparaisonQuantiAccess().getInfegalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getFonctionComparaisonQuantiAccess().getInfegalEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule FonctionComparaisonQuali
ruleFonctionComparaisonQuali returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='=='
			{
				$current = grammarAccess.getFonctionComparaisonQualiAccess().getEgalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getFonctionComparaisonQualiAccess().getEgalEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getFonctionComparaisonQualiAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getFonctionComparaisonQualiAccess().getDifferentEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;