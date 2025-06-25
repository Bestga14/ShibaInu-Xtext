package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.ShibainuGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShibainuParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'henka'", "'='", "'insatsu'", "'moshi'", "':'", "'=='", "'!='", "'<'", "'>'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalShibainuParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShibainuParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShibainuParser.tokenNames; }
    public String getGrammarFileName() { return "InternalShibainu.g"; }



     	private ShibainuGrammarAccess grammarAccess;

        public InternalShibainuParser(TokenStream input, ShibainuGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ShibainuGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalShibainu.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalShibainu.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalShibainu.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalShibainu.g:72:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalShibainu.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalShibainu.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalShibainu.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShibainu.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalShibainu.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalShibainu.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"org.xtext.example.mydsl.Shibainu.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalShibainu.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalShibainu.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalShibainu.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalShibainu.g:108:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_Print_1= rulePrint | this_Conditional_2= ruleConditional ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_Print_1 = null;

        EObject this_Conditional_2 = null;



        	enterRule();

        try {
            // InternalShibainu.g:114:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_Print_1= rulePrint | this_Conditional_2= ruleConditional ) )
            // InternalShibainu.g:115:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Print_1= rulePrint | this_Conditional_2= ruleConditional )
            {
            // InternalShibainu.g:115:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_Print_1= rulePrint | this_Conditional_2= ruleConditional )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // InternalShibainu.g:116:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShibainu.g:125:3: this_Print_1= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_1=rulePrint();

                    state._fsp--;


                    			current = this_Print_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShibainu.g:134:3: this_Conditional_2= ruleConditional
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConditionalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_2=ruleConditional();

                    state._fsp--;


                    			current = this_Conditional_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalShibainu.g:146:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalShibainu.g:146:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalShibainu.g:147:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalShibainu.g:153:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'henka' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalShibainu.g:159:2: ( (otherlv_0= 'henka' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalShibainu.g:160:2: (otherlv_0= 'henka' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalShibainu.g:160:2: (otherlv_0= 'henka' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalShibainu.g:161:3: otherlv_0= 'henka' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getHenkaKeyword_0());
            		
            // InternalShibainu.g:165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalShibainu.g:166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalShibainu.g:166:4: (lv_name_1_0= RULE_ID )
            // InternalShibainu.g:167:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalShibainu.g:187:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalShibainu.g:188:4: (lv_value_3_0= RULE_INT )
            {
            // InternalShibainu.g:188:4: (lv_value_3_0= RULE_INT )
            // InternalShibainu.g:189:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRulePrint"
    // InternalShibainu.g:209:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalShibainu.g:209:46: (iv_rulePrint= rulePrint EOF )
            // InternalShibainu.g:210:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalShibainu.g:216:1: rulePrint returns [EObject current=null] : (otherlv_0= 'insatsu' ( (lv_message_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_message_1_0=null;


        	enterRule();

        try {
            // InternalShibainu.g:222:2: ( (otherlv_0= 'insatsu' ( (lv_message_1_0= RULE_STRING ) ) ) )
            // InternalShibainu.g:223:2: (otherlv_0= 'insatsu' ( (lv_message_1_0= RULE_STRING ) ) )
            {
            // InternalShibainu.g:223:2: (otherlv_0= 'insatsu' ( (lv_message_1_0= RULE_STRING ) ) )
            // InternalShibainu.g:224:3: otherlv_0= 'insatsu' ( (lv_message_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getInsatsuKeyword_0());
            		
            // InternalShibainu.g:228:3: ( (lv_message_1_0= RULE_STRING ) )
            // InternalShibainu.g:229:4: (lv_message_1_0= RULE_STRING )
            {
            // InternalShibainu.g:229:4: (lv_message_1_0= RULE_STRING )
            // InternalShibainu.g:230:5: lv_message_1_0= RULE_STRING
            {
            lv_message_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_1_0, grammarAccess.getPrintAccess().getMessageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleConditional"
    // InternalShibainu.g:250:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalShibainu.g:250:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalShibainu.g:251:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalShibainu.g:257:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'moshi' ( (lv_comparison_1_0= ruleComparison ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_comparison_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalShibainu.g:263:2: ( (otherlv_0= 'moshi' ( (lv_comparison_1_0= ruleComparison ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) ) )
            // InternalShibainu.g:264:2: (otherlv_0= 'moshi' ( (lv_comparison_1_0= ruleComparison ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) )
            {
            // InternalShibainu.g:264:2: (otherlv_0= 'moshi' ( (lv_comparison_1_0= ruleComparison ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) )
            // InternalShibainu.g:265:3: otherlv_0= 'moshi' ( (lv_comparison_1_0= ruleComparison ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getMoshiKeyword_0());
            		
            // InternalShibainu.g:269:3: ( (lv_comparison_1_0= ruleComparison ) )
            // InternalShibainu.g:270:4: (lv_comparison_1_0= ruleComparison )
            {
            // InternalShibainu.g:270:4: (lv_comparison_1_0= ruleComparison )
            // InternalShibainu.g:271:5: lv_comparison_1_0= ruleComparison
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getComparisonComparisonParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_comparison_1_0=ruleComparison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"comparison",
            						lv_comparison_1_0,
            						"org.xtext.example.mydsl.Shibainu.Comparison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getColonKeyword_2());
            		
            // InternalShibainu.g:292:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalShibainu.g:293:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalShibainu.g:293:4: (lv_statement_3_0= ruleStatement )
            // InternalShibainu.g:294:5: lv_statement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"org.xtext.example.mydsl.Shibainu.Statement");
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleComparison"
    // InternalShibainu.g:315:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalShibainu.g:315:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalShibainu.g:316:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalShibainu.g:322:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= RULE_INT ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_2_0=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalShibainu.g:328:2: ( ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= RULE_INT ) ) ) )
            // InternalShibainu.g:329:2: ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= RULE_INT ) ) )
            {
            // InternalShibainu.g:329:2: ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= RULE_INT ) ) )
            // InternalShibainu.g:330:3: ( (lv_left_0_0= RULE_ID ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= RULE_INT ) )
            {
            // InternalShibainu.g:330:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalShibainu.g:331:4: (lv_left_0_0= RULE_ID )
            {
            // InternalShibainu.g:331:4: (lv_left_0_0= RULE_ID )
            // InternalShibainu.g:332:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_left_0_0, grammarAccess.getComparisonAccess().getLeftIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalShibainu.g:348:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalShibainu.g:349:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalShibainu.g:349:4: (lv_operator_1_0= ruleOperator )
            // InternalShibainu.g:350:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.example.mydsl.Shibainu.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShibainu.g:367:3: ( (lv_right_2_0= RULE_INT ) )
            // InternalShibainu.g:368:4: (lv_right_2_0= RULE_INT )
            {
            // InternalShibainu.g:368:4: (lv_right_2_0= RULE_INT )
            // InternalShibainu.g:369:5: lv_right_2_0= RULE_INT
            {
            lv_right_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_right_2_0, grammarAccess.getComparisonAccess().getRightINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "ruleOperator"
    // InternalShibainu.g:389:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalShibainu.g:395:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) ) )
            // InternalShibainu.g:396:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) )
            {
            // InternalShibainu.g:396:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalShibainu.g:397:3: (enumLiteral_0= '==' )
                    {
                    // InternalShibainu.g:397:3: (enumLiteral_0= '==' )
                    // InternalShibainu.g:398:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShibainu.g:405:3: (enumLiteral_1= '!=' )
                    {
                    // InternalShibainu.g:405:3: (enumLiteral_1= '!=' )
                    // InternalShibainu.g:406:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShibainu.g:413:3: (enumLiteral_2= '<' )
                    {
                    // InternalShibainu.g:413:3: (enumLiteral_2= '<' )
                    // InternalShibainu.g:414:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalShibainu.g:421:3: (enumLiteral_3= '>' )
                    {
                    // InternalShibainu.g:421:3: (enumLiteral_3= '>' )
                    // InternalShibainu.g:422:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0000L});

}