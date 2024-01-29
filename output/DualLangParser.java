// $ANTLR 3.5.1 C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g 2024-01-30 01:34:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class DualLangParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AND", "BOOL", "CMP", "COMMENT", 
		"DO", "ELSE", "END", "ERROR", "ESC_SEQ", "EXPONENT", "FLOAT", "FUNCTION", 
		"HEX_DIGIT", "ID", "IF", "INT", "LOOP", "MUL", "NOT", "OCTAL_ESC", "OR", 
		"RECEIVE", "STRING", "THEN", "TYPE", "UNICODE_ESC", "WHILE", "WS", "'%'", 
		"'('", "')'", "'++'", "','", "'--'", "';'", "'='", "'BREAK'", "'PRINT'", 
		"'^'", "'calculate'", "'device1:'", "'device2:'", "'receive from device1('", 
		"'return'", "'returns'", "'send to device2('", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int ADD=4;
	public static final int AND=5;
	public static final int BOOL=6;
	public static final int CMP=7;
	public static final int COMMENT=8;
	public static final int DO=9;
	public static final int ELSE=10;
	public static final int END=11;
	public static final int ERROR=12;
	public static final int ESC_SEQ=13;
	public static final int EXPONENT=14;
	public static final int FLOAT=15;
	public static final int FUNCTION=16;
	public static final int HEX_DIGIT=17;
	public static final int ID=18;
	public static final int IF=19;
	public static final int INT=20;
	public static final int LOOP=21;
	public static final int MUL=22;
	public static final int NOT=23;
	public static final int OCTAL_ESC=24;
	public static final int OR=25;
	public static final int RECEIVE=26;
	public static final int STRING=27;
	public static final int THEN=28;
	public static final int TYPE=29;
	public static final int UNICODE_ESC=30;
	public static final int WHILE=31;
	public static final int WS=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "interaction1", "synpred5_DualLang", "calculation", "forCondition", 
		"loopCondition", "synpred2_DualLang", "loopUpdate", "functionDefinition", 
		"funcExpr", "synpred6_DualLang", "ifStatement", "availableExpr", "loopBody", 
		"device1Statements", "parameterList", "loop", "exprList", "prog", "statement", 
		"synpred1_DualLang", "boolStatement", "synpred3_DualLang", "mathExpr", 
		"whileCondition", "interaction2", "device2Statements", "mathStatement", 
		"printStatement", "functionCall", "statements", "expr", "loopInitialization", 
		"forEndCondition", "synpred7_DualLang", "synpred4_DualLang"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, true, false, 
		    true, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public DualLangParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public DualLangParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public DualLangParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return DualLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g"; }



	// $ANTLR start "prog"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:5:1: prog : statements EOF ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:6:5: ( statements EOF )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:6:7: statements EOF
			{
			dbg.location(6,7);
			pushFollow(FOLLOW_statements_in_prog17);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(6,18);
			match(input,EOF,FOLLOW_EOF_in_prog19); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(7, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "statements"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:9:1: statements : ( statement )* ;
	public final void statements() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statements");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:10:5: ( ( statement )* )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:10:7: ( statement )*
			{
			dbg.location(10,7);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:10:7: ( statement )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 45 && LA1_0 <= 46)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:10:7: statement
					{
					dbg.location(10,7);
					pushFollow(FOLLOW_statement_in_statements36);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(11, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statements");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:13:1: statement : ( 'device1:' ( device1Statements )* | 'device2:' ( device2Statements )* );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:14:2: ( 'device1:' ( device1Statements )* | 'device2:' ( device2Statements )* )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==45) ) {
				alt4=1;
			}
			else if ( (LA4_0==46) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:14:4: 'device1:' ( device1Statements )*
					{
					dbg.location(14,4);
					match(input,45,FOLLOW_45_in_statement51); if (state.failed) return;dbg.location(14,15);
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:14:15: ( device1Statements )*
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==FUNCTION||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==LOOP||LA2_0==42||LA2_0==44||LA2_0==50) ) {
							alt2=1;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:14:15: device1Statements
							{
							dbg.location(14,15);
							pushFollow(FOLLOW_device1Statements_in_statement53);
							device1Statements();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop2;
						}
					}
					} finally {dbg.exitSubRule(2);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:15:4: 'device2:' ( device2Statements )*
					{
					dbg.location(15,4);
					match(input,46,FOLLOW_46_in_statement59); if (state.failed) return;dbg.location(15,15);
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:15:15: ( device2Statements )*
					try { dbg.enterSubRule(3);

					loop3:
					while (true) {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==FUNCTION||(LA3_0 >= ID && LA3_0 <= IF)||LA3_0==LOOP||LA3_0==42||LA3_0==44||LA3_0==47) ) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:15:15: device2Statements
							{
							dbg.location(15,15);
							pushFollow(FOLLOW_device2Statements_in_statement61);
							device2Statements();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop3;
						}
					}
					} finally {dbg.exitSubRule(3);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "device1Statements"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:19:1: device1Statements : ( expr | interaction1 );
	public final void device1Statements() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "device1Statements");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:20:2: ( expr | interaction1 )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==FUNCTION||(LA5_0 >= ID && LA5_0 <= IF)||LA5_0==LOOP||LA5_0==42||LA5_0==44) ) {
				alt5=1;
			}
			else if ( (LA5_0==50) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:20:4: expr
					{
					dbg.location(20,4);
					pushFollow(FOLLOW_expr_in_device1Statements74);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:21:4: interaction1
					{
					dbg.location(21,4);
					pushFollow(FOLLOW_interaction1_in_device1Statements79);
					interaction1();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(22, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "device1Statements");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "device1Statements"



	// $ANTLR start "device2Statements"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:24:1: device2Statements : ( expr | interaction2 );
	public final void device2Statements() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "device2Statements");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:25:2: ( expr | interaction2 )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==FUNCTION||(LA6_0 >= ID && LA6_0 <= IF)||LA6_0==LOOP||LA6_0==42||LA6_0==44) ) {
				alt6=1;
			}
			else if ( (LA6_0==47) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:25:4: expr
					{
					dbg.location(25,4);
					pushFollow(FOLLOW_expr_in_device2Statements91);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:26:4: interaction2
					{
					dbg.location(26,4);
					pushFollow(FOLLOW_interaction2_in_device2Statements96);
					interaction2();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "device2Statements");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "device2Statements"



	// $ANTLR start "expr"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:29:1: expr options {backtrack=true; } : ( calculation | ifStatement | loop | printStatement | functionDefinition | functionCall );
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:30:2: ( calculation | ifStatement | loop | printStatement | functionDefinition | functionCall )
			int alt7=6;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			switch ( input.LA(1) ) {
			case 44:
				{
				alt7=1;
				}
				break;
			case IF:
				{
				alt7=2;
				}
				break;
			case LOOP:
				{
				alt7=3;
				}
				break;
			case 42:
				{
				alt7=4;
				}
				break;
			case FUNCTION:
				{
				alt7=5;
				}
				break;
			case ID:
				{
				alt7=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:30:4: calculation
					{
					dbg.location(30,4);
					pushFollow(FOLLOW_calculation_in_expr117);
					calculation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:31:4: ifStatement
					{
					dbg.location(31,4);
					pushFollow(FOLLOW_ifStatement_in_expr122);
					ifStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:32:4: loop
					{
					dbg.location(32,4);
					pushFollow(FOLLOW_loop_in_expr127);
					loop();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:33:4: printStatement
					{
					dbg.location(33,4);
					pushFollow(FOLLOW_printStatement_in_expr132);
					printStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:34:4: functionDefinition
					{
					dbg.location(34,4);
					pushFollow(FOLLOW_functionDefinition_in_expr137);
					functionDefinition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:35:4: functionCall
					{
					dbg.location(35,4);
					pushFollow(FOLLOW_functionCall_in_expr142);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "availableExpr"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:39:1: availableExpr options {backtrack=true; } : ( ( device1Statements )* | ( device2Statements )* );
	public final void availableExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "availableExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:2: ( ( device1Statements )* | ( device2Statements )* )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 44:
				{
				int LA10_1 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case IF:
				{
				int LA10_2 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case LOOP:
				{
				int LA10_3 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 42:
				{
				int LA10_4 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case FUNCTION:
				{
				int LA10_5 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case ID:
				{
				int LA10_6 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 50:
				{
				alt10=1;
				}
				break;
			case ELSE:
				{
				int LA10_8 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case END:
				{
				int LA10_9 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 48:
				{
				int LA10_10 = input.LA(2);
				if ( (synpred6_DualLang()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 47:
				{
				alt10=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:4: ( device1Statements )*
					{
					dbg.location(40,4);
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:4: ( device1Statements )*
					try { dbg.enterSubRule(8);

					loop8:
					while (true) {
						int alt8=2;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

						int LA8_0 = input.LA(1);
						if ( (LA8_0==FUNCTION||(LA8_0 >= ID && LA8_0 <= IF)||LA8_0==LOOP||LA8_0==42||LA8_0==44||LA8_0==50) ) {
							alt8=1;
						}

						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:4: device1Statements
							{
							dbg.location(40,4);
							pushFollow(FOLLOW_device1Statements_in_availableExpr162);
							device1Statements();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop8;
						}
					}
					} finally {dbg.exitSubRule(8);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:41:4: ( device2Statements )*
					{
					dbg.location(41,4);
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:41:4: ( device2Statements )*
					try { dbg.enterSubRule(9);

					loop9:
					while (true) {
						int alt9=2;
						try { dbg.enterDecision(9, decisionCanBacktrack[9]);

						int LA9_0 = input.LA(1);
						if ( (LA9_0==FUNCTION||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==LOOP||LA9_0==42||LA9_0==44||LA9_0==47) ) {
							alt9=1;
						}

						} finally {dbg.exitDecision(9);}

						switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:41:4: device2Statements
							{
							dbg.location(41,4);
							pushFollow(FOLLOW_device2Statements_in_availableExpr168);
							device2Statements();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop9;
						}
					}
					} finally {dbg.exitSubRule(9);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "availableExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "availableExpr"



	// $ANTLR start "calculation"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:45:1: calculation : 'calculate' ID '=' ( mathExpr | functionCall ) ';' ;
	public final void calculation() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "calculation");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:46:2: ( 'calculate' ID '=' ( mathExpr | functionCall ) ';' )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:46:4: 'calculate' ID '=' ( mathExpr | functionCall ) ';'
			{
			dbg.location(46,4);
			match(input,44,FOLLOW_44_in_calculation182); if (state.failed) return;dbg.location(46,16);
			match(input,ID,FOLLOW_ID_in_calculation184); if (state.failed) return;dbg.location(46,19);
			match(input,40,FOLLOW_40_in_calculation186); if (state.failed) return;dbg.location(46,23);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:46:23: ( mathExpr | functionCall )
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==FLOAT||LA11_0==INT||LA11_0==NOT||LA11_0==34) ) {
				alt11=1;
			}
			else if ( (LA11_0==ID) ) {
				int LA11_2 = input.LA(2);
				if ( (LA11_2==34) ) {
					alt11=2;
				}
				else if ( ((LA11_2 >= ADD && LA11_2 <= AND)||LA11_2==CMP||LA11_2==MUL||LA11_2==OR||LA11_2==33||LA11_2==39||LA11_2==43) ) {
					alt11=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:46:24: mathExpr
					{
					dbg.location(46,24);
					pushFollow(FOLLOW_mathExpr_in_calculation189);
					mathExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:46:35: functionCall
					{
					dbg.location(46,35);
					pushFollow(FOLLOW_functionCall_in_calculation193);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(46,48);
			match(input,39,FOLLOW_39_in_calculation195); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "calculation");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "calculation"



	// $ANTLR start "interaction2"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:50:1: interaction2 : 'receive from device1(' mathExpr ')' ';' ;
	public final void interaction2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "interaction2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:51:2: ( 'receive from device1(' mathExpr ')' ';' )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:51:4: 'receive from device1(' mathExpr ')' ';'
			{
			dbg.location(51,4);
			match(input,47,FOLLOW_47_in_interaction2209); if (state.failed) return;dbg.location(51,28);
			pushFollow(FOLLOW_mathExpr_in_interaction2211);
			mathExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(51,37);
			match(input,35,FOLLOW_35_in_interaction2213); if (state.failed) return;dbg.location(51,41);
			match(input,39,FOLLOW_39_in_interaction2215); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "interaction2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "interaction2"



	// $ANTLR start "interaction1"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:54:1: interaction1 : 'send to device2(' mathExpr ')' ';' ;
	public final void interaction1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "interaction1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:55:2: ( 'send to device2(' mathExpr ')' ';' )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:55:4: 'send to device2(' mathExpr ')' ';'
			{
			dbg.location(55,4);
			match(input,50,FOLLOW_50_in_interaction1227); if (state.failed) return;dbg.location(55,23);
			pushFollow(FOLLOW_mathExpr_in_interaction1229);
			mathExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(55,32);
			match(input,35,FOLLOW_35_in_interaction1231); if (state.failed) return;dbg.location(55,36);
			match(input,39,FOLLOW_39_in_interaction1233); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "interaction1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "interaction1"



	// $ANTLR start "mathExpr"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:59:1: mathExpr options {backtrack=true; } : ( mathStatement | boolStatement );
	public final void mathExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mathExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:60:2: ( mathStatement | boolStatement )
			int alt12=2;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			switch ( input.LA(1) ) {
			case 34:
				{
				int LA12_1 = input.LA(2);
				if ( (synpred7_DualLang()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case ID:
				{
				int LA12_2 = input.LA(2);
				if ( (synpred7_DualLang()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case INT:
				{
				int LA12_3 = input.LA(2);
				if ( (synpred7_DualLang()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case FLOAT:
				{
				alt12=1;
				}
				break;
			case NOT:
				{
				alt12=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:60:4: mathStatement
					{
					dbg.location(60,4);
					pushFollow(FOLLOW_mathStatement_in_mathExpr257);
					mathStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:61:4: boolStatement
					{
					dbg.location(61,4);
					pushFollow(FOLLOW_boolStatement_in_mathExpr262);
					boolStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mathExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mathExpr"



	// $ANTLR start "mathStatement"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:64:1: mathStatement options {backtrack=true; } : ( '(' mathStatement ')' | ID | INT | FLOAT ) ( ADD mathStatement | MUL mathStatement | '^' mathStatement | '%' mathStatement )* ;
	public final void mathStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mathStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:65:2: ( ( '(' mathStatement ')' | ID | INT | FLOAT ) ( ADD mathStatement | MUL mathStatement | '^' mathStatement | '%' mathStatement )* )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:65:4: ( '(' mathStatement ')' | ID | INT | FLOAT ) ( ADD mathStatement | MUL mathStatement | '^' mathStatement | '%' mathStatement )*
			{
			dbg.location(65,4);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:65:4: ( '(' mathStatement ')' | ID | INT | FLOAT )
			int alt13=4;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case 34:
				{
				alt13=1;
				}
				break;
			case ID:
				{
				alt13=2;
				}
				break;
			case INT:
				{
				alt13=3;
				}
				break;
			case FLOAT:
				{
				alt13=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:65:5: '(' mathStatement ')'
					{
					dbg.location(65,5);
					match(input,34,FOLLOW_34_in_mathStatement283); if (state.failed) return;dbg.location(65,9);
					pushFollow(FOLLOW_mathStatement_in_mathStatement285);
					mathStatement();
					state._fsp--;
					if (state.failed) return;dbg.location(65,23);
					match(input,35,FOLLOW_35_in_mathStatement287); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:65:29: ID
					{
					dbg.location(65,29);
					match(input,ID,FOLLOW_ID_in_mathStatement291); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:65:34: INT
					{
					dbg.location(65,34);
					match(input,INT,FOLLOW_INT_in_mathStatement295); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:65:40: FLOAT
					{
					dbg.location(65,40);
					match(input,FLOAT,FOLLOW_FLOAT_in_mathStatement299); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(66,3);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:66:3: ( ADD mathStatement | MUL mathStatement | '^' mathStatement | '%' mathStatement )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=5;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				switch ( input.LA(1) ) {
				case ADD:
					{
					alt14=1;
					}
					break;
				case MUL:
					{
					alt14=2;
					}
					break;
				case 43:
					{
					alt14=3;
					}
					break;
				case 33:
					{
					alt14=4;
					}
					break;
				}
				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:66:4: ADD mathStatement
					{
					dbg.location(66,4);
					match(input,ADD,FOLLOW_ADD_in_mathStatement309); if (state.failed) return;dbg.location(66,8);
					pushFollow(FOLLOW_mathStatement_in_mathStatement311);
					mathStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:66:24: MUL mathStatement
					{
					dbg.location(66,24);
					match(input,MUL,FOLLOW_MUL_in_mathStatement315); if (state.failed) return;dbg.location(66,28);
					pushFollow(FOLLOW_mathStatement_in_mathStatement317);
					mathStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:66:44: '^' mathStatement
					{
					dbg.location(66,44);
					match(input,43,FOLLOW_43_in_mathStatement321); if (state.failed) return;dbg.location(66,48);
					pushFollow(FOLLOW_mathStatement_in_mathStatement323);
					mathStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:66:64: '%' mathStatement
					{
					dbg.location(66,64);
					match(input,33,FOLLOW_33_in_mathStatement327); if (state.failed) return;dbg.location(66,68);
					pushFollow(FOLLOW_mathStatement_in_mathStatement329);
					mathStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mathStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mathStatement"



	// $ANTLR start "boolStatement"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:70:1: boolStatement : ( NOT boolStatement | INT | '(' boolStatement ')' | ID ) ( AND boolStatement | OR boolStatement | CMP boolStatement )* ;
	public final void boolStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "boolStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:2: ( ( NOT boolStatement | INT | '(' boolStatement ')' | ID ) ( AND boolStatement | OR boolStatement | CMP boolStatement )* )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:4: ( NOT boolStatement | INT | '(' boolStatement ')' | ID ) ( AND boolStatement | OR boolStatement | CMP boolStatement )*
			{
			dbg.location(71,4);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:4: ( NOT boolStatement | INT | '(' boolStatement ')' | ID )
			int alt15=4;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case NOT:
				{
				alt15=1;
				}
				break;
			case INT:
				{
				alt15=2;
				}
				break;
			case 34:
				{
				alt15=3;
				}
				break;
			case ID:
				{
				alt15=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:5: NOT boolStatement
					{
					dbg.location(71,5);
					match(input,NOT,FOLLOW_NOT_in_boolStatement349); if (state.failed) return;dbg.location(71,9);
					pushFollow(FOLLOW_boolStatement_in_boolStatement351);
					boolStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:25: INT
					{
					dbg.location(71,25);
					match(input,INT,FOLLOW_INT_in_boolStatement355); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:31: '(' boolStatement ')'
					{
					dbg.location(71,31);
					match(input,34,FOLLOW_34_in_boolStatement359); if (state.failed) return;dbg.location(71,35);
					pushFollow(FOLLOW_boolStatement_in_boolStatement361);
					boolStatement();
					state._fsp--;
					if (state.failed) return;dbg.location(71,49);
					match(input,35,FOLLOW_35_in_boolStatement363); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:55: ID
					{
					dbg.location(71,55);
					match(input,ID,FOLLOW_ID_in_boolStatement367); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(71,59);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:59: ( AND boolStatement | OR boolStatement | CMP boolStatement )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=4;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				switch ( input.LA(1) ) {
				case AND:
					{
					alt16=1;
					}
					break;
				case OR:
					{
					alt16=2;
					}
					break;
				case CMP:
					{
					alt16=3;
					}
					break;
				}
				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:60: AND boolStatement
					{
					dbg.location(71,60);
					match(input,AND,FOLLOW_AND_in_boolStatement371); if (state.failed) return;dbg.location(71,64);
					pushFollow(FOLLOW_boolStatement_in_boolStatement373);
					boolStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:80: OR boolStatement
					{
					dbg.location(71,80);
					match(input,OR,FOLLOW_OR_in_boolStatement377); if (state.failed) return;dbg.location(71,83);
					pushFollow(FOLLOW_boolStatement_in_boolStatement379);
					boolStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:71:99: CMP boolStatement
					{
					dbg.location(71,99);
					match(input,CMP,FOLLOW_CMP_in_boolStatement383); if (state.failed) return;dbg.location(71,103);
					pushFollow(FOLLOW_boolStatement_in_boolStatement385);
					boolStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "boolStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "boolStatement"



	// $ANTLR start "ifStatement"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:77:1: ifStatement : IF '(' boolStatement ')' THEN availableExpr ( ELSE availableExpr )? END ;
	public final void ifStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:78:2: ( IF '(' boolStatement ')' THEN availableExpr ( ELSE availableExpr )? END )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:78:4: IF '(' boolStatement ')' THEN availableExpr ( ELSE availableExpr )? END
			{
			dbg.location(78,4);
			match(input,IF,FOLLOW_IF_in_ifStatement403); if (state.failed) return;dbg.location(78,7);
			match(input,34,FOLLOW_34_in_ifStatement405); if (state.failed) return;dbg.location(78,11);
			pushFollow(FOLLOW_boolStatement_in_ifStatement407);
			boolStatement();
			state._fsp--;
			if (state.failed) return;dbg.location(78,24);
			match(input,35,FOLLOW_35_in_ifStatement408); if (state.failed) return;dbg.location(78,28);
			match(input,THEN,FOLLOW_THEN_in_ifStatement410); if (state.failed) return;dbg.location(78,33);
			pushFollow(FOLLOW_availableExpr_in_ifStatement412);
			availableExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(78,47);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:78:47: ( ELSE availableExpr )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==ELSE) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:78:48: ELSE availableExpr
					{
					dbg.location(78,48);
					match(input,ELSE,FOLLOW_ELSE_in_ifStatement415); if (state.failed) return;dbg.location(78,53);
					pushFollow(FOLLOW_availableExpr_in_ifStatement417);
					availableExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(78,69);
			match(input,END,FOLLOW_END_in_ifStatement421); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "printStatement"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:81:1: printStatement : 'PRINT' ( STRING | mathExpr ) ';' ;
	public final void printStatement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printStatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:82:2: ( 'PRINT' ( STRING | mathExpr ) ';' )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:82:4: 'PRINT' ( STRING | mathExpr ) ';'
			{
			dbg.location(82,4);
			match(input,42,FOLLOW_42_in_printStatement433); if (state.failed) return;dbg.location(82,12);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:82:12: ( STRING | mathExpr )
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==STRING) ) {
				alt18=1;
			}
			else if ( (LA18_0==FLOAT||LA18_0==ID||LA18_0==INT||LA18_0==NOT||LA18_0==34) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:82:13: STRING
					{
					dbg.location(82,13);
					match(input,STRING,FOLLOW_STRING_in_printStatement436); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:82:22: mathExpr
					{
					dbg.location(82,22);
					pushFollow(FOLLOW_mathExpr_in_printStatement440);
					mathExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(82,31);
			match(input,39,FOLLOW_39_in_printStatement442); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printStatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printStatement"



	// $ANTLR start "loop"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:88:1: loop : LOOP loopCondition DO loopBody END ;
	public final void loop() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "loop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:88:6: ( LOOP loopCondition DO loopBody END )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:88:8: LOOP loopCondition DO loopBody END
			{
			dbg.location(88,8);
			match(input,LOOP,FOLLOW_LOOP_in_loop457); if (state.failed) return;dbg.location(88,13);
			pushFollow(FOLLOW_loopCondition_in_loop459);
			loopCondition();
			state._fsp--;
			if (state.failed) return;dbg.location(88,27);
			match(input,DO,FOLLOW_DO_in_loop461); if (state.failed) return;dbg.location(88,30);
			pushFollow(FOLLOW_loopBody_in_loop463);
			loopBody();
			state._fsp--;
			if (state.failed) return;dbg.location(88,39);
			match(input,END,FOLLOW_END_in_loop465); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(88, 41);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loop");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "loop"



	// $ANTLR start "loopCondition"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:90:1: loopCondition : ( whileCondition | forCondition );
	public final void loopCondition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "loopCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:91:2: ( whileCondition | forCondition )
			int alt19=2;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			switch ( input.LA(1) ) {
			case INT:
			case NOT:
			case 34:
				{
				alt19=1;
				}
				break;
			case ID:
				{
				int LA19_2 = input.LA(2);
				if ( (LA19_2==40) ) {
					alt19=2;
				}
				else if ( (LA19_2==CMP||LA19_2==DO) ) {
					alt19=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TYPE:
				{
				alt19=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:91:4: whileCondition
					{
					dbg.location(91,4);
					pushFollow(FOLLOW_whileCondition_in_loopCondition474);
					whileCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:92:4: forCondition
					{
					dbg.location(92,4);
					pushFollow(FOLLOW_forCondition_in_loopCondition479);
					forCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(93, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loopCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "loopCondition"



	// $ANTLR start "whileCondition"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:96:1: whileCondition : ( '(' whileCondition ')' | NOT whileCondition | INT | ID ) ( CMP whileCondition )* ;
	public final void whileCondition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "whileCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:2: ( ( '(' whileCondition ')' | NOT whileCondition | INT | ID ) ( CMP whileCondition )* )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:4: ( '(' whileCondition ')' | NOT whileCondition | INT | ID ) ( CMP whileCondition )*
			{
			dbg.location(97,4);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:4: ( '(' whileCondition ')' | NOT whileCondition | INT | ID )
			int alt20=4;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			switch ( input.LA(1) ) {
			case 34:
				{
				alt20=1;
				}
				break;
			case NOT:
				{
				alt20=2;
				}
				break;
			case INT:
				{
				alt20=3;
				}
				break;
			case ID:
				{
				alt20=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:5: '(' whileCondition ')'
					{
					dbg.location(97,5);
					match(input,34,FOLLOW_34_in_whileCondition493); if (state.failed) return;dbg.location(97,9);
					pushFollow(FOLLOW_whileCondition_in_whileCondition495);
					whileCondition();
					state._fsp--;
					if (state.failed) return;dbg.location(97,23);
					match(input,35,FOLLOW_35_in_whileCondition496); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:29: NOT whileCondition
					{
					dbg.location(97,29);
					match(input,NOT,FOLLOW_NOT_in_whileCondition500); if (state.failed) return;dbg.location(97,33);
					pushFollow(FOLLOW_whileCondition_in_whileCondition502);
					whileCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:50: INT
					{
					dbg.location(97,50);
					match(input,INT,FOLLOW_INT_in_whileCondition506); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:56: ID
					{
					dbg.location(97,56);
					match(input,ID,FOLLOW_ID_in_whileCondition510); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(97,60);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:60: ( CMP whileCondition )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==CMP) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:97:61: CMP whileCondition
					{
					dbg.location(97,61);
					match(input,CMP,FOLLOW_CMP_in_whileCondition514); if (state.failed) return;dbg.location(97,65);
					pushFollow(FOLLOW_whileCondition_in_whileCondition516);
					whileCondition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(98, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "whileCondition"



	// $ANTLR start "forCondition"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:100:1: forCondition : loopInitialization ',' forEndCondition ',' loopUpdate ;
	public final void forCondition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "forCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:101:2: ( loopInitialization ',' forEndCondition ',' loopUpdate )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:101:5: loopInitialization ',' forEndCondition ',' loopUpdate
			{
			dbg.location(101,5);
			pushFollow(FOLLOW_loopInitialization_in_forCondition532);
			loopInitialization();
			state._fsp--;
			if (state.failed) return;dbg.location(101,24);
			match(input,37,FOLLOW_37_in_forCondition534); if (state.failed) return;dbg.location(101,28);
			pushFollow(FOLLOW_forEndCondition_in_forCondition536);
			forEndCondition();
			state._fsp--;
			if (state.failed) return;dbg.location(101,44);
			match(input,37,FOLLOW_37_in_forCondition538); if (state.failed) return;dbg.location(101,48);
			pushFollow(FOLLOW_loopUpdate_in_forCondition540);
			loopUpdate();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(102, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "forCondition"



	// $ANTLR start "loopInitialization"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:104:1: loopInitialization : ( TYPE )? ID '=' INT ;
	public final void loopInitialization() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "loopInitialization");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:105:2: ( ( TYPE )? ID '=' INT )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:105:3: ( TYPE )? ID '=' INT
			{
			dbg.location(105,3);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:105:3: ( TYPE )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==TYPE) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:105:4: TYPE
					{
					dbg.location(105,4);
					match(input,TYPE,FOLLOW_TYPE_in_loopInitialization552); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(105,11);
			match(input,ID,FOLLOW_ID_in_loopInitialization556); if (state.failed) return;dbg.location(105,14);
			match(input,40,FOLLOW_40_in_loopInitialization558); if (state.failed) return;dbg.location(105,18);
			match(input,INT,FOLLOW_INT_in_loopInitialization560); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(106, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loopInitialization");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "loopInitialization"



	// $ANTLR start "forEndCondition"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:108:1: forEndCondition : boolStatement CMP boolStatement ;
	public final void forEndCondition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "forEndCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:109:2: ( boolStatement CMP boolStatement )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:109:4: boolStatement CMP boolStatement
			{
			dbg.location(109,4);
			pushFollow(FOLLOW_boolStatement_in_forEndCondition572);
			boolStatement();
			state._fsp--;
			if (state.failed) return;dbg.location(109,18);
			match(input,CMP,FOLLOW_CMP_in_forEndCondition574); if (state.failed) return;dbg.location(109,22);
			pushFollow(FOLLOW_boolStatement_in_forEndCondition576);
			boolStatement();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(110, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forEndCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "forEndCondition"



	// $ANTLR start "loopUpdate"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:112:1: loopUpdate : ( ID '++' | ID '--' );
	public final void loopUpdate() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "loopUpdate");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:113:2: ( ID '++' | ID '--' )
			int alt23=2;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			int LA23_0 = input.LA(1);
			if ( (LA23_0==ID) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==36) ) {
					alt23=1;
				}
				else if ( (LA23_1==38) ) {
					alt23=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:113:4: ID '++'
					{
					dbg.location(113,4);
					match(input,ID,FOLLOW_ID_in_loopUpdate589); if (state.failed) return;dbg.location(113,7);
					match(input,36,FOLLOW_36_in_loopUpdate591); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:113:14: ID '--'
					{
					dbg.location(113,14);
					match(input,ID,FOLLOW_ID_in_loopUpdate595); if (state.failed) return;dbg.location(113,17);
					match(input,38,FOLLOW_38_in_loopUpdate597); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(114, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loopUpdate");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "loopUpdate"



	// $ANTLR start "loopBody"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:116:1: loopBody : ( availableExpr | 'BREAK' );
	public final void loopBody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "loopBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:117:2: ( availableExpr | 'BREAK' )
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= ELSE && LA24_0 <= END)||LA24_0==FUNCTION||(LA24_0 >= ID && LA24_0 <= IF)||LA24_0==LOOP||LA24_0==42||LA24_0==44||(LA24_0 >= 47 && LA24_0 <= 48)||LA24_0==50) ) {
				alt24=1;
			}
			else if ( (LA24_0==41) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:117:4: availableExpr
					{
					dbg.location(117,4);
					pushFollow(FOLLOW_availableExpr_in_loopBody621);
					availableExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:118:4: 'BREAK'
					{
					dbg.location(118,4);
					match(input,41,FOLLOW_41_in_loopBody627); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(119, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loopBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "loopBody"



	// $ANTLR start "functionDefinition"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:125:1: functionDefinition : FUNCTION ID '(' ( parameterList )? ')' 'returns' TYPE '{' availableExpr 'return' mathExpr ';' '}' ;
	public final void functionDefinition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionDefinition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:126:2: ( FUNCTION ID '(' ( parameterList )? ')' 'returns' TYPE '{' availableExpr 'return' mathExpr ';' '}' )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:126:4: FUNCTION ID '(' ( parameterList )? ')' 'returns' TYPE '{' availableExpr 'return' mathExpr ';' '}'
			{
			dbg.location(126,4);
			match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDefinition644); if (state.failed) return;dbg.location(126,13);
			match(input,ID,FOLLOW_ID_in_functionDefinition646); if (state.failed) return;dbg.location(126,16);
			match(input,34,FOLLOW_34_in_functionDefinition648); if (state.failed) return;dbg.location(126,20);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:126:20: ( parameterList )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==TYPE) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:126:20: parameterList
					{
					dbg.location(126,20);
					pushFollow(FOLLOW_parameterList_in_functionDefinition650);
					parameterList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(126,35);
			match(input,35,FOLLOW_35_in_functionDefinition653); if (state.failed) return;dbg.location(126,39);
			match(input,49,FOLLOW_49_in_functionDefinition655); if (state.failed) return;dbg.location(126,49);
			match(input,TYPE,FOLLOW_TYPE_in_functionDefinition657); if (state.failed) return;dbg.location(126,54);
			match(input,51,FOLLOW_51_in_functionDefinition659); if (state.failed) return;dbg.location(126,58);
			pushFollow(FOLLOW_availableExpr_in_functionDefinition661);
			availableExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(126,72);
			match(input,48,FOLLOW_48_in_functionDefinition663); if (state.failed) return;dbg.location(126,81);
			pushFollow(FOLLOW_mathExpr_in_functionDefinition665);
			mathExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(126,89);
			match(input,39,FOLLOW_39_in_functionDefinition666); if (state.failed) return;dbg.location(126,93);
			match(input,52,FOLLOW_52_in_functionDefinition668); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(127, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionDefinition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionDefinition"



	// $ANTLR start "parameterList"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:129:1: parameterList : ( TYPE ID ) ( ',' TYPE ID )* ;
	public final void parameterList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parameterList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:130:2: ( ( TYPE ID ) ( ',' TYPE ID )* )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:130:4: ( TYPE ID ) ( ',' TYPE ID )*
			{
			dbg.location(130,4);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:130:4: ( TYPE ID )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:130:5: TYPE ID
			{
			dbg.location(130,5);
			match(input,TYPE,FOLLOW_TYPE_in_parameterList682); if (state.failed) return;dbg.location(130,10);
			match(input,ID,FOLLOW_ID_in_parameterList684); if (state.failed) return;
			}
			dbg.location(130,13);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:130:13: ( ',' TYPE ID )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=2;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==37) ) {
					alt26=1;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:130:14: ',' TYPE ID
					{
					dbg.location(130,14);
					match(input,37,FOLLOW_37_in_parameterList687); if (state.failed) return;dbg.location(130,18);
					match(input,TYPE,FOLLOW_TYPE_in_parameterList689); if (state.failed) return;dbg.location(130,23);
					match(input,ID,FOLLOW_ID_in_parameterList691); if (state.failed) return;
					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(131, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameterList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameterList"



	// $ANTLR start "functionCall"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:133:1: functionCall : ID '(' ( exprList )? ')' ;
	public final void functionCall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionCall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:134:2: ( ID '(' ( exprList )? ')' )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:134:4: ID '(' ( exprList )? ')'
			{
			dbg.location(134,4);
			match(input,ID,FOLLOW_ID_in_functionCall706); if (state.failed) return;dbg.location(134,7);
			match(input,34,FOLLOW_34_in_functionCall708); if (state.failed) return;dbg.location(134,11);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:134:11: ( exprList )?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==FLOAT||LA27_0==ID||LA27_0==INT||LA27_0==NOT||LA27_0==STRING||LA27_0==34) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:134:11: exprList
					{
					dbg.location(134,11);
					pushFollow(FOLLOW_exprList_in_functionCall710);
					exprList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(134,21);
			match(input,35,FOLLOW_35_in_functionCall713); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(135, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionCall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionCall"



	// $ANTLR start "exprList"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:137:1: exprList : funcExpr ( ',' funcExpr )* ;
	public final void exprList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:138:2: ( funcExpr ( ',' funcExpr )* )
			dbg.enterAlt(1);

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:138:4: funcExpr ( ',' funcExpr )*
			{
			dbg.location(138,4);
			pushFollow(FOLLOW_funcExpr_in_exprList724);
			funcExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(138,13);
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:138:13: ( ',' funcExpr )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==37) ) {
					alt28=1;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:138:14: ',' funcExpr
					{
					dbg.location(138,14);
					match(input,37,FOLLOW_37_in_exprList727); if (state.failed) return;dbg.location(138,18);
					pushFollow(FOLLOW_funcExpr_in_exprList729);
					funcExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(139, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprList"



	// $ANTLR start "funcExpr"
	// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:141:1: funcExpr : ( ID | STRING | functionCall | mathExpr );
	public final void funcExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "funcExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(141, 0);

		try {
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:142:2: ( ID | STRING | functionCall | mathExpr )
			int alt29=4;
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			switch ( input.LA(1) ) {
			case ID:
				{
				int LA29_1 = input.LA(2);
				if ( (LA29_1==34) ) {
					alt29=3;
				}
				else if ( (LA29_1==35||LA29_1==37) ) {
					alt29=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING:
				{
				alt29=2;
				}
				break;
			case FLOAT:
			case INT:
			case NOT:
			case 34:
				{
				alt29=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:142:4: ID
					{
					dbg.location(142,4);
					match(input,ID,FOLLOW_ID_in_funcExpr742); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:143:4: STRING
					{
					dbg.location(143,4);
					match(input,STRING,FOLLOW_STRING_in_funcExpr747); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:144:4: functionCall
					{
					dbg.location(144,4);
					pushFollow(FOLLOW_functionCall_in_funcExpr752);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:145:4: mathExpr
					{
					dbg.location(145,4);
					pushFollow(FOLLOW_mathExpr_in_funcExpr757);
					mathExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(146, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funcExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "funcExpr"

	// $ANTLR start synpred6_DualLang
	public final void synpred6_DualLang_fragment() throws RecognitionException {
		// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:4: ( ( device1Statements )* )
		dbg.enterAlt(1);

		// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:4: ( device1Statements )*
		{
		dbg.location(40,4);
		// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:4: ( device1Statements )*
		try { dbg.enterSubRule(30);

		loop30:
		while (true) {
			int alt30=2;
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==FUNCTION||(LA30_0 >= ID && LA30_0 <= IF)||LA30_0==LOOP||LA30_0==42||LA30_0==44||LA30_0==50) ) {
				alt30=1;
			}

			} finally {dbg.exitDecision(30);}

			switch (alt30) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:40:4: device1Statements
				{
				dbg.location(40,4);
				pushFollow(FOLLOW_device1Statements_in_synpred6_DualLang162);
				device1Statements();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop30;
			}
		}
		} finally {dbg.exitSubRule(30);}

		}

	}
	// $ANTLR end synpred6_DualLang

	// $ANTLR start synpred7_DualLang
	public final void synpred7_DualLang_fragment() throws RecognitionException {
		// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:60:4: ( mathStatement )
		dbg.enterAlt(1);

		// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:60:4: mathStatement
		{
		dbg.location(60,4);
		pushFollow(FOLLOW_mathStatement_in_synpred7_DualLang257);
		mathStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_DualLang

	// Delegated rules

	public final boolean synpred6_DualLang() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred6_DualLang_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_DualLang() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred7_DualLang_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statements_in_prog17 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements36 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_45_in_statement51 = new BitSet(new long[]{0x00041400002D0002L});
	public static final BitSet FOLLOW_device1Statements_in_statement53 = new BitSet(new long[]{0x00041400002D0002L});
	public static final BitSet FOLLOW_46_in_statement59 = new BitSet(new long[]{0x00009400002D0002L});
	public static final BitSet FOLLOW_device2Statements_in_statement61 = new BitSet(new long[]{0x00009400002D0002L});
	public static final BitSet FOLLOW_expr_in_device1Statements74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interaction1_in_device1Statements79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_device2Statements91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interaction2_in_device2Statements96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_calculation_in_expr117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_expr122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_expr127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStatement_in_expr132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinition_in_expr137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expr142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_device1Statements_in_availableExpr162 = new BitSet(new long[]{0x00041400002D0002L});
	public static final BitSet FOLLOW_device2Statements_in_availableExpr168 = new BitSet(new long[]{0x00009400002D0002L});
	public static final BitSet FOLLOW_44_in_calculation182 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_calculation184 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_calculation186 = new BitSet(new long[]{0x0000000400948000L});
	public static final BitSet FOLLOW_mathExpr_in_calculation189 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_functionCall_in_calculation193 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_calculation195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_interaction2209 = new BitSet(new long[]{0x0000000400948000L});
	public static final BitSet FOLLOW_mathExpr_in_interaction2211 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_interaction2213 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_interaction2215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_interaction1227 = new BitSet(new long[]{0x0000000400948000L});
	public static final BitSet FOLLOW_mathExpr_in_interaction1229 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_interaction1231 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_interaction1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathStatement_in_mathExpr257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolStatement_in_mathExpr262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_mathStatement283 = new BitSet(new long[]{0x0000000400148000L});
	public static final BitSet FOLLOW_mathStatement_in_mathStatement285 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_mathStatement287 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_ID_in_mathStatement291 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_INT_in_mathStatement295 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_FLOAT_in_mathStatement299 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_ADD_in_mathStatement309 = new BitSet(new long[]{0x0000000400148000L});
	public static final BitSet FOLLOW_mathStatement_in_mathStatement311 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_MUL_in_mathStatement315 = new BitSet(new long[]{0x0000000400148000L});
	public static final BitSet FOLLOW_mathStatement_in_mathStatement317 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_43_in_mathStatement321 = new BitSet(new long[]{0x0000000400148000L});
	public static final BitSet FOLLOW_mathStatement_in_mathStatement323 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_33_in_mathStatement327 = new BitSet(new long[]{0x0000000400148000L});
	public static final BitSet FOLLOW_mathStatement_in_mathStatement329 = new BitSet(new long[]{0x0000080200400012L});
	public static final BitSet FOLLOW_NOT_in_boolStatement349 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_boolStatement_in_boolStatement351 = new BitSet(new long[]{0x00000000020000A2L});
	public static final BitSet FOLLOW_INT_in_boolStatement355 = new BitSet(new long[]{0x00000000020000A2L});
	public static final BitSet FOLLOW_34_in_boolStatement359 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_boolStatement_in_boolStatement361 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_boolStatement363 = new BitSet(new long[]{0x00000000020000A2L});
	public static final BitSet FOLLOW_ID_in_boolStatement367 = new BitSet(new long[]{0x00000000020000A2L});
	public static final BitSet FOLLOW_AND_in_boolStatement371 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_boolStatement_in_boolStatement373 = new BitSet(new long[]{0x00000000020000A2L});
	public static final BitSet FOLLOW_OR_in_boolStatement377 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_boolStatement_in_boolStatement379 = new BitSet(new long[]{0x00000000020000A2L});
	public static final BitSet FOLLOW_CMP_in_boolStatement383 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_boolStatement_in_boolStatement385 = new BitSet(new long[]{0x00000000020000A2L});
	public static final BitSet FOLLOW_IF_in_ifStatement403 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_ifStatement405 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_boolStatement_in_ifStatement407 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_ifStatement408 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_THEN_in_ifStatement410 = new BitSet(new long[]{0x00049400002D0C00L});
	public static final BitSet FOLLOW_availableExpr_in_ifStatement412 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_ELSE_in_ifStatement415 = new BitSet(new long[]{0x00049400002D0800L});
	public static final BitSet FOLLOW_availableExpr_in_ifStatement417 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_END_in_ifStatement421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_printStatement433 = new BitSet(new long[]{0x0000000408948000L});
	public static final BitSet FOLLOW_STRING_in_printStatement436 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_mathExpr_in_printStatement440 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_printStatement442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOP_in_loop457 = new BitSet(new long[]{0x0000000420940000L});
	public static final BitSet FOLLOW_loopCondition_in_loop459 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DO_in_loop461 = new BitSet(new long[]{0x00049600002D0000L});
	public static final BitSet FOLLOW_loopBody_in_loop463 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_END_in_loop465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileCondition_in_loopCondition474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forCondition_in_loopCondition479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_whileCondition493 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_whileCondition_in_whileCondition495 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_whileCondition496 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_NOT_in_whileCondition500 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_whileCondition_in_whileCondition502 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_INT_in_whileCondition506 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ID_in_whileCondition510 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_CMP_in_whileCondition514 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_whileCondition_in_whileCondition516 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_loopInitialization_in_forCondition532 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_forCondition534 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_forEndCondition_in_forCondition536 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_forCondition538 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_loopUpdate_in_forCondition540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_loopInitialization552 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_loopInitialization556 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_loopInitialization558 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INT_in_loopInitialization560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolStatement_in_forEndCondition572 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CMP_in_forEndCondition574 = new BitSet(new long[]{0x0000000400940000L});
	public static final BitSet FOLLOW_boolStatement_in_forEndCondition576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_loopUpdate589 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_loopUpdate591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_loopUpdate595 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_loopUpdate597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_availableExpr_in_loopBody621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_loopBody627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDefinition644 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_functionDefinition646 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_functionDefinition648 = new BitSet(new long[]{0x0000000820000000L});
	public static final BitSet FOLLOW_parameterList_in_functionDefinition650 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_functionDefinition653 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_functionDefinition655 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_TYPE_in_functionDefinition657 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_functionDefinition659 = new BitSet(new long[]{0x00059400002D0000L});
	public static final BitSet FOLLOW_availableExpr_in_functionDefinition661 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_functionDefinition663 = new BitSet(new long[]{0x0000000400948000L});
	public static final BitSet FOLLOW_mathExpr_in_functionDefinition665 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_functionDefinition666 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_functionDefinition668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_parameterList682 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_parameterList684 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_parameterList687 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_TYPE_in_parameterList689 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ID_in_parameterList691 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_ID_in_functionCall706 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_functionCall708 = new BitSet(new long[]{0x0000000C08948000L});
	public static final BitSet FOLLOW_exprList_in_functionCall710 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_functionCall713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcExpr_in_exprList724 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_exprList727 = new BitSet(new long[]{0x0000000408948000L});
	public static final BitSet FOLLOW_funcExpr_in_exprList729 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_ID_in_funcExpr742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_funcExpr747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_funcExpr752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathExpr_in_funcExpr757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_device1Statements_in_synpred6_DualLang162 = new BitSet(new long[]{0x00041400002D0002L});
	public static final BitSet FOLLOW_mathStatement_in_synpred7_DualLang257 = new BitSet(new long[]{0x0000000000000002L});
}
