package org.xtext.shibainu.ide.contentassist.antlr.internal;

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
import org.xtext.shibainu.services.ShibainuGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShibainuParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'>'", "'henka'", "'='", "'insatsu'", "'moshi'", "':'"
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

    	public void setGrammarAccess(ShibainuGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalShibainu.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalShibainu.g:54:1: ( ruleModel EOF )
            // InternalShibainu.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalShibainu.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalShibainu.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalShibainu.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalShibainu.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalShibainu.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShibainu.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalShibainu.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalShibainu.g:79:1: ( ruleStatement EOF )
            // InternalShibainu.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalShibainu.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalShibainu.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalShibainu.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalShibainu.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalShibainu.g:94:3: ( rule__Statement__Alternatives )
            // InternalShibainu.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalShibainu.g:103:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalShibainu.g:104:1: ( ruleVariableDeclaration EOF )
            // InternalShibainu.g:105:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalShibainu.g:112:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:116:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalShibainu.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalShibainu.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalShibainu.g:118:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalShibainu.g:119:3: ( rule__VariableDeclaration__Group__0 )
            // InternalShibainu.g:119:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRulePrint"
    // InternalShibainu.g:128:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalShibainu.g:129:1: ( rulePrint EOF )
            // InternalShibainu.g:130:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalShibainu.g:137:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:141:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalShibainu.g:142:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalShibainu.g:142:2: ( ( rule__Print__Group__0 ) )
            // InternalShibainu.g:143:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalShibainu.g:144:3: ( rule__Print__Group__0 )
            // InternalShibainu.g:144:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleConditional"
    // InternalShibainu.g:153:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalShibainu.g:154:1: ( ruleConditional EOF )
            // InternalShibainu.g:155:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalShibainu.g:162:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:166:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalShibainu.g:167:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalShibainu.g:167:2: ( ( rule__Conditional__Group__0 ) )
            // InternalShibainu.g:168:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalShibainu.g:169:3: ( rule__Conditional__Group__0 )
            // InternalShibainu.g:169:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleComparison"
    // InternalShibainu.g:178:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalShibainu.g:179:1: ( ruleComparison EOF )
            // InternalShibainu.g:180:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalShibainu.g:187:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:191:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalShibainu.g:192:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalShibainu.g:192:2: ( ( rule__Comparison__Group__0 ) )
            // InternalShibainu.g:193:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalShibainu.g:194:3: ( rule__Comparison__Group__0 )
            // InternalShibainu.g:194:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "ruleOperator"
    // InternalShibainu.g:203:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:207:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalShibainu.g:208:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalShibainu.g:208:2: ( ( rule__Operator__Alternatives ) )
            // InternalShibainu.g:209:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalShibainu.g:210:3: ( rule__Operator__Alternatives )
            // InternalShibainu.g:210:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalShibainu.g:218:1: rule__Statement__Alternatives : ( ( ruleVariableDeclaration ) | ( rulePrint ) | ( ruleConditional ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:222:1: ( ( ruleVariableDeclaration ) | ( rulePrint ) | ( ruleConditional ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
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
                    // InternalShibainu.g:223:2: ( ruleVariableDeclaration )
                    {
                    // InternalShibainu.g:223:2: ( ruleVariableDeclaration )
                    // InternalShibainu.g:224:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShibainu.g:229:2: ( rulePrint )
                    {
                    // InternalShibainu.g:229:2: ( rulePrint )
                    // InternalShibainu.g:230:3: rulePrint
                    {
                     before(grammarAccess.getStatementAccess().getPrintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShibainu.g:235:2: ( ruleConditional )
                    {
                    // InternalShibainu.g:235:2: ( ruleConditional )
                    // InternalShibainu.g:236:3: ruleConditional
                    {
                     before(grammarAccess.getStatementAccess().getConditionalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConditional();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConditionalParserRuleCall_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalShibainu.g:245:1: rule__Operator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:249:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
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
                    // InternalShibainu.g:250:2: ( ( '==' ) )
                    {
                    // InternalShibainu.g:250:2: ( ( '==' ) )
                    // InternalShibainu.g:251:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalShibainu.g:252:3: ( '==' )
                    // InternalShibainu.g:252:4: '=='
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShibainu.g:256:2: ( ( '!=' ) )
                    {
                    // InternalShibainu.g:256:2: ( ( '!=' ) )
                    // InternalShibainu.g:257:3: ( '!=' )
                    {
                     before(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_1()); 
                    // InternalShibainu.g:258:3: ( '!=' )
                    // InternalShibainu.g:258:4: '!='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShibainu.g:262:2: ( ( '<' ) )
                    {
                    // InternalShibainu.g:262:2: ( ( '<' ) )
                    // InternalShibainu.g:263:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_2()); 
                    // InternalShibainu.g:264:3: ( '<' )
                    // InternalShibainu.g:264:4: '<'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalShibainu.g:268:2: ( ( '>' ) )
                    {
                    // InternalShibainu.g:268:2: ( ( '>' ) )
                    // InternalShibainu.g:269:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    // InternalShibainu.g:270:3: ( '>' )
                    // InternalShibainu.g:270:4: '>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalShibainu.g:278:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:282:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalShibainu.g:283:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalShibainu.g:290:1: rule__VariableDeclaration__Group__0__Impl : ( 'henka' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:294:1: ( ( 'henka' ) )
            // InternalShibainu.g:295:1: ( 'henka' )
            {
            // InternalShibainu.g:295:1: ( 'henka' )
            // InternalShibainu.g:296:2: 'henka'
            {
             before(grammarAccess.getVariableDeclarationAccess().getHenkaKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getHenkaKeyword_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalShibainu.g:305:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:309:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalShibainu.g:310:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalShibainu.g:317:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:321:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalShibainu.g:322:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalShibainu.g:322:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalShibainu.g:323:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalShibainu.g:324:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalShibainu.g:324:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalShibainu.g:332:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:336:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalShibainu.g:337:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalShibainu.g:344:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:348:1: ( ( '=' ) )
            // InternalShibainu.g:349:1: ( '=' )
            {
            // InternalShibainu.g:349:1: ( '=' )
            // InternalShibainu.g:350:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalShibainu.g:359:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:363:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalShibainu.g:364:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalShibainu.g:370:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:374:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalShibainu.g:375:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalShibainu.g:375:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalShibainu.g:376:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalShibainu.g:377:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalShibainu.g:377:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalShibainu.g:386:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:390:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalShibainu.g:391:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

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
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalShibainu.g:398:1: rule__Print__Group__0__Impl : ( 'insatsu' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:402:1: ( ( 'insatsu' ) )
            // InternalShibainu.g:403:1: ( 'insatsu' )
            {
            // InternalShibainu.g:403:1: ( 'insatsu' )
            // InternalShibainu.g:404:2: 'insatsu'
            {
             before(grammarAccess.getPrintAccess().getInsatsuKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getInsatsuKeyword_0()); 

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
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalShibainu.g:413:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:417:1: ( rule__Print__Group__1__Impl )
            // InternalShibainu.g:418:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__1__Impl();

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
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalShibainu.g:424:1: rule__Print__Group__1__Impl : ( ( rule__Print__MessageAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:428:1: ( ( ( rule__Print__MessageAssignment_1 ) ) )
            // InternalShibainu.g:429:1: ( ( rule__Print__MessageAssignment_1 ) )
            {
            // InternalShibainu.g:429:1: ( ( rule__Print__MessageAssignment_1 ) )
            // InternalShibainu.g:430:2: ( rule__Print__MessageAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getMessageAssignment_1()); 
            // InternalShibainu.g:431:2: ( rule__Print__MessageAssignment_1 )
            // InternalShibainu.g:431:3: rule__Print__MessageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__MessageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getMessageAssignment_1()); 

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
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalShibainu.g:440:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:444:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalShibainu.g:445:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

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
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalShibainu.g:452:1: rule__Conditional__Group__0__Impl : ( 'moshi' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:456:1: ( ( 'moshi' ) )
            // InternalShibainu.g:457:1: ( 'moshi' )
            {
            // InternalShibainu.g:457:1: ( 'moshi' )
            // InternalShibainu.g:458:2: 'moshi'
            {
             before(grammarAccess.getConditionalAccess().getMoshiKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getMoshiKeyword_0()); 

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
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalShibainu.g:467:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:471:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalShibainu.g:472:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

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
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalShibainu.g:479:1: rule__Conditional__Group__1__Impl : ( ( rule__Conditional__ComparisonAssignment_1 ) ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:483:1: ( ( ( rule__Conditional__ComparisonAssignment_1 ) ) )
            // InternalShibainu.g:484:1: ( ( rule__Conditional__ComparisonAssignment_1 ) )
            {
            // InternalShibainu.g:484:1: ( ( rule__Conditional__ComparisonAssignment_1 ) )
            // InternalShibainu.g:485:2: ( rule__Conditional__ComparisonAssignment_1 )
            {
             before(grammarAccess.getConditionalAccess().getComparisonAssignment_1()); 
            // InternalShibainu.g:486:2: ( rule__Conditional__ComparisonAssignment_1 )
            // InternalShibainu.g:486:3: rule__Conditional__ComparisonAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__ComparisonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getComparisonAssignment_1()); 

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
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalShibainu.g:494:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:498:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalShibainu.g:499:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3();

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
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalShibainu.g:506:1: rule__Conditional__Group__2__Impl : ( ':' ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:510:1: ( ( ':' ) )
            // InternalShibainu.g:511:1: ( ':' )
            {
            // InternalShibainu.g:511:1: ( ':' )
            // InternalShibainu.g:512:2: ':'
            {
             before(grammarAccess.getConditionalAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // InternalShibainu.g:521:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:525:1: ( rule__Conditional__Group__3__Impl )
            // InternalShibainu.g:526:2: rule__Conditional__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3__Impl();

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
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // InternalShibainu.g:532:1: rule__Conditional__Group__3__Impl : ( ( rule__Conditional__StatementAssignment_3 ) ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:536:1: ( ( ( rule__Conditional__StatementAssignment_3 ) ) )
            // InternalShibainu.g:537:1: ( ( rule__Conditional__StatementAssignment_3 ) )
            {
            // InternalShibainu.g:537:1: ( ( rule__Conditional__StatementAssignment_3 ) )
            // InternalShibainu.g:538:2: ( rule__Conditional__StatementAssignment_3 )
            {
             before(grammarAccess.getConditionalAccess().getStatementAssignment_3()); 
            // InternalShibainu.g:539:2: ( rule__Conditional__StatementAssignment_3 )
            // InternalShibainu.g:539:3: rule__Conditional__StatementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__StatementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getStatementAssignment_3()); 

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
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalShibainu.g:548:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:552:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalShibainu.g:553:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalShibainu.g:560:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__LeftAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:564:1: ( ( ( rule__Comparison__LeftAssignment_0 ) ) )
            // InternalShibainu.g:565:1: ( ( rule__Comparison__LeftAssignment_0 ) )
            {
            // InternalShibainu.g:565:1: ( ( rule__Comparison__LeftAssignment_0 ) )
            // InternalShibainu.g:566:2: ( rule__Comparison__LeftAssignment_0 )
            {
             before(grammarAccess.getComparisonAccess().getLeftAssignment_0()); 
            // InternalShibainu.g:567:2: ( rule__Comparison__LeftAssignment_0 )
            // InternalShibainu.g:567:3: rule__Comparison__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalShibainu.g:575:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:579:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalShibainu.g:580:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalShibainu.g:587:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__OperatorAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:591:1: ( ( ( rule__Comparison__OperatorAssignment_1 ) ) )
            // InternalShibainu.g:592:1: ( ( rule__Comparison__OperatorAssignment_1 ) )
            {
            // InternalShibainu.g:592:1: ( ( rule__Comparison__OperatorAssignment_1 ) )
            // InternalShibainu.g:593:2: ( rule__Comparison__OperatorAssignment_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_1()); 
            // InternalShibainu.g:594:2: ( rule__Comparison__OperatorAssignment_1 )
            // InternalShibainu.g:594:3: rule__Comparison__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalShibainu.g:602:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:606:1: ( rule__Comparison__Group__2__Impl )
            // InternalShibainu.g:607:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalShibainu.g:613:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__RightAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:617:1: ( ( ( rule__Comparison__RightAssignment_2 ) ) )
            // InternalShibainu.g:618:1: ( ( rule__Comparison__RightAssignment_2 ) )
            {
            // InternalShibainu.g:618:1: ( ( rule__Comparison__RightAssignment_2 ) )
            // InternalShibainu.g:619:2: ( rule__Comparison__RightAssignment_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_2()); 
            // InternalShibainu.g:620:2: ( rule__Comparison__RightAssignment_2 )
            // InternalShibainu.g:620:3: rule__Comparison__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalShibainu.g:629:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:633:1: ( ( ruleStatement ) )
            // InternalShibainu.g:634:2: ( ruleStatement )
            {
            // InternalShibainu.g:634:2: ( ruleStatement )
            // InternalShibainu.g:635:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalShibainu.g:644:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:648:1: ( ( RULE_ID ) )
            // InternalShibainu.g:649:2: ( RULE_ID )
            {
            // InternalShibainu.g:649:2: ( RULE_ID )
            // InternalShibainu.g:650:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalShibainu.g:659:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:663:1: ( ( RULE_INT ) )
            // InternalShibainu.g:664:2: ( RULE_INT )
            {
            // InternalShibainu.g:664:2: ( RULE_INT )
            // InternalShibainu.g:665:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__Print__MessageAssignment_1"
    // InternalShibainu.g:674:1: rule__Print__MessageAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Print__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:678:1: ( ( RULE_STRING ) )
            // InternalShibainu.g:679:2: ( RULE_STRING )
            {
            // InternalShibainu.g:679:2: ( RULE_STRING )
            // InternalShibainu.g:680:3: RULE_STRING
            {
             before(grammarAccess.getPrintAccess().getMessageSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getMessageSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Print__MessageAssignment_1"


    // $ANTLR start "rule__Conditional__ComparisonAssignment_1"
    // InternalShibainu.g:689:1: rule__Conditional__ComparisonAssignment_1 : ( ruleComparison ) ;
    public final void rule__Conditional__ComparisonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:693:1: ( ( ruleComparison ) )
            // InternalShibainu.g:694:2: ( ruleComparison )
            {
            // InternalShibainu.g:694:2: ( ruleComparison )
            // InternalShibainu.g:695:3: ruleComparison
            {
             before(grammarAccess.getConditionalAccess().getComparisonComparisonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getComparisonComparisonParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Conditional__ComparisonAssignment_1"


    // $ANTLR start "rule__Conditional__StatementAssignment_3"
    // InternalShibainu.g:704:1: rule__Conditional__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__Conditional__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:708:1: ( ( ruleStatement ) )
            // InternalShibainu.g:709:2: ( ruleStatement )
            {
            // InternalShibainu.g:709:2: ( ruleStatement )
            // InternalShibainu.g:710:3: ruleStatement
            {
             before(grammarAccess.getConditionalAccess().getStatementStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getStatementStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Conditional__StatementAssignment_3"


    // $ANTLR start "rule__Comparison__LeftAssignment_0"
    // InternalShibainu.g:719:1: rule__Comparison__LeftAssignment_0 : ( RULE_ID ) ;
    public final void rule__Comparison__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:723:1: ( ( RULE_ID ) )
            // InternalShibainu.g:724:2: ( RULE_ID )
            {
            // InternalShibainu.g:724:2: ( RULE_ID )
            // InternalShibainu.g:725:3: RULE_ID
            {
             before(grammarAccess.getComparisonAccess().getLeftIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLeftIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Comparison__LeftAssignment_0"


    // $ANTLR start "rule__Comparison__OperatorAssignment_1"
    // InternalShibainu.g:734:1: rule__Comparison__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__Comparison__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:738:1: ( ( ruleOperator ) )
            // InternalShibainu.g:739:2: ( ruleOperator )
            {
            // InternalShibainu.g:739:2: ( ruleOperator )
            // InternalShibainu.g:740:3: ruleOperator
            {
             before(grammarAccess.getComparisonAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getOperatorOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Comparison__OperatorAssignment_1"


    // $ANTLR start "rule__Comparison__RightAssignment_2"
    // InternalShibainu.g:749:1: rule__Comparison__RightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Comparison__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShibainu.g:753:1: ( ( RULE_INT ) )
            // InternalShibainu.g:754:2: ( RULE_INT )
            {
            // InternalShibainu.g:754:2: ( RULE_INT )
            // InternalShibainu.g:755:3: RULE_INT
            {
             before(grammarAccess.getComparisonAccess().getRightINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getRightINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Comparison__RightAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});

}